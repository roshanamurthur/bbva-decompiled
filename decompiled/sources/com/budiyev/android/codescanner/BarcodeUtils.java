package com.budiyev.android.codescanner;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class BarcodeUtils {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 180;
    public static final int ROTATION_270 = 270;
    public static final int ROTATION_90 = 90;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Rotation {
    }

    @NonNull
    public static Bitmap createBitmap(@NonNull BitMatrix bitMatrix) {
        Objects.requireNonNull(bitMatrix);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = bitMatrix.get(i11 % width, i11 / height) ? ViewCompat.MEASURED_STATE_MASK : -1;
        }
        return Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
    }

    @Nullable
    public static Result decodeBitmap(@NonNull Bitmap bitmap) {
        return decodeBitmap(bitmap, null);
    }

    @Nullable
    public static Result decodeRgb(@NonNull int[] iArr, int i10, int i11) {
        return decodeRgb(iArr, i10, i11, null);
    }

    @Nullable
    public static Result decodeYuv(@NonNull byte[] bArr, int i10, int i11) {
        return decodeYuv(bArr, i10, i11, 0, false, null);
    }

    @Nullable
    public static BitMatrix encodeBitMatrix(@NonNull String str, @NonNull BarcodeFormat barcodeFormat, int i10, int i11) {
        return encodeBitMatrix(str, barcodeFormat, i10, i11, null);
    }

    @Nullable
    public static Bitmap encodeBitmap(@NonNull String str, @NonNull BarcodeFormat barcodeFormat, int i10, int i11) {
        return encodeBitmap(str, barcodeFormat, i10, i11, null);
    }

    @Nullable
    public static Result decodeBitmap(@NonNull Bitmap bitmap, @Nullable Map<DecodeHintType, ?> map) {
        Objects.requireNonNull(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return decodeRgb(iArr, width, height, map);
    }

    @Nullable
    public static Result decodeRgb(@NonNull int[] iArr, int i10, int i11, @Nullable Map<DecodeHintType, ?> map) {
        Objects.requireNonNull(iArr);
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        if (map != null) {
            multiFormatReader.setHints(map);
        } else {
            multiFormatReader.setHints(Collections.singletonMap(DecodeHintType.POSSIBLE_FORMATS, CodeScanner.ALL_FORMATS));
        }
        try {
            return Utils.b(multiFormatReader, new RGBLuminanceSource(i10, i11, iArr));
        } catch (ReaderException unused) {
            return null;
        }
    }

    @Nullable
    public static Result decodeYuv(@NonNull byte[] bArr, int i10, int i11, int i12, boolean z10, @Nullable Map<DecodeHintType, ?> map) {
        int i13;
        int i14;
        Objects.requireNonNull(bArr);
        byte[] bArrD = Utils.d(i10, i11, bArr, i12);
        if (i12 == 90 || i12 == 270) {
            i13 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i13 = i11;
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        if (map != null) {
            multiFormatReader.setHints(map);
        } else {
            multiFormatReader.setHints(Collections.singletonMap(DecodeHintType.POSSIBLE_FORMATS, CodeScanner.ALL_FORMATS));
        }
        try {
            return Utils.b(multiFormatReader, new PlanarYUVLuminanceSource(bArrD, i14, i13, 0, 0, i14, i13, z10));
        } catch (ReaderException unused) {
            return null;
        }
    }

    @Nullable
    public static BitMatrix encodeBitMatrix(@NonNull String str, @NonNull BarcodeFormat barcodeFormat, int i10, int i11, @Nullable Map<EncodeHintType, ?> map) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(barcodeFormat);
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        try {
            return map != null ? multiFormatWriter.encode(str, barcodeFormat, i10, i11, map) : multiFormatWriter.encode(str, barcodeFormat, i10, i11);
        } catch (WriterException unused) {
            return null;
        }
    }

    @Nullable
    public static Bitmap encodeBitmap(@NonNull String str, @NonNull BarcodeFormat barcodeFormat, int i10, int i11, @Nullable Map<EncodeHintType, ?> map) {
        BitMatrix bitMatrixEncodeBitMatrix = encodeBitMatrix(str, barcodeFormat, i10, i11, map);
        if (bitMatrixEncodeBitMatrix != null) {
            return createBitmap(bitMatrixEncodeBitMatrix);
        }
        return null;
    }
}
