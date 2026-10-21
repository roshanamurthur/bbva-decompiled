package com.budiyev.android.codescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import com.veridas.detect.sequence.document.IntelligentSequenceObjectDetectorKt;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;
import pc.e;

/* JADX INFO: loaded from: classes9.dex */
public final class CodeScannerView extends ViewGroup {
    public static final ButtonPosition O0 = ButtonPosition.TOP_START;
    public static final ButtonPosition P0 = ButtonPosition.TOP_END;
    public ButtonPosition E0;
    public int F0;
    public int G0;
    public int H0;
    public Drawable I0;
    public Drawable J0;
    public pc.c K0;
    public d L0;
    public CodeScanner M0;
    public int N0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SurfaceView f37954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public e f37955q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ImageView f37956r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ButtonPosition f37957s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f37958t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f37959u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Drawable f37960w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f37961x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ImageView f37962y0;

    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37963a;

        static {
            int[] iArr = new int[ButtonPosition.values().length];
            f37963a = iArr;
            try {
                iArr[ButtonPosition.TOP_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37963a[ButtonPosition.TOP_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37963a[ButtonPosition.BOTTOM_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37963a[ButtonPosition.BOTTOM_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CodeScannerView codeScannerView = CodeScannerView.this;
            CodeScanner codeScanner = codeScannerView.M0;
            if (codeScanner != null) {
                pc.b bVar = codeScanner.f37932s;
                if (bVar == null || bVar.f92616h) {
                    boolean z10 = !codeScanner.isAutoFocusEnabled();
                    codeScanner.setAutoFocusEnabled(z10);
                    codeScannerView.setAutoFocusEnabled(z10);
                }
            }
        }
    }

    public final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CodeScanner codeScanner = CodeScannerView.this.M0;
            if (codeScanner != null) {
                pc.b bVar = codeScanner.f37932s;
                if (bVar == null || bVar.f92617i) {
                    boolean z10 = !codeScanner.isFlashEnabled();
                    codeScanner.setFlashEnabled(z10);
                    CodeScannerView.this.setFlashEnabled(z10);
                }
            }
        }
    }

    public interface d {
    }

    public CodeScannerView(@NonNull Context context) throws Throwable {
        super(context);
        a(context, null, 0, 0);
    }

    public final void a(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) throws Throwable {
        int i12;
        ButtonPosition buttonPosition;
        int i13;
        ButtonPosition buttonPosition2;
        this.f37954p0 = new SurfaceView(context);
        this.f37955q0 = new e(context);
        float f6 = context.getResources().getDisplayMetrics().density;
        int iRound = Math.round(16.0f * f6);
        this.N0 = Math.round(20.0f * f6);
        ImageView imageView = new ImageView(context);
        this.f37956r0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.f37956r0.setOnClickListener(new b());
        ImageView imageView2 = new ImageView(context);
        this.f37962y0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f37962y0.setOnClickListener(new c());
        ButtonPosition buttonPosition3 = P0;
        ButtonPosition buttonPosition4 = O0;
        if (attributeSet == null) {
            setFrameAspectRatio(1.0f, 1.0f);
            setMaskColor(1996488704);
            setMaskVisible(true);
            setFrameColor(-1);
            setFrameVisible(true);
            setFrameThickness(Math.round(2.0f * f6));
            setFrameCornersSize(Math.round(50.0f * f6));
            setFrameCornersRadius(Math.round(f6 * 0.0f));
            setFrameCornersCapRounded(false);
            setFrameSize(0.75f);
            setFrameVerticalBias(0.5f);
            setAutoFocusButtonColor(-1);
            setFlashButtonColor(-1);
            setAutoFocusButtonVisible(true);
            setAutoFocusButtonPosition(buttonPosition4);
            setFlashButtonVisible(true);
            setFlashButtonPosition(buttonPosition3);
            setAutoFocusButtonPaddingHorizontal(iRound);
            setAutoFocusButtonPaddingVertical(iRound);
            setFlashButtonPaddingHorizontal(iRound);
            setFlashButtonPaddingVertical(iRound);
            setAutoFocusButtonOnIcon(context.getDrawable(R.drawable.ic_code_scanner_auto_focus_on));
            setAutoFocusButtonOffIcon(context.getDrawable(R.drawable.ic_code_scanner_auto_focus_off));
            setFlashButtonOnIcon(context.getDrawable(R.drawable.ic_code_scanner_flash_on));
            setFlashButtonOffIcon(context.getDrawable(R.drawable.ic_code_scanner_flash_off));
        } else {
            TypedArray typedArray = null;
            try {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CodeScannerView, i10, i11);
                try {
                    setMaskColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CodeScannerView_maskColor, 1996488704));
                    setMaskVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CodeScannerView_maskVisible, true));
                    setFrameColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CodeScannerView_frameColor, -1));
                    setFrameVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CodeScannerView_frameVisible, true));
                    setFrameThickness(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_frameThickness, Math.round(2.0f * f6)));
                    setFrameCornersSize(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_frameCornersSize, Math.round(50.0f * f6)));
                    setFrameCornersRadius(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_frameCornersRadius, Math.round(f6 * 0.0f)));
                    setFrameCornersCapRounded(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CodeScannerView_frameCornersCapRounded, false));
                    setFrameAspectRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.CodeScannerView_frameAspectRatioWidth, 1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.CodeScannerView_frameAspectRatioHeight, 1.0f));
                    setFrameSize(typedArrayObtainStyledAttributes.getFloat(R.styleable.CodeScannerView_frameSize, 0.75f));
                    setFrameVerticalBias(typedArrayObtainStyledAttributes.getFloat(R.styleable.CodeScannerView_frameVerticalBias, 0.5f));
                    setAutoFocusButtonVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CodeScannerView_autoFocusButtonVisible, true));
                    setAutoFocusButtonColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CodeScannerView_autoFocusButtonColor, -1));
                    int i14 = R.styleable.CodeScannerView_autoFocusButtonPosition;
                    int[] iArr = a.f37963a;
                    int i15 = iArr[buttonPosition4.ordinal()];
                    if (i15 == 2) {
                        i12 = 1;
                    } else if (i15 != 3) {
                        i12 = i15 != 4 ? 0 : 3;
                    } else {
                        i12 = 2;
                    }
                    int i16 = typedArrayObtainStyledAttributes.getInt(i14, i12);
                    if (i16 == 1) {
                        buttonPosition = ButtonPosition.TOP_END;
                    } else if (i16 != 2) {
                        buttonPosition = i16 != 3 ? ButtonPosition.TOP_START : ButtonPosition.BOTTOM_END;
                    } else {
                        buttonPosition = ButtonPosition.BOTTOM_START;
                    }
                    setAutoFocusButtonPosition(buttonPosition);
                    setAutoFocusButtonPaddingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_autoFocusButtonPaddingHorizontal, iRound));
                    setAutoFocusButtonPaddingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_autoFocusButtonPaddingVertical, iRound));
                    Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CodeScannerView_autoFocusButtonOnIcon);
                    if (drawable == null) {
                        drawable = context.getDrawable(R.drawable.ic_code_scanner_auto_focus_on);
                    }
                    setAutoFocusButtonOnIcon(drawable);
                    Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CodeScannerView_autoFocusButtonOffIcon);
                    if (drawable2 == null) {
                        drawable2 = context.getDrawable(R.drawable.ic_code_scanner_auto_focus_off);
                    }
                    setAutoFocusButtonOffIcon(drawable2);
                    setFlashButtonVisible(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CodeScannerView_flashButtonVisible, true));
                    setFlashButtonColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CodeScannerView_flashButtonColor, -1));
                    int i17 = R.styleable.CodeScannerView_flashButtonPosition;
                    int i18 = iArr[buttonPosition3.ordinal()];
                    if (i18 == 2) {
                        i13 = 1;
                    } else if (i18 != 3) {
                        i13 = i18 != 4 ? 0 : 3;
                    } else {
                        i13 = 2;
                    }
                    int i19 = typedArrayObtainStyledAttributes.getInt(i17, i13);
                    if (i19 == 1) {
                        buttonPosition2 = ButtonPosition.TOP_END;
                    } else if (i19 != 2) {
                        buttonPosition2 = i19 != 3 ? ButtonPosition.TOP_START : ButtonPosition.BOTTOM_END;
                    } else {
                        buttonPosition2 = ButtonPosition.BOTTOM_START;
                    }
                    setFlashButtonPosition(buttonPosition2);
                    setFlashButtonPaddingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_flashButtonPaddingHorizontal, iRound));
                    setFlashButtonPaddingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.CodeScannerView_flashButtonPaddingVertical, iRound));
                    Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CodeScannerView_flashButtonOnIcon);
                    if (drawable3 == null) {
                        drawable3 = context.getDrawable(R.drawable.ic_code_scanner_flash_on);
                    }
                    setFlashButtonOnIcon(drawable3);
                    Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CodeScannerView_flashButtonOffIcon);
                    if (drawable4 == null) {
                        drawable4 = context.getDrawable(R.drawable.ic_code_scanner_flash_off);
                    }
                    setFlashButtonOffIcon(drawable4);
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (isInEditMode()) {
            setAutoFocusEnabled(true);
            setFlashEnabled(true);
        }
        addView(this.f37954p0, new LayoutParams(-1, -1));
        addView(this.f37955q0, new LayoutParams(-1, -1));
        addView(this.f37956r0, new LayoutParams(-2, -2));
        addView(this.f37962y0, new LayoutParams(-2, -2));
    }

    public final void b(ImageView imageView, ButtonPosition buttonPosition, int i10, int i11) {
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int layoutDirection = getLayoutDirection();
        int i12 = a.f37963a[buttonPosition.ordinal()];
        if (i12 == 1) {
            if (layoutDirection == 1) {
                imageView.layout(i10 - measuredWidth, 0, i10, measuredHeight);
                return;
            } else {
                imageView.layout(0, 0, measuredWidth, measuredHeight);
                return;
            }
        }
        if (i12 == 2) {
            if (layoutDirection == 1) {
                imageView.layout(0, 0, measuredWidth, measuredHeight);
                return;
            } else {
                imageView.layout(i10 - measuredWidth, 0, i10, measuredHeight);
                return;
            }
        }
        if (i12 == 3) {
            if (layoutDirection == 1) {
                imageView.layout(i10 - measuredWidth, i11 - measuredHeight, i10, i11);
                return;
            } else {
                imageView.layout(0, i11 - measuredHeight, measuredWidth, i11);
                return;
            }
        }
        if (i12 != 4) {
            return;
        }
        if (layoutDirection == 1) {
            imageView.layout(0, i11 - measuredHeight, measuredWidth, i11);
        } else {
            imageView.layout(i10 - measuredWidth, i11 - measuredHeight, i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @ColorInt
    public int getAutoFocusButtonColor() {
        return this.v0;
    }

    @NonNull
    public Drawable getAutoFocusButtonOffIcon() {
        return this.f37961x0;
    }

    @NonNull
    public Drawable getAutoFocusButtonOnIcon() {
        return this.f37960w0;
    }

    @Px
    public int getAutoFocusButtonPaddingHorizontal() {
        return this.f37958t0;
    }

    @Px
    public int getAutoFocusButtonPaddingVertical() {
        return this.f37959u0;
    }

    @NonNull
    public ButtonPosition getAutoFocusButtonPosition() {
        return this.f37957s0;
    }

    @ColorInt
    public int getFlashButtonColor() {
        return this.H0;
    }

    @NonNull
    public Drawable getFlashButtonOffIcon() {
        return this.J0;
    }

    @NonNull
    public Drawable getFlashButtonOnIcon() {
        return this.I0;
    }

    @Px
    public int getFlashButtonPaddingHorizontal() {
        return this.F0;
    }

    @Px
    public int getFlashButtonPaddingVertical() {
        return this.G0;
    }

    @NonNull
    public ButtonPosition getFlashButtonPosition() {
        return this.E0;
    }

    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getFrameAspectRatioHeight() {
        return this.f37955q0.f92630w0;
    }

    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getFrameAspectRatioWidth() {
        return this.f37955q0.v0;
    }

    @ColorInt
    public int getFrameColor() {
        return this.f37955q0.f92625q0.getColor();
    }

    @Px
    public int getFrameCornersRadius() {
        return this.f37955q0.f92629u0;
    }

    @Px
    public int getFrameCornersSize() {
        return this.f37955q0.f92628t0;
    }

    @Nullable
    public pc.d getFrameRect() {
        return this.f37955q0.f92627s0;
    }

    @FloatRange(from = IntelligentSequenceObjectDetectorKt.INTELLIGENT_DETECTOR_REQUIRED_HITS_MULTIPLIER, to = 1.0d)
    public float getFrameSize() {
        return this.f37955q0.f92631x0;
    }

    @Px
    public int getFrameThickness() {
        return (int) this.f37955q0.f92625q0.getStrokeWidth();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getFrameVerticalBias() {
        return this.f37955q0.f92632y0;
    }

    @ColorInt
    public int getMaskColor() {
        return this.f37955q0.f92624p0.getColor();
    }

    @NonNull
    public SurfaceView getPreviewView() {
        return this.f37954p0;
    }

    @NonNull
    public e getViewFinderView() {
        return this.f37955q0;
    }

    public boolean isAutoFocusButtonVisible() {
        return this.f37956r0.getVisibility() == 0;
    }

    public boolean isFlashButtonVisible() {
        return this.f37962y0.getVisibility() == 0;
    }

    public boolean isFrameCornersCapRounded() {
        return this.f37955q0.f92625q0.getStrokeCap() == Paint.Cap.ROUND;
    }

    public boolean isFrameVisible() {
        return this.f37955q0.F0;
    }

    public boolean isMaskVisible() {
        return this.f37955q0.E0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int childCount = getChildCount();
        if (childCount > 5) {
            throw new IllegalStateException("CodeScannerView can have zero or one child");
        }
        int i18 = i12 - i10;
        int i19 = i13 - i11;
        pc.c cVar = this.K0;
        if (cVar == null) {
            this.f37954p0.layout(0, 0, i18, i19);
        } else {
            int i20 = cVar.f92618a;
            if (i20 > i18) {
                int i21 = (i20 - i18) / 2;
                i14 = 0 - i21;
                i15 = i21 + i18;
            } else {
                i14 = 0;
                i15 = i18;
            }
            int i22 = cVar.f92619b;
            if (i22 > i19) {
                int i23 = (i22 - i19) / 2;
                i16 = 0 - i23;
                i17 = i23 + i19;
            } else {
                i16 = 0;
                i17 = i19;
            }
            this.f37954p0.layout(i14, i16, i15, i17);
        }
        this.f37955q0.layout(0, 0, i18, i19);
        b(this.f37956r0, this.f37957s0, i18, i19);
        b(this.f37962y0, this.E0, i18, i19);
        if (childCount == 5) {
            pc.d dVar = this.f37955q0.f92627s0;
            int i24 = dVar != null ? dVar.f92623d : 0;
            View childAt = getChildAt(4);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i25 = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i24;
                childAt.layout(i25, i26, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + i26);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        if (childCount > 5) {
            throw new IllegalStateException("CodeScannerView can have zero or one child");
        }
        measureChildWithMargins(this.f37954p0, i10, 0, i11, 0);
        measureChildWithMargins(this.f37955q0, i10, 0, i11, 0);
        measureChildWithMargins(this.f37956r0, i10, 0, i11, 0);
        measureChildWithMargins(this.f37962y0, i10, 0, i11, 0);
        if (childCount == 5) {
            pc.d dVar = this.f37955q0.f92627s0;
            measureChildWithMargins(getChildAt(4), i10, 0, i11, dVar != null ? dVar.f92623d : 0);
        }
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        d dVar = this.L0;
        if (dVar != null) {
            CodeScanner.h hVar = (CodeScanner.h) dVar;
            synchronized (CodeScanner.this.f37915a) {
                try {
                    CodeScanner codeScanner = CodeScanner.this;
                    if (i10 != codeScanner.I || i11 != codeScanner.J) {
                        boolean z10 = codeScanner.D;
                        if (codeScanner.f37934u) {
                            CodeScanner.this.releaseResources();
                        }
                        if (z10 || CodeScanner.this.G) {
                            CodeScanner.this.a(i10, i11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        pc.b bVar;
        int i10;
        int i11;
        int i12;
        int i13;
        List<String> supportedFocusModes;
        CodeScanner codeScanner = this.M0;
        pc.d frameRect = getFrameRect();
        int x4 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (codeScanner != null && frameRect != null && (((bVar = codeScanner.f37932s) == null || bVar.f92616h) && codeScanner.isTouchFocusEnabled() && motionEvent.getAction() == 0 && (i10 = frameRect.f92620a) < x4 && (i11 = frameRect.f92621b) < y7 && (i12 = frameRect.f92622c) > x4 && (i13 = frameRect.f92623d) > y7)) {
            int i14 = this.N0;
            int i15 = x4 - i14;
            int i16 = y7 - i14;
            int i17 = x4 + i14;
            int i18 = y7 + i14;
            pc.d dVar = new pc.d(i15, i16, i17, i18);
            int i19 = i17 - i15;
            int i20 = i18 - i16;
            int i21 = i12 - i10;
            int i22 = i13 - i11;
            if (i15 < i10 || i16 < i11 || i17 > i12 || i18 > i13) {
                int iMin = Math.min(i19, i21);
                int iMin2 = Math.min(i20, i22);
                if (i15 < i10) {
                    i12 = i10 + iMin;
                } else if (i17 > i12) {
                    i10 = i12 - iMin;
                } else {
                    i12 = i17;
                    i10 = i15;
                }
                if (i16 < i11) {
                    i13 = i11 + iMin2;
                } else if (i18 > i13) {
                    i11 = i13 - iMin2;
                } else {
                    i13 = i18;
                    i11 = i16;
                }
                dVar = new pc.d(i10, i11, i12, i13);
            }
            synchronized (codeScanner.f37915a) {
                if (codeScanner.f37934u && codeScanner.D && !codeScanner.C) {
                    try {
                        codeScanner.setAutoFocusEnabled(false);
                        pc.b bVar2 = codeScanner.f37932s;
                        if (codeScanner.D && bVar2 != null && bVar2.f92616h) {
                            pc.c cVar = bVar2.f92611c;
                            int i23 = cVar.f92618a;
                            int i24 = cVar.f92619b;
                            int i25 = bVar2.f92614f;
                            if (i25 == 90 || i25 == 270) {
                                i23 = i24;
                                i24 = i23;
                            }
                            pc.d dVarC = Utils.c(i23, i24, dVar, bVar2.f92612d, bVar2.f92613e);
                            Camera camera = bVar2.f92609a;
                            camera.cancelAutoFocus();
                            Camera.Parameters parameters = camera.getParameters();
                            Utils.a(parameters, dVarC, i23, i24, i25);
                            if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(parameters.getFocusMode()) && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                                parameters.setFocusMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                            }
                            camera.setParameters(parameters);
                            camera.autoFocus(codeScanner.f37922h);
                            codeScanner.C = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAutoFocusButtonColor(@ColorInt int i10) {
        this.v0 = i10;
        this.f37956r0.setColorFilter(i10);
    }

    public void setAutoFocusButtonOffIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z10 = drawable != this.f37961x0;
        this.f37961x0 = drawable;
        CodeScanner codeScanner = this.M0;
        if (!z10 || codeScanner == null) {
            return;
        }
        setAutoFocusEnabled(codeScanner.isAutoFocusEnabled());
    }

    public void setAutoFocusButtonOnIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z10 = drawable != this.f37960w0;
        this.f37960w0 = drawable;
        CodeScanner codeScanner = this.M0;
        if (!z10 || codeScanner == null) {
            return;
        }
        setAutoFocusEnabled(codeScanner.isAutoFocusEnabled());
    }

    public void setAutoFocusButtonPaddingHorizontal(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z10 = i10 != this.f37958t0;
        this.f37958t0 = i10;
        if (z10) {
            int i11 = this.f37959u0;
            this.f37956r0.setPadding(i10, i11, i10, i11);
        }
    }

    public void setAutoFocusButtonPaddingVertical(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z10 = i10 != this.f37959u0;
        this.f37959u0 = i10;
        if (z10) {
            int i11 = this.f37958t0;
            this.f37956r0.setPadding(i11, i10, i11, i10);
        }
    }

    public void setAutoFocusButtonPosition(@NonNull ButtonPosition buttonPosition) {
        Objects.requireNonNull(buttonPosition);
        boolean z10 = buttonPosition != this.f37957s0;
        this.f37957s0 = buttonPosition;
        if (z10 && isLaidOut()) {
            requestLayout();
        }
    }

    public void setAutoFocusButtonVisible(boolean z10) {
        this.f37956r0.setVisibility(z10 ? 0 : 4);
    }

    public void setAutoFocusEnabled(boolean z10) {
        this.f37956r0.setImageDrawable(z10 ? this.f37960w0 : this.f37961x0);
    }

    public void setCodeScanner(@NonNull CodeScanner codeScanner) {
        if (this.M0 != null) {
            throw new IllegalStateException("Code scanner has already been set");
        }
        this.M0 = codeScanner;
        setAutoFocusEnabled(codeScanner.isAutoFocusEnabled());
        setFlashEnabled(codeScanner.isFlashEnabled());
    }

    public void setFlashButtonColor(@ColorInt int i10) {
        this.H0 = i10;
        this.f37962y0.setColorFilter(i10);
    }

    public void setFlashButtonOffIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z10 = drawable != this.J0;
        this.J0 = drawable;
        CodeScanner codeScanner = this.M0;
        if (!z10 || codeScanner == null) {
            return;
        }
        setFlashEnabled(codeScanner.isFlashEnabled());
    }

    public void setFlashButtonOnIcon(@NonNull Drawable drawable) {
        Objects.requireNonNull(drawable);
        boolean z10 = drawable != this.I0;
        this.I0 = drawable;
        CodeScanner codeScanner = this.M0;
        if (!z10 || codeScanner == null) {
            return;
        }
        setFlashEnabled(codeScanner.isFlashEnabled());
    }

    public void setFlashButtonPaddingHorizontal(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z10 = i10 != this.F0;
        this.F0 = i10;
        if (z10) {
            int i11 = this.G0;
            this.f37962y0.setPadding(i10, i11, i10, i11);
        }
    }

    public void setFlashButtonPaddingVertical(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Padding should be equal to or grater then zero");
        }
        boolean z10 = i10 != this.G0;
        this.G0 = i10;
        if (z10) {
            int i11 = this.F0;
            this.f37962y0.setPadding(i11, i10, i11, i10);
        }
    }

    public void setFlashButtonPosition(@NonNull ButtonPosition buttonPosition) {
        Objects.requireNonNull(buttonPosition);
        boolean z10 = buttonPosition != this.E0;
        this.E0 = buttonPosition;
        if (z10) {
            requestLayout();
        }
    }

    public void setFlashButtonVisible(boolean z10) {
        this.f37962y0.setVisibility(z10 ? 0 : 4);
    }

    public void setFlashEnabled(boolean z10) {
        this.f37962y0.setImageDrawable(z10 ? this.I0 : this.J0);
    }

    public void setFrameAspectRatio(@FloatRange(from = 0.0d, fromInclusive = false) float f6, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        if (f6 <= 0.0f || f10 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        e eVar = this.f37955q0;
        eVar.v0 = f6;
        eVar.f92630w0 = f10;
        eVar.a(eVar.getWidth(), eVar.getHeight());
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameAspectRatioHeight(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        e eVar = this.f37955q0;
        eVar.f92630w0 = f6;
        eVar.a(eVar.getWidth(), eVar.getHeight());
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameAspectRatioWidth(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
        }
        e eVar = this.f37955q0;
        eVar.v0 = f6;
        eVar.a(eVar.getWidth(), eVar.getHeight());
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameColor(@ColorInt int i10) {
        e eVar = this.f37955q0;
        eVar.f92625q0.setColor(i10);
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameCornersCapRounded(boolean z10) {
        e eVar = this.f37955q0;
        eVar.f92625q0.setStrokeCap(z10 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        eVar.invalidate();
    }

    public void setFrameCornersRadius(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Frame corners radius can't be negative");
        }
        e eVar = this.f37955q0;
        eVar.f92629u0 = i10;
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameCornersSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Frame corners size can't be negative");
        }
        e eVar = this.f37955q0;
        eVar.f92628t0 = i10;
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameSize(@FloatRange(from = IntelligentSequenceObjectDetectorKt.INTELLIGENT_DETECTOR_REQUIRED_HITS_MULTIPLIER, to = 1.0d) float f6) {
        if (f6 < 0.1d || f6 > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0.1 and 1, inclusive");
        }
        e eVar = this.f37955q0;
        eVar.f92631x0 = f6;
        eVar.a(eVar.getWidth(), eVar.getHeight());
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameThickness(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Frame thickness can't be negative");
        }
        e eVar = this.f37955q0;
        eVar.f92625q0.setStrokeWidth(i10);
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setFrameVerticalBias(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("Max frame size value should be between 0 and 1, inclusive");
        }
        this.f37955q0.setFrameVerticalBias(f6);
    }

    public void setFrameVisible(boolean z10) {
        this.f37955q0.F0 = z10;
    }

    public void setMaskColor(@ColorInt int i10) {
        e eVar = this.f37955q0;
        eVar.f92624p0.setColor(i10);
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setMaskVisible(boolean z10) {
        e eVar = this.f37955q0;
        eVar.E0 = z10;
        if (eVar.isLaidOut()) {
            eVar.invalidate();
        }
    }

    public void setPreviewSize(@Nullable pc.c cVar) {
        this.K0 = cVar;
        requestLayout();
    }

    public void setSizeListener(@Nullable d dVar) {
        this.L0 = dVar;
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public CodeScannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public CodeScannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) throws Throwable {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    @RequiresApi(21)
    public CodeScannerView(Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) throws Throwable {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }
}
