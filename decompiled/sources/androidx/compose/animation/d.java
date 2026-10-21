package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,862:1\n63#2,5:863\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4$1\n*L\n772#1:863,5\n*E\n"})
public final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<Object> f3213p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f3214q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f3215r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SnapshotStateList<Object> snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl) {
        super(1);
        this.f3213p0 = snapshotStateList;
        this.f3214q0 = obj;
        this.f3215r0 = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Object obj = this.f3214q0;
        final AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f3215r0;
        final SnapshotStateList<Object> snapshotStateList = this.f3213p0;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SnapshotStateList snapshotStateList2 = snapshotStateList;
                Object obj2 = obj;
                snapshotStateList2.remove(obj2);
                animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().remove(obj2);
            }
        };
    }
}
