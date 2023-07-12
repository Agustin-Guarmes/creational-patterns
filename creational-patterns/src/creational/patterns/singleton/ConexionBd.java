package creational.patterns.singleton;

public class ConexionBd {
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private static ConexionBd instance;

    private ConexionBd() {
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver";
        this.dbUrl = "jdbc:mysql://localhost:3306/bdSingleton";
        this.nombreUsuario = "root";
        this.contrasenaUsuario = "root";
    }

    public static ConexionBd getInstance() {
        if (instance == null) instance = new ConexionBd();
        return instance;
    }

    public String conectar() {
        return "Conectado a la BD mediante la conexion : " + this;
    }

    public String desconectar() {
        return "Desconectado de la bd";
    }

    @Override
    public String toString() {
        return "ConexionBd{" + "jdbcDriver='" + jdbcDriver + '\'' + ", dbUrl='" + dbUrl + '\'' + ", nombreUsuario='" + nombreUsuario + '\'' + ", contrasenaUsuario='" + contrasenaUsuario + '\'' + '}';
    }
}
