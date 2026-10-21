package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class x extends FragmentTransitionImpl {

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f21782a;

        public a(Rect rect) {
            this.f21782a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f21782a;
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f21793a;

        public e(Rect rect) {
            this.f21793a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f21793a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean a(Transition transition) {
        return (FragmentTransitionImpl.isNullOrEmpty(transition.getTargetIds()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetNames()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTargets(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                addTargets(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (a(transition) || !FragmentTransitionImpl.isNullOrEmpty(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean canHandle(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                replaceTargets(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            FragmentTransitionImpl.bfsAddViewChildren(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f21783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f21784b;

        public b(View view, ArrayList arrayList) {
            this.f21783a = view;
            this.f21784b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f21783a.setVisibility(8);
            ArrayList arrayList = this.f21784b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f21785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f21786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f21787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f21788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f21789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f21790f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f21785a = obj;
            this.f21786b = arrayList;
            this.f21787c = obj2;
            this.f21788d = arrayList2;
            this.f21789e = obj3;
            this.f21790f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            x xVar = x.this;
            Object obj = this.f21785a;
            if (obj != null) {
                xVar.replaceTargets(obj, this.f21786b, null);
            }
            Object obj2 = this.f21787c;
            if (obj2 != null) {
                xVar.replaceTargets(obj2, this.f21788d, null);
            }
            Object obj3 = this.f21789e;
            if (obj3 != null) {
                xVar.replaceTargets(obj3, this.f21790f, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f21792a;

        public d(Runnable runnable) {
            this.f21792a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            this.f21792a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }
}
