package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45307a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45308b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45309c;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static class PathArcOperation extends PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RectF f45310a = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f6, float f10, float f11, float f12) {
            this.left = f6;
            this.top = f10;
            this.right = f11;
            this.bottom = f12;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f45310a;
            rectF.set(this.left, this.top, this.right, this.bottom);
            path.arcTo(rectF, this.startAngle, this.sweepAngle, false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f45311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f45312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f45313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f45314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f45316f;

        public PathCubicOperation(float f6, float f10, float f11, float f12, float f13, float f14) {
            this.f45311a = f6;
            this.f45312b = f10;
            this.f45313c = f11;
            this.f45314d = f12;
            this.f45315e = f13;
            this.f45316f = f14;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f45311a, this.f45312b, this.f45313c, this.f45314d, this.f45315e, this.f45316f);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f45317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f45318b;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f45317a, this.f45318b);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(this.controlX, this.controlY, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathArcOperation f45319c;

        public a(PathArcOperation pathArcOperation) {
            this.f45319c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.d
        public final void a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i10, @NonNull Canvas canvas) {
            PathArcOperation pathArcOperation = this.f45319c;
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(pathArcOperation.left, pathArcOperation.top, pathArcOperation.right, pathArcOperation.bottom), i10, pathArcOperation.startAngle, pathArcOperation.sweepAngle);
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f45320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PathLineOperation f45321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f45323f;

        public b(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f6, float f10) {
            this.f45320c = pathLineOperation;
            this.f45321d = pathLineOperation2;
            this.f45322e = f6;
            this.f45323f = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.d
        public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i10, Canvas canvas) {
            float f6;
            float fB = ((b() - c()) + 360.0f) % 360.0f;
            if (fB > ShapePath.ANGLE_LEFT) {
                fB -= 360.0f;
            }
            float f10 = fB;
            if (f10 > 0.0f) {
                return;
            }
            PathLineOperation pathLineOperation = this.f45320c;
            float f11 = pathLineOperation.f45317a;
            float f12 = this.f45322e;
            double d2 = f11 - f12;
            float f13 = pathLineOperation.f45318b;
            float f14 = this.f45323f;
            double dHypot = Math.hypot(d2, f13 - f14);
            PathLineOperation pathLineOperation2 = this.f45321d;
            double dHypot2 = Math.hypot(pathLineOperation2.f45317a - pathLineOperation.f45317a, pathLineOperation2.f45318b - pathLineOperation.f45318b);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d3 = fMin;
            double dTan = Math.tan(Math.toRadians((-f10) / 2.0f)) * d3;
            Matrix matrix2 = this.f45328a;
            if (dHypot > dTan) {
                f6 = 0.0f;
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(f12, f14);
                matrix2.preRotate(c());
                shadowRenderer.drawEdgeShadow(canvas, matrix2, rectF, i10);
            } else {
                f6 = 0.0f;
            }
            float f15 = fMin * 2.0f;
            RectF rectF2 = new RectF(f6, f6, f15, f15);
            matrix2.set(matrix);
            matrix2.preTranslate(pathLineOperation.f45317a, pathLineOperation.f45318b);
            matrix2.preRotate(c());
            matrix2.preTranslate((float) ((-dTan) - d3), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, matrix2, rectF2, (int) fMin, 450.0f, f10, new float[]{(float) (d3 + dTan), f15});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(pathLineOperation.f45317a, pathLineOperation.f45318b);
                matrix2.preRotate(b());
                matrix2.preTranslate((float) dTan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, matrix2, rectF3, i10);
            }
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.f45321d;
            float f6 = pathLineOperation.f45318b;
            PathLineOperation pathLineOperation2 = this.f45320c;
            return (float) Math.toDegrees(Math.atan((f6 - pathLineOperation2.f45318b) / (pathLineOperation.f45317a - pathLineOperation2.f45317a)));
        }

        public final float c() {
            PathLineOperation pathLineOperation = this.f45320c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f45318b - this.f45323f) / (pathLineOperation.f45317a - this.f45322e)));
        }
    }

    public static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PathLineOperation f45324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f45325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f45326e;

        public c(PathLineOperation pathLineOperation, float f6, float f10) {
            this.f45324c = pathLineOperation;
            this.f45325d = f6;
            this.f45326e = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.d
        public final void a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i10, @NonNull Canvas canvas) {
            PathLineOperation pathLineOperation = this.f45324c;
            float f6 = pathLineOperation.f45318b;
            float f10 = this.f45326e;
            float f11 = pathLineOperation.f45317a;
            float f12 = this.f45325d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f10, f11 - f12), 0.0f);
            Matrix matrix2 = this.f45328a;
            matrix2.set(matrix);
            matrix2.preTranslate(f12, f10);
            matrix2.preRotate(b());
            shadowRenderer.drawEdgeShadow(canvas, matrix2, rectF, i10);
        }

        public final float b() {
            PathLineOperation pathLineOperation = this.f45324c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f45318b - this.f45326e) / (pathLineOperation.f45317a - this.f45325d)));
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Matrix f45327b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f45328a = new Matrix();

        public abstract void a(Matrix matrix, ShadowRenderer shadowRenderer, int i10, Canvas canvas);
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    public final void a(float f6) {
        float f10 = this.currentShadowAngle;
        if (f10 == f6) {
            return;
        }
        float f11 = ((f6 - f10) + 360.0f) % 360.0f;
        if (f11 > ANGLE_LEFT) {
            return;
        }
        float f12 = this.endX;
        float f13 = this.endY;
        PathArcOperation pathArcOperation = new PathArcOperation(f12, f13, f12, f13);
        pathArcOperation.startAngle = this.currentShadowAngle;
        pathArcOperation.sweepAngle = f11;
        this.f45308b.add(new a(pathArcOperation));
        this.currentShadowAngle = f6;
    }

    public void addArc(float f6, float f10, float f11, float f12, float f13, float f14) {
        PathArcOperation pathArcOperation = new PathArcOperation(f6, f10, f11, f12);
        pathArcOperation.startAngle = f13;
        pathArcOperation.sweepAngle = f14;
        this.f45307a.add(pathArcOperation);
        a aVar = new a(pathArcOperation);
        float f15 = f13 + f14;
        boolean z10 = f14 < 0.0f;
        if (z10) {
            f13 = (f13 + ANGLE_LEFT) % 360.0f;
        }
        float f16 = z10 ? (ANGLE_LEFT + f15) % 360.0f : f15;
        a(f13);
        this.f45308b.add(aVar);
        this.currentShadowAngle = f16;
        double d2 = f15;
        this.endX = (((f11 - f6) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f6 + f11) * 0.5f);
        this.endY = (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f10 + f12) * 0.5f);
    }

    public void applyToPath(Matrix matrix, Path path) {
        ArrayList arrayList = this.f45307a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((PathOperation) arrayList.get(i10)).applyToPath(matrix, path);
        }
    }

    @RequiresApi(21)
    public void cubicToPoint(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f45307a.add(new PathCubicOperation(f6, f10, f11, f12, f13, f14));
        this.f45309c = true;
        this.endX = f13;
        this.endY = f14;
    }

    public void lineTo(float f6, float f10) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f45317a = f6;
        pathLineOperation.f45318b = f10;
        this.f45307a.add(pathLineOperation);
        c cVar = new c(pathLineOperation, this.endX, this.endY);
        float fB = cVar.b() + 270.0f;
        float fB2 = cVar.b() + 270.0f;
        a(fB);
        this.f45308b.add(cVar);
        this.currentShadowAngle = fB2;
        this.endX = f6;
        this.endY = f10;
    }

    @RequiresApi(21)
    public void quadToPoint(float f6, float f10, float f11, float f12) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.controlX = f6;
        pathQuadOperation.controlY = f10;
        pathQuadOperation.endX = f11;
        pathQuadOperation.endY = f12;
        this.f45307a.add(pathQuadOperation);
        this.f45309c = true;
        this.endX = f11;
        this.endY = f12;
    }

    public void reset(float f6, float f10) {
        reset(f6, f10, 270.0f, 0.0f);
    }

    public void reset(float f6, float f10, float f11, float f12) {
        this.startX = f6;
        this.startY = f10;
        this.endX = f6;
        this.endY = f10;
        this.currentShadowAngle = f11;
        this.endShadowAngle = (f11 + f12) % 360.0f;
        this.f45307a.clear();
        this.f45308b.clear();
        this.f45309c = false;
    }

    public ShapePath(float f6, float f10) {
        reset(f6, f10);
    }

    public void lineTo(float f6, float f10, float f11, float f12) {
        if ((Math.abs(f6 - this.endX) < 0.001f && Math.abs(f10 - this.endY) < 0.001f) || (Math.abs(f6 - f11) < 0.001f && Math.abs(f10 - f12) < 0.001f)) {
            lineTo(f11, f12);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f45317a = f6;
        pathLineOperation.f45318b = f10;
        ArrayList arrayList = this.f45307a;
        arrayList.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f45317a = f11;
        pathLineOperation2.f45318b = f12;
        arrayList.add(pathLineOperation2);
        b bVar = new b(pathLineOperation, pathLineOperation2, this.endX, this.endY);
        float fB = ((bVar.b() - bVar.c()) + 360.0f) % 360.0f;
        if (fB > ANGLE_LEFT) {
            fB -= 360.0f;
        }
        if (fB > 0.0f) {
            lineTo(f6, f10);
            lineTo(f11, f12);
            return;
        }
        float fC = bVar.c() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fC);
        this.f45308b.add(bVar);
        this.currentShadowAngle = fB2;
        this.endX = f11;
        this.endY = f12;
    }
}
