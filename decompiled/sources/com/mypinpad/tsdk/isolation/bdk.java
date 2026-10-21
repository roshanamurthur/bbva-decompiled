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
public final class bdk extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54566a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54567b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException, InvalidKeyException {
        Object bdhVar;
        PublicKey publicKey;
        int i13 = (i11 * (-978)) + (i10 * 980);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13;
        if (i16 == 1) {
            bdhVar = new bdh((ajj) objArr[1]);
            int i17 = f54567b;
            int i18 = ((i17 | 103) << 1) - (i17 ^ 103);
            f54566a = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
        } else {
            if (i16 == 2) {
                Key key = (Key) objArr[1];
                int i19 = f54567b;
                int i20 = (-2) - ((i19 + 12) ^ (-1));
                f54566a = i20 % 128;
                if (i20 % 2 != 0) {
                    boolean z10 = key instanceof bde;
                    throw null;
                }
                if (!(key instanceof bde)) {
                    int i21 = ((i19 | 125) << 1) - (i19 ^ 125);
                    f54566a = i21 % 128;
                    if (i21 % 2 != 0) {
                        boolean z11 = key instanceof bdh;
                        throw null;
                    }
                    if (!(key instanceof bdh)) {
                        throw new InvalidKeyException("unsupported key type");
                    }
                }
                int i22 = i19 & 39;
                int i23 = ((i19 ^ 39) | i22) << 1;
                int i24 = -((i19 | 39) & (~i22));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f54566a = i25 % 128;
                int i26 = i25 % 2;
                return key;
            }
            if (i16 == 3) {
                bdk bdkVar = (bdk) objArr[0];
                KeySpec keySpec = (KeySpec) objArr[1];
                int i27 = f54567b;
                int i28 = (i27 ^ 27) + ((i27 & 27) << 1);
                f54566a = i28 % 128;
                int i29 = i28 % 2;
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    StringBuilder sb2 = new StringBuilder("unknown key specification: ");
                    sb2.append(keySpec);
                    sb2.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb2.toString());
                }
                int i30 = i27 + 19;
                f54566a = i30 % 128;
                int i31 = i30 % 2;
                byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
                try {
                    if (i31 != 0) {
                        publicKey = (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{bdkVar, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1332004664, 1332004665, System.identityHashCode(bdkVar));
                        int i32 = 44 / 0;
                    } else {
                        publicKey = (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{bdkVar, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis())}, -1332004664, 1332004665, System.identityHashCode(bdkVar));
                    }
                    return publicKey;
                } catch (Exception e5) {
                    throw new InvalidKeySpecException(e5.toString());
                }
            }
            if (i16 == 4) {
                Key key2 = (Key) objArr[1];
                Class cls = (Class) objArr[2];
                int i33 = f54566a;
                int i34 = i33 ^ 123;
                int i35 = ((i33 & 123) | i34) << 1;
                int i36 = -i34;
                int i37 = (i35 & i36) + (i36 | i35);
                f54567b = i37 % 128;
                int i38 = i37 % 2;
                if (!(!(key2 instanceof bde))) {
                    int i39 = (i33 | 29) << 1;
                    int i40 = -(((~i33) & 29) | (i33 & (-30)));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    f54567b = i41 % 128;
                    if (i41 % 2 == 0) {
                        PKCS8EncodedKeySpec.class.isAssignableFrom(cls);
                        throw null;
                    }
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key2.getEncoded());
                        int i42 = f54566a + 7;
                        f54567b = i42 % 128;
                        if (i42 % 2 != 0) {
                            return pKCS8EncodedKeySpec;
                        }
                        throw null;
                    }
                } else {
                    if (!(key2 instanceof bdh)) {
                        StringBuilder sb3 = new StringBuilder("unsupported key type: ");
                        sb3.append(key2.getClass());
                        sb3.append(Constant.DOT_STRING);
                        throw new InvalidKeySpecException(sb3.toString());
                    }
                    int i43 = i33 ^ 61;
                    int i44 = (((i33 & 61) | i43) << 1) - i43;
                    f54567b = i44 % 128;
                    int i45 = i44 % 2;
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key2.getEncoded());
                        int i46 = f54567b;
                        int i47 = i46 & 107;
                        int i48 = (i46 ^ 107) | i47;
                        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                        f54566a = i49 % 128;
                        if (i49 % 2 == 0) {
                            return x509EncodedKeySpec;
                        }
                        throw null;
                    }
                }
                StringBuilder sb4 = new StringBuilder("unknown key specification: ");
                sb4.append(cls);
                sb4.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb4.toString());
            }
            if (i16 != 5) {
                bdk bdkVar2 = (bdk) objArr[0];
                KeySpec keySpec2 = (KeySpec) objArr[1];
                int i50 = f54567b;
                int i51 = (((i50 ^ 35) | (i50 & 35)) << 1) - ((i50 & (-36)) | ((~i50) & 35));
                f54566a = i51 % 128;
                int i52 = i51 % 2;
                if (!(keySpec2 instanceof PKCS8EncodedKeySpec)) {
                    StringBuilder sb5 = new StringBuilder("unsupported key specification: ");
                    sb5.append(keySpec2.getClass());
                    sb5.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb5.toString());
                }
                int i53 = ((i50 | 119) << 1) - (i50 ^ 119);
                f54566a = i53 % 128;
                int i54 = i53 % 2;
                try {
                    PrivateKey privateKey = (PrivateKey) setCompoundDrawableTintBlendMode(new Object[]{bdkVar2, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{((PKCS8EncodedKeySpec) keySpec2).getEncoded()}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 651208747, -651208742, System.identityHashCode(bdkVar2));
                    int i55 = f54567b;
                    int i56 = i55 & 121;
                    int i57 = (i55 | 121) & (~i56);
                    int i58 = i56 << 1;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    f54566a = i59 % 128;
                    if (i59 % 2 == 0) {
                        return privateKey;
                    }
                    int i60 = 47 / 0;
                    return privateKey;
                } catch (Exception e7) {
                    throw new InvalidKeySpecException(e7.toString());
                }
            }
            bdhVar = new bde((ahw) objArr[1]);
            int i61 = f54566a + 55;
            f54567b = i61 % 128;
            int i62 = i61 % 2;
        }
        return bdhVar;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setCompoundDrawableTintBlendMode(new Object[]{this, keySpec}, -947734179, 947734179, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{this, keySpec}, -352536859, 352536862, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setCompoundDrawableTintBlendMode(new Object[]{this, key, cls}, -1035217179, 1035217183, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setCompoundDrawableTintBlendMode(new Object[]{this, key}, -1844076900, 1844076902, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setCompoundDrawableTintBlendMode(new Object[]{this, ajjVar}, -1332004664, 1332004665, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setCompoundDrawableTintBlendMode(new Object[]{this, ahwVar}, 651208747, -651208742, System.identityHashCode(this));
    }
}
