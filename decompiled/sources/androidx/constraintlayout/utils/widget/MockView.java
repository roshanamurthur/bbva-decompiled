package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {
    protected String mText;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f19656p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f19657q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Paint f19658r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f19659s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f19660t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Rect f19661u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19662w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f19663x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f19664y0;

    public MockView(Context context) {
        super(context);
        this.f19656p0 = new Paint();
        this.f19657q0 = new Paint();
        this.f19658r0 = new Paint();
        this.f19659s0 = true;
        this.f19660t0 = true;
        this.mText = null;
        this.f19661u0 = new Rect();
        this.v0 = Color.argb(255, 0, 0, 0);
        this.f19662w0 = Color.argb(255, 200, 200, 200);
        this.f19663x0 = Color.argb(255, 50, 50, 50);
        this.f19664y0 = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MockView_mock_label) {
                    this.mText = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MockView_mock_showDiagonals) {
                    this.f19659s0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19659s0);
                } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                    this.v0 = typedArrayObtainStyledAttributes.getColor(index, this.v0);
                } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                    this.f19663x0 = typedArrayObtainStyledAttributes.getColor(index, this.f19663x0);
                } else if (index == R.styleable.MockView_mock_labelColor) {
                    this.f19662w0 = typedArrayObtainStyledAttributes.getColor(index, this.f19662w0);
                } else if (index == R.styleable.MockView_mock_showLabel) {
                    this.f19660t0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19660t0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i11 = this.v0;
        Paint paint = this.f19656p0;
        paint.setColor(i11);
        paint.setAntiAlias(true);
        int i12 = this.f19662w0;
        Paint paint2 = this.f19657q0;
        paint2.setColor(i12);
        paint2.setAntiAlias(true);
        this.f19658r0.setColor(this.f19663x0);
        this.f19664y0 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f19664y0);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f19659s0) {
            width--;
            height--;
            float f6 = width;
            float f10 = height;
            canvas.drawLine(0.0f, 0.0f, f6, f10, this.f19656p0);
            canvas.drawLine(0.0f, f10, f6, 0.0f, this.f19656p0);
            canvas.drawLine(0.0f, 0.0f, f6, 0.0f, this.f19656p0);
            canvas.drawLine(f6, 0.0f, f6, f10, this.f19656p0);
            canvas.drawLine(f6, f10, 0.0f, f10, this.f19656p0);
            canvas.drawLine(0.0f, f10, 0.0f, 0.0f, this.f19656p0);
        }
        String str = this.mText;
        if (str == null || !this.f19660t0) {
            return;
        }
        int length = str.length();
        Paint paint = this.f19657q0;
        Rect rect = this.f19661u0;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i10 = rect.left;
        int i11 = this.f19664y0;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas.drawRect(rect, this.f19658r0);
        canvas.drawText(this.mText, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19656p0 = new Paint();
        this.f19657q0 = new Paint();
        this.f19658r0 = new Paint();
        this.f19659s0 = true;
        this.f19660t0 = true;
        this.mText = null;
        this.f19661u0 = new Rect();
        this.v0 = Color.argb(255, 0, 0, 0);
        this.f19662w0 = Color.argb(255, 200, 200, 200);
        this.f19663x0 = Color.argb(255, 50, 50, 50);
        this.f19664y0 = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19656p0 = new Paint();
        this.f19657q0 = new Paint();
        this.f19658r0 = new Paint();
        this.f19659s0 = true;
        this.f19660t0 = true;
        this.mText = null;
        this.f19661u0 = new Rect();
        this.v0 = Color.argb(255, 0, 0, 0);
        this.f19662w0 = Color.argb(255, 200, 200, 200);
        this.f19663x0 = Color.argb(255, 50, 50, 50);
        this.f19664y0 = 4;
        a(context, attributeSet);
    }
}
