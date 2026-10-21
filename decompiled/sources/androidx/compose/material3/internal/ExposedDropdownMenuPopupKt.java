package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import g1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuPopup", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,476:1\n76#2:477\n76#2:478\n76#2:479\n76#2:480\n76#2:489\n76#2:517\n25#3:481\n456#3,14:501\n456#3,14:529\n1114#4,6:482\n74#5:488\n75#5,11:490\n88#5:515\n74#5:516\n75#5,11:518\n88#5:543\n76#6:544\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt\n*L\n86#1:477\n87#1:478\n88#1:479\n89#1:480\n151#1:489\n180#1:517\n93#1:481\n151#1:501,14\n180#1:529,14\n93#1:482,6\n151#1:488\n151#1:490,11\n151#1:515\n180#1:516\n180#1:518,11\n180#1:543\n91#1:544\n*E\n"})
public final class ExposedDropdownMenuPopupKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<String> f12900a = CompositionLocalKt.compositionLocalOf$default(null, i.f12926p0, 1, null);

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,476:1\n62#2,5:477\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n*L\n127#1:477,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12904p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12905q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f12906r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f12907s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PopupLayout popupLayout, Function0<Unit> function0, String str, LayoutDirection layoutDirection) {
            super(1);
            this.f12904p0 = popupLayout;
            this.f12905q0 = function0;
            this.f12906r0 = str;
            this.f12907s0 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final PopupLayout popupLayout = this.f12904p0;
            popupLayout.E0.addView(popupLayout, popupLayout.F0);
            popupLayout.c(this.f12905q0, this.f12906r0, this.f12907s0);
            return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    PopupLayout popupLayout2 = popupLayout;
                    popupLayout2.disposeComposition();
                    popupLayout2.getClass();
                    ViewTreeLifecycleOwner.set(popupLayout2, null);
                    popupLayout2.f12928y0.getViewTreeObserver().removeOnGlobalLayoutListener(popupLayout2);
                    popupLayout2.E0.removeViewImmediate(popupLayout2);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12908p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12909q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f12910r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f12911s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PopupLayout popupLayout, Function0<Unit> function0, String str, LayoutDirection layoutDirection) {
            super(0);
            this.f12908p0 = popupLayout;
            this.f12909q0 = function0;
            this.f12910r0 = str;
            this.f12911s0 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f12908p0.c(this.f12909q0, this.f12910r0, this.f12911s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,476:1\n62#2,5:477\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3\n*L\n145#1:477,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12912p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f12913q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
            super(1);
            this.f12912p0 = popupLayout;
            this.f12913q0 = popupPositionProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            PopupLayout popupLayout = this.f12912p0;
            popupLayout.setPositionProvider(this.f12913q0);
            popupLayout.updatePosition();
            return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class d extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12914p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PopupLayout popupLayout) {
            super(1);
            this.f12914p0 = popupLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates childCoordinates = layoutCoordinates;
            Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
            LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
            Intrinsics.checkNotNull(parentLayoutCoordinates);
            long jMo3581getSizeYbymL2g = parentLayoutCoordinates.mo3581getSizeYbymL2g();
            long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect intRectM4539IntRectVbeCjmY = IntRectKt.m4539IntRectVbeCjmY(IntOffsetKt.IntOffset(mk.c.roundToInt(Offset.m2275getXimpl(jPositionInWindow)), mk.c.roundToInt(Offset.m2276getYimpl(jPositionInWindow))), jMo3581getSizeYbymL2g);
            PopupLayout popupLayout = this.f12914p0;
            popupLayout.setParentBounds(intRectM4539IntRectVbeCjmY);
            popupLayout.updatePosition();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class e implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f12916b;

        /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f12917p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        public e(PopupLayout popupLayout, LayoutDirection layoutDirection) {
            this.f12915a = popupLayout;
            this.f12916b = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> list, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            this.f12915a.setParentLayoutDirection(this.f12916b);
            return MeasureScope.CC.q(Layout, 0, 0, null, a.f12917p0, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12918p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f12919q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12920r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12921s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12922t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function0<Unit> function0, PopupPositionProvider popupPositionProvider, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f12918p0 = function0;
            this.f12919q0 = popupPositionProvider;
            this.f12920r0 = function2;
            this.f12921s0 = i10;
            this.f12922t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(this.f12918p0, this.f12919q0, this.f12920r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12921s0 | 1), this.f12922t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class g extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f12923p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n+ 2 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,476:1\n180#2:477\n207#2:506\n74#3:478\n75#3,11:480\n88#3:505\n76#4:479\n456#5,14:491\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n*L\n103#1:477\n103#1:506\n103#1:478\n103#1:480,11\n103#1:505\n103#1:479\n103#1:491,14\n*E\n"})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f12924p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f12925q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(PopupLayout popupLayout, State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.f12924p0 = popupLayout;
            this.f12925q0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(686046343, iIntValue, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.kt:101)");
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, androidx.compose.material3.internal.a.f12933p0, 1, null);
                PopupLayout popupLayout = this.f12924p0;
                Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, new androidx.compose.material3.internal.b(popupLayout)), ((Boolean) popupLayout.K0.getValue()).booleanValue() ? 1.0f : 0.0f);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 588819933, true, new androidx.compose.material3.internal.c(this.f12925q0));
                composer2.startReplaceableGroup(-483170785);
                ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.a(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.b(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
                        int i10;
                        int i11;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (size == 0) {
                            return MeasureScope.CC.q(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }
                            }, 4, null);
                        }
                        int i12 = 0;
                        if (size == 1) {
                            final Placeable placeableMo3575measureBRTryo0 = measurables.get(0).mo3575measureBRTryo0(j10);
                            return MeasureScope.CC.q(Layout, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo3575measureBRTryo0, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                        final ArrayList arrayList = new ArrayList(measurables.size());
                        int size2 = measurables.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            arrayList.add(measurables.get(i13).mo3575measureBRTryo0(j10));
                        }
                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (lastIndex >= 0) {
                            int iMax = 0;
                            int iMax2 = 0;
                            while (true) {
                                Placeable placeable = (Placeable) arrayList.get(i12);
                                iMax = Math.max(iMax, placeable.getWidth());
                                iMax2 = Math.max(iMax2, placeable.getHeight());
                                if (i12 == lastIndex) {
                                    break;
                                }
                                i12++;
                            }
                            i10 = iMax;
                            i11 = iMax2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        return MeasureScope.CC.q(Layout, i10, i11, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Placeable> list = arrayList;
                                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
                                if (lastIndex2 < 0) {
                                    return;
                                }
                                int i14 = 0;
                                while (true) {
                                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i14), 0, 0, 0.0f, 4, null);
                                    if (i14 == lastIndex2) {
                                        return;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.c(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.d(this, intrinsicMeasureScope, list, i10);
                    }
                };
                Density density = (Density) y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlpha);
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
                Updater.m2081setimpl(composerM2074constructorimpl, exposedDropdownMenuPopupKt$SimpleStack$1, companion.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, density, companion.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                ai.a.j(0, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                composableLambda.invoke(composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class i extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f12926p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(@Nullable Function0<Unit> function0, @NotNull PopupPositionProvider popupPositionProvider, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Function0<Unit> function1;
        int i12;
        Composer composer2;
        Object obj;
        Function0<Unit> function2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(187306684);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 14) == 0) {
            function1 = function0;
            i12 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i14 = i12;
        if ((i14 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = function1;
            composer3 = composerStartRestartGroup;
        } else {
            Function0<Unit> function3 = i13 != 0 ? null : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187306684, i14, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:80)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String str = (String) composerStartRestartGroup.consume(f12900a);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i14 >> 6) & 14);
            UUID popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) g.f12923p0, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                Composer composer4 = composerStartRestartGroup;
                PopupLayout popupLayout = new PopupLayout(function3, str, view, density, popupPositionProvider, popupId);
                popupLayout.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(686046343, true, new h(popupLayout, stateRememberUpdatedState)));
                composer4.updateRememberedValue(popupLayout);
                obj = popupLayout;
                composer2 = composer4;
            } else {
                composer2 = composerStartRestartGroup;
                obj = objRememberedValue;
            }
            composer2.endReplaceableGroup();
            PopupLayout popupLayout2 = (PopupLayout) obj;
            EffectsKt.DisposableEffect(popupLayout2, new a(popupLayout2, function3, str, layoutDirection), composer2, 8);
            EffectsKt.SideEffect(new b(popupLayout2, function3, str, layoutDirection), composer2, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new c(popupLayout2, popupPositionProvider), composer2, (i14 >> 3) & 14);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new d(popupLayout2));
            e eVar = new e(popupLayout2, layoutDirection);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierOnGloballyPositioned);
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
            Updater.m2081setimpl(composerM2074constructorimpl, eVar, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density2, companion.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function3;
            composer3 = composer2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(function2, popupPositionProvider, content, i10, i11));
    }

    public static final Function2 access$ExposedDropdownMenuPopup$lambda$0(State state) {
        return (Function2) state.getValue();
    }

    @NotNull
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return f12900a;
    }
}
