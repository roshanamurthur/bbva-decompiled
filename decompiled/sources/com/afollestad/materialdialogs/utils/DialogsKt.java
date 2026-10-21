package com.afollestad.materialdialogs.utils;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.checkbox.DialogCheckboxExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Dialogs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a/\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000e\u001aQ\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u001b"}, d2 = {"hideKeyboard", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invalidateDividers", "showTop", "", "showBottom", "populateIcon", "imageView", "Landroid/widget/ImageView;", "iconRes", "", "icon", "Landroid/graphics/drawable/Drawable;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)V", "populateText", "textView", "Landroid/widget/TextView;", "textRes", "text", "", "fallback", "typeface", "Landroid/graphics/Typeface;", "textColor", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;)V", "preShow", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class DialogsKt {
    public static final void hideKeyboard(@NotNull MaterialDialog materialDialog) {
        Object systemService = materialDialog.getWindowContext().getSystemService(Constants.INPUT_METHOD);
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = materialDialog.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : materialDialog.getView().getWindowToken(), 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void invalidateDividers(@NotNull MaterialDialog materialDialog, boolean z10, boolean z11) {
        materialDialog.getView().invalidateDividers(z10, z11);
    }

    public static final void populateIcon(@NotNull MaterialDialog materialDialog, @NotNull ImageView imageView, @DrawableRes @Nullable Integer num, @Nullable Drawable drawable) {
        Drawable drawableResolveDrawable$default = MDUtil.resolveDrawable$default(MDUtil.INSTANCE, materialDialog.getWindowContext(), num, null, drawable, 4, null);
        if (drawableResolveDrawable$default == null) {
            imageView.setVisibility(8);
            return;
        }
        Object parent = imageView.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).setVisibility(0);
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawableResolveDrawable$default);
    }

    public static final void populateText(@NotNull MaterialDialog materialDialog, @NotNull TextView textView, @StringRes @Nullable Integer num, @Nullable CharSequence charSequence, @StringRes int i10, @Nullable Typeface typeface, @Nullable Integer num2) {
        if (charSequence == null) {
            charSequence = MDUtil.resolveString$default(MDUtil.INSTANCE, materialDialog, num, Integer.valueOf(i10), false, 8, (Object) null);
        }
        if (charSequence == null) {
            textView.setVisibility(8);
            return;
        }
        Object parent = textView.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).setVisibility(0);
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        MDUtil.maybeSetTextColor$default(MDUtil.INSTANCE, textView, materialDialog.getWindowContext(), num2, null, 4, null);
    }

    public static final void preShow(@NotNull MaterialDialog materialDialog) {
        Object obj = materialDialog.getConfig().get(DialogCustomViewExtKt.CUSTOM_VIEW_NO_VERTICAL_PADDING);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean zAreEqual = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
        DialogCallbackExtKt.invokeAll(materialDialog.getPreShowListeners$com_afollestad_material_dialogs_core(), materialDialog);
        DialogLayout view = materialDialog.getView();
        if (view.getTitleLayout().shouldNotBeVisible() && !zAreEqual) {
            view.getContentLayout().modifyFirstAndLastPadding(view.getFrameMarginVertical(), view.getFrameMarginVertical());
        }
        if (ViewsKt.isVisible(DialogCheckboxExtKt.getCheckBoxPrompt(materialDialog))) {
            DialogContentLayout.modifyFirstAndLastPadding$default(view.getContentLayout(), 0, 0, 1, null);
        } else if (view.getContentLayout().haveMoreThanOneChild()) {
            DialogContentLayout.modifyScrollViewPadding$default(view.getContentLayout(), 0, view.getFrameMarginVerticalLess(), 1, null);
        }
    }
}
