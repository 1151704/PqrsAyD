package edu.ufps.pqrsayd.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class ConexionFtpAdmin implements java.io.Serializable {

    private static ConexionFtpAdmin INSTANCE;
    private FTPClient clienteFTP;
    private static final Parametros PARAMETROS = new Parametros();

    private ConexionFtpAdmin() {
        try {
            clienteFTP = new FTPClient();

            if (PARAMETROS.FTP_PORT <= 0) {
                clienteFTP.connect(PARAMETROS.FTP_HOST);
            } else {
                clienteFTP.connect(PARAMETROS.FTP_HOST, PARAMETROS.FTP_PORT);
            }
            clienteFTP.login(PARAMETROS.FTP_USER, PARAMETROS.FTP_PASSWORD);

            if (FTPReply.isPositiveCompletion(clienteFTP.getReplyCode())) {
                if (PARAMETROS.FTP_RAIZ != null && PARAMETROS.FTP_RAIZ.length() > 0) {
                    clienteFTP.changeWorkingDirectory(PARAMETROS.FTP_RAIZ);
                }
                clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
                clienteFTP.enterLocalPassiveMode();
            }

        } catch (IOException ex) {
            Logger.getLogger(ConexionFtpAdmin.class.getName()).log(Level.SEVERE, null, ex);
            clienteFTP = null;
        }
    }

    public static ConexionFtpAdmin getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConexionFtpAdmin();
        }
        return INSTANCE;
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }

}
