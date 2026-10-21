package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bcj extends bdg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f54478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54479e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54480f = 1;

    static {
        HashSet hashSet = new HashSet();
        f54478d = hashSet;
        hashSet.add(ahb.TransactionApproved);
        hashSet.add(ahb.setChoiceMode);
        hashSet.add(ahb.setStackTrace);
        hashSet.add(ahb.getGeneralBgColor);
        hashSet.add(ahb.TransactionNotAuthorised);
        hashSet.add(ahb.setLineSpacing);
        int i10 = f54479e;
        int i11 = i10 ^ 83;
        int i12 = ((i10 & 83) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f54480f = i14 % 128;
        int i15 = i14 % 2;
    }

    public bcj() {
        super(f54478d);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException, InvalidKeyException {
        Object bckVar;
        int i13 = ~i12;
        int i14 = (~i10) | i13;
        int i15 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i14))) * 369) + (((~i14) | i11) * (-369)) + ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        if (i15 == 1) {
            bckVar = new bck((ajj) objArr[1]);
            int i16 = f54479e;
            int i17 = i16 & 9;
            int i18 = ((i16 | 9) & (~i17)) + (i17 << 1);
            f54480f = i18 % 128;
            int i19 = i18 % 2;
        } else {
            if (i15 == 2) {
                Key key = (Key) objArr[1];
                int i20 = f54479e + 52;
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                int i22 = i21 % 128;
                f54480f = i22;
                if (i21 % 2 == 0) {
                    boolean z10 = key instanceof bcm;
                    throw null;
                }
                if (!(key instanceof bcm)) {
                    int i23 = (i22 ^ 83) + ((i22 & 83) << 1);
                    f54479e = i23 % 128;
                    if (i23 % 2 != 0) {
                        boolean z11 = key instanceof bck;
                        throw null;
                    }
                    if (!(key instanceof bck)) {
                        throw new InvalidKeyException("Unsupported key type");
                    }
                }
                int i24 = f54479e;
                int i25 = ((i24 | 7) << 1) - (i24 ^ 7);
                f54480f = i25 % 128;
                int i26 = i25 % 2;
                return key;
            }
            if (i15 != 3) {
                Key key2 = (Key) objArr[1];
                Class cls = (Class) objArr[2];
                int i27 = f54479e;
                int i28 = i27 + 43;
                f54480f = i28 % 128;
                if (i28 % 2 == 0) {
                    boolean z12 = key2 instanceof bcm;
                    throw null;
                }
                if (!(!(key2 instanceof bcm))) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key2.getEncoded());
                        int i29 = f54480f;
                        int i30 = i29 & 49;
                        int i31 = ((i29 ^ 49) | i30) << 1;
                        int i32 = -((i29 | 49) & (~i30));
                        int i33 = (i31 & i32) + (i32 | i31);
                        f54479e = i33 % 128;
                        if (i33 % 2 == 0) {
                            return pKCS8EncodedKeySpec;
                        }
                        throw null;
                    }
                } else {
                    if (!(key2 instanceof bck)) {
                        StringBuilder sb2 = new StringBuilder("Unsupported key type: ");
                        sb2.append(key2.getClass());
                        sb2.append(Constant.DOT_STRING);
                        throw new InvalidKeySpecException(sb2.toString());
                    }
                    int i34 = (i27 & 17) + (i27 | 17);
                    f54480f = i34 % 128;
                    if (i34 % 2 == 0) {
                        X509EncodedKeySpec.class.isAssignableFrom(cls);
                        throw null;
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key2.getEncoded());
                        int i35 = f54480f;
                        int i36 = ((i35 & (-18)) | ((~i35) & 17)) + ((i35 & 17) << 1);
                        f54479e = i36 % 128;
                        if (i36 % 2 == 0) {
                            return x509EncodedKeySpec;
                        }
                        int i37 = 90 / 0;
                        return x509EncodedKeySpec;
                    }
                }
                StringBuilder sb3 = new StringBuilder("Unknown key specification: ");
                sb3.append(cls);
                sb3.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb3.toString());
            }
            bckVar = new bcm((ahw) objArr[1]);
            int i38 = f54480f;
            int i39 = i38 & 15;
            int i40 = (i38 | 15) & (~i39);
            int i41 = i39 << 1;
            int i42 = (i40 & i41) + (i40 | i41);
            f54479e = i42 % 128;
            int i43 = i42 % 2;
        }
        return bckVar;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setY(new Object[]{this, key, cls}, 1793352856, -1793352856, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setY(new Object[]{this, key}, 1031958299, -1031958297, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setY(new Object[]{this, ajjVar}, 1392309952, -1392309951, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setY(new Object[]{this, ahwVar}, -58160274, 58160277, System.identityHashCode(this));
    }
}
