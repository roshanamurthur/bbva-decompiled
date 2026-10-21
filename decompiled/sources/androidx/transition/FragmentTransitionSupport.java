package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import h3.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f23622a;

        public a(Rect rect) {
            this.f23622a = rect;
        }

        @Override // androidx.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(@NonNull Transition transition) {
            return this.f23622a;
        }
    }

    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23624b;

        public b(View view, ArrayList arrayList) {
            this.f23623a = view;
            this.f23624b = arrayList;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
            this.f23623a.setVisibility(8);
            ArrayList arrayList = this.f23624b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
        }
    }

    public class c extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f23625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f23627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f23629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23630f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f23625a = obj;
            this.f23626b = arrayList;
            this.f23627c = obj2;
            this.f23628d = arrayList2;
            this.f23629e = obj3;
            this.f23630f = arrayList3;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            FragmentTransitionSupport fragmentTransitionSupport = FragmentTransitionSupport.this;
            Object obj = this.f23625a;
            if (obj != null) {
                fragmentTransitionSupport.replaceTargets(obj, this.f23626b, null);
            }
            Object obj2 = this.f23627c;
            if (obj2 != null) {
                fragmentTransitionSupport.replaceTargets(obj2, this.f23628d, null);
            }
            Object obj3 = this.f23629e;
            if (obj3 != null) {
                fragmentTransitionSupport.replaceTargets(obj3, this.f23630f, null);
            }
        }
    }

    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f23632a;

        public d(Runnable runnable) {
            this.f23632a = runnable;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            this.f23632a.run();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
        }
    }

    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f23633a;

        public e(Rect rect) {
            this.f23633a = rect;
        }

        @Override // androidx.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(@NonNull Transition transition) {
            Rect rect = this.f23633a;
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
    public void addTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
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

    public void animateToEnd(@NonNull Object obj) {
        ((TransitionSeekController) obj).animateToEnd();
    }

    public void animateToStart(@NonNull Object obj, @NonNull Runnable runnable) {
        ((TransitionSeekController) obj).animateToStart(runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object cloneTransition(@Nullable Object obj) {
        if (obj != null) {
            return ((Transition) obj).mo4643clone();
        }
        return null;
    }

    @Nullable
    public Object controlDelayedTransition(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return TransitionManager.controlDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object mergeTransitionsInSequence(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
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
    @NonNull
    public Object mergeTransitionsTogether(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
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
    public void removeTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
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
        if (a(transition)) {
            return;
        }
        List<View> targets = transition.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                transition.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList<View> arrayList, @Nullable Object obj3, @Nullable ArrayList<View> arrayList2, @Nullable Object obj4, @Nullable ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void setCurrentPlayTime(@NonNull Object obj, float f6) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long durationMillis = (long) (f6 * transitionSeekController.getDurationMillis());
            if (durationMillis == 0) {
                durationMillis = 1;
            }
            if (durationMillis == transitionSeekController.getDurationMillis()) {
                durationMillis = transitionSeekController.getDurationMillis() - 1;
            }
            transitionSeekController.setCurrentPlayTimeMillis(durationMillis);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @Nullable View view) {
        if (view != null) {
            Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull Runnable runnable) {
        setListenerForTransitionEnd(fragment, obj, cancellationSignal, null, runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
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
    public void swapSharedElementTargets(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object wrapTransitionInSet(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public boolean isSeekingSupported(@NonNull Object obj) {
        boolean zIsSeekingSupported = ((Transition) obj).isSeekingSupported();
        if (!zIsSeekingSupported) {
            Objects.toString(obj);
        }
        return zIsSeekingSupported;
    }

    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @Nullable final Runnable runnable, @NonNull final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: h3.c
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    transition.cancel();
                    runnable2.run();
                }
            }
        });
        transition.addListener(new d(runnable2));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }
}
