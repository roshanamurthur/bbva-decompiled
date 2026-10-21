package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes10.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] I;
    public static final int[] J;

    @Nullable
    public final AccessibilityManager F;
    public boolean G;

    @Nullable
    public Callback H;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i10) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i10 = R.attr.snackbarButtonStyle;
        I = new int[]{i10};
        J = new int[]{i10, R.attr.snackbarTextViewStyle};
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.F = (AccessibilityManager) viewGroup.getContext().getSystemService(Constants.ACCESSIBILITY);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:33:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:3:0x0002->B:37:?, LOOP_END, SYNTHETIC] */
    @NonNull
    public static Snackbar f(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroup.getContext();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(J);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i10);
        return snackbar;
    }

    @Deprecated
    public static boolean hasSnackbarButtonStyleAttr(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return f(null, view, charSequence, i10);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.F;
        if (i10 >= 29) {
            return accessibilityManager.getRecommendedTimeoutMillis(duration, (this.G ? 4 : 0) | 3);
        }
        if (this.G && accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@StringRes int i10, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i10), onClickListener);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(@ColorInt int i10) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getActionView().setTextColor(i10);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(@ColorInt int i10) {
        return setBackgroundTintList(ColorStateList.valueOf(i10));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(@Nullable Callback callback) {
        Callback callback2 = this.H;
        if (callback2 != null) {
            removeCallback(callback2);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.H = callback;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(@Dimension int i10) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).setMaxInlineActionWidth(i10);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@StringRes int i10) {
        return setText(getContext().getText(i10));
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(@ColorInt int i10) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setTextColor(i10);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int i10) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setMaxLines(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @NonNull
    public static Snackbar make(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return f(context, view, charSequence, i10);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setAction(@Nullable CharSequence charSequence, @Nullable final View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.view.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.G = false;
        } else {
            this.G = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int[] iArr = Snackbar.I;
                    Snackbar snackbar = this.f45470p0;
                    snackbar.getClass();
                    onClickListener.onClick(view);
                    snackbar.dispatchDismiss(1);
                }
            });
        }
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setText(@NonNull CharSequence charSequence) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @StringRes int i10, int i11) {
        return make(view, view.getResources().getText(i10), i11);
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.view.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }
}
