package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnKeyListener extends setLineBreakWordStyle {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f60250l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final byte[] f60251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final UUID f60252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final byte[] f60253k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnKeyListener(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4, @NotNull byte[] bArr5, @NotNull byte[] bArr6, @NotNull byte[] bArr7, @NotNull UUID uuid, @NotNull byte[] bArr8) {
        super(bArr, bArr3, bArr4, bArr5, bArr6, bArr7, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        Intrinsics.checkNotNullParameter(bArr5, "");
        Intrinsics.checkNotNullParameter(bArr6, "");
        Intrinsics.checkNotNullParameter(bArr7, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr8, "");
        this.f60251i = bArr2;
        this.f60252j = uuid;
        this.f60253k = bArr8;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        int i20 = ((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2;
        int i21 = (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + i20 + ((i17 | i18) * (-516)) + i13;
        if (i21 == 1) {
            setOnKeyListener setonkeylistener = (setOnKeyListener) objArr[0];
            int i22 = m;
            int i23 = ((i22 ^ 19) | (i22 & 19)) << 1;
            int i24 = -(((~i22) & 19) | (i22 & (-20)));
            int i25 = (i23 & i24) + (i24 | i23);
            f60250l = i25 % 128;
            int i26 = i25 % 2;
            byte[] bArr = setonkeylistener.f60253k;
            if (i26 == 0) {
                return bArr;
            }
            int i27 = 12 / 0;
            return bArr;
        }
        if (i21 != 2) {
            setOnKeyListener setonkeylistener2 = (setOnKeyListener) objArr[0];
            int i28 = f60250l;
            int i29 = (i28 & (-44)) | ((~i28) & 43);
            int i30 = (i28 & 43) << 1;
            int i31 = (i29 & i30) + (i29 | i30);
            m = i31 % 128;
            int i32 = i31 % 2;
            UUID uuid = setonkeylistener2.f60252j;
            int i33 = i28 + 63;
            m = i33 % 128;
            int i34 = i33 % 2;
            return uuid;
        }
        setOnKeyListener setonkeylistener3 = (setOnKeyListener) objArr[0];
        int i35 = m;
        int i36 = i35 + 60;
        int i37 = (i36 ^ (-1)) + (i36 << 1);
        f60250l = i37 % 128;
        int i38 = i37 % 2;
        byte[] bArr2 = setonkeylistener3.f60251i;
        if (i38 != 0) {
            throw null;
        }
        int i39 = i35 & 15;
        int i40 = (((i35 ^ 15) | i39) << 1) - ((i35 | 15) & (~i39));
        f60250l = i40 % 128;
        if (i40 % 2 == 0) {
            return bArr2;
        }
        int i41 = 74 / 0;
        return bArr2;
    }

    @NotNull
    public final byte[] getNavBarTitleString() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -206333591, 206333592, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -865119755, 865119757, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setOnLongClickListener() {
        return (UUID) setOnFocusChangeListener(new Object[]{this}, -1719547469, 1719547469, System.identityHashCode(this));
    }
}
