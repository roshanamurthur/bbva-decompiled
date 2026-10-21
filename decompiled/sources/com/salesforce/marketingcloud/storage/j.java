package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.InitializationStatus;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class j extends b {
    private static final String B = "mcsdk_cache_%s";
    private static final String C = "ETStorage.version";
    private static final int D = 1;
    private d A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f65108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SharedPreferences f65109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.salesforce.marketingcloud.storage.db.l f65110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f65111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.a f65112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.i f65113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.j f65114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.k f65115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.h f65116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.g f65117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.f f65118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.db.m f65119z;

    public j(@NonNull Context context, com.salesforce.marketingcloud.util.c cVar, @NonNull String str, @NonNull String str2, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        super(context, cVar, str, str2);
        com.salesforce.marketingcloud.storage.db.l lVar2 = new com.salesforce.marketingcloud.storage.db.l(context, cVar, this.f64945h);
        this.f65110q = lVar2;
        lVar2.getWritableDatabase();
        c.a aVar = new c.a(context, cVar, this.f64945h);
        this.f65108o = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences(b.a(this.f64945h), 0);
        this.f65109p = sharedPreferences;
        this.f65111r = new f(context, sharedPreferences, str, lVar);
        if (lVar2.a()) {
            aVar.a();
            sharedPreferences.edit().clear().apply();
        }
    }

    private void d(com.salesforce.marketingcloud.util.c cVar) throws Exception {
        this.f65109p.edit().putString("create_date", cVar.a(String.valueOf(System.currentTimeMillis()))).apply();
    }

    private void l() throws Exception {
        File fileK = k();
        if (fileK.exists() && fileK.isDirectory()) {
            com.salesforce.marketingcloud.util.g.a(fileK);
        }
        w();
        this.f65110q.b();
    }

    private void w() throws Exception {
        c().a();
        f().edit().clear().apply();
        d(this.f64947j);
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public final Context a() {
        return this.f64946i;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public com.salesforce.marketingcloud.util.c b() {
        return this.f64947j;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public c c() {
        return this.f65108o;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public SQLiteOpenHelper e() {
        return this.f65110q;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public SharedPreferences f() {
        return this.f65109p;
    }

    public File k() {
        return new File(this.f64946i.getCacheDir(), String.format(Locale.ENGLISH, B, this.f64945h));
    }

    public a m() {
        if (this.f65112s == null) {
            this.f65112s = new com.salesforce.marketingcloud.storage.db.a(this.f65110q.getWritableDatabase());
        }
        return this.f65112s;
    }

    public d n() {
        if (this.A == null) {
            this.A = new com.salesforce.marketingcloud.storage.db.e(this.f65110q.getWritableDatabase());
        }
        return this.A;
    }

    public f o() {
        return this.f65111r;
    }

    public g p() {
        if (this.f65118y == null) {
            this.f65118y = new com.salesforce.marketingcloud.storage.db.f(this.f65110q.getWritableDatabase());
        }
        return this.f65118y;
    }

    public h q() {
        if (this.f65117x == null) {
            this.f65117x = new com.salesforce.marketingcloud.storage.db.g(this.f65110q.getWritableDatabase());
        }
        return this.f65117x;
    }

    public i r() {
        if (this.f65116w == null) {
            this.f65116w = new com.salesforce.marketingcloud.storage.db.h(this.f65110q.getWritableDatabase());
        }
        return this.f65116w;
    }

    public k s() {
        if (this.f65113t == null) {
            this.f65113t = new com.salesforce.marketingcloud.storage.db.i(this.f65110q.getWritableDatabase());
        }
        return this.f65113t;
    }

    public l t() {
        if (this.f65114u == null) {
            this.f65114u = new com.salesforce.marketingcloud.storage.db.j(this.f65110q.getWritableDatabase());
        }
        return this.f65114u;
    }

    public m u() {
        if (this.f65115v == null) {
            this.f65115v = new com.salesforce.marketingcloud.storage.db.k(this.f65110q.getWritableDatabase());
        }
        return this.f65115v;
    }

    public n v() {
        if (this.f65119z == null) {
            this.f65119z = new com.salesforce.marketingcloud.storage.db.m(this.f65110q.getWritableDatabase());
        }
        return this.f65119z;
    }

    public final void x() {
        this.f65110q.close();
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public void a(Context context, int i10, int i11) {
    }

    public final void a(InitializationStatus.a aVar) {
        if (!a(this.f65109p)) {
            boolean zContains = this.f65109p.contains("create_date");
            aVar.a(zContains);
            if (zContains) {
                try {
                    l();
                } catch (Exception e5) {
                    aVar.a(e5);
                    aVar.f(true);
                    com.salesforce.marketingcloud.g.b(e.f65076c, e5, "Failed to recover from encryption change.", new Object[0]);
                    return;
                }
            }
        }
        try {
            try {
                this.f65110q.c();
            } catch (Exception e7) {
                aVar.a(e7);
                aVar.f(true);
                com.salesforce.marketingcloud.g.b(e.f65076c, e7, "Failed to recover from data reset.", new Object[0]);
                return;
            }
        } catch (com.salesforce.marketingcloud.storage.exceptions.a unused) {
            w();
        } catch (IllegalStateException e10) {
            aVar.a(e10);
            aVar.f(true);
            com.salesforce.marketingcloud.g.b(e.f65076c, e10, "Could not create the necessary database table(s).", new Object[0]);
            return;
        }
        int i10 = this.f65109p.getInt(C, -1);
        if (i10 == 0 || i10 == 1) {
            return;
        }
        Context context = this.f64946i;
        if (1 < i10) {
            a(context, i10, 1);
        } else {
            b(context, i10, 1);
        }
        this.f65109p.edit().putInt(C, 1).apply();
    }

    @Override // com.salesforce.marketingcloud.storage.b
    public boolean a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("create_date", null);
        if (string == null) {
            return false;
        }
        try {
            this.f64947j.b(string);
            return true;
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            com.salesforce.marketingcloud.g.b(e.f65076c, e5, "Failed to verify existing encryption key", new Object[0]);
            return false;
        }
    }
}
