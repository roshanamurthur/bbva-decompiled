package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.s1;
import androidx.camera.core.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    public static final int X0 = R.style.Widget_Material3_SearchView;
    public final ImageButton E0;
    public final View F0;
    public final TouchObserverFrameLayout G0;
    public final boolean H0;
    public final w I0;

    @NonNull
    public final MaterialBackOrchestrator J0;
    public final boolean K0;
    public final ElevationOverlayProvider L0;
    public final LinkedHashSet M0;

    @Nullable
    public SearchBar N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;

    @ColorInt
    public final int S0;
    public boolean T0;
    public boolean U0;

    @NonNull
    public TransitionState V0;
    public HashMap W0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final View f45134p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f45135q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final View f45136r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final View f45137s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final FrameLayout f45138t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final FrameLayout f45139u0;
    public final MaterialToolbar v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Toolbar f45140w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final TextView f45141x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final EditText f45142y0;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f45143q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f45144r0;

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
            this.f45143q0 = parcel.readString();
            this.f45144r0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f45143q0);
            parcel.writeInt(this.f45144r0);
        }
    }

    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES;
        public static final TransitionState HIDDEN;
        public static final TransitionState HIDING;
        public static final TransitionState SHOWING;
        public static final TransitionState SHOWN;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            HIDING = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            HIDDEN = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            SHOWING = transitionState3;
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            SHOWN = transitionState4;
            $VALUES = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) $VALUES.clone();
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(SearchView searchView, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        searchView.setUpStatusBarSpacer(systemWindowInsetTop);
        if (searchView.U0) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(systemWindowInsetTop > 0);
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.N0;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", PluginUtils.IDENTIFIER_DIMENSION, "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f45137s0.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f6) {
        View view;
        ElevationOverlayProvider elevationOverlayProvider = this.L0;
        if (elevationOverlayProvider == null || (view = this.f45136r0) == null) {
            return;
        }
        view.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.S0, f6));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f45138t0, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int i10) {
        View view = this.f45137s0;
        if (view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            view.requestLayout();
        }
    }

    public void addHeaderView(@NonNull View view) {
        FrameLayout frameLayout = this.f45138t0;
        frameLayout.addView(view);
        frameLayout.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.M0.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.H0) {
            this.G0.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final boolean b() {
        return this.O0 == 48;
    }

    public final boolean c() {
        return this.V0.equals(TransitionState.HIDDEN) || this.V0.equals(TransitionState.HIDING);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (c() || this.N0 == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        w wVar = this.I0;
        wVar.m.cancelBackProgress(wVar.f45200o);
        AnimatorSet animatorSet = wVar.f45199n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        wVar.f45199n = null;
    }

    public void clearFocusAndHideKeyboard() {
        this.f45142y0.post(new k0.e(this, 5));
    }

    public void clearText() {
        this.f45142y0.setText("");
    }

    public final void d(@NonNull TransitionState transitionState, boolean z10) {
        if (this.V0.equals(transitionState)) {
            return;
        }
        if (z10) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.V0;
        this.V0 = transitionState;
        Iterator it = new LinkedHashSet(this.M0).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        f(transitionState);
    }

    @SuppressLint({"InlinedApi"})
    public final void e(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f45135q0.getId()) != null) {
                    e((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.W0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                } else {
                    HashMap map = this.W0;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.W0.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void f(@NonNull TransitionState transitionState) {
        if (this.N0 == null || !this.K0) {
            return;
        }
        boolean zEquals = transitionState.equals(TransitionState.SHOWN);
        MaterialBackOrchestrator materialBackOrchestrator = this.J0;
        if (zEquals) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    public final void g() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.v0);
        if (navigationIconButton == null) {
            return;
        }
        int i10 = this.f45135q0.getVisibility() == 0 ? 1 : 0;
        Drawable drawableUnwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (drawableUnwrap instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableUnwrap).setProgress(i10);
        }
        if (drawableUnwrap instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableUnwrap).setProgress(i10);
        }
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.I0.m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.V0;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.f45142y0;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f45142y0.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f45141x0;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f45141x0.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.O0;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f45142y0.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.v0;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (c()) {
            return;
        }
        w wVar = this.I0;
        BackEventCompat backEventCompatOnHandleBackInvoked = wVar.m.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT < 34 || this.N0 == null || backEventCompatOnHandleBackInvoked == null) {
            hide();
            return;
        }
        wVar.m.finishBackProgress(wVar.j().getTotalDuration(), wVar.f45200o);
        if (wVar.f45199n != null) {
            wVar.c(false).start();
            wVar.f45199n.resume();
        }
        wVar.f45199n = null;
    }

    public void hide() {
        if (this.V0.equals(TransitionState.HIDDEN) || this.V0.equals(TransitionState.HIDING)) {
            return;
        }
        this.I0.j();
    }

    public void inflateMenu(@MenuRes int i10) {
        this.v0.inflateMenu(i10);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.P0;
    }

    public boolean isAutoShowKeyboard() {
        return this.R0;
    }

    public boolean isMenuItemsAnimated() {
        return this.Q0;
    }

    public boolean isSetupWithSearchBar() {
        return this.N0 != null;
    }

    public boolean isShowing() {
        return this.V0.equals(TransitionState.SHOWN) || this.V0.equals(TransitionState.SHOWING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.T0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f45143q0);
        setVisible(savedState.f45144r0 == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f45143q0 = text == null ? null : text.toString();
        savedState.f45144r0 = this.f45135q0.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        FrameLayout frameLayout = this.f45138t0;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        FrameLayout frameLayout = this.f45138t0;
        frameLayout.removeView(view);
        if (frameLayout.getChildCount() == 0) {
            frameLayout.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.M0.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.f45142y0.postDelayed(new z(this, 5), 100L);
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.P0 = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.R0 = z10;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        setUpBackgroundViewElevationOverlay(f6);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f45142y0.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.Q0 = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.W0 = new HashMap(viewGroup.getChildCount());
        }
        e(viewGroup, z10);
        if (z10) {
            return;
        }
        this.W0 = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.v0.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        TextView textView = this.f45141x0;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.U0 = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f45142y0.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.v0.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        d(transitionState, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.T0 = z10;
    }

    public void setVisible(boolean z10) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f45135q0;
        boolean z11 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z10 ? 0 : 8);
        g();
        d(z10 ? TransitionState.SHOWN : TransitionState.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.N0 = searchBar;
        this.I0.k(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new w5.a(this, 4));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new androidx.appcompat.app.f(this, 5));
                    this.f45142y0.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.v0;
        if (materialToolbar != null && !(DrawableCompat.unwrap(materialToolbar.getNavigationIcon()) instanceof DrawerArrowDrawable)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.N0 == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableWrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
                if (materialToolbar.getNavigationIconTint() != null) {
                    DrawableCompat.setTint(drawableWrap, materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new FadeThroughDrawable(this.N0.getNavigationIcon(), drawableWrap));
                g();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        f(getCurrentTransitionState());
    }

    public void show() {
        if (this.V0.equals(TransitionState.SHOWN)) {
            return;
        }
        TransitionState transitionState = this.V0;
        TransitionState transitionState2 = TransitionState.SHOWING;
        if (transitionState.equals(transitionState2)) {
            return;
        }
        w wVar = this.I0;
        SearchBar searchBar = wVar.f45200o;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = wVar.f45189c;
        SearchView searchView = wVar.f45187a;
        if (searchBar == null) {
            if (searchView.b()) {
                searchView.postDelayed(new r1(searchView, 7), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new s1(wVar, 6));
            return;
        }
        if (searchView.b() && searchView.R0) {
            searchView.requestFocusAndShowKeyboard();
        }
        searchView.setTransitionState(transitionState2);
        Toolbar toolbar = wVar.f45193g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (wVar.f45200o.getMenuResId() == -1 || !searchView.isMenuItemsAnimated()) {
            toolbar.setVisibility(8);
        } else {
            toolbar.inflateMenu(wVar.f45200o.getMenuResId());
            ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
            if (actionMenuView != null) {
                for (int i10 = 0; i10 < actionMenuView.getChildCount(); i10++) {
                    View childAt = actionMenuView.getChildAt(i10);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        CharSequence text = wVar.f45200o.getText();
        EditText editText = wVar.f45195i;
        editText.setText(text);
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new androidx.activity.b(wVar, 2));
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (c() || this.N0 == null) {
            return;
        }
        w wVar = this.I0;
        wVar.m.startBackProgress(backEventCompat, wVar.f45200o);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (c() || this.N0 == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        w wVar = this.I0;
        wVar.getClass();
        if (backEventCompat.getProgress() <= 0.0f) {
            return;
        }
        SearchBar searchBar = wVar.f45200o;
        wVar.m.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = wVar.f45199n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (backEventCompat.getProgress() * wVar.f45199n.getDuration()));
            return;
        }
        SearchView searchView = wVar.f45187a;
        if (searchView.b()) {
            searchView.clearFocusAndHideKeyboard();
        }
        if (searchView.isAnimatedNavigationIcon()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            wVar.b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.of(false, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            wVar.f45199n = animatorSet2;
            animatorSet2.start();
            wVar.f45199n.pause();
        }
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.O0 = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i10) {
        this.f45142y0.setHint(i10);
    }

    public void setText(@StringRes int i10) {
        this.f45142y0.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = X0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.J0 = new MaterialBackOrchestrator(this);
        this.M0 = new LinkedHashSet();
        this.O0 = 16;
        this.V0 = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchView, i10, i11, new int[0]);
        this.S0 = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchView_backgroundTint, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_searchPrefixText);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        this.K0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_backHandlingEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.H0 = true;
        this.f45134p0 = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f45135q0 = clippableRoundedCornerLayout;
        this.f45136r0 = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f45137s0 = viewFindViewById;
        this.f45138t0 = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f45139u0 = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.v0 = materialToolbar;
        this.f45140w0 = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f45141x0 = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f45142y0 = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.E0 = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.F0 = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.G0 = touchObserverFrameLayout;
        this.I0 = new w(this);
        this.L0 = new ElevationOverlayProvider(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new n());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            TextViewCompat.setTextAppearance(editText, resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z11) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new t5.b(this, 2));
            if (z10) {
                DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
                drawerArrowDrawable.setColor(MaterialColors.getColor(this, R.attr.colorOnSurface));
                materialToolbar.setNavigationIcon(drawerArrowDrawable);
            }
        }
        imageButton.setOnClickListener(new n4.k(this, 4));
        editText.addTextChangedListener(new p(this));
        touchObserverFrameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i12 = SearchView.X0;
                SearchView searchView = this.f45172p0;
                if (!searchView.b()) {
                    return false;
                }
                searchView.clearFocusAndHideKeyboard();
                return false;
            }
        });
        ViewUtils.doOnApplyWindowInsets(materialToolbar, new rb.a(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i12 = marginLayoutParams.leftMargin;
        final int i13 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById2, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.o
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i14 = SearchView.X0;
                int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft() + i12;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                marginLayoutParams2.rightMargin = windowInsetsCompat.getSystemWindowInsetRight() + i13;
                return windowInsetsCompat;
            }
        });
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new k9.a(this, 1));
    }
}
