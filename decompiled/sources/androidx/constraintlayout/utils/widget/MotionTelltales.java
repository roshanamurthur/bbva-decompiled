package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public final Paint E0;
    public MotionLayout F0;
    public final float[] G0;
    public final Matrix H0;
    public int I0;
    public int J0;
    public float K0;

    public MotionTelltales(Context context) {
        super(context);
        this.E0 = new Paint();
        this.G0 = new float[2];
        this.H0 = new Matrix();
        this.I0 = 0;
        this.J0 = -65281;
        this.K0 = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.J0 = typedArrayObtainStyledAttributes.getColor(index, this.J0);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.I0 = typedArrayObtainStyledAttributes.getInt(index, this.I0);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.K0 = typedArrayObtainStyledAttributes.getFloat(index, this.K0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i11 = this.J0;
        Paint paint = this.E0;
        paint.setColor(i11);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.H0;
        matrix.invert(matrix2);
        if (this.F0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.F0 = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f6 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f10 = fArr[i11];
                this.F0.getViewVelocity(this, f10, f6, this.G0, this.I0);
                float[] fArr2 = this.G0;
                matrix2.mapVectors(fArr2);
                float f11 = width * f10;
                float f12 = height * f6;
                float f13 = fArr2[0];
                float f14 = this.K0;
                float f15 = f12 - (fArr2[1] * f14);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f11, f12, f11 - (f13 * f14), f15, this.E0);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = new Paint();
        this.G0 = new float[2];
        this.H0 = new Matrix();
        this.I0 = 0;
        this.J0 = -65281;
        this.K0 = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E0 = new Paint();
        this.G0 = new float[2];
        this.H0 = new Matrix();
        this.I0 = 0;
        this.J0 = -65281;
        this.K0 = 0.25f;
        b(context, attributeSet);
    }
}
