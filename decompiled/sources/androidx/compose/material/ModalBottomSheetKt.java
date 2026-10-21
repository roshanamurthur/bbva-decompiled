package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
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

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\bH\u0007\u001a@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\bH\u0007\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0096\u0001\u0010(\u001a\u00020\u00142\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140$¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*²\u0006\f\u0010)\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "isSkipHalfExpanded", "Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetState", "skipHalfExpanded", "rememberModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "alpha", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,831:1\n76#2:832\n76#2:833\n486#3,4:834\n490#3,2:842\n494#3:848\n25#4:838\n50#4:849\n49#4:850\n36#4:858\n50#4:865\n49#4:866\n50#4:873\n49#4:874\n1097#5,3:839\n1100#5,3:845\n1097#5,6:851\n1097#5,6:859\n1097#5,6:867\n1097#5,6:875\n486#6:844\n646#7:857\n81#8:881\n154#9:882\n154#9:883\n154#9:884\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:832\n577#1:833\n582#1:834,4\n582#1:842,2\n582#1:848\n582#1:838\n584#1:849\n584#1:850\n708#1:858\n709#1:865\n709#1:866\n721#1:873\n721#1:874\n582#1:839,3\n582#1:845,3\n584#1:851,6\n708#1:859,6\n709#1:867,6\n721#1:875,6\n582#1:844\n700#1:857\n701#1:881\n828#1:882\n829#1:883\n830#1:884\n*E\n"})
public final class ModalBottomSheetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7312a = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7313b = Dp.m4389constructorimpl(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7314c = Dp.m4389constructorimpl(640);

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f7327p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f7328q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ModalBottomSheetState modalBottomSheetState, Density density) {
            super(0);
            this.f7327p0 = modalBottomSheetState;
            this.f7328q0 = density;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f7327p0.setDensity$material_release(this.f7328q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,831:1\n66#2,6:832\n72#2:866\n76#2:871\n78#3,11:838\n91#3:870\n456#4,8:849\n464#4,3:863\n467#4,3:867\n50#4:872\n49#4:873\n4144#5,6:857\n1097#6,6:874\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2\n*L\n589#1:832,6\n589#1:866\n589#1:871\n589#1:838,11\n589#1:870\n589#1:849,8\n589#1:863,3\n589#1:867,3\n609#1:872\n609#1:873\n589#1:857,6\n609#1:874,6\n*E\n"})
    public static final class b extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ CoroutineScope E0;
        public final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> F0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7329p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f7330q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Orientation f7331r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f7332s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7333t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f7334u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7335w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7336x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f7337y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, ModalBottomSheetState modalBottomSheetState, Orientation orientation, Shape shape, long j10, long j11, float f6, int i10, Function2<? super Composer, ? super Integer, Unit> function2, long j12, CoroutineScope coroutineScope, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f7329p0 = z10;
            this.f7330q0 = modalBottomSheetState;
            this.f7331r0 = orientation;
            this.f7332s0 = shape;
            this.f7333t0 = j10;
            this.f7334u0 = j11;
            this.v0 = f6;
            this.f7335w0 = i10;
            this.f7336x0 = function2;
            this.f7337y0 = j12;
            this.E0 = coroutineScope;
            this.F0 = anchorChangedCallback;
            this.G0 = function3;
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
            Modifier modifierNestedScroll$default;
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
                    ComposerKt.traceEventStart(-1731958854, iIntValue, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                }
                float fM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                Modifier modifierSemantics$default = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                long j10 = this.f7337y0;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                int i11 = this.f7335w0;
                this.f7336x0.invoke(composer2, Integer.valueOf((i11 >> 27) & 14));
                ModalBottomSheetState modalBottomSheetState = this.f7330q0;
                CoroutineScope coroutineScope = this.E0;
                f1 f1Var = new f1(modalBottomSheetState, coroutineScope);
                ModalBottomSheetValue targetValue = modalBottomSheetState.getAnchoredDraggableState$material_release().getTargetValue();
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                ModalBottomSheetKt.m787access$Scrim3JVO9M(j10, f1Var, targetValue != modalBottomSheetValue, composer2, (i11 >> 24) & 14);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m342widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion.getTopCenter()), 0.0f, ModalBottomSheetKt.f7314c, 1, null), 0.0f, 1, null);
                composer2.startReplaceableGroup(1241536180);
                boolean z10 = this.f7329p0;
                if (z10) {
                    AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState$material_release = modalBottomSheetState.getAnchoredDraggableState$material_release();
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(anchoredDraggableState$material_release);
                    Orientation orientation = this.f7331r0;
                    boolean zChanged2 = zChanged | composer2.changed(orientation);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = ModalBottomSheetKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState.getAnchoredDraggableState$material_release(), orientation);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue, null, 2, null);
                } else {
                    modifierNestedScroll$default = modifierSemantics$default;
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(modifierFillMaxWidth$default.then(modifierNestedScroll$default), new g1(modalBottomSheetState)), modalBottomSheetState.getAnchoredDraggableState$material_release(), this.f7331r0, z10 && modalBottomSheetState.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null), new h1(modalBottomSheetState, this.F0, fM4356getMaxHeightimpl));
                if (z10) {
                    modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new o1(modalBottomSheetState, coroutineScope), 1, null);
                }
                int i12 = i11 >> 12;
                SurfaceKt.m834SurfaceFjzlyU(modifierOnSizeChanged.then(modifierSemantics$default), this.f7332s0, this.f7333t0, this.f7334u0, null, this.v0, ComposableLambdaKt.composableLambda(composer2, 1552994302, true, new p1(this.G0, i11)), composer2, (i11 & 458752) | ((i11 >> 9) & 112) | 1572864 | (i12 & 896) | (i12 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7339q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f7340r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7341s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f7342t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f7343u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f7344w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f7345x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7346y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z10, Shape shape, float f6, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7338p0 = function3;
            this.f7339q0 = modifier;
            this.f7340r0 = modalBottomSheetState;
            this.f7341s0 = z10;
            this.f7342t0 = shape;
            this.f7343u0 = f6;
            this.v0 = j10;
            this.f7344w0 = j11;
            this.f7345x0 = j12;
            this.f7346y0 = function2;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ModalBottomSheetKt.m786ModalBottomSheetLayoutGs3lGvM(this.f7338p0, this.f7339q0, this.f7340r0, this.f7341s0, this.f7342t0, this.f7343u0, this.v0, this.f7344w0, this.f7345x0, this.f7346y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class d extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f7347p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue) {
            ModalBottomSheetValue it = modalBottomSheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class e extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f7348p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue) {
            ModalBottomSheetValue it = modalBottomSheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class f extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f7349p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue) {
            ModalBottomSheetValue it = modalBottomSheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    public static final class g extends Lambda implements Function0<ModalBottomSheetState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetValue f7350p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f7351q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f7352r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> f7353s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f7354t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z10) {
            super(0);
            this.f7350p0 = modalBottomSheetValue;
            this.f7351q0 = density;
            this.f7352r0 = animationSpec;
            this.f7353s0 = function1;
            this.f7354t0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ModalBottomSheetState invoke() {
            return ModalBottomSheetKt.ModalBottomSheetState(this.f7350p0, this.f7351q0, this.f7352r0, this.f7353s0, this.f7354t0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01de  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:154:0x020c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0222  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237  */
    /* JADX WARN: Code duplicated, block: B:163:0x0265  */
    /* JADX WARN: Code duplicated, block: B:166:0x0292  */
    /* JADX WARN: Code duplicated, block: B:168:0x0298  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:176:0x0312  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    public static final void m786ModalBottomSheetLayoutGs3lGvM(@NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, @Nullable Modifier modifier, @Nullable ModalBottomSheetState modalBottomSheetState, boolean z10, @Nullable Shape shape, float f6, long j10, long j11, long j12, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        Shape shape2;
        int i16;
        int i17;
        long j13;
        int i18;
        int i19;
        Modifier modifier3;
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState;
        Shape large;
        float fM785getElevationD9Ej5fM;
        long jM717getSurface0d7_KjU;
        long jM731contentColorForek8zF_U;
        long scrimColor;
        ModalBottomSheetState modalBottomSheetState2;
        int i20;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        boolean z12;
        Shape shape3;
        float f10;
        Modifier modifier4;
        long j14;
        long j15;
        long j16;
        ModalBottomSheetState modalBottomSheetState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-92970288);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
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
                i12 |= 3072;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
            }
            if ((57344 & i10) == 0) {
                shape2 = shape;
                if ((i11 & 16) == 0 || !composerStartRestartGroup.changed(shape2)) {
                    i24 = 8192;
                } else {
                    i24 = 16384;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j10)) {
                    i23 = 524288;
                } else {
                    i23 = 1048576;
                }
                i12 |= i23;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) {
                    i22 = 4194304;
                } else {
                    i22 = 8388608;
                }
                i12 |= i22;
            }
            if ((234881024 & i10) == 0) {
                j13 = j12;
                if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j13)) {
                    i21 = 33554432;
                } else {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                i12 |= i21;
            } else {
                j13 = j12;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                i19 = i12;
                if (i13 != 4 && (1533916891 & i19) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modalBottomSheetState3 = modalBottomSheetState;
                    f10 = f6;
                    modifier4 = modifier2;
                    j16 = j13;
                    z12 = z11;
                    composer2 = composerStartRestartGroup;
                    shape3 = shape2;
                    j14 = j10;
                    j15 = j11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                            i19 &= -897;
                        } else {
                            modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i19 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i16 != 0) {
                            fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                        } else {
                            fM785getElevationD9Ej5fM = f6;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i19 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                            i19 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i19 &= -234881025;
                            scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        } else {
                            scrimColor = j12;
                        }
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i13 != 0) {
                            i19 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i19 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i19 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i19 &= -234881025;
                        }
                        fM785getElevationD9Ej5fM = f6;
                        jM717getSurface0d7_KjU = j10;
                        jM731contentColorForek8zF_U = j11;
                        modifier3 = modifier2;
                        scrimColor = j13;
                        z11 = z11;
                        large = shape2;
                        modalBottomSheetState2 = modalBottomSheetState;
                    }
                    i20 = i19;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(502769027);
                    if (modalBottomSheetState2.getDensity() == null) {
                        EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Orientation orientation = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ModalBottomSheetState modalBottomSheetState4 = modalBottomSheetState2;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    shape3 = large;
                    f10 = fM785getElevationD9Ej5fM;
                    modifier4 = modifier3;
                    j14 = jM717getSurface0d7_KjU;
                    j15 = jM731contentColorForek8zF_U;
                    j16 = scrimColor;
                    modalBottomSheetState3 = modalBottomSheetState4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(sheetContent, modifier4, modalBottomSheetState3, z12, shape3, f10, j14, j15, j16, content, i10, i11));
            }
            i18 = 805306368;
            i12 |= i18;
            i19 = i12;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                i20 = i19;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Orientation orientation2 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState2;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation2, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                shape3 = large;
                f10 = fM785getElevationD9Ej5fM;
                modifier4 = modifier3;
                j14 = jM717getSurface0d7_KjU;
                j15 = jM731contentColorForek8zF_U;
                j16 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                i20 = i19;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Orientation orientation3 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetState2;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation3, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                shape3 = large;
                f10 = fM785getElevationD9Ej5fM;
                modifier4 = modifier3;
                j14 = jM717getSurface0d7_KjU;
                j15 = jM731contentColorForek8zF_U;
                j16 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(sheetContent, modifier4, modalBottomSheetState3, z12, shape3, f10, j14, j15, j16, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
        }
        if ((57344 & i10) == 0) {
            shape2 = shape;
            if ((i11 & 16) == 0) {
                i24 = 8192;
            } else {
                i24 = 8192;
            }
            i12 |= i24;
        } else {
            shape2 = shape;
        }
        i16 = i11 & 32;
        if (i16 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i10) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((3670016 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        if ((29360128 & i10) != 0) {
            if ((i11 & 128) == 0) {
                i22 = 4194304;
            } else {
                i22 = 4194304;
            }
            i12 |= i22;
        }
        if ((234881024 & i10) == 0) {
            j13 = j12;
            if ((i11 & 256) == 0) {
                i21 = 33554432;
            } else {
                i21 = 33554432;
            }
            i12 |= i21;
        } else {
            j13 = j12;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i18 = 268435456;
                }
            }
            i19 = i12;
            if (i13 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                i20 = i19;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Orientation orientation4 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ModalBottomSheetState modalBottomSheetState7 = modalBottomSheetState2;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation4, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                shape3 = large;
                f10 = fM785getElevationD9Ej5fM;
                modifier4 = modifier3;
                j14 = jM717getSurface0d7_KjU;
                j15 = jM731contentColorForek8zF_U;
                j16 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i19 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i19 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i16 != 0) {
                        fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                    } else {
                        fM785getElevationD9Ej5fM = f6;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i19 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i19 &= -234881025;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    } else {
                        scrimColor = j12;
                    }
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                i20 = i19;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Orientation orientation5 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState2;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation5, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                shape3 = large;
                f10 = fM785getElevationD9Ej5fM;
                modifier4 = modifier3;
                j14 = jM717getSurface0d7_KjU;
                j15 = jM731contentColorForek8zF_U;
                j16 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(sheetContent, modifier4, modalBottomSheetState3, z12, shape3, f10, j14, j15, j16, content, i10, i11));
        }
        i18 = 805306368;
        i12 |= i18;
        i19 = i12;
        if (i13 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i19 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i19 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                } else {
                    fM785getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i19 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                    i19 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 &= -234881025;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    scrimColor = j12;
                }
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            } else {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i19 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i19 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                } else {
                    fM785getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i19 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                    i19 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 &= -234881025;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    scrimColor = j12;
                }
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            }
            i20 = i19;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
            }
            composerStartRestartGroup.startReplaceableGroup(502769027);
            if (modalBottomSheetState2.getDensity() == null) {
                EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Orientation orientation6 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState2;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation6, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            shape3 = large;
            f10 = fM785getElevationD9Ej5fM;
            modifier4 = modifier3;
            j14 = jM717getSurface0d7_KjU;
            j15 = jM731contentColorForek8zF_U;
            j16 = scrimColor;
            modalBottomSheetState3 = modalBottomSheetState9;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i19 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i19 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                } else {
                    fM785getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i19 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                    i19 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 &= -234881025;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    scrimColor = j12;
                }
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            } else {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i19 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i19 &= -57345;
                } else {
                    large = shape2;
                }
                if (i16 != 0) {
                    fM785getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m785getElevationD9Ej5fM();
                } else {
                    fM785getElevationD9Ej5fM = f6;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i19 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 18) & 14);
                    i19 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    i19 &= -234881025;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                } else {
                    scrimColor = j12;
                }
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            }
            i20 = i19;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92970288, i20, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
            }
            composerStartRestartGroup.startReplaceableGroup(502769027);
            if (modalBottomSheetState2.getDensity() == null) {
                EffectsKt.SideEffect(new a(modalBottomSheetState2, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Orientation orientation7 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = access$ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState2;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, new b(z11, modalBottomSheetState2, orientation7, large, jM717getSurface0d7_KjU, jM731contentColorForek8zF_U, fM785getElevationD9Ej5fM, i20, content, scrimColor, coroutineScope, (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2, sheetContent)), composer2, ((i20 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            shape3 = large;
            f10 = fM785getElevationD9Ej5fM;
            modifier4 = modifier3;
            j14 = jM717getSurface0d7_KjU;
            j15 = jM731contentColorForek8zF_U;
            j16 = scrimColor;
            modalBottomSheetState3 = modalBottomSheetState10;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(sheetContent, modifier4, modalBottomSheetState3, z12, shape3, f10, j14, j15, j16, content, i10, i11));
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull Density density, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z10) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(initialValue, animationSpec, z10, confirmValueChange);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i10 & 8) != 0) {
            function1 = d.f7347p0;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, function1, z10);
    }

    public static final NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    public static final AnchoredDraggableState.AnchorChangedCallback access$ModalBottomSheetAnchorChangeCallback(final ModalBottomSheetState modalBottomSheetState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1

            /* JADX INFO: compiled from: ModalBottomSheet.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(ModalBottomSheetValue modalBottomSheetValue, Map<ModalBottomSheetValue, Float> prevAnchors, Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue2;
                ModalBottomSheetValue prevTarget = modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(prevTarget, "prevTarget");
                Intrinsics.checkNotNullParameter(prevAnchors, "prevAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f6 = prevAnchors.get(prevTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i10 == 1) {
                    modalBottomSheetValue2 = ModalBottomSheetValue.Hidden;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modalBottomSheetValue2 = ModalBottomSheetValue.HalfExpanded;
                    if (!newAnchors.containsKey(modalBottomSheetValue2)) {
                        modalBottomSheetValue2 = ModalBottomSheetValue.Expanded;
                        if (!newAnchors.containsKey(modalBottomSheetValue2)) {
                            modalBottomSheetValue2 = ModalBottomSheetValue.Hidden;
                        }
                    }
                }
                if (Intrinsics.areEqual(((Number) bk.q.getValue(newAnchors, modalBottomSheetValue2)).floatValue(), f6)) {
                    return;
                }
                ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                if (modalBottomSheetState2.isAnimationRunning$material_release()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new h0.p1(modalBottomSheetState2, modalBottomSheetValue2, null), 3, null);
                } else {
                    if (modalBottomSheetState2.trySnapTo$material_release(modalBottomSheetValue2)) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new h0.q1(modalBottomSheetState2, modalBottomSheetValue2, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final void m787access$Scrim3JVO9M(long j10, Function0 function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-526532668);
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
                ComposerKt.traceEventStart(-526532668, i11, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:694)");
            }
            if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m826getCloseSheetUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1010559499);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new h0.t1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM832getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new h0.v1(strM832getString4foXLRw, function0);
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
                    objRememberedValue3 = new h0.r1(j10, stateAnimateFloatAsState);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.s1(j10, function0, z10, i10));
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        AnimationSpec<Float> animationSpec2 = (i11 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        Function1<? super ModalBottomSheetValue, Boolean> function2 = (i11 & 4) != 0 ? f.f7349p0 : function1;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:436)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(170051607, initialValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m2165rememberSaveable(new Object[]{initialValue, animationSpec2, Boolean.valueOf(z11), function2, density}, (Saver) ModalBottomSheetState.INSTANCE.Saver(animationSpec2, function2, z11, density), (String) null, (Function0) new g(initialValue, density, animationSpec2, function2, z11), composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z10) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        return new ModalBottomSheetState(initialValue, animationSpec, z10, confirmValueChange);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i10 & 4) != 0) {
            function1 = e.f7348p0;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z10);
    }

    @NotNull
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, boolean z10, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:490)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, z10, composer, (i10 & 14) | 64 | ((i10 >> 3) & 896) | ((i10 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }

    @NotNull
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:519)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i10 & 14) | 3136 | (i10 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }
}
