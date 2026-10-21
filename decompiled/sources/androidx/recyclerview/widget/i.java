package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class i extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f22998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f22999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f23002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f23003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public int f23006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @VisibleForTesting
    public int f23007l;

    @VisibleForTesting
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @VisibleForTesting
    public int f23008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @VisibleForTesting
    public int f23009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @VisibleForTesting
    public float f23010p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f23013s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f23020z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23011q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23012r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23014t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23015u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23016v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23017w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f23018x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f23019y = new int[2];

    /* JADX INFO: compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            int i10 = iVar.A;
            ValueAnimator valueAnimator = iVar.f23020z;
            if (i10 == 1) {
                valueAnimator.cancel();
            } else if (i10 != 2) {
                return;
            }
            iVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class b extends RecyclerView.OnScrollListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            i iVar = i.this;
            int iComputeVerticalScrollRange = iVar.f23013s.computeVerticalScrollRange();
            int i12 = iVar.f23012r;
            int i13 = iComputeVerticalScrollRange - i12;
            int i14 = iVar.f22996a;
            iVar.f23014t = i13 > 0 && i12 >= i14;
            int iComputeHorizontalScrollRange = iVar.f23013s.computeHorizontalScrollRange();
            int i15 = iVar.f23011q;
            boolean z10 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i14;
            iVar.f23015u = z10;
            boolean z11 = iVar.f23014t;
            if (!z11 && !z10) {
                if (iVar.f23016v != 0) {
                    iVar.d(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f6 = i12;
                iVar.f23007l = (int) ((((f6 / 2.0f) + iComputeVerticalScrollOffset) * f6) / iComputeVerticalScrollRange);
                iVar.f23006k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
            }
            if (iVar.f23015u) {
                float f10 = iComputeHorizontalScrollOffset;
                float f11 = i15;
                iVar.f23009o = (int) ((((f11 / 2.0f) + f10) * f11) / iComputeHorizontalScrollRange);
                iVar.f23008n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
            }
            int i16 = iVar.f23016v;
            if (i16 == 0 || i16 == 1) {
                iVar.d(1);
            }
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23023a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f23023a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f23023a) {
                this.f23023a = false;
                return;
            }
            i iVar = i.this;
            if (((Float) iVar.f23020z.getAnimatedValue()).floatValue() == 0.0f) {
                iVar.A = 0;
                iVar.d(0);
            } else {
                iVar.A = 2;
                iVar.f23013s.invalidate();
            }
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i iVar = i.this;
            iVar.f22998c.setAlpha(iFloatValue);
            iVar.f22999d.setAlpha(iFloatValue);
            iVar.f23013s.invalidate();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23020z = valueAnimatorOfFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f22998c = stateListDrawable;
        this.f22999d = drawable;
        this.f23002g = stateListDrawable2;
        this.f23003h = drawable2;
        this.f23000e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f23001f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f23004i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f23005j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f22996a = i11;
        this.f22997b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f23013s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f23013s.removeOnItemTouchListener(this);
            this.f23013s.removeOnScrollListener(bVar);
            this.f23013s.removeCallbacks(aVar);
        }
        this.f23013s = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f23013s.addOnItemTouchListener(this);
            this.f23013s.addOnScrollListener(bVar);
        }
    }

    public static int c(float f6, float f10, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f10 - f6) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @VisibleForTesting
    public final boolean a(float f6, float f10) {
        if (f10 >= this.f23012r - this.f23004i) {
            int i10 = this.f23009o;
            int i11 = this.f23008n;
            if (f6 >= i10 - (i11 / 2) && f6 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public final boolean b(float f6, float f10) {
        boolean z10 = ViewCompat.getLayoutDirection(this.f23013s) == 1;
        int i10 = this.f23000e;
        if (z10) {
            if (f6 > i10) {
                return false;
            }
        } else if (f6 < this.f23011q - i10) {
            return false;
        }
        int i11 = this.f23007l;
        int i12 = this.f23006k / 2;
        return f10 >= ((float) (i11 - i12)) && f10 <= ((float) (i12 + i11));
    }

    public final void d(int i10) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f22998c;
        if (i10 == 2 && this.f23016v != 2) {
            stateListDrawable.setState(C);
            this.f23013s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f23013s.invalidate();
        } else {
            e();
        }
        if (this.f23016v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f23013s.removeCallbacks(aVar);
            this.f23013s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f23013s.removeCallbacks(aVar);
            this.f23013s.postDelayed(aVar, 1500);
        }
        this.f23016v = i10;
    }

    public final void e() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f23020z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f23011q != this.f23013s.getWidth() || this.f23012r != this.f23013s.getHeight()) {
            this.f23011q = this.f23013s.getWidth();
            this.f23012r = this.f23013s.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f23014t) {
                int i10 = this.f23011q;
                int i11 = this.f23000e;
                int i12 = i10 - i11;
                int i13 = this.f23007l;
                int i14 = this.f23006k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f22998c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f23012r;
                int i17 = this.f23001f;
                Drawable drawable = this.f22999d;
                drawable.setBounds(0, 0, i17, i16);
                if (ViewCompat.getLayoutDirection(this.f23013s) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f23015u) {
                int i18 = this.f23012r;
                int i19 = this.f23004i;
                int i20 = i18 - i19;
                int i21 = this.f23009o;
                int i22 = this.f23008n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f23002g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f23011q;
                int i25 = this.f23005j;
                Drawable drawable2 = this.f23003h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f23016v;
        if (i10 == 1) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.f23017w = 1;
                this.f23010p = (int) motionEvent.getX();
            } else if (zB) {
                this.f23017w = 2;
                this.m = (int) motionEvent.getY();
            }
            d(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f23016v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (zB || zA) {
                if (zA) {
                    this.f23017w = 1;
                    this.f23010p = (int) motionEvent.getX();
                } else if (zB) {
                    this.f23017w = 2;
                    this.m = (int) motionEvent.getY();
                }
                d(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f23016v == 2) {
            this.m = 0.0f;
            this.f23010p = 0.0f;
            d(1);
            this.f23017w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f23016v == 2) {
            e();
            int i10 = this.f23017w;
            int i11 = this.f22997b;
            if (i10 == 1) {
                float x4 = motionEvent.getX();
                int[] iArr = this.f23019y;
                iArr[0] = i11;
                int i12 = this.f23011q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x4));
                if (Math.abs(this.f23009o - fMax) >= 2.0f) {
                    int iC = c(this.f23010p, fMax, iArr, this.f23013s.computeHorizontalScrollRange(), this.f23013s.computeHorizontalScrollOffset(), this.f23011q);
                    if (iC != 0) {
                        this.f23013s.scrollBy(iC, 0);
                    }
                    this.f23010p = fMax;
                }
            }
            if (this.f23017w == 2) {
                float y7 = motionEvent.getY();
                int[] iArr2 = this.f23018x;
                iArr2[0] = i11;
                int i13 = this.f23012r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y7));
                if (Math.abs(this.f23007l - fMax2) < 2.0f) {
                    return;
                }
                int iC2 = c(this.m, fMax2, iArr2, this.f23013s.computeVerticalScrollRange(), this.f23013s.computeVerticalScrollOffset(), this.f23012r);
                if (iC2 != 0) {
                    this.f23013s.scrollBy(0, iC2);
                }
                this.m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }
}
