package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SearchBar extends Toolbar {
    public static final int D1 = R.style.Widget_Material3_SearchBar;
    public final MaterialShapeDrawable A1;

    @Nullable
    public final AccessibilityManager B1;
    public final com.dasnano.vdphotoselfiecapture.fragments.b C1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final TextView f45121o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final boolean f45122p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final boolean f45123q1;
    public final l r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final Drawable f45124s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final boolean f45125t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final boolean f45126u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @Nullable
    public View f45127v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @Nullable
    public final Integer f45128w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @Nullable
    public Drawable f45129x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f45130y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public boolean f45131z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f45132q0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f45132q0 = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f45132q0);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z10);
        navigationIconButton.setFocusable(!z10);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.f45129x1 = background;
        }
        navigationIconButton.setBackgroundDrawable(z10 ? null : this.f45129x1);
        r();
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.r1.f45165c.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.r1.f45164b.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.r1.f45163a.add(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f45122p1 && this.f45127v1 == null && !(view instanceof ActionMenuView)) {
            this.f45127v1 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public void clearText() {
        this.f45121o1.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view) {
        return expand(view, null);
    }

    @Nullable
    public View getCenterView() {
        return this.f45127v1;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.A1;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : ViewCompat.getElevation(this);
    }

    public float getCornerSize() {
        return this.A1.getTopLeftCornerResolvedSize();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f45121o1.getHint();
    }

    public int getMenuResId() {
        return this.f45130y1;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.A1.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.A1.getStrokeWidth();
    }

    @NonNull
    public CharSequence getText() {
        return this.f45121o1.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f45121o1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof MenuBuilder;
        if (z10) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i10);
        this.f45130y1 = i10;
        if (z10) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.r1.f45169g;
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.f45131z1;
    }

    public boolean isExpanding() {
        return this.r1.f45168f;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.r1.f45170h;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.A1);
        if (this.f45123q1 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 == 0) {
                i10 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i10;
            int i11 = marginLayoutParams.topMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i11;
            int i12 = marginLayoutParams.rightMargin;
            if (i12 != 0) {
                dimensionPixelSize = i12;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i13 = marginLayoutParams.bottomMargin;
            if (i13 != 0) {
                dimensionPixelSize2 = i13;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        s();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f45127v1;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i14 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f45127v1.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i15 = measuredHeight + measuredHeight2;
            View view2 = this.f45127v1;
            if (ViewCompat.getLayoutDirection(this) == 1) {
                view2.layout(getMeasuredWidth() - i14, measuredHeight2, getMeasuredWidth() - measuredWidth2, i15);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i14, i15);
            }
        }
        r();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View view = this.f45127v1;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f45132q0);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f45132q0 = text == null ? null : text.toString();
        return savedState;
    }

    public final void r() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z10 = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null || !navigationIconButton.isClickable()) {
            width = 0;
        } else {
            width = z10 ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        }
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        if (actionMenuView != null) {
            right = z10 ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f6 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f6, 0.0f, -width, 0.0f);
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.r1.f45165c.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.r1.f45164b.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.r1.f45163a.remove(onLoadAnimationCallback);
    }

    public final void s() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f45131z1) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f45127v1;
        if (view2 != null) {
            removeView(view2);
            this.f45127v1 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f45131z1 = z10;
        s();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeDrawable materialShapeDrawable = this.A1;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f6);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f45121o1.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        int color;
        if (this.f45125t1 && drawable != null) {
            Integer num = this.f45128w1;
            if (num != null) {
                color = num.intValue();
            } else {
                color = MaterialColors.getColor(this, drawable == this.f45124s1 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, color);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f45126u1) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.r1.f45170h = z10;
    }

    public void setStrokeColor(@ColorInt int i10) {
        if (getStrokeColor() != i10) {
            this.A1.setStrokeColor(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(@Dimension float f6) {
        if (getStrokeWidth() != f6) {
            this.A1.setStrokeWidth(f6);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f45121o1.setText(charSequence);
    }

    public void startOnLoadAnimation() {
        post(new androidx.activity.h(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopOnLoadAnimation() {
        l lVar = this.r1;
        AnimatorSet animatorSet = lVar.f45166d;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = lVar.f45167e;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
        View centerView = getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f45133w0;

        public ScrollingViewBehavior() {
            this.f45133w0 = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f45133w0 && (view2 instanceof AppBarLayout)) {
                this.f45133w0 = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return zOnDependentViewChanged;
        }

        @Override // zd.e
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f45133w0 = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(@StringRes int i10) {
        this.f45121o1.setHint(i10);
    }

    public void setText(@StringRes int i10) {
        this.f45121o1.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = D1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f45130y1 = -1;
        this.C1 = new com.dasnano.vdphotoselfiecapture.fragments.b(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", NotificationMessage.NOTIF_KEY_SUB_TITLE) != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawable = AppCompatResources.getDrawable(context2, getDefaultNavigationIconResource());
        this.f45124s1 = drawable;
        this.r1 = new l();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchBar, i10, i11, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_backgroundTint, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_elevation, 0.0f);
        this.f45123q1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.f45131z1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_hideNavigationIcon, false);
        this.f45126u1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f45125t1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_tintNavigationIcon, true);
        int i12 = R.styleable.SearchBar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f45128w1 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_strokeColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawable);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.f45122p1 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f45121o1 = textView;
        ViewCompat.setElevation(this, dimension);
        if (resourceId != -1) {
            TextViewCompat.setTextAppearance(textView, resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        this.A1 = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.A1.setElevation(dimension);
        if (dimension2 >= 0.0f) {
            this.A1.setStroke(dimension2, color2);
        }
        int color3 = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.A1.setFillColor(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color3);
        MaterialShapeDrawable materialShapeDrawable2 = this.A1;
        ViewCompat.setBackground(this, new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY);
        this.B1 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new b(this));
        }
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z10) {
        Animator animator;
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        l lVar = this.r1;
        if (lVar.f45168f && (animator = lVar.f45171i) != null) {
            animator.cancel();
        }
        lVar.f45169g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator collapseAnimator = l.a(this, view, appBarLayout).setDuration(250L).addListener(new k(lVar, this)).getCollapseAnimator();
        List<View> children = ViewUtils.getChildren(this);
        if (getCenterView() != null) {
            children.remove(getCenterView());
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        animatorSet.playSequentially(collapseAnimator, valueAnimatorOfFloat);
        animatorSet.addListener(new j(lVar));
        Iterator it = lVar.f45165c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener((AnimatorListenerAdapter) it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        lVar.f45171i = animatorSet;
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull final View view, @Nullable final AppBarLayout appBarLayout, final boolean z10) {
        Animator animator;
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        final l lVar = this.r1;
        if (lVar.f45169g && (animator = lVar.f45171i) != null) {
            animator.cancel();
        }
        lVar.f45168f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.c
            @Override // java.lang.Runnable
            public final void run() {
                l lVar2 = lVar;
                lVar2.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                SearchBar searchBar = this;
                List<View> children = ViewUtils.getChildren(searchBar);
                if (searchBar.getCenterView() != null) {
                    children.remove(searchBar.getCenterView());
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
                final View view2 = view;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.e
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.setAlpha(0.0f);
                    }
                });
                valueAnimatorOfFloat.setDuration(75L);
                valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
                animatorSet.playSequentially(valueAnimatorOfFloat, l.a(searchBar, view2, appBarLayout).setDuration(300L).addListener(new i(lVar2, searchBar)).getExpandAnimator());
                animatorSet.addListener(new h(lVar2));
                Iterator it = lVar2.f45164b.iterator();
                while (it.hasNext()) {
                    animatorSet.addListener((AnimatorListenerAdapter) it.next());
                }
                if (z10) {
                    animatorSet.setDuration(0L);
                }
                animatorSet.start();
                lVar2.f45171i = animatorSet;
            }
        });
        return true;
    }

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
