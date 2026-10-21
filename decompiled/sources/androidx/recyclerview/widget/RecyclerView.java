package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.o1;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import com.bbva.nativesettings.common.Constants;
import com.nulabinc.zxcvbn.Guess;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_TYPE = -1;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    public static final Class<?>[] Y1;
    public static final c Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final i f22738a2;
    public OnScrollListener A1;
    public ArrayList B1;
    public boolean C1;
    public boolean D1;
    public final Rect E0;
    public final g E1;
    public final RectF F0;
    public boolean F1;
    public Adapter G0;
    public RecyclerViewAccessibilityDelegate G1;

    @VisibleForTesting
    public LayoutManager H0;
    public ChildDrawingOrderCallback H1;
    public RecyclerListener I0;
    public final int[] I1;
    public final ArrayList J0;
    public NestedScrollingChildHelper J1;
    public final ArrayList<ItemDecoration> K0;
    public final int[] K1;
    public final ArrayList<OnItemTouchListener> L0;
    public final int[] L1;
    public OnItemTouchListener M0;
    public final int[] M1;
    public boolean N0;

    @VisibleForTesting
    public final ArrayList N1;
    public boolean O0;
    public final b O1;

    @VisibleForTesting
    public boolean P0;
    public boolean P1;
    public int Q0;
    public int Q1;
    public boolean R0;
    public int R1;
    public boolean S0;
    public final d S1;
    public boolean T0;
    public int U0;
    public boolean V0;
    public final AccessibilityManager W0;
    public ArrayList X0;
    public boolean Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f22739a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f22740b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NonNull
    public EdgeEffectFactory f22741c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public EdgeEffect f22742d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public EdgeEffect f22743e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public EdgeEffect f22744f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public EdgeEffect f22745g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public ItemAnimator f22746h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f22747i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f22748j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public VelocityTracker f22749k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f22750l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f22751m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f22752n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f22753o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f22754p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f22755p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final h f22756q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public OnFlingListener f22757q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Recycler f22758r0;
    public final int r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SavedState f22759s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final int f22760s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final androidx.recyclerview.widget.a f22761t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final float f22762t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final androidx.recyclerview.widget.b f22763u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final float f22764u1;
    public final x v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f22765v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f22766w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final j f22767w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a f22768x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public androidx.recyclerview.widget.j f22769x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Rect f22770y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final androidx.recyclerview.widget.j.b f22771y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final State f22772z1;
    public static final int[] T1 = {R.attr.nestedScrollingEnabled};
    public static final float U1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean V1 = true;
    public static final boolean W1 = true;
    public static final boolean X1 = true;

    public static abstract class AdapterDataObserver {
        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i10, int i11);
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f22773a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<ItemAnimatorFinishedListener> f22774b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f22775c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f22776d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f22777e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f22778f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder, int i10) {
                View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }

        public interface a {
        }

        public static int a(ViewHolder viewHolder) {
            int i10 = viewHolder.mFlags;
            int i11 = i10 & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i11 : i11 | 2048;
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder) {
            return true;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            a aVar = this.f22773a;
            if (aVar != null) {
                g gVar = (g) aVar;
                boolean z10 = true;
                viewHolder.setIsRecyclable(true);
                if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                    viewHolder.mShadowedHolder = null;
                }
                viewHolder.mShadowingHolder = null;
                if (viewHolder.shouldBeKeptAsChild()) {
                    return;
                }
                View view = viewHolder.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.a0();
                androidx.recyclerview.widget.b bVar = recyclerView.f22763u0;
                u uVar = (u) bVar.f22958a;
                int iIndexOfChild = uVar.f23086a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    bVar.m(view);
                } else {
                    androidx.recyclerview.widget.b.a aVar2 = bVar.f22959b;
                    if (aVar2.d(iIndexOfChild)) {
                        aVar2.f(iIndexOfChild);
                        bVar.m(view);
                        uVar.a(iIndexOfChild);
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ViewHolder viewHolderD = RecyclerView.D(view);
                    Recycler recycler = recyclerView.f22758r0;
                    recycler.k(viewHolderD);
                    recycler.g(viewHolderD);
                }
                recyclerView.b0(!z10);
                if (z10 || !viewHolder.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(viewHolder.itemView, false);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            ArrayList<ItemAnimatorFinishedListener> arrayList = this.f22774b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).onAnimationsFinished();
            }
            arrayList.clear();
        }

        public abstract void endAnimation(@NonNull ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.f22775c;
        }

        public long getChangeDuration() {
            return this.f22778f;
        }

        public long getMoveDuration() {
            return this.f22777e;
        }

        public long getRemoveDuration() {
            return this.f22776d;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zIsRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (zIsRunning) {
                    this.f22774b.add(itemAnimatorFinishedListener);
                } else {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                }
            }
            return zIsRunning;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i10, @NonNull List<Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j10) {
            this.f22775c = j10;
        }

        public void setChangeDuration(long j10) {
            this.f22778f = j10;
        }

        public void setMoveDuration(long j10) {
            this.f22777e = j10;
        }

        public void setRemoveDuration(long j10) {
            this.f22776d = j10;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public void onAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class LayoutManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f22779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f22780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewBoundsCheck f22781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ViewBoundsCheck f22782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public SmoothScroller f22783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f22785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22790l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22791n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22792o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22793p;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i10, int i11);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public class a implements ViewBoundsCheck.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int a(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int b() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.getWidth() - layoutManager.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final View d(int i10) {
                return LayoutManager.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int e(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements ViewBoundsCheck.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int a(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int b() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.getHeight() - layoutManager.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final View d(int i10) {
                return LayoutManager.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public final int e(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public LayoutManager() {
            a aVar = new a();
            b bVar = new b();
            this.f22781c = new ViewBoundsCheck(aVar);
            this.f22782d = new ViewBoundsCheck(bVar);
            this.f22784f = false;
            this.f22785g = false;
            this.f22786h = false;
            this.f22787i = true;
            this.f22788j = true;
        }

        public static boolean b(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i10, int i11, int i12, boolean z10) {
            int i13 = i10 - i11;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            if (z10) {
                if (i12 >= 0) {
                    i14 = 1073741824;
                } else {
                    i12 = 0;
                }
            } else if (i12 >= 0) {
                i14 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
                i14 = 1073741824;
            } else if (i12 == -2) {
                i14 = Integer.MIN_VALUE;
                i12 = iMax;
            } else {
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i14);
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, i11);
            properties.orientation = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            properties.spanCount = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            properties.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        public final void a(View view, int i10, boolean z10) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            if (z10 || viewHolderD.isRemoved()) {
                SimpleArrayMap<ViewHolder, x.a> simpleArrayMap = this.f22780b.v0.f23088a;
                x.a aVarA = simpleArrayMap.get(viewHolderD);
                if (aVarA == null) {
                    aVarA = x.a.a();
                    simpleArrayMap.put(viewHolderD, aVarA);
                }
                aVarA.f23091a |= 1;
            } else {
                this.f22780b.v0.c(viewHolderD);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (viewHolderD.wasReturnedFromScrap() || viewHolderD.isScrap()) {
                if (viewHolderD.isScrap()) {
                    viewHolderD.unScrap();
                } else {
                    viewHolderD.clearReturnedFromScrapFlag();
                }
                this.f22779a.b(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f22780b) {
                int iJ = this.f22779a.j(view);
                if (i10 == -1) {
                    i10 = this.f22779a.e();
                }
                if (iJ == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f22780b.indexOfChild(view));
                    throw new IllegalStateException(o1.b(this.f22780b, sb2));
                }
                if (iJ != i10) {
                    this.f22780b.H0.moveView(iJ, i10);
                }
            } else {
                this.f22779a.a(view, i10, false);
                layoutParams.f22798c = true;
                SmoothScroller smoothScroller = this.f22783e;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.f22783e.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f22799d) {
                viewHolderD.itemView.invalidate();
                layoutParams.f22799d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView == null || recyclerView.isComputingLayout()) {
                return;
            }
            if (str != null) {
                throw new IllegalStateException(o1.b(recyclerView, androidx.camera.core.impl.utils.c.d(str)));
            }
            throw new IllegalStateException(o1.b(recyclerView, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                recyclerView.f(str);
            }
        }

        public void attachView(@NonNull View view, int i10, LayoutParams layoutParams) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            if (viewHolderD.isRemoved()) {
                SimpleArrayMap<ViewHolder, x.a> simpleArrayMap = this.f22780b.v0.f23088a;
                x.a aVarA = simpleArrayMap.get(viewHolderD);
                if (aVarA == null) {
                    aVarA = x.a.a();
                    simpleArrayMap.put(viewHolderD, aVarA);
                }
                aVarA.f23091a |= 1;
            } else {
                this.f22780b.v0.c(viewHolderD);
            }
            this.f22779a.b(view, i10, layoutParams, viewHolderD.isRemoved());
        }

        public final void c(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            if (viewHolderD == null || viewHolderD.isRemoved()) {
                return;
            }
            androidx.recyclerview.widget.b bVar = this.f22779a;
            if (bVar.f22960c.contains(viewHolderD.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f22780b;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f22758r0, recyclerView.f22772z1, view, accessibilityNodeInfoCompat);
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.F(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State state) {
            return 0;
        }

        public final void d(Recycler recycler) {
            ArrayList<ViewHolder> arrayList;
            int size = recycler.f22807a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = recycler.f22807a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).itemView;
                ViewHolder viewHolderD = RecyclerView.D(view);
                if (!viewHolderD.shouldIgnore()) {
                    viewHolderD.setIsRecyclable(false);
                    if (viewHolderD.isTmpDetached()) {
                        this.f22780b.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.f22780b.f22746h1;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(viewHolderD);
                    }
                    viewHolderD.setIsRecyclable(true);
                    ViewHolder viewHolderD2 = RecyclerView.D(view);
                    viewHolderD2.mScrapContainer = null;
                    viewHolderD2.mInChangeScrap = false;
                    viewHolderD2.clearReturnedFromScrapFlag();
                    recycler.g(viewHolderD2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<ViewHolder> arrayList2 = recycler.f22808b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f22780b.invalidate();
            }
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                e(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            e(recycler, this.f22779a.j(view), view);
        }

        public void detachAndScrapViewAt(int i10, @NonNull Recycler recycler) {
            e(recycler, i10, getChildAt(i10));
        }

        public void detachView(@NonNull View view) {
            int iJ = this.f22779a.j(view);
            if (iJ >= 0) {
                this.f22779a.c(iJ);
            }
        }

        public void detachViewAt(int i10) {
            getChildAt(i10);
            this.f22779a.c(i10);
        }

        public final void e(Recycler recycler, int i10, View view) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            if (viewHolderD.shouldIgnore()) {
                return;
            }
            if (viewHolderD.isInvalid() && !viewHolderD.isRemoved() && !this.f22780b.G0.hasStableIds()) {
                removeViewAt(i10);
                recycler.g(viewHolderD);
            } else {
                detachViewAt(i10);
                recycler.h(view);
                this.f22780b.v0.c(viewHolderD);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.f22780b.f22746h1;
            if (itemAnimator != null) {
                itemAnimator.endAnimation(RecyclerView.D(view));
            }
        }

        public final void f(RecyclerView recyclerView) {
            g(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f22779a.k(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                ViewHolder viewHolderD = RecyclerView.D(childAt);
                if (viewHolderD != null && viewHolderD.getLayoutPosition() == i10 && !viewHolderD.shouldIgnore() && (this.f22780b.f22772z1.isPreLayout() || !viewHolderD.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public final void g(int i10, int i11) {
            this.f22792o = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.m = mode;
            if (mode == 0 && !RecyclerView.V1) {
                this.f22792o = 0;
            }
            this.f22793p = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f22791n = mode2;
            if (mode2 != 0 || RecyclerView.V1) {
                return;
            }
            this.f22793p = 0;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f22797b.bottom;
        }

        @Nullable
        public View getChildAt(int i10) {
            androidx.recyclerview.widget.b bVar = this.f22779a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.f22779a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.f22780b;
            return recyclerView != null && recyclerView.f22766w0;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.E(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f22797b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f22797b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f22779a.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.f22793p;
        }

        public int getHeightMode() {
            return this.f22791n;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.f22780b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.D(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.f22780b);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f22797b.left;
        }

        @Px
        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.f22780b);
        }

        @Px
        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.f22780b);
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f22797b.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f22797b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f22797b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f22780b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f22780b.F0;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.f22792o;
        }

        public int getWidthMode() {
            return this.m;
        }

        public final void h(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.f22780b.l(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.f22780b.f22770y0;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f22780b.f22770y0.set(i15, i13, i12, i14);
            setMeasuredDimension(this.f22780b.f22770y0, i10, i11);
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.f22780b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public final void i(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f22780b = null;
                this.f22779a = null;
                this.f22792o = 0;
                this.f22793p = 0;
            } else {
                this.f22780b = recyclerView;
                this.f22779a = recyclerView.f22763u0;
                this.f22792o = recyclerView.getWidth();
                this.f22793p = recyclerView.getHeight();
            }
            this.m = 1073741824;
            this.f22791n = 1073741824;
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f22780b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(o1.b(this.f22780b, new StringBuilder("View should be fully attached to be ignored")));
            }
            ViewHolder viewHolderD = RecyclerView.D(view);
            viewHolderD.addFlags(128);
            this.f22780b.v0.d(viewHolderD);
        }

        public boolean isAttachedToWindow() {
            return this.f22785g;
        }

        public boolean isAutoMeasureEnabled() {
            return this.f22786h;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.f22780b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.f22788j;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.f22787i;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.f22783e;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.f22781c.b(view) && this.f22782d.b(view);
            return z10 ? z12 : !z12;
        }

        public final boolean j(View view, int i10, int i11, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f22787i && b(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && b(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean k() {
            return false;
        }

        public final boolean l(View view, int i10, int i11, LayoutParams layoutParams) {
            return (this.f22787i && b(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && b(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void layoutDecorated(@NonNull View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f22797b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i10, int i11, int i12, int i13) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f22797b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectF = this.f22780b.F(view);
            int i12 = rectF.left + rectF.right + i10;
            int i13 = rectF.top + rectF.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i13, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (j(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectF = this.f22780b.F(view);
            int i12 = rectF.left + rectF.right + i10;
            int i13 = rectF.top + rectF.bottom + i11;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (j(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f22780b.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i10) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void offsetChildrenVertical(@Px int i10) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i10, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f22780b;
            onInitializeAccessibilityEvent(recyclerView.f22758r0, recyclerView.f22772z1, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f22780b.canScrollVertically(-1) || this.f22780b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.f22780b.canScrollVertically(1) || this.f22780b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i10) {
            return null;
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i10, int i11) {
            this.f22780b.l(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i10, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i11;
            int i12;
            if (this.f22780b == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.f22780b.getMatrix().isIdentity() && this.f22780b.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i10 == 4096) {
                paddingTop = this.f22780b.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f22780b.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i11 = paddingTop;
                    i12 = paddingLeft;
                } else {
                    i11 = paddingTop;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                paddingTop = this.f22780b.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f22780b.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i11 = paddingTop;
                    i12 = paddingLeft;
                } else {
                    i11 = paddingTop;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f22780b.Z(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i10, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.f22779a.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.D(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i10, @NonNull Recycler recycler) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            recycler.recycleView(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.f22780b.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            androidx.recyclerview.widget.b bVar = this.f22779a;
            u uVar = (u) bVar.f22958a;
            int iIndexOfChild = uVar.f23086a.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (bVar.f22959b.f(iIndexOfChild)) {
                bVar.m(view);
            }
            uVar.a(iIndexOfChild);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.f22779a.l(i10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - width;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            if (z11) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int width2 = getWidth() - getPaddingRight();
                    int height2 = getHeight() - getPaddingBottom();
                    Rect rect2 = this.f22780b.f22770y0;
                    getDecoratedBoundsWithMargins(focusedChild, rect2);
                    if (rect2.left - iMax < width2 && rect2.right - iMax > paddingLeft2 && rect2.top - iMin2 < height2 && rect2.bottom - iMin2 > paddingTop2) {
                        if (iMax == 0) {
                        }
                        if (z10) {
                            recyclerView.scrollBy(iMax, iMin2);
                        } else {
                            recyclerView.smoothScrollBy(iMax, iMin2);
                        }
                        return true;
                    }
                }
            } else if (iMax == 0 || iMin2 != 0) {
                if (z10) {
                    recyclerView.scrollBy(iMax, iMin2);
                } else {
                    recyclerView.smoothScrollBy(iMax, iMin2);
                }
                return true;
            }
            return false;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.f22784f = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i10, Recycler recycler, State state) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i10, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.f22786h = z10;
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.f22788j) {
                this.f22788j = z10;
                this.f22789k = 0;
                RecyclerView recyclerView = this.f22780b;
                if (recyclerView != null) {
                    recyclerView.f22758r0.l();
                }
            }
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i11, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.f22787i = z10;
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f22783e;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.f22783e.stop();
            }
            this.f22783e = smoothScroller;
            RecyclerView recyclerView = this.f22780b;
            smoothScroller.getClass();
            j jVar = recyclerView.f22767w1;
            RecyclerView.this.removeCallbacks(jVar);
            jVar.f22855r0.abortAnimation();
            if (smoothScroller.f22824h) {
                Log.w("RecyclerView", "An instance of " + smoothScroller.getClass().getSimpleName() + " was started more than once. Each instance of" + smoothScroller.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            smoothScroller.f22818b = recyclerView;
            smoothScroller.f22819c = this;
            int i10 = smoothScroller.f22817a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f22772z1.f22831a = i10;
            smoothScroller.f22821e = true;
            smoothScroller.f22820d = true;
            smoothScroller.f22822f = smoothScroller.findViewByPosition(smoothScroller.getTargetPosition());
            smoothScroller.onStart();
            smoothScroller.f22818b.f22767w1.b();
            smoothScroller.f22824h = true;
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            viewHolderD.stopIgnoring();
            viewHolderD.resetInternal();
            viewHolderD.addFlags(4);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i10) {
            a(view, i10, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i10) {
            a(view, i10, false);
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f22780b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f22780b.canScrollVertically(-1) && !this.f22780b.canScrollHorizontally(-1) && !this.f22780b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            Adapter adapter = this.f22780b.G0;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.f22780b.setMeasuredDimension(i10, i11);
        }

        public void attachView(@NonNull View view, int i10) {
            attachView(view, i10, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State state) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i10) {
        }

        public void scrollToPosition(int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i10, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(Recycler recycler, State state) {
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i10, int i11, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i10, int i11);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z10);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public static class RecycledViewPool {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f22800a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22801b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<Adapter<?>> f22802c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<ViewHolder> f22803a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22804b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f22805c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f22806d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f22800a;
            a aVar = sparseArray.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i10, aVar2);
            return aVar2;
        }

        public void clear() {
            int i10 = 0;
            while (true) {
                SparseArray<a> sparseArray = this.f22800a;
                if (i10 >= sparseArray.size()) {
                    return;
                }
                a aVarValueAt = sparseArray.valueAt(i10);
                Iterator<ViewHolder> it = aVarValueAt.f22803a.iterator();
                while (it.hasNext()) {
                    PoolingContainer.callPoolingContainerOnRelease(it.next().itemView);
                }
                aVarValueAt.f22803a.clear();
                i10++;
            }
        }

        @Nullable
        public ViewHolder getRecycledView(int i10) {
            a aVar = this.f22800a.get(i10);
            if (aVar == null) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = aVar.f22803a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i10) {
            return a(i10).f22803a.size();
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = a(itemViewType).f22803a;
            if (this.f22800a.get(itemViewType).f22804b <= arrayList.size()) {
                PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public void setMaxRecycledViews(int i10, int i11) {
            a aVarA = a(i10);
            aVarA.f22804b = i11;
            ArrayList<ViewHolder> arrayList = aVarA.f22803a;
            while (arrayList.size() > i11) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final class Recycler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<ViewHolder> f22807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<ViewHolder> f22808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<ViewHolder> f22809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<ViewHolder> f22810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RecycledViewPool f22813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ViewCacheExtension f22814h;

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f22807a = arrayList;
            this.f22808b = null;
            this.f22809c = new ArrayList<>();
            this.f22810d = Collections.unmodifiableList(arrayList);
            this.f22811e = 2;
            this.f22812f = 2;
        }

        public final void a(@NonNull ViewHolder viewHolder, boolean z10) {
            RecyclerView.g(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.G1;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                ViewCompat.setAccessibilityDelegate(view, itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate ? (AccessibilityDelegateCompat) ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).f22862b.remove(view) : null);
            }
            if (z10) {
                RecyclerListener recyclerListener = recyclerView.I0;
                if (recyclerListener != null) {
                    recyclerListener.onViewRecycled(viewHolder);
                }
                ArrayList arrayList = recyclerView.J0;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RecyclerListener) arrayList.get(i10)).onViewRecycled(viewHolder);
                }
                Adapter adapter = recyclerView.G0;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                if (recyclerView.f22772z1 != null) {
                    recyclerView.v0.d(viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            b().putRecycledView(viewHolder);
        }

        public final RecycledViewPool b() {
            if (this.f22813g == null) {
                this.f22813g = new RecycledViewPool();
                c();
            }
            return this.f22813g;
        }

        public void bindViewToPosition(@NonNull View view, int i10) {
            LayoutParams layoutParams;
            ViewHolder viewHolderD = RecyclerView.D(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (viewHolderD == null) {
                throw new IllegalArgumentException(o1.b(recyclerView, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int iF = recyclerView.f22761t0.f(i10, 0);
            if (iF < 0 || iF >= recyclerView.G0.getItemCount()) {
                StringBuilder sbE = androidx.collection.h.e("Inconsistency detected. Invalid item position ", i10, "(offset:", iF, ").state:");
                sbE.append(recyclerView.f22772z1.getItemCount());
                sbE.append(recyclerView.v());
                throw new IndexOutOfBoundsException(sbE.toString());
            }
            i(viewHolderD, iF, i10, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = viewHolderD.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                viewHolderD.itemView.setLayoutParams(layoutParams);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = (LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
                viewHolderD.itemView.setLayoutParams(layoutParams);
            }
            layoutParams.f22798c = true;
            layoutParams.f22796a = viewHolderD;
            layoutParams.f22799d = viewHolderD.itemView.getParent() == null;
        }

        public final void c() {
            if (this.f22813g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.G0 == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecycledViewPool recycledViewPool = this.f22813g;
                recycledViewPool.f22802c.add(recyclerView.G0);
            }
        }

        public void clear() {
            this.f22807a.clear();
            e();
        }

        public int convertPreLayoutPositionToPostLayout(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f22772z1.getItemCount()) {
                return !recyclerView.f22772z1.isPreLayout() ? i10 : recyclerView.f22761t0.f(i10, 0);
            }
            StringBuilder sbC = o1.c("invalid position ", i10, ". State item count is ");
            sbC.append(recyclerView.f22772z1.getItemCount());
            sbC.append(recyclerView.v());
            throw new IndexOutOfBoundsException(sbC.toString());
        }

        public final void d(Adapter<?> adapter, boolean z10) {
            RecycledViewPool recycledViewPool = this.f22813g;
            if (recycledViewPool == null) {
                return;
            }
            Set<Adapter<?>> set = recycledViewPool.f22802c;
            set.remove(adapter);
            if (set.size() != 0 || z10) {
                return;
            }
            int i10 = 0;
            while (true) {
                SparseArray<RecycledViewPool.a> sparseArray = recycledViewPool.f22800a;
                if (i10 >= sparseArray.size()) {
                    return;
                }
                ArrayList<ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f22803a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    PoolingContainer.callPoolingContainerOnRelease(arrayList.get(i11).itemView);
                }
                i10++;
            }
        }

        public final void e() {
            ArrayList<ViewHolder> arrayList = this.f22809c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                f(size);
            }
            arrayList.clear();
            if (RecyclerView.X1) {
                androidx.recyclerview.widget.j.b bVar = RecyclerView.this.f22771y1;
                int[] iArr = bVar.f23034c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f23035d = 0;
            }
        }

        public final void f(int i10) {
            ArrayList<ViewHolder> arrayList = this.f22809c;
            a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0077  */
        /* JADX WARN: Code duplicated, block: B:42:0x0085  */
        /* JADX WARN: Code duplicated, block: B:44:0x008c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0095 A[LOOP:2: B:43:0x008a->B:47:0x0095, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x0098 A[EDGE_INSN: B:74:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x0098 A[EDGE_INSN: B:75:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092, LOOP_LABEL: LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
        public final void g(ViewHolder viewHolder) {
            boolean z10;
            int i10;
            int i11;
            androidx.recyclerview.widget.j.b bVar;
            int i12;
            int i13;
            boolean zIsScrap = viewHolder.isScrap();
            boolean z11 = false;
            boolean z12 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || viewHolder.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(viewHolder.isScrap());
                sb2.append(" isAttached:");
                sb2.append(viewHolder.itemView.getParent() != null);
                sb2.append(recyclerView.v());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb3.append(viewHolder);
                throw new IllegalArgumentException(o1.b(recyclerView, sb3));
            }
            if (viewHolder.shouldIgnore()) {
                throw new IllegalArgumentException(o1.b(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.G0;
            if ((adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                if (this.f22812f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    ArrayList<ViewHolder> arrayList = this.f22809c;
                    int size = arrayList.size();
                    if (size >= this.f22812f && size > 0) {
                        f(0);
                        size--;
                    }
                    if (RecyclerView.X1 && size > 0) {
                        androidx.recyclerview.widget.j.b bVar2 = recyclerView.f22771y1;
                        int i14 = viewHolder.mPosition;
                        if (bVar2.f23034c != null) {
                            int i15 = bVar2.f23035d * 2;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    i10 = size - 1;
                                    loop1: while (i10 >= 0) {
                                        i11 = arrayList.get(i10).mPosition;
                                        bVar = recyclerView.f22771y1;
                                        if (bVar.f23034c != null) {
                                            break;
                                        }
                                        i12 = bVar.f23035d * 2;
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                break loop1;
                                            } else if (bVar.f23034c[i13] == i11) {
                                                break;
                                            } else {
                                                i13 += 2;
                                            }
                                        }
                                        i10--;
                                    }
                                    size = i10 + 1;
                                } else if (bVar2.f23034c[i16] != i14) {
                                    i16 += 2;
                                }
                            }
                        } else {
                            i10 = size - 1;
                            loop1: while (i10 >= 0) {
                                i11 = arrayList.get(i10).mPosition;
                                bVar = recyclerView.f22771y1;
                                if (bVar.f23034c != null) {
                                    break;
                                    break;
                                }
                                i12 = bVar.f23035d * 2;
                                i13 = 0;
                                while (true) {
                                    if (i13 < i12) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.f23034c[i13] == i11) {
                                        break;
                                    } else {
                                        i13 += 2;
                                    }
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                    }
                    arrayList.add(size, viewHolder);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(viewHolder, true);
                }
                z11 = z10;
            } else {
                z12 = false;
            }
            recyclerView.v0.d(viewHolder);
            if (z11 || z12 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        @NonNull
        public List<ViewHolder> getScrapList() {
            return this.f22810d;
        }

        @NonNull
        public View getViewForPosition(int i10) {
            return j(i10, Long.MAX_VALUE).itemView;
        }

        public final void h(View view) {
            ItemAnimator itemAnimator;
            ViewHolder viewHolderD = RecyclerView.D(view);
            boolean zHasAnyOfTheFlags = viewHolderD.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && viewHolderD.isUpdated() && (itemAnimator = recyclerView.f22746h1) != null && !itemAnimator.canReuseUpdatedViewHolder(viewHolderD, viewHolderD.getUnmodifiedPayloads())) {
                if (this.f22808b == null) {
                    this.f22808b = new ArrayList<>();
                }
                viewHolderD.setScrapContainer(this, true);
                this.f22808b.add(viewHolderD);
                return;
            }
            if (viewHolderD.isInvalid() && !viewHolderD.isRemoved() && !recyclerView.G0.hasStableIds()) {
                throw new IllegalArgumentException(o1.b(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            viewHolderD.setScrapContainer(this, false);
            this.f22807a.add(viewHolderD);
        }

        public final boolean i(@NonNull ViewHolder viewHolder, int i10, int i11, long j10) {
            viewHolder.mBindingAdapter = null;
            RecyclerView recyclerView = RecyclerView.this;
            viewHolder.mOwnerRecyclerView = recyclerView;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE) {
                long j11 = this.f22813g.a(itemViewType).f22806d;
                if (j11 != 0 && j11 + nanoTime >= j10) {
                    return false;
                }
            }
            recyclerView.G0.bindViewHolder(viewHolder, i10);
            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
            RecycledViewPool.a aVarA = this.f22813g.a(viewHolder.getItemViewType());
            long j12 = aVarA.f22806d;
            if (j12 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
            }
            aVarA.f22806d = nanoTime2;
            AccessibilityManager accessibilityManager = recyclerView.W0;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z10 = true;
            }
            if (z10) {
                View view = viewHolder.itemView;
                if (ViewCompat.getImportantForAccessibility(view) == 0) {
                    ViewCompat.setImportantForAccessibility(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.G1;
                if (recyclerViewAccessibilityDelegate != null) {
                    AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                    if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                        RecyclerViewAccessibilityDelegate.ItemDelegate itemDelegate2 = (RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate;
                        itemDelegate2.getClass();
                        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
                        if (accessibilityDelegate != null && accessibilityDelegate != itemDelegate2) {
                            itemDelegate2.f22862b.put(view, accessibilityDelegate);
                        }
                    }
                    ViewCompat.setAccessibilityDelegate(view, itemDelegate);
                }
            }
            if (recyclerView.f22772z1.isPreLayout()) {
                viewHolder.mPreLayoutPosition = i11;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:114:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:115:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:117:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:119:0x0201  */
        /* JADX WARN: Code duplicated, block: B:198:0x0373 A[PHI: r1 r10
          0x0373: PHI (r1v7 boolean) = (r1v6 boolean), (r1v24 boolean) binds: [B:122:0x0217, B:178:0x0315] A[DONT_GENERATE, DONT_INLINE]
          0x0373: PHI (r10v3 androidx.recyclerview.widget.RecyclerView$ViewHolder) = 
          (r10v2 androidx.recyclerview.widget.RecyclerView$ViewHolder)
          (r10v8 androidx.recyclerview.widget.RecyclerView$ViewHolder)
         binds: [B:122:0x0217, B:178:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:225:0x03ff  */
        /* JADX WARN: Code duplicated, block: B:226:0x040b  */
        /* JADX WARN: Code duplicated, block: B:228:0x0411  */
        /* JADX WARN: Code duplicated, block: B:229:0x041d  */
        /* JADX WARN: Code duplicated, block: B:35:0x0084 A[EDGE_INSN: B:35:0x0084->B:36:0x0085 BREAK  A[LOOP:0: B:14:0x0028->B:20:0x0042]] */
        @Nullable
        public final ViewHolder j(int i10, long j10) {
            boolean z10;
            ViewHolder childViewHolder;
            ViewHolder viewHolder;
            boolean z11;
            boolean zI;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView recyclerViewZ;
            ViewCacheExtension viewCacheExtension;
            View viewForPositionAndType;
            View view;
            int size;
            int iF;
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 < 0 || i10 >= recyclerView.f22772z1.getItemCount()) {
                StringBuilder sbE = androidx.collection.h.e("Invalid item position ", i10, "(", i10, "). Item count:");
                sbE.append(recyclerView.f22772z1.getItemCount());
                sbE.append(recyclerView.v());
                throw new IndexOutOfBoundsException(sbE.toString());
            }
            State state = recyclerView.f22772z1;
            boolean z12 = false;
            if (state.isPreLayout()) {
                ArrayList<ViewHolder> arrayList = this.f22808b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            if (recyclerView.G0.hasStableIds() && (iF = recyclerView.f22761t0.f(i10, 0)) > 0 && iF < recyclerView.G0.getItemCount()) {
                                long itemId = recyclerView.G0.getItemId(iF);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    ViewHolder viewHolder2 = this.f22808b.get(i12);
                                    if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                                        viewHolder2.addFlags(32);
                                        childViewHolder = viewHolder2;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                childViewHolder = null;
                                break;
                            }
                        } else {
                            childViewHolder = this.f22808b.get(i11);
                            if (!childViewHolder.wasReturnedFromScrap() && childViewHolder.getLayoutPosition() == i10) {
                                childViewHolder.addFlags(32);
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    childViewHolder = null;
                    break;
                }
                z10 = childViewHolder != null;
            } else {
                z10 = false;
                childViewHolder = null;
            }
            ArrayList<ViewHolder> arrayList2 = this.f22809c;
            ArrayList<ViewHolder> arrayList3 = this.f22807a;
            if (childViewHolder == null) {
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        androidx.recyclerview.widget.b bVar = recyclerView.f22763u0;
                        ArrayList arrayList4 = bVar.f22960c;
                        int size3 = arrayList4.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i14);
                            ((u) bVar.f22958a).getClass();
                            ViewHolder viewHolderD = RecyclerView.D(view);
                            if (viewHolderD.getLayoutPosition() == i10 && !viewHolderD.isInvalid() && !viewHolderD.isRemoved()) {
                                break;
                            }
                            i14++;
                        }
                        if (view == null) {
                            int size4 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size4) {
                                    childViewHolder = null;
                                    break;
                                }
                                childViewHolder = arrayList2.get(i15);
                                if (!childViewHolder.isInvalid() && childViewHolder.getLayoutPosition() == i10 && !childViewHolder.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i15);
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            ViewHolder viewHolderD2 = RecyclerView.D(view);
                            androidx.recyclerview.widget.b bVar2 = recyclerView.f22763u0;
                            int iIndexOfChild = ((u) bVar2.f22958a).f23086a.indexOfChild(view);
                            if (iIndexOfChild < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                            }
                            androidx.recyclerview.widget.b.a aVar = bVar2.f22959b;
                            if (!aVar.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            aVar.a(iIndexOfChild);
                            bVar2.m(view);
                            int iJ = recyclerView.f22763u0.j(view);
                            if (iJ == -1) {
                                StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb2.append(viewHolderD2);
                                throw new IllegalStateException(o1.b(recyclerView, sb2));
                            }
                            recyclerView.f22763u0.c(iJ);
                            h(view);
                            viewHolderD2.addFlags(8224);
                            childViewHolder = viewHolderD2;
                            break;
                        }
                    } else {
                        ViewHolder viewHolder3 = arrayList3.get(i13);
                        if (!viewHolder3.wasReturnedFromScrap() && viewHolder3.getLayoutPosition() == i10 && !viewHolder3.isInvalid() && (state.f22838h || !viewHolder3.isRemoved())) {
                            viewHolder3.addFlags(32);
                            childViewHolder = viewHolder3;
                            break;
                        }
                        i13++;
                    }
                }
                if (childViewHolder != null) {
                    if (!childViewHolder.isRemoved()) {
                        int i16 = childViewHolder.mPosition;
                        if (i16 < 0 || i16 >= recyclerView.G0.getItemCount()) {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(childViewHolder);
                            throw new IndexOutOfBoundsException(o1.b(recyclerView, sb3));
                        }
                        if ((state.isPreLayout() || recyclerView.G0.getItemViewType(childViewHolder.mPosition) == childViewHolder.getItemViewType()) && (!recyclerView.G0.hasStableIds() || childViewHolder.getItemId() == recyclerView.G0.getItemId(childViewHolder.mPosition))) {
                            z10 = true;
                        } else {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            g(childViewHolder);
                            childViewHolder = null;
                        }
                    } else if (state.isPreLayout()) {
                        z10 = true;
                    } else {
                        childViewHolder.addFlags(4);
                        if (childViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolder.itemView, false);
                            childViewHolder.unScrap();
                        } else if (childViewHolder.wasReturnedFromScrap()) {
                            childViewHolder.clearReturnedFromScrapFlag();
                        }
                        g(childViewHolder);
                        childViewHolder = null;
                    }
                }
            }
            if (childViewHolder != null) {
                viewHolder = childViewHolder;
                z11 = z10;
            } else {
                int iF2 = recyclerView.f22761t0.f(i10, 0);
                if (iF2 < 0 || iF2 >= recyclerView.G0.getItemCount()) {
                    StringBuilder sbE2 = androidx.collection.h.e("Inconsistency detected. Invalid item position ", i10, "(offset:", iF2, ").state:");
                    sbE2.append(state.getItemCount());
                    sbE2.append(recyclerView.v());
                    throw new IndexOutOfBoundsException(sbE2.toString());
                }
                int itemViewType = recyclerView.G0.getItemViewType(iF2);
                if (recyclerView.G0.hasStableIds()) {
                    long itemId2 = recyclerView.G0.getItemId(iF2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    ViewHolder viewHolder4 = arrayList2.get(size6);
                                    if (viewHolder4.getItemId() != itemId2 || viewHolder4.isAttachedToTransitionOverlay()) {
                                        size6--;
                                    } else {
                                        if (itemViewType == viewHolder4.getItemViewType()) {
                                            arrayList2.remove(size6);
                                            childViewHolder = viewHolder4;
                                            break;
                                        }
                                        f(size6);
                                    }
                                }
                                childViewHolder = null;
                                break;
                            }
                        }
                        ViewHolder viewHolder5 = arrayList3.get(size5);
                        if (viewHolder5.getItemId() == itemId2 && !viewHolder5.wasReturnedFromScrap()) {
                            if (itemViewType == viewHolder5.getItemViewType()) {
                                viewHolder5.addFlags(32);
                                if (viewHolder5.isRemoved() && !state.isPreLayout()) {
                                    viewHolder5.setFlags(2, 14);
                                }
                                childViewHolder = viewHolder5;
                                break;
                            }
                            arrayList3.remove(size5);
                            recyclerView.removeDetachedView(viewHolder5.itemView, false);
                            ViewHolder viewHolderD3 = RecyclerView.D(viewHolder5.itemView);
                            viewHolderD3.mScrapContainer = null;
                            viewHolderD3.mInChangeScrap = false;
                            viewHolderD3.clearReturnedFromScrapFlag();
                            g(viewHolderD3);
                        }
                        size5--;
                    }
                    if (childViewHolder != null) {
                        childViewHolder.mPosition = iF2;
                        z10 = true;
                    }
                }
                if (childViewHolder == null && (viewCacheExtension = this.f22814h) != null && (viewForPositionAndType = viewCacheExtension.getViewForPositionAndType(this, i10, itemViewType)) != null) {
                    childViewHolder = recyclerView.getChildViewHolder(viewForPositionAndType);
                    if (childViewHolder == null) {
                        throw new IllegalArgumentException(o1.b(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                    }
                    if (childViewHolder.shouldIgnore()) {
                        throw new IllegalArgumentException(o1.b(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                    }
                }
                if (childViewHolder == null) {
                    ViewHolder recycledView = b().getRecycledView(itemViewType);
                    if (recycledView != null) {
                        recycledView.resetInternal();
                        int[] iArr = RecyclerView.T1;
                    }
                    childViewHolder = recycledView;
                }
                if (childViewHolder == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j10 != Long.MAX_VALUE) {
                        long j11 = this.f22813g.a(itemViewType).f22805c;
                        if (j11 != 0 && j11 + nanoTime >= j10) {
                            return null;
                        }
                    }
                    ViewHolder viewHolderCreateViewHolder = recyclerView.G0.createViewHolder(recyclerView, itemViewType);
                    if (RecyclerView.X1 && (recyclerViewZ = RecyclerView.z(viewHolderCreateViewHolder.itemView)) != null) {
                        viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewZ);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    RecycledViewPool.a aVarA = this.f22813g.a(itemViewType);
                    long j12 = aVarA.f22805c;
                    if (j12 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
                    }
                    aVarA.f22805c = nanoTime2;
                    z11 = z10;
                    viewHolder = viewHolderCreateViewHolder;
                } else {
                    viewHolder = childViewHolder;
                    z11 = z10;
                }
            }
            if (z11 && !state.isPreLayout() && viewHolder.hasAnyOfTheFlags(8192)) {
                viewHolder.setFlags(0, 8192);
                if (state.f22841k) {
                    recyclerView.Q(viewHolder, recyclerView.f22746h1.recordPreLayoutInformation(state, viewHolder, ItemAnimator.a(viewHolder) | 4096, viewHolder.getUnmodifiedPayloads()));
                }
            }
            if (!state.isPreLayout() || !viewHolder.isBound()) {
                if (!viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                    zI = i(viewHolder, recyclerView.f22761t0.f(i10, 0), i10, j10);
                }
                layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) layoutParams;
                } else {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                }
                layoutParams2.f22796a = viewHolder;
                if (z11 && zI) {
                    z12 = true;
                }
                layoutParams2.f22799d = z12;
                return viewHolder;
            }
            viewHolder.mPreLayoutPosition = i10;
            zI = false;
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.f22796a = viewHolder;
            if (z11) {
                z12 = true;
            }
            layoutParams2.f22799d = z12;
            return viewHolder;
        }

        public final void k(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f22808b.remove(viewHolder);
            } else {
                this.f22807a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public final void l() {
            LayoutManager layoutManager = RecyclerView.this.H0;
            this.f22812f = this.f22811e + (layoutManager != null ? layoutManager.f22789k : 0);
            ArrayList<ViewHolder> arrayList = this.f22809c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f22812f; size--) {
                f(size);
            }
        }

        public void recycleView(@NonNull View view) {
            ViewHolder viewHolderD = RecyclerView.D(view);
            boolean zIsTmpDetached = viewHolderD.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (viewHolderD.isScrap()) {
                viewHolderD.unScrap();
            } else if (viewHolderD.wasReturnedFromScrap()) {
                viewHolderD.clearReturnedFromScrapFlag();
            }
            g(viewHolderD);
            if (recyclerView.f22746h1 == null || viewHolderD.isRecyclable()) {
                return;
            }
            recyclerView.f22746h1.endAnimation(viewHolderD);
        }

        public void setViewCacheSize(int i10) {
            this.f22811e = i10;
            l();
        }
    }

    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder viewHolder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Parcelable f22816q0;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22816q0 = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f22816q0, 0);
        }
    }

    public static abstract class SmoothScroller {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f22818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LayoutManager f22819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f22822f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22824h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22817a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Action f22823g = new Action(0, 0);

        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f22825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f22827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f22828d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f22829e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f22830f;

            public Action(@Px int i10, @Px int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f22828d;
                if (i10 >= 0) {
                    this.f22828d = -1;
                    recyclerView.G(i10);
                    this.f22830f = false;
                } else if (this.f22830f) {
                    Interpolator interpolator = this.f22829e;
                    if (interpolator != null && this.f22827c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.f22827c;
                    if (i11 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView.f22767w1.c(this.f22825a, this.f22826b, i11, interpolator);
                    this.f22830f = false;
                }
            }

            public int getDuration() {
                return this.f22827c;
            }

            @Px
            public int getDx() {
                return this.f22825a;
            }

            @Px
            public int getDy() {
                return this.f22826b;
            }

            @Nullable
            public Interpolator getInterpolator() {
                return this.f22829e;
            }

            public void jumpTo(int i10) {
                this.f22828d = i10;
            }

            public void setDuration(int i10) {
                this.f22830f = true;
                this.f22827c = i10;
            }

            public void setDx(@Px int i10) {
                this.f22830f = true;
                this.f22825a = i10;
            }

            public void setDy(@Px int i10) {
                this.f22830f = true;
                this.f22826b = i10;
            }

            public void setInterpolator(@Nullable Interpolator interpolator) {
                this.f22830f = true;
                this.f22829e = interpolator;
            }

            public void update(@Px int i10, @Px int i11, int i12, @Nullable Interpolator interpolator) {
                this.f22825a = i10;
                this.f22826b = i11;
                this.f22827c = i12;
                this.f22829e = interpolator;
                this.f22830f = true;
            }

            public Action(@Px int i10, @Px int i11, int i12) {
                this(i10, i11, i12, null);
            }

            public Action(@Px int i10, @Px int i11, int i12, @Nullable Interpolator interpolator) {
                this.f22828d = -1;
                this.f22830f = false;
                this.f22825a = i10;
                this.f22826b = i11;
                this.f22827c = i12;
                this.f22829e = interpolator;
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int i10);
        }

        public final void a(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.f22818b;
            if (this.f22817a == -1 || recyclerView == null) {
                stop();
            }
            if (this.f22820d && this.f22822f == null && this.f22819c != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.f22817a)) != null) {
                float f6 = pointFComputeScrollVectorForPosition.x;
                if (f6 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.W((int) Math.signum(f6), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.f22820d = false;
            View view = this.f22822f;
            Action action = this.f22823g;
            if (view != null) {
                if (getChildPosition(view) == this.f22817a) {
                    onTargetFound(this.f22822f, recyclerView.f22772z1, action);
                    action.a(recyclerView);
                    stop();
                } else {
                    this.f22822f = null;
                }
            }
            if (this.f22821e) {
                onSeekTargetStep(i10, i11, recyclerView.f22772z1, action);
                boolean z10 = action.f22828d >= 0;
                action.a(recyclerView);
                if (z10 && this.f22821e) {
                    this.f22820d = true;
                    recyclerView.f22767w1.b();
                }
            }
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.f22818b.H0.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.f22818b.H0.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.f22818b.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.f22819c;
        }

        public int getTargetPosition() {
            return this.f22817a;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.f22818b.scrollToPosition(i10);
        }

        public boolean isPendingInitialRun() {
            return this.f22820d;
        }

        public boolean isRunning() {
            return this.f22821e;
        }

        public void normalize(@NonNull PointF pointF) {
            float f6 = pointF.x;
            float f10 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f6 * f6));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.f22822f = view;
            }
        }

        public abstract void onSeekTargetStep(@Px int i10, @Px int i11, @NonNull State state, @NonNull Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull State state, @NonNull Action action);

        public void setTargetPosition(int i10) {
            this.f22817a = i10;
        }

        public final void stop() {
            if (this.f22821e) {
                this.f22821e = false;
                onStop();
                this.f22818b.f22772z1.f22831a = -1;
                this.f22822f = null;
                this.f22817a = -1;
                this.f22820d = false;
                LayoutManager layoutManager = this.f22819c;
                if (layoutManager.f22783e == this) {
                    layoutManager.f22783e = null;
                }
                this.f22819c = null;
                this.f22818b = null;
            }
        }
    }

    public static class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<Object> f22832b;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f22843n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22844o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22845p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22846q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22831a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22833c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22834d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22835e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22836f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f22837g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22838h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22839i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22840j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f22841k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22842l = false;

        public final void a(int i10) {
            if ((this.f22835e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f22835e));
        }

        public boolean didStructureChange() {
            return this.f22837g;
        }

        public <T> T get(int i10) {
            SparseArray<Object> sparseArray = this.f22832b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i10);
        }

        public int getItemCount() {
            return this.f22838h ? this.f22833c - this.f22834d : this.f22836f;
        }

        public int getRemainingScrollHorizontal() {
            return this.f22845p;
        }

        public int getRemainingScrollVertical() {
            return this.f22846q;
        }

        public int getTargetScrollPosition() {
            return this.f22831a;
        }

        public boolean hasTargetScrollPosition() {
            return this.f22831a != -1;
        }

        public boolean isMeasuring() {
            return this.f22840j;
        }

        public boolean isPreLayout() {
            return this.f22838h;
        }

        public void put(int i10, Object obj) {
            if (this.f22832b == null) {
                this.f22832b = new SparseArray<>();
            }
            this.f22832b.put(i10, obj);
        }

        public void remove(int i10) {
            SparseArray<Object> sparseArray = this.f22832b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f22831a);
            sb2.append(", mData=");
            sb2.append(this.f22832b);
            sb2.append(", mItemCount=");
            sb2.append(this.f22836f);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f22840j);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f22833c);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f22834d);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f22837g);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f22838h);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f22841k);
            sb2.append(", mRunPredictiveAnimations=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f22842l, AbstractJsonLexerKt.END_OBJ);
        }

        public boolean willRunPredictiveAnimations() {
            return this.f22842l;
        }

        public boolean willRunSimpleAnimations() {
            return this.f22841k;
        }
    }

    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler recycler, int i10, int i11);
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public ViewHolder(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.B(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int iB;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iB = this.mOwnerRecyclerView.B(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iB);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f22798c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            }
            if (!recyclerView.isComputingLayout()) {
                ViewCompat.setImportantForAccessibility(this.itemView, 4);
            } else {
                this.mPendingAccessibilityState = 4;
                recyclerView.N1.add(this);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i10 = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.isComputingLayout()) {
                this.mPendingAccessibilityState = i10;
                recyclerView.N1.add(this);
            } else {
                ViewCompat.setImportantForAccessibility(this.itemView, i10);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.g(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z10) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbE = androidx.camera.core.processing.f.e(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbE.append(Integer.toHexString(hashCode()));
            sbE.append(" position=");
            sbE.append(this.mPosition);
            sbE.append(" id=");
            sbE.append(this.mItemId);
            sbE.append(", oldPos=");
            sbE.append(this.mOldPosition);
            sbE.append(", pLpos:");
            sbE.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbE.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.k(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.P0 || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.N0) {
                recyclerView.requestLayout();
            } else if (recyclerView.S0) {
                recyclerView.R0 = true;
            } else {
                recyclerView.k();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            ItemAnimator itemAnimator = recyclerView.f22746h1;
            if (itemAnimator != null) {
                itemAnimator.runPendingAnimations();
            }
            recyclerView.F1 = false;
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f10 = f6 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class d {
        public d() {
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22850a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f22850a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22850a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class f extends Observable<AdapterDataObserver> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public final void d(int i10, int i11, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public class g implements ItemAnimator.a {
        public g() {
        }
    }

    public class h extends AdapterDataObserver {
        public h() {
        }

        public final void a() {
            boolean z10 = RecyclerView.W1;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.O0 && recyclerView.N0) {
                ViewCompat.postOnAnimation(recyclerView, recyclerView.f22768x0);
            } else {
                recyclerView.V0 = true;
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(null);
            recyclerView.f22772z1.f22837g = true;
            recyclerView.P(true);
            if (recyclerView.f22761t0.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f22761t0;
            if (i11 < 1) {
                aVar.getClass();
                return;
            }
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f22949b;
            arrayList.add(aVar.h(4, i10, i11, obj));
            aVar.f22953f |= 4;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f22761t0;
            if (i11 < 1) {
                aVar.getClass();
                return;
            }
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f22949b;
            arrayList.add(aVar.h(1, i10, i11, null));
            aVar.f22953f |= 1;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f22761t0;
            aVar.getClass();
            if (i10 == i11) {
                return;
            }
            if (i12 != 1) {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f22949b;
            arrayList.add(aVar.h(8, i10, i11, null));
            aVar.f22953f |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f22761t0;
            if (i11 < 1) {
                aVar.getClass();
                return;
            }
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f22949b;
            arrayList.add(aVar.h(2, i10, i11, null));
            aVar.f22953f |= 2;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f22759s0 == null || (adapter = recyclerView.G0) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    public static class i extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        @NonNull
        public final EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22853p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f22854q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public OverScroller f22855r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Interpolator f22856s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f22857t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f22858u0;

        public j() {
            c cVar = RecyclerView.Z1;
            this.f22856s0 = cVar;
            this.f22857t0 = false;
            this.f22858u0 = false;
            this.f22855r0 = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f22854q0 = 0;
            this.f22853p0 = 0;
            Interpolator interpolator = this.f22856s0;
            c cVar = RecyclerView.Z1;
            if (interpolator != cVar) {
                this.f22856s0 = cVar;
                this.f22855r0 = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.f22855r0.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f22857t0) {
                this.f22858u0 = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            ViewCompat.postOnAnimation(recyclerView, this);
        }

        public final void c(int i10, int i11, int i12, @Nullable Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i10);
                int iAbs2 = Math.abs(i11);
                boolean z10 = iAbs > iAbs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    iAbs = iAbs2;
                }
                i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), Guess.REFERENCE_YEAR);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.Z1;
            }
            if (this.f22856s0 != interpolator) {
                this.f22856s0 = interpolator;
                this.f22855r0 = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f22854q0 = 0;
            this.f22853p0 = 0;
            recyclerView.setScrollState(2);
            this.f22855r0.startScroll(0, 0, i10, i11, i13);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.H0 == null) {
                recyclerView.removeCallbacks(this);
                this.f22855r0.abortAnimation();
                return;
            }
            this.f22858u0 = false;
            this.f22857t0 = true;
            recyclerView.k();
            OverScroller overScroller = this.f22855r0;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f22853p0;
                int i16 = currY - this.f22854q0;
                this.f22853p0 = currX;
                this.f22854q0 = currY;
                int iJ = RecyclerView.j(i15, recyclerView.f22742d1, recyclerView.f22744f1, recyclerView.getWidth());
                int iJ2 = RecyclerView.j(i16, recyclerView.f22743e1, recyclerView.f22745g1, recyclerView.getHeight());
                int[] iArr = recyclerView.M1;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zDispatchNestedPreScroll = recyclerView.dispatchNestedPreScroll(iJ, iJ2, iArr, null, 1);
                int[] iArr2 = recyclerView.M1;
                if (zDispatchNestedPreScroll) {
                    iJ -= iArr2[0];
                    iJ2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.i(iJ, iJ2);
                }
                if (recyclerView.G0 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.W(iJ, iJ2, iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    int i19 = iJ - i17;
                    int i20 = iJ2 - i18;
                    SmoothScroller smoothScroller = recyclerView.H0.f22783e;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = recyclerView.f22772z1.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.a(i17, i18);
                        } else {
                            smoothScroller.a(i17, i18);
                        }
                    }
                    i13 = i17;
                    i10 = i19;
                    i11 = i20;
                    i12 = i18;
                } else {
                    i10 = iJ;
                    i11 = iJ2;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.K0.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.M1;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i21 = i12;
                recyclerView.dispatchNestedScroll(i13, i12, i10, i11, null, 1, iArr3);
                int i22 = i10 - iArr2[0];
                int i23 = i11 - iArr2[1];
                if (i13 != 0 || i21 != 0) {
                    recyclerView.q(i13, i21);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
                SmoothScroller smoothScroller2 = recyclerView.H0.f22783e;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z10) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i22 < 0) {
                            i14 = -currVelocity;
                        } else {
                            i14 = i22 > 0 ? currVelocity : 0;
                        }
                        if (i23 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i23 <= 0) {
                            currVelocity = 0;
                        }
                        if (i14 < 0) {
                            recyclerView.s();
                            if (recyclerView.f22742d1.isFinished()) {
                                recyclerView.f22742d1.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView.t();
                            if (recyclerView.f22744f1.isFinished()) {
                                recyclerView.f22744f1.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.u();
                            if (recyclerView.f22743e1.isFinished()) {
                                recyclerView.f22743e1.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.r();
                            if (recyclerView.f22745g1.isFinished()) {
                                recyclerView.f22745g1.onAbsorb(currVelocity);
                            }
                        }
                        if (i14 != 0 || currVelocity != 0) {
                            ViewCompat.postInvalidateOnAnimation(recyclerView);
                        }
                    }
                    if (RecyclerView.X1) {
                        androidx.recyclerview.widget.j.b bVar = recyclerView.f22771y1;
                        int[] iArr4 = bVar.f23034c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f23035d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.j jVar = recyclerView.f22769x1;
                    if (jVar != null) {
                        jVar.a(recyclerView, i13, i21);
                    }
                }
            }
            SmoothScroller smoothScroller3 = recyclerView.H0.f22783e;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.a(0, 0);
            }
            this.f22857t0 = false;
            if (this.f22858u0) {
                recyclerView.removeCallbacks(this);
                ViewCompat.postOnAnimation(recyclerView, this);
            } else {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        Y1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Z1 = new c();
        f22738a2 = new i();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public static ViewHolder D(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f22796a;
    }

    public static void E(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f22797b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static void g(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.J1 == null) {
            this.J1 = new NestedScrollingChildHelper(this);
        }
        return this.J1;
    }

    public static int j(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int iRound = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f6 = i11;
        int iRound2 = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect2, (i10 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    @Nullable
    public static RecyclerView z(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewZ = z(viewGroup.getChildAt(i10));
            if (recyclerViewZ != null) {
                return recyclerViewZ;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public final ViewHolder A(int i10, boolean z10) {
        int iH = this.f22763u0.h();
        ViewHolder viewHolder = null;
        for (int i11 = 0; i11 < iH; i11++) {
            ViewHolder viewHolderD = D(this.f22763u0.g(i11));
            if (viewHolderD != null && !viewHolderD.isRemoved()) {
                if (z10) {
                    if (viewHolderD.mPosition != i10) {
                        continue;
                    } else {
                        if (this.f22763u0.k(viewHolderD.itemView)) {
                            return viewHolderD;
                        }
                        viewHolder = viewHolderD;
                    }
                } else if (viewHolderD.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.f22763u0.k(viewHolderD.itemView)) {
                        return viewHolderD;
                    }
                    viewHolder = viewHolderD;
                }
            }
        }
        return viewHolder;
    }

    public final int B(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.f22761t0;
        int i10 = viewHolder.mPosition;
        ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f22949b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.recyclerview.widget.a.b bVar = arrayList.get(i11);
            int i12 = bVar.f22954a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f22955b;
                    if (i13 <= i10) {
                        int i14 = bVar.f22957d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f22955b;
                    if (i15 == i10) {
                        i10 = bVar.f22957d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f22957d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f22955b <= i10) {
                i10 += bVar.f22957d;
            }
        }
        return i10;
    }

    public final long C(ViewHolder viewHolder) {
        return this.G0.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public final Rect F(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z10 = layoutParams.f22798c;
        Rect rect = layoutParams.f22797b;
        if (!z10) {
            return rect;
        }
        State state = this.f22772z1;
        if (state.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<ItemDecoration> arrayList = this.K0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f22770y0;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).getItemOffsets(rect2, view, this, state);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f22798c = false;
        return rect;
    }

    public final void G(int i10) {
        if (this.H0 == null) {
            return;
        }
        setScrollState(2);
        this.H0.scrollToPosition(i10);
        awakenScrollBars();
    }

    public final void H() {
        int iH = this.f22763u0.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((LayoutParams) this.f22763u0.g(i10).getLayoutParams()).f22798c = true;
        }
        ArrayList<ViewHolder> arrayList = this.f22758r0.f22809c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutParams layoutParams = (LayoutParams) arrayList.get(i11).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f22798c = true;
            }
        }
    }

    public final void I(int i10, int i11, @Nullable MotionEvent motionEvent) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || this.S0) {
            return;
        }
        int[] iArr = this.M1;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.H0.canScrollVertically();
        int i12 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iR = i10 - R(height, i10);
        int iS = i11 - S(width, i11);
        startNestedScroll(i12, 1);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iR : 0, zCanScrollVertically ? iS : 0, this.M1, this.K1, 1)) {
            iR -= iArr[0];
            iS -= iArr[1];
        }
        V(zCanScrollHorizontally ? iR : 0, zCanScrollVertically ? iS : 0, motionEvent, 1);
        androidx.recyclerview.widget.j jVar = this.f22769x1;
        if (jVar != null && (iR != 0 || iS != 0)) {
            jVar.a(this, iR, iS);
        }
        stopNestedScroll(1);
    }

    public final void J(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.f22763u0.h();
        for (int i13 = 0; i13 < iH; i13++) {
            ViewHolder viewHolderD = D(this.f22763u0.g(i13));
            if (viewHolderD != null && !viewHolderD.shouldIgnore()) {
                int i14 = viewHolderD.mPosition;
                State state = this.f22772z1;
                if (i14 >= i12) {
                    viewHolderD.offsetPosition(-i11, z10);
                    state.f22837g = true;
                } else if (i14 >= i10) {
                    viewHolderD.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    state.f22837g = true;
                }
            }
        }
        Recycler recycler = this.f22758r0;
        ArrayList<ViewHolder> arrayList = recycler.f22809c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = arrayList.get(size);
            if (viewHolder != null) {
                int i15 = viewHolder.mPosition;
                if (i15 >= i12) {
                    viewHolder.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    viewHolder.addFlags(8);
                    recycler.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void K() {
        this.f22739a1++;
    }

    public final void L(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f22739a1 - 1;
        this.f22739a1 = i11;
        if (i11 < 1) {
            this.f22739a1 = 0;
            if (z10) {
                int i12 = this.U0;
                this.U0 = 0;
                if (i12 != 0 && (accessibilityManager = this.W0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    AccessibilityEventCompat.setContentChangeTypes(accessibilityEventObtain, i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.N1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                    if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i10 = viewHolder.mPendingAccessibilityState) != -1) {
                        ViewCompat.setImportantForAccessibility(viewHolder.itemView, i10);
                        viewHolder.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void M(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f22748j1) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f22748j1 = motionEvent.getPointerId(i10);
            int x4 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f22752n1 = x4;
            this.f22750l1 = x4;
            int y7 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f22753o1 = y7;
            this.f22751m1 = y7;
        }
    }

    public final void N() {
        if (this.F1 || !this.N0) {
            return;
        }
        ViewCompat.postOnAnimation(this, this.O1);
        this.F1 = true;
    }

    public final void O() {
        boolean z10;
        boolean z11 = false;
        if (this.Y0) {
            androidx.recyclerview.widget.a aVar = this.f22761t0;
            aVar.k(aVar.f22949b);
            aVar.k(aVar.f22950c);
            aVar.f22953f = 0;
            if (this.Z0) {
                this.H0.onItemsChanged(this);
            }
        }
        if (this.f22746h1 == null || !this.H0.supportsPredictiveItemAnimations()) {
            this.f22761t0.c();
        } else {
            this.f22761t0.j();
        }
        boolean z12 = this.C1 || this.D1;
        boolean z13 = this.P0 && this.f22746h1 != null && ((z10 = this.Y0) || z12 || this.H0.f22784f) && (!z10 || this.G0.hasStableIds());
        State state = this.f22772z1;
        state.f22841k = z13;
        if (z13 && z12 && !this.Y0 && this.f22746h1 != null && this.H0.supportsPredictiveItemAnimations()) {
            z11 = true;
        }
        state.f22842l = z11;
    }

    public final void P(boolean z10) {
        this.Z0 = z10 | this.Z0;
        this.Y0 = true;
        int iH = this.f22763u0.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ViewHolder viewHolderD = D(this.f22763u0.g(i10));
            if (viewHolderD != null && !viewHolderD.shouldIgnore()) {
                viewHolderD.addFlags(6);
            }
        }
        H();
        Recycler recycler = this.f22758r0;
        ArrayList<ViewHolder> arrayList = recycler.f22809c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ViewHolder viewHolder = arrayList.get(i11);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.G0;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.e();
        }
    }

    public final void Q(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        boolean z10 = this.f22772z1.f22839i;
        x xVar = this.v0;
        if (z10 && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            xVar.f23089b.put(C(viewHolder), viewHolder);
        }
        SimpleArrayMap<ViewHolder, x.a> simpleArrayMap = xVar.f23088a;
        x.a aVarA = simpleArrayMap.get(viewHolder);
        if (aVarA == null) {
            aVarA = x.a.a();
            simpleArrayMap.put(viewHolder, aVarA);
        }
        aVarA.f23092b = itemHolderInfo;
        aVarA.f23091a |= 4;
    }

    public final int R(float f6, int i10) {
        float height = f6 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f22742d1;
        float f10 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f22744f1;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f22744f1.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(this.f22744f1, width, height);
                    if (EdgeEffectCompat.getDistance(this.f22744f1) == 0.0f) {
                        this.f22744f1.onRelease();
                    }
                    f10 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f22742d1.onRelease();
            } else {
                float f11 = -EdgeEffectCompat.onPullDistance(this.f22742d1, -width, 1.0f - height);
                if (EdgeEffectCompat.getDistance(this.f22742d1) == 0.0f) {
                    this.f22742d1.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    public final int S(float f6, int i10) {
        float width = f6 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f22743e1;
        float f10 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f22745g1;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f22745g1.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(this.f22745g1, height, 1.0f - width);
                    if (EdgeEffectCompat.getDistance(this.f22745g1) == 0.0f) {
                        this.f22745g1.onRelease();
                    }
                    f10 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f22743e1.onRelease();
            } else {
                float f11 = -EdgeEffectCompat.onPullDistance(this.f22743e1, -height, width);
                if (EdgeEffectCompat.getDistance(this.f22743e1) == 0.0f) {
                    this.f22743e1.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    public final void T(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f22770y0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f22798c) {
                int i10 = rect.left;
                Rect rect2 = layoutParams2.f22797b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.H0.requestChildRectangleOnScreen(this, view, this.f22770y0, !this.P0, view2 == null);
    }

    public final void U() {
        VelocityTracker velocityTracker = this.f22749k1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f22742d1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f22742d1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f22743e1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f22743e1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f22744f1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f22744f1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f22745g1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f22745g1.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    public final boolean V(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        k();
        Adapter adapter = this.G0;
        int[] iArr = this.M1;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            W(i10, i11, iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            i14 = i17;
            i13 = i18;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.K0.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.M1;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int i19 = i13;
        dispatchNestedScroll(i14, i13, i15, i16, this.K1, i12, iArr2);
        int i20 = iArr[0];
        int i21 = i15 - i20;
        int i22 = iArr[1];
        int i23 = i16 - i22;
        boolean z11 = (i20 == 0 && i22 == 0) ? false : true;
        int i24 = this.f22752n1;
        int[] iArr3 = this.K1;
        int i25 = iArr3[0];
        this.f22752n1 = i24 - i25;
        int i26 = this.f22753o1;
        int i27 = iArr3[1];
        this.f22753o1 = i26 - i27;
        int[] iArr4 = this.L1;
        iArr4[0] = iArr4[0] + i25;
        iArr4[1] = iArr4[1] + i27;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, 8194)) {
                float x4 = motionEvent.getX();
                float f6 = i21;
                float y7 = motionEvent.getY();
                float f10 = i23;
                if (f6 < 0.0f) {
                    s();
                    EdgeEffectCompat.onPullDistance(this.f22742d1, (-f6) / getWidth(), 1.0f - (y7 / getHeight()));
                } else {
                    if (f6 > 0.0f) {
                        t();
                        EdgeEffectCompat.onPullDistance(this.f22744f1, f6 / getWidth(), y7 / getHeight());
                    } else {
                        z10 = false;
                    }
                    if (f10 < 0.0f) {
                        u();
                        EdgeEffectCompat.onPullDistance(this.f22743e1, (-f10) / getHeight(), x4 / getWidth());
                    } else if (f10 > 0.0f) {
                        r();
                        EdgeEffectCompat.onPullDistance(this.f22745g1, f10 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else if (!z10 || f6 != 0.0f || f10 != 0.0f) {
                    }
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                z10 = true;
                if (f10 < 0.0f) {
                    u();
                    EdgeEffectCompat.onPullDistance(this.f22743e1, (-f10) / getHeight(), x4 / getWidth());
                } else if (f10 > 0.0f) {
                    r();
                    EdgeEffectCompat.onPullDistance(this.f22745g1, f10 / getHeight(), 1.0f - (x4 / getWidth()));
                } else if (!z10) {
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
            i(i10, i11);
        }
        if (i14 != 0 || i19 != 0) {
            q(i14, i19);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i14 == 0 && i19 == 0) ? false : true;
    }

    public final void W(int i10, int i11, @Nullable int[] iArr) {
        ViewHolder viewHolder;
        a0();
        K();
        TraceCompat.beginSection("RV Scroll");
        State state = this.f22772z1;
        w(state);
        Recycler recycler = this.f22758r0;
        int iScrollHorizontallyBy = i10 != 0 ? this.H0.scrollHorizontallyBy(i10, recycler, state) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.H0.scrollVerticallyBy(i11, recycler, state) : 0;
        TraceCompat.endSection();
        int iE = this.f22763u0.e();
        for (int i12 = 0; i12 < iE; i12++) {
            View viewD = this.f22763u0.d(i12);
            ViewHolder childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        L(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public final void X(@Nullable Adapter<?> adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.G0;
        h hVar = this.f22756q0;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(hVar);
            this.G0.onDetachedFromRecyclerView(this);
        }
        Recycler recycler = this.f22758r0;
        if (!z10 || z11) {
            ItemAnimator itemAnimator = this.f22746h1;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            LayoutManager layoutManager = this.H0;
            if (layoutManager != null) {
                layoutManager.removeAndRecycleAllViews(recycler);
                this.H0.d(recycler);
            }
            recycler.clear();
        }
        androidx.recyclerview.widget.a aVar = this.f22761t0;
        aVar.k(aVar.f22949b);
        aVar.k(aVar.f22950c);
        aVar.f22953f = 0;
        Adapter<?> adapter3 = this.G0;
        this.G0 = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(hVar);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager2 = this.H0;
        if (layoutManager2 != null) {
            layoutManager2.onAdapterChanged(adapter3, this.G0);
        }
        Adapter adapter4 = this.G0;
        recycler.clear();
        recycler.d(adapter3, true);
        RecycledViewPool recycledViewPoolB = recycler.b();
        if (adapter3 != null) {
            recycledViewPoolB.f22801b--;
        }
        if (!z10 && recycledViewPoolB.f22801b == 0) {
            recycledViewPoolB.clear();
        }
        if (adapter4 != null) {
            recycledViewPoolB.f22801b++;
        } else {
            recycledViewPoolB.getClass();
        }
        recycler.c();
        this.f22772z1.f22837g = true;
    }

    public final boolean Y(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f6 = this.f22754p0 * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d2 = U1;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f6))) < distance;
    }

    public final void Z(@Px int i10, @Px int i11, @Nullable Interpolator interpolator, int i12, boolean z10) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || this.S0) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.H0.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            startNestedScroll(i13, 1);
        }
        this.f22767w1.c(i10, i11, i12, interpolator);
    }

    public final void a0() {
        int i10 = this.Q0 + 1;
        this.Q0 = i10;
        if (i10 != 1 || this.S0) {
            return;
        }
        this.R0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i10) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<ItemDecoration> arrayList = this.K0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            arrayList.add(itemDecoration);
        } else {
            arrayList.add(i10, itemDecoration);
        }
        H();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.X0 == null) {
            this.X0 = new ArrayList();
        }
        this.X0.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.L0.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.B1 == null) {
            this.B1 = new ArrayList();
        }
        this.B1.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        Preconditions.checkArgument(recyclerListener != null, "'listener' arg cannot be null.");
        this.J0.add(recyclerListener);
    }

    public final void b0(boolean z10) {
        if (this.Q0 < 1) {
            this.Q0 = 1;
        }
        if (!z10 && !this.S0) {
            this.R0 = false;
        }
        if (this.Q0 == 1) {
            if (z10 && this.R0 && !this.S0 && this.H0 != null && this.G0 != null) {
                n();
            }
            if (!this.S0) {
                this.R0 = false;
            }
        }
        this.Q0--;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.H0.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOnChildAttachStateChangeListeners() {
        ArrayList arrayList = this.X0;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void clearOnScrollListeners() {
        ArrayList arrayList = this.B1;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.H0.computeHorizontalScrollExtent(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.H0.computeHorizontalScrollOffset(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.H0.computeHorizontalScrollRange(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.H0.computeVerticalScrollExtent(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.H0.computeVerticalScrollOffset(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.H0.computeVerticalScrollRange(this.f22772z1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f6, float f10, boolean z10) {
        return getScrollingChildHelper().dispatchNestedFling(f6, f10, z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f6, float f10) {
        return getScrollingChildHelper().dispatchNestedPreFling(f6, f10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList<ItemDecoration> arrayList = this.K0;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onDrawOver(canvas, this, this.f22772z1);
        }
        EdgeEffect edgeEffect = this.f22742d1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f22766w0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f22742d1;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f22743e1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f22766w0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f22743e1;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f22744f1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f22766w0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f22744f1;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f22745g1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f22766w0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f22745g1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f22746h1 == null || arrayList.size() <= 0 || !this.f22746h1.isRunning()) && !z10) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z10 = view.getParent() == this;
        this.f22758r0.k(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.f22763u0.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f22763u0.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f22763u0;
        int iIndexOfChild = ((u) bVar.f22958a).f23086a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            bVar.f22959b.h(iIndexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(o1.b(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f22740b1 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(o1.b(this, new StringBuilder(""))));
        }
    }

    @Nullable
    public View findChildViewUnder(float f6, float f10) {
        for (int iE = this.f22763u0.e() - 1; iE >= 0; iE--) {
            View viewD = this.f22763u0.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f6 >= viewD.getLeft() + translationX && f6 <= viewD.getRight() + translationX && f10 >= viewD.getTop() + translationY && f10 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i10) {
        ViewHolder viewHolder = null;
        if (this.Y0) {
            return null;
        }
        int iH = this.f22763u0.h();
        for (int i11 = 0; i11 < iH; i11++) {
            ViewHolder viewHolderD = D(this.f22763u0.g(i11));
            if (viewHolderD != null && !viewHolderD.isRemoved() && B(viewHolderD) == i10) {
                if (!this.f22763u0.k(viewHolderD.itemView)) {
                    return viewHolderD;
                }
                viewHolder = viewHolderD;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j10) {
        Adapter adapter = this.G0;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iH = this.f22763u0.h();
            for (int i10 = 0; i10 < iH; i10++) {
                ViewHolder viewHolderD = D(this.f22763u0.g(i10));
                if (viewHolderD != null && !viewHolderD.isRemoved() && viewHolderD.getItemId() == j10) {
                    if (!this.f22763u0.k(viewHolderD.itemView)) {
                        return viewHolderD;
                    }
                    viewHolder = viewHolderD;
                }
            }
        }
        return viewHolder;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i10) {
        return A(i10, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i10) {
        return A(i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public boolean fling(int i10, int i11) {
        int iMax;
        int i12;
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || this.S0) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.H0.canScrollVertically();
        int i13 = this.r1;
        if (iCanScrollHorizontally == 0 || Math.abs(i10) < i13) {
            i10 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i11) < i13) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f22742d1;
            if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f22744f1;
                if (edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (Y(this.f22744f1, i10, getWidth())) {
                    this.f22744f1.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i14 = -i10;
                if (Y(this.f22742d1, i14, getWidth())) {
                    this.f22742d1.onAbsorb(i14);
                    i10 = 0;
                }
            }
            iMax = i10;
            i10 = 0;
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f22743e1;
            if (edgeEffect3 == null || EdgeEffectCompat.getDistance(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f22745g1;
                if (edgeEffect4 == null || EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f) {
                    i12 = i11;
                    i11 = 0;
                } else if (Y(this.f22745g1, i11, getHeight())) {
                    this.f22745g1.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i15 = -i11;
                if (Y(this.f22743e1, i15, getHeight())) {
                    this.f22743e1.onAbsorb(i15);
                    i11 = 0;
                }
            }
            i12 = 0;
        }
        j jVar = this.f22767w1;
        int i16 = this.f22760s1;
        if (iMax != 0 || i11 != 0) {
            iMax = Math.max(-i16, Math.min(iMax, i16));
            i11 = Math.max(-i16, Math.min(i11, i16));
            jVar.a(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f6 = i10;
        float f10 = i12;
        if (!dispatchNestedPreFling(f6, f10)) {
            boolean z10 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f6, f10, z10);
            OnFlingListener onFlingListener = this.f22757q1;
            if (onFlingListener != null && onFlingListener.onFling(i10, i12)) {
                return true;
            }
            if (z10) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                jVar.a(Math.max(-i16, Math.min(i10, i16)), Math.max(-i16, Math.min(i12, i16)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewOnFocusSearchFailed;
        int i11;
        byte b10;
        boolean z10;
        View viewOnInterceptFocusSearch = this.H0.onInterceptFocusSearch(view, i10);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z11 = (this.G0 == null || this.H0 == null || isComputingLayout() || this.S0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        State state = this.f22772z1;
        Recycler recycler = this.f22758r0;
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.H0.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.H0.canScrollHorizontally()) {
                z10 = focusFinder.findNextFocus(this, view, (this.H0.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                k();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                a0();
                this.H0.onFocusSearchFailed(view, i10, recycler, state);
                b0(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                k();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                a0();
                viewOnFocusSearchFailed = this.H0.onFocusSearchFailed(view, i10, recycler, state);
                b0(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed != null && !viewOnFocusSearchFailed.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            T(viewOnFocusSearchFailed, null);
            return view;
        }
        if (viewOnFocusSearchFailed != null && viewOnFocusSearchFailed != this && viewOnFocusSearchFailed != view && findContainingItemView(viewOnFocusSearchFailed) != null) {
            if (view == null || findContainingItemView(view) == null) {
                return viewOnFocusSearchFailed;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f22770y0;
            rect.set(0, 0, width, height);
            int width2 = viewOnFocusSearchFailed.getWidth();
            int height2 = viewOnFocusSearchFailed.getHeight();
            Rect rect2 = this.E0;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewOnFocusSearchFailed, rect2);
            int i12 = this.H0.getLayoutDirection() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b10 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i10);
                                    throw new IllegalArgumentException(o1.b(this, sb2));
                                }
                                if (b10 > 0) {
                                    return viewOnFocusSearchFailed;
                                }
                            } else if (i11 > 0) {
                                return viewOnFocusSearchFailed;
                            }
                        } else if (b10 < 0) {
                            return viewOnFocusSearchFailed;
                        }
                    } else if (i11 < 0) {
                        return viewOnFocusSearchFailed;
                    }
                } else {
                    if (b10 > 0) {
                        return viewOnFocusSearchFailed;
                    }
                    if (b10 == 0 && i11 * i12 > 0) {
                        return viewOnFocusSearchFailed;
                    }
                }
            } else {
                if (b10 < 0) {
                    return viewOnFocusSearchFailed;
                }
                if (b10 == 0 && i11 * i12 < 0) {
                    return viewOnFocusSearchFailed;
                }
            }
        }
        return super.focusSearch(view, i10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(o1.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(o1.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.G0;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.H0;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder viewHolderD = D(view);
        if (viewHolderD != null) {
            return viewHolderD.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.H1;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i10, i11) : childDrawingOrderCallback.onGetChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder viewHolderD;
        Adapter adapter = this.G0;
        if (adapter == null || !adapter.hasStableIds() || (viewHolderD = D(view)) == null) {
            return -1L;
        }
        return viewHolderD.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder viewHolderD = D(view);
        if (viewHolderD != null) {
            return viewHolderD.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return D(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f22766w0;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.G1;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        E(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.f22741c1;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.f22746h1;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.K0.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.K0.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.H0;
    }

    public int getMaxFlingVelocity() {
        return this.f22760s1;
    }

    public int getMinFlingVelocity() {
        return this.r1;
    }

    public long getNanoTime() {
        if (X1) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.f22757q1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f22765v1;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.f22758r0.b();
    }

    public int getScrollState() {
        return this.f22747i1;
    }

    public final void h() {
        int iH = this.f22763u0.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ViewHolder viewHolderD = D(this.f22763u0.g(i10));
            if (!viewHolderD.shouldIgnore()) {
                viewHolderD.clearOldPosition();
            }
        }
        Recycler recycler = this.f22758r0;
        ArrayList<ViewHolder> arrayList = recycler.f22809c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).clearOldPosition();
        }
        ArrayList<ViewHolder> arrayList2 = recycler.f22807a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.get(i12).clearOldPosition();
        }
        ArrayList<ViewHolder> arrayList3 = recycler.f22808b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                recycler.f22808b.get(i13).clearOldPosition();
            }
        }
    }

    public boolean hasFixedSize() {
        return this.O0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.P0 || this.Y0 || this.f22761t0.g();
    }

    public final void i(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f22742d1;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f22742d1.onRelease();
            zIsFinished = this.f22742d1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f22744f1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f22744f1.onRelease();
            zIsFinished |= this.f22744f1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f22743e1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f22743e1.onRelease();
            zIsFinished |= this.f22743e1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f22745g1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f22745g1.onRelease();
            zIsFinished |= this.f22745g1.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void invalidateItemDecorations() {
        if (this.K0.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        H();
        requestLayout();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.f22746h1;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.N0;
    }

    public boolean isComputingLayout() {
        return this.f22739a1 > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.S0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    public final void k() {
        if (!this.P0 || this.Y0) {
            TraceCompat.beginSection("RV FullInvalidate");
            n();
            TraceCompat.endSection();
            return;
        }
        if (this.f22761t0.g()) {
            androidx.recyclerview.widget.a aVar = this.f22761t0;
            int i10 = aVar.f22953f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (aVar.g()) {
                    TraceCompat.beginSection("RV FullInvalidate");
                    n();
                    TraceCompat.endSection();
                    return;
                }
                return;
            }
            TraceCompat.beginSection("RV PartialInvalidate");
            a0();
            K();
            this.f22761t0.j();
            if (!this.R0) {
                int iE = this.f22763u0.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    ViewHolder viewHolderD = D(this.f22763u0.d(i11));
                    if (viewHolderD != null && !viewHolderD.shouldIgnore() && viewHolderD.isUpdated()) {
                        n();
                    }
                }
                this.f22761t0.b();
            }
            b0(true);
            L(true);
            TraceCompat.endSection();
        }
    }

    public final void l(int i10, int i11) {
        setMeasuredDimension(LayoutManager.chooseSize(i10, getPaddingRight() + getPaddingLeft(), ViewCompat.getMinimumWidth(this)), LayoutManager.chooseSize(i11, getPaddingBottom() + getPaddingTop(), ViewCompat.getMinimumHeight(this)));
    }

    public final void m(View view) {
        ViewHolder viewHolderD = D(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.G0;
        if (adapter != null && viewHolderD != null) {
            adapter.onViewDetachedFromWindow(viewHolderD);
        }
        ArrayList arrayList = this.X0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.X0.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0324  */
    /* JADX WARN: Code duplicated, block: B:163:0x0339  */
    /* JADX WARN: Code duplicated, block: B:165:0x033c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0354  */
    /* JADX WARN: Code duplicated, block: B:173:0x035c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0360  */
    /* JADX WARN: Code duplicated, block: B:178:0x0368  */
    /* JADX WARN: Code duplicated, block: B:181:0x036f  */
    /* JADX WARN: Code duplicated, block: B:184:0x037a A[LOOP:3: B:177:0x0366->B:184:0x037a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0384  */
    /* JADX WARN: Code duplicated, block: B:190:0x038b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0396 A[LOOP:4: B:186:0x0382->B:193:0x0396, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x0399 A[EDGE_INSN: B:194:0x0399->B:195:0x039a BREAK  A[LOOP:4: B:186:0x0382->B:193:0x0396]] */
    /* JADX WARN: Code duplicated, block: B:196:0x039c  */
    /* JADX WARN: Code duplicated, block: B:233:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0393 A[SYNTHETIC] */
    public final void n() {
        ViewHolder viewHolderFindViewHolderForItemId;
        View view;
        int i10;
        int itemCount;
        int i11;
        int iMin;
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        int i12;
        View viewFindViewById;
        if (this.G0 == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.H0 == null) {
            return;
        }
        State state = this.f22772z1;
        state.f22840j = false;
        boolean z10 = this.P1 && !(this.Q1 == getWidth() && this.R1 == getHeight());
        this.Q1 = 0;
        this.R1 = 0;
        this.P1 = false;
        if (state.f22835e == 1) {
            o();
            this.H0.f(this);
            p();
        } else {
            androidx.recyclerview.widget.a aVar = this.f22761t0;
            if ((aVar.f22950c.isEmpty() || aVar.f22949b.isEmpty()) && !z10 && this.H0.getWidth() == getWidth() && this.H0.getHeight() == getHeight()) {
                this.H0.f(this);
            } else {
                this.H0.f(this);
                p();
            }
        }
        state.a(4);
        a0();
        K();
        state.f22835e = 1;
        boolean z11 = state.f22841k;
        Recycler recycler = this.f22758r0;
        x xVar = this.v0;
        if (z11) {
            for (int iE = this.f22763u0.e() - 1; iE >= 0; iE--) {
                ViewHolder viewHolderD = D(this.f22763u0.d(iE));
                if (!viewHolderD.shouldIgnore()) {
                    long jC = C(viewHolderD);
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = this.f22746h1.recordPostLayoutInformation(state, viewHolderD);
                    ViewHolder viewHolder = xVar.f23089b.get(jC);
                    if (viewHolder == null || viewHolder.shouldIgnore()) {
                        xVar.a(viewHolderD, itemHolderInfoRecordPostLayoutInformation);
                    } else {
                        SimpleArrayMap<ViewHolder, x.a> simpleArrayMap = xVar.f23088a;
                        x.a aVar2 = simpleArrayMap.get(viewHolder);
                        boolean z12 = (aVar2 == null || (aVar2.f23091a & 1) == 0) ? false : true;
                        x.a aVar3 = simpleArrayMap.get(viewHolderD);
                        boolean z13 = (aVar3 == null || (aVar3.f23091a & 1) == 0) ? false : true;
                        if (z12 && viewHolder == viewHolderD) {
                            xVar.a(viewHolderD, itemHolderInfoRecordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoB = xVar.b(viewHolder, 4);
                            xVar.a(viewHolderD, itemHolderInfoRecordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo itemHolderInfoB2 = xVar.b(viewHolderD, 8);
                            if (itemHolderInfoB == null) {
                                int iE2 = this.f22763u0.e();
                                for (int i13 = 0; i13 < iE2; i13++) {
                                    ViewHolder viewHolderD2 = D(this.f22763u0.d(i13));
                                    if (viewHolderD2 != viewHolderD && C(viewHolderD2) == jC) {
                                        Adapter adapter = this.G0;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(viewHolderD2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(viewHolderD);
                                            throw new IllegalStateException(o1.b(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(viewHolderD2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(viewHolderD);
                                        throw new IllegalStateException(o1.b(this, sb3));
                                    }
                                }
                                Objects.toString(viewHolder);
                                Objects.toString(viewHolderD);
                                v();
                            } else {
                                viewHolder.setIsRecyclable(false);
                                if (z12) {
                                    e(viewHolder);
                                }
                                if (viewHolder != viewHolderD) {
                                    if (z13) {
                                        e(viewHolderD);
                                    }
                                    viewHolder.mShadowedHolder = viewHolderD;
                                    e(viewHolder);
                                    recycler.k(viewHolder);
                                    viewHolderD.setIsRecyclable(false);
                                    viewHolderD.mShadowingHolder = viewHolder;
                                }
                                if (this.f22746h1.animateChange(viewHolder, viewHolderD, itemHolderInfoB, itemHolderInfoB2)) {
                                    N();
                                }
                            }
                        }
                    }
                }
            }
            SimpleArrayMap<ViewHolder, x.a> simpleArrayMap2 = xVar.f23088a;
            for (int size = simpleArrayMap2.getSize() - 1; size >= 0; size--) {
                ViewHolder viewHolderKeyAt = simpleArrayMap2.keyAt(size);
                x.a aVarRemoveAt = simpleArrayMap2.removeAt(size);
                int i14 = aVarRemoveAt.f23091a;
                int i15 = i14 & 3;
                d dVar = this.S1;
                if (i15 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.H0.removeAndRecycleView(viewHolderKeyAt.itemView, recyclerView.f22758r0);
                } else if ((i14 & 1) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo = aVarRemoveAt.f23092b;
                    if (itemHolderInfo == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.H0.removeAndRecycleView(viewHolderKeyAt.itemView, recyclerView2.f22758r0);
                    } else {
                        ItemAnimator.ItemHolderInfo itemHolderInfo2 = aVarRemoveAt.f23093c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.f22758r0.k(viewHolderKeyAt);
                        recyclerView3.e(viewHolderKeyAt);
                        viewHolderKeyAt.setIsRecyclable(false);
                        if (recyclerView3.f22746h1.animateDisappearance(viewHolderKeyAt, itemHolderInfo, itemHolderInfo2)) {
                            recyclerView3.N();
                        }
                    }
                } else if ((i14 & 14) == 14) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo3 = aVarRemoveAt.f23092b;
                    ItemAnimator.ItemHolderInfo itemHolderInfo4 = aVarRemoveAt.f23093c;
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.getClass();
                    viewHolderKeyAt.setIsRecyclable(false);
                    if (recyclerView4.f22746h1.animateAppearance(viewHolderKeyAt, itemHolderInfo3, itemHolderInfo4)) {
                        recyclerView4.N();
                    }
                } else if ((i14 & 12) == 12) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo5 = aVarRemoveAt.f23092b;
                    ItemAnimator.ItemHolderInfo itemHolderInfo6 = aVarRemoveAt.f23093c;
                    dVar.getClass();
                    viewHolderKeyAt.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    if (recyclerView5.Y0) {
                        if (recyclerView5.f22746h1.animateChange(viewHolderKeyAt, viewHolderKeyAt, itemHolderInfo5, itemHolderInfo6)) {
                            recyclerView5.N();
                        }
                    } else if (recyclerView5.f22746h1.animatePersistence(viewHolderKeyAt, itemHolderInfo5, itemHolderInfo6)) {
                        recyclerView5.N();
                    }
                } else if ((i14 & 4) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo7 = aVarRemoveAt.f23092b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.f22758r0.k(viewHolderKeyAt);
                    recyclerView6.e(viewHolderKeyAt);
                    viewHolderKeyAt.setIsRecyclable(false);
                    if (recyclerView6.f22746h1.animateDisappearance(viewHolderKeyAt, itemHolderInfo7, null)) {
                        recyclerView6.N();
                    }
                } else if ((i14 & 8) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo8 = aVarRemoveAt.f23092b;
                    ItemAnimator.ItemHolderInfo itemHolderInfo9 = aVarRemoveAt.f23093c;
                    RecyclerView recyclerView7 = RecyclerView.this;
                    recyclerView7.getClass();
                    viewHolderKeyAt.setIsRecyclable(false);
                    if (recyclerView7.f22746h1.animateAppearance(viewHolderKeyAt, itemHolderInfo8, itemHolderInfo9)) {
                        recyclerView7.N();
                    }
                }
                aVarRemoveAt.f23091a = 0;
                aVarRemoveAt.f23092b = null;
                aVarRemoveAt.f23093c = null;
                x.a.f23090d.release(aVarRemoveAt);
            }
        }
        this.H0.d(recycler);
        state.f22833c = state.f22836f;
        this.Y0 = false;
        this.Z0 = false;
        state.f22841k = false;
        state.f22842l = false;
        this.H0.f22784f = false;
        ArrayList<ViewHolder> arrayList = recycler.f22808b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.H0;
        if (layoutManager.f22790l) {
            layoutManager.f22789k = 0;
            layoutManager.f22790l = false;
            recycler.l();
        }
        this.H0.onLayoutCompleted(state);
        L(true);
        b0(false);
        xVar.f23088a.clear();
        xVar.f23089b.clear();
        int[] iArr = this.I1;
        int i16 = iArr[0];
        int i17 = iArr[1];
        y(iArr);
        if (iArr[0] != i16 || iArr[1] != i17) {
            q(0, 0);
        }
        if (this.f22765v1 && this.G0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (state.f22843n == -1) {
                    viewHolderFindViewHolderForItemId = null;
                } else {
                    viewHolderFindViewHolderForItemId = null;
                }
                if (viewHolderFindViewHolderForItemId == null) {
                    if (!this.f22763u0.f22960c.contains(viewHolderFindViewHolderForItemId.itemView)) {
                        if (this.f22763u0.e() <= 0) {
                            view = null;
                            break;
                        }
                        int i18 = state.m;
                        if (i18 != -1) {
                        }
                        itemCount = state.getItemCount();
                        i11 = i10;
                        while (true) {
                            if (i11 < itemCount) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            iMin = Math.min(itemCount, i10) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                            view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    } else {
                        if (this.f22763u0.e() <= 0) {
                            view = null;
                            break;
                        }
                        int i19 = state.m;
                        if (i19 != -1) {
                        }
                        itemCount = state.getItemCount();
                        i11 = i10;
                        while (true) {
                            if (i11 < itemCount) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            iMin = Math.min(itemCount, i10) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                            view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    }
                } else {
                    if (this.f22763u0.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i110 = state.m;
                    if (i110 != -1) {
                    }
                    itemCount = state.getItemCount();
                    i11 = i10;
                    while (true) {
                        if (i11 < itemCount) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(itemCount, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i12 = state.f22844o;
                    if (i12 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f22763u0.f22960c.contains(getFocusedChild())) {
                if (state.f22843n == -1 && this.G0.hasStableIds()) {
                    viewHolderFindViewHolderForItemId = findViewHolderForItemId(state.f22843n);
                } else {
                    viewHolderFindViewHolderForItemId = null;
                }
                if (viewHolderFindViewHolderForItemId == null) {
                    if (this.f22763u0.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i111 = state.m;
                    if (i111 != -1) {
                    }
                    itemCount = state.getItemCount();
                    i11 = i10;
                    while (true) {
                        if (i11 < itemCount) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(itemCount, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                } else if (!this.f22763u0.f22960c.contains(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
                    view = viewHolderFindViewHolderForItemId.itemView;
                } else {
                    if (this.f22763u0.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i112 = state.m;
                    i10 = i112 != -1 ? i112 : 0;
                    itemCount = state.getItemCount();
                    i11 = i10;
                    while (true) {
                        if (i11 < itemCount) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(itemCount, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i12 = state.f22844o;
                    if (i12 != -1 && (viewFindViewById = view.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        state.f22843n = -1L;
        state.m = -1;
        state.f22844o = -1;
    }

    public void nestedScrollBy(int i10, int i11) {
        I(i10, i11, null);
    }

    public final void o() {
        x.a aVar;
        State state = this.f22772z1;
        state.a(1);
        w(state);
        state.f22840j = false;
        a0();
        x xVar = this.v0;
        xVar.f23088a.clear();
        LongSparseArray<ViewHolder> longSparseArray = xVar.f23089b;
        longSparseArray.clear();
        K();
        O();
        View focusedChild = (this.f22765v1 && hasFocus() && this.G0 != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            state.f22843n = -1L;
            state.m = -1;
            state.f22844o = -1;
        } else {
            state.f22843n = this.G0.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
            state.m = this.Y0 ? -1 : viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
            View focusedChild2 = viewHolderFindContainingViewHolder.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            state.f22844o = id;
        }
        state.f22839i = state.f22841k && this.D1;
        this.D1 = false;
        this.C1 = false;
        state.f22838h = state.f22842l;
        state.f22836f = this.G0.getItemCount();
        y(this.I1);
        boolean z10 = state.f22841k;
        SimpleArrayMap<ViewHolder, x.a> simpleArrayMap = xVar.f23088a;
        if (z10) {
            int iE = this.f22763u0.e();
            for (int i10 = 0; i10 < iE; i10++) {
                ViewHolder viewHolderD = D(this.f22763u0.d(i10));
                if (!viewHolderD.shouldIgnore() && (!viewHolderD.isInvalid() || this.G0.hasStableIds())) {
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = this.f22746h1.recordPreLayoutInformation(state, viewHolderD, ItemAnimator.a(viewHolderD), viewHolderD.getUnmodifiedPayloads());
                    x.a aVarA = simpleArrayMap.get(viewHolderD);
                    if (aVarA == null) {
                        aVarA = x.a.a();
                        simpleArrayMap.put(viewHolderD, aVarA);
                    }
                    aVarA.f23092b = itemHolderInfoRecordPreLayoutInformation;
                    aVarA.f23091a |= 4;
                    if (state.f22839i && viewHolderD.isUpdated() && !viewHolderD.isRemoved() && !viewHolderD.shouldIgnore() && !viewHolderD.isInvalid()) {
                        longSparseArray.put(C(viewHolderD), viewHolderD);
                    }
                }
            }
        }
        if (state.f22842l) {
            int iH = this.f22763u0.h();
            for (int i11 = 0; i11 < iH; i11++) {
                ViewHolder viewHolderD2 = D(this.f22763u0.g(i11));
                if (!viewHolderD2.shouldIgnore()) {
                    viewHolderD2.saveOldPosition();
                }
            }
            boolean z11 = state.f22837g;
            state.f22837g = false;
            this.H0.onLayoutChildren(this.f22758r0, state);
            state.f22837g = z11;
            for (int i12 = 0; i12 < this.f22763u0.e(); i12++) {
                ViewHolder viewHolderD3 = D(this.f22763u0.d(i12));
                if (!viewHolderD3.shouldIgnore() && ((aVar = simpleArrayMap.get(viewHolderD3)) == null || (aVar.f23091a & 4) == 0)) {
                    int iA = ItemAnimator.a(viewHolderD3);
                    boolean zHasAnyOfTheFlags = viewHolderD3.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iA |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation2 = this.f22746h1.recordPreLayoutInformation(state, viewHolderD3, iA, viewHolderD3.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        Q(viewHolderD3, itemHolderInfoRecordPreLayoutInformation2);
                    } else {
                        x.a aVarA2 = simpleArrayMap.get(viewHolderD3);
                        if (aVarA2 == null) {
                            aVarA2 = x.a.a();
                            simpleArrayMap.put(viewHolderD3, aVarA2);
                        }
                        aVarA2.f23091a |= 2;
                        aVarA2.f23092b = itemHolderInfoRecordPreLayoutInformation2;
                    }
                }
            }
            h();
        } else {
            h();
        }
        L(true);
        b0(false);
        state.f22835e = 2;
    }

    public void offsetChildrenHorizontal(@Px int i10) {
        int iE = this.f22763u0.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.f22763u0.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(@Px int i10) {
        int iE = this.f22763u0.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.f22763u0.d(i11).offsetTopAndBottom(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f22739a1 = 0;
        this.N0 = true;
        this.P0 = this.P0 && !isLayoutRequested();
        this.f22758r0.c();
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            layoutManager.f22785g = true;
            layoutManager.onAttachedToWindow(this);
        }
        this.F1 = false;
        if (X1) {
            ThreadLocal<androidx.recyclerview.widget.j> threadLocal = androidx.recyclerview.widget.j.f23026t0;
            androidx.recyclerview.widget.j jVar = threadLocal.get();
            this.f22769x1 = jVar;
            if (jVar == null) {
                this.f22769x1 = new androidx.recyclerview.widget.j();
                Display display = ViewCompat.getDisplay(this);
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.j jVar2 = this.f22769x1;
                jVar2.f23030r0 = (long) (1.0E9f / refreshRate);
                threadLocal.set(jVar2);
            }
            this.f22769x1.f23028p0.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f22746h1;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.N0 = false;
        LayoutManager layoutManager = this.H0;
        Recycler recycler = this.f22758r0;
        if (layoutManager != null) {
            layoutManager.f22785g = false;
            layoutManager.onDetachedFromWindow(this, recycler);
        }
        this.N1.clear();
        removeCallbacks(this.O1);
        this.v0.getClass();
        while (x.a.f23090d.acquire() != 0) {
        }
        int i10 = 0;
        while (true) {
            ArrayList<ViewHolder> arrayList = recycler.f22809c;
            if (i10 >= arrayList.size()) {
                break;
            }
            PoolingContainer.callPoolingContainerOnRelease(arrayList.get(i10).itemView);
            i10++;
        }
        recycler.d(RecyclerView.this.G0, false);
        PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if (!X1 || (jVar = this.f22769x1) == null) {
            return;
        }
        jVar.f23028p0.remove(this);
        this.f22769x1 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<ItemDecoration> arrayList = this.K0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onDraw(canvas, this, this.f22772z1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float axisValue;
        if (this.H0 != null && !this.S0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f6 = this.H0.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.H0.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.H0.canScrollVertically()) {
                    f6 = -axisValue2;
                } else if (this.H0.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f6 = 0.0f;
                } else {
                    f6 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f6 = 0.0f;
                axisValue = 0.0f;
            }
            if (f6 != 0.0f || axisValue != 0.0f) {
                I((int) (axisValue * this.f22762t1), (int) (f6 * this.f22764u1), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        boolean z11;
        if (this.S0) {
            return false;
        }
        this.M0 = null;
        if (x(motionEvent)) {
            U();
            setScrollState(0);
            return true;
        }
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.H0.canScrollVertically();
        if (this.f22749k1 == null) {
            this.f22749k1 = VelocityTracker.obtain();
        }
        this.f22749k1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.T0) {
                this.T0 = false;
            }
            this.f22748j1 = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f22752n1 = x4;
            this.f22750l1 = x4;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.f22753o1 = y7;
            this.f22751m1 = y7;
            EdgeEffect edgeEffect = this.f22742d1;
            if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z10 = false;
            } else {
                EdgeEffectCompat.onPullDistance(this.f22742d1, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z10 = true;
            }
            EdgeEffect edgeEffect2 = this.f22744f1;
            boolean z12 = z10;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                z12 = z10;
                z12 = z10;
                EdgeEffectCompat.onPullDistance(this.f22744f1, 0.0f, motionEvent.getY() / getHeight());
                z12 = true;
            }
            z12 = z10;
            z12 = z10;
            z12 = z10;
            EdgeEffect edgeEffect3 = this.f22743e1;
            boolean z13 = z12;
            if (edgeEffect3 != null && EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                z13 = z12;
                z13 = z12;
                EdgeEffectCompat.onPullDistance(this.f22743e1, 0.0f, motionEvent.getX() / getWidth());
                z13 = true;
            }
            z13 = z12;
            z13 = z12;
            z13 = z12;
            EdgeEffect edgeEffect4 = this.f22745g1;
            if (edgeEffect4 == null || EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z13 || this.f22747i1 == 2) {
                }
                int[] iArr = this.L1;
                iArr[1] = 0;
                iArr[0] = 0;
                i10 = zCanScrollHorizontally;
                if (zCanScrollVertically) {
                    i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
                }
                startNestedScroll(i10, 0);
            } else {
                EdgeEffectCompat.onPullDistance(this.f22745g1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
            stopNestedScroll(1);
            int[] iArr2 = this.L1;
            iArr2[1] = 0;
            iArr2[0] = 0;
            i10 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.f22749k1.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f22748j1);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x6 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f22747i1 != 1) {
                int i11 = x6 - this.f22750l1;
                int i12 = y10 - this.f22751m1;
                if (!zCanScrollHorizontally || Math.abs(i11) <= this.f22755p1) {
                    z11 = false;
                } else {
                    this.f22752n1 = x6;
                    z11 = true;
                }
                if (zCanScrollVertically && Math.abs(i12) > this.f22755p1) {
                    this.f22753o1 = y10;
                } else if (z11) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            U();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f22748j1 = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f22752n1 = x7;
            this.f22750l1 = x7;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f22753o1 = y11;
            this.f22751m1 = y11;
        } else if (actionMasked == 6) {
            M(motionEvent);
        }
        return this.f22747i1 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TraceCompat.beginSection("RV OnLayout");
        n();
        TraceCompat.endSection();
        this.P0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null) {
            l(i10, i11);
            return;
        }
        boolean zIsAutoMeasureEnabled = layoutManager.isAutoMeasureEnabled();
        Recycler recycler = this.f22758r0;
        boolean z10 = false;
        State state = this.f22772z1;
        if (zIsAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.H0.onMeasure(recycler, state, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.P1 = z10;
            if (z10 || this.G0 == null) {
                return;
            }
            if (state.f22835e == 1) {
                o();
            }
            this.H0.g(i10, i11);
            state.f22840j = true;
            p();
            this.H0.h(i10, i11);
            if (this.H0.k()) {
                this.H0.g(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                state.f22840j = true;
                p();
                this.H0.h(i10, i11);
            }
            this.Q1 = getMeasuredWidth();
            this.R1 = getMeasuredHeight();
            return;
        }
        if (this.O0) {
            this.H0.onMeasure(recycler, state, i10, i11);
            return;
        }
        if (this.V0) {
            a0();
            K();
            O();
            L(true);
            if (state.f22842l) {
                state.f22838h = true;
            } else {
                this.f22761t0.c();
                state.f22838h = false;
            }
            this.V0 = false;
            b0(false);
        } else if (state.f22842l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.G0;
        if (adapter != null) {
            state.f22836f = adapter.getItemCount();
        } else {
            state.f22836f = 0;
        }
        a0();
        this.H0.onMeasure(recycler, state, i10, i11);
        b0(false);
        state.f22838h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f22759s0 = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f22759s0;
        if (savedState2 != null) {
            savedState.f22816q0 = savedState2.f22816q0;
        } else {
            LayoutManager layoutManager = this.H0;
            if (layoutManager != null) {
                savedState.f22816q0 = layoutManager.onSaveInstanceState();
            } else {
                savedState.f22816q0 = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f22745g1 = null;
        this.f22743e1 = null;
        this.f22744f1 = null;
        this.f22742d1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[PHI: r0
      0x00cc: PHI (r0v43 int) = (r0v29 int), (r0v47 int) binds: [B:43:0x00b5, B:47:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        if (this.S0 || this.T0) {
            return false;
        }
        OnItemTouchListener onItemTouchListener = this.M0;
        if (onItemTouchListener != null) {
            onItemTouchListener.onTouchEvent(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.M0 = null;
            }
        } else if (motionEvent.getAction() == 0 || !x(motionEvent)) {
            LayoutManager layoutManager = this.H0;
            if (layoutManager == null) {
                return false;
            }
            boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
            boolean zCanScrollVertically = this.H0.canScrollVertically();
            if (this.f22749k1 == null) {
                this.f22749k1 = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            int[] iArr = this.L1;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f22749k1.addMovement(motionEventObtain);
                    this.f22749k1.computeCurrentVelocity(1000, this.f22760s1);
                    float f6 = zCanScrollHorizontally ? -this.f22749k1.getXVelocity(this.f22748j1) : 0.0f;
                    float f10 = zCanScrollVertically ? -this.f22749k1.getYVelocity(this.f22748j1) : 0.0f;
                    if ((f6 == 0.0f && f10 == 0.0f) || !fling((int) f6, (int) f10)) {
                        setScrollState(0);
                    }
                    U();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f22748j1);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax = this.f22752n1 - x4;
                    int iMax2 = this.f22753o1 - y7;
                    if (this.f22747i1 != 1) {
                        if (zCanScrollHorizontally) {
                            iMax = iMax > 0 ? Math.max(0, iMax - this.f22755p1) : Math.min(0, iMax + this.f22755p1);
                            if (iMax != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        if (zCanScrollVertically) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f22755p1) : Math.min(0, iMax2 + this.f22755p1);
                            if (iMax2 != 0) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                    if (this.f22747i1 == 1) {
                        int[] iArr2 = this.M1;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int iR = iMax - R(motionEvent.getY(), iMax);
                        int iS = iMax2 - S(motionEvent.getX(), iMax2);
                        boolean zDispatchNestedPreScroll = dispatchNestedPreScroll(zCanScrollHorizontally ? iR : 0, zCanScrollVertically ? iS : 0, this.M1, this.K1, 0);
                        int[] iArr3 = this.K1;
                        if (zDispatchNestedPreScroll) {
                            iR -= iArr2[0];
                            iS -= iArr2[1];
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i11 = iR;
                        int i12 = iS;
                        this.f22752n1 = x4 - iArr3[0];
                        this.f22753o1 = y7 - iArr3[1];
                        if (V(zCanScrollHorizontally ? i11 : 0, zCanScrollVertically ? i12 : 0, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        androidx.recyclerview.widget.j jVar = this.f22769x1;
                        if (jVar != null && (i11 != 0 || i12 != 0)) {
                            jVar.a(this, i11, i12);
                        }
                    }
                } else if (actionMasked == 3) {
                    U();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f22748j1 = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f22752n1 = x6;
                    this.f22750l1 = x6;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f22753o1 = y10;
                    this.f22751m1 = y10;
                } else if (actionMasked == 6) {
                    M(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.f22748j1 = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f22752n1 = x7;
            this.f22750l1 = x7;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.f22753o1 = y11;
            this.f22751m1 = y11;
            if (zCanScrollVertically) {
                i10 = zCanScrollHorizontally;
                i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i10 = zCanScrollHorizontally;
            startNestedScroll(i10, 0);
            this.f22749k1.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        U();
        setScrollState(0);
        return true;
    }

    public final void p() {
        a0();
        K();
        State state = this.f22772z1;
        state.a(6);
        this.f22761t0.c();
        state.f22836f = this.G0.getItemCount();
        state.f22834d = 0;
        if (this.f22759s0 != null && this.G0.canRestoreState()) {
            Parcelable parcelable = this.f22759s0.f22816q0;
            if (parcelable != null) {
                this.H0.onRestoreInstanceState(parcelable);
            }
            this.f22759s0 = null;
        }
        state.f22838h = false;
        this.H0.onLayoutChildren(this.f22758r0, state);
        state.f22837g = false;
        state.f22841k = state.f22841k && this.f22746h1 != null;
        state.f22835e = 4;
        L(true);
        b0(false);
    }

    public final void q(int i10, int i11) {
        this.f22740b1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        OnScrollListener onScrollListener = this.A1;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i10, i11);
        }
        ArrayList arrayList = this.B1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.B1.get(size)).onScrolled(this, i10, i11);
            }
        }
        this.f22740b1--;
    }

    public final void r() {
        if (this.f22745g1 != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.f22741c1.createEdgeEffect(this, 3);
        this.f22745g1 = edgeEffectCreateEdgeEffect;
        if (this.f22766w0) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        ViewHolder viewHolderD = D(view);
        if (viewHolderD != null) {
            if (viewHolderD.isTmpDetached()) {
                viewHolderD.clearTmpDetachFlag();
            } else if (!viewHolderD.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(viewHolderD);
                throw new IllegalArgumentException(o1.b(this, sb2));
            }
        }
        view.clearAnimation();
        m(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<ItemDecoration> arrayList = this.K0;
        arrayList.remove(itemDecoration);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        ArrayList arrayList = this.X0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.L0.remove(onItemTouchListener);
        if (this.M0 == onItemTouchListener) {
            this.M0 = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        ArrayList arrayList = this.B1;
        if (arrayList != null) {
            arrayList.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.J0.remove(recyclerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.H0.onRequestChildFocus(this, this.f22772z1, view, view2) && view2 != null) {
            T(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.H0.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<OnItemTouchListener> arrayList = this.L0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onRequestDisallowInterceptTouchEvent(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.Q0 != 0 || this.S0) {
            this.R0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.f22742d1 != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.f22741c1.createEdgeEffect(this, 0);
        this.f22742d1 = edgeEffectCreateEdgeEffect;
        if (this.f22766w0) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || this.S0) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.H0.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            V(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.S0) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(i10);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
            this.U0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.G1 = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        X(adapter, false, true);
        P(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.H1) {
            return;
        }
        this.H1 = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f22766w0) {
            this.f22745g1 = null;
            this.f22743e1 = null;
            this.f22744f1 = null;
            this.f22742d1 = null;
        }
        this.f22766w0 = z10;
        super.setClipToPadding(z10);
        if (this.P0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Preconditions.checkNotNull(edgeEffectFactory);
        this.f22741c1 = edgeEffectFactory;
        this.f22745g1 = null;
        this.f22743e1 = null;
        this.f22744f1 = null;
        this.f22742d1 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.O0 = z10;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f22746h1;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.f22746h1.f22773a = null;
        }
        this.f22746h1 = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f22773a = this.E1;
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f22758r0.setViewCacheSize(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        androidx.recyclerview.widget.b.InterfaceC0101b interfaceC0101b;
        if (layoutManager == this.H0) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager2 = this.H0;
        Recycler recycler = this.f22758r0;
        if (layoutManager2 != null) {
            ItemAnimator itemAnimator = this.f22746h1;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.H0.removeAndRecycleAllViews(recycler);
            this.H0.d(recycler);
            recycler.clear();
            if (this.N0) {
                LayoutManager layoutManager3 = this.H0;
                layoutManager3.f22785g = false;
                layoutManager3.onDetachedFromWindow(this, recycler);
            }
            this.H0.i(null);
            this.H0 = null;
        } else {
            recycler.clear();
        }
        androidx.recyclerview.widget.b bVar = this.f22763u0;
        bVar.f22959b.g();
        ArrayList arrayList = bVar.f22960c;
        int size = arrayList.size() - 1;
        while (true) {
            interfaceC0101b = bVar.f22958a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            u uVar = (u) interfaceC0101b;
            uVar.getClass();
            ViewHolder viewHolderD = D(view);
            if (viewHolderD != null) {
                viewHolderD.onLeftHiddenState(uVar.f23086a);
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = ((u) interfaceC0101b).f23086a;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.m(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.H0 = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f22780b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(layoutManager);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(o1.b(layoutManager.f22780b, sb2));
            }
            layoutManager.i(this);
            if (this.N0) {
                LayoutManager layoutManager4 = this.H0;
                layoutManager4.f22785g = true;
                layoutManager4.onAttachedToWindow(this);
            }
        }
        recycler.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().setNestedScrollingEnabled(z10);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.f22757q1 = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.A1 = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f22765v1 = z10;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        Recycler recycler = this.f22758r0;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.d(recyclerView.G0, false);
        RecycledViewPool recycledViewPool2 = recycler.f22813g;
        if (recycledViewPool2 != null) {
            recycledViewPool2.f22801b--;
        }
        recycler.f22813g = recycledViewPool;
        if (recycledViewPool != null && recyclerView.getAdapter() != null) {
            recycler.f22813g.f22801b++;
        }
        recycler.c();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.I0 = recyclerListener;
    }

    public void setScrollState(int i10) {
        SmoothScroller smoothScroller;
        if (i10 == this.f22747i1) {
            return;
        }
        this.f22747i1 = i10;
        if (i10 != 2) {
            j jVar = this.f22767w1;
            RecyclerView.this.removeCallbacks(jVar);
            jVar.f22855r0.abortAnimation();
            LayoutManager layoutManager = this.H0;
            if (layoutManager != null && (smoothScroller = layoutManager.f22783e) != null) {
                smoothScroller.stop();
            }
        }
        LayoutManager layoutManager2 = this.H0;
        if (layoutManager2 != null) {
            layoutManager2.onScrollStateChanged(i10);
        }
        onScrollStateChanged(i10);
        OnScrollListener onScrollListener = this.A1;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i10);
        }
        ArrayList arrayList = this.B1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.B1.get(size)).onScrollStateChanged(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f22755p1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f22755p1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.f22758r0.f22814h = viewCacheExtension;
    }

    public void smoothScrollBy(@Px int i10, @Px int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        LayoutManager layoutManager;
        if (this.S0 || (layoutManager = this.H0) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.f22772z1, i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().startNestedScroll(i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        SmoothScroller smoothScroller;
        setScrollState(0);
        j jVar = this.f22767w1;
        RecyclerView.this.removeCallbacks(jVar);
        jVar.f22855r0.abortAnimation();
        LayoutManager layoutManager = this.H0;
        if (layoutManager == null || (smoothScroller = layoutManager.f22783e) == null) {
            return;
        }
        smoothScroller.stop();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.S0) {
            f("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.S0 = true;
                this.T0 = true;
                stopScroll();
                return;
            }
            this.S0 = false;
            if (this.R0 && this.H0 != null && this.G0 != null) {
                requestLayout();
            }
            this.R0 = false;
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z10) {
        setLayoutFrozen(false);
        X(adapter, true, z10);
        P(true);
        requestLayout();
    }

    public final void t() {
        if (this.f22744f1 != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.f22741c1.createEdgeEffect(this, 2);
        this.f22744f1 = edgeEffectCreateEdgeEffect;
        if (this.f22766w0) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.f22743e1 != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.f22741c1.createEdgeEffect(this, 1);
        this.f22743e1 = edgeEffectCreateEdgeEffect;
        if (this.f22766w0) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String v() {
        return " " + super.toString() + ", adapter:" + this.G0 + ", layout:" + this.H0 + ", context:" + getContext();
    }

    public final void w(State state) {
        if (getScrollState() != 2) {
            state.f22845p = 0;
            state.f22846q = 0;
        } else {
            OverScroller overScroller = this.f22767w1.f22855r0;
            state.f22845p = overScroller.getFinalX() - overScroller.getCurrX();
            state.f22846q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final boolean x(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<OnItemTouchListener> arrayList = this.L0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            OnItemTouchListener onItemTouchListener = arrayList.get(i10);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.M0 = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public final void y(int[] iArr) {
        int iE = this.f22763u0.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            ViewHolder viewHolderD = D(this.f22763u0.d(i12));
            if (!viewHolderD.shouldIgnore()) {
                int layoutPosition = viewHolderD.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public static abstract class Adapter<VH extends ViewHolder> {
        private final f mObservable = new f();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {
            private static final /* synthetic */ StateRestorationPolicy[] $VALUES;
            public static final StateRestorationPolicy ALLOW;
            public static final StateRestorationPolicy PREVENT;
            public static final StateRestorationPolicy PREVENT_WHEN_EMPTY;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                ALLOW = stateRestorationPolicy;
                StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
                PREVENT_WHEN_EMPTY = stateRestorationPolicy2;
                StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
                PREVENT = stateRestorationPolicy3;
                $VALUES = new StateRestorationPolicy[]{stateRestorationPolicy, stateRestorationPolicy2, stateRestorationPolicy3};
            }

            public StateRestorationPolicy() {
                throw null;
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh2, int i10) {
            boolean z10 = vh2.mBindingAdapter == null;
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                TraceCompat.beginSection("RV OnBindView");
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f22798c = true;
                }
                TraceCompat.endSection();
            }
        }

        public boolean canRestoreState() {
            int i10 = e.f22850a[this.mStateRestorationPolicy.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || getItemCount() > 0;
            }
            return false;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            try {
                TraceCompat.beginSection("RV CreateView");
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i10;
                TraceCompat.endSection();
                return vh2;
            } catch (Throwable th2) {
                TraceCompat.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i10) {
            if (adapter == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1, null);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.e(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11, null);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i10);

        public void onBindViewHolder(@NonNull VH vh2, int i10, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i10, @Nullable Object obj) {
            this.mObservable.d(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().hasNestedScrollingParent(i10);
    }

    public void smoothScrollBy(@Px int i10, @Px int i11, @Nullable Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().startNestedScroll(i10, i11);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().stopNestedScroll(i10);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        this.f22756q0 = new h();
        this.f22758r0 = new Recycler();
        this.v0 = new x();
        this.f22768x0 = new a();
        this.f22770y0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new RectF();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList<>();
        this.L0 = new ArrayList<>();
        this.Q0 = 0;
        this.Y0 = false;
        this.Z0 = false;
        this.f22739a1 = 0;
        this.f22740b1 = 0;
        this.f22741c1 = f22738a2;
        this.f22746h1 = new DefaultItemAnimator();
        this.f22747i1 = 0;
        this.f22748j1 = -1;
        this.f22762t1 = Float.MIN_VALUE;
        this.f22764u1 = Float.MIN_VALUE;
        this.f22765v1 = true;
        this.f22767w1 = new j();
        this.f22771y1 = X1 ? new androidx.recyclerview.widget.j.b() : null;
        this.f22772z1 = new State();
        this.C1 = false;
        this.D1 = false;
        g gVar = new g();
        this.E1 = gVar;
        this.F1 = false;
        this.I1 = new int[2];
        this.K1 = new int[2];
        this.L1 = new int[2];
        this.M1 = new int[2];
        this.N1 = new ArrayList();
        this.O1 = new b();
        this.Q1 = 0;
        this.R1 = 0;
        this.S1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f22755p1 = viewConfiguration.getScaledTouchSlop();
        this.f22762t1 = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.f22764u1 = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.r1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f22760s1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22754p0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f22746h1.f22773a = gVar;
        this.f22761t0 = new androidx.recyclerview.widget.a(new v(this));
        this.f22763u0 = new androidx.recyclerview.widget.b(new u(this));
        if (ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.W0 = (AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY);
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = androidx.recyclerview.R.styleable.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f22766w0 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(o1.b(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(Constant.DOT_STRING)) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(Y1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), 0};
                    } catch (NoSuchMethodException e5) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e7) {
                            e7.initCause(e5);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int[] iArr2 = T1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        PoolingContainer.setPoolingContainer(this, true);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(@Px int i10, @Px int i11, @Nullable Interpolator interpolator, int i12) {
        Z(i10, i11, interpolator, i12, false);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewHolder f22796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f22797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22799d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22797b = new Rect();
            this.f22798c = true;
            this.f22799d = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.f22796a.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.f22796a.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.f22796a.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.f22796a.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.f22796a.getPosition();
        }

        public boolean isItemChanged() {
            return this.f22796a.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.f22796a.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.f22796a.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.f22796a.needsUpdate();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f22797b = new Rect();
            this.f22798c = true;
            this.f22799d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22797b = new Rect();
            this.f22798c = true;
            this.f22799d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22797b = new Rect();
            this.f22798c = true;
            this.f22799d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f22797b = new Rect();
            this.f22798c = true;
            this.f22799d = false;
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.H0;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(o1.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void onScrolled(@Px int i10, @Px int i11) {
    }
}
