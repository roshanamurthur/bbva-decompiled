package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.n1;
import androidx.collection.ScatterMapKt;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final boolean f25624o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final List<String> f25625p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final ThreadPoolExecutor f25626q1;

    @Nullable
    public FontAssetManager E0;

    @Nullable
    public Map<String, Typeface> F0;

    @Nullable
    public String G0;

    @Nullable
    public FontAssetDelegate H0;

    @Nullable
    public TextDelegate I0;
    public final j0 J0;
    public boolean K0;
    public boolean L0;

    @Nullable
    public CompositionLayer M0;
    public int N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public RenderMode S0;
    public boolean T0;
    public final Matrix U0;
    public Bitmap V0;
    public Canvas W0;
    public Rect X0;
    public RectF Y0;
    public LPaint Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Rect f25627a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Rect f25628b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public RectF f25629c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public RectF f25630d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Matrix f25631e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Matrix f25632f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f25633g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @Nullable
    public AsyncUpdates f25634h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final t f25635i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final Semaphore f25636j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public Handler f25637k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public androidx.core.view.b0 f25638l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final n1 f25639m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public float f25640n1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LottieComposition f25641p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LottieValueAnimator f25642q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f25643r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f25644s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f25645t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public c f25646u0;
    public final ArrayList<b> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public ImageAssetManager f25647w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public String f25648x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public ImageAssetDelegate f25649y0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends LottieValueCallback<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SimpleLottieValueCallback f25650c;

        public a(SimpleLottieValueCallback simpleLottieValueCallback) {
            this.f25650c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) this.f25650c.getValue(lottieFrameInfo);
        }
    }

    public interface b {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c NONE;
        public static final c PLAY;
        public static final c RESUME;

        static {
            c cVar = new c(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = cVar;
            c cVar2 = new c("PLAY", 1);
            PLAY = cVar2;
            c cVar3 = new c("RESUME", 2);
            RESUME = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    static {
        f25624o1 = Build.VERSION.SDK_INT <= 25;
        f25625p1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f25626q1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new LottieThreadFactory());
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.f25642q0 = lottieValueAnimator;
        this.f25643r0 = true;
        this.f25644s0 = false;
        this.f25645t0 = false;
        this.f25646u0 = c.NONE;
        this.v0 = new ArrayList<>();
        this.J0 = new j0();
        this.K0 = false;
        this.L0 = true;
        this.N0 = 255;
        this.R0 = false;
        this.S0 = RenderMode.AUTOMATIC;
        this.T0 = false;
        this.U0 = new Matrix();
        this.f25633g1 = false;
        t tVar = new t(this, 0);
        this.f25635i1 = tVar;
        this.f25636j1 = new Semaphore(1);
        this.f25639m1 = new n1(this, 3);
        this.f25640n1 = -3.4028235E38f;
        lottieValueAnimator.addUpdateListener(tVar);
    }

    public static void c(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return;
        }
        CompositionLayer compositionLayer = new CompositionLayer(this, LayerParser.parse(lottieComposition), lottieComposition.getLayers(), lottieComposition);
        this.M0 = compositionLayer;
        if (this.P0) {
            compositionLayer.setOutlineMasksAndMattes(true);
        }
        this.M0.setClipToCompositionBounds(this.L0);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f25642q0.addListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f25642q0.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25642q0.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final KeyPath keyPath, final T t10, @Nullable final LottieValueCallback<T> lottieValueCallback) {
        CompositionLayer compositionLayer = this.M0;
        if (compositionLayer == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26189a.addValueCallback(keyPath, t10, (LottieValueCallback<Object>) lottieValueCallback);
                }
            });
            return;
        }
        if (keyPath == KeyPath.COMPOSITION) {
            compositionLayer.addValueCallback(t10, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t10, lottieValueCallback);
        } else {
            List<KeyPath> listResolveKeyPath = resolveKeyPath(keyPath);
            for (int i10 = 0; i10 < listResolveKeyPath.size(); i10++) {
                listResolveKeyPath.get(i10).getResolvedElement().addValueCallback(t10, lottieValueCallback);
            }
            if (!(!listResolveKeyPath.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t10 == LottieProperty.TIME_REMAP) {
            setProgress(getProgress());
        }
    }

    public boolean animationsEnabled(@Nullable Context context) {
        if (this.f25644s0) {
            return true;
        }
        return this.f25643r0 && L.getReducedMotionOption().getCurrentReducedMotionMode(context) == ReducedMotionMode.STANDARD_MOTION;
    }

    public final void b() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return;
        }
        this.T0 = this.S0.useSoftwareRendering(Build.VERSION.SDK_INT, lottieComposition.hasDashPattern(), lottieComposition.getMaskAndMatteCount());
    }

    public void cancelAnimation() {
        this.v0.clear();
        this.f25642q0.cancel();
        if (isVisible()) {
            return;
        }
        this.f25646u0 = c.NONE;
    }

    public void clearComposition() {
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (lottieValueAnimator.isRunning()) {
            lottieValueAnimator.cancel();
            if (!isVisible()) {
                this.f25646u0 = c.NONE;
            }
        }
        this.f25641p0 = null;
        this.M0 = null;
        this.f25647w0 = null;
        this.f25640n1 = -3.4028235E38f;
        lottieValueAnimator.clearComposition();
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        CompositionLayer compositionLayer = this.M0;
        LottieComposition lottieComposition = this.f25641p0;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        Matrix matrix = this.U0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / lottieComposition.getBounds().width(), bounds.height() / lottieComposition.getBounds().height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        compositionLayer.draw(canvas, matrix, this.N0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float progress;
        float animatedValueAbsolute;
        CompositionLayer compositionLayer = this.M0;
        if (compositionLayer == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        ThreadPoolExecutor threadPoolExecutor = f25626q1;
        Semaphore semaphore = this.f25636j1;
        n1 n1Var = this.f25639m1;
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (asyncUpdatesEnabled) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                } else {
                    if ((progress > animatedValueAbsolute ? 1 : (progress == animatedValueAbsolute ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (L.isTraceEnabled()) {
                    L.endSection("Drawable#draw");
                }
                if (asyncUpdatesEnabled) {
                    semaphore.release();
                    if (compositionLayer.getProgress() != lottieValueAnimator.getAnimatedValueAbsolute()) {
                        threadPoolExecutor.execute(n1Var);
                    }
                }
            }
        }
        if (L.isTraceEnabled()) {
            L.beginSection("Drawable#draw");
        }
        if (asyncUpdatesEnabled && i()) {
            setProgress(lottieValueAnimator.getAnimatedValueAbsolute());
        }
        if (this.f25645t0) {
            try {
                if (this.T0) {
                    h(canvas, compositionLayer);
                } else {
                    d(canvas);
                }
            } catch (Throwable th2) {
                Logger.error("Lottie crashed in draw!", th2);
            }
        } else if (this.T0) {
            h(canvas, compositionLayer);
        } else {
            d(canvas);
        }
        this.f25633g1 = false;
    }

    @Nullable
    public final Context e() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z10) {
        boolean zA = this.J0.a(lottieFeatureFlag, z10);
        if (this.f25641p0 == null || !zA) {
            return;
        }
        a();
    }

    @Deprecated
    public boolean enableMergePathsForKitKatAndAbove() {
        return this.J0.f25929a.contains(LottieFeatureFlag.MergePathsApi19);
    }

    @MainThread
    public void endAnimation() {
        this.v0.clear();
        this.f25642q0.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f25646u0 = c.NONE;
    }

    public final FontAssetManager f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.E0 == null) {
            FontAssetManager fontAssetManager = new FontAssetManager(getCallback(), this.H0);
            this.E0 = fontAssetManager;
            String str = this.G0;
            if (str != null) {
                fontAssetManager.setDefaultFontFileExtension(str);
            }
        }
        return this.E0;
    }

    public final ImageAssetManager g() {
        ImageAssetManager imageAssetManager = this.f25647w0;
        if (imageAssetManager != null && !imageAssetManager.hasSameContext(e())) {
            this.f25647w0 = null;
        }
        if (this.f25647w0 == null) {
            this.f25647w0 = new ImageAssetManager(getCallback(), this.f25648x0, this.f25649y0, this.f25641p0.getImages());
        }
        return this.f25647w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.N0;
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.f25634h1;
        return asyncUpdates != null ? asyncUpdates : L.getDefaultAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return getAsyncUpdates() == AsyncUpdates.ENABLED;
    }

    @Nullable
    public Bitmap getBitmapForId(String str) {
        ImageAssetManager imageAssetManagerG = g();
        if (imageAssetManagerG != null) {
            return imageAssetManagerG.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipTextToBoundingBox() {
        return this.R0;
    }

    public boolean getClipToCompositionBounds() {
        return this.L0;
    }

    public LottieComposition getComposition() {
        return this.f25641p0;
    }

    public int getFrame() {
        return (int) this.f25642q0.getFrame();
    }

    @Nullable
    @Deprecated
    public Bitmap getImageAsset(String str) {
        ImageAssetManager imageAssetManagerG = g();
        if (imageAssetManagerG != null) {
            return imageAssetManagerG.bitmapForId(str);
        }
        LottieComposition lottieComposition = this.f25641p0;
        LottieImageAsset lottieImageAsset = lottieComposition == null ? null : lottieComposition.getImages().get(str);
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f25648x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().width();
    }

    @Nullable
    public LottieImageAsset getLottieImageAssetForId(String str) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return null;
        }
        return lottieComposition.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.K0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Marker getMarkerForAnimationsDisabled() {
        Iterator<String> it = f25625p1.iterator();
        Marker marker = null;
        while (it.hasNext()) {
            marker = this.f25641p0.getMarker(it.next());
            if (marker != null) {
                break;
            }
        }
        return marker;
    }

    public float getMaxFrame() {
        return this.f25642q0.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f25642q0.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f25642q0.getAnimatedValueAbsolute();
    }

    public RenderMode getRenderMode() {
        return this.T0 ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f25642q0.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.f25642q0.getRepeatMode();
    }

    public float getSpeed() {
        return this.f25642q0.getSpeed();
    }

    @Nullable
    public TextDelegate getTextDelegate() {
        return this.I0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface getTypeface(Font font) {
        Map<String, Typeface> map = this.F0;
        if (map != null) {
            String family = font.getFamily();
            if (map.containsKey(family)) {
                return map.get(family);
            }
            String name = font.getName();
            if (map.containsKey(name)) {
                return map.get(name);
            }
            String str = font.getFamily() + Constant.DASH_STRING + font.getStyle();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        FontAssetManager fontAssetManagerF = f();
        if (fontAssetManagerF != null) {
            return fontAssetManagerF.getTypeface(font);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e5  */
    public final void h(Canvas canvas, CompositionLayer compositionLayer) {
        if (this.f25641p0 != null) {
            if (this.W0 == null) {
                this.W0 = new Canvas();
                this.f25630d1 = new RectF();
                this.f25631e1 = new Matrix();
                this.f25632f1 = new Matrix();
                this.X0 = new Rect();
                this.Y0 = new RectF();
                this.Z0 = new LPaint();
                this.f25627a1 = new Rect();
                this.f25628b1 = new Rect();
                this.f25629c1 = new RectF();
            }
            canvas.getMatrix(this.f25631e1);
            canvas.getClipBounds(this.X0);
            Rect rect = this.X0;
            this.Y0.set(rect.left, rect.top, rect.right, rect.bottom);
            this.f25631e1.mapRect(this.Y0);
            c(this.Y0, this.X0);
            if (this.L0) {
                this.f25630d1.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                compositionLayer.getBounds(this.f25630d1, null, false);
            }
            this.f25631e1.mapRect(this.f25630d1);
            Rect bounds = getBounds();
            float fWidth = bounds.width() / getIntrinsicWidth();
            float fHeight = bounds.height() / getIntrinsicHeight();
            RectF rectF = this.f25630d1;
            rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                ViewParent parent = ((View) callback).getParent();
                if (!(parent instanceof ViewGroup) || !(!((ViewGroup) parent).getClipChildren())) {
                    RectF rectF2 = this.f25630d1;
                    Rect rect2 = this.X0;
                    rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            } else {
                RectF rectF3 = this.f25630d1;
                Rect rect3 = this.X0;
                rectF3.intersect(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            int iCeil = (int) Math.ceil(this.f25630d1.width());
            int iCeil2 = (int) Math.ceil(this.f25630d1.height());
            if (iCeil <= 0 || iCeil2 <= 0) {
                return;
            }
            Bitmap bitmap = this.V0;
            if (bitmap == null || bitmap.getWidth() < iCeil || this.V0.getHeight() < iCeil2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                this.V0 = bitmapCreateBitmap;
                this.W0.setBitmap(bitmapCreateBitmap);
                this.f25633g1 = true;
            } else if (this.V0.getWidth() > iCeil || this.V0.getHeight() > iCeil2) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.V0, 0, 0, iCeil, iCeil2);
                this.V0 = bitmapCreateBitmap2;
                this.W0.setBitmap(bitmapCreateBitmap2);
                this.f25633g1 = true;
            }
            if (this.f25633g1) {
                Matrix matrix = this.U0;
                matrix.set(this.f25631e1);
                matrix.preScale(fWidth, fHeight);
                RectF rectF4 = this.f25630d1;
                matrix.postTranslate(-rectF4.left, -rectF4.top);
                this.V0.eraseColor(0);
                compositionLayer.draw(this.W0, matrix, this.N0);
                this.f25631e1.invert(this.f25632f1);
                this.f25632f1.mapRect(this.f25629c1, this.f25630d1);
                c(this.f25629c1, this.f25628b1);
            }
            this.f25627a1.set(0, 0, iCeil, iCeil2);
            canvas.drawBitmap(this.V0, this.f25627a1, this.f25628b1, this.Z0);
        }
    }

    public boolean hasMasks() {
        CompositionLayer compositionLayer = this.M0;
        return compositionLayer != null && compositionLayer.hasMasks();
    }

    public boolean hasMatte() {
        CompositionLayer compositionLayer = this.M0;
        return compositionLayer != null && compositionLayer.hasMatte();
    }

    public final boolean i() {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            return false;
        }
        float f6 = this.f25640n1;
        float animatedValueAbsolute = this.f25642q0.getAnimatedValueAbsolute();
        this.f25640n1 = animatedValueAbsolute;
        return Math.abs(animatedValueAbsolute - f6) * lottieComposition.getDuration() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f25633g1) {
            return;
        }
        this.f25633g1 = true;
        if ((!f25624o1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.Q0;
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.J0.f25929a.contains(lottieFeatureFlag);
    }

    public boolean isLooping() {
        return this.f25642q0.getRepeatCount() == -1;
    }

    @Deprecated
    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.J0.f25929a.contains(LottieFeatureFlag.MergePathsApi19);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z10) {
        this.f25642q0.setRepeatCount(z10 ? -1 : 0);
    }

    public void pauseAnimation() {
        this.v0.clear();
        this.f25642q0.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.f25646u0 = c.NONE;
    }

    @MainThread
    public void playAnimation() {
        if (this.M0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26245a.playAnimation();
                }
            });
            return;
        }
        b();
        boolean zAnimationsEnabled = animationsEnabled(e());
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (zAnimationsEnabled || getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.playAnimation();
                this.f25646u0 = c.NONE;
            } else {
                this.f25646u0 = c.PLAY;
            }
        }
        if (animationsEnabled(e())) {
            return;
        }
        Marker markerForAnimationsDisabled = getMarkerForAnimationsDisabled();
        if (markerForAnimationsDisabled != null) {
            setFrame((int) markerForAnimationsDisabled.startFrame);
        } else {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
        lottieValueAnimator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f25646u0 = c.NONE;
    }

    public void removeAllAnimatorListeners() {
        this.f25642q0.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        lottieValueAnimator.removeAllUpdateListeners();
        lottieValueAnimator.addUpdateListener(this.f25635i1);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f25642q0.removeListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f25642q0.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25642q0.removeUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.M0 == null) {
            Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.M0.resolveKeyPath(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    @MainThread
    public void resumeAnimation() {
        if (this.M0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25911a.resumeAnimation();
                }
            });
            return;
        }
        b();
        boolean zAnimationsEnabled = animationsEnabled(e());
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (zAnimationsEnabled || getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.resumeAnimation();
                this.f25646u0 = c.NONE;
            } else {
                this.f25646u0 = c.RESUME;
            }
        }
        if (animationsEnabled(e())) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        lottieValueAnimator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.f25646u0 = c.NONE;
    }

    public void reverseAnimationSpeed() {
        this.f25642q0.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        this.N0 = i10;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setAsyncUpdates(@Nullable AsyncUpdates asyncUpdates) {
        this.f25634h1 = asyncUpdates;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        if (z10 != this.R0) {
            this.R0 = z10;
            invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        if (z10 != this.L0) {
            this.L0 = z10;
            CompositionLayer compositionLayer = this.M0;
            if (compositionLayer != null) {
                compositionLayer.setClipToCompositionBounds(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Logger.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.f25641p0 == lottieComposition) {
            return false;
        }
        this.f25633g1 = true;
        clearComposition();
        this.f25641p0 = lottieComposition;
        a();
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        lottieValueAnimator.setComposition(lottieComposition);
        setProgress(lottieValueAnimator.getAnimatedFraction());
        ArrayList<b> arrayList = this.v0;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.O0);
        b();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setDefaultFontFileExtension(String str) {
        this.G0 = str;
        FontAssetManager fontAssetManagerF = f();
        if (fontAssetManagerF != null) {
            fontAssetManagerF.setDefaultFontFileExtension(str);
        }
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.H0 = fontAssetDelegate;
        FontAssetManager fontAssetManager = this.E0;
        if (fontAssetManager != null) {
            fontAssetManager.setDelegate(fontAssetDelegate);
        }
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        if (map == this.F0) {
            return;
        }
        this.F0 = map;
        invalidateSelf();
    }

    public void setFrame(final int i10) {
        if (this.f25641p0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.x
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26246a.setFrame(i10);
                }
            });
        } else {
            this.f25642q0.setFrame(i10);
        }
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f25644s0 = z10;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f25649y0 = imageAssetDelegate;
        ImageAssetManager imageAssetManager = this.f25647w0;
        if (imageAssetManager != null) {
            imageAssetManager.setDelegate(imageAssetDelegate);
        }
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.f25648x0 = str;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.K0 = z10;
    }

    public void setMaxFrame(final int i10) {
        if (this.f25641p0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25905a.setMaxFrame(i10);
                }
            });
        } else {
            this.f25642q0.setMaxFrame(i10 + 0.99f);
        }
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f6) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26220a.setMaxProgress(f6);
                }
            });
        } else {
            this.f25642q0.setMaxFrame(MiscUtils.lerp(lottieComposition.getStartFrame(), this.f25641p0.getEndFrame(), f6));
        }
    }

    public void setMinAndMaxFrame(final String str) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26251a.setMinAndMaxFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("Cannot find marker with name ", str, Constant.DOT_STRING));
        }
        int i10 = (int) marker.startFrame;
        setMinAndMaxFrame(i10, ((int) marker.durationFrames) + i10);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f6, @FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25890a.setMinAndMaxProgress(f6, f10);
                }
            });
        } else {
            setMinAndMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.f25641p0.getEndFrame(), f6), (int) MiscUtils.lerp(this.f25641p0.getStartFrame(), this.f25641p0.getEndFrame(), f10));
        }
    }

    public void setMinFrame(final int i10) {
        if (this.f25641p0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25895a.setMinFrame(i10);
                }
            });
        } else {
            this.f25642q0.setMinFrame(i10);
        }
    }

    public void setMinProgress(final float f6) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.d0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25900a.setMinProgress(f6);
                }
            });
        } else {
            setMinFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.f25641p0.getEndFrame(), f6));
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        if (this.P0 == z10) {
            return;
        }
        this.P0 = z10;
        CompositionLayer compositionLayer = this.M0;
        if (compositionLayer != null) {
            compositionLayer.setOutlineMasksAndMattes(z10);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.O0 = z10;
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z10);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f6) {
        if (this.f25641p0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25675a.setProgress(f6);
                }
            });
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("Drawable#setProgress");
        }
        this.f25642q0.setFrame(this.f25641p0.getFrameForProgress(f6));
        if (L.isTraceEnabled()) {
            L.endSection("Drawable#setProgress");
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.S0 = renderMode;
        b();
    }

    public void setRepeatCount(int i10) {
        this.f25642q0.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f25642q0.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f25645t0 = z10;
    }

    public void setSpeed(float f6) {
        this.f25642q0.setSpeed(f6);
    }

    @Deprecated
    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.f25643r0 = bool.booleanValue();
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.I0 = textDelegate;
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f25642q0.setUseCompositionFrameRate(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            c cVar = this.f25646u0;
            if (cVar == c.PLAY) {
                playAnimation();
            } else if (cVar == c.RESUME) {
                resumeAnimation();
            }
        } else if (this.f25642q0.isRunning()) {
            pauseAnimation();
            this.f25646u0 = c.RESUME;
        } else if (!z12) {
            this.f25646u0 = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        ImageAssetManager imageAssetManagerG = g();
        if (imageAssetManagerG == null) {
            Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapUpdateBitmap = imageAssetManagerG.updateBitmap(str, bitmap);
        invalidateSelf();
        return bitmapUpdateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.F0 == null && this.I0 == null && this.f25641p0.getCharacters().size() > 0;
    }

    @Deprecated
    public void enableMergePathsForKitKatAndAbove(boolean z10) {
        boolean zA = this.J0.a(LottieFeatureFlag.MergePathsApi19, z10);
        if (this.f25641p0 == null || !zA) {
            return;
        }
        a();
    }

    public void setMaxFrame(final String str) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25914a.setMaxFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("Cannot find marker with name ", str, Constant.DOT_STRING));
    }

    public void setMinFrame(final String str) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f25924a.setMinFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("Cannot find marker with name ", str, Constant.DOT_STRING));
    }

    public <T> void addValueCallback(KeyPath keyPath, T t10, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, t10, new a(simpleLottieValueCallback));
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z10) {
        LottieComposition lottieComposition = this.f25641p0;
        if (lottieComposition == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z11 = LottieDrawable.f25624o1;
                    this.f25918a.setMinAndMaxFrame(str, str2, z10);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i10 = (int) marker.startFrame;
            Marker marker2 = this.f25641p0.getMarker(str2);
            if (marker2 != null) {
                setMinAndMaxFrame(i10, (int) (marker2.startFrame + (z10 ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("Cannot find marker with name ", str2, Constant.DOT_STRING));
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.h0.b("Cannot find marker with name ", str, Constant.DOT_STRING));
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void draw(Canvas canvas, Matrix matrix) {
        float progress;
        float animatedValueAbsolute;
        CompositionLayer compositionLayer = this.M0;
        LottieComposition lottieComposition = this.f25641p0;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        ThreadPoolExecutor threadPoolExecutor = f25626q1;
        Semaphore semaphore = this.f25636j1;
        n1 n1Var = this.f25639m1;
        LottieValueAnimator lottieValueAnimator = this.f25642q0;
        if (asyncUpdatesEnabled) {
            try {
                semaphore.acquire();
                if (i()) {
                    setProgress(lottieValueAnimator.getAnimatedValueAbsolute());
                }
            } catch (InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                } else {
                    if ((progress > animatedValueAbsolute ? 1 : (progress == animatedValueAbsolute ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (asyncUpdatesEnabled) {
                    semaphore.release();
                    if (compositionLayer.getProgress() != lottieValueAnimator.getAnimatedValueAbsolute()) {
                        threadPoolExecutor.execute(n1Var);
                    }
                }
            }
        }
        if (this.T0) {
            canvas.save();
            canvas.concat(matrix);
            h(canvas, compositionLayer);
            canvas.restore();
        } else {
            compositionLayer.draw(canvas, matrix, this.N0);
        }
        this.f25633g1 = false;
    }

    public void setMinAndMaxFrame(final int i10, final int i11) {
        if (this.f25641p0 == null) {
            this.v0.add(new b() { // from class: com.airbnb.lottie.y
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void run() {
                    boolean z10 = LottieDrawable.f25624o1;
                    this.f26248a.setMinAndMaxFrame(i10, i11);
                }
            });
        } else {
            this.f25642q0.setMinAndMaxFrames(i10, i11 + 0.99f);
        }
    }
}
