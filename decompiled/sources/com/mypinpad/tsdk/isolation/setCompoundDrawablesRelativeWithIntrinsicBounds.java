package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setCompoundDrawablesRelativeWithIntrinsicBounds implements Closeable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f59568q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f59569r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ArrayList f59570p0 = new ArrayList();

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = (((~(i11 | i16)) | (~(i12 | i14)) | i13) * 988) + (((~(i10 | i16)) | i15) * (-1976)) + ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        if (i17 == 1) {
            setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = (setCompoundDrawablesRelativeWithIntrinsicBounds) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i18 = f59568q0;
            int i19 = i18 & 77;
            int i20 = (i18 | 77) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            f59569r0 = i22 % 128;
            int i23 = i22 % 2;
            Object obj = setcompounddrawablesrelativewithintrinsicbounds.f59570p0.get(iIntValue);
            if (i23 != 0) {
                return (char[]) obj;
            }
            throw null;
        }
        if (i17 == 2) {
            setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds2 = (setCompoundDrawablesRelativeWithIntrinsicBounds) objArr[0];
            char[] cArr = (char[]) objArr[1];
            int i24 = (-2) - ((f59569r0 + 118) ^ (-1));
            f59568q0 = i24 % 128;
            if (i24 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cArr, "");
                setcompounddrawablesrelativewithintrinsicbounds2.f59570p0.add(cArr);
                throw null;
            }
            Intrinsics.checkNotNullParameter(cArr, "");
            setcompounddrawablesrelativewithintrinsicbounds2.f59570p0.add(cArr);
            int i25 = f59568q0;
            int i26 = (i25 ^ 79) + ((i25 & 79) << 1);
            f59569r0 = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }
        if (i17 == 3) {
            setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds3 = (setCompoundDrawablesRelativeWithIntrinsicBounds) objArr[0];
            int i28 = f59568q0;
            int i29 = i28 ^ 97;
            int i30 = ((((i28 & 97) | i29) << 1) - (~(-i29))) - 1;
            f59569r0 = i30 % 128;
            if (i30 % 2 == 0) {
                setcompounddrawablesrelativewithintrinsicbounds3.f59570p0.size();
                throw null;
            }
            if (setcompounddrawablesrelativewithintrinsicbounds3.f59570p0.size() <= 0) {
                setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds3}, -1787621891, 1787621891, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds3));
                int i31 = f59568q0;
                int i32 = ((i31 | 43) << 1) - (i31 ^ 43);
                f59569r0 = i32 % 128;
                if (i32 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            char[] cArr2 = (char[]) setcompounddrawablesrelativewithintrinsicbounds3.f59570p0.get(0).clone();
            setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds3}, -1787621891, 1787621891, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds3));
            setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds3, cArr2}, 671563438, -671563436, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds3));
            int i33 = f59568q0;
            int i34 = ((i33 | 72) << 1) - (i33 ^ 72);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            f59569r0 = i35 % 128;
            int i36 = i35 % 2;
            return null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds4 = (setCompoundDrawablesRelativeWithIntrinsicBounds) objArr[0];
        int i37 = f59569r0;
        int i38 = (i37 ^ 35) + ((i37 & 35) << 1);
        f59568q0 = i38 % 128;
        int i39 = i38 % 2;
        Iterator it = setcompounddrawablesrelativewithintrinsicbounds4.f59570p0.iterator();
        int i40 = f59568q0;
        int i41 = ((i40 | 41) << 1) - (i40 ^ 41);
        while (true) {
            f59569r0 = i41 % 128;
            int i42 = i41 % 2;
            if (!it.hasNext()) {
                setcompounddrawablesrelativewithintrinsicbounds4.f59570p0.clear();
                int i43 = f59568q0;
                int i44 = i43 & 25;
                int i45 = ((((i43 ^ 25) | i44) << 1) - (~(-((i43 | 25) & (~i44))))) - 1;
                f59569r0 = i45 % 128;
                int i46 = i45 % 2;
                return null;
            }
            int i47 = f59568q0;
            int i48 = (i47 | 9) << 1;
            int i49 = -(i47 ^ 9);
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            f59569r0 = i50 % 128;
            if (i50 % 2 == 0) {
                ArraysKt___ArraysKt.getIndices((char[]) it.next()).iterator();
                throw null;
            }
            char[] cArr3 = (char[]) it.next();
            Iterator<Integer> it2 = ArraysKt___ArraysKt.getIndices(cArr3).iterator();
            int i51 = f59569r0;
            int i52 = i51 ^ 61;
            int i53 = (((i51 & 61) | i52) << 1) - i52;
            f59568q0 = i53 % 128;
            int i54 = i53 % 2;
            while (it2.hasNext()) {
                int i55 = f59569r0 + 106;
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                f59568q0 = i56 % 128;
                int i57 = i56 % 2;
                cArr3[((IntIterator) it2).nextInt()] = (char) Random.INSTANCE.nextInt();
                int i58 = f59569r0;
                int i59 = (i58 & 115) + (i58 | 115);
                f59568q0 = i59 % 128;
                int i60 = i59 % 2;
            }
            int i61 = f59568q0;
            int i62 = i61 & 23;
            i41 = i62 + ((i61 ^ 23) | i62);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setY(new Object[]{this}, -1787621891, 1787621891, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull char[] cArr) {
        setY(new Object[]{this, cArr}, 671563438, -671563436, System.identityHashCode(this));
    }

    public final void setX() {
        setY(new Object[]{this}, -1958278013, 1958278016, System.identityHashCode(this));
    }

    @NotNull
    public final char[] setY(int i10) {
        return (char[]) setY(new Object[]{this, Integer.valueOf(i10)}, 1108736109, -1108736108, i10);
    }
}
