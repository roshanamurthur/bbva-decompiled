package com.adobe.marketing.mobile;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"CommitPrefEdits"})
class AndroidDataStore implements LocalStorageService.DataStore {
    private static final String LOG_TAG = "AndroidDataStore";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    private AndroidDataStore(String str) {
        SharedPreferences sharedPreferences = App.getAppContext().getSharedPreferences(str, 0);
        this.sharedPreferences = sharedPreferences;
        if (sharedPreferences != null) {
            this.sharedPreferencesEditor = sharedPreferences.edit();
        }
    }

    public static AndroidDataStore createDataStore(String str) {
        if (App.getAppContext() != null && str != null && !str.isEmpty()) {
            AndroidDataStore androidDataStore = new AndroidDataStore(str);
            if (androidDataStore.sharedPreferences != null && androidDataStore.sharedPreferencesEditor != null) {
                return androidDataStore;
            }
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public boolean contains(String str) {
        return this.sharedPreferences.contains(str);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public boolean getBoolean(String str, boolean z10) {
        return this.sharedPreferences.getBoolean(str, z10);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public double getDouble(String str, double d2) {
        return Double.longBitsToDouble(this.sharedPreferences.getLong(str, Double.doubleToRawLongBits(d2)));
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public float getFloat(String str, float f6) {
        return this.sharedPreferences.getFloat(str, f6);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public int getInt(String str, int i10) {
        return this.sharedPreferences.getInt(str, i10);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public long getLong(String str, long j10) {
        return this.sharedPreferences.getLong(str, j10);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public Map<String, String> getMap(String str) {
        String string = this.sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        AndroidJsonUtility androidJsonUtility = new AndroidJsonUtility();
        return androidJsonUtility.mapFromJsonObject(androidJsonUtility.createJSONObject(string));
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public String getString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void remove(String str) {
        this.sharedPreferencesEditor.remove(str);
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void removeAll() {
        this.sharedPreferencesEditor.clear();
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setBoolean(String str, boolean z10) {
        this.sharedPreferencesEditor.putBoolean(str, z10);
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setDouble(String str, double d2) {
        this.sharedPreferencesEditor.putLong(str, Double.doubleToRawLongBits(d2));
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setFloat(String str, float f6) {
        this.sharedPreferencesEditor.putFloat(str, f6);
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setInt(String str, int i10) {
        SharedPreferences.Editor editor = this.sharedPreferencesEditor;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i10);
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setLong(String str, long j10) {
        this.sharedPreferencesEditor.putLong(str, j10);
        this.sharedPreferencesEditor.commit();
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setMap(String str, Map<String, String> map) {
        try {
            this.sharedPreferencesEditor.putString(str, new JSONObject(map).toString());
            this.sharedPreferencesEditor.commit();
        } catch (NullPointerException unused) {
            Log.error(LOG_TAG, "Map contains null key.", new Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.LocalStorageService.DataStore
    public void setString(String str, String str2) {
        this.sharedPreferencesEditor.putString(str, str2);
        this.sharedPreferencesEditor.commit();
    }
}
