package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class bdc extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54542a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54543b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0151, code lost:
    
        if ((r10 instanceof java.security.spec.X509EncodedKeySpec) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0157, code lost:
    
        if ((!(r10 instanceof java.security.spec.X509EncodedKeySpec)) != true) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        r13 = r13 + 41;
        com.mypinpad.tsdk.isolation.bdc.f54543b = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0166, code lost:
    
        r10 = (java.security.PublicKey) setX(new java.lang.Object[]{r11, (com.mypinpad.tsdk.isolation.ajj) com.mypinpad.tsdk.isolation.ajj.setCompoundDrawableTintBlendMode(new java.lang.Object[]{((java.security.spec.X509EncodedKeySpec) r10).getEncoded()}, 909154525, -909154522, (int) java.lang.System.currentTimeMillis())}, -71083607, 71083612, java.lang.System.identityHashCode(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.bdc.f54543b + 65;
        com.mypinpad.tsdk.isolation.bdc.f54542a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a6, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a7, code lost:
    
        r13 = new java.lang.StringBuilder("Unknown key specification: ");
        r13.append(r10);
        r13.append(mx.openpay.library.domain.util.Constant.DOT_STRING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bb, code lost:
    
        throw new java.security.spec.InvalidKeySpecException(r13.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r10, int r11, int r12, int r13) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdc.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setX(new Object[]{this, keySpec}, -276695540, 276695541, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setX(new Object[]{this, keySpec}, -905303605, 905303608, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setX(new Object[]{this, key, cls}, -1601248181, 1601248181, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setX(new Object[]{this, key}, 1847466664, -1847466662, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setX(new Object[]{this, ahwVar}, 202205192, -202205188, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setX(new Object[]{this, ajjVar}, -71083607, 71083612, System.identityHashCode(this));
    }
}
