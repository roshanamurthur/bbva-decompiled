package androidx.transition;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import h3.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AutoTransition f23693c = new AutoTransition();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f23694d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f23695e = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap<Scene, Transition> f23696a = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<Scene, ArrayMap<Scene, Transition>> f23697b = new ArrayMap<>();

    public static void a(Scene scene, Transition transition) {
        ViewGroup sceneRoot = scene.getSceneRoot();
        ArrayList<ViewGroup> arrayList = f23695e;
        if (arrayList.contains(sceneRoot)) {
            return;
        }
        Scene currentScene = Scene.getCurrentScene(sceneRoot);
        if (transition == null) {
            if (currentScene != null) {
                currentScene.exit();
            }
            scene.enter();
            return;
        }
        arrayList.add(sceneRoot);
        Transition transitionMo4643clone = transition.mo4643clone();
        if (currentScene != null && currentScene.f23638b > 0) {
            transitionMo4643clone.n();
        }
        d(sceneRoot, transitionMo4643clone);
        scene.enter();
        c(sceneRoot, transitionMo4643clone);
    }

    @VisibleForTesting
    public static ArrayMap<ViewGroup, ArrayList<Transition>> b() {
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap;
        ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> threadLocal = f23694d;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = threadLocal.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap2 = new ArrayMap<>();
        threadLocal.set(new WeakReference<>(arrayMap2));
        return arrayMap2;
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    public static void c(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a();
        aVar.f23698p0 = transition;
        aVar.f23699q0 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    @Nullable
    public static TransitionSeekController controlDelayedTransition(@NonNull ViewGroup viewGroup, @NonNull Transition transition) {
        ArrayList<ViewGroup> arrayList = f23695e;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        Transition transitionMo4643clone = transition.mo4643clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(transitionMo4643clone);
        d(viewGroup, transitionSet);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, transitionSet);
        viewGroup.invalidate();
        Transition.f fVar = new Transition.f(transitionSet);
        transitionSet.f23661d1 = fVar;
        transitionSet.addListener((Transition.TransitionListener) fVar);
        return transitionSet.f23661d1;
    }

    @Nullable
    public static TransitionSeekController createSeekController(@NonNull Scene scene, @NonNull Transition transition) {
        ViewGroup sceneRoot = scene.getSceneRoot();
        if (!transition.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        ArrayList<ViewGroup> arrayList = f23695e;
        if (arrayList.contains(sceneRoot)) {
            return null;
        }
        Scene currentScene = Scene.getCurrentScene(sceneRoot);
        if (!sceneRoot.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            if (currentScene != null) {
                currentScene.exit();
            }
            scene.enter();
            return null;
        }
        arrayList.add(sceneRoot);
        Transition transitionMo4643clone = transition.mo4643clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(transitionMo4643clone);
        if (currentScene != null && currentScene.f23638b > 0) {
            transitionSet.n();
        }
        d(sceneRoot, transitionSet);
        scene.enter();
        c(sceneRoot, transitionSet);
        Transition.f fVar = new Transition.f(transitionSet);
        transitionSet.f23661d1 = fVar;
        transitionSet.addListener((Transition.TransitionListener) fVar);
        return transitionSet.f23661d1;
    }

    public static void d(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.d(viewGroup, true);
        }
        Scene currentScene = Scene.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void endTransitions(@Nullable ViewGroup viewGroup) {
        f23695e.remove(viewGroup);
        ArrayList<Transition> arrayList = b().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).g(viewGroup);
        }
    }

    public static void go(@NonNull Scene scene) {
        a(scene, f23693c);
    }

    public void setTransition(@NonNull Scene scene, @Nullable Transition transition) {
        this.f23696a.put(scene, transition);
    }

    public void transitionTo(@NonNull Scene scene) {
        Transition transition;
        ArrayMap<Scene, Transition> arrayMap;
        Scene currentScene = Scene.getCurrentScene(scene.getSceneRoot());
        if ((currentScene == null || (arrayMap = this.f23697b.get(scene)) == null || (transition = arrayMap.get(currentScene)) == null) && (transition = this.f23696a.get(scene)) == null) {
            transition = f23693c;
        }
        a(scene, transition);
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        ArrayList<ViewGroup> arrayList = f23695e;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f23693c;
        }
        Transition transitionMo4643clone = transition.mo4643clone();
        d(viewGroup, transitionMo4643clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, transitionMo4643clone);
    }

    public static void go(@NonNull Scene scene, @Nullable Transition transition) {
        a(scene, transition);
    }

    public void setTransition(@NonNull Scene scene, @NonNull Scene scene2, @Nullable Transition transition) {
        ArrayMap<Scene, ArrayMap<Scene, Transition>> arrayMap = this.f23697b;
        ArrayMap<Scene, Transition> arrayMap2 = arrayMap.get(scene2);
        if (arrayMap2 == null) {
            arrayMap2 = new ArrayMap<>();
            arrayMap.put(scene2, arrayMap2);
        }
        arrayMap2.put(scene, transition);
    }

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Transition f23698p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ViewGroup f23699q0;

        /* JADX INFO: renamed from: androidx.transition.TransitionManager$a$a, reason: collision with other inner class name */
        public class C0105a extends TransitionListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayMap f23700a;

            public C0105a(ArrayMap arrayMap) {
                this.f23700a = arrayMap;
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(@NonNull Transition transition) {
                ((ArrayList) this.f23700a.get(a.this.f23699q0)).remove(transition);
                transition.removeListener(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:104:0x021c  */
        /* JADX WARN: Code duplicated, block: B:127:0x028a  */
        /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
        /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
        /* JADX WARN: Code duplicated, block: B:142:0x02c1  */
        /* JADX WARN: Code duplicated, block: B:144:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:147:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:150:0x02eb A[LOOP:9: B:148:0x02e5->B:150:0x02eb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:154:0x01c6 A[EDGE_INSN: B:154:0x01c6->B:88:0x01c6 BREAK  A[LOOP:1: B:19:0x0083->B:87:0x01be], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x01be A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:188:0x01e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:191:0x0209 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x0097  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:60:0x0137  */
        /* JADX WARN: Code duplicated, block: B:62:0x0142  */
        /* JADX WARN: Code duplicated, block: B:75:0x0185  */
        /* JADX WARN: Code duplicated, block: B:77:0x018d  */
        /* JADX WARN: Code duplicated, block: B:91:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:93:0x01db  */
        /* JADX WARN: Code duplicated, block: B:98:0x01f0  */
        /* JADX WARN: Instruction removed from duplicated block: B:142:0x02c1, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            Transition transition;
            int i10;
            o oVar;
            o oVar2;
            ArrayMap arrayMap;
            ArrayMap arrayMap2;
            int i11;
            int[] iArr;
            int i12;
            int i13;
            ArrayMap<Animator, Transition.c> arrayMapI;
            int i14;
            int i15;
            Transition.f fVar;
            ArrayList<Consumer<TransitionSeekController>> arrayList2;
            Animator animatorKeyAt;
            Transition.c cVar;
            View view;
            TransitionValues transitionValues;
            TransitionValues transitionValues2;
            int i16;
            int size;
            View view2;
            TransitionValues transitionValues3;
            ArrayMap<String, View> arrayMap3;
            int size2;
            int i17;
            View viewValueAt;
            View view3;
            SparseArray<View> sparseArray;
            int size3;
            int i18;
            View viewValueAt2;
            View view4;
            LongSparseArray<View> longSparseArray;
            int size4;
            int i19;
            View viewValueAt3;
            Iterator it;
            ViewGroup viewGroup = this.f23699q0;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList3 = TransitionManager.f23695e;
            ViewGroup viewGroup2 = this.f23699q0;
            int i20 = 1;
            if (!arrayList3.remove(viewGroup2)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> arrayMapB = TransitionManager.b();
            ArrayList<Transition> arrayList4 = arrayMapB.get(viewGroup2);
            if (arrayList4 != null) {
                arrayList = arrayList4.size() > 0 ? new ArrayList(arrayList4) : null;
                transition = this.f23698p0;
                arrayList4.add(transition);
                transition.addListener(new C0105a(arrayMapB));
                i10 = 0;
                transition.d(viewGroup2, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).resume(viewGroup2);
                    }
                }
                transition.N0 = new ArrayList<>();
                transition.O0 = new ArrayList<>();
                oVar = transition.J0;
                oVar2 = transition.K0;
                arrayMap = new ArrayMap(oVar.f69329a);
                arrayMap2 = new ArrayMap(oVar2.f69329a);
                i11 = 0;
                while (true) {
                    iArr = transition.M0;
                    if (i11 < iArr.length) {
                        break;
                    }
                    i16 = iArr[i11];
                    if (i16 != i20) {
                        for (size = arrayMap.getSize() - 1; size >= 0; size--) {
                            view2 = (View) arrayMap.keyAt(size);
                            if (view2 == null && transition.k(view2) && (transitionValues3 = (TransitionValues) arrayMap2.remove(view2)) != null && transition.k(transitionValues3.view)) {
                                transition.N0.add((TransitionValues) arrayMap.removeAt(size));
                                transition.O0.add(transitionValues3);
                            }
                        }
                    } else if (i16 != 2) {
                        arrayMap3 = oVar.f69332d;
                        ArrayMap<String, View> arrayMap4 = oVar2.f69332d;
                        size2 = arrayMap3.getSize();
                        for (i17 = 0; i17 < size2; i17++) {
                            viewValueAt = arrayMap3.valueAt(i17);
                            if (viewValueAt == null && transition.k(viewValueAt) && (view3 = arrayMap4.get(arrayMap3.keyAt(i17))) != null && transition.k(view3)) {
                                TransitionValues transitionValues4 = (TransitionValues) arrayMap.get(viewValueAt);
                                TransitionValues transitionValues5 = (TransitionValues) arrayMap2.get(view3);
                                if (transitionValues4 != null && transitionValues5 != null) {
                                    transition.N0.add(transitionValues4);
                                    transition.O0.add(transitionValues5);
                                    arrayMap.remove(viewValueAt);
                                    arrayMap2.remove(view3);
                                }
                            }
                        }
                    } else if (i16 != 3) {
                        sparseArray = oVar.f69330b;
                        SparseArray<View> sparseArray2 = oVar2.f69330b;
                        size3 = sparseArray.size();
                        for (i18 = 0; i18 < size3; i18++) {
                            viewValueAt2 = sparseArray.valueAt(i18);
                            if (viewValueAt2 == null && transition.k(viewValueAt2) && (view4 = sparseArray2.get(sparseArray.keyAt(i18))) != null && transition.k(view4)) {
                                TransitionValues transitionValues6 = (TransitionValues) arrayMap.get(viewValueAt2);
                                TransitionValues transitionValues7 = (TransitionValues) arrayMap2.get(view4);
                                if (transitionValues6 != null && transitionValues7 != null) {
                                    transition.N0.add(transitionValues6);
                                    transition.O0.add(transitionValues7);
                                    arrayMap.remove(viewValueAt2);
                                    arrayMap2.remove(view4);
                                }
                            }
                        }
                    } else if (i16 != 4) {
                        longSparseArray = oVar.f69331c;
                        size4 = longSparseArray.size();
                        for (i19 = i10; i19 < size4; i19++) {
                            viewValueAt3 = longSparseArray.valueAt(i19);
                            if (viewValueAt3 == null && transition.k(viewValueAt3)) {
                                View view5 = oVar2.f69331c.get(longSparseArray.keyAt(i19));
                                if (view5 != null && transition.k(view5)) {
                                    TransitionValues transitionValues8 = (TransitionValues) arrayMap.get(viewValueAt3);
                                    TransitionValues transitionValues9 = (TransitionValues) arrayMap2.get(view5);
                                    if (transitionValues8 != null && transitionValues9 != null) {
                                        transition.N0.add(transitionValues8);
                                        transition.O0.add(transitionValues9);
                                        arrayMap.remove(viewValueAt3);
                                        arrayMap2.remove(view5);
                                    }
                                }
                            }
                        }
                    }
                    i11++;
                    i10 = 0;
                    i20 = 1;
                }
                for (i12 = 0; i12 < arrayMap.getSize(); i12++) {
                    transitionValues2 = (TransitionValues) arrayMap.valueAt(i12);
                    if (transition.k(transitionValues2.view)) {
                        transition.N0.add(transitionValues2);
                        transition.O0.add(null);
                    }
                }
                for (i13 = 0; i13 < arrayMap2.getSize(); i13++) {
                    transitionValues = (TransitionValues) arrayMap2.valueAt(i13);
                    if (transition.k(transitionValues.view)) {
                        transition.O0.add(transitionValues);
                        transition.N0.add(null);
                    }
                }
                arrayMapI = Transition.i();
                int size5 = arrayMapI.getSize();
                WindowId windowId = viewGroup2.getWindowId();
                for (i14 = size5 - 1; i14 >= 0; i14--) {
                    animatorKeyAt = arrayMapI.keyAt(i14);
                    if (animatorKeyAt == null && (cVar = arrayMapI.get(animatorKeyAt)) != null && (view = cVar.f23673a) != null && windowId.equals(cVar.f23676d)) {
                        TransitionValues transitionValues10 = transition.getTransitionValues(view, true);
                        TransitionValues transitionValuesH = transition.h(view, true);
                        if (transitionValues10 == null && transitionValuesH == null) {
                            transitionValuesH = transition.K0.f69329a.get(view);
                        }
                        if (transitionValues10 != null || transitionValuesH != null) {
                            TransitionValues transitionValues11 = cVar.f23675c;
                            Transition transition2 = cVar.f23677e;
                            if (transition2.isTransitionRequired(transitionValues11, transitionValuesH)) {
                                if (transition2.getRootTransition().f23661d1 != null) {
                                    animatorKeyAt.cancel();
                                    ArrayList<Animator> arrayList5 = transition2.R0;
                                    arrayList5.remove(animatorKeyAt);
                                    arrayMapI.remove(animatorKeyAt);
                                    if (arrayList5.size() == 0) {
                                        transition2.l(transition2, Transition.g.B0, false);
                                        if (!transition2.V0) {
                                            transition2.V0 = true;
                                            transition2.l(transition2, Transition.g.A0, false);
                                        }
                                    }
                                } else if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                                    animatorKeyAt.cancel();
                                } else {
                                    arrayMapI.remove(animatorKeyAt);
                                }
                            }
                        }
                    }
                }
                transition.f(viewGroup2, transition.J0, transition.K0, transition.N0, transition.O0);
                if (transition.f23661d1 == null) {
                    transition.runAnimators();
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    return true;
                }
                transition.m();
                Transition.f fVar2 = transition.f23661d1;
                Transition transition3 = fVar2.f23688j;
                long j10 = transition3.f23660c1 == 0 ? 1L : 0L;
                transition3.o(j10, fVar2.f23679a);
                fVar2.f23679a = j10;
                fVar = transition.f23661d1;
                fVar.f23682d = true;
                arrayList2 = fVar.f23680b;
                if (arrayList2 != null) {
                    fVar.f23680b = null;
                    for (i15 = 0; i15 < arrayList2.size(); i15++) {
                        arrayList2.get(i15).accept(fVar);
                    }
                }
                fVar.a();
                return true;
            }
            arrayList4 = new ArrayList<>();
            arrayMapB.put(viewGroup2, arrayList4);
            transition = this.f23698p0;
            arrayList4.add(transition);
            transition.addListener(new C0105a(arrayMapB));
            i10 = 0;
            transition.d(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup2);
                }
            }
            transition.N0 = new ArrayList<>();
            transition.O0 = new ArrayList<>();
            oVar = transition.J0;
            oVar2 = transition.K0;
            arrayMap = new ArrayMap(oVar.f69329a);
            arrayMap2 = new ArrayMap(oVar2.f69329a);
            i11 = 0;
            while (true) {
                iArr = transition.M0;
                if (i11 < iArr.length) {
                    break;
                    break;
                }
                i16 = iArr[i11];
                if (i16 != i20) {
                    while (size >= 0) {
                        view2 = (View) arrayMap.keyAt(size);
                        if (view2 == null) {
                        }
                    }
                } else if (i16 != 2) {
                    arrayMap3 = oVar.f69332d;
                    ArrayMap<String, View> arrayMap5 = oVar2.f69332d;
                    size2 = arrayMap3.getSize();
                    while (i17 < size2) {
                        viewValueAt = arrayMap3.valueAt(i17);
                        if (viewValueAt == null) {
                        }
                    }
                } else if (i16 != 3) {
                    sparseArray = oVar.f69330b;
                    SparseArray<View> sparseArray3 = oVar2.f69330b;
                    size3 = sparseArray.size();
                    while (i18 < size3) {
                        viewValueAt2 = sparseArray.valueAt(i18);
                        if (viewValueAt2 == null) {
                        }
                    }
                } else if (i16 != 4) {
                    longSparseArray = oVar.f69331c;
                    size4 = longSparseArray.size();
                    while (i19 < size4) {
                        viewValueAt3 = longSparseArray.valueAt(i19);
                        if (viewValueAt3 == null) {
                        }
                    }
                }
                i11++;
                i10 = 0;
                i20 = 1;
            }
            while (i12 < arrayMap.getSize()) {
                transitionValues2 = (TransitionValues) arrayMap.valueAt(i12);
                if (transition.k(transitionValues2.view)) {
                    transition.N0.add(transitionValues2);
                    transition.O0.add(null);
                }
            }
            while (i13 < arrayMap2.getSize()) {
                transitionValues = (TransitionValues) arrayMap2.valueAt(i13);
                if (transition.k(transitionValues.view)) {
                    transition.O0.add(transitionValues);
                    transition.N0.add(null);
                }
            }
            arrayMapI = Transition.i();
            int size6 = arrayMapI.getSize();
            WindowId windowId2 = viewGroup2.getWindowId();
            while (i14 >= 0) {
                animatorKeyAt = arrayMapI.keyAt(i14);
                if (animatorKeyAt == null) {
                }
            }
            transition.f(viewGroup2, transition.J0, transition.K0, transition.N0, transition.O0);
            if (transition.f23661d1 == null) {
                transition.runAnimators();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            transition.m();
            Transition.f fVar3 = transition.f23661d1;
            Transition transition4 = fVar3.f23688j;
            if (transition4.f23660c1 == 0) {
            }
            transition4.o(j10, fVar3.f23679a);
            fVar3.f23679a = j10;
            fVar = transition.f23661d1;
            fVar.f23682d = true;
            arrayList2 = fVar.f23680b;
            if (arrayList2 != null) {
                fVar.f23680b = null;
                while (i15 < arrayList2.size()) {
                    arrayList2.get(i15).accept(fVar);
                }
            }
            fVar.a();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f23699q0;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = TransitionManager.f23695e;
            ViewGroup viewGroup2 = this.f23699q0;
            arrayList.remove(viewGroup2);
            ArrayList<Transition> arrayList2 = TransitionManager.b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<Transition> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup2);
                }
            }
            this.f23698p0.e(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
