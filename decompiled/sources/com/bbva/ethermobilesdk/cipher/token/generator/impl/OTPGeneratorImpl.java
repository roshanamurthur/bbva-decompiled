package com.bbva.ethermobilesdk.cipher.token.generator.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.factory.HashFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.HmacAlgorithm;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class OTPGeneratorImpl {

    @VisibleForTesting
    public static final String ERROR_DESCRIPTION = "codeDigits must be between ['0' and '%s')";

    @VisibleForTesting
    public static final String ERROR_GENERATING_OTP = "ERROR_GENERATING_OTP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f29377a = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};

    @VisibleForTesting
    public static final int[] DIGITS_POWER = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000};

    @NonNull
    @VisibleForTesting
    public String generateHOTP256(@NonNull byte[] bArr, long j10, int i10, boolean z10, int i11) throws TokenException {
        int i12 = z10 ? i10 + 1 : i10;
        byte[] bArr2 = new byte[8];
        for (int i13 = 7; i13 >= 0; i13--) {
            bArr2[i13] = (byte) (255 & j10);
            j10 >>= 8;
        }
        boolean z11 = true;
        if (i10 >= 0) {
            int[] iArr = DIGITS_POWER;
            if (i10 <= iArr.length - 1) {
                try {
                    byte[] bArr3 = (byte[]) ResultKt.getOrThrow(HashFactoryKt.hmacOf(HmacAlgorithm.SHA256, bArr, bArr2));
                    int i14 = bArr3[bArr3.length - 1] & 15;
                    if (i11 < 0 || i11 >= bArr3.length - 4) {
                        i11 = i14;
                    }
                    int i15 = ((bArr3[i11 + 3] & 255) | ((((bArr3[i11] & 127) << 24) | ((bArr3[i11 + 1] & 255) << 16)) | ((bArr3[i11 + 2] & 255) << 8))) % iArr[i10];
                    if (z10) {
                        int i16 = i15 * 10;
                        long j11 = i15;
                        int i17 = 0;
                        while (true) {
                            int i18 = i10 - 1;
                            if (i10 <= 0) {
                                break;
                            }
                            int i19 = (int) (j11 % 10);
                            j11 /= 10;
                            if (z11) {
                                i19 = f29377a[i19];
                            }
                            i17 += i19;
                            z11 = !z11;
                            i10 = i18;
                        }
                        int i20 = i17 % 10;
                        if (i20 > 0) {
                            i20 = 10 - i20;
                        }
                        i15 = i20 + i16;
                    }
                    StringBuilder sb2 = new StringBuilder(Integer.toString(i15));
                    while (sb2.length() < i12) {
                        sb2.insert(0, "0");
                    }
                    return sb2.toString();
                } catch (Exception e5) {
                    throw new TokenException(e5, ERROR_GENERATING_OTP, "Error generating HOTP-256");
                }
            }
        }
        throw new TokenException(new Exception(), ERROR_GENERATING_OTP, String.format(ERROR_DESCRIPTION, Integer.valueOf(DIGITS_POWER.length)));
    }

    @NonNull
    public String generateOTP(@NonNull byte[] bArr, int i10, int i11, int i12, long j10) throws TokenException {
        return generateHOTP256(bArr, ((j10 + ((long) ((i12 * i11) * 1000))) / 1000) / ((long) i11), i10, false, -1);
    }
}
