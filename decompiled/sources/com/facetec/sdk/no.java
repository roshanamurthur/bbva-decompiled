package com.facetec.sdk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class no {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Logger f42700c = Logger.getLogger(no.class.getName());

    private no() {
    }

    public static nz a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        nd ndVarC = c(socket);
        return new nz() { // from class: com.facetec.sdk.nd.1

            /* JADX INFO: renamed from: a */
            private /* synthetic */ nz f42676a;

            public AnonymousClass1() {
                nzVar = nzVar;
            }

            @Override // com.facetec.sdk.nz
            public final ny a() {
                return nd.this;
            }

            @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                try {
                    try {
                        nzVar.close();
                        nd.this.a(true);
                    } catch (IOException e5) {
                        throw nd.this.e(e5);
                    }
                } catch (Throwable th2) {
                    nd.this.a(false);
                    throw th2;
                }
            }

            @Override // com.facetec.sdk.nz
            public final long d(nb nbVar, long j10) throws IOException {
                nd.this.d();
                try {
                    try {
                        long jD = nzVar.d(nbVar, j10);
                        nd.this.a(true);
                        return jD;
                    } catch (IOException e5) {
                        throw nd.this.e(e5);
                    }
                } catch (Throwable th2) {
                    nd.this.a(false);
                    throw th2;
                }
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AsyncTimeout.source(");
                sb2.append(nzVar);
                sb2.append(")");
                return sb2.toString();
            }
        };
    }

    public static nz b(InputStream inputStream) {
        return b(inputStream, new ny());
    }

    public static nh c(nz nzVar) {
        return new nq(nzVar);
    }

    public static ns e(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        final nd ndVarC = c(socket);
        final OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new ns() { // from class: com.facetec.sdk.nd.2

                /* JADX INFO: renamed from: e */
                private /* synthetic */ ns f42679e;

                public AnonymousClass2() {
                    nsVar = nsVar;
                }

                @Override // com.facetec.sdk.ns
                public final ny a() {
                    return nd.this;
                }

                @Override // com.facetec.sdk.ns
                public final void c(nb nbVar, long j10) throws IOException {
                    nv.a(nbVar.f42665b, 0L, j10);
                    while (true) {
                        long j11 = 0;
                        if (j10 <= 0) {
                            return;
                        }
                        nt ntVar = nbVar.f42664a;
                        while (j11 < SvgConstantsKt.SPECIFIED_FONT_STYLE) {
                            j11 += (long) (ntVar.f42722d - ntVar.f42719a);
                            if (j11 >= j10) {
                                j11 = j10;
                                break;
                            }
                            ntVar = ntVar.f42725g;
                        }
                        nd.this.d();
                        try {
                            try {
                                nsVar.c(nbVar, j11);
                                j10 -= j11;
                                nd.this.a(true);
                            } catch (IOException e5) {
                                throw nd.this.e(e5);
                            }
                        } catch (Throwable th2) {
                            nd.this.a(false);
                            throw th2;
                        }
                    }
                }

                @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    nd.this.d();
                    try {
                        try {
                            nsVar.close();
                            nd.this.a(true);
                        } catch (IOException e5) {
                            throw nd.this.e(e5);
                        }
                    } catch (Throwable th2) {
                        nd.this.a(false);
                        throw th2;
                    }
                }

                @Override // com.facetec.sdk.ns, java.io.Flushable
                public final void flush() throws IOException {
                    nd.this.d();
                    try {
                        try {
                            nsVar.flush();
                            nd.this.a(true);
                        } catch (IOException e5) {
                            throw nd.this.e(e5);
                        }
                    } catch (Throwable th2) {
                        nd.this.a(false);
                        throw th2;
                    }
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("AsyncTimeout.sink(");
                    sb2.append(nsVar);
                    sb2.append(")");
                    return sb2.toString();
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    private static nz b(final InputStream inputStream, final ny nyVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (nyVar != null) {
            return new nz() { // from class: com.facetec.sdk.no.2
                @Override // com.facetec.sdk.nz
                public final ny a() {
                    return nyVar;
                }

                @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    inputStream.close();
                }

                @Override // com.facetec.sdk.nz
                public final long d(nb nbVar, long j10) throws Throwable {
                    if (j10 < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
                    }
                    if (j10 == 0) {
                        return 0L;
                    }
                    try {
                        nyVar.e_();
                        nt ntVarB = nbVar.b(1);
                        int i10 = inputStream.read(ntVarB.f42721c, ntVarB.f42722d, (int) Math.min(j10, 8192 - ntVarB.f42722d));
                        if (i10 == -1) {
                            return -1L;
                        }
                        ntVarB.f42722d += i10;
                        long j11 = i10;
                        nbVar.f42665b += j11;
                        return j11;
                    } catch (AssertionError e5) {
                        if (no.b(e5)) {
                            throw new IOException(e5);
                        }
                        throw e5;
                    }
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("source(");
                    sb2.append(inputStream);
                    sb2.append(")");
                    return sb2.toString();
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static ni c(ns nsVar) {
        return new nl(nsVar);
    }

    private static nd c(final Socket socket) {
        return new nd() { // from class: com.facetec.sdk.no.4
            @Override // com.facetec.sdk.nd
            public final IOException d(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.facetec.sdk.nd
            public final void e() {
                try {
                    socket.close();
                } catch (AssertionError e5) {
                    if (!no.b(e5)) {
                        throw e5;
                    }
                    Logger logger = no.f42700c;
                    Level level = Level.WARNING;
                    StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                    sb2.append(socket);
                    logger.log(level, sb2.toString(), (Throwable) e5);
                } catch (Exception e7) {
                    Logger logger2 = no.f42700c;
                    Level level2 = Level.WARNING;
                    StringBuilder sb3 = new StringBuilder("Failed to close timed out socket ");
                    sb3.append(socket);
                    logger2.log(level2, sb3.toString(), (Throwable) e7);
                }
            }
        };
    }

    public static boolean b(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
