package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class CommonConvertUtils {
    @KeepForSdk
    public static int convertToAndroidImageFormat(@InputImage.ImageFormat int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 35;
            if (i10 != 35) {
                i11 = InputImage.IMAGE_FORMAT_YV12;
                if (i10 != 842094169) {
                    return 0;
                }
            }
        }
        return i11;
    }

    @KeepForSdk
    public static int convertToMVRotation(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(g0.c("Invalid rotation: ", i10));
    }

    @KeepForSdk
    public static void transformPointArray(@NonNull Point[] pointArr, @NonNull Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            int i11 = i10 + i10;
            Point point = pointArr[i10];
            fArr[i11] = point.x;
            fArr[i11 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            int i13 = i12 + i12;
            pointArr[i12].set((int) fArr[i13], (int) fArr[i13 + 1]);
        }
    }

    @KeepForSdk
    public static void transformPointF(@NonNull PointF pointF, @NonNull Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    @KeepForSdk
    public static void transformPointList(@NonNull List<PointF> list, @NonNull Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 + i10;
            fArr[i11] = list.get(i10).x;
            fArr[i11 + 1] = list.get(i10).y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < list.size(); i12++) {
            int i13 = i12 + i12;
            list.get(i12).set(fArr[i13], fArr[i13 + 1]);
        }
    }

    @KeepForSdk
    public static void transformRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
