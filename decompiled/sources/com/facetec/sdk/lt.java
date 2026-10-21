package com.facetec.sdk;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class lt implements km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile lj f42360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kl f42362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f42363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f42364e;

    public lt(kl klVar, boolean z10) {
        this.f42362c = klVar;
        this.f42361b = z10;
    }

    private static boolean a(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private jr d(kk kkVar) {
        SSLSocketFactory sSLSocketFactoryI;
        HostnameVerifier hostnameVerifierJ;
        jv jvVarH;
        if (kkVar.a()) {
            sSLSocketFactoryI = this.f42362c.i();
            hostnameVerifierJ = this.f42362c.j();
            jvVarH = this.f42362c.h();
        } else {
            sSLSocketFactoryI = null;
            hostnameVerifierJ = null;
            jvVarH = null;
        }
        return new jr(kkVar.i(), kkVar.j(), this.f42362c.e(), this.f42362c.d(), sSLSocketFactoryI, hostnameVerifierJ, jvVarH, this.f42362c.f(), this.f42362c.c(), this.f42362c.o(), this.f42362c.p(), this.f42362c.b());
    }

    public final boolean b() {
        return this.f42363d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: IOException -> 0x00ad, TryCatch #0 {IOException -> 0x00ad, blocks: (B:12:0x0059, B:14:0x005d, B:62:0x0114, B:64:0x011c, B:66:0x0124, B:68:0x0132, B:71:0x013a, B:73:0x0150, B:75:0x0158, B:77:0x0166, B:79:0x0170, B:85:0x0185, B:81:0x0176, B:83:0x0180, B:86:0x0194, B:88:0x019a, B:89:0x019f, B:29:0x0088, B:31:0x0090, B:33:0x009c, B:35:0x00a2, B:40:0x00b0, B:42:0x00b6, B:44:0x00bd, B:46:0x00c9, B:47:0x00d4, B:48:0x00db, B:49:0x00dc, B:51:0x00e2, B:53:0x00ec, B:55:0x00f5, B:57:0x00fd, B:58:0x0106, B:60:0x010c, B:110:0x0232, B:111:0x0237), top: B:131:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132 A[Catch: IOException -> 0x00ad, TryCatch #0 {IOException -> 0x00ad, blocks: (B:12:0x0059, B:14:0x005d, B:62:0x0114, B:64:0x011c, B:66:0x0124, B:68:0x0132, B:71:0x013a, B:73:0x0150, B:75:0x0158, B:77:0x0166, B:79:0x0170, B:85:0x0185, B:81:0x0176, B:83:0x0180, B:86:0x0194, B:88:0x019a, B:89:0x019f, B:29:0x0088, B:31:0x0090, B:33:0x009c, B:35:0x00a2, B:40:0x00b0, B:42:0x00b6, B:44:0x00bd, B:46:0x00c9, B:47:0x00d4, B:48:0x00db, B:49:0x00dc, B:51:0x00e2, B:53:0x00ec, B:55:0x00f5, B:57:0x00fd, B:58:0x0106, B:60:0x010c, B:110:0x0232, B:111:0x0237), top: B:131:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
    @Override // com.facetec.sdk.km
    public final kq c(km.e eVar) throws IOException {
        kr krVar;
        int i10;
        kr krVarE;
        String strD;
        kk.e eVarD;
        kk kkVarC;
        kr krVarD = eVar.d();
        ls lsVar = (ls) eVar;
        jw jwVarH = lsVar.h();
        kf kfVarJ = lsVar.j();
        lj ljVar = new lj(this.f42362c.g(), d(krVarD.a()), jwVarH, kfVarJ, this.f42364e);
        this.f42360a = ljVar;
        int i11 = 0;
        kq kqVar = null;
        while (!this.f42363d) {
            try {
                try {
                    try {
                        kq kqVarC = lsVar.c(krVarD, ljVar, null, null);
                        if (kqVar != null) {
                            kq.d dVarJ = kqVarC.j();
                            kq kqVarC2 = kqVar.j().c(null).c();
                            if (kqVarC2.f42134i != null) {
                                throw new IllegalArgumentException("priorResponse.body != null");
                            }
                            dVarJ.f42146i = kqVarC2;
                            kqVarC = dVarJ.c();
                        }
                        try {
                            kx kxVar = ljVar.f42304e;
                            if (kqVarC == null) {
                                throw new IllegalStateException();
                            }
                            int iE = kqVarC.e();
                            String strC = kqVarC.b().c();
                            if (iE == 307 || iE == 308) {
                                if (strC.equals("GET") || strC.equals("HEAD")) {
                                    if (this.f42362c.l() && (strD = kqVarC.d("Location")) != null) {
                                        eVarD = kqVarC.b().a().d(strD);
                                        if (eVarD != null) {
                                            kkVarC = eVarD.c();
                                        } else {
                                            kkVarC = null;
                                        }
                                        if (kkVarC == null && (kkVarC.b().equals(kqVarC.b().a().b()) || this.f42362c.n())) {
                                            kr.a aVarB = kqVarC.b().b();
                                            if (lv.d(strC)) {
                                                boolean zE = lv.e(strC);
                                                if (lv.a(strC)) {
                                                    aVarB.b("GET", (kp) null);
                                                } else {
                                                    aVarB.b(strC, zE ? kqVarC.b().e() : null);
                                                }
                                                if (!zE) {
                                                    aVarB.c("Transfer-Encoding");
                                                    aVarB.c("Content-Length");
                                                    aVarB.c(DigipassManagerConstants.KEY_CONTENT_TYPE);
                                                }
                                            }
                                            if (!c(kqVarC, kkVarC)) {
                                                aVarB.c("Authorization");
                                            }
                                            krVarE = aVarB.e(kkVarC).e();
                                            krVar = krVarE;
                                        }
                                        if (krVar == null) {
                                            ljVar.a();
                                            return kqVarC;
                                        }
                                        kz.a(kqVarC.a());
                                        i10 = i11 + 1;
                                        if (i10 <= 20) {
                                            ljVar.a();
                                            throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i10)));
                                        }
                                        if (!(krVar.e() instanceof mb)) {
                                            ljVar.a();
                                            throw new HttpRetryException("Cannot retry streamed HTTP body", kqVarC.e());
                                        }
                                        if (!c(kqVarC, krVar.a())) {
                                            ljVar.a();
                                            ljVar = new lj(this.f42362c.g(), d(krVar.a()), jwVarH, kfVarJ, this.f42364e);
                                            this.f42360a = ljVar;
                                        } else if (ljVar.b() != null) {
                                            StringBuilder sb2 = new StringBuilder("Closing the body of ");
                                            sb2.append(kqVarC);
                                            sb2.append(" didn't close its backing stream. Bad interceptor?");
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                        kqVar = kqVarC;
                                        krVarD = krVar;
                                        i11 = i10;
                                    }
                                }
                                krVar = null;
                                if (krVar == null) {
                                    ljVar.a();
                                    return kqVarC;
                                }
                                kz.a(kqVarC.a());
                                i10 = i11 + 1;
                                if (i10 <= 20) {
                                    ljVar.a();
                                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i10)));
                                }
                                if (!(krVar.e() instanceof mb)) {
                                    ljVar.a();
                                    throw new HttpRetryException("Cannot retry streamed HTTP body", kqVarC.e());
                                }
                                if (!c(kqVarC, krVar.a())) {
                                    ljVar.a();
                                    ljVar = new lj(this.f42362c.g(), d(krVar.a()), jwVarH, kfVarJ, this.f42364e);
                                    this.f42360a = ljVar;
                                } else if (ljVar.b() != null) {
                                    StringBuilder sb3 = new StringBuilder("Closing the body of ");
                                    sb3.append(kqVarC);
                                    sb3.append(" didn't close its backing stream. Bad interceptor?");
                                    throw new IllegalStateException(sb3.toString());
                                }
                                kqVar = kqVarC;
                                krVarD = krVar;
                                i11 = i10;
                            } else {
                                if (iE != 401) {
                                    if (iE != 503) {
                                        if (iE != 407) {
                                            if (iE != 408) {
                                                switch (iE) {
                                                    case 300:
                                                    case 301:
                                                    case 302:
                                                    case 303:
                                                        if (this.f42362c.l()) {
                                                            eVarD = kqVarC.b().a().d(strD);
                                                            if (eVarD != null) {
                                                                kkVarC = eVarD.c();
                                                            } else {
                                                                kkVarC = null;
                                                            }
                                                            if (kkVarC == null) {
                                                            }
                                                            break;
                                                        }
                                                    default:
                                                        krVar = null;
                                                        break;
                                                }
                                            } else if (this.f42362c.k() && !(kqVarC.b().e() instanceof mb) && (kqVarC.f() == null || kqVarC.f().e() != 408)) {
                                                if (d(kqVarC, 0) <= 0) {
                                                    krVarE = kqVarC.b();
                                                }
                                            }
                                            krVar = null;
                                        } else {
                                            if (kxVar.e().type() != Proxy.Type.HTTP) {
                                                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                            }
                                            krVarE = this.f42362c.f().c();
                                        }
                                    } else if ((kqVarC.f() == null || kqVarC.f().e() != 503) && d(kqVarC, Integer.MAX_VALUE) == 0) {
                                        krVarE = kqVarC.b();
                                    } else {
                                        krVar = null;
                                    }
                                    if (krVar == null) {
                                        ljVar.a();
                                        return kqVarC;
                                    }
                                    kz.a(kqVarC.a());
                                    i10 = i11 + 1;
                                    if (i10 <= 20) {
                                        ljVar.a();
                                        throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i10)));
                                    }
                                    if (!(krVar.e() instanceof mb)) {
                                        ljVar.a();
                                        throw new HttpRetryException("Cannot retry streamed HTTP body", kqVarC.e());
                                    }
                                    if (!c(kqVarC, krVar.a())) {
                                        ljVar.a();
                                        ljVar = new lj(this.f42362c.g(), d(krVar.a()), jwVarH, kfVarJ, this.f42364e);
                                        this.f42360a = ljVar;
                                    } else if (ljVar.b() != null) {
                                        StringBuilder sb4 = new StringBuilder("Closing the body of ");
                                        sb4.append(kqVarC);
                                        sb4.append(" didn't close its backing stream. Bad interceptor?");
                                        throw new IllegalStateException(sb4.toString());
                                    }
                                    kqVar = kqVarC;
                                    krVarD = krVar;
                                    i11 = i10;
                                } else {
                                    krVarE = this.f42362c.f42064g.c();
                                }
                                krVar = krVarE;
                                if (krVar == null) {
                                    ljVar.a();
                                    return kqVarC;
                                }
                                kz.a(kqVarC.a());
                                i10 = i11 + 1;
                                if (i10 <= 20) {
                                    ljVar.a();
                                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i10)));
                                }
                                if (!(krVar.e() instanceof mb)) {
                                    ljVar.a();
                                    throw new HttpRetryException("Cannot retry streamed HTTP body", kqVarC.e());
                                }
                                if (!c(kqVarC, krVar.a())) {
                                    ljVar.a();
                                    ljVar = new lj(this.f42362c.g(), d(krVar.a()), jwVarH, kfVarJ, this.f42364e);
                                    this.f42360a = ljVar;
                                } else if (ljVar.b() != null) {
                                    StringBuilder sb5 = new StringBuilder("Closing the body of ");
                                    sb5.append(kqVarC);
                                    sb5.append(" didn't close its backing stream. Bad interceptor?");
                                    throw new IllegalStateException(sb5.toString());
                                }
                                kqVar = kqVarC;
                                krVarD = krVar;
                                i11 = i10;
                            }
                        } catch (IOException e5) {
                            ljVar.a();
                            throw e5;
                        }
                    } catch (IOException e7) {
                        if (!c(e7, ljVar, !(e7 instanceof lx), krVarD)) {
                            throw e7;
                        }
                    }
                } catch (li e10) {
                    if (!c(e10.f42297e, ljVar, false, krVarD)) {
                        throw e10.f42296b;
                    }
                }
            } catch (Throwable th2) {
                ljVar.a((IOException) null);
                ljVar.a();
                throw th2;
            }
        }
        ljVar.a();
        throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
    }

    private static int d(kq kqVar, int i10) {
        String strD = kqVar.d("Retry-After");
        if (strD == null) {
            return i10;
        }
        if (strD.matches("\\d+")) {
            return Integer.valueOf(strD).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean c(IOException iOException, lj ljVar, boolean z10, kr krVar) {
        ljVar.a(iOException);
        if (this.f42362c.k()) {
            return !(z10 && c(iOException, krVar)) && a(iOException, z10) && ljVar.c();
        }
        return false;
    }

    private static boolean c(IOException iOException, kr krVar) {
        return (krVar.e() instanceof mb) || (iOException instanceof FileNotFoundException);
    }

    private static boolean c(kq kqVar, kk kkVar) {
        kk kkVarA = kqVar.b().a();
        return kkVarA.i().equals(kkVar.i()) && kkVarA.j() == kkVar.j() && kkVarA.b().equals(kkVar.b());
    }
}
