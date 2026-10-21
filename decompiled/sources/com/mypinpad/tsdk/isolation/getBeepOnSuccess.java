package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getBeepOnSuccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55709b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55710c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, byte[]> f55711a;

    /* JADX WARN: Multi-variable type inference failed */
    public getBeepOnSuccess(@NotNull Function1<? super Integer, byte[]> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.f55711a = function1;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i14 = ~i12;
        int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
        int i16 = ~i10;
        if ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15 == 1) {
            getBeepOnSuccess getbeeponsuccess = (getBeepOnSuccess) objArr[0];
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            int i17 = f55710c;
            int i18 = i17 & 123;
            int i19 = (i18 - (~((i17 ^ 123) | i18))) - 1;
            f55709b = i19 % 128;
            int i20 = i19 % 2;
            byte bM5570constructorimpl = (byte) ((((long) UInt.m5570constructorimpl(((Integer) setCompoundDrawableTintBlendMode(new Object[]{getbeeponsuccess.f55711a.invoke(4)}, 1132201665, -1132201665, (int) System.currentTimeMillis())).intValue())) & 4294967295L) % ((long) bByteValue));
            int i21 = f55709b;
            int i22 = i21 & 83;
            int i23 = ((i21 ^ 83) | i22) << 1;
            int i24 = -((i21 | 83) & (~i22));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f55710c = i25 % 128;
            int i26 = i25 % 2;
            return Byte.valueOf(bM5570constructorimpl);
        }
        byte[] bArr = (byte[]) objArr[0];
        int i27 = f55709b;
        int i28 = ((i27 & 2) + (i27 | 2)) - 1;
        f55710c = i28 % 128;
        int i29 = i28 % 2;
        int iM5545constructorimpl = UByte.m5545constructorimpl(bArr[0]) & 255;
        int iM5545constructorimpl2 = (UByte.m5545constructorimpl(bArr[1]) & 255) << 8;
        int i30 = (iM5545constructorimpl & iM5545constructorimpl2) | ((~iM5545constructorimpl2) & iM5545constructorimpl) | ((~iM5545constructorimpl) & iM5545constructorimpl2);
        int iM5545constructorimpl3 = (UByte.m5545constructorimpl(bArr[2]) & 255) << 16;
        int i31 = i30 & iM5545constructorimpl3;
        int i32 = (i30 | iM5545constructorimpl3) & (~i31);
        int i33 = (i32 & i31) | (i32 ^ i31);
        int iM5545constructorimpl4 = (UByte.m5545constructorimpl(bArr[3]) & 255) << 24;
        int i34 = (iM5545constructorimpl4 & i33) | (i33 ^ iM5545constructorimpl4);
        int i35 = f55710c;
        int i36 = (i35 & 41) + (i35 | 41);
        f55709b = i36 % 128;
        int i37 = i36 % 2;
        return Integer.valueOf(i34);
    }

    public final byte setX(byte b10) {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b10)}, 408057020, -408057019, System.identityHashCode(this))).byteValue();
    }
}
