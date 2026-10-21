package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.e;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieDrawable f25802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseKeyframeAnimation<Float, Float> f25804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ShapeData f25805d;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.f25802a = lottieDrawable;
        this.f25803b = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.f25804c = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    public static int a(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25803b;
    }

    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.f25804c;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public ShapeData modifyShape(ShapeData shapeData) {
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() <= 2) {
            return shapeData;
        }
        float fFloatValue = this.f25804c.getValue().floatValue();
        if (fFloatValue == 0.0f) {
            return shapeData;
        }
        List<CubicCurveData> curves2 = shapeData.getCurves();
        boolean zIsClosed = shapeData.isClosed();
        boolean z10 = true;
        int size = curves2.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            CubicCurveData cubicCurveData = curves2.get(size);
            CubicCurveData cubicCurveData2 = curves2.get(a(size - 1, curves2.size()));
            PointF vertex = (size != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            i10 = (((size != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && (size == 0 || size == curves2.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        ShapeData shapeData2 = this.f25805d;
        if (shapeData2 == null || shapeData2.getCurves().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new CubicCurveData());
            }
            this.f25805d = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f25805d.setClosed(zIsClosed);
        ShapeData shapeData3 = this.f25805d;
        shapeData3.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
        List<CubicCurveData> curves3 = shapeData3.getCurves();
        boolean zIsClosed2 = shapeData.isClosed();
        int i12 = 0;
        int i13 = 0;
        while (i12 < curves.size()) {
            CubicCurveData cubicCurveData3 = curves.get(i12);
            CubicCurveData cubicCurveData4 = curves.get(a(i12 - 1, curves.size()));
            CubicCurveData cubicCurveData5 = curves.get(a(i12 - 2, curves.size()));
            PointF vertex2 = (i12 != 0 || zIsClosed2) ? cubicCurveData4.getVertex() : shapeData.getInitialPoint();
            PointF controlPoint2 = (i12 != 0 || zIsClosed2) ? cubicCurveData4.getControlPoint2() : vertex2;
            PointF controlPoint1 = cubicCurveData3.getControlPoint1();
            PointF vertex3 = cubicCurveData5.getVertex();
            PointF vertex4 = cubicCurveData3.getVertex();
            boolean z11 = (shapeData.isClosed() || !(i12 == 0 || i12 == curves.size() + (-1))) ? false : z10;
            if (controlPoint2.equals(vertex2) && controlPoint1.equals(vertex2) && !z11) {
                float f6 = vertex2.x;
                float f10 = f6 - vertex3.x;
                float f11 = vertex2.y;
                float f12 = f11 - vertex3.y;
                float f13 = vertex4.x - f6;
                float f14 = vertex4.y - f11;
                float fHypot = (float) Math.hypot(f10, f12);
                float fHypot2 = (float) Math.hypot(f13, f14);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f15 = vertex2.x;
                float fA = e.a(vertex3.x, f15, fMin, f15);
                float f16 = vertex2.y;
                float fA2 = e.a(vertex3.y, f16, fMin, f16);
                float fA3 = e.a(vertex4.x, f15, fMin2, f15);
                float fA4 = e.a(vertex4.y, f16, fMin2, f16);
                float f17 = fA - ((fA - f15) * 0.5519f);
                float f18 = fA2 - ((fA2 - f16) * 0.5519f);
                float f19 = fA3 - ((fA3 - f15) * 0.5519f);
                float f20 = fA4 - ((fA4 - f16) * 0.5519f);
                CubicCurveData cubicCurveData6 = curves3.get(a(i13 - 1, curves3.size()));
                CubicCurveData cubicCurveData7 = curves3.get(i13);
                cubicCurveData6.setControlPoint2(fA, fA2);
                cubicCurveData6.setVertex(fA, fA2);
                if (i12 == 0) {
                    shapeData3.setInitialPoint(fA, fA2);
                }
                cubicCurveData7.setControlPoint1(f17, f18);
                CubicCurveData cubicCurveData8 = curves3.get(i13 + 1);
                cubicCurveData7.setControlPoint2(f19, f20);
                cubicCurveData7.setVertex(fA3, fA4);
                cubicCurveData8.setControlPoint1(fA3, fA4);
                i13 += 2;
            } else {
                CubicCurveData cubicCurveData9 = curves3.get(a(i13 - 1, curves3.size()));
                CubicCurveData cubicCurveData10 = curves3.get(i13);
                cubicCurveData9.setControlPoint2(cubicCurveData4.getControlPoint2().x, cubicCurveData4.getControlPoint2().y);
                cubicCurveData9.setVertex(cubicCurveData4.getVertex().x, cubicCurveData4.getVertex().y);
                cubicCurveData10.setControlPoint1(cubicCurveData3.getControlPoint1().x, cubicCurveData3.getControlPoint1().y);
                i13++;
            }
            i12++;
            curves = curves;
            z10 = true;
        }
        return shapeData3;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25802a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
