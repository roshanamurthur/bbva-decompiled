package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompositionLayer extends BaseLayer {

    @Nullable
    public BaseKeyframeAnimation<Float, Float> D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final Paint H;

    @Nullable
    public Boolean I;

    @Nullable
    public Boolean J;
    public float K;
    public boolean L;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26099a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f26099a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26099a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        BaseLayer baseLayer;
        BaseLayer shapeLayer;
        super(lottieDrawable, layer);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.L = true;
        AnimatableFloatValue animatableFloatValue = layer.f26117s;
        if (animatableFloatValue != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = animatableFloatValue.createAnimation();
            this.D = floatKeyframeAnimationCreateAnimation;
            addAnimation(floatKeyframeAnimationCreateAnimation);
            this.D.addUpdateListener(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i10));
                    if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.f26087q.f26105f)) != null) {
                        baseLayer3.f26091u = baseLayer;
                    }
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (BaseLayer.a.f26097a[layer2.getLayerType().ordinal()]) {
                case 1:
                    shapeLayer = new ShapeLayer(lottieComposition, lottieDrawable, this, layer2);
                    break;
                case 2:
                    shapeLayer = new CompositionLayer(lottieDrawable, layer2, lottieComposition.getPrecomps(layer2.getRefId()), lottieComposition);
                    break;
                case 3:
                    shapeLayer = new SolidLayer(lottieDrawable, layer2);
                    break;
                case 4:
                    shapeLayer = new ImageLayer(lottieDrawable, layer2);
                    break;
                case 5:
                    shapeLayer = new NullLayer(lottieDrawable, layer2);
                    break;
                case 6:
                    shapeLayer = new TextLayer(lottieDrawable, layer2);
                    break;
                default:
                    Logger.warning("Unknown layer type " + layer2.getLayerType());
                    shapeLayer = null;
                    break;
            }
            if (shapeLayer != null) {
                longSparseArray.put(shapeLayer.f26087q.getId(), shapeLayer);
                if (baseLayer2 != null) {
                    baseLayer2.f26090t = shapeLayer;
                    baseLayer2 = null;
                } else {
                    this.E.add(0, shapeLayer);
                    int i11 = a.f26099a[layer2.f26119u.ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        baseLayer2 = shapeLayer;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        if (t10 == LottieProperty.TIME_REMAP) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.D;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.D = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void drawLayer(Canvas canvas, Matrix matrix, int i10) {
        if (L.isTraceEnabled()) {
            L.beginSection("CompositionLayer#draw");
        }
        RectF rectF = this.G;
        Layer layer = this.f26087q;
        rectF.set(0.0f, 0.0f, layer.f26113o, layer.f26114p);
        matrix.mapRect(rectF);
        boolean zIsApplyingOpacityToLayersEnabled = this.f26086p.isApplyingOpacityToLayersEnabled();
        ArrayList arrayList = this.E;
        boolean z10 = zIsApplyingOpacityToLayersEnabled && arrayList.size() > 1 && i10 != 255;
        if (z10) {
            Paint paint = this.H;
            paint.setAlpha(i10);
            Utils.saveLayerCompat(canvas, rectF, paint);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((!this.L && "__container".equals(layer.getName())) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((BaseLayer) arrayList.get(size)).draw(canvas, matrix, i10);
            }
        }
        canvas.restore();
        if (L.isTraceEnabled()) {
            L.endSection("CompositionLayer#draw");
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((BaseLayer) arrayList.get(size)).getBounds(rectF2, this.f26085o, true);
            rectF.union(rectF2);
        }
    }

    public float getProgress() {
        return this.K;
    }

    public boolean hasMasks() {
        if (this.J == null) {
            ArrayList arrayList = this.E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                BaseLayer baseLayer = (BaseLayer) arrayList.get(size);
                if (baseLayer instanceof ShapeLayer) {
                    if (baseLayer.c()) {
                        this.J = Boolean.TRUE;
                        return true;
                    }
                } else if ((baseLayer instanceof CompositionLayer) && ((CompositionLayer) baseLayer).hasMasks()) {
                    this.J = Boolean.TRUE;
                    return true;
                }
            }
            this.J = Boolean.FALSE;
        }
        return this.J.booleanValue();
    }

    public boolean hasMatte() {
        if (this.I == null) {
            if (this.f26090t != null) {
                this.I = Boolean.TRUE;
                return true;
            }
            ArrayList arrayList = this.E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((BaseLayer) arrayList.get(size)).f26090t != null) {
                    this.I = Boolean.TRUE;
                    return true;
                }
            }
            this.I = Boolean.FALSE;
        }
        return this.I.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((BaseLayer) arrayList.get(i11)).resolveKeyPath(keyPath, i10, list, keyPath2);
            i11++;
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.L = z10;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z10) {
        super.setOutlineMasksAndMattes(z10);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((BaseLayer) it.next()).setOutlineMasksAndMattes(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (L.isTraceEnabled()) {
            L.beginSection("CompositionLayer#setProgress");
        }
        this.K = f6;
        super.setProgress(f6);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.D;
        Layer layer = this.f26087q;
        if (baseKeyframeAnimation != null) {
            f6 = ((layer.f26101b.getFrameRate() * this.D.getValue().floatValue()) - layer.f26101b.getStartFrame()) / (this.f26086p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.D == null) {
            f6 -= layer.f26112n / layer.f26101b.getDurationFrames();
        }
        if (layer.m != 0.0f && !"__container".equals(layer.getName())) {
            f6 /= layer.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((BaseLayer) arrayList.get(size)).setProgress(f6);
        }
        if (L.isTraceEnabled()) {
            L.endSection("CompositionLayer#setProgress");
        }
    }
}
