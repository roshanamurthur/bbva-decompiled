package androidx.compose.foundation;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import t.k0;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,454:1\n486#2,4:455\n490#2,2:463\n494#2:469\n25#3:459\n1097#4,3:460\n1100#4,3:466\n486#5:465\n76#6:470\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n*L\n269#1:455,4\n269#1:463,2\n269#1:469\n269#1:459\n269#1:460,3\n269#1:466,3\n269#1:465\n302#1:470\n*E\n"})
public final class q extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f5570p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f5571q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f5572r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f5573s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f5574t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, boolean z12) {
        super(3);
        this.f5570p0 = z10;
        this.f5571q0 = z11;
        this.f5572r0 = scrollState;
        this.f5573s0 = z12;
        this.f5574t0 = flingBehavior;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifier, "$this$composed", composer2, 1478351300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1478351300, iA, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:266)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer2, 6);
        composer2.startReplaceableGroup(773894976);
        composer2.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer2.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
        }
        composer2.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer2.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, new k0(this.f5571q0, this.f5570p0, this.f5573s0, this.f5572r0, coroutineScope), 1, null);
        boolean z10 = this.f5570p0;
        Orientation orientation = z10 ? Orientation.Vertical : Orientation.Horizontal;
        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean z11 = this.f5571q0;
        boolean zReverseDirection = scrollableDefaults.reverseDirection(layoutDirection, orientation, z11);
        ScrollState scrollState = this.f5572r0;
        Modifier modifierThen = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifierSemantics$default, orientation), overscrollEffect).then(ScrollableKt.scrollable(companion, this.f5572r0, orientation, overscrollEffect, this.f5573s0, zReverseDirection, this.f5574t0, scrollState.getInternalInteractionSource())).then(new ScrollingLayoutElement(scrollState, z11, z10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierThen;
    }
}
