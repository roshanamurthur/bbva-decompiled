package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bbva.semaas.model.Properties;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Store.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f48657a;

    /* JADX INFO: compiled from: Store.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f48658d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48661c;

        public a(String str, String str2, long j10) {
            this.f48659a = str;
            this.f48660b = str2;
            this.f48661c = j10;
        }

        public static String a(long j10, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(Properties.APP_VERSION, str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e5) {
                Log.w(Constants.TAG, "Failed to encode token: " + e5);
                return null;
            }
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString(Properties.APP_VERSION), jSONObject.getLong("timestamp"));
            } catch (JSONException e5) {
                Log.w(Constants.TAG, "Failed to parse token: " + e5);
                return null;
            }
        }
    }

    public p(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f48657a = sharedPreferences;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                b();
            }
        } catch (IOException e5) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                e5.getMessage();
            }
        }
    }

    public static String a(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized void b() {
        this.f48657a.edit().clear().commit();
    }
}
