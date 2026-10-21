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
public final class bcg extends bdg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f54467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54468e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54469f = 1;

    static {
        HashSet hashSet = new HashSet();
        f54467d = hashSet;
        hashSet.add(ahb.getReason);
        hashSet.add(ahb.setNextClusterForwardId);
        hashSet.add(ahb.getPinGridButtonBgColor);
        hashSet.add(ahb.setAccessibilityLiveRegion);
        hashSet.add(ahb.getDesignatorAfterValue);
        hashSet.add(ahb.setOnScrollChangeListener);
        int i10 = f54469f + 7;
        f54468e = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public bcg() {
        super(f54467d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        if ((r7 instanceof com.mypinpad.tsdk.isolation.bcd) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        if ((!(r7 instanceof com.mypinpad.tsdk.isolation.bcd)) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if ((r7 instanceof com.mypinpad.tsdk.isolation.bch) != true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r9 = r2 & 27;
        r8 = (((r2 ^ 27) | r9) << 1) - ((~r9) & (r2 | 27));
        com.mypinpad.tsdk.isolation.bcg.f54468e = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
    
        if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(r6) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        r6 = new java.security.spec.X509EncodedKeySpec(r7.getEncoded());
        r7 = com.mypinpad.tsdk.isolation.bcg.f54468e;
        r8 = (r7 & (-20)) | ((~r7) & 19);
        r7 = -(-((r7 & 19) << 1));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        com.mypinpad.tsdk.isolation.bcg.f54469f = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        r8 = new java.lang.StringBuilder("Unsupported key type: ");
        r8.append(r7.getClass());
        r8.append(mx.openpay.library.domain.util.Constant.DOT_STRING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015c, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(r6) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
    
        r6 = new java.security.spec.PKCS8EncodedKeySpec(r7.getEncoded());
        r7 = com.mypinpad.tsdk.isolation.bcg.f54468e;
        r9 = (r7 ^ 7) + ((r7 & 7) << 1);
        com.mypinpad.tsdk.isolation.bcg.f54469f = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        if ((r9 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0180, code lost:
    
        r8 = new java.lang.StringBuilder("Unknown key specification: ");
        r8.append(r6);
        r8.append(mx.openpay.library.domain.util.Constant.DOT_STRING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0196, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r6, int r7, int r8, int r9) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bcg.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setX(new Object[]{this, key, cls}, 1484834389, -1484834388, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setX(new Object[]{this, key}, 1896673889, -1896673887, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setX(new Object[]{this, ahwVar}, -473466147, 473466150, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setX(new Object[]{this, ajjVar}, -661006513, 661006513, System.identityHashCode(this));
    }
}
