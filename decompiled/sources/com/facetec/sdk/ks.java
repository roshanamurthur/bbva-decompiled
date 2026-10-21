package com.facetec.sdk;

import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
final class ks implements jw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    kf f42161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final lt f42162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kl f42163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final nd f42164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kr f42165e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f42167j;

    public final class c extends lb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ boolean f42169b = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final jy f42171e;

        public c(jy jyVar) {
            super("OkHttp %s", ks.this.c());
            this.f42171e = jyVar;
        }

        public final String a() {
            return ks.this.f42165e.a().i();
        }

        @Override // com.facetec.sdk.lb
        public final void d() {
            ks.this.f42164d.d();
            try {
                try {
                    ks ksVar = ks.this;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(ksVar.f42163c.f42062d);
                    arrayList.add(ksVar.f42162b);
                    arrayList.add(new ln(ksVar.f42163c.a()));
                    kl klVar = ksVar.f42163c;
                    ju juVar = klVar.f42066i;
                    arrayList.add(new lc(juVar != null ? juVar.f41911c : klVar.f42065h));
                    arrayList.add(new ld(ksVar.f42163c));
                    if (!ksVar.f42167j) {
                        arrayList.addAll(ksVar.f42163c.f42060a);
                    }
                    arrayList.add(new lo(ksVar.f42167j));
                    kr krVar = ksVar.f42165e;
                    kf kfVar = ksVar.f42161a;
                    kl klVar2 = ksVar.f42163c;
                    kq kqVarB = new ls(arrayList, null, null, null, 0, krVar, ksVar, kfVar, klVar2.f42063f, klVar2.f42070n, klVar2.f42068k).b(ksVar.f42165e);
                    if (ksVar.f42162b.b()) {
                        kz.a(kqVarB);
                        throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                    }
                    this.f42171e.e(kqVarB);
                    ks.this.f42163c.m().a(this);
                } catch (Throwable th2) {
                    ks.this.f42163c.m().a(this);
                    throw th2;
                }
            } catch (IOException e5) {
                IOException iOExceptionB = ks.this.b(e5);
                if (0 != 0) {
                    mu muVarI = mu.i();
                    StringBuilder sb2 = new StringBuilder("Callback failure for ");
                    ks ksVar2 = ks.this;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ksVar2.e() ? "canceled " : "");
                    sb3.append(ksVar2.f42167j ? "web socket" : NotificationCompat.CATEGORY_CALL);
                    sb3.append(" to ");
                    sb3.append(ksVar2.c());
                    sb2.append(sb3.toString());
                    muVarI.a(4, sb2.toString(), iOExceptionB);
                } else {
                    kf unused = ks.this.f42161a;
                    this.f42171e.a();
                }
            } catch (Throwable th3) {
                ks.this.a();
                if (0 == 0) {
                    new IOException("canceled due to ".concat(String.valueOf(th3)));
                    this.f42171e.a();
                }
                throw th3;
            }
        }
    }

    private ks(kl klVar, kr krVar, boolean z10) {
        this.f42163c = klVar;
        this.f42165e = krVar;
        this.f42167j = z10;
        this.f42162b = new lt(klVar, z10);
        nd ndVar = new nd() { // from class: com.facetec.sdk.ks.1
            @Override // com.facetec.sdk.nd
            public final void e() {
                ks.this.a();
            }
        };
        this.f42164d = ndVar;
        ndVar.c(klVar.f42067j, TimeUnit.MILLISECONDS);
    }

    public static ks c(kl klVar, kr krVar, boolean z10) {
        ks ksVar = new ks(klVar, krVar, z10);
        ksVar.f42161a = klVar.f42061b.a();
        return ksVar;
    }

    public final void a() {
        lr lrVar;
        lm lmVar;
        lt ltVar = this.f42162b;
        ltVar.f42363d = true;
        lj ljVar = ltVar.f42360a;
        if (ljVar != null) {
            synchronized (ljVar.f42300a) {
                ljVar.f42308j = true;
                lrVar = ljVar.f42306h;
                lmVar = ljVar.f42301b;
            }
            if (lrVar != null) {
                lrVar.e();
            } else if (lmVar != null) {
                lmVar.c();
            }
        }
    }

    @Nullable
    public final IOException b(@Nullable IOException iOException) {
        if (!this.f42164d.a()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return c(this.f42163c, this.f42165e, this.f42167j);
    }

    @Override // com.facetec.sdk.jw
    public final void e(jy jyVar) {
        synchronized (this) {
            if (this.f42166i) {
                throw new IllegalStateException("Already Executed");
            }
            this.f42166i = true;
        }
        this.f42162b.f42364e = mu.i().e("response.body().close()");
        kg kgVarM = this.f42163c.m();
        c cVar = new c(jyVar);
        synchronized (kgVarM) {
            kgVarM.f42024a.add(cVar);
        }
        kgVarM.c();
    }

    public final String c() {
        kk.e eVarD = this.f42165e.a().d("/...");
        eVarD.f42052c = kk.d("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        eVarD.f42053d = kk.d("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return eVarD.c().toString();
    }

    public final boolean e() {
        return this.f42162b.b();
    }
}
