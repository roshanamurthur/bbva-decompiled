package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61414a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61415b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int[] iArr = (int[]) objArr[0];
        int i13 = f61415b;
        int i14 = (-2) - ((((i13 | 74) << 1) - (i13 ^ 74)) ^ (-1));
        f61414a = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iArr, "");
        } else {
            Intrinsics.checkNotNullParameter(iArr, "");
        }
        int length = iArr.length;
        byte[] bArr = new byte[1];
        int i15 = 0;
        while (i15 <= 0) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i16 = ~iCurrentTimeMillis;
            int i17 = ~i16;
            int i18 = i16 & (-1272087817);
            int i19 = (i16 & 1272087816) | ((-1272087817) & i17) | i18;
            int i20 = -(~((~((i19 & (-1447363640)) | (i19 ^ (-1447363640)))) * 52));
            int i21 = ((1051107635 ^ i20) + ((i20 & 1051107635) << 1)) - 1;
            int i22 = (1447363639 & i16) | (i17 & 1447363639) | ((-1447363640) & i16);
            int i23 = ~i22;
            int i24 = (i22 | i23) & i23;
            int i25 = ((-160596233) & i24) | ((~i24) & 160596232);
            int i26 = i24 & 160596232;
            int i27 = (i26 & i25) | (i25 ^ i26);
            int i28 = (~i18) & ((-1272087817) | i16);
            int i29 = ~((i28 & i18) | (i28 ^ i18));
            int i30 = i27 ^ i29;
            int i31 = i27 & i29;
            int i32 = ((i31 & i30) | (i30 ^ i31)) * (-52);
            int i33 = i21 & i32;
            int i34 = ((i21 ^ i32) | i33) << 1;
            int i35 = -((i32 | i21) & (~i33));
            int i36 = (i34 & i35) + (i35 | i34);
            int i37 = (iCurrentTimeMillis | i16) & i16;
            int i38 = ~((i37 & 1272087816) | (1272087816 ^ i37));
            int i39 = i38 ^ 335872055;
            int i40 = i38 & 335872055;
            int i41 = ((i40 & i39) | (i39 ^ i40)) * 52;
            int i42 = ((i36 | i41) << 1) - (i41 ^ i36);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i43 = ~iCurrentTimeMillis2;
            int i44 = (iCurrentTimeMillis2 | i43) & i43;
            int i45 = 1266731837 & i44;
            int i46 = (i44 | 1266731837) & (~i45);
            int i47 = ~((i46 & i45) | (i46 ^ i45));
            int i48 = -(-(((i47 & 342697152) | (342697152 ^ i47)) * (-241)));
            int i49 = 1685280496 & i48;
            int i50 = (i49 - (~(-(-((i48 ^ 1685280496) | i49))))) - 1494015967;
            int i51 = ((~i43) & 1266731837) | ((-1266731838) & i43) | (i43 & 1266731837);
            int i52 = (i51 & 1559064285) | ((-1559064286) & i51) | ((~i51) & 1559064285);
            int i53 = ~i52;
            int i54 = (i52 | i53) & i53;
            int i55 = -(-(((i54 & 1216367133) | (1216367133 ^ i54)) * 241));
            if (i42 <= (((i50 ^ i55) | (i50 & i55)) << 1) - ((i55 & (~i50)) | ((~i55) & i50))) {
                bArr[1] = (byte) iArr[1];
                int i56 = i15 & 36;
                i15 = i56 + ((i15 ^ 36) | i56);
            } else {
                bArr[0] = (byte) iArr[0];
                int i57 = ((i15 ^ 75) - (~(-(-((i15 & 75) << 1))))) - 1;
                int i58 = i57 & (-74);
                i15 = i58 + ((i57 ^ (-74)) | i58);
            }
            int i59 = f61414a;
            int i60 = i59 & 27;
            int i61 = (i59 ^ 27) | i60;
            int i62 = (i60 & i61) + (i61 | i60);
            f61415b = i62 % 128;
            int i63 = i62 % 2;
        }
        int i64 = f61414a;
        int i65 = i64 & 87;
        int i66 = -(-(i64 | 87));
        int i67 = (i65 & i66) + (i66 | i65);
        f61415b = i67 % 128;
        if (i67 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public static final byte[] setX(@NotNull int... iArr) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{iArr}, -365257144, 365257144, (int) System.currentTimeMillis());
    }
}
