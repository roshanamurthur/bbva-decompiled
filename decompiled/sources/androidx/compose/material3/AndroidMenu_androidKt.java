package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.logs.LogKeysKt;
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

/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", LogKeysKt.PROPERTIES, "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n154#2:162\n25#3:163\n25#3:170\n36#3:178\n25#3:185\n1114#4,6:164\n1114#4,6:171\n1114#4,6:179\n1114#4,6:186\n76#5:177\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n*L\n78#1:162\n82#1:163\n86#1:170\n91#1:178\n147#1:185\n82#1:164,6\n86#1:171,6\n91#1:179,6\n147#1:186,6\n87#1:177\n*E\n"})
public final class AndroidMenu_androidKt {

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f9216p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f9217q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9218r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9219s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9220t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f9216p0 = mutableTransitionState;
            this.f9217q0 = mutableState;
            this.f9218r0 = modifier;
            this.f9219s0 = function3;
            this.f9220t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1192563503, iIntValue, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                }
                MutableTransitionState<Boolean> mutableTransitionState = this.f9216p0;
                MutableState<TransformOrigin> mutableState = this.f9217q0;
                Modifier modifier = this.f9218r0;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f9219s0;
                int i10 = MutableTransitionState.$stable | 48;
                int i11 = this.f9220t0;
                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, modifier, function3, composer2, i10 | (i11 & 896) | ((i11 >> 6) & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f9221p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9222q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9223r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f9224s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f9225t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9226u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9227w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, Function0<Unit> function0, Modifier modifier, long j10, PopupProperties popupProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9221p0 = z10;
            this.f9222q0 = function0;
            this.f9223r0 = modifier;
            this.f9224s0 = j10;
            this.f9225t0 = popupProperties;
            this.f9226u0 = function3;
            this.v0 = i10;
            this.f9227w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidMenu_androidKt.m908DropdownMenuILWXrKs(this.f9221p0, this.f9222q0, this.f9223r0, this.f9224s0, this.f9225t0, this.f9226u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9227w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class c extends Lambda implements Function2<IntRect, IntRect, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f9228p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<TransformOrigin> mutableState) {
            super(2);
            this.f9228p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(IntRect intRect, IntRect intRect2) {
            IntRect parentBounds = intRect;
            IntRect menuBounds = intRect2;
            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
            this.f9228p0.setValue(TransformOrigin.m2832boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9229p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9230q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9231r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9232s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9233t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f9234u0;
        public final /* synthetic */ MenuItemColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f9235w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f9236x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9237y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, boolean z10, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f9229p0 = function2;
            this.f9230q0 = function0;
            this.f9231r0 = modifier;
            this.f9232s0 = function3;
            this.f9233t0 = function4;
            this.f9234u0 = z10;
            this.v0 = menuItemColors;
            this.f9235w0 = paddingValues;
            this.f9236x0 = mutableInteractionSource;
            this.f9237y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidMenu_androidKt.DropdownMenuItem(this.f9229p0, this.f9230q0, this.f9231r0, this.f9232s0, this.f9233t0, this.f9234u0, this.v0, this.f9235w0, this.f9236x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9237y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x0144  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final void m908DropdownMenuILWXrKs(boolean z10, @NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, long j10, @Nullable PopupProperties popupProperties, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        long jM4410DpOffsetYgX7TsA;
        int i14;
        int i15;
        PopupProperties popupProperties2;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        long j11;
        PopupProperties popupProperties3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(354826666);
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
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
                jM4410DpOffsetYgX7TsA = j10;
            } else {
                jM4410DpOffsetYgX7TsA = j10;
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(jM4410DpOffsetYgX7TsA)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    i18 = i12;
                    if ((374491 & i18) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f6 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new c(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j11 = jM4410DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        j11 = jM4410DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                i18 = i12;
                if ((374491 & i18) == 74898) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f10 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density2, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density3, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f11 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density4, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density5, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
            }
            i12 |= 24576;
            popupProperties2 = popupProperties;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12;
                if ((374491 & i18) == 74898) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f12 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density6, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density7, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f13 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f13), Dp.m4389constructorimpl(f13));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density8, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density9, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            i18 = i12;
            if ((374491 & i18) == 74898) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f14 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f14), Dp.m4389constructorimpl(f14));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density10, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density11, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f15 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f15), Dp.m4389constructorimpl(f15));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density12, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density13, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
            jM4410DpOffsetYgX7TsA = j10;
        } else {
            jM4410DpOffsetYgX7TsA = j10;
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(jM4410DpOffsetYgX7TsA)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12;
                if ((374491 & i18) == 74898) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f16 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f16), Dp.m4389constructorimpl(f16));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density14, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density15, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f17 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f17), Dp.m4389constructorimpl(f17));
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density16, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density17, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = jM4410DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            i18 = i12;
            if ((374491 & i18) == 74898) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f18 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f18), Dp.m4389constructorimpl(f18));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density18, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density19, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f19 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f19), Dp.m4389constructorimpl(f19));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density110, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density111, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
        }
        i12 |= 24576;
        popupProperties2 = popupProperties;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            i18 = i12;
            if ((374491 & i18) == 74898) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f110 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f110), Dp.m4389constructorimpl(f110));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density112, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density113, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f111 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f111), Dp.m4389constructorimpl(f111));
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density114, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density115, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j11 = jM4410DpOffsetYgX7TsA;
                popupProperties3 = popupProperties2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i17;
        i18 = i12;
        if ((374491 & i18) == 74898) {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                float f112 = 0;
                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f112), Dp.m4389constructorimpl(f112));
            }
            if (i15 != 0) {
                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density116, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density117, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j11 = jM4410DpOffsetYgX7TsA;
            popupProperties3 = popupProperties2;
            modifier4 = modifier3;
        } else {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                float f113 = 0;
                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f113), Dp.m4389constructorimpl(f113));
            }
            if (i15 != 0) {
                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354826666, i18, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density118, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
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
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(jM4410DpOffsetYgX7TsA, density119, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1192563503, true, new a(mutableTransitionState, mutableState, modifier3, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 6) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j11 = jM4410DpOffsetYgX7TsA;
            popupProperties3 = popupProperties2;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onDismissRequest, modifier4, j11, popupProperties3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0168  */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:144:0x022a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0241  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItem(@NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @Nullable MenuItemColors menuItemColors, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function5;
        boolean z12;
        MenuItemColors menuItemColorsM1168itemColors5tl4gsc;
        PaddingValues dropdownMenuItemContentPadding;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        boolean z13;
        MenuItemColors menuItemColors2;
        Object objRememberedValue;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        boolean z14;
        MenuItemColors menuItemColors3;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1826340448);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i24 = i11 & 4;
        if (i24 == 0) {
            if ((i10 & 896) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        function4 = function3;
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((i10 & 458752) == 0) {
                            z11 = z10;
                            if (composerStartRestartGroup.changed(z11)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(menuItemColors)) {
                                i23 = 524288;
                            } else {
                                i23 = 1048576;
                            }
                            i12 |= i23;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 256;
                        if (i21 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 234881024) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i22 = 33554432;
                            }
                            i12 |= i22;
                        }
                        if ((i12 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                } else {
                                    function5 = function2;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function10 = i15 == 0 ? function4 : null;
                                if (i17 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if ((i11 & 64) != 0) {
                                    menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                                }
                                if (i19 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i21 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                function6 = function5;
                                function7 = function10;
                                z13 = z12;
                                menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                function6 = function2;
                                menuItemColors2 = menuItemColors;
                                dropdownMenuItemContentPadding = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                                function7 = function4;
                                z13 = z11;
                                modifier2 = modifier;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                            }
                            MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            function8 = function6;
                            function9 = function7;
                            z14 = z13;
                            menuItemColors3 = menuItemColors2;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function8 = function2;
                            menuItemColors3 = menuItemColors;
                            mutableInteractionSource3 = mutableInteractionSource;
                            function9 = function4;
                            z14 = z11;
                            paddingValues2 = paddingValues;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z11 = z10;
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
                }
                i12 |= 24576;
                function4 = function3;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= 3072;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= 24576;
            function4 = function3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                            }
                            if (i19 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i21 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            function6 = function5;
                            function7 = function10;
                            z13 = z12;
                            menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        z14 = z13;
                        menuItemColors3 = menuItemColors2;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= 24576;
            function4 = function3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
        }
        i12 |= 3072;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                        }
                        if (i19 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i21 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function6 = function5;
                        function7 = function10;
                        z13 = z12;
                        menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    z14 = z13;
                    menuItemColors3 = menuItemColors2;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
        }
        i12 |= 24576;
        function4 = function3;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((i10 & 458752) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                    }
                    if (i19 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i21 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function6 = function5;
                    function7 = function10;
                    z13 = z12;
                    menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                z14 = z13;
                menuItemColors3 = menuItemColors2;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z11 = z10;
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        }
        if ((i12 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                }
                if (i19 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i21 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function6 = function5;
                function7 = function10;
                z13 = z12;
                menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                }
                if (i19 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i21 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function6 = function5;
                function7 = function10;
                z13 = z12;
                menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
            }
            MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function6;
            function9 = function7;
            z14 = z13;
            menuItemColors3 = menuItemColors2;
            paddingValues2 = dropdownMenuItemContentPadding;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                }
                if (i19 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i21 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function6 = function5;
                function7 = function10;
                z13 = z12;
                menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    menuItemColorsM1168itemColors5tl4gsc = MenuDefaults.INSTANCE.m1168itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    menuItemColorsM1168itemColors5tl4gsc = menuItemColors;
                }
                if (i19 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i21 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function6 = function5;
                function7 = function10;
                z13 = z12;
                menuItemColors2 = menuItemColorsM1168itemColors5tl4gsc;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
            }
            MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function6, function7, z13, menuItemColors2, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function6;
            function9 = function7;
            z14 = z13;
            menuItemColors3 = menuItemColors2;
            paddingValues2 = dropdownMenuItemContentPadding;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(text, onClick, modifier3, function8, function9, z14, menuItemColors3, paddingValues2, mutableInteractionSource3, i10, i11));
    }
}
