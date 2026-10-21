package pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ViewFinderView.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends View {
    public boolean E0;
    public boolean F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f92624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f92625q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Path f92626r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f92627s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f92628t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f92629u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f92630w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f92631x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f92632y0;

    public e(@NonNull Context context) {
        super(context);
        this.f92628t0 = 0;
        this.f92629u0 = 0;
        this.v0 = 1.0f;
        this.f92630w0 = 1.0f;
        this.f92631x0 = 0.75f;
        this.f92632y0 = 0.5f;
        this.E0 = true;
        this.F0 = true;
        Paint paint = new Paint(1);
        this.f92624p0 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f92625q0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f92626r0 = path;
    }

    public final void a(int i10, int i11) {
        int iRound;
        int iRound2;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        float f6 = i10;
        float f10 = i11;
        float f11 = f6 / f10;
        float f12 = this.v0 / this.f92630w0;
        float f13 = this.f92631x0;
        if (f11 <= f12) {
            iRound2 = Math.round(f6 * f13);
            iRound = Math.round(iRound2 / f12);
        } else {
            iRound = Math.round(f10 * f13);
            iRound2 = Math.round(iRound * f12);
        }
        int i12 = (i10 - iRound2) / 2;
        int iRound3 = Math.round((i11 - iRound) * this.f92632y0);
        this.f92627s0 = new d(i12, iRound3, iRound2 + i12, iRound + iRound3);
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        d dVar = this.f92627s0;
        if (dVar == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f6 = dVar.f92621b;
        float f10 = dVar.f92620a;
        float f11 = dVar.f92622c;
        float f12 = dVar.f92623d;
        float f13 = this.f92628t0;
        float f14 = this.f92629u0;
        boolean z10 = this.E0;
        boolean z11 = this.F0;
        Path path = this.f92626r0;
        Paint paint = this.f92625q0;
        Paint paint2 = this.f92624p0;
        if (f14 <= 0.0f) {
            if (z10) {
                path.reset();
                path.moveTo(f10, f6);
                path.lineTo(f11, f6);
                path.lineTo(f11, f12);
                path.lineTo(f10, f12);
                path.lineTo(f10, f6);
                path.moveTo(0.0f, 0.0f);
                float f15 = width;
                path.lineTo(f15, 0.0f);
                float f16 = height;
                path.lineTo(f15, f16);
                path.lineTo(0.0f, f16);
                path.lineTo(0.0f, 0.0f);
                canvas.drawPath(path, paint2);
            }
            if (z11) {
                path.reset();
                float f17 = f6 + f13;
                path.moveTo(f10, f17);
                path.lineTo(f10, f6);
                float f18 = f10 + f13;
                path.lineTo(f18, f6);
                float f19 = f11 - f13;
                path.moveTo(f19, f6);
                path.lineTo(f11, f6);
                path.lineTo(f11, f17);
                float f20 = f12 - f13;
                path.moveTo(f11, f20);
                path.lineTo(f11, f12);
                path.lineTo(f19, f12);
                path.moveTo(f18, f12);
                path.lineTo(f10, f12);
                path.lineTo(f10, f20);
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        float fMin = Math.min(f14, Math.max(f13 - 1.0f, 0.0f));
        if (z10) {
            path.reset();
            float f21 = f6 + fMin;
            path.moveTo(f10, f21);
            float f22 = f10 + fMin;
            path.quadTo(f10, f6, f22, f6);
            float f23 = f11 - fMin;
            path.lineTo(f23, f6);
            path.quadTo(f11, f6, f11, f21);
            float f24 = f12 - fMin;
            path.lineTo(f11, f24);
            path.quadTo(f11, f12, f23, f12);
            path.lineTo(f22, f12);
            path.quadTo(f10, f12, f10, f24);
            path.lineTo(f10, f21);
            path.moveTo(0.0f, 0.0f);
            float f25 = width;
            path.lineTo(f25, 0.0f);
            float f26 = height;
            path.lineTo(f25, f26);
            path.lineTo(0.0f, f26);
            path.lineTo(0.0f, 0.0f);
            canvas.drawPath(path, paint2);
        }
        if (z11) {
            path.reset();
            float f27 = f6 + f13;
            path.moveTo(f10, f27);
            float f28 = f6 + fMin;
            path.lineTo(f10, f28);
            float f29 = f10 + fMin;
            path.quadTo(f10, f6, f29, f6);
            float f30 = f10 + f13;
            path.lineTo(f30, f6);
            float f31 = f11 - f13;
            path.moveTo(f31, f6);
            float f32 = f11 - fMin;
            path.lineTo(f32, f6);
            path.quadTo(f11, f6, f11, f28);
            path.lineTo(f11, f27);
            float f33 = f12 - f13;
            path.moveTo(f11, f33);
            float f34 = f12 - fMin;
            path.lineTo(f11, f34);
            path.quadTo(f11, f12, f32, f12);
            path.lineTo(f31, f12);
            path.moveTo(f30, f12);
            path.lineTo(f29, f12);
            path.quadTo(f10, f12, f10, f34);
            path.lineTo(f10, f33);
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a(i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setFrameVerticalBias(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f92632y0 = f6;
        a(getWidth(), getHeight());
        if (isLaidOut()) {
            invalidate();
        }
    }
}
