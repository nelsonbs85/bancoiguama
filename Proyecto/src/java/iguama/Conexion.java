
package iguama;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
public class Conexion {
 
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bancoiguama?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("15Mar2010*!");
        return dataSource;
    }
 
}