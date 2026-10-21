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
public final class bcp extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54501a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54502b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if ((!r13) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r13 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        throw new java.security.InvalidKeyException("Unsupported key type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r11, int r12, int r13, int r14) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bcp.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, keySpec}, 33756460, -33756457, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, keySpec}, -1150622346, 1150622348, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setOnFocusChangeListener(new Object[]{this, key, cls}, -1637937636, 1637937637, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setOnFocusChangeListener(new Object[]{this, key}, -2051946285, 2051946289, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, ajjVar}, -529584626, 529584626, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, ahwVar}, 236754843, -236754838, System.identityHashCode(this));
    }
}
