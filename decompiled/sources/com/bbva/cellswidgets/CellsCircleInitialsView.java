package com.bbva.cellswidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.bbva.cellswidgets.circle.DefaultUsernameInitialsExtractor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsCircleInitialsView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/bbva/cellswidgets/CellsCircleInitialsView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "getHalfCircle", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "initials", "setInitials", "top", "bottom", "configureColors", "fonType", "configureFontFamily", "<set-?>", "p0", "Ljava/lang/String;", "getInitials", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsCircleInitialsView extends View {

    @Nullable
    public RectF E0;

    @NotNull
    public final DefaultUsernameInitialsExtractor F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String initials;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f27232q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f27233r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f27234s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f27235t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f27236u0;

    @NotNull
    public Paint v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public Paint f27237w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public Paint f27238x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public RectF f27239y0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsCircleInitialsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Paint a(int i10) {
        Paint paint = new Paint();
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return paint;
    }

    private final RectF getHalfCircle() {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        int height2 = getWidth() > getHeight() ? getHeight() / 2 : getWidth() / 2;
        RectF rectF = new RectF();
        float f6 = height2;
        rectF.set(width - f6, height - f6, width + f6, height + f6);
        return rectF;
    }

    public final Paint b() {
        Paint paint = new Paint();
        paint.setColor(this.f27235t0);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        if (this.f27236u0 != 0) {
            paint.setTypeface(ResourcesCompat.getFont(getContext(), this.f27236u0));
        }
        return paint;
    }

    public final void configureColors(@ColorInt int top, @ColorInt int bottom) {
        this.f27233r0 = top;
        this.v0 = a(top);
        this.f27234s0 = bottom;
        this.f27237w0 = a(bottom);
    }

    public final void configureFontFamily(int fonType) {
        this.f27236u0 = fonType;
        this.f27238x0 = b();
    }

    @NotNull
    public final String getInitials() {
        return this.initials;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float fDescent = ((this.f27238x0.descent() - this.f27238x0.ascent()) / 2) - this.f27238x0.descent();
        RectF rectF = this.E0;
        RectF rectF2 = this.f27239y0;
        if (rectF == null || rectF2 == null) {
            return;
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f27237w0);
        canvas.drawArc(rectF, 135.0f, 180.0f, false, this.v0);
        canvas.drawText(this.initials, rectF2.centerX(), rectF2.centerY() + fDescent, this.f27238x0);
    }

    @Override // android.view.View
    public void onSizeChanged(int w6, int h4, int oldw, int oldh) {
        super.onSizeChanged(w6, h4, oldw, oldh);
        this.f27238x0.setTextSize((getWidth() > getHeight() ? getHeight() : getWidth()) / this.f27232q0);
        this.f27239y0 = new RectF(0.0f, 0.0f, w6, h4);
        this.E0 = getHalfCircle();
    }

    public final void setInitials(@NotNull String initials) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        String upperCase = this.F0.extract(initials).toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.initials = upperCase;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsCircleInitialsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CellsCircleInitialsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsCircleInitialsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.initials = "";
        this.f27232q0 = 2.8f;
        this.f27233r0 = ViewCompat.MEASURED_STATE_MASK;
        this.f27234s0 = -7829368;
        this.f27235t0 = -1;
        this.F0 = new DefaultUsernameInitialsExtractor();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellsCircleInitialsView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CellsCircleInitialsView_cellsCircleInitialView_initials);
        this.initials = string != null ? string : "";
        this.f27233r0 = typedArrayObtainStyledAttributes.getColor(R.styleable.CellsCircleInitialsView_cellsCircleInitialView_topColor, ViewCompat.MEASURED_STATE_MASK);
        this.f27234s0 = typedArrayObtainStyledAttributes.getColor(R.styleable.CellsCircleInitialsView_cellsCircleInitialView_bottomColor, -7829368);
        this.f27235t0 = typedArrayObtainStyledAttributes.getColor(R.styleable.CellsCircleInitialsView_cellsCircleInitialView_textColor, -1);
        this.f27236u0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CellsCircleInitialsView_cellsCircleInitialView_font, R.font.benton_sans_bbva_light);
        typedArrayObtainStyledAttributes.recycle();
        this.v0 = a(this.f27233r0);
        this.f27237w0 = a(this.f27234s0);
        this.f27238x0 = b();
    }
}
