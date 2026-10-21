package com.budiyev.android.codescanner;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.nulabinc.zxcvbn.Guess;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import pc.c;
import pc.d;

/* JADX INFO: loaded from: classes9.dex */
public final class Utils {

    public static final class a implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        public final int compare(@NonNull Camera.Size size, @NonNull Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            return Integer.compare(size4.height * size4.width, size3.height * size3.width);
        }
    }

    public static final class b implements Comparator<int[]> {
        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iCompare = Integer.compare(iArr4[1], iArr3[1]);
            return iCompare == 0 ? Integer.compare(iArr4[0], iArr3[0]) : iCompare;
        }
    }

    public static void a(@NonNull Camera.Parameters parameters, @NonNull d dVar, int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList(1);
        Matrix matrix = new Matrix();
        float[] fArr = {dVar.f92620a, dVar.f92621b, dVar.f92622c, dVar.f92623d};
        matrix.postRotate(-i12, i10 / 2.0f, i11 / 2.0f);
        matrix.mapPoints(fArr);
        int i13 = (int) fArr[0];
        int i14 = (int) fArr[1];
        int i15 = (int) fArr[2];
        int i16 = (int) fArr[3];
        if (i13 > i15) {
            i15 = i13;
            i13 = i15;
        }
        if (i14 > i16) {
            i16 = i14;
            i14 = i16;
        }
        d dVar2 = new d(i13, i14, i15, i16);
        if (i13 < 0 || i14 < 0 || i15 > i10 || i16 > i11) {
            dVar2 = new d(Math.max(i13, 0), Math.max(i14, 0), Math.min(i15, i10), Math.min(i16, i11));
        }
        arrayList.add(new Camera.Area(new Rect(((dVar2.f92620a * Guess.REFERENCE_YEAR) / i10) - 1000, ((dVar2.f92621b * Guess.REFERENCE_YEAR) / i11) - 1000, ((dVar2.f92622c * Guess.REFERENCE_YEAR) / i10) - 1000, ((dVar2.f92623d * Guess.REFERENCE_YEAR) / i11) - 1000), 1000));
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    @Nullable
    public static Result b(@NonNull MultiFormatReader multiFormatReader, @NonNull LuminanceSource luminanceSource) throws ReaderException {
        try {
            return multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(luminanceSource)));
        } catch (NotFoundException unused) {
            return multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(luminanceSource.invert())));
        } finally {
            multiFormatReader.reset();
        }
    }

    @NonNull
    public static d c(int i10, int i11, @NonNull d dVar, @NonNull c cVar, @NonNull c cVar2) {
        int i12 = cVar.f92618a;
        int i13 = (i12 - cVar2.f92618a) / 2;
        int i14 = cVar.f92619b;
        int i15 = (i14 - cVar2.f92619b) / 2;
        float f6 = i10 / i12;
        float f10 = i11 / i14;
        return new d(Math.max(Math.round((dVar.f92620a + i13) * f6), 0), Math.max(Math.round((dVar.f92621b + i15) * f10), 0), Math.min(Math.round((dVar.f92622c + i13) * f6), i10), Math.min(Math.round((dVar.f92623d + i15) * f10), i11));
    }

    @NonNull
    public static byte[] d(int i10, int i11, @NonNull byte[] bArr, int i12) {
        if (i12 == 0 || i12 == 360) {
            return bArr;
        }
        if (i12 % 90 != 0 || i12 < 0 || i12 > 270) {
            throw new IllegalArgumentException("Invalid rotation (valid: 0, 90, 180, 270)");
        }
        byte[] bArr2 = new byte[bArr.length];
        int i13 = i10 * i11;
        boolean z10 = i12 % 180 != 0;
        boolean z11 = i12 % BarcodeUtils.ROTATION_270 != 0;
        boolean z12 = i12 >= 180;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = (i14 * i10) + i15;
                int i17 = ((i14 >> 1) * i10) + i13 + (i15 & (-2));
                int i18 = i17 + 1;
                int i19 = z10 ? i11 : i10;
                int i20 = z10 ? i10 : i11;
                int i21 = z10 ? i14 : i15;
                int i22 = z10 ? i15 : i14;
                if (z11) {
                    i21 = (i19 - i21) - 1;
                }
                if (z12) {
                    i22 = (i20 - i22) - 1;
                }
                int i23 = (i22 * i19) + i21;
                int i24 = ((i22 >> 1) * i19) + i13 + (i21 & (-2));
                bArr2[i23] = (byte) (bArr[i16] & 255);
                bArr2[i24] = (byte) (bArr[i17] & 255);
                bArr2[i24 + 1] = (byte) (bArr[i18] & 255);
            }
        }
        return bArr2;
    }

    public static void e(@NonNull Camera.Parameters parameters, AutoFocusMode autoFocusMode) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null || supportedFocusModes.isEmpty()) {
            return;
        }
        if (autoFocusMode == AutoFocusMode.CONTINUOUS) {
            if ("continuous-picture".equals(parameters.getFocusMode())) {
                return;
            }
            if (supportedFocusModes.contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
                return;
            }
        }
        if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(parameters.getFocusMode()) && supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            parameters.setFocusMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
    }

    public static void f(@NonNull Camera.Parameters parameters, @NonNull String str) {
        List<String> supportedFlashModes;
        if (str.equals(parameters.getFlashMode()) || (supportedFlashModes = parameters.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        parameters.setFlashMode(str);
    }

    public static final class SuppressErrorCallback implements ErrorCallback {
        @Override // com.budiyev.android.codescanner.ErrorCallback
        public void onError(@NonNull Throwable th2) {
        }
    }
}
