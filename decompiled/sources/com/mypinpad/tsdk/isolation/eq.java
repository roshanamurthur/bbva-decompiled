package com.mypinpad.tsdk.isolation;

import bk.d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class eq extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55394c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55395d = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
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
            int i23 = f55394c + 37;
            f55395d = i23 % 128;
            int i24 = i23 % 2;
            eh ehVar = eh.INSTANCE;
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis()), (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new setImageTintBlendMode[]{setImageTintBlendMode.setY, setImageTintBlendMode.setDividerPadding, setImageTintBlendMode.setOnDragListener}));
            int i25 = f55395d;
            int i26 = ((i25 ^ 86) + ((i25 & 86) << 1)) - 1;
            f55394c = i26 % 128;
            if (i26 % 2 == 0) {
                return listPlus;
            }
            throw null;
        }
        if (i22 == 2) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            ch chVar = new ch(setscrollbardefaultdelaybeforefade);
            ci ciVar = (ci) ((setImageTintList) w.setX(new Object[]{chVar}, 1693919772, -1693919769, System.identityHashCode(chVar)));
            boolean zBooleanValue = ((Boolean) ci.setY(new Object[]{ciVar}, -604970277, 604970277, System.identityHashCode(ciVar))).booleanValue();
            int i27 = f55394c;
            int i28 = i27 ^ 29;
            int i29 = ((i27 & 29) | i28) << 1;
            int i30 = -i28;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            f55395d = i31 % 128;
            if (i31 % 2 != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i22 == 3) {
            int i32 = f55394c;
            int i33 = i32 | 31;
            int i34 = ((i33 << 1) - (~(-((~(i32 & 31)) & i33)))) - 1;
            f55395d = i34 % 128;
            if (i34 % 2 == 0) {
                eh ehVar2 = eh.INSTANCE;
                throw null;
            }
            eh ehVar3 = eh.INSTANCE;
            List list = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
            int i35 = f55395d;
            int i36 = ((i35 & 120) + (i35 | 120)) - 1;
            f55394c = i36 % 128;
            if (i36 % 2 == 0) {
                return list;
            }
            throw null;
        }
        if (i22 == 4) {
            int i37 = f55395d;
            int i38 = i37 & 43;
            int i39 = (((i37 | 43) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
            f55394c = i39 % 128;
            int i40 = i39 % 2;
            eh ehVar4 = eh.INSTANCE;
            List list2 = (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            int i41 = f55394c;
            int i42 = i41 & 1;
            int i43 = (((i41 | 1) & (~i42)) - (~(-(-(i42 << 1))))) - 1;
            f55395d = i43 % 128;
            int i44 = i43 % 2;
            return list2;
        }
        int i45 = f55394c;
        int i46 = (i45 & 121) + (i45 | 121);
        f55395d = i46 % 128;
        int i47 = i46 % 2;
        eh ehVar5 = eh.INSTANCE;
        List listPlus2 = CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis()), (Iterable) d.listOf(setImageTintBlendMode.setNavigationOnClickListener));
        int i48 = f55395d;
        int i49 = i48 & 65;
        int i50 = (i48 ^ 65) | i49;
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        f55394c = i51 % 128;
        if (i51 % 2 == 0) {
            return listPlus2;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -632892682, 632892682, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -1083698430, 1083698433, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade}, -812130151, 812130153, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -1715432453, 1715432457, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 1851855015, -1851855014, System.identityHashCode(this));
    }
}
