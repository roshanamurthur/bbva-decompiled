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
public final class bdj extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54564a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54565b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d4, code lost:
    
        if ((!(r9 instanceof com.mypinpad.tsdk.isolation.bdi)) != true) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d9, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.bdi) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e3, code lost:
    
        throw new java.security.InvalidKeyException("unsupported key type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r9, int r10, int r11, int r12) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdj.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setCompoundDrawableTintBlendMode(new Object[]{this, keySpec}, 1086885046, -1086885042, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{this, keySpec}, 84598104, -84598104, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setCompoundDrawableTintBlendMode(new Object[]{this, key, cls}, 1921756357, -1921756355, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setCompoundDrawableTintBlendMode(new Object[]{this, key}, 1726150178, -1726150175, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{this, ajjVar}, 1942182061, -1942182060, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setCompoundDrawableTintBlendMode(new Object[]{this, ahwVar}, -1612130096, 1612130101, System.identityHashCode(this));
    }
}
