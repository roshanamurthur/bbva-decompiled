package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bdf extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54551a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54552b = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException, InvalidKeyException {
        Object bdaVar;
        PublicKey publicKey;
        int i13 = (i11 * (-489)) + (i10 * 491);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (i14 * 490) + (((~(i10 | i15)) | (~(i15 | i12))) * 490) + ((i14 | i15 | (~i12)) * (-490)) + i13;
        if (i16 == 1) {
            Key key = (Key) objArr[1];
            int i17 = f54552b;
            int i18 = ((i17 ^ 108) + ((i17 & 108) << 1)) - 1;
            f54551a = i18 % 128;
            if (i18 % 2 != 0) {
                boolean z10 = key instanceof bcz;
                throw null;
            }
            if (!(key instanceof bcz)) {
                int i19 = i17 ^ 11;
                int i20 = (((i17 & 11) | i19) << 1) - i19;
                f54551a = i20 % 128;
                if (i20 % 2 != 0) {
                    boolean z11 = key instanceof bda;
                    throw null;
                }
                if (!(key instanceof bda)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
            }
            int i21 = f54551a;
            int i22 = (i21 ^ 9) + ((i21 & 9) << 1);
            f54552b = i22 % 128;
            if (i22 % 2 != 0) {
                return key;
            }
            int i23 = 41 / 0;
            return key;
        }
        if (i16 == 2) {
            bdf bdfVar = (bdf) objArr[0];
            KeySpec keySpec = (KeySpec) objArr[1];
            int i24 = f54551a;
            int i25 = (((i24 & (-54)) | ((~i24) & 53)) - (~((i24 & 53) << 1))) - 1;
            f54552b = i25 % 128;
            int i26 = i25 % 2;
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb2 = new StringBuilder("Unsupported key specification: ");
                sb2.append(keySpec.getClass());
                sb2.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb2.toString());
            }
            int i27 = i24 & 83;
            int i28 = (i24 | 83) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 & i29) + (i28 | i29);
            f54552b = i30 % 128;
            int i31 = i30 % 2;
            try {
                PrivateKey privateKey = (PrivateKey) setOnFocusChangeListener(new Object[]{bdfVar, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{((PKCS8EncodedKeySpec) keySpec).getEncoded()}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -307562892, 307562897, System.identityHashCode(bdfVar));
                int i32 = f54551a;
                int i33 = i32 & 113;
                int i34 = ((i32 | 113) & (~i33)) + (i33 << 1);
                f54552b = i34 % 128;
                int i35 = i34 % 2;
                return privateKey;
            } catch (Exception e5) {
                throw new InvalidKeySpecException(e5.toString());
            }
        }
        if (i16 == 3) {
            bdaVar = new bda((ajj) objArr[1]);
            int i36 = f54551a;
            int i37 = i36 & 91;
            int i38 = ((i36 ^ 91) | i37) << 1;
            int i39 = -((i36 | 91) & (~i37));
            int i40 = (i38 & i39) + (i39 | i38);
            f54552b = i40 % 128;
            int i41 = i40 % 2;
        } else {
            if (i16 == 4) {
                Key key2 = (Key) objArr[1];
                Class cls = (Class) objArr[2];
                int i42 = f54551a;
                int i43 = i42 & 83;
                int i44 = i43 + ((i42 ^ 83) | i43);
                int i45 = i44 % 128;
                f54552b = i45;
                if (i44 % 2 == 0) {
                    boolean z12 = key2 instanceof bcz;
                    throw null;
                }
                if (!(key2 instanceof bcz)) {
                    if (!(key2 instanceof bda)) {
                        StringBuilder sb3 = new StringBuilder("Unsupported key type: ");
                        sb3.append(key2.getClass());
                        sb3.append(Constant.DOT_STRING);
                        throw new InvalidKeySpecException(sb3.toString());
                    }
                    int i46 = i45 ^ 11;
                    int i47 = (i45 & 11) << 1;
                    int i48 = (i46 & i47) + (i46 | i47);
                    f54551a = i48 % 128;
                    int i49 = i48 % 2;
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key2.getEncoded());
                        int i50 = f54552b;
                        int i51 = i50 ^ 73;
                        int i52 = ((i50 & 73) | i51) << 1;
                        int i53 = -i51;
                        int i54 = (i52 & i53) + (i52 | i53);
                        f54551a = i54 % 128;
                        int i55 = i54 % 2;
                        return x509EncodedKeySpec;
                    }
                } else if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key2.getEncoded());
                    int i56 = f54551a;
                    int i57 = (i56 ^ 61) + ((i56 & 61) << 1);
                    f54552b = i57 % 128;
                    if (i57 % 2 != 0) {
                        return pKCS8EncodedKeySpec;
                    }
                    throw null;
                }
                StringBuilder sb4 = new StringBuilder("Unknown key specification: ");
                sb4.append(cls);
                sb4.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb4.toString());
            }
            if (i16 != 5) {
                bdf bdfVar2 = (bdf) objArr[0];
                KeySpec keySpec2 = (KeySpec) objArr[1];
                int i58 = f54552b;
                int i59 = ((i58 ^ 68) + ((i58 & 68) << 1)) - 1;
                int i60 = i59 % 128;
                f54551a = i60;
                int i61 = i59 % 2;
                if (!(keySpec2 instanceof X509EncodedKeySpec)) {
                    StringBuilder sb5 = new StringBuilder("Unknown key specification: ");
                    sb5.append(keySpec2);
                    sb5.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb5.toString());
                }
                int i62 = (i60 ^ 97) + ((i60 & 97) << 1);
                f54552b = i62 % 128;
                int i63 = i62 % 2;
                byte[] encoded = ((X509EncodedKeySpec) keySpec2).getEncoded();
                try {
                    if (i63 == 0) {
                        publicKey = (PublicKey) setOnFocusChangeListener(new Object[]{bdfVar2, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis())}, -196283135, 196283138, System.identityHashCode(bdfVar2));
                        int i64 = 91 / 0;
                    } else {
                        publicKey = (PublicKey) setOnFocusChangeListener(new Object[]{bdfVar2, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis())}, -196283135, 196283138, System.identityHashCode(bdfVar2));
                    }
                    return publicKey;
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            }
            bdaVar = new bcz((ahw) objArr[1]);
            int i65 = f54552b;
            int i66 = i65 & 51;
            int i67 = ((((i65 ^ 51) | i66) << 1) - (~(-((i65 | 51) & (~i66))))) - 1;
            f54551a = i67 % 128;
            int i68 = i67 % 2;
        }
        return bdaVar;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, keySpec}, -1867139324, 1867139326, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, keySpec}, 992637722, -992637722, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setOnFocusChangeListener(new Object[]{this, key, cls}, 1086992546, -1086992542, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setOnFocusChangeListener(new Object[]{this, key}, -1262161615, 1262161616, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, ajjVar}, -196283135, 196283138, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, ahwVar}, -307562892, 307562897, System.identityHashCode(this));
    }
}
