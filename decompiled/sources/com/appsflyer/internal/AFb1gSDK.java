package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1gSDK implements AFb1fSDK {
    private final SharedPreferences AFKeystoreWrapper;

    public AFb1gSDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void AFInAppEventType(String str, long j10) {
        this.AFKeystoreWrapper.edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final boolean AFKeystoreWrapper(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e5) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e5);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final String valueOf(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e5) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e5);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void values(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final int AFInAppEventType(String str, int i10) {
        try {
            return this.AFKeystoreWrapper.getInt(str, i10);
        } catch (ClassCastException e5) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e5);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final long values(String str, long j10) {
        try {
            return this.AFKeystoreWrapper.getLong(str, j10);
        } catch (ClassCastException e5) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e5);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void valueOf(String str, boolean z10) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void AFInAppEventType(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void valueOf(String str, int i10) {
        this.AFKeystoreWrapper.edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final boolean valueOf(String str) {
        return this.AFKeystoreWrapper.contains(str);
    }
}
