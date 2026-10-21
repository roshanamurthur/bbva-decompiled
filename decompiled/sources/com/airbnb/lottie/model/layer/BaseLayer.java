package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    public float A;

    @Nullable
    public BlurMaskFilter B;

    @Nullable
    public LPaint C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f26072a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f26073b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f26074c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LPaint f26075d = new LPaint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LPaint f26076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LPaint f26077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LPaint f26078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LPaint f26079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f26080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f26081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f26082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f26083l;
    public final RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f26084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f26085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LottieDrawable f26086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Layer f26087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final MaskKeyframeAnimation f26088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final FloatKeyframeAnimation f26089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public BaseLayer f26090t;
    public final TransformKeyframeAnimation transform;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public BaseLayer f26091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<BaseLayer> f26092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f26093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26095y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public LPaint f26096z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26098b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f26098b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26098b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26098b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26098b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f26097a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26097a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26097a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26097a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26097a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26097a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26097a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f26076e = new LPaint(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f26077f = new LPaint(1, mode2);
        LPaint lPaint = new LPaint(1);
        this.f26078g = lPaint;
        this.f26079h = new LPaint(PorterDuff.Mode.CLEAR);
        this.f26080i = new RectF();
        this.f26081j = new RectF();
        this.f26082k = new RectF();
        this.f26083l = new RectF();
        this.m = new RectF();
        this.f26085o = new Matrix();
        this.f26093w = new ArrayList();
        this.f26094x = true;
        this.A = 0.0f;
        this.f26086p = lottieDrawable;
        this.f26087q = layer;
        this.f26084n = layer.getName() + "#draw";
        if (layer.f26119u == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = layer.f26108i.createAnimation();
        this.transform = transformKeyframeAnimationCreateAnimation;
        transformKeyframeAnimationCreateAnimation.addListener(this);
        List<Mask> list = layer.f26107h;
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(list);
            this.f26088r = maskKeyframeAnimation;
            Iterator<BaseKeyframeAnimation<ShapeData, Path>> it = maskKeyframeAnimation.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation : this.f26088r.getOpacityAnimations()) {
                addAnimation(baseKeyframeAnimation);
                baseKeyframeAnimation.addUpdateListener(this);
            }
        }
        Layer layer2 = this.f26087q;
        if (layer2.f26118t.isEmpty()) {
            if (true != this.f26094x) {
                this.f26094x = true;
                this.f26086p.invalidateSelf();
                return;
            }
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(layer2.f26118t);
        this.f26089s = floatKeyframeAnimation;
        floatKeyframeAnimation.setIsDiscrete();
        this.f26089s.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() { // from class: y3.a
            @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
            public final void onValueChanged() {
                BaseLayer baseLayer = this.f94742a;
                boolean z10 = baseLayer.f26089s.getFloatValue() == 1.0f;
                if (z10 != baseLayer.f26094x) {
                    baseLayer.f26094x = z10;
                    baseLayer.f26086p.invalidateSelf();
                }
            }
        });
        boolean z10 = this.f26089s.getValue().floatValue() == 1.0f;
        if (z10 != this.f26094x) {
            this.f26094x = z10;
            this.f26086p.invalidateSelf();
        }
        addAnimation(this.f26089s);
    }

    public final void a() {
        if (this.f26092v != null) {
            return;
        }
        if (this.f26091u == null) {
            this.f26092v = Collections.emptyList();
            return;
        }
        this.f26092v = new ArrayList();
        for (BaseLayer baseLayer = this.f26091u; baseLayer != null; baseLayer = baseLayer.f26091u) {
            this.f26092v.add(baseLayer);
        }
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.f26093w.add(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.transform.applyValueCallback(t10, lottieValueCallback);
    }

    public final void b(Canvas canvas) {
        if (L.isTraceEnabled()) {
            L.beginSection("Layer#clearLayer");
        }
        RectF rectF = this.f26080i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f26079h);
        if (L.isTraceEnabled()) {
            L.endSection("Layer#clearLayer");
        }
    }

    public final boolean c() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.f26088r;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.getMaskAnimations().isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        MaskKeyframeAnimation maskKeyframeAnimation;
        Path path;
        Layer layer;
        float f6;
        RectF rectF;
        Matrix matrix2;
        String str;
        LPaint lPaint;
        int i11;
        int i12;
        Integer value;
        String str2 = this.f26084n;
        L.beginSection(str2);
        if (this.f26094x) {
            Layer layer2 = this.f26087q;
            if (!layer2.isHidden()) {
                a();
                if (L.isTraceEnabled()) {
                    L.beginSection("Layer#parentMatrix");
                }
                Matrix matrix3 = this.f26073b;
                matrix3.reset();
                matrix3.set(matrix);
                for (int size = this.f26092v.size() - 1; size >= 0; size--) {
                    matrix3.preConcat(this.f26092v.get(size).transform.getMatrix());
                }
                if (L.isTraceEnabled()) {
                    L.endSection("Layer#parentMatrix");
                }
                BaseKeyframeAnimation<?, Integer> opacity = this.transform.getOpacity();
                int iIntValue = (int) ((((i10 / 255.0f) * ((opacity == null || (value = opacity.getValue()) == null) ? 100 : value.intValue())) / 100.0f) * 255.0f);
                boolean z10 = this.f26090t != null;
                LottieDrawable lottieDrawable = this.f26086p;
                if (!z10 && !c() && getBlendMode() == LBlendMode.NORMAL) {
                    matrix3.preConcat(this.transform.getMatrix());
                    if (L.isTraceEnabled()) {
                        L.beginSection("Layer#drawLayer");
                    }
                    drawLayer(canvas, matrix3, iIntValue);
                    if (L.isTraceEnabled()) {
                        L.endSection("Layer#drawLayer");
                    }
                    lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(layer2.getName(), L.endSection(str2));
                    return;
                }
                if (L.isTraceEnabled()) {
                    L.beginSection("Layer#computeBounds");
                }
                RectF rectF2 = this.f26080i;
                getBounds(rectF2, matrix3, false);
                if (this.f26090t != null) {
                    if (layer2.f26119u != Layer.MatteType.INVERT) {
                        RectF rectF3 = this.f26083l;
                        rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                        this.f26090t.getBounds(rectF3, matrix, true);
                        if (!rectF2.intersect(rectF3)) {
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                matrix3.preConcat(this.transform.getMatrix());
                RectF rectF4 = this.f26082k;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zC = c();
                Path path2 = this.f26072a;
                MaskKeyframeAnimation maskKeyframeAnimation2 = this.f26088r;
                if (zC) {
                    int size2 = maskKeyframeAnimation2.getMasks().size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            Mask mask = maskKeyframeAnimation2.getMasks().get(i13);
                            int i14 = size2;
                            Path value2 = maskKeyframeAnimation2.getMaskAnimations().get(i13).getValue();
                            if (value2 == null) {
                                maskKeyframeAnimation = maskKeyframeAnimation2;
                            } else {
                                path2.set(value2);
                                path2.transform(matrix3);
                                int i15 = a.f26098b[mask.getMaskMode().ordinal()];
                                maskKeyframeAnimation = maskKeyframeAnimation2;
                                if (i15 != 1 && i15 != 2 && ((i15 != 3 && i15 != 4) || !mask.isInverted())) {
                                    RectF rectF5 = this.m;
                                    path2.computeBounds(rectF5, false);
                                    if (i13 == 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                    }
                                    i13++;
                                    size2 = i14;
                                    maskKeyframeAnimation2 = maskKeyframeAnimation;
                                    path2 = path2;
                                    layer2 = layer2;
                                }
                            }
                            i13++;
                            size2 = i14;
                            maskKeyframeAnimation2 = maskKeyframeAnimation;
                            path2 = path2;
                            layer2 = layer2;
                        } else {
                            maskKeyframeAnimation = maskKeyframeAnimation2;
                            path = path2;
                            layer = layer2;
                            if (rectF2.intersect(rectF4)) {
                                f6 = 0.0f;
                            } else {
                                f6 = 0.0f;
                                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                        rectF = this.f26081j;
                        rectF.set(f6, f6, canvas.getWidth(), canvas.getHeight());
                        matrix2 = this.f26074c;
                        canvas.getMatrix(matrix2);
                        if (!matrix2.isIdentity()) {
                            matrix2.invert(matrix2);
                            matrix2.mapRect(rectF);
                        }
                        if (!rectF2.intersect(rectF)) {
                            rectF2.set(f6, f6, f6, f6);
                        }
                        if (L.isTraceEnabled()) {
                            L.endSection("Layer#computeBounds");
                        }
                        if (rectF2.width() >= 1.0f || rectF2.height() < 1.0f) {
                            str = str2;
                            lottieDrawable = lottieDrawable;
                            rectF2 = rectF2;
                        } else {
                            if (L.isTraceEnabled()) {
                                L.beginSection("Layer#saveLayer");
                            }
                            LPaint lPaint2 = this.f26075d;
                            lPaint2.setAlpha(255);
                            PaintCompat.setBlendMode(lPaint2, getBlendMode().toNativeBlendMode());
                            Utils.saveLayerCompat(canvas, rectF2, lPaint2);
                            if (L.isTraceEnabled()) {
                                L.endSection("Layer#saveLayer");
                            }
                            if (getBlendMode() != LBlendMode.MULTIPLY) {
                                b(canvas);
                            } else {
                                if (this.C == null) {
                                    LPaint lPaint3 = new LPaint();
                                    this.C = lPaint3;
                                    lPaint3.setColor(-1);
                                }
                                canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                            }
                            if (L.isTraceEnabled()) {
                                L.beginSection("Layer#drawLayer");
                            }
                            drawLayer(canvas, matrix3, iIntValue);
                            if (L.isTraceEnabled()) {
                                L.endSection("Layer#drawLayer");
                            }
                            if (c()) {
                                if (L.isTraceEnabled()) {
                                    L.beginSection("Layer#saveLayer");
                                }
                                LPaint lPaint4 = this.f26076e;
                                Utils.saveLayerCompat(canvas, rectF2, lPaint4, 19);
                                if (Build.VERSION.SDK_INT < 28) {
                                    b(canvas);
                                }
                                if (L.isTraceEnabled()) {
                                    L.endSection("Layer#saveLayer");
                                }
                                int i16 = 0;
                                while (i16 < maskKeyframeAnimation.getMasks().size()) {
                                    Mask mask2 = maskKeyframeAnimation.getMasks().get(i16);
                                    BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation = maskKeyframeAnimation.getMaskAnimations().get(i16);
                                    BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = maskKeyframeAnimation.getOpacityAnimations().get(i16);
                                    String str3 = str2;
                                    int i17 = a.f26098b[mask2.getMaskMode().ordinal()];
                                    if (i17 != 1) {
                                        LPaint lPaint5 = this.f26077f;
                                        i12 = iIntValue;
                                        if (i17 == 2) {
                                            if (i16 == 0) {
                                                lPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
                                                lPaint2.setAlpha(255);
                                                canvas.drawRect(rectF2, lPaint2);
                                            }
                                            if (mask2.isInverted()) {
                                                Utils.saveLayerCompat(canvas, rectF2, lPaint5);
                                                canvas.drawRect(rectF2, lPaint2);
                                                lPaint5.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                                path.set(baseKeyframeAnimation.getValue());
                                                path.transform(matrix3);
                                                canvas.drawPath(path, lPaint5);
                                                canvas.restore();
                                            } else {
                                                path.set(baseKeyframeAnimation.getValue());
                                                path.transform(matrix3);
                                                canvas.drawPath(path, lPaint5);
                                            }
                                        } else if (i17 != 3) {
                                            if (i17 == 4) {
                                                if (mask2.isInverted()) {
                                                    Utils.saveLayerCompat(canvas, rectF2, lPaint2);
                                                    canvas.drawRect(rectF2, lPaint2);
                                                    path.set(baseKeyframeAnimation.getValue());
                                                    path.transform(matrix3);
                                                    lPaint2.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                                    canvas.drawPath(path, lPaint5);
                                                    canvas.restore();
                                                } else {
                                                    path.set(baseKeyframeAnimation.getValue());
                                                    path.transform(matrix3);
                                                    lPaint2.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                                    canvas.drawPath(path, lPaint2);
                                                }
                                            }
                                        } else if (mask2.isInverted()) {
                                            Utils.saveLayerCompat(canvas, rectF2, lPaint4);
                                            canvas.drawRect(rectF2, lPaint2);
                                            lPaint5.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                            path.set(baseKeyframeAnimation.getValue());
                                            path.transform(matrix3);
                                            canvas.drawPath(path, lPaint5);
                                            canvas.restore();
                                        } else {
                                            Utils.saveLayerCompat(canvas, rectF2, lPaint4);
                                            path.set(baseKeyframeAnimation.getValue());
                                            path.transform(matrix3);
                                            lPaint2.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                            canvas.drawPath(path, lPaint2);
                                            canvas.restore();
                                        }
                                    } else {
                                        i12 = iIntValue;
                                        if (!maskKeyframeAnimation.getMaskAnimations().isEmpty()) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= maskKeyframeAnimation.getMasks().size()) {
                                                    lPaint2.setAlpha(255);
                                                    canvas.drawRect(rectF2, lPaint2);
                                                    break;
                                                } else if (maskKeyframeAnimation.getMasks().get(i18).getMaskMode() == Mask.MaskMode.MASK_MODE_NONE) {
                                                    i18++;
                                                }
                                            }
                                        }
                                        i16++;
                                        iIntValue = i12;
                                        str2 = str3;
                                    }
                                    i16++;
                                    iIntValue = i12;
                                    str2 = str3;
                                }
                                str = str2;
                                i11 = iIntValue;
                                if (L.isTraceEnabled()) {
                                    L.beginSection("Layer#restoreLayer");
                                }
                                canvas.restore();
                                if (L.isTraceEnabled()) {
                                    L.endSection("Layer#restoreLayer");
                                }
                            } else {
                                str = str2;
                                i11 = iIntValue;
                            }
                            if (this.f26090t != null) {
                                if (L.isTraceEnabled()) {
                                    L.beginSection("Layer#drawMatte");
                                    L.beginSection("Layer#saveLayer");
                                }
                                Utils.saveLayerCompat(canvas, rectF2, this.f26078g, 19);
                                if (L.isTraceEnabled()) {
                                    L.endSection("Layer#saveLayer");
                                }
                                b(canvas);
                                this.f26090t.draw(canvas, matrix, i11);
                                if (L.isTraceEnabled()) {
                                    L.beginSection("Layer#restoreLayer");
                                }
                                canvas.restore();
                                if (L.isTraceEnabled()) {
                                    L.endSection("Layer#restoreLayer");
                                    L.endSection("Layer#drawMatte");
                                }
                            }
                            if (L.isTraceEnabled()) {
                                L.beginSection("Layer#restoreLayer");
                            }
                            canvas.restore();
                            if (L.isTraceEnabled()) {
                                L.endSection("Layer#restoreLayer");
                            }
                        }
                        if (this.f26095y && (lPaint = this.f26096z) != null) {
                            lPaint.setStyle(Paint.Style.STROKE);
                            this.f26096z.setColor(-251901);
                            this.f26096z.setStrokeWidth(4.0f);
                            canvas.drawRect(rectF2, this.f26096z);
                            this.f26096z.setStyle(Paint.Style.FILL);
                            this.f26096z.setColor(1357638635);
                            canvas.drawRect(rectF2, this.f26096z);
                        }
                        lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(layer.getName(), L.endSection(str));
                        return;
                    }
                }
                maskKeyframeAnimation = maskKeyframeAnimation2;
                path = path2;
                layer = layer2;
                f6 = 0.0f;
                rectF = this.f26081j;
                rectF.set(f6, f6, canvas.getWidth(), canvas.getHeight());
                matrix2 = this.f26074c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                    matrix2.invert(matrix2);
                    matrix2.mapRect(rectF);
                }
                if (!rectF2.intersect(rectF)) {
                    rectF2.set(f6, f6, f6, f6);
                }
                if (L.isTraceEnabled()) {
                    L.endSection("Layer#computeBounds");
                }
                if (rectF2.width() >= 1.0f) {
                    str = str2;
                    lottieDrawable = lottieDrawable;
                    rectF2 = rectF2;
                } else {
                    str = str2;
                    lottieDrawable = lottieDrawable;
                    rectF2 = rectF2;
                }
                if (this.f26095y) {
                    lPaint.setStyle(Paint.Style.STROKE);
                    this.f26096z.setColor(-251901);
                    this.f26096z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.f26096z);
                    this.f26096z.setStyle(Paint.Style.FILL);
                    this.f26096z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.f26096z);
                }
                lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(layer.getName(), L.endSection(str));
                return;
            }
        }
        L.endSection(str2);
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i10);

    public LBlendMode getBlendMode() {
        return this.f26087q.getBlendMode();
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.f26087q.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f6) {
        if (this.A == f6) {
            return this.B;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f6 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.B = blurMaskFilter;
        this.A = f6;
        return blurMaskFilter;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        this.f26080i.set(0.0f, 0.0f, 0.0f, 0.0f);
        a();
        Matrix matrix2 = this.f26085o;
        matrix2.set(matrix);
        if (z10) {
            List<BaseLayer> list = this.f26092v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f26092v.get(size).transform.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.f26091u;
                if (baseLayer != null) {
                    matrix2.preConcat(baseLayer.transform.getMatrix());
                }
            }
        }
        matrix2.preConcat(this.transform.getMatrix());
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.f26087q.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f26087q.getName();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f26086p.invalidateSelf();
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f26093w.remove(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        BaseLayer baseLayer = this.f26090t;
        if (baseLayer != null) {
            KeyPath keyPathAddKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.f26090t.getName(), i10)) {
                list.add(keyPathAddKey.resolve(this.f26090t));
            }
            if (keyPath.propagateToChildren(getName(), i10)) {
                this.f26090t.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.f26090t.getName(), i10) + i10, list, keyPathAddKey);
            }
        }
        if (keyPath.matches(getName(), i10)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i10)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i10)) {
                resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(getName(), i10) + i10, list, keyPath2);
            }
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        if (z10 && this.f26096z == null) {
            this.f26096z = new LPaint();
        }
        this.f26095y = z10;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseLayer#setProgress");
            L.beginSection("BaseLayer#setProgress.transform");
        }
        this.transform.setProgress(f6);
        if (L.isTraceEnabled()) {
            L.endSection("BaseLayer#setProgress.transform");
        }
        MaskKeyframeAnimation maskKeyframeAnimation = this.f26088r;
        if (maskKeyframeAnimation != null) {
            if (L.isTraceEnabled()) {
                L.beginSection("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < maskKeyframeAnimation.getMaskAnimations().size(); i10++) {
                maskKeyframeAnimation.getMaskAnimations().get(i10).setProgress(f6);
            }
            if (L.isTraceEnabled()) {
                L.endSection("BaseLayer#setProgress.mask");
            }
        }
        if (this.f26089s != null) {
            if (L.isTraceEnabled()) {
                L.beginSection("BaseLayer#setProgress.inout");
            }
            this.f26089s.setProgress(f6);
            if (L.isTraceEnabled()) {
                L.endSection("BaseLayer#setProgress.inout");
            }
        }
        if (this.f26090t != null) {
            if (L.isTraceEnabled()) {
                L.beginSection("BaseLayer#setProgress.matte");
            }
            this.f26090t.setProgress(f6);
            if (L.isTraceEnabled()) {
                L.endSection("BaseLayer#setProgress.matte");
            }
        }
        boolean zIsTraceEnabled = L.isTraceEnabled();
        ArrayList arrayList = this.f26093w;
        if (zIsTraceEnabled) {
            L.beginSection("BaseLayer#setProgress.animations." + arrayList.size());
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((BaseKeyframeAnimation) arrayList.get(i11)).setProgress(f6);
        }
        if (L.isTraceEnabled()) {
            L.endSection("BaseLayer#setProgress.animations." + arrayList.size());
            L.endSection("BaseLayer#setProgress");
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
    }
}
