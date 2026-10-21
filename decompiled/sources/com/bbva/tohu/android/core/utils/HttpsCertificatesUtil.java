package com.bbva.tohu.android.core.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class HttpsCertificatesUtil {
    private static Certificate createCertificate(Context context, int i10) throws IOException, CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509);
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
        try {
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpenRawResource);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
            return certificateGenerateCertificate;
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NonNull
    private static KeyStore createKeyStore(Map<String, Certificate> map) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        for (Map.Entry<String, Certificate> entry : map.entrySet()) {
            keyStore.setCertificateEntry(entry.getKey(), entry.getValue());
        }
        return keyStore;
    }

    public static SSLSocketFactory createSocketFactory(Context context, Map<String, Certificate> map) throws NoSuchAlgorithmException, IOException, KeyStoreException, KeyManagementException, CertificateException {
        TrustManager[] trustManagerArrCreateTrustManager = createTrustManager(createKeyStore(map));
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        SSLContext.setDefault(sSLContext);
        sSLContext.init(null, trustManagerArrCreateTrustManager, null);
        return sSLContext.getSocketFactory();
    }

    public static SSLSocketFactory createSocketFactoryDefault(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        SSLContext.setDefault(sSLContext);
        sSLContext.init(null, null, null);
        return sSLContext.getSocketFactory();
    }

    @NonNull
    private static TrustManager[] createTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return trustManagerFactory.getTrustManagers();
    }
}
