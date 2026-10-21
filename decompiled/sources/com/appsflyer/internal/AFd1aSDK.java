package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material3.TooltipKt;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1aSDK extends AFd1uSDK<AFe1zSDK> {
    private final AFb1cSDK AFLogger;
    private final String AFLogger$LogLevel;
    private final AFc1qSDK AFVersionDeclaration;
    private final AFd1bSDK afDebugLog;

    @Nullable
    public AFe1zSDK afErrorLog;
    private final AFb1tSDK afErrorLogForExcManagerOnly;
    public AFf1uSDK afInfoLog;

    @Nullable
    public final AFd1cSDK afRDLog;
    private final AFe1xSDK afWarnLog;
    private final AFe1vSDK getLevel;

    public AFd1aSDK(@NonNull AFd1bSDK aFd1bSDK, @NonNull AFb1cSDK aFb1cSDK, @NonNull AFe1xSDK aFe1xSDK, @NonNull AFb1tSDK aFb1tSDK, @NonNull AFc1qSDK aFc1qSDK, @NonNull AFe1vSDK aFe1vSDK, @NonNull String str, @Nullable AFd1cSDK aFd1cSDK) {
        super(AFd1vSDK.RC_CDN, new AFd1vSDK[0], "UpdateRemoteConfiguration");
        this.afErrorLog = null;
        this.afDebugLog = aFd1bSDK;
        this.AFLogger = aFb1cSDK;
        this.afWarnLog = aFe1xSDK;
        this.afErrorLogForExcManagerOnly = aFb1tSDK;
        this.AFVersionDeclaration = aFc1qSDK;
        this.getLevel = aFe1vSDK;
        this.AFLogger$LogLevel = str;
        this.afRDLog = aFd1cSDK;
    }

    private void AFInAppEventParameterName(String str, long j10, @Nullable AFc1gSDK<?> aFc1gSDK, AFf1vSDK aFf1vSDK, AFf1sSDK aFf1sSDK, @Nullable String str2, @Nullable Throwable th2) {
        long j11;
        int statusCode;
        Throwable cause;
        long j12;
        if (aFc1gSDK != null) {
            j11 = aFc1gSDK.AFInAppEventParameterName.AFInAppEventType;
            statusCode = aFc1gSDK.getStatusCode();
        } else {
            j11 = 0;
            statusCode = 0;
        }
        int i10 = statusCode;
        if (th2 instanceof HttpException) {
            cause = th2.getCause();
            j12 = ((HttpException) th2).getMetrics().AFInAppEventType;
        } else {
            cause = th2;
            j12 = j11;
        }
        this.afInfoLog = new AFf1uSDK(aFf1vSDK != null ? aFf1vSDK.values : null, str, j12, System.currentTimeMillis() - j10, i10, aFf1sSDK, str2, cause);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[Catch: all -> 0x0114, IOException -> 0x0116, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[Catch: all -> 0x0114, IOException -> 0x0116, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9 A[Catch: all -> 0x0114, IOException -> 0x0116, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0119 A[Catch: all -> 0x0114, IOException -> 0x0116, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0131 A[Catch: all -> 0x0114, IOException -> 0x0116, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0153 A[Catch: all -> 0x0114, IOException -> 0x0116, TRY_LEAVE, TryCatch #2 {IOException -> 0x0116, all -> 0x0114, blocks: (B:15:0x004e, B:17:0x0056, B:19:0x0079, B:21:0x0091, B:24:0x009d, B:26:0x00a9, B:32:0x0119, B:34:0x012b, B:36:0x0131, B:38:0x0153), top: B:56:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFe1zSDK afDebugLog() throws InterruptedException, InterruptedIOException {
        String strAFKeystoreWrapper;
        AFc1gSDK<AFf1vSDK> aFc1gSDKAFInAppEventParameterName;
        AFf1vSDK body;
        String strAFInAppEventType;
        String strAFInAppEventType2;
        String str;
        AFf1rSDK aFf1rSDKAFKeystoreWrapper;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.AFLogger$LogLevel;
        String str3 = this.afWarnLog.AFInAppEventType;
        if (str3 != null && str3.trim().length() != 0) {
            if (str2 == null) {
                AFLogger.afWarnLog("CFG: Can't create CDN token, domain or version is not provided.");
            } else {
                strAFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values("appsflyersdk.com", str2, this.AFLogger.values.AFInAppEventParameterName.getPackageName()), str3);
            }
            if (strAFKeystoreWrapper == null) {
                AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
                return AFe1zSDK.FAILURE;
            }
            try {
                if (this.getLevel.AFInAppEventType()) {
                    AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
                    return AFe1zSDK.USE_CACHED;
                }
                AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
                aFc1gSDKAFInAppEventParameterName = this.AFVersionDeclaration.AFInAppEventType(this.getLevel.values(), this.getLevel.valueOf(), strAFKeystoreWrapper, 1500).AFInAppEventParameterName();
                if (aFc1gSDKAFInAppEventParameterName.isSuccessful()) {
                    AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, null, null, aFc1gSDKAFInAppEventParameterName);
                    StringBuilder sb2 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
                    sb2.append(aFc1gSDKAFInAppEventParameterName.getStatusCode());
                    AFLogger.afWarnLog(sb2.toString());
                    return AFe1zSDK.FAILURE;
                }
                body = aFc1gSDKAFInAppEventParameterName.getBody();
                strAFInAppEventType = aFc1gSDKAFInAppEventParameterName.AFInAppEventType("x-amz-meta-af-auth-v1");
                strAFInAppEventType2 = aFc1gSDKAFInAppEventParameterName.AFInAppEventType("CF-Cache-Status");
                str = this.afWarnLog.AFInAppEventType;
                if (str != null && str.trim().length() != 0) {
                    aFf1rSDKAFKeystoreWrapper = this.afDebugLog.AFKeystoreWrapper(body, strAFInAppEventType, strAFKeystoreWrapper, str);
                    if (aFf1rSDKAFKeystoreWrapper.valueOf()) {
                        AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, aFf1rSDKAFKeystoreWrapper.valueOf, strAFInAppEventType2, aFc1gSDKAFInAppEventParameterName);
                        AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                        return AFe1zSDK.FAILURE;
                    }
                    long jAFInAppEventParameterName = this.getLevel.AFInAppEventParameterName();
                    StringBuilder sb3 = new StringBuilder("CFG: using max-age fallback: ");
                    sb3.append(jAFInAppEventParameterName);
                    sb3.append(" seconds");
                    AFLogger.afRDLog(sb3.toString());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    AFb1tSDK aFb1tSDK = this.afErrorLogForExcManagerOnly;
                    aFb1tSDK.AFKeystoreWrapper.values("af_remote_config", Base64.encodeToString(body.AFInAppEventParameterName.getBytes(Charset.defaultCharset()), 2));
                    aFb1tSDK.AFKeystoreWrapper.AFInAppEventType("af_rc_timestamp", jCurrentTimeMillis2);
                    aFb1tSDK.AFKeystoreWrapper.AFInAppEventType("af_rc_max_age", jAFInAppEventParameterName);
                    aFb1tSDK.AFInAppEventParameterName = body;
                    aFb1tSDK.values = jCurrentTimeMillis2;
                    aFb1tSDK.AFInAppEventType = jAFInAppEventParameterName;
                    StringBuilder sb4 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                    sb4.append(jAFInAppEventParameterName);
                    sb4.append(" seconds");
                    AFLogger.afDebugLog(sb4.toString());
                    AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, aFf1rSDKAFKeystoreWrapper.valueOf, strAFInAppEventType2, aFc1gSDKAFInAppEventParameterName);
                    return AFe1zSDK.SUCCESS;
                }
                AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
                return AFe1zSDK.FAILURE;
            } catch (IOException e5) {
                StringBuilder sb5 = new StringBuilder("CFG: failed to fetch remote config: ");
                sb5.append(e5.getMessage());
                AFLogger.afErrorLog(sb5.toString(), e5, true, false, false);
                AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, e5 instanceof ParsingException ? ((ParsingException) e5).getRawResponse() : null, null, null, null, e5);
                if (e5.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e5.getCause());
                }
                return AFe1zSDK.FAILURE;
            } catch (Throwable th2) {
                StringBuilder sb6 = new StringBuilder("CFG: failed to update remote config: ");
                sb6.append(th2.getMessage());
                AFLogger.afErrorLog(sb6.toString(), th2, true, false, false);
                AFInAppEventParameterName(strAFKeystoreWrapper, jCurrentTimeMillis, null, null, null, null, th2);
                if (th2.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th2.getCause());
                }
                return AFe1zSDK.FAILURE;
            }
        }
        AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
        strAFKeystoreWrapper = null;
        if (strAFKeystoreWrapper == null) {
            AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
            return AFe1zSDK.FAILURE;
        }
        if (this.getLevel.AFInAppEventType()) {
            AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
            return AFe1zSDK.USE_CACHED;
        }
        AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
        aFc1gSDKAFInAppEventParameterName = this.AFVersionDeclaration.AFInAppEventType(this.getLevel.values(), this.getLevel.valueOf(), strAFKeystoreWrapper, 1500).AFInAppEventParameterName();
        if (aFc1gSDKAFInAppEventParameterName.isSuccessful()) {
            AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, null, null, aFc1gSDKAFInAppEventParameterName);
            StringBuilder sb7 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
            sb7.append(aFc1gSDKAFInAppEventParameterName.getStatusCode());
            AFLogger.afWarnLog(sb7.toString());
            return AFe1zSDK.FAILURE;
        }
        body = aFc1gSDKAFInAppEventParameterName.getBody();
        strAFInAppEventType = aFc1gSDKAFInAppEventParameterName.AFInAppEventType("x-amz-meta-af-auth-v1");
        strAFInAppEventType2 = aFc1gSDKAFInAppEventParameterName.AFInAppEventType("CF-Cache-Status");
        str = this.afWarnLog.AFInAppEventType;
        if (str != null) {
            aFf1rSDKAFKeystoreWrapper = this.afDebugLog.AFKeystoreWrapper(body, strAFInAppEventType, strAFKeystoreWrapper, str);
            if (aFf1rSDKAFKeystoreWrapper.valueOf()) {
                AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, aFf1rSDKAFKeystoreWrapper.valueOf, strAFInAppEventType2, aFc1gSDKAFInAppEventParameterName);
                AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                return AFe1zSDK.FAILURE;
            }
            long jAFInAppEventParameterName2 = this.getLevel.AFInAppEventParameterName();
            StringBuilder sb8 = new StringBuilder("CFG: using max-age fallback: ");
            sb8.append(jAFInAppEventParameterName2);
            sb8.append(" seconds");
            AFLogger.afRDLog(sb8.toString());
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            AFb1tSDK aFb1tSDK2 = this.afErrorLogForExcManagerOnly;
            aFb1tSDK2.AFKeystoreWrapper.values("af_remote_config", Base64.encodeToString(body.AFInAppEventParameterName.getBytes(Charset.defaultCharset()), 2));
            aFb1tSDK2.AFKeystoreWrapper.AFInAppEventType("af_rc_timestamp", jCurrentTimeMillis3);
            aFb1tSDK2.AFKeystoreWrapper.AFInAppEventType("af_rc_max_age", jAFInAppEventParameterName2);
            aFb1tSDK2.AFInAppEventParameterName = body;
            aFb1tSDK2.values = jCurrentTimeMillis3;
            aFb1tSDK2.AFInAppEventType = jAFInAppEventParameterName2;
            StringBuilder sb9 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
            sb9.append(jAFInAppEventParameterName2);
            sb9.append(" seconds");
            AFLogger.afDebugLog(sb9.toString());
            AFInAppEventType(strAFKeystoreWrapper, jCurrentTimeMillis, aFf1rSDKAFKeystoreWrapper.valueOf, strAFInAppEventType2, aFc1gSDKAFInAppEventParameterName);
            return AFe1zSDK.SUCCESS;
        }
        AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
        return AFe1zSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return TooltipKt.TooltipDuration;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @NonNull
    public final AFd1ySDK values() throws Exception {
        try {
            AFe1zSDK aFe1zSDKAfDebugLog = afDebugLog();
            this.afErrorLog = aFe1zSDKAfDebugLog;
            return aFe1zSDKAfDebugLog == AFe1zSDK.FAILURE ? AFd1ySDK.FAILURE : AFd1ySDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e5) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e5);
            this.afErrorLog = AFe1zSDK.FAILURE;
            return AFd1ySDK.TIMEOUT;
        }
    }

    private void AFInAppEventType(String str, long j10, AFf1sSDK aFf1sSDK, @Nullable String str2, @Nullable AFc1gSDK<AFf1vSDK> aFc1gSDK) {
        AFInAppEventParameterName(str, j10, aFc1gSDK, aFc1gSDK != null ? aFc1gSDK.getBody() : null, aFf1sSDK, str2 != null ? str2 : null, null);
    }
}
