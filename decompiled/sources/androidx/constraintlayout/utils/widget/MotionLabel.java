package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.core.view.GravityCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {
    public float E0;
    public int F0;
    public int G0;
    public float H0;
    public String I0;
    public boolean J0;
    public final Rect K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public String P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public float T0;
    public float U0;
    public float V0;
    public Drawable W0;
    public Matrix X0;
    public Bitmap Y0;
    public BitmapShader Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Matrix f19672a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public float f19673b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public float f19674c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f19675d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public float f19676e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final Paint f19677f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f19678g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Rect f19679h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Paint f19680i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f19681j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f19682k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public float f19683l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public float f19684m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public float f19685n1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextPaint f19686p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Path f19687q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19688r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f19689s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f19690t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f19691u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ViewOutlineProvider f19692w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public RectF f19693x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f19694y0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            int width = motionLabel.getWidth();
            int height = motionLabel.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f19691u0) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.v0);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f19686p0 = new TextPaint();
        this.f19687q0 = new Path();
        this.f19688r0 = 65535;
        this.f19689s0 = 65535;
        this.f19690t0 = false;
        this.f19691u0 = 0.0f;
        this.v0 = Float.NaN;
        this.f19694y0 = 48.0f;
        this.E0 = Float.NaN;
        this.H0 = 0.0f;
        this.I0 = "Hello World";
        this.J0 = true;
        this.K0 = new Rect();
        this.L0 = 1;
        this.M0 = 1;
        this.N0 = 1;
        this.O0 = 1;
        this.Q0 = 8388659;
        this.R0 = 0;
        this.S0 = false;
        this.f19673b1 = Float.NaN;
        this.f19674c1 = Float.NaN;
        this.f19675d1 = 0.0f;
        this.f19676e1 = 0.0f;
        this.f19677f1 = new Paint();
        this.f19678g1 = 0;
        this.f19682k1 = Float.NaN;
        this.f19683l1 = Float.NaN;
        this.f19684m1 = Float.NaN;
        this.f19685n1 = Float.NaN;
        b(context, null);
    }

    private float getHorizontalOffset() {
        float f6 = Float.isNaN(this.E0) ? 1.0f : this.f19694y0 / this.E0;
        String str = this.I0;
        return ((this.f19675d1 + 1.0f) * ((((Float.isNaN(this.U0) ? getMeasuredWidth() : this.U0) - getPaddingLeft()) - getPaddingRight()) - (this.f19686p0.measureText(str, 0, str.length()) * f6))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f6 = Float.isNaN(this.E0) ? 1.0f : this.f19694y0 / this.E0;
        Paint.FontMetrics fontMetrics = this.f19686p0.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.V0) ? getMeasuredHeight() : this.V0) - getPaddingTop()) - getPaddingBottom();
        float f10 = fontMetrics.descent;
        float f11 = fontMetrics.ascent;
        return (((1.0f - this.f19676e1) * (measuredHeight - ((f10 - f11) * f6))) / 2.0f) - (f6 * f11);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i10 = typedValue.data;
        this.f19688r0 = i10;
        this.f19686p0.setColor(i10);
    }

    public final void a(float f6) {
        if (this.f19690t0 || f6 != 1.0f) {
            this.f19687q0.reset();
            String str = this.I0;
            int length = str.length();
            TextPaint textPaint = this.f19686p0;
            Rect rect = this.K0;
            textPaint.getTextBounds(str, 0, length, rect);
            this.f19686p0.getTextPath(str, 0, length, 0.0f, 0.0f, this.f19687q0);
            if (f6 != 1.0f) {
                Debug.getLoc();
                Matrix matrix = new Matrix();
                matrix.postScale(f6, f6);
                this.f19687q0.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.J0 = false;
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_fontFamily) {
                    this.P0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_scaleFromTextSize) {
                    this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.E0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textSize) {
                    this.f19694y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f19694y0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textStyle) {
                    this.F0 = typedArrayObtainStyledAttributes.getInt(index, this.F0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_typeface) {
                    this.G0 = typedArrayObtainStyledAttributes.getInt(index, this.G0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textColor) {
                    this.f19688r0 = typedArrayObtainStyledAttributes.getColor(index, this.f19688r0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.v0);
                    this.v0 = dimension;
                    setRound(dimension);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_borderRoundPercent) {
                    float f6 = typedArrayObtainStyledAttributes.getFloat(index, this.f19691u0);
                    this.f19691u0 = f6;
                    setRoundPercent(f6);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.R0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textOutlineColor) {
                    this.f19689s0 = typedArrayObtainStyledAttributes.getInt(index, this.f19689s0);
                    this.f19690t0 = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textOutlineThickness) {
                    this.H0 = typedArrayObtainStyledAttributes.getDimension(index, this.H0);
                    this.f19690t0 = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackground) {
                    this.W0 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f19690t0 = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundPanX) {
                    this.f19682k1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19682k1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundPanY) {
                    this.f19683l1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19683l1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textPanX) {
                    this.f19675d1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19675d1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textPanY) {
                    this.f19676e1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19676e1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundRotate) {
                    this.f19685n1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19685n1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundZoom) {
                    this.f19684m1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19684m1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textureHeight) {
                    this.f19673b1 = typedArrayObtainStyledAttributes.getDimension(index, this.f19673b1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textureWidth) {
                    this.f19674c1 = typedArrayObtainStyledAttributes.getDimension(index, this.f19674c1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLabel_textureEffect) {
                    this.f19678g1 = typedArrayObtainStyledAttributes.getInt(index, this.f19678g1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.W0 != null) {
            this.f19672a1 = new Matrix();
            int intrinsicWidth = this.W0.getIntrinsicWidth();
            int intrinsicHeight = this.W0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f19674c1) ? 128 : (int) this.f19674c1;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f19673b1) ? 128 : (int) this.f19673b1;
            }
            if (this.f19678g1 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.Y0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.Y0);
            this.W0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.W0.setFilterBitmap(true);
            this.W0.draw(canvas);
            if (this.f19678g1 != 0) {
                Bitmap bitmap = this.Y0;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i11 = 0; i11 < 4 && width >= 32 && height >= 32; i11++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.Y0 = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.Y0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.Z0 = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.L0 = getPaddingLeft();
        this.M0 = getPaddingRight();
        this.N0 = getPaddingTop();
        this.O0 = getPaddingBottom();
        String str = this.P0;
        int i12 = this.G0;
        int i13 = this.F0;
        TextPaint textPaint = this.f19686p0;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i13);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f19688r0);
            textPaint.setStrokeWidth(this.H0);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.f19694y0);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i12 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i12 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i12 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i13 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i13) : Typeface.create(typefaceCreate, i13);
            setTypeface(typefaceDefaultFromStyle);
            int i14 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i13;
            textPaint.setFakeBoldText((i14 & 1) != 0);
            textPaint.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f19688r0);
        textPaint.setStrokeWidth(this.H0);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f19694y0);
        textPaint.setAntiAlias(true);
    }

    public final void c() {
        float f6 = Float.isNaN(this.f19682k1) ? 0.0f : this.f19682k1;
        float f10 = Float.isNaN(this.f19683l1) ? 0.0f : this.f19683l1;
        float f11 = Float.isNaN(this.f19684m1) ? 1.0f : this.f19684m1;
        float f12 = Float.isNaN(this.f19685n1) ? 0.0f : this.f19685n1;
        this.f19672a1.reset();
        float width = this.Y0.getWidth();
        float height = this.Y0.getHeight();
        float f13 = Float.isNaN(this.f19674c1) ? this.U0 : this.f19674c1;
        float f14 = Float.isNaN(this.f19673b1) ? this.V0 : this.f19673b1;
        float f15 = f11 * (width * f14 < height * f13 ? f13 / width : f14 / height);
        this.f19672a1.postScale(f15, f15);
        float f16 = width * f15;
        float f17 = f13 - f16;
        float f18 = f15 * height;
        float f19 = f14 - f18;
        if (!Float.isNaN(this.f19673b1)) {
            f19 = this.f19673b1 / 2.0f;
        }
        if (!Float.isNaN(this.f19674c1)) {
            f17 = this.f19674c1 / 2.0f;
        }
        this.f19672a1.postTranslate((((f6 * f17) + f13) - f16) * 0.5f, (((f10 * f19) + f14) - f18) * 0.5f);
        this.f19672a1.postRotate(f12, f13 / 2.0f, f14 / 2.0f);
        this.Z0.setLocalMatrix(this.f19672a1);
    }

    public float getRound() {
        return this.v0;
    }

    public float getRoundPercent() {
        return this.f19691u0;
    }

    public float getScaleFromTextSize() {
        return this.E0;
    }

    public float getTextBackgroundPanX() {
        return this.f19682k1;
    }

    public float getTextBackgroundPanY() {
        return this.f19683l1;
    }

    public float getTextBackgroundRotate() {
        return this.f19685n1;
    }

    public float getTextBackgroundZoom() {
        return this.f19684m1;
    }

    public int getTextOutlineColor() {
        return this.f19689s0;
    }

    public float getTextPanX() {
        return this.f19675d1;
    }

    public float getTextPanY() {
        return this.f19676e1;
    }

    public float getTextureHeight() {
        return this.f19673b1;
    }

    public float getTextureWidth() {
        return this.f19674c1;
    }

    public Typeface getTypeface() {
        return this.f19686p0.getTypeface();
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.E0);
        float f6 = zIsNaN ? 1.0f : this.f19694y0 / this.E0;
        this.U0 = i12 - i10;
        this.V0 = i13 - i11;
        if (this.S0) {
            Rect rect = this.f19679h1;
            TextPaint textPaint = this.f19686p0;
            if (rect == null) {
                this.f19680i1 = new Paint();
                this.f19679h1 = new Rect();
                this.f19680i1.set(textPaint);
                this.f19681j1 = this.f19680i1.getTextSize();
            }
            Paint paint = this.f19680i1;
            String str = this.I0;
            paint.getTextBounds(str, 0, str.length(), this.f19679h1);
            int iWidth = this.f19679h1.width();
            int iHeight = (int) (this.f19679h1.height() * 1.3f);
            float f10 = (this.U0 - this.M0) - this.L0;
            float f11 = (this.V0 - this.O0) - this.N0;
            if (zIsNaN) {
                float f12 = iWidth;
                float f13 = iHeight;
                if (f12 * f11 > f13 * f10) {
                    textPaint.setTextSize((this.f19681j1 * f10) / f12);
                } else {
                    textPaint.setTextSize((this.f19681j1 * f11) / f13);
                }
            } else {
                float f14 = iWidth;
                float f15 = iHeight;
                f6 = f14 * f11 > f15 * f10 ? f10 / f14 : f11 / f15;
            }
        }
        if (this.f19690t0 || !zIsNaN) {
            float f16 = i10;
            float f17 = i11;
            float f18 = i12;
            float f19 = i13;
            if (this.f19672a1 != null) {
                this.U0 = f18 - f16;
                this.V0 = f19 - f17;
                c();
            }
            a(f6);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        float f6 = Float.isNaN(this.E0) ? 1.0f : this.f19694y0 / this.E0;
        super.onDraw(canvas);
        boolean z10 = this.f19690t0;
        TextPaint textPaint = this.f19686p0;
        if (!z10 && f6 == 1.0f) {
            canvas.drawText(this.I0, this.T0 + this.L0 + getHorizontalOffset(), this.N0 + getVerticalOffset(), textPaint);
            return;
        }
        if (this.J0) {
            a(f6);
        }
        if (this.X0 == null) {
            this.X0 = new Matrix();
        }
        if (!this.f19690t0) {
            float horizontalOffset = this.L0 + getHorizontalOffset();
            float verticalOffset = this.N0 + getVerticalOffset();
            this.X0.reset();
            this.X0.preTranslate(horizontalOffset, verticalOffset);
            this.f19687q0.transform(this.X0);
            textPaint.setColor(this.f19688r0);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.H0);
            canvas.drawPath(this.f19687q0, textPaint);
            this.X0.reset();
            this.X0.preTranslate(-horizontalOffset, -verticalOffset);
            this.f19687q0.transform(this.X0);
            return;
        }
        Paint paint = this.f19677f1;
        paint.set(textPaint);
        this.X0.reset();
        float horizontalOffset2 = this.L0 + getHorizontalOffset();
        float verticalOffset2 = this.N0 + getVerticalOffset();
        this.X0.postTranslate(horizontalOffset2, verticalOffset2);
        this.X0.preScale(f6, f6);
        this.f19687q0.transform(this.X0);
        if (this.Z0 != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.Z0);
        } else {
            textPaint.setColor(this.f19688r0);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.H0);
        canvas.drawPath(this.f19687q0, textPaint);
        if (this.Z0 != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f19689s0);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.H0);
        canvas.drawPath(this.f19687q0, textPaint);
        this.X0.reset();
        this.X0.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f19687q0.transform(this.X0);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.S0 = false;
        this.L0 = getPaddingLeft();
        this.M0 = getPaddingRight();
        this.N0 = getPaddingTop();
        this.O0 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.I0;
            int length = str.length();
            TextPaint textPaint = this.f19686p0;
            Rect rect = this.K0;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.L0 + this.M0;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.N0 + this.O0 + fontMetricsInt;
            }
        } else if (this.R0 != 0) {
            this.S0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i10 |= GravityCompat.START;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.Q0) {
            invalidate();
        }
        this.Q0 = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.f19676e1 = -1.0f;
        } else if (i11 != 80) {
            this.f19676e1 = 0.0f;
        } else {
            this.f19676e1 = 1.0f;
        }
        int i12 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.f19675d1 = 0.0f;
                        return;
                    }
                }
            }
            this.f19675d1 = 1.0f;
            return;
        }
        this.f19675d1 = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f6) {
        if (Float.isNaN(f6)) {
            this.v0 = f6;
            float f10 = this.f19691u0;
            this.f19691u0 = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z10 = this.v0 != f6;
        this.v0 = f6;
        if (f6 != 0.0f) {
            if (this.f19687q0 == null) {
                this.f19687q0 = new Path();
            }
            if (this.f19693x0 == null) {
                this.f19693x0 = new RectF();
            }
            if (this.f19692w0 == null) {
                b bVar = new b();
                this.f19692w0 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19693x0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19687q0.reset();
            Path path = this.f19687q0;
            RectF rectF = this.f19693x0;
            float f11 = this.v0;
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
        boolean z10 = this.f19691u0 != f6;
        this.f19691u0 = f6;
        if (f6 != 0.0f) {
            if (this.f19687q0 == null) {
                this.f19687q0 = new Path();
            }
            if (this.f19693x0 == null) {
                this.f19693x0 = new RectF();
            }
            if (this.f19692w0 == null) {
                a aVar = new a();
                this.f19692w0 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19691u0) / 2.0f;
            this.f19693x0.set(0.0f, 0.0f, width, height);
            this.f19687q0.reset();
            this.f19687q0.addRoundRect(this.f19693x0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f6) {
        this.E0 = f6;
    }

    public void setText(CharSequence charSequence) {
        this.I0 = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f6) {
        this.f19682k1 = f6;
        c();
        invalidate();
    }

    public void setTextBackgroundPanY(float f6) {
        this.f19683l1 = f6;
        c();
        invalidate();
    }

    public void setTextBackgroundRotate(float f6) {
        this.f19685n1 = f6;
        c();
        invalidate();
    }

    public void setTextBackgroundZoom(float f6) {
        this.f19684m1 = f6;
        c();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f19688r0 = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f19689s0 = i10;
        this.f19690t0 = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f6) {
        this.H0 = f6;
        this.f19690t0 = true;
        if (Float.isNaN(f6)) {
            this.H0 = 1.0f;
            this.f19690t0 = false;
        }
        invalidate();
    }

    public void setTextPanX(float f6) {
        this.f19675d1 = f6;
        invalidate();
    }

    public void setTextPanY(float f6) {
        this.f19676e1 = f6;
        invalidate();
    }

    public void setTextSize(float f6) {
        this.f19694y0 = f6;
        if (!Float.isNaN(this.E0)) {
            f6 = this.E0;
        }
        this.f19686p0.setTextSize(f6);
        a(Float.isNaN(this.E0) ? 1.0f : this.f19694y0 / this.E0);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f6) {
        this.f19673b1 = f6;
        c();
        invalidate();
    }

    public void setTextureWidth(float f6) {
        this.f19674c1 = f6;
        c();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f19686p0;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f6, float f10, float f11, float f12) {
        int i10 = (int) (f6 + 0.5f);
        this.T0 = f6 - i10;
        int i11 = (int) (f11 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f12 + 0.5f);
        int i14 = (int) (0.5f + f10);
        int i15 = i13 - i14;
        float f13 = f11 - f6;
        this.U0 = f13;
        float f14 = f12 - f10;
        this.V0 = f14;
        if (this.f19672a1 != null) {
            this.U0 = f13;
            this.V0 = f14;
            c();
        }
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.S0) {
            Rect rect = this.f19679h1;
            TextPaint textPaint = this.f19686p0;
            if (rect == null) {
                this.f19680i1 = new Paint();
                this.f19679h1 = new Rect();
                this.f19680i1.set(textPaint);
                this.f19681j1 = this.f19680i1.getTextSize();
            }
            this.U0 = f13;
            this.V0 = f14;
            Paint paint = this.f19680i1;
            String str = this.I0;
            paint.getTextBounds(str, 0, str.length(), this.f19679h1);
            int iWidth = this.f19679h1.width();
            float fHeight = this.f19679h1.height() * 1.3f;
            float f15 = (f13 - this.M0) - this.L0;
            float f16 = (f14 - this.O0) - this.N0;
            float f17 = iWidth;
            if (f17 * f16 > fHeight * f15) {
                textPaint.setTextSize((this.f19681j1 * f15) / f17);
            } else {
                textPaint.setTextSize((this.f19681j1 * f16) / fHeight);
            }
            if (this.f19690t0 || !Float.isNaN(this.E0)) {
                a(Float.isNaN(this.E0) ? 1.0f : this.f19694y0 / this.E0);
            }
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19686p0 = new TextPaint();
        this.f19687q0 = new Path();
        this.f19688r0 = 65535;
        this.f19689s0 = 65535;
        this.f19690t0 = false;
        this.f19691u0 = 0.0f;
        this.v0 = Float.NaN;
        this.f19694y0 = 48.0f;
        this.E0 = Float.NaN;
        this.H0 = 0.0f;
        this.I0 = "Hello World";
        this.J0 = true;
        this.K0 = new Rect();
        this.L0 = 1;
        this.M0 = 1;
        this.N0 = 1;
        this.O0 = 1;
        this.Q0 = 8388659;
        this.R0 = 0;
        this.S0 = false;
        this.f19673b1 = Float.NaN;
        this.f19674c1 = Float.NaN;
        this.f19675d1 = 0.0f;
        this.f19676e1 = 0.0f;
        this.f19677f1 = new Paint();
        this.f19678g1 = 0;
        this.f19682k1 = Float.NaN;
        this.f19683l1 = Float.NaN;
        this.f19684m1 = Float.NaN;
        this.f19685n1 = Float.NaN;
        b(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19686p0 = new TextPaint();
        this.f19687q0 = new Path();
        this.f19688r0 = 65535;
        this.f19689s0 = 65535;
        this.f19690t0 = false;
        this.f19691u0 = 0.0f;
        this.v0 = Float.NaN;
        this.f19694y0 = 48.0f;
        this.E0 = Float.NaN;
        this.H0 = 0.0f;
        this.I0 = "Hello World";
        this.J0 = true;
        this.K0 = new Rect();
        this.L0 = 1;
        this.M0 = 1;
        this.N0 = 1;
        this.O0 = 1;
        this.Q0 = 8388659;
        this.R0 = 0;
        this.S0 = false;
        this.f19673b1 = Float.NaN;
        this.f19674c1 = Float.NaN;
        this.f19675d1 = 0.0f;
        this.f19676e1 = 0.0f;
        this.f19677f1 = new Paint();
        this.f19678g1 = 0;
        this.f19682k1 = Float.NaN;
        this.f19683l1 = Float.NaN;
        this.f19684m1 = Float.NaN;
        this.f19685n1 = Float.NaN;
        b(context, attributeSet);
    }
}
