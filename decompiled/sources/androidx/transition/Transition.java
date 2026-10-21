package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.h;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import h3.k;
import h3.l;
import h3.o;
import h3.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    public static final int MATCH_ID = 3;
    public static final int MATCH_INSTANCE = 1;
    public static final int MATCH_ITEM_ID = 4;
    public static final int MATCH_NAME = 2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final Animator[] f23654f1 = new Animator[0];

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int[] f23655g1 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final a f23656h1 = new a();

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final ThreadLocal<ArrayMap<Animator, c>> f23657i1 = new ThreadLocal<>();
    public ArrayList<TransitionValues> N0;
    public ArrayList<TransitionValues> O0;
    public TransitionListener[] P0;
    public TransitionPropagation Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public EpicenterCallback f23658a1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f23660c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public f f23661d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f23662e1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f23663p0 = getClass().getName();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f23664q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f23665r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TimeInterpolator f23666s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ArrayList<Integer> f23667t0 = new ArrayList<>();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ArrayList<View> f23668u0 = new ArrayList<>();
    public ArrayList<String> v0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList<Class<?>> f23669w0 = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList<Integer> f23670x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList<View> f23671y0 = null;
    public ArrayList<Class<?>> E0 = null;
    public ArrayList<String> F0 = null;
    public ArrayList<Integer> G0 = null;
    public ArrayList<View> H0 = null;
    public ArrayList<Class<?>> I0 = null;
    public o J0 = new o();
    public o K0 = new o();
    public TransitionSet L0 = null;
    public int[] M0 = f23655g1;
    public boolean Q0 = false;
    public final ArrayList<Animator> R0 = new ArrayList<>();
    public Animator[] S0 = f23654f1;
    public int T0 = 0;
    public boolean U0 = false;
    public boolean V0 = false;
    public Transition W0 = null;
    public ArrayList<TransitionListener> X0 = null;
    public ArrayList<Animator> Y0 = new ArrayList<>();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public PathMotion f23659b1 = f23656h1;

    public static abstract class EpicenterCallback {
        @Nullable
        public abstract Rect onGetEpicenter(@NonNull Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition, boolean z10);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition, boolean z10);
    }

    public class a extends PathMotion {
        @Override // androidx.transition.PathMotion
        @NonNull
        public final Path getPath(float f6, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f6, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f23673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f23674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TransitionValues f23675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WindowId f23676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Transition f23677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Animator f23678f;
    }

    public static class d {
        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    @RequiresApi(26)
    public static class e {
        @DoNotInline
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        @DoNotInline
        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    @RequiresApi(34)
    public class f extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SpringAnimation f23684f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Runnable f23687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Transition f23688j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f23679a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<Consumer<TransitionSeekController>> f23680b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Consumer<TransitionSeekController>> f23681c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Consumer<TransitionSeekController>[] f23685g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final p f23686h = new p(0);

        public f(TransitionSet transitionSet) {
            this.f23688j = transitionSet;
        }

        public final void a() {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.f23681c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f23681c.size();
            if (this.f23685g == null) {
                this.f23685g = new Consumer[size];
            }
            Consumer<TransitionSeekController>[] consumerArr = (Consumer[]) this.f23681c.toArray(this.f23685g);
            this.f23685g = null;
            for (int i10 = 0; i10 < size; i10++) {
                consumerArr[i10].accept(this);
                consumerArr[i10] = null;
            }
            this.f23685g = consumerArr;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void addOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer) {
            if (this.f23681c == null) {
                this.f23681c = new ArrayList<>();
            }
            this.f23681c.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public final void addOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer) {
            if (this.f23682d) {
                consumer.accept(this);
                return;
            }
            if (this.f23680b == null) {
                this.f23680b = new ArrayList<>();
            }
            this.f23680b.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public final void animateToEnd() {
            b();
            this.f23684f.animateToFinalPosition(this.f23688j.f23660c1 + 1);
        }

        @Override // androidx.transition.TransitionSeekController
        public final void animateToStart(@NonNull Runnable runnable) {
            this.f23687i = runnable;
            b();
            this.f23684f.animateToFinalPosition(0.0f);
        }

        public final void b() {
            if (this.f23684f != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f6 = this.f23679a;
            p pVar = this.f23686h;
            int i10 = (pVar.f69333a + 1) % 20;
            pVar.f69333a = i10;
            ((long[]) pVar.f69334b)[i10] = jCurrentAnimationTimeMillis;
            ((float[]) pVar.f69335c)[i10] = f6;
            this.f23684f = new SpringAnimation(new FloatValueHolder());
            SpringForce springForce = new SpringForce();
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(200.0f);
            this.f23684f.setSpring(springForce);
            this.f23684f.setStartValue(this.f23679a);
            this.f23684f.addUpdateListener(this);
            SpringAnimation springAnimation = this.f23684f;
            int i11 = pVar.f69333a;
            long j10 = Long.MIN_VALUE;
            float fSqrt = 0.0f;
            if (i11 != 0 || ((long[]) pVar.f69334b)[i11] != Long.MIN_VALUE) {
                long j11 = ((long[]) pVar.f69334b)[i11];
                int i12 = 0;
                long j12 = j11;
                while (true) {
                    long j13 = ((long[]) pVar.f69334b)[i11];
                    if (j13 == j10) {
                        break;
                    }
                    float f10 = j11 - j13;
                    float fAbs = Math.abs(j13 - j12);
                    if (f10 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i11 == 0) {
                        i11 = 20;
                    }
                    i11--;
                    i12++;
                    if (i12 >= 20) {
                        break;
                    }
                    j12 = j13;
                    j10 = Long.MIN_VALUE;
                }
                if (i12 >= 2) {
                    if (i12 == 2) {
                        int i13 = pVar.f69333a;
                        int i14 = i13 == 0 ? 19 : i13 - 1;
                        long[] jArr = (long[]) pVar.f69334b;
                        float f11 = jArr[i13] - jArr[i14];
                        if (f11 != 0.0f) {
                            float[] fArr = (float[]) pVar.f69335c;
                            fSqrt = ((fArr[i13] - fArr[i14]) / f11) * 1000.0f;
                        }
                    } else {
                        int i15 = pVar.f69333a;
                        int i16 = ((i15 - i12) + 21) % 20;
                        int i17 = (i15 + 21) % 20;
                        long j14 = ((long[]) pVar.f69334b)[i16];
                        float f12 = ((float[]) pVar.f69335c)[i16];
                        int i18 = i16 + 1;
                        int i19 = i18 % 20;
                        float f13 = 0.0f;
                        while (i19 != i17) {
                            long j15 = ((long[]) pVar.f69334b)[i19];
                            float f14 = j15 - j14;
                            if (f14 != fSqrt) {
                                float f15 = ((float[]) pVar.f69335c)[i19];
                                float f16 = (f15 - f12) / f14;
                                float fAbs2 = (Math.abs(f16) * (f16 - ((float) (Math.sqrt(2.0f * Math.abs(f13)) * ((double) Math.signum(f13)))))) + f13;
                                if (i19 == i18) {
                                    fAbs2 *= 0.5f;
                                }
                                f13 = fAbs2;
                                f12 = f15;
                                j14 = j15;
                            }
                            i19 = (i19 + 1) % 20;
                            pVar = pVar;
                            fSqrt = 0.0f;
                        }
                        fSqrt = 1000.0f * ((float) (Math.sqrt(Math.abs(f13) * 2.0f) * ((double) Math.signum(f13))));
                    }
                }
            }
            springAnimation.setStartVelocity(fSqrt);
            this.f23684f.setMaxValue(this.f23688j.f23660c1 + 1);
            this.f23684f.setMinValue(-1.0f);
            this.f23684f.setMinimumVisibleChange(4.0f);
            this.f23684f.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: h3.m
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z10, float f17, float f18) {
                    Transition.f fVar = this.f69328a;
                    if (z10) {
                        fVar.getClass();
                        return;
                    }
                    z0.b bVar = Transition.g.A0;
                    Transition transition = fVar.f23688j;
                    if (f17 >= 1.0f) {
                        transition.l(transition, bVar, false);
                        return;
                    }
                    long j16 = transition.f23660c1;
                    Transition transitionAt = ((TransitionSet) transition).getTransitionAt(0);
                    Transition transition2 = transitionAt.W0;
                    transitionAt.W0 = null;
                    transition.o(-1L, fVar.f23679a);
                    transition.o(j16, -1L);
                    fVar.f23679a = j16;
                    Runnable runnable = fVar.f23687i;
                    if (runnable != null) {
                        runnable.run();
                    }
                    transition.Y0.clear();
                    if (transition2 != null) {
                        transition2.l(transition2, bVar, true);
                    }
                }
            });
        }

        @Override // androidx.transition.TransitionSeekController
        public final float getCurrentFraction() {
            return getCurrentPlayTimeMillis() / this.f23688j.f23660c1;
        }

        @Override // androidx.transition.TransitionSeekController
        public final long getCurrentPlayTimeMillis() {
            return Math.min(this.f23688j.f23660c1, Math.max(0L, this.f23679a));
        }

        @Override // androidx.transition.TransitionSeekController
        public final long getDurationMillis() {
            return this.f23688j.f23660c1;
        }

        @Override // androidx.transition.TransitionSeekController
        public final boolean isReady() {
            return this.f23682d;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f10) {
            Transition transition = this.f23688j;
            long jMax = Math.max(-1L, Math.min(transition.f23660c1 + 1, Math.round(f6)));
            transition.o(jMax, this.f23679a);
            this.f23679a = jMax;
            a();
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            this.f23683e = true;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void removeOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer) {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.f23681c;
            if (arrayList != null) {
                arrayList.remove(consumer);
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public final void removeOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer) {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.f23680b;
            if (arrayList != null) {
                arrayList.remove(consumer);
                if (this.f23680b.isEmpty()) {
                    this.f23680b = null;
                }
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public final void setCurrentFraction(float f6) {
            if (this.f23684f != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            setCurrentPlayTimeMillis((long) (f6 * this.f23688j.f23660c1));
        }

        @Override // androidx.transition.TransitionSeekController
        public final void setCurrentPlayTimeMillis(long j10) {
            if (this.f23684f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j11 = this.f23679a;
            if (j10 == j11 || !this.f23682d) {
                return;
            }
            if (!this.f23683e) {
                Transition transition = this.f23688j;
                if (j10 != 0 || j11 <= 0) {
                    long j12 = transition.f23660c1;
                    if (j10 == j12 && j11 < j12) {
                        j10 = 1 + j12;
                    }
                } else {
                    j10 = -1;
                }
                if (j10 != j11) {
                    transition.o(j10, j11);
                    this.f23679a = j10;
                }
            }
            a();
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            p pVar = this.f23686h;
            int i10 = (pVar.f69333a + 1) % 20;
            pVar.f69333a = i10;
            ((long[]) pVar.f69334b)[i10] = jCurrentAnimationTimeMillis;
            ((float[]) pVar.f69335c)[i10] = j10;
        }
    }

    public interface g {
        public static final z0.b A0;
        public static final bc.org.bouncycastle.math.ec.a B0 = new bc.org.bouncycastle.math.ec.a();
        public static final ai.a C0 = new ai.a();
        public static final h D0 = new h();

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final z0.a f23689z0;

        static {
            int i10 = 1;
            f23689z0 = new z0.a(i10);
            A0 = new z0.b(i10);
        }

        void a(@NonNull TransitionListener transitionListener, @NonNull Transition transition, boolean z10);
    }

    public Transition() {
    }

    public static void a(o oVar, View view, TransitionValues transitionValues) {
        oVar.f69329a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = oVar.f69330b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            ArrayMap<String, View> arrayMap = oVar.f69332d;
            if (arrayMap.containsKey(transitionName)) {
                arrayMap.put(transitionName, null);
            } else {
                arrayMap.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LongSparseArray<View> longSparseArray = oVar.f69331c;
                if (longSparseArray.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = longSparseArray.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.put(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayMap<Animator, c> i() {
        ThreadLocal<ArrayMap<Animator, c>> threadLocal = f23657i1;
        ArrayMap<Animator, c> arrayMap = threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, c> arrayMap2 = new ArrayMap<>();
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.X0 == null) {
            this.X0 = new ArrayList<>();
        }
        this.X0.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.f23668u0.add(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new b());
        animator.start();
    }

    public final void b(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f23670x0;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f23671y0;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.E0;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.E0.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z10) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f23710a.add(this);
                    c(transitionValues);
                    if (z10) {
                        a(this.J0, view, transitionValues);
                    } else {
                        a(this.K0, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.G0;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.H0;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.I0;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.I0.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                b(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void c(TransitionValues transitionValues) {
        String[] propagationProperties;
        if (this.Z0 == null || transitionValues.values.isEmpty() || (propagationProperties = this.Z0.getPropagationProperties()) == null) {
            return;
        }
        for (String str : propagationProperties) {
            if (!transitionValues.values.containsKey(str)) {
                this.Z0.captureValues(transitionValues);
                return;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        ArrayList<Animator> arrayList = this.R0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S0);
        this.S0 = f23654f1;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.S0 = animatorArr;
        l(this, g.B0, false);
    }

    public abstract void captureEndValues(@NonNull TransitionValues transitionValues);

    public abstract void captureStartValues(@NonNull TransitionValues transitionValues);

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    public final void d(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        e(z10);
        ArrayList<Integer> arrayList3 = this.f23667t0;
        int size = arrayList3.size();
        ArrayList<View> arrayList4 = this.f23668u0;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.v0) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f23669w0) != null && !arrayList2.isEmpty()))) {
            b(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(arrayList3.get(i10).intValue());
            if (viewFindViewById != null) {
                TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                if (z10) {
                    captureStartValues(transitionValues);
                } else {
                    captureEndValues(transitionValues);
                }
                transitionValues.f23710a.add(this);
                c(transitionValues);
                if (z10) {
                    a(this.J0, viewFindViewById, transitionValues);
                } else {
                    a(this.K0, viewFindViewById, transitionValues);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            View view = arrayList4.get(i11);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z10) {
                captureStartValues(transitionValues2);
            } else {
                captureEndValues(transitionValues2);
            }
            transitionValues2.f23710a.add(this);
            c(transitionValues2);
            if (z10) {
                a(this.J0, view, transitionValues2);
            } else {
                a(this.K0, view, transitionValues2);
            }
        }
    }

    public final void e(boolean z10) {
        if (z10) {
            this.J0.f69329a.clear();
            this.J0.f69330b.clear();
            this.J0.f69331c.clear();
        } else {
            this.K0.f69329a.clear();
            this.K0.f69330b.clear();
            this.K0.f69331c.clear();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i10 = this.T0 - 1;
        this.T0 = i10;
        if (i10 == 0) {
            l(this, g.A0, false);
            for (int i11 = 0; i11 < this.J0.f69331c.size(); i11++) {
                View viewValueAt = this.J0.f69331c.valueAt(i11);
                if (viewValueAt != null) {
                    viewValueAt.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.K0.f69331c.size(); i12++) {
                View viewValueAt2 = this.K0.f69331c.valueAt(i12);
                if (viewValueAt2 != null) {
                    viewValueAt2.setHasTransientState(false);
                }
            }
            this.V0 = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z10) {
        ArrayList<View> arrayListA = this.H0;
        if (view != null) {
            arrayListA = z10 ? d.a(view, arrayListA) : d.b(view, arrayListA);
        }
        this.H0 = arrayListA;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z10) {
        ArrayList<View> arrayListA = this.f23671y0;
        if (view != null) {
            arrayListA = z10 ? d.a(view, arrayListA) : d.b(view, arrayListA);
        }
        this.f23671y0 = arrayListA;
        return this;
    }

    public void f(@NonNull ViewGroup viewGroup, @NonNull o oVar, @NonNull o oVar2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        Animator animatorCreateAnimator;
        int i10;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap<Animator, c> arrayMapI = i();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = getRootTransition().f23661d1 != null;
        long jMin = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            TransitionValues transitionValues3 = arrayList.get(i11);
            TransitionValues transitionValues4 = arrayList2.get(i11);
            if (transitionValues3 != null && !transitionValues3.f23710a.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f23710a.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || isTransitionRequired(transitionValues3, transitionValues4)) && (animatorCreateAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) != null)) {
                if (transitionValues4 != null) {
                    view = transitionValues4.view;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new TransitionValues(view);
                        TransitionValues transitionValues5 = oVar2.f69329a.get(view);
                        if (transitionValues5 != null) {
                            int i12 = 0;
                            while (i12 < transitionProperties.length) {
                                Map<String, Object> map = transitionValues2.values;
                                int i13 = i11;
                                String str = transitionProperties[i12];
                                map.put(str, transitionValues5.values.get(str));
                                i12++;
                                i11 = i13;
                                transitionProperties = transitionProperties;
                            }
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                        int size2 = arrayMapI.getSize();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            c cVar = arrayMapI.get(arrayMapI.keyAt(i14));
                            if (cVar.f23675c != null && cVar.f23673a == view && cVar.f23674b.equals(getName()) && cVar.f23675c.equals(transitionValues2)) {
                                animator2 = null;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        i10 = i11;
                        animator2 = animatorCreateAnimator;
                        transitionValues2 = null;
                    }
                    animator = animator2;
                    transitionValues = transitionValues2;
                } else {
                    i10 = i11;
                    view = transitionValues3.view;
                    transitionValues = null;
                }
                if (animator != null) {
                    animator = animatorCreateAnimator;
                    TransitionPropagation transitionPropagation = this.Z0;
                    if (transitionPropagation != null) {
                        long startDelay = transitionPropagation.getStartDelay(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.Y0.size(), (int) startDelay);
                        jMin = Math.min(startDelay, jMin);
                    }
                    String name = getName();
                    WindowId windowId = viewGroup.getWindowId();
                    c cVar2 = new c();
                    cVar2.f23673a = view;
                    cVar2.f23674b = name;
                    cVar2.f23675c = transitionValues;
                    cVar2.f23676d = windowId;
                    cVar2.f23677e = this;
                    cVar2.f23678f = animator;
                    Animator animator3 = animator;
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator3 = animatorSet;
                    }
                    arrayMapI.put(animator3, cVar2);
                    this.Y0.add(animator3);
                } else {
                    animator = animatorCreateAnimator;
                }
            } else {
                size = size;
                i10 = i11;
            }
            i11 = i10 + 1;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                c cVar3 = arrayMapI.get(this.Y0.get(sparseIntArray.keyAt(i15)));
                cVar3.f23678f.setStartDelay(cVar3.f23678f.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - jMin));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void g(@Nullable ViewGroup viewGroup) {
        ArrayMap<Animator, c> arrayMapI = i();
        int size = arrayMapI.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        ArrayMap arrayMap = new ArrayMap(arrayMapI);
        arrayMapI.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            c cVar = (c) arrayMap.valueAt(i10);
            if (cVar.f23673a != null && windowId.equals(cVar.f23676d)) {
                ((Animator) arrayMap.keyAt(i10)).end();
            }
        }
    }

    public long getDuration() {
        return this.f23665r0;
    }

    @Nullable
    public Rect getEpicenter() {
        EpicenterCallback epicenterCallback = this.f23658a1;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.onGetEpicenter(this);
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.f23658a1;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.f23666s0;
    }

    @NonNull
    public String getName() {
        return this.f23663p0;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.f23659b1;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.Z0;
    }

    @NonNull
    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.L0;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.f23664q0;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.f23667t0;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.v0;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.f23669w0;
    }

    @NonNull
    public List<View> getTargets() {
        return this.f23668u0;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z10) {
        TransitionSet transitionSet = this.L0;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z10);
        }
        return (z10 ? this.J0 : this.K0).f69329a.get(view);
    }

    public final TransitionValues h(View view, boolean z10) {
        TransitionSet transitionSet = this.L0;
        if (transitionSet != null) {
            return transitionSet.h(view, z10);
        }
        ArrayList<TransitionValues> arrayList = z10 ? this.N0 : this.O0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            TransitionValues transitionValues = arrayList.get(i10);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.view == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.O0 : this.N0).get(i10);
        }
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            for (String str : transitionValues.values.keySet()) {
                Object obj = transitionValues.values.get(str);
                Object obj2 = transitionValues2.values.get(str);
                if (obj != null || obj2 != null) {
                    if (obj == null || obj2 == null || (!obj.equals(obj2))) {
                    }
                }
            }
            return false;
        }
        for (String str2 : transitionProperties) {
            Object obj3 = transitionValues.values.get(str2);
            Object obj4 = transitionValues2.values.get(str2);
            if ((obj3 == null && obj4 == null) || (obj3 != null && obj4 != null && !(!obj3.equals(obj4)))) {
            }
        }
        return false;
        return true;
    }

    public boolean j() {
        return !this.R0.isEmpty();
    }

    public final boolean k(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f23670x0;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f23671y0;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.E0;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.E0.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.F0 != null && ViewCompat.getTransitionName(view) != null && this.F0.contains(ViewCompat.getTransitionName(view))) {
            return false;
        }
        ArrayList<Integer> arrayList6 = this.f23667t0;
        int size2 = arrayList6.size();
        ArrayList<View> arrayList7 = this.f23668u0;
        if ((size2 == 0 && arrayList7.size() == 0 && (((arrayList = this.f23669w0) == null || arrayList.isEmpty()) && ((arrayList2 = this.v0) == null || arrayList2.isEmpty()))) || arrayList6.contains(Integer.valueOf(id)) || arrayList7.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList8 = this.v0;
        if (arrayList8 != null && arrayList8.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.f23669w0 != null) {
            for (int i11 = 0; i11 < this.f23669w0.size(); i11++) {
                if (this.f23669w0.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l(Transition transition, g gVar, boolean z10) {
        Transition transition2 = this.W0;
        if (transition2 != null) {
            transition2.l(transition, gVar, z10);
        }
        ArrayList<TransitionListener> arrayList = this.X0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.X0.size();
        TransitionListener[] transitionListenerArr = this.P0;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.P0 = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.X0.toArray(transitionListenerArr);
        for (int i10 = 0; i10 < size; i10++) {
            gVar.a(transitionListenerArr2[i10], transition, z10);
            transitionListenerArr2[i10] = null;
        }
        this.P0 = transitionListenerArr2;
    }

    @RequiresApi(34)
    public void m() {
        ArrayMap<Animator, c> arrayMapI = i();
        this.f23660c1 = 0L;
        for (int i10 = 0; i10 < this.Y0.size(); i10++) {
            Animator animator = this.Y0.get(i10);
            c cVar = arrayMapI.get(animator);
            if (animator != null && cVar != null) {
                long duration = getDuration();
                Animator animator2 = cVar.f23678f;
                if (duration >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.R0.add(animator);
                this.f23660c1 = Math.max(this.f23660c1, e.a(animator));
            }
        }
        this.Y0.clear();
    }

    public void n() {
        this.Q0 = true;
    }

    @RequiresApi(34)
    public void o(long j10, long j11) {
        long j12 = this.f23660c1;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > j12 && j10 <= j12)) {
            this.V0 = false;
            l(this, g.f23689z0, z10);
        }
        ArrayList<Animator> arrayList = this.R0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S0);
        this.S0 = f23654f1;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            e.b(animator, Math.min(Math.max(0L, j10), e.a(animator)));
        }
        this.S0 = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.V0 = true;
        }
        l(this, g.A0, z10);
    }

    public String p(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f23665r0 != -1) {
            sb2.append("dur(");
            sb2.append(this.f23665r0);
            sb2.append(") ");
        }
        if (this.f23664q0 != -1) {
            sb2.append("dly(");
            sb2.append(this.f23664q0);
            sb2.append(") ");
        }
        if (this.f23666s0 != null) {
            sb2.append("interp(");
            sb2.append(this.f23666s0);
            sb2.append(") ");
        }
        ArrayList<Integer> arrayList = this.f23667t0;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f23668u0;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        if (this.V0) {
            return;
        }
        ArrayList<Animator> arrayList = this.R0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S0);
        this.S0 = f23654f1;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.S0 = animatorArr;
        l(this, g.C0, false);
        this.U0 = true;
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        Transition transition;
        ArrayList<TransitionListener> arrayList = this.X0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(transitionListener) && (transition = this.W0) != null) {
            transition.removeListener(transitionListener);
        }
        if (this.X0.size() == 0) {
            this.X0 = null;
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.f23668u0.remove(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        if (this.U0) {
            if (!this.V0) {
                ArrayList<Animator> arrayList = this.R0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S0);
                this.S0 = f23654f1;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.S0 = animatorArr;
                l(this, g.D0, false);
            }
            this.U0 = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        ArrayMap<Animator, c> arrayMapI = i();
        for (Animator animator : this.Y0) {
            if (arrayMapI.containsKey(animator)) {
                start();
                if (animator != null) {
                    animator.addListener(new l(this, arrayMapI));
                    animate(animator);
                }
            }
        }
        this.Y0.clear();
        end();
    }

    @NonNull
    public Transition setDuration(long j10) {
        this.f23665r0 = j10;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
        this.f23658a1 = epicenterCallback;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f23666s0 = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.M0 = f23655g1;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < 1 || i11 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i12 = 0; i12 < i10; i12++) {
                if (iArr[i12] == i11) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.M0 = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f23659b1 = f23656h1;
        } else {
            this.f23659b1 = pathMotion;
        }
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        this.Z0 = transitionPropagation;
    }

    @NonNull
    public Transition setStartDelay(long j10) {
        this.f23664q0 = j10;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.T0 == 0) {
            l(this, g.f23689z0, false);
            this.V0 = false;
        }
        this.T0++;
    }

    @NonNull
    public String toString() {
        return p("");
    }

    @NonNull
    public Transition addTarget(@IdRes int i10) {
        if (i10 != 0) {
            this.f23667t0.add(Integer.valueOf(i10));
        }
        return this;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo4643clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.Y0 = new ArrayList<>();
            transition.J0 = new o();
            transition.K0 = new o();
            transition.N0 = null;
            transition.O0 = null;
            transition.f23661d1 = null;
            transition.W0 = this;
            transition.X0 = null;
            return transition;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    @NonNull
    public Transition removeTarget(@IdRes int i10) {
        if (i10 != 0) {
            this.f23667t0.remove(Integer.valueOf(i10));
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.v0 == null) {
            this.v0 = new ArrayList<>();
        }
        this.v0.add(str);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.v0;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i10, boolean z10) {
        ArrayList<Integer> arrayListB = this.G0;
        if (i10 > 0) {
            if (z10) {
                arrayListB = d.a(Integer.valueOf(i10), arrayListB);
            } else {
                arrayListB = d.b(Integer.valueOf(i10), arrayListB);
            }
        }
        this.G0 = arrayListB;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i10, boolean z10) {
        ArrayList<Integer> arrayListB = this.f23670x0;
        if (i10 > 0) {
            if (z10) {
                arrayListB = d.a(Integer.valueOf(i10), arrayListB);
            } else {
                arrayListB = d.b(Integer.valueOf(i10), arrayListB);
            }
        }
        this.f23670x0 = arrayListB;
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f23669w0;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.f23669w0 == null) {
            this.f23669w0 = new ArrayList<>();
        }
        this.f23669w0.add(cls);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z10) {
        ArrayList<Class<?>> arrayListB = this.I0;
        if (cls != null) {
            if (z10) {
                arrayListB = d.a(cls, arrayListB);
            } else {
                arrayListB = d.b(cls, arrayListB);
            }
        }
        this.I0 = arrayListB;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z10) {
        ArrayList<String> arrayListB = this.F0;
        if (str != null) {
            if (z10) {
                arrayListB = d.a(str, arrayListB);
            } else {
                arrayListB = d.b(str, arrayListB);
            }
        }
        this.F0 = arrayListB;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z10) {
        ArrayList<Class<?>> arrayListB = this.E0;
        if (cls != null) {
            if (z10) {
                arrayListB = d.a(cls, arrayListB);
            } else {
                arrayListB = d.b(cls, arrayListB);
            }
        }
        this.E0 = arrayListB;
        return this;
    }

    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69317c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, TypedValues.TransitionType.S_DURATION, 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(namedString, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                    i10--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(h0.b("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i10++;
            }
            setMatchOrder(iArr);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
