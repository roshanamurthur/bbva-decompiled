package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ContentGroup implements DrawingContent, b, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LPaint f25695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f25697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f25698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f25699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Content> f25702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LottieDrawable f25703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ArrayList f25704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final TransformKeyframeAnimation f25705k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup, LottieComposition lottieComposition) {
        AnimatableTransform animatableTransform;
        String name = shapeGroup.getName();
        boolean zIsHidden = shapeGroup.isHidden();
        List<ContentModel> items = shapeGroup.getItems();
        ArrayList arrayList = new ArrayList(items.size());
        for (int i10 = 0; i10 < items.size(); i10++) {
            Content content = items.get(i10).toContent(lottieDrawable, lottieComposition, baseLayer);
            if (content != null) {
                arrayList.add(content);
            }
        }
        List<ContentModel> items2 = shapeGroup.getItems();
        for (int i11 = 0; i11 < items2.size(); i11++) {
            ContentModel contentModel = items2.get(i11);
            if (contentModel instanceof AnimatableTransform) {
                animatableTransform = (AnimatableTransform) contentModel;
                this(lottieDrawable, baseLayer, name, zIsHidden, arrayList, animatableTransform);
            }
        }
        animatableTransform = null;
        this(lottieDrawable, baseLayer, name, zIsHidden, arrayList, animatableTransform);
    }

    public final List<b> a() {
        if (this.f25704j == null) {
            this.f25704j = new ArrayList();
            int i10 = 0;
            while (true) {
                List<Content> list = this.f25702h;
                if (i10 >= list.size()) {
                    break;
                }
                Content content = list.get(i10);
                if (content instanceof b) {
                    this.f25704j.add((b) content);
                }
                i10++;
            }
        }
        return this.f25704j;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f25705k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.applyValueCallback(t10, lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        if (this.f25701g) {
            return;
        }
        Matrix matrix2 = this.f25697c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f25705k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.getMatrix());
            i10 = (int) (((((transformKeyframeAnimation.getOpacity() == null ? 100 : transformKeyframeAnimation.getOpacity().getValue().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean zIsApplyingOpacityToLayersEnabled = this.f25703i.isApplyingOpacityToLayersEnabled();
        boolean z10 = false;
        List<Content> list = this.f25702h;
        if (zIsApplyingOpacityToLayersEnabled) {
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                if ((list.get(i12) instanceof DrawingContent) && (i11 = i11 + 1) >= 2) {
                    if (i10 == 255) {
                        break;
                    }
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            RectF rectF = this.f25696b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(rectF, matrix2, true);
            LPaint lPaint = this.f25695a;
            lPaint.setAlpha(i10);
            Utils.saveLayerCompat(canvas, rectF, lPaint);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).draw(canvas, matrix2, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f25697c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f25705k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.getMatrix());
        }
        RectF rectF2 = this.f25699e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<Content> list = this.f25702h;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public List<Content> getContents() {
        return this.f25702h;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25700f;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        Matrix matrix = this.f25697c;
        matrix.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f25705k;
        if (transformKeyframeAnimation != null) {
            matrix.set(transformKeyframeAnimation.getMatrix());
        }
        Path path = this.f25698d;
        path.reset();
        if (this.f25701g) {
            return path;
        }
        List<Content> list = this.f25702h;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof b) {
                path.addPath(((b) content).getPath(), matrix);
            }
        }
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25703i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        if (!keyPath.matches(getName(), i10) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            keyPath2 = keyPath2.addKey(getName());
            if (keyPath.fullyResolvesTo(getName(), i10)) {
                list.add(keyPath2.resolve(this));
            }
        }
        if (!keyPath.propagateToChildren(getName(), i10)) {
            return;
        }
        int iIncrementDepthBy = keyPath.incrementDepthBy(getName(), i10) + i10;
        int i11 = 0;
        while (true) {
            List<Content> list2 = this.f25702h;
            if (i11 >= list2.size()) {
                return;
            }
            Content content = list2.get(i11);
            if (content instanceof KeyPathElement) {
                ((KeyPathElement) content).resolveKeyPath(keyPath, iIncrementDepthBy, list, keyPath2);
            }
            i11++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        int size = list.size();
        List<Content> list3 = this.f25702h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            Content content = list3.get(size2);
            content.setContents(arrayList, list3.subList(0, size2));
            arrayList.add(content);
        }
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z10, ArrayList arrayList, @Nullable AnimatableTransform animatableTransform) {
        this.f25695a = new LPaint();
        this.f25696b = new RectF();
        this.f25697c = new Matrix();
        this.f25698d = new Path();
        this.f25699e = new RectF();
        this.f25700f = str;
        this.f25703i = lottieDrawable;
        this.f25701g = z10;
        this.f25702h = arrayList;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = animatableTransform.createAnimation();
            this.f25705k = transformKeyframeAnimationCreateAnimation;
            transformKeyframeAnimationCreateAnimation.addAnimationsToLayer(baseLayer);
            transformKeyframeAnimationCreateAnimation.addListener(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof a) {
                arrayList2.add((a) content);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((a) arrayList2.get(size2)).absorbContent(arrayList.listIterator(arrayList.size()));
        }
    }
}
