package com.google.firebase.iid;

import ad.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.appcompat.widget.c;
import androidx.collection.ArrayMap;
import androidx.collection.k;
import androidx.core.content.ContextCompat;
import com.bbva.semaas.model.Properties;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f48429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayMap f48430b = new ArrayMap();

    /* JADX INFO: renamed from: com.google.firebase.iid.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class C0211a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f48431d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f48432e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48435c;

        public C0211a(String str, String str2, long j10) {
            this.f48433a = str;
            this.f48434b = str2;
            this.f48435c = j10;
        }

        public static String a(long j10, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(Properties.APP_VERSION, str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e5) {
                String strValueOf = String.valueOf(e5);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(strValueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        public static C0211a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0211a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0211a(jSONObject.getString("token"), jSONObject.getString(Properties.APP_VERSION), jSONObject.getLong("timestamp"));
            } catch (JSONException e5) {
                String strValueOf = String.valueOf(e5);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(strValueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }
    }

    public a(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f48429a = sharedPreferences;
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
                c();
            }
        } catch (IOException e5) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e5.getMessage());
                if (strValueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(strValueOf);
                }
            }
        }
    }

    public static String a(String str) {
        return d.f(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public static String b(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(c.a(String.valueOf(str).length(), 4, String.valueOf(str2).length(), String.valueOf(str3).length()));
        k.e(sb2, str, "|T|", str2, "|");
        sb2.append(str3);
        return sb2.toString();
    }

    public final synchronized void c() {
        this.f48430b.clear();
        this.f48429a.edit().clear().commit();
    }

    public final synchronized void d(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = a(str);
        SharedPreferences sharedPreferences = this.f48429a;
        if (sharedPreferences.contains(strA)) {
            String string = this.f48429a.getString(a(str), null);
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                    jCurrentTimeMillis = 0;
                }
            } else {
                jCurrentTimeMillis = 0;
            }
        } else {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(a(str), String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.f48430b.put(str, Long.valueOf(jCurrentTimeMillis));
    }
}
