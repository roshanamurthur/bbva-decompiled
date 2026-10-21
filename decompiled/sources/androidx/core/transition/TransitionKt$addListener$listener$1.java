package androidx.core.transition;

import android.transition.Transition;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", ConstantsKt.TRANSITION_EXTRA_ID, "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,86:1\n*E\n"})
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<Transition, Unit> f20153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Transition, Unit> f20154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Transition, Unit> f20155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Transition, Unit> f20156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Transition, Unit> f20157e;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function2, Function1<? super Transition, Unit> function3, Function1<? super Transition, Unit> function4, Function1<? super Transition, Unit> function5) {
        this.f20153a = function1;
        this.f20154b = function2;
        this.f20155c = function3;
        this.f20156d = function4;
        this.f20157e = function5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(@NotNull Transition transition) {
        this.f20156d.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(@NotNull Transition transition) {
        this.f20153a.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(@NotNull Transition transition) {
        this.f20155c.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(@NotNull Transition transition) {
        this.f20154b.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(@NotNull Transition transition) {
        this.f20157e.invoke(transition);
    }
}
