package edu.ufps.pqrsayd.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;

public class Pruebas extends ConexionDb {

    public void test1() throws IOException {
        
        try {
            System.out.println(conDb.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void main(String[] args) throws IOException {
        Pruebas p = new Pruebas();

        p.test1();
    }
}
