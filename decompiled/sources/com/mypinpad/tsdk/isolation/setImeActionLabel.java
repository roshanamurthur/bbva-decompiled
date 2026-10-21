package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setImeActionLabel;", "", "", "setDividerPadding", "()[B", "Lcom/mypinpad/tsdk/i/xs;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/mypinpad/tsdk/i/xs;II[BLjava/lang/Integer;)V", "(Lcom/mypinpad/tsdk/i/xs;[BLjava/lang/Integer;)V"}, k = 1, mv = {1, 5, 1})
public abstract class setImeActionLabel {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59842f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59843g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xs f59844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f59847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f59848e;

    public setImeActionLabel(@NotNull xs xsVar, int i10, int i11, @Nullable byte[] bArr, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(xsVar, "");
        this.f59844a = xsVar;
        this.f59845b = i10;
        this.f59846c = i11;
        this.f59847d = bArr;
        this.f59848e = num;
        if (bArr != null && bArr.length > 255) {
            throw new setIndeterminateDrawable(3, String.valueOf(bArr.length), null, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX WARN: Code duplicated, block: B:12:0x007c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0091  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:22:0x010c  */
    /* JADX WARN: Code duplicated, block: B:24:0x012b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0149  */
    /* JADX WARN: Code duplicated, block: B:28:0x0176  */
    /* JADX WARN: Code duplicated, block: B:9:0x0060 A[PHI: r0 r1
      0x0060: PHI (r0v4 byte[]) = (r0v3 byte[]), (r0v19 byte[]) binds: [B:8:0x005e, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r1v12 byte[]) = (r1v11 byte[]), (r1v85 byte[]) binds: [B:8:0x005e, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        boolean z11;
        byte[] bArrPlus;
        Integer num;
        byte[] bArr3;
        int i13;
        setImeActionLabel setimeactionlabel = (setImeActionLabel) objArr[0];
        int i14 = f59843g;
        int i15 = i14 & 117;
        int i16 = (i14 ^ 117) | i15;
        int i17 = (i15 & i16) + (i16 | i15);
        f59842f = i17 % 128;
        if (i17 % 2 == 0) {
            bArr = new byte[]{(byte) setimeactionlabel.f59844a.setOnFocusChangeListener(), (byte) setimeactionlabel.f59844a.setX(), (byte) setimeactionlabel.f59845b, (byte) setimeactionlabel.f59846c};
            bArr2 = setimeactionlabel.f59847d;
            if (bArr2 != null) {
                if (bArr2.length == 0) {
                    int i18 = f59843g + 3;
                    int i19 = i18 % 128;
                    f59842f = i19;
                    int i20 = i18 % 2;
                    int i21 = i19 & 73;
                    int i22 = (i19 ^ 73) | i21;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    f59843g = i23 % 128;
                    int i24 = i23 % 2;
                    z10 = true;
                } else {
                    int i25 = f59843g;
                    int i26 = ((i25 ^ 95) - (~(-(-((i25 & 95) << 1))))) - 1;
                    f59842f = i26 % 128;
                    int i27 = i26 % 2;
                    z10 = false;
                }
                if (!(!z10)) {
                    int i28 = f59843g;
                    int i29 = ((-1) << 1) - (((i28 & 92) + (i28 | 92)) ^ (-1));
                    f59842f = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    int i31 = f59842f;
                    int i32 = (i31 ^ 47) + ((i31 & 47) << 1);
                    int i33 = i32 % 128;
                    f59843g = i33;
                    int i34 = i32 % 2;
                    int i35 = i33 & 81;
                    int i36 = (~i35) & (i33 | 81);
                    int i37 = -(-(i35 << 1));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    f59842f = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = (((i33 | 64) << 1) - (i33 ^ 64)) - 1;
                    f59842f = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = i33 & 7;
                    int i43 = (i42 - (~((i33 ^ 7) | i42))) - 1;
                    f59842f = i43 % 128;
                    int i44 = i43 % 2;
                    z11 = true;
                }
            }
            if (z11) {
                int i45 = f59842f;
                i13 = ((i45 ^ 40) + ((i45 & 40) << 1)) - 1;
                f59843g = i13 % 128;
                if (i13 % 2 == 0) {
                    byte[] bArr4 = new byte[0];
                    byte[] bArr5 = setimeactionlabel.f59847d;
                    bArr4[1] = (byte) bArr5.length;
                    bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr4, bArr5);
                } else {
                    byte[] bArr6 = setimeactionlabel.f59847d;
                    bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{(byte) bArr6.length}, bArr6);
                }
                int i46 = f59842f;
                int i47 = ((-1) << 1) - (((i46 ^ 58) + ((i46 & 58) << 1)) ^ (-1));
                f59843g = i47 % 128;
                int i48 = i47 % 2;
            } else {
                bArrPlus = new byte[0];
                int i49 = f59843g;
                int i50 = i49 | 53;
                int i51 = i50 << 1;
                int i52 = -((~(i49 & 53)) & i50);
                int i53 = (i51 & i52) + (i52 | i51);
                f59842f = i53 % 128;
                int i54 = i53 % 2;
            }
            byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArr, bArrPlus);
            num = setimeactionlabel.f59848e;
            if (num != null) {
                int i55 = ((-1) << 1) - ((f59843g + 54) ^ (-1));
                f59842f = i55 % 128;
                int i56 = i55 % 2;
                bArr3 = new byte[]{(byte) num.intValue()};
                int i57 = f59843g;
                int i58 = (i57 & (-54)) | ((~i57) & 53);
                int i59 = (i57 & 53) << 1;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f59842f = i60 % 128;
                int i61 = i60 % 2;
            } else {
                bArr3 = new byte[0];
                int i62 = f59842f;
                int i63 = i62 & 45;
                int i64 = (i62 ^ 45) | i63;
                int i65 = (i63 & i64) + (i64 | i63);
                f59843g = i65 % 128;
                int i66 = i65 % 2;
            }
            byte[] bArrPlus3 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, bArr3);
            int i67 = f59843g;
            int i68 = ((i67 ^ 79) | (i67 & 79)) << 1;
            int i69 = -(((~i67) & 79) | (i67 & (-80)));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            f59842f = i70 % 128;
            int i71 = i70 % 2;
            return bArrPlus3;
        }
        bArr = new byte[4];
        bArr[0] = (byte) setimeactionlabel.f59844a.setOnFocusChangeListener();
        bArr[1] = (byte) setimeactionlabel.f59844a.setX();
        bArr[4] = (byte) setimeactionlabel.f59845b;
        bArr[2] = (byte) setimeactionlabel.f59846c;
        bArr2 = setimeactionlabel.f59847d;
        if (bArr2 != null) {
            if (bArr2.length == 0) {
                int i110 = f59843g + 3;
                int i111 = i110 % 128;
                f59842f = i111;
                int i210 = i110 % 2;
                int i211 = i111 & 73;
                int i212 = (i111 ^ 73) | i211;
                int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                f59843g = i213 % 128;
                int i214 = i213 % 2;
                z10 = true;
            } else {
                int i215 = f59843g;
                int i216 = ((i215 ^ 95) - (~(-(-((i215 & 95) << 1))))) - 1;
                f59842f = i216 % 128;
                int i217 = i216 % 2;
                z10 = false;
            }
            if (!(!z10)) {
                int i218 = f59843g;
                int i219 = ((-1) << 1) - (((i218 & 92) + (i218 | 92)) ^ (-1));
                f59842f = i219 % 128;
                int i310 = i219 % 2;
            } else {
                int i311 = f59842f;
                int i312 = (i311 ^ 47) + ((i311 & 47) << 1);
                int i313 = i312 % 128;
                f59843g = i313;
                int i314 = i312 % 2;
                int i315 = i313 & 81;
                int i316 = (~i315) & (i313 | 81);
                int i317 = -(-(i315 << 1));
                int i318 = ((i316 | i317) << 1) - (i317 ^ i316);
                f59842f = i318 % 128;
                int i319 = i318 % 2;
                int i410 = (((i313 | 64) << 1) - (i313 ^ 64)) - 1;
                f59842f = i410 % 128;
                int i411 = i410 % 2;
                int i412 = i313 & 7;
                int i413 = (i412 - (~((i313 ^ 7) | i412))) - 1;
                f59842f = i413 % 128;
                int i414 = i413 % 2;
                z11 = true;
            }
        }
        if (z11) {
            int i415 = f59842f;
            i13 = ((i415 ^ 40) + ((i415 & 40) << 1)) - 1;
            f59843g = i13 % 128;
            if (i13 % 2 == 0) {
                byte[] bArr7 = new byte[0];
                byte[] bArr8 = setimeactionlabel.f59847d;
                bArr7[1] = (byte) bArr8.length;
                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr7, bArr8);
            } else {
                byte[] bArr9 = setimeactionlabel.f59847d;
                bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{(byte) bArr9.length}, bArr9);
            }
            int i416 = f59842f;
            int i417 = ((-1) << 1) - (((i416 ^ 58) + ((i416 & 58) << 1)) ^ (-1));
            f59843g = i417 % 128;
            int i418 = i417 % 2;
        } else {
            bArrPlus = new byte[0];
            int i419 = f59843g;
            int i510 = i419 | 53;
            int i511 = i510 << 1;
            int i512 = -((~(i419 & 53)) & i510);
            int i513 = (i511 & i512) + (i512 | i511);
            f59842f = i513 % 128;
            int i514 = i513 % 2;
        }
        byte[] bArrPlus4 = ArraysKt___ArraysJvmKt.plus(bArr, bArrPlus);
        num = setimeactionlabel.f59848e;
        if (num != null) {
            int i515 = ((-1) << 1) - ((f59843g + 54) ^ (-1));
            f59842f = i515 % 128;
            int i516 = i515 % 2;
            bArr3 = new byte[]{(byte) num.intValue()};
            int i517 = f59843g;
            int i518 = (i517 & (-54)) | ((~i517) & 53);
            int i519 = (i517 & 53) << 1;
            int i610 = ((i518 | i519) << 1) - (i519 ^ i518);
            f59842f = i610 % 128;
            int i611 = i610 % 2;
        } else {
            bArr3 = new byte[0];
            int i612 = f59842f;
            int i613 = i612 & 45;
            int i614 = (i612 ^ 45) | i613;
            int i615 = (i613 & i614) + (i614 | i613);
            f59843g = i615 % 128;
            int i616 = i615 % 2;
        }
        byte[] bArrPlus5 = ArraysKt___ArraysJvmKt.plus(bArrPlus4, bArr3);
        int i617 = f59843g;
        int i618 = ((i617 ^ 79) | (i617 & 79)) << 1;
        int i619 = -(((~i617) & 79) | (i617 & (-80)));
        int i72 = (i618 ^ i619) + ((i619 & i618) << 1);
        f59842f = i72 % 128;
        int i73 = i72 % 2;
        return bArrPlus5;
        int i74 = f59843g;
        int i75 = (((i74 | 48) << 1) - (i74 ^ 48)) - 1;
        f59842f = i75 % 128;
        int i76 = i75 % 2;
        z11 = false;
        if (z11) {
            int i4110 = f59842f;
            i13 = ((i4110 ^ 40) + ((i4110 & 40) << 1)) - 1;
            f59843g = i13 % 128;
            if (i13 % 2 == 0) {
                byte[] bArr10 = new byte[0];
                byte[] bArr11 = setimeactionlabel.f59847d;
                bArr10[1] = (byte) bArr11.length;
                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr10, bArr11);
            } else {
                byte[] bArr12 = setimeactionlabel.f59847d;
                bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{(byte) bArr12.length}, bArr12);
            }
            int i4111 = f59842f;
            int i4112 = ((-1) << 1) - (((i4111 ^ 58) + ((i4111 & 58) << 1)) ^ (-1));
            f59843g = i4112 % 128;
            int i4113 = i4112 % 2;
        } else {
            bArrPlus = new byte[0];
            int i4114 = f59843g;
            int i5110 = i4114 | 53;
            int i5111 = i5110 << 1;
            int i5112 = -((~(i4114 & 53)) & i5110);
            int i5113 = (i5111 & i5112) + (i5112 | i5111);
            f59842f = i5113 % 128;
            int i5114 = i5113 % 2;
        }
        byte[] bArrPlus6 = ArraysKt___ArraysJvmKt.plus(bArr, bArrPlus);
        num = setimeactionlabel.f59848e;
        if (num != null) {
            int i5115 = ((-1) << 1) - ((f59843g + 54) ^ (-1));
            f59842f = i5115 % 128;
            int i5116 = i5115 % 2;
            bArr3 = new byte[]{(byte) num.intValue()};
            int i5117 = f59843g;
            int i5118 = (i5117 & (-54)) | ((~i5117) & 53);
            int i5119 = (i5117 & 53) << 1;
            int i6110 = ((i5118 | i5119) << 1) - (i5119 ^ i5118);
            f59842f = i6110 % 128;
            int i6111 = i6110 % 2;
        } else {
            bArr3 = new byte[0];
            int i6112 = f59842f;
            int i6113 = i6112 & 45;
            int i6114 = (i6112 ^ 45) | i6113;
            int i6115 = (i6113 & i6114) + (i6114 | i6113);
            f59843g = i6115 % 128;
            int i6116 = i6115 % 2;
        }
        byte[] bArrPlus7 = ArraysKt___ArraysJvmKt.plus(bArrPlus6, bArr3);
        int i6117 = f59843g;
        int i6118 = ((i6117 ^ 79) | (i6117 & 79)) << 1;
        int i6119 = -(((~i6117) & 79) | (i6117 & (-80)));
        int i77 = (i6118 ^ i6119) + ((i6119 & i6118) << 1);
        f59842f = i77 % 128;
        int i78 = i77 % 2;
        return bArrPlus7;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 486099974, -486099974, System.identityHashCode(this));
    }

    public /* synthetic */ setImeActionLabel(xs xsVar, int i10, int i11, byte[] bArr, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(xsVar, i10, i11, (i12 & 8) != 0 ? null : bArr, (i12 & 16) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setImeActionLabel(@NotNull xs xsVar, @Nullable byte[] bArr, @Nullable Integer num) {
        this(xsVar, xsVar.setCompoundDrawableTintBlendMode(), xsVar.setDividerPadding(), bArr, num);
        Intrinsics.checkNotNullParameter(xsVar, "");
    }
}
