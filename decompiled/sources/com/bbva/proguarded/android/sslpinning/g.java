package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.security.cert.CertificateException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class g extends h<CertificateException> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f36146c = Logger.getLogger(g.class.getName());

    public g(m mVar) {
        this.f36148a = mVar;
    }

    @Override // com.bbva.proguarded.android.sslpinning.h
    public final /* synthetic */ CheckResult a(CertificateException certificateException) {
        CertificateException certificateException2 = certificateException;
        String str = "Evaluating cause of " + certificateException2.getClass().getCanonicalName();
        Logger logger = f36146c;
        logger.finer(str);
        CheckResult checkResultA = a((Exception) certificateException2);
        if (checkResultA != null) {
            return checkResultA;
        }
        logger.warning("Non-standard exception " + certificateException2.getClass().getCanonicalName());
        return new CheckResult(ResultLevel.FAILED, 502, "Exception " + certificateException2.getClass().getCanonicalName() + ": " + certificateException2.getMessage(), certificateException2);
    }
}
