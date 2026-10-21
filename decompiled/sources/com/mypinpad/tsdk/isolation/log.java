package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class log extends setFindListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56981k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56982l = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f56983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56984j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public log(@NotNull PinViewportDp pinViewportDp, int i10, int i11) {
        super(pinViewportDp);
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.f56983i = i10;
        this.f56984j = i11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i15 = ~i12;
        int i16 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i15 | i11)) | i10) * (-1042)) + i14;
        int i17 = ~i10;
        if ((((~(i10 | i15 | i11)) | (~(i12 | i17)) | (~((~i11) | i17))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i16 == 1) {
            log logVar = (log) objArr[0];
            int i18 = f56981k;
            int i19 = (i18 & 91) + (i18 | 91);
            f56982l = i19 % 128;
            int i20 = i19 % 2;
            int iCoerceAtLeast = c.coerceAtLeast(logVar.f56983i, logVar.f56984j);
            int i21 = f56981k;
            int i22 = (i21 & (-54)) | ((~i21) & 53);
            int i23 = (i21 & 53) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f56982l = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 7 / 0;
            }
            return Integer.valueOf(iCoerceAtLeast);
        }
        log logVar2 = (log) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i26 = f56981k;
        int i27 = i26 & 67;
        int i28 = (i26 | 67) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        f56982l = i30 % 128;
        if (i30 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            int i31 = 11 / 0;
            if (bArr.length != logVar2.f56983i) {
                i13 = f56982l;
                int i32 = (-2) - (((i13 & 110) + (i13 | 110)) ^ (-1));
                f56981k = i32 % 128;
                int i33 = i32 % 2;
                if (bArr.length != logVar2.f56984j) {
                    int i34 = (i13 & 79) + (i13 | 79);
                    f56981k = i34 % 128;
                    int i35 = i34 % 2;
                    return Boolean.FALSE;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (bArr.length != logVar2.f56983i) {
                i13 = f56982l;
                int i36 = (-2) - (((i13 & 110) + (i13 | 110)) ^ (-1));
                f56981k = i36 % 128;
                int i37 = i36 % 2;
                if (bArr.length != logVar2.f56984j) {
                    int i38 = (i13 & 79) + (i13 | 79);
                    f56981k = i38 % 128;
                    int i39 = i38 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        int i40 = f56982l;
        int i41 = (i40 & 46) + (i40 | 46);
        int i42 = (i41 ^ (-1)) + (i41 << 1);
        f56981k = i42 % 128;
        int i43 = i42 % 2;
        return Boolean.TRUE;
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -928400792, 928400793, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final boolean setX(@NotNull byte[] bArr) {
        return ((Boolean) setX(new Object[]{this, bArr}, -689207063, 689207063, System.identityHashCode(this))).booleanValue();
    }
}
