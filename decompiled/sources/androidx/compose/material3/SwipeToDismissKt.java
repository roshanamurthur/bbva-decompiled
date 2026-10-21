package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022.\b\u0002\u0010\f\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001am\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u000b2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "positionalThreshold", "Landroidx/compose/material3/DismissState;", "rememberDismissState", "(Landroidx/compose/material3/DismissValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DismissState;", "state", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "background", "dismissContent", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material3/DismissDirection;", "directions", "SwipeToDismiss", "(Landroidx/compose/material3/DismissState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,279:1\n67#2,3:280\n66#2:283\n460#2,13:310\n460#2,13:343\n473#2,3:357\n36#2:362\n460#2,13:388\n473#2,3:402\n473#2,3:407\n1114#3,6:284\n1114#3,6:363\n76#4:290\n76#4:298\n76#4:331\n76#4:376\n67#5,6:291\n73#5:323\n77#5:411\n75#6:297\n76#6,11:299\n75#6:330\n76#6,11:332\n89#6:360\n75#6:375\n76#6,11:377\n89#6:405\n89#6:410\n75#7,6:324\n81#7:356\n85#7:361\n75#7,6:369\n81#7:401\n85#7:406\n154#8:412\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissKt\n*L\n213#1:280,3\n213#1:283\n241#1:310,13\n261#1:343,13\n261#1:357,3\n267#1:362\n265#1:388,13\n265#1:402,3\n241#1:407,3\n213#1:284,6\n267#1:363,6\n239#1:290\n241#1:298\n261#1:331\n265#1:376\n241#1:291,6\n241#1:323\n241#1:411\n241#1:297\n241#1:299,11\n261#1:330\n261#1:332,11\n261#1:360\n265#1:375\n265#1:377,11\n265#1:405\n241#1:410\n261#1:324,6\n261#1:356\n261#1:361\n265#1:369,6\n265#1:401\n265#1:406\n279#1:412\n*E\n"})
public final class SwipeToDismissKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11702a = Dp.m4389constructorimpl(125);

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class a extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DismissState f11704p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DismissState dismissState) {
            super(1);
            this.f11704p0 = dismissState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(this.f11704p0.requireOffset()), 0));
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DismissState f11705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f11706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f11707r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11708s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Set<DismissDirection> f11709t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11710u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(DismissState dismissState, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, Modifier modifier, Set<? extends DismissDirection> set, int i10, int i11) {
            super(2);
            this.f11705p0 = dismissState;
            this.f11706q0 = function3;
            this.f11707r0 = function4;
            this.f11708s0 = modifier;
            this.f11709t0 = set;
            this.f11710u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwipeToDismissKt.SwipeToDismiss(this.f11705p0, this.f11706q0, this.f11707r0, this.f11708s0, this.f11709t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11710u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class c extends Lambda implements Function1<DismissValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f11711p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DismissValue dismissValue) {
            DismissValue it = dismissValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    public static final class d extends Lambda implements Function0<DismissState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DismissValue f11712p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<DismissValue, Boolean> f11713q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Density, Float, Float> f11714r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1, Function2<? super Density, ? super Float, Float> function2) {
            super(0);
            this.f11712p0 = dismissValue;
            this.f11713q0 = function1;
            this.f11714r0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DismissState invoke() {
            return new DismissState(this.f11712p0, this.f11713q0, this.f11714r0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0315  */
    /* JADX WARN: Code duplicated, block: B:105:0x0321  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0254  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c9  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SwipeToDismiss(@NotNull DismissState state, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> background, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> dismissContent, @Nullable Modifier modifier, @Nullable Set<? extends DismissDirection> set, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        final Set<? extends DismissDirection> of2;
        boolean z10;
        DismissValue currentValue;
        DismissValue dismissValue;
        boolean z11;
        Function0<ComposeUiNode> constructor;
        Set<? extends DismissDirection> set2;
        Function0<ComposeUiNode> constructor2;
        boolean zChanged;
        Object objRememberedValue;
        Function0<ComposeUiNode> constructor3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-373200705);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(background) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(dismissContent) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 7168) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                i12 |= 8192;
            }
            if (i13 != 16 && (46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                set2 = set;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of2 = set;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-373200705, i12, -1, "androidx.compose.material3.SwipeToDismiss (SwipeToDismiss.kt:231)");
                }
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                SwipeableV2State<DismissValue> swipeableState$material3_release = state.getSwipeableState$material3_release();
                Orientation orientation = Orientation.Horizontal;
                currentValue = state.getCurrentValue();
                dismissValue = DismissValue.Default;
                if (currentValue == dismissValue) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Modifier modifierSwipeAnchors$default = SwipeableV2Kt.swipeAnchors$default(SwipeableV2Kt.swipeableV2$default(modifier3, swipeableState$material3_release, orientation, z11, z10, null, 16, null), state.getSwipeableState$material3_release(), bk.w.setOf((Object[]) new DismissValue[]{dismissValue, DismissValue.DismissedToEnd, DismissValue.DismissedToStart}), null, new Function2<DismissValue, IntSize, Float>() { // from class: androidx.compose.material3.SwipeToDismissKt.SwipeToDismiss.1

                    /* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1$WhenMappings */
                    /* JADX INFO: compiled from: SwipeToDismiss.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[DismissValue.values().length];
                            try {
                                iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[DismissValue.DismissedToStart.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[DismissValue.Default.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Float invoke(DismissValue dismissValue2, IntSize intSize) {
                        DismissValue value = dismissValue2;
                        long f18319a = intSize.getF18319a();
                        Intrinsics.checkNotNullParameter(value, "value");
                        float fM4549getWidthimpl = IntSize.m4549getWidthimpl(f18319a);
                        int i15 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                        Set<DismissDirection> set3 = of2;
                        if (i15 == 1) {
                            if (set3.contains(DismissDirection.StartToEnd)) {
                                return Float.valueOf(fM4549getWidthimpl);
                            }
                            return null;
                        }
                        if (i15 != 2) {
                            if (i15 == 3) {
                                return Float.valueOf(0.0f);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (set3.contains(DismissDirection.EndToStart)) {
                            return Float.valueOf(-fM4549getWidthimpl);
                        }
                        return null;
                    }
                }, 4, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSwipeAnchors$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion3);
                int i15 = (i12 << 6) & 7168;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                int i16 = i15 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, (i16 & 14) | (i16 & 112));
                Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                Modifier modifier4 = modifier3;
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                set2 = of2;
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierMatchParentSize);
                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy, composerM2074constructorimpl2, density2));
                ai.a.j((i17 >> 3) & 112, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                background.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i15 >> 6) & 112) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new a(state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOffset = OffsetKt.offset(companion3, (Function1) objRememberedValue);
                int i18 = (i12 << 3) & 7168;
                composerStartRestartGroup.startReplaceableGroup(693286680);
                int i19 = i18 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, (i19 & 112) | (i19 & 14));
                Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierOffset);
                int i20 = ((((i18 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl3, density3));
                ai.a.j((i20 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                dismissContent.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i18 >> 6) & 112) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(state, background, dismissContent, modifier2, set2, i10, i11));
        }
        i12 |= 3072;
        modifier2 = modifier;
        i13 = i11 & 16;
        if (i13 != 0) {
            i12 |= 8192;
        }
        if (i13 != 16) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of2 = set;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373200705, i12, -1, "androidx.compose.material3.SwipeToDismiss (SwipeToDismiss.kt:231)");
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z10 = true;
            } else {
                z10 = false;
            }
            SwipeableV2State<DismissValue> swipeableState$material3_release2 = state.getSwipeableState$material3_release();
            Orientation orientation2 = Orientation.Horizontal;
            currentValue = state.getCurrentValue();
            dismissValue = DismissValue.Default;
            if (currentValue == dismissValue) {
                z11 = true;
            } else {
                z11 = false;
            }
            Modifier modifierSwipeAnchors$default2 = SwipeableV2Kt.swipeAnchors$default(SwipeableV2Kt.swipeableV2$default(modifier3, swipeableState$material3_release2, orientation2, z11, z10, null, 16, null), state.getSwipeableState$material3_release(), bk.w.setOf((Object[]) new DismissValue[]{dismissValue, DismissValue.DismissedToEnd, DismissValue.DismissedToStart}), null, new Function2<DismissValue, IntSize, Float>() { // from class: androidx.compose.material3.SwipeToDismissKt.SwipeToDismiss.1

                /* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1$WhenMappings */
                /* JADX INFO: compiled from: SwipeToDismiss.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DismissValue.values().length];
                        try {
                            iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DismissValue.DismissedToStart.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DismissValue.Default.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Float invoke(DismissValue dismissValue2, IntSize intSize) {
                    DismissValue value = dismissValue2;
                    long f18319a = intSize.getF18319a();
                    Intrinsics.checkNotNullParameter(value, "value");
                    float fM4549getWidthimpl = IntSize.m4549getWidthimpl(f18319a);
                    int i110 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                    Set<DismissDirection> set3 = of2;
                    if (i110 == 1) {
                        if (set3.contains(DismissDirection.StartToEnd)) {
                            return Float.valueOf(fM4549getWidthimpl);
                        }
                        return null;
                    }
                    if (i110 != 2) {
                        if (i110 == 3) {
                            return Float.valueOf(0.0f);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (set3.contains(DismissDirection.EndToStart)) {
                        return Float.valueOf(-fM4549getWidthimpl);
                    }
                    return null;
                }
            }, 4, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion4, false, composerStartRestartGroup, 0, -1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierSwipeAnchors$default2);
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
            Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl4, measurePolicyC2, composerM2074constructorimpl4, density4));
            ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Modifier modifierMatchParentSize2 = boxScopeInstance2.matchParentSize(companion6);
            int i110 = (i12 << 6) & 7168;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            int i111 = i110 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, (i111 & 14) | (i111 & 112));
            Density density5 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            Modifier modifier5 = modifier3;
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            set2 = of2;
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierMatchParentSize2);
            int i112 = ((((i110 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl5, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl5, density5));
            ai.a.j((i112 >> 3) & 112, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            background.invoke(rowScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i110 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(state);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOffset2 = OffsetKt.offset(companion6, (Function1) objRememberedValue);
            int i113 = (i12 << 3) & 7168;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            int i114 = i113 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, (i114 & 112) | (i114 & 14));
            Density density6 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierOffset2);
            int i21 = ((((i113 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl6, measurePolicyRowMeasurePolicy4, composerM2074constructorimpl6, density6));
            ai.a.j((i21 >> 3) & 112, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            dismissContent.invoke(rowScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i113 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                of2 = bk.w.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of2 = set;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373200705, i12, -1, "androidx.compose.material3.SwipeToDismiss (SwipeToDismiss.kt:231)");
            }
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z10 = true;
            } else {
                z10 = false;
            }
            SwipeableV2State<DismissValue> swipeableState$material3_release3 = state.getSwipeableState$material3_release();
            Orientation orientation3 = Orientation.Horizontal;
            currentValue = state.getCurrentValue();
            dismissValue = DismissValue.Default;
            if (currentValue == dismissValue) {
                z11 = true;
            } else {
                z11 = false;
            }
            Modifier modifierSwipeAnchors$default3 = SwipeableV2Kt.swipeAnchors$default(SwipeableV2Kt.swipeableV2$default(modifier3, swipeableState$material3_release3, orientation3, z11, z10, null, 16, null), state.getSwipeableState$material3_release(), bk.w.setOf((Object[]) new DismissValue[]{dismissValue, DismissValue.DismissedToEnd, DismissValue.DismissedToStart}), null, new Function2<DismissValue, IntSize, Float>() { // from class: androidx.compose.material3.SwipeToDismissKt.SwipeToDismiss.1

                /* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1$WhenMappings */
                /* JADX INFO: compiled from: SwipeToDismiss.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DismissValue.values().length];
                        try {
                            iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DismissValue.DismissedToStart.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DismissValue.Default.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Float invoke(DismissValue dismissValue2, IntSize intSize) {
                    DismissValue value = dismissValue2;
                    long f18319a = intSize.getF18319a();
                    Intrinsics.checkNotNullParameter(value, "value");
                    float fM4549getWidthimpl = IntSize.m4549getWidthimpl(f18319a);
                    int i115 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                    Set<DismissDirection> set3 = of2;
                    if (i115 == 1) {
                        if (set3.contains(DismissDirection.StartToEnd)) {
                            return Float.valueOf(fM4549getWidthimpl);
                        }
                        return null;
                    }
                    if (i115 != 2) {
                        if (i115 == 3) {
                            return Float.valueOf(0.0f);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (set3.contains(DismissDirection.EndToStart)) {
                        return Float.valueOf(-fM4549getWidthimpl);
                    }
                    return null;
                }
            }, 4, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion7 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion7, false, composerStartRestartGroup, 0, -1323940314);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierSwipeAnchors$default3);
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
            Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl7, measurePolicyC3, composerM2074constructorimpl7, density7));
            ai.a.j(0, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion9 = Modifier.INSTANCE;
            Modifier modifierMatchParentSize3 = boxScopeInstance3.matchParentSize(companion9);
            int i115 = (i12 << 6) & 7168;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            int i116 = i115 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion7.getTop(), composerStartRestartGroup, (i116 & 14) | (i116 & 112));
            Density density8 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            Modifier modifier6 = modifier3;
            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            set2 = of2;
            ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierMatchParentSize3);
            int i117 = ((((i115 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl8, measurePolicyRowMeasurePolicy5, composerM2074constructorimpl8, density8));
            ai.a.j((i117 >> 3) & 112, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            background.invoke(rowScopeInstance3, composerStartRestartGroup, Integer.valueOf(((i115 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(state);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOffset3 = OffsetKt.offset(companion9, (Function1) objRememberedValue);
            int i118 = (i12 << 3) & 7168;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            int i119 = i118 >> 3;
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion7.getTop(), composerStartRestartGroup, (i119 & 112) | (i119 & 14));
            Density density9 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierOffset3);
            int i22 = ((((i118 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl9, measurePolicyRowMeasurePolicy6, composerM2074constructorimpl9, density9));
            ai.a.j((i22 >> 3) & 112, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            dismissContent.invoke(rowScopeInstance3, composerStartRestartGroup, Integer.valueOf(((i118 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(state, background, dismissContent, modifier2, set2, i10, i11));
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final DismissState rememberDismissState(@Nullable DismissValue dismissValue, @Nullable Function1<? super DismissValue, Boolean> function1, @Nullable Function2<? super Density, ? super Float, Float> function2, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-263967123);
        if ((i11 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i11 & 2) != 0) {
            function1 = c.f11711p0;
        }
        if ((i11 & 4) != 0) {
            function2 = SwipeToDismissDefaults.INSTANCE.getFixedPositionalThreshold();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-263967123, i10, -1, "androidx.compose.material3.rememberDismissState (SwipeToDismiss.kt:205)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.Companion.Saver(function1, function2);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(dismissValue) | composer.changed(function1) | composer.changed(function2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new d(dismissValue, function1, function2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DismissState dismissState = (DismissState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dismissState;
    }
}
