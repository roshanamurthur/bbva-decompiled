package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b0 {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21693a;

        static {
            int[] iArr = new int[b0.e.c.values().length];
            f21693a = iArr;
            try {
                iArr[b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21693a[b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21693a[b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21693a[b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class b extends C0084c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public o.a f21696e;

        /* JADX WARN: Code duplicated, block: B:74:0x00ee A[Catch: RuntimeException -> 0x00f4, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00f4, blocks: (B:72:0x00e8, B:74:0x00ee), top: B:85:0x00e8 }] */
        @Nullable
        public final o.a c(@NonNull Context context) {
            int enterAnim;
            o.a aVar;
            Animator animatorLoadAnimator;
            int iA;
            if (this.f21695d) {
                return this.f21696e;
            }
            b0.e eVar = this.f21697a;
            Fragment fragment = eVar.f21687c;
            boolean z10 = eVar.f21685a == b0.e.c.VISIBLE;
            int nextTransition = fragment.getNextTransition();
            if (this.f21694c) {
                enterAnim = z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            o.a aVar2 = null;
            if (viewGroup != null) {
                int i10 = R.id.visible_removing_fragment_view_tag;
                if (viewGroup.getTag(i10) != null) {
                    fragment.mContainer.setTag(i10, null);
                }
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new o.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new o.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z10 ? o.a(context, android.R.attr.activityCloseEnterAnimation) : o.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z10 ? o.a(context, android.R.attr.activityOpenEnterAnimation) : o.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new o.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    }
                                } catch (Resources.NotFoundException e5) {
                                    throw e5;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new o.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e7) {
                                        if (zEquals) {
                                            throw e7;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new o.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new o.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                }
                            }
                        }
                    }
                }
            }
            this.f21696e = aVar2;
            this.f21695d = true;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class C0084c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final b0.e f21697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final CancellationSignal f21698b;

        public C0084c(@NonNull b0.e eVar, @NonNull CancellationSignal cancellationSignal) {
            this.f21697a = eVar;
            this.f21698b = cancellationSignal;
        }

        public final void a() {
            b0.e eVar = this.f21697a;
            HashSet<CancellationSignal> hashSet = eVar.f21689e;
            if (hashSet.remove(this.f21698b) && hashSet.isEmpty()) {
                eVar.b();
            }
        }

        public final boolean b() {
            b0.e.c cVar;
            b0.e eVar = this.f21697a;
            b0.e.c cVarC = b0.e.c.c(eVar.f21687c.mView);
            b0.e.c cVar2 = eVar.f21685a;
            return cVarC == cVar2 || !(cVarC == (cVar = b0.e.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class d extends C0084c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Object f21699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f21701e;

        public d(@NonNull b0.e eVar, @NonNull CancellationSignal cancellationSignal, boolean z10, boolean z11) {
            super(eVar, cancellationSignal);
            b0.e.c cVar = eVar.f21685a;
            b0.e.c cVar2 = b0.e.c.VISIBLE;
            Fragment fragment = eVar.f21687c;
            if (cVar == cVar2) {
                this.f21699c = z10 ? fragment.getReenterTransition() : fragment.getEnterTransition();
                this.f21700d = z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
            } else {
                this.f21699c = z10 ? fragment.getReturnTransition() : fragment.getExitTransition();
                this.f21700d = true;
            }
            if (!z11) {
                this.f21701e = null;
            } else if (z10) {
                this.f21701e = fragment.getSharedElementReturnTransition();
            } else {
                this.f21701e = fragment.getSharedElementEnterTransition();
            }
        }

        @Nullable
        public final FragmentTransitionImpl c(Object obj) {
            if (obj == null) {
                return null;
            }
            x xVar = w.f21780a;
            if (xVar != null && (obj instanceof Transition)) {
                return xVar;
            }
            FragmentTransitionImpl fragmentTransitionImpl = w.f21781b;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f21697a.f21687c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void j(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                j(childAt, arrayList);
            }
        }
    }

    public static void k(ArrayMap arrayMap, @NonNull View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            arrayMap.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(arrayMap, childAt);
                }
            }
        }
    }

    public static void l(@NonNull ArrayMap arrayMap, @NonNull Collection collection) {
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:198:0x050f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0514  */
    /* JADX WARN: Code duplicated, block: B:202:0x051a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0528  */
    /* JADX WARN: Code duplicated, block: B:206:0x052f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0697  */
    /* JADX WARN: Code duplicated, block: B:279:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:283:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:287:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:290:0x070d  */
    /* JADX WARN: Code duplicated, block: B:295:0x072b  */
    /* JADX WARN: Code duplicated, block: B:299:0x073e  */
    /* JADX WARN: Code duplicated, block: B:305:0x074e  */
    /* JADX WARN: Code duplicated, block: B:309:0x076f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0776  */
    /* JADX WARN: Code duplicated, block: B:312:0x0790  */
    /* JADX WARN: Code duplicated, block: B:317:0x07a8 A[LOOP:6: B:315:0x07a2->B:317:0x07a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:320:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:351:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x06b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x06b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x06ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0745 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.b0
    public final void b(@NonNull ArrayList arrayList, boolean z10) {
        ArrayList<b> arrayList2;
        ArrayList arrayList3;
        b0.e eVar;
        boolean z11;
        b0.e eVar2;
        b0.e eVar3;
        Object obj;
        View view;
        View view2;
        View view3;
        ArrayList arrayList4;
        View view4;
        Rect rect;
        ArrayList arrayList5;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList6;
        ArrayList<String> arrayList7;
        Object obj2;
        int i10;
        View view5;
        ArrayList<String> arrayList8;
        String str;
        String str2;
        ArrayList<String> arrayList9;
        boolean zContainsValue;
        Context context;
        ArrayList<b> arrayList10;
        boolean z12;
        b0.e eVar4;
        Fragment fragment;
        View view6;
        Animation animation;
        o.a aVarC;
        Animator animator;
        b0.e eVar5;
        Fragment fragment2;
        boolean z13;
        ArrayList arrayList11;
        Iterator it = arrayList.iterator();
        b0.e eVar6 = null;
        b0.e eVar7 = null;
        while (it.hasNext()) {
            b0.e eVar8 = (b0.e) it.next();
            b0.e.c cVarC = b0.e.c.c(eVar8.f21687c.mView);
            int i11 = a.f21693a[eVar8.f21685a.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                if (cVarC == b0.e.c.VISIBLE && eVar6 == null) {
                    eVar6 = eVar8;
                }
            } else if (i11 == 4 && cVarC != b0.e.c.VISIBLE) {
                eVar7 = eVar8;
            }
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(eVar6);
            Objects.toString(eVar7);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList<d> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z14 = false;
            if (!it2.hasNext()) {
                break;
            }
            b0.e eVar9 = (b0.e) it2.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            eVar9.d();
            HashSet<CancellationSignal> hashSet = eVar9.f21689e;
            hashSet.add(cancellationSignal);
            b bVar = new b(eVar9, cancellationSignal);
            bVar.f21695d = false;
            bVar.f21694c = z10;
            arrayList12.add(bVar);
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            eVar9.d();
            hashSet.add(cancellationSignal2);
            if (z10) {
                if (eVar9 == eVar6) {
                    z14 = true;
                }
            } else if (eVar9 == eVar7) {
                z14 = true;
            }
            arrayList13.add(new d(eVar9, cancellationSignal2, z10, z14));
            eVar9.f21688d.add(new androidx.fragment.app.d(this, arrayList14, eVar9));
        }
        HashMap map = new HashMap();
        Iterator it3 = arrayList13.iterator();
        FragmentTransitionImpl fragmentTransitionImpl = null;
        while (it3.hasNext()) {
            d dVar = (d) it3.next();
            if (!dVar.b()) {
                Object obj3 = dVar.f21699c;
                FragmentTransitionImpl fragmentTransitionImplC = dVar.c(obj3);
                Object obj4 = dVar.f21701e;
                FragmentTransitionImpl fragmentTransitionImplC2 = dVar.c(obj4);
                Iterator it4 = it3;
                b0.e eVar10 = dVar.f21697a;
                if (fragmentTransitionImplC != null && fragmentTransitionImplC2 != null && fragmentTransitionImplC != fragmentTransitionImplC2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + eVar10.f21687c + " returned Transition " + obj3 + " which uses a different Transition  type than its shared element transition " + obj4);
                }
                if (fragmentTransitionImplC == null) {
                    fragmentTransitionImplC = fragmentTransitionImplC2;
                }
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = fragmentTransitionImplC;
                } else if (fragmentTransitionImplC != null && fragmentTransitionImpl != fragmentTransitionImplC) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + eVar10.f21687c + " returned Transition " + obj3 + " which uses a different Transition  type than other Fragments.");
                }
                it3 = it4;
            }
        }
        ViewGroup viewGroup = this.f21673a;
        if (fragmentTransitionImpl != null) {
            View view7 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList15 = new ArrayList<>();
            ArrayList<View> arrayList16 = new ArrayList<>();
            ArrayMap arrayMap = new ArrayMap();
            Iterator it5 = arrayList13.iterator();
            arrayList2 = arrayList12;
            View view8 = null;
            Object obj5 = null;
            boolean z15 = false;
            while (it5.hasNext()) {
                Iterator it6 = it5;
                Object obj6 = ((d) it5.next()).f21701e;
                if (obj6 == null || eVar6 == null || eVar7 == null) {
                    view3 = view8;
                    arrayList4 = arrayList13;
                    view4 = view7;
                    rect = rect2;
                    arrayList5 = arrayList14;
                } else {
                    Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(obj6));
                    Fragment fragment3 = eVar7.f21687c;
                    view3 = view8;
                    ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                    arrayList5 = arrayList14;
                    Fragment fragment4 = eVar6.f21687c;
                    arrayList4 = arrayList13;
                    ArrayList<String> sharedElementSourceNames2 = fragment4.getSharedElementSourceNames();
                    HashMap map2 = map;
                    ArrayList<String> sharedElementTargetNames = fragment4.getSharedElementTargetNames();
                    View view9 = view7;
                    Rect rect3 = rect2;
                    int i12 = 0;
                    while (i12 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                        ArrayList<String> arrayList17 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                        }
                        i12++;
                        sharedElementTargetNames = arrayList17;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                    if (z10) {
                        enterTransitionCallback = fragment4.getEnterTransitionCallback();
                        exitTransitionCallback = fragment3.getExitTransitionCallback();
                    } else {
                        enterTransitionCallback = fragment4.getExitTransitionCallback();
                        exitTransitionCallback = fragment3.getEnterTransitionCallback();
                    }
                    int size = sharedElementSourceNames.size();
                    int i13 = 0;
                    while (i13 < size) {
                        arrayMap.put(sharedElementSourceNames.get(i13), sharedElementTargetNames2.get(i13));
                        i13++;
                        size = size;
                        fragmentTransitionImpl = fragmentTransitionImpl;
                    }
                    FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        for (String str3 : sharedElementTargetNames2) {
                        }
                        for (String str4 : sharedElementSourceNames) {
                        }
                    }
                    ArrayMap arrayMap2 = new ArrayMap();
                    k(arrayMap2, fragment4.mView);
                    arrayMap2.retainAll(sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            eVar6.toString();
                        }
                        enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str5 = sharedElementSourceNames.get(size2);
                            View view10 = (View) arrayMap2.get(str5);
                            if (view10 == null) {
                                arrayMap.remove(str5);
                                arrayList9 = sharedElementSourceNames;
                            } else {
                                arrayList9 = sharedElementSourceNames;
                                if (!str5.equals(ViewCompat.getTransitionName(view10))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view10), (String) arrayMap.remove(str5));
                                }
                            }
                            size2--;
                            sharedElementSourceNames = arrayList9;
                        }
                        arrayList6 = sharedElementSourceNames;
                    } else {
                        arrayList6 = sharedElementSourceNames;
                        arrayMap.retainAll(arrayMap2.keySet());
                    }
                    ArrayMap arrayMap3 = new ArrayMap();
                    k(arrayMap3, fragment3.mView);
                    arrayMap3.retainAll(sharedElementTargetNames2);
                    arrayMap3.retainAll(arrayMap.values());
                    if (exitTransitionCallback != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            eVar7.toString();
                        }
                        exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                        int size3 = sharedElementTargetNames2.size() - 1;
                        while (size3 >= 0) {
                            String str6 = sharedElementTargetNames2.get(size3);
                            View view11 = (View) arrayMap3.get(str6);
                            if (view11 == null) {
                                x xVar = w.f21780a;
                                int size4 = arrayMap.getSize();
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= size4) {
                                        str2 = null;
                                        break;
                                    }
                                    int i15 = size4;
                                    if (str6.equals(arrayMap.valueAt(i14))) {
                                        str2 = (String) arrayMap.keyAt(i14);
                                        break;
                                    } else {
                                        i14++;
                                        size4 = i15;
                                    }
                                }
                                if (str2 != null) {
                                    arrayMap.remove(str2);
                                }
                            } else {
                                if (!str6.equals(ViewCompat.getTransitionName(view11))) {
                                    x xVar2 = w.f21780a;
                                    int size5 = arrayMap.getSize();
                                    arrayList8 = sharedElementTargetNames2;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= size5) {
                                            str = null;
                                            break;
                                        }
                                        int i17 = size5;
                                        if (str6.equals(arrayMap.valueAt(i16))) {
                                            str = (String) arrayMap.keyAt(i16);
                                            break;
                                        } else {
                                            i16++;
                                            size5 = i17;
                                        }
                                    }
                                    if (str != null) {
                                        arrayMap.put(str, ViewCompat.getTransitionName(view11));
                                    }
                                }
                                size3--;
                                sharedElementTargetNames2 = arrayList8;
                            }
                            arrayList8 = sharedElementTargetNames2;
                            size3--;
                            sharedElementTargetNames2 = arrayList8;
                        }
                        arrayList7 = sharedElementTargetNames2;
                    } else {
                        arrayList7 = sharedElementTargetNames2;
                        x xVar3 = w.f21780a;
                        for (int size6 = arrayMap.getSize() - 1; size6 >= 0; size6--) {
                            if (!arrayMap3.containsKey((String) arrayMap.valueAt(size6))) {
                                arrayMap.removeAt(size6);
                            }
                        }
                    }
                    l(arrayMap2, arrayMap.keySet());
                    l(arrayMap3, arrayMap.values());
                    if (arrayMap.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        map = map2;
                        view4 = view9;
                        rect = rect3;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        obj5 = null;
                    } else {
                        w.a(fragment3, fragment4, z10, arrayMap2, true);
                        OneShotPreDrawListener.add(viewGroup, new i(eVar7, eVar6, z10, arrayMap3));
                        arrayList15.addAll(arrayMap2.values());
                        if (arrayList6.isEmpty()) {
                            obj2 = objWrapTransitionInSet;
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            View view12 = (View) arrayMap2.get(arrayList6.get(0));
                            obj2 = objWrapTransitionInSet;
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                            fragmentTransitionImpl.setEpicenter(obj2, view12);
                            view3 = view12;
                        }
                        arrayList16.addAll(arrayMap3.values());
                        if (arrayList7.isEmpty() || (view5 = (View) arrayMap3.get((String) arrayList7.get(i10))) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            OneShotPreDrawListener.add(viewGroup, new j(fragmentTransitionImpl, view5, rect));
                            z15 = true;
                        }
                        view4 = view9;
                        fragmentTransitionImpl.setSharedElementTargets(obj2, view4, arrayList15);
                        fragmentTransitionImpl.scheduleRemoveTargets(obj2, null, null, null, null, obj2, arrayList16);
                        Boolean bool = Boolean.TRUE;
                        map = map2;
                        map.put(eVar6, bool);
                        map.put(eVar7, bool);
                        obj5 = obj2;
                    }
                    view7 = view4;
                    rect2 = rect;
                    it5 = it6;
                    view8 = view3;
                    arrayList14 = arrayList5;
                    arrayList13 = arrayList4;
                }
                view7 = view4;
                rect2 = rect;
                it5 = it6;
                view8 = view3;
                arrayList14 = arrayList5;
                arrayList13 = arrayList4;
            }
            View view13 = view8;
            ArrayList<d> arrayList18 = arrayList13;
            View view14 = view7;
            Rect rect4 = rect2;
            arrayList3 = arrayList14;
            ArrayList arrayList19 = new ArrayList();
            Iterator it7 = arrayList18.iterator();
            Object objMergeTransitionsTogether = null;
            Object objMergeTransitionsTogether2 = null;
            while (it7.hasNext()) {
                d dVar2 = (d) it7.next();
                boolean zB = dVar2.b();
                it7 = it7;
                b0.e eVar11 = dVar2.f21697a;
                if (zB) {
                    map.put(eVar11, Boolean.FALSE);
                    dVar2.a();
                    arrayMap = arrayMap;
                } else {
                    ArrayMap arrayMap4 = arrayMap;
                    Object objCloneTransition = fragmentTransitionImpl.cloneTransition(dVar2.f21699c);
                    boolean z16 = obj5 != null && (eVar11 == eVar6 || eVar11 == eVar7);
                    if (objCloneTransition == null) {
                        if (!z16) {
                            map.put(eVar11, Boolean.FALSE);
                            dVar2.a();
                        }
                        view = view14;
                        obj = obj5;
                        eVar3 = eVar7;
                        arrayList15 = arrayList15;
                        view2 = view13;
                    } else {
                        eVar3 = eVar7;
                        ArrayList<View> arrayList20 = new ArrayList<>();
                        obj = obj5;
                        j(eVar11.f21687c.mView, arrayList20);
                        if (z16) {
                            if (eVar11 == eVar6) {
                                arrayList20.removeAll(arrayList15);
                            } else {
                                arrayList20.removeAll(arrayList16);
                            }
                        }
                        if (arrayList20.isEmpty()) {
                            fragmentTransitionImpl.addTarget(objCloneTransition, view14);
                            view = view14;
                        } else {
                            fragmentTransitionImpl.addTargets(objCloneTransition, arrayList20);
                            fragmentTransitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList20, null, null, null, null);
                            view = view14;
                            if (eVar11.f21685a == b0.e.c.GONE) {
                                arrayList3.remove(eVar11);
                                ArrayList<View> arrayList21 = new ArrayList<>(arrayList20);
                                Fragment fragment5 = eVar11.f21687c;
                                arrayList21.remove(fragment5.mView);
                                fragmentTransitionImpl.scheduleHideFragmentView(objCloneTransition, fragment5.mView, arrayList21);
                                OneShotPreDrawListener.add(viewGroup, new k(arrayList20));
                            }
                            if (eVar11.f21685a == b0.e.c.VISIBLE) {
                                arrayList19.addAll(arrayList20);
                                if (z15) {
                                    fragmentTransitionImpl.setEpicenter(objCloneTransition, rect4);
                                }
                                view2 = view13;
                            } else {
                                view2 = view13;
                                fragmentTransitionImpl.setEpicenter(objCloneTransition, view2);
                            }
                            map.put(eVar11, Boolean.TRUE);
                            if (dVar2.f21700d) {
                                objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                            } else {
                                objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                            }
                        }
                        if (eVar11.f21685a == b0.e.c.VISIBLE) {
                            arrayList19.addAll(arrayList20);
                            if (z15) {
                                fragmentTransitionImpl.setEpicenter(objCloneTransition, rect4);
                            }
                            view2 = view13;
                        } else {
                            view2 = view13;
                            fragmentTransitionImpl.setEpicenter(objCloneTransition, view2);
                        }
                        map.put(eVar11, Boolean.TRUE);
                        if (dVar2.f21700d) {
                            objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                        } else {
                            objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                        }
                    }
                    view13 = view2;
                    view14 = view;
                    arrayList15 = arrayList15;
                    arrayMap = arrayMap4;
                    eVar7 = eVar3;
                    obj5 = obj;
                }
            }
            eVar = eVar7;
            ArrayList<View> arrayList22 = arrayList15;
            ArrayMap arrayMap5 = arrayMap;
            Object objMergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, obj5);
            if (objMergeTransitionsInSequence != null) {
                for (d dVar3 : arrayList18) {
                    if (!dVar3.b()) {
                        b0.e eVar12 = dVar3.f21697a;
                        b0.e eVar13 = eVar;
                        boolean z17 = obj5 != null && (eVar12 == eVar6 || eVar12 == eVar13);
                        if (dVar3.f21699c != null || z17) {
                            if (ViewCompat.isLaidOut(viewGroup)) {
                                fragmentTransitionImpl.setListenerForTransitionEnd(eVar12.f21687c, objMergeTransitionsInSequence, dVar3.f21698b, new l(dVar3, eVar12));
                            } else {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(viewGroup);
                                    Objects.toString(eVar12);
                                }
                                dVar3.a();
                            }
                        }
                        eVar = eVar13;
                    }
                }
                b0.e eVar14 = eVar;
                if (ViewCompat.isLaidOut(viewGroup)) {
                    w.b(arrayList19, 4);
                    ArrayList arrayList23 = new ArrayList();
                    int size7 = arrayList16.size();
                    for (int i18 = 0; i18 < size7; i18++) {
                        View view15 = arrayList16.get(i18);
                        arrayList23.add(ViewCompat.getTransitionName(view15));
                        ViewCompat.setTransitionName(view15, null);
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        for (View view16 : arrayList22) {
                            Objects.toString(view16);
                            ViewCompat.getTransitionName(view16);
                        }
                        for (View view17 : arrayList16) {
                            Objects.toString(view17);
                            ViewCompat.getTransitionName(view17);
                        }
                    }
                    fragmentTransitionImpl.beginDelayedTransition(viewGroup, objMergeTransitionsInSequence);
                    int size8 = arrayList16.size();
                    ArrayList arrayList24 = new ArrayList();
                    int i19 = 0;
                    while (i19 < size8) {
                        ArrayList<View> arrayList25 = arrayList22;
                        View view18 = arrayList25.get(i19);
                        String transitionName = ViewCompat.getTransitionName(view18);
                        arrayList24.add(transitionName);
                        if (transitionName == null) {
                            eVar2 = eVar14;
                            break;
                        }
                        ViewCompat.setTransitionName(view18, null);
                        String str7 = (String) arrayMap5.get(transitionName);
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size8) {
                                eVar2 = eVar14;
                                break;
                                break;
                            }
                            eVar2 = eVar14;
                            if (str7.equals(arrayList23.get(i20))) {
                                ViewCompat.setTransitionName(arrayList16.get(i20), transitionName);
                                break;
                            } else {
                                i20++;
                                eVar14 = eVar2;
                            }
                        }
                        i19++;
                        arrayList22 = arrayList25;
                        eVar14 = eVar2;
                    }
                    eVar = eVar14;
                    ArrayList<View> arrayList26 = arrayList22;
                    OneShotPreDrawListener.add(viewGroup, new y(size8, arrayList16, arrayList23, arrayList26, arrayList24));
                    z11 = false;
                    w.b(arrayList19, 0);
                    fragmentTransitionImpl.swapSharedElementTargets(obj5, arrayList26, arrayList16);
                } else {
                    eVar = eVar14;
                }
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            context = viewGroup.getContext();
            arrayList10 = new ArrayList();
            z12 = z11;
            for (b bVar2 : arrayList2) {
                if (bVar2.b()) {
                    bVar2.a();
                } else {
                    aVarC = bVar2.c(context);
                    if (aVarC == null) {
                        bVar2.a();
                    } else {
                        animator = aVarC.f21734b;
                        if (animator == null) {
                            arrayList10.add(bVar2);
                        } else {
                            eVar5 = bVar2.f21697a;
                            fragment2 = eVar5.f21687c;
                            if (Boolean.TRUE.equals(map.get(eVar5))) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Objects.toString(fragment2);
                                }
                                bVar2.a();
                            } else {
                                if (eVar5.f21685a == b0.e.c.GONE) {
                                    z13 = true;
                                } else {
                                    z13 = z11;
                                }
                                arrayList11 = arrayList3;
                                if (z13) {
                                    arrayList11.remove(eVar5);
                                }
                                View view19 = fragment2.mView;
                                viewGroup.startViewTransition(view19);
                                animator.addListener(new e(viewGroup, view19, z13, eVar5, bVar2));
                                animator.setTarget(view19);
                                animator.start();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    eVar5.toString();
                                }
                                bVar2.f21698b.setOnCancelListener(new f(animator, eVar5));
                                arrayList3 = arrayList11;
                                z12 = true;
                            }
                        }
                    }
                }
            }
            ArrayList<b0.e> arrayList27 = arrayList3;
            for (b bVar3 : arrayList10) {
                eVar4 = bVar3.f21697a;
                fragment = eVar4.f21687c;
                if (zContainsValue) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(fragment);
                    }
                    bVar3.a();
                } else if (z12) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(fragment);
                    }
                    bVar3.a();
                } else {
                    view6 = fragment.mView;
                    animation = (Animation) Preconditions.checkNotNull(((o.a) Preconditions.checkNotNull(bVar3.c(context))).f21733a);
                    if (eVar4.f21685a != b0.e.c.REMOVED) {
                        view6.startAnimation(animation);
                        bVar3.a();
                    } else {
                        viewGroup.startViewTransition(view6);
                        o.b bVar4 = new o.b(animation, viewGroup, view6);
                        bVar4.setAnimationListener(new g(view6, viewGroup, bVar3, eVar4));
                        view6.startAnimation(bVar4);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            eVar4.toString();
                        }
                    }
                    bVar3.f21698b.setOnCancelListener(new h(view6, viewGroup, bVar3, eVar4));
                }
            }
            for (b0.e eVar15 : arrayList27) {
                eVar15.f21685a.a(eVar15.f21687c.mView);
            }
            arrayList27.clear();
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(eVar6);
                Objects.toString(eVar);
            }
        }
        for (d dVar4 : arrayList13) {
            map.put(dVar4.f21697a, Boolean.FALSE);
            dVar4.a();
        }
        arrayList2 = arrayList12;
        eVar = eVar7;
        arrayList3 = arrayList14;
        z11 = false;
        zContainsValue = map.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList10 = new ArrayList();
        z12 = z11;
        while (r5.hasNext()) {
            if (bVar2.b()) {
                bVar2.a();
            } else {
                aVarC = bVar2.c(context);
                if (aVarC == null) {
                    bVar2.a();
                } else {
                    animator = aVarC.f21734b;
                    if (animator == null) {
                        arrayList10.add(bVar2);
                    } else {
                        eVar5 = bVar2.f21697a;
                        fragment2 = eVar5.f21687c;
                        if (Boolean.TRUE.equals(map.get(eVar5))) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Objects.toString(fragment2);
                            }
                            bVar2.a();
                        } else {
                            if (eVar5.f21685a == b0.e.c.GONE) {
                                z13 = true;
                            } else {
                                z13 = z11;
                            }
                            arrayList11 = arrayList3;
                            if (z13) {
                                arrayList11.remove(eVar5);
                            }
                            View view110 = fragment2.mView;
                            viewGroup.startViewTransition(view110);
                            animator.addListener(new e(viewGroup, view110, z13, eVar5, bVar2));
                            animator.setTarget(view110);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                eVar5.toString();
                            }
                            bVar2.f21698b.setOnCancelListener(new f(animator, eVar5));
                            arrayList3 = arrayList11;
                            z12 = true;
                        }
                    }
                }
            }
        }
        ArrayList<b0.e> arrayList28 = arrayList3;
        while (r2.hasNext()) {
            eVar4 = bVar3.f21697a;
            fragment = eVar4.f21687c;
            if (zContainsValue) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                }
                bVar3.a();
            } else if (z12) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                }
                bVar3.a();
            } else {
                view6 = fragment.mView;
                animation = (Animation) Preconditions.checkNotNull(((o.a) Preconditions.checkNotNull(bVar3.c(context))).f21733a);
                if (eVar4.f21685a != b0.e.c.REMOVED) {
                    view6.startAnimation(animation);
                    bVar3.a();
                } else {
                    viewGroup.startViewTransition(view6);
                    o.b bVar5 = new o.b(animation, viewGroup, view6);
                    bVar5.setAnimationListener(new g(view6, viewGroup, bVar3, eVar4));
                    view6.startAnimation(bVar5);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        eVar4.toString();
                    }
                }
                bVar3.f21698b.setOnCancelListener(new h(view6, viewGroup, bVar3, eVar4));
            }
        }
        while (r0.hasNext()) {
            eVar15.f21685a.a(eVar15.f21687c.mView);
        }
        arrayList28.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(eVar6);
            Objects.toString(eVar);
        }
    }
}
