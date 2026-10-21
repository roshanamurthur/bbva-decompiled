package com.mypinpad.tsdk.isolation;

import androidx.core.view.PointerIconCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/aal;", "", "Lcom/mypinpad/tsdk/i/abw;", "p0", "Lcom/mypinpad/tsdk/i/abv;", "p1", "", "setX", "(Lcom/mypinpad/tsdk/i/abw;Lcom/mypinpad/tsdk/i/abv;)V", "", "setY", "(Lcom/mypinpad/tsdk/i/abw;)I", "Lcom/mypinpad/tsdk/i/aby;", "", "p2", "(Lcom/mypinpad/tsdk/i/aby;JLcom/mypinpad/tsdk/i/abv;)V", "<init>", "()V", "a"}, k = 1, mv = {1, 6, 0})
public final class aal {

    @NotNull
    public static final aal INSTANCE = new aal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f52176a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final byte[] f52177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f52178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52179d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52180e = 1;

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, MessageUtils.MESSAGE_30_RS, 28, 28, MessageUtils.MESSAGE_30_RS, 28, 28, 28, 28, 28, 28, 28, 28, MessageUtils.MESSAGE_30_RS, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, MessageUtils.MESSAGE_21_NAK, 22, 23, 22, 23, 23, 24, 22, MessageUtils.MESSAGE_21_NAK, 20, 22, 22, 23, 23, MessageUtils.MESSAGE_21_NAK, 23, 22, 22, 24, MessageUtils.MESSAGE_21_NAK, 22, 23, 23, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, 22, MessageUtils.MESSAGE_21_NAK, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 20, 19, 22, 23, 22, 25, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 27, 27, MessageUtils.MESSAGE_26_SUB, 24, 25, 19, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_26_SUB, 27, 27, MessageUtils.MESSAGE_26_SUB, 27, 24, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 28, 27, 27, 27, 20, 24, 20, MessageUtils.MESSAGE_21_NAK, 22, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, 23, 22, 22, 25, 25, 24, 24, MessageUtils.MESSAGE_26_SUB, 23, MessageUtils.MESSAGE_26_SUB, 27, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, MessageUtils.MESSAGE_26_SUB};
        f52177b = bArr;
        f52178c = new a();
        int length = bArr.length;
        int i10 = ((-1) << 1) - ((f52179d + 66) ^ (-1));
        f52180e = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < length) {
            int i13 = f52179d;
            int i14 = i13 ^ 7;
            int i15 = -(-((i13 & 7) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            f52180e = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i12 ^ 1;
            int i19 = ((i12 & 1) | i18) << 1;
            int i20 = -i18;
            setOnFocusChangeListener(new Object[]{Integer.valueOf(i12), Integer.valueOf(f52176a[i12]), Integer.valueOf(f52177b[i12])}, 608611897, -608611895, i12);
            System.currentTimeMillis();
            System.currentTimeMillis();
            i12 = (i19 ^ i20) + ((i20 & i19) << 1);
        }
        int i21 = f52180e;
        int i22 = (i21 | 61) << 1;
        int i23 = -(((~i21) & 61) | (i21 & (-62)));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        f52179d = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a3 A[PHI: r5 r7 r8
      0x00a3: PHI (r5v29 int) = (r5v28 int), (r5v40 int) binds: [B:12:0x00a1, B:8:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v14 com.mypinpad.tsdk.i.aal$a[]) = (r7v13 com.mypinpad.tsdk.i.aal$a[]), (r7v22 com.mypinpad.tsdk.i.aal$a[]) binds: [B:12:0x00a1, B:8:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v13 int) = (r8v12 int), (r8v19 int) binds: [B:12:0x00a1, B:8:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        int i11;
        a[] aVarArr;
        a aVar;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        a aVar2 = new a(iIntValue, iIntValue3);
        int i12 = f52179d;
        int i13 = i12 & 59;
        int i14 = -(-((i12 ^ 59) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        f52180e = i15 % 128;
        int i16 = i15 % 2;
        a aVar3 = f52178c;
        while (iIntValue3 > 8) {
            int i17 = f52180e;
            int i18 = i17 ^ 95;
            int i19 = ((i17 & 95) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f52179d = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = iIntValue3 + 41;
                i10 = (i22 ^ (-1)) + (i22 << 1);
                i11 = (iIntValue2 / i10) & 2074;
                aVarArr = (a[]) a.a(new Object[]{aVar3}, 1676699664, -1676699663, System.identityHashCode(aVar3));
                Intrinsics.checkNotNull(aVarArr);
                aVar = aVarArr[i11];
                if (aVar == null) {
                    aVar = new a();
                    aVarArr[i11] = aVar;
                    int i23 = f52180e;
                    int i24 = i23 & 71;
                    int i25 = (((i23 | 71) & (~i24)) - (~(i24 << 1))) - 1;
                    f52179d = i25 % 128;
                    int i26 = i25 % 2;
                }
            } else {
                int i27 = iIntValue3 & 70;
                int i28 = (iIntValue3 | 70) & (~i27);
                int i29 = i27 << 1;
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                i10 = (((i30 | (-77)) << 1) - (i30 ^ (-77))) - 1;
                i11 = (iIntValue2 >>> i10) & 255;
                aVarArr = (a[]) a.a(new Object[]{aVar3}, 1676699664, -1676699663, System.identityHashCode(aVar3));
                Intrinsics.checkNotNull(aVarArr);
                aVar = aVarArr[i11];
                if (aVar == null) {
                    aVar = new a();
                    aVarArr[i11] = aVar;
                    int i210 = f52180e;
                    int i211 = i210 & 71;
                    int i212 = (((i210 | 71) & (~i211)) - (~(i211 << 1))) - 1;
                    f52179d = i212 % 128;
                    int i213 = i212 % 2;
                }
            }
            iIntValue3 = i10;
            aVar3 = aVar;
            int i31 = f52180e + 103;
            f52179d = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = -iIntValue3;
        int i34 = i33 * (-375);
        int i35 = i34 & (-3000);
        int i36 = (i35 - (~((i34 ^ (-3000)) | i35))) - 1;
        int i37 = ~i33;
        int i38 = (i37 | i33) & i37;
        int i39 = i38 & (-9);
        int i40 = (i38 | (-9)) & (~i39);
        int i41 = ~((i40 & i39) | (i40 ^ i39));
        int i42 = (i41 & iIntValue) | (iIntValue ^ i41);
        int i43 = (i33 & (-9)) | (i37 & 8);
        int i44 = i33 & 8;
        int i45 = ~((i43 ^ i44) | (i43 & i44));
        int i46 = -(-(((i42 ^ i45) | (i42 & i45)) * 376));
        int i47 = i36 & i46;
        int i48 = (i47 - (~(-(-((i36 ^ i46) | i47))))) - 1;
        int i49 = ~iIntValue;
        int i50 = i49 | i33;
        int i51 = ~i50;
        int i52 = i51 & (i50 | i51);
        int i53 = i33 ^ 8;
        int i54 = ~((i53 & i44) | (i53 ^ i44));
        int i55 = ((~i54) & i52) | ((~i52) & i54);
        int i56 = i52 & i54;
        int i57 = ((i56 & i55) | (i55 ^ i56)) * (-376);
        int i58 = i48 & i57;
        int i59 = (i57 ^ i48) | i58;
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        int i61 = (i37 & i49) | ((~i37) & iIntValue);
        int i62 = iIntValue & i37;
        int i63 = ~((i62 & i61) | (i61 ^ i62));
        int i64 = -(-(((i63 & 8) | (i63 ^ 8)) * 376));
        int i65 = i60 & i64;
        int i66 = (((i60 ^ i64) | i65) << 1) - ((i64 | i60) & (~i65));
        int i67 = (iIntValue2 << i66) & 255;
        int i68 = 1 << i66;
        a[] aVarArr2 = (a[]) a.a(new Object[]{aVar3}, 1676699664, -1676699663, System.identityHashCode(aVar3));
        Intrinsics.checkNotNull(aVarArr2);
        int i69 = ((~i68) & i67) | ((~i67) & i68);
        int i70 = (i68 & i67) << 1;
        ArraysKt___ArraysJvmKt.fill(aVarArr2, aVar2, i67, (i69 & i70) + (i70 | i69));
        int i71 = f52180e;
        int i72 = (i71 & 23) + (i71 | 23);
        f52179d = i72 % 128;
        if (i72 % 2 != 0) {
            int i73 = 54 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x02b0 A[PHI: r10
      0x02b0: PHI (r10v38 com.mypinpad.tsdk.i.aal$a) = (r10v29 com.mypinpad.tsdk.i.aal$a), (r10v42 com.mypinpad.tsdk.i.aal$a) binds: [B:37:0x02f1, B:33:0x02ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x02f3 A[PHI: r10
      0x02f3: PHI (r10v30 com.mypinpad.tsdk.i.aal$a) = (r10v29 com.mypinpad.tsdk.i.aal$a), (r10v42 com.mypinpad.tsdk.i.aal$a) binds: [B:37:0x02f1, B:33:0x02ad] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        Integer numValueOf;
        int i13;
        int iIntValue;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = ~i12;
        int i18 = (~(i14 | i17)) | i16 | (~(i15 | i17));
        int i19 = i10 | i11;
        int i20 = ((i18 | (~(i19 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i21 = i10 | (~(i12 | i15));
        int i22 = ~(i11 | i17);
        int i23 = ((i22 | (~i19)) * 84) + ((i21 | i22) * (-84)) + i20;
        byte[] bArr = f52177b;
        int i24 = -2055130861;
        int i25 = 2055130869;
        int i26 = 1;
        int i27 = 2;
        if (i23 == 1) {
            abw abwVar = (abw) objArr[0];
            int i28 = f52180e;
            int i29 = i28 & 111;
            int i30 = -(-((i28 ^ 111) | i29));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f52179d = i31 % 128;
            int i32 = i31 % 2;
            Intrinsics.checkNotNullParameter(abwVar, "");
            int iIntValue2 = ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
            int i33 = f52180e + 37;
            f52179d = i33 % 128;
            int i34 = i33 % 2;
            long j10 = 0;
            int i35 = 0;
            while (i35 < iIntValue2) {
                int i36 = f52180e;
                int i37 = i36 & 107;
                int i38 = ((i36 ^ 107) | i37) << 1;
                int i39 = -((i36 | 107) & (~i37));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f52179d = i40 % 128;
                int i41 = i40 % 2;
                int i42 = i35 & 19;
                int i43 = -(-(i35 | 19));
                int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                int i45 = i44 ^ (-18);
                int i46 = -(-((i44 & (-18)) << 1));
                j10 += (long) bArr[yt.setX(((Byte) abw.setX(new Object[]{abwVar, Integer.valueOf(i35)}, 2055130869, -2055130861, i35)).byteValue())];
                int i47 = f52179d;
                int i48 = i47 | 71;
                int i49 = i48 << 1;
                int i50 = -((~(i47 & 71)) & i48);
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f52180e = i51 % 128;
                int i52 = i51 % 2;
                i35 = ((i45 | i46) << 1) - (i45 ^ i46);
            }
            int i53 = (int) ((j10 + 7) >> 3);
            int i54 = f52180e;
            int i55 = i54 & 113;
            int i56 = (((i54 ^ 113) | i55) << 1) - ((i54 | 113) & (~i55));
            f52179d = i56 % 128;
            if (i56 % 2 != 0) {
                int i57 = 32 / 0;
            }
            numValueOf = Integer.valueOf(i53);
        } else if (i23 != 2) {
            long j11 = 1;
            if (i23 != 3) {
                abw abwVar2 = (abw) objArr[0];
                abv abvVar = (abv) objArr[1];
                int i58 = f52180e;
                int i59 = (i58 & 37) + (i58 | 37);
                f52179d = i59 % 128;
                if (i59 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(abwVar2, "");
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    iIntValue = ((Integer) abw.setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue();
                } else {
                    Intrinsics.checkNotNullParameter(abwVar2, "");
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    iIntValue = ((Integer) abw.setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue();
                    j11 = 0;
                }
                int i60 = 0;
                int i61 = 0;
                while (i60 < iIntValue) {
                    int i62 = f52179d + 9;
                    f52180e = i62 % 128;
                    int i63 = i62 % 2;
                    int i64 = (((i60 ^ (-90)) | (i60 & (-90))) << 1) - (((~i60) & (-90)) | (i60 & 89));
                    int i65 = i64 & 91;
                    int i66 = -(-((i64 ^ 91) | i65));
                    int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                    int x4 = yt.setX(((Byte) abw.setX(new Object[]{abwVar2, Integer.valueOf(i60)}, i25, i24, i60)).byteValue());
                    int i68 = f52176a[x4];
                    byte b10 = bArr[x4];
                    j11 = (j11 << b10) | ((long) i68);
                    int i69 = ((i61 | b10) << 1) - (i61 ^ b10);
                    int i70 = f52180e;
                    int i71 = ((i70 | 67) << 1) - ((67 & (~i70)) | (i70 & (-68)));
                    f52179d = i71 % 128;
                    int i72 = i71 % 2;
                    i61 = i69;
                    while (i61 >= 8) {
                        int i73 = f52179d + 45;
                        f52180e = i73 % 128;
                        int i74 = i73 % 2;
                        i61 = (-2) - ((i61 - 7) ^ (-1));
                        abvVar.setLayoutAnimation((int) (j11 >> i61));
                        int i75 = f52179d;
                        int i76 = i75 & 37;
                        int i77 = -(-((i75 ^ 37) | i76));
                        int i78 = (i76 & i77) + (i77 | i76);
                        f52180e = i78 % 128;
                        int i79 = i78 % 2;
                    }
                    i60 = i67;
                    i24 = -2055130861;
                    i25 = 2055130869;
                }
                if (i61 > 0) {
                    int i80 = f52179d;
                    int i81 = i80 & 13;
                    int i82 = -(-((i80 ^ 13) | i81));
                    int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                    f52180e = i83 % 128;
                    int i84 = i83 % 2;
                    int i85 = -i61;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i86 = i85 * 236;
                    int i87 = i86 & 3768;
                    int i88 = i87 + ((i86 ^ 3768) | i87);
                    int i89 = ~i85;
                    int i90 = ~iCurrentTimeMillis;
                    int i91 = ((~i90) & i89) | ((~i89) & i90);
                    int i92 = i90 & i89;
                    int i93 = ~((i92 & i91) | (i91 ^ i92));
                    int i94 = (i88 - (~(-(-(((i93 & 8) | (i93 ^ 8)) * (-235)))))) - 1;
                    int i95 = i89 & iCurrentTimeMillis;
                    int i96 = ~(i95 | ((~i95) & (i89 | iCurrentTimeMillis)));
                    int i97 = -(-(((i96 & 8) | (i96 ^ 8)) * (-470)));
                    int i98 = i94 & i97;
                    int i99 = (i94 ^ i97) | i98;
                    int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                    int i101 = ~((-9) | i85);
                    int i102 = (i85 | i89) & i89;
                    int i103 = i102 ^ 8;
                    int i104 = i102 & 8;
                    int i105 = (i104 & i103) | (i103 ^ i104);
                    int i106 = i105 ^ iCurrentTimeMillis;
                    int i107 = i105 & iCurrentTimeMillis;
                    int i108 = ~((i107 & i106) | (i106 ^ i107));
                    int i109 = -(-(((i108 & i101) | (i101 ^ i108)) * 235));
                    int i110 = i100 & i109;
                    abvVar.setLayoutAnimation((int) ((j11 << (i110 + ((i109 ^ i100) | i110))) | (255 >>> i61)));
                    int i111 = f52179d;
                    int i112 = i111 & 27;
                    int i113 = (i111 | 27) & (~i112);
                    int i114 = -(-(i112 << 1));
                    int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                    f52180e = i115 % 128;
                    int i116 = i115 % 2;
                }
                int i117 = f52179d;
                int i118 = i117 & 69;
                int i119 = -(-(i117 | 69));
                int i120 = (i118 & i119) + (i119 | i118);
                f52180e = i120 % 128;
                int i121 = i120 % 2;
                return null;
            }
            aby abyVar = (aby) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            abv abvVar2 = (abv) objArr[2];
            int i122 = f52180e;
            int i123 = i122 ^ 95;
            int i124 = ((((i122 & 95) | i123) << 1) - (~(-i123))) - 1;
            f52179d = i124 % 128;
            if (i124 % 2 != 0) {
                Intrinsics.checkNotNullParameter(abyVar, "");
                Intrinsics.checkNotNullParameter(abvVar2, "");
                i13 = 1;
            } else {
                Intrinsics.checkNotNullParameter(abyVar, "");
                Intrinsics.checkNotNullParameter(abvVar2, "");
                i13 = 0;
            }
            int i125 = f52180e;
            int i126 = (i125 & (-50)) | ((~i125) & 49);
            int i127 = -(-((i125 & 49) << 1));
            int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
            f52179d = i128 % 128;
            int i129 = i128 % 2;
            a aVar = f52178c;
            a aVar2 = aVar;
            int i130 = 0;
            long j12 = 0;
            while (j12 < jLongValue) {
                int i131 = f52179d;
                int i132 = ((i131 & 81) - (~(-(-(i131 | 81))))) - 1;
                f52180e = i132 % 128;
                int i133 = i132 % i27;
                j12 += j11;
                int x6 = yt.setX(abyVar.getNavBarTitleString());
                int i134 = i130 << 8;
                i130 = (i134 & x6) | (i134 ^ x6);
                i13 += 8;
                int i135 = f52180e;
                int i136 = (i135 & (-72)) | ((~i135) & 71);
                int i137 = (i135 & 71) << i26;
                int i138 = ((i136 | i137) << i26) - (i137 ^ i136);
                f52179d = i138 % 128;
                int i139 = i138 % i27;
                int i140 = 8;
                while (i13 >= i140) {
                    int i141 = f52179d;
                    int i142 = i141 & 51;
                    int i143 = -(-(i141 | 51));
                    int i144 = (i142 ^ i143) + ((i143 & i142) << i26);
                    f52180e = i144 % 128;
                    if (i144 % i27 == 0) {
                        Object[] objArr2 = new Object[i26];
                        objArr2[0] = aVar2;
                        a[] aVarArr = (a[]) a.a(objArr2, 1676699664, -1676699663, System.identityHashCode(aVar2));
                        Intrinsics.checkNotNull(aVarArr);
                        aVar2 = aVarArr[((i13 >>> 51) * i130) & 19137];
                        Intrinsics.checkNotNull(aVar2);
                        Object[] objArr3 = new Object[i26];
                        objArr3[0] = aVar2;
                        if (((a[]) a.a(objArr3, 1676699664, -1676699663, System.identityHashCode(aVar2))) == null) {
                            int i145 = f52179d;
                            int i146 = (i145 | 103) << i26;
                            int i147 = -(((~i145) & 103) | (i145 & (-104)));
                            int i148 = ((i146 | i147) << i26) - (i147 ^ i146);
                            f52180e = i148 % 128;
                            int i149 = i148 % 2;
                            Object[] objArr4 = new Object[i26];
                            objArr4[0] = aVar2;
                            abvVar2.setLayoutAnimation(((Integer) a.a(objArr4, -1671802211, 1671802211, System.identityHashCode(aVar2))).intValue());
                            Object[] objArr5 = new Object[i26];
                            objArr5[0] = aVar2;
                            int i150 = -((Integer) a.a(objArr5, -1461237203, 1461237205, System.identityHashCode(aVar2))).intValue();
                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                            int i151 = i150 * (-183);
                            int i152 = -(~(-(-(i13 * (-183)))));
                            int i153 = ((i151 & i152) + (i151 | i152)) - 1;
                            int i154 = ~i150;
                            int i155 = ~iCurrentTimeMillis2;
                            int i156 = i154 & i155;
                            int i157 = (~i156) & (i154 | i155);
                            int i158 = (i157 ^ i156) | (i156 & i157);
                            int i159 = i158 ^ i13;
                            int i160 = ~i13;
                            int i161 = i158 & i13;
                            int i162 = ~((i159 ^ i161) | (i159 & i161));
                            int i163 = i160 & (i160 | i13);
                            int i164 = ((~i155) & i163) | ((~i163) & i155);
                            int i165 = i163 & i155;
                            int i166 = (i165 & i164) | (i164 ^ i165);
                            int i167 = (i166 & i150) | (i166 ^ i150);
                            int i168 = ~i167;
                            int i169 = (i167 | i168) & i168;
                            int i170 = i162 ^ i169;
                            int i171 = i169 & i162;
                            int i172 = -(~(((i171 & i170) | (i170 ^ i171)) * (-184)));
                            int i173 = (((i153 | i172) << 1) - (i172 ^ i153)) - 1;
                            int i174 = ((~i160) & i154) | ((~i154) & i160);
                            int i175 = i154 & i160;
                            int i176 = (i174 & i175) | (i174 ^ i175);
                            int i177 = ~i176;
                            int i178 = (i176 | i177) & i177;
                            int i179 = ~i158;
                            int i180 = ((~i179) & i178) | ((~i178) & i179);
                            int i181 = i178 & i179;
                            int i182 = (i181 & i180) | (i180 ^ i181);
                            int i183 = ~(i160 | i155);
                            int i184 = -(-(((i182 & i183) | ((~i183) & i182) | ((~i182) & i183)) * 184));
                            int i185 = (i173 & i184) + (i184 | i173);
                            int i186 = i150 & i13;
                            int i187 = (~i186) & (i150 | i13);
                            int i188 = ((i186 & i187) | (i187 ^ i186)) * 184;
                            int i189 = i185 | i188;
                            int i190 = i189 << 1;
                            int i191 = -((~(i188 & i185)) & i189);
                            i13 = (i190 & i191) + (i191 | i190);
                            int i192 = f52179d;
                            int i193 = (i192 & 35) + (i192 | 35);
                            f52180e = i193 % 128;
                            int i194 = i193 % 2;
                            aVar2 = aVar;
                        } else {
                            int i195 = (i13 ^ (-33)) + ((i13 & (-33)) << 1);
                            i13 = (i195 & 25) + (i195 | 25);
                            int i196 = f52179d;
                            int i197 = i196 & 15;
                            int i198 = (((i196 ^ 15) | i197) << 1) - ((i196 | 15) & (~i197));
                            f52180e = i198 % 128;
                            int i199 = i198 % 2;
                        }
                    } else {
                        int i200 = i13 ^ (-8);
                        int i201 = ((i13 & (-8)) | i200) << i26;
                        int i202 = -i200;
                        int i203 = (i130 >>> (((i201 | i202) << i26) - (i202 ^ i201))) & 255;
                        Object[] objArr6 = new Object[i26];
                        objArr6[0] = aVar2;
                        a[] aVarArr2 = (a[]) a.a(objArr6, 1676699664, -1676699663, System.identityHashCode(aVar2));
                        Intrinsics.checkNotNull(aVarArr2);
                        aVar2 = aVarArr2[i203];
                        Intrinsics.checkNotNull(aVar2);
                        Object[] objArr7 = new Object[i26];
                        objArr7[0] = aVar2;
                        if (((a[]) a.a(objArr7, 1676699664, -1676699663, System.identityHashCode(aVar2))) == null) {
                            int i1410 = f52179d;
                            int i1411 = (i1410 | 103) << i26;
                            int i1412 = -(((~i1410) & 103) | (i1410 & (-104)));
                            int i1413 = ((i1411 | i1412) << i26) - (i1412 ^ i1411);
                            f52180e = i1413 % 128;
                            int i1414 = i1413 % 2;
                            Object[] objArr8 = new Object[i26];
                            objArr8[0] = aVar2;
                            abvVar2.setLayoutAnimation(((Integer) a.a(objArr8, -1671802211, 1671802211, System.identityHashCode(aVar2))).intValue());
                            Object[] objArr9 = new Object[i26];
                            objArr9[0] = aVar2;
                            int i1510 = -((Integer) a.a(objArr9, -1461237203, 1461237205, System.identityHashCode(aVar2))).intValue();
                            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                            int i1511 = i1510 * (-183);
                            int i1512 = -(~(-(-(i13 * (-183)))));
                            int i1513 = ((i1511 & i1512) + (i1511 | i1512)) - 1;
                            int i1514 = ~i1510;
                            int i1515 = ~iCurrentTimeMillis3;
                            int i1516 = i1514 & i1515;
                            int i1517 = (~i1516) & (i1514 | i1515);
                            int i1518 = (i1517 ^ i1516) | (i1516 & i1517);
                            int i1519 = i1518 ^ i13;
                            int i1610 = ~i13;
                            int i1611 = i1518 & i13;
                            int i1612 = ~((i1519 ^ i1611) | (i1519 & i1611));
                            int i1613 = i1610 & (i1610 | i13);
                            int i1614 = ((~i1515) & i1613) | ((~i1613) & i1515);
                            int i1615 = i1613 & i1515;
                            int i1616 = (i1615 & i1614) | (i1614 ^ i1615);
                            int i1617 = (i1616 & i1510) | (i1616 ^ i1510);
                            int i1618 = ~i1617;
                            int i1619 = (i1617 | i1618) & i1618;
                            int i1710 = i1612 ^ i1619;
                            int i1711 = i1619 & i1612;
                            int i1712 = -(~(((i1711 & i1710) | (i1710 ^ i1711)) * (-184)));
                            int i1713 = (((i1513 | i1712) << 1) - (i1712 ^ i1513)) - 1;
                            int i1714 = ((~i1610) & i1514) | ((~i1514) & i1610);
                            int i1715 = i1514 & i1610;
                            int i1716 = (i1714 & i1715) | (i1714 ^ i1715);
                            int i1717 = ~i1716;
                            int i1718 = (i1716 | i1717) & i1717;
                            int i1719 = ~i1518;
                            int i1810 = ((~i1719) & i1718) | ((~i1718) & i1719);
                            int i1811 = i1718 & i1719;
                            int i1812 = (i1811 & i1810) | (i1810 ^ i1811);
                            int i1813 = ~(i1610 | i1515);
                            int i1814 = -(-(((i1812 & i1813) | ((~i1813) & i1812) | ((~i1812) & i1813)) * 184));
                            int i1815 = (i1713 & i1814) + (i1814 | i1713);
                            int i1816 = i1510 & i13;
                            int i1817 = (~i1816) & (i1510 | i13);
                            int i1818 = ((i1816 & i1817) | (i1817 ^ i1816)) * 184;
                            int i1819 = i1815 | i1818;
                            int i1910 = i1819 << 1;
                            int i1911 = -((~(i1818 & i1815)) & i1819);
                            i13 = (i1910 & i1911) + (i1911 | i1910);
                            int i1912 = f52179d;
                            int i1913 = (i1912 & 35) + (i1912 | 35);
                            f52180e = i1913 % 128;
                            int i1914 = i1913 % 2;
                            aVar2 = aVar;
                        } else {
                            int i1915 = (i13 ^ (-33)) + ((i13 & (-33)) << 1);
                            i13 = (i1915 & 25) + (i1915 | 25);
                            int i1916 = f52179d;
                            int i1917 = i1916 & 15;
                            int i1918 = (((i1916 ^ 15) | i1917) << 1) - ((i1916 | 15) & (~i1917));
                            f52180e = i1918 % 128;
                            int i1919 = i1918 % 2;
                        }
                    }
                    abyVar = abyVar;
                    jLongValue = jLongValue;
                    i26 = 1;
                    i140 = 8;
                    i27 = 2;
                }
                j11 = 1;
            }
            while (true) {
                if (i13 > 0) {
                    int i204 = f52179d;
                    int i205 = ((i204 | 67) << 1) - (i204 ^ 67);
                    f52180e = i205 % 128;
                    int i206 = i205 % 2;
                    int i207 = -i13;
                    int i208 = i207 ^ 8;
                    int i209 = ((i207 & 8) | i208) << 1;
                    int i210 = -i208;
                    int i211 = (i130 << ((i209 ^ i210) + ((i209 & i210) << 1))) & 255;
                    a[] aVarArr3 = (a[]) a.a(new Object[]{aVar2}, 1676699664, -1676699663, System.identityHashCode(aVar2));
                    Intrinsics.checkNotNull(aVarArr3);
                    a aVar3 = aVarArr3[i211];
                    Intrinsics.checkNotNull(aVar3);
                    if (((a[]) a.a(new Object[]{aVar3}, 1676699664, -1676699663, System.identityHashCode(aVar3))) != null) {
                        break;
                    }
                    int i212 = f52180e;
                    int i213 = i212 & 33;
                    int i214 = (i213 - (~(-(-((i212 ^ 33) | i213))))) - 1;
                    f52179d = i214 % 128;
                    int i215 = i214 % 2;
                    if (((Integer) a.a(new Object[]{aVar3}, -1461237203, 1461237205, System.identityHashCode(aVar3))).intValue() > i13) {
                        break;
                    }
                    abvVar2.setLayoutAnimation(((Integer) a.a(new Object[]{aVar3}, -1671802211, 1671802211, System.identityHashCode(aVar3))).intValue());
                    int i216 = -((Integer) a.a(new Object[]{aVar3}, -1461237203, 1461237205, System.identityHashCode(aVar3))).intValue();
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i217 = i216 * 868;
                    int i218 = -(-(i13 * 868));
                    int i219 = ((i217 ^ i218) | (i217 & i218)) << 1;
                    int i220 = -(((~i218) & i217) | ((~i217) & i218));
                    int i221 = ((i219 | i220) << 1) - (i220 ^ i219);
                    int i222 = ~i216;
                    int i223 = ~iCurrentTimeMillis4;
                    int i224 = (i223 | iCurrentTimeMillis4) & i223;
                    int i225 = i222 & i224;
                    int i226 = (~i225) & (i224 | i222);
                    int i227 = ~((i225 & i226) | (i226 ^ i225));
                    int i228 = ~i13;
                    int i229 = (i228 | i13) & i228;
                    int i230 = i229 ^ i223;
                    int i231 = i229 & i223;
                    int i232 = ~((i230 ^ i231) | (i230 & i231));
                    int i233 = (i221 - (~(-(~(((i227 ^ i232) | (i227 & i232)) * (-867)))))) - 1;
                    int i234 = (i233 ^ (-1)) + (i233 << 1);
                    int i235 = (i222 | i216) & i222;
                    int i236 = ~(i235 | i228);
                    int i237 = i222 & iCurrentTimeMillis4;
                    int i238 = (~i237) & (i222 | iCurrentTimeMillis4);
                    int i239 = ~((i238 ^ i237) | (i237 & i238));
                    int i240 = i236 & i239;
                    int i241 = (i236 | i239) & (~i240);
                    int i242 = (i241 & i240) | (i241 ^ i240);
                    int i243 = i228 & iCurrentTimeMillis4;
                    int i244 = (~i243) & (i228 | iCurrentTimeMillis4);
                    int i245 = ~((i243 & i244) | (i244 ^ i243));
                    int i246 = ((~i245) & i242) | ((~i242) & i245);
                    int i247 = i242 & i245;
                    int i248 = -(-(((i247 & i246) | (i246 ^ i247)) * (-1734)));
                    int i249 = i234 & i248;
                    int i250 = (i248 ^ i234) | i249;
                    int i251 = (i249 & i250) + (i250 | i249);
                    int i252 = (i235 & i228) | (i235 ^ i228);
                    int i253 = i252 ^ i223;
                    int i254 = i252 & i223;
                    int i255 = ~((i254 & i253) | (i253 ^ i254));
                    int i256 = (i222 & i228) | ((~i222) & i13);
                    int i257 = i222 & i13;
                    int i258 = (i257 & i256) | (i256 ^ i257);
                    int i259 = (i258 & i223) | ((~i258) & iCurrentTimeMillis4);
                    int i260 = i258 & iCurrentTimeMillis4;
                    int i261 = ~((i260 & i259) | (i259 ^ i260));
                    int i262 = ((~i261) & i255) | ((~i255) & i261);
                    int i263 = i261 & i255;
                    int i264 = (i263 & i262) | (i262 ^ i263);
                    int i265 = i228 ^ i216;
                    int i266 = i216 & i228;
                    int i267 = (i266 & i265) | (i265 ^ i266);
                    int i268 = i267 & iCurrentTimeMillis4;
                    int i269 = (i267 | iCurrentTimeMillis4) & (~i268);
                    int i270 = ~((i269 & i268) | (i269 ^ i268));
                    int i271 = i264 & i270;
                    int i272 = -(-((((i270 | i264) & (~i271)) | i271) * 867));
                    int i273 = ((i251 ^ i272) | (i251 & i272)) << 1;
                    int i274 = -((i272 & (~i251)) | ((~i272) & i251));
                    i13 = (i273 & i274) + (i274 | i273);
                    int i275 = f52180e;
                    int i276 = i275 & 111;
                    int i277 = (i275 | 111) & (~i276);
                    int i278 = i276 << 1;
                    int i279 = (i277 & i278) + (i277 | i278);
                    f52179d = i279 % 128;
                    int i280 = i279 % 2;
                    aVar2 = aVar;
                } else {
                    numValueOf = null;
                    int i281 = f52180e;
                    int i282 = i281 & 111;
                    int i283 = (((i281 ^ 111) | i282) << 1) - ((i281 | 111) & (~i282));
                    f52179d = i283 % 128;
                    int i284 = i283 % 2;
                }
            }
            int i285 = f52180e;
            int i286 = i285 & 93;
            int i287 = (i286 - (~((i285 ^ 93) | i286))) - 1;
            f52179d = i287 % 128;
            numValueOf = null;
            if (i287 % 2 != 0) {
                throw null;
            }
        } else {
            numValueOf = null;
            a(objArr);
        }
        return numValueOf;
    }

    public static void setX(@NotNull aby p4, long p10, @NotNull abv p11) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setOnFocusChangeListener(new Object[]{p4, Long.valueOf(p10), p11}, -598334378, 598334381, (int) System.currentTimeMillis());
    }

    public static int setY(@NotNull abw p4) {
        return ((Integer) setOnFocusChangeListener(new Object[]{p4}, -833573679, 833573680, (int) System.currentTimeMillis())).intValue();
    }

    public static void setX(@NotNull abw p4, @NotNull abv p10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setOnFocusChangeListener(new Object[]{p4, p10}, -1266562958, 1266562958, (int) System.currentTimeMillis());
    }

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f52181d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52182e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final a[] f52183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52185c;

        public a() {
            this.f52183a = new a[256];
            this.f52184b = 0;
            this.f52185c = 0;
        }

        public static /* synthetic */ Serializable a(Object[] objArr, int i10, int i11, int i12) {
            Object objValueOf;
            int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
            int i14 = (~i12) | i10;
            int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
            if (i15 == 1) {
                a aVar = (a) objArr[0];
                int i16 = f52182e;
                int i17 = (((i16 ^ 31) | (i16 & 31)) << 1) - ((i16 & (-32)) | ((~i16) & 31));
                f52181d = i17 % 128;
                int i18 = i17 % 2;
                objValueOf = aVar.f52183a;
                int i19 = i16 & 39;
                int i20 = -(-((i16 ^ 39) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f52181d = i21 % 128;
                int i22 = i21 % 2;
            } else if (i15 != 2) {
                a aVar2 = (a) objArr[0];
                int i23 = f52181d;
                int i24 = ((i23 ^ 67) | (i23 & 67)) << 1;
                int i25 = -(((~i23) & 67) | (i23 & (-68)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                int i27 = i26 % 128;
                f52182e = i27;
                int i28 = i26 % 2;
                int i29 = aVar2.f52184b;
                if (i28 == 0) {
                    throw null;
                }
                int i30 = i27 & 21;
                int i31 = i30 + ((i27 ^ 21) | i30);
                f52181d = i31 % 128;
                if (i31 % 2 != 0) {
                    throw null;
                }
                objValueOf = Integer.valueOf(i29);
            } else {
                a aVar3 = (a) objArr[0];
                int i32 = f52181d;
                int i33 = i32 + 103;
                f52182e = i33 % 128;
                int i34 = i33 % 2;
                int i35 = aVar3.f52185c;
                int i36 = i32 ^ 107;
                int i37 = -(-((i32 & 107) << 1));
                int i38 = (i36 & i37) + (i37 | i36);
                f52182e = i38 % 128;
                int i39 = i38 % 2;
                objValueOf = Integer.valueOf(i35);
            }
            return (Serializable) objValueOf;
        }

        public a(int i10, int i11) {
            this.f52183a = null;
            this.f52184b = i10;
            int i12 = i11 & 7;
            this.f52185c = i12 == 0 ? 8 : i12;
        }
    }
}
