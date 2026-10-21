package com.mypinpad.tsdk.isolation;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionCancelled {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51901a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51902b = 1;

    @NotNull
    public static final ByteBuffer setCompoundDrawableTintBlendMode(@NotNull ByteBuffer byteBuffer, @NotNull setWidth setwidth) {
        return (ByteBuffer) setY(new Object[]{byteBuffer, setwidth}, 942844553, -942844552, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final ByteBuffer setX(@NotNull ByteBuffer byteBuffer, @NotNull setWidth setwidth) {
        return (ByteBuffer) setY(new Object[]{byteBuffer, setwidth}, 296674209, -296674209, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~(i11 | i12);
        int i16 = ((~((~i10) | i13)) | i15) * 196;
        int i17 = i16 + ((i11 | i10) * 392) + ((i14 | i15) * (-196)) + (i11 * (-195)) + (i10 * (-391));
        if (i17 == 1) {
            ByteBuffer byteBuffer = (ByteBuffer) objArr[0];
            setWidth setwidth = (setWidth) objArr[1];
            int i18 = f51902b;
            int i19 = i18 & 57;
            int i20 = (i18 ^ 57) | i19;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f51901a = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            Intrinsics.checkNotNullParameter(setwidth, "");
            ByteBuffer byteBuffer2 = (ByteBuffer) setY(new Object[]{byteBuffer, setwidth.setOnFocusChangeListener()}, -650223366, 650223368, (int) System.currentTimeMillis());
            int i23 = f51902b + 115;
            f51901a = i23 % 128;
            if (i23 % 2 == 0) {
                return byteBuffer2;
            }
            throw null;
        }
        if (i17 != 2) {
            ByteBuffer byteBuffer3 = (ByteBuffer) objArr[0];
            setWidth setwidth2 = (setWidth) objArr[1];
            int i24 = f51901a;
            int i25 = ((i24 & 17) - (~(-(-(i24 | 17))))) - 1;
            f51902b = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(byteBuffer3, "");
            Intrinsics.checkNotNullParameter(setwidth2, "");
            ByteBuffer byteBufferPut = byteBuffer3.put(setwidth2.setOnFocusChangeListener());
            Intrinsics.checkNotNullExpressionValue(byteBufferPut, "");
            int i27 = f51901a;
            int i28 = (i27 ^ 45) + ((i27 & 45) << 1);
            f51902b = i28 % 128;
            int i29 = i28 % 2;
            return byteBufferPut;
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i30 = ~iCurrentTimeMillis;
        int i31 = ~(((~i30) & (-555907587)) | (i30 & 555907586) | ((-555907587) & i30));
        int i32 = 1869807487 & iCurrentTimeMillis;
        int i33 = (1869807487 | iCurrentTimeMillis) & (~i32);
        int i34 = i31 | (~((i33 & i32) | (i33 ^ i32)));
        int i35 = (-1112572941) & iCurrentTimeMillis;
        int i36 = ((-1112572941) | iCurrentTimeMillis) & (~i35);
        int i37 = ~((i36 & i35) | (i36 ^ i35));
        int i38 = i34 & i37;
        int i39 = (i34 | i37) & (~i38);
        int i40 = -(-(((i39 & i38) | (i39 ^ i38)) * 765));
        int i41 = (-205579322) ^ i40;
        int i42 = -(-((i40 & (-205579322)) << 1));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        int i44 = ~((1313899901 ^ i30) | (1313899901 & i30));
        int i45 = 555907586 & i44;
        int i46 = (((555907586 | i44) & (~i45)) | i45) * 1530;
        int i47 = i43 ^ i46;
        int i48 = (i43 & i46) << 1;
        int i49 = (i47 & i48) + (i48 | i47);
        int i50 = (iCurrentTimeMillis & 1313899901) | (1313899901 ^ iCurrentTimeMillis);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = (-1668480527) ^ i30;
        int i54 = i30 & (-1668480527);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = (1313899901 & i55) | ((~i55) & (-1313899902));
        int i57 = i55 & (-1313899902);
        int i58 = ~((i57 & i56) | (i56 ^ i57));
        int i59 = ((~i58) & i52) | ((~i52) & i58);
        int i60 = i52 & i58;
        int i61 = -(-(((i60 & i59) | (i59 ^ i60)) * 765));
        int i62 = i49 ^ i61;
        int i63 = ((i61 & i49) | i62) << 1;
        int i64 = -i62;
        int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i66 = ~iCurrentTimeMillis2;
        int i67 = i66 & 1209878538;
        int i68 = (i66 & (-1209878539)) | ((~i66) & 1209878538) | i67;
        int i69 = ~i68;
        int i70 = (i68 | i69) & i69;
        int i71 = ((-606082470) & i70) | ((~i70) & 606082469);
        int i72 = i70 & 606082469;
        int i73 = (i72 & i71) | (i71 ^ i72);
        int i74 = (-135331851) & iCurrentTimeMillis2;
        int i75 = ~(i74 | ((~i74) & ((-135331851) | iCurrentTimeMillis2)));
        int i76 = -(-((((~i73) & i75) | ((~i75) & i73) | (i73 & i75)) * 717));
        int i77 = 410646032 & i76;
        int i78 = (((i76 | 410646032) & (~i77)) - (~(i77 << 1))) - 1;
        int i79 = (-135331851) ^ i66;
        int i80 = i66 & (-135331851);
        int i81 = ~((i80 & i79) | (i79 ^ i80));
        int i82 = i81 ^ 606082469;
        int i83 = i81 & 606082469;
        int i84 = (i83 & i82) | (i82 ^ i83);
        int i85 = ~((iCurrentTimeMillis2 & 1209878538) | ((-1209878539) & iCurrentTimeMillis2) | i67);
        int i86 = -(-(((i85 & i84) | (i84 ^ i85)) * 717));
        int i87 = i78 & i86;
        int i88 = i78 | i86;
        if (i65 > (i87 ^ i88) + ((i88 & i87) << 1)) {
            Intrinsics.checkNotNullParameter(byteBuffer4, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            ByteBuffer byteBufferPut2 = byteBuffer4.putInt(bArr.length).put(bArr);
            Intrinsics.checkNotNullExpressionValue(byteBufferPut2, "");
            return byteBufferPut2;
        }
        Intrinsics.checkNotNullParameter(byteBuffer4, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        ByteBuffer byteBufferPut3 = byteBuffer4.putInt(bArr.length).put(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut3, "");
        int i89 = 60 / 0;
        return byteBufferPut3;
    }
}
