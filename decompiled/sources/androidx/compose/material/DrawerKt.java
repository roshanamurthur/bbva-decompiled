package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\t2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0096\u0001\u0010$\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010'\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomDrawerState;", "BottomDrawerState", "Landroidx/compose/material/DrawerValue;", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", "alpha", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,956:1\n50#2:957\n49#2:958\n67#2,3:966\n66#2:969\n25#2:980\n25#2:996\n36#2:1008\n50#2:1015\n49#2:1016\n50#2:1023\n49#2:1024\n36#2:1031\n50#2:1038\n49#2:1039\n50#2:1046\n49#2:1047\n1097#3,6:959\n1097#3,6:970\n1097#3,3:981\n1100#3,3:987\n1097#3,3:997\n1100#3,3:1003\n1097#3,6:1009\n1097#3,6:1017\n1097#3,6:1025\n1097#3,6:1032\n1097#3,6:1040\n1097#3,6:1048\n76#4:965\n76#4:991\n486#5,4:976\n490#5,2:984\n494#5:990\n486#5,4:992\n490#5,2:1000\n494#5:1006\n486#6:986\n486#6:1002\n646#7:1007\n81#8:1054\n154#9:1055\n154#9:1056\n154#9:1057\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n456#1:957\n456#1:958\n474#1:966,3\n474#1:969\n522#1:980\n660#1:996\n813#1:1008\n816#1:1015\n816#1:1016\n828#1:1023\n828#1:1024\n844#1:1031\n845#1:1038\n845#1:1039\n857#1:1046\n857#1:1047\n456#1:959,6\n474#1:970,6\n522#1:981,3\n522#1:987,3\n660#1:997,3\n660#1:1003,3\n813#1:1009,6\n816#1:1017,6\n828#1:1025,6\n844#1:1032,6\n845#1:1040,6\n857#1:1048,6\n473#1:965\n655#1:991\n522#1:976,4\n522#1:984,2\n522#1:990\n660#1:992,4\n660#1:1000,2\n660#1:1006\n522#1:986\n660#1:1002\n805#1:1007\n806#1:1054\n862#1:1055\n863#1:1056\n864#1:1057\n*E\n"})
public final class DrawerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7063c = Dp.m4389constructorimpl(400);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f7064d = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BottomDrawerState f7077p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f7078q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BottomDrawerState bottomDrawerState, Density density) {
            super(0);
            this.f7077p0 = bottomDrawerState;
            this.f7078q0 = density;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f7077p0.setDensity$material_release(this.f7078q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,956:1\n76#2:957\n76#2:958\n66#3,6:959\n72#3:993\n76#3:1006\n78#4,11:965\n91#4:1005\n456#5,8:976\n464#5,3:990\n50#5:994\n49#5:995\n467#5,3:1002\n4144#6,6:984\n1097#7,6:996\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$2\n*L\n666#1:957\n678#1:958\n689#1:959,6\n689#1:993\n689#1:1006\n689#1:965,11\n689#1:1005\n689#1:976,8\n689#1:990,3\n703#1:994\n703#1:995\n689#1:1002,3\n689#1:984,6\n703#1:996,6\n*E\n"})
    public static final class b extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7079p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BottomDrawerState f7080q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7081r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7082s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7083t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f7084u0;
        public final /* synthetic */ Shape v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f7085w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f7086x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ float f7087y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, int i10, long j10, CoroutineScope coroutineScope, Shape shape, long j11, long j12, float f6, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f7079p0 = z10;
            this.f7080q0 = bottomDrawerState;
            this.f7081r0 = function2;
            this.f7082s0 = i10;
            this.f7083t0 = j10;
            this.f7084u0 = coroutineScope;
            this.v0 = shape;
            this.f7085w0 = j11;
            this.f7086x0 = j12;
            this.f7087y0 = f6;
            this.E0 = function3;
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
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i10;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1220102512, iIntValue, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:661)");
                }
                float fM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                boolean z10 = Constraints.m4357getMaxWidthimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk()) > Constraints.m4356getMaxHeightimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM339sizeInqDBjuR0$default = SizeKt.m339sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo406toDpu2uoSUM(Constraints.m4357getMaxWidthimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk())), density.mo406toDpu2uoSUM(Constraints.m4356getMaxHeightimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk())), 3, null);
                boolean z11 = this.f7079p0;
                BottomDrawerState bottomDrawerState = this.f7080q0;
                Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion.then(z11 ? NestedScrollModifierKt.nestedScroll$default(companion, bottomDrawerState.getNestedScrollConnection(), null, 2, null) : companion), bottomDrawerState.getAnchoredDraggableState$material_release(), Orientation.Vertical, this.f7079p0, composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, null, 16, null);
                long j10 = this.f7083t0;
                Shape shape = this.v0;
                long j11 = this.f7085w0;
                long j12 = this.f7086x0;
                float f6 = this.f7087y0;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i11 = this.f7082s0;
                this.f7081r0.invoke(composer2, Integer.valueOf((i11 >> 27) & 14));
                CoroutineScope coroutineScope = this.f7084u0;
                DrawerKt.m752access$BottomDrawerScrim3JVO9M(j10, new g0(z11, bottomDrawerState, coroutineScope), bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer2, (i11 >> 24) & 14);
                String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m829getNavigationMenuUdPEhr4(), composer2, 6);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(bottomDrawerState) | composer2.changed(coroutineScope);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = DrawerKt.access$BottomDrawerAnchorChangeCallback(bottomDrawerState, coroutineScope);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                int i12 = i11 >> 12;
                SurfaceKt.m834SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(modifierM339sizeInqDBjuR0$default, new h0(bottomDrawerState, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue, fM4356getMaxHeightimpl, z10)), new i0(bottomDrawerState)), false, new l0(strM832getString4foXLRw, bottomDrawerState, coroutineScope), 1, null), shape, j11, j12, null, f6, ComposableLambdaKt.composableLambda(composer2, 457750254, true, new m0(this.E0, i11)), composer2, ((i11 >> 9) & 112) | 1572864 | (i12 & 896) | (i12 & 7168) | (458752 & i11), 16);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7088p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7089q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BottomDrawerState f7090r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7091s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f7092t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f7093u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f7094w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f7095x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7096y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z10, Shape shape, float f6, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7088p0 = function3;
            this.f7089q0 = modifier;
            this.f7090r0 = bottomDrawerState;
            this.f7091s0 = z10;
            this.f7092t0 = shape;
            this.f7093u0 = f6;
            this.v0 = j10;
            this.f7094w0 = j11;
            this.f7095x0 = j12;
            this.f7096y0 = function2;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DrawerKt.m750BottomDrawerGs3lGvM(this.f7088p0, this.f7089q0, this.f7090r0, this.f7091s0, this.f7092t0, this.f7093u0, this.v0, this.f7094w0, this.f7095x0, this.f7096y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class d extends Lambda implements Function1<BottomDrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f7097p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomDrawerValue bottomDrawerValue) {
            BottomDrawerValue it = bottomDrawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,956:1\n76#2:957\n76#2:967\n76#2:1054\n83#3,3:958\n456#3,8:985\n464#3,3:999\n456#3,8:1021\n464#3,3:1035\n467#3,3:1039\n67#3,3:1044\n66#3:1047\n36#3:1055\n467#3,3:1062\n1097#4,6:961\n1097#4,6:1048\n1097#4,6:1056\n66#5,6:968\n72#5:1002\n65#5,7:1003\n72#5:1038\n76#5:1043\n76#5:1066\n78#6,11:974\n78#6,11:1010\n91#6:1042\n91#6:1065\n4144#7,6:993\n4144#7,6:1029\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n*L\n532#1:957\n539#1:967\n569#1:1054\n533#1:958,3\n540#1:985,8\n540#1:999,3\n549#1:1021,8\n549#1:1035,3\n549#1:1039,3\n562#1:1044,3\n562#1:1047\n578#1:1055\n540#1:1062,3\n533#1:961,6\n562#1:1048,6\n578#1:1056,6\n540#1:968,6\n540#1:1002\n549#1:1003,7\n549#1:1038\n549#1:1043\n540#1:1066\n540#1:974,11\n549#1:1010,11\n549#1:1042\n540#1:1065\n540#1:993,6\n549#1:1029,6\n*E\n"})
    public static final class e extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f7098p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f7099q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7100r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7101s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f7102t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f7103u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f7104w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7105x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f7106y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(DrawerState drawerState, boolean z10, int i10, long j10, Shape shape, long j11, long j12, float f6, Function2<? super Composer, ? super Integer, Unit> function2, CoroutineScope coroutineScope, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f7098p0 = drawerState;
            this.f7099q0 = z10;
            this.f7100r0 = i10;
            this.f7101s0 = j10;
            this.f7102t0 = shape;
            this.f7103u0 = j11;
            this.v0 = j12;
            this.f7104w0 = f6;
            this.f7105x0 = function2;
            this.f7106y0 = coroutineScope;
            this.E0 = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((iIntValue & 14) == 0 ? (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue : iIntValue) & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(816674999, iIntValue, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:522)");
                }
                long jMo260getConstraintsmsEJaDk = BoxWithConstraints.mo260getConstraintsmsEJaDk();
                if (!Constraints.m4353getHasBoundedWidthimpl(jMo260getConstraintsmsEJaDk)) {
                    throw new IllegalStateException("Drawer shouldn't have infinite width");
                }
                float f6 = -Constraints.m4357getMaxWidthimpl(jMo260getConstraintsmsEJaDk);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                DrawerState drawerState = this.f7098p0;
                Object[] objArr = {drawerState, density, Float.valueOf(f6), Float.valueOf(0.0f)};
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i10 = 0; i10 < 4; i10++) {
                    zChanged |= composer2.changed(objArr[i10]);
                }
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new n0(drawerState, density, f6);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue, composer2, 0);
                boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, drawerState.getAnchoredDraggableState$material_release(), Orientation.Horizontal, this.f7099q0, z10, null, 16, null);
                long j10 = this.f7101s0;
                Shape shape = this.f7102t0;
                long j11 = this.f7103u0;
                long j12 = this.v0;
                float f10 = this.f7104w0;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                int i11 = this.f7100r0;
                this.f7105x0.invoke(composer2, Integer.valueOf((i11 >> 27) & 14));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                boolean zIsOpen = drawerState.isOpen();
                boolean z11 = this.f7099q0;
                CoroutineScope coroutineScope = this.f7106y0;
                p0 p0Var = new p0(z11, drawerState, coroutineScope);
                Float fValueOf = Float.valueOf(f6);
                Float fValueOf2 = Float.valueOf(0.0f);
                composer2.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer2.changed(fValueOf) | composer2.changed(fValueOf2) | composer2.changed(drawerState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new q0(f6, drawerState);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                DrawerKt.m753access$ScrimBx497Mc(zIsOpen, p0Var, (Function0) objRememberedValue2, j10, composer2, (i11 >> 15) & 7168);
                String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m829getNavigationMenuUdPEhr4(), composer2, 6);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                Modifier modifierM338sizeInqDBjuR0 = SizeKt.m338sizeInqDBjuR0(companion, density2.mo406toDpu2uoSUM(Constraints.m4359getMinWidthimpl(jMo260getConstraintsmsEJaDk)), density2.mo406toDpu2uoSUM(Constraints.m4358getMinHeightimpl(jMo260getConstraintsmsEJaDk)), density2.mo406toDpu2uoSUM(Constraints.m4357getMaxWidthimpl(jMo260getConstraintsmsEJaDk)), density2.mo406toDpu2uoSUM(Constraints.m4356getMaxHeightimpl(jMo260getConstraintsmsEJaDk)));
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged3 = composer2.changed(drawerState);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new r0(drawerState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                int i12 = i11 >> 12;
                SurfaceKt.m834SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m300paddingqDBjuR0$default(OffsetKt.offset(modifierM338sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.f7061a, 0.0f, 11, null), false, new u0(strM832getString4foXLRw, drawerState, coroutineScope), 1, null), shape, j11, j12, null, f10, ComposableLambdaKt.composableLambda(composer2, -1941234439, true, new v0(this.E0, i11)), composer2, ((i11 >> 9) & 112) | 1572864 | (i12 & 896) | (i12 & 7168) | (458752 & i11), 16);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7107p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7108q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f7109r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7110s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f7111t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f7112u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f7113w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f7114x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7115y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, DrawerState drawerState, boolean z10, Shape shape, float f6, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7107p0 = function3;
            this.f7108q0 = modifier;
            this.f7109r0 = drawerState;
            this.f7110s0 = z10;
            this.f7111t0 = shape;
            this.f7112u0 = f6;
            this.v0 = j10;
            this.f7113w0 = j11;
            this.f7114x0 = j12;
            this.f7115y0 = function2;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DrawerKt.m751ModalDrawerGs3lGvM(this.f7107p0, this.f7108q0, this.f7109r0, this.f7110s0, this.f7111t0, this.f7112u0, this.v0, this.f7113w0, this.f7114x0, this.f7115y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class g extends Lambda implements Function1<BottomDrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f7116p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BottomDrawerValue bottomDrawerValue) {
            BottomDrawerValue it = bottomDrawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class h extends Lambda implements Function0<BottomDrawerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BottomDrawerValue f7117p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f7118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<BottomDrawerValue, Boolean> f7119r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(BottomDrawerValue bottomDrawerValue, Density density, Function1<? super BottomDrawerValue, Boolean> function1) {
            super(0);
            this.f7117p0 = bottomDrawerValue;
            this.f7118q0 = density;
            this.f7119r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BottomDrawerState invoke() {
            return DrawerKt.BottomDrawerState(this.f7117p0, this.f7118q0, this.f7119r0);
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class i extends Lambda implements Function1<DrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f7120p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue drawerValue) {
            DrawerValue it = drawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Drawer.kt */
    public static final class j extends Lambda implements Function0<DrawerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DrawerValue f7121p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<DrawerValue, Boolean> f7122q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(DrawerValue drawerValue, Function1<? super DrawerValue, Boolean> function1) {
            super(0);
            this.f7121p0 = drawerValue;
            this.f7122q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DrawerState invoke() {
            return new DrawerState(this.f7121p0, this.f7122q0);
        }
    }

    static {
        float f6 = 56;
        f7061a = Dp.m4389constructorimpl(f6);
        f7062b = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x0197  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:156:0x0207  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0234  */
    /* JADX WARN: Code duplicated, block: B:165:0x0262  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m750BottomDrawerGs3lGvM(@NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, @Nullable Modifier modifier, @Nullable BottomDrawerState bottomDrawerState, boolean z10, @Nullable Shape shape, float f6, long j10, long j11, long j12, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        Shape shape2;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        BottomDrawerState bottomDrawerStateRememberBottomDrawerState;
        Shape large;
        float fM749getElevationD9Ej5fM;
        long jM717getSurface0d7_KjU;
        long jM731contentColorForek8zF_U;
        int i19;
        boolean z12;
        Modifier modifier4;
        Shape shape3;
        Object objRememberedValue;
        Composer composer2;
        boolean z13;
        Shape shape4;
        float f10;
        long j13;
        long j14;
        long j15;
        BottomDrawerState bottomDrawerState2;
        Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(625649286);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        int i24 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j10)) {
                        i22 = 524288;
                    } else {
                        i22 = 1048576;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i12 |= i21;
                }
                if ((234881024 & i10) != 0) {
                    if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j12)) {
                        i20 = 33554432;
                    } else {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i18 = 268435456;
                        }
                    }
                    if (i13 != 4 && (1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        bottomDrawerState2 = bottomDrawerState;
                        f10 = f6;
                        modifier5 = modifier2;
                        z13 = z11;
                        shape4 = shape2;
                        composer2 = composerStartRestartGroup;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i23 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i16 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f6;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i19 = i12 & (-234881025);
                                z12 = z11;
                                j11 = jM731contentColorForek8zF_U;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                shape3 = large;
                                f6 = fM749getElevationD9Ej5fM;
                                j10 = jM717getSurface0d7_KjU;
                                modifier4 = modifier3;
                                bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            } else {
                                j12 = j12;
                                i19 = i12;
                                z12 = z11;
                                j10 = jM717getSurface0d7_KjU;
                                j11 = jM731contentColorForek8zF_U;
                                modifier4 = modifier3;
                                shape3 = large;
                                bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                                f6 = fM749getElevationD9Ej5fM;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if (i13 != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            i19 = (i11 & 256) != 0 ? i12 & (-234881025) : i12;
                            z12 = z11;
                            shape3 = shape2;
                            modifier4 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1561647407);
                        if (bottomDrawerState.getDensity() == null) {
                            EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier6 = modifier4;
                        BottomDrawerState bottomDrawerState3 = bottomDrawerState;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z13 = z12;
                        shape4 = shape3;
                        f10 = f6;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        bottomDrawerState2 = bottomDrawerState3;
                        modifier5 = modifier6;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
                }
                i18 = 805306368;
                i12 |= i18;
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier7 = modifier4;
                    BottomDrawerState bottomDrawerState4 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope2, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState4;
                    modifier5 = modifier7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier8 = modifier4;
                    BottomDrawerState bottomDrawerState5 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope3, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState5;
                    modifier5 = modifier8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((234881024 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier9 = modifier4;
                    BottomDrawerState bottomDrawerState6 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope4, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState6;
                    modifier5 = modifier9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier10 = modifier4;
                    BottomDrawerState bottomDrawerState7 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope5, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState7;
                    modifier5 = modifier10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier11 = modifier4;
                BottomDrawerState bottomDrawerState8 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope6, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState8;
                modifier5 = modifier11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier12 = modifier4;
                BottomDrawerState bottomDrawerState9 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope7, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState9;
                modifier5 = modifier12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((234881024 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                if (i13 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier13 = modifier4;
                    BottomDrawerState bottomDrawerState10 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope8, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState10;
                    modifier5 = modifier13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 = i12 & (-234881025);
                            z12 = z11;
                            j11 = jM731contentColorForek8zF_U;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            shape3 = large;
                            f6 = fM749getElevationD9Ej5fM;
                            j10 = jM717getSurface0d7_KjU;
                            modifier4 = modifier3;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        } else {
                            j12 = j12;
                            i19 = i12;
                            z12 = z11;
                            j10 = jM717getSurface0d7_KjU;
                            j11 = jM731contentColorForek8zF_U;
                            modifier4 = modifier3;
                            shape3 = large;
                            bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                            f6 = fM749getElevationD9Ej5fM;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1561647407);
                    if (bottomDrawerState.getDensity() == null) {
                        EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier14 = modifier4;
                    BottomDrawerState bottomDrawerState11 = bottomDrawerState;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope9, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z12;
                    shape4 = shape3;
                    f10 = f6;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    bottomDrawerState2 = bottomDrawerState11;
                    modifier5 = modifier14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier15 = modifier4;
                BottomDrawerState bottomDrawerState12 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope10, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState12;
                modifier5 = modifier15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier16 = modifier4;
                BottomDrawerState bottomDrawerState13 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope11, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState13;
                modifier5 = modifier16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i12 |= i24;
        } else {
            shape2 = shape;
        }
        i16 = i11 & 32;
        if (i16 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((234881024 & i10) != 0) {
            if ((i11 & 256) == 0) {
                i20 = 33554432;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i18 = 268435456;
                }
            }
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier17 = modifier4;
                BottomDrawerState bottomDrawerState14 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope12, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState14;
                modifier5 = modifier17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 = i12 & (-234881025);
                        z12 = z11;
                        j11 = jM731contentColorForek8zF_U;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        shape3 = large;
                        f6 = fM749getElevationD9Ej5fM;
                        j10 = jM717getSurface0d7_KjU;
                        modifier4 = modifier3;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    } else {
                        j12 = j12;
                        i19 = i12;
                        z12 = z11;
                        j10 = jM717getSurface0d7_KjU;
                        j11 = jM731contentColorForek8zF_U;
                        modifier4 = modifier3;
                        shape3 = large;
                        bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                        f6 = fM749getElevationD9Ej5fM;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1561647407);
                if (bottomDrawerState.getDensity() == null) {
                    EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier18 = modifier4;
                BottomDrawerState bottomDrawerState15 = bottomDrawerState;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope13, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z12;
                shape4 = shape3;
                f10 = f6;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                bottomDrawerState2 = bottomDrawerState15;
                modifier5 = modifier18;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
        }
        i18 = 805306368;
        i12 |= i18;
        if (i13 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 = i12 & (-234881025);
                    z12 = z11;
                    j11 = jM731contentColorForek8zF_U;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    shape3 = large;
                    f6 = fM749getElevationD9Ej5fM;
                    j10 = jM717getSurface0d7_KjU;
                    modifier4 = modifier3;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                } else {
                    j12 = j12;
                    i19 = i12;
                    z12 = z11;
                    j10 = jM717getSurface0d7_KjU;
                    j11 = jM731contentColorForek8zF_U;
                    modifier4 = modifier3;
                    shape3 = large;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    f6 = fM749getElevationD9Ej5fM;
                }
            } else {
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 = i12 & (-234881025);
                    z12 = z11;
                    j11 = jM731contentColorForek8zF_U;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    shape3 = large;
                    f6 = fM749getElevationD9Ej5fM;
                    j10 = jM717getSurface0d7_KjU;
                    modifier4 = modifier3;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                } else {
                    j12 = j12;
                    i19 = i12;
                    z12 = z11;
                    j10 = jM717getSurface0d7_KjU;
                    j11 = jM731contentColorForek8zF_U;
                    modifier4 = modifier3;
                    shape3 = large;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    f6 = fM749getElevationD9Ej5fM;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1561647407);
            if (bottomDrawerState.getDensity() == null) {
                EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier19 = modifier4;
            BottomDrawerState bottomDrawerState16 = bottomDrawerState;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope14, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z12;
            shape4 = shape3;
            f10 = f6;
            j13 = j10;
            j14 = j11;
            j15 = j12;
            bottomDrawerState2 = bottomDrawerState16;
            modifier5 = modifier19;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 = i12 & (-234881025);
                    z12 = z11;
                    j11 = jM731contentColorForek8zF_U;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    shape3 = large;
                    f6 = fM749getElevationD9Ej5fM;
                    j10 = jM717getSurface0d7_KjU;
                    modifier4 = modifier3;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                } else {
                    j12 = j12;
                    i19 = i12;
                    z12 = z11;
                    j10 = jM717getSurface0d7_KjU;
                    j11 = jM731contentColorForek8zF_U;
                    modifier4 = modifier3;
                    shape3 = large;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    f6 = fM749getElevationD9Ej5fM;
                }
            } else {
                if (i23 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 = i12 & (-234881025);
                    z12 = z11;
                    j11 = jM731contentColorForek8zF_U;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    shape3 = large;
                    f6 = fM749getElevationD9Ej5fM;
                    j10 = jM717getSurface0d7_KjU;
                    modifier4 = modifier3;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                } else {
                    j12 = j12;
                    i19 = i12;
                    z12 = z11;
                    j10 = jM717getSurface0d7_KjU;
                    j11 = jM731contentColorForek8zF_U;
                    modifier4 = modifier3;
                    shape3 = large;
                    bottomDrawerState = bottomDrawerStateRememberBottomDrawerState;
                    f6 = fM749getElevationD9Ej5fM;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625649286, i19, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1561647407);
            if (bottomDrawerState.getDensity() == null) {
                EffectsKt.SideEffect(new a(bottomDrawerState, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier110 = modifier4;
            BottomDrawerState bottomDrawerState17 = bottomDrawerState;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new b(z12, bottomDrawerState, content, i19, j12, coroutineScope15, shape3, j10, j11, f6, drawerContent)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z12;
            shape4 = shape3;
            f10 = f6;
            j13 = j10;
            j14 = j11;
            j15 = j12;
            bottomDrawerState2 = bottomDrawerState17;
            modifier5 = modifier110;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(drawerContent, modifier5, bottomDrawerState2, z13, shape4, f10, j13, j14, j15, content, i10, i11));
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState BottomDrawerState(@NotNull BottomDrawerValue initialValue, @NotNull Density density, @NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        BottomDrawerState bottomDrawerState = new BottomDrawerState(initialValue, confirmStateChange);
        bottomDrawerState.setDensity$material_release(density);
        return bottomDrawerState;
    }

    public static /* synthetic */ BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = d.f7097p0;
        }
        return BottomDrawerState(bottomDrawerValue, density, function1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01db  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x0204  */
    /* JADX WARN: Code duplicated, block: B:165:0x021f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0238  */
    /* JADX WARN: Code duplicated, block: B:171:0x0253  */
    /* JADX WARN: Code duplicated, block: B:174:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m751ModalDrawerGs3lGvM(@NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z10, @Nullable Shape shape, float f6, long j10, long j11, long j12, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        DrawerState drawerState2;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        DrawerState drawerStateRememberDrawerState;
        Shape large;
        float fM749getElevationD9Ej5fM;
        int i19;
        Object objB;
        Composer composer2;
        DrawerState drawerState3;
        boolean z12;
        Shape shape3;
        float f11;
        long j13;
        long j14;
        long j15;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1305806945);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    drawerState2 = drawerState;
                    int i23 = composerStartRestartGroup.changed(drawerState2) ? 256 : 128;
                    i12 |= i23;
                } else {
                    drawerState2 = drawerState;
                }
                i12 |= i23;
            } else {
                drawerState2 = drawerState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        int i24 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        f10 = f6;
                        if (composerStartRestartGroup.changed(f10)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 3670016) == 0) {
                        if ((i11 & 64) == 0) {
                            i17 = i22;
                            int i25 = composerStartRestartGroup.changed(j10) ? 1048576 : 524288;
                            i12 |= i25;
                        } else {
                            i17 = i22;
                        }
                        i12 |= i25;
                    } else {
                        i17 = i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i12 |= i21;
                    }
                    if ((234881024 & i10) != 0) {
                        if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i20 = 33554432;
                        } else {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i18 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i18 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i17 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if ((i11 & 4) != 0) {
                                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                    i12 &= -897;
                                } else {
                                    drawerStateRememberDrawerState = drawerState2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                    i12 &= -57345;
                                } else {
                                    large = shape2;
                                }
                                if (i15 != 0) {
                                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                                } else {
                                    fM749getElevationD9Ej5fM = f10;
                                }
                                if ((i11 & 64) != 0) {
                                    j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                    i12 &= -3670017;
                                } else {
                                    j10 = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                    i12 &= -29360129;
                                } else {
                                    j11 = j11;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                } else {
                                    j12 = j12;
                                }
                                i19 = i12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                i19 = (i11 & 256) != 0 ? i12 & (-234881025) : i12;
                                modifier3 = modifier2;
                                drawerStateRememberDrawerState = drawerState2;
                                z11 = z11;
                                large = shape2;
                                fM749getElevationD9Ej5fM = f10;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                            }
                            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                            if (objB == Composer.INSTANCE.getEmpty()) {
                                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifier5 = modifier3;
                            composer2 = composerStartRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope, drawerContent)), composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            drawerState3 = drawerStateRememberDrawerState;
                            z12 = z11;
                            shape3 = large;
                            f11 = fM749getElevationD9Ej5fM;
                            j13 = j10;
                            j14 = j11;
                            j15 = j12;
                            modifier4 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            drawerState3 = drawerState2;
                            z12 = z11;
                            shape3 = shape2;
                            f11 = f10;
                            composer2 = composerStartRestartGroup;
                            j13 = j10;
                            j14 = j11;
                            j15 = j12;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
                    }
                    i18 = 805306368;
                    i12 |= i18;
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier6 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope2, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier7 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope3, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if ((i11 & 64) == 0) {
                        i17 = i22;
                        if (composerStartRestartGroup.changed(j10)) {
                        }
                        i12 |= i25;
                    } else {
                        i17 = i22;
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((234881024 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i18 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier8 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope4, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier8;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier9 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope5, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
                }
                i18 = 805306368;
                i12 |= i18;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier10 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope6, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier11 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope7, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier11;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i10 & 3670016) == 0) {
                    if ((i11 & 64) == 0) {
                        i17 = i22;
                        if (composerStartRestartGroup.changed(j10)) {
                        }
                        i12 |= i25;
                    } else {
                        i17 = i22;
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((234881024 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i18 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier12 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope8, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier12;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier13 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope9, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier13;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
                }
                i18 = 805306368;
                i12 |= i18;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier14 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope10, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier15 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope11, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier15;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
            if ((i10 & 3670016) == 0) {
                if ((i11 & 64) == 0) {
                    i17 = i22;
                    if (composerStartRestartGroup.changed(j10)) {
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                i12 |= i25;
            } else {
                i17 = i22;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((234881024 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier16 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope12, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier17 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope13, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier17;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier18 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope14, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier18;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier19 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope15, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier19;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                drawerState2 = drawerState;
                if (composerStartRestartGroup.changed(drawerState2)) {
                }
                i12 |= i23;
            } else {
                drawerState2 = drawerState;
            }
            i12 |= i23;
        } else {
            drawerState2 = drawerState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i10 & 3670016) == 0) {
                    if ((i11 & 64) == 0) {
                        i17 = i22;
                        if (composerStartRestartGroup.changed(j10)) {
                        }
                        i12 |= i25;
                    } else {
                        i17 = i22;
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((234881024 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i20 = 33554432;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i18 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope16 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier110 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope16, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier110;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        } else {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i12 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i12 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if (i15 != 0) {
                                fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                            } else {
                                fM749getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                j10 = j10;
                            }
                            if ((i11 & 128) != 0) {
                                j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                j11 = j11;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                j12 = j12;
                            }
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == Composer.INSTANCE.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope17 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier111 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope17, drawerContent)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        z12 = z11;
                        shape3 = large;
                        f11 = fM749getElevationD9Ej5fM;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                        modifier4 = modifier111;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
                }
                i18 = 805306368;
                i12 |= i18;
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope18 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier112 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope18, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope19 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier113 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope19, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier113;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
            if ((i10 & 3670016) == 0) {
                if ((i11 & 64) == 0) {
                    i17 = i22;
                    if (composerStartRestartGroup.changed(j10)) {
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                i12 |= i25;
            } else {
                i17 = i22;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((234881024 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope110 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier114 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope110, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier115 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope111, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier115;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope112 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier116 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope112, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier116;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope113 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier117 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope113, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier117;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i12 |= i24;
        } else {
            shape2 = shape;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i10 & 3670016) == 0) {
                if ((i11 & 64) == 0) {
                    i17 = i22;
                    if (composerStartRestartGroup.changed(j10)) {
                    }
                    i12 |= i25;
                } else {
                    i17 = i22;
                }
                i12 |= i25;
            } else {
                i17 = i22;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((234881024 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i20 = 33554432;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope114 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier118 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope114, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i12 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i12 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i15 != 0) {
                            fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                        } else {
                            fM749getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            j10 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            j11 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            j12 = j12;
                        }
                        i19 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope115 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier119 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope115, drawerContent)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerStateRememberDrawerState;
                    z12 = z11;
                    shape3 = large;
                    f11 = fM749getElevationD9Ej5fM;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                    modifier4 = modifier119;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope116 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1110 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope116, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier1110;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope117 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1111 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope117, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier1111;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f10 = f6;
        if ((i10 & 3670016) == 0) {
            if ((i11 & 64) == 0) {
                i17 = i22;
                if (composerStartRestartGroup.changed(j10)) {
                }
                i12 |= i25;
            } else {
                i17 = i22;
            }
            i12 |= i25;
        } else {
            i17 = i22;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((234881024 & i10) != 0) {
            if ((i11 & 256) == 0) {
                i20 = 33554432;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i18 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope118 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1112 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope118, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier1112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i12 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i12 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i15 != 0) {
                        fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                    } else {
                        fM749getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        j10 = j10;
                    }
                    if ((i11 & 128) != 0) {
                        j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        j11 = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        j12 = j12;
                    }
                    i19 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope119 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1113 = modifier3;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope119, drawerContent)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState3 = drawerStateRememberDrawerState;
                z12 = z11;
                shape3 = large;
                f11 = fM749getElevationD9Ej5fM;
                j13 = j10;
                j14 = j11;
                j15 = j12;
                modifier4 = modifier1113;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
        }
        i18 = 805306368;
        i12 |= i18;
        if ((1533916891 & i12) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i15 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    j10 = j10;
                }
                if ((i11 & 128) != 0) {
                    j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    j11 = j11;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    j12 = j12;
                }
                i19 = i12;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i15 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    j10 = j10;
                }
                if ((i11 & 128) != 0) {
                    j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    j11 = j11;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    j12 = j12;
                }
                i19 = i12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1110 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1114 = modifier3;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope1110, drawerContent)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            drawerState3 = drawerStateRememberDrawerState;
            z12 = z11;
            shape3 = large;
            f11 = fM749getElevationD9Ej5fM;
            j13 = j10;
            j14 = j11;
            j15 = j12;
            modifier4 = modifier1114;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i15 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    j10 = j10;
                }
                if ((i11 & 128) != 0) {
                    j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    j11 = j11;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    j12 = j12;
                }
                i19 = i12;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i12 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i12 &= -57345;
                } else {
                    large = shape2;
                }
                if (i15 != 0) {
                    fM749getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m749getElevationD9Ej5fM();
                } else {
                    fM749getElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    j10 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    j10 = j10;
                }
                if ((i11 & 128) != 0) {
                    j11 = ColorsKt.m731contentColorForek8zF_U(j10, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    j11 = j11;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j12 = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    j12 = j12;
                }
                i19 = i12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1305806945, i19, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1115 = modifier3;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new e(drawerStateRememberDrawerState, z11, i19, j12, large, j10, j11, fM749getElevationD9Ej5fM, content, coroutineScope1111, drawerContent)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            drawerState3 = drawerStateRememberDrawerState;
            z12 = z11;
            shape3 = large;
            f11 = fM749getElevationD9Ej5fM;
            j13 = j10;
            j14 = j11;
            j15 = j12;
            modifier4 = modifier1115;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(drawerContent, modifier4, drawerState3, z12, shape3, f11, j13, j14, j15, content, i10, i11));
    }

    public static final AnchoredDraggableState.AnchorChangedCallback access$BottomDrawerAnchorChangeCallback(final BottomDrawerState bottomDrawerState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerAnchorChangeCallback$1

            /* JADX INFO: compiled from: Drawer.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomDrawerValue.values().length];
                    try {
                        iArr[BottomDrawerValue.Closed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomDrawerValue.Open.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(BottomDrawerValue bottomDrawerValue, Map<BottomDrawerValue, Float> previousAnchors, Map<BottomDrawerValue, Float> newAnchors) {
                BottomDrawerValue bottomDrawerValue2;
                BottomDrawerValue previousTarget = bottomDrawerValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f6 = previousAnchors.get(previousTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i10 == 1) {
                    bottomDrawerValue2 = BottomDrawerValue.Closed;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bottomDrawerValue2 = BottomDrawerValue.Open;
                    if (!newAnchors.containsKey(bottomDrawerValue2)) {
                        bottomDrawerValue2 = BottomDrawerValue.Expanded;
                        if (!newAnchors.containsKey(bottomDrawerValue2)) {
                            bottomDrawerValue2 = BottomDrawerValue.Closed;
                        }
                    }
                }
                if (Intrinsics.areEqual(((Number) bk.q.getValue(newAnchors, bottomDrawerValue2)).floatValue(), f6)) {
                    return;
                }
                BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                if (bottomDrawerState2.isAnimationRunning$material_release()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new h0.p0(bottomDrawerState2, bottomDrawerValue2, null), 3, null);
                } else {
                    if (bottomDrawerState2.trySnapTo$material_release(bottomDrawerValue2)) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new h0.q0(bottomDrawerState2, bottomDrawerValue2, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: access$BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m752access$BottomDrawerScrim3JVO9M(long j10, Function0 function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-513067266);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513067266, i11, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:799)");
            }
            if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m825getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1298942364);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new h0.t0(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM832getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new h0.v0(strM832getString4foXLRw, function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                Color colorM2498boximpl = Color.m2498boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM2498boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new h0.r0(j10, stateAnimateFloatAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.s0(j10, function0, z10, i10));
    }

    public static final NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX INFO: renamed from: access$Scrim-Bx497Mc, reason: not valid java name */
    public static final void m753access$ScrimBx497Mc(boolean z10, Function0 function0, Function0 function1, long j10, Composer composer, int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1983403750);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:834)");
            }
            String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m825getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1010561092);
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(function0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new h0.y0(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(strM832getString4foXLRw) | composerStartRestartGroup.changed(function0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new h0.a1(strM832getString4foXLRw, function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            Color colorM2498boximpl = Color.m2498boximpl(j10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(colorM2498boximpl) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new h0.w0(j10, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.x0(z10, function0, function1, j10, i10));
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull BottomDrawerValue initialValue, @Nullable Function1<? super BottomDrawerValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        if ((i11 & 2) != 0) {
            function1 = g.f7116p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i10, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:468)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.INSTANCE.Saver(density, function1);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(initialValue) | composer.changed(density) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h(initialValue, density, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull DrawerValue initialValue, @Nullable Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        if ((i11 & 2) != 0) {
            function1 = i.f7120p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(initialValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new j(initialValue, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
