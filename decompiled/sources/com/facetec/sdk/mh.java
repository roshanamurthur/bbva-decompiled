package com.facetec.sdk;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class mh implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f42551b = Logger.getLogger(md.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb f42552a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ni f42553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f42554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42556f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private mc.d f42557i;

    public mh(ni niVar, boolean z10) {
        this.f42553c = niVar;
        this.f42555e = z10;
        nb nbVar = new nb();
        this.f42552a = nbVar;
        this.f42557i = new mc.d(nbVar);
        this.f42554d = 16384;
    }

    public final synchronized void a(int i10, long j10) throws IOException {
        if (this.f42556f) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw md.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
        e(i10, 4, (byte) 8, (byte) 0);
        this.f42553c.i((int) j10);
        this.f42553c.flush();
    }

    public final synchronized void b() throws IOException {
        try {
            if (this.f42556f) {
                throw new IOException("closed");
            }
            if (this.f42555e) {
                Logger logger = f42551b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(kz.e(">> CONNECTION %s", md.f42459a.d()));
                }
                this.f42553c.a(md.f42459a.f());
                this.f42553c.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    public final synchronized void c(boolean z10, int i10, List<mg> list) throws IOException {
        int length;
        int length2;
        try {
            boolean z11 = this.f42556f;
            if (z11) {
                throw new IOException("closed");
            }
            if (z11) {
                throw new IOException("closed");
            }
            mc.d dVar = this.f42557i;
            if (dVar.f42450b) {
                int i11 = dVar.f42449a;
                if (i11 < dVar.f42453e) {
                    dVar.b(i11, 31, 32);
                }
                dVar.f42450b = false;
                dVar.f42449a = Integer.MAX_VALUE;
                dVar.b(dVar.f42453e, 31, 32);
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                mg mgVar = list.get(i12);
                nj njVarJ = mgVar.f42550j.j();
                nj njVar = mgVar.f42549g;
                Integer num = mc.f42435c.get(njVarJ);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        mg[] mgVarArr = mc.f42436e;
                        if (kz.d(mgVarArr[iIntValue].f42549g, njVar)) {
                            length = length2;
                        } else if (kz.d(mgVarArr[length2].f42549g, njVar)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = dVar.f42455g.length;
                    for (int i13 = dVar.f42454f + 1; i13 < length3; i13++) {
                        if (kz.d(dVar.f42455g[i13].f42550j, njVarJ)) {
                            if (kz.d(dVar.f42455g[i13].f42549g, njVar)) {
                                length2 = (i13 - dVar.f42454f) + mc.f42436e.length;
                                break;
                            } else if (length == -1) {
                                length = (i13 - dVar.f42454f) + mc.f42436e.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    dVar.b(length2, 127, 128);
                } else if (length == -1) {
                    dVar.f42451c.h(64);
                    dVar.d(njVarJ);
                    dVar.d(njVar);
                    dVar.e(mgVar);
                } else if (!njVarJ.d(mg.f42545d) || mg.f42547h.equals(njVarJ)) {
                    dVar.b(length, 63, 64);
                    dVar.d(njVar);
                    dVar.e(mgVar);
                } else {
                    dVar.b(length, 15, 0);
                    dVar.d(njVar);
                }
            }
            long jB = this.f42552a.b();
            int iMin = (int) Math.min(this.f42554d, jB);
            long j10 = iMin;
            byte b10 = jB == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            e(i10, iMin, (byte) 1, b10);
            this.f42553c.c(this.f42552a, j10);
            if (jB > j10) {
                long j11 = jB - j10;
                while (j11 > 0) {
                    int iMin2 = (int) Math.min(this.f42554d, j11);
                    long j12 = iMin2;
                    j11 -= j12;
                    e(i10, iMin2, (byte) 9, j11 == 0 ? (byte) 4 : (byte) 0);
                    this.f42553c.c(this.f42552a, j12);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f42556f = true;
        this.f42553c.close();
    }

    public final synchronized void e() throws IOException {
        if (this.f42556f) {
            throw new IOException("closed");
        }
        this.f42553c.flush();
    }

    public final synchronized void e(boolean z10, int i10, nb nbVar, int i11) throws IOException {
        if (!this.f42556f) {
            e(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
            if (i11 > 0) {
                this.f42553c.c(nbVar, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private static void a(ni niVar, int i10) throws IOException {
        niVar.h((i10 >>> 16) & 255);
        niVar.h((i10 >>> 8) & 255);
        niVar.h(i10 & 255);
    }

    public final synchronized void b(mn mnVar) throws IOException {
        try {
            if (!this.f42556f) {
                int i10 = this.f42554d;
                if ((mnVar.f42605c & 32) != 0) {
                    i10 = mnVar.f42604b[5];
                }
                this.f42554d = i10;
                if (mnVar.b() != -1) {
                    mc.d dVar = this.f42557i;
                    int iB = mnVar.b();
                    dVar.f42452d = iB;
                    int iMin = Math.min(iB, 16384);
                    int i11 = dVar.f42453e;
                    if (i11 != iMin) {
                        if (iMin < i11) {
                            dVar.f42449a = Math.min(dVar.f42449a, iMin);
                        }
                        dVar.f42450b = true;
                        dVar.f42453e = iMin;
                        int i12 = dVar.f42456h;
                        if (iMin < i12) {
                            if (iMin == 0) {
                                dVar.c();
                            } else {
                                dVar.c(i12 - iMin);
                            }
                        }
                    }
                }
                e(0, 0, (byte) 4, (byte) 1);
                this.f42553c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(mn mnVar) throws IOException {
        int i10;
        try {
            if (!this.f42556f) {
                int i11 = 0;
                e(0, Integer.bitCount(mnVar.f42605c) * 6, (byte) 4, (byte) 0);
                while (i11 < 10) {
                    if (mnVar.b(i11)) {
                        if (i11 == 4) {
                            i10 = 3;
                        } else {
                            i10 = i11 == 7 ? 4 : i11;
                        }
                        this.f42553c.j(i10);
                        this.f42553c.i(mnVar.d(i11));
                    }
                    i11++;
                }
                this.f42553c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void e(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f42551b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(md.e(false, i10, i11, b10, b11));
        }
        int i12 = this.f42554d;
        if (i11 > i12) {
            throw md.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw md.d("reserved bit set: %s", Integer.valueOf(i10));
        }
        a(this.f42553c, i11);
        this.f42553c.h(b10 & 255);
        this.f42553c.h(b11 & 255);
        this.f42553c.i(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void b(int i10, lz lzVar) throws IOException {
        if (!this.f42556f) {
            if (lzVar.f42382j != -1) {
                e(i10, 4, (byte) 3, (byte) 0);
                this.f42553c.i(lzVar.f42382j);
                this.f42553c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(int i10, lz lzVar, byte[] bArr) throws IOException {
        try {
            if (!this.f42556f) {
                if (lzVar.f42382j != -1) {
                    e(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f42553c.i(i10);
                    this.f42553c.i(lzVar.f42382j);
                    if (bArr.length > 0) {
                        this.f42553c.a(bArr);
                    }
                    this.f42553c.flush();
                } else {
                    throw md.d("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(boolean z10, int i10, int i11) throws IOException {
        if (!this.f42556f) {
            e(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f42553c.i(i10);
            this.f42553c.i(i11);
            this.f42553c.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
