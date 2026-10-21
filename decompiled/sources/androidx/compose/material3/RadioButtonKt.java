package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/RadioButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n25#2:227\n50#2:237\n49#2:238\n1114#3,6:228\n1114#3,6:239\n75#4:234\n75#4:236\n154#5:235\n154#5:245\n154#5:246\n154#5:247\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:227\n115#1:237\n115#1:238\n79#1:228,6\n115#1:239,6\n82#1:234\n96#1:236\n82#1:235\n223#1:245\n224#1:246\n225#1:247\n*E\n"})
public final class RadioButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11120b = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11121c;

    /* JADX INFO: compiled from: RadioButton.kt */
    @SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n75#2:227\n154#3:228\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n*L\n120#1:227\n123#1:228\n*E\n"})
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f11122p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f11123q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(State<Color> state, State<Dp> state2) {
            super(1);
            this.f11122p0 = state;
            this.f11123q0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fMo415toPx0680j_4 = Canvas.mo415toPx0680j_4(RadioButtonKt.f11121c);
            State<Color> state = this.f11122p0;
            float f6 = 2;
            float f10 = fMo415toPx0680j_4 / f6;
            a1.b.x(Canvas, state.getValue().m2518unboximpl(), Canvas.mo415toPx0680j_4(Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM() / f6)) - f10, 0L, 0.0f, new Stroke(fMo415toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            State<Dp> state2 = this.f11123q0;
            if (Dp.m4388compareTo0680j_4(state2.getValue().m4403unboximpl(), Dp.m4389constructorimpl(0)) > 0) {
                a1.b.x(Canvas, state.getValue().m2518unboximpl(), Canvas.mo415toPx0680j_4(state2.getValue().m4403unboximpl()) - f10, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RadioButton.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f11124p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11125q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11126r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11127s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ RadioButtonColors f11128t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11129u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11130w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Function0<Unit> function0, Modifier modifier, boolean z11, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f11124p0 = z10;
            this.f11125q0 = function0;
            this.f11126r0 = modifier;
            this.f11127s0 = z11;
            this.f11128t0 = radioButtonColors;
            this.f11129u0 = mutableInteractionSource;
            this.v0 = i10;
            this.f11130w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RadioButtonKt.RadioButton(this.f11124p0, this.f11125q0, this.f11126r0, this.f11127s0, this.f11128t0, this.f11129u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f11130w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 2;
        f11119a = Dp.m4389constructorimpl(f6);
        f11121c = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154  */
    /* JADX WARN: Code duplicated, block: B:106:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0220  */
    /* JADX WARN: Code duplicated, block: B:116:0x0228  */
    /* JADX WARN: Code duplicated, block: B:119:0x023e  */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0142  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RadioButton(boolean z10, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, boolean z11, @Nullable RadioButtonColors radioButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        RadioButtonColors radioButtonColorsM1219colorsro_MJ88;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        RadioButtonColors radioButtonColors2;
        Object objRememberedValue;
        float fM4389constructorimpl;
        State<Dp> stateM67animateDpAsStateAjpBEmI;
        State<Color> stateRadioColor$material3_release;
        boolean z14;
        Modifier modifierM458selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean zChanged;
        Object objRememberedValue2;
        RadioButtonColors radioButtonColors3;
        boolean z15;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
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
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                        int i18 = composerStartRestartGroup.changed(radioButtonColorsM1219colorsro_MJ88) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                    }
                    i12 |= i18;
                } else {
                    radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
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
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        modifier4 = modifier3;
                        radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        modifier4 = modifier2;
                        z13 = z12;
                        radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                    }
                    if (z10) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(735546407);
                    if (function0 != null) {
                        z14 = z13;
                        modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
                    Modifier modifierM327requiredSize3ABfNKs = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM327requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColors2;
                    z15 = z14;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z15 = z12;
                    radioButtonColors3 = radioButtonColorsM1219colorsro_MJ88;
                    composerStartRestartGroup = composerStartRestartGroup;
                    mutableInteractionSource4 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, radioButtonColors3, mutableInteractionSource4, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsM1219colorsro_MJ88)) {
                    }
                    i12 |= i18;
                } else {
                    radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                }
                i12 |= i18;
            } else {
                radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(735546407);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
                Modifier modifierM327requiredSize3ABfNKs2 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColors2;
                z15 = z14;
                mutableInteractionSource4 = mutableInteractionSource3;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(735546407);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
                Modifier modifierM327requiredSize3ABfNKs3 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs3, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColors2;
                z15 = z14;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, radioButtonColors3, mutableInteractionSource4, i10, i11));
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
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsM1219colorsro_MJ88)) {
                    }
                    i12 |= i18;
                } else {
                    radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                }
                i12 |= i18;
            } else {
                radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(735546407);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
                Modifier modifierM327requiredSize3ABfNKs4 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs4, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColors2;
                z15 = z14;
                mutableInteractionSource4 = mutableInteractionSource3;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(735546407);
                if (function0 != null) {
                    z14 = z13;
                    modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
                Modifier modifierM327requiredSize3ABfNKs5 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs5, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColors2;
                z15 = z14;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, radioButtonColors3, mutableInteractionSource4, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
                if (composerStartRestartGroup.changed(radioButtonColorsM1219colorsro_MJ88)) {
                }
                i12 |= i18;
            } else {
                radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
            }
            i12 |= i18;
        } else {
            radioButtonColorsM1219colorsro_MJ88 = radioButtonColors;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
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
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
            }
            if (z10) {
                fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(735546407);
            if (function0 != null) {
                z14 = z13;
                modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
            Modifier modifierM327requiredSize3ABfNKs6 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs6, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColors2;
            z15 = z14;
            mutableInteractionSource4 = mutableInteractionSource3;
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
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
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
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    radioButtonColorsM1219colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m1219colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
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
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                radioButtonColors2 = radioButtonColorsM1219colorsro_MJ88;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
            }
            if (z10) {
                fM4389constructorimpl = Dp.m4389constructorimpl(f11120b / 2);
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(fM4389constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z13, z10, composerStartRestartGroup, ((i12 >> 6) & 896) | ((i12 >> 9) & 14) | ((i12 << 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(735546407);
            if (function0 != null) {
                z14 = z13;
                modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(Modifier.INSTANCE, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(RadioButtonTokens.INSTANCE.m1920getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z14, Role.m3825boximpl(Role.INSTANCE.m3835getRadioButtono7Vup1c()), function0);
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
            Modifier modifierM327requiredSize3ABfNKs7 = SizeKt.m327requiredSize3ABfNKs(PaddingKt.m296padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM458selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), f11119a), RadioButtonTokens.INSTANCE.m1919getIconSizeD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release) | composerStartRestartGroup.changed(stateM67animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(stateRadioColor$material3_release, stateM67animateDpAsStateAjpBEmI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs7, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColors2;
            z15 = z14;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function0, modifier2, z15, radioButtonColors3, mutableInteractionSource4, i10, i11));
    }
}
