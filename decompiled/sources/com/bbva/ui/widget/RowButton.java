package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ui.R;
import com.bbva.ui.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0018"}, d2 = {"Lcom/bbva/ui/widget/RowButton;", "Landroid/widget/LinearLayout;", "Landroid/graphics/drawable/Drawable;", PluginUtils.IDENTIFIER_DRAWABLE, "", "setCircularBackground", "Landroid/content/res/ColorStateList;", "color", "setContentColor", "", "resId", "setImage", "setText", "", "text", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRowButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowButton.kt\ncom/bbva/ui/widget/RowButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,103:1\n233#2,3:104\n*S KotlinDebug\n*F\n+ 1 RowButton.kt\ncom/bbva/ui/widget/RowButton\n*L\n67#1:104,3\n*E\n"})
public final class RowButton extends LinearLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public FrameLayout f37720p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f37721q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f37722r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f37723s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f37724t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f37725u0;

    @NotNull
    public String v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.v0 = "";
        a(null, R.style.Widget_BBVA_Button_Row);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        setOrientation(1);
        setGravity(1);
        View.inflate(getContext(), R.layout.ui_row_button, this);
        View viewFindViewById = findViewById(R.id.circularFrameLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f37720p0 = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f37721q0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.textView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f37722r0 = (TextView) viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.RowButton, 0, i10);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.RowButton_circularBackground);
        if (drawable == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = new ColorDrawable(ContextKt.themeColor(context, com.google.android.material.R.attr.colorSurface));
        }
        this.f37723s0 = drawable;
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.RowButton_contentColor);
        if (colorStateList == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            colorStateList = ColorStateList.valueOf(ContextKt.themeColor(context2, com.google.android.material.R.attr.colorOnSurface));
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        this.f37724t0 = colorStateList;
        this.f37725u0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RowButton_image, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.RowButton_text);
        if (string == null) {
            string = "";
        } else {
            Intrinsics.checkNotNull(string);
        }
        this.v0 = string;
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable2 = this.f37723s0;
        ColorStateList colorStateList2 = null;
        if (drawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circularBackground");
            drawable2 = null;
        }
        setCircularBackground(drawable2);
        ColorStateList colorStateList3 = this.f37724t0;
        if (colorStateList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentColor");
        } else {
            colorStateList2 = colorStateList3;
        }
        setContentColor(colorStateList2);
        setImage(this.f37725u0);
        setText(this.v0);
    }

    public final void setCircularBackground(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        FrameLayout frameLayout = this.f37720p0;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circularFrameLayout");
            frameLayout = null;
        }
        frameLayout.setBackground(drawable);
    }

    public final void setContentColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        ImageView imageView = this.f37721q0;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageTintList(color);
        TextView textView2 = this.f37722r0;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
        } else {
            textView = textView2;
        }
        textView.setTextColor(color);
    }

    public final void setImage(@DrawableRes int resId) {
        ImageView imageView = this.f37721q0;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageResource(resId);
    }

    public final void setText(@StringRes int resId) {
        TextView textView = this.f37722r0;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setText(resId);
    }

    public final void setText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.f37722r0;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.v0 = "";
        a(attrs, R.style.Widget_BBVA_Button_Row);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButton(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.v0 = "";
        a(attrs, i10);
    }
}
