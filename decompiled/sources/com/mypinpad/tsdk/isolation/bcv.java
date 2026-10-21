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
public final class bcv extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54519a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54520b = 1;

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0175  */
    /* JADX WARN: Code duplicated, block: B:29:0x017b  */
    /* JADX WARN: Code duplicated, block: B:32:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b6  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException, InvalidKeyException {
        PrivateKey privateKey;
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = (~(i17 | i18)) | (~(i18 | i12));
        int i20 = ~(i11 | (~i12) | i10);
        int i21 = (((~(i10 | i18 | i12)) | i20) * 470) + ((i19 | i20) * (-470)) + ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        if (i21 == 1) {
            bcr bcrVar = new bcr((ahw) objArr[1]);
            int i22 = f54519a;
            int i23 = ((i22 ^ 79) - (~((i22 & 79) << 1))) - 1;
            f54520b = i23 % 128;
            int i24 = i23 % 2;
            return bcrVar;
        }
        if (i21 == 2) {
            bcv bcvVar = (bcv) objArr[0];
            KeySpec keySpec = (KeySpec) objArr[1];
            int i25 = f54520b;
            int i26 = i25 & 41;
            int i27 = i25 | 41;
            int i28 = (i26 & i27) + (i26 | i27);
            f54519a = i28 % 128;
            int i29 = i28 % 2;
            if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
                StringBuilder sb2 = new StringBuilder("Unsupported key specification: ");
                sb2.append(keySpec.getClass());
                sb2.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb2.toString());
            }
            int i30 = i25 | 125;
            int i31 = i30 << 1;
            int i32 = -(i30 & (~(i25 & 125)));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            f54519a = i33 % 128;
            int i34 = i33 % 2;
            byte[] encoded = ((PKCS8EncodedKeySpec) keySpec).getEncoded();
            try {
                if (i34 != 0) {
                    privateKey = (PrivateKey) setX(new Object[]{bcvVar, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{encoded}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -1807918563, 1807918564, System.identityHashCode(bcvVar));
                    int i35 = 65 / 0;
                } else {
                    privateKey = (PrivateKey) setX(new Object[]{bcvVar, (ahw) ahw.setX(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{encoded}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -1807918563, 1807918564, System.identityHashCode(bcvVar));
                }
                return privateKey;
            } catch (Exception e5) {
                throw new InvalidKeySpecException(e5.toString());
            }
        }
        if (i21 == 3) {
            Key key = (Key) objArr[1];
            int i36 = f54519a;
            int i37 = (65 & (~i36)) | (i36 & (-66));
            int i38 = -(-((i36 & 65) << 1));
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            f54520b = i39 % 128;
            boolean z10 = key instanceof bcr;
            if (i39 % 2 == 0) {
                int i40 = 36 / 0;
                if (!z10) {
                    int i41 = i36 + 35;
                    f54520b = i41 % 128;
                    int i42 = i41 % 2;
                    if (!(key instanceof bcu)) {
                        throw new InvalidKeyException("Unsupported key type");
                    }
                }
            } else if (!z10) {
                int i43 = i36 + 35;
                f54520b = i43 % 128;
                int i44 = i43 % 2;
                if (!(key instanceof bcu)) {
                    throw new InvalidKeyException("Unsupported key type");
                }
            }
            int i45 = f54520b + 85;
            f54519a = i45 % 128;
            if (i45 % 2 == 0) {
                return key;
            }
            int i46 = 4 / 0;
            return key;
        }
        if (i21 == 4) {
            bcu bcuVar = new bcu((ajj) objArr[1]);
            int i47 = f54519a;
            int i48 = ((i47 & 50) + (i47 | 50)) - 1;
            f54520b = i48 % 128;
            if (i48 % 2 == 0) {
                int i49 = 57 / 0;
            }
            return bcuVar;
        }
        if (i21 == 5) {
            bcv bcvVar2 = (bcv) objArr[0];
            KeySpec keySpec2 = (KeySpec) objArr[1];
            int i50 = f54520b;
            int i51 = i50 & 19;
            int i52 = ((i50 ^ 19) | i51) << 1;
            int i53 = -((i50 | 19) & (~i51));
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            f54519a = i54 % 128;
            if (i54 % 2 != 0) {
                boolean z11 = keySpec2 instanceof X509EncodedKeySpec;
                throw null;
            }
            if (!(keySpec2 instanceof X509EncodedKeySpec)) {
                StringBuilder sb3 = new StringBuilder("Unknown key specification: ");
                sb3.append(keySpec2);
                sb3.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb3.toString());
            }
            try {
                PublicKey publicKey = (PublicKey) setX(new Object[]{bcvVar2, (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{((X509EncodedKeySpec) keySpec2).getEncoded()}, 909154525, -909154522, (int) System.currentTimeMillis())}, -773124572, 773124576, System.identityHashCode(bcvVar2));
                int i55 = f54519a;
                int i56 = i55 & 35;
                int i57 = -(-((i55 ^ 35) | i56));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                f54520b = i58 % 128;
                if (i58 % 2 != 0) {
                    return publicKey;
                }
                throw null;
            } catch (Exception e7) {
                throw new InvalidKeySpecException(e7.toString());
            }
        }
        bcv bcvVar3 = (bcv) objArr[0];
        Key key2 = (Key) objArr[1];
        Class cls = (Class) objArr[2];
        int i59 = f54519a;
        int i60 = i59 ^ 29;
        int i61 = (((i59 & 29) | i60) << 1) - i60;
        f54520b = i61 % 128;
        if (i61 % 2 == 0) {
            int i62 = 47 / 0;
            if (key2 instanceof bcr) {
                if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key2.getEncoded());
                    int i63 = f54520b;
                    i13 = (((i63 | 19) << 1) - (~(-(i63 ^ 19)))) - 1;
                    f54519a = i13 % 128;
                    if (i13 % 2 != 0) {
                        return pKCS8EncodedKeySpec;
                    }
                    int i64 = 56 / 0;
                    return pKCS8EncodedKeySpec;
                }
            } else {
                if (!(!(key2 instanceof bcu))) {
                    StringBuilder sb4 = new StringBuilder("Unsupported key type: ");
                    sb4.append(key2.getClass());
                    sb4.append(Constant.DOT_STRING);
                    throw new InvalidKeySpecException(sb4.toString());
                }
                int iIdentityHashCode = System.identityHashCode(bcvVar3);
                int i65 = ~iIdentityHashCode;
                int i66 = ~i65;
                int i67 = (1240965277 & i66) | (i65 & (-1240965278));
                int i68 = 1240965277 & i65;
                int i69 = ~((i68 & i67) | (i67 ^ i68));
                int i70 = 805854976 & i69;
                int i71 = (~i70) & (i69 | 805854976);
                int i72 = (i71 & i70) | (i71 ^ i70);
                int i73 = (i66 & (-2030886814)) | (i65 & 2030886813);
                int i74 = (-2030886814) & i65;
                int i75 = ~((i73 ^ i74) | (i73 & i74));
                int i76 = (i72 & i75) | (i72 ^ i75);
                int i77 = (-15933441) & iIdentityHashCode;
                int i78 = ~(((~i77) & ((-15933441) | iIdentityHashCode)) | i77);
                int i79 = ((i78 & i76) | (i76 ^ i78)) * (-84);
                int i80 = ((-1576146261) & i79) + (i79 | (-1576146261));
                int i81 = ~(((-2030886814) ^ iIdentityHashCode) | ((-2030886814) & iIdentityHashCode));
                int i82 = (-1240965278) & i81;
                int i83 = ((i81 | (-1240965278)) & (~i82)) | i82;
                int i84 = i65 | 2030886813;
                int i85 = ~i84;
                int i86 = (i84 | i85) & i85;
                int i87 = ((~i86) & i83) | ((~i83) & i86);
                int i88 = i83 & i86;
                int i89 = ((i88 & i87) | (i87 ^ i88)) * (-84);
                int i90 = ((~i89) & i80) | ((~i80) & i89);
                int i91 = (i89 & i80) << 1;
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                int i93 = ~(((iIdentityHashCode | i65) & i65) | 2030886813);
                int i94 = i93 ^ 15933440;
                int i95 = i93 & 15933440;
                int i96 = -(-(((i95 & i94) | (i94 ^ i95)) * 84));
                int i97 = (i92 | i96) << 1;
                int i98 = -((i96 & (~i92)) | ((~i96) & i92));
                i14 = (i97 ^ i98) + ((i98 & i97) << 1);
                int iIdentityHashCode2 = System.identityHashCode(bcvVar3);
                int i99 = ~((249411097 ^ iIdentityHashCode2) | (249411097 & iIdentityHashCode2));
                int i100 = ((~i99) & (-1281226233)) | (1281226232 & i99);
                int i101 = i99 & (-1281226233);
                int i102 = ((i101 & i100) | (i100 ^ i101)) * 56;
                int i103 = (915257632 ^ i102) + ((i102 & 915257632) << 1);
                int i104 = (i103 & (-944384)) + ((-944384) | i103);
                int i105 = ~iIdentityHashCode2;
                int i106 = ~((i105 & (-1281226233)) | (i105 ^ (-1281226233)));
                int i107 = 249411097 ^ i106;
                int i108 = i106 & 249411097;
                int i109 = -(-(((i108 & i107) | (i107 ^ i108)) * 56));
                int i110 = i104 & i109;
                i15 = (i109 | i104) & (~i110);
                i16 = i110 << 1;
                if (i14 > (i15 & i16) + (i15 | i16)) {
                    X509EncodedKeySpec.class.isAssignableFrom(cls);
                    throw null;
                }
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key2.getEncoded());
                    int i111 = f54519a + 5;
                    f54520b = i111 % 128;
                    int i112 = i111 % 2;
                    return x509EncodedKeySpec;
                }
            }
        } else if (key2 instanceof bcr) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(key2.getEncoded());
                int i610 = f54520b;
                i13 = (((i610 | 19) << 1) - (~(-(i610 ^ 19)))) - 1;
                f54519a = i13 % 128;
                if (i13 % 2 != 0) {
                    return pKCS8EncodedKeySpec;
                }
                int i611 = 56 / 0;
                return pKCS8EncodedKeySpec;
            }
        } else {
            if (!(!(key2 instanceof bcu))) {
                StringBuilder sb5 = new StringBuilder("Unsupported key type: ");
                sb5.append(key2.getClass());
                sb5.append(Constant.DOT_STRING);
                throw new InvalidKeySpecException(sb5.toString());
            }
            int iIdentityHashCode3 = System.identityHashCode(bcvVar3);
            int i612 = ~iIdentityHashCode3;
            int i613 = ~i612;
            int i614 = (1240965277 & i613) | (i612 & (-1240965278));
            int i615 = 1240965277 & i612;
            int i616 = ~((i615 & i614) | (i614 ^ i615));
            int i710 = 805854976 & i616;
            int i711 = (~i710) & (i616 | 805854976);
            int i712 = (i711 & i710) | (i711 ^ i710);
            int i713 = (i613 & (-2030886814)) | (i612 & 2030886813);
            int i714 = (-2030886814) & i612;
            int i715 = ~((i713 ^ i714) | (i713 & i714));
            int i716 = (i712 & i715) | (i712 ^ i715);
            int i717 = (-15933441) & iIdentityHashCode3;
            int i718 = ~(((~i717) & ((-15933441) | iIdentityHashCode3)) | i717);
            int i719 = ((i718 & i716) | (i716 ^ i718)) * (-84);
            int i810 = ((-1576146261) & i719) + (i719 | (-1576146261));
            int i811 = ~(((-2030886814) ^ iIdentityHashCode3) | ((-2030886814) & iIdentityHashCode3));
            int i812 = (-1240965278) & i811;
            int i813 = ((i811 | (-1240965278)) & (~i812)) | i812;
            int i814 = i612 | 2030886813;
            int i815 = ~i814;
            int i816 = (i814 | i815) & i815;
            int i817 = ((~i816) & i813) | ((~i813) & i816);
            int i818 = i813 & i816;
            int i819 = ((i818 & i817) | (i817 ^ i818)) * (-84);
            int i910 = ((~i819) & i810) | ((~i810) & i819);
            int i911 = (i819 & i810) << 1;
            int i912 = ((i910 | i911) << 1) - (i911 ^ i910);
            int i913 = ~(((iIdentityHashCode3 | i612) & i612) | 2030886813);
            int i914 = i913 ^ 15933440;
            int i915 = i913 & 15933440;
            int i916 = -(-(((i915 & i914) | (i914 ^ i915)) * 84));
            int i917 = (i912 | i916) << 1;
            int i918 = -((i916 & (~i912)) | ((~i916) & i912));
            i14 = (i917 ^ i918) + ((i918 & i917) << 1);
            int iIdentityHashCode4 = System.identityHashCode(bcvVar3);
            int i919 = ~((249411097 ^ iIdentityHashCode4) | (249411097 & iIdentityHashCode4));
            int i1010 = ((~i919) & (-1281226233)) | (1281226232 & i919);
            int i1011 = i919 & (-1281226233);
            int i1012 = ((i1011 & i1010) | (i1010 ^ i1011)) * 56;
            int i1013 = (915257632 ^ i1012) + ((i1012 & 915257632) << 1);
            int i1014 = (i1013 & (-944384)) + ((-944384) | i1013);
            int i1015 = ~iIdentityHashCode4;
            int i1016 = ~((i1015 & (-1281226233)) | (i1015 ^ (-1281226233)));
            int i1017 = 249411097 ^ i1016;
            int i1018 = i1016 & 249411097;
            int i1019 = -(-(((i1018 & i1017) | (i1017 ^ i1018)) * 56));
            int i113 = i1014 & i1019;
            i15 = (i1019 | i1014) & (~i113);
            i16 = i113 << 1;
            if (i14 > (i15 & i16) + (i15 | i16)) {
                X509EncodedKeySpec.class.isAssignableFrom(cls);
                throw null;
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                X509EncodedKeySpec x509EncodedKeySpec2 = new X509EncodedKeySpec(key2.getEncoded());
                int i114 = f54519a + 5;
                f54520b = i114 % 128;
                int i115 = i114 % 2;
                return x509EncodedKeySpec2;
            }
        }
        StringBuilder sb6 = new StringBuilder("Unknown key specification: ");
        sb6.append(cls);
        sb6.append(Constant.DOT_STRING);
        throw new InvalidKeySpecException(sb6.toString());
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return (PrivateKey) setX(new Object[]{this, keySpec}, 937509944, -937509942, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return (PublicKey) setX(new Object[]{this, keySpec}, -643248207, 643248212, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return (KeySpec) setX(new Object[]{this, key, cls}, -969522406, 969522406, System.identityHashCode(this));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return (Key) setX(new Object[]{this, key}, -885009790, 885009793, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PrivateKey setY(ahw ahwVar) throws IOException {
        return (PrivateKey) setX(new Object[]{this, ahwVar}, -1807918563, 1807918564, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aox
    public final PublicKey setX(ajj ajjVar) throws IOException {
        return (PublicKey) setX(new Object[]{this, ajjVar}, -773124572, 773124576, System.identityHashCode(this));
    }
}
