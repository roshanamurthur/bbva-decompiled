package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;
    public static final int UP = 1;
    public Rect A;
    public long B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f22657k;

    @NonNull
    public final Callback m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22660o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f22663r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f22665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f22666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f22667v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GestureDetectorCompat f22669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f22670y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22647a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f22648b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.ViewHolder f22649c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22658l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22659n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList f22661p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f22664s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f22668w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f22671z = new b();

    public static abstract class SimpleCallback extends Callback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22676e;

        public SimpleCallback(int i10, int i11) {
            this.f22675d = i11;
            this.f22676e = i10;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f22676e;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f22675d;
        }

        public void setDefaultDragDirs(int i10) {
            this.f22676e = i10;
        }

        public void setDefaultSwipeDirs(int i10) {
            this.f22675d = i10;
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11);
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        @Override // java.lang.Runnable
        public final void run() {
            int iInterpolateOutOfBoundsScroll;
            int iInterpolateOutOfBoundsScroll2;
            int i10;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.f22649c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = itemTouchHelper.B;
                long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
                RecyclerView.LayoutManager layoutManager = itemTouchHelper.f22663r.getLayoutManager();
                if (itemTouchHelper.A == null) {
                    itemTouchHelper.A = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(itemTouchHelper.f22649c.itemView, itemTouchHelper.A);
                if (layoutManager.canScrollHorizontally()) {
                    int i11 = (int) (itemTouchHelper.f22656j + itemTouchHelper.f22654h);
                    iInterpolateOutOfBoundsScroll = (i11 - itemTouchHelper.A.left) - itemTouchHelper.f22663r.getPaddingLeft();
                    float f6 = itemTouchHelper.f22654h;
                    if ((f6 >= 0.0f || iInterpolateOutOfBoundsScroll >= 0) && (f6 <= 0.0f || (iInterpolateOutOfBoundsScroll = ((itemTouchHelper.f22649c.itemView.getWidth() + i11) + itemTouchHelper.A.right) - (itemTouchHelper.f22663r.getWidth() - itemTouchHelper.f22663r.getPaddingRight())) <= 0)) {
                        iInterpolateOutOfBoundsScroll = 0;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll = 0;
                }
                if (layoutManager.canScrollVertically()) {
                    int i12 = (int) (itemTouchHelper.f22657k + itemTouchHelper.f22655i);
                    int paddingTop = (i12 - itemTouchHelper.A.top) - itemTouchHelper.f22663r.getPaddingTop();
                    float f10 = itemTouchHelper.f22655i;
                    if ((f10 >= 0.0f || paddingTop >= 0) && (f10 <= 0.0f || (paddingTop = ((itemTouchHelper.f22649c.itemView.getHeight() + i12) + itemTouchHelper.A.bottom) - (itemTouchHelper.f22663r.getHeight() - itemTouchHelper.f22663r.getPaddingBottom())) <= 0)) {
                        iInterpolateOutOfBoundsScroll2 = 0;
                    } else {
                        iInterpolateOutOfBoundsScroll2 = paddingTop;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll2 = 0;
                }
                if (iInterpolateOutOfBoundsScroll != 0) {
                    iInterpolateOutOfBoundsScroll = itemTouchHelper.m.interpolateOutOfBoundsScroll(itemTouchHelper.f22663r, itemTouchHelper.f22649c.itemView.getWidth(), iInterpolateOutOfBoundsScroll, itemTouchHelper.f22663r.getWidth(), j11);
                }
                int i13 = iInterpolateOutOfBoundsScroll;
                if (iInterpolateOutOfBoundsScroll2 != 0) {
                    i10 = i13;
                    iInterpolateOutOfBoundsScroll2 = itemTouchHelper.m.interpolateOutOfBoundsScroll(itemTouchHelper.f22663r, itemTouchHelper.f22649c.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, itemTouchHelper.f22663r.getHeight(), j11);
                } else {
                    i10 = i13;
                }
                if (i10 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
                    itemTouchHelper.B = Long.MIN_VALUE;
                    return;
                }
                if (itemTouchHelper.B == Long.MIN_VALUE) {
                    itemTouchHelper.B = jCurrentTimeMillis;
                }
                itemTouchHelper.f22663r.scrollBy(i10, iInterpolateOutOfBoundsScroll2);
                RecyclerView.ViewHolder viewHolder = itemTouchHelper.f22649c;
                if (viewHolder != null) {
                    itemTouchHelper.h(viewHolder);
                }
                itemTouchHelper.f22663r.removeCallbacks(itemTouchHelper.f22664s);
                ViewCompat.postOnAnimation(itemTouchHelper.f22663r, this);
            }
        }
    }

    public class b implements RecyclerView.OnItemTouchListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            itemTouchHelper.f22669x.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            e eVar = null;
            if (actionMasked == 0) {
                itemTouchHelper.f22658l = motionEvent.getPointerId(0);
                itemTouchHelper.f22650d = motionEvent.getX();
                itemTouchHelper.f22651e = motionEvent.getY();
                VelocityTracker velocityTracker = itemTouchHelper.f22665t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                itemTouchHelper.f22665t = VelocityTracker.obtain();
                if (itemTouchHelper.f22649c == null) {
                    ArrayList arrayList = itemTouchHelper.f22661p;
                    if (!arrayList.isEmpty()) {
                        View viewE = itemTouchHelper.e(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            e eVar2 = (e) arrayList.get(size);
                            if (eVar2.f22688e.itemView == viewE) {
                                eVar = eVar2;
                                break;
                            }
                        }
                    }
                    if (eVar != null) {
                        itemTouchHelper.f22650d -= eVar.f22692i;
                        itemTouchHelper.f22651e -= eVar.f22693j;
                        RecyclerView.ViewHolder viewHolder = eVar.f22688e;
                        itemTouchHelper.d(viewHolder, true);
                        if (itemTouchHelper.f22647a.remove(viewHolder.itemView)) {
                            itemTouchHelper.m.clearView(itemTouchHelper.f22663r, viewHolder);
                        }
                        itemTouchHelper.j(viewHolder, eVar.f22689f);
                        itemTouchHelper.k(motionEvent, itemTouchHelper.f22660o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                itemTouchHelper.f22658l = -1;
                itemTouchHelper.j(null, 0);
            } else {
                int i10 = itemTouchHelper.f22658l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    itemTouchHelper.b(motionEvent, actionMasked, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = itemTouchHelper.f22665t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return itemTouchHelper.f22649c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onRequestDisallowInterceptTouchEvent(boolean z10) {
            if (z10) {
                ItemTouchHelper.this.j(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            itemTouchHelper.f22669x.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = itemTouchHelper.f22665t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (itemTouchHelper.f22658l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(itemTouchHelper.f22658l);
            if (iFindPointerIndex >= 0) {
                itemTouchHelper.b(motionEvent, actionMasked, iFindPointerIndex);
            }
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.f22649c;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        itemTouchHelper.k(motionEvent, itemTouchHelper.f22660o, iFindPointerIndex);
                        itemTouchHelper.h(viewHolder);
                        RecyclerView recyclerView2 = itemTouchHelper.f22663r;
                        a aVar = itemTouchHelper.f22664s;
                        recyclerView2.removeCallbacks(aVar);
                        aVar.run();
                        itemTouchHelper.f22663r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == itemTouchHelper.f22658l) {
                        itemTouchHelper.f22658l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        itemTouchHelper.k(motionEvent, itemTouchHelper.f22660o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.f22665t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            itemTouchHelper.j(null, 0);
            itemTouchHelper.f22658l = -1;
        }
    }

    public class c extends e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f22679n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f22680o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.ViewHolder viewHolder, int i10, int i11, float f6, float f10, float f11, float f12, int i12, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i11, f6, f10, f11, f12);
            this.f22679n = i12;
            this.f22680o = viewHolder2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.e, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f22694k) {
                return;
            }
            int i10 = this.f22679n;
            RecyclerView.ViewHolder viewHolder = this.f22680o;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (i10 <= 0) {
                itemTouchHelper.m.clearView(itemTouchHelper.f22663r, viewHolder);
            } else {
                itemTouchHelper.f22647a.add(viewHolder.itemView);
                this.f22691h = true;
                if (i10 > 0) {
                    itemTouchHelper.f22663r.post(new k(itemTouchHelper, this, i10));
                }
            }
            View view = itemTouchHelper.f22668w;
            View view2 = viewHolder.itemView;
            if (view == view2) {
                itemTouchHelper.i(view2);
            }
        }
    }

    public class d extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22682a = true;

        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            ItemTouchHelper itemTouchHelper;
            View viewE;
            RecyclerView.ViewHolder childViewHolder;
            if (!this.f22682a || (viewE = (itemTouchHelper = ItemTouchHelper.this).e(motionEvent)) == null || (childViewHolder = itemTouchHelper.f22663r.getChildViewHolder(viewE)) == null) {
                return;
            }
            Callback callback = itemTouchHelper.m;
            RecyclerView recyclerView = itemTouchHelper.f22663r;
            if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, childViewHolder), ViewCompat.getLayoutDirection(recyclerView)) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = itemTouchHelper.f22658l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y7 = motionEvent.getY(iFindPointerIndex);
                    itemTouchHelper.f22650d = x4;
                    itemTouchHelper.f22651e = y7;
                    itemTouchHelper.f22655i = 0.0f;
                    itemTouchHelper.f22654h = 0.0f;
                    if (itemTouchHelper.m.isLongPressDragEnabled()) {
                        itemTouchHelper.j(childViewHolder, 2);
                    }
                }
            }
        }
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.m = callback;
    }

    public static boolean g(View view, float f6, float f10, float f11, float f12) {
        return f6 >= f11 && f6 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    public final int a(RecyclerView.ViewHolder viewHolder, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f22654h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f22665t;
        Callback callback = this.m;
        if (velocityTracker != null && this.f22658l > -1) {
            velocityTracker.computeCurrentVelocity(1000, callback.getSwipeVelocityThreshold(this.f22653g));
            float xVelocity = this.f22665t.getXVelocity(this.f22658l);
            float yVelocity = this.f22665t.getYVelocity(this.f22658l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= callback.getSwipeEscapeVelocity(this.f22652f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float swipeThreshold = callback.getSwipeThreshold(viewHolder) * this.f22663r.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.f22654h) <= swipeThreshold) {
            return 0;
        }
        return i11;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22663r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f22671z;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f22663r.removeOnItemTouchListener(bVar);
            this.f22663r.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f22661p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                e eVar = (e) arrayList.get(0);
                eVar.f22690g.cancel();
                this.m.clearView(this.f22663r, eVar.f22688e);
            }
            arrayList.clear();
            this.f22668w = null;
            VelocityTracker velocityTracker = this.f22665t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22665t = null;
            }
            d dVar = this.f22670y;
            if (dVar != null) {
                dVar.f22682a = false;
                this.f22670y = null;
            }
            if (this.f22669x != null) {
                this.f22669x = null;
            }
        }
        this.f22663r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f22652f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f22653g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f22662q = ViewConfiguration.get(this.f22663r.getContext()).getScaledTouchSlop();
            this.f22663r.addItemDecoration(this);
            this.f22663r.addOnItemTouchListener(bVar);
            this.f22663r.addOnChildAttachStateChangeListener(this);
            this.f22670y = new d();
            this.f22669x = new GestureDetectorCompat(this.f22663r.getContext(), this.f22670y);
        }
    }

    public final void b(MotionEvent motionEvent, int i10, int i11) {
        View viewE;
        if (this.f22649c == null && i10 == 2 && this.f22659n != 2) {
            Callback callback = this.m;
            if (callback.isItemViewSwipeEnabled() && this.f22663r.getScrollState() != 1) {
                RecyclerView.LayoutManager layoutManager = this.f22663r.getLayoutManager();
                int i12 = this.f22658l;
                RecyclerView.ViewHolder childViewHolder = null;
                if (i12 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                    float x4 = motionEvent.getX(iFindPointerIndex) - this.f22650d;
                    float y7 = motionEvent.getY(iFindPointerIndex) - this.f22651e;
                    float fAbs = Math.abs(x4);
                    float fAbs2 = Math.abs(y7);
                    float f6 = this.f22662q;
                    if ((fAbs >= f6 || fAbs2 >= f6) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewE = e(motionEvent)) != null))) {
                        childViewHolder = this.f22663r.getChildViewHolder(viewE);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                RecyclerView recyclerView = this.f22663r;
                int iConvertToAbsoluteDirection = (callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, childViewHolder), ViewCompat.getLayoutDirection(recyclerView)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (iConvertToAbsoluteDirection == 0) {
                    return;
                }
                float x6 = motionEvent.getX(i11);
                float y10 = motionEvent.getY(i11);
                float f10 = x6 - this.f22650d;
                float f11 = y10 - this.f22651e;
                float fAbs3 = Math.abs(f10);
                float fAbs4 = Math.abs(f11);
                float f12 = this.f22662q;
                if (fAbs3 >= f12 || fAbs4 >= f12) {
                    if (fAbs3 > fAbs4) {
                        if (f10 < 0.0f && (iConvertToAbsoluteDirection & 4) == 0) {
                            return;
                        }
                        if (f10 > 0.0f && (iConvertToAbsoluteDirection & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f11 < 0.0f && (iConvertToAbsoluteDirection & 1) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (iConvertToAbsoluteDirection & 2) == 0) {
                            return;
                        }
                    }
                    this.f22655i = 0.0f;
                    this.f22654h = 0.0f;
                    this.f22658l = motionEvent.getPointerId(0);
                    j(childViewHolder, 1);
                }
            }
        }
    }

    public final int c(RecyclerView.ViewHolder viewHolder, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f22655i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f22665t;
        Callback callback = this.m;
        if (velocityTracker != null && this.f22658l > -1) {
            velocityTracker.computeCurrentVelocity(1000, callback.getSwipeVelocityThreshold(this.f22653g));
            float xVelocity = this.f22665t.getXVelocity(this.f22658l);
            float yVelocity = this.f22665t.getYVelocity(this.f22658l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= callback.getSwipeEscapeVelocity(this.f22652f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float swipeThreshold = callback.getSwipeThreshold(viewHolder) * this.f22663r.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.f22655i) <= swipeThreshold) {
            return 0;
        }
        return i11;
    }

    public final void d(RecyclerView.ViewHolder viewHolder, boolean z10) {
        ArrayList arrayList = this.f22661p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            if (eVar.f22688e == viewHolder) {
                eVar.f22694k |= z10;
                if (!eVar.f22695l) {
                    eVar.f22690g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View e(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y7 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f22649c;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (g(view, x4, y7, this.f22656j + this.f22654h, this.f22657k + this.f22655i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f22661p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = (e) arrayList.get(size);
            View view2 = eVar.f22688e.itemView;
            if (g(view2, x4, y7, eVar.f22692i, eVar.f22693j)) {
                return view2;
            }
        }
        return this.f22663r.findChildViewUnder(x4, y7);
    }

    public final void f(float[] fArr) {
        if ((this.f22660o & 12) != 0) {
            fArr[0] = (this.f22656j + this.f22654h) - this.f22649c.itemView.getLeft();
        } else {
            fArr[0] = this.f22649c.itemView.getTranslationX();
        }
        if ((this.f22660o & 3) != 0) {
            fArr[1] = (this.f22657k + this.f22655i) - this.f22649c.itemView.getTop();
        } else {
            fArr[1] = this.f22649c.itemView.getTranslationY();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(RecyclerView.ViewHolder viewHolder) {
        int i10;
        int i11;
        if (!this.f22663r.isLayoutRequested() && this.f22659n == 2) {
            Callback callback = this.m;
            float moveThreshold = callback.getMoveThreshold(viewHolder);
            int i12 = (int) (this.f22656j + this.f22654h);
            int i13 = (int) (this.f22657k + this.f22655i);
            if (Math.abs(i13 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i12 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                ArrayList arrayList = this.f22666u;
                if (arrayList == null) {
                    this.f22666u = new ArrayList();
                    this.f22667v = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f22667v.clear();
                }
                int boundingBoxMargin = callback.getBoundingBoxMargin();
                int iRound = Math.round(this.f22656j + this.f22654h) - boundingBoxMargin;
                int iRound2 = Math.round(this.f22657k + this.f22655i) - boundingBoxMargin;
                int i14 = boundingBoxMargin * 2;
                int width = viewHolder.itemView.getWidth() + iRound + i14;
                int height = viewHolder.itemView.getHeight() + iRound2 + i14;
                int i15 = (iRound + width) / 2;
                int i16 = (iRound2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.f22663r.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = layoutManager.getChildAt(i17);
                    if (childAt != viewHolder.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        RecyclerView.ViewHolder childViewHolder = this.f22663r.getChildViewHolder(childAt);
                        i10 = iRound;
                        i11 = iRound2;
                        if (callback.canDropOver(this.f22663r, this.f22649c, childViewHolder)) {
                            int iAbs = Math.abs(i15 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int iAbs2 = Math.abs(i16 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i18 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                            int size = this.f22666u.size();
                            int i19 = 0;
                            int i20 = 0;
                            while (i20 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.f22667v.get(i20)).intValue()) {
                                    break;
                                }
                                i19++;
                                i20++;
                                size = i21;
                            }
                            this.f22666u.add(i19, childViewHolder);
                            this.f22667v.add(i19, Integer.valueOf(i18));
                        }
                    } else {
                        i10 = iRound;
                        i11 = iRound2;
                    }
                    i17++;
                    iRound = i10;
                    iRound2 = i11;
                    i15 = i15;
                }
                ArrayList arrayList2 = this.f22666u;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderChooseDropTarget = callback.chooseDropTarget(viewHolder, arrayList2, i12, i13);
                if (viewHolderChooseDropTarget == null) {
                    this.f22666u.clear();
                    this.f22667v.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (callback.onMove(this.f22663r, viewHolder, viewHolderChooseDropTarget)) {
                    this.m.onMoved(this.f22663r, viewHolder, absoluteAdapterPosition2, viewHolderChooseDropTarget, absoluteAdapterPosition, i12, i13);
                }
            }
        }
    }

    public final void i(View view) {
        if (view == this.f22668w) {
            this.f22668w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:72:0x019b  */
    public final void j(@Nullable RecyclerView.ViewHolder viewHolder, int i10) {
        Callback callback;
        boolean z10;
        boolean z11;
        RecyclerView.ViewHolder viewHolder2;
        int iC;
        int i11;
        float fSignum;
        float fSignum2;
        int i12;
        if (viewHolder == this.f22649c && i10 == this.f22659n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i13 = this.f22659n;
        d(viewHolder, true);
        this.f22659n = i10;
        if (i10 == 2) {
            if (viewHolder == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f22668w = viewHolder.itemView;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.ViewHolder viewHolder3 = this.f22649c;
        Callback callback2 = this.m;
        if (viewHolder3 != null) {
            if (viewHolder3.itemView.getParent() != null) {
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    if (this.f22659n == 2) {
                        iC = 0;
                    } else {
                        int movementFlags = callback2.getMovementFlags(this.f22663r, viewHolder3);
                        int iConvertToAbsoluteDirection = (callback2.convertToAbsoluteDirection(movementFlags, ViewCompat.getLayoutDirection(this.f22663r)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                        if (iConvertToAbsoluteDirection == 0) {
                            iC = 0;
                        } else {
                            int i15 = (movementFlags & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                            if (Math.abs(this.f22654h) > Math.abs(this.f22655i)) {
                                iC = a(viewHolder3, iConvertToAbsoluteDirection);
                                if (iC <= 0) {
                                    iC = c(viewHolder3, iConvertToAbsoluteDirection);
                                    if (iC <= 0) {
                                        iC = 0;
                                    }
                                } else if ((i15 & iC) == 0) {
                                    iC = Callback.convertToRelativeDirection(iC, ViewCompat.getLayoutDirection(this.f22663r));
                                }
                            } else {
                                iC = c(viewHolder3, iConvertToAbsoluteDirection);
                                if (iC <= 0) {
                                    iC = a(viewHolder3, iConvertToAbsoluteDirection);
                                    if (iC <= 0) {
                                        iC = 0;
                                    } else if ((i15 & iC) == 0) {
                                        iC = Callback.convertToRelativeDirection(iC, ViewCompat.getLayoutDirection(this.f22663r));
                                    }
                                }
                            }
                        }
                    }
                    i11 = iC;
                }
                VelocityTracker velocityTracker = this.f22665t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f22665t = null;
                }
                if (i11 == 1 || i11 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f22655i) * this.f22663r.getHeight();
                } else if (i11 == 4 || i11 == 8 || i11 == 16 || i11 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f22654h) * this.f22663r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i13 == 2) {
                    i12 = 8;
                } else {
                    i12 = i11 > 0 ? 2 : 4;
                }
                float[] fArr = this.f22648b;
                f(fArr);
                float f6 = fArr[0];
                float f10 = fArr[1];
                int i16 = i12;
                callback = callback2;
                c cVar = new c(viewHolder3, i16, i13, f6, f10, fSignum, fSignum2, i11, viewHolder3);
                long animationDuration = callback.getAnimationDuration(this.f22663r, i16, fSignum - f6, fSignum2 - f10);
                ValueAnimator valueAnimator = cVar.f22690g;
                valueAnimator.setDuration(animationDuration);
                this.f22661p.add(cVar);
                viewHolder3.setIsRecyclable(false);
                valueAnimator.start();
                viewHolder2 = null;
                z10 = true;
            } else {
                callback = callback2;
                i(viewHolder3.itemView);
                callback.clearView(this.f22663r, viewHolder3);
                viewHolder2 = null;
                z10 = false;
            }
            this.f22649c = viewHolder2;
        } else {
            callback = callback2;
            z10 = false;
        }
        if (viewHolder != null) {
            RecyclerView recyclerView = this.f22663r;
            this.f22660o = (callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView)) & i14) >> (this.f22659n * 8);
            this.f22656j = viewHolder.itemView.getLeft();
            this.f22657k = viewHolder.itemView.getTop();
            this.f22649c = viewHolder;
            if (i10 == 2) {
                z11 = false;
                viewHolder.itemView.performHapticFeedback(0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewParent parent = this.f22663r.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f22649c != null ? true : z11);
        }
        if (!z10) {
            this.f22663r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        callback.onSelectedChanged(this.f22649c, this.f22659n);
        this.f22663r.invalidate();
    }

    public final void k(MotionEvent motionEvent, int i10, int i11) {
        float x4 = motionEvent.getX(i11);
        float y7 = motionEvent.getY(i11);
        float f6 = x4 - this.f22650d;
        this.f22654h = f6;
        this.f22655i = y7 - this.f22651e;
        if ((i10 & 4) == 0) {
            this.f22654h = Math.max(0.0f, f6);
        }
        if ((i10 & 8) == 0) {
            this.f22654h = Math.min(0.0f, this.f22654h);
        }
        if ((i10 & 1) == 0) {
            this.f22655i = Math.max(0.0f, this.f22655i);
        }
        if ((i10 & 2) == 0) {
            this.f22655i = Math.min(0.0f, this.f22655i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view) {
        i(view);
        RecyclerView.ViewHolder childViewHolder = this.f22663r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f22649c;
        if (viewHolder != null && childViewHolder == viewHolder) {
            j(null, 0);
            return;
        }
        d(childViewHolder, false);
        if (this.f22647a.remove(childViewHolder.itemView)) {
            this.m.clearView(this.f22663r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f6;
        float f10;
        if (this.f22649c != null) {
            float[] fArr = this.f22648b;
            f(fArr);
            float f11 = fArr[0];
            f10 = fArr[1];
            f6 = f11;
        } else {
            f6 = 0.0f;
            f10 = 0.0f;
        }
        RecyclerView.ViewHolder viewHolder = this.f22649c;
        ArrayList arrayList = this.f22661p;
        int i10 = this.f22659n;
        Callback callback = this.m;
        callback.getClass();
        int i11 = 0;
        for (int size = arrayList.size(); i11 < size; size = size) {
            e eVar = (e) arrayList.get(i11);
            float f12 = eVar.f22684a;
            float f13 = eVar.f22686c;
            RecyclerView.ViewHolder viewHolder2 = eVar.f22688e;
            if (f12 == f13) {
                eVar.f22692i = viewHolder2.itemView.getTranslationX();
            } else {
                eVar.f22692i = androidx.datastore.preferences.protobuf.e.a(f13, f12, eVar.m, f12);
            }
            float f14 = eVar.f22685b;
            float f15 = eVar.f22687d;
            if (f14 == f15) {
                eVar.f22693j = viewHolder2.itemView.getTranslationY();
            } else {
                eVar.f22693j = androidx.datastore.preferences.protobuf.e.a(f15, f14, eVar.m, f14);
            }
            int iSave = canvas.save();
            callback.onChildDraw(canvas, recyclerView, eVar.f22688e, eVar.f22692i, eVar.f22693j, eVar.f22689f, false);
            canvas.restoreToCount(iSave);
            i11++;
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            callback.onChildDraw(canvas, recyclerView, viewHolder, f6, f10, i10, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        float f6;
        float f10;
        if (this.f22649c != null) {
            float[] fArr = this.f22648b;
            f(fArr);
            float f11 = fArr[0];
            f10 = fArr[1];
            f6 = f11;
        } else {
            f6 = 0.0f;
            f10 = 0.0f;
        }
        RecyclerView.ViewHolder viewHolder = this.f22649c;
        ArrayList arrayList = this.f22661p;
        int i10 = this.f22659n;
        Callback callback = this.m;
        callback.getClass();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            e eVar = (e) arrayList.get(i11);
            int iSave = canvas.save();
            callback.onChildDrawOver(canvas, recyclerView, eVar.f22688e, eVar.f22692i, eVar.f22693j, eVar.f22689f, false);
            canvas.restoreToCount(iSave);
            i11++;
            callback = callback;
            i10 = i10;
            size = size;
        }
        int i12 = size;
        Callback callback2 = callback;
        int i13 = i10;
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            callback2.onChildDrawOver(canvas, recyclerView, viewHolder, f6, f10, i13, true);
            canvas.restoreToCount(iSave2);
        }
        boolean z10 = false;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            e eVar2 = (e) arrayList.get(i14);
            boolean z11 = eVar2.f22695l;
            if (z11 && !eVar2.f22691h) {
                arrayList.remove(i14);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
        Callback callback = this.m;
        RecyclerView recyclerView = this.f22663r;
        if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView)) & 16711680) == 0 || viewHolder.itemView.getParent() != this.f22663r) {
            return;
        }
        VelocityTracker velocityTracker = this.f22665t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f22665t = VelocityTracker.obtain();
        this.f22655i = 0.0f;
        this.f22654h = 0.0f;
        j(viewHolder, 2);
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView = this.f22663r;
        Callback callback = this.m;
        if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 0 || viewHolder.itemView.getParent() != this.f22663r) {
            return;
        }
        VelocityTracker velocityTracker = this.f22665t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f22665t = VelocityTracker.obtain();
        this.f22655i = 0.0f;
        this.f22654h = 0.0f;
        j(viewHolder, 1);
    }

    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22672b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f22673c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22674a = -1;

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f6) {
                return f6 * f6 * f6 * f6 * f6;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f6) {
                float f10 = f6 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return m.f23045a;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = viewHolder.itemView.getWidth() + i10;
            int height = viewHolder.itemView.getHeight() + i11;
            int left2 = i10 - viewHolder.itemView.getLeft();
            int top2 = i11 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i13);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i10) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i11) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    viewHolder2 = viewHolder3;
                    i12 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            int i10 = R.id.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i10);
            if (tag instanceof Float) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(i10, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i10, float f6, float f10) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            }
            return i10 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            if (this.f22674a == -1) {
                this.f22674a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (f22672b.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f) * ((int) (f22673c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * this.f22674a)));
            if (interpolation == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f6, float f10, int i10, boolean z10) {
            View view = viewHolder.itemView;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
                int childCount = recyclerView.getChildCount();
                float f11 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (childAt != view) {
                        float elevation = ViewCompat.getElevation(childAt);
                        if (elevation > f11) {
                            f11 = elevation;
                        }
                    }
                }
                ViewCompat.setElevation(view, f11 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f6);
            view.setTranslationY(f10);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.ViewHolder viewHolder, float f6, float f10, int i10, boolean z10) {
            View view = viewHolder.itemView;
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i10, @NonNull RecyclerView.ViewHolder viewHolder2, int i11, int i12, int i13) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i12, i13);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i10);

        public float getSwipeEscapeVelocity(float f6) {
            return f6;
        }

        public float getSwipeVelocityThreshold(float f6) {
            return f6;
        }

        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    @VisibleForTesting
    public static class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f22684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f22685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f22686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f22687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RecyclerView.ViewHolder f22688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f22689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @VisibleForTesting
        public final ValueAnimator f22690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22691h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f22692i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f22693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f22694k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22695l = false;
        public float m;

        public e(RecyclerView.ViewHolder viewHolder, int i10, float f6, float f10, float f11, float f12) {
            this.f22689f = i10;
            this.f22688e = viewHolder;
            this.f22684a = f6;
            this.f22685b = f10;
            this.f22686c = f11;
            this.f22687d = f12;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22690g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new l(this));
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f22695l) {
                this.f22688e.setIsRecyclable(true);
            }
            this.f22695l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }
}
