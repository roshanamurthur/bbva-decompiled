package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.g0;
import androidx.collection.h;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.lifecycle.k;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselLayoutManager;
import fe.e;
import fe.f;
import fe.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements fe.b, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public f A;
    public final View.OnLayoutChangeListener B;
    public int C;
    public int D;
    public int E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @VisibleForTesting
    public int f44178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @VisibleForTesting
    public int f44179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @VisibleForTesting
    public int f44180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f44182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public CarouselStrategy f44183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.c f44184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.b f44185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public HashMap f44187z;

    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateDxToMakeVisible(View view, int i10) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f44184w == null || !carouselLayoutManager.isHorizontal()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.f44178q - carouselLayoutManager.x(position, carouselLayoutManager.v(position)));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateDyToMakeVisible(View view, int i10) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f44184w == null || carouselLayoutManager.isHorizontal()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.f44178q - carouselLayoutManager.x(position, carouselLayoutManager.v(position)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        @Nullable
        public final PointF computeScrollVectorForPosition(int i10) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f44189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f44192d;

        public b(View view, float f6, float f10, d dVar) {
            this.f44189a = view;
            this.f44190b = f6;
            this.f44191c = f10;
            this.f44192d = dVar;
        }
    }

    public static class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f44193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<com.google.android.material.carousel.b.C0197b> f44194b;

        public c() {
            Paint paint = new Paint();
            this.f44193a = paint;
            this.f44194b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            Paint paint = this.f44193a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.b.C0197b c0197b : this.f44194b) {
                paint.setColor(ColorUtils.blendARGB(-65281, -16776961, c0197b.f44229c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(c0197b.f44228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A.i(), c0197b.f44228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A.d(), paint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).A.f(), c0197b.f44228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A.g(), c0197b.f44228b, paint);
                }
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.material.carousel.b.C0197b f44195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.material.carousel.b.C0197b f44196b;

        public d(com.google.android.material.carousel.b.C0197b c0197b, com.google.android.material.carousel.b.C0197b c0197b2) {
            Preconditions.checkArgument(c0197b.f44227a <= c0197b2.f44227a);
            this.f44195a = c0197b;
            this.f44196b = c0197b2;
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    public static d z(float f6, List list, boolean z10) {
        float f10 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.google.android.material.carousel.b.C0197b c0197b = (com.google.android.material.carousel.b.C0197b) list.get(i14);
            float f14 = z10 ? c0197b.f44228b : c0197b.f44227a;
            float fAbs = Math.abs(f14 - f6);
            if (f14 <= f6 && fAbs <= f10) {
                i10 = i14;
                f10 = fAbs;
            }
            if (f14 > f6 && fAbs <= f12) {
                i12 = i14;
                f12 = fAbs;
            }
            if (f14 <= f13) {
                i11 = i14;
                f13 = f14;
            }
            if (f14 > f11) {
                i13 = i14;
                f11 = f14;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((com.google.android.material.carousel.b.C0197b) list.get(i10), (com.google.android.material.carousel.b.C0197b) list.get(i12));
    }

    public final boolean A() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    public final boolean B(float f6, d dVar) {
        com.google.android.material.carousel.b.C0197b c0197b = dVar.f44195a;
        float f10 = c0197b.f44230d;
        com.google.android.material.carousel.b.C0197b c0197b2 = dVar.f44196b;
        float fLerp = AnimationUtils.lerp(f10, c0197b2.f44230d, c0197b.f44228b, c0197b2.f44228b, f6) / 2.0f;
        float f11 = A() ? f6 + fLerp : f6 - fLerp;
        if (A()) {
            if (f11 >= 0.0f) {
                return false;
            }
        } else if (f11 <= t()) {
            return false;
        }
        return true;
    }

    public final boolean C(float f6, d dVar) {
        com.google.android.material.carousel.b.C0197b c0197b = dVar.f44195a;
        float f10 = c0197b.f44230d;
        com.google.android.material.carousel.b.C0197b c0197b2 = dVar.f44196b;
        float fN = n(f6, AnimationUtils.lerp(f10, c0197b2.f44230d, c0197b.f44228b, c0197b2.f44228b, f6) / 2.0f);
        if (A()) {
            if (fN <= t()) {
                return false;
            }
        } else if (fN >= 0.0f) {
            return false;
        }
        return true;
    }

    public final b D(RecyclerView.Recycler recycler, float f6, int i10) {
        View viewForPosition = recycler.getViewForPosition(i10);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fN = n(f6, this.f44185x.f44214a / 2.0f);
        d dVarZ = z(fN, this.f44185x.f44215b, false);
        return new b(viewForPosition, fN, q(viewForPosition, fN, dVarZ), dVarZ);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void E(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final void F() {
        this.f44184w = null;
        requestLayout();
    }

    public final int G(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f44184w == null) {
            E(recycler);
        }
        int i11 = this.f44178q;
        int i12 = this.f44179r;
        int i13 = this.f44180s;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.f44178q = i11 + i10;
        I(this.f44184w);
        float f6 = this.f44185x.f44214a / 2.0f;
        float fR = r(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f10 = A() ? this.f44185x.c().f44228b : this.f44185x.a().f44228b;
        float f11 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            float fN = n(fR, f6);
            d dVarZ = z(fN, this.f44185x.f44215b, false);
            float fQ = q(childAt, fN, dVarZ);
            super.getDecoratedBoundsWithMargins(childAt, rect);
            H(childAt, fN, dVarZ);
            this.A.l(f6, fQ, rect, childAt);
            float fAbs = Math.abs(f10 - fQ);
            if (childAt != null && fAbs < f11) {
                this.D = getPosition(childAt);
                f11 = fAbs;
            }
            fR = n(fR, this.f44185x.f44214a);
        }
        s(recycler, state);
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(View view, float f6, d dVar) {
        if (view instanceof g) {
            com.google.android.material.carousel.b.C0197b c0197b = dVar.f44195a;
            float f10 = c0197b.f44229c;
            com.google.android.material.carousel.b.C0197b c0197b2 = dVar.f44196b;
            float fLerp = AnimationUtils.lerp(f10, c0197b2.f44229c, c0197b.f44227a, c0197b2.f44227a, f6);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFC = this.A.c(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fQ = q(view, f6, dVar);
            RectF rectF = new RectF(fQ - (rectFC.width() / 2.0f), fQ - (rectFC.height() / 2.0f), (rectFC.width() / 2.0f) + fQ, (rectFC.height() / 2.0f) + fQ);
            RectF rectF2 = new RectF(this.A.f(), this.A.i(), this.A.g(), this.A.d());
            CarouselStrategy carouselStrategy = this.f44183v;
            carouselStrategy.getClass();
            if (!(carouselStrategy instanceof UncontainedCarouselStrategy)) {
                this.A.a(rectFC, rectF, rectF2);
            }
            this.A.k(rectFC, rectF, rectF2);
            ((g) view).setMaskRectF(rectFC);
        }
    }

    public final void I(@NonNull com.google.android.material.carousel.c cVar) {
        int i10 = this.f44180s;
        int i11 = this.f44179r;
        if (i10 <= i11) {
            this.f44185x = A() ? cVar.a() : cVar.c();
        } else {
            this.f44185x = cVar.b(this.f44178q, false, i11, i10);
        }
        List<com.google.android.material.carousel.b.C0197b> list = this.f44185x.f44215b;
        c cVar2 = this.f44182u;
        cVar2.getClass();
        cVar2.f44194b = Collections.unmodifiableList(list);
    }

    public final void J() {
        if (!this.f44181t || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                if (this.f44181t && Log.isLoggable("CarouselLayoutManager", 3)) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt = getChildAt(i12);
                        u(childAt);
                        getPosition(childAt);
                    }
                }
                StringBuilder sbE = h.e("Detected invalid child order. Child at index [", i10, "] had adapter position [", position, "] and child at index [");
                sbE.append(i11);
                sbE.append("] had adapter position [");
                sbE.append(position2);
                sbE.append("].");
                throw new IllegalStateException(sbE.toString());
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f44184w == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f44184w.f44235a.f44214a / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f44178q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.f44180s - this.f44179r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f44184w == null) {
            return null;
        }
        int iX = x(i10, v(i10)) - this.f44178q;
        return isHorizontal() ? new PointF(iX, 0.0f) : new PointF(0.0f, iX);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f44184w == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f44184w.f44235a.f44214a / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f44178q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.f44180s - this.f44179r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // fe.b
    public int getCarouselAlignment() {
        return this.E;
    }

    @Override // fe.b
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // fe.b
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        d dVarZ = z(fCenterY, this.f44185x.f44215b, true);
        com.google.android.material.carousel.b.C0197b c0197b = dVarZ.f44195a;
        float f6 = c0197b.f44230d;
        com.google.android.material.carousel.b.C0197b c0197b2 = dVarZ.f44196b;
        float fLerp = AnimationUtils.lerp(f6, c0197b2.f44230d, c0197b.f44228b, c0197b2.f44228b, fCenterY);
        float fWidth = isHorizontal() ? (rect.width() - fLerp) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - fLerp) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.A.f68413a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // fe.b
    public boolean isHorizontal() {
        return this.A.f68413a == 0;
    }

    public final void m(View view, int i10, b bVar) {
        float f6 = this.f44185x.f44214a / 2.0f;
        addView(view, i10);
        float f10 = bVar.f44191c;
        this.A.j(view, (int) (f10 - f6), (int) (f10 + f6));
        H(view, bVar.f44190b, bVar.f44192d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i12 = rect.left + rect.right + i10;
        int i13 = rect.top + rect.bottom + i11;
        com.google.android.material.carousel.c cVar = this.f44184w;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i12, (int) ((cVar == null || this.A.f68413a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : cVar.f44235a.f44214a), canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i13, (int) ((cVar == null || this.A.f68413a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : cVar.f44235a.f44214a), canScrollVertically()));
    }

    public final float n(float f6, float f10) {
        return A() ? f6 - f10 : f6 + f10;
    }

    public final void o(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float fR = r(i10);
        while (i10 < state.getItemCount()) {
            b bVarD = D(recycler, fR, i10);
            float f6 = bVarD.f44191c;
            d dVar = bVarD.f44192d;
            if (B(f6, dVar)) {
                return;
            }
            fR = n(fR, this.f44185x.f44214a);
            if (!C(f6, dVar)) {
                m(bVarD.f44189a, -1, bVarD);
            }
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        CarouselStrategy carouselStrategy = this.f44183v;
        Context context = recyclerView.getContext();
        float dimension = carouselStrategy.f44200a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        carouselStrategy.f44200a = dimension;
        float dimension2 = carouselStrategy.f44201b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        carouselStrategy.f44201b = dimension2;
        F();
        recyclerView.addOnLayoutChangeListener(this.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.B);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:29:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0040  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i10, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        byte b10;
        if (getChildCount() == 0) {
            return null;
        }
        int orientation = getOrientation();
        if (i10 == 1) {
            b10 = -1;
        } else if (i10 == 2) {
            b10 = 1;
        } else if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130 && orientation == 1) {
                        b10 = 1;
                    } else {
                        b10 = -2147483648;
                    }
                } else if (orientation != 0) {
                    b10 = -2147483648;
                } else if (A()) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
            } else if (orientation == 1) {
                b10 = -1;
            } else {
                b10 = -2147483648;
            }
        } else if (orientation != 0) {
            b10 = -2147483648;
        } else if (A()) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == -2147483648) {
            return null;
        }
        if (b10 == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            int position = getPosition(getChildAt(0)) - 1;
            if (position >= 0 && position < getItemCount()) {
                b bVarD = D(recycler, r(position), position);
                m(bVarD.f44189a, 0, bVarD);
            }
            return getChildAt(A() ? getChildCount() - 1 : 0);
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (position2 >= 0 && position2 < getItemCount()) {
            b bVarD2 = D(recycler, r(position2), position2);
            m(bVarD2.f44189a, -1, bVarD2);
        }
        return getChildAt(A() ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        int itemCount = getItemCount();
        int i12 = this.C;
        if (itemCount == i12 || this.f44184w == null) {
            return;
        }
        if (this.f44183v.d(this, i12)) {
            F();
        }
        this.C = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        int itemCount = getItemCount();
        int i12 = this.C;
        if (itemCount == i12 || this.f44184w == null) {
            return;
        }
        if (this.f44183v.d(this, i12)) {
            F();
        }
        this.C = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || t() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.f44186y = 0;
            return;
        }
        boolean zA = A();
        boolean z10 = this.f44184w == null;
        if (z10) {
            E(recycler);
        }
        com.google.android.material.carousel.c cVar = this.f44184w;
        boolean zA2 = A();
        com.google.android.material.carousel.b bVarA = zA2 ? cVar.a() : cVar.c();
        float f6 = (zA2 ? bVarA.c() : bVarA.a()).f44227a;
        float f10 = bVarA.f44214a / 2.0f;
        int iH = (int) (this.A.h() - (A() ? f6 + f10 : f6 - f10));
        com.google.android.material.carousel.c cVar2 = this.f44184w;
        boolean zA3 = A();
        com.google.android.material.carousel.b bVarC = zA3 ? cVar2.c() : cVar2.a();
        com.google.android.material.carousel.b.C0197b c0197bA = zA3 ? bVarC.a() : bVarC.c();
        int itemCount = (int) (((((state.getItemCount() - 1) * bVarC.f44214a) * (zA3 ? -1.0f : 1.0f)) - (c0197bA.f44227a - this.A.h())) + (this.A.e() - c0197bA.f44227a) + (zA3 ? -c0197bA.f44233g : c0197bA.f44234h));
        int iMin = zA3 ? Math.min(0, itemCount) : Math.max(0, itemCount);
        this.f44179r = zA ? iMin : iH;
        if (zA) {
            iMin = iH;
        }
        this.f44180s = iMin;
        if (z10) {
            this.f44178q = iH;
            com.google.android.material.carousel.c cVar3 = this.f44184w;
            int itemCount2 = getItemCount();
            int i10 = this.f44179r;
            int i11 = this.f44180s;
            boolean zA4 = A();
            float f11 = cVar3.f44235a.f44214a;
            HashMap map = new HashMap();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= itemCount2) {
                    break;
                }
                int i14 = zA4 ? (itemCount2 - i12) - 1 : i12;
                float f12 = i14 * f11 * (zA4 ? -1 : 1);
                float f13 = i11 - cVar3.f44241g;
                List<com.google.android.material.carousel.b> list = cVar3.f44237c;
                if (f12 > f13 || i12 >= itemCount2 - list.size()) {
                    map.put(Integer.valueOf(i14), list.get(MathUtils.clamp(i13, 0, list.size() - 1)));
                    i13++;
                }
                i12++;
            }
            int i15 = 0;
            for (int i16 = itemCount2 - 1; i16 >= 0; i16--) {
                int i17 = zA4 ? (itemCount2 - i16) - 1 : i16;
                float f14 = i17 * f11 * (zA4 ? -1 : 1);
                float f15 = i10 + cVar3.f44240f;
                List<com.google.android.material.carousel.b> list2 = cVar3.f44236b;
                if (f14 < f15 || i16 < list2.size()) {
                    map.put(Integer.valueOf(i17), list2.get(MathUtils.clamp(i15, 0, list2.size() - 1)));
                    i15++;
                }
            }
            this.f44187z = map;
            int i18 = this.D;
            if (i18 != -1) {
                this.f44178q = x(i18, v(i18));
            }
        }
        int i19 = this.f44178q;
        int i20 = this.f44179r;
        int i21 = this.f44180s;
        this.f44178q = (i19 < i20 ? i20 - i19 : i19 > i21 ? i21 - i19 : 0) + i19;
        this.f44186y = MathUtils.clamp(this.f44186y, 0, state.getItemCount());
        I(this.f44184w);
        detachAndScrapAttachedViews(recycler);
        s(recycler, state);
        this.C = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f44186y = 0;
        } else {
            this.f44186y = getPosition(getChildAt(0));
        }
        J();
    }

    public final void p(int i10, RecyclerView.Recycler recycler) {
        float fR = r(i10);
        while (i10 >= 0) {
            b bVarD = D(recycler, fR, i10);
            float f6 = bVarD.f44191c;
            d dVar = bVarD.f44192d;
            if (C(f6, dVar)) {
                return;
            }
            float f10 = this.f44185x.f44214a;
            fR = A() ? fR + f10 : fR - f10;
            if (!B(f6, dVar)) {
                m(bVarD.f44189a, 0, bVarD);
            }
            i10--;
        }
    }

    public final float q(View view, float f6, d dVar) {
        com.google.android.material.carousel.b.C0197b c0197b = dVar.f44195a;
        float f10 = c0197b.f44228b;
        com.google.android.material.carousel.b.C0197b c0197b2 = dVar.f44196b;
        float fLerp = AnimationUtils.lerp(f10, c0197b2.f44228b, c0197b.f44227a, c0197b2.f44227a, f6);
        if (c0197b2 != this.f44185x.b()) {
            if (dVar.f44195a != this.f44185x.d()) {
                return fLerp;
            }
        }
        float fB = this.A.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.f44185x.f44214a;
        return fLerp + (((1.0f - c0197b2.f44229c) + fB) * (f6 - c0197b2.f44227a));
    }

    public final float r(int i10) {
        return n(this.A.h() - this.f44178q, this.f44185x.f44214a * i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int iY;
        if (this.f44184w == null || (iY = y(getPosition(view), v(getPosition(view)))) == 0) {
            return false;
        }
        int i10 = this.f44178q;
        int i11 = this.f44179r;
        int i12 = this.f44180s;
        int i13 = i10 + iY;
        if (i13 < i11) {
            iY = i11 - i10;
        } else if (i13 > i12) {
            iY = i12 - i10;
        }
        int iY2 = y(getPosition(view), this.f44184w.b(i10 + iY, false, i11, i12));
        if (isHorizontal()) {
            recyclerView.scrollBy(iY2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iY2);
        return true;
    }

    public final void s(RecyclerView.Recycler recycler, RecyclerView.State state) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fU = u(childAt);
            if (!C(fU, z(fU, this.f44185x.f44215b, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fU2 = u(childAt2);
            if (!B(fU2, z(fU2, this.f44185x.f44215b, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
        if (getChildCount() == 0) {
            p(this.f44186y - 1, recycler);
            o(this.f44186y, recycler, state);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            p(position - 1, recycler);
            o(position2 + 1, recycler, state);
        }
        J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return G(i10, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.D = i10;
        if (this.f44184w == null) {
            return;
        }
        this.f44178q = x(i10, v(i10));
        this.f44186y = MathUtils.clamp(i10, 0, Math.max(0, getItemCount() - 1));
        I(this.f44184w);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return G(i10, recycler, state);
        }
        return 0;
    }

    public void setCarouselAlignment(int i10) {
        this.E = i10;
        F();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.f44183v = carouselStrategy;
        F();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z10) {
        this.f44181t = z10;
        c cVar = this.f44182u;
        recyclerView.removeItemDecoration(cVar);
        if (z10) {
            recyclerView.addItemDecoration(cVar);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i10) {
        f eVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(g0.c("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        f fVar = this.A;
        if (fVar == null || i10 != fVar.f68413a) {
            if (i10 == 0) {
                eVar = new e(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new fe.d(this);
            }
            this.A = eVar;
            F();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }

    public final int t() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    public final float u(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return isHorizontal() ? rect.centerX() : rect.centerY();
    }

    public final com.google.android.material.carousel.b v(int i10) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.f44187z;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(MathUtils.clamp(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f44184w.f44235a : bVar;
    }

    public final int w(int i10, boolean z10) {
        int iX = x(i10, this.f44184w.b(this.f44178q, true, this.f44179r, this.f44180s)) - this.f44178q;
        int iX2 = this.f44187z != null ? x(i10, v(i10)) - this.f44178q : iX;
        return (!z10 || Math.abs(iX2) >= Math.abs(iX)) ? iX : iX2;
    }

    public final int x(int i10, com.google.android.material.carousel.b bVar) {
        if (!A()) {
            return (int) ((bVar.f44214a / 2.0f) + ((i10 * bVar.f44214a) - bVar.a().f44227a));
        }
        float fT = t() - bVar.c().f44227a;
        float f6 = bVar.f44214a;
        return (int) ((fT - (i10 * f6)) - (f6 / 2.0f));
    }

    public final int y(int i10, @NonNull com.google.android.material.carousel.b bVar) {
        int i11 = Integer.MAX_VALUE;
        for (com.google.android.material.carousel.b.C0197b c0197b : bVar.f44215b.subList(bVar.f44216c, bVar.f44217d + 1)) {
            float f6 = bVar.f44214a;
            float f10 = (f6 / 2.0f) + (i10 * f6);
            int iT = (A() ? (int) ((t() - c0197b.f44227a) - f10) : (int) (f10 - c0197b.f44227a)) - this.f44178q;
            if (Math.abs(i11) > Math.abs(iT)) {
                i11 = iT;
            }
        }
        return i11;
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i10) {
        this.f44181t = false;
        this.f44182u = new c();
        this.f44186y = 0;
        this.B = new View.OnLayoutChangeListener() { // from class: fe.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager carouselLayoutManager = this.f68410a;
                carouselLayoutManager.getClass();
                if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
                    return;
                }
                view.post(new k(carouselLayoutManager, 4));
            }
        };
        this.D = -1;
        this.E = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f44181t = false;
        this.f44182u = new c();
        this.f44186y = 0;
        this.B = new View.OnLayoutChangeListener() { // from class: fe.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager carouselLayoutManager = this.f68410a;
                carouselLayoutManager.getClass();
                if (i12 == i16 && i13 == i17 && i14 == i18 && i15 == i19) {
                    return;
                }
                view.post(new k(carouselLayoutManager, 4));
            }
        };
        this.D = -1;
        this.E = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
