package com.bbva.sl.ar.android.sslpinning.result;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes8.dex */
public class CheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultLevel f36601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpsURLConnection f36604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f36605e;

    public CheckResult(ResultLevel resultLevel, int i10, String str) {
        this(resultLevel, i10, str, null, null);
    }

    public static CheckResult OK() {
        return new CheckResult(ResultLevel.SUCCESS, 0, "Success");
    }

    public static CheckResult fromSSLPinningException(SSLPinningException sSLPinningException) {
        return new CheckResult(ResultLevel.FAILED, sSLPinningException.getErrCode(), sSLPinningException.getMessage());
    }

    public int getCode() {
        return this.f36602b;
    }

    public URLConnection getConnection() {
        return this.f36604d;
    }

    public String getDescription() {
        return this.f36603c;
    }

    public Throwable getInnerCause() {
        return this.f36605e;
    }

    public ResultLevel getLevel() {
        return this.f36601a;
    }

    public boolean isFailed() {
        return this.f36601a == ResultLevel.FAILED;
    }

    public boolean isSuccess() {
        return this.f36601a == ResultLevel.SUCCESS;
    }

    public void setConnection(HttpsURLConnection httpsURLConnection) {
        this.f36604d = httpsURLConnection;
    }

    public void setDescription(String str) {
        this.f36603c = str;
    }

    public CheckResult supersede(CheckResult checkResult) {
        if (checkResult != null) {
            ResultLevel resultLevel = checkResult.f36601a;
            if (resultLevel.f36611a > this.f36601a.f36611a) {
                this.f36601a = resultLevel;
                this.f36602b = checkResult.f36602b;
                this.f36603c = checkResult.f36603c;
                this.f36604d = checkResult.f36604d;
                this.f36605e = checkResult.f36605e;
            }
        }
        return this;
    }

    public String toString() {
        return "Check result level: [" + this.f36601a + "] result code: [" + this.f36602b + "]. Description: " + this.f36603c;
    }

    public CheckResult(ResultLevel resultLevel, int i10, String str, Throwable th2) {
        this(resultLevel, i10, str, null, th2);
    }

    public CheckResult(ResultLevel resultLevel, int i10, String str, HttpsURLConnection httpsURLConnection) {
        this(resultLevel, i10, str, httpsURLConnection, null);
    }

    private CheckResult(ResultLevel resultLevel, int i10, String str, HttpsURLConnection httpsURLConnection, Throwable th2) {
        this.f36601a = resultLevel;
        this.f36602b = i10;
        this.f36603c = str;
        this.f36604d = httpsURLConnection;
        this.f36605e = th2;
    }
}
