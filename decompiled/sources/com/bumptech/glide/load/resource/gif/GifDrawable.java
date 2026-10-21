package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.FrameCallback, Animatable, Animatable2Compat {
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    public ArrayList E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a f38646p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f38647q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f38648r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f38649s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f38650t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f38651u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f38652w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Paint f38653x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Rect f38654y0;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @VisibleForTesting
        public final GifFrameLoader f38655a;

        public a(GifFrameLoader gifFrameLoader) {
            this.f38655a = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    @Deprecated
    public GifDrawable(Context context, GifDecoder gifDecoder, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i10, int i11, Bitmap bitmap) {
        this(context, gifDecoder, transformation, i10, i11, bitmap);
    }

    public final void a() {
        Preconditions.checkArgument(!this.f38649s0, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        a aVar = this.f38646p0;
        if (aVar.f38655a.f38657a.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f38647q0) {
            return;
        }
        this.f38647q0 = true;
        GifFrameLoader gifFrameLoader = aVar.f38655a;
        if (gifFrameLoader.f38667k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gifFrameLoader.f38659c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gifFrameLoader.f38662f) {
            gifFrameLoader.f38662f = true;
            gifFrameLoader.f38667k = false;
            gifFrameLoader.a();
        }
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f38649s0) {
            return;
        }
        if (this.f38652w0) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f38654y0 == null) {
                this.f38654y0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f38654y0);
            this.f38652w0 = false;
        }
        GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
        GifFrameLoader.a aVar = gifFrameLoader.f38666j;
        Bitmap bitmap = aVar != null ? aVar.f38677s0 : gifFrameLoader.m;
        if (this.f38654y0 == null) {
            this.f38654y0 = new Rect();
        }
        Rect rect = this.f38654y0;
        if (this.f38653x0 == null) {
            this.f38653x0 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f38653x0);
    }

    public ByteBuffer getBuffer() {
        return this.f38646p0.f38655a.f38657a.getData().asReadOnlyBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38646p0;
    }

    public Bitmap getFirstFrame() {
        return this.f38646p0.f38655a.m;
    }

    public int getFrameCount() {
        return this.f38646p0.f38655a.f38657a.getFrameCount();
    }

    public int getFrameIndex() {
        GifFrameLoader.a aVar = this.f38646p0.f38655a.f38666j;
        if (aVar != null) {
            return aVar.f38675q0;
        }
        return -1;
    }

    public Transformation<Bitmap> getFrameTransformation() {
        return this.f38646p0.f38655a.f38669n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f38646p0.f38655a.f38673r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f38646p0.f38655a.f38672q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
        return gifFrameLoader.f38657a.getByteSize() + gifFrameLoader.f38671p;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f38647q0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38652w0 = true;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public void onFrameReady() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.f38651u0++;
        }
        int i10 = this.v0;
        if (i10 == -1 || this.f38651u0 < i10) {
            return;
        }
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((Animatable2Compat.AnimationCallback) this.E0.get(i11)).onAnimationEnd(this);
            }
        }
        stop();
    }

    public void recycle() {
        this.f38649s0 = true;
        GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
        gifFrameLoader.f38659c.clear();
        Bitmap bitmap = gifFrameLoader.m;
        if (bitmap != null) {
            gifFrameLoader.f38661e.put(bitmap);
            gifFrameLoader.m = null;
        }
        gifFrameLoader.f38662f = false;
        GifFrameLoader.a aVar = gifFrameLoader.f38666j;
        RequestManager requestManager = gifFrameLoader.f38660d;
        if (aVar != null) {
            requestManager.clear(aVar);
            gifFrameLoader.f38666j = null;
        }
        GifFrameLoader.a aVar2 = gifFrameLoader.f38668l;
        if (aVar2 != null) {
            requestManager.clear(aVar2);
            gifFrameLoader.f38668l = null;
        }
        GifFrameLoader.a aVar3 = gifFrameLoader.f38670o;
        if (aVar3 != null) {
            requestManager.clear(aVar3);
            gifFrameLoader.f38670o = null;
        }
        gifFrameLoader.f38657a.clear();
        gifFrameLoader.f38667k = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.E0 == null) {
            this.E0 = new ArrayList();
        }
        this.E0.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f38653x0 == null) {
            this.f38653x0 = new Paint(2);
        }
        this.f38653x0.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f38653x0 == null) {
            this.f38653x0 = new Paint(2);
        }
        this.f38653x0.setColorFilter(colorFilter);
    }

    public void setFrameTransformation(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.f38646p0.f38655a.c(transformation, bitmap);
    }

    public void setLoopCount(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.v0 = i10;
        } else {
            int totalIterationCount = this.f38646p0.f38655a.f38657a.getTotalIterationCount();
            this.v0 = totalIterationCount != 0 ? totalIterationCount : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Preconditions.checkArgument(!this.f38649s0, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f38650t0 = z10;
        if (!z10) {
            this.f38647q0 = false;
            GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
            ArrayList arrayList = gifFrameLoader.f38659c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gifFrameLoader.f38662f = false;
            }
        } else if (this.f38648r0) {
            a();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f38648r0 = true;
        this.f38651u0 = 0;
        if (this.f38650t0) {
            a();
        }
    }

    public void startFromFirstFrame() {
        Preconditions.checkArgument(!this.f38647q0, "You cannot restart a currently running animation.");
        GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
        Preconditions.checkArgument(!gifFrameLoader.f38662f, "Can't restart a running animation");
        gifFrameLoader.f38664h = true;
        GifFrameLoader.a aVar = gifFrameLoader.f38670o;
        if (aVar != null) {
            gifFrameLoader.f38660d.clear(aVar);
            gifFrameLoader.f38670o = null;
        }
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f38648r0 = false;
        this.f38647q0 = false;
        GifFrameLoader gifFrameLoader = this.f38646p0.f38655a;
        ArrayList arrayList = gifFrameLoader.f38659c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gifFrameLoader.f38662f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.E0;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        return arrayList.remove(animationCallback);
    }

    public GifDrawable(Context context, GifDecoder gifDecoder, Transformation<Bitmap> transformation, int i10, int i11, Bitmap bitmap) {
        this(new a(new GifFrameLoader(Glide.get(context), gifDecoder, i10, i11, transformation, bitmap)));
    }

    public GifDrawable(a aVar) {
        this.f38650t0 = true;
        this.v0 = -1;
        this.f38646p0 = (a) Preconditions.checkNotNull(aVar);
    }
}
