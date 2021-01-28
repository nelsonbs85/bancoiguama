package iguama;
 
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class Controlador {
 
    Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int id;
 
 
    @RequestMapping("index.htm")
    public ModelAndView listar(){
        String sql = "select * from transaccion";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("index");
        return modelAndView;
    }
 
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView agregar(){
        modelAndView.addObject(new Transaccion());
        modelAndView.setViewName("agregar");
        return modelAndView;
    }
 
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(Transaccion transaccion){
        String sql = "insert into transaccion (tr_fecha,tr_id_cliente, tr_producto, tr_monto_total, tr_total_millas, tr_tipo_cambio) values (?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, transaccion.getFecha(),transaccion.getCliente(),transaccion.getProducto(),
                    transaccion.getTotal(),transaccion.getMillas(),transaccion.getTipocambio());
        return new ModelAndView("redirect:/index.htm");
    }
    
    

}