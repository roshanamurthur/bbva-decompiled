package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0004\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setNextFocusLeftId;", "", "", "p0", "setY", "([B)[B", "", "setOnFocusChangeListener", "([B)Z", "Lcom/mypinpad/tsdk/i/getEmvLibVersion;", "([BLcom/mypinpad/tsdk/i/getEmvLibVersion;)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setNextFocusLeftId {

    @NotNull
    public static final setNextFocusLeftId INSTANCE = new setNextFocusLeftId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60168a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60169b = 1;

    static {
        int i10 = f60168a + 126;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f60169b = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 591) + (i10 * (-589));
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
        int i17 = ~i10;
        int i18 = (((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13;
        if (i18 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i19 = f60168a;
            int i20 = i19 ^ 43;
            int i21 = (i19 & 43) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            f60169b = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{(byte[]) setDividerPadding(new Object[]{bArr}, -2058921266, 2058921268, (int) System.currentTimeMillis()), getEmvLibVersion.getNavBarTitleString}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue();
            int i24 = f60169b;
            int i25 = i24 & 111;
            int i26 = (i24 | 111) & (~i25);
            int i27 = i25 << 1;
            int i28 = (i26 & i27) + (i26 | i27);
            f60168a = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 25 / 0;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i18 != 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            getEmvLibVersion getemvlibversion = (getEmvLibVersion) objArr[1];
            int i30 = f60168a;
            int i31 = ((i30 ^ 117) - (~(-(-((i30 & 117) << 1))))) - 1;
            f60169b = i31 % 128;
            if (i31 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr2, "");
                Intrinsics.checkNotNullParameter(getemvlibversion, "");
                return Boolean.valueOf(Arrays.equals(bArr2, getemvlibversion.setX()));
            }
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(getemvlibversion, "");
            Arrays.equals(bArr2, getemvlibversion.setX());
            throw null;
        }
        byte[] bArr3 = (byte[]) objArr[0];
        int i32 = f60168a;
        int i33 = (-2) - (((i32 ^ 106) + ((i32 & 106) << 1)) ^ (-1));
        f60169b = i33 % 128;
        int i34 = i33 % 2;
        Intrinsics.checkNotNullParameter(bArr3, "");
        if (bArr3.length < 2) {
            byte[] bArr4 = {0, 0};
            int i35 = f60169b;
            int i36 = (i35 & 43) + (i35 | 43);
            f60168a = i36 % 128;
            if (i36 % 2 == 0) {
                return bArr4;
            }
            throw null;
        }
        int i37 = f60169b;
        int i38 = ((i37 ^ 64) + ((i37 & 64) << 1)) - 1;
        f60168a = i38 % 128;
        int i39 = i38 % 2;
        int length = bArr3.length;
        int i40 = length & (-2);
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr3, c.until(i40 + ((length ^ (-2)) | i40), bArr3.length));
        int i41 = f60168a;
        int i42 = i41 & 13;
        int i43 = (i41 | 13) & (~i42);
        int i44 = -(-(i42 << 1));
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        f60169b = i45 % 128;
        int i46 = i45 % 2;
        return bArrSliceArray;
    }

    public static boolean setOnFocusChangeListener(@NotNull byte[] p4) {
        return ((Boolean) setDividerPadding(new Object[]{p4}, 793691168, -793691167, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static byte[] setY(@NotNull byte[] p4) {
        return (byte[]) setDividerPadding(new Object[]{p4}, -2058921266, 2058921268, (int) System.currentTimeMillis());
    }

    public static boolean setY(@NotNull byte[] bArr, @NotNull getEmvLibVersion getemvlibversion) {
        return ((Boolean) setDividerPadding(new Object[]{bArr, getemvlibversion}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue();
    }
}
