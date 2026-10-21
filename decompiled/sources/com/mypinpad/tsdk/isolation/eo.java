package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class eo extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55390c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55391d = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue;
        List list;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (~i12) | i13;
        int i17 = (((~(i10 | i14)) | (~(i11 | i16))) * 241) + ((i10 | i11) * (-482)) + (((~i16) | i15) * (-241)) + (i11 * 242) + (i10 * 483);
        if (i17 == 1) {
            int i18 = f55391d;
            int i19 = i18 & 73;
            int i20 = (i19 - (~(-(-((i18 ^ 73) | i19))))) - 1;
            f55390c = i20 % 128;
            if (i20 % 2 != 0) {
                eh ehVar = eh.INSTANCE;
                throw null;
            }
            eh ehVar2 = eh.INSTANCE;
            List list2 = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
            int i21 = f55390c;
            int i22 = i21 & 51;
            int i23 = (i21 | 51) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            f55391d = i25 % 128;
            int i26 = i25 % 2;
            return list2;
        }
        if (i17 == 2) {
            int i27 = f55390c + 73;
            f55391d = i27 % 128;
            int i28 = i27 % 2;
            eh ehVar3 = eh.INSTANCE;
            List list3 = (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            int i29 = f55390c;
            int i30 = i29 ^ 95;
            int i31 = ((i29 & 95) | i30) << 1;
            int i32 = -i30;
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            f55391d = i33 % 128;
            int i34 = i33 % 2;
            return list3;
        }
        if (i17 == 3) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            int i35 = f55391d;
            int i36 = (i35 & (-114)) | ((~i35) & 113);
            int i37 = -(-((i35 & 113) << 1));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f55390c = i38 % 128;
            if (i38 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                eh ehVar4 = eh.INSTANCE;
                zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1976408796, 1976408801, (int) System.currentTimeMillis())).booleanValue();
                int i39 = 69 / 0;
            } else {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                eh ehVar5 = eh.INSTANCE;
                zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1976408796, 1976408801, (int) System.currentTimeMillis())).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i17 == 4) {
            int i40 = f55391d;
            int i41 = (i40 & (-102)) | ((~i40) & 101);
            int i42 = (i40 & 101) << 1;
            int i43 = (i41 & i42) + (i42 | i41);
            f55390c = i43 % 128;
            int i44 = i43 % 2;
            eh ehVar6 = eh.INSTANCE;
            List list4 = (List) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis());
            int i45 = f55391d;
            int i46 = ((((i45 ^ 75) | (i45 & 75)) << 1) - (~(-(((~i45) & 75) | (i45 & (-76)))))) - 1;
            f55390c = i46 % 128;
            if (i46 % 2 == 0) {
                return list4;
            }
            int i47 = 70 / 0;
            return list4;
        }
        int i48 = f55390c;
        int i49 = i48 & 47;
        int i50 = i49 + ((i48 ^ 47) | i49);
        f55391d = i50 % 128;
        if (i50 % 2 == 0) {
            eh ehVar7 = eh.INSTANCE;
            list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
            int i51 = 2 / 0;
        } else {
            eh ehVar8 = eh.INSTANCE;
            list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
        }
        int i52 = f55391d + 75;
        f55390c = i52 % 128;
        if (i52 % 2 == 0) {
            return list;
        }
        int i53 = 81 / 0;
        return list;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setY(new Object[]{this}, 423558028, -423558028, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setY(new Object[]{this}, 186663797, -186663793, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setY(new Object[]{this}, 2003979752, -2003979751, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setY(new Object[]{this, setscrollbardefaultdelaybeforefade}, 128393308, -128393305, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setY(new Object[]{this}, -1073512817, 1073512819, System.identityHashCode(this));
    }
}
