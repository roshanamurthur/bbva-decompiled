package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class dh extends df {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f55185u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f55186v = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(@NotNull byte[] bArr, int i10, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) {
        super(bArr, i10, bArr2, bArr3, bArr4);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0071 A[PHI: r1 r8
      0x0071: PHI (r1v21 byte[]) = (r1v2 byte[]), (r1v23 byte[]) binds: [B:8:0x005e, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r8v21 byte[]) = (r8v7 byte[]), (r8v23 byte[]) binds: [B:8:0x005e, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0060 A[PHI: r8
      0x0060: PHI (r8v8 byte[]) = (r8v7 byte[]), (r8v23 byte[]) binds: [B:8:0x005e, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArrPlus;
        byte[] bArr;
        dh dhVar = (dh) objArr[0];
        int i13 = f55185u;
        int i14 = (i13 & 24) + (i13 | 24);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f55186v = i15 % 128;
        if (i15 % 2 == 0) {
            byte[] bArr2 = new byte[0];
            bArr2[1] = dhVar.setCompoundDrawableTintBlendMode();
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr2, dhVar.setDividerPadding());
            bArr = (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, 298274011, -298274005, System.identityHashCode(dhVar));
            if (bArr == null) {
                bArr = new byte[0];
                int i16 = f55186v;
                int i17 = ((i16 & 43) - (~(i16 | 43))) - 1;
                f55185u = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = f55185u;
                int i20 = (((i19 | 96) << 1) - (i19 ^ 96)) - 1;
                f55186v = i20 % 128;
                int i21 = i20 % 2;
            }
        } else {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{dhVar.setCompoundDrawableTintBlendMode()}, dhVar.setDividerPadding());
            bArr = (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, 298274011, -298274005, System.identityHashCode(dhVar));
            if (bArr == null) {
                bArr = new byte[0];
                int i110 = f55186v;
                int i111 = ((i110 & 43) - (~(i110 | 43))) - 1;
                f55185u = i111 % 128;
                int i112 = i111 % 2;
            } else {
                int i113 = f55185u;
                int i22 = (((i113 | 96) << 1) - (i113 ^ 96)) - 1;
                f55186v = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        boolean zBooleanValue = ((Boolean) dl.setCompoundDrawableTintBlendMode(new Object[]{ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus, bArr), dhVar.setX()), new byte[]{((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, -1993710626, 1993710627, System.identityHashCode(dhVar))).byteValue()}), new byte[]{((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, 208355073, -208355069, System.identityHashCode(dhVar))).byteValue()}), new byte[]{dhVar.setY()}), new byte[]{dhVar.getNavBarTitleString()}), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, -2004011430, 2004011432, System.identityHashCode(dhVar))), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dhVar}, -2055662065, 2055662076, System.identityHashCode(dhVar))), dhVar.setOnFocusChangeListener()), dhVar.setOnLongClickListener()}, -2112094012, 2112094019, (int) System.currentTimeMillis())).booleanValue();
        int i24 = f55186v;
        int i25 = i24 & 15;
        int i26 = i24 | 15;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        f55185u = i27 % 128;
        int i28 = i27 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // com.mypinpad.tsdk.isolation.df
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -657205392, 657205392, System.identityHashCode(this))).booleanValue();
    }
}
