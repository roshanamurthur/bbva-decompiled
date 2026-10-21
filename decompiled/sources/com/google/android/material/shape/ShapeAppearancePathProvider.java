package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes10.dex */
public class ShapeAppearancePathProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapePath[] f45294a = new ShapePath[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f45295b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f45296c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f45297d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f45298e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f45299f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShapePath f45300g = new ShapePath();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f45301h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f45302i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f45303j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f45304k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45305l = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i10);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i10);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShapeAppearancePathProvider f45306a = new ShapeAppearancePathProvider();
    }

    public ShapeAppearancePathProvider() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f45294a[i10] = new ShapePath();
            this.f45295b[i10] = new Matrix();
            this.f45296c[i10] = new Matrix();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return a.f45306a;
    }

    @RequiresApi(19)
    public final boolean a(Path path, int i10) {
        Path path2 = this.f45304k;
        path2.reset();
        this.f45294a[i10].applyToPath(this.f45295b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f6, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f6, rectF, null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f6, RectF rectF, PathListener pathListener, @NonNull Path path) {
        char c10;
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        ShapePath[] shapePathArr;
        EdgeTreatment bottomEdge;
        char c11;
        CornerSize bottomRightCornerSize;
        CornerTreatment bottomRightCorner;
        path.rewind();
        Path path2 = this.f45298e;
        path2.rewind();
        Path path3 = this.f45299f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            c10 = 1;
            matrixArr = this.f45296c;
            fArr = this.f45301h;
            matrixArr2 = this.f45295b;
            shapePathArr = this.f45294a;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                bottomRightCornerSize = shapeAppearanceModel.getBottomRightCornerSize();
            } else if (i11 != 2) {
                bottomRightCornerSize = i11 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize();
            } else {
                bottomRightCornerSize = shapeAppearanceModel.getBottomLeftCornerSize();
            }
            CornerSize cornerSize = bottomRightCornerSize;
            if (i11 == 1) {
                bottomRightCorner = shapeAppearanceModel.getBottomRightCorner();
            } else if (i11 != 2) {
                bottomRightCorner = i11 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner();
            } else {
                bottomRightCorner = shapeAppearanceModel.getBottomLeftCorner();
            }
            bottomRightCorner.getCornerPath(shapePathArr[i11], 90.0f, f6, rectF, cornerSize);
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = this.f45297d;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f10);
            ShapePath shapePath = shapePathArr[i11];
            fArr[0] = shapePath.endX;
            fArr[1] = shapePath.endY;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f10);
            i11 = i12;
        }
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            ShapePath shapePath2 = shapePathArr[i13];
            fArr[0] = shapePath2.startX;
            fArr[c10] = shapePath2.startY;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[c10]);
            } else {
                path.lineTo(fArr[0], fArr[c10]);
            }
            shapePathArr[i13].applyToPath(matrixArr2[i13], path);
            if (pathListener != null) {
                pathListener.onCornerPathCreated(shapePathArr[i13], matrixArr2[i13], i13);
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            ShapePath shapePath3 = shapePathArr[i13];
            fArr[0] = shapePath3.endX;
            fArr[c10] = shapePath3.endY;
            matrixArr2[i13].mapPoints(fArr);
            ShapePath shapePath4 = shapePathArr[i15];
            float f11 = shapePath4.startX;
            float[] fArr2 = this.f45302i;
            fArr2[0] = f11;
            fArr2[c10] = shapePath4.startY;
            matrixArr2[i15].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[c10] - fArr2[c10])) - 0.001f, 0.0f);
            ShapePath shapePath5 = shapePathArr[i13];
            fArr[0] = shapePath5.endX;
            fArr[1] = shapePath5.endY;
            matrixArr2[i13].mapPoints(fArr);
            float fAbs = (i13 == 1 || i13 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            ShapePath shapePath6 = this.f45300g;
            shapePath6.reset(0.0f, 0.0f);
            if (i13 == 1) {
                bottomEdge = shapeAppearanceModel.getBottomEdge();
            } else if (i13 != 2) {
                bottomEdge = i13 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge();
            } else {
                bottomEdge = shapeAppearanceModel.getLeftEdge();
            }
            EdgeTreatment edgeTreatment = bottomEdge;
            edgeTreatment.getEdgePath(fMax, fAbs, f6, shapePath6);
            Path path4 = this.f45303j;
            path4.reset();
            shapePath6.applyToPath(matrixArr3[i13], path4);
            if (this.f45305l && (edgeTreatment.a() || a(path4, i13) || a(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = shapePath6.startX;
                c11 = 1;
                fArr[1] = shapePath6.startY;
                matrixArr3[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                shapePath6.applyToPath(matrixArr3[i13], path2);
            } else {
                c11 = 1;
                shapePath6.applyToPath(matrixArr3[i13], path);
            }
            if (pathListener != null) {
                pathListener.onEdgePathCreated(shapePath6, matrixArr3[i13], i13);
            }
            i13 = i14;
            c10 = c11;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
