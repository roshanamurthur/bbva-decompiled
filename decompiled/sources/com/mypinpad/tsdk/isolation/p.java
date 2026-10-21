package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57608b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57609c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57610a;

    public p(int i10) {
        this.f57610a = i10;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 != 1) {
            p pVar = (p) objArr[0];
            t tVar = (t) objArr[1];
            KProperty kProperty = (KProperty) objArr[2];
            int i19 = f57608b;
            int i20 = ((i19 & 49) - (~(-(-(i19 | 49))))) - 1;
            f57609c = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(tVar, "");
            Intrinsics.checkNotNullParameter(kProperty, "");
            byte b10 = ((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)))[pVar.f57610a];
            int i22 = f57608b;
            int i23 = i22 & 107;
            int i24 = (i23 - (~((i22 ^ 107) | i23))) - 1;
            f57609c = i24 % 128;
            if (i24 % 2 != 0) {
                return Byte.valueOf(b10);
            }
            throw null;
        }
        p pVar2 = (p) objArr[0];
        t tVar2 = (t) objArr[1];
        KProperty kProperty2 = (KProperty) objArr[2];
        byte bByteValue = ((Byte) objArr[3]).byteValue();
        int i25 = f57608b;
        int i26 = (i25 ^ 125) + ((i25 & 125) << 1);
        f57609c = i26 % 128;
        if (i26 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tVar2, "");
            Intrinsics.checkNotNullParameter(kProperty2, "");
            ((byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2)))[pVar2.f57610a] = bByteValue;
            throw null;
        }
        Intrinsics.checkNotNullParameter(tVar2, "");
        Intrinsics.checkNotNullParameter(kProperty2, "");
        ((byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2)))[pVar2.f57610a] = bByteValue;
        int i27 = f57609c;
        int i28 = (i27 & 83) + (i27 | 83);
        f57608b = i28 % 128;
        if (i28 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final byte setDividerPadding(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return ((Byte) setX(new Object[]{this, tVar, kProperty}, -681277519, 681277519, System.identityHashCode(this))).byteValue();
    }

    public final void setOnFocusChangeListener(@NotNull t tVar, @NotNull KProperty<?> kProperty, byte b10) {
        setX(new Object[]{this, tVar, kProperty, Byte.valueOf(b10)}, 1628090707, -1628090706, System.identityHashCode(this));
    }
}
