package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFa1qSDK {
    public final Map<String, Object> AFInAppEventParameterName;

    @Nullable
    public AppsFlyerRequestListener AFInAppEventType;

    @Nullable
    Map<String, Object> AFKeystoreWrapper;
    String AFLogger;
    private final boolean AFVersionDeclaration;
    String afDebugLog;
    public int afErrorLog;
    private byte[] afErrorLogForExcManagerOnly;
    public String afInfoLog;

    @Nullable
    String afRDLog;
    public String valueOf;

    @Nullable
    String values;

    public AFa1qSDK() {
        this(null, null, null);
    }

    public final AFa1qSDK AFInAppEventParameterName(String str, Object obj) {
        synchronized (this.AFInAppEventParameterName) {
            this.AFInAppEventParameterName.put(str, obj);
        }
        return this;
    }

    public abstract AFd1vSDK AFInAppEventParameterName();

    public final AFa1qSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventParameterName.putAll(map);
        }
        return this;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFVersionDeclaration;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public boolean afRDLog() {
        return false;
    }

    public AFa1qSDK valueOf(String str) {
        this.afInfoLog = str;
        return this;
    }

    public final boolean values() {
        return this.afDebugLog == null && this.valueOf == null;
    }

    public AFa1qSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.AFInAppEventParameterName = new HashMap();
        this.afDebugLog = str;
        this.afInfoLog = str2;
        this.AFVersionDeclaration = bool != null ? bool.booleanValue() : true;
    }

    @NonNull
    public static String AFKeystoreWrapper(String str) {
        String strAFKeystoreWrapper = AFa1dSDK.valueOf().AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
        return strAFKeystoreWrapper != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", strAFKeystoreWrapper).build().toString() : str;
    }

    public final AFa1qSDK valueOf(int i10) {
        this.afErrorLog = i10;
        synchronized (this.AFInAppEventParameterName) {
            try {
                if (this.AFInAppEventParameterName.containsKey("counter")) {
                    this.AFInAppEventParameterName.put("counter", Integer.toString(i10));
                }
                if (this.AFInAppEventParameterName.containsKey("launch_counter")) {
                    this.AFInAppEventParameterName.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public static boolean AFInAppEventParameterName(double d2) {
        if (d2 < 0.0d || d2 >= 1.0d) {
            return false;
        }
        if (d2 == 0.0d) {
            return true;
        }
        int i10 = (int) (1.0d / d2);
        if (i10 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i10)) + 1.0d)) != i10;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final AFa1qSDK valueOf(byte[] bArr) {
        this.afErrorLogForExcManagerOnly = bArr;
        return this;
    }

    public final byte[] valueOf() {
        return this.afErrorLogForExcManagerOnly;
    }
}
