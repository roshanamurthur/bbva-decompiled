package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n76#2:1059\n76#2:1060\n76#2:1106\n25#3:1061\n25#3:1068\n25#3:1076\n25#3:1083\n83#3,3:1090\n460#3,13:1118\n473#3,3:1132\n50#3:1137\n49#3:1138\n36#3:1145\n83#3,3:1152\n1114#4,6:1062\n1114#4,6:1069\n1114#4,6:1077\n1114#4,6:1084\n1114#4,6:1093\n1114#4,6:1139\n1114#4,6:1146\n1114#4,6:1155\n1#5:1075\n67#6,6:1099\n73#6:1131\n77#6:1136\n75#7:1105\n76#7,11:1107\n89#7:1135\n76#8:1161\n102#8,2:1162\n76#8:1164\n102#8,2:1165\n154#9:1167\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n*L\n107#1:1059\n108#1:1060\n150#1:1106\n109#1:1061\n110#1:1068\n112#1:1076\n114#1:1083\n116#1:1090,3\n150#1:1118,13\n150#1:1132,3\n154#1:1137\n154#1:1138\n1021#1:1145\n1031#1:1152,3\n109#1:1062,6\n110#1:1069,6\n112#1:1077,6\n114#1:1084,6\n116#1:1093,6\n154#1:1139,6\n1021#1:1146,6\n1031#1:1155,6\n150#1:1099,6\n150#1:1131\n150#1:1136\n150#1:1105\n150#1:1107,11\n150#1:1135\n109#1:1161\n109#1:1162,2\n110#1:1164\n110#1:1165,2\n1057#1:1167\n*E\n"})
public final class ExposedDropdownMenuKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10244a = Dp.m4389constructorimpl(16);

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10264p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f10265q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, FocusRequester focusRequester) {
            super(0);
            this.f10264p0 = z10;
            this.f10265q0 = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f10264p0) {
                this.f10265q0.requestFocus();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1058:1\n62#2,5:1059\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$3\n*L\n165#1:1059,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f10266p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref<LayoutCoordinates> f10267q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10268r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f10269s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, Ref<LayoutCoordinates> ref, int i10, MutableState<Integer> mutableState) {
            super(1);
            this.f10266p0 = view;
            this.f10267q0 = ref;
            this.f10268r0 = i10;
            this.f10269s0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            int i10 = this.f10268r0;
            MutableState<Integer> mutableState = this.f10269s0;
            View view = this.f10266p0;
            final l0.r2 r2Var = new l0.r2(view, new g1(view, this.f10267q0, i10, mutableState));
            return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    l0.r2 r2Var2 = r2Var;
                    boolean z10 = r2Var2.f82842r0;
                    View view2 = r2Var2.f82840p0;
                    if (z10) {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(r2Var2);
                        r2Var2.f82842r0 = false;
                    }
                    view2.removeOnAttachStateChangeListener(r2Var2);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10270p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f10271q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10272r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> f10273s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10274t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10275u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10270p0 = z10;
            this.f10271q0 = function1;
            this.f10272r0 = modifier;
            this.f10273s0 = function3;
            this.f10274t0 = i10;
            this.f10275u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ExposedDropdownMenuKt.ExposedDropdownMenuBox(this.f10270p0, this.f10271q0, this.f10272r0, this.f10273s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10274t0 | 1), this.f10275u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c A[LOOP:0: B:70:0x017a->B:71:0x017c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0228  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Code duplicated, block: B:85:0x0238  */
    /* JADX WARN: Code duplicated, block: B:88:0x0289  */
    /* JADX WARN: Code duplicated, block: B:90:0x0291  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuBox(final boolean z10, @NotNull final Function1<? super Boolean, Unit> onExpandedChange, @Nullable Modifier modifier, @NotNull Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        final int i14;
        Modifier modifier3;
        final Density density;
        final View view;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        int iMo413roundToPx0680j_4;
        Object objRememberedValue3;
        Ref ref;
        Object objRememberedValue4;
        final FocusRequester focusRequester;
        int i15;
        Object[] objArr;
        int i16;
        boolean zChanged;
        Object objRememberedValue5;
        final Ref ref2;
        final int i17;
        final MutableState mutableState3;
        Function0<ComposeUiNode> constructor;
        boolean zChanged2;
        Object objRememberedValue6;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1990697039);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onExpandedChange) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)");
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ref = (Ref) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue4;
                objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, density, Integer.valueOf(((Number) mutableState2.getValue()).intValue()), Integer.valueOf(((Number) mutableState.getValue()).intValue())};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i16 = 0;
                zChanged = false;
                for (i15 = 5; i16 < i15; i15 = 5) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                    i16++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    ref2 = ref;
                    i17 = iMo413roundToPx0680j_4;
                    mutableState3 = mutableState2;
                    ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1

                        /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                        @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
                        public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public final /* synthetic */ boolean f10256p0;

                            /* JADX INFO: renamed from: q0, reason: collision with root package name */
                            public final /* synthetic */ Function1<Boolean, Unit> f10257q0;

                            /* JADX INFO: renamed from: r0, reason: collision with root package name */
                            public final /* synthetic */ int f10258r0;

                            /* JADX INFO: renamed from: s0, reason: collision with root package name */
                            public final /* synthetic */ FocusRequester f10259s0;

                            /* JADX INFO: renamed from: t0, reason: collision with root package name */
                            public final /* synthetic */ Ref<LayoutCoordinates> f10260t0;

                            /* JADX INFO: renamed from: u0, reason: collision with root package name */
                            public final /* synthetic */ View f10261u0;
                            public final /* synthetic */ int v0;

                            /* JADX INFO: renamed from: w0, reason: collision with root package name */
                            public final /* synthetic */ MutableState<Integer> f10262w0;

                            /* JADX INFO: renamed from: x0, reason: collision with root package name */
                            public final /* synthetic */ MutableState<Integer> f10263x0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public a(boolean z10, Function1<? super Boolean, Unit> function1, int i10, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i11, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
                                super(3);
                                this.f10256p0 = z10;
                                this.f10257q0 = function1;
                                this.f10258r0 = i10;
                                this.f10259s0 = focusRequester;
                                this.f10260t0 = ref;
                                this.f10261u0 = view;
                                this.v0 = i11;
                                this.f10262w0 = mutableState;
                                this.f10263x0 = mutableState2;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                                Modifier modifier2 = modifier;
                                Composer composer2 = composer;
                                int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1714866713);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1714866713, iA, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
                                }
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new i1(this.f10260t0, this.f10261u0, this.v0, this.f10262w0, this.f10263x0));
                                boolean z10 = this.f10256p0;
                                Boolean boolValueOf = Boolean.valueOf(z10);
                                composer2.startReplaceableGroup(511388516);
                                Function1<Boolean, Unit> function1 = this.f10257q0;
                                boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(function1);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new j1(function1, this.f10256p0);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(ExposedDropdownMenuKt.access$expandable(modifierOnGloballyPositioned, z10, (Function0) objRememberedValue, null, null, null, composer2, (this.f10258r0 << 3) & 112, 28), this.f10259s0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                return modifierFocusRequester;
                            }
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier5, Function3 function3, Composer composer2, int i19, int i20) {
                            e1.a(this, z11, function0, modifier5, function3, composer2, i19, i20);
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        @NotNull
                        public Modifier exposedDropdownSize(@NotNull Modifier modifier5, boolean z11) {
                            Intrinsics.checkNotNullParameter(modifier5, "<this>");
                            int iIntValue = ((Number) mutableState3.getValue()).intValue();
                            Density density2 = density;
                            Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier5, 0.0f, density2.mo406toDpu2uoSUM(iIntValue), 1, null);
                            return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(((Number) mutableState.getValue()).intValue())) : modifierM323heightInVpY3zN4$default;
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        @NotNull
                        public Modifier menuAnchor(@NotNull Modifier modifier5) {
                            Intrinsics.checkNotNullParameter(modifier5, "<this>");
                            return ComposedModifierKt.composed(modifier5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                    invoke2(inspectorInfo);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                    Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                    inspectorInfo.setName("menuAnchor");
                                }
                            } : InspectableValueKt.getNoInspectorInfo(), new a(z10, onExpandedChange, i14, focusRequester, ref2, view, i17, mutableState, mutableState3));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope);
                    objRememberedValue5 = exposedDropdownMenuBoxScope;
                } else {
                    ref2 = ref;
                    i17 = iMo413roundToPx0680j_4;
                    mutableState3 = mutableState2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue5;
                int i19 = i14 >> 6;
                int i20 = i19 & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i21 = i20 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r7, composerStartRestartGroup, (i21 & 112) | (i21 & 14));
                Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density2));
                ai.a.j((i22 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, composerStartRestartGroup, Integer.valueOf(i19 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Boolean boolValueOf = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(focusRequester);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new a(z10, focusRequester);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue6, composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(view, new b(view, ref2, i17, mutableState3), composerStartRestartGroup, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onExpandedChange, modifier4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 5851) == 1170) {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)");
            }
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ref = (Ref) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue4;
            objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, density, Integer.valueOf(((Number) mutableState2.getValue()).intValue()), Integer.valueOf(((Number) mutableState.getValue()).intValue())};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i16 = 0;
            zChanged = false;
            while (i16 < i15) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                ref2 = ref;
                i17 = iMo413roundToPx0680j_4;
                mutableState3 = mutableState2;
                ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope2 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1

                    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
                    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ boolean f10256p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ Function1<Boolean, Unit> f10257q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ int f10258r0;

                        /* JADX INFO: renamed from: s0, reason: collision with root package name */
                        public final /* synthetic */ FocusRequester f10259s0;

                        /* JADX INFO: renamed from: t0, reason: collision with root package name */
                        public final /* synthetic */ Ref<LayoutCoordinates> f10260t0;

                        /* JADX INFO: renamed from: u0, reason: collision with root package name */
                        public final /* synthetic */ View f10261u0;
                        public final /* synthetic */ int v0;

                        /* JADX INFO: renamed from: w0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10262w0;

                        /* JADX INFO: renamed from: x0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10263x0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(boolean z10, Function1<? super Boolean, Unit> function1, int i10, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i11, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
                            super(3);
                            this.f10256p0 = z10;
                            this.f10257q0 = function1;
                            this.f10258r0 = i10;
                            this.f10259s0 = focusRequester;
                            this.f10260t0 = ref;
                            this.f10261u0 = view;
                            this.v0 = i11;
                            this.f10262w0 = mutableState;
                            this.f10263x0 = mutableState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                            Modifier modifier2 = modifier;
                            Composer composer2 = composer;
                            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1714866713);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714866713, iA, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new i1(this.f10260t0, this.f10261u0, this.v0, this.f10262w0, this.f10263x0));
                            boolean z10 = this.f10256p0;
                            Boolean boolValueOf = Boolean.valueOf(z10);
                            composer2.startReplaceableGroup(511388516);
                            Function1<Boolean, Unit> function1 = this.f10257q0;
                            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(function1);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new j1(function1, this.f10256p0);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(ExposedDropdownMenuKt.access$expandable(modifierOnGloballyPositioned, z10, (Function0) objRememberedValue, null, null, null, composer2, (this.f10258r0 << 3) & 112, 28), this.f10259s0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return modifierFocusRequester;
                        }
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier5, Function3 function3, Composer composer2, int i110, int i23) {
                        e1.a(this, z11, function0, modifier5, function3, composer2, i110, i23);
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier5, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        int iIntValue = ((Number) mutableState3.getValue()).intValue();
                        Density density3 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier5, 0.0f, density3.mo406toDpu2uoSUM(iIntValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density3.mo406toDpu2uoSUM(((Number) mutableState.getValue()).intValue())) : modifierM323heightInVpY3zN4$default;
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier menuAnchor(@NotNull Modifier modifier5) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        return ComposedModifierKt.composed(modifier5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                inspectorInfo.setName("menuAnchor");
                            }
                        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, onExpandedChange, i14, focusRequester, ref2, view, i17, mutableState, mutableState3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope2);
                objRememberedValue5 = exposedDropdownMenuBoxScope2;
            } else {
                ref2 = ref;
                i17 = iMo413roundToPx0680j_4;
                mutableState3 = mutableState2;
                ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope3 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1

                    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
                    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ boolean f10256p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ Function1<Boolean, Unit> f10257q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ int f10258r0;

                        /* JADX INFO: renamed from: s0, reason: collision with root package name */
                        public final /* synthetic */ FocusRequester f10259s0;

                        /* JADX INFO: renamed from: t0, reason: collision with root package name */
                        public final /* synthetic */ Ref<LayoutCoordinates> f10260t0;

                        /* JADX INFO: renamed from: u0, reason: collision with root package name */
                        public final /* synthetic */ View f10261u0;
                        public final /* synthetic */ int v0;

                        /* JADX INFO: renamed from: w0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10262w0;

                        /* JADX INFO: renamed from: x0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10263x0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(boolean z10, Function1<? super Boolean, Unit> function1, int i10, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i11, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
                            super(3);
                            this.f10256p0 = z10;
                            this.f10257q0 = function1;
                            this.f10258r0 = i10;
                            this.f10259s0 = focusRequester;
                            this.f10260t0 = ref;
                            this.f10261u0 = view;
                            this.v0 = i11;
                            this.f10262w0 = mutableState;
                            this.f10263x0 = mutableState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                            Modifier modifier2 = modifier;
                            Composer composer2 = composer;
                            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1714866713);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714866713, iA, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new i1(this.f10260t0, this.f10261u0, this.v0, this.f10262w0, this.f10263x0));
                            boolean z10 = this.f10256p0;
                            Boolean boolValueOf = Boolean.valueOf(z10);
                            composer2.startReplaceableGroup(511388516);
                            Function1<Boolean, Unit> function1 = this.f10257q0;
                            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(function1);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new j1(function1, this.f10256p0);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(ExposedDropdownMenuKt.access$expandable(modifierOnGloballyPositioned, z10, (Function0) objRememberedValue, null, null, null, composer2, (this.f10258r0 << 3) & 112, 28), this.f10259s0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return modifierFocusRequester;
                        }
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier5, Function3 function3, Composer composer2, int i110, int i23) {
                        e1.a(this, z11, function0, modifier5, function3, composer2, i110, i23);
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier5, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        int iIntValue = ((Number) mutableState3.getValue()).intValue();
                        Density density3 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier5, 0.0f, density3.mo406toDpu2uoSUM(iIntValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density3.mo406toDpu2uoSUM(((Number) mutableState.getValue()).intValue())) : modifierM323heightInVpY3zN4$default;
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier menuAnchor(@NotNull Modifier modifier5) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        return ComposedModifierKt.composed(modifier5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                inspectorInfo.setName("menuAnchor");
                            }
                        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, onExpandedChange, i14, focusRequester, ref2, view, i17, mutableState, mutableState3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope3);
                objRememberedValue5 = exposedDropdownMenuBoxScope3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$2 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue5;
            int i110 = i14 >> 6;
            int i23 = i110 & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i24 = i23 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r7, composerStartRestartGroup, (i24 & 112) | (i24 & 14));
            Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
            int i25 = ((((i23 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, density3));
            ai.a.j((i25 >> 3) & 112, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$2, composerStartRestartGroup, Integer.valueOf(i110 & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(focusRequester);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue6 = new a(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new a(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue6, composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(view, new b(view, ref2, i17, mutableState3), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)");
            }
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ref = (Ref) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue4;
            objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, density, Integer.valueOf(((Number) mutableState2.getValue()).intValue()), Integer.valueOf(((Number) mutableState.getValue()).intValue())};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i16 = 0;
            zChanged = false;
            while (i16 < i15) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                ref2 = ref;
                i17 = iMo413roundToPx0680j_4;
                mutableState3 = mutableState2;
                ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1

                    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
                    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ boolean f10256p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ Function1<Boolean, Unit> f10257q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ int f10258r0;

                        /* JADX INFO: renamed from: s0, reason: collision with root package name */
                        public final /* synthetic */ FocusRequester f10259s0;

                        /* JADX INFO: renamed from: t0, reason: collision with root package name */
                        public final /* synthetic */ Ref<LayoutCoordinates> f10260t0;

                        /* JADX INFO: renamed from: u0, reason: collision with root package name */
                        public final /* synthetic */ View f10261u0;
                        public final /* synthetic */ int v0;

                        /* JADX INFO: renamed from: w0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10262w0;

                        /* JADX INFO: renamed from: x0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10263x0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(boolean z10, Function1<? super Boolean, Unit> function1, int i10, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i11, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
                            super(3);
                            this.f10256p0 = z10;
                            this.f10257q0 = function1;
                            this.f10258r0 = i10;
                            this.f10259s0 = focusRequester;
                            this.f10260t0 = ref;
                            this.f10261u0 = view;
                            this.v0 = i11;
                            this.f10262w0 = mutableState;
                            this.f10263x0 = mutableState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                            Modifier modifier2 = modifier;
                            Composer composer2 = composer;
                            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1714866713);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714866713, iA, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new i1(this.f10260t0, this.f10261u0, this.v0, this.f10262w0, this.f10263x0));
                            boolean z10 = this.f10256p0;
                            Boolean boolValueOf = Boolean.valueOf(z10);
                            composer2.startReplaceableGroup(511388516);
                            Function1<Boolean, Unit> function1 = this.f10257q0;
                            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(function1);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new j1(function1, this.f10256p0);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(ExposedDropdownMenuKt.access$expandable(modifierOnGloballyPositioned, z10, (Function0) objRememberedValue, null, null, null, composer2, (this.f10258r0 << 3) & 112, 28), this.f10259s0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return modifierFocusRequester;
                        }
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier5, Function3 function3, Composer composer2, int i111, int i26) {
                        e1.a(this, z11, function0, modifier5, function3, composer2, i111, i26);
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier5, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        int iIntValue = ((Number) mutableState3.getValue()).intValue();
                        Density density4 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier5, 0.0f, density4.mo406toDpu2uoSUM(iIntValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density4.mo406toDpu2uoSUM(((Number) mutableState.getValue()).intValue())) : modifierM323heightInVpY3zN4$default;
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier menuAnchor(@NotNull Modifier modifier5) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        return ComposedModifierKt.composed(modifier5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                inspectorInfo.setName("menuAnchor");
                            }
                        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, onExpandedChange, i14, focusRequester, ref2, view, i17, mutableState, mutableState3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope4);
                objRememberedValue5 = exposedDropdownMenuBoxScope4;
            } else {
                ref2 = ref;
                i17 = iMo413roundToPx0680j_4;
                mutableState3 = mutableState2;
                ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope5 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1

                    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
                    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1058:1\n50#2:1059\n49#2:1060\n1114#3,6:1061\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2\n*L\n132#1:1059\n132#1:1060\n132#1:1061,6\n*E\n"})
                    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ boolean f10256p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ Function1<Boolean, Unit> f10257q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ int f10258r0;

                        /* JADX INFO: renamed from: s0, reason: collision with root package name */
                        public final /* synthetic */ FocusRequester f10259s0;

                        /* JADX INFO: renamed from: t0, reason: collision with root package name */
                        public final /* synthetic */ Ref<LayoutCoordinates> f10260t0;

                        /* JADX INFO: renamed from: u0, reason: collision with root package name */
                        public final /* synthetic */ View f10261u0;
                        public final /* synthetic */ int v0;

                        /* JADX INFO: renamed from: w0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10262w0;

                        /* JADX INFO: renamed from: x0, reason: collision with root package name */
                        public final /* synthetic */ MutableState<Integer> f10263x0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(boolean z10, Function1<? super Boolean, Unit> function1, int i10, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i11, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
                            super(3);
                            this.f10256p0 = z10;
                            this.f10257q0 = function1;
                            this.f10258r0 = i10;
                            this.f10259s0 = focusRequester;
                            this.f10260t0 = ref;
                            this.f10261u0 = view;
                            this.v0 = i11;
                            this.f10262w0 = mutableState;
                            this.f10263x0 = mutableState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                            Modifier modifier2 = modifier;
                            Composer composer2 = composer;
                            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1714866713);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714866713, iA, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new i1(this.f10260t0, this.f10261u0, this.v0, this.f10262w0, this.f10263x0));
                            boolean z10 = this.f10256p0;
                            Boolean boolValueOf = Boolean.valueOf(z10);
                            composer2.startReplaceableGroup(511388516);
                            Function1<Boolean, Unit> function1 = this.f10257q0;
                            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(function1);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new j1(function1, this.f10256p0);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(ExposedDropdownMenuKt.access$expandable(modifierOnGloballyPositioned, z10, (Function0) objRememberedValue, null, null, null, composer2, (this.f10258r0 << 3) & 112, 28), this.f10259s0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return modifierFocusRequester;
                        }
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier5, Function3 function3, Composer composer2, int i111, int i26) {
                        e1.a(this, z11, function0, modifier5, function3, composer2, i111, i26);
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier5, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        int iIntValue = ((Number) mutableState3.getValue()).intValue();
                        Density density4 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier5, 0.0f, density4.mo406toDpu2uoSUM(iIntValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density4.mo406toDpu2uoSUM(((Number) mutableState.getValue()).intValue())) : modifierM323heightInVpY3zN4$default;
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier menuAnchor(@NotNull Modifier modifier5) {
                        Intrinsics.checkNotNullParameter(modifier5, "<this>");
                        return ComposedModifierKt.composed(modifier5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                inspectorInfo.setName("menuAnchor");
                            }
                        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, onExpandedChange, i14, focusRequester, ref2, view, i17, mutableState, mutableState3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScope5);
                objRememberedValue5 = exposedDropdownMenuBoxScope5;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$3 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue5;
            int i111 = i14 >> 6;
            int i26 = i111 & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i27 = i26 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r7, composerStartRestartGroup, (i27 & 112) | (i27 & 14));
            Density density4 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
            int i28 = ((((i26 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl3, density4));
            ai.a.j((i28 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$3, composerStartRestartGroup, Integer.valueOf(i111 & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf3 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(focusRequester);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue6 = new a(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new a(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue6, composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(view, new b(view, ref2, i17, mutableState3), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onExpandedChange, modifier4, content, i10, i11));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 ??, still in use, count: 1, list:
          (r12v2 ?? I:java.lang.Object) from 0x00bf: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r12v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:192)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final androidx.compose.ui.Modifier access$expandable(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 ??, still in use, count: 1, list:
          (r12v2 ?? I:java.lang.Object) from 0x00bf: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r12v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:192)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final void access$updateHeight(View view, LayoutCoordinates layoutCoordinates, int i10, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float top = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop();
        int i11 = rect.top;
        function1.invoke(Integer.valueOf(((int) Math.max(top - i11, (rect.bottom - i11) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i10));
    }
}
