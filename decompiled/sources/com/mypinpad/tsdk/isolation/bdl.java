package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bdl implements bbz, PrivateKey {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54568s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54569t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient bbc f54570p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient adu f54571q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient aee f54572r0;

    public bdl(ahw ahwVar) throws IOException {
        setDividerPadding(new Object[]{this, ahwVar}, -624048160, 624048164, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54569t0;
        int i11 = i10 & 101;
        int i12 = ((i10 ^ 101) | i11) << 1;
        int i13 = -((i10 | 101) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f54568s0 = i14 % 128;
        int i15 = i14 % 2;
        objectInputStream.defaultReadObject();
        setDividerPadding(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -624048160, 624048164, System.identityHashCode(this));
        int i16 = f54568s0;
        int i17 = i16 ^ 11;
        int i18 = -(-((i16 & 11) << 1));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f54569t0 = i19 % 128;
        int i20 = i19 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        int i22 = ((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19;
        if (i22 == 1) {
            int i23 = f54569t0;
            int i24 = (i23 ^ 57) + ((i23 & 57) << 1);
            f54568s0 = i24 % 128;
            if (i24 % 2 == 0) {
                return "PKCS#8";
            }
            throw null;
        }
        if (i22 == 2) {
            bdl bdlVar = (bdl) objArr[0];
            int i25 = f54568s0 + 123;
            f54569t0 = i25 % 128;
            int i26 = i25 % 2;
            int iHashCode = bdlVar.f54571q0.hashCode();
            bbc bbcVar = bdlVar.f54570p0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) bbc.setX(new Object[]{bbcVar}, 983815655, -983815654, System.identityHashCode(bbcVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i27 = iIntValue * 37;
            int iIdentityHashCode = System.identityHashCode(bdlVar);
            int i28 = ((iIntValue * (-30081)) - (~(iHashCode * Constant.ERROR_CODE_408))) - 1;
            int i29 = ~iHashCode;
            int i30 = i29 & i27;
            int i31 = (~i30) & (i29 | i27);
            int i32 = ~i27;
            int i33 = ~((i30 & i31) | (i31 ^ i30));
            int i34 = i27 & iIdentityHashCode;
            int i35 = (~i34) & (i27 | iIdentityHashCode);
            int i36 = ~iIdentityHashCode;
            int i37 = ~((i35 & i34) | (i35 ^ i34));
            int i38 = ((i33 & i37) | (i33 ^ i37)) * (-814);
            int i39 = i28 ^ i38;
            int i40 = ((i28 & i38) | i39) << 1;
            int i41 = -i39;
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            int i43 = (i29 | iHashCode) & i29;
            int i44 = (i36 | iIdentityHashCode) & i36;
            int i45 = i43 ^ i44;
            int i46 = i43 & i44;
            int i47 = ~((i46 & i45) | (i45 ^ i46));
            int i48 = (i32 | i27) & i32;
            int i49 = ~(i48 | iHashCode);
            int i50 = ((~i49) & i47) | ((~i47) & i49);
            int i51 = i47 & i49;
            int i52 = (i51 & i50) | (i50 ^ i51);
            int i53 = i27 ^ iIdentityHashCode;
            int i54 = ~((i53 & i34) | (i53 ^ i34));
            int i55 = ((i52 & i54) | (i52 ^ i54)) * 407;
            int i56 = i42 ^ i55;
            int i57 = (((i55 & i42) | i56) << 1) - i56;
            int i58 = ~((i48 ^ iHashCode) | (i48 & iHashCode));
            int i59 = i32 & iIdentityHashCode;
            int i60 = (~i59) & (i32 | iIdentityHashCode);
            int i61 = ~((i59 & i60) | (i60 ^ i59));
            int i62 = (i58 & i61) | (i58 ^ i61);
            int i63 = (iIdentityHashCode & iHashCode) | (iHashCode ^ iIdentityHashCode);
            int i64 = ~i63;
            int i65 = (i63 | i64) & i64;
            int i66 = i62 & i65;
            int i67 = (i65 | i62) & (~i66);
            int i68 = (i57 - (~(((i67 & i66) | (i67 ^ i66)) * 407))) - 1;
            int i69 = f54568s0 + 73;
            f54569t0 = i69 % 128;
            if (i69 % 2 == 0) {
                int i70 = 51 / 0;
            }
            objValueOf = Integer.valueOf(i68);
        } else {
            if (i22 == 3) {
                bdl bdlVar2 = (bdl) objArr[0];
                int i71 = f54568s0 + 9;
                f54569t0 = i71 % 128;
                int i72 = i71 % 2;
                try {
                    byte[] alwaysDrawnWithCacheEnabled = ((ahw) bab.setY(new Object[]{bdlVar2.f54570p0, bdlVar2.f54572r0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                    int i73 = f54569t0;
                    int i74 = (i73 ^ 55) + ((i73 & 55) << 1);
                    f54568s0 = i74 % 128;
                    int i75 = i74 % 2;
                    return alwaysDrawnWithCacheEnabled;
                } catch (IOException unused) {
                    return null;
                }
            }
            if (i22 == 4) {
                bdl bdlVar3 = (bdl) objArr[0];
                ahw ahwVar = (ahw) objArr[1];
                int i76 = f54568s0;
                int i77 = i76 | 121;
                int i78 = ((i77 << 1) - (~(-((~(i76 & 121)) & i77)))) - 1;
                f54569t0 = i78 % 128;
                int i79 = i78 % 2;
                bdlVar3.f54572r0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                aiw aiwVar = (aiw) ahw.setX(new Object[]{ahwVar}, 1453337808, -1453337802, System.identityHashCode(ahwVar));
                avu avuVar = (avu) avu.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, -1683941502, 1683941502, (int) System.currentTimeMillis());
                aiw aiwVar2 = (aiw) avu.setX(new Object[]{avuVar}, 1408999976, -1408999973, System.identityHashCode(avuVar));
                bdlVar3.f54571q0 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                bdlVar3.f54570p0 = (bbc) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                int i80 = f54568s0 + 73;
                f54569t0 = i80 % 128;
                int i81 = i80 % 2;
                return null;
            }
            if (i22 == 5) {
                int i82 = f54568s0 + 17;
                f54569t0 = i82 % 128;
                if (i82 % 2 != 0) {
                    return "XMSS";
                }
                throw null;
            }
            bdl bdlVar4 = (bdl) objArr[0];
            Object obj = objArr[1];
            int i83 = f54569t0;
            int i84 = i83 + 39;
            int i85 = i84 % 128;
            f54568s0 = i85;
            int i86 = i84 % 2;
            if (obj == bdlVar4) {
                int i87 = (i85 & 72) + (i85 | 72);
                int i88 = (i87 ^ (-1)) + (i87 << 1);
                int i89 = i88 % 128;
                f54569t0 = i89;
                int i90 = i88 % 2;
                int i91 = i89 + 5;
                f54568s0 = i91 % 128;
                if (i91 % 2 != 0) {
                    throw null;
                }
            } else {
                if (obj instanceof bdl) {
                    int i92 = i83 & 79;
                    int i93 = (~i92) & (i83 | 79);
                    int i94 = i92 << 1;
                    int i95 = (i93 & i94) + (i94 | i93);
                    f54568s0 = i95 % 128;
                    int i96 = i95 % 2;
                    bdl bdlVar5 = (bdl) obj;
                    adu aduVar = bdlVar4.f54571q0;
                    if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, bdlVar5.f54571q0}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                        int i97 = f54569t0;
                        int i98 = (i97 ^ 4) + ((i97 & 4) << 1);
                        int i99 = (i98 ^ (-1)) + (i98 << 1);
                        f54568s0 = i99 % 128;
                        int i100 = i99 % 2;
                        bbc bbcVar2 = bdlVar4.f54570p0;
                        byte[] bArr = (byte[]) bbc.setX(new Object[]{bbcVar2}, 983815655, -983815654, System.identityHashCode(bbcVar2));
                        bbc bbcVar3 = bdlVar5.f54570p0;
                        if (!(!((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) bbc.setX(new Object[]{bbcVar3}, 983815655, -983815654, System.identityHashCode(bbcVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue())) {
                            int i101 = f54568s0 + 79;
                            int i102 = i101 % 128;
                            f54569t0 = i102;
                            int i103 = i101 % 2;
                            int i104 = (i102 & 81) + (i102 | 81);
                            f54568s0 = i104 % 128;
                            int i105 = i104 % 2;
                        }
                    }
                    int i106 = f54568s0;
                    int i107 = ((i106 ^ 36) + ((i106 & 36) << 1)) - 1;
                    f54569t0 = i107 % 128;
                    int i108 = i107 % 2;
                } else {
                    int i109 = (i85 ^ 17) + ((i85 & 17) << 1);
                    f54569t0 = i109 % 128;
                    if (i109 % 2 == 0) {
                        throw null;
                    }
                }
                objValueOf = Boolean.FALSE;
            }
            objValueOf = Boolean.TRUE;
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54568s0;
        int i11 = i10 & 5;
        int i12 = -(-((i10 ^ 5) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54569t0 = i13 % 128;
        int i14 = i13 % 2;
        objectOutputStream.defaultWriteObject();
        if (i14 == 0) {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1599314141, 1599314144, System.identityHashCode(this)));
            int i15 = 65 / 0;
        } else {
            objectOutputStream.writeObject((byte[]) setDividerPadding(new Object[]{this}, -1599314141, 1599314144, System.identityHashCode(this)));
        }
        int i16 = f54569t0;
        int i17 = (i16 ^ 104) + ((i16 & 104) << 1);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        f54568s0 = i18 % 128;
        int i19 = i18 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1600973127, -1600973127, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setDividerPadding(new Object[]{this}, 2068159383, -2068159378, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1599314141, 1599314144, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setDividerPadding(new Object[]{this}, 1238787864, -1238787863, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -40278495, 40278497, System.identityHashCode(this))).intValue();
    }
}
