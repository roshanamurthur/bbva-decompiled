package com.bbva.qr.scanner.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.bbva.qr.R;
import com.bbva.qr.extension.ContextKt;
import com.bbva.qr.model.input.AspectRatio;
import com.bbva.qr.model.input.BarcodeType;
import com.bbva.qr.model.input.OverlayConfig;
import com.bbva.qr.scanner.camera.Facing;
import com.bbva.qr.scanner.views.GraphicOverlay.Graphic;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* JADX INFO: loaded from: classes8.dex */
public class GraphicOverlay<T extends Graphic> extends View {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f36331s0 = 0;
    protected Paint mBitmapPaint;
    protected AspectRatio mDefaultAspectRatio;
    protected String mDefaultBackgroundColor;
    protected String mDefaultBorderColor;
    protected Integer mDefaultBorderWidth;
    protected Boolean mDefaultFrameVisible;
    protected Boolean mDefaultImageVisible;
    protected Integer mDefaultMargin;
    protected Boolean mDefaultOnlyCorners;
    protected int mFacing;
    protected Paint mGradientPaint;
    protected Set<T> mGraphics;
    protected float mHeightScaleFactor;
    protected final Object mLock;
    protected Paint mPaint;
    protected Path mPath;
    protected int mPreviewHeight;
    protected int mPreviewWidth;
    protected Paint mSemiBlackPaint;
    protected Paint mTransparentPaint;
    protected float mWidthScaleFactor;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Drawable f36332p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Bitmap f36333q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f36334r0;

    public static abstract class Graphic {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GraphicOverlay f36335a;

        public Graphic(GraphicOverlay graphicOverlay) {
            this.f36335a = graphicOverlay;
        }

        public abstract void draw(Canvas canvas);

        public void postInvalidate() {
            this.f36335a.postInvalidate();
        }

        public float translateX(float f6) {
            GraphicOverlay graphicOverlay = this.f36335a;
            return graphicOverlay.mFacing == Facing.FRONT.getValue() ? graphicOverlay.getWidth() - (f6 * this.f36335a.mWidthScaleFactor) : f6 * this.f36335a.mWidthScaleFactor;
        }

        public float translateY(float f6) {
            return f6 * this.f36335a.mHeightScaleFactor;
        }
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLock = new Object();
        this.mWidthScaleFactor = 1.0f;
        this.mHeightScaleFactor = 1.0f;
        this.mFacing = Facing.BACK.getValue();
        this.mGraphics = new HashSet();
        this.mPath = new Path();
        this.mPaint = new Paint();
        this.mDefaultBorderColor = "#CC004283";
        this.mDefaultBackgroundColor = "#A6000000";
        this.mDefaultBorderWidth = 20;
        this.mDefaultMargin = 25;
        this.mDefaultOnlyCorners = Boolean.FALSE;
        this.mDefaultAspectRatio = AspectRatio.SQUARE;
        Boolean bool = Boolean.TRUE;
        this.mDefaultFrameVisible = bool;
        this.mDefaultImageVisible = bool;
    }

    public void add(T t10) {
        synchronized (this.mLock) {
            this.mGraphics.add(t10);
        }
        postInvalidate();
    }

    public void applyOverlayConfig(OverlayConfig overlayConfig) {
        synchronized (this.mLock) {
            try {
                if (overlayConfig.getCaptureFrameColor() != null) {
                    this.mDefaultBorderColor = overlayConfig.getCaptureFrameColor();
                }
                if (overlayConfig.getBackgroundColor() != null) {
                    this.mDefaultBackgroundColor = overlayConfig.getBackgroundColor();
                }
                if (overlayConfig.getBorderWidth() != null) {
                    this.mDefaultBorderWidth = overlayConfig.getBorderWidth();
                }
                if (overlayConfig.getOnlyCorners() != null) {
                    this.mDefaultOnlyCorners = overlayConfig.getOnlyCorners();
                }
                if (overlayConfig.getAspectRatio() != null) {
                    this.mDefaultAspectRatio = overlayConfig.getAspectRatio();
                }
                if (overlayConfig.isFrameVisible() != null) {
                    this.mDefaultFrameVisible = overlayConfig.isFrameVisible();
                }
                if (overlayConfig.isImageVisible() != null) {
                    this.mDefaultImageVisible = overlayConfig.isImageVisible();
                }
                if (overlayConfig.getAspectRatio() == AspectRatio.RECTANGLE_LANDSCAPE) {
                    this.mDefaultMargin = 150;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        postInvalidate();
    }

    public void clear() {
        synchronized (this.mLock) {
            this.mGraphics.clear();
        }
        postInvalidate();
    }

    public void drawFocusFrameQRCode(Canvas canvas) {
        int iDpToPx = ContextKt.dpToPx(getContext(), this.mDefaultMargin.intValue());
        int iCeil = (int) Math.ceil(getRight() - iDpToPx);
        int i10 = iCeil - iDpToPx;
        if (!"SQUARE".equalsIgnoreCase(this.mDefaultAspectRatio.name())) {
            i10 = (int) (i10 * 0.6f);
        }
        int iCeil2 = (int) Math.ceil((getBottom() - i10) >> 1);
        int iCeil3 = (int) Math.ceil(getBottom() - iCeil2);
        this.mPath.reset();
        float f6 = iDpToPx;
        float f10 = iCeil2;
        float f11 = iCeil;
        float f12 = iCeil3;
        this.mPath.addRect(f6, f10, f11, f12, Path.Direction.CW);
        this.mPath.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawRect(f6, f10, f11, f12, this.mTransparentPaint);
        canvas.save();
        this.mSemiBlackPaint.setLinearText(true);
        try {
            canvas.drawPath(this.mPath, this.mSemiBlackPaint);
            canvas.clipPath(this.mPath);
            canvas.drawColor(Color.parseColor(this.mDefaultBackgroundColor));
        } catch (UnsupportedOperationException e5) {
            e5.fillInStackTrace();
        }
        if (this.mDefaultFrameVisible.booleanValue()) {
            int iIntValue = this.mDefaultBorderWidth.intValue();
            this.mPaint.setColor(Color.parseColor(this.mDefaultBorderColor));
            this.mPaint.setStrokeWidth(20.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setLinearText(true);
            if (this.mDefaultOnlyCorners.booleanValue()) {
                Path path = new Path();
                float f13 = iCeil2 + iIntValue;
                path.moveTo(f6, f13);
                path.lineTo(f6, f10);
                float f14 = iDpToPx + iIntValue;
                path.lineTo(f14, f10);
                float f15 = iCeil - iIntValue;
                path.moveTo(f15, f10);
                path.lineTo(f11, f10);
                path.lineTo(f11, f13);
                float f16 = iCeil3 - iIntValue;
                path.moveTo(f6, f16);
                path.lineTo(f6, f12);
                path.lineTo(f14, f12);
                path.moveTo(f15, f12);
                path.lineTo(f11, f12);
                path.lineTo(f11, f16);
                canvas.drawPath(path, this.mPaint);
            } else {
                canvas.drawRect(f6, f10, f11, f12, this.mPaint);
            }
        }
        if (!this.mDefaultImageVisible.booleanValue() || this.f36333q0 == null) {
            return;
        }
        canvas.restore();
        this.mBitmapPaint.setAlpha(200);
        int width = (this.f36333q0.getWidth() / 2) - 60;
        int height = (this.f36333q0.getHeight() / 2) - 60;
        int width2 = (canvas.getWidth() - width) / 2;
        int i11 = width + width2;
        int iA = androidx.appcompat.widget.a.a(iCeil3 - iCeil2, height, 2, iCeil2);
        Rect rect = new Rect(0, 0, this.f36333q0.getWidth(), this.f36333q0.getHeight());
        Rect rect2 = new Rect(width2, iA, i11, height + iA);
        canvas.drawBitmap(this.f36333q0, rect, rect2, this.mBitmapPaint);
        float f17 = this.f36334r0;
        this.mGradientPaint.setShader(new LinearGradient(width2, 0.0f, i11, 0.0f, new int[]{1308622847, -1, 1308622847}, new float[]{0.0f + f17, 0.1f + f17, f17 + 0.2f}, Shader.TileMode.REPEAT));
        this.mGradientPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(rect2, this.mGradientPaint);
    }

    public List<T> getGraphics() {
        Vector vector;
        synchronized (this.mLock) {
            vector = new Vector(this.mGraphics);
        }
        return vector;
    }

    public float getHeightScaleFactor() {
        return this.mHeightScaleFactor;
    }

    public float getWidthScaleFactor() {
        return this.mWidthScaleFactor;
    }

    public void initPaints(BarcodeType barcodeType) {
        Paint paint = new Paint();
        this.mTransparentPaint = paint;
        paint.setColor(0);
        this.mTransparentPaint.setStrokeWidth(10.0f);
        Paint paint2 = new Paint();
        this.mSemiBlackPaint = paint2;
        paint2.setColor(0);
        this.mSemiBlackPaint.setStrokeWidth(10.0f);
        this.mBitmapPaint = new Paint();
        this.mGradientPaint = new Paint();
        if ("QR".equals(barcodeType.name())) {
            this.f36332p0 = ContextCompat.getDrawable(getContext(), R.drawable.qrcode);
        } else {
            this.f36332p0 = ContextCompat.getDrawable(getContext(), R.drawable.barcode);
        }
        this.f36333q0 = ((BitmapDrawable) this.f36332p0).getBitmap();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-0.3f, 1.2f);
        valueAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        valueAnimatorOfFloat.setDuration(1200L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawFocusFrameQRCode(canvas);
        synchronized (this.mLock) {
            try {
                if (this.mPreviewWidth != 0 && this.mPreviewHeight != 0) {
                    this.mWidthScaleFactor = canvas.getWidth() / this.mPreviewWidth;
                    this.mHeightScaleFactor = canvas.getHeight() / this.mPreviewHeight;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(T t10) {
        synchronized (this.mLock) {
            this.mGraphics.remove(t10);
        }
        postInvalidate();
    }

    public void setCameraInfo(int i10, int i11, int i12) {
        synchronized (this.mLock) {
            this.mPreviewWidth = i10;
            this.mPreviewHeight = i11;
            this.mFacing = i12;
        }
        postInvalidate();
    }
}
