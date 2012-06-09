package br.com.facdombosco.progc.reportsGeneral;

public class ConexaoBanco {

    private static final String url = "jdbc:mysql://mysql.profries.com:3306/progc1";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String login = "progc";
    private static final String pwd = "dombosco";

    public static String getDriver() {
        return driver;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPwd() {
        return pwd;
    }

    public static String getUrl() {
        return url;
    }

}
