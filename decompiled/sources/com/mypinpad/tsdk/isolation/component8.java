package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class component8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54979c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54980d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f54981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f54982b;

    public component8(byte b10, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f54981a = b10;
        this.f54982b = list;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        component8 component8Var;
        int i13;
        int i14;
        int i15;
        int i16 = ~i10;
        int i17 = ~(i16 | i12);
        int i18 = ~i12;
        int i19 = ((i17 | (~(i18 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i20 = ~i11;
        int i21 = i10 | i18;
        int i22 = (((~i21) | (~(i11 | i16)) | (~(i12 | i20))) * 904) + (((~(i21 | i11)) | (~(i16 | i20 | i12))) * 904) + i19;
        if (i22 == 1) {
            component8 component8Var2 = (component8) objArr[0];
            int i23 = f54979c;
            int i24 = i23 ^ 123;
            int i25 = ((i23 & 123) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f54980d = i27 % 128;
            int i28 = i27 % 2;
            List<String> list = component8Var2.f54982b;
            int i29 = ((i23 ^ 119) - (~(-(-((i23 & 119) << 1))))) - 1;
            f54980d = i29 % 128;
            int i30 = i29 % 2;
            return list;
        }
        if (i22 == 2) {
            component8 component8Var3 = (component8) objArr[0];
            int i31 = f54979c;
            int i32 = ((i31 & 74) + (i31 | 74)) - 1;
            f54980d = i32 % 128;
            int i33 = i32 % 2;
            byte b10 = component8Var3.f54981a;
            int i34 = b10 * 31;
            int iHashCode = component8Var3.f54982b.hashCode();
            int iIdentityHashCode = System.identityHashCode(component8Var3);
            int i35 = ((iHashCode * (-380)) - (~(b10 * 11842))) - 1;
            int i36 = ~iIdentityHashCode;
            int i37 = (iIdentityHashCode & i34) | (i34 ^ iIdentityHashCode);
            int i38 = (~iHashCode) & ((~iHashCode) | iHashCode);
            int i39 = -(-(((i37 & i38) | (i37 ^ i38)) * (-381)));
            int i40 = (((i35 ^ i39) | (i35 & i39)) << 1) - ((i39 & (~i35)) | ((~i39) & i35));
            int i41 = ~iHashCode;
            int i42 = (~i34) & ((~i34) | i34);
            int i43 = ~((i42 & i41) | (i41 ^ i42));
            int i44 = i36 & i34;
            int i45 = (i36 | i34) & (~i44);
            int i46 = ~((i45 & i44) | (i45 ^ i44));
            int i47 = ((~i46) & i43) | ((~i43) & i46);
            int i48 = i43 & i46;
            int i49 = (i48 & i47) | (i47 ^ i48);
            int i50 = iHashCode ^ i34;
            int i51 = iHashCode & i34;
            int i52 = (i51 & i50) | (i50 ^ i51);
            int i53 = (i52 | (~i52)) & (~i52);
            int i54 = i49 ^ i53;
            int i55 = i53 & i49;
            int i56 = -(-(((i55 & i54) | (i54 ^ i55)) * 381));
            int i57 = i40 & i56;
            int i58 = i57 + ((i40 ^ i56) | i57);
            int i59 = i41 & i34;
            int i60 = (~(((i41 | i34) & (~i59)) | i59)) * 381;
            int i61 = i58 & i60;
            int i62 = (i61 - (~(-(-((i60 ^ i58) | i61))))) - 1;
            int i63 = f54979c;
            int i64 = ((i63 | 65) << 1) - (((~i63) & 65) | (i63 & (-66)));
            f54980d = i64 % 128;
            int i65 = i64 % 2;
            return Integer.valueOf(i62);
        }
        if (i22 == 3) {
            component8 component8Var4 = (component8) objArr[0];
            StringBuilder sb2 = new StringBuilder("KernelTagsConfigData(kernelId=");
            sb2.append((int) component8Var4.f54981a);
            sb2.append(", tags=");
            sb2.append(component8Var4.f54982b);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i66 = f54980d;
            int i67 = i66 | 91;
            int i68 = ((i67 << 1) - (~(-((~(i66 & 91)) & i67)))) - 1;
            f54979c = i68 % 128;
            if (i68 % 2 == 0) {
                return string;
            }
            throw null;
        }
        if (i22 == 4) {
            component8 component8Var5 = (component8) objArr[0];
            int i69 = f54979c;
            int i70 = (((i69 & (-112)) | ((~i69) & 111)) - (~(-(-((i69 & 111) << 1))))) - 1;
            f54980d = i70 % 128;
            int i71 = i70 % 2;
            byte b11 = component8Var5.f54981a;
            int i72 = i69 & 63;
            int i73 = (i69 ^ 63) | i72;
            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
            f54980d = i74 % 128;
            int i75 = i74 % 2;
            return Byte.valueOf(b11);
        }
        component8 component8Var6 = (component8) objArr[0];
        Object obj = objArr[1];
        int i76 = f54979c;
        int i77 = (i76 & 43) + (i76 | 43);
        int i78 = i77 % 128;
        f54980d = i78;
        if (i77 % 2 == 0) {
            int i79 = 64 / 0;
            if (component8Var6 != obj) {
                if (!(!(obj instanceof component8))) {
                    component8Var = (component8) obj;
                    if (component8Var6.f54981a != component8Var.f54981a) {
                        int i80 = (((i78 | 94) << 1) - (i78 ^ 94)) - 1;
                        f54979c = i80 % 128;
                        int i81 = i80 % 2;
                        i15 = i78 + 13;
                        f54979c = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    } else if (!Intrinsics.areEqual(component8Var6.f54982b, component8Var.f54982b)) {
                        int i82 = f54980d;
                        int i83 = i82 & 55;
                        int i84 = i82 | 55;
                        int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                        int i86 = i85 % 128;
                        f54979c = i86;
                        int i87 = i85 % 2;
                        i14 = i86 + 57;
                        f54980d = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i88 = f54980d;
                        int i89 = i88 & 31;
                        int i90 = -(-((i88 ^ 31) | i89));
                        i13 = (i89 & i90) + (i90 | i89);
                        f54979c = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i91 = 41 / 0;
                        }
                    }
                } else {
                    int i92 = i76 + 99;
                    f54980d = i92 % 128;
                    int i93 = i92 % 2;
                    int i94 = i76 & 125;
                    int i95 = (~i94) & (i76 | 125);
                    int i96 = i94 << 1;
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    f54980d = i97 % 128;
                    int i98 = i97 % 2;
                }
                return Boolean.FALSE;
            }
            int i99 = ((i76 ^ 88) + ((i76 & 88) << 1)) - 1;
            f54980d = i99 % 128;
            int i100 = i99 % 2;
        } else {
            if (component8Var6 != obj) {
                if (!(!(obj instanceof component8))) {
                    component8Var = (component8) obj;
                    if (component8Var6.f54981a != component8Var.f54981a) {
                        int i810 = (((i78 | 94) << 1) - (i78 ^ 94)) - 1;
                        f54979c = i810 % 128;
                        int i811 = i810 % 2;
                        i15 = i78 + 13;
                        f54979c = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    } else if (!Intrinsics.areEqual(component8Var6.f54982b, component8Var.f54982b)) {
                        int i812 = f54980d;
                        int i813 = i812 & 55;
                        int i814 = i812 | 55;
                        int i815 = ((i813 | i814) << 1) - (i814 ^ i813);
                        int i816 = i815 % 128;
                        f54979c = i816;
                        int i817 = i815 % 2;
                        i14 = i816 + 57;
                        f54980d = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i818 = f54980d;
                        int i819 = i818 & 31;
                        int i910 = -(-((i818 ^ 31) | i819));
                        i13 = (i819 & i910) + (i910 | i819);
                        f54979c = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i911 = 41 / 0;
                        }
                    }
                } else {
                    int i912 = i76 + 99;
                    f54980d = i912 % 128;
                    int i913 = i912 % 2;
                    int i914 = i76 & 125;
                    int i915 = (~i914) & (i76 | 125);
                    int i916 = i914 << 1;
                    int i917 = (i915 ^ i916) + ((i916 & i915) << 1);
                    f54980d = i917 % 128;
                    int i918 = i917 % 2;
                }
                return Boolean.FALSE;
            }
            int i919 = ((i76 ^ 88) + ((i76 & 88) << 1)) - 1;
            f54980d = i919 % 128;
            int i101 = i919 % 2;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1837429154, 1837429154, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1985957242, 1985957244, System.identityHashCode(this))).intValue();
    }

    public final byte setDividerPadding() {
        return ((Byte) setX(new Object[]{this}, 1646691248, -1646691244, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final List<String> setY() {
        return (List) setX(new Object[]{this}, -309760526, 309760527, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 421481020, -421481017, System.identityHashCode(this));
    }
}
