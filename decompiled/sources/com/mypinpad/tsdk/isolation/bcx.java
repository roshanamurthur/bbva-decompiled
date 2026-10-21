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
public final class bcx extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54524a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54525b = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException, InvalidKeyException {
        Object bcwVar;
        PrivateKey privateKey;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i15 = ~i11;
        int i16 = ((~(i15 | i13 | i12)) * 283) + ((~(i10 | i15)) * 283) + i14;
        if (i16 == 1) {
            bcwVar = new bcw((ajj) objArr[1]);
            int i17 = f54524a;
            int i18 = (i17 & (-86)) | ((~i17) & 85);
            int i19 = (i17 & 85) << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f54525b = i20 % 128;
            if (i20 % 2 == 0) {
                throw null;
            }
        } else {
            if (i16 != 2) {
                if (i16 == 3) {
                    bcx bcxVar = (bcx) objArr[0];
                    KeySpec keySpec = (KeySpec) objArr[1];
                    int i21 = f54524a;
                    int i22 = i21 & 41;
                    int i23 = i22 + ((i21 ^ 41) | i22);
                    f54525b = i23 % 128;
                    int i24 = i23 % 2;
                    if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                        StringBuilder sb2 = new StringBuilder("Unsupported key specification: ");
                        sb2.append(keySpec.getClass());
                        sb2.append(Constant.DOT_STRING);
                        throw new InvalidKeySpecException(sb2.toString());
                    }
                    int i25 = (i21 ^ 12) + ((i21 & 12) << 1);
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    f54525b = i26 % 128;
                    int i27 = i26 % 2;
                    byte[] encoded = ((PKCS8EncodedKeySpec) keySpec).getEncoded();
                    try {
                        if (i27 == 0) {
                            privateKey = (PrivateKey) setOnFocusChangeListener(new Object[]{bcxVar, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{encoded}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1105337069, -1105337067, System.identityHashCode(bcxVar));
                            int i28 = 27 / 0;
                        } else {
                            privateKey = (PrivateKey) setOnFocusChangeListener(new Object[]{bcxVar, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{encoded}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1105337069, -1105337067, System.identityHashCode(bcxVar));
                        }
                        return privateKey;
                    } catch (Exception e5) {
                        throw new InvalidKeySpecException(e5.toString());
                    }
                }
                if (i16 == 4) {
                    Key key = (Key) objArr[1];
                    Class cls = (Class) objArr[2];
                    int i29 = f54525b;
                    int i30 = (i29 & 117) + (i29 | 117);
                    int i31 = i30 % 128;
                    f54524a = i31;
                    int i32 = i30 % 2;
                    if (key instanceof bct) {
                        int i33 = i31 ^ 83;
                        int i34 = ((((i31 & 83) | i33) << 1) - (~(-i33))) - 1;
                        f54525b = i34 % 128;
                        int i35 = i34 % 2;
                        if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key.getEncoded());
                            int i36 = f54525b;
                            int i37 = i36 & 113;
                            int i38 = ((i36 ^ 113) | i37) << 1;
                            int i39 = -((i36 | 113) & (~i37));
                            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                            f54524a = i40 % 128;
                            int i41 = i40 % 2;
                            return pKCS8EncodedKeySpec;
                        }
                    } else {
                        if (!(key instanceof bcw)) {
                            StringBuilder sb3 = new StringBuilder("Unsupported key type: ");
                            sb3.append(key.getClass());
                            sb3.append(Constant.DOT_STRING);
                            throw new InvalidKeySpecException(sb3.toString());
                        }
                        int i42 = i31 & 113;
                        int i43 = (((i31 ^ 113) | i42) << 1) - ((i31 | 113) & (~i42));
                        f54525b = i43 % 128;
                        int i44 = i43 % 2;
                        if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key.getEncoded());
                            int i45 = f54525b;
                            int i46 = ((i45 | 9) << 1) - (i45 ^ 9);
                            f54524a = i46 % 128;
                            int i47 = i46 % 2;
                            return x509EncodedKeySpec;
                        }
                    }
                    StringBuilder sb4 = new StringBuilder("Unknown key specification: ");
                    sb4.append(cls);
                    sb4.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb4.toString());
                }
                if (i16 == 5) {
                    Key key2 = (Key) objArr[1];
                    int i48 = f54525b;
                    int i49 = i48 ^ 37;
                    int i50 = (i48 & 37) << 1;
                    int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                    f54524a = i51 % 128;
                    int i52 = i51 % 2;
                    if (!(key2 instanceof bct)) {
                        int i53 = i48 + 69;
                        f54524a = i53 % 128;
                        if (i53 % 2 != 0) {
                            boolean z10 = key2 instanceof bcw;
                            throw null;
                        }
                        if (!(key2 instanceof bcw)) {
                            throw new InvalidKeyException("Unsupported key type");
                        }
                    }
                    int i54 = (-2) - ((f54524a + 14) ^ (-1));
                    f54525b = i54 % 128;
                    if (i54 % 2 != 0) {
                        return key2;
                    }
                    throw null;
                }
                bcx bcxVar2 = (bcx) objArr[0];
                KeySpec keySpec2 = (KeySpec) objArr[1];
                int i55 = f54524a;
                int i56 = (i55 ^ 63) + ((i55 & 63) << 1);
                int i57 = i56 % 128;
                f54525b = i57;
                int i58 = i56 % 2;
                if (!(keySpec2 instanceof X509EncodedKeySpec)) {
                    StringBuilder sb5 = new StringBuilder("Unknown key specification: ");
                    sb5.append(keySpec2);
                    sb5.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb5.toString());
                }
                int i59 = i57 & 49;
                int i60 = (i57 | 49) & (~i59);
                int i61 = i59 << 1;
                int i62 = (i60 & i61) + (i60 | i61);
                f54524a = i62 % 128;
                int i63 = i62 % 2;
                byte[] encoded2 = ((X509EncodedKeySpec) keySpec2).getEncoded();
                try {
                    if (i63 != 0) {
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    PublicKey publicKey = (PublicKey) setOnFocusChangeListener(new Object[]{bcxVar2, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded2}, 909154525, -909154522, (int) System.currentTimeMillis())}, 2100229097, -2100229096, System.identityHashCode(bcxVar2));
                    int i64 = f54525b;
                    int i65 = i64 & 61;
                    int i66 = (i64 | 61) & (~i65);
                    int i67 = i65 << 1;
                    int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                    f54524a = i68 % 128;
                    int i69 = i68 % 2;
                    return publicKey;
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            }
            bcwVar = new bct((ahw) objArr[1]);
            int i70 = f54524a;
            int i71 = i70 & 49;
            int i72 = (i70 | 49) & (~i71);
            int i73 = i71 << 1;
            int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
            f54525b = i74 % 128;
            if (i74 % 2 == 0) {
                throw null;
            }
        }
        return bcwVar;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, keySpec}, -1312084590, 1312084593, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, keySpec}, 2144373988, -2144373988, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setOnFocusChangeListener(new Object[]{this, key, cls}, -2121089185, 2121089189, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setOnFocusChangeListener(new Object[]{this, key}, -1184983558, 1184983563, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{this, ajjVar}, 2100229097, -2100229096, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setOnFocusChangeListener(new Object[]{this, ahwVar}, 1105337069, -1105337067, System.identityHashCode(this));
    }
}
