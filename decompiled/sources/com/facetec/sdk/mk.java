package com.facetec.sdk;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UShort;

/* JADX INFO: loaded from: classes9.dex */
final class mk implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Logger f42566e = Logger.getLogger(md.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f42567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final nh f42568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f42569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mc.a f42570d;

    public interface b {
        void a(int i10, lz lzVar);

        void b(int i10, List<mg> list) throws IOException;

        void b(boolean z10, int i10, nh nhVar, int i11) throws IOException;

        void c(mn mnVar);

        void c(boolean z10, int i10, int i11);

        void c(boolean z10, int i10, List<mg> list);

        void d(int i10, nj njVar);

        void e(int i10, long j10);
    }

    public mk(nh nhVar, boolean z10) {
        this.f42568b = nhVar;
        this.f42569c = z10;
        d dVar = new d(nhVar);
        this.f42567a = dVar;
        this.f42570d = new mc.a(dVar, (byte) 0);
    }

    private List<mg> b(int i10, short s4, byte b10, int i11) throws Throwable {
        d dVar = this.f42567a;
        dVar.f42575e = i10;
        dVar.f42572b = i10;
        dVar.f42574d = s4;
        dVar.f42573c = b10;
        dVar.f42571a = i11;
        this.f42570d.c();
        return this.f42570d.d();
    }

    private static int d(int i10, byte b10, short s4) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s4 <= i10) {
            return (short) (i10 - s4);
        }
        throw md.e("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s4), Integer.valueOf(i10));
    }

    public static int e(nh nhVar) throws IOException {
        return (nhVar.f() & 255) | ((nhVar.f() & 255) << 16) | ((nhVar.f() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z10, b bVar) throws IOException {
        try {
            this.f42568b.b(9L);
            int iE = e(this.f42568b);
            if (iE < 0 || iE > 16384) {
                throw md.e("FRAME_SIZE_ERROR: %s", Integer.valueOf(iE));
            }
            byte bF = this.f42568b.f();
            if (z10 && bF != 4) {
                throw md.e("Expected a SETTINGS frame but was %s", Byte.valueOf(bF));
            }
            byte bF2 = this.f42568b.f();
            int iH = this.f42568b.h() & Integer.MAX_VALUE;
            Logger logger = f42566e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(md.e(true, iH, iE, bF, bF2));
            }
            switch (bF) {
                case 0:
                    if (iH == 0) {
                        throw md.e("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                    }
                    boolean z11 = (bF2 & 1) != 0;
                    if ((bF2 & 32) != 0) {
                        throw md.e("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    short sF = (bF2 & 8) != 0 ? (short) (this.f42568b.f() & 255) : (short) 0;
                    bVar.b(z11, iH, this.f42568b, d(iE, bF2, sF));
                    this.f42568b.j(sF);
                    return true;
                case 1:
                    if (iH == 0) {
                        throw md.e("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z12 = (bF2 & 1) != 0;
                    short sF2 = (bF2 & 8) != 0 ? (short) (this.f42568b.f() & 255) : (short) 0;
                    if ((bF2 & 32) != 0) {
                        a();
                        iE -= 5;
                    }
                    bVar.c(z12, iH, b(d(iE, bF2, sF2), sF2, bF2, iH));
                    return true;
                case 2:
                    if (iE != 5) {
                        throw md.e("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iE));
                    }
                    if (iH == 0) {
                        throw md.e("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    a();
                    return true;
                case 3:
                    if (iE != 4) {
                        throw md.e("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iE));
                    }
                    if (iH == 0) {
                        throw md.e("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iH2 = this.f42568b.h();
                    lz lzVarE = lz.e(iH2);
                    if (lzVarE == null) {
                        throw md.e("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iH2));
                    }
                    bVar.a(iH, lzVarE);
                    return true;
                case 4:
                    if (iH != 0) {
                        throw md.e("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bF2 & 1) == 0) {
                        if (iE % 6 != 0) {
                            throw md.e("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iE));
                        }
                        mn mnVar = new mn();
                        for (int i10 = 0; i10 < iE; i10 += 6) {
                            int iJ = this.f42568b.j() & UShort.MAX_VALUE;
                            int iH3 = this.f42568b.h();
                            if (iJ == 2) {
                                if (iH3 != 0 && iH3 != 1) {
                                    throw md.e("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                            } else if (iJ == 3) {
                                iJ = 4;
                            } else if (iJ != 4) {
                                if (iJ == 5 && (iH3 < 16384 || iH3 > 16777215)) {
                                    throw md.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iH3));
                                }
                            } else {
                                if (iH3 < 0) {
                                    throw md.e("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                }
                                iJ = 7;
                            }
                            mnVar.c(iJ, iH3);
                        }
                        bVar.c(mnVar);
                    } else if (iE != 0) {
                        throw md.e("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iH == 0) {
                        throw md.e("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sF3 = (bF2 & 8) != 0 ? (short) (this.f42568b.f() & 255) : (short) 0;
                    bVar.b(this.f42568b.h() & Integer.MAX_VALUE, b(d(iE - 4, bF2, sF3), sF3, bF2, iH));
                    return true;
                case 6:
                    if (iE != 8) {
                        throw md.e("TYPE_PING length != 8: %s", Integer.valueOf(iE));
                    }
                    if (iH != 0) {
                        throw md.e("TYPE_PING streamId != 0", new Object[0]);
                    }
                    bVar.c((bF2 & 1) != 0, this.f42568b.h(), this.f42568b.h());
                    return true;
                case 7:
                    if (iE < 8) {
                        throw md.e("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iE));
                    }
                    if (iH != 0) {
                        throw md.e("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int iH4 = this.f42568b.h();
                    int iH5 = this.f42568b.h();
                    int i11 = iE - 8;
                    if (lz.e(iH5) == null) {
                        throw md.e("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iH5));
                    }
                    nj njVarA = nj.f42686e;
                    if (i11 > 0) {
                        njVarA = this.f42568b.a(i11);
                    }
                    bVar.d(iH4, njVarA);
                    return true;
                case 8:
                    if (iE != 4) {
                        throw md.e("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iE));
                    }
                    long jH = ((long) this.f42568b.h()) & 2147483647L;
                    if (jH == 0) {
                        throw md.e("windowSizeIncrement was 0", Long.valueOf(jH));
                    }
                    bVar.e(iH, jH);
                    return true;
                default:
                    this.f42568b.j(iE);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42568b.close();
    }

    public static final class d implements nz {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f42573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        short f42574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final nh f42576f;

        public d(nh nhVar) {
            this.f42576f = nhVar;
        }

        @Override // com.facetec.sdk.nz
        public final ny a() {
            return this.f42576f.a();
        }

        @Override // com.facetec.sdk.nz
        public final long d(nb nbVar, long j10) throws IOException {
            int i10;
            int iH;
            do {
                int i11 = this.f42575e;
                if (i11 != 0) {
                    long jD = this.f42576f.d(nbVar, Math.min(j10, i11));
                    if (jD == -1) {
                        return -1L;
                    }
                    this.f42575e = (int) (((long) this.f42575e) - jD);
                    return jD;
                }
                this.f42576f.j(this.f42574d);
                this.f42574d = (short) 0;
                if ((this.f42573c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f42571a;
                int iE = mk.e(this.f42576f);
                this.f42575e = iE;
                this.f42572b = iE;
                byte bF = this.f42576f.f();
                this.f42573c = this.f42576f.f();
                Logger logger = mk.f42566e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(md.e(true, this.f42571a, this.f42572b, bF, this.f42573c));
                }
                iH = this.f42576f.h() & Integer.MAX_VALUE;
                this.f42571a = iH;
                if (bF != 9) {
                    throw md.e("%s != TYPE_CONTINUATION", Byte.valueOf(bF));
                }
            } while (iH == i10);
            throw md.e("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }

    private void a() throws IOException {
        this.f42568b.h();
        this.f42568b.f();
    }
}
