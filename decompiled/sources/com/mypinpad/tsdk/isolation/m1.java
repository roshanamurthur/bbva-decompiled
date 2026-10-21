package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class m1 extends j1 implements apb {
    public static int K0 = 0;
    public static int L0 = 1;
    public X500Principal E0;
    public PublicKey F0;
    public X500Principal G0;
    public long[] H0;
    public volatile boolean I0;
    public volatile int J0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f57032x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public k1 f57033y0;

    public static class a extends CertificateEncodingException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f57034p0;

        public a(IOException iOException) {
            this.f57034p0 = iOException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((a) objArr[0]).f57034p0;
        }
    }

    public m1(aow aowVar, aiy aiyVar) throws CertificateParsingException {
        super(aowVar, aiyVar, (aiu) h(new Object[]{aiyVar}, 706590972, -706590971, (int) System.currentTimeMillis()), (boolean[]) h(new Object[]{aiyVar}, -1763565276, 1763565282, (int) System.currentTimeMillis()), (String) h(new Object[]{aiyVar}, 1437539928, -1437539917, (int) System.currentTimeMillis()), (byte[]) h(new Object[]{aiyVar}, -764780826, 764780834, (int) System.currentTimeMillis()));
        this.f57032x0 = new Object();
        new aod();
    }

    public static /* synthetic */ k1 e(Object[] objArr) {
        byte[] bArr;
        a aVar;
        k1 k1Var;
        m1 m1Var = (m1) objArr[0];
        synchronized (m1Var.f57032x0) {
            k1 k1Var2 = m1Var.f57033y0;
            if (k1Var2 != null) {
                return k1Var2;
            }
            try {
                aiy aiyVar = m1Var.f56582q0;
                bArr = (byte[]) adw.setOnLongClickListener(new Object[]{aiyVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(aiyVar));
                aVar = null;
            } catch (IOException e5) {
                bArr = null;
                aVar = new a(e5);
            }
            k1 k1Var3 = new k1(m1Var.f56581p0, m1Var.f56582q0, m1Var.f56583r0, m1Var.f56584s0, m1Var.f56585t0, m1Var.f56586u0, bArr, aVar);
            synchronized (m1Var.f57032x0) {
                try {
                    if (m1Var.f57033y0 == null) {
                        m1Var.f57033y0 = k1Var3;
                    }
                    k1Var = m1Var.f57033y0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k1Var;
        }
    }

    public static /* synthetic */ X500Principal f(Object[] objArr) {
        X500Principal x500Principal;
        m1 m1Var = (m1) objArr[0];
        synchronized (m1Var.f57032x0) {
            X500Principal x500Principal2 = m1Var.E0;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (m1Var.f57032x0) {
                try {
                    if (m1Var.E0 == null) {
                        m1Var.E0 = issuerX500Principal;
                    }
                    x500Principal = m1Var.E0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return x500Principal;
        }
    }

    public static /* synthetic */ PublicKey g(Object[] objArr) {
        PublicKey publicKey;
        m1 m1Var = (m1) objArr[0];
        synchronized (m1Var.f57032x0) {
            PublicKey publicKey2 = m1Var.F0;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (m1Var.f57032x0) {
                try {
                    if (m1Var.F0 == null) {
                        m1Var.F0 = publicKey3;
                    }
                    publicKey = m1Var.F0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return publicKey;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0516  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0602, code lost:
    
        if (r10 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x060d, code lost:
    
        if (r10 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x060f, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.m1.K0 + 69;
        com.mypinpad.tsdk.isolation.m1.L0 = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0618, code lost:
    
        if ((r10 % 2) != 0) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x061a, code lost:
    
        r1 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x061c, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.aiu) com.mypinpad.tsdk.isolation.aiu.setOnFocusChangeListener(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.ady) com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(new java.lang.Object[]{r10}, -1692126728, 1692126730, (int) java.lang.System.currentTimeMillis())}, -1955515662, 1955515666, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0647, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.m1.K0;
        r11 = (r10 & (-84)) | ((~r10) & 83);
        r10 = -(-((r10 & 83) << 1));
        r12 = (r11 & r10) + (r10 | r11);
        com.mypinpad.tsdk.isolation.m1.L0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x065d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027b, code lost:
    
        if (r3 <= r10[0]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028e, code lost:
    
        if (r3 <= r10[1]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0294, code lost:
    
        if (r3 < r10[0]) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0296, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.m1.L0;
        r11 = ((r10 ^ 107) | (r10 & 107)) << 1;
        r10 = -(((~r10) & 107) | (r10 & (-108)));
        r12 = (r11 & r10) + (r10 | r11);
        com.mypinpad.tsdk.isolation.m1.K0 = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02af, code lost:
    
        if ((r12 % 2) == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b1, code lost:
    
        r10 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b6, code lost:
    
        r13 = new java.lang.StringBuilder("certificate not valid till ");
        r11 = r11.f56582q0.setY();
        r13.append((java.lang.String) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r11}, 509972914, -509972911, java.lang.System.identityHashCode(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02dd, code lost:
    
        throw new java.security.cert.CertificateNotYetValidException(r13.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02de, code lost:
    
        r13 = new java.lang.StringBuilder("certificate expired on ");
        r11 = r11.f56582q0.getNavBarTitleString();
        r13.append((java.lang.String) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r11}, 509972914, -509972911, java.lang.System.identityHashCode(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0305, code lost:
    
        throw new java.security.cert.CertificateExpiredException(r13.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object h(java.lang.Object[] r10, int r11, int r12, int r13) throws java.security.cert.CertificateParsingException, java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        /*
            Method dump skipped, instruction units count: 1674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.m1.h(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static /* synthetic */ Object i(Object[] objArr) {
        long[] jArr;
        m1 m1Var = (m1) objArr[0];
        synchronized (m1Var.f57032x0) {
            long[] jArr2 = m1Var.H0;
            if (jArr2 != null) {
                return jArr2;
            }
            long[] jArr3 = {m1Var.getNotBefore().getTime(), m1Var.getNotAfter().getTime()};
            synchronized (m1Var.f57032x0) {
                try {
                    if (m1Var.H0 == null) {
                        m1Var.H0 = jArr3;
                    }
                    jArr = m1Var.H0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return jArr;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.j1, java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateParsingException, CertificateNotYetValidException, CertificateExpiredException {
        h(new Object[]{this, date}, -352523648, 352523658, System.identityHashCode(this));
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        return ((Boolean) h(new Object[]{this, obj}, -36671948, 36671960, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return (byte[]) h(new Object[]{this}, -1660521008, 1660521015, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.j1, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        return (X500Principal) h(new Object[]{this}, 1702881758, -1702881756, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.j1, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return (PublicKey) h(new Object[]{this}, -1214350962, 1214350971, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.j1, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        return (X500Principal) h(new Object[]{this}, 1499240960, -1499240960, System.identityHashCode(this));
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        return ((Integer) h(new Object[]{this}, 83726942, -83726938, System.identityHashCode(this))).intValue();
    }
}
