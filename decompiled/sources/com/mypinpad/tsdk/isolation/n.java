package com.mypinpad.tsdk.isolation;

import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T extends Enum<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final openContextMenu<T> f57180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57181d;

    public n(int i10, int i11, int i12, @NotNull openContextMenu<T> opencontextmenu) {
        Intrinsics.checkNotNullParameter(opencontextmenu, "");
        this.f57178a = i10;
        this.f57179b = i11;
        this.f57180c = opencontextmenu;
        int i13 = -i12;
        int i14 = i11 & i13;
        int i15 = ((i11 ^ i13) | i14) << 1;
        int i16 = -((i11 | i13) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = -(-(i17 * (-97)));
        int i19 = 50 & i18;
        int i20 = ((50 ^ i18) | i19) << 1;
        int i21 = -((i18 | 50) & (~i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = ~i17;
        int i24 = ~i10;
        int i25 = i23 & i24;
        int i26 = (~i25) & (i23 | i24);
        int i27 = ~((i25 & i26) | (i26 ^ i25));
        int i28 = (i23 & (-2)) | ((~i23) & 1);
        int i29 = i23 & 1;
        int i30 = (i28 & i29) | (i28 ^ i29);
        int i31 = ~i30;
        int i32 = (i22 - (~(-(-((i27 | ((i30 | i31) & i31)) * 98))))) - 1;
        int i33 = i24 & (i24 | i10);
        int i34 = (-2) & i33;
        int i35 = ((i33 | (-2)) & (~i34)) | i34;
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = (i37 & i23) | (i23 ^ i37);
        int i39 = ~((i10 ^ 1) | (i10 & 1));
        int i40 = ((~i39) & i38) | ((~i38) & i39);
        int i41 = i38 & i39;
        int i42 = (i32 - (~(((i41 & i40) | (i40 ^ i41)) * (-49)))) - 1;
        int i43 = i23 ^ i10;
        int i44 = i10 & i23;
        int i45 = ~((i44 & i43) | (i43 ^ i44));
        int i46 = (i17 ^ 1) | (i17 & 1);
        int i47 = ~i46;
        int i48 = (i46 | i47) & i47;
        int i49 = -(-(((i45 & i48) | (i45 ^ i48)) * 49));
        this.f57181d = (i42 ^ i49) + ((i49 & i42) << 1);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919)) == 1) {
            n nVar = (n) objArr[0];
            t tVar = (t) objArr[1];
            KProperty kProperty = (KProperty) objArr[2];
            Intrinsics.checkNotNullParameter(tVar, "");
            Intrinsics.checkNotNullParameter(kProperty, "");
            openContextMenu<T> opencontextmenu = nVar.f57180c;
            int i18 = nVar.f57178a;
            return (Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(((Byte) u.setDividerPadding(new Object[]{tVar, Integer.valueOf(i18), Integer.valueOf(nVar.f57179b), Integer.valueOf(nVar.f57181d)}, -1480922781, 1480922783, i18)).byteValue())}, 693193897, -693193897, System.identityHashCode(opencontextmenu));
        }
        n nVar2 = (n) objArr[0];
        t tVar2 = (t) objArr[1];
        KProperty kProperty2 = (KProperty) objArr[2];
        Enum r10 = (Enum) objArr[3];
        Intrinsics.checkNotNullParameter(tVar2, "");
        Intrinsics.checkNotNullParameter(kProperty2, "");
        Intrinsics.checkNotNullParameter(r10, "");
        int i19 = nVar2.f57178a;
        u.setDividerPadding(new Object[]{tVar2, Integer.valueOf(i19), Integer.valueOf(nVar2.f57179b), Integer.valueOf(nVar2.f57181d), Byte.valueOf(nVar2.f57180c.setOnFocusChangeListener(r10))}, 2085960727, -2085960727, i19);
        return null;
    }

    public final void setOnFocusChangeListener(@NotNull t tVar, @NotNull KProperty<?> kProperty, @NotNull T t10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, tVar, kProperty, t10}, 697712004, -697712004, System.identityHashCode(this));
    }

    @NotNull
    public final T setY(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return (T) setCompoundDrawableTintBlendMode(new Object[]{this, tVar, kProperty}, 2052976211, -2052976210, System.identityHashCode(this));
    }
}
