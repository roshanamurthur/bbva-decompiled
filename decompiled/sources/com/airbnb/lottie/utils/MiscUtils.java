package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.datastore.preferences.protobuf.e;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MiscUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f26214a = new PointF();

    public static int a(float f6, float f10) {
        int i10 = (int) f6;
        int i11 = (int) f10;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean contains(float f6, float f10, float f11) {
        return f6 >= f10 && f6 <= f11;
    }

    public static void getPathFromData(ShapeData shapeData, Path path) {
        path.reset();
        PointF initialPoint = shapeData.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        PointF pointF = f26214a;
        pointF.set(initialPoint.x, initialPoint.y);
        for (int i10 = 0; i10 < shapeData.getCurves().size(); i10++) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(i10);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
            } else {
                path.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
        }
        if (shapeData.isClosed()) {
            path.close();
        }
    }

    public static double lerp(double d2, double d3, @FloatRange(from = 0.0d, to = 1.0d) double d7) {
        return ((d3 - d2) * d7) + d2;
    }

    public static void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.fullyResolvesTo(keyPathElementContent.getName(), i10)) {
            list.add(keyPath2.addKey(keyPathElementContent.getName()).resolve(keyPathElementContent));
        }
    }

    public static float clamp(float f6, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f6));
    }

    public static float lerp(float f6, float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return e.a(f10, f6, f11, f6);
    }

    public static double clamp(double d2, double d3, double d7) {
        return Math.max(d3, Math.min(d7, d2));
    }

    public static int lerp(int i10, int i11, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return (int) ((f6 * (i11 - i10)) + i10);
    }
}
