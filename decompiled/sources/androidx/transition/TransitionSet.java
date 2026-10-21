package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.camera.core.processing.f;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import h3.k;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionSet extends Transition {
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public ArrayList<Transition> f23702j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f23703k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f23704l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f23705m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f23706n1;

    public class a extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f23707a;

        public a(Transition transition) {
            this.f23707a = transition;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            this.f23707a.runAnimators();
            transition.removeListener(this);
        }
    }

    public class b extends TransitionListenerAdapter {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            TransitionSet transitionSet = TransitionSet.this;
            transitionSet.f23702j1.remove(transition);
            if (transitionSet.j()) {
                return;
            }
            transitionSet.l(transitionSet, Transition.g.B0, false);
            transitionSet.V0 = true;
            transitionSet.l(transitionSet, Transition.g.A0, false);
        }
    }

    public static class c extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransitionSet f23709a;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f23709a;
            int i10 = transitionSet.f23704l1 - 1;
            transitionSet.f23704l1 = i10;
            if (i10 == 0) {
                transitionSet.f23705m1 = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f23709a;
            if (transitionSet.f23705m1) {
                return;
            }
            transitionSet.start();
            transitionSet.f23705m1 = true;
        }
    }

    public TransitionSet() {
        this.f23702j1 = new ArrayList<>();
        this.f23703k1 = true;
        this.f23705m1 = false;
        this.f23706n1 = 0;
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition) {
        this.f23702j1.add(transition);
        transition.L0 = this;
        long j10 = this.f23665r0;
        if (j10 >= 0) {
            transition.setDuration(j10);
        }
        if ((this.f23706n1 & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f23706n1 & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f23706n1 & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f23706n1 & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public final void c(TransitionValues transitionValues) {
        super.c(transitionValues);
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).c(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        if (k(transitionValues.view)) {
            for (Transition transition : this.f23702j1) {
                if (transition.k(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.f23710a.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        if (k(transitionValues.view)) {
            for (Transition transition : this.f23702j1) {
                if (transition.k(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.f23710a.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z10) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).excludeTarget(view, z10);
        }
        return super.excludeTarget(view, z10);
    }

    @Override // androidx.transition.Transition
    public final void f(@NonNull ViewGroup viewGroup, @NonNull o oVar, @NonNull o oVar2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = this.f23702j1.get(i10);
            if (startDelay > 0 && (this.f23703k1 || i10 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.f(viewGroup, oVar, oVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void g(ViewGroup viewGroup) {
        super.g(viewGroup);
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).g(viewGroup);
        }
    }

    public int getOrdering() {
        return !this.f23703k1 ? 1 : 0;
    }

    @Nullable
    public Transition getTransitionAt(int i10) {
        if (i10 < 0 || i10 >= this.f23702j1.size()) {
            return null;
        }
        return this.f23702j1.get(i10);
    }

    public int getTransitionCount() {
        return this.f23702j1.size();
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f23702j1.get(i10).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final boolean j() {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            if (this.f23702j1.get(i10).j()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public final void m() {
        this.f23660c1 = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            Transition transition = this.f23702j1.get(i10);
            transition.addListener(bVar);
            transition.m();
            long j10 = transition.f23660c1;
            if (this.f23703k1) {
                this.f23660c1 = Math.max(this.f23660c1, j10);
            } else {
                long j11 = this.f23660c1;
                transition.f23662e1 = j11;
                this.f23660c1 = j11 + j10;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void n() {
        this.Q0 = true;
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).n();
        }
    }

    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public final void o(long j10, long j11) {
        long j12 = this.f23660c1;
        if (this.L0 != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > j12 && j11 > j12) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= j12 && j11 > j12)) {
            this.V0 = false;
            l(this, Transition.g.f23689z0, z10);
        }
        if (this.f23703k1) {
            for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
                this.f23702j1.get(i10).o(j10, j11);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f23702j1.size()) {
                    size = this.f23702j1.size();
                    break;
                } else if (this.f23702j1.get(size).f23662e1 > j11) {
                    break;
                } else {
                    size++;
                }
            }
            int i11 = size - 1;
            if (j10 >= j11) {
                while (i11 < this.f23702j1.size()) {
                    Transition transition = this.f23702j1.get(i11);
                    long j13 = transition.f23662e1;
                    int i12 = i11;
                    long j14 = j10 - j13;
                    if (j14 < 0) {
                        break;
                    }
                    transition.o(j14, j11 - j13);
                    i11 = i12 + 1;
                }
            } else {
                while (i11 >= 0) {
                    Transition transition2 = this.f23702j1.get(i11);
                    long j15 = transition2.f23662e1;
                    long j16 = j10 - j15;
                    transition2.o(j16, j11 - j15);
                    if (j16 >= 0) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
        }
        if (this.L0 != null) {
            if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
                return;
            }
            if (j10 > j12) {
                this.V0 = true;
            }
            l(this, Transition.g.A0, z10);
        }
    }

    @Override // androidx.transition.Transition
    public final String p(String str) {
        String strP = super.p(str);
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            StringBuilder sbE = f.e(strP, RootService.LINE_BREAK);
            sbE.append(this.f23702j1.get(i10).p(str + "  "));
            strP = sbE.toString();
        }
        return strP;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        super.pause(view);
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).pause(view);
        }
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition) {
        this.f23702j1.remove(transition);
        transition.L0 = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        super.resume(view);
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f23702j1.isEmpty()) {
            start();
            end();
            return;
        }
        c cVar = new c();
        cVar.f23709a = this;
        Iterator<Transition> it = this.f23702j1.iterator();
        while (it.hasNext()) {
            it.next().addListener(cVar);
        }
        this.f23704l1 = this.f23702j1.size();
        if (this.f23703k1) {
            Iterator<Transition> it2 = this.f23702j1.iterator();
            while (it2.hasNext()) {
                it2.next().runAnimators();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10 - 1).addListener(new a(this.f23702j1.get(i10)));
        }
        Transition transition = this.f23702j1.get(0);
        if (transition != null) {
            transition.runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(@Nullable Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.f23706n1 |= 8;
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).setEpicenterCallback(epicenterCallback);
        }
    }

    @NonNull
    public TransitionSet setOrdering(int i10) {
        if (i10 == 0) {
            this.f23703k1 = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(g0.c("Invalid parameter for TransitionSet ordering: ", i10));
            }
            this.f23703k1 = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f23706n1 |= 4;
        if (this.f23702j1 != null) {
            for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
                this.f23702j1.get(i10).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.f23706n1 |= 2;
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23702j1.get(i10).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: clone */
    public Transition mo4643clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo4643clone();
        transitionSet.f23702j1 = new ArrayList<>();
        int size = this.f23702j1.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transitionMo4643clone = this.f23702j1.get(i10).mo4643clone();
            transitionSet.f23702j1.add(transitionMo4643clone);
            transitionMo4643clone.L0 = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setDuration(long j10) {
        ArrayList<Transition> arrayList;
        super.setDuration(j10);
        if (this.f23665r0 >= 0 && (arrayList = this.f23702j1) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f23702j1.get(i10).setDuration(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f23706n1 |= 1;
        ArrayList<Transition> arrayList = this.f23702j1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f23702j1.get(i10).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setStartDelay(long j10) {
        return (TransitionSet) super.setStartDelay(j10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition addTarget(@NonNull Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition removeTarget(@NonNull Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z10) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).excludeTarget(str, z10);
        }
        return super.excludeTarget(str, z10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull View view) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@IdRes int i10) {
        for (int i11 = 0; i11 < this.f23702j1.size(); i11++) {
            this.f23702j1.get(i11).removeTarget(i10);
        }
        return (TransitionSet) super.removeTarget(i10);
    }

    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23702j1 = new ArrayList<>();
        this.f23703k1 = true;
        this.f23705m1 = false;
        this.f23706n1 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69323i);
        setOrdering(TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f23702j1.size(); i11++) {
            this.f23702j1.get(i11).excludeTarget(i10, z10);
        }
        return super.excludeTarget(i10, z10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@IdRes int i10) {
        for (int i11 = 0; i11 < this.f23702j1.size(); i11++) {
            this.f23702j1.get(i11).addTarget(i10);
        }
        return (TransitionSet) super.addTarget(i10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull View view) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).excludeTarget(cls, z10);
        }
        return super.excludeTarget(cls, z10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull String str) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull String str) {
        for (int i10 = 0; i10 < this.f23702j1.size(); i10++) {
            this.f23702j1.get(i10).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
