package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.CheckResultException;
import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningCertRetrievalException;
import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.logging.Logger;
import javax.crypto.interfaces.DHPublicKey;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes8.dex */
public class ab implements HostnameVerifier, X509TrustManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f36115e = Logger.getLogger(ab.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f36116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad f36117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa f36118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac f36119d;

    public ab(m mVar) throws SSLPinningException {
        this.f36116a = mVar;
        f36115e.fine("Initializing verifiers for site [" + mVar.f36158a + "].");
        this.f36117b = new ad(mVar);
        this.f36118c = new aa(mVar);
        this.f36119d = new ac(mVar);
    }

    public final CheckResult a(SSLPinningConnection sSLPinningConnection) throws SSLPinningException {
        CheckResult checkResult;
        try {
            f36115e.fine("Initiating verification process for established connection.");
            CheckResult checkResultOK = CheckResult.OK();
            String cipherSuite = sSLPinningConnection.getCipherSuite();
            Certificate[] serverCertificates = sSLPinningConnection.getServerCertificates();
            X509Certificate[] x509CertificateArr = new X509Certificate[serverCertificates.length];
            for (int i10 = 0; i10 < serverCertificates.length; i10++) {
                Certificate certificate = serverCertificates[i10];
                if (!(certificate instanceof X509Certificate)) {
                    return new CheckResult(ResultLevel.FAILED, 306, "Invalid server certificate format");
                }
                x509CertificateArr[i10] = (X509Certificate) certificate;
            }
            String host = sSLPinningConnection.getURL().getHost();
            if (!checkResultOK.isFailed()) {
                checkResultOK.supersede(this.f36117b.a(x509CertificateArr, cipherSuite));
            }
            if (!checkResultOK.isFailed()) {
                checkResultOK.supersede(this.f36118c.a(host, x509CertificateArr[0]));
            }
            if (!checkResultOK.isFailed()) {
                ac acVar = this.f36119d;
                X509Certificate x509Certificate = x509CertificateArr[0];
                CheckResult checkResultOK2 = CheckResult.OK();
                if (acVar.f36122b != null) {
                    Logger logger = ac.f36120c;
                    logger.finer("Checking strength params [" + cipherSuite + "] against site [" + acVar.f36121a.f36158a + "].");
                    o oVar = acVar.f36122b;
                    if (cipherSuite != null) {
                        if (cipherSuite.matches(oVar.f36168c)) {
                            checkResultOK2.supersede(new CheckResult(ResultLevel.WARNING, 702, "Cipher suite [" + cipherSuite + "] matches the defined black list [" + oVar.f36168c + "]."));
                        }
                        if (!cipherSuite.matches(oVar.f36167b)) {
                            checkResultOK2.supersede(new CheckResult(ResultLevel.WARNING, ResultCode.ERROR_STRENGTH_SUITENOWHITE, "Cipher suite [" + cipherSuite + "] does not match the defined white list [" + oVar.f36168c + "]."));
                        }
                    }
                    if (oVar.f36166a != 0) {
                        logger.finer("Checking key length...");
                        PublicKey publicKey = x509Certificate.getPublicKey();
                        if (publicKey instanceof RSAPublicKey) {
                            int iBitLength = ((RSAPublicKey) publicKey).getModulus().bitLength();
                            checkResult = iBitLength < oVar.f36166a ? new CheckResult(ResultLevel.WARNING, 701, "Server certificate public key [" + iBitLength + "] does not meet length requirements [" + oVar.f36166a + "].") : CheckResult.OK();
                        } else if (publicKey instanceof DSAPublicKey) {
                            int iBitLength2 = ((DSAPublicKey) publicKey).getParams().getP().bitLength();
                            checkResult = iBitLength2 < oVar.f36166a ? new CheckResult(ResultLevel.WARNING, 701, "Server certificate public key [" + iBitLength2 + "] does not meet length requirements [" + oVar.f36166a + "].") : CheckResult.OK();
                        } else if (publicKey instanceof ECPublicKey) {
                            int iBitLength3 = ((ECPublicKey) publicKey).getParams().getOrder().bitLength();
                            checkResult = iBitLength3 < oVar.f36166a ? new CheckResult(ResultLevel.WARNING, 701, "Server certificate public key [" + iBitLength3 + "] does not meet length requirements [" + oVar.f36166a + "].") : CheckResult.OK();
                        } else if (publicKey instanceof DHPublicKey) {
                            int iBitLength4 = ((DHPublicKey) publicKey).getParams().getP().bitLength();
                            checkResult = iBitLength4 < oVar.f36166a ? new CheckResult(ResultLevel.WARNING, 701, "Server certificate public key [" + iBitLength4 + "] does not meet length requirements [" + oVar.f36166a + "].") : CheckResult.OK();
                        } else {
                            checkResultOK2.supersede(new CheckResult(ResultLevel.WARNING, 701, "Public key type not defined for strength requirements check."));
                        }
                        checkResultOK2.supersede(checkResult);
                    }
                }
                checkResultOK.supersede(checkResultOK2);
            }
            return checkResultOK;
        } catch (SSLPinningCertRetrievalException e5) {
            throw new SSLPinningException(ResultCode.ERROR_CONN_SSL_UNVERIFIED, "Error retrieving certificates. Connection unverified.", e5);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        f36115e.finer("Calling trust verifier.");
        CheckResult checkResultA = this.f36117b.a(x509CertificateArr, str);
        if (!checkResultA.isSuccess()) {
            throw new CheckResultException(checkResultA);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        m mVar = this.f36116a;
        if (mVar.f36159b.size() <= 0) {
            return null;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[mVar.f36159b.size()];
        for (int i10 = 0; i10 < mVar.f36159b.size(); i10++) {
            x509CertificateArr[i10] = mVar.f36159b.get(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        f36115e.finer("Calling host verifier.");
        CheckResult checkResultA = this.f36118c.a(str, sSLSession);
        if (checkResultA.isSuccess()) {
            return true;
        }
        throw new CheckResultException(checkResultA);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }
}
