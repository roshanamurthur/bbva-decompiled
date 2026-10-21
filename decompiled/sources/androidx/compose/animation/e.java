package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,862:1\n25#2:863\n1097#3,6:864\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4\n*L\n779#1:863\n779#1:864,6\n*E\n"})
public final class e extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f3216p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f3217q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<Object> f3218r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function4<AnimatedContentScope, Object, Composer, Integer, Unit> f3219s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f3220t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl, Object obj, SnapshotStateList<Object> snapshotStateList, Function4<? super AnimatedContentScope, Object, ? super Composer, ? super Integer, Unit> function4, int i10) {
        super(3);
        this.f3216p0 = animatedContentTransitionScopeImpl;
        this.f3217q0 = obj;
        this.f3218r0 = snapshotStateList;
        this.f3219s0 = function4;
        this.f3220t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(AnimatedVisibility) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894897681, iIntValue, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:768)");
            }
            SnapshotStateList<Object> snapshotStateList = this.f3218r0;
            Object obj = this.f3217q0;
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f3216p0;
            EffectsKt.DisposableEffect(AnimatedVisibility, new d(snapshotStateList, obj, animatedContentTransitionScopeImpl), composer2, iIntValue & 14);
            animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().put(obj, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize$animation_release());
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new r.a(AnimatedVisibility);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            this.f3219s0.invoke((r.a) objRememberedValue, obj, composer2, Integer.valueOf((this.f3220t0 >> 9) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
