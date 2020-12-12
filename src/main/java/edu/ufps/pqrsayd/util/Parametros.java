package edu.ufps.pqrsayd.util;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parametros {

    protected String PORT;
    protected String HOST;
    protected String DATABASE;
    protected String USER;
    protected String PASSWORD;
    protected String DRIVER;
    protected String URL;
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

}
