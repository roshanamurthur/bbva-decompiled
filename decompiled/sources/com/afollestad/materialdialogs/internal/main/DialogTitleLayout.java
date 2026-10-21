package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogTitleLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J0\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", "", "onFinishInflate", "", "shouldNotBeVisible", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "getIconView$com_afollestad_material_dialogs_core", "()Landroid/widget/ImageView;", "setIconView$com_afollestad_material_dialogs_core", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "getTitleView$com_afollestad_material_dialogs_core", "()Landroid/widget/TextView;", "setTitleView$com_afollestad_material_dialogs_core", "(Landroid/widget/TextView;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogTitleLayout extends BaseSubLayout {

    @NotNull
    public ImageView iconView;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f25535s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f25536t0;

    @NotNull
    public TextView titleView;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f25537u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f25538w0;

    public /* synthetic */ DialogTitleLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public final ImageView getIconView$com_afollestad_material_dialogs_core() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        return imageView;
    }

    @NotNull
    public final TextView getTitleView$com_afollestad_material_dialogs_core() {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        return textView;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, getMeasuredHeight() - getDividerHeight(), getMeasuredWidth(), getMeasuredHeight(), dividerPaint());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_icon_title);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.md_icon_title)");
        this.iconView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.md_text_title);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.md_text_title)");
        this.titleView = (TextView) viewFindViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        if (shouldNotBeVisible()) {
            return;
        }
        int measuredHeight = getMeasuredHeight() - this.f25536t0;
        int i10 = measuredHeight - ((measuredHeight - this.f25535s0) / 2);
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        int measuredHeight2 = textView.getMeasuredHeight() / 2;
        int i11 = i10 - measuredHeight2;
        int i12 = measuredHeight2 + i10;
        boolean zIsRtl = ViewsKt.isRtl(this);
        int measuredWidth4 = this.f25537u0;
        if (zIsRtl) {
            measuredWidth = getMeasuredWidth() - measuredWidth4;
            TextView textView2 = this.titleView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            measuredWidth4 = measuredWidth - textView2.getMeasuredWidth();
        } else {
            TextView textView3 = this.titleView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            measuredWidth = textView3.getMeasuredWidth() + measuredWidth4;
        }
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView)) {
            ImageView imageView2 = this.iconView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
            int i13 = i10 - measuredHeight3;
            int i14 = i10 + measuredHeight3;
            boolean zIsRtl2 = ViewsKt.isRtl(this);
            int i15 = this.v0;
            if (zIsRtl2) {
                ImageView imageView3 = this.iconView;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                measuredWidth4 = measuredWidth - imageView3.getMeasuredWidth();
                measuredWidth3 = measuredWidth4 - i15;
                TextView textView4 = this.titleView;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                measuredWidth2 = measuredWidth3 - textView4.getMeasuredWidth();
            } else {
                ImageView imageView4 = this.iconView;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                measuredWidth = imageView4.getMeasuredWidth() + measuredWidth4;
                measuredWidth2 = i15 + measuredWidth;
                TextView textView5 = this.titleView;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                measuredWidth3 = textView5.getMeasuredWidth() + measuredWidth2;
            }
            ImageView imageView5 = this.iconView;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            imageView5.layout(measuredWidth4, i13, measuredWidth, i14);
            measuredWidth = measuredWidth3;
            measuredWidth4 = measuredWidth2;
        }
        TextView textView6 = this.titleView;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView6.layout(measuredWidth4, i11, measuredWidth, i12);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight = 0;
        if (shouldNotBeVisible()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int measuredWidth = size - (this.f25537u0 * 2);
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView)) {
            ImageView imageView2 = this.iconView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            int i10 = this.f25538w0;
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            ImageView imageView3 = this.iconView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            measuredWidth -= imageView3.getMeasuredWidth() + this.v0;
        }
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.iconView;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView4)) {
            ImageView imageView5 = this.iconView;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            measuredHeight = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.titleView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        setMeasuredDimension(size, Math.max(measuredHeight, textView2.getMeasuredHeight()) + this.f25535s0 + this.f25536t0);
    }

    public final void setIconView$com_afollestad_material_dialogs_core(@NotNull ImageView imageView) {
        this.iconView = imageView;
    }

    public final void setTitleView$com_afollestad_material_dialogs_core(@NotNull TextView textView) {
        this.titleView = textView;
    }

    public final boolean shouldNotBeVisible() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isNotVisible(imageView)) {
            TextView textView = this.titleView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            if (ViewsKt.isNotVisible(textView)) {
                return true;
            }
        }
        return false;
    }

    public DialogTitleLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        MDUtil mDUtil = MDUtil.INSTANCE;
        this.f25535s0 = mDUtil.dimenPx(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f25536t0 = mDUtil.dimenPx(this, R.dimen.md_dialog_title_layout_margin_bottom);
        this.f25537u0 = mDUtil.dimenPx(this, R.dimen.md_dialog_frame_margin_horizontal);
        this.v0 = mDUtil.dimenPx(this, R.dimen.md_icon_margin);
        this.f25538w0 = mDUtil.dimenPx(this, R.dimen.md_icon_size);
    }
}
