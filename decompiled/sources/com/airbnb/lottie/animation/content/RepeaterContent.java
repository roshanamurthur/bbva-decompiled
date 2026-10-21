package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class RepeaterContent implements DrawingContent, b, a, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f25792a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25793b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f25794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BaseLayer f25795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FloatKeyframeAnimation f25798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FloatKeyframeAnimation f25799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TransformKeyframeAnimation f25800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ContentGroup f25801j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.f25794c = lottieDrawable;
        this.f25795d = baseLayer;
        this.f25796e = repeater.getName();
        this.f25797f = repeater.isHidden();
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = repeater.getCopies().createAnimation();
        this.f25798g = floatKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = repeater.getOffset().createAnimation();
        this.f25799h = floatKeyframeAnimationCreateAnimation2;
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = repeater.getTransform().createAnimation();
        this.f25800i = transformKeyframeAnimationCreateAnimation;
        transformKeyframeAnimationCreateAnimation.addAnimationsToLayer(baseLayer);
        transformKeyframeAnimationCreateAnimation.addListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.a
    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.f25801j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f25801j = new ContentGroup(this.f25794c, this.f25795d, "Repeater", this.f25797f, arrayList, null);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (this.f25800i.applyValueCallback(t10, lottieValueCallback)) {
            return;
        }
        if (t10 == LottieProperty.REPEATER_COPIES) {
            this.f25798g.setValueCallback(lottieValueCallback);
        } else if (t10 == LottieProperty.REPEATER_OFFSET) {
            this.f25799h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f25798g.getValue().floatValue();
        float fFloatValue2 = this.f25799h.getValue().floatValue();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f25800i;
        float fFloatValue3 = transformKeyframeAnimation.getStartOpacity().getValue().floatValue() / 100.0f;
        float fFloatValue4 = transformKeyframeAnimation.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f25792a;
            matrix2.set(matrix);
            float f6 = i11;
            matrix2.preConcat(transformKeyframeAnimation.getMatrixForRepeater(f6 + fFloatValue2));
            this.f25801j.draw(canvas, matrix2, (int) (MiscUtils.lerp(fFloatValue3, fFloatValue4, f6 / fFloatValue) * i10));
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        this.f25801j.getBounds(rectF, matrix, z10);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25796e;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        Path path = this.f25801j.getPath();
        Path path2 = this.f25793b;
        path2.reset();
        float fFloatValue = this.f25798g.getValue().floatValue();
        float fFloatValue2 = this.f25799h.getValue().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix = this.f25792a;
            matrix.set(this.f25800i.getMatrixForRepeater(i10 + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25794c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
        for (int i11 = 0; i11 < this.f25801j.getContents().size(); i11++) {
            Content content = this.f25801j.getContents().get(i11);
            if (content instanceof KeyPathElementContent) {
                MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, (KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        this.f25801j.setContents(list, list2);
    }
}
