package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setVerticalScrollBarEnabled;", "", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/getBeepOnFailure;)B", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setVerticalScrollBarEnabled {

    @NotNull
    public static final setVerticalScrollBarEnabled INSTANCE = new setVerticalScrollBarEnabled();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60812a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60813b = 1;

    static {
        int i10 = f60813b + 76;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f60812a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static byte setX(@Nullable getBeepOnFailure p4) {
        return ((Byte) setY(new Object[]{p4}, -1247990827, 1247990827, (int) System.currentTimeMillis())).byteValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x0119  */
    /* JADX WARN: Code duplicated, block: B:37:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0163  */
    /* JADX WARN: Code duplicated, block: B:41:0x0164  */
    /* JADX WARN: Code duplicated, block: B:42:0x0173  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        byte y7;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i17 = f60813b;
        int i18 = (i17 ^ 18) + ((i17 & 18) << 1);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        int i20 = i19 % 128;
        f60812a = i20;
        if (i19 % 2 != 0) {
            int i21 = 34 / 0;
            if (getbeeponfailure == null) {
                int i22 = i20 + 85;
                f60813b = i22 % 128;
                int i23 = i22 % 2;
                bArr = null;
            } else {
                bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i24 = f60813b;
                int i25 = i24 & 35;
                int i26 = ((i24 ^ 35) | i25) << 1;
                int i27 = -((i24 | 35) & (~i25));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f60812a = i28 % 128;
                int i29 = i28 % 2;
            }
        } else if (getbeeponfailure == null) {
            int i210 = i20 + 85;
            f60813b = i210 % 128;
            int i211 = i210 % 2;
            bArr = null;
        } else {
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            int i212 = f60813b;
            int i213 = i212 & 35;
            int i214 = ((i212 ^ 35) | i213) << 1;
            int i215 = -((i212 | 35) & (~i213));
            int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
            f60812a = i216 % 128;
            int i217 = i216 % 2;
        }
        if (bArr != null) {
            int i30 = f60812a;
            int i31 = i30 + 62;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            int i33 = i32 % 128;
            f60813b = i33;
            if (i32 % 2 == 0) {
                int i34 = 54 / 0;
                if (bArr.length == 0) {
                    int i35 = i33 + 69;
                    int i36 = i35 % 128;
                    f60812a = i36;
                    int i37 = i35 % 2;
                    int i38 = i36 + 103;
                    f60813b = i38 % 128;
                    int i39 = i38 % 2;
                    y7 = Terminal.KERNEL_2.setY();
                    int i40 = f60812a;
                    int i41 = i40 & 95;
                    int i42 = ((i40 ^ 95) | i41) << 1;
                    int i43 = -((i40 | 95) & (~i41));
                    i13 = ((i42 | i43) << 1) - (i43 ^ i42);
                    f60813b = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i44 = ((i30 & 44) + (i30 | 44)) - 1;
                    i14 = i44 % 128;
                    f60813b = i14;
                    int i45 = i44 % 2;
                    y7 = bArr[0];
                    if (y7 == 0) {
                        int i46 = i30 + 99;
                        int i47 = i46 % 128;
                        f60813b = i47;
                        int i48 = i46 % 2;
                        int i49 = i47 & 113;
                        int i50 = (i47 | 113) & (~i49);
                        int i51 = -(-(i49 << 1));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        f60812a = i52 % 128;
                        int i53 = i52 % 2;
                    } else if (y7 == 64) {
                        int i54 = (i30 & 51) + (i30 | 51);
                        int i55 = i54 % 128;
                        f60813b = i55;
                        int i56 = i54 % 2;
                        int i57 = i55 | 75;
                        int i58 = i57 << 1;
                        int i59 = -((~(i55 & 75)) & i57);
                        int i60 = (i58 & i59) + (i59 | i58);
                        f60812a = i60 % 128;
                        int i61 = i60 % 2;
                    } else {
                        int i62 = ((i14 ^ 35) | (i14 & 35)) << 1;
                        int i63 = -((i14 & (-36)) | ((~i14) & 35));
                        int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                        f60812a = i64 % 128;
                        int i65 = i64 % 2;
                        if (y7 == 66) {
                            int i66 = i14 & 1;
                            int i67 = (i14 ^ 1) | i66;
                            i15 = (i66 ^ i67) + ((i66 & i67) << 1);
                            f60812a = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i68 = f60812a;
                                int i69 = i68 & 57;
                                int i70 = (i68 ^ 57) | i69;
                                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                                f60813b = i71 % 128;
                                int i72 = i71 % 2;
                                y7 = Terminal.KERNEL_2.setY();
                                int i73 = f60812a;
                                int i74 = i73 & 75;
                                int i75 = ((i73 ^ 75) | i74) << 1;
                                int i76 = -((i73 | 75) & (~i74));
                                i16 = ((i75 | i76) << 1) - (i76 ^ i75);
                                f60813b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                            }
                        } else {
                            int i77 = i14 & 29;
                            int i78 = i14 | 29;
                            int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                            f60812a = i79 % 128;
                            int i80 = i79 % 2;
                        }
                        int i81 = f60813b;
                        int i82 = ((i81 ^ 21) | (i81 & 21)) << 1;
                        int i83 = -(((~i81) & 21) | (i81 & (-22)));
                        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                        f60812a = i84 % 128;
                        int i85 = i84 % 2;
                    }
                    int i86 = f60813b;
                    int i87 = ((i86 | 114) << 1) - (i86 ^ 114);
                    int i88 = (i87 ^ (-1)) + (i87 << 1);
                    int i89 = i88 % 128;
                    f60812a = i89;
                    z10 = i88 % 2 == 0;
                    int i90 = (((i89 | 14) << 1) - (i89 ^ 14)) - 1;
                    f60813b = i90 % 128;
                    int i91 = i90 % 2;
                    if (z10) {
                        int i610 = f60812a;
                        int i611 = i610 & 57;
                        int i710 = (i610 ^ 57) | i611;
                        int i711 = (i611 ^ i710) + ((i710 & i611) << 1);
                        f60813b = i711 % 128;
                        int i712 = i711 % 2;
                        y7 = Terminal.KERNEL_2.setY();
                        int i713 = f60812a;
                        int i714 = i713 & 75;
                        int i715 = ((i713 ^ 75) | i714) << 1;
                        int i716 = -((i713 | 75) & (~i714));
                        i16 = ((i715 | i716) << 1) - (i716 ^ i715);
                        f60813b = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i810 = f60813b;
                        int i811 = ((i810 ^ 21) | (i810 & 21)) << 1;
                        int i812 = -(((~i810) & 21) | (i810 & (-22)));
                        int i813 = (i811 ^ i812) + ((i812 & i811) << 1);
                        f60812a = i813 % 128;
                        int i814 = i813 % 2;
                    }
                }
            } else if (bArr.length == 0) {
                int i310 = i33 + 69;
                int i311 = i310 % 128;
                f60812a = i311;
                int i312 = i310 % 2;
                int i313 = i311 + 103;
                f60813b = i313 % 128;
                int i314 = i313 % 2;
                y7 = Terminal.KERNEL_2.setY();
                int i410 = f60812a;
                int i411 = i410 & 95;
                int i412 = ((i410 ^ 95) | i411) << 1;
                int i413 = -((i410 | 95) & (~i411));
                i13 = ((i412 | i413) << 1) - (i413 ^ i412);
                f60813b = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            } else {
                int i414 = ((i30 & 44) + (i30 | 44)) - 1;
                i14 = i414 % 128;
                f60813b = i14;
                int i415 = i414 % 2;
                y7 = bArr[0];
                if (y7 == 0) {
                    int i416 = i30 + 99;
                    int i417 = i416 % 128;
                    f60813b = i417;
                    int i418 = i416 % 2;
                    int i419 = i417 & 113;
                    int i510 = (i417 | 113) & (~i419);
                    int i511 = -(-(i419 << 1));
                    int i512 = (i510 ^ i511) + ((i511 & i510) << 1);
                    f60812a = i512 % 128;
                    int i513 = i512 % 2;
                } else if (y7 == 64) {
                    int i514 = (i30 & 51) + (i30 | 51);
                    int i515 = i514 % 128;
                    f60813b = i515;
                    int i516 = i514 % 2;
                    int i517 = i515 | 75;
                    int i518 = i517 << 1;
                    int i519 = -((~(i515 & 75)) & i517);
                    int i612 = (i518 & i519) + (i519 | i518);
                    f60812a = i612 % 128;
                    int i613 = i612 % 2;
                } else {
                    int i614 = ((i14 ^ 35) | (i14 & 35)) << 1;
                    int i615 = -((i14 & (-36)) | ((~i14) & 35));
                    int i616 = ((i614 | i615) << 1) - (i614 ^ i615);
                    f60812a = i616 % 128;
                    int i617 = i616 % 2;
                    if (y7 == 66) {
                        int i618 = i14 & 1;
                        int i619 = (i14 ^ 1) | i618;
                        i15 = (i618 ^ i619) + ((i618 & i619) << 1);
                        f60812a = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i6110 = f60812a;
                            int i6111 = i6110 & 57;
                            int i717 = (i6110 ^ 57) | i6111;
                            int i718 = (i6111 ^ i717) + ((i717 & i6111) << 1);
                            f60813b = i718 % 128;
                            int i719 = i718 % 2;
                            y7 = Terminal.KERNEL_2.setY();
                            int i7110 = f60812a;
                            int i7111 = i7110 & 75;
                            int i7112 = ((i7110 ^ 75) | i7111) << 1;
                            int i7113 = -((i7110 | 75) & (~i7111));
                            i16 = ((i7112 | i7113) << 1) - (i7113 ^ i7112);
                            f60813b = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else {
                        int i720 = i14 & 29;
                        int i721 = i14 | 29;
                        int i722 = ((i720 | i721) << 1) - (i720 ^ i721);
                        f60812a = i722 % 128;
                        int i815 = i722 % 2;
                    }
                    int i816 = f60813b;
                    int i817 = ((i816 ^ 21) | (i816 & 21)) << 1;
                    int i818 = -(((~i816) & 21) | (i816 & (-22)));
                    int i819 = (i817 ^ i818) + ((i818 & i817) << 1);
                    f60812a = i819 % 128;
                    int i8110 = i819 % 2;
                }
                int i820 = f60813b;
                int i821 = ((i820 | 114) << 1) - (i820 ^ 114);
                int i822 = (i821 ^ (-1)) + (i821 << 1);
                int i823 = i822 % 128;
                f60812a = i823;
                if (i822 % 2 == 0) {
                }
                int i92 = (((i823 | 14) << 1) - (i823 ^ 14)) - 1;
                f60813b = i92 % 128;
                int i93 = i92 % 2;
                if (z10) {
                    int i6112 = f60812a;
                    int i6113 = i6112 & 57;
                    int i7114 = (i6112 ^ 57) | i6113;
                    int i7115 = (i6113 ^ i7114) + ((i7114 & i6113) << 1);
                    f60813b = i7115 % 128;
                    int i7116 = i7115 % 2;
                    y7 = Terminal.KERNEL_2.setY();
                    int i7117 = f60812a;
                    int i7118 = i7117 & 75;
                    int i7119 = ((i7117 ^ 75) | i7118) << 1;
                    int i71110 = -((i7117 | 75) & (~i7118));
                    i16 = ((i7119 | i71110) << 1) - (i71110 ^ i7119);
                    f60813b = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i8111 = f60813b;
                    int i8112 = ((i8111 ^ 21) | (i8111 & 21)) << 1;
                    int i8113 = -(((~i8111) & 21) | (i8111 & (-22)));
                    int i8114 = (i8112 ^ i8113) + ((i8113 & i8112) << 1);
                    f60812a = i8114 % 128;
                    int i8115 = i8114 % 2;
                }
            }
        } else {
            y7 = Terminal.KERNEL_2.setY();
            int i4110 = f60812a;
            int i4111 = i4110 & 95;
            int i4112 = ((i4110 ^ 95) | i4111) << 1;
            int i4113 = -((i4110 | 95) & (~i4111));
            i13 = ((i4112 | i4113) << 1) - (i4113 ^ i4112);
            f60813b = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
        return Byte.valueOf(y7);
    }
}
