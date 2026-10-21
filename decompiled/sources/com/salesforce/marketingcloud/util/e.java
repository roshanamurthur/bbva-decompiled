package com.salesforce.marketingcloud.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65135a = com.salesforce.marketingcloud.g.a("DeviceData");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65136b = "SFMCDeviceUUID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    static volatile String f65137c;

    private e() {
    }

    private static String a() {
        return l.a(String.format(Locale.ENGLISH, "%s%d", UUID.randomUUID().toString(), Long.valueOf(System.currentTimeMillis())));
    }

    private static String b(@NonNull Context context, @Nullable String str) throws Throwable {
        File file = new File(context.getNoBackupFilesDir(), f65136b);
        String strA = file.exists() ? a(file) : null;
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String str2 = f65135a;
        com.salesforce.marketingcloud.g.a(str2, "Checking SharedPreferences for deviceId", new Object[0]);
        String strA2 = a(context);
        if (TextUtils.isEmpty(strA2)) {
            com.salesforce.marketingcloud.g.a(str2, "Checking pre-lollipop location for deviceId", new Object[0]);
            File file2 = new File(context.getFilesDir(), f65136b);
            if (file2.exists()) {
                strA2 = a(file2);
                g.b(file2);
            }
        }
        if (TextUtils.isEmpty(strA2)) {
            Object[] objArr = new Object[0];
            if (str != null) {
                com.salesforce.marketingcloud.g.a(str2, "Using registrationId as deviceId", objArr);
            } else {
                com.salesforce.marketingcloud.g.a(str2, "Generating/Storing new deviceId", objArr);
                str = a();
            }
        } else {
            str = strA2;
        }
        a(file, str);
        return str;
    }

    private static String a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_et_default_shared_preferences", 0);
        String string = sharedPreferences.getString("id", null);
        if (string != null) {
            sharedPreferences.edit().remove("id").apply();
        }
        return string;
    }

    @NonNull
    public static String a(@NonNull Context context, @Nullable String str) {
        if (f65137c == null) {
            synchronized (e.class) {
                f65137c = b(context, str);
            }
        }
        return f65137c;
    }

    private static String a(@NonNull File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        String line = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                line = new BufferedReader(new InputStreamReader(fileInputStream, l.f65196b)).readLine();
            } catch (Exception unused) {
                try {
                    com.salesforce.marketingcloud.g.b(f65135a, "Failed to read device id from file: ", file.getAbsolutePath());
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    fileInputStream = fileInputStream2;
                    g.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                g.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = fileInputStream2;
            g.a((Closeable) fileInputStream);
            throw th;
        }
        g.a((Closeable) fileInputStream);
        return line;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static void a(File file, String str) throws Throwable {
        ?? fileOutputStream;
        ?? r1;
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    Charset charset = l.f65196b;
                    fileOutputStream.write(str.getBytes(charset));
                    r3 = charset;
                    r1 = fileOutputStream;
                } catch (Exception unused) {
                    r4 = fileOutputStream;
                    com.salesforce.marketingcloud.g.b(f65135a, "Failed to write device id to file: ", file.getAbsolutePath());
                    r1 = r4;
                    r3 = r4;
                } catch (Throwable th2) {
                    th = th2;
                    g.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = r3;
            }
        } catch (Exception unused2) {
        }
        g.a((Closeable) r1);
    }
}
