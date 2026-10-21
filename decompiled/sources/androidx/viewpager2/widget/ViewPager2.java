package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public h E0;
    public androidx.viewpager2.widget.f F0;
    public androidx.viewpager2.widget.c G0;
    public androidx.viewpager2.widget.d H0;
    public androidx.viewpager2.widget.e I0;
    public RecyclerView.ItemAnimator J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public g N0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f23960p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Rect f23961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final androidx.viewpager2.widget.c f23962r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f23963s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f23964t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f23965u0;
    public f v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f23966w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Parcelable f23967x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public i f23968y0;

    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OffscreenPageLimit {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f6);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollState {
    }

    public class a extends e {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f23964t0 = true;
            viewPager2.F0.f24008l = true;
        }
    }

    public class b extends OnPageChangeCallback {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.d();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f23963s0 != i10) {
                viewPager2.f23963s0 = i10;
                viewPager2.N0.b();
            }
        }
    }

    public class c extends OnPageChangeCallback {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.f23968y0.requestFocus(2);
            }
        }
    }

    public abstract class d {
    }

    public static abstract class e extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onChanged();
        }
    }

    public class f extends LinearLayoutManager {
        public f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.N0.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i10, @Nullable Bundle bundle) {
            ViewPager2.this.N0.getClass();
            return super.performAccessibilityAction(recycler, state, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f23975a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f23976b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.viewpager2.widget.h f23977c;

        public class a implements AccessibilityViewCommand {
            public a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.isUserInputEnabled()) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public class b implements AccessibilityViewCommand {
            public b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.isUserInputEnabled()) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public g() {
        }

        public final void a(@NonNull RecyclerView recyclerView) {
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            this.f23977c = new androidx.viewpager2.widget.h(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (ViewCompat.getImportantForAccessibility(viewPager2) == 0) {
                ViewCompat.setImportantForAccessibility(viewPager2, 1);
            }
        }

        public final void b() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageDown);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f23976b;
            a aVar = this.f23975a;
            if (orientation != 0) {
                if (viewPager2.f23963s0 < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, aVar);
                }
                if (viewPager2.f23963s0 > 0) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, bVar);
                    return;
                }
                return;
            }
            boolean z10 = viewPager2.v0.getLayoutDirection() == 1;
            int i11 = z10 ? 16908360 : 16908361;
            if (z10) {
                i10 = 16908361;
            }
            if (viewPager2.f23963s0 < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, null), null, aVar);
            }
            if (viewPager2.f23963s0 > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i10, null), null, bVar);
            }
        }
    }

    public class h extends PagerSnapHelper {
        public h() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @Nullable
        public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.N0.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f23963s0);
            accessibilityEvent.setToIndex(viewPager2.f23963s0);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    public static class j implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f23983p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final RecyclerView f23984q0;

        public j(i iVar, int i10) {
            this.f23983p0 = i10;
            this.f23984q0 = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f23984q0.smoothScrollToPosition(this.f23983p0);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f23960p0 = new Rect();
        this.f23961q0 = new Rect();
        this.f23962r0 = new androidx.viewpager2.widget.c();
        this.f23964t0 = false;
        this.f23965u0 = new a();
        this.f23966w0 = -1;
        this.J0 = null;
        this.K0 = false;
        this.L0 = true;
        this.M0 = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.N0 = new g();
        i iVar = new i(context);
        this.f23968y0 = iVar;
        iVar.setId(ViewCompat.generateViewId());
        this.f23968y0.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.v0 = fVar;
        this.f23968y0.setLayoutManager(fVar);
        this.f23968y0.setScrollingTouchSlop(1);
        int[] iArr = androidx.viewpager2.R.styleable.ViewPager2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(androidx.viewpager2.R.styleable.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f23968y0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f23968y0.addOnChildAttachStateChangeListener(new androidx.viewpager2.widget.g());
            androidx.viewpager2.widget.f fVar2 = new androidx.viewpager2.widget.f(this);
            this.F0 = fVar2;
            this.H0 = new androidx.viewpager2.widget.d(this, fVar2, this.f23968y0);
            h hVar = new h();
            this.E0 = hVar;
            hVar.attachToRecyclerView(this.f23968y0);
            this.f23968y0.addOnScrollListener(this.F0);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c();
            this.G0 = cVar;
            this.F0.f23997a = cVar;
            b bVar = new b();
            c cVar2 = new c();
            this.G0.f23986a.add(bVar);
            this.G0.f23986a.add(cVar2);
            this.N0.a(this.f23968y0);
            androidx.viewpager2.widget.c cVar3 = this.G0;
            cVar3.f23986a.add(this.f23962r0);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this.v0);
            this.I0 = eVar;
            this.G0.f23986a.add(eVar);
            i iVar2 = this.f23968y0;
            attachViewToParent(iVar2, 0, iVar2.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.f23968y0.addItemDecoration(itemDecoration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        RecyclerView.Adapter adapter;
        if (this.f23966w0 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f23967x0;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.f23967x0 = null;
        }
        int iMax = Math.max(0, Math.min(this.f23966w0, adapter.getItemCount() - 1));
        this.f23963s0 = iMax;
        this.f23966w0 = -1;
        this.f23968y0.scrollToPosition(iMax);
        this.N0.b();
    }

    public boolean beginFakeDrag() {
        androidx.viewpager2.widget.d dVar = this.H0;
        androidx.viewpager2.widget.f fVar = dVar.f23988b;
        if (fVar.f24002f == 1) {
            return false;
        }
        dVar.f23993g = 0;
        dVar.f23992f = 0;
        dVar.f23994h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = dVar.f23990d;
        if (velocityTracker == null) {
            dVar.f23990d = VelocityTracker.obtain();
            dVar.f23991e = ViewConfiguration.get(dVar.f23987a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        fVar.f24001e = 4;
        fVar.d(true);
        if (fVar.f24002f != 0) {
            dVar.f23989c.stopScroll();
        }
        long j10 = dVar.f23994h;
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 0, 0.0f, 0.0f, 0);
        dVar.f23990d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final void c(int i10, boolean z10) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f23966w0 != -1) {
                this.f23966w0 = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i11 = this.f23963s0;
        if (iMin == i11 && this.F0.f24002f == 0) {
            return;
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d2 = i11;
        this.f23963s0 = iMin;
        this.N0.b();
        androidx.viewpager2.widget.f fVar = this.F0;
        if (fVar.f24002f != 0) {
            fVar.e();
            androidx.viewpager2.widget.f.a aVar = fVar.f24003g;
            d2 = ((double) aVar.f24009a) + ((double) aVar.f24010b);
        }
        androidx.viewpager2.widget.f fVar2 = this.F0;
        fVar2.getClass();
        fVar2.f24001e = z10 ? 2 : 3;
        fVar2.m = false;
        boolean z11 = fVar2.f24005i != iMin;
        fVar2.f24005i = iMin;
        fVar2.b(2);
        if (z11) {
            fVar2.a(iMin);
        }
        if (!z10) {
            this.f23968y0.scrollToPosition(iMin);
            return;
        }
        double d3 = iMin;
        if (Math.abs(d3 - d2) <= 3.0d) {
            this.f23968y0.smoothScrollToPosition(iMin);
            return;
        }
        this.f23968y0.scrollToPosition(d3 > d2 ? iMin - 3 : iMin + 3);
        i iVar = this.f23968y0;
        iVar.post(new j(iVar, iMin));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f23968y0.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f23968y0.canScrollVertically(i10);
    }

    public final void d() {
        h hVar = this.E0;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = hVar.findSnapView(this.v0);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.v0.getPosition(viewFindSnapView);
        if (position != this.f23963s0 && getScrollState() == 0) {
            this.G0.onPageSelected(position);
        }
        this.f23964t0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f23969p0;
            sparseArray.put(this.f23968y0.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public boolean endFakeDrag() {
        int[] iArrCalculateDistanceToFinalSnap;
        int i10;
        androidx.viewpager2.widget.d dVar = this.H0;
        androidx.viewpager2.widget.f fVar = dVar.f23988b;
        boolean z10 = fVar.m;
        if (!z10) {
            return false;
        }
        if (!(fVar.f24002f == 1) || z10) {
            fVar.m = false;
            fVar.e();
            androidx.viewpager2.widget.f.a aVar = fVar.f24003g;
            if (aVar.f24011c == 0) {
                int i11 = aVar.f24009a;
                if (i11 != fVar.f24004h) {
                    fVar.a(i11);
                }
                fVar.b(0);
                fVar.c();
            } else {
                fVar.b(2);
            }
        }
        VelocityTracker velocityTracker = dVar.f23990d;
        velocityTracker.computeCurrentVelocity(1000, dVar.f23991e);
        if (!dVar.f23989c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            ViewPager2 viewPager2 = dVar.f23987a;
            View viewFindSnapView = viewPager2.E0.findSnapView(viewPager2.v0);
            if (viewFindSnapView != null && ((i10 = (iArrCalculateDistanceToFinalSnap = viewPager2.E0.calculateDistanceToFinalSnap(viewPager2.v0, viewFindSnapView))[0]) != 0 || iArrCalculateDistanceToFinalSnap[1] != 0)) {
                viewPager2.f23968y0.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
            }
        }
        return true;
    }

    public boolean fakeDragBy(@Px @SuppressLint({"SupportAnnotationUsage"}) float f6) {
        androidx.viewpager2.widget.d dVar = this.H0;
        if (!dVar.f23988b.m) {
            return false;
        }
        float f10 = dVar.f23992f - f6;
        dVar.f23992f = f10;
        int iRound = Math.round(f10 - dVar.f23993g);
        dVar.f23993g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = dVar.f23987a.getOrientation() == 0;
        int i10 = z10 ? iRound : 0;
        int i11 = z10 ? 0 : iRound;
        float f11 = z10 ? dVar.f23992f : 0.0f;
        float f12 = z10 ? 0.0f : dVar.f23992f;
        dVar.f23989c.scrollBy(i10, i11);
        MotionEvent motionEventObtain = MotionEvent.obtain(dVar.f23994h, jUptimeMillis, 2, f11, f12, 0);
        dVar.f23990d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        this.N0.getClass();
        this.N0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f23968y0.getAdapter();
    }

    public int getCurrentItem() {
        return this.f23963s0;
    }

    @NonNull
    public RecyclerView.ItemDecoration getItemDecorationAt(int i10) {
        return this.f23968y0.getItemDecorationAt(i10);
    }

    public int getItemDecorationCount() {
        return this.f23968y0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.M0;
    }

    public int getOrientation() {
        return this.v0.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f23968y0;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.F0.f24002f;
    }

    public void invalidateItemDecorations() {
        this.f23968y0.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.H0.f23988b.m;
    }

    public boolean isUserInputEnabled() {
        return this.L0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 0;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 0;
        }
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(itemCount, itemCount2, false, 0));
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
            return;
        }
        if (viewPager2.f23963s0 > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f23963s0 < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f23968y0.getMeasuredWidth();
        int measuredHeight = this.f23968y0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f23960p0;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f23961q0;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f23968y0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f23964t0) {
            d();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f23968y0, i10, i11);
        int measuredWidth = this.f23968y0.getMeasuredWidth();
        int measuredHeight = this.f23968y0.getMeasuredHeight();
        int measuredState = this.f23968y0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23966w0 = savedState.f23970q0;
        this.f23967x0 = savedState.f23971r0;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23969p0 = this.f23968y0.getId();
        int i10 = this.f23966w0;
        if (i10 == -1) {
            i10 = this.f23963s0;
        }
        savedState.f23970q0 = i10;
        Parcelable parcelable = this.f23967x0;
        if (parcelable != null) {
            savedState.f23971r0 = parcelable;
        } else {
            Object adapter = this.f23968y0.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                savedState.f23971r0 = ((StatefulAdapter) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    @RequiresApi(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.N0.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        g gVar = this.N0;
        gVar.getClass();
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void registerOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f23962r0.f23986a.add(onPageChangeCallback);
    }

    public void removeItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.f23968y0.removeItemDecoration(itemDecoration);
    }

    public void removeItemDecorationAt(int i10) {
        this.f23968y0.removeItemDecorationAt(i10);
    }

    public void requestTransform() {
        if (this.I0.f23996b == null) {
            return;
        }
        androidx.viewpager2.widget.f fVar = this.F0;
        fVar.e();
        androidx.viewpager2.widget.f.a aVar = fVar.f24003g;
        double d2 = ((double) aVar.f24009a) + ((double) aVar.f24010b);
        int i10 = (int) d2;
        float f6 = (float) (d2 - ((double) i10));
        this.I0.onPageScrolled(i10, f6, Math.round(getPageSize() * f6));
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f23968y0.getAdapter();
        g gVar = this.N0;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(gVar.f23977c);
        } else {
            gVar.getClass();
        }
        a aVar = this.f23965u0;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        this.f23968y0.setAdapter(adapter);
        this.f23963s0 = 0;
        b();
        g gVar2 = this.N0;
        gVar2.b();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(gVar2.f23977c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        setCurrentItem(i10, true);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.N0.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.M0 = i10;
        this.f23968y0.requestLayout();
    }

    public void setOrientation(int i10) {
        this.v0.setOrientation(i10);
        this.N0.b();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.K0) {
                this.J0 = this.f23968y0.getItemAnimator();
                this.K0 = true;
            }
            this.f23968y0.setItemAnimator(null);
        } else if (this.K0) {
            this.f23968y0.setItemAnimator(this.J0);
            this.J0 = null;
            this.K0 = false;
        }
        androidx.viewpager2.widget.e eVar = this.I0;
        if (pageTransformer == eVar.f23996b) {
            return;
        }
        eVar.f23996b = pageTransformer;
        requestTransform();
    }

    public void setUserInputEnabled(boolean z10) {
        this.L0 = z10;
        this.N0.b();
    }

    public void unregisterOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f23962r0.f23986a.remove(onPageChangeCallback);
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration, int i10) {
        this.f23968y0.addItemDecoration(itemDecoration, i10);
    }

    public void setCurrentItem(int i10, boolean z10) {
        if (isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        c(i10, z10);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f23969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f23970q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Parcelable f23971r0;

        @RequiresApi(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23969p0 = parcel.readInt();
            this.f23970q0 = parcel.readInt();
            this.f23971r0 = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23969p0);
            parcel.writeInt(this.f23970q0);
            parcel.writeParcelable(this.f23971r0, i10);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, null);
                }
                SavedState savedState = new SavedState(parcel);
                savedState.f23969p0 = parcel.readInt();
                savedState.f23970q0 = parcel.readInt();
                savedState.f23971r0 = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                SavedState savedState = new SavedState(parcel);
                savedState.f23969p0 = parcel.readInt();
                savedState.f23970q0 = parcel.readInt();
                savedState.f23971r0 = parcel.readParcelable(null);
                return savedState;
            }
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23960p0 = new Rect();
        this.f23961q0 = new Rect();
        this.f23962r0 = new androidx.viewpager2.widget.c();
        this.f23964t0 = false;
        this.f23965u0 = new a();
        this.f23966w0 = -1;
        this.J0 = null;
        this.K0 = false;
        this.L0 = true;
        this.M0 = -1;
        a(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23960p0 = new Rect();
        this.f23961q0 = new Rect();
        this.f23962r0 = new androidx.viewpager2.widget.c();
        this.f23964t0 = false;
        this.f23965u0 = new a();
        this.f23966w0 = -1;
        this.J0 = null;
        this.K0 = false;
        this.L0 = true;
        this.M0 = -1;
        a(context, attributeSet);
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageSelected(int i10) {
        }

        public void onPageScrolled(int i10, float f6, @Px int i11) {
        }
    }

    @RequiresApi(21)
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23960p0 = new Rect();
        this.f23961q0 = new Rect();
        this.f23962r0 = new androidx.viewpager2.widget.c();
        this.f23964t0 = false;
        this.f23965u0 = new a();
        this.f23966w0 = -1;
        this.J0 = null;
        this.K0 = false;
        this.L0 = true;
        this.M0 = -1;
        a(context, attributeSet);
    }
}
