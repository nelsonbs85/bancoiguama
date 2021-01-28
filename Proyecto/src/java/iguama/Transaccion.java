package iguama;
 
import java.util.Date;

public class Transaccion {
 
    private int id;
    private Date fecha;
    private int cliente;
    private String producto;
    private double total;
    private double millas; 
    private double tipocambio;

    
     public Transaccion(int id, Date fecha, int cliente, String producto, double total, double millas, double tipocambio) {
        this.id = id;
        this.fecha = fecha; 
        this.cliente = cliente; 
        this.producto = producto; 
        this.total = total;
        this.millas= millas; 
        this.tipocambio = tipocambio;
               
    }
     
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(double tipocambio) {
        this.tipocambio = tipocambio;
    }
    
    

    public Transaccion() {
    }
 
   
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
 
}