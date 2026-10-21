package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeContent implements b, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieDrawable f25809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ShapeKeyframeAnimation f25810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25811f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25806a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CompoundTrimPathContent f25812g = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.f25807b = shapePath.getName();
        this.f25808c = shapePath.isHidden();
        this.f25809d = lottieDrawable;
        ShapeKeyframeAnimation shapeKeyframeAnimationCreateAnimation = shapePath.getShapePath().createAnimation();
        this.f25810e = shapeKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(shapeKeyframeAnimationCreateAnimation);
        shapeKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.PATH) {
            this.f25810e.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25807b;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        boolean z10 = this.f25811f;
        ShapeKeyframeAnimation shapeKeyframeAnimation = this.f25810e;
        Path path = this.f25806a;
        if (z10 && !shapeKeyframeAnimation.hasValueCallback()) {
            return path;
        }
        path.reset();
        if (this.f25808c) {
            this.f25811f = true;
            return path;
        }
        Path value = shapeKeyframeAnimation.getValue();
        if (value == null) {
            return path;
        }
        path.set(value);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f25812g.apply(path);
        this.f25811f = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25811f = false;
        this.f25809d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Content content = list.get(i10);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f25821d == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f25812g.f25694a.add(trimPathContent);
                    trimPathContent.a(this);
                } else if (!(content instanceof ShapeModifierContent)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((ShapeModifierContent) content);
                }
            } else if (!(content instanceof ShapeModifierContent)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ShapeModifierContent) content);
            }
        }
        this.f25810e.setShapeModifiers(arrayList);
    }
}
