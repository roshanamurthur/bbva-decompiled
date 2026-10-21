package com.facetec.sdk;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes9.dex */
public final class me implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final km.e f42465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final lj f42466b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf f42467d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ko f42468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ml f42469g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f42464e = kz.b("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f42463c = kz.b("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public class d extends ng {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f42471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f42472e;

        public d(nz nzVar) {
            super(nzVar);
            this.f42471d = false;
            this.f42472e = 0L;
        }

        private void a(IOException iOException) {
            if (this.f42471d) {
                return;
            }
            this.f42471d = true;
            me meVar = me.this;
            meVar.f42466b.a(false, (lr) meVar, iOException);
        }

        @Override // com.facetec.sdk.ng, com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            a(null);
        }

        @Override // com.facetec.sdk.ng, com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            try {
                long jD = c().d(nbVar, j10);
                if (jD > 0) {
                    this.f42472e += jD;
                }
                return jD;
            } catch (IOException e5) {
                a(e5);
                throw e5;
            }
        }
    }

    public me(kl klVar, km.e eVar, lj ljVar, mf mfVar) {
        this.f42465a = eVar;
        this.f42466b = ljVar;
        this.f42467d = mfVar;
        List<ko> listO = klVar.o();
        ko koVar = ko.H2_PRIOR_KNOWLEDGE;
        this.f42468f = listO.contains(koVar) ? koVar : ko.HTTP_2;
    }

    @Override // com.facetec.sdk.lr
    public final void a() throws IOException {
        this.f42469g.d().close();
    }

    @Override // com.facetec.sdk.lr
    public final void b() throws IOException {
        this.f42467d.e();
    }

    @Override // com.facetec.sdk.lr
    public final kq.d c(boolean z10) throws IOException {
        kj kjVarA = this.f42469g.a();
        ko koVar = this.f42468f;
        kj.d dVar = new kj.d();
        int iA = kjVarA.a();
        ly lyVarE = null;
        for (int i10 = 0; i10 < iA; i10++) {
            String strE = kjVarA.e(i10);
            String strC = kjVarA.c(i10);
            if (strE.equals(Header.RESPONSE_STATUS_UTF8)) {
                lyVarE = ly.e("HTTP/1.1 ".concat(String.valueOf(strC)));
            } else if (!f42463c.contains(strE)) {
                kv.f42195e.b(dVar, strE, strC);
            }
        }
        if (lyVarE == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        kq.d dVarE = new kq.d().e(koVar).d(lyVarE.f42370e).d(lyVarE.f42369b).e(dVar.d());
        if (z10 && kv.f42195e.b(dVarE) == 100) {
            return null;
        }
        return dVarE;
    }

    @Override // com.facetec.sdk.lr
    public final ns e(kr krVar, long j10) {
        return this.f42469g.d();
    }

    @Override // com.facetec.sdk.lr
    public final void e(kr krVar) throws IOException {
        if (this.f42469g != null) {
            return;
        }
        boolean z10 = krVar.e() != null;
        kj kjVarD = krVar.d();
        ArrayList arrayList = new ArrayList(kjVarD.a() + 4);
        arrayList.add(new mg(mg.f42546e, krVar.c()));
        arrayList.add(new mg(mg.f42542a, lu.d(krVar.a())));
        String strD = krVar.d("Host");
        if (strD != null) {
            arrayList.add(new mg(mg.f42547h, strD));
        }
        arrayList.add(new mg(mg.f42543b, krVar.a().b()));
        int iA = kjVarD.a();
        for (int i10 = 0; i10 < iA; i10++) {
            nj njVarC = nj.c(kjVarD.e(i10).toLowerCase(Locale.US));
            if (!f42464e.contains(njVarC.b())) {
                arrayList.add(new mg(njVarC, kjVarD.c(i10)));
            }
        }
        ml mlVarE = this.f42467d.e(arrayList, z10);
        this.f42469g = mlVarE;
        ml.b bVar = mlVarE.f42583f;
        long jA = this.f42465a.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.c(jA, timeUnit);
        this.f42469g.f42587j.c(this.f42465a.b(), timeUnit);
    }

    @Override // com.facetec.sdk.lr
    public final kt e(kq kqVar) throws IOException {
        lj ljVar = this.f42466b;
        kf kfVar = ljVar.f42303d;
        jw jwVar = ljVar.f42302c;
        return new lw(kqVar.d(DigipassManagerConstants.KEY_CONTENT_TYPE), lp.c(kqVar), no.c(new d(this.f42469g.f42584g)));
    }

    @Override // com.facetec.sdk.lr
    public final void e() {
        ml mlVar = this.f42469g;
        if (mlVar != null) {
            mlVar.d(lz.CANCEL);
        }
    }
}
