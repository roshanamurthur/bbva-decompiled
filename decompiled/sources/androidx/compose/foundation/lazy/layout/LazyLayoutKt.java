package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\r\u001a\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "", "LazyLayout", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n36#2:139\n1097#3,6:140\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n48#1:139\n48#1:140,6\n*E\n"})
public final class LazyLayoutKt {

    /* JADX INFO: compiled from: LazyLayout.kt */
    public static final class a extends Lambda implements Function0<LazyLayoutItemProvider> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemProvider f4982p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LazyLayoutItemProvider lazyLayoutItemProvider) {
            super(0);
            this.f4982p0 = lazyLayoutItemProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LazyLayoutItemProvider invoke() {
            return this.f4982p0;
        }
    }

    /* JADX INFO: compiled from: LazyLayout.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemProvider f4983p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4984q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutPrefetchState f4985r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> f4986s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f4987t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f4988u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(LazyLayoutItemProvider lazyLayoutItemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i10, int i11) {
            super(2);
            this.f4983p0 = lazyLayoutItemProvider;
            this.f4984q0 = modifier;
            this.f4985r0 = lazyLayoutPrefetchState;
            this.f4986s0 = function2;
            this.f4987t0 = i10;
            this.f4988u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyLayoutKt.LazyLayout(this.f4983p0, this.f4984q0, this.f4985r0, this.f4986s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4987t0 | 1), this.f4988u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayout.kt */
    @SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n25#2:139\n25#2:146\n50#2:153\n49#2:154\n1097#3,6:140\n1097#3,6:147\n1097#3,6:155\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n*L\n62#1:139\n65#1:146\n79#1:153\n79#1:154\n62#1:140,6\n65#1:147,6\n79#1:155,6\n*E\n"})
    public static final class c extends Lambda implements Function3<SaveableStateHolder, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutPrefetchState f4989p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4990q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> f4991r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f4992s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Function0<LazyLayoutItemProvider>> f4993t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i10, State<? extends Function0<? extends LazyLayoutItemProvider>> state) {
            super(3);
            this.f4989p0 = lazyLayoutPrefetchState;
            this.f4990q0 = modifier;
            this.f4991r0 = function2;
            this.f4992s0 = i10;
            this.f4993t0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer, Integer num) {
            SaveableStateHolder saveableStateHolder2 = saveableStateHolder;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(saveableStateHolder2, "saveableStateHolder");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1488997347, iIntValue, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder2, new l(this.f4993t0));
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SubcomposeLayoutState(new j(lazyLayoutItemContentFactory));
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
            composer2.startReplaceableGroup(-1523808190);
            int i10 = this.f4992s0;
            LazyLayoutPrefetchState lazyLayoutPrefetchState = this.f4989p0;
            if (lazyLayoutPrefetchState != null) {
                LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i10 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceableGroup();
            Modifier modifier = this.f4990q0;
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(lazyLayoutItemContentFactory);
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = this.f4991r0;
            boolean zChanged2 = zChanged | composer2.changed(function2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new k(lazyLayoutItemContentFactory, function2);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i10 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayout.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyLayoutItemProvider> f4994p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4995q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutPrefetchState f4996r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> f4997s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f4998t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f4999u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<? extends LazyLayoutItemProvider> function0, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i10, int i11) {
            super(2);
            this.f4994p0 = function0;
            this.f4995q0 = modifier;
            this.f4996r0 = lazyLayoutPrefetchState;
            this.f4997s0 = function2;
            this.f4998t0 = i10;
            this.f4999u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyLayoutKt.LazyLayout(this.f4994p0, this.f4995q0, this.f4996r0, this.f4997s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4998t0 | 1), this.f4999u0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void LazyLayout(@NotNull LazyLayoutItemProvider itemProvider, @Nullable Modifier modifier, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(852831187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(itemProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(measurePolicy) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(itemProvider);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(itemProvider);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LazyLayout((Function0<? extends LazyLayoutItemProvider>) objRememberedValue, modifier, lazyLayoutPrefetchState, measurePolicy, composerStartRestartGroup, (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(itemProvider, modifier2, lazyLayoutPrefetchState2, measurePolicy, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@NotNull Function0<? extends LazyLayoutItemProvider> itemProvider, @Nullable Modifier modifier, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        int i14;
        int i15;
        int i16;
        Modifier modifier2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState3;
        Modifier modifier3;
        LazyLayoutPrefetchState lazyLayoutPrefetchState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(itemProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                    if (composerStartRestartGroup.changed(lazyLayoutPrefetchState2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) != 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        lazyLayoutPrefetchState3 = null;
                    } else {
                        lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                    }
                    LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) != 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                if (composerStartRestartGroup.changed(lazyLayoutPrefetchState2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) != 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) != 1170) {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i13 != 0) {
                lazyLayoutPrefetchState3 = null;
            } else {
                lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
        } else {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i13 != 0) {
                lazyLayoutPrefetchState3 = null;
            } else {
                lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new c(lazyLayoutPrefetchState3, modifier2, measurePolicy, i16, SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i16 & 14))), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, i10, i11));
    }
}
