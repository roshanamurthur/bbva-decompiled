package com.mypinpad.tsdk.isolation;

import bk.d;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ej extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55380c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55381d = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        int i20 = (((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17;
        if (i20 == 1) {
            int i21 = f55380c;
            int i22 = ((i21 | 77) << 1) - (((~i21) & 77) | (i21 & (-78)));
            f55381d = i22 % 128;
            if (i22 % 2 == 0) {
                eh ehVar = eh.INSTANCE;
                throw null;
            }
            eh ehVar2 = eh.INSTANCE;
            List list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
            int i23 = f55380c;
            int i24 = i23 & 95;
            int i25 = (((i23 | 95) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            f55381d = i25 % 128;
            if (i25 % 2 != 0) {
                return list;
            }
            throw null;
        }
        if (i20 == 2) {
            int i26 = f55380c + 119;
            f55381d = i26 % 128;
            if (i26 % 2 != 0) {
                eh ehVar3 = eh.INSTANCE;
                return (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            }
            eh ehVar4 = eh.INSTANCE;
            throw null;
        }
        if (i20 == 3) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            bx bxVar = new bx(setscrollbardefaultdelaybeforefade);
            bw bwVar = (bw) ((setImageTintList) w.setX(new Object[]{bxVar}, 1693919772, -1693919769, System.identityHashCode(bxVar)));
            boolean zBooleanValue = ((Boolean) bw.setY(new Object[]{bwVar}, -1441108679, 1441108679, System.identityHashCode(bwVar))).booleanValue();
            int i27 = f55381d;
            int i28 = i27 & 57;
            int i29 = ((((i27 ^ 57) | i28) << 1) - (~(-((i27 | 57) & (~i28))))) - 1;
            f55380c = i29 % 128;
            if (i29 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i20 != 4) {
            int i30 = f55381d;
            int i31 = i30 & 69;
            int i32 = ((i30 ^ 69) | i31) << 1;
            int i33 = -((i30 | 69) & (~i31));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f55380c = i34 % 128;
            if (i34 % 2 == 0) {
                eh ehVar5 = eh.INSTANCE;
                return CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis()), (Iterable) d.listOf(setImageTintBlendMode.setLayoutAnimation));
            }
            eh ehVar6 = eh.INSTANCE;
            CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis()), (Iterable) d.listOf(setImageTintBlendMode.setLayoutAnimation));
            throw null;
        }
        int i35 = f55381d;
        int i36 = i35 & 81;
        int i37 = -(-(i35 | 81));
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        f55380c = i38 % 128;
        if (i38 % 2 != 0) {
            eh ehVar7 = eh.INSTANCE;
            throw null;
        }
        eh ehVar8 = eh.INSTANCE;
        List list2 = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
        int i39 = f55380c;
        int i40 = ((i39 ^ 62) + ((i39 & 62) << 1)) - 1;
        f55381d = i40 % 128;
        if (i40 % 2 != 0) {
            return list2;
        }
        int i41 = 26 / 0;
        return list2;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setDividerPadding(new Object[]{this}, 1579567948, -1579567947, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setDividerPadding(new Object[]{this}, 337327504, -337327504, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setDividerPadding(new Object[]{this}, -1558385459, 1558385463, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade}, 485839683, -485839680, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setDividerPadding(new Object[]{this}, -413951734, 413951736, System.identityHashCode(this));
    }
}
