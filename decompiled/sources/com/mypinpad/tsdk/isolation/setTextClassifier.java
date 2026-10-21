package com.mypinpad.tsdk.isolation;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextClassifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60640a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60641b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-978)) + (i10 * 980);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13;
        int i17 = 0;
        if (i16 == 1) {
            UUID uuid = (UUID) objArr[0];
            int i18 = f60641b;
            int i19 = i18 | 117;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 117)) & i19);
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f60640a = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(uuid, "");
            int i24 = f60641b;
            int i25 = ((i24 ^ 38) + ((i24 & 38) << 1)) - 1;
            f60640a = i25 % 128;
            if (i25 % 2 == 0) {
                return 16;
            }
            throw null;
        }
        if (i16 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            int i26 = f60640a;
            int i27 = (i26 & 125) + (i26 | 125);
            f60641b = i27 % 128;
            if (i27 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                Intrinsics.checkNotNullExpressionValue(ByteBuffer.wrap(bArr), "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(bArr, "");
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
            int i28 = (-2) - ((f60640a + 10) ^ (-1));
            f60641b = i28 % 128;
            if (i28 % 2 != 0) {
                return byteBufferWrap;
            }
            throw null;
        }
        if (i16 == 3) {
            UUID uuid2 = (UUID) objArr[0];
            int i29 = f60640a;
            int i30 = (i29 & (-116)) | ((~i29) & 115);
            int i31 = (i29 & 115) << 1;
            int i32 = (i30 & i31) + (i31 | i30);
            f60641b = i32 % 128;
            if (i32 % 2 != 0) {
                Intrinsics.checkNotNullParameter(uuid2, "");
                byte[] bArrArray = ByteBuffer.allocate(((Integer) setCompoundDrawableTintBlendMode(new Object[]{uuid2}, 1684385418, -1684385417, (int) System.currentTimeMillis())).intValue()).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array();
                Intrinsics.checkNotNullExpressionValue(bArrArray, "");
                return bArrArray;
            }
            Intrinsics.checkNotNullParameter(uuid2, "");
            byte[] bArrArray2 = ByteBuffer.allocate(((Integer) setCompoundDrawableTintBlendMode(new Object[]{uuid2}, 1684385418, -1684385417, (int) System.currentTimeMillis())).intValue()).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array();
            Intrinsics.checkNotNullExpressionValue(bArrArray2, "");
            int i33 = 76 / 0;
            return bArrArray2;
        }
        if (i16 != 4) {
            UUID uuid3 = (UUID) objArr[0];
            int i34 = ((-1) << 1) - ((f60640a + 94) ^ (-1));
            f60641b = i34 % 128;
            int i35 = i34 % 2;
            Intrinsics.checkNotNullParameter(uuid3, "");
            ByteBuffer byteBuffer = (ByteBuffer) setCompoundDrawableTintBlendMode(new Object[]{(byte[]) setCompoundDrawableTintBlendMode(new Object[]{uuid3}, 214629047, -214629044, (int) System.currentTimeMillis())}, 403320205, -403320203, (int) System.currentTimeMillis());
            byte[] bArrArray3 = ByteBuffer.allocate(((Integer) setCompoundDrawableTintBlendMode(new Object[]{uuid3}, 1684385418, -1684385417, (int) System.currentTimeMillis())).intValue()).order(ByteOrder.LITTLE_ENDIAN).putInt(byteBuffer.getInt()).putShort(byteBuffer.getShort()).putShort(byteBuffer.getShort()).order(ByteOrder.BIG_ENDIAN).putLong(byteBuffer.getLong()).array();
            Intrinsics.checkNotNullExpressionValue(bArrArray3, "");
            int i36 = f60641b;
            int i37 = i36 & 9;
            int i38 = (i36 | 9) & (~i37);
            int i39 = i37 << 1;
            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
            f60640a = i40 % 128;
            int i41 = i40 % 2;
            return bArrArray3;
        }
        byte[] bArr2 = (byte[]) objArr[0];
        byte[] bArr3 = (byte[]) objArr[1];
        int i42 = f60641b;
        int i43 = (i42 ^ 103) + ((i42 & 103) << 1);
        f60640a = i43 % 128;
        if (i43 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            int length = bArr2.length;
            int length2 = bArr3.length;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        if (bArr2.length < bArr3.length) {
            int i44 = f60641b + 53;
            f60640a = i44 % 128;
            int i45 = i44 % 2;
        } else {
            int i46 = f60641b + 63;
            f60640a = i46 % 128;
            int i47 = i46 % 2;
            bArr2 = bArr3;
            bArr3 = bArr2;
        }
        byte[] bArr4 = new byte[bArr2.length];
        int length3 = bArr2.length;
        System.currentTimeMillis();
        System.currentTimeMillis();
        int i48 = 0;
        while (i17 < length3) {
            int i49 = f60640a;
            int i50 = ((i49 | 95) << 1) - (i49 ^ 95);
            int i51 = i50 % 128;
            f60641b = i51;
            int i52 = i50 % 2;
            byte b10 = bArr2[i17];
            int i53 = ((i48 ^ 1) | (i48 & 1)) << 1;
            int i54 = -((i48 & (-2)) | ((~i48) & 1));
            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
            byte b11 = bArr3[i48];
            int i56 = b11 & b10;
            bArr4[i48] = (byte) (((b10 ^ b11) | i56) & (~i56));
            i17++;
            int i57 = (i51 & 63) + (i51 | 63);
            f60640a = i57 % 128;
            int i58 = i57 % 2;
            i48 = i55;
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr4, ArraysKt___ArraysJvmKt.copyOfRange(bArr3, bArr2.length, bArr3.length));
        int i59 = f60641b;
        int i60 = (i59 & (-50)) | ((~i59) & 49);
        int i61 = -(-((i59 & 49) << 1));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        f60640a = i62 % 128;
        int i63 = i62 % 2;
        return bArrPlus;
    }

    @NotNull
    public static final byte[] setY(@NotNull UUID uuid) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{uuid}, 230957076, -230957076, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 1635997004, -1635997000, (int) System.currentTimeMillis());
    }
}
