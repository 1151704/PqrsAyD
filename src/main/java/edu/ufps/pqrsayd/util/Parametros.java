package edu.ufps.pqrsayd.util;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parametros {

    /**
     * Badatabase
     */
    protected String PORT;
    protected String HOST;
    protected String DATABASE;
    protected String USER;
    protected String PASSWORD;
    protected String DRIVER;
    protected String URL;

    /**
     * FTP
     */
    protected String FTP_HOST;
    protected String FTP_USER;
    protected String FTP_PASSWORD;
    protected Integer FTP_PORT;
    protected String FTP_RAIZ;
    protected String FTP_PUBLIC;

    protected ResourceBundle rb;

    public Parametros() {
        String ARCHIVO_CONFIGURACION = "parametros";

        try {
            rb = ResourceBundle.getBundle(ARCHIVO_CONFIGURACION, Locale.getDefault());
            PORT = rb.getString("PORT");
            HOST = rb.getString("HOST");
            DATABASE = rb.getString("DATABASE");
            USER = rb.getString("USER");
            PASSWORD = rb.getString("PASSWORD");
            DRIVER = rb.getString("DRIVER");
            URL = rb.getString("URL");
            FTP_HOST = rb.getString("FTP_HOST");
            FTP_USER = rb.getString("FTP_USER");
            FTP_PASSWORD = rb.getString("FTP_PASSWORD");
            FTP_PORT = Integer.parseInt(rb.getString("FTP_PORT"));
            FTP_RAIZ = rb.getString("FTP_RAIZ");
            FTP_PUBLIC = rb.getString("FTP_PUBLIC");
        } catch (Exception ex) {
            Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPORT() {
        return PORT;
    }

    public String getHOST() {
        return HOST;
    }

    public String getDATABASE() {
        return DATABASE;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public String getURL() {
        return URL;
    }

    public String getFTP_HOST() {
        return FTP_HOST;
    }

    public String getFTP_USER() {
        return FTP_USER;
    }

    public String getFTP_PASSWORD() {
        return FTP_PASSWORD;
    }

    public Integer getFTP_PORT() {
        return FTP_PORT;
    }

    public String getFTP_RAIZ() {
        return FTP_RAIZ;
    }

    public String getFTP_PUBLIC() {
        return FTP_PUBLIC;
    }

}
