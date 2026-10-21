package com.bbva.sl.ar.android.secsdk.fido.tools;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
class StorageManager {
    static final String QUICK_AUTHS = "QuickAuths";
    private final Context context;
    private final String filename;

    public StorageManager(@NonNull String str, @NonNull Context context) {
        this.filename = str;
        this.context = context;
    }

    private SharedPreferences getPreferences() {
        return this.context.getSharedPreferences(this.filename, 0);
    }

    private SharedPreferences.Editor getPreferencesEditor() {
        return getPreferences().edit();
    }

    public boolean containsPreferenceKey(String str) {
        return getPreferences().contains(str);
    }

    public String getPreferenceValue(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public void removePreferenceValue(String str) {
        getPreferencesEditor().remove(str).apply();
    }

    public void setPreferenceValue(String str, String str2) {
        getPreferencesEditor().putString(str, str2).apply();
    }

    public int getPreferenceValue(String str, int i10) {
        return getPreferences().getInt(str, i10);
    }

    public void setPreferenceValue(String str, int i10) {
        getPreferencesEditor().putInt(str, i10).apply();
    }

    public boolean getPreferenceValue(String str, boolean z10) {
        return getPreferences().getBoolean(str, z10);
    }

    public void setPreferenceValue(String str, boolean z10) {
        getPreferencesEditor().putBoolean(str, z10).apply();
    }
}
