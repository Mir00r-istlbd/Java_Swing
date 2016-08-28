/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.dao;

/* 
 * @author Maverick
 */
//import com.perp.proxy.PartnerService;
//import com.perp.proxy.PartnerService_Service;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

public class ServiceManager {
/*
    public static final boolean IS_PRODUCTION = true;//false means DEVELOPMENT, true means PRODUCTION ie. esb
    private static String PROTOCOL = "http://";
    private static boolean IS_SSL = true;
    private static long PARTNER_PORT = 80;//80; // 80  
    private static String PARTNER_PATH = "/service";
    private static String PARTNER_HOST = "180.211.162.70";//"perp.gov.bd";//
    
    private static PartnerService_Service partnerService_service=null;

    static {
        if (IS_PRODUCTION) {
            PARTNER_PATH = "/service";
        }
        if (IS_SSL) {
            PROTOCOL = "https://";
            PARTNER_PORT=80;
        }
    }
    private final static String WSDL_EXTENSION = "?WSDL";

    private static URL getServiceEndpoint(String serviceName) throws ServiceException {

        if (IS_SSL) {
            String ur = PROTOCOL + PARTNER_HOST + ":" + PARTNER_PORT + PARTNER_PATH + serviceName + WSDL_EXTENSION;

            try {
                if (true) {
                    System.out.println("url=" + ur);
                }
                URL url = new URL(ur);

                TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
                };

                // Install the all-trusting trust manager
                SSLContext sc = null;
                try {
                    sc = SSLContext.getInstance("SSL");
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

                // Create all-trusting host name verifier
                HostnameVerifier allHostsValid = new HostnameVerifier() {
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                };

                // Install the all-trusting host verifier
                HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);


                return null;


                //return url;
            } catch (MalformedURLException e) {

                throw new ServiceException("Unable to connect to service point. The service may be temporary unavailable. Please try again later.", 99999);
            }  catch (IOException ex) {
//                Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (KeyManagementException ex) {
                Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;

        } else {
            return getHttpServiceEndpoint(serviceName);
        }
    }

    private static URL getHttpServiceEndpoint(String serviceName) throws ServiceException {
        try {
            URL url = new URL(PROTOCOL + PARTNER_HOST + ":" + PARTNER_PORT + PARTNER_PATH + serviceName + "?WSDL");
            return url;
        } catch (MalformedURLException e) {
            throw new ServiceException("Unable to connect to service point. The service may be temporary unavailable. Please try again later.", 99999);
        } catch (IOException ioe) {
            throw new ServiceException("IOException occured. The service may be temporary unavailable. Please try again later.", 99999);
        }
    }
    private final static String PARTNER_SERVICE = "/PartnerService";
    private final static QName PARTNER_QNAME = new QName("http://bean.partner.ws.service.bvrs.soa.tigerit.com/", "PartnerService");
    private static PartnerService partnerService = null;
    private static URL PartnerServiceEndpointUrl = null;

    private static URL getPartnerServiceEndpoint() throws ServiceException {
        if (PartnerServiceEndpointUrl == null) {
            PartnerServiceEndpointUrl = getServiceEndpoint(PARTNER_SERVICE);
        }
        return PartnerServiceEndpointUrl;
    }

    public static PartnerService getPartnerService() throws ServiceException {
        
        if(partnerService_service==null)
            partnerService_service = new PartnerService_Service(getPartnerServiceEndpoint(), PARTNER_QNAME);
//        PartnerService_Service partnerService_service = new PartnerService_Service(null,PARTNER_QNAME);




        partnerService = partnerService_service.getPartnerServicePort();

        if (true) {
            BindingProvider p = (BindingProvider) partnerService;
            p.getRequestContext().put("javax.xml.ws.client.receiveTimeout", 3000000);
            p.getRequestContext().put("javax.xml.ws.client.connectionTimeout", 3000000);
            p.getRequestContext().put("Content-Type", "text/xml;charset=UTF-8");
            //p.getRequestContext().put("Accept",Defs.SERVICE_RESPONSE_CONTENT_TYPE);        
        }
        return partnerService;
    }



    public static boolean isPartnerServiceRechable() {

        try {
            PartnerService_Service cvlaService_Service = new PartnerService_Service(getPartnerServiceEndpoint(), PARTNER_QNAME);
            partnerService = cvlaService_Service.getPartnerServicePort();
        } catch (Exception ex) {
            //LOGGER.error(ex);
            return false;
        }
        return true;
    }
*/
}
