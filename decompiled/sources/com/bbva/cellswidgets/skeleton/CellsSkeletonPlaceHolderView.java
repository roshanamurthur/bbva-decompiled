package com.bbva.cellswidgets.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import com.bbva.cellswidgets.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsSkeletonPlaceHolderView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/cellswidgets/skeleton/CellsSkeletonPlaceHolderView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "value", "setSharpOffsetStart", "setSharpOffsetEnd", "", "setColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsSkeletonPlaceHolderView extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Path f27311p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Paint f27312q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f27313r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f27314s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f27315t0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonPlaceHolderView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.f27311p0;
        path.reset();
        path.moveTo(this.f27313r0 + 0.0f, 0.0f);
        path.lineTo(getWidth(), 0.0f);
        path.lineTo(getWidth() - this.f27314s0, getHeight());
        path.lineTo(0.0f, getHeight());
        path.close();
        Paint paint = this.f27312q0;
        paint.setColor(this.f27315t0);
        canvas.drawPath(path, paint);
    }

    public final void setColor(@ColorRes int value) {
        this.f27315t0 = value;
        invalidate();
    }

    public final void setSharpOffsetEnd(float value) {
        this.f27314s0 = value;
        invalidate();
    }

    public final void setSharpOffsetStart(float value) {
        this.f27313r0 = value;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonPlaceHolderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonPlaceHolderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CellsSkeletonPlaceHolderView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSkeletonPlaceHolderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27311p0 = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f27312q0 = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellsSkeletonPlaceHolderView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f27315t0 = typedArrayObtainStyledAttributes.getColor(R.styleable.CellsSkeletonPlaceHolderView_cellsSkeletonPlaceHolderView_color, 0);
        this.f27313r0 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsSkeletonPlaceHolderView_cellsSkeletonPlaceHolderView_sharpOffsetStart, 0.0f);
        this.f27314s0 = typedArrayObtainStyledAttributes.getDimension(R.styleable.CellsSkeletonPlaceHolderView_cellsSkeletonPlaceHolderView_sharpOffsetEnd, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
