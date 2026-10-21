package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import h3.j;
import h3.k;
import h3.n;
import h3.q;
import h3.r;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String[] f23542k1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final a f23543l1 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final b f23544m1 = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final c f23545n1 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final d f23546o1 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final e f23547p1 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final j f23548q1 = new j();

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f23549j1;

    public class a extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f23565a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f23566b = iRound;
            int i10 = iVar2.f23570f + 1;
            iVar2.f23570f = i10;
            if (i10 == iVar2.f23571g) {
                r.a(iVar2.f23569e, iVar2.f23565a, iRound, iVar2.f23567c, iVar2.f23568d);
                iVar2.f23570f = 0;
                iVar2.f23571g = 0;
            }
        }
    }

    public class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f23567c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f23568d = iRound;
            int i10 = iVar2.f23571g + 1;
            iVar2.f23571g = i10;
            if (iVar2.f23570f == i10) {
                r.a(iVar2.f23569e, iVar2.f23565a, iVar2.f23566b, iVar2.f23567c, iRound);
                iVar2.f23570f = 0;
                iVar2.f23571g = 0;
            }
        }
    }

    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            r.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class f extends AnimatorListenerAdapter {
        private final i mViewBounds;

        public f(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public static class g extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f23550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f23551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f23553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f23554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f23556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f23557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f23558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f23559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f23560k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f23561l;
        public final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f23562n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f23550a = view;
            this.f23551b = rect;
            this.f23552c = z10;
            this.f23553d = rect2;
            this.f23554e = z11;
            this.f23555f = i10;
            this.f23556g = i11;
            this.f23557h = i12;
            this.f23558i = i13;
            this.f23559j = i14;
            this.f23560k = i15;
            this.f23561l = i16;
            this.m = i17;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            this.f23562n = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            View view = this.f23550a;
            view.setTag(R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.f23554e ? null : this.f23553d);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            int i10 = R.id.transition_clip;
            View view = this.f23550a;
            Rect rect = (Rect) view.getTag(i10);
            view.setTag(i10, null);
            view.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f23562n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f23552c) {
                    rect = this.f23551b;
                }
            } else if (!this.f23554e) {
                rect = this.f23553d;
            }
            View view = this.f23550a;
            view.setClipBounds(rect);
            if (z10) {
                r.a(view, this.f23555f, this.f23556g, this.f23557h, this.f23558i);
            } else {
                r.a(view, this.f23559j, this.f23560k, this.f23561l, this.m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            int i10 = this.f23557h;
            int i11 = this.f23555f;
            int i12 = this.f23561l;
            int i13 = this.f23559j;
            int iMax = Math.max(i10 - i11, i12 - i13);
            int i14 = this.f23558i;
            int i15 = this.f23556g;
            int i16 = this.m;
            int i17 = this.f23560k;
            int iMax2 = Math.max(i14 - i15, i16 - i17);
            if (z10) {
                i11 = i13;
            }
            if (z10) {
                i15 = i17;
            }
            View view = this.f23550a;
            r.a(view, i11, i15, iMax + i11, iMax2 + i15);
            view.setClipBounds(z10 ? this.f23553d : this.f23551b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }
    }

    public static class h extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23563a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f23564b;

        public h(@NonNull ViewGroup viewGroup) {
            this.f23564b = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            q.a(this.f23564b, false);
            this.f23563a = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            if (!this.f23563a) {
                q.a(this.f23564b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            q.a(this.f23564b, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            q.a(this.f23564b, true);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f23569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23571g;

        public i(View view) {
            this.f23569e = view;
        }
    }

    public ChangeBounds() {
        this.f23549j1 = false;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        Rect rect;
        q(transitionValues);
        if (!this.f23549j1 || (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) == null) {
            return;
        }
        transitionValues.values.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i10;
        View view;
        ObjectAnimator objectAnimatorA;
        int i11;
        int i12;
        Animator animator;
        AnimatorSet animatorSet;
        boolean z10;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = transitionValues2.view;
        Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
        int i13 = rect.left;
        int i14 = rect2.left;
        int i15 = rect.top;
        int i16 = rect2.top;
        int i17 = rect.right;
        int i18 = rect2.right;
        int i19 = rect.bottom;
        int i20 = rect2.bottom;
        int i21 = i17 - i13;
        int i22 = i19 - i15;
        int i23 = i18 - i14;
        int i24 = i20 - i16;
        Rect rect3 = (Rect) transitionValues.values.get("android:changeBounds:clip");
        Rect rect4 = (Rect) transitionValues2.values.get("android:changeBounds:clip");
        if ((i21 == 0 || i22 == 0) && (i23 == 0 || i24 == 0)) {
            i10 = 0;
        } else {
            i10 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i20) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i25 = i10;
        if (i25 <= 0) {
            return null;
        }
        boolean z11 = this.f23549j1;
        e eVar = f23547p1;
        if (z11) {
            view = view2;
            r.a(view, i13, i15, Math.max(i21, i23) + i13, i15 + Math.max(i22, i24));
            objectAnimatorA = (i13 == i14 && i15 == i16) ? null : h3.h.a(view, eVar, getPathMotion().getPath(i13, i15, i14, i16));
            boolean z12 = rect3 == null;
            if (z12) {
                i11 = 0;
                rect3 = new Rect(0, 0, i21, i22);
            } else {
                i11 = 0;
            }
            boolean z13 = rect4 == null ? 1 : i11;
            Rect rect5 = z13 != 0 ? new Rect(i11, i11, i23, i24) : rect4;
            if (rect3.equals(rect5)) {
                i12 = 2;
                animator = null;
            } else {
                view.setClipBounds(rect3);
                Object[] objArr = new Object[2];
                objArr[i11] = rect3;
                objArr[1] = rect5;
                Animator animatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f23548q1, objArr);
                g gVar = new g(view, rect3, z12, rect5, z13, i13, i15, i17, i19, i14, i16, i18, i20);
                animatorOfObject.addListener(gVar);
                i12 = 2;
                addListener(gVar);
                animator = animatorOfObject;
            }
            boolean z14 = androidx.transition.c.f23741a;
            if (objectAnimatorA != null) {
                if (animator != null) {
                    animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[i12];
                    animatorArr[0] = objectAnimatorA;
                    z10 = true;
                    animatorArr[1] = animator;
                    animatorSet.playTogether(animatorArr);
                    animator = animatorSet;
                }
                animator = objectAnimatorA;
                z10 = true;
            } else {
                z10 = true;
            }
        } else {
            view = view2;
            r.a(view, i13, i15, i17, i19);
            if (i25 != 2) {
                objectAnimatorA = (i13 == i14 && i15 == i16) ? h3.h.a(view, f23545n1, getPathMotion().getPath(i17, i19, i18, i20)) : h3.h.a(view, f23546o1, getPathMotion().getPath(i13, i15, i14, i16));
            } else if (i21 == i23 && i22 == i24) {
                objectAnimatorA = h3.h.a(view, eVar, getPathMotion().getPath(i13, i15, i14, i16));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = h3.h.a(iVar, f23543l1, getPathMotion().getPath(i13, i15, i14, i16));
                ObjectAnimator objectAnimatorA3 = h3.h.a(iVar, f23544m1, getPathMotion().getPath(i17, i19, i18, i20));
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                z10 = true;
                animator = animatorSet;
            }
            animator = objectAnimatorA;
            z10 = true;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            q.a(viewGroup4, z10);
            getRootTransition().addListener(new h(viewGroup4));
        }
        return animator;
    }

    public boolean getResizeClip() {
        return this.f23549j1;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f23542k1;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public final void q(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.values.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.values.put("android:changeBounds:parent", transitionValues.view.getParent());
        if (this.f23549j1) {
            transitionValues.values.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    public void setResizeClip(boolean z10) {
        this.f23549j1 = z10;
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23549j1 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69318d);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}
