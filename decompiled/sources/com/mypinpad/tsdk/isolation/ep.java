package com.mypinpad.tsdk.isolation;

import bk.d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ep extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55392c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55393d = 1;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        List list;
        boolean zBooleanValue;
        int i13 = ~i12;
        int i14 = (((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        if (i14 == 1) {
            int i15 = f55392c;
            int i16 = (((i15 | 118) << 1) - (i15 ^ 118)) - 1;
            f55393d = i16 % 128;
            if (i16 % 2 == 0) {
                eh ehVar = eh.INSTANCE;
                list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
                int i17 = 95 / 0;
            } else {
                eh ehVar2 = eh.INSTANCE;
                list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
            }
            int i18 = f55392c;
            int i19 = (-2) - (((i18 ^ 24) + ((i18 & 24) << 1)) ^ (-1));
            f55393d = i19 % 128;
            int i20 = i19 % 2;
            return list;
        }
        if (i14 == 2) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            int i21 = f55392c;
            int i22 = (i21 & (-96)) | ((~i21) & 95);
            int i23 = -(-((i21 & 95) << 1));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f55393d = i24 % 128;
            if (i24 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                eh ehVar3 = eh.INSTANCE;
                zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 967111399, -967111399, (int) System.currentTimeMillis())).booleanValue();
                int i25 = 50 / 0;
            } else {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                eh ehVar4 = eh.INSTANCE;
                zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 967111399, -967111399, (int) System.currentTimeMillis())).booleanValue();
            }
            int i26 = f55393d;
            int i27 = (((i26 & (-116)) | ((~i26) & 115)) - (~((i26 & 115) << 1))) - 1;
            f55392c = i27 % 128;
            int i28 = i27 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        if (i14 == 3) {
            int i29 = f55392c;
            int i30 = ((i29 ^ 97) | (i29 & 97)) << 1;
            int i31 = -(((~i29) & 97) | (i29 & (-98)));
            int i32 = (i30 & i31) + (i31 | i30);
            f55393d = i32 % 128;
            int i33 = i32 % 2;
            eh ehVar5 = eh.INSTANCE;
            List list2 = (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            int i34 = f55392c;
            int i35 = i34 & 77;
            int i36 = (i34 ^ 77) | i35;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f55393d = i37 % 128;
            if (i37 % 2 != 0) {
                return list2;
            }
            int i38 = 71 / 0;
            return list2;
        }
        if (i14 == 4) {
            int i39 = f55392c;
            int i40 = (i39 ^ 25) + ((i39 & 25) << 1);
            f55393d = i40 % 128;
            int i41 = i40 % 2;
            eh ehVar6 = eh.INSTANCE;
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis()), (Iterable) d.listOf(setImageTintBlendMode.setOnLongClickListener));
            int i42 = f55392c;
            int i43 = i42 & 25;
            int i44 = i43 + ((i42 ^ 25) | i43);
            f55393d = i44 % 128;
            int i45 = i44 % 2;
            return listPlus;
        }
        int i46 = f55392c;
        int i47 = i46 & 3;
        int i48 = -(-(i46 | 3));
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        f55393d = i49 % 128;
        if (i49 % 2 == 0) {
            eh ehVar7 = eh.INSTANCE;
            throw null;
        }
        eh ehVar8 = eh.INSTANCE;
        List list3 = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
        int i50 = f55392c;
        int i51 = ((i50 | 97) << 1) - (i50 ^ 97);
        f55393d = i51 % 128;
        int i52 = i51 % 2;
        return list3;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setX(new Object[]{this}, -19600145, 19600146, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setX(new Object[]{this}, 763183863, -763183859, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setX(new Object[]{this, setscrollbardefaultdelaybeforefade}, -1149818710, 1149818712, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setX(new Object[]{this}, 1750848403, -1750848400, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setX(new Object[]{this}, 483621030, -483621030, System.identityHashCode(this));
    }
}
