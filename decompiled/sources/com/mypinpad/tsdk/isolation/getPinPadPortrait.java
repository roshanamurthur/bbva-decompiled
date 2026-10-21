package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getPinPadPortrait implements Closeable {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55945s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55946t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f55947p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Metadata f55948q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f55949r0;

    public getPinPadPortrait(@NotNull Map<String, String> map, @NotNull Metadata metadata, int i10) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(metadata, "");
        this.f55947p0 = map;
        this.f55948q0 = metadata;
        this.f55949r0 = i10;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        Object next;
        int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        if (i13 == 1) {
            Metadata metadata = ((getPinPadPortrait) objArr[0]).f55948q0;
            String str = new String((byte[]) Metadata.setY(new Object[]{metadata}, 1982236974, -1982236973, System.identityHashCode(metadata)), Charsets.UTF_8);
            int i14 = f55945s0 + 79;
            f55946t0 = i14 % 128;
            int i15 = i14 % 2;
            return str;
        }
        if (i13 == 2) {
            getPinPadPortrait getpinpadportrait = (getPinPadPortrait) objArr[0];
            int i16 = f55945s0;
            int i17 = ((((i16 ^ 71) | (i16 & 71)) << 1) - (~(-(((~i16) & 71) | (i16 & (-72)))))) - 1;
            f55946t0 = i17 % 128;
            int i18 = i17 % 2;
            obj = getpinpadportrait.f55947p0;
            if (i18 == 0) {
                int i19 = 55 / 0;
            }
        } else {
            if (i13 == 3) {
                getPinPadPortrait getpinpadportrait2 = (getPinPadPortrait) objArr[0];
                int i20 = f55945s0;
                int i21 = (i20 ^ 41) + ((i20 & 41) << 1);
                f55946t0 = i21 % 128;
                if (i21 % 2 == 0) {
                    Metadata metadata2 = getpinpadportrait2.f55948q0;
                    Metadata.setY(new Object[]{metadata2}, -1222766384, 1222766384, System.identityHashCode(metadata2));
                    throw null;
                }
                Metadata metadata3 = getpinpadportrait2.f55948q0;
                Metadata.setY(new Object[]{metadata3}, -1222766384, 1222766384, System.identityHashCode(metadata3));
                int i22 = f55946t0;
                int i23 = (i22 & 105) + (i22 | 105);
                f55945s0 = i23 % 128;
                int i24 = i23 % 2;
                return null;
            }
            if (i13 == 4) {
                getPinPadPortrait getpinpadportrait3 = (getPinPadPortrait) objArr[0];
                int i25 = f55945s0;
                int i26 = ((i25 & 24) + (i25 | 24)) - 1;
                int i27 = i26 % 128;
                f55946t0 = i27;
                int i28 = i26 % 2;
                int i29 = getpinpadportrait3.f55949r0;
                int i30 = i27 & 31;
                int i31 = (i27 ^ 31) | i30;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f55945s0 = i32 % 128;
                int i33 = i32 % 2;
                return Integer.valueOf(i29);
            }
            getPinPadPortrait getpinpadportrait4 = (getPinPadPortrait) objArr[0];
            String str2 = (String) objArr[1];
            int i34 = f55946t0 + 64;
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            f55945s0 = i35 % 128;
            int i36 = i35 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            Iterator<T> it = getpinpadportrait4.f55947p0.entrySet().iterator();
            int i37 = f55945s0;
            int i38 = i37 & 61;
            int i39 = ((i37 ^ 61) | i38) << 1;
            int i40 = -((i37 | 61) & (~i38));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f55946t0 = i41 % 128;
            int i42 = i41 % 2;
            while (true) {
                if (!it.hasNext()) {
                    int i43 = f55946t0;
                    int i44 = i43 & 89;
                    int i45 = (i44 - (~((i43 ^ 89) | i44))) - 1;
                    f55945s0 = i45 % 128;
                    int i46 = i45 % 2;
                    next = null;
                    break;
                }
                int i47 = f55945s0;
                int i48 = (((i47 & (-120)) | ((~i47) & 119)) - (~((i47 & 119) << 1))) - 1;
                f55946t0 = i48 % 128;
                int i49 = i48 % 2;
                next = it.next();
                if (l.equals((String) ((Map.Entry) next).getKey(), str2, true)) {
                    int i50 = f55945s0;
                    int i51 = i50 & 101;
                    int i52 = -(-((i50 ^ 101) | i51));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    int i54 = i53 % 128;
                    f55946t0 = i54;
                    if (i53 % 2 == 0) {
                        int i55 = 47 / 0;
                    }
                    int i56 = i54 & 57;
                    int i57 = i56 + ((i54 ^ 57) | i56);
                    f55945s0 = i57 % 128;
                    int i58 = i57 % 2;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null) {
                int i59 = f55946t0;
                int i60 = ((((i59 ^ 93) | (i59 & 93)) << 1) - (~(-(((~i59) & 93) | (i59 & (-94)))))) - 1;
                int i61 = i60 % 128;
                f55945s0 = i61;
                int i62 = i60 % 2;
                int i63 = (-2) - ((i61 + 56) ^ (-1));
                f55946t0 = i63 % 128;
                if (i63 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            obj = (String) entry.getValue();
            int i64 = f55945s0 + 114;
            int i65 = (i64 ^ (-1)) + (i64 << 1);
            f55946t0 = i65 % 128;
            if (i65 % 2 == 0) {
                throw null;
            }
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 585541415, -585541412, System.identityHashCode(this));
    }

    @NotNull
    public final Map<String, String> setDividerPadding() {
        return (Map) setCompoundDrawableTintBlendMode(new Object[]{this}, -1843161111, 1843161113, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1915342845, -1915342844, System.identityHashCode(this));
    }

    @Nullable
    public final String setY(@NotNull String str) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, str}, 2027246223, -2027246223, System.identityHashCode(this));
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -717849782, 717849786, System.identityHashCode(this))).intValue();
    }
}
