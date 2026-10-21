package com.mypinpad.tsdk.isolation;

import bk.p;
import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class openContextMenu<T extends Enum<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57528d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57529e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f57530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f57531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final T f57532c;

    public openContextMenu(T[] tArr, Integer num, T t10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(tArr.length), 16));
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            T t11 = tArr[i10];
            linkedHashMap.put(Byte.valueOf(setOnFocusChangeListener(t11)), t11);
            int i11 = ((i10 & 79) + (i10 | 79)) - 1;
            int i12 = i11 & (-77);
            int i13 = ((i11 ^ (-77)) | i12) << 1;
            int i14 = -((i11 | (-77)) & (~i12));
            i10 = (i13 | i14) + (i13 & i14);
        }
        this.f57530a = linkedHashMap;
        this.f57531b = num;
        this.f57532c = t10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        openContextMenu opencontextmenu = (openContextMenu) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i13 = f57528d;
        int i14 = (-2) - ((((i13 | 30) << 1) - (i13 ^ 30)) ^ (-1));
        f57529e = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        Object obj = (Enum) opencontextmenu.f57530a.get(Byte.valueOf(bByteValue));
        if (obj == null) {
            obj = opencontextmenu.f57532c;
            if (obj == null) {
                Integer num = opencontextmenu.f57531b;
                Intrinsics.checkNotNull(num);
                throw new fh(num.intValue(), String.valueOf((int) bByteValue));
            }
            int i15 = f57529e;
            int i16 = i15 ^ 73;
            int i17 = -(-((i15 & 73) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f57528d = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = f57529e;
            int i21 = (i20 & 90) + (i20 | 90);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            f57528d = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        }
        return obj;
    }

    public abstract byte setOnFocusChangeListener(@NotNull T t10);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public openContextMenu(@NotNull T[] tArr, int i10) {
        this(tArr, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullParameter(tArr, "");
    }

    @NotNull
    public final T setOnFocusChangeListener(byte b10) {
        return (T) setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, 693193897, -693193897, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public openContextMenu(@NotNull T[] tArr, @NotNull T t10) {
        this(tArr, null, t10);
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(t10, "");
    }
}
