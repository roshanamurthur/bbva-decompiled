package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.k;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u009a\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Lkotlin/ExtensionFunctionType;", "slots", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,375:1\n154#2:376\n76#3:377\n83#4,3:378\n1097#5,6:381\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n61#1:376\n120#1:377\n174#1:378,3\n174#1:381,6\n*E\n"})
public final class LazyGridKt {

    /* JADX INFO: compiled from: LazyGrid.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function1<LazyGridScope, Unit> E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4779p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f4780q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Density, Constraints, LazyGridSlots> f4781r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4782s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f4783t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f4784u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f4785w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4786x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f4787y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, LazyGridState lazyGridState, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, PaddingValues paddingValues, boolean z10, boolean z11, FlingBehavior flingBehavior, boolean z12, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i10, int i11, int i12) {
            super(2);
            this.f4779p0 = modifier;
            this.f4780q0 = lazyGridState;
            this.f4781r0 = function2;
            this.f4782s0 = paddingValues;
            this.f4783t0 = z10;
            this.f4784u0 = z11;
            this.v0 = flingBehavior;
            this.f4785w0 = z12;
            this.f4786x0 = vertical;
            this.f4787y0 = horizontal;
            this.E0 = function1;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyGridKt.LazyGrid(this.f4779p0, this.f4780q0, this.f4781r0, this.f4782s0, this.f4783t0, this.f4784u0, this.v0, this.f4785w0, this.f4786x0, this.f4787y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0), this.H0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyGrid.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyGridItemProvider> f4788p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f4789q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f4790r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends LazyGridItemProvider> function0, LazyGridState lazyGridState, int i10) {
            super(2);
            this.f4788p0 = function0;
            this.f4789q0 = lazyGridState;
            this.f4790r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f4790r0 | 1);
            LazyGridKt.a(this.f4788p0, this.f4789q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x0233  */
    /* JADX WARN: Code duplicated, block: B:153:0x023c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0269 A[LOOP:0: B:155:0x0267->B:156:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x027b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0291  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:179:0x0362  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyGrid(@Nullable Modifier modifier, @NotNull LazyGridState state, @NotNull Function2<? super Density, ? super Constraints, LazyGridSlots> slots, @Nullable PaddingValues paddingValues, boolean z10, boolean z11, @Nullable FlingBehavior flingBehavior, boolean z12, @NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        Modifier modifier2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier3;
        PaddingValues paddingValuesM289PaddingValues0680j_4;
        boolean z13;
        FlingBehavior flingBehavior2;
        boolean z14;
        int i22;
        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda;
        int i23;
        int i24;
        Object[] objArr;
        int i25;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        Orientation orientation;
        boolean z15;
        Modifier modifier4;
        PaddingValues paddingValues2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i26;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(152645664);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(slots) ? 256 : 128;
        }
        int i28 = i12 & 8;
        if (i28 == 0) {
            if ((i10 & 7168) == 0) {
                i13 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i26 = 524288;
                    } else {
                        i26 = 1048576;
                    }
                    i13 |= i26;
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z12)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 256) != 0) {
                        if ((234881024 & i10) == 0) {
                            if (composerStartRestartGroup.changed(verticalArrangement)) {
                                i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((i12 & 512) != 0) {
                            if ((1879048192 & i10) == 0) {
                                if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                    i19 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i19 = 268435456;
                                }
                            }
                            if ((i12 & 1024) != 0) {
                                i20 = i11 | 6;
                            } else if ((i11 & 14) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i11 | i21;
                            } else {
                                i20 = i11;
                            }
                            if ((i13 & 1533916891) != 306783378 && (i20 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                z15 = z10;
                                modifier4 = modifier2;
                                composer2 = composerStartRestartGroup;
                                paddingValues2 = paddingValues;
                                flingBehavior3 = flingBehavior;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i27 != 0) {
                                        modifier3 = Modifier.INSTANCE;
                                    } else {
                                        modifier3 = modifier2;
                                    }
                                    if (i28 != 0) {
                                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                    } else {
                                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                    }
                                    if (i14 != 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                    }
                                    int i29 = i13;
                                    z14 = z13;
                                    i22 = i29;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i22 = i13;
                                    z14 = z10;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                                }
                                OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                                int i30 = i22 >> 3;
                                int i31 = i30 & 14;
                                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31 | ((i20 << 3) & 112));
                                int i32 = i22 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31 | (i32 & 112));
                                int i33 = i22 & 112;
                                i23 = (i22 & 896) | i33 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i32 & 3670016) | (i30 & 29360128);
                                composerStartRestartGroup.startReplaceableGroup(1292704639);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                                }
                                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                                composerStartRestartGroup.startReplaceableGroup(-568225417);
                                i25 = 0;
                                zChanged = false;
                                for (i24 = 7; i25 < i24; i24 = 7) {
                                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                    i25++;
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    composer2 = composerStartRestartGroup;
                                    k kVar = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                    composer2.updateRememberedValue(kVar);
                                    objRememberedValue = kVar;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                composer2.endReplaceableGroup();
                                Function2 function2 = (Function2) objRememberedValue;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                state.setVertical$foundation_release(z11);
                                a(function0RememberLazyGridItemProviderLambda, state, composer2, i33);
                                if (z11) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Horizontal;
                                }
                                Orientation orientation2 = orientation;
                                boolean z16 = z14;
                                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState, orientation2, z12, z14, composer2, (i32 & 57344) | ((i22 << 3) & 458752)), orientation2), state, z14, orientation2, composer2, i33 | ((i22 >> 6) & 896)), r33), state, orientation2, overscrollEffect, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z16), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function2, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z16;
                                modifier4 = modifier3;
                                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                                flingBehavior3 = flingBehavior2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                        }
                        i19 = 805306368;
                        i13 |= i19;
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i210 = i13;
                                z14 = z13;
                                i22 = i210;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211 = i13;
                                z14 = z13;
                                i22 = i211;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i34 = i22 >> 3;
                            int i35 = i34 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i35 | ((i20 << 3) & 112));
                            int i36 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i35 | (i36 & 112));
                            int i37 = i22 & 112;
                            i23 = (i22 & 896) | i37 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i36 & 3670016) | (i34 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar2 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar2);
                                objRememberedValue = kVar2;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar3 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar3);
                                objRememberedValue = kVar3;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function3 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i37);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation3 = orientation;
                            boolean z17 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState2, orientation3, z12, z14, composer2, (i36 & 57344) | ((i22 << 3) & 458752)), orientation3), state, z14, orientation3, composer2, i37 | ((i22 >> 6) & 896)), r33), state, orientation3, overscrollEffect2, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z17), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function3, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z17;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i212 = i13;
                                z14 = z13;
                                i22 = i212;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i213 = i13;
                                z14 = z13;
                                i22 = i213;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect3 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i38 = i22 >> 3;
                            int i39 = i38 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i39 | ((i20 << 3) & 112));
                            int i310 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState3 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i39 | (i310 & 112));
                            int i311 = i22 & 112;
                            i23 = (i22 & 896) | i311 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i310 & 3670016) | (i38 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar4 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar4);
                                objRememberedValue = kVar4;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar5 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar5);
                                objRememberedValue = kVar5;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function4 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i311);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation4 = orientation;
                            boolean z18 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState3, orientation4, z12, z14, composer2, (i310 & 57344) | ((i22 << 3) & 458752)), orientation4), state, z14, orientation4, composer2, i311 | ((i22 >> 6) & 896)), r33), state, orientation4, overscrollEffect3, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z18), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function4, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z18;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                    }
                    i18 = 100663296;
                    i13 |= i18;
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i19 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i214 = i13;
                                z14 = z13;
                                i22 = i214;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i215 = i13;
                                z14 = z13;
                                i22 = i215;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect4 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i312 = i22 >> 3;
                            int i313 = i312 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i313 | ((i20 << 3) & 112));
                            int i314 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState4 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i313 | (i314 & 112));
                            int i315 = i22 & 112;
                            i23 = (i22 & 896) | i315 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i314 & 3670016) | (i312 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar6 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar6);
                                objRememberedValue = kVar6;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar7 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar7);
                                objRememberedValue = kVar7;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function5 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i315);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation5 = orientation;
                            boolean z19 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState4, orientation5, z12, z14, composer2, (i314 & 57344) | ((i22 << 3) & 458752)), orientation5), state, z14, orientation5, composer2, i315 | ((i22 >> 6) & 896)), r33), state, orientation5, overscrollEffect4, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z19), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function5, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z19;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i216 = i13;
                                z14 = z13;
                                i22 = i216;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i217 = i13;
                                z14 = z13;
                                i22 = i217;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect5 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i316 = i22 >> 3;
                            int i317 = i316 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i317 | ((i20 << 3) & 112));
                            int i318 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState5 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i317 | (i318 & 112));
                            int i319 = i22 & 112;
                            i23 = (i22 & 896) | i319 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i318 & 3670016) | (i316 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar8 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar8);
                                objRememberedValue = kVar8;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar9 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar9);
                                objRememberedValue = kVar9;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function6 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i319);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation6 = orientation;
                            boolean z110 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState5, orientation6, z12, z14, composer2, (i318 & 57344) | ((i22 << 3) & 458752)), orientation6), state, z14, orientation6, composer2, i319 | ((i22 >> 6) & 896)), r33), state, orientation6, overscrollEffect5, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function6, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z110;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                    }
                    i19 = 805306368;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i218 = i13;
                            z14 = z13;
                            i22 = i218;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i219 = i13;
                            z14 = z13;
                            i22 = i219;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect6 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i3110 = i22 >> 3;
                        int i3111 = i3110 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111 | ((i20 << 3) & 112));
                        int i3112 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState6 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111 | (i3112 & 112));
                        int i3113 = i22 & 112;
                        i23 = (i22 & 896) | i3113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3112 & 3670016) | (i3110 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar10 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar10);
                            objRememberedValue = kVar10;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11);
                            objRememberedValue = kVar11;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function7 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3113);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation7 = orientation;
                        boolean z111 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState6, orientation7, z12, z14, composer2, (i3112 & 57344) | ((i22 << 3) & 458752)), orientation7), state, z14, orientation7, composer2, i3113 | ((i22 >> 6) & 896)), r33), state, orientation7, overscrollEffect6, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function7, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2110 = i13;
                            z14 = z13;
                            i22 = i2110;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111 = i13;
                            z14 = z13;
                            i22 = i2111;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect7 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i3114 = i22 >> 3;
                        int i3115 = i3114 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3115 | ((i20 << 3) & 112));
                        int i3116 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState7 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3115 | (i3116 & 112));
                        int i3117 = i22 & 112;
                        i23 = (i22 & 896) | i3117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3116 & 3670016) | (i3114 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar12 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar12);
                            objRememberedValue = kVar12;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar13 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar13);
                            objRememberedValue = kVar13;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function8 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3117);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation8 = orientation;
                        boolean z112 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState7, orientation8, z12, z14, composer2, (i3116 & 57344) | ((i22 << 3) & 458752)), orientation8), state, z14, orientation8, composer2, i3117 | ((i22 >> 6) & 896)), r33), state, orientation8, overscrollEffect7, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function8, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z112;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i19 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i2112 = i13;
                                z14 = z13;
                                i22 = i2112;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i2113 = i13;
                                z14 = z13;
                                i22 = i2113;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect8 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i3118 = i22 >> 3;
                            int i3119 = i3118 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3119 | ((i20 << 3) & 112));
                            int i31110 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState8 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3119 | (i31110 & 112));
                            int i31111 = i22 & 112;
                            i23 = (i22 & 896) | i31111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31110 & 3670016) | (i3118 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar14 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar14);
                                objRememberedValue = kVar14;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar15 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar15);
                                objRememberedValue = kVar15;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function9 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation9 = orientation;
                            boolean z113 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState8, orientation9, z12, z14, composer2, (i31110 & 57344) | ((i22 << 3) & 458752)), orientation9), state, z14, orientation9, composer2, i31111 | ((i22 >> 6) & 896)), r33), state, orientation9, overscrollEffect8, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation9, z113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function9, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z113;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i2114 = i13;
                                z14 = z13;
                                i22 = i2114;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i2115 = i13;
                                z14 = z13;
                                i22 = i2115;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect9 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i31112 = i22 >> 3;
                            int i31113 = i31112 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31113 | ((i20 << 3) & 112));
                            int i31114 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState9 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31113 | (i31114 & 112));
                            int i31115 = i22 & 112;
                            i23 = (i22 & 896) | i31115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31114 & 3670016) | (i31112 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar16 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar16);
                                objRememberedValue = kVar16;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar17 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar17);
                                objRememberedValue = kVar17;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function10 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31115);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation10 = orientation;
                            boolean z114 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState9, orientation10, z12, z14, composer2, (i31114 & 57344) | ((i22 << 3) & 458752)), orientation10), state, z14, orientation10, composer2, i31115 | ((i22 >> 6) & 896)), r33), state, orientation10, overscrollEffect9, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation10, z114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function10, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z114;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                    }
                    i19 = 805306368;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2116 = i13;
                            z14 = z13;
                            i22 = i2116;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2117 = i13;
                            z14 = z13;
                            i22 = i2117;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect10 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31116 = i22 >> 3;
                        int i31117 = i31116 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31117 | ((i20 << 3) & 112));
                        int i31118 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState10 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31117 | (i31118 & 112));
                        int i31119 = i22 & 112;
                        i23 = (i22 & 896) | i31119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31118 & 3670016) | (i31116 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar18 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar18);
                            objRememberedValue = kVar18;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar19 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar19);
                            objRememberedValue = kVar19;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function11 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i31119);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11 = orientation;
                        boolean z115 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState10, orientation11, z12, z14, composer2, (i31118 & 57344) | ((i22 << 3) & 458752)), orientation11), state, z14, orientation11, composer2, i31119 | ((i22 >> 6) & 896)), r33), state, orientation11, overscrollEffect10, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11, z115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z115;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2118 = i13;
                            z14 = z13;
                            i22 = i2118;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2119 = i13;
                            z14 = z13;
                            i22 = i2119;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect11 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311110 = i22 >> 3;
                        int i311111 = i311110 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111 | ((i20 << 3) & 112));
                        int i311112 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111 | (i311112 & 112));
                        int i311113 = i22 & 112;
                        i23 = (i22 & 896) | i311113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311112 & 3670016) | (i311110 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar110);
                            objRememberedValue = kVar110;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar111);
                            objRememberedValue = kVar111;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function12 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311113);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation12 = orientation;
                        boolean z116 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11, orientation12, z12, z14, composer2, (i311112 & 57344) | ((i22 << 3) & 458752)), orientation12), state, z14, orientation12, composer2, i311113 | ((i22 >> 6) & 896)), r33), state, orientation12, overscrollEffect11, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation12, z116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function12, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z116;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i21110 = i13;
                            z14 = z13;
                            i22 = i21110;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i21111 = i13;
                            z14 = z13;
                            i22 = i21111;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect12 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311114 = i22 >> 3;
                        int i311115 = i311114 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311115 | ((i20 << 3) & 112));
                        int i311116 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState12 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311115 | (i311116 & 112));
                        int i311117 = i22 & 112;
                        i23 = (i22 & 896) | i311117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311116 & 3670016) | (i311114 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar112);
                            objRememberedValue = kVar112;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar113);
                            objRememberedValue = kVar113;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function13 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311117);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation13 = orientation;
                        boolean z117 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState12, orientation13, z12, z14, composer2, (i311116 & 57344) | ((i22 << 3) & 458752)), orientation13), state, z14, orientation13, composer2, i311117 | ((i22 >> 6) & 896)), r33), state, orientation13, overscrollEffect12, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation13, z117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function13, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z117;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i21112 = i13;
                            z14 = z13;
                            i22 = i21112;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i21113 = i13;
                            z14 = z13;
                            i22 = i21113;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect13 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311118 = i22 >> 3;
                        int i311119 = i311118 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311119 | ((i20 << 3) & 112));
                        int i3111110 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState13 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311119 | (i3111110 & 112));
                        int i3111111 = i22 & 112;
                        i23 = (i22 & 896) | i3111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111110 & 3670016) | (i311118 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar114);
                            objRememberedValue = kVar114;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar115);
                            objRememberedValue = kVar115;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function14 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation14 = orientation;
                        boolean z118 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState13, orientation14, z12, z14, composer2, (i3111110 & 57344) | ((i22 << 3) & 458752)), orientation14), state, z14, orientation14, composer2, i3111111 | ((i22 >> 6) & 896)), r33), state, orientation14, overscrollEffect13, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation14, z118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function14, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z118;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21114 = i13;
                        z14 = z13;
                        i22 = i21114;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21115 = i13;
                        z14 = z13;
                        i22 = i21115;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect14 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111112 = i22 >> 3;
                    int i3111113 = i3111112 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111113 | ((i20 << 3) & 112));
                    int i3111114 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState14 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111113 | (i3111114 & 112));
                    int i3111115 = i22 & 112;
                    i23 = (i22 & 896) | i3111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111114 & 3670016) | (i3111112 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar116);
                        objRememberedValue = kVar116;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar117);
                        objRememberedValue = kVar117;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function15 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111115);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation15 = orientation;
                    boolean z119 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState14, orientation15, z12, z14, composer2, (i3111114 & 57344) | ((i22 << 3) & 458752)), orientation15), state, z14, orientation15, composer2, i3111115 | ((i22 >> 6) & 896)), r33), state, orientation15, overscrollEffect14, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation15, z119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function15, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z119;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21116 = i13;
                        z14 = z13;
                        i22 = i21116;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21117 = i13;
                        z14 = z13;
                        i22 = i21117;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect15 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111116 = i22 >> 3;
                    int i3111117 = i3111116 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111117 | ((i20 << 3) & 112));
                    int i3111118 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState15 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111117 | (i3111118 & 112));
                    int i3111119 = i22 & 112;
                    i23 = (i22 & 896) | i3111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111118 & 3670016) | (i3111116 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar118);
                        objRememberedValue = kVar118;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar119);
                        objRememberedValue = kVar119;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function16 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111119);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation16 = orientation;
                    boolean z1110 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState15, orientation16, z12, z14, composer2, (i3111118 & 57344) | ((i22 << 3) & 458752)), orientation16), state, z14, orientation16, composer2, i3111119 | ((i22 >> 6) & 896)), r33), state, orientation16, overscrollEffect15, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation16, z1110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function16, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1110;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i16;
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i12 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i19 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i21118 = i13;
                                z14 = z13;
                                i22 = i21118;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i21119 = i13;
                                z14 = z13;
                                i22 = i21119;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect16 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i31111110 = i22 >> 3;
                            int i31111111 = i31111110 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111 | ((i20 << 3) & 112));
                            int i31111112 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState16 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111 | (i31111112 & 112));
                            int i31111113 = i22 & 112;
                            i23 = (i22 & 896) | i31111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111112 & 3670016) | (i31111110 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar1110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1110);
                                objRememberedValue = kVar1110;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar1111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1111);
                                objRememberedValue = kVar1111;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function17 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111113);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation17 = orientation;
                            boolean z1111 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState16, orientation17, z12, z14, composer2, (i31111112 & 57344) | ((i22 << 3) & 458752)), orientation17), state, z14, orientation17, composer2, i31111113 | ((i22 >> 6) & 896)), r33), state, orientation17, overscrollEffect16, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation17, z1111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function17, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z1111;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211110 = i13;
                                z14 = z13;
                                i22 = i211110;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211111 = i13;
                                z14 = z13;
                                i22 = i211111;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect17 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i31111114 = i22 >> 3;
                            int i31111115 = i31111114 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111115 | ((i20 << 3) & 112));
                            int i31111116 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState17 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111115 | (i31111116 & 112));
                            int i31111117 = i22 & 112;
                            i23 = (i22 & 896) | i31111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111116 & 3670016) | (i31111114 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar1112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1112);
                                objRememberedValue = kVar1112;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar1113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1113);
                                objRememberedValue = kVar1113;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function18 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111117);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation18 = orientation;
                            boolean z1112 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState17, orientation18, z12, z14, composer2, (i31111116 & 57344) | ((i22 << 3) & 458752)), orientation18), state, z14, orientation18, composer2, i31111117 | ((i22 >> 6) & 896)), r33), state, orientation18, overscrollEffect17, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation18, z1112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function18, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z1112;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                    }
                    i19 = 805306368;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211112 = i13;
                            z14 = z13;
                            i22 = i211112;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211113 = i13;
                            z14 = z13;
                            i22 = i211113;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect18 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31111118 = i22 >> 3;
                        int i31111119 = i31111118 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111119 | ((i20 << 3) & 112));
                        int i311111110 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState18 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111119 | (i311111110 & 112));
                        int i311111111 = i22 & 112;
                        i23 = (i22 & 896) | i311111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111110 & 3670016) | (i31111118 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1114);
                            objRememberedValue = kVar1114;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1115);
                            objRememberedValue = kVar1115;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function19 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation19 = orientation;
                        boolean z1113 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState18, orientation19, z12, z14, composer2, (i311111110 & 57344) | ((i22 << 3) & 458752)), orientation19), state, z14, orientation19, composer2, i311111111 | ((i22 >> 6) & 896)), r33), state, orientation19, overscrollEffect18, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation19, z1113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function19, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1113;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211114 = i13;
                            z14 = z13;
                            i22 = i211114;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211115 = i13;
                            z14 = z13;
                            i22 = i211115;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect19 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111112 = i22 >> 3;
                        int i311111113 = i311111112 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111113 | ((i20 << 3) & 112));
                        int i311111114 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState19 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111113 | (i311111114 & 112));
                        int i311111115 = i22 & 112;
                        i23 = (i22 & 896) | i311111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111114 & 3670016) | (i311111112 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1116);
                            objRememberedValue = kVar1116;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1117);
                            objRememberedValue = kVar1117;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function110 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111115);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation110 = orientation;
                        boolean z1114 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState19, orientation110, z12, z14, composer2, (i311111114 & 57344) | ((i22 << 3) & 458752)), orientation110), state, z14, orientation110, composer2, i311111115 | ((i22 >> 6) & 896)), r33), state, orientation110, overscrollEffect19, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation110, z1114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1114;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211116 = i13;
                            z14 = z13;
                            i22 = i211116;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211117 = i13;
                            z14 = z13;
                            i22 = i211117;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect110 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111116 = i22 >> 3;
                        int i311111117 = i311111116 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111117 | ((i20 << 3) & 112));
                        int i311111118 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111117 | (i311111118 & 112));
                        int i311111119 = i22 & 112;
                        i23 = (i22 & 896) | i311111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111118 & 3670016) | (i311111116 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1118);
                            objRememberedValue = kVar1118;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1119);
                            objRememberedValue = kVar1119;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function111 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111119);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111 = orientation;
                        boolean z1115 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState110, orientation111, z12, z14, composer2, (i311111118 & 57344) | ((i22 << 3) & 458752)), orientation111), state, z14, orientation111, composer2, i311111119 | ((i22 >> 6) & 896)), r33), state, orientation111, overscrollEffect110, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111, z1115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1115;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211118 = i13;
                            z14 = z13;
                            i22 = i211118;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211119 = i13;
                            z14 = z13;
                            i22 = i211119;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect111 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i3111111110 = i22 >> 3;
                        int i3111111111 = i3111111110 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111 | ((i20 << 3) & 112));
                        int i3111111112 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111 | (i3111111112 & 112));
                        int i3111111113 = i22 & 112;
                        i23 = (i22 & 896) | i3111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111112 & 3670016) | (i3111111110 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11110);
                            objRememberedValue = kVar11110;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111);
                            objRememberedValue = kVar11111;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function112 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111113);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation112 = orientation;
                        boolean z1116 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111, orientation112, z12, z14, composer2, (i3111111112 & 57344) | ((i22 << 3) & 458752)), orientation112), state, z14, orientation112, composer2, i3111111113 | ((i22 >> 6) & 896)), r33), state, orientation112, overscrollEffect111, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation112, z1116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function112, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1116;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111110 = i13;
                        z14 = z13;
                        i22 = i2111110;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111 = i13;
                        z14 = z13;
                        i22 = i2111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect112 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111114 = i22 >> 3;
                    int i3111111115 = i3111111114 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111115 | ((i20 << 3) & 112));
                    int i3111111116 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111115 | (i3111111116 & 112));
                    int i3111111117 = i22 & 112;
                    i23 = (i22 & 896) | i3111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111116 & 3670016) | (i3111111114 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11112);
                        objRememberedValue = kVar11112;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11113);
                        objRememberedValue = kVar11113;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function113 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111117);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation113 = orientation;
                    boolean z1117 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState112, orientation113, z12, z14, composer2, (i3111111116 & 57344) | ((i22 << 3) & 458752)), orientation113), state, z14, orientation113, composer2, i3111111117 | ((i22 >> 6) & 896)), r33), state, orientation113, overscrollEffect112, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation113, z1117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1117;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111112 = i13;
                        z14 = z13;
                        i22 = i2111112;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111113 = i13;
                        z14 = z13;
                        i22 = i2111113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect113 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111118 = i22 >> 3;
                    int i3111111119 = i3111111118 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111119 | ((i20 << 3) & 112));
                    int i31111111110 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111119 | (i31111111110 & 112));
                    int i31111111111 = i22 & 112;
                    i23 = (i22 & 896) | i31111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111110 & 3670016) | (i3111111118 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11114);
                        objRememberedValue = kVar11114;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11115);
                        objRememberedValue = kVar11115;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function114 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation114 = orientation;
                    boolean z1118 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState113, orientation114, z12, z14, composer2, (i31111111110 & 57344) | ((i22 << 3) & 458752)), orientation114), state, z14, orientation114, composer2, i31111111111 | ((i22 >> 6) & 896)), r33), state, orientation114, overscrollEffect113, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation114, z1118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function114, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1118;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111114 = i13;
                            z14 = z13;
                            i22 = i2111114;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111115 = i13;
                            z14 = z13;
                            i22 = i2111115;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect114 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31111111112 = i22 >> 3;
                        int i31111111113 = i31111111112 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111113 | ((i20 << 3) & 112));
                        int i31111111114 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111113 | (i31111111114 & 112));
                        int i31111111115 = i22 & 112;
                        i23 = (i22 & 896) | i31111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111114 & 3670016) | (i31111111112 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11116);
                            objRememberedValue = kVar11116;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11117);
                            objRememberedValue = kVar11117;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function115 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111115);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation115 = orientation;
                        boolean z1119 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState114, orientation115, z12, z14, composer2, (i31111111114 & 57344) | ((i22 << 3) & 458752)), orientation115), state, z14, orientation115, composer2, i31111111115 | ((i22 >> 6) & 896)), r33), state, orientation115, overscrollEffect114, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation115, z1119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1119;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111116 = i13;
                            z14 = z13;
                            i22 = i2111116;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111117 = i13;
                            z14 = z13;
                            i22 = i2111117;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect115 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31111111116 = i22 >> 3;
                        int i31111111117 = i31111111116 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111117 | ((i20 << 3) & 112));
                        int i31111111118 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111117 | (i31111111118 & 112));
                        int i31111111119 = i22 & 112;
                        i23 = (i22 & 896) | i31111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111118 & 3670016) | (i31111111116 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11118);
                            objRememberedValue = kVar11118;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11119);
                            objRememberedValue = kVar11119;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function116 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111119);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation116 = orientation;
                        boolean z11110 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState115, orientation116, z12, z14, composer2, (i31111111118 & 57344) | ((i22 << 3) & 458752)), orientation116), state, z14, orientation116, composer2, i31111111119 | ((i22 >> 6) & 896)), r33), state, orientation116, overscrollEffect115, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation116, z11110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function116, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z11110;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111118 = i13;
                        z14 = z13;
                        i22 = i2111118;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111119 = i13;
                        z14 = z13;
                        i22 = i2111119;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect116 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111110 = i22 >> 3;
                    int i311111111111 = i311111111110 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111 | ((i20 << 3) & 112));
                    int i311111111112 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111 | (i311111111112 & 112));
                    int i311111111113 = i22 & 112;
                    i23 = (i22 & 896) | i311111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111112 & 3670016) | (i311111111110 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111110);
                        objRememberedValue = kVar111110;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111);
                        objRememberedValue = kVar111111;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function117 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111113);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation117 = orientation;
                    boolean z11111 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState116, orientation117, z12, z14, composer2, (i311111111112 & 57344) | ((i22 << 3) & 458752)), orientation117), state, z14, orientation117, composer2, i311111111113 | ((i22 >> 6) & 896)), r33), state, orientation117, overscrollEffect116, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation117, z11111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11111;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111110 = i13;
                        z14 = z13;
                        i22 = i21111110;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111 = i13;
                        z14 = z13;
                        i22 = i21111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect117 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111114 = i22 >> 3;
                    int i311111111115 = i311111111114 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111115 | ((i20 << 3) & 112));
                    int i311111111116 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111115 | (i311111111116 & 112));
                    int i311111111117 = i22 & 112;
                    i23 = (i22 & 896) | i311111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111116 & 3670016) | (i311111111114 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111112);
                        objRememberedValue = kVar111112;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111113);
                        objRememberedValue = kVar111113;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function118 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111117);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation118 = orientation;
                    boolean z11112 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState117, orientation118, z12, z14, composer2, (i311111111116 & 57344) | ((i22 << 3) & 458752)), orientation118), state, z14, orientation118, composer2, i311111111117 | ((i22 >> 6) & 896)), r33), state, orientation118, overscrollEffect117, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation118, z11112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11112;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i19 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111112 = i13;
                        z14 = z13;
                        i22 = i21111112;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111113 = i13;
                        z14 = z13;
                        i22 = i21111113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect118 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111118 = i22 >> 3;
                    int i311111111119 = i311111111118 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111119 | ((i20 << 3) & 112));
                    int i3111111111110 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111119 | (i3111111111110 & 112));
                    int i3111111111111 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111110 & 3670016) | (i311111111118 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111114);
                        objRememberedValue = kVar111114;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111115);
                        objRememberedValue = kVar111115;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function119 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation119 = orientation;
                    boolean z11113 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState118, orientation119, z12, z14, composer2, (i3111111111110 & 57344) | ((i22 << 3) & 458752)), orientation119), state, z14, orientation119, composer2, i3111111111111 | ((i22 >> 6) & 896)), r33), state, orientation119, overscrollEffect118, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation119, z11113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11113;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111114 = i13;
                        z14 = z13;
                        i22 = i21111114;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111115 = i13;
                        z14 = z13;
                        i22 = i21111115;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect119 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111112 = i22 >> 3;
                    int i3111111111113 = i3111111111112 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111113 | ((i20 << 3) & 112));
                    int i3111111111114 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111113 | (i3111111111114 & 112));
                    int i3111111111115 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111114 & 3670016) | (i3111111111112 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111116);
                        objRememberedValue = kVar111116;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111117);
                        objRememberedValue = kVar111117;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function1110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111115);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1110 = orientation;
                    boolean z11114 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState119, orientation1110, z12, z14, composer2, (i3111111111114 & 57344) | ((i22 << 3) & 458752)), orientation1110), state, z14, orientation1110, composer2, i3111111111115 | ((i22 >> 6) & 896)), r33), state, orientation1110, overscrollEffect119, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1110, z11114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1110, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11114;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i19 = 805306368;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111116 = i13;
                    z14 = z13;
                    i22 = i21111116;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111117 = i13;
                    z14 = z13;
                    i22 = i21111117;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect1110 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i3111111111116 = i22 >> 3;
                int i3111111111117 = i3111111111116 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111117 | ((i20 << 3) & 112));
                int i3111111111118 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111117 | (i3111111111118 & 112));
                int i3111111111119 = i22 & 112;
                i23 = (i22 & 896) | i3111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111118 & 3670016) | (i3111111111116 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111118);
                    objRememberedValue = kVar111118;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111119);
                    objRememberedValue = kVar111119;
                }
                composer2.endReplaceableGroup();
                Function2 function1111 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111119);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111 = orientation;
                boolean z11115 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1110, orientation1111, z12, z14, composer2, (i3111111111118 & 57344) | ((i22 << 3) & 458752)), orientation1111), state, z14, orientation1111, composer2, i3111111111119 | ((i22 >> 6) & 896)), r33), state, orientation1111, overscrollEffect1110, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111, z11115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11115;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111118 = i13;
                    z14 = z13;
                    i22 = i21111118;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111119 = i13;
                    z14 = z13;
                    i22 = i21111119;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect1111 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111110 = i22 >> 3;
                int i31111111111111 = i31111111111110 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111 | ((i20 << 3) & 112));
                int i31111111111112 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111 | (i31111111111112 & 112));
                int i31111111111113 = i22 & 112;
                i23 = (i22 & 896) | i31111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111112 & 3670016) | (i31111111111110 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar1111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111110);
                    objRememberedValue = kVar1111110;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111);
                    objRememberedValue = kVar1111111;
                }
                composer2.endReplaceableGroup();
                Function2 function1112 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111113);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1112 = orientation;
                boolean z11116 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1111, orientation1112, z12, z14, composer2, (i31111111111112 & 57344) | ((i22 << 3) & 458752)), orientation1112), state, z14, orientation1112, composer2, i31111111111113 | ((i22 >> 6) & 896)), r33), state, orientation1112, overscrollEffect1111, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1112, z11116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1112, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11116;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
        }
        i13 |= 3072;
        i14 = i12 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i12 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i19 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211111110 = i13;
                                z14 = z13;
                                i22 = i211111110;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211111111 = i13;
                                z14 = z13;
                                i22 = i211111111;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect1112 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i31111111111114 = i22 >> 3;
                            int i31111111111115 = i31111111111114 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111115 | ((i20 << 3) & 112));
                            int i31111111111116 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111115 | (i31111111111116 & 112));
                            int i31111111111117 = i22 & 112;
                            i23 = (i22 & 896) | i31111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111116 & 3670016) | (i31111111111114 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar1111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1111112);
                                objRememberedValue = kVar1111112;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar1111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1111113);
                                objRememberedValue = kVar1111113;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function1113 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111117);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1113 = orientation;
                            boolean z11117 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1112, orientation1113, z12, z14, composer2, (i31111111111116 & 57344) | ((i22 << 3) & 458752)), orientation1113), state, z14, orientation1113, composer2, i31111111111117 | ((i22 >> 6) & 896)), r33), state, orientation1113, overscrollEffect1112, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1113, z11117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1113, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z11117;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211111112 = i13;
                                z14 = z13;
                                i22 = i211111112;
                            } else {
                                if (i27 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i28 != 0) {
                                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                                } else {
                                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                                }
                                if (i14 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                int i211111113 = i13;
                                z14 = z13;
                                i22 = i211111113;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            OverscrollEffect overscrollEffect1113 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                            int i31111111111118 = i22 >> 3;
                            int i31111111111119 = i31111111111118 & 14;
                            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111119 | ((i20 << 3) & 112));
                            int i311111111111110 = i22 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111119 | (i311111111111110 & 112));
                            int i311111111111111 = i22 & 112;
                            i23 = (i22 & 896) | i311111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111110 & 3670016) | (i31111111111118 & 29360128);
                            composerStartRestartGroup.startReplaceableGroup(1292704639);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                            }
                            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i25 = 0;
                            zChanged = false;
                            while (i25 < i24) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                                i25++;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                composer2 = composerStartRestartGroup;
                                k kVar1111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1111114);
                                objRememberedValue = kVar1111114;
                            } else {
                                composer2 = composerStartRestartGroup;
                                k kVar1111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                                composer2.updateRememberedValue(kVar1111115);
                                objRememberedValue = kVar1111115;
                            }
                            composer2.endReplaceableGroup();
                            Function2 function1114 = (Function2) objRememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            state.setVertical$foundation_release(z11);
                            a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1114 = orientation;
                            boolean z11118 = z14;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1113, orientation1114, z12, z14, composer2, (i311111111111110 & 57344) | ((i22 << 3) & 458752)), orientation1114), state, z14, orientation1114, composer2, i311111111111111 | ((i22 >> 6) & 896)), r33), state, orientation1114, overscrollEffect1113, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1114, z11118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1114, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z11118;
                            modifier4 = modifier3;
                            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                    }
                    i19 = 805306368;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111114 = i13;
                            z14 = z13;
                            i22 = i211111114;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111115 = i13;
                            z14 = z13;
                            i22 = i211111115;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect1114 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111111111112 = i22 >> 3;
                        int i311111111111113 = i311111111111112 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111113 | ((i20 << 3) & 112));
                        int i311111111111114 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111113 | (i311111111111114 & 112));
                        int i311111111111115 = i22 & 112;
                        i23 = (i22 & 896) | i311111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111114 & 3670016) | (i311111111111112 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111116);
                            objRememberedValue = kVar1111116;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111117);
                            objRememberedValue = kVar1111117;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function1115 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111115);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1115 = orientation;
                        boolean z11119 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1114, orientation1115, z12, z14, composer2, (i311111111111114 & 57344) | ((i22 << 3) & 458752)), orientation1115), state, z14, orientation1115, composer2, i311111111111115 | ((i22 >> 6) & 896)), r33), state, orientation1115, overscrollEffect1114, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1115, z11119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z11119;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111116 = i13;
                            z14 = z13;
                            i22 = i211111116;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111117 = i13;
                            z14 = z13;
                            i22 = i211111117;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect1115 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111111111116 = i22 >> 3;
                        int i311111111111117 = i311111111111116 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111117 | ((i20 << 3) & 112));
                        int i311111111111118 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111117 | (i311111111111118 & 112));
                        int i311111111111119 = i22 & 112;
                        i23 = (i22 & 896) | i311111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111118 & 3670016) | (i311111111111116 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111118);
                            objRememberedValue = kVar1111118;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111119);
                            objRememberedValue = kVar1111119;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function1116 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111119);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1116 = orientation;
                        boolean z111110 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1115, orientation1116, z12, z14, composer2, (i311111111111118 & 57344) | ((i22 << 3) & 458752)), orientation1116), state, z14, orientation1116, composer2, i311111111111119 | ((i22 >> 6) & 896)), r33), state, orientation1116, overscrollEffect1115, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1116, z111110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1116, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111110;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111118 = i13;
                            z14 = z13;
                            i22 = i211111118;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111119 = i13;
                            z14 = z13;
                            i22 = i211111119;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect1116 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i3111111111111110 = i22 >> 3;
                        int i3111111111111111 = i3111111111111110 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111 | ((i20 << 3) & 112));
                        int i3111111111111112 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111 | (i3111111111111112 & 112));
                        int i3111111111111113 = i22 & 112;
                        i23 = (i22 & 896) | i3111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111112 & 3670016) | (i3111111111111110 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111110);
                            objRememberedValue = kVar11111110;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111111);
                            objRememberedValue = kVar11111111;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function1117 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111113);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1117 = orientation;
                        boolean z111111 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1116, orientation1117, z12, z14, composer2, (i3111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation1117), state, z14, orientation1117, composer2, i3111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation1117, overscrollEffect1116, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1117, z111111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1117, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111111;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111110 = i13;
                            z14 = z13;
                            i22 = i2111111110;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111111 = i13;
                            z14 = z13;
                            i22 = i2111111111;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect1117 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i3111111111111114 = i22 >> 3;
                        int i3111111111111115 = i3111111111111114 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111115 | ((i20 << 3) & 112));
                        int i3111111111111116 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111115 | (i3111111111111116 & 112));
                        int i3111111111111117 = i22 & 112;
                        i23 = (i22 & 896) | i3111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111116 & 3670016) | (i3111111111111114 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111112);
                            objRememberedValue = kVar11111112;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111113);
                            objRememberedValue = kVar11111113;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function1118 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111117);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1118 = orientation;
                        boolean z111112 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1117, orientation1118, z12, z14, composer2, (i3111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation1118), state, z14, orientation1118, composer2, i3111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation1118, overscrollEffect1117, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1118, z111112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1118, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111112;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111112 = i13;
                        z14 = z13;
                        i22 = i2111111112;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111113 = i13;
                        z14 = z13;
                        i22 = i2111111113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect1118 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111118 = i22 >> 3;
                    int i3111111111111119 = i3111111111111118 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111119 | ((i20 << 3) & 112));
                    int i31111111111111110 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111119 | (i31111111111111110 & 112));
                    int i31111111111111111 = i22 & 112;
                    i23 = (i22 & 896) | i31111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111110 & 3670016) | (i3111111111111118 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111114);
                        objRememberedValue = kVar11111114;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111115);
                        objRememberedValue = kVar11111115;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function1119 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1119 = orientation;
                    boolean z111113 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1118, orientation1119, z12, z14, composer2, (i31111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation1119), state, z14, orientation1119, composer2, i31111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation1119, overscrollEffect1118, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1119, z111113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z111113;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111114 = i13;
                        z14 = z13;
                        i22 = i2111111114;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111115 = i13;
                        z14 = z13;
                        i22 = i2111111115;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect1119 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i31111111111111112 = i22 >> 3;
                    int i31111111111111113 = i31111111111111112 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111113 | ((i20 << 3) & 112));
                    int i31111111111111114 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111113 | (i31111111111111114 & 112));
                    int i31111111111111115 = i22 & 112;
                    i23 = (i22 & 896) | i31111111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111114 & 3670016) | (i31111111111111112 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111116);
                        objRememberedValue = kVar11111116;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111117);
                        objRememberedValue = kVar11111117;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function11110 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111115);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11110 = orientation;
                    boolean z111114 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1119, orientation11110, z12, z14, composer2, (i31111111111111114 & 57344) | ((i22 << 3) & 458752)), orientation11110), state, z14, orientation11110, composer2, i31111111111111115 | ((i22 >> 6) & 896)), r33), state, orientation11110, overscrollEffect1119, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11110, z111114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11110, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z111114;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111116 = i13;
                            z14 = z13;
                            i22 = i2111111116;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111117 = i13;
                            z14 = z13;
                            i22 = i2111111117;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect11110 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31111111111111116 = i22 >> 3;
                        int i31111111111111117 = i31111111111111116 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111117 | ((i20 << 3) & 112));
                        int i31111111111111118 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111117 | (i31111111111111118 & 112));
                        int i31111111111111119 = i22 & 112;
                        i23 = (i22 & 896) | i31111111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111118 & 3670016) | (i31111111111111116 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar11111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111118);
                            objRememberedValue = kVar11111118;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar11111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar11111119);
                            objRememberedValue = kVar11111119;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function11111 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111119);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11111 = orientation;
                        boolean z111115 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11110, orientation11111, z12, z14, composer2, (i31111111111111118 & 57344) | ((i22 << 3) & 458752)), orientation11111), state, z14, orientation11111, composer2, i31111111111111119 | ((i22 >> 6) & 896)), r33), state, orientation11111, overscrollEffect11110, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11111, z111115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111115;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111118 = i13;
                            z14 = z13;
                            i22 = i2111111118;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i2111111119 = i13;
                            z14 = z13;
                            i22 = i2111111119;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect11111 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111111111111110 = i22 >> 3;
                        int i311111111111111111 = i311111111111111110 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111 | ((i20 << 3) & 112));
                        int i311111111111111112 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111 | (i311111111111111112 & 112));
                        int i311111111111111113 = i22 & 112;
                        i23 = (i22 & 896) | i311111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111112 & 3670016) | (i311111111111111110 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar111111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar111111110);
                            objRememberedValue = kVar111111110;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar111111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar111111111);
                            objRememberedValue = kVar111111111;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function11112 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111113);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11112 = orientation;
                        boolean z111116 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11111, orientation11112, z12, z14, composer2, (i311111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation11112), state, z14, orientation11112, composer2, i311111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation11112, overscrollEffect11111, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11112, z111116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11112, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z111116;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111110 = i13;
                        z14 = z13;
                        i22 = i21111111110;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111111 = i13;
                        z14 = z13;
                        i22 = i21111111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect11112 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111111111114 = i22 >> 3;
                    int i311111111111111115 = i311111111111111114 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111115 | ((i20 << 3) & 112));
                    int i311111111111111116 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111115 | (i311111111111111116 & 112));
                    int i311111111111111117 = i22 & 112;
                    i23 = (i22 & 896) | i311111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111116 & 3670016) | (i311111111111111114 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111112);
                        objRememberedValue = kVar111111112;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111113);
                        objRememberedValue = kVar111111113;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function11113 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111117);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11113 = orientation;
                    boolean z111117 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11112, orientation11113, z12, z14, composer2, (i311111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation11113), state, z14, orientation11113, composer2, i311111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation11113, overscrollEffect11112, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11113, z111117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z111117;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111112 = i13;
                        z14 = z13;
                        i22 = i21111111112;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111113 = i13;
                        z14 = z13;
                        i22 = i21111111113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect11113 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111111111118 = i22 >> 3;
                    int i311111111111111119 = i311111111111111118 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111119 | ((i20 << 3) & 112));
                    int i3111111111111111110 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111119 | (i3111111111111111110 & 112));
                    int i3111111111111111111 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111110 & 3670016) | (i311111111111111118 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111114);
                        objRememberedValue = kVar111111114;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111115);
                        objRememberedValue = kVar111111115;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function11114 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11114 = orientation;
                    boolean z111118 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11113, orientation11114, z12, z14, composer2, (i3111111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation11114), state, z14, orientation11114, composer2, i3111111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation11114, overscrollEffect11113, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11114, z111118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11114, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z111118;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i19 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111114 = i13;
                        z14 = z13;
                        i22 = i21111111114;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111115 = i13;
                        z14 = z13;
                        i22 = i21111111115;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect11114 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111111112 = i22 >> 3;
                    int i3111111111111111113 = i3111111111111111112 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111113 | ((i20 << 3) & 112));
                    int i3111111111111111114 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111113 | (i3111111111111111114 & 112));
                    int i3111111111111111115 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111114 & 3670016) | (i3111111111111111112 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111116);
                        objRememberedValue = kVar111111116;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111117);
                        objRememberedValue = kVar111111117;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function11115 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111115);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11115 = orientation;
                    boolean z111119 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11114, orientation11115, z12, z14, composer2, (i3111111111111111114 & 57344) | ((i22 << 3) & 458752)), orientation11115), state, z14, orientation11115, composer2, i3111111111111111115 | ((i22 >> 6) & 896)), r33), state, orientation11115, overscrollEffect11114, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11115, z111119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11115, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z111119;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111116 = i13;
                        z14 = z13;
                        i22 = i21111111116;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111117 = i13;
                        z14 = z13;
                        i22 = i21111111117;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect11115 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111111116 = i22 >> 3;
                    int i3111111111111111117 = i3111111111111111116 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111117 | ((i20 << 3) & 112));
                    int i3111111111111111118 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111117 | (i3111111111111111118 & 112));
                    int i3111111111111111119 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111118 & 3670016) | (i3111111111111111116 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111118);
                        objRememberedValue = kVar111111118;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111119);
                        objRememberedValue = kVar111111119;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function11116 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111119);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11116 = orientation;
                    boolean z1111110 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11115, orientation11116, z12, z14, composer2, (i3111111111111111118 & 57344) | ((i22 << 3) & 458752)), orientation11116), state, z14, orientation11116, composer2, i3111111111111111119 | ((i22 >> 6) & 896)), r33), state, orientation11116, overscrollEffect11115, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11116, z1111110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11116, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1111110;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i19 = 805306368;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111118 = i13;
                    z14 = z13;
                    i22 = i21111111118;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111119 = i13;
                    z14 = z13;
                    i22 = i21111111119;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect11116 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111111111110 = i22 >> 3;
                int i31111111111111111111 = i31111111111111111110 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111 | ((i20 << 3) & 112));
                int i31111111111111111112 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111 | (i31111111111111111112 & 112));
                int i31111111111111111113 = i22 & 112;
                i23 = (i22 & 896) | i31111111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111112 & 3670016) | (i31111111111111111110 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111110);
                    objRememberedValue = kVar1111111110;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111111);
                    objRememberedValue = kVar1111111111;
                }
                composer2.endReplaceableGroup();
                Function2 function11117 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111113);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11117 = orientation;
                boolean z1111111 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11116, orientation11117, z12, z14, composer2, (i31111111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation11117), state, z14, orientation11117, composer2, i31111111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation11117, overscrollEffect11116, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11117, z1111111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11117, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z1111111;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i211111111110 = i13;
                    z14 = z13;
                    i22 = i211111111110;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i211111111111 = i13;
                    z14 = z13;
                    i22 = i211111111111;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect11117 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111111111114 = i22 >> 3;
                int i31111111111111111115 = i31111111111111111114 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111115 | ((i20 << 3) & 112));
                int i31111111111111111116 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111115 | (i31111111111111111116 & 112));
                int i31111111111111111117 = i22 & 112;
                i23 = (i22 & 896) | i31111111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111116 & 3670016) | (i31111111111111111114 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111112);
                    objRememberedValue = kVar1111111112;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111113);
                    objRememberedValue = kVar1111111113;
                }
                composer2.endReplaceableGroup();
                Function2 function11118 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111117);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11118 = orientation;
                boolean z1111112 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11117, orientation11118, z12, z14, composer2, (i31111111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation11118), state, z14, orientation11118, composer2, i31111111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation11118, overscrollEffect11117, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11118, z1111112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11118, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z1111112;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
        }
        i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i13 |= i16;
        if ((i10 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        }
        if ((i12 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i12 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i19 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111111112 = i13;
                            z14 = z13;
                            i22 = i211111111112;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111111113 = i13;
                            z14 = z13;
                            i22 = i211111111113;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect11118 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i31111111111111111118 = i22 >> 3;
                        int i31111111111111111119 = i31111111111111111118 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111119 | ((i20 << 3) & 112));
                        int i311111111111111111110 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111119 | (i311111111111111111110 & 112));
                        int i311111111111111111111 = i22 & 112;
                        i23 = (i22 & 896) | i311111111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111110 & 3670016) | (i31111111111111111118 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1111111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111111114);
                            objRememberedValue = kVar1111111114;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1111111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111111115);
                            objRememberedValue = kVar1111111115;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function11119 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111111);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11119 = orientation;
                        boolean z1111113 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11118, orientation11119, z12, z14, composer2, (i311111111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation11119), state, z14, orientation11119, composer2, i311111111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation11119, overscrollEffect11118, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11119, z1111113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function11119, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1111113;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111111114 = i13;
                            z14 = z13;
                            i22 = i211111111114;
                        } else {
                            if (i27 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i28 != 0) {
                                paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                            } else {
                                paddingValuesM289PaddingValues0680j_4 = paddingValues;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            int i211111111115 = i13;
                            z14 = z13;
                            i22 = i211111111115;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        OverscrollEffect overscrollEffect11119 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                        int i311111111111111111112 = i22 >> 3;
                        int i311111111111111111113 = i311111111111111111112 & 14;
                        function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111113 | ((i20 << 3) & 112));
                        int i311111111111111111114 = i22 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111113 | (i311111111111111111114 & 112));
                        int i311111111111111111115 = i22 & 112;
                        i23 = (i22 & 896) | i311111111111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111114 & 3670016) | (i311111111111111111112 & 29360128);
                        composerStartRestartGroup.startReplaceableGroup(1292704639);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                        }
                        objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i25 = 0;
                        zChanged = false;
                        while (i25 < i24) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                            i25++;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composer2 = composerStartRestartGroup;
                            k kVar1111111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111111116);
                            objRememberedValue = kVar1111111116;
                        } else {
                            composer2 = composerStartRestartGroup;
                            k kVar1111111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                            composer2.updateRememberedValue(kVar1111111117);
                            objRememberedValue = kVar1111111117;
                        }
                        composer2.endReplaceableGroup();
                        Function2 function111110 = (Function2) objRememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        state.setVertical$foundation_release(z11);
                        a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111115);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111110 = orientation;
                        boolean z1111114 = z14;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState11119, orientation111110, z12, z14, composer2, (i311111111111111111114 & 57344) | ((i22 << 3) & 458752)), orientation111110), state, z14, orientation111110, composer2, i311111111111111111115 | ((i22 >> 6) & 896)), r33), state, orientation111110, overscrollEffect11119, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111110, z1111114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z1111114;
                        modifier4 = modifier3;
                        paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
                }
                i19 = 805306368;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i211111111116 = i13;
                        z14 = z13;
                        i22 = i211111111116;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i211111111117 = i13;
                        z14 = z13;
                        i22 = i211111111117;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111110 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111111111111116 = i22 >> 3;
                    int i311111111111111111117 = i311111111111111111116 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111117 | ((i20 << 3) & 112));
                    int i311111111111111111118 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111117 | (i311111111111111111118 & 112));
                    int i311111111111111111119 = i22 & 112;
                    i23 = (i22 & 896) | i311111111111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111118 & 3670016) | (i311111111111111111116 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar1111111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar1111111118);
                        objRememberedValue = kVar1111111118;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar1111111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar1111111119);
                        objRememberedValue = kVar1111111119;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111111 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111119);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111111 = orientation;
                    boolean z1111115 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111110, orientation111111, z12, z14, composer2, (i311111111111111111118 & 57344) | ((i22 << 3) & 458752)), orientation111111), state, z14, orientation111111, composer2, i311111111111111111119 | ((i22 >> 6) & 896)), r33), state, orientation111111, overscrollEffect111110, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111111, z1111115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111111, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1111115;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i211111111118 = i13;
                        z14 = z13;
                        i22 = i211111111118;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i211111111119 = i13;
                        z14 = z13;
                        i22 = i211111111119;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111111 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111111111110 = i22 >> 3;
                    int i3111111111111111111111 = i3111111111111111111110 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111111111 | ((i20 << 3) & 112));
                    int i3111111111111111111112 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111111111 | (i3111111111111111111112 & 112));
                    int i3111111111111111111113 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111111112 & 3670016) | (i3111111111111111111110 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111110);
                        objRememberedValue = kVar11111111110;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111111);
                        objRememberedValue = kVar11111111111;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111112 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111113);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111112 = orientation;
                    boolean z1111116 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111111, orientation111112, z12, z14, composer2, (i3111111111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation111112), state, z14, orientation111112, composer2, i3111111111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation111112, overscrollEffect111111, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111112, z1111116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1111116;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i19 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111110 = i13;
                        z14 = z13;
                        i22 = i2111111111110;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111111 = i13;
                        z14 = z13;
                        i22 = i2111111111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111112 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111111111114 = i22 >> 3;
                    int i3111111111111111111115 = i3111111111111111111114 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111111115 | ((i20 << 3) & 112));
                    int i3111111111111111111116 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111111115 | (i3111111111111111111116 & 112));
                    int i3111111111111111111117 = i22 & 112;
                    i23 = (i22 & 896) | i3111111111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111111116 & 3670016) | (i3111111111111111111114 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111112);
                        objRememberedValue = kVar11111111112;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111113);
                        objRememberedValue = kVar11111111113;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111113 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111117);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111113 = orientation;
                    boolean z1111117 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111112, orientation111113, z12, z14, composer2, (i3111111111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation111113), state, z14, orientation111113, composer2, i3111111111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation111113, overscrollEffect111112, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111113, z1111117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1111117;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111112 = i13;
                        z14 = z13;
                        i22 = i2111111111112;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111113 = i13;
                        z14 = z13;
                        i22 = i2111111111113;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111113 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i3111111111111111111118 = i22 >> 3;
                    int i3111111111111111111119 = i3111111111111111111118 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111111119 | ((i20 << 3) & 112));
                    int i31111111111111111111110 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111111119 | (i31111111111111111111110 & 112));
                    int i31111111111111111111111 = i22 & 112;
                    i23 = (i22 & 896) | i31111111111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111111110 & 3670016) | (i3111111111111111111118 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111114);
                        objRememberedValue = kVar11111111114;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar11111111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar11111111115);
                        objRememberedValue = kVar11111111115;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111114 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111111111);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111114 = orientation;
                    boolean z1111118 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111113, orientation111114, z12, z14, composer2, (i31111111111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation111114), state, z14, orientation111114, composer2, i31111111111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation111114, overscrollEffect111113, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111114, z1111118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111114, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z1111118;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i19 = 805306368;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i2111111111114 = i13;
                    z14 = z13;
                    i22 = i2111111111114;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i2111111111115 = i13;
                    z14 = z13;
                    i22 = i2111111111115;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect111114 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111111111111112 = i22 >> 3;
                int i31111111111111111111113 = i31111111111111111111112 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111113 | ((i20 << 3) & 112));
                int i31111111111111111111114 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111113 | (i31111111111111111111114 & 112));
                int i31111111111111111111115 = i22 & 112;
                i23 = (i22 & 896) | i31111111111111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111111114 & 3670016) | (i31111111111111111111112 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar11111111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar11111111116);
                    objRememberedValue = kVar11111111116;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar11111111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar11111111117);
                    objRememberedValue = kVar11111111117;
                }
                composer2.endReplaceableGroup();
                Function2 function111115 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111111115);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111115 = orientation;
                boolean z1111119 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111114, orientation111115, z12, z14, composer2, (i31111111111111111111114 & 57344) | ((i22 << 3) & 458752)), orientation111115), state, z14, orientation111115, composer2, i31111111111111111111115 | ((i22 >> 6) & 896)), r33), state, orientation111115, overscrollEffect111114, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111115, z1111119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111115, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z1111119;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i2111111111116 = i13;
                    z14 = z13;
                    i22 = i2111111111116;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i2111111111117 = i13;
                    z14 = z13;
                    i22 = i2111111111117;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect111115 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111111111111116 = i22 >> 3;
                int i31111111111111111111117 = i31111111111111111111116 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111117 | ((i20 << 3) & 112));
                int i31111111111111111111118 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111117 | (i31111111111111111111118 & 112));
                int i31111111111111111111119 = i22 & 112;
                i23 = (i22 & 896) | i31111111111111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111111118 & 3670016) | (i31111111111111111111116 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar11111111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar11111111118);
                    objRememberedValue = kVar11111111118;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar11111111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar11111111119);
                    objRememberedValue = kVar11111111119;
                }
                composer2.endReplaceableGroup();
                Function2 function111116 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111111119);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111116 = orientation;
                boolean z11111110 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111115, orientation111116, z12, z14, composer2, (i31111111111111111111118 & 57344) | ((i22 << 3) & 458752)), orientation111116), state, z14, orientation111116, composer2, i31111111111111111111119 | ((i22 >> 6) & 896)), r33), state, orientation111116, overscrollEffect111115, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111116, z11111110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111116, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11111110;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
        }
        i13 |= 12582912;
        if ((i12 & 256) != 0) {
            if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(verticalArrangement)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i19 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111118 = i13;
                        z14 = z13;
                        i22 = i2111111111118;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i2111111111119 = i13;
                        z14 = z13;
                        i22 = i2111111111119;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111116 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111111111111111110 = i22 >> 3;
                    int i311111111111111111111111 = i311111111111111111111110 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111111111 | ((i20 << 3) & 112));
                    int i311111111111111111111112 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111111111 | (i311111111111111111111112 & 112));
                    int i311111111111111111111113 = i22 & 112;
                    i23 = (i22 & 896) | i311111111111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111111112 & 3670016) | (i311111111111111111111110 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111111110);
                        objRememberedValue = kVar111111111110;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111111111);
                        objRememberedValue = kVar111111111111;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111117 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111111113);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111117 = orientation;
                    boolean z11111111 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111116, orientation111117, z12, z14, composer2, (i311111111111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation111117), state, z14, orientation111117, composer2, i311111111111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation111117, overscrollEffect111116, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111117, z11111111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11111111;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111111110 = i13;
                        z14 = z13;
                        i22 = i21111111111110;
                    } else {
                        if (i27 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                        } else {
                            paddingValuesM289PaddingValues0680j_4 = paddingValues;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        int i21111111111111 = i13;
                        z14 = z13;
                        i22 = i21111111111111;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    OverscrollEffect overscrollEffect111117 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                    int i311111111111111111111114 = i22 >> 3;
                    int i311111111111111111111115 = i311111111111111111111114 & 14;
                    function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111111115 | ((i20 << 3) & 112));
                    int i311111111111111111111116 = i22 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111111115 | (i311111111111111111111116 & 112));
                    int i311111111111111111111117 = i22 & 112;
                    i23 = (i22 & 896) | i311111111111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111111116 & 3670016) | (i311111111111111111111114 & 29360128);
                    composerStartRestartGroup.startReplaceableGroup(1292704639);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                    }
                    objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i25 = 0;
                    zChanged = false;
                    while (i25 < i24) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                        i25++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        composer2 = composerStartRestartGroup;
                        k kVar111111111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111111112);
                        objRememberedValue = kVar111111111112;
                    } else {
                        composer2 = composerStartRestartGroup;
                        k kVar111111111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                        composer2.updateRememberedValue(kVar111111111113);
                        objRememberedValue = kVar111111111113;
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111118 = (Function2) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    state.setVertical$foundation_release(z11);
                    a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111111117);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111118 = orientation;
                    boolean z11111112 = z14;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111117, orientation111118, z12, z14, composer2, (i311111111111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation111118), state, z14, orientation111118, composer2, i311111111111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation111118, overscrollEffect111117, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111118, z11111112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z11111112;
                    modifier4 = modifier3;
                    paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
            }
            i19 = 805306368;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111112 = i13;
                    z14 = z13;
                    i22 = i21111111111112;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111113 = i13;
                    z14 = z13;
                    i22 = i21111111111113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect111118 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i311111111111111111111118 = i22 >> 3;
                int i311111111111111111111119 = i311111111111111111111118 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i311111111111111111111119 | ((i20 << 3) & 112));
                int i3111111111111111111111110 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i311111111111111111111119 | (i3111111111111111111111110 & 112));
                int i3111111111111111111111111 = i22 & 112;
                i23 = (i22 & 896) | i3111111111111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111111111110 & 3670016) | (i311111111111111111111118 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111114);
                    objRememberedValue = kVar111111111114;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111115);
                    objRememberedValue = kVar111111111115;
                }
                composer2.endReplaceableGroup();
                Function2 function111119 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111111111);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111119 = orientation;
                boolean z11111113 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111118, orientation111119, z12, z14, composer2, (i3111111111111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation111119), state, z14, orientation111119, composer2, i3111111111111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation111119, overscrollEffect111118, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111119, z11111113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function111119, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11111113;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111114 = i13;
                    z14 = z13;
                    i22 = i21111111111114;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111115 = i13;
                    z14 = z13;
                    i22 = i21111111111115;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect111119 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i3111111111111111111111112 = i22 >> 3;
                int i3111111111111111111111113 = i3111111111111111111111112 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111111111113 | ((i20 << 3) & 112));
                int i3111111111111111111111114 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111111111113 | (i3111111111111111111111114 & 112));
                int i3111111111111111111111115 = i22 & 112;
                i23 = (i22 & 896) | i3111111111111111111111115 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111111111114 & 3670016) | (i3111111111111111111111112 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111116 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111116);
                    objRememberedValue = kVar111111111116;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111117 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111117);
                    objRememberedValue = kVar111111111117;
                }
                composer2.endReplaceableGroup();
                Function2 function1111110 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111111115);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111110 = orientation;
                boolean z11111114 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState111119, orientation1111110, z12, z14, composer2, (i3111111111111111111111114 & 57344) | ((i22 << 3) & 458752)), orientation1111110), state, z14, orientation1111110, composer2, i3111111111111111111111115 | ((i22 >> 6) & 896)), r33), state, orientation1111110, overscrollEffect111119, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111110, z11111114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111110, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11111114;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
        }
        i18 = 100663296;
        i13 |= i18;
        if ((i12 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changed(horizontalArrangement)) {
                    i19 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i19 = 268435456;
                }
            }
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111116 = i13;
                    z14 = z13;
                    i22 = i21111111111116;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111117 = i13;
                    z14 = z13;
                    i22 = i21111111111117;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect1111110 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i3111111111111111111111116 = i22 >> 3;
                int i3111111111111111111111117 = i3111111111111111111111116 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i3111111111111111111111117 | ((i20 << 3) & 112));
                int i3111111111111111111111118 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i3111111111111111111111117 | (i3111111111111111111111118 & 112));
                int i3111111111111111111111119 = i22 & 112;
                i23 = (i22 & 896) | i3111111111111111111111119 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i3111111111111111111111118 & 3670016) | (i3111111111111111111111116 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111118 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111118);
                    objRememberedValue = kVar111111111118;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar111111111119 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar111111111119);
                    objRememberedValue = kVar111111111119;
                }
                composer2.endReplaceableGroup();
                Function2 function1111111 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i3111111111111111111111119);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111111 = orientation;
                boolean z11111115 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1111110, orientation1111111, z12, z14, composer2, (i3111111111111111111111118 & 57344) | ((i22 << 3) & 458752)), orientation1111111), state, z14, orientation1111111, composer2, i3111111111111111111111119 | ((i22 >> 6) & 896)), r33), state, orientation1111111, overscrollEffect1111110, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111111, z11111115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11111115;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111118 = i13;
                    z14 = z13;
                    i22 = i21111111111118;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                    } else {
                        paddingValuesM289PaddingValues0680j_4 = paddingValues;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    int i21111111111119 = i13;
                    z14 = z13;
                    i22 = i21111111111119;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                OverscrollEffect overscrollEffect1111111 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
                int i31111111111111111111111110 = i22 >> 3;
                int i31111111111111111111111111 = i31111111111111111111111110 & 14;
                function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111111111 | ((i20 << 3) & 112));
                int i31111111111111111111111112 = i22 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111111111 | (i31111111111111111111111112 & 112));
                int i31111111111111111111111113 = i22 & 112;
                i23 = (i22 & 896) | i31111111111111111111111113 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111111111112 & 3670016) | (i31111111111111111111111110 & 29360128);
                composerStartRestartGroup.startReplaceableGroup(1292704639);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
                }
                objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i25 = 0;
                zChanged = false;
                while (i25 < i24) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                    i25++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111111110 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111111110);
                    objRememberedValue = kVar1111111111110;
                } else {
                    composer2 = composerStartRestartGroup;
                    k kVar1111111111111 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                    composer2.updateRememberedValue(kVar1111111111111);
                    objRememberedValue = kVar1111111111111;
                }
                composer2.endReplaceableGroup();
                Function2 function1111112 = (Function2) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                state.setVertical$foundation_release(z11);
                a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111111111113);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111112 = orientation;
                boolean z11111116 = z14;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1111111, orientation1111112, z12, z14, composer2, (i31111111111111111111111112 & 57344) | ((i22 << 3) & 458752)), orientation1111112), state, z14, orientation1111112, composer2, i31111111111111111111111113 | ((i22 >> 6) & 896)), r33), state, orientation1111112, overscrollEffect1111111, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111112, z11111116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111112, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z11111116;
                modifier4 = modifier3;
                paddingValues2 = paddingValuesM289PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
        }
        i19 = 805306368;
        i13 |= i19;
        if ((i12 & 1024) != 0) {
            i20 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i11 | i21;
        } else {
            i20 = i11;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                int i211111111111110 = i13;
                z14 = z13;
                i22 = i211111111111110;
            } else {
                if (i27 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                int i211111111111111 = i13;
                z14 = z13;
                i22 = i211111111111111;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            OverscrollEffect overscrollEffect1111112 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
            int i31111111111111111111111114 = i22 >> 3;
            int i31111111111111111111111115 = i31111111111111111111111114 & 14;
            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111111115 | ((i20 << 3) & 112));
            int i31111111111111111111111116 = i22 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111111115 | (i31111111111111111111111116 & 112));
            int i31111111111111111111111117 = i22 & 112;
            i23 = (i22 & 896) | i31111111111111111111111117 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i31111111111111111111111116 & 3670016) | (i31111111111111111111111114 & 29360128);
            composerStartRestartGroup.startReplaceableGroup(1292704639);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
            }
            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i25 = 0;
            zChanged = false;
            while (i25 < i24) {
                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                i25++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                composer2 = composerStartRestartGroup;
                k kVar1111111111112 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                composer2.updateRememberedValue(kVar1111111111112);
                objRememberedValue = kVar1111111111112;
            } else {
                composer2 = composerStartRestartGroup;
                k kVar1111111111113 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                composer2.updateRememberedValue(kVar1111111111113);
                objRememberedValue = kVar1111111111113;
            }
            composer2.endReplaceableGroup();
            Function2 function1111113 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            state.setVertical$foundation_release(z11);
            a(function0RememberLazyGridItemProviderLambda, state, composer2, i31111111111111111111111117);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111113 = orientation;
            boolean z11111117 = z14;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1111112, orientation1111113, z12, z14, composer2, (i31111111111111111111111116 & 57344) | ((i22 << 3) & 458752)), orientation1111113), state, z14, orientation1111113, composer2, i31111111111111111111111117 | ((i22 >> 6) & 896)), r33), state, orientation1111113, overscrollEffect1111112, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111113, z11111117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111113, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z11111117;
            modifier4 = modifier3;
            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                int i211111111111112 = i13;
                z14 = z13;
                i22 = i211111111111112;
            } else {
                if (i27 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
                } else {
                    paddingValuesM289PaddingValues0680j_4 = paddingValues;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                int i211111111111113 = i13;
                z14 = z13;
                i22 = i211111111111113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            OverscrollEffect overscrollEffect1111113 = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
            int i31111111111111111111111118 = i22 >> 3;
            int i31111111111111111111111119 = i31111111111111111111111118 & 14;
            function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i31111111111111111111111119 | ((i20 << 3) & 112));
            int i311111111111111111111111110 = i22 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z14, composerStartRestartGroup, i31111111111111111111111119 | (i311111111111111111111111110 & 112));
            int i311111111111111111111111111 = i22 & 112;
            i23 = (i22 & 896) | i311111111111111111111111111 | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i311111111111111111111111110 & 3670016) | (i31111111111111111111111118 & 29360128);
            composerStartRestartGroup.startReplaceableGroup(1292704639);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292704639, i23, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
            }
            objArr = new Object[]{state, slots, paddingValuesM289PaddingValues0680j_4, Boolean.valueOf(z14), Boolean.valueOf(z11), horizontalArrangement, verticalArrangement};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i25 = 0;
            zChanged = false;
            while (i25 < i24) {
                zChanged |= composerStartRestartGroup.changed(objArr[i25]);
                i25++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                composer2 = composerStartRestartGroup;
                k kVar1111111111114 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                composer2.updateRememberedValue(kVar1111111111114);
                objRememberedValue = kVar1111111111114;
            } else {
                composer2 = composerStartRestartGroup;
                k kVar1111111111115 = new k(z11, paddingValuesM289PaddingValues0680j_4, z14, function0RememberLazyGridItemProviderLambda, slots, state, verticalArrangement, horizontalArrangement);
                composer2.updateRememberedValue(kVar1111111111115);
                objRememberedValue = kVar1111111111115;
            }
            composer2.endReplaceableGroup();
            Function2 function1111114 = (Function2) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            state.setVertical$foundation_release(z11);
            a(function0RememberLazyGridItemProviderLambda, state, composer2, i311111111111111111111111111);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111114 = orientation;
            boolean z11111118 = z14;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState1111113, orientation1111114, z12, z14, composer2, (i311111111111111111111111110 & 57344) | ((i22 << 3) & 458752)), orientation1111114), state, z14, orientation1111114, composer2, i311111111111111111111111111 | ((i22 >> 6) & 896)), r33), state, orientation1111114, overscrollEffect1111113, z12, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111114, z11111118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), (Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult>) function1111114, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z11111118;
            modifier4 = modifier3;
            paddingValues2 = paddingValuesM289PaddingValues0680j_4;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, state, slots, paddingValues2, z15, z11, flingBehavior3, z12, verticalArrangement, horizontalArrangement, content, i10, i11, i12));
    }

    @Composable
    public static final void a(Function0<? extends LazyGridItemProvider> function0, LazyGridState lazyGridState, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649335720);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649335720, i10, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:138)");
            }
            LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
            if (lazyGridItemProviderInvoke.getItemCount() > 0) {
                LazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyGridState, lazyGridItemProviderInvoke, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, lazyGridState, i10));
    }
}
