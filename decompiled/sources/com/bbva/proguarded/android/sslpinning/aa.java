package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.security.cert.X509Certificate;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes8.dex */
public class aa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f36113b = Logger.getLogger(aa.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f36114a;

    public aa(m mVar) {
        this.f36114a = mVar;
    }

    public final CheckResult a(String str, X509Certificate x509Certificate) {
        m mVar = this.f36114a;
        if (!mVar.f36163f) {
            return CheckResult.OK();
        }
        String strF = ad.d.f(ci.a.d("Checking hostname [", str, "] against site ["), mVar.f36158a, "].");
        Logger logger = f36113b;
        logger.fine(strF);
        String[] strArrA = r.a(x509Certificate);
        String[] strArrA2 = r.a(x509Certificate, str);
        boolean z10 = mVar.f36164g;
        logger.finer("Check data: CNs: [" + u.a(strArrA) + "], SubjectAlts: [" + u.a(strArrA2) + "], StrictSubDomains: [" + z10 + "].");
        return r.a(str, strArrA, strArrA2, z10);
    }

    public final CheckResult a(String str, SSLSession sSLSession) {
        if (!this.f36114a.f36163f) {
            return CheckResult.OK();
        }
        try {
            return a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLPeerUnverifiedException e5) {
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_UNVERIFIED, "Error retrieving certificates. Connection unverified.", e5);
        }
    }
}
