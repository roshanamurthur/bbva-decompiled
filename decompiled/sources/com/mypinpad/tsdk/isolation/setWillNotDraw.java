package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setWillNotDraw extends setLineBreakWordStyle {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f60832o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f60833p = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final byte[] f60834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final byte[] f60835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final byte[] f60836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final UUID f60837l;

    @NotNull
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UUID f60838n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setWillNotDraw(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4, @NotNull byte[] bArr5, @NotNull byte[] bArr6, @NotNull byte[] bArr7, @NotNull byte[] bArr8, @NotNull byte[] bArr9, @NotNull UUID uuid, @NotNull byte[] bArr10, @NotNull UUID uuid2) {
        super(bArr, bArr5, bArr6, bArr7, bArr8, bArr9, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        Intrinsics.checkNotNullParameter(bArr5, "");
        Intrinsics.checkNotNullParameter(bArr6, "");
        Intrinsics.checkNotNullParameter(bArr7, "");
        Intrinsics.checkNotNullParameter(bArr8, "");
        Intrinsics.checkNotNullParameter(bArr9, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr10, "");
        Intrinsics.checkNotNullParameter(uuid2, "");
        this.f60834i = bArr2;
        this.f60835j = bArr3;
        this.f60836k = bArr4;
        this.f60837l = uuid;
        this.m = bArr10;
        this.f60838n = uuid2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-489)) + (i10 * 491);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((i14 | i15 | (~i12)) * (-490)) + i13;
        int i17 = (i14 * 490) + (((~(i10 | i15)) | (~(i15 | i12))) * 490) + i16;
        if (i17 == 1) {
            setWillNotDraw setwillnotdraw = (setWillNotDraw) objArr[0];
            int i18 = f60832o;
            int i19 = (((i18 | 71) << 1) - (~(-(i18 ^ 71)))) - 1;
            f60833p = i19 % 128;
            int i20 = i19 % 2;
            byte[] bArr = setwillnotdraw.f60834i;
            int i21 = (((i18 & (-82)) | ((~i18) & 81)) - (~((i18 & 81) << 1))) - 1;
            f60833p = i21 % 128;
            if (i21 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        if (i17 == 2) {
            setWillNotDraw setwillnotdraw2 = (setWillNotDraw) objArr[0];
            int i22 = f60832o;
            int i23 = i22 & 99;
            int i24 = i23 + ((i22 ^ 99) | i23);
            f60833p = i24 % 128;
            int i25 = i24 % 2;
            byte[] bArr2 = setwillnotdraw2.f60836k;
            if (i25 == 0) {
                int i26 = 59 / 0;
            }
            int i27 = (i22 ^ 77) + ((i22 & 77) << 1);
            f60833p = i27 % 128;
            if (i27 % 2 != 0) {
                return bArr2;
            }
            int i28 = 27 / 0;
            return bArr2;
        }
        if (i17 == 3) {
            setWillNotDraw setwillnotdraw3 = (setWillNotDraw) objArr[0];
            int i29 = f60833p;
            int i30 = ((i29 | 58) << 1) - (i29 ^ 58);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            int i32 = i31 % 128;
            f60832o = i32;
            int i33 = i31 % 2;
            byte[] bArr3 = setwillnotdraw3.f60835j;
            int i34 = i32 + 7;
            f60833p = i34 % 128;
            if (i34 % 2 != 0) {
                return bArr3;
            }
            throw null;
        }
        if (i17 == 4) {
            setWillNotDraw setwillnotdraw4 = (setWillNotDraw) objArr[0];
            int i35 = f60832o;
            int i36 = i35 | 69;
            int i37 = i36 << 1;
            int i38 = -((~(i35 & 69)) & i36);
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f60833p = i39 % 128;
            int i40 = i39 % 2;
            UUID uuid = setwillnotdraw4.f60837l;
            if (i40 != 0) {
                return uuid;
            }
            int i41 = 82 / 0;
            return uuid;
        }
        if (i17 != 5) {
            setWillNotDraw setwillnotdraw5 = (setWillNotDraw) objArr[0];
            int i42 = f60833p;
            int i43 = (i42 ^ 87) + ((i42 & 87) << 1);
            int i44 = i43 % 128;
            f60832o = i44;
            int i45 = i43 % 2;
            UUID uuid2 = setwillnotdraw5.f60838n;
            int i46 = i44 & 1;
            int i47 = ((i44 | 1) & (~i46)) + (i46 << 1);
            f60833p = i47 % 128;
            int i48 = i47 % 2;
            return uuid2;
        }
        setWillNotDraw setwillnotdraw6 = (setWillNotDraw) objArr[0];
        int i49 = f60832o;
        int i50 = i49 + 111;
        f60833p = i50 % 128;
        int i51 = i50 % 2;
        byte[] bArr4 = setwillnotdraw6.m;
        if (i51 == 0) {
            throw null;
        }
        int i52 = i49 & 43;
        int i53 = -(-(i49 | 43));
        int i54 = (i52 & i53) + (i52 | i53);
        f60833p = i54 % 128;
        int i55 = i54 % 2;
        return bArr4;
    }

    @NotNull
    public final byte[] getNavBarTitleString() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1125145203, -1125145201, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setAlwaysDrawnWithCacheEnabled() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1704641920, -1704641915, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setIncludeFontPadding() {
        return (UUID) setOnFocusChangeListener(new Object[]{this}, 68908064, -68908064, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setLayoutAnimation() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1967924734, 1967924737, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 53632450, -53632449, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setOnLongClickListener() {
        return (UUID) setOnFocusChangeListener(new Object[]{this}, 1609564975, -1609564971, System.identityHashCode(this));
    }
}
