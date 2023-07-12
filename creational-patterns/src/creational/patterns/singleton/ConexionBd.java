package creational.patterns.singleton;

public class ConexionBd {
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasenaUsuario;
    //Atributo privado de la propia clase, debe ser estatico porque sera utilizado dentro de un metodo estatico
    private static ConexionBd instance;

    //Constructor privado para evitar que se puedan crear instancias de esta clase mas alla del singleton
    private ConexionBd() {
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver";
        this.dbUrl = "jdbc:mysql://localhost:3306/bdSingleton";
        this.nombreUsuario = "root";
        this.contrasenaUsuario = "root";
    }

    //Metodo estatico global que permite crear/utilizar la instancia de esta clase
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
