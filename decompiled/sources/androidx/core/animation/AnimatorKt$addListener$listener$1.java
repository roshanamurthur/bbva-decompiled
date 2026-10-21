package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,137:1\n*E\n"})
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<Animator, Unit> f19847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Animator, Unit> f19848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Animator, Unit> f19849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Animator, Unit> f19850d;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
        this.f19847a = function1;
        this.f19848b = function2;
        this.f19849c = function3;
        this.f19850d = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animator) {
        this.f19849c.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animator) {
        this.f19848b.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animator) {
        this.f19847a.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animator) {
        this.f19850d.invoke(animator);
    }
}
