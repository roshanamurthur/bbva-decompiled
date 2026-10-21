package com.bbva.sl.ar.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;

/* JADX INFO: loaded from: classes8.dex */
public interface SSLChecker {
    CheckResult checkEstablished(SSLPinningConnection sSLPinningConnection) throws SSLPinningException;
}
