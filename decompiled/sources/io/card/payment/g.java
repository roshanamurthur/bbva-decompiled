package io.card.payment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: OverlayView.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends View {
    public static final GradientDrawable.Orientation[] P0 = {GradientDrawable.Orientation.TOP_BOTTOM, GradientDrawable.Orientation.LEFT_RIGHT, GradientDrawable.Orientation.BOTTOM_TOP, GradientDrawable.Orientation.RIGHT_LEFT};
    public final Paint E0;
    public final Paint F0;
    public Path G0;
    public Rect H0;
    public final i I0;
    public final e J0;
    public Rect K0;
    public Rect L0;
    public final boolean M0;
    public int N0;
    public final float O0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WeakReference<CardIOActivity> f69780p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DetectionInfo f69781q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Bitmap f69782r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Rect f69783s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CreditCard f69784t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f69785u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f69786w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f69787x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public GradientDrawable f69788y0;

    public g(CardIOActivity cardIOActivity, boolean z10) {
        super(cardIOActivity, null);
        this.O0 = 1.0f;
        this.M0 = z10;
        this.f69780p0 = new WeakReference<>(cardIOActivity);
        this.N0 = 1;
        float f6 = getResources().getDisplayMetrics().density / 1.5f;
        this.O0 = f6;
        i iVar = new i();
        iVar.f69792a = false;
        iVar.f69793b = 70.0f * f6;
        iVar.f69794c = f6 * 50.0f;
        this.I0 = iVar;
        this.J0 = new e(cardIOActivity);
        this.E0 = new Paint(1);
        Paint paint = new Paint(1);
        this.F0 = paint;
        paint.clearShadowLayer();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1157627904);
        this.f69787x0 = LocalizedStrings.getString(StringKey.SCAN_GUIDE);
    }

    public final Rect a(int i10, int i11, int i12, int i13) {
        int i14 = (int) (this.O0 * 8.0f);
        Rect rect = new Rect();
        rect.left = Math.min(i10, i12) - i14;
        rect.right = Math.max(i10, i12) + i14;
        rect.top = Math.min(i11, i13) - i14;
        rect.bottom = Math.max(i11, i13) + i14;
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.f69783s0 == null || this.H0 == null) {
            return;
        }
        canvas.save();
        this.f69788y0.draw(canvas);
        int i11 = this.f69785u0;
        if (i11 == 0 || i11 == 180) {
            Rect rect = this.f69783s0;
            i10 = (rect.bottom - rect.top) / 4;
        } else {
            Rect rect2 = this.f69783s0;
            i10 = (rect2.right - rect2.left) / 4;
        }
        DetectionInfo detectionInfo = this.f69781q0;
        if (detectionInfo != null) {
            if ((detectionInfo.topEdge ? 1 : 0) + (detectionInfo.bottomEdge ? 1 : 0) + (detectionInfo.leftEdge ? 1 : 0) + (detectionInfo.rightEdge ? 1 : 0) == 4) {
                canvas.drawPath(this.G0, this.F0);
            }
        }
        Paint paint = this.E0;
        paint.clearShadowLayer();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.v0);
        Rect rect3 = this.f69783s0;
        int i12 = rect3.left;
        int i13 = rect3.top;
        canvas.drawRect(a(i12, i13, i12 + i10, i13), paint);
        Rect rect4 = this.f69783s0;
        int i14 = rect4.left;
        int i15 = rect4.top;
        canvas.drawRect(a(i14, i15, i14, i15 + i10), paint);
        Rect rect5 = this.f69783s0;
        int i16 = rect5.right;
        int i17 = rect5.top;
        canvas.drawRect(a(i16, i17, i16 - i10, i17), paint);
        Rect rect6 = this.f69783s0;
        int i18 = rect6.right;
        int i19 = rect6.top;
        canvas.drawRect(a(i18, i19, i18, i19 + i10), paint);
        Rect rect7 = this.f69783s0;
        int i20 = rect7.left;
        int i21 = rect7.bottom;
        canvas.drawRect(a(i20, i21, i20 + i10, i21), paint);
        Rect rect8 = this.f69783s0;
        int i22 = rect8.left;
        int i23 = rect8.bottom;
        canvas.drawRect(a(i22, i23, i22, i23 - i10), paint);
        Rect rect9 = this.f69783s0;
        int i24 = rect9.right;
        int i25 = rect9.bottom;
        canvas.drawRect(a(i24, i25, i24 - i10, i25), paint);
        Rect rect10 = this.f69783s0;
        int i26 = rect10.right;
        int i27 = rect10.bottom;
        canvas.drawRect(a(i26, i27, i26, i27 - i10), paint);
        DetectionInfo detectionInfo2 = this.f69781q0;
        float f6 = this.O0;
        if (detectionInfo2 != null) {
            if (detectionInfo2.topEdge) {
                Rect rect11 = this.f69783s0;
                int i28 = rect11.left;
                int i29 = rect11.top;
                canvas.drawRect(a(i28, i29, rect11.right, i29), paint);
            }
            if (this.f69781q0.bottomEdge) {
                Rect rect12 = this.f69783s0;
                int i30 = rect12.left;
                int i31 = rect12.bottom;
                canvas.drawRect(a(i30, i31, rect12.right, i31), paint);
            }
            if (this.f69781q0.leftEdge) {
                Rect rect13 = this.f69783s0;
                int i32 = rect13.left;
                canvas.drawRect(a(i32, rect13.top, i32, rect13.bottom), paint);
            }
            if (this.f69781q0.rightEdge) {
                Rect rect14 = this.f69783s0;
                int i33 = rect14.right;
                canvas.drawRect(a(i33, rect14.top, i33, rect14.bottom), paint);
            }
            DetectionInfo detectionInfo3 = this.f69781q0;
            if ((detectionInfo3.topEdge ? 1 : 0) + (detectionInfo3.bottomEdge ? 1 : 0) + (detectionInfo3.leftEdge ? 1 : 0) + (detectionInfo3.rightEdge ? 1 : 0) < 3) {
                float f10 = 34.0f * f6;
                float f11 = 26.0f * f6;
                j.c(paint);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(f11);
                Rect rect15 = this.f69783s0;
                float fWidth = (rect15.width() / 2) + rect15.left;
                Rect rect16 = this.f69783s0;
                canvas.translate(fWidth, (rect16.height() / 2) + rect16.top);
                canvas.rotate(this.N0 * this.f69785u0);
                String str = this.f69787x0;
                if (str != null && str != "") {
                    String[] strArrSplit = str.split(RootService.LINE_BREAK);
                    float f12 = (-((((strArrSplit.length - 1) * f10) - f11) / 2.0f)) - 3.0f;
                    for (String str2 : strArrSplit) {
                        canvas.drawText(str2, 0.0f, f12, paint);
                        f12 += f10;
                    }
                }
            }
        }
        canvas.restore();
        if (!this.f69786w0) {
            canvas.save();
            canvas.translate(this.L0.exactCenterX(), this.L0.exactCenterY());
            canvas.rotate(this.N0 * this.f69785u0);
            float f13 = 100.0f * f6;
            float f14 = f6 * 50.0f;
            e eVar = this.J0;
            if (eVar.f69775b == null) {
                eVar.a(false);
            }
            canvas.save();
            float height = eVar.f69775b.getHeight() / eVar.f69775b.getWidth();
            if (f14 / f13 < height) {
                f13 = f14 / height;
            } else {
                f14 = f13 * height;
            }
            float f15 = f13 / 2.0f;
            float f16 = f14 / 2.0f;
            canvas.drawBitmap(eVar.f69775b, new Rect(0, 0, eVar.f69775b.getWidth(), eVar.f69775b.getHeight()), new RectF(-f15, -f16, f15, f16), eVar.f69774a);
            canvas.restore();
            canvas.restore();
        }
        if (this.M0) {
            canvas.save();
            canvas.translate(this.K0.exactCenterX(), this.K0.exactCenterY());
            canvas.rotate(this.N0 * this.f69785u0);
            i iVar = this.I0;
            iVar.getClass();
            canvas.save();
            float f17 = iVar.f69793b;
            float f18 = iVar.f69794c;
            canvas.translate((-f17) / 2.0f, (-f18) / 2.0f);
            Paint paint2 = new Paint();
            paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(1.5f);
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(-1);
            if (iVar.f69792a) {
                paint3.setAlpha(192);
            } else {
                paint3.setAlpha(96);
            }
            float[] fArr = new float[8];
            Arrays.fill(fArr, 5.0f);
            RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
            roundRectShape.resize(f17, f18);
            roundRectShape.draw(canvas, paint3);
            roundRectShape.draw(canvas, paint2);
            Paint paint4 = new Paint();
            paint4.setStyle(Paint.Style.FILL_AND_STROKE);
            paint4.setAntiAlias(true);
            if (iVar.f69792a) {
                paint4.setColor(-1);
            } else {
                paint4.setColor(ViewCompat.MEASURED_STATE_MASK);
            }
            Path path = new Path();
            path.moveTo(10.0f, 0.0f);
            path.lineTo(0.0f, 11.0f);
            path.lineTo(6.0f, 11.0f);
            path.lineTo(2.0f, 20.0f);
            path.lineTo(13.0f, 8.0f);
            path.lineTo(7.0f, 8.0f);
            path.lineTo(10.0f, 0.0f);
            path.setLastPoint(10.0f, 0.0f);
            Matrix matrix = new Matrix();
            matrix.postTranslate(-6.5f, -10.0f);
            matrix.postScale(0.05f, 0.05f);
            path.transform(matrix);
            Matrix matrix2 = new Matrix();
            float f19 = 0.8f * f18;
            matrix2.postScale(f19, f19);
            path.transform(matrix2);
            canvas.translate(f17 / 2.0f, f18 / 2.0f);
            canvas.drawPath(path, paint4);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        try {
            if ((motionEvent.getAction() & 255) == 0) {
                Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                Rect rectB = j.b(point, 20, 20);
                point.toString();
                boolean z10 = this.M0;
                WeakReference<CardIOActivity> weakReference = this.f69780p0;
                if (z10 && (rect = this.K0) != null && Rect.intersects(rect, rectB)) {
                    CardIOActivity cardIOActivity = weakReference.get();
                    cardIOActivity.e(!cardIOActivity.I0.f69752y0.getParameters().getFlashMode().equals("torch"));
                } else {
                    Rect rect2 = this.L0;
                    if (rect2 == null || !Rect.intersects(rect2, rectB)) {
                        weakReference.get().I0.j(true);
                    }
                }
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public void setBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.f69782r0;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f69782r0 = bitmap;
        if (bitmap != null) {
            RectF rectF = new RectF(2.0f, 2.0f, this.f69782r0.getWidth() - 2, this.f69782r0.getHeight() - 2);
            float height = this.f69782r0.getHeight() * 0.06666667f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f69782r0.getWidth(), this.f69782r0.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0);
            Paint paint = new Paint(1);
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRoundRect(rectF, height, height, paint);
            Paint paint2 = new Paint();
            paint2.setFilterBitmap(false);
            Canvas canvas2 = new Canvas(this.f69782r0);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
            paint2.setXfermode(null);
            bitmapCreateBitmap.recycle();
        }
    }

    public void setCameraPreviewRect(Rect rect) {
        this.H0 = rect;
    }

    public void setDetectedCard(CreditCard creditCard) {
        this.f69784t0 = creditCard;
    }

    public void setDetectionInfo(DetectionInfo detectionInfo) {
        DetectionInfo detectionInfo2 = this.f69781q0;
        if (detectionInfo2 != null) {
            detectionInfo2.getClass();
            if (detectionInfo.topEdge != detectionInfo2.topEdge || detectionInfo.bottomEdge != detectionInfo2.bottomEdge || detectionInfo.leftEdge != detectionInfo2.leftEdge || detectionInfo.rightEdge != detectionInfo2.rightEdge) {
                invalidate();
            }
        }
        this.f69781q0 = detectionInfo;
    }

    public void setGuideAndRotation(Rect rect, int i10) {
        Point point;
        Objects.toString(rect);
        this.f69785u0 = i10;
        this.f69783s0 = rect;
        invalidate();
        int i11 = this.f69785u0 % 180;
        float f6 = this.O0;
        if (i11 != 0) {
            point = new Point((int) (40.0f * f6), (int) (60.0f * f6));
            this.N0 = -1;
        } else {
            point = new Point((int) (60.0f * f6), (int) (40.0f * f6));
            this.N0 = 1;
        }
        Rect rect2 = this.H0;
        if (rect2 != null) {
            Objects.toString(rect2);
            point.toString();
            Objects.toString(this.H0);
            point.toString();
            Rect rect3 = this.H0;
            this.K0 = j.b(new Point(rect3.left + point.x, rect3.top + point.y), (int) (70.0f * f6), (int) (f6 * 50.0f));
            Rect rect4 = this.H0;
            this.L0 = j.b(new Point(rect4.right - point.x, rect4.top + point.y), (int) (100.0f * f6), (int) (f6 * 50.0f));
            GradientDrawable gradientDrawable = new GradientDrawable(P0[(this.f69785u0 / 90) % 4], new int[]{-1, ViewCompat.MEASURED_STATE_MASK});
            this.f69788y0 = gradientDrawable;
            gradientDrawable.setGradientType(0);
            this.f69788y0.setBounds(this.f69783s0);
            this.f69788y0.setAlpha(50);
            Path path = new Path();
            this.G0 = path;
            path.addRect(new RectF(this.H0), Path.Direction.CW);
            this.G0.addRect(new RectF(this.f69783s0), Path.Direction.CCW);
        }
    }

    public void setGuideColor(int i10) {
        this.v0 = i10;
    }

    public void setHideCardIOLogo(boolean z10) {
        this.f69786w0 = z10;
    }

    public void setScanInstructions(String str) {
        this.f69787x0 = str;
    }

    public void setTorchOn(boolean z10) {
        this.I0.f69792a = z10;
        invalidate();
    }

    public void setUseCardIOLogo(boolean z10) {
        this.J0.a(z10);
    }
}
