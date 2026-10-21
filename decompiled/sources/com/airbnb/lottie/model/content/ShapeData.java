package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f26039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26040c;

    public ShapeData(PointF pointF, boolean z10, List<CubicCurveData> list) {
        this.f26039b = pointF;
        this.f26040c = z10;
        this.f26038a = new ArrayList(list);
    }

    public List<CubicCurveData> getCurves() {
        return this.f26038a;
    }

    public PointF getInitialPoint() {
        return this.f26039b;
    }

    public void interpolateBetween(ShapeData shapeData, ShapeData shapeData2, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (this.f26039b == null) {
            this.f26039b = new PointF();
        }
        this.f26040c = shapeData.isClosed() || shapeData2.isClosed();
        if (shapeData.getCurves().size() != shapeData2.getCurves().size()) {
            Logger.warning("Curves must have the same number of control points. Shape 1: " + shapeData.getCurves().size() + "\tShape 2: " + shapeData2.getCurves().size());
        }
        int iMin = Math.min(shapeData.getCurves().size(), shapeData2.getCurves().size());
        ArrayList arrayList = this.f26038a;
        if (arrayList.size() < iMin) {
            for (int size = arrayList.size(); size < iMin; size++) {
                arrayList.add(new CubicCurveData());
            }
        } else if (arrayList.size() > iMin) {
            for (int size2 = arrayList.size() - 1; size2 >= iMin; size2--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF initialPoint = shapeData.getInitialPoint();
        PointF initialPoint2 = shapeData2.getInitialPoint();
        setInitialPoint(MiscUtils.lerp(initialPoint.x, initialPoint2.x, f6), MiscUtils.lerp(initialPoint.y, initialPoint2.y, f6));
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.getCurves().get(size3);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            PointF controlPoint3 = cubicCurveData2.getControlPoint1();
            PointF controlPoint4 = cubicCurveData2.getControlPoint2();
            PointF vertex2 = cubicCurveData2.getVertex();
            ((CubicCurveData) arrayList.get(size3)).setControlPoint1(MiscUtils.lerp(controlPoint1.x, controlPoint3.x, f6), MiscUtils.lerp(controlPoint1.y, controlPoint3.y, f6));
            ((CubicCurveData) arrayList.get(size3)).setControlPoint2(MiscUtils.lerp(controlPoint2.x, controlPoint4.x, f6), MiscUtils.lerp(controlPoint2.y, controlPoint4.y, f6));
            ((CubicCurveData) arrayList.get(size3)).setVertex(MiscUtils.lerp(vertex.x, vertex2.x, f6), MiscUtils.lerp(vertex.y, vertex2.y, f6));
        }
    }

    public boolean isClosed() {
        return this.f26040c;
    }

    public void setClosed(boolean z10) {
        this.f26040c = z10;
    }

    public void setInitialPoint(float f6, float f10) {
        if (this.f26039b == null) {
            this.f26039b = new PointF();
        }
        this.f26039b.set(f6, f10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f26038a.size());
        sb2.append("closed=");
        return a.d(sb2, this.f26040c, AbstractJsonLexerKt.END_OBJ);
    }

    public ShapeData() {
        this.f26038a = new ArrayList();
    }
}
