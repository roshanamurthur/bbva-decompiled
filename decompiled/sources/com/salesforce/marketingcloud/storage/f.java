package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f65085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f65086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final File f65087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f65088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.internal.l f65089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("lock")
    private String f65090h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f65083a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f65084b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("lock")
    private boolean f65091i = false;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            f.this.b();
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f65093b = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            ?? r4;
            FileOutputStream fileOutputStream;
            synchronized (f.this.f65083a) {
                Object obj = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(f.this.f65087e);
                        try {
                            String str = this.f65093b;
                            fileOutputStream3.write(str != null ? str.getBytes(com.salesforce.marketingcloud.util.l.f65196b) : new byte[0]);
                            String str2 = e.f65076c;
                            com.salesforce.marketingcloud.g.d(str2, "Gdpr mode [%s] written to file.", this.f65093b);
                            obj = str2;
                            fileOutputStream = fileOutputStream3;
                        } catch (Exception unused) {
                            fileOutputStream2 = fileOutputStream3;
                            com.salesforce.marketingcloud.g.b(e.f65076c, "Failed to write gdpr mode to file: ", f.this.f65087e.getAbsolutePath());
                            fileOutputStream = fileOutputStream2;
                            obj = fileOutputStream2;
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = fileOutputStream3;
                            com.salesforce.marketingcloud.util.g.a((Closeable) r4);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r4 = obj;
                    }
                } catch (Exception unused2) {
                }
                try {
                    com.salesforce.marketingcloud.util.g.a(fileOutputStream);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public f(Context context, SharedPreferences sharedPreferences, String str, com.salesforce.marketingcloud.internal.l lVar) {
        this.f65085c = context;
        this.f65086d = sharedPreferences;
        this.f65089g = lVar;
        String strF = u.f(str, "_SFMC_PrivacyMode");
        this.f65088f = strF;
        this.f65087e = new File(context.getNoBackupFilesDir(), strF);
        c();
    }

    private static String a(@NonNull File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        String line = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                line = new BufferedReader(new InputStreamReader(fileInputStream, com.salesforce.marketingcloud.util.l.f65196b)).readLine();
            } catch (Exception unused) {
                try {
                    com.salesforce.marketingcloud.g.b(e.f65076c, "Failed to read gdpr mode from file: ", file.getAbsolutePath());
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    fileInputStream = fileInputStream2;
                    com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = fileInputStream2;
            com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
            throw th;
        }
        com.salesforce.marketingcloud.util.g.a((Closeable) fileInputStream);
        return line;
    }

    private void c() {
        synchronized (this.f65084b) {
            this.f65091i = false;
        }
        new a("gdpr_file_load").start();
    }

    public void b() throws Throwable {
        synchronized (this.f65084b) {
            try {
                if (this.f65091i) {
                    return;
                }
                String string = null;
                if (this.f65087e.exists()) {
                    String strA = a(this.f65087e);
                    if (!TextUtils.isEmpty(strA)) {
                        string = strA;
                    }
                } else {
                    String str = e.f65076c;
                    com.salesforce.marketingcloud.g.a(str, "Checking SharedPreferences for gdpr mode", new Object[0]);
                    string = this.f65086d.getString("cc_state", null);
                    if (string != null) {
                        this.f65086d.edit().remove("cc_state").apply();
                    } else {
                        com.salesforce.marketingcloud.g.a(str, "Checking pre-lollipop location for gdpr mode", new Object[0]);
                        File file = new File(this.f65085c.getFilesDir(), this.f65088f);
                        if (file.exists()) {
                            string = a(file);
                            com.salesforce.marketingcloud.util.g.b(file);
                        }
                    }
                    c(string);
                }
                synchronized (this.f65084b) {
                    this.f65090h = string;
                    this.f65091i = true;
                    this.f65084b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String a(@Nullable String str) {
        synchronized (this.f65084b) {
            a();
            String str2 = this.f65090h;
            if (str2 != null) {
                str = str2;
            }
        }
        return str;
    }

    public void b(@Nullable String str) {
        synchronized (this.f65084b) {
            com.salesforce.marketingcloud.g.d(e.f65076c, "Updating gdpr mode: %s", str);
            this.f65090h = str;
            c(str);
        }
    }

    @GuardedBy("writingToDiskLock")
    public void c(@Nullable String str) {
        this.f65089g.b().execute(new b("storing_gdpr", new Object[0], str));
    }

    private void a() {
        while (!this.f65091i) {
            try {
                this.f65084b.wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
