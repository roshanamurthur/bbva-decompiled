package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 {

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f12786p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f12787q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ExposedDropdownMenuBoxScope f12788r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12789s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f12790t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12791u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f12786p0 = mutableTransitionState;
            this.f12787q0 = mutableState;
            this.f12788r0 = exposedDropdownMenuBoxScope;
            this.f12789s0 = modifier;
            this.f12790t0 = function3;
            this.f12791u0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(395026654, iIntValue, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:275)");
                }
                MenuKt.DropdownMenuContent(this.f12786p0, this.f12787q0, e1.b(this.f12788r0, this.f12789s0, false, 1, null), this.f12790t0, composer2, MutableTransitionState.$stable | 48 | (this.f12791u0 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ExposedDropdownMenuBoxScope f12792p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f12793q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12794r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12795s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f12796t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12797u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z10, Function0<Unit> function0, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f12792p0 = exposedDropdownMenuBoxScope;
            this.f12793q0 = z10;
            this.f12794r0 = function0;
            this.f12795s0 = modifier;
            this.f12796t0 = function3;
            this.f12797u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f12792p0.ExposedDropdownMenu(this.f12793q0, this.f12794r0, this.f12795s0, this.f12796t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12797u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class c extends Lambda implements Function2<IntRect, IntRect, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f12798p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<TransformOrigin> mutableState) {
            super(2);
            this.f12798p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(IntRect intRect, IntRect intRect2) {
            IntRect anchorBounds = intRect;
            IntRect menuBounds = intRect2;
            Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
            this.f12798p0.setValue(TransformOrigin.m2832boximpl(MenuKt.calculateTransformOrigin(anchorBounds, menuBounds)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static void a(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z10, @NotNull Function0 onDismissRequest, @Nullable Modifier modifier, @NotNull Function3 content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1658683708);
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
            i12 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
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
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(exposedDropdownMenuBoxScope)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    long jM4460getZeroRKDOV3M = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new c(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M, density, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 395026654, true, new a(mutableTransitionState, mutableState, exposedDropdownMenuBoxScope, modifier3, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composerStartRestartGroup = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(exposedDropdownMenuBoxScope, z10, onDismissRequest, modifier4, content, i10, i11));
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
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changed(exposedDropdownMenuBoxScope)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((46811 & i12) == 9362) {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M2 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M2, density2, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 395026654, true, new a(mutableTransitionState, mutableState, exposedDropdownMenuBoxScope, modifier3, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M3 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M3, density3, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 395026654, true, new a(mutableTransitionState, mutableState, exposedDropdownMenuBoxScope, modifier3, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M4 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M4, density4, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 395026654, true, new a(mutableTransitionState, mutableState, exposedDropdownMenuBoxScope, modifier3, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M5 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M5, density5, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 395026654, true, new a(mutableTransitionState, mutableState, exposedDropdownMenuBoxScope, modifier3, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(exposedDropdownMenuBoxScope, z10, onDismissRequest, modifier4, content, i10, i11));
    }

    public static /* synthetic */ Modifier b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z10);
    }
}
