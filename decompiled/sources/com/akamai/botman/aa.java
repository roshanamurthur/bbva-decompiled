package com.akamai.botman;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class aa {
    public static String a(Application application) {
        try {
            Context baseContext = application.getBaseContext();
            if (baseContext == null) {
                ap.b("aa", "Installation timestamp", new Throwable[0]);
                return "";
            }
            SharedPreferences sharedPreferences = baseContext.getSharedPreferences("com.akamai.botman.preferences", 0);
            if (sharedPreferences.getString("installation_Timestamp", "").isEmpty()) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("installation_Timestamp", Base64.encodeToString(String.valueOf(SystemClock.uptimeMillis()).getBytes(), 0));
                editorEdit.commit();
            }
            return new String(Base64.decode(sharedPreferences.getString("installation_Timestamp", "-1"), 0));
        } catch (Exception e5) {
            ap.b("aa", e5.getMessage(), new Throwable[0]);
            return "-1";
        }
    }

    public static String a() {
        return String.valueOf(SystemClock.uptimeMillis());
    }
}
