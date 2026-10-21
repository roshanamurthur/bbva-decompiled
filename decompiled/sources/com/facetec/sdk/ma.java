package com.facetec.sdk;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class ma implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ni f42410a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kl f42412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final lj f42413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final nh f42414e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42411b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f42415g = SvgConstantsKt.SPECIFIED_TEXT_ANCHOR;

    public class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f42418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kk f42419d;

        public a(kk kkVar) {
            super(ma.this, (byte) 0);
            this.f42418c = -1L;
            this.f42416a = true;
            this.f42419d = kkVar;
        }

        @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42432e) {
                return;
            }
            if (this.f42416a && !kz.c(this, TimeUnit.MILLISECONDS)) {
                b(false, null);
            }
            this.f42432e = true;
        }

        @Override // com.facetec.sdk.ma.e, com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
            }
            if (this.f42432e) {
                throw new IllegalStateException("closed");
            }
            if (!this.f42416a) {
                return -1L;
            }
            long j11 = this.f42418c;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    ma.this.f42414e.k();
                }
                try {
                    this.f42418c = ma.this.f42414e.n();
                    String strTrim = ma.this.f42414e.k().trim();
                    if (this.f42418c < 0 || !(strTrim.isEmpty() || strTrim.startsWith(ReplenishLogic.ID_SEPARATOR))) {
                        StringBuilder sb2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                        sb2.append(this.f42418c);
                        sb2.append(strTrim);
                        sb2.append("\"");
                        throw new ProtocolException(sb2.toString());
                    }
                    if (this.f42418c == 0) {
                        this.f42416a = false;
                        lp.e(ma.this.f42412c.a(), this.f42419d, ma.this.c());
                        b(true, null);
                    }
                    if (!this.f42416a) {
                        return -1L;
                    }
                } catch (NumberFormatException e5) {
                    throw new ProtocolException(e5.getMessage());
                }
            }
            long jD = super.d(nbVar, Math.min(j10, this.f42418c));
            if (jD != -1) {
                this.f42418c -= jD;
                return jD;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(false, protocolException);
            throw protocolException;
        }
    }

    public final class b implements ns {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f42421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nm f42422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f42423d;

        public b(long j10) {
            this.f42422c = new nm(ma.this.f42410a.a());
            this.f42421b = j10;
        }

        @Override // com.facetec.sdk.ns
        public final ny a() {
            return this.f42422c;
        }

        @Override // com.facetec.sdk.ns
        public final void c(nb nbVar, long j10) throws IOException {
            if (this.f42423d) {
                throw new IllegalStateException("closed");
            }
            kz.a(nbVar.b(), j10);
            if (j10 <= this.f42421b) {
                ma.this.f42410a.c(nbVar, j10);
                this.f42421b -= j10;
            } else {
                StringBuilder sb2 = new StringBuilder("expected ");
                sb2.append(this.f42421b);
                sb2.append(" bytes but received ");
                sb2.append(j10);
                throw new ProtocolException(sb2.toString());
            }
        }

        @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42423d) {
                return;
            }
            this.f42423d = true;
            if (this.f42421b > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            ma.c(this.f42422c);
            ma.this.f42411b = 3;
        }

        @Override // com.facetec.sdk.ns, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f42423d) {
                return;
            }
            ma.this.f42410a.flush();
        }
    }

    public class c extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f42425d;

        public c(long j10) throws IOException {
            super(ma.this, (byte) 0);
            this.f42425d = j10;
            if (j10 == 0) {
                b(true, null);
            }
        }

        @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42432e) {
                return;
            }
            if (this.f42425d != 0 && !kz.c(this, TimeUnit.MILLISECONDS)) {
                b(false, null);
            }
            this.f42432e = true;
        }

        @Override // com.facetec.sdk.ma.e, com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
            }
            if (this.f42432e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f42425d;
            if (j11 == 0) {
                return -1L;
            }
            long jD = super.d(nbVar, Math.min(j11, j10));
            if (jD == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f42425d - jD;
            this.f42425d = j12;
            if (j12 == 0) {
                b(true, null);
            }
            return jD;
        }
    }

    public final class d implements ns {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nm f42426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42427c;

        public d() {
            this.f42426b = new nm(ma.this.f42410a.a());
        }

        @Override // com.facetec.sdk.ns
        public final ny a() {
            return this.f42426b;
        }

        @Override // com.facetec.sdk.ns
        public final void c(nb nbVar, long j10) throws IOException {
            if (this.f42427c) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            ma.this.f42410a.f(j10);
            ma.this.f42410a.e("\r\n");
            ma.this.f42410a.c(nbVar, j10);
            ma.this.f42410a.e("\r\n");
        }

        @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.f42427c) {
                return;
            }
            this.f42427c = true;
            ma.this.f42410a.e("0\r\n\r\n");
            ma.c(this.f42426b);
            ma.this.f42411b = 3;
        }

        @Override // com.facetec.sdk.ns, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.f42427c) {
                return;
            }
            ma.this.f42410a.flush();
        }
    }

    public class i extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42434c;

        public i() {
            super(ma.this, (byte) 0);
        }

        @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42432e) {
                return;
            }
            if (!this.f42434c) {
                b(false, null);
            }
            this.f42432e = true;
        }

        @Override // com.facetec.sdk.ma.e, com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
            }
            if (this.f42432e) {
                throw new IllegalStateException("closed");
            }
            if (this.f42434c) {
                return -1L;
            }
            long jD = super.d(nbVar, j10);
            if (jD != -1) {
                return jD;
            }
            this.f42434c = true;
            b(true, null);
            return -1L;
        }
    }

    public ma(kl klVar, lj ljVar, nh nhVar, ni niVar) {
        this.f42412c = klVar;
        this.f42413d = ljVar;
        this.f42414e = nhVar;
        this.f42410a = niVar;
    }

    private String d() throws IOException {
        String strC = this.f42414e.c(this.f42415g);
        this.f42415g -= (long) strC.length();
        return strC;
    }

    @Override // com.facetec.sdk.lr
    public final void a() throws IOException {
        this.f42410a.flush();
    }

    @Override // com.facetec.sdk.lr
    public final void b() throws IOException {
        this.f42410a.flush();
    }

    @Override // com.facetec.sdk.lr
    public final kq.d c(boolean z10) throws IOException {
        int i10 = this.f42411b;
        if (i10 != 1 && i10 != 3) {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f42411b);
            throw new IllegalStateException(sb2.toString());
        }
        try {
            ly lyVarE = ly.e(d());
            kq.d dVarE = new kq.d().e(lyVarE.f42368a).d(lyVarE.f42370e).d(lyVarE.f42369b).e(c());
            if (z10 && lyVarE.f42370e == 100) {
                return null;
            }
            if (lyVarE.f42370e == 100) {
                this.f42411b = 3;
                return dVarE;
            }
            this.f42411b = 4;
            return dVarE;
        } catch (EOFException e5) {
            StringBuilder sb3 = new StringBuilder("unexpected end of stream on ");
            sb3.append(this.f42413d);
            IOException iOException = new IOException(sb3.toString());
            iOException.initCause(e5);
            throw iOException;
        }
    }

    @Override // com.facetec.sdk.lr
    public final ns e(kr krVar, long j10) {
        if ("chunked".equalsIgnoreCase(krVar.d("Transfer-Encoding"))) {
            if (this.f42411b == 1) {
                this.f42411b = 2;
                return new d();
            }
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f42411b);
            throw new IllegalStateException(sb2.toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f42411b == 1) {
            this.f42411b = 2;
            return new b(j10);
        }
        StringBuilder sb3 = new StringBuilder("state: ");
        sb3.append(this.f42411b);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract class e implements nz {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f42429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private nm f42430c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected boolean f42432e;

        private e() {
            this.f42430c = new nm(ma.this.f42414e.a());
            this.f42429b = 0L;
        }

        @Override // com.facetec.sdk.nz
        public final ny a() {
            return this.f42430c;
        }

        public final void b(boolean z10, IOException iOException) throws IOException {
            int i10 = ma.this.f42411b;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                StringBuilder sb2 = new StringBuilder("state: ");
                sb2.append(ma.this.f42411b);
                throw new IllegalStateException(sb2.toString());
            }
            ma.c(this.f42430c);
            ma maVar = ma.this;
            maVar.f42411b = 6;
            lj ljVar = maVar.f42413d;
            if (ljVar != null) {
                ljVar.a(!z10, maVar, iOException);
            }
        }

        @Override // com.facetec.sdk.nz
        public long d(nb nbVar, long j10) throws IOException {
            try {
                long jD = ma.this.f42414e.d(nbVar, j10);
                if (jD > 0) {
                    this.f42429b += jD;
                }
                return jD;
            } catch (IOException e5) {
                b(false, e5);
                throw e5;
            }
        }

        public /* synthetic */ e(ma maVar, byte b10) {
            this();
        }
    }

    public final nz d(long j10) throws IOException {
        if (this.f42411b == 4) {
            this.f42411b = 5;
            return new c(j10);
        }
        StringBuilder sb2 = new StringBuilder("state: ");
        sb2.append(this.f42411b);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.facetec.sdk.lr
    public final void e() {
        lm lmVarE = this.f42413d.e();
        if (lmVarE != null) {
            lmVarE.c();
        }
    }

    @Override // com.facetec.sdk.lr
    public final void e(kr krVar) throws IOException {
        Proxy.Type type = this.f42413d.e().b().e().type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(krVar.c());
        sb2.append(' ');
        if (lu.a(krVar, type)) {
            sb2.append(krVar.a());
        } else {
            sb2.append(lu.d(krVar.a()));
        }
        sb2.append(" HTTP/1.1");
        e(krVar.d(), sb2.toString());
    }

    public final kj c() throws IOException {
        kj.d dVar = new kj.d();
        while (true) {
            String strD = d();
            if (strD.length() != 0) {
                kv.f42195e.d(dVar, strD);
            } else {
                return dVar.d();
            }
        }
    }

    public static void c(nm nmVar) {
        ny nyVar = nmVar.f42695c;
        ny nyVar2 = ny.f42733d;
        if (nyVar2 != null) {
            nmVar.f42695c = nyVar2;
            nyVar.d_();
            nyVar.f_();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.facetec.sdk.lr
    public final kt e(kq kqVar) throws IOException {
        lj ljVar = this.f42413d;
        kf kfVar = ljVar.f42303d;
        jw jwVar = ljVar.f42302c;
        String strD = kqVar.d(DigipassManagerConstants.KEY_CONTENT_TYPE);
        if (!lp.d(kqVar)) {
            return new lw(strD, 0L, no.c(d(0L)));
        }
        if ("chunked".equalsIgnoreCase(kqVar.d("Transfer-Encoding"))) {
            kk kkVarA = kqVar.b().a();
            if (this.f42411b == 4) {
                this.f42411b = 5;
                return new lw(strD, -1L, no.c(new a(kkVarA)));
            }
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f42411b);
            throw new IllegalStateException(sb2.toString());
        }
        long jC = lp.c(kqVar);
        if (jC != -1) {
            return new lw(strD, jC, no.c(d(jC)));
        }
        if (this.f42411b == 4) {
            lj ljVar2 = this.f42413d;
            if (ljVar2 != null) {
                this.f42411b = 5;
                ljVar2.d();
                return new lw(strD, -1L, no.c(new i()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb3 = new StringBuilder("state: ");
        sb3.append(this.f42411b);
        throw new IllegalStateException(sb3.toString());
    }

    public final void e(kj kjVar, String str) throws IOException {
        if (this.f42411b == 0) {
            this.f42410a.e(str).e("\r\n");
            int iA = kjVar.a();
            for (int i10 = 0; i10 < iA; i10++) {
                this.f42410a.e(kjVar.e(i10)).e(": ").e(kjVar.c(i10)).e("\r\n");
            }
            this.f42410a.e("\r\n");
            this.f42411b = 1;
            return;
        }
        StringBuilder sb2 = new StringBuilder("state: ");
        sb2.append(this.f42411b);
        throw new IllegalStateException(sb2.toString());
    }
}
