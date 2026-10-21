package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57883a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57884b = 1;

    public static /* synthetic */ String a(Object[] objArr) {
        setVerticalScrollbarPosition setverticalscrollbarposition = (setVerticalScrollbarPosition) objArr[0];
        int i10 = f57884b;
        int i11 = i10 & 113;
        int i12 = (i10 ^ 113) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f57883a = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
            ql qlVar = (ql) setverticalscrollbarposition;
            return (String) ql.setY(new Object[]{qlVar}, 644790750, -644790750, System.identityHashCode(qlVar));
        }
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        ql qlVar2 = (ql) setverticalscrollbarposition;
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        byte[] bArr;
        setMinimumHeight setminimumheight = (setMinimumHeight) objArr[0];
        int i10 = f57884b;
        int i11 = i10 & 53;
        int i12 = i10 | 53;
        int i13 = (i11 & i12) + (i12 | i11);
        f57883a = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            qg qgVar = (qg) setminimumheight;
            bArr = (byte[]) qg.setX(new Object[]{qgVar}, 1679861173, -1679861172, System.identityHashCode(qgVar));
            int i14 = 26 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            qg qgVar2 = (qg) setminimumheight;
            bArr = (byte[]) qg.setX(new Object[]{qgVar2}, 1679861173, -1679861172, System.identityHashCode(qgVar2));
        }
        int i15 = f57884b;
        int i16 = i15 & 7;
        int i17 = ((i15 ^ 7) | i16) << 1;
        int i18 = -((i15 | 7) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        f57883a = i19 % 128;
        int i20 = i19 % 2;
        return bArr;
    }

    public static /* synthetic */ UUID c(Object[] objArr) {
        setLabelFor setlabelfor = (setLabelFor) objArr[0];
        int i10 = f57883a;
        int i11 = (i10 & 47) + (i10 | 47);
        f57884b = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setlabelfor, "");
            qm qmVar = (qm) setlabelfor;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setlabelfor, "");
        qm qmVar2 = (qm) setlabelfor;
        UUID uuid = (UUID) qm.setCompoundDrawableTintBlendMode(new Object[]{qmVar2}, -572824441, 572824441, System.identityHashCode(qmVar2));
        int i12 = f57883a;
        int i13 = (i12 ^ 95) + ((i12 & 95) << 1);
        f57884b = i13 % 128;
        if (i13 % 2 != 0) {
            return uuid;
        }
        throw null;
    }

    public static /* synthetic */ String d(Object[] objArr) {
        String str;
        setMinimumHeight setminimumheight = (setMinimumHeight) objArr[0];
        int i10 = f57884b;
        int i11 = (i10 & 124) + (i10 | 124);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f57883a = i12 % 128;
        if (i12 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            qg qgVar = (qg) setminimumheight;
            str = (String) qg.setX(new Object[]{qgVar}, 1449311825, -1449311818, System.identityHashCode(qgVar));
            int i13 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            qg qgVar2 = (qg) setminimumheight;
            str = (String) qg.setX(new Object[]{qgVar2}, 1449311825, -1449311818, System.identityHashCode(qgVar2));
        }
        int i14 = (-2) - ((f57883a + 12) ^ (-1));
        f57884b = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 47 / 0;
        }
        return str;
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        setMinimumHeight setminimumheight = (setMinimumHeight) objArr[0];
        int i10 = f57883a;
        int i11 = (i10 | 105) << 1;
        int i12 = -(((~i10) & 105) | (i10 & (-106)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f57884b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(setminimumheight, "");
        qg qgVar = (qg) setminimumheight;
        byte[] bArr = (byte[]) qg.setX(new Object[]{qgVar}, -571018965, 571018969, System.identityHashCode(qgVar));
        int i15 = f57884b;
        int i16 = i15 | 43;
        int i17 = (i16 << 1) - ((~(i15 & 43)) & i16);
        f57883a = i17 % 128;
        if (i17 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @NotNull
    public static final String setCompoundDrawableTintBlendMode(@NotNull setMinimumHeight setminimumheight) {
        return (String) setX(new Object[]{setminimumheight}, 1076225677, -1076225673, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setDividerPadding(@NotNull setMinimumHeight setminimumheight) {
        return (String) setX(new Object[]{setminimumheight}, -1994259398, 1994259407, (int) System.currentTimeMillis());
    }

    @Nullable
    public static final byte[] setOnDragListener(@NotNull setMinimumHeight setminimumheight) {
        return (byte[]) setX(new Object[]{setminimumheight}, -960080336, 960080343, (int) System.currentTimeMillis());
    }

    @Nullable
    public static final String setOnFocusChangeListener(@NotNull setMinimumHeight setminimumheight) {
        return (String) setX(new Object[]{setminimumheight}, -675386460, 675386462, (int) System.currentTimeMillis());
    }

    @Nullable
    public static final String setOnLongClickListener(@NotNull setMinimumHeight setminimumheight) {
        return (String) setX(new Object[]{setminimumheight}, 1929994622, -1929994614, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        switch ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14) {
            case 1:
                return a(objArr);
            case 2:
                setMinimumHeight setminimumheight = (setMinimumHeight) objArr[0];
                int i18 = f57884b;
                int i19 = (i18 & (-32)) | ((~i18) & 31);
                int i20 = (i18 & 31) << 1;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f57883a = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(setminimumheight, "");
                qg qgVar = (qg) setminimumheight;
                String str = (String) qg.setX(new Object[]{qgVar}, 1347578865, -1347578862, System.identityHashCode(qgVar));
                int i23 = f57883a;
                int i24 = i23 & 23;
                int i25 = (((i23 ^ 23) | i24) << 1) - ((i23 | 23) & (~i24));
                f57884b = i25 % 128;
                int i26 = i25 % 2;
                return str;
            case 3:
                setLabelFor setlabelfor = (setLabelFor) objArr[0];
                int i27 = f57883a;
                int i28 = (i27 ^ 59) + ((i27 & 59) << 1);
                f57884b = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(setlabelfor, "");
                qm qmVar = (qm) setlabelfor;
                String str2 = (String) qm.setCompoundDrawableTintBlendMode(new Object[]{qmVar}, 909734442, -909734441, System.identityHashCode(qmVar));
                System.currentTimeMillis();
                System.currentTimeMillis();
                return str2;
            case 4:
                setMinimumHeight setminimumheight2 = (setMinimumHeight) objArr[0];
                int i30 = f57883a;
                int i31 = ((i30 ^ 42) + ((i30 & 42) << 1)) - 1;
                f57884b = i31 % 128;
                int i32 = i31 % 2;
                Intrinsics.checkNotNullParameter(setminimumheight2, "");
                qg qgVar2 = (qg) setminimumheight2;
                String str3 = (String) qg.setX(new Object[]{qgVar2}, 859012527, -859012519, System.identityHashCode(qgVar2));
                System.currentTimeMillis();
                System.currentTimeMillis();
                return str3;
            case 5:
                return c(objArr);
            case 6:
                return d(objArr);
            case 7:
                return e(objArr);
            case 8:
                setMinimumHeight setminimumheight3 = (setMinimumHeight) objArr[0];
                int i33 = f57884b + 47;
                f57883a = i33 % 128;
                int i34 = i33 % 2;
                Intrinsics.checkNotNullParameter(setminimumheight3, "");
                qg qgVar3 = (qg) setminimumheight3;
                String str4 = (String) qg.setX(new Object[]{qgVar3}, 2090856827, -2090856822, System.identityHashCode(qgVar3));
                int i35 = f57884b;
                int i36 = (i35 & 13) + (i35 | 13);
                f57883a = i36 % 128;
                if (i36 % 2 == 0) {
                    return str4;
                }
                throw null;
            case 9:
                setMinimumHeight setminimumheight4 = (setMinimumHeight) objArr[0];
                int i37 = f57883a + 54;
                int i38 = (i37 ^ (-1)) + (i37 << 1);
                f57884b = i38 % 128;
                int i39 = i38 % 2;
                Intrinsics.checkNotNullParameter(setminimumheight4, "");
                qg qgVar4 = (qg) setminimumheight4;
                String str5 = (String) qg.setX(new Object[]{qgVar4}, 774313408, -774313408, System.identityHashCode(qgVar4));
                int i40 = f57884b;
                int i41 = i40 ^ 47;
                int i42 = (i40 & 47) << 1;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f57883a = i43 % 128;
                int i44 = i43 % 2;
                return str5;
            default:
                return b(objArr);
        }
    }

    @NotNull
    public static final byte[] setY(@NotNull setMinimumHeight setminimumheight) {
        return (byte[]) setX(new Object[]{setminimumheight}, -1228852118, 1228852118, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setDividerPadding(@NotNull setLabelFor setlabelfor) {
        return (String) setX(new Object[]{setlabelfor}, -140577881, 140577884, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final UUID setOnFocusChangeListener(@NotNull setLabelFor setlabelfor) {
        return (UUID) setX(new Object[]{setlabelfor}, -1300245567, 1300245572, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setY(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition) {
        return (String) setX(new Object[]{setverticalscrollbarposition}, 1371471483, -1371471482, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setX(@NotNull setMinimumHeight setminimumheight) {
        return (String) setX(new Object[]{setminimumheight}, 825133211, -825133205, (int) System.currentTimeMillis());
    }
}
