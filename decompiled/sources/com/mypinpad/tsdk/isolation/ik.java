package com.mypinpad.tsdk.isolation;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56465a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56466b = 1;

    @Nullable
    public static in setCompoundDrawableTintBlendMode(@NotNull im imVar, @NotNull dg dgVar, @NotNull byte[] bArr, @NotNull setContentDescription setcontentdescription, boolean z10) {
        return (in) setOnFocusChangeListener(new Object[]{imVar, dgVar, bArr, setcontentdescription, Boolean.valueOf(z10)}, -1531256370, 1531256371, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0621  */
    /* JADX WARN: Code duplicated, block: B:102:0x0635  */
    /* JADX WARN: Code duplicated, block: B:103:0x064b  */
    /* JADX WARN: Code duplicated, block: B:105:0x064d  */
    /* JADX WARN: Code duplicated, block: B:108:0x068f  */
    /* JADX WARN: Code duplicated, block: B:109:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:112:0x0742  */
    /* JADX WARN: Code duplicated, block: B:114:0x081a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0834  */
    /* JADX WARN: Code duplicated, block: B:119:0x0839  */
    /* JADX WARN: Code duplicated, block: B:120:0x0850  */
    /* JADX WARN: Code duplicated, block: B:122:0x085e  */
    /* JADX WARN: Code duplicated, block: B:33:0x019f  */
    /* JADX WARN: Code duplicated, block: B:35:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x020a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0218  */
    /* JADX WARN: Code duplicated, block: B:40:0x021a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0250  */
    /* JADX WARN: Code duplicated, block: B:46:0x0276  */
    /* JADX WARN: Code duplicated, block: B:48:0x0278  */
    /* JADX WARN: Code duplicated, block: B:83:0x04fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0569  */
    /* JADX WARN: Code duplicated, block: B:91:0x057b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0580  */
    /* JADX WARN: Code duplicated, block: B:96:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:97:0x05e4  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        in inVar;
        byte[][] bArr;
        getBeepOnFailure getbeeponfailure;
        byte[] bArr2;
        getBeepOnFailure getbeeponfailure2;
        byte[] bArr3;
        getBeepOnFailure getbeeponfailure3;
        byte[] bArr4;
        getBeepOnFailure getbeeponfailure4;
        byte[] bArr5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte[] bArr6;
        byte[] bArr7;
        String str;
        int i22;
        int i23;
        int i24;
        int i25 = ~i10;
        int i26 = ~i12;
        int i27 = i25 | i26;
        int i28 = ~(i27 | i11);
        int i29 = ~i11;
        int i30 = i26 | i29;
        if (((i10 | i11) * 184) + (((~(i25 | i29)) | (~i27) | (~i30)) * 184) + ((i28 | (~(i30 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183)) != 1) {
            im imVar = (im) objArr[0];
            dg dgVar = (dg) objArr[1];
            byte[] bArr8 = (byte[]) objArr[2];
            setContentDescription setcontentdescription = (setContentDescription) objArr[3];
            int i31 = f56465a;
            int i32 = i31 & 67;
            int i33 = ((~i32) & (i31 | 67)) + (i32 << 1);
            f56466b = i33 % 128;
            int i34 = i33 % 2;
            Intrinsics.checkNotNullParameter(imVar, "");
            Intrinsics.checkNotNullParameter(dgVar, "");
            Intrinsics.checkNotNullParameter(bArr8, "");
            Intrinsics.checkNotNullParameter(setcontentdescription, "");
            dj.setY sety = dj.setY;
            dj djVar = (dj) dj.setY.setX(new Object[]{imVar, setcontentdescription, dgVar}, 1210480347, -1210480347, (int) System.currentTimeMillis());
            if (djVar == null) {
                int i35 = f56466b;
                int i36 = i35 & 93;
                int i37 = (i35 ^ 93) | i36;
                int i38 = (i36 & i37) + (i37 | i36);
                f56465a = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 57 / 0;
                }
            } else if (bArr8.length != ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar))).length) {
                int i40 = f56466b + 113;
                f56465a = i40 % 128;
                if (i40 % 2 != 0) {
                    throw null;
                }
            } else {
                dw dwVar = new dw((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr8, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2055662065, 2055662076, System.identityHashCode(djVar))}, -1375611456, 1375611456, (int) System.currentTimeMillis()));
                if (((Byte) dw.setX(new Object[]{dwVar}, 1856901440, -1856901438, System.identityHashCode(dwVar))).byteValue() != 106) {
                    int i41 = f56466b;
                    int i42 = ((i41 | 53) << 1) - (i41 ^ 53);
                    f56465a = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 48 / 0;
                    }
                } else if (((Byte) dw.setX(new Object[]{dwVar}, 1316271760, -1316271760, System.identityHashCode(dwVar))).byteValue() != 3) {
                    int i44 = f56465a;
                    int i45 = ((i44 & 116) + (i44 | 116)) - 1;
                    f56466b = i45 % 128;
                    int i46 = i45 % 2;
                    if (((Byte) dw.setX(new Object[]{dwVar}, 1316271760, -1316271760, System.identityHashCode(dwVar))).byteValue() != 5) {
                        int i47 = f56465a;
                        int i48 = i47 & 29;
                        int i49 = i48 + ((i47 ^ 29) | i48);
                        f56466b = i49 % 128;
                        int i50 = i49 % 2;
                        if (((Byte) dw.setX(new Object[]{dwVar}, 1316271760, -1316271760, System.identityHashCode(dwVar))).byteValue() != -107) {
                            int i51 = f56465a;
                            int i52 = (i51 & 89) + (i51 | 89);
                            int i53 = i52 % 128;
                            f56466b = i53;
                            int i54 = i52 % 2;
                            int i55 = i53 + 93;
                            f56465a = i55 % 128;
                            if (i55 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            bArr6 = (byte[]) dy.setDividerPadding(new Object[]{(byte[]) dw.setX(new Object[]{dwVar, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar}, -854811249, 854811301, System.identityHashCode(imVar))}, 556876150, -556876142, System.identityHashCode(dwVar))}, 504323118, -504323118, (int) System.currentTimeMillis());
                            bArr7 = (byte[]) dw.setX(new Object[]{dwVar}, 184917073, -184917067, System.identityHashCode(dwVar));
                            if (bArr7 == null) {
                                int i56 = f56466b;
                                i23 = ((i56 & 104) + (i56 | 104)) - 1;
                                i24 = i23 % 128;
                                f56465a = i24;
                                if (i23 % 2 != 0) {
                                    throw null;
                                }
                                int i57 = ((i24 ^ 110) + ((i24 & 110) << 1)) - 1;
                                f56466b = i57 % 128;
                                int i58 = i57 % 2;
                                str = null;
                            } else {
                                str = (String) setInputExtras.setDividerPadding(new Object[]{bArr7}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                                int i59 = f56465a;
                                int i60 = (i59 | 25) << 1;
                                int i61 = -(i59 ^ 25);
                                int i62 = (i60 & i61) + (i61 | i60);
                                f56466b = i62 % 128;
                                int i63 = i62 % 2;
                            }
                            if (!(!Intrinsics.areEqual(str, (String) setInputExtras.setDividerPadding(new Object[]{bArr6}, 1609250238, -1609250236, (int) System.currentTimeMillis())))) {
                                byte[] bArr9 = (byte[]) dw.setX(new Object[]{dwVar}, 1681307825, -1681307822, System.identityHashCode(dwVar));
                                int i64 = f56465a;
                                int i65 = (((i64 & (-2)) | ((~i64) & 1)) - (~(-(-((i64 & 1) << 1))))) - 1;
                                f56466b = i65 % 128;
                                int i66 = i65 % 2;
                                return bArr9;
                            }
                            int i67 = f56466b;
                            int i68 = i67 & 89;
                            int i69 = ((i67 ^ 89) | i68) << 1;
                            int i70 = -((i67 | 89) & (~i68));
                            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                            int i72 = i71 % 128;
                            f56465a = i72;
                            int i73 = i71 % 2;
                            i22 = ((i72 & 122) + (i72 | 122)) - 1;
                            f56466b = i22 % 128;
                            if (i22 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else {
                        bArr6 = (byte[]) dy.setDividerPadding(new Object[]{(byte[]) dw.setX(new Object[]{dwVar, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar}, -854811249, 854811301, System.identityHashCode(imVar))}, 556876150, -556876142, System.identityHashCode(dwVar))}, 504323118, -504323118, (int) System.currentTimeMillis());
                        bArr7 = (byte[]) dw.setX(new Object[]{dwVar}, 184917073, -184917067, System.identityHashCode(dwVar));
                        if (bArr7 == null) {
                            int i510 = f56466b;
                            i23 = ((i510 & 104) + (i510 | 104)) - 1;
                            i24 = i23 % 128;
                            f56465a = i24;
                            if (i23 % 2 != 0) {
                                throw null;
                            }
                            int i511 = ((i24 ^ 110) + ((i24 & 110) << 1)) - 1;
                            f56466b = i511 % 128;
                            int i512 = i511 % 2;
                            str = null;
                        } else {
                            str = (String) setInputExtras.setDividerPadding(new Object[]{bArr7}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                            int i513 = f56465a;
                            int i610 = (i513 | 25) << 1;
                            int i611 = -(i513 ^ 25);
                            int i612 = (i610 & i611) + (i611 | i610);
                            f56466b = i612 % 128;
                            int i613 = i612 % 2;
                        }
                        if (!(!Intrinsics.areEqual(str, (String) setInputExtras.setDividerPadding(new Object[]{bArr6}, 1609250238, -1609250236, (int) System.currentTimeMillis())))) {
                            byte[] bArr10 = (byte[]) dw.setX(new Object[]{dwVar}, 1681307825, -1681307822, System.identityHashCode(dwVar));
                            int i614 = f56465a;
                            int i615 = (((i614 & (-2)) | ((~i614) & 1)) - (~(-(-((i614 & 1) << 1))))) - 1;
                            f56466b = i615 % 128;
                            int i616 = i615 % 2;
                            return bArr10;
                        }
                        int i617 = f56466b;
                        int i618 = i617 & 89;
                        int i619 = ((i617 ^ 89) | i618) << 1;
                        int i74 = -((i617 | 89) & (~i618));
                        int i75 = ((i619 | i74) << 1) - (i74 ^ i619);
                        int i76 = i75 % 128;
                        f56465a = i76;
                        int i77 = i75 % 2;
                        i22 = ((i76 & 122) + (i76 | 122)) - 1;
                        f56466b = i22 % 128;
                        if (i22 % 2 == 0) {
                            throw null;
                        }
                    }
                } else {
                    bArr6 = (byte[]) dy.setDividerPadding(new Object[]{(byte[]) dw.setX(new Object[]{dwVar, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar}, -854811249, 854811301, System.identityHashCode(imVar))}, 556876150, -556876142, System.identityHashCode(dwVar))}, 504323118, -504323118, (int) System.currentTimeMillis());
                    bArr7 = (byte[]) dw.setX(new Object[]{dwVar}, 184917073, -184917067, System.identityHashCode(dwVar));
                    if (bArr7 == null) {
                        int i514 = f56466b;
                        i23 = ((i514 & 104) + (i514 | 104)) - 1;
                        i24 = i23 % 128;
                        f56465a = i24;
                        if (i23 % 2 != 0) {
                            throw null;
                        }
                        int i515 = ((i24 ^ 110) + ((i24 & 110) << 1)) - 1;
                        f56466b = i515 % 128;
                        int i516 = i515 % 2;
                        str = null;
                    } else {
                        str = (String) setInputExtras.setDividerPadding(new Object[]{bArr7}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                        int i517 = f56465a;
                        int i6110 = (i517 | 25) << 1;
                        int i6111 = -(i517 ^ 25);
                        int i6112 = (i6110 & i6111) + (i6111 | i6110);
                        f56466b = i6112 % 128;
                        int i6113 = i6112 % 2;
                    }
                    if (!(!Intrinsics.areEqual(str, (String) setInputExtras.setDividerPadding(new Object[]{bArr6}, 1609250238, -1609250236, (int) System.currentTimeMillis())))) {
                        byte[] bArr11 = (byte[]) dw.setX(new Object[]{dwVar}, 1681307825, -1681307822, System.identityHashCode(dwVar));
                        int i6114 = f56465a;
                        int i6115 = (((i6114 & (-2)) | ((~i6114) & 1)) - (~(-(-((i6114 & 1) << 1))))) - 1;
                        f56466b = i6115 % 128;
                        int i6116 = i6115 % 2;
                        return bArr11;
                    }
                    int i6117 = f56466b;
                    int i6118 = i6117 & 89;
                    int i6119 = ((i6117 ^ 89) | i6118) << 1;
                    int i78 = -((i6117 | 89) & (~i6118));
                    int i79 = ((i6119 | i78) << 1) - (i78 ^ i6119);
                    int i710 = i79 % 128;
                    f56465a = i710;
                    int i711 = i79 % 2;
                    i22 = ((i710 & 122) + (i710 | 122)) - 1;
                    f56466b = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                }
            }
        } else {
            im imVar2 = (im) objArr[0];
            dg dgVar2 = (dg) objArr[1];
            byte[] bArr12 = (byte[]) objArr[2];
            setContentDescription setcontentdescription2 = (setContentDescription) objArr[3];
            boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
            int i80 = f56466b;
            int i81 = ((i80 ^ 56) + ((i80 & 56) << 1)) - 1;
            f56465a = i81 % 128;
            int i82 = i81 % 2;
            Intrinsics.checkNotNullParameter(imVar2, "");
            Intrinsics.checkNotNullParameter(dgVar2, "");
            Intrinsics.checkNotNullParameter(bArr12, "");
            Intrinsics.checkNotNullParameter(setcontentdescription2, "");
            dj.setY sety2 = dj.setY;
            dj djVar2 = (dj) dj.setY.setX(new Object[]{imVar2, setcontentdescription2, dgVar2}, 1210480347, -1210480347, (int) System.currentTimeMillis());
            if (djVar2 == null) {
                int i83 = f56465a;
                int i84 = i83 & 111;
                int i85 = (((i83 ^ 111) | i84) << 1) - ((i83 | 111) & (~i84));
                f56466b = i85 % 128;
                int i86 = i85 % 2;
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20010, null, 6}, 1336485880, -1336485874, 20010);
                int i87 = f56465a;
                int i88 = (i87 ^ 85) + ((i87 & 85) << 1);
                f56466b = i88 % 128;
                int i89 = i88 % 2;
            } else {
                df.setDividerPadding setdividerpadding = df.setDividerPadding;
                df dfVar = (df) df.setDividerPadding.setOnFocusChangeListener(new Object[]{imVar2, setcontentdescription2, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar2}, -2004011430, 2004011432, System.identityHashCode(djVar2)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar2}, -2055662065, 2055662076, System.identityHashCode(djVar2))}, 969232069, -969232068, (int) System.currentTimeMillis());
                if (dfVar == null) {
                    int i90 = f56465a;
                    int i91 = ((i90 | 67) << 1) - (i90 ^ 67);
                    f56466b = i91 % 128;
                    if (i91 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{6149, null, 99}, 1336485880, -1336485874, 6149);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20012, null, 6}, 1336485880, -1336485874, 20012);
                    }
                } else if (bArr12.length != ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar))).length) {
                    int i92 = f56465a;
                    int i93 = i92 & 55;
                    int i94 = -(-(i92 | 55));
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    f56466b = i95 % 128;
                    int i96 = i95 % 2;
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20013, null, 6}, 1336485880, -1336485874, 20013);
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                } else {
                    dr drVar = new dr((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr12, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2055662065, 2055662076, System.identityHashCode(dfVar))}, -1375611456, 1375611456, (int) System.currentTimeMillis()));
                    if (((Byte) dr.setX(new Object[]{drVar}, 562516893, -562516887, System.identityHashCode(drVar))).byteValue() != -68) {
                        int i97 = f56466b;
                        int i98 = ((i97 ^ 13) | (i97 & 13)) << 1;
                        int i99 = -((i97 & (-14)) | ((~i97) & 13));
                        int i100 = (i98 ^ i99) + ((i98 & i99) << 1);
                        f56465a = i100 % 128;
                        if (i100 % 2 != 0) {
                            int i101 = 95 / 0;
                        }
                        int i102 = ((i97 & 38) + (i97 | 38)) - 1;
                        f56465a = i102 % 128;
                        if (i102 % 2 != 0) {
                            throw null;
                        }
                    } else if (((Byte) dr.setX(new Object[]{drVar}, -1465781391, 1465781396, System.identityHashCode(drVar))).byteValue() != 106) {
                        int i103 = f56466b;
                        int i104 = i103 & 103;
                        int i105 = ((i103 | 103) & (~i104)) + (i104 << 1);
                        f56465a = i105 % 128;
                        if (i105 % 2 != 0) {
                            throw null;
                        }
                    } else if (!(!zBooleanValue)) {
                        if (zBooleanValue) {
                            int i106 = f56466b;
                            int i107 = (((i106 & (-90)) | ((~i106) & 89)) - (~(-(-((i106 & 89) << 1))))) - 1;
                            f56465a = i107 % 128;
                            int i108 = i107 % 2;
                            if (((Byte) dr.setX(new Object[]{drVar}, 640139105, -640139096, System.identityHashCode(drVar))).byteValue() != -107) {
                                int i109 = f56465a;
                                i21 = (i109 & 9) + (i109 | 9);
                                f56466b = i21 % 128;
                                if (i21 % 2 == 0) {
                                    i17 = 65;
                                    int i110 = i17 / 0;
                                }
                            }
                        }
                        inVar = new in(drVar.setDividerPadding());
                        bArr = new byte[4][];
                        setAnimation setanimation = setAnimation.INSTANCE;
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                        if (getbeeponfailure == null) {
                            int i111 = f56466b;
                            int i112 = i111 & 67;
                            int i113 = (i111 ^ 67) | i112;
                            i20 = (i112 & i113) + (i113 | i112);
                            f56465a = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i114 = 43 / 0;
                            }
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                            int i115 = f56466b;
                            int i116 = ((i115 | 31) << 1) - (i115 ^ 31);
                            f56465a = i116 % 128;
                            int i117 = i116 % 2;
                        }
                        bArr[0] = bArr2;
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                        if (getbeeponfailure2 == null) {
                            int i118 = f56465a;
                            int i119 = i118 & 29;
                            int i120 = i118 ^ 29;
                            int i121 = -(-(i120 | i119));
                            int i122 = (i119 & i121) + (i121 | i119);
                            f56466b = i122 % 128;
                            int i123 = i122 % 2;
                            int i124 = -(-(i119 << 1));
                            int i125 = (i120 ^ i124) + ((i120 & i124) << 1);
                            f56466b = i125 % 128;
                            int i126 = i125 % 2;
                            bArr3 = null;
                        } else {
                            bArr3 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i127 = f56465a;
                            int i128 = (((i127 & (-126)) | (125 & (~i127))) - (~(-(-((i127 & 125) << 1))))) - 1;
                            f56466b = i128 % 128;
                            int i129 = i128 % 2;
                        }
                        bArr[1] = bArr3;
                        getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, setAnimation.setPersistentDrawingCache()}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                        if (getbeeponfailure3 == null) {
                            i18 = f56466b;
                            int i130 = i18 ^ 35;
                            int i131 = -(-((i18 & 35) << 1));
                            i19 = (i130 & i131) + (i130 | i131);
                            f56465a = i19 % 128;
                            if (i19 % 2 == 0) {
                                throw null;
                            }
                            int i132 = i18 & 119;
                            int i133 = (i18 | 119) & (~i132);
                            int i134 = -(-(i132 << 1));
                            int i135 = (i133 ^ i134) + ((i133 & i134) << 1);
                            f56465a = i135 % 128;
                            int i136 = i135 % 2;
                            bArr4 = null;
                        } else {
                            bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                            int i137 = f56466b;
                            int i138 = (i137 & 119) + (i137 | 119);
                            f56465a = i138 % 128;
                            int i139 = i138 % 2;
                        }
                        bArr[2] = bArr4;
                        getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                        if (getbeeponfailure4 == null) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            int i140 = f56466b;
                            int i141 = (((i140 | 82) << 1) - (i140 ^ 82)) - 1;
                            f56465a = i141 % 128;
                            int i142 = i141 % 2;
                            bArr5 = null;
                        } else {
                            bArr5 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4));
                            int i143 = f56466b;
                            int i144 = (i143 & 3) + (i143 | 3);
                            f56465a = i144 % 128;
                            int i145 = i144 % 2;
                        }
                        bArr[3] = bArr5;
                        if (!Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar}, -845228896, 845228903, System.identityHashCode(drVar))}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dy.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{CollectionsKt__CollectionsKt.listOf((Object[]) bArr)}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1014006140, 1014006148, System.identityHashCode(drVar))}, 504323118, -504323118, (int) System.currentTimeMillis())}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                            int i146 = f56465a;
                            int i147 = i146 & 35;
                            int i148 = ((((i146 ^ 35) | i147) << 1) - (~(-((i146 | 35) & (~i147))))) - 1;
                            f56466b = i148 % 128;
                            int i149 = i148 % 2;
                            return inVar;
                        }
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i150 = ~iCurrentTimeMillis;
                        int i151 = 1786130212 & i150;
                        int i152 = ((-1786130213) & iCurrentTimeMillis) | i151;
                        int i153 = iCurrentTimeMillis & 1786130212;
                        int i154 = ~((i153 & i152) | (i152 ^ i153));
                        int i155 = 161474818 & i154;
                        int i156 = -(-((((i154 | 161474818) & (~i155)) | i155) * (-964)));
                        int i157 = (-452342772) & i156;
                        int i158 = i156 | (-452342772);
                        int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                        int i160 = ((~i150) & 1786130212) | (i150 & (-1786130213));
                        int i161 = (i160 & i151) | (i160 ^ i151);
                        int i162 = ~i161;
                        int i163 = (i161 | i162) & i162;
                        int i164 = i163 & 25804802;
                        int i165 = (i163 | 25804802) & (~i164);
                        int i166 = -(~(-(-(((i165 & i164) | (i165 ^ i164)) * (-964)))));
                        i13 = (-2) - (((i159 & i166) + (i166 | i159)) ^ (-1));
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i167 = ~iCurrentTimeMillis2;
                        int i168 = (-542921) ^ i167;
                        int i169 = (-542921) & i167;
                        int i170 = -(~(((i169 & i168) | (i168 ^ i169)) * (-369)));
                        int i171 = (-2) - (((1492121500 & i170) + (i170 | 1492121500)) ^ (-1));
                        int i172 = (i167 | iCurrentTimeMillis2) & i167;
                        int i173 = 543704 ^ i172;
                        int i174 = i172 & 543704;
                        int i175 = (i174 & i173) | (i173 ^ i174);
                        int i176 = ~i175;
                        int i177 = (i175 | i176) & i176;
                        int i178 = ((~i177) & (-2026826985)) | (i177 & 2026826984);
                        int i179 = i177 & (-2026826985);
                        int i180 = ((i179 & i178) | (i178 ^ i179)) * (-369);
                        int i181 = (i171 ^ i180) + ((i171 & i180) << 1);
                        int i182 = (-543705) & i167;
                        int i183 = (~((iCurrentTimeMillis2 & (-543705)) | (iCurrentTimeMillis2 & 543704) | i182)) | 784;
                        int i184 = (i167 & 543704) | ((~i167) & 543704) | i182;
                        int i185 = ~((i184 & (-2026826985)) | (i184 & 2026826984) | ((~i184) & (-2026826985)));
                        int i186 = ((~i185) & i183) | ((~i183) & i185);
                        int i187 = i183 & i185;
                        int i188 = -(-(((i187 & i186) | (i186 ^ i187)) * 369));
                        i14 = ((i181 ^ i188) | (i181 & i188)) << 1;
                        i15 = -((i188 & (~i181)) | ((~i188) & i181));
                        if (i13 <= ((i14 | i15) << 1) - (i15 ^ i14)) {
                            int i189 = 62 / 0;
                        }
                        int i190 = f56466b;
                        int i191 = i190 & 107;
                        int i192 = (i190 | 107) & (~i191);
                        int i193 = -(-(i191 << 1));
                        i16 = ((i192 | i193) << 1) - (i192 ^ i193);
                        f56465a = i16 % 128;
                        if (i16 % 2 != 0) {
                            i17 = 47;
                            int i1110 = i17 / 0;
                        }
                    } else {
                        int i194 = f56466b;
                        int i195 = i194 & 5;
                        int i196 = -(-((i194 ^ 5) | i195));
                        int i197 = (i195 & i196) + (i196 | i195);
                        f56465a = i197 % 128;
                        int i198 = i197 % 2;
                        if (((Byte) dr.setX(new Object[]{drVar}, 640139105, -640139096, System.identityHashCode(drVar))).byteValue() == 5) {
                            if (zBooleanValue) {
                                int i1010 = f56466b;
                                int i1011 = (((i1010 & (-90)) | ((~i1010) & 89)) - (~(-(-((i1010 & 89) << 1))))) - 1;
                                f56465a = i1011 % 128;
                                int i1012 = i1011 % 2;
                                if (((Byte) dr.setX(new Object[]{drVar}, 640139105, -640139096, System.identityHashCode(drVar))).byteValue() != -107) {
                                    int i1013 = f56465a;
                                    i21 = (i1013 & 9) + (i1013 | 9);
                                    f56466b = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        i17 = 65;
                                        int i1111 = i17 / 0;
                                    }
                                }
                            }
                            inVar = new in(drVar.setDividerPadding());
                            bArr = new byte[4][];
                            setAnimation setanimation2 = setAnimation.INSTANCE;
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                            if (getbeeponfailure == null) {
                                int i1112 = f56466b;
                                int i1113 = i1112 & 67;
                                int i1114 = (i1112 ^ 67) | i1113;
                                i20 = (i1113 & i1114) + (i1114 | i1113);
                                f56465a = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i1115 = 43 / 0;
                                }
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                                int i1116 = f56466b;
                                int i1117 = ((i1116 | 31) << 1) - (i1116 ^ 31);
                                f56465a = i1117 % 128;
                                int i1118 = i1117 % 2;
                            }
                            bArr[0] = bArr2;
                            getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                            if (getbeeponfailure2 == null) {
                                int i1119 = f56465a;
                                int i1120 = i1119 & 29;
                                int i1210 = i1119 ^ 29;
                                int i1211 = -(-(i1210 | i1120));
                                int i1212 = (i1120 & i1211) + (i1211 | i1120);
                                f56466b = i1212 % 128;
                                int i1213 = i1212 % 2;
                                int i1214 = -(-(i1120 << 1));
                                int i1215 = (i1210 ^ i1214) + ((i1210 & i1214) << 1);
                                f56466b = i1215 % 128;
                                int i1216 = i1215 % 2;
                                bArr3 = null;
                            } else {
                                bArr3 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                                int i1217 = f56465a;
                                int i1218 = (((i1217 & (-126)) | (125 & (~i1217))) - (~(-(-((i1217 & 125) << 1))))) - 1;
                                f56466b = i1218 % 128;
                                int i1219 = i1218 % 2;
                            }
                            bArr[1] = bArr3;
                            getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, setAnimation.setPersistentDrawingCache()}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                            if (getbeeponfailure3 == null) {
                                i18 = f56466b;
                                int i1310 = i18 ^ 35;
                                int i1311 = -(-((i18 & 35) << 1));
                                i19 = (i1310 & i1311) + (i1310 | i1311);
                                f56465a = i19 % 128;
                                if (i19 % 2 == 0) {
                                    throw null;
                                }
                                int i1312 = i18 & 119;
                                int i1313 = (i18 | 119) & (~i1312);
                                int i1314 = -(-(i1312 << 1));
                                int i1315 = (i1313 ^ i1314) + ((i1313 & i1314) << 1);
                                f56465a = i1315 % 128;
                                int i1316 = i1315 % 2;
                                bArr4 = null;
                            } else {
                                bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                                int i1317 = f56466b;
                                int i1318 = (i1317 & 119) + (i1317 | 119);
                                f56465a = i1318 % 128;
                                int i1319 = i1318 % 2;
                            }
                            bArr[2] = bArr4;
                            getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar2, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(imVar2));
                            if (getbeeponfailure4 == null) {
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                                int i1410 = f56466b;
                                int i1411 = (((i1410 | 82) << 1) - (i1410 ^ 82)) - 1;
                                f56465a = i1411 % 128;
                                int i1412 = i1411 % 2;
                                bArr5 = null;
                            } else {
                                bArr5 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4));
                                int i1413 = f56466b;
                                int i1414 = (i1413 & 3) + (i1413 | 3);
                                f56465a = i1414 % 128;
                                int i1415 = i1414 % 2;
                            }
                            bArr[3] = bArr5;
                            if (!Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar}, -845228896, 845228903, System.identityHashCode(drVar))}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dy.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{CollectionsKt__CollectionsKt.listOf((Object[]) bArr)}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1014006140, 1014006148, System.identityHashCode(drVar))}, 504323118, -504323118, (int) System.currentTimeMillis())}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                int i1416 = f56465a;
                                int i1417 = i1416 & 35;
                                int i1418 = ((((i1416 ^ 35) | i1417) << 1) - (~(-((i1416 | 35) & (~i1417))))) - 1;
                                f56466b = i1418 % 128;
                                int i1419 = i1418 % 2;
                                return inVar;
                            }
                            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                            int i1510 = ~iCurrentTimeMillis3;
                            int i1511 = 1786130212 & i1510;
                            int i1512 = ((-1786130213) & iCurrentTimeMillis3) | i1511;
                            int i1513 = iCurrentTimeMillis3 & 1786130212;
                            int i1514 = ~((i1513 & i1512) | (i1512 ^ i1513));
                            int i1515 = 161474818 & i1514;
                            int i1516 = -(-((((i1514 | 161474818) & (~i1515)) | i1515) * (-964)));
                            int i1517 = (-452342772) & i1516;
                            int i1518 = i1516 | (-452342772);
                            int i1519 = (i1517 ^ i1518) + ((i1518 & i1517) << 1);
                            int i1610 = ((~i1510) & 1786130212) | (i1510 & (-1786130213));
                            int i1611 = (i1610 & i1511) | (i1610 ^ i1511);
                            int i1612 = ~i1611;
                            int i1613 = (i1611 | i1612) & i1612;
                            int i1614 = i1613 & 25804802;
                            int i1615 = (i1613 | 25804802) & (~i1614);
                            int i1616 = -(~(-(-(((i1615 & i1614) | (i1615 ^ i1614)) * (-964)))));
                            i13 = (-2) - (((i1519 & i1616) + (i1616 | i1519)) ^ (-1));
                            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                            int i1617 = ~iCurrentTimeMillis4;
                            int i1618 = (-542921) ^ i1617;
                            int i1619 = (-542921) & i1617;
                            int i1710 = -(~(((i1619 & i1618) | (i1618 ^ i1619)) * (-369)));
                            int i1711 = (-2) - (((1492121500 & i1710) + (i1710 | 1492121500)) ^ (-1));
                            int i1712 = (i1617 | iCurrentTimeMillis4) & i1617;
                            int i1713 = 543704 ^ i1712;
                            int i1714 = i1712 & 543704;
                            int i1715 = (i1714 & i1713) | (i1713 ^ i1714);
                            int i1716 = ~i1715;
                            int i1717 = (i1715 | i1716) & i1716;
                            int i1718 = ((~i1717) & (-2026826985)) | (i1717 & 2026826984);
                            int i1719 = i1717 & (-2026826985);
                            int i1810 = ((i1719 & i1718) | (i1718 ^ i1719)) * (-369);
                            int i1811 = (i1711 ^ i1810) + ((i1711 & i1810) << 1);
                            int i1812 = (-543705) & i1617;
                            int i1813 = (~((iCurrentTimeMillis4 & (-543705)) | (iCurrentTimeMillis4 & 543704) | i1812)) | 784;
                            int i1814 = (i1617 & 543704) | ((~i1617) & 543704) | i1812;
                            int i1815 = ~((i1814 & (-2026826985)) | (i1814 & 2026826984) | ((~i1814) & (-2026826985)));
                            int i1816 = ((~i1815) & i1813) | ((~i1813) & i1815);
                            int i1817 = i1813 & i1815;
                            int i1818 = -(-(((i1817 & i1816) | (i1816 ^ i1817)) * 369));
                            i14 = ((i1811 ^ i1818) | (i1811 & i1818)) << 1;
                            i15 = -((i1818 & (~i1811)) | ((~i1818) & i1811));
                            if (i13 <= ((i14 | i15) << 1) - (i15 ^ i14)) {
                                int i1819 = 62 / 0;
                            }
                            int i199 = f56466b;
                            int i1910 = i199 & 107;
                            int i1911 = (i199 | 107) & (~i1910);
                            int i1912 = -(-(i1910 << 1));
                            i16 = ((i1911 | i1912) << 1) - (i1911 ^ i1912);
                            f56465a = i16 % 128;
                            if (i16 % 2 != 0) {
                                i17 = 47;
                                int i11110 = i17 / 0;
                            }
                        } else {
                            int i1014 = f56465a;
                            i21 = (i1014 & 9) + (i1014 | 9);
                            f56466b = i21 % 128;
                            if (i21 % 2 == 0) {
                                i17 = 65;
                                int i11111 = i17 / 0;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static byte[] setOnFocusChangeListener(@NotNull im imVar, @NotNull dg dgVar, @NotNull byte[] bArr, @NotNull setContentDescription setcontentdescription) {
        return (byte[]) setOnFocusChangeListener(new Object[]{imVar, dgVar, bArr, setcontentdescription}, 253440841, -253440841, (int) System.currentTimeMillis());
    }
}
