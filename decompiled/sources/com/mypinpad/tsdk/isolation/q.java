package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57791c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57792d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57794b;

    public q(int i10, int i11) {
        this.f57793a = i10;
        this.f57794b = i11;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 399) + (i10 * 399);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        if ((((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + i13 == 1) {
            q qVar = (q) objArr[0];
            t tVar = (t) objArr[1];
            KProperty kProperty = (KProperty) objArr[2];
            Intrinsics.checkNotNullParameter(tVar, "");
            Intrinsics.checkNotNullParameter(kProperty, "");
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)), new IntRange(qVar.f57793a, qVar.f57794b));
            int i17 = f57792d;
            int i18 = i17 & 53;
            int i19 = (i17 ^ 53) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f57791c = i20 % 128;
            int i21 = i20 % 2;
            return bArrSliceArray;
        }
        q qVar2 = (q) objArr[0];
        t tVar2 = (t) objArr[1];
        KProperty kProperty2 = (KProperty) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        Intrinsics.checkNotNullParameter(tVar2, "");
        Intrinsics.checkNotNullParameter(kProperty2, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Iterator<Integer> it = new IntRange(qVar2.f57793a, qVar2.f57794b).iterator();
        int i22 = f57791c;
        int i23 = ((i22 & 14) + (i22 | 14)) - 1;
        f57792d = i23 % 128;
        int i24 = i23 % 2;
        while (it.hasNext()) {
            int i25 = f57792d;
            int i26 = ((i25 ^ 99) - (~((i25 & 99) << 1))) - 1;
            f57791c = i26 % 128;
            int i27 = i26 % 2;
            int i28 = qVar2.f57793a;
            if (i27 != 0) {
                int iNextInt = ((IntIterator) it).nextInt();
                ((byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2)))[iNextInt] = bArr[iNextInt << i28];
            } else {
                int iNextInt2 = ((IntIterator) it).nextInt();
                int i29 = -i28;
                int i30 = iNextInt2 & i29;
                int i31 = -(-((i29 ^ iNextInt2) | i30));
                ((byte[]) setImageTintList.setX(new Object[]{tVar2}, -1317873722, 1317873728, System.identityHashCode(tVar2)))[iNextInt2] = bArr[(i30 ^ i31) + ((i31 & i30) << 1)];
            }
            int i32 = f57792d;
            int i33 = i32 & 19;
            int i34 = -(-(i32 | 19));
            int i35 = (i33 & i34) + (i34 | i33);
            f57791c = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f57792d;
        int i38 = i37 & 31;
        int i39 = ((i37 ^ 31) | i38) << 1;
        int i40 = -((i37 | 31) & (~i38));
        int i41 = (i39 & i40) + (i40 | i39);
        f57791c = i41 % 128;
        int i42 = i41 % 2;
        return null;
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull t tVar, @NotNull KProperty<?> kProperty, @NotNull byte[] bArr) {
        setY(new Object[]{this, tVar, kProperty, bArr}, -1411167663, 1411167663, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnFocusChangeListener(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return (byte[]) setY(new Object[]{this, tVar, kProperty}, 2085857005, -2085857004, System.identityHashCode(this));
    }
}
