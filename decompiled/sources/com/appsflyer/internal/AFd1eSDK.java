package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewConfiguration;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AFd1eSDK extends AFd1nSDK<String> {
    private static final AFd1vSDK[] onInstallConversionFailureNative = {AFd1vSDK.DLSDK, AFd1vSDK.ONELINK, AFd1vSDK.MONITORSDK, AFd1vSDK.REGISTER};
    protected final AFb1fSDK AFLogger$LogLevel;
    private final AFc1tSDK AFVersionDeclaration;

    @NonNull
    private final AFb1cSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFc1cSDK afWarnLog;
    private final AFb1bSDK getLevel;

    public AFd1eSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1zSDK aFc1zSDK) {
        this(aFa1qSDK, aFc1zSDK, null);
    }

    @NonNull
    private static Map<String, Object> AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.AFInAppEventType().get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFa1qSDK.AFInAppEventType().put("meta", map2);
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) throws Throwable {
        double d2;
        String string;
        String strReplaceAll;
        String str2;
        values(this.afInfoLog);
        if (this.afInfoLog.AFInAppEventType().containsKey("meta")) {
            try {
                d2 = this.AFVersionDeclaration.valueOf().AFInAppEventType.AFInAppEventParameterName.AFInAppEventType;
            } catch (NullPointerException unused) {
                d2 = 1.0d;
            }
            if (AFa1qSDK.AFInAppEventParameterName(d2)) {
                this.afInfoLog.AFInAppEventType().remove("meta");
            }
        }
        AFa1qSDK aFa1qSDK = this.afInfoLog;
        String str3 = aFa1qSDK.afInfoLog;
        Map<String, Object> mapAFInAppEventType = aFa1qSDK.AFInAppEventType();
        String str4 = null;
        try {
            string = new JSONObject(mapAFInAppEventType).toString();
            try {
                if (string == null) {
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                }
                strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                str2 = string != null ? string : "";
                if (strReplaceAll.equals(str2)) {
                    strReplaceAll = str2;
                } else {
                    AFLogger.afWarnLog("Payload contains non-printing characters");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": preparing data: ");
                sb2.append(strReplaceAll);
                AFc1pSDK.AFKeystoreWrapper(sb2.toString());
                ((AFd1nSDK) this).afDebugLog.valueOf(str3, strReplaceAll);
                return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
            } catch (NullPointerException e5) {
                e = e5;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    String str5 = (String) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", Map.class).invoke(null, mapAFInAppEventType);
                    try {
                        if (str5 == null) {
                            throw new NullPointerException("JSON toString of eventParams map returns null");
                        }
                        strReplaceAll = str5.replaceAll("\\p{C}", "*Non-printing character*");
                        string = str5;
                    } catch (NullPointerException e7) {
                        e = e7;
                        string = str5;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        strReplaceAll = "";
                    } catch (Throwable th2) {
                        th = th2;
                        string = str5;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        strReplaceAll = "";
                    }
                } catch (Throwable th3) {
                    try {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    } catch (NullPointerException e10) {
                        e = e10;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        strReplaceAll = "";
                        if (string != null) {
                        }
                        if (strReplaceAll.equals(str2)) {
                            AFLogger.afWarnLog("Payload contains non-printing characters");
                        } else {
                            strReplaceAll = str2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this);
                        sb3.append(": preparing data: ");
                        sb3.append(strReplaceAll);
                        AFc1pSDK.AFKeystoreWrapper(sb3.toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str3, strReplaceAll);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    } catch (Throwable th4) {
                        th = th4;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        strReplaceAll = "";
                        if (string != null) {
                        }
                        if (strReplaceAll.equals(str2)) {
                            AFLogger.afWarnLog("Payload contains non-printing characters");
                        } else {
                            strReplaceAll = str2;
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this);
                        sb4.append(": preparing data: ");
                        sb4.append(strReplaceAll);
                        AFc1pSDK.AFKeystoreWrapper(sb4.toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str3, strReplaceAll);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str4 = string;
                AFLogger.afErrorLog("Unexpected error", th, true);
                strReplaceAll = "";
                string = str4;
            }
        } catch (NullPointerException e11) {
            e = e11;
            string = null;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public boolean afRDLog() {
        return true;
    }

    @CallSuper
    public void values(AFa1qSDK aFa1qSDK) throws Throwable {
        boolean z10 = true;
        if (aFa1qSDK.afInfoLog()) {
            aFa1qSDK.AFInAppEventType(new AFb1eSDK.AFa1xSDK(aFa1qSDK.AFInAppEventType(), ((AFd1nSDK) this).afRDLog.AFKeystoreWrapper.AFInAppEventParameterName));
            try {
                aFa1qSDK.AFInAppEventType((Map) ((Class) AFb1pSDK.values((char) (56427 - Color.green(0)), (ViewConfiguration.getTouchSlop() >> 8) + 37, 87 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredConstructor(Map.class, Context.class).newInstance(aFa1qSDK.AFInAppEventType(), ((AFd1nSDK) this).afRDLog.AFKeystoreWrapper.AFInAppEventParameterName));
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (aFa1qSDK.afErrorLog()) {
            aFa1qSDK.AFInAppEventType(((AFd1nSDK) this).afRDLog.AFKeystoreWrapper());
        }
        Set<AFd1vSDK> set = this.AFInAppEventType;
        if (!set.contains(AFd1vSDK.LAUNCH) && !set.contains(AFd1vSDK.CONVERSION)) {
            z10 = false;
        }
        if (AFLogger() && z10) {
            aFa1qSDK.valueOf(this.AFLogger$LogLevel.AFInAppEventType("appsFlyerCount", 0));
        }
        try {
            if (aFa1qSDK.AFInAppEventType().containsKey("appsflyerKey") && aFa1qSDK.afInfoLog()) {
                new AFb1zSDK();
                aFa1qSDK.AFInAppEventParameterName("af_v", AFb1zSDK.values(aFa1qSDK.AFInAppEventType()));
                new AFb1zSDK();
                aFa1qSDK.AFInAppEventParameterName("af_v2", AFb1zSDK.AFKeystoreWrapper(aFa1qSDK.AFInAppEventType()));
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th3)), th3);
        }
        if (aFa1qSDK.afRDLog()) {
            Map<String, Object> mapAFInAppEventParameterName = AFInAppEventParameterName(aFa1qSDK);
            AFc1cSDK aFc1cSDK = this.afWarnLog;
            AFc1bSDK aFc1bSDK = new AFc1bSDK(aFc1cSDK.AFInAppEventType(), aFc1cSDK.valueOf(), AFc1cSDK.AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", aFc1bSDK.AFInAppEventType);
            AFc1aSDK aFc1aSDK = aFc1bSDK.valueOf;
            if (aFc1aSDK != AFc1aSDK.DEFAULT) {
                jSONObject.put("method", aFc1aSDK.com.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER java.lang.String);
            }
            String str = aFc1bSDK.AFInAppEventParameterName;
            if (str != null && !l.isBlank(str)) {
                jSONObject.put("prefix", aFc1bSDK.AFInAppEventParameterName);
            }
            mapAFInAppEventParameterName.put("host", jSONObject);
        }
        if (this.afErrorLogForExcManagerOnly.AFInAppEventType("AF_PREINSTALL_DISABLED")) {
            AFInAppEventParameterName(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1eSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1zSDK aFc1zSDK, String str) {
        super(aFa1qSDK.AFInAppEventParameterName(), new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, str);
        this.afInfoLog = aFa1qSDK;
        this.afWarnLog = aFc1zSDK.onInstallConversionDataLoadedNative();
        this.AFLogger$LogLevel = aFc1zSDK.AFKeystoreWrapper();
        this.AFVersionDeclaration = aFc1zSDK.afDebugLog();
        this.getLevel = aFc1zSDK.onAppOpenAttributionNative();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFInAppEventParameterName();
        for (AFd1vSDK aFd1vSDK : onInstallConversionFailureNative) {
            if (this.values == aFd1vSDK) {
                return;
            }
        }
        int i10 = this.afInfoLog.afErrorLog;
        AFd1vSDK aFd1vSDK2 = this.values;
        if (i10 > 0) {
            this.valueOf.add(AFd1vSDK.CONVERSION);
            return;
        }
        AFd1vSDK aFd1vSDK3 = AFd1vSDK.CONVERSION;
        if (aFd1vSDK2 != aFd1vSDK3) {
            this.AFInAppEventType.add(aFd1vSDK3);
        }
    }
}
