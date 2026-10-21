package com.mypinpad.tsdk.isolation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setPreferKeepClearRects {
    @NotNull
    public static final Bitmap H_(@NotNull byte[] bArr) {
        return (Bitmap) setOnFocusChangeListener(new Object[]{bArr}, -547310384, 547310384, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] I_(@NotNull Bitmap bitmap) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bitmap}, 2127939347, -2127939346, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws setProgress, getPinViewports {
        int i13 = (i11 * 263) + (i10 * (-523));
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i10 | i15);
        if (((i16 | (~(i15 | (~i12))) | i14) * 262) + (i16 * (-786)) + ((i14 | i16 | (~(i15 | i12))) * 262) + i13 != 1) {
            byte[] bArr = (byte[]) objArr[0];
            Intrinsics.checkNotNullParameter(bArr, "");
            try {
                Result.Companion companion = Result.INSTANCE;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArr));
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
                throw new setVelocityScale(null, 1, null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                if (thM5538exceptionOrNullimpl != null) {
                    throw new setProgress(thM5538exceptionOrNullimpl);
                }
                throw new KotlinNothingValueException();
            }
        }
        Bitmap bitmap = (Bitmap) objArr[0];
        Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (!bitmap.compress(compressFormat, 100, byteArrayOutputStream)) {
                throw new setHyphenationFrequency(null, 1, null);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Throwable thM5538exceptionOrNullimpl2 = Result.m5538exceptionOrNullimpl(Result.m5535constructorimpl(ResultKt.createFailure(th3)));
            if (thM5538exceptionOrNullimpl2 != null) {
                throw new getPinViewports(thM5538exceptionOrNullimpl2);
            }
            throw new KotlinNothingValueException();
        }
    }
}
