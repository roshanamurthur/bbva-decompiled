package com.mastercard.sonic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mastercard.sonic.R;
import com.mastercard.sonic.androidsvg.SVG;
import com.mastercard.sonic.androidsvg.SVGImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SonicView.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014R*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/mastercard/sonic/widget/SonicView;", "Landroid/widget/FrameLayout;", "Lcom/mastercard/sonic/androidsvg/SVG;", "svg", "", "setSvg$sonic_sdk_release", "(Lcom/mastercard/sonic/androidsvg/SVG;)V", "setSvg", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Lcom/mastercard/sonic/widget/SonicBackground;", "value", "p0", "Lcom/mastercard/sonic/widget/SonicBackground;", "getBackground", "()Lcom/mastercard/sonic/widget/SonicBackground;", "setBackground", "(Lcom/mastercard/sonic/widget/SonicBackground;)V", "background", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicView extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SonicBackground background;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SVGImageView f51594q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f51595r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f51596s0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SonicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    @NotNull
    public final SonicBackground getBackground() {
        return this.background;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getLayoutParams().height == -2 || getLayoutParams().width == -2) {
            getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.sonic_default_height);
            getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.sonic_default_width);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            return;
        }
        if (this.f51595r0 == getMeasuredWidth() && this.f51596s0 == getMeasuredHeight()) {
            return;
        }
        this.f51595r0 = getMeasuredWidth();
        this.f51596s0 = getMeasuredHeight();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SVGImageView sVGImageView = this.f51594q0;
        sVGImageView.setLayoutParams(layoutParams);
        if (sVGImageView.getVisibility() == 4) {
            sVGImageView.setVisibility(0);
        }
        invalidate();
    }

    public final void setBackground(@NotNull SonicBackground value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.background = value;
        SonicBackground sonicBackground = SonicBackground.BLACK;
        SVGImageView sVGImageView = this.f51594q0;
        if (value == sonicBackground) {
            sVGImageView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            sVGImageView.setBackgroundColor(-1);
        }
    }

    public final void setSvg$sonic_sdk_release(@NotNull SVG svg) {
        Intrinsics.checkNotNullParameter(svg, "svg");
        this.f51594q0.setSVG(svg);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SonicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SonicView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SonicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        SonicBackground sonicBackground = SonicBackground.BLACK;
        this.background = sonicBackground;
        SVGImageView sVGImageView = new SVGImageView(context, null, 0, 6, null);
        this.f51594q0 = sVGImageView;
        setWillNotDraw(false);
        setLayerType(2, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SonicView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.SonicView)");
        setBackground(SonicBackground.values()[typedArrayObtainStyledAttributes.getInteger(R.styleable.SonicView_sonicBackground, sonicBackground.getColor())]);
        sVGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        typedArrayObtainStyledAttributes.recycle();
        addView(sVGImageView);
        sVGImageView.setVisibility(4);
    }
}
