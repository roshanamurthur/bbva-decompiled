package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n50#2:243\n49#2:244\n1097#3,6:235\n1097#3,6:245\n75#4:241\n75#4:254\n154#5:242\n154#5:251\n154#5:252\n154#5:253\n154#5:255\n154#5:256\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n116#1:243\n116#1:244\n79#1:235,6\n116#1:245,6\n83#1:241\n230#1:254\n83#1:242\n227#1:251\n228#1:252\n229#1:253\n231#1:255\n232#1:256\n*E\n"})
public final class RadioButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7564a = Dp.m4389constructorimpl(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f7569f;

    /* JADX INFO: compiled from: RadioButton.kt */
    @SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n*L\n124#1:234\n*E\n"})
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f7570p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f7571q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(State<Color> state, State<Dp> state2) {
            super(1);
            this.f7570p0 = state;
            this.f7571q0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fMo415toPx0680j_4 = Canvas.mo415toPx0680j_4(RadioButtonKt.f7569f);
            State<Color> state = this.f7570p0;
            float f6 = fMo415toPx0680j_4 / 2;
            a1.b.x(Canvas, state.getValue().m2518unboximpl(), Canvas.mo415toPx0680j_4(RadioButtonKt.f7567d) - f6, 0L, 0.0f, new Stroke(fMo415toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            State<Dp> state2 = this.f7571q0;
            if (Dp.m4388compareTo0680j_4(state2.getValue().m4403unboximpl(), Dp.m4389constructorimpl(0)) > 0) {
                a1.b.x(Canvas, state.getValue().m2518unboximpl(), Canvas.mo415toPx0680j_4(state2.getValue().m4403unboximpl()) - f6, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RadioButton.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7572p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7573q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7574r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7575s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7576t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ RadioButtonColors f7577u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7578w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Function0<Unit> function0, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, int i10, int i11) {
            super(2);
            this.f7572p0 = z10;
            this.f7573q0 = function0;
            this.f7574r0 = modifier;
            this.f7575s0 = z11;
            this.f7576t0 = mutableInteractionSource;
            this.f7577u0 = radioButtonColors;
            this.v0 = i10;
            this.f7578w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RadioButtonKt.RadioButton(this.f7572p0, this.f7573q0, this.f7574r0, this.f7575s0, this.f7576t0, this.f7577u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7578w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 2;
        f7565b = Dp.m4389constructorimpl(f6);
        float fM4389constructorimpl = Dp.m4389constructorimpl(20);
        f7566c = fM4389constructorimpl;
        f7567d = Dp.m4389constructorimpl(fM4389constructorimpl / f6);
        f7568e = Dp.m4389constructorimpl(12);
        f7569f = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x014f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0183  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x0209  */
    /* JADX WARN: Code duplicated, block: B:118:0x0211  */
    /* JADX WARN: Code duplicated, block: B:121:0x0227  */
    /* JADX WARN: Code duplicated, block: B:126:0x0236  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void RadioButton(boolean z10, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable RadioButtonColors radioButtonColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        RadioButtonColors radioButtonColors2;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        RadioButtonColors radioButtonColorsM811colorsRGew2ao;
        Object objRememberedValue;
        float fM4389constructorimpl;
        State<Dp> stateM67animateDpAsStateAjpBEmI;
        State<Color> stateRadioColor;
        boolean z14;
        Modifier modifierM458selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean zChanged;
        Object objRememberedValue2;
        RadioButtonColors radioButtonColors3;
        boolean z15;
        MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314435585);
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
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            int i18 = composerStartRestartGroup.changed(radioButtonColors2) ? 131072 : 65536;
                            i12 |= i18;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i12 |= i18;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                                radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                            }
                            if (z10) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                            int i19 = i12 >> 9;
                            stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i19 & 14) | (i19 & 896));
                            composerStartRestartGroup.startReplaceableGroup(1941632354);
                            if (function0 != null) {
                                z14 = z13;
                                modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                            } else {
                                z14 = z13;
                                modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function0 != null) {
                                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                            }
                            Modifier modifierM327requiredSize3ABfNKs = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                            z15 = z14;
                            mutableInteractionSource5 = mutableInteractionSource4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            modifier4 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                        }
                        if (z10) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        int i110 = i12 >> 9;
                        stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i110 & 14) | (i110 & 896));
                        composerStartRestartGroup.startReplaceableGroup(1941632354);
                        if (function0 != null) {
                            z14 = z13;
                            modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                        } else {
                            z14 = z13;
                            modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierM327requiredSize3ABfNKs2 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM327requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                        z15 = z14;
                        mutableInteractionSource5 = mutableInteractionSource4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composerStartRestartGroup = composerStartRestartGroup;
                        z15 = z12;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors3 = radioButtonColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i12 |= i18;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i111 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i111 & 14) | (i111 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs3 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs3, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i112 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i112 & 14) | (i112 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs4 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs4, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i12 |= i18;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i113 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i113 & 14) | (i113 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs5 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs5, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i114 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i114 & 14) | (i114 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs6 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs6, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i12 |= i18;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i115 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i115 & 14) | (i115 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs7 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs7, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i116 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i116 & 14) | (i116 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs8 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs8, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i12 |= i18;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i117 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i117 & 14) | (i117 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs9 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs9, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i118 = i12 >> 9;
                    stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i118 & 14) | (i118 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                    } else {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM327requiredSize3ABfNKs10 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs10, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                    z15 = z14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i12 |= i18;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i119 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i119 & 14) | (i119 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs11 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs11, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i1110 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i1110 & 14) | (i1110 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs12 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs12, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i12 |= i18;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i12 |= i18;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i1111 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i1111 & 14) | (i1111 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs13 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs13, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i1112 = i12 >> 9;
                stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i1112 & 14) | (i1112 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
                } else {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM327requiredSize3ABfNKs14 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs14, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
                z15 = z14;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                radioButtonColors2 = radioButtonColors;
                if (composerStartRestartGroup.changed(radioButtonColors2)) {
                }
                i12 |= i18;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            i12 |= i18;
        } else {
            radioButtonColors2 = radioButtonColors;
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
            }
            if (z10) {
                fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            int i1113 = i12 >> 9;
            stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i1113 & 14) | (i1113 & 896));
            composerStartRestartGroup.startReplaceableGroup(1941632354);
            if (function0 != null) {
                z14 = z13;
                modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
            } else {
                z14 = z13;
                modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM327requiredSize3ABfNKs15 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs15, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
            z15 = z14;
            mutableInteractionSource5 = mutableInteractionSource4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = RadioButtonDefaults.INSTANCE.m811colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM811colorsRGew2ao = radioButtonColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314435585, i12, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
            }
            if (z10) {
                fM4389constructorimpl = Dp.m4389constructorimpl(f7568e / 2);
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            int i1114 = i12 >> 9;
            stateRadioColor = radioButtonColorsM811colorsRGew2ao.radioColor(z13, z10, composerStartRestartGroup, ((i12 << 3) & 112) | (i1114 & 14) | (i1114 & 896));
            composerStartRestartGroup.startReplaceableGroup(1941632354);
            if (function0 != null) {
                z14 = z13;
                modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f7564a, 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
            } else {
                z14 = z13;
                modifierM458selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM327requiredSize3ABfNKs16 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f7565b), f7566c);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(stateRadioColor, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs16, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColorsM811colorsRGew2ao;
            z15 = z14;
            mutableInteractionSource5 = mutableInteractionSource4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, mutableInteractionSource5, radioButtonColors3, i10, i11));
    }
}
