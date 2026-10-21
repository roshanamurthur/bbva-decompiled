package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final DecelerateInterpolator f1367y0 = new DecelerateInterpolator();
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimator mVisibilityAnim;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public a f1368p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c f1369q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinearLayoutCompat f1370r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppCompatSpinner f1371s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f1372t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1373u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1374w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1375x0;

    public class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1376a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1377b;

        public VisibilityAnimListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1376a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1376a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.mVisibilityAnim = null;
            scrollingTabContainerView.setVisibility(this.f1377b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1376a = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i10) {
            this.f1377b = i10;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f1379p0;

        public a(View view) {
            this.f1379p0 = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f1379p0;
            int left = view.getLeft();
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
            scrollingTabContainerView.f1368p0 = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.f1370r0.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            return ((d) ScrollingTabContainerView.this.f1370r0.getChildAt(i10)).f1383p0;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.a((ActionBar.Tab) getItem(i10), true);
            }
            d dVar = (d) view;
            dVar.f1383p0 = (ActionBar.Tab) getItem(i10);
            dVar.a();
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((d) view).f1383p0.select();
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            int childCount = scrollingTabContainerView.f1370r0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = scrollingTabContainerView.f1370r0.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ActionBar.Tab f1383p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AppCompatTextView f1384q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AppCompatImageView f1385r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public View f1386s0;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, ActionBar.Tab tab, boolean z10) {
            int i10 = R.attr.actionBarTabStyle;
            super(context, null, i10);
            int[] iArr = {android.R.attr.background};
            this.f1383p0 = tab;
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr, i10, 0);
            if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            if (z10) {
                setGravity(8388627);
            }
            a();
        }

        public final void a() {
            ActionBar.Tab tab = this.f1383p0;
            View customView = tab.getCustomView();
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f1386s0 = customView;
                AppCompatTextView appCompatTextView = this.f1384q0;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f1385r0;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f1385r0.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1386s0;
            if (view != null) {
                removeView(view);
                this.f1386s0 = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.f1385r0 == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f1385r0 = appCompatImageView2;
                }
                this.f1385r0.setImageDrawable(icon);
                this.f1385r0.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f1385r0;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f1385r0.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(text);
            if (z10) {
                if (this.f1384q0 == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f1384q0 = appCompatTextView2;
                }
                this.f1384q0.setText(text);
                this.f1384q0.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f1384q0;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f1384q0.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f1385r0;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(tab.getContentDescription());
            }
            TooltipCompat.setTooltipText(this, z10 ? null : tab.getContentDescription());
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.f1373u0 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = scrollingTabContainerView.f1373u0;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.v0 = actionBarPolicy.getStackedTabMaxWidth();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f1370r0 = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final d a(ActionBar.Tab tab, boolean z10) {
        d dVar = new d(getContext(), tab, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1374w0));
        } else {
            dVar.setFocusable(true);
            if (this.f1369q0 == null) {
                this.f1369q0 = new c();
            }
            dVar.setOnClickListener(this.f1369q0);
        }
        return dVar;
    }

    public void addTab(ActionBar.Tab tab, boolean z10) {
        d dVarA = a(tab, false);
        this.f1370r0.addView(dVarA, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null) {
            ((b) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarA.setSelected(true);
        }
        if (this.f1372t0) {
            requestLayout();
        }
    }

    public void animateToTab(int i10) {
        View childAt = this.f1370r0.getChildAt(i10);
        Runnable runnable = this.f1368p0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1368p0 = aVar;
        post(aVar);
    }

    public void animateToVisibility(int i10) {
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        DecelerateInterpolator decelerateInterpolator = f1367y0;
        if (i10 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(decelerateInterpolator);
            viewPropertyAnimatorAlpha.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorAlpha, i10));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(decelerateInterpolator);
        viewPropertyAnimatorAlpha2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorAlpha2, i10));
        viewPropertyAnimatorAlpha2.start();
    }

    public final void b() {
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
            removeView(this.f1371s0);
            addView(this.f1370r0, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1371s0.getSelectedItemPosition());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1368p0;
        if (aVar != null) {
            post(aVar);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.v0 = actionBarPolicy.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1368p0;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).f1383p0.select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        LinearLayoutCompat linearLayoutCompat = this.f1370r0;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1373u0 = -1;
        } else {
            if (childCount > 2) {
                this.f1373u0 = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1373u0 = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1373u0 = Math.min(this.f1373u0, this.v0);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1374w0, 1073741824);
        if (z10 || !this.f1372t0) {
            b();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                AppCompatSpinner appCompatSpinner = this.f1371s0;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f1371s0 == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f1371s0 = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f1371s0, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f1371s0.getAdapter() == null) {
                        this.f1371s0.setAdapter((SpinnerAdapter) new b());
                    }
                    Runnable runnable = this.f1368p0;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f1368p0 = null;
                    }
                    this.f1371s0.setSelection(this.f1375x0);
                }
            } else {
                b();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1375x0);
    }

    public void removeAllTabs() {
        this.f1370r0.removeAllViews();
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null) {
            ((b) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1372t0) {
            requestLayout();
        }
    }

    public void removeTabAt(int i10) {
        this.f1370r0.removeViewAt(i10);
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null) {
            ((b) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1372t0) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z10) {
        this.f1372t0 = z10;
    }

    public void setContentHeight(int i10) {
        this.f1374w0 = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1375x0 = i10;
        LinearLayoutCompat linearLayoutCompat = this.f1370r0;
        int childCount = linearLayoutCompat.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                animateToTab(i10);
            }
            i11++;
        }
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner == null || i10 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i10);
    }

    public void updateTab(int i10) {
        ((d) this.f1370r0.getChildAt(i10)).a();
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null) {
            ((b) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1372t0) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, int i10, boolean z10) {
        d dVarA = a(tab, false);
        this.f1370r0.addView(dVarA, i10, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        AppCompatSpinner appCompatSpinner = this.f1371s0;
        if (appCompatSpinner != null) {
            ((b) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarA.setSelected(true);
        }
        if (this.f1372t0) {
            requestLayout();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
