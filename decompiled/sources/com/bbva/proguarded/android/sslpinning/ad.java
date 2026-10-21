package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Logger;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class ad {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f36123c = Logger.getLogger(ad.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<X509TrustManager> f36124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f36125b;

    public ad(m mVar) throws SSLPinningException {
        this.f36125b = mVar;
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null);
            Hashtable<String, X509Certificate> hashtable = mVar.f36159b;
            Enumeration<String> enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                String strNextElement = enumerationKeys.nextElement();
                keyStore.setEntry("Cert-" + mVar.f36158a + Constant.DASH_STRING + strNextElement, new KeyStore.TrustedCertificateEntry(hashtable.get(strNextElement)), null);
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            this.f36124a = new ArrayList<>();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f36124a.add((X509TrustManager) trustManager);
                }
            }
            if (this.f36124a.size() == 0) {
                throw new SSLPinningException(511, "Error verifier. No X509TrustManager implementations available.");
            }
        } catch (IOException e5) {
            throw new SSLPinningException(511, "Error initializing KeyStore for verifier.", e5);
        } catch (KeyStoreException e7) {
            throw new SSLPinningException(511, "Error accessing to KeyStore for verifier.", e7);
        } catch (NoSuchAlgorithmException e10) {
            throw new SSLPinningException(511, "Error building KeyStore for verifier.", e10);
        } catch (CertificateException e11) {
            throw new SSLPinningException(511, "Error initializing KeyStore for verifier.", e11);
        }
    }

    public final CheckResult a(X509Certificate[] x509CertificateArr, String str) {
        Logger logger;
        CheckResult checkResultOK = CheckResult.OK();
        int i10 = 0;
        while (true) {
            int length = x509CertificateArr.length;
            logger = f36123c;
            if (i10 >= length) {
                break;
            }
            StringBuilder sb2 = new StringBuilder("Verification target chain element [");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append("/");
            sb2.append(x509CertificateArr.length);
            sb2.append("]: ");
            sb2.append(x509CertificateArr[i10].getSubjectDN().getName());
            sb2.append(" (");
            sb2.append(x509CertificateArr[i10].getIssuerDN().getName());
            sb2.append(") [");
            sb2.append(x509CertificateArr[i10].getSerialNumber().toString(16));
            sb2.append(Constant.BRACKET_CLOSE);
            logger.finest(sb2.toString());
            i10 = i11;
        }
        m mVar = this.f36125b;
        if (mVar.f36161d) {
            logger.fine("Checking certificate dates...");
            try {
                Iterator<X509TrustManager> it = this.f36124a.iterator();
                while (it.hasNext()) {
                    it.next().checkServerTrusted(x509CertificateArr, str);
                }
            } catch (CertificateException e5) {
                checkResultOK.supersede(new g(mVar).a(e5));
            }
        }
        if (mVar.f36162e) {
            logger.fine("Checking certificate dates...");
            X509Certificate x509Certificate = x509CertificateArr[0];
            Date date = new Date();
            if (date.after(x509Certificate.getNotAfter())) {
                checkResultOK.supersede(new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, "Certificate expired on " + x509Certificate.getNotAfter()));
            }
            if (date.before(x509Certificate.getNotBefore())) {
                checkResultOK.supersede(new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY, "Certificate not valid until " + x509Certificate.getNotBefore()));
            }
        }
        return checkResultOK;
    }
}
