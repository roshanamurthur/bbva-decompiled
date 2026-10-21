package androidx.compose.material;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,522:1\n66#2,6:523\n72#2:557\n76#2:562\n78#3,11:529\n91#3:561\n456#4,8:540\n464#4,3:554\n467#4,3:558\n4144#5,6:548\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1$1$2\n*L\n352#1:523,6\n352#1:557\n352#1:562\n352#1:529,11\n352#1:561\n352#1:540,8\n352#1:554,3\n352#1:558,3\n352#1:548,6\n*E\n"})
public final class l extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f8813p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8814q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f8815r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f8816s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f8817t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f8818u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8819w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(float f6, Function2<? super Composer, ? super Integer, Unit> function2, int i10, long j10, BackdropScaffoldState backdropScaffoldState, int i11, boolean z10, CoroutineScope coroutineScope) {
        super(2);
        this.f8813p0 = f6;
        this.f8814q0 = function2;
        this.f8815r0 = i10;
        this.f8816s0 = j10;
        this.f8817t0 = backdropScaffoldState;
        this.f8818u0 = i11;
        this.v0 = z10;
        this.f8819w0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1065299503, iIntValue, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:350)");
            }
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.f8813p0, 7, null);
            long j10 = this.f8816s0;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            this.f8814q0.invoke(composer2, Integer.valueOf((this.f8815r0 >> 6) & 14));
            CoroutineScope coroutineScope = this.f8819w0;
            boolean z10 = this.v0;
            BackdropScaffoldState backdropScaffoldState = this.f8817t0;
            BackdropScaffoldKt.m667access$Scrim3JVO9M(j10, new k(z10, backdropScaffoldState, coroutineScope), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer2, (this.f8818u0 >> 18) & 14);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
