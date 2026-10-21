package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFb1ySDK {

    @NonNull
    public final String AFInAppEventParameterName;

    @NonNull
    public final Map<String, String> AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final boolean AFLogger;
    public int afDebugLog;
    private boolean afErrorLog;

    @Nullable
    private final byte[] afInfoLog;
    private final boolean afRDLog;
    public boolean valueOf;

    @NonNull
    public final String values;

    public AFb1ySDK() {
    }

    public AFb1ySDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z10) {
        this(str, bArr, str2, map, z10, true);
    }

    public static Map<String, String> valueOf(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e5) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e5);
            }
        }
        return map2;
    }

    public final boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean AFInAppEventType() {
        return this.AFLogger;
    }

    public final AFb1ySDK AFKeystoreWrapper(int i10) {
        this.afDebugLog = i10;
        return this;
    }

    public final boolean afDebugLog() {
        return this.AFKeystoreWrapper;
    }

    @Nullable
    public final byte[] values() {
        return this.afInfoLog;
    }

    public AFb1ySDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z10, boolean z11) {
        this.afErrorLog = true;
        this.valueOf = false;
        this.AFKeystoreWrapper = true;
        this.afDebugLog = -1;
        this.AFInAppEventParameterName = str;
        this.afInfoLog = bArr;
        this.values = str2;
        this.AFInAppEventType = map;
        this.AFLogger = z10;
        this.afRDLog = z11;
    }

    public final boolean AFKeystoreWrapper() {
        return this.afErrorLog;
    }

    public final boolean valueOf() {
        return this.afRDLog;
    }

    public AFb1ySDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
