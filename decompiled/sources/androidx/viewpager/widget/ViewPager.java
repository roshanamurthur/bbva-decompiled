package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public boolean E0;
    public g F0;
    public int G0;
    public Drawable H0;
    public int I0;
    public int J0;
    public float K0;
    public float L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public int V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f23888a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public VelocityTracker f23889b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f23890c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f23891d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f23892e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f23893f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f23894g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public long f23895h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public EdgeEffect f23896i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public EdgeEffect f23897j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f23898k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f23899l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f23900m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public ArrayList f23901n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public OnPageChangeListener f23902o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f23903p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public OnPageChangeListener f23904p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList<e> f23905q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public ArrayList f23906q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e f23907r0;
    public PageTransformer r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Rect f23908s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f23909s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PagerAdapter f23910t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f23911t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f23912u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public ArrayList<View> f23913u1;
    public int v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final c f23914v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Parcelable f23915w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f23916w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ClassLoader f23917x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Scroller f23918y0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int[] f23885x1 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final a f23886y1 = new a();

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final b f23887z1 = new b();
    public static final h A1 = new h();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f6, @Px int i11);

        void onPageSelected(int i10);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f6);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f23923q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Parcelable f23924r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ClassLoader f23925s0;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return androidx.appcompat.widget.a.c(sb2, this.f23923q0, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23923q0);
            parcel.writeParcelable(this.f23924r0, i10);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f23923q0 = parcel.readInt();
            this.f23924r0 = parcel.readParcelable(classLoader);
            this.f23925s0 = classLoader;
        }
    }

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f23930b - eVar2.f23930b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f10 = f6 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.o();
        }
    }

    public class d implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Rect f23927p0 = new Rect();

        public d() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
            if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
                return windowInsetsCompatOnApplyWindowInsets;
            }
            int systemWindowInsetLeft = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
            Rect rect = this.f23927p0;
            rect.left = systemWindowInsetLeft;
            rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
            rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
            rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(viewPager.getChildAt(i10), windowInsetsCompatOnApplyWindowInsets);
                rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
            }
            return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f23932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f23933e;
    }

    public class f extends AccessibilityDelegateCompat {
        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            PagerAdapter pagerAdapter2 = viewPager.f23910t0;
            if (pagerAdapter2 != null) {
                z10 = pagerAdapter2.getCount() > 1;
            }
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = viewPager.f23910t0) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter.getCount());
            accessibilityEvent.setFromIndex(viewPager.f23912u0);
            accessibilityEvent.setToIndex(viewPager.f23912u0);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            PagerAdapter pagerAdapter = viewPager.f23910t0;
            accessibilityNodeInfoCompat.setScrollable(pagerAdapter != null && pagerAdapter.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i10 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f23912u0 + 1);
                return true;
            }
            if (i10 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f23912u0 - 1);
            return true;
        }
    }

    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.c();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.c();
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z10 = layoutParams.isDecor;
            if (z10 != layoutParams2.isDecor) {
                return z10 ? 1 : -1;
            }
            return layoutParams.f23921c - layoutParams2.f23921c;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f23905q0 = new ArrayList<>();
        this.f23907r0 = new e();
        this.f23908s0 = new Rect();
        this.v0 = -1;
        this.f23915w0 = null;
        this.f23917x0 = null;
        this.K0 = -3.4028235E38f;
        this.L0 = Float.MAX_VALUE;
        this.Q0 = 1;
        this.f23888a1 = -1;
        this.f23898k1 = true;
        this.f23914v1 = new c();
        this.f23916w1 = 0;
        j();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.O0 != z10) {
            this.O0 = z10;
        }
    }

    public final e a(int i10, int i11) {
        e eVar = new e();
        eVar.f23930b = i10;
        eVar.f23929a = this.f23910t0.instantiateItem((ViewGroup) this, i10);
        eVar.f23932d = this.f23910t0.getPageWidth(i10);
        ArrayList<e> arrayList = this.f23905q0;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i11, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e eVarG;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (eVarG = g(childAt)) != null && eVarG.f23930b == this.f23912u0) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.f23906q1 == null) {
            this.f23906q1 = new ArrayList();
        }
        this.f23906q1.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.f23901n1 == null) {
            this.f23901n1 = new ArrayList();
        }
        this.f23901n1.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        e eVarG;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (eVarG = g(childAt)) != null && eVarG.f23930b == this.f23912u0) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z10 = layoutParams2.isDecor | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.isDecor = z10;
        if (!this.N0) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f23920b = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public boolean arrowScroll(int i10) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        parent2.getClass();
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean zL = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f23908s0;
            if (i10 == 17) {
                int i11 = f(viewFindNextFocus, rect).left;
                int i12 = f(viewFindFocus, rect).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zL = zRequestFocus;
                } else {
                    int i13 = this.f23912u0;
                    if (i13 > 0) {
                        setCurrentItem(i13 - 1, true);
                        zL = true;
                    }
                }
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || f(viewFindNextFocus, rect).left > f(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : l();
                zL = zRequestFocus;
            }
        } else if (i10 == 17 || i10 == 1) {
            int i14 = this.f23912u0;
            if (i14 > 0) {
                setCurrentItem(i14 - 1, true);
                zL = true;
            }
        } else if (i10 == 66 || i10 == 2) {
            zL = l();
        }
        if (zL) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zL;
    }

    public final void b(boolean z10) {
        boolean z11 = this.f23916w1 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f23918y0.isFinished()) {
                this.f23918y0.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f23918y0.getCurrX();
                int currY = this.f23918y0.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m(currX);
                    }
                }
            }
        }
        this.P0 = false;
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f23905q0;
            if (i10 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i10);
            if (eVar.f23931c) {
                eVar.f23931c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            c cVar = this.f23914v1;
            if (z10) {
                ViewCompat.postOnAnimation(this, cVar);
            } else {
                cVar.run();
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.R0) {
            return false;
        }
        this.f23894g1 = true;
        setScrollState(1);
        this.W0 = 0.0f;
        this.Y0 = 0.0f;
        VelocityTracker velocityTracker = this.f23889b1;
        if (velocityTracker == null) {
            this.f23889b1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f23889b1.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f23895h1 = jUptimeMillis;
        return true;
    }

    public final void c() {
        int count = this.f23910t0.getCount();
        this.f23903p0 = count;
        ArrayList<e> arrayList = this.f23905q0;
        boolean z10 = arrayList.size() < (this.Q0 * 2) + 1 && arrayList.size() < count;
        int iMax = this.f23912u0;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            e eVar = arrayList.get(i10);
            int itemPosition = this.f23910t0.getItemPosition(eVar.f23929a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f23910t0.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f23910t0.destroyItem((ViewGroup) this, eVar.f23930b, eVar.f23929a);
                    int i11 = this.f23912u0;
                    if (i11 == eVar.f23930b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = eVar.f23930b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f23912u0) {
                            iMax = itemPosition;
                        }
                        eVar.f23930b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f23910t0.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, f23886y1);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.f23919a = 0.0f;
                }
            }
            t(iMax, 0, false, true);
            requestLayout();
        }
    }

    public boolean canScroll(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f23910t0 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.K0));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.L0));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        ArrayList arrayList = this.f23901n1;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.E0 = true;
        if (this.f23918y0.isFinished() || !this.f23918y0.computeScrollOffset()) {
            b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f23918y0.getCurrX();
        int currY = this.f23918y0.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m(currX)) {
                this.f23918y0.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final int d(int i10, int i11, float f6, int i12) {
        if (Math.abs(i12) <= this.f23892e1 || Math.abs(i11) <= this.f23890c1) {
            i10 += (int) (f6 + (i10 >= this.f23912u0 ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        ArrayList<e> arrayList = this.f23905q0;
        if (arrayList.size() > 0) {
            return Math.max(arrayList.get(0).f23930b, Math.min(i10, ((e) androidx.appcompat.view.menu.b.b(arrayList, 1)).f23930b));
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e eVarG;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (eVarG = g(childAt)) != null && eVarG.f23930b == this.f23912u0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.f23910t0) == null || pagerAdapter.getCount() <= 1)) {
            this.f23896i1.finish();
            this.f23897j1.finish();
            return;
        }
        if (this.f23896i1.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.K0 * width);
            this.f23896i1.setSize(height, width);
            zDraw = this.f23896i1.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.f23897j1.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.L0 + 1.0f)) * width2);
            this.f23897j1.setSize(height2, width2);
            zDraw |= this.f23897j1.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(int i10) {
        OnPageChangeListener onPageChangeListener = this.f23902o1;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        ArrayList arrayList = this.f23901n1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f23901n1.get(i11);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i10);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f23904p1;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i10);
        }
    }

    public void endFakeDrag() {
        if (!this.f23894g1) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f23910t0 != null) {
            VelocityTracker velocityTracker = this.f23889b1;
            velocityTracker.computeCurrentVelocity(1000, this.f23891d1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f23888a1);
            this.P0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e eVarH = h();
            t(d(eVarH.f23930b, xVelocity, ((scrollX / clientWidth) - eVarH.f23933e) / eVarH.f23932d, (int) (this.W0 - this.Y0)), xVelocity, true, true);
        }
        this.R0 = false;
        this.S0 = false;
        VelocityTracker velocityTracker2 = this.f23889b1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f23889b1 = null;
        }
        this.f23894g1 = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (!keyEvent.hasModifiers(2)) {
                return arrowScroll(17);
            }
            int i10 = this.f23912u0;
            if (i10 <= 0) {
                return false;
            }
            setCurrentItem(i10 - 1, true);
            return true;
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? l() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public final Rect f(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void fakeDragBy(float f6) {
        if (!this.f23894g1) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f23910t0 == null) {
            return;
        }
        this.W0 += f6;
        float scrollX = getScrollX() - f6;
        float clientWidth = getClientWidth();
        float f10 = this.K0 * clientWidth;
        float f11 = this.L0 * clientWidth;
        ArrayList<e> arrayList = this.f23905q0;
        e eVar = arrayList.get(0);
        e eVar2 = (e) androidx.appcompat.view.menu.b.b(arrayList, 1);
        if (eVar.f23930b != 0) {
            f10 = eVar.f23933e * clientWidth;
        }
        if (eVar2.f23930b != this.f23910t0.getCount() - 1) {
            f11 = eVar2.f23933e * clientWidth;
        }
        if (scrollX < f10) {
            scrollX = f10;
        } else if (scrollX > f11) {
            scrollX = f11;
        }
        int i10 = (int) scrollX;
        this.W0 = (scrollX - i10) + this.W0;
        scrollTo(i10, getScrollY());
        m(i10);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f23895h1, SystemClock.uptimeMillis(), 2, this.W0, 0.0f, 0);
        this.f23889b1.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final e g(View view) {
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f23905q0;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i10);
            if (this.f23910t0.isViewFromObject(view, eVar.f23929a)) {
                return eVar;
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f23910t0;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f23911t1 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f23913u1.get(i11).getLayoutParams()).f23922d;
    }

    public int getCurrentItem() {
        return this.f23912u0;
    }

    public int getOffscreenPageLimit() {
        return this.Q0;
    }

    public int getPageMargin() {
        return this.G0;
    }

    public final e h() {
        e eVar;
        int i10;
        int clientWidth = getClientWidth();
        float f6 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.G0 / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        e eVar2 = null;
        int i12 = -1;
        float f11 = 0.0f;
        while (true) {
            ArrayList<e> arrayList = this.f23905q0;
            if (i11 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i11);
            if (z10 || eVar3.f23930b == (i10 = i12 + 1)) {
                eVar = eVar3;
            } else {
                float f12 = f6 + f11 + f10;
                e eVar4 = this.f23907r0;
                eVar4.f23933e = f12;
                eVar4.f23930b = i10;
                eVar4.f23932d = this.f23910t0.getPageWidth(i10);
                i11--;
                eVar = eVar4;
            }
            f6 = eVar.f23933e;
            float f13 = eVar.f23932d + f6 + f10;
            if (!z10 && scrollX < f6) {
                return eVar2;
            }
            if (scrollX < f13 || i11 == arrayList.size() - 1) {
                return eVar;
            }
            int i13 = eVar.f23930b;
            float f14 = eVar.f23932d;
            i11++;
            z10 = false;
            e eVar5 = eVar;
            i12 = i13;
            f11 = f14;
            eVar2 = eVar5;
        }
    }

    public final e i(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f23905q0;
            if (i11 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i11);
            if (eVar.f23930b == i10) {
                return eVar;
            }
            i11++;
        }
    }

    public boolean isFakeDragging() {
        return this.f23894g1;
    }

    public final void j() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f23918y0 = new Scroller(context, f23887z1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.V0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f23890c1 = (int) (400.0f * f6);
        this.f23891d1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23896i1 = new EdgeEffect(context);
        this.f23897j1 = new EdgeEffect(context);
        this.f23892e1 = (int) (25.0f * f6);
        this.f23893f1 = (int) (2.0f * f6);
        this.T0 = (int) (f6 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new f());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new d());
    }

    public final void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f23888a1) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.W0 = motionEvent.getX(i10);
            this.f23888a1 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f23889b1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean l() {
        PagerAdapter pagerAdapter = this.f23910t0;
        if (pagerAdapter == null || this.f23912u0 >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.f23912u0 + 1, true);
        return true;
    }

    public final boolean m(int i10) {
        if (this.f23905q0.size() == 0) {
            if (this.f23898k1) {
                return false;
            }
            this.f23899l1 = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.f23899l1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e eVarH = h();
        int clientWidth = getClientWidth();
        int i11 = this.G0;
        int i12 = clientWidth + i11;
        float f6 = clientWidth;
        int i13 = eVarH.f23930b;
        float f10 = ((i10 / f6) - eVarH.f23933e) / (eVarH.f23932d + (i11 / f6));
        this.f23899l1 = false;
        onPageScrolled(i13, f10, (int) (i12 * f10));
        if (this.f23899l1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean n(float f6) {
        boolean z10;
        boolean z11;
        float f10 = this.W0 - f6;
        this.W0 = f6;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.K0 * clientWidth;
        float f12 = this.L0 * clientWidth;
        ArrayList<e> arrayList = this.f23905q0;
        boolean z12 = false;
        e eVar = arrayList.get(0);
        e eVar2 = (e) androidx.appcompat.view.menu.b.b(arrayList, 1);
        if (eVar.f23930b != 0) {
            f11 = eVar.f23933e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f23930b != this.f23910t0.getCount() - 1) {
            f12 = eVar2.f23933e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f23896i1.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f23897j1.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.W0 = (scrollX - i10) + this.W0;
        scrollTo(i10, getScrollY());
        m(i10);
        return z12;
    }

    public final void o() {
        p(this.f23912u0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23898k1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f23914v1);
        Scroller scroller = this.f23918y0;
        if (scroller != null && !scroller.isFinished()) {
            this.f23918y0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f6;
        super.onDraw(canvas);
        if (this.G0 <= 0 || this.H0 == null) {
            return;
        }
        ArrayList<e> arrayList = this.f23905q0;
        if (arrayList.size() <= 0 || this.f23910t0 == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f10 = width;
        float f11 = this.G0 / f10;
        int i11 = 0;
        e eVar = arrayList.get(0);
        float f12 = eVar.f23933e;
        int size = arrayList.size();
        int i12 = eVar.f23930b;
        int i13 = arrayList.get(size - 1).f23930b;
        while (i12 < i13) {
            while (true) {
                i10 = eVar.f23930b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = arrayList.get(i11);
            }
            if (i12 == i10) {
                float f13 = eVar.f23933e;
                float f14 = eVar.f23932d;
                f6 = (f13 + f14) * f10;
                f12 = f13 + f14 + f11;
            } else {
                float pageWidth = this.f23910t0.getPageWidth(i12);
                f6 = (f12 + pageWidth) * f10;
                f12 = pageWidth + f11 + f12;
            }
            if (this.G0 + f6 > scrollX) {
                this.H0.setBounds(Math.round(f6), this.I0, Math.round(this.G0 + f6), this.J0);
                this.H0.draw(canvas);
            }
            if (f6 > scrollX + width) {
                return;
            }
            i12++;
            arrayList = arrayList;
            f11 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            r();
            return false;
        }
        if (action != 0) {
            if (this.R0) {
                return true;
            }
            if (this.S0) {
                return false;
            }
        }
        if (action == 0) {
            float x4 = motionEvent.getX();
            this.Y0 = x4;
            this.W0 = x4;
            float y7 = motionEvent.getY();
            this.Z0 = y7;
            this.X0 = y7;
            this.f23888a1 = motionEvent.getPointerId(0);
            this.S0 = false;
            this.E0 = true;
            this.f23918y0.computeScrollOffset();
            if (this.f23916w1 != 2 || Math.abs(this.f23918y0.getFinalX() - this.f23918y0.getCurrX()) <= this.f23893f1) {
                b(false);
                this.R0 = false;
            } else {
                this.f23918y0.abortAnimation();
                this.P0 = false;
                o();
                this.R0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f23888a1;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x6 = motionEvent.getX(iFindPointerIndex);
                float f6 = x6 - this.W0;
                float fAbs = Math.abs(f6);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y10 - this.Z0);
                if (f6 != 0.0f) {
                    float f10 = this.W0;
                    if ((f10 >= this.U0 || f6 <= 0.0f) && ((f10 <= getWidth() - this.U0 || f6 >= 0.0f) && canScroll(this, false, (int) f6, (int) x6, (int) y10))) {
                        this.W0 = x6;
                        this.X0 = y10;
                        this.S0 = true;
                        return false;
                    }
                }
                float f11 = this.V0;
                if (fAbs > f11 && fAbs * 0.5f > fAbs2) {
                    this.R0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f12 = this.Y0;
                    float f13 = this.V0;
                    this.W0 = f6 > 0.0f ? f12 + f13 : f12 - f13;
                    this.X0 = y10;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f11) {
                    this.S0 = true;
                }
                if (this.R0 && n(x6)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            k(motionEvent);
        }
        if (this.f23889b1 == null) {
            this.f23889b1 = VelocityTracker.obtain();
        }
        this.f23889b1.addMovement(motionEvent);
        return this.R0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        e eVarG;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i18 = layoutParams.gravity;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (eVarG = g(childAt2)) != null) {
                    float f6 = i28;
                    int i30 = ((int) (eVarG.f23933e * f6)) + paddingLeft;
                    if (layoutParams2.f23920b) {
                        layoutParams2.f23920b = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f6 * layoutParams2.f23919a), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.I0 = paddingTop;
        this.J0 = i15 - paddingBottom;
        this.f23900m1 = i16;
        if (this.f23898k1) {
            z11 = false;
            s(this.f23912u0, 0, false, false);
        } else {
            z11 = false;
        }
        this.f23898k1 = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.U0 = Math.min(measuredWidth / 10, this.T0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i15 = layoutParams2.gravity;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.M0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.N0 = true;
        o();
        this.N0 = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f23919a), 1073741824), this.M0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @CallSuper
    public void onPageScrolled(int i10, float f6, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f23900m1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i13 = layoutParams.gravity & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        OnPageChangeListener onPageChangeListener = this.f23902o1;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i10, f6, i11);
        }
        ArrayList arrayList = this.f23901n1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f23901n1.get(i15);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i10, f6, i11);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f23904p1;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i10, f6, i11);
        }
        if (this.r1 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.r1.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f23899l1 = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        e eVarG;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (eVarG = g(childAt)) != null && eVarG.f23930b == this.f23912u0 && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f23910t0;
        ClassLoader classLoader = savedState.f23925s0;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f23924r0, classLoader);
            t(savedState.f23923q0, 0, false, true);
        } else {
            this.v0 = savedState.f23923q0;
            this.f23915w0 = savedState.f23924r0;
            this.f23917x0 = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23923q0 = this.f23912u0;
        PagerAdapter pagerAdapter = this.f23910t0;
        if (pagerAdapter != null) {
            savedState.f23924r0 = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.G0;
            q(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean zR;
        if (this.f23894g1) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f23910t0) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.f23889b1 == null) {
            this.f23889b1 = VelocityTracker.obtain();
        }
        this.f23889b1.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f23918y0.abortAnimation();
            this.P0 = false;
            o();
            float x4 = motionEvent.getX();
            this.Y0 = x4;
            this.W0 = x4;
            float y7 = motionEvent.getY();
            this.Z0 = y7;
            this.X0 = y7;
            this.f23888a1 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.W0 = motionEvent.getX(actionIndex);
                        this.f23888a1 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        k(motionEvent);
                        this.W0 = motionEvent.getX(motionEvent.findPointerIndex(this.f23888a1));
                    }
                } else if (this.R0) {
                    s(this.f23912u0, 0, true, false);
                    zR = r();
                    if (zR) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                }
            } else if (!this.R0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f23888a1);
                if (iFindPointerIndex == -1) {
                    zR = r();
                } else {
                    float x6 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x6 - this.W0);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y10 - this.X0);
                    if (fAbs > this.V0 && fAbs > fAbs2) {
                        this.R0 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f6 = this.Y0;
                        this.W0 = x6 - f6 > 0.0f ? f6 + this.V0 : f6 - this.V0;
                        this.X0 = y10;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.R0) {
                        zR = n(motionEvent.getX(motionEvent.findPointerIndex(this.f23888a1)));
                    }
                }
                if (zR) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            } else if (this.R0) {
                zR = n(motionEvent.getX(motionEvent.findPointerIndex(this.f23888a1)));
                if (zR) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (this.R0) {
            VelocityTracker velocityTracker = this.f23889b1;
            velocityTracker.computeCurrentVelocity(1000, this.f23891d1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f23888a1);
            this.P0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e eVarH = h();
            float f10 = clientWidth;
            t(d(eVarH.f23930b, xVelocity, ((scrollX / f10) - eVarH.f23933e) / (eVarH.f23932d + (this.G0 / f10)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f23888a1)) - this.Y0)), xVelocity, true, true);
            zR = r();
            if (zR) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[PHI: r7 r11 r15
      0x00c2: PHI (r7v13 int) = (r7v12 int), (r7v4 int), (r7v16 int) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:63:0x00e4, B:60:0x00d0, B:52:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0141 A[PHI: r3 r12
      0x0141: PHI (r3v42 float) = (r3v40 float), (r3v41 float), (r3v39 float) binds: [B:97:0x0168, B:94:0x0152, B:87:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r12v10 int) = (r12v8 int), (r12v9 int), (r12v7 int) binds: [B:97:0x0168, B:94:0x0152, B:87:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    public final void p(int i10) {
        e eVarI;
        String hexString;
        ArrayList<e> arrayList;
        e eVarA;
        e eVarG;
        e eVarG2;
        int i11;
        int i12;
        e eVar;
        e eVar2;
        e eVar3;
        int i13 = this.f23912u0;
        if (i13 != i10) {
            eVarI = i(i13);
            this.f23912u0 = i10;
        } else {
            eVarI = null;
        }
        if (this.f23910t0 == null) {
            u();
            return;
        }
        if (this.P0) {
            u();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f23910t0.startUpdate((ViewGroup) this);
        int i14 = this.Q0;
        int iMax = Math.max(0, this.f23912u0 - i14);
        int count = this.f23910t0.getCount();
        int iMin = Math.min(count - 1, this.f23912u0 + i14);
        if (count != this.f23903p0) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f23903p0 + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f23910t0.getClass());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.f23905q0;
            if (i15 < arrayList.size()) {
                eVarA = arrayList.get(i15);
                int i16 = eVarA.f23930b;
                int i17 = this.f23912u0;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            eVarA = null;
            break;
        }
        if (eVarA == null && count > 0) {
            eVarA = a(this.f23912u0, i15);
        }
        if (eVarA != null) {
            int i18 = i15 - 1;
            e eVar4 = i18 >= 0 ? arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVarA.f23932d);
            float f6 = 0.0f;
            for (int i19 = this.f23912u0 - 1; i19 >= 0; i19--) {
                if (f6 < paddingLeft || i19 >= iMax) {
                    if (eVar4 == null || i19 != eVar4.f23930b) {
                        f6 += a(i19, i18 + 1).f23932d;
                        i15++;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                    } else {
                        f6 += eVar4.f23932d;
                        i18--;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                    }
                    eVar4 = eVar3;
                } else {
                    if (eVar4 == null) {
                        break;
                    }
                    if (i19 == eVar4.f23930b && !eVar4.f23931c) {
                        arrayList.remove(i18);
                        this.f23910t0.destroyItem((ViewGroup) this, i19, eVar4.f23929a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                        eVar4 = eVar3;
                    }
                }
            }
            float f10 = eVarA.f23932d;
            int i20 = i15 + 1;
            if (f10 < 2.0f) {
                e eVar5 = i20 < arrayList.size() ? arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f23912u0 + 1; i22 < count; i22++) {
                    if (f10 >= paddingRight && i22 > iMin) {
                        if (eVar5 == null) {
                            break;
                        }
                        if (i22 == eVar5.f23930b && !eVar5.f23931c) {
                            arrayList.remove(i21);
                            this.f23910t0.destroyItem((ViewGroup) this, i22, eVar5.f23929a);
                            if (i21 < arrayList.size()) {
                                eVar5 = arrayList.get(i21);
                            } else {
                                eVar5 = null;
                            }
                        }
                    } else if (eVar5 == null || i22 != eVar5.f23930b) {
                        e eVarA2 = a(i22, i21);
                        i21++;
                        f10 += eVarA2.f23932d;
                        if (i21 < arrayList.size()) {
                            eVar5 = arrayList.get(i21);
                        } else {
                            eVar5 = null;
                        }
                    } else {
                        f10 += eVar5.f23932d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            eVar5 = arrayList.get(i21);
                        } else {
                            eVar5 = null;
                        }
                    }
                }
            }
            int count2 = this.f23910t0.getCount();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.G0 / clientWidth2 : 0.0f;
            if (eVarI != null) {
                int i23 = eVarI.f23930b;
                int i24 = eVarA.f23930b;
                if (i23 < i24) {
                    float pageWidth = eVarI.f23933e + eVarI.f23932d + f11;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= eVarA.f23930b && i26 < arrayList.size()) {
                        e eVar6 = arrayList.get(i26);
                        while (true) {
                            eVar2 = eVar6;
                            if (i25 <= eVar2.f23930b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            eVar6 = arrayList.get(i26);
                        }
                        while (i25 < eVar2.f23930b) {
                            pageWidth += this.f23910t0.getPageWidth(i25) + f11;
                            i25++;
                        }
                        eVar2.f23933e = pageWidth;
                        pageWidth += eVar2.f23932d + f11;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float pageWidth2 = eVarI.f23933e;
                    while (true) {
                        i23--;
                        if (i23 < eVarA.f23930b || size < 0) {
                            break;
                        }
                        e eVar7 = arrayList.get(size);
                        while (true) {
                            eVar = eVar7;
                            if (i23 >= eVar.f23930b || size <= 0) {
                                break;
                            }
                            size--;
                            eVar7 = arrayList.get(size);
                        }
                        while (i23 > eVar.f23930b) {
                            pageWidth2 -= this.f23910t0.getPageWidth(i23) + f11;
                            i23--;
                        }
                        pageWidth2 -= eVar.f23932d + f11;
                        eVar.f23933e = pageWidth2;
                    }
                }
            }
            int size2 = arrayList.size();
            float pageWidth3 = eVarA.f23933e;
            int i27 = eVarA.f23930b;
            int i28 = i27 - 1;
            this.K0 = i27 == 0 ? pageWidth3 : -3.4028235E38f;
            int i29 = count2 - 1;
            this.L0 = i27 == i29 ? (eVarA.f23932d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                e eVar8 = arrayList.get(i30);
                while (true) {
                    i12 = eVar8.f23930b;
                    if (i28 <= i12) {
                        break;
                    }
                    pageWidth3 -= this.f23910t0.getPageWidth(i28) + f11;
                    i28--;
                }
                pageWidth3 -= eVar8.f23932d + f11;
                eVar8.f23933e = pageWidth3;
                if (i12 == 0) {
                    this.K0 = pageWidth3;
                }
                i30--;
                i28--;
            }
            float pageWidth4 = eVarA.f23933e + eVarA.f23932d + f11;
            int i31 = eVarA.f23930b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                e eVar9 = arrayList.get(i20);
                while (true) {
                    i11 = eVar9.f23930b;
                    if (i31 >= i11) {
                        break;
                    }
                    pageWidth4 += this.f23910t0.getPageWidth(i31) + f11;
                    i31++;
                }
                if (i11 == i29) {
                    this.L0 = (eVar9.f23932d + pageWidth4) - 1.0f;
                }
                eVar9.f23933e = pageWidth4;
                pageWidth4 += eVar9.f23932d + f11;
                i20++;
            }
            this.f23910t0.setPrimaryItem((ViewGroup) this, this.f23912u0, eVarA.f23929a);
        }
        this.f23910t0.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f23922d = i32;
            if (!layoutParams.isDecor && layoutParams.f23919a == 0.0f && (eVarG2 = g(childAt)) != null) {
                layoutParams.f23919a = eVarG2.f23932d;
                layoutParams.f23921c = eVarG2.f23930b;
            }
        }
        u();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                eVarG = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    eVarG = g(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        eVarG = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (eVarG == null || eVarG.f23930b != this.f23912u0) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    e eVarG3 = g(childAt2);
                    if (eVarG3 != null && eVarG3.f23930b == this.f23912u0 && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f23905q0.isEmpty()) {
            if (!this.f23918y0.isFinished()) {
                this.f23918y0.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        e eVarI = i(this.f23912u0);
        int iMin = (int) ((eVarI != null ? Math.min(eVarI.f23933e, this.L0) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            b(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean r() {
        this.f23888a1 = -1;
        this.R0 = false;
        this.S0 = false;
        VelocityTracker velocityTracker = this.f23889b1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23889b1 = null;
        }
        this.f23896i1.onRelease();
        this.f23897j1.onRelease();
        return this.f23896i1.isFinished() || this.f23897j1.isFinished();
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        ArrayList arrayList = this.f23906q1;
        if (arrayList != null) {
            arrayList.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        ArrayList arrayList = this.f23901n1;
        if (arrayList != null) {
            arrayList.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.N0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        int scrollX;
        int iAbs;
        e eVarI = i(i10);
        if (eVarI != null) {
            iMax = (int) (Math.max(this.K0, Math.min(eVarI.f23933e, this.L0)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z10) {
            if (z11) {
                e(i10);
            }
            b(false);
            scrollTo(iMax, 0);
            m(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f23918y0;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.E0 ? this.f23918y0.getCurrX() : this.f23918y0.getStartX();
                this.f23918y0.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                b(false);
                o();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f6 = clientWidth;
                float f10 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f10) + f10;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    iAbs = (int) (((Math.abs(i13) / ((this.f23910t0.getPageWidth(this.f23912u0) * f6) + this.G0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.E0 = false;
                this.f23918y0.startScroll(i12, scrollY, i13, i14, iMin);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        if (z11) {
            e(i10);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        ArrayList<e> arrayList;
        PagerAdapter pagerAdapter2 = this.f23910t0;
        if (pagerAdapter2 != null) {
            synchronized (pagerAdapter2) {
                pagerAdapter2.f23870b = null;
            }
            this.f23910t0.startUpdate((ViewGroup) this);
            int i10 = 0;
            while (true) {
                arrayList = this.f23905q0;
                if (i10 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i10);
                this.f23910t0.destroyItem((ViewGroup) this, eVar.f23930b, eVar.f23929a);
                i10++;
            }
            this.f23910t0.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i11).getLayoutParams()).isDecor) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f23912u0 = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f23910t0;
        this.f23910t0 = pagerAdapter;
        this.f23903p0 = 0;
        if (pagerAdapter != null) {
            if (this.F0 == null) {
                this.F0 = new g();
            }
            this.f23910t0.a(this.F0);
            this.P0 = false;
            boolean z10 = this.f23898k1;
            this.f23898k1 = true;
            this.f23903p0 = this.f23910t0.getCount();
            if (this.v0 >= 0) {
                this.f23910t0.restoreState(this.f23915w0, this.f23917x0);
                t(this.v0, 0, false, true);
                this.v0 = -1;
                this.f23915w0 = null;
                this.f23917x0 = null;
            } else if (z10) {
                requestLayout();
            } else {
                o();
            }
        }
        ArrayList arrayList2 = this.f23906q1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f23906q1.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((OnAdapterChangeListener) this.f23906q1.get(i12)).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i10) {
        this.P0 = false;
        t(i10, 0, !this.f23898k1, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.Q0) {
            this.Q0 = i10;
            o();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f23902o1 = onPageChangeListener;
    }

    public void setPageMargin(int i10) {
        int i11 = this.G0;
        this.G0 = i10;
        int width = getWidth();
        q(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.H0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z10, pageTransformer, 2);
    }

    public void setScrollState(int i10) {
        if (this.f23916w1 == i10) {
            return;
        }
        this.f23916w1 = i10;
        if (this.r1 != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.f23909s1 : 0, null);
            }
        }
        OnPageChangeListener onPageChangeListener = this.f23902o1;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
        ArrayList arrayList = this.f23901n1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f23901n1.get(i12);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i10);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f23904p1;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i10);
        }
    }

    public final void t(int i10, int i11, boolean z10, boolean z11) {
        PagerAdapter pagerAdapter = this.f23910t0;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f23905q0;
        if (!z11 && this.f23912u0 == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f23910t0.getCount()) {
            i10 = this.f23910t0.getCount() - 1;
        }
        int i12 = this.Q0;
        int i13 = this.f23912u0;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList.get(i14).f23931c = true;
            }
        }
        boolean z12 = this.f23912u0 != i10;
        if (!this.f23898k1) {
            p(i10);
            s(i10, i11, z10, z12);
        } else {
            this.f23912u0 = i10;
            if (z12) {
                e(i10);
            }
            requestLayout();
        }
    }

    public final void u() {
        if (this.f23911t1 != 0) {
            ArrayList<View> arrayList = this.f23913u1;
            if (arrayList == null) {
                this.f23913u1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f23913u1.add(getChildAt(i10));
            }
            Collections.sort(this.f23913u1, A1);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H0;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f23919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23922d;
        public int gravity;
        public boolean isDecor;

        public LayoutParams() {
            super(-1, -1);
            this.f23919a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23919a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f23885x1);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z10, @Nullable PageTransformer pageTransformer, int i10) {
        boolean z11 = pageTransformer != null;
        boolean z12 = z11 != (this.r1 != null);
        this.r1 = pageTransformer;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.f23911t1 = z10 ? 2 : 1;
            this.f23909s1 = i10;
        } else {
            this.f23911t1 = 0;
        }
        if (z12) {
            o();
        }
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.P0 = false;
        t(i10, 0, z10, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i10) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23905q0 = new ArrayList<>();
        this.f23907r0 = new e();
        this.f23908s0 = new Rect();
        this.v0 = -1;
        this.f23915w0 = null;
        this.f23917x0 = null;
        this.K0 = -3.4028235E38f;
        this.L0 = Float.MAX_VALUE;
        this.Q0 = 1;
        this.f23888a1 = -1;
        this.f23898k1 = true;
        this.f23914v1 = new c();
        this.f23916w1 = 0;
        j();
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f6, int i11) {
        }
    }
}
