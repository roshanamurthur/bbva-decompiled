package com.airbnb.lottie.animation.keyframe;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<K> f25827c;

    @Nullable
    protected LottieValueCallback<A> valueCallback;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25825a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25826b = false;
    protected float progress = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public A f25828d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25829e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25830f = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    public static final class a<T> implements b<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean a(float f6) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final Keyframe<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean c(float f6) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface b<T> {
        boolean a(float f6);

        Keyframe<T> b();

        boolean c(float f6);

        @FloatRange(from = 0.0d, to = 1.0d)
        float d();

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    public static final class c<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends Keyframe<T>> f25831a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Keyframe<T> f25833c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f25834d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public Keyframe<T> f25832b = f(0.0f);

        public c(List<? extends Keyframe<T>> list) {
            this.f25831a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean a(float f6) {
            Keyframe<T> keyframe = this.f25833c;
            Keyframe<T> keyframe2 = this.f25832b;
            if (keyframe == keyframe2 && this.f25834d == f6) {
                return true;
            }
            this.f25833c = keyframe2;
            this.f25834d = f6;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        @NonNull
        public final Keyframe<T> b() {
            return this.f25832b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean c(float f6) {
            if (this.f25832b.containsProgress(f6)) {
                return !this.f25832b.isStatic();
            }
            this.f25832b = f(f6);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float d() {
            return this.f25831a.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float e() {
            return ((Keyframe) androidx.emoji2.text.flatbuffer.a.b(this.f25831a, 1)).getEndProgress();
        }

        public final Keyframe<T> f(float f6) {
            List<? extends Keyframe<T>> list = this.f25831a;
            Keyframe<T> keyframe = (Keyframe) androidx.emoji2.text.flatbuffer.a.b(list, 1);
            if (f6 >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = list.get(size);
                if (this.f25832b != keyframe2 && keyframe2.containsProgress(f6)) {
                    return keyframe2;
                }
            }
            return list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class d<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Keyframe<T> f25835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f25836b = -1.0f;

        public d(List<? extends Keyframe<T>> list) {
            this.f25835a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean a(float f6) {
            if (this.f25836b == f6) {
                return true;
            }
            this.f25836b = f6;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final Keyframe<T> b() {
            return this.f25835a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean c(float f6) {
            return !this.f25835a.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float d() {
            return this.f25835a.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final float e() {
            return this.f25835a.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.b
        public final boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        b<K> dVar;
        if (list.isEmpty()) {
            dVar = new a<>();
        } else {
            dVar = list.size() == 1 ? new d<>(list) : new c<>(list);
        }
        this.f25827c = dVar;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    @SuppressLint({"Range"})
    public float a() {
        if (this.f25830f == -1.0f) {
            this.f25830f = this.f25827c.e();
        }
        return this.f25830f;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.f25825a.add(animationListener);
    }

    public final float b() {
        if (this.f25826b) {
            return 0.0f;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public Keyframe<K> getCurrentKeyframe() {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        Keyframe<K> keyframeB = this.f25827c.b();
        if (L.isTraceEnabled()) {
            L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return keyframeB;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Interpolator interpolator;
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe == null || currentKeyframe.isStatic() || (interpolator = currentKeyframe.interpolator) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(b());
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        float fB = b();
        if (this.valueCallback == null && this.f25827c.a(fB)) {
            return this.f25828d;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        A value = (interpolator == null || currentKeyframe.yInterpolator == null) ? getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress()) : getValue(currentKeyframe, fB, interpolator.getInterpolation(fB), currentKeyframe.yInterpolator.getInterpolation(fB));
        this.f25828d = value;
        return value;
    }

    public abstract A getValue(Keyframe<K> keyframe, float f6);

    public boolean hasValueCallback() {
        return this.valueCallback != null;
    }

    public void notifyListeners() {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#notifyListeners");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25825a;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((AnimationListener) arrayList.get(i10)).onValueChanged();
            i10++;
        }
        if (L.isTraceEnabled()) {
            L.endSection("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void setIsDiscrete() {
        this.f25826b = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#setProgress");
        }
        b<K> bVar = this.f25827c;
        if (bVar.isEmpty()) {
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (this.f25829e == -1.0f) {
            this.f25829e = bVar.d();
        }
        float f10 = this.f25829e;
        if (f6 < f10) {
            if (f10 == -1.0f) {
                this.f25829e = bVar.d();
            }
            f6 = this.f25829e;
        } else if (f6 > a()) {
            f6 = a();
        }
        if (f6 == this.progress) {
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.progress = f6;
            if (bVar.c(f6)) {
                notifyListeners();
            }
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void setValueCallback(@Nullable LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public A getValue(Keyframe<K> keyframe, float f6, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
