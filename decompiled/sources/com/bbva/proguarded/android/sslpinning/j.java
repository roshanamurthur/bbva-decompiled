package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class j extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f36154f = Logger.getLogger("j");

    @Override // com.bbva.sl.ar.android.sslpinning.SSLChecker
    public CheckResult checkEstablished(SSLPinningConnection sSLPinningConnection) throws SSLPinningException {
        String str = "Checking SSL for established connection to [" + t.a(sSLPinningConnection.getURL()) + Constant.BRACKET_CLOSE;
        Logger logger = f36154f;
        logger.fine(str);
        m mVarA = this.f36150a.a(sSLPinningConnection.getURL());
        if (mVarA == null) {
            return new CheckResult(ResultLevel.FAILED, 205, "URL [" + t.a(sSLPinningConnection.getURL()) + "] doesn't have a pinning configuration.");
        }
        logger.fine("Found site config [" + mVarA.f36158a + "] associated to url.");
        CheckResult checkResultA = new ab(mVarA).a(sSLPinningConnection);
        logger.fine("SSL checkEstablished: " + checkResultA.toString());
        return checkResultA;
    }
}
