package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f19665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f19666q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Path f19667r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ViewOutlineProvider f19668s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public RectF f19669t0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            int width = motionButton.getWidth();
            int height = motionButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionButton.f19665p0) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f19666q0);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f19665p0 = 0.0f;
        this.f19666q0 = Float.NaN;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f19666q0;
    }

    public float getRoundPercent() {
        return this.f19665p0;
    }

    @RequiresApi(21)
    public void setRound(float f6) {
        if (Float.isNaN(f6)) {
            this.f19666q0 = f6;
            float f10 = this.f19665p0;
            this.f19665p0 = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z10 = this.f19666q0 != f6;
        this.f19666q0 = f6;
        if (f6 != 0.0f) {
            if (this.f19667r0 == null) {
                this.f19667r0 = new Path();
            }
            if (this.f19669t0 == null) {
                this.f19669t0 = new RectF();
            }
            if (this.f19668s0 == null) {
                b bVar = new b();
                this.f19668s0 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19669t0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19667r0.reset();
            Path path = this.f19667r0;
            RectF rectF = this.f19669t0;
            float f11 = this.f19666q0;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f6) {
        boolean z10 = this.f19665p0 != f6;
        this.f19665p0 = f6;
        if (f6 != 0.0f) {
            if (this.f19667r0 == null) {
                this.f19667r0 = new Path();
            }
            if (this.f19669t0 == null) {
                this.f19669t0 = new RectF();
            }
            if (this.f19668s0 == null) {
                a aVar = new a();
                this.f19668s0 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19665p0) / 2.0f;
            this.f19669t0.set(0.0f, 0.0f, width, height);
            this.f19667r0.reset();
            this.f19667r0.addRoundRect(this.f19669t0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19665p0 = 0.0f;
        this.f19666q0 = Float.NaN;
        a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19665p0 = 0.0f;
        this.f19666q0 = Float.NaN;
        a(context, attributeSet);
    }
}
