package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1143:1\n75#2,14:1144\n91#2:1178\n456#3,8:1158\n464#3,6:1172\n4144#4,6:1166\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n651#1:1144,14\n651#1:1178\n651#1:1158,8\n651#1:1172,6\n651#1:1166,6\n*E\n"})
public final class c extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6088p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6089q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f6090r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f6091s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function1<TextLayoutResult, Unit> f6092t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6093u0;
    public final /* synthetic */ OffsetMapping v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Density f6094w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f6095x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i10) {
        super(2);
        this.f6088p0 = textFieldSelectionManager;
        this.f6089q0 = textFieldState;
        this.f6090r0 = z10;
        this.f6091s0 = z11;
        this.f6092t0 = function1;
        this.f6093u0 = textFieldValue;
        this.v0 = offsetMapping;
        this.f6094w0 = density;
        this.f6095x0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363167407, iIntValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:649)");
            }
            final TextFieldState textFieldState = this.f6089q0;
            final Function1<TextLayoutResult, Unit> function1 = this.f6092t0;
            final TextFieldValue textFieldValue = this.f6093u0;
            final OffsetMapping offsetMapping = this.v0;
            final Density density = this.f6094w0;
            final int i10 = this.f6095x0;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2

                /* JADX INFO: compiled from: CoreTextField.kt */
                public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public static final a f5815p0 = new a(1);

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope layout = placementScope;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g1.f.a(this, intrinsicMeasureScope, list, i11);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    TextFieldState textFieldState2 = textFieldState;
                    textFieldState2.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                    return textFieldState2.getTextDelegate().getMaxIntrinsicWidth();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    TextFieldState textFieldState2 = textFieldState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            snapshotCreateNonObservableSnapshot.dispose();
                            Triple<Integer, Integer, TextLayoutResult> tripleM545layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m545layout_EkL_Y$foundation_release(textFieldState2.getTextDelegate(), j10, measure.getLayoutDirection(), value);
                            int iIntValue2 = tripleM545layout_EkL_Y$foundation_release.component1().intValue();
                            int iIntValue3 = tripleM545layout_EkL_Y$foundation_release.component2().intValue();
                            TextLayoutResult textLayoutResultComponent3 = tripleM545layout_EkL_Y$foundation_release.component3();
                            if (!Intrinsics.areEqual(value, textLayoutResultComponent3)) {
                                textFieldState2.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3));
                                function1.invoke(textLayoutResultComponent3);
                                CoreTextFieldKt.b(textFieldState2, textFieldValue, offsetMapping);
                            }
                            textFieldState2.m556setMinHeightForSingleLineField0680j_4(density.mo406toDpu2uoSUM(i10 == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                            return measure.layout(iIntValue2, iIntValue3, bk.q.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mk.c.roundToInt(textLayoutResultComponent3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mk.c.roundToInt(textLayoutResultComponent3.getLastBaseline())))), a.f5815p0);
                        } catch (Throwable th2) {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th3;
                    }
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g1.f.c(this, intrinsicMeasureScope, list, i11);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g1.f.d(this, intrinsicMeasureScope, list, i11);
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = false;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2081setimpl(composerM2074constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            TextFieldState textFieldState2 = this.f6089q0;
            HandleState handleState = textFieldState2.getHandleState();
            HandleState handleState2 = HandleState.Selection;
            boolean z11 = this.f6090r0;
            if (handleState == handleState2 && textFieldState2.getLayoutCoordinates() != null) {
                LayoutCoordinates layoutCoordinates = textFieldState2.getLayoutCoordinates();
                Intrinsics.checkNotNull(layoutCoordinates);
                if (layoutCoordinates.isAttached() && z11) {
                    z10 = true;
                }
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f6088p0;
            CoreTextFieldKt.access$SelectionToolbarAndHandles(textFieldSelectionManager, z10, composer2, 8);
            if (textFieldState2.getHandleState() == HandleState.Cursor && !this.f6091s0 && z11) {
                CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
