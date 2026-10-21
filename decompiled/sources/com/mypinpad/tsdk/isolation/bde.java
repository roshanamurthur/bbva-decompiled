package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bde implements bca, PrivateKey {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54546s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54547t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient adu f54548p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient baz f54549q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient aee f54550r0;

    public bde(ahw ahwVar) throws IOException {
        setX(new Object[]{this, ahwVar}, 1332631010, -1332631010, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54546s0;
        int i11 = (i10 & 35) + (i10 | 35);
        f54547t0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        setX(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, 1332631010, -1332631010, System.identityHashCode(this));
        int i13 = f54546s0;
        int i14 = (i13 & (-90)) | ((~i13) & 89);
        int i15 = -(-((i13 & 89) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f54547t0 = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (i14 * 701) + ((i13 | i11) * (-701)) + ((~(i13 | i14)) * 701) + (i11 * 702) + (i10 * (-700));
        if (i15 == 1) {
            bde bdeVar = (bde) objArr[0];
            int i16 = f54547t0 + 107;
            f54546s0 = i16 % 128;
            int i17 = i16 % 2;
            int iHashCode = bdeVar.f54548p0.hashCode();
            baz bazVar = bdeVar.f54549q0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 1883648572, -1883648570, System.identityHashCode(bazVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i18 = iIntValue * 37;
            int iIdentityHashCode = System.identityHashCode(bdeVar);
            int i19 = iIntValue * 13727;
            int i20 = -(~(iHashCode * 371));
            int i21 = (-2) - (((i19 ^ i20) + ((i19 & i20) << 1)) ^ (-1));
            int i22 = ~iHashCode;
            int i23 = i22 & (i22 | iHashCode);
            int i24 = ~iIdentityHashCode;
            int i25 = (i23 ^ i24) | (i23 & i24);
            int i26 = ~i25;
            int i27 = (i25 | i26) & i26;
            int i28 = ~i18;
            int i29 = i28 & i24;
            int i30 = ((~i28) & iIdentityHashCode) | i29;
            int i31 = i28 & iIdentityHashCode;
            int i32 = (i30 & i31) | (i30 ^ i31);
            int i33 = ~i32;
            int i34 = (i32 | i33) & i33;
            int i35 = i27 & i34;
            int i36 = (i27 | i34) & (~i35);
            int i37 = -(-(((i36 & i35) | (i36 ^ i35)) * (-370)));
            int i38 = i21 ^ i37;
            int i39 = ((i21 & i37) | i38) << 1;
            int i40 = -i38;
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            int i42 = i28 ^ i24;
            int i43 = (i42 & i29) | (i42 ^ i29);
            int i44 = ~i43;
            int i45 = (i43 | i44) & i44;
            int i46 = i23 ^ iIdentityHashCode;
            int i47 = iIdentityHashCode & i23;
            int i48 = ~((i47 & i46) | (i46 ^ i47));
            int i49 = i45 & i48;
            int i50 = (i45 | i48) & (~i49);
            int i51 = (i50 & i49) | (i50 ^ i49);
            int i52 = i18 ^ iHashCode;
            int i53 = i18 & iHashCode;
            int i54 = ~((i52 & i53) | (i52 ^ i53));
            int i55 = i51 ^ i54;
            int i56 = i51 & i54;
            int i57 = ((i56 & i55) | (i55 ^ i56)) * (-370);
            int i58 = i41 & i57;
            int i59 = (((i41 ^ i57) | i58) << 1) - ((i57 | i41) & (~i58));
            int i60 = (~i53) & (i18 | iHashCode);
            int i61 = ((~((i60 & i53) | (i60 ^ i53))) * 370) + i59;
            int i62 = f54546s0;
            int i63 = (i62 & 13) + (i62 | 13);
            f54547t0 = i63 % 128;
            if (i63 % 2 != 0) {
                return Integer.valueOf(i61);
            }
            throw null;
        }
        if (i15 == 2) {
            int i64 = f54547t0 + 21;
            f54546s0 = i64 % 128;
            if (i64 % 2 == 0) {
                return "PKCS#8";
            }
            throw null;
        }
        if (i15 == 3) {
            bde bdeVar2 = (bde) objArr[0];
            int i65 = f54547t0 + 44;
            int i66 = (i65 ^ (-1)) + (i65 << 1);
            f54546s0 = i66 % 128;
            try {
                if (i66 % 2 == 0) {
                    return ((ahw) bab.setY(new Object[]{bdeVar2.f54549q0, bdeVar2.f54550r0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                }
                ((ahw) bab.setY(new Object[]{bdeVar2.f54549q0, bdeVar2.f54550r0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                throw null;
            } catch (IOException unused) {
            }
        } else {
            if (i15 == 4) {
                bde bdeVar3 = (bde) objArr[0];
                Object obj = objArr[1];
                int i67 = f54547t0;
                int i68 = ((i67 ^ 35) | (i67 & 35)) << 1;
                int i69 = -((i67 & (-36)) | ((~i67) & 35));
                int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                int i71 = i70 % 128;
                f54546s0 = i71;
                int i72 = i70 % 2;
                if (obj == bdeVar3) {
                    int i73 = ((i71 ^ 64) + ((i71 & 64) << 1)) - 1;
                    f54547t0 = i73 % 128;
                    boolValueOf = Boolean.valueOf(i73 % 2 != 0);
                } else {
                    if (obj instanceof bde) {
                        int i74 = i67 & 67;
                        int i75 = ((i67 | 67) & (~i74)) + (i74 << 1);
                        f54546s0 = i75 % 128;
                        int i76 = i75 % 2;
                        bde bdeVar4 = (bde) obj;
                        adu aduVar = bdeVar3.f54548p0;
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, bdeVar4.f54548p0}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
                            int i77 = f54546s0;
                            int i78 = ((i77 & (-118)) | ((~i77) & 117)) + ((i77 & 117) << 1);
                            f54547t0 = i78 % 128;
                            if (i78 % 2 == 0) {
                                baz bazVar2 = bdeVar3.f54549q0;
                                byte[] bArr = (byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar2}, 1883648572, -1883648570, System.identityHashCode(bazVar2));
                                baz bazVar3 = bdeVar4.f54549q0;
                                ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar3}, 1883648572, -1883648570, System.identityHashCode(bazVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                                throw null;
                            }
                            baz bazVar4 = bdeVar3.f54549q0;
                            byte[] bArr2 = (byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar4}, 1883648572, -1883648570, System.identityHashCode(bazVar4));
                            baz bazVar5 = bdeVar4.f54549q0;
                            if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) baz.setCompoundDrawableTintBlendMode(new Object[]{bazVar5}, 1883648572, -1883648570, System.identityHashCode(bazVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                                System.identityHashCode(bdeVar3);
                                System.identityHashCode(bdeVar3);
                                boolValueOf = Boolean.TRUE;
                            }
                        }
                        int i79 = f54547t0;
                        int i80 = i79 & 35;
                        int i81 = (i79 | 35) & (~i80);
                        int i82 = -(-(i80 << 1));
                        int i83 = (i81 & i82) + (i81 | i82);
                        f54546s0 = i83 % 128;
                        int i84 = i83 % 2;
                    } else {
                        int i85 = i71 & 111;
                        int i86 = -(-((i71 ^ 111) | i85));
                        int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                        f54547t0 = i87 % 128;
                        if (i87 % 2 == 0) {
                            throw null;
                        }
                    }
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            }
            if (i15 == 5) {
                int i88 = f54546s0;
                int i89 = (i88 ^ 53) + ((i88 & 53) << 1);
                f54547t0 = i89 % 128;
                int i90 = i89 % 2;
                int i91 = i88 + 90;
                int i92 = (i91 ^ (-1)) + (i91 << 1);
                f54547t0 = i92 % 128;
                int i93 = i92 % 2;
                return "XMSSMT";
            }
            bde bdeVar5 = (bde) objArr[0];
            ahw ahwVar = (ahw) objArr[1];
            int i94 = f54547t0;
            int i95 = i94 ^ 25;
            int i96 = (((i94 & 25) | i95) << 1) - i95;
            f54546s0 = i96 % 128;
            if (i96 % 2 != 0) {
                bdeVar5.f54550r0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                aiw aiwVar = (aiw) ahw.setX(new Object[]{ahwVar}, 1453337808, -1453337802, System.identityHashCode(ahwVar));
                avz avzVar = (avz) avz.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, -366821983, 366821987, (int) System.currentTimeMillis());
                aiw aiwVar2 = (aiw) avz.setX(new Object[]{avzVar}, -1861972624, 1861972624, System.identityHashCode(avzVar));
                bdeVar5.f54548p0 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                bdeVar5.f54549q0 = (baz) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                int i97 = 60 / 0;
            } else {
                bdeVar5.f54550r0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                aiw aiwVar3 = (aiw) ahw.setX(new Object[]{ahwVar}, 1453337808, -1453337802, System.identityHashCode(ahwVar));
                avz avzVar2 = (avz) avz.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar3}, -513456911, 513456913, System.identityHashCode(aiwVar3))}, -366821983, 366821987, (int) System.currentTimeMillis());
                aiw aiwVar4 = (aiw) avz.setX(new Object[]{avzVar2}, -1861972624, 1861972624, System.identityHashCode(avzVar2));
                bdeVar5.f54548p0 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar4}, -661220858, 661220861, System.identityHashCode(aiwVar4));
                bdeVar5.f54549q0 = (baz) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
            }
        }
        return null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54547t0 + 3;
        f54546s0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        if (i11 != 0) {
            objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, 1498088822, -1498088819, System.identityHashCode(this)));
            throw null;
        }
        objectOutputStream.writeObject((byte[]) setX(new Object[]{this}, 1498088822, -1498088819, System.identityHashCode(this)));
        int i12 = f54547t0;
        int i13 = i12 & 33;
        int i14 = -(-((i12 ^ 33) | i13));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f54546s0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1757700326, 1757700330, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setX(new Object[]{this}, 826452397, -826452392, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setX(new Object[]{this}, 1498088822, -1498088819, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setX(new Object[]{this}, 97165744, -97165742, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 727444308, -727444307, System.identityHashCode(this))).intValue();
    }
}
