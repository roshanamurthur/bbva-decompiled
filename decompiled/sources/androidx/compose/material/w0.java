package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
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
import androidx.profileinstaller.ProfileVerifier;
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
public final /* synthetic */ class w0 {

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f9076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f9077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f9078r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ExposedDropdownMenuBoxScope f9079s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9080t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9081u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ScrollState scrollState, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f9076p0 = mutableTransitionState;
            this.f9077q0 = mutableState;
            this.f9078r0 = scrollState;
            this.f9079s0 = exposedDropdownMenuBoxScope;
            this.f9080t0 = modifier;
            this.f9081u0 = function3;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1167205969, iIntValue, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:264)");
                }
                MutableTransitionState<Boolean> mutableTransitionState = this.f9076p0;
                MutableState<TransformOrigin> mutableState = this.f9077q0;
                ScrollState scrollState = this.f9078r0;
                Modifier modifierC = w0.c(this.f9079s0, this.f9080t0, false, 1, null);
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f9081u0;
                int i10 = MutableTransitionState.$stable | 48;
                int i11 = this.v0;
                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, modifierC, function3, composer2, i10 | ((i11 >> 3) & 896) | (i11 & 57344), 0);
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
        public final /* synthetic */ ExposedDropdownMenuBoxScope f9082p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f9083q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9084r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9085s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f9086t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9087u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9088w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z10, Function0<Unit> function0, Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9082p0 = exposedDropdownMenuBoxScope;
            this.f9083q0 = z10;
            this.f9084r0 = function0;
            this.f9085s0 = modifier;
            this.f9086t0 = scrollState;
            this.f9087u0 = function3;
            this.v0 = i10;
            this.f9088w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f9082p0.ExposedDropdownMenu(this.f9083q0, this.f9084r0, this.f9085s0, this.f9086t0, this.f9087u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9088w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class c extends Lambda implements Function2<IntRect, IntRect, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f9089p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<TransformOrigin> mutableState) {
            super(2);
            this.f9089p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(IntRect intRect, IntRect intRect2) {
            IntRect parentBounds = intRect;
            IntRect menuBounds = intRect2;
            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
            this.f9089p0.setValue(TransformOrigin.m2832boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0167  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static void a(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z10, @NotNull Function0 onDismissRequest, @Nullable Modifier modifier, @Nullable ScrollState scrollState, @NotNull Function3 content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        ScrollState scrollState2;
        int i13;
        int i14;
        Modifier modifier3;
        Modifier modifier4;
        ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        Modifier modifier5;
        ScrollState scrollState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1081438217);
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
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    scrollState2 = scrollState;
                    int i16 = composerStartRestartGroup.changed(scrollState2) ? 2048 : 1024;
                    i12 |= i16;
                } else {
                    scrollState2 = scrollState;
                }
                i12 |= i16;
            } else {
                scrollState2 = scrollState;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((i11 & 32) != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(exposedDropdownMenuBoxScope)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        modifier4 = modifier3;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    } else {
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1081438217, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:232)");
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
                        ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M, density, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    scrollState3 = scrollStateRememberScrollState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    modifier4 = modifier2;
                }
                scrollStateRememberScrollState = scrollState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1081438217, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:232)");
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
                    ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M2, density2, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
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
                    ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M3, density3, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                scrollState3 = scrollStateRememberScrollState;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                scrollState3 = scrollState2;
                composerStartRestartGroup = composerStartRestartGroup;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(exposedDropdownMenuBoxScope, z10, onDismissRequest, modifier5, scrollState3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                scrollState2 = scrollState;
                if (composerStartRestartGroup.changed(scrollState2)) {
                }
                i12 |= i16;
            } else {
                scrollState2 = scrollState;
            }
            i12 |= i16;
        } else {
            scrollState2 = scrollState;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((i11 & 32) != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i10) == 0) {
            if (composerStartRestartGroup.changed(exposedDropdownMenuBoxScope)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                } else {
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = scrollState2;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                } else {
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = scrollState2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081438217, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:232)");
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
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M4, density4, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
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
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M5, density5, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            scrollState3 = scrollStateRememberScrollState;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                } else {
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = scrollState2;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                } else {
                    modifier4 = modifier3;
                    scrollStateRememberScrollState = scrollState2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081438217, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:232)");
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
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M6 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
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
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M6, density6, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long jM4460getZeroRKDOV3M7 = DpOffset.INSTANCE.m4460getZeroRKDOV3M();
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
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(jM4460getZeroRKDOV3M7, density7, (Function2) objRememberedValue3, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1167205969, true, new a(mutableTransitionState, mutableState, scrollStateRememberScrollState, exposedDropdownMenuBoxScope, modifier4, content, i12)), composerStartRestartGroup, ((i12 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            scrollState3 = scrollStateRememberScrollState;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(exposedDropdownMenuBoxScope, z10, onDismissRequest, modifier5, scrollState3, content, i10, i11));
    }

    public static /* synthetic */ Modifier c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z10);
    }
}
