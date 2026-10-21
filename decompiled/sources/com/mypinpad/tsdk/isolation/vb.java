package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61529a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61530b = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i12)) | (~(i11 | i15))) * 950) + (((~(i15 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i14 | i15)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949));
        if (i16 == 1) {
            UUID uuid = (UUID) objArr[0];
            int i17 = f61530b;
            int i18 = (((i17 | 126) << 1) - (i17 ^ 126)) - 1;
            f61529a = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.checkNotNullParameter(uuid, "");
                i13 = 98;
            } else {
                Intrinsics.checkNotNullParameter(uuid, "");
                i13 = 16;
            }
            int i19 = f61530b;
            int i20 = ((i19 & (-12)) | ((~i19) & 11)) + ((i19 & 11) << 1);
            f61529a = i20 % 128;
            if (i20 % 2 == 0) {
                return Integer.valueOf(i13);
            }
            throw null;
        }
        if (i16 == 2) {
            UUID uuid2 = (UUID) objArr[0];
            int i21 = f61529a;
            int i22 = ((-1) << 1) - (((i21 & 48) + (i21 | 48)) ^ (-1));
            f61530b = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(uuid2, "");
            ByteBuffer byteBuffer = (ByteBuffer) ux.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) setY(new Object[]{uuid2}, -1996491624, 1996491624, (int) System.currentTimeMillis())}, 948738577, -948738574, (int) System.currentTimeMillis());
            byte[] bArrArray = ByteBuffer.allocate(((Integer) setY(new Object[]{uuid2}, -1234283614, 1234283615, (int) System.currentTimeMillis())).intValue()).order(ByteOrder.LITTLE_ENDIAN).putInt(byteBuffer.getInt()).putShort(byteBuffer.getShort()).putShort(byteBuffer.getShort()).order(ByteOrder.BIG_ENDIAN).putLong(byteBuffer.getLong()).array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "");
            int i24 = f61529a;
            int i25 = i24 & 95;
            int i26 = (i24 ^ 95) | i25;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f61530b = i27 % 128;
            int i28 = i27 % 2;
            return bArrArray;
        }
        UUID uuid3 = (UUID) objArr[0];
        int i29 = f61529a;
        int i30 = i29 & 45;
        int i31 = (i30 - (~(-(-((i29 ^ 45) | i30))))) - 1;
        f61530b = i31 % 128;
        if (i31 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uuid3, "");
            Intrinsics.checkNotNullExpressionValue(ByteBuffer.allocate(((Integer) setY(new Object[]{uuid3}, -1234283614, 1234283615, (int) System.currentTimeMillis())).intValue()).putLong(uuid3.getMostSignificantBits()).putLong(uuid3.getLeastSignificantBits()).array(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(uuid3, "");
        byte[] bArrArray2 = ByteBuffer.allocate(((Integer) setY(new Object[]{uuid3}, -1234283614, 1234283615, (int) System.currentTimeMillis())).intValue()).putLong(uuid3.getMostSignificantBits()).putLong(uuid3.getLeastSignificantBits()).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray2, "");
        int i32 = f61530b;
        int i33 = i32 & 53;
        int i34 = i32 | 53;
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        f61529a = i35 % 128;
        if (i35 % 2 == 0) {
            return bArrArray2;
        }
        throw null;
    }

    @NotNull
    public static final byte[] setY(@NotNull UUID uuid) {
        return (byte[]) setY(new Object[]{uuid}, 1288849308, -1288849306, (int) System.currentTimeMillis());
    }
}
