package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class em extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55387c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55388d = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~((~i11) | i12);
        int i17 = (((~(i10 | i14)) | (~(i12 | i13))) * 575) + (((~(i11 | i14)) | i16) * (-575)) + ((i15 | i16) * 1150) + (i11 * (-574)) + (i10 * (-574));
        if (i17 == 1) {
            int i18 = f55387c;
            int i19 = ((i18 ^ 95) - (~(-(-((i18 & 95) << 1))))) - 1;
            f55388d = i19 % 128;
            int i20 = i19 % 2;
            eh ehVar = eh.INSTANCE;
            List list = (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            int i21 = f55388d;
            int i22 = i21 & 39;
            int i23 = -(-(i21 | 39));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f55387c = i24 % 128;
            if (i24 % 2 == 0) {
                return list;
            }
            throw null;
        }
        if (i17 == 2) {
            int i25 = f55388d;
            int i26 = (((i25 | 18) << 1) - (i25 ^ 18)) - 1;
            f55387c = i26 % 128;
            int i27 = i26 % 2;
            eh ehVar2 = eh.INSTANCE;
            List list2 = (List) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis());
            int i28 = f55388d;
            int i29 = ((i28 | 7) << 1) - (i28 ^ 7);
            f55387c = i29 % 128;
            int i30 = i29 % 2;
            return list2;
        }
        if (i17 == 3) {
            int i31 = f55388d;
            int i32 = (i31 ^ 59) + ((i31 & 59) << 1);
            f55387c = i32 % 128;
            int i33 = i32 % 2;
            eh ehVar3 = eh.INSTANCE;
            List list3 = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
            int i34 = f55387c;
            int i35 = ((i34 ^ 77) | (i34 & 77)) << 1;
            int i36 = -(((~i34) & 77) | (i34 & (-78)));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f55388d = i37 % 128;
            int i38 = i37 % 2;
            return list3;
        }
        if (i17 == 4) {
            int i39 = f55387c + 49;
            f55388d = i39 % 128;
            int i40 = i39 % 2;
            eh ehVar4 = eh.INSTANCE;
            List list4 = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
            int i41 = f55388d;
            int i42 = (((i41 | 88) << 1) - (i41 ^ 88)) - 1;
            f55387c = i42 % 128;
            int i43 = i42 % 2;
            return list4;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        int i44 = f55387c;
        int i45 = (i44 & 107) + (i44 | 107);
        f55388d = i45 % 128;
        int i46 = i45 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        eh ehVar5 = eh.INSTANCE;
        boolean zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1976408796, 1976408801, (int) System.currentTimeMillis())).booleanValue();
        int i47 = f55387c;
        int i48 = i47 & 77;
        int i49 = i48 + ((i47 ^ 77) | i48);
        f55388d = i49 % 128;
        if (i49 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1061190156, 1061190159, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -590276559, 590276563, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, setscrollbardefaultdelaybeforefade}, -872822719, 872822719, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 574531118, -574531117, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -611674942, 611674944, System.identityHashCode(this));
    }
}
