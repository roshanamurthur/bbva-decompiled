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
public final class bcq extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54503a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54504b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r10 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r10 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        throw new java.security.InvalidKeyException("unsupported key type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r8, int r9, int r10, int r11) throws java.security.spec.InvalidKeySpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bcq.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, keySpec}, -276849102, 276849103, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, keySpec}, 881566908, -881566904, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setOnFocusChangeListener(new Object[]{this, key, cls}, -511896885, 511896890, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setOnFocusChangeListener(new Object[]{this, key}, 1437814033, -1437814033, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, ajjVar}, 1537115877, -1537115875, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, ahwVar}, -1916031653, 1916031656, System.identityHashCode(this));
    }
}
