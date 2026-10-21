package com.adobe.marketing.mobile.services;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"CommitPrefEdits"})
class SharedPreferencesNamedCollection implements NamedCollection {
    private static final String TAG = "SharedPreferencesNamedCollection";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    public SharedPreferencesNamedCollection(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        this.sharedPreferences = sharedPreferences;
        this.sharedPreferencesEditor = editor;
    }

    private void sharedPreferenceCommit() {
        if (this.sharedPreferencesEditor.commit()) {
            return;
        }
        MobileCore.log(LoggingMode.ERROR, TAG, "Android SharedPreference unable to commit the persisted data");
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public boolean contains(String str) {
        return this.sharedPreferences.contains(str);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public boolean getBoolean(String str, boolean z10) {
        return this.sharedPreferences.getBoolean(str, z10);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public double getDouble(String str, double d2) {
        return Double.longBitsToDouble(this.sharedPreferences.getLong(str, Double.doubleToRawLongBits(d2)));
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public float getFloat(String str, float f6) {
        return this.sharedPreferences.getFloat(str, f6);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public int getInt(String str, int i10) {
        return this.sharedPreferences.getInt(str, i10);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public long getLong(String str, long j10) {
        return this.sharedPreferences.getLong(str, j10);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public Map<String, String> getMap(String str) {
        String string = this.sharedPreferences.getString(str, null);
        HashMap map = new HashMap();
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, jSONObject.getString(next));
                } catch (JSONException e5) {
                    MobileCore.log(LoggingMode.WARNING, TAG, String.format("Unable to convert jsonObject key %s into map, %s", next, e5.getLocalizedMessage()));
                }
            }
            return map;
        } catch (Exception e7) {
            MobileCore.log(LoggingMode.ERROR, TAG, String.format("Failed to convert [%s] to String Map, %s", string, e7.getLocalizedMessage()));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public String getString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void remove(String str) {
        this.sharedPreferencesEditor.remove(str);
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void removeAll() {
        this.sharedPreferencesEditor.clear();
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setBoolean(String str, boolean z10) {
        this.sharedPreferencesEditor.putBoolean(str, z10);
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setDouble(String str, double d2) {
        this.sharedPreferencesEditor.putLong(str, Double.doubleToRawLongBits(d2));
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setFloat(String str, float f6) {
        this.sharedPreferencesEditor.putFloat(str, f6);
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setInt(String str, int i10) {
        SharedPreferences.Editor editor = this.sharedPreferencesEditor;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i10);
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setLong(String str, long j10) {
        this.sharedPreferencesEditor.putLong(str, j10);
        sharedPreferenceCommit();
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setMap(String str, Map<String, String> map) {
        try {
            this.sharedPreferencesEditor.putString(str, new JSONObject(map).toString());
            sharedPreferenceCommit();
        } catch (NullPointerException unused) {
            MobileCore.log(LoggingMode.ERROR, TAG, "Map contains null key.");
        }
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setString(String str, String str2) {
        this.sharedPreferencesEditor.putString(str, str2);
        sharedPreferenceCommit();
    }
}
