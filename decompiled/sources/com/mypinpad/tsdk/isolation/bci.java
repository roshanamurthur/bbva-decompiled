package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class bci extends bdg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f54475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54476e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54477f = 1;

    static {
        HashSet hashSet = new HashSet();
        f54475d = hashSet;
        hashSet.add(ahb.setPadding);
        hashSet.add(ahb.setActivated);
        int i10 = f54476e;
        int i11 = i10 & 41;
        int i12 = (i11 - (~(-(-((i10 ^ 41) | i11))))) - 1;
        f54477f = i12 % 128;
        int i13 = i12 % 2;
    }

    public bci() {
        super(f54475d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.bce) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        if ((!(r9 instanceof com.mypinpad.tsdk.isolation.bce)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        if ((!(r9 instanceof com.mypinpad.tsdk.isolation.bcf)) == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        r11 = (r2 & (-58)) | (r5 & 57);
        r2 = -(-((r2 & 57) << 1));
        r1 = ((r11 | r2) << 1) - (r11 ^ r2);
        com.mypinpad.tsdk.isolation.bci.f54477f = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010b, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(r8) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
    
        r8 = new java.security.spec.X509EncodedKeySpec(r9.getEncoded());
        r9 = com.mypinpad.tsdk.isolation.bci.f54476e + 113;
        com.mypinpad.tsdk.isolation.bci.f54477f = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        if ((r9 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        r10 = new java.lang.StringBuilder("Unsupported key type: ");
        r10.append(r9.getClass());
        r10.append(mx.openpay.library.domain.util.Constant.DOT_STRING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        r10 = ((r3 ^ 65) | (r3 & 65)) << 1;
        r11 = -((r3 & (-66)) | ((~r3) & 65));
        r2 = (r10 ^ r11) + ((r10 & r11) << 1);
        com.mypinpad.tsdk.isolation.bci.f54476e = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r8) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
    
        r8 = new java.security.spec.PKCS8EncodedKeySpec(r9.getEncoded());
        r9 = com.mypinpad.tsdk.isolation.bci.f54476e + 27;
        com.mypinpad.tsdk.isolation.bci.f54477f = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017c, code lost:
    
        r10 = new java.lang.StringBuilder("Unknown key specification: ");
        r10.append(r8);
        r10.append(mx.openpay.library.domain.util.Constant.DOT_STRING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0192, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r8, int r9, int r10, int r11) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bci.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setX(new Object[]{this, key, cls}, -1757043697, 1757043698, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setX(new Object[]{this, key}, -1239333488, 1239333491, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setX(new Object[]{this, ahwVar}, -657457527, 657457527, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setX(new Object[]{this, ajjVar}, -1068912140, 1068912142, System.identityHashCode(this));
    }
}
