package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setLayoutMode;", "", "", "p0", "p1", "setX", "([B[B)[B", "setDividerPadding", "<init>", "()V", "setY"}, k = 1, mv = {1, 5, 1})
public final class setLayoutMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59969a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59970b = 1;

    static {
        int i10 = f59970b;
        int i11 = ((i10 & 99) - (~(i10 | 99))) - 1;
        f59969a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws akx {
        Object dividerPadding;
        Object dividerPadding2;
        int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i15 | i16) * (-814)) + i13;
        int i18 = ~(i14 | (~i12));
        int i19 = ~i10;
        int i20 = ~(i19 | i11);
        int i21 = (((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17;
        if (i21 == 1) {
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            byte[] bArr = (byte[]) objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            ams amsVar = new ams(new amc());
            int length = bArr2.length;
            int i22 = (length | (-16)) << 1;
            int i23 = -(((~length) & (-16)) | (length & 15));
            ams.setOnFocusChangeListener(new Object[]{amsVar, Boolean.valueOf(zBooleanValue), new amt(new ann(bArr2, 16, ((i22 | i23) << 1) - (i23 ^ i22)), ArraysKt___ArraysJvmKt.copyOfRange(bArr2, 0, 12))}, -178364514, 178364526, System.identityHashCode(amsVar));
            int length2 = bArr.length;
            byte[] bArr3 = new byte[((Integer) ams.setOnFocusChangeListener(new Object[]{amsVar, Integer.valueOf(length2)}, -1079775388, 1079775403, length2)).intValue()];
            int iIntValue = ((Integer) ams.setOnFocusChangeListener(new Object[]{amsVar, bArr, 0, Integer.valueOf(bArr.length), bArr3}, -1548625384, 1548625386, 0)).intValue();
            ((Integer) ams.setOnFocusChangeListener(new Object[]{amsVar, bArr3, Integer.valueOf(iIntValue)}, -2019112885, 2019112889, iIntValue)).intValue();
            int i24 = f59970b;
            int i25 = (i24 ^ 103) + ((i24 & 103) << 1);
            f59969a = i25 % 128;
            int i26 = i25 % 2;
            return bArr3;
        }
        if (i21 != 2) {
            byte[] bArr4 = (byte[]) objArr[0];
            byte[] bArr5 = (byte[]) objArr[1];
            int i27 = f59970b + 79;
            f59969a = i27 % 128;
            if (i27 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr4, "");
                Intrinsics.checkNotNullParameter(bArr5, "");
                dividerPadding2 = setDividerPadding(new Object[]{Boolean.TRUE, bArr4, bArr5}, -1437419928, 1437419929, (int) System.currentTimeMillis());
            } else {
                Intrinsics.checkNotNullParameter(bArr4, "");
                Intrinsics.checkNotNullParameter(bArr5, "");
                dividerPadding2 = setDividerPadding(new Object[]{Boolean.TRUE, bArr4, bArr5}, -1437419928, 1437419929, (int) System.currentTimeMillis());
            }
            return (byte[]) dividerPadding2;
        }
        byte[] bArr6 = (byte[]) objArr[0];
        byte[] bArr7 = (byte[]) objArr[1];
        int i28 = f59969a + 109;
        f59970b = i28 % 128;
        if (i28 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr6, "");
            Intrinsics.checkNotNullParameter(bArr7, "");
            dividerPadding = setDividerPadding(new Object[]{Boolean.TRUE, bArr6, bArr7}, -1437419928, 1437419929, (int) System.currentTimeMillis());
        } else {
            Intrinsics.checkNotNullParameter(bArr6, "");
            Intrinsics.checkNotNullParameter(bArr7, "");
            dividerPadding = setDividerPadding(new Object[]{Boolean.FALSE, bArr6, bArr7}, -1437419928, 1437419929, (int) System.currentTimeMillis());
        }
        return (byte[]) dividerPadding;
    }

    @NotNull
    public static byte[] setX(@NotNull byte[] p4, @NotNull byte[] p10) {
        return (byte[]) setDividerPadding(new Object[]{p4, p10}, 803784313, -803784313, (int) System.currentTimeMillis());
    }

    @NotNull
    public static byte[] setDividerPadding(@NotNull byte[] p4, @NotNull byte[] p10) {
        return (byte[]) setDividerPadding(new Object[]{p4, p10}, 1661851573, -1661851571, (int) System.currentTimeMillis());
    }
}
