package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,618:1\n25#2:619\n25#2:627\n25#2:634\n1097#3,6:620\n1097#3,6:628\n1097#3,6:635\n154#4:626\n81#5:641\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n98#1:619\n172#1:627\n226#1:634\n98#1:620,6\n172#1:628,6\n226#1:635,6\n115#1:626\n106#1:641\n*E\n"})
public final class ButtonKt {

    /* JADX INFO: compiled from: Button.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6911p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6912p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6913q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6914r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6915s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<Color> state, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6912p0 = state;
            this.f6913q0 = paddingValues;
            this.f6914r0 = function3;
            this.f6915s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(7524271, iIntValue, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:116)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(ButtonKt.access$Button$lambda$1(this.f6912p0))))}, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new a0(this.f6913q0, this.f6914r0, this.f6915s0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6916p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6917q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6918r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6919s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ButtonElevation f6920t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f6921u0;
        public final /* synthetic */ BorderStroke v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ ButtonColors f6922w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6923x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6924y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6916p0 = function0;
            this.f6917q0 = modifier;
            this.f6918r0 = z10;
            this.f6919s0 = mutableInteractionSource;
            this.f6920t0 = buttonElevation;
            this.f6921u0 = shape;
            this.v0 = borderStroke;
            this.f6922w0 = buttonColors;
            this.f6923x0 = paddingValues;
            this.f6924y0 = function3;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.Button(this.f6916p0, this.f6917q0, this.f6918r0, this.f6919s0, this.f6920t0, this.f6921u0, this.v0, this.f6922w0, this.f6923x0, this.f6924y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0201  */
    /* JADX WARN: Code duplicated, block: B:153:0x0205  */
    /* JADX WARN: Code duplicated, block: B:154:0x0207  */
    /* JADX WARN: Code duplicated, block: B:157:0x020d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:160:0x0228  */
    /* JADX WARN: Code duplicated, block: B:161:0x023c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0253  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:176:0x0324  */
    /* JADX WARN: Code duplicated, block: B:181:0x033e  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Button(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable ButtonElevation buttonElevation, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable ButtonColors buttonColors, @Nullable PaddingValues paddingValues, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        ButtonElevation buttonElevationM681elevationR_JCAzs;
        Shape shape2;
        int i17;
        int i18;
        int i19;
        PaddingValues paddingValues2;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        Shape small;
        BorderStroke borderStroke2;
        ButtonColors buttonColorsM680buttonColorsro_MJ88;
        PaddingValues contentPadding;
        Shape shape3;
        BorderStroke borderStroke3;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        State<Dp> stateElevation;
        float fM4389constructorimpl;
        Composer composer2;
        Shape shape4;
        BorderStroke borderStroke4;
        ButtonElevation buttonElevation3;
        ButtonColors buttonColors3;
        Modifier modifier4;
        boolean z14;
        MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2116133464);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        if ((i11 & 16) == 0) {
                            buttonElevationM681elevationR_JCAzs = buttonElevation;
                            int i25 = composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs) ? 16384 : 8192;
                            i12 |= i25;
                        } else {
                            buttonElevationM681elevationR_JCAzs = buttonElevation;
                        }
                        i12 |= i25;
                    } else {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                    }
                    if ((458752 & i10) == 0) {
                        shape2 = shape;
                        if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape2)) {
                            i23 = 65536;
                        } else {
                            i23 = 131072;
                        }
                        i12 |= i23;
                    } else {
                        shape2 = shape;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(borderStroke)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            if ((i10 & 234881024) == 0) {
                                paddingValues2 = paddingValues;
                                if (composerStartRestartGroup.changed(paddingValues2)) {
                                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                } else {
                                    i20 = 33554432;
                                }
                                i12 |= i20;
                            }
                            if ((i11 & 512) != 0) {
                                i12 |= 805306368;
                            } else if ((1879048192 & i10) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i21 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i21 = 268435456;
                                }
                                i12 |= i21;
                            }
                            i22 = i12;
                            if ((1533916891 & i22) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i24 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i13 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z11;
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
                                    if ((i11 & 16) != 0) {
                                        i22 &= -57345;
                                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    }
                                    if ((i11 & 32) != 0) {
                                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                        i22 &= -458753;
                                    } else {
                                        small = shape;
                                    }
                                    if (i17 != 0) {
                                        borderStroke2 = null;
                                    } else {
                                        borderStroke2 = borderStroke;
                                    }
                                    if ((i11 & 128) != 0) {
                                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                        i22 &= -29360129;
                                    } else {
                                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                    }
                                    if (i19 != 0) {
                                        shape3 = small;
                                        borderStroke3 = borderStroke2;
                                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                        modifier3 = modifier2;
                                        z13 = z12;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    } else {
                                        contentPadding = paddingValues;
                                        shape3 = small;
                                        borderStroke3 = borderStroke2;
                                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                        modifier3 = modifier2;
                                        z13 = z12;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i11 & 16) != 0) {
                                        i22 &= -57345;
                                    }
                                    if ((i11 & 32) != 0) {
                                        i22 &= -458753;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i22 &= -29360129;
                                    }
                                    borderStroke3 = borderStroke;
                                    buttonColors2 = buttonColors;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    shape3 = shape2;
                                    z13 = z11;
                                    modifier3 = modifier;
                                    contentPadding = paddingValues;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                                }
                                int i26 = i22 >> 6;
                                int i27 = i26 & 14;
                                int i28 = ((i22 >> 18) & 112) | i27;
                                State<Color> stateContentColor = buttonColors2.contentColor(z13, composerStartRestartGroup, i28);
                                int i29 = i22;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                                long jM2518unboximpl = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i28).getValue().m2518unboximpl();
                                long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(stateContentColor.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                                composerStartRestartGroup.startReplaceableGroup(-423487112);
                                stateElevation = buttonElevation2 != null ? buttonElevation2.elevation(z13, mutableInteractionSource4, composerStartRestartGroup, (i26 & 112) | i27 | (i26 & 896)) : null;
                                composerStartRestartGroup.endReplaceableGroup();
                                if (stateElevation != null) {
                                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                                } else {
                                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                                }
                                ButtonColors buttonColors4 = buttonColors2;
                                PaddingValues paddingValues3 = contentPadding;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                ButtonElevation buttonElevation4 = buttonElevation2;
                                boolean z15 = z13;
                                Modifier modifier5 = modifier3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default, z13, shape3, jM2518unboximpl, jM2507copywmQWz5c$default, borderStroke3, fM4389constructorimpl, mutableInteractionSource6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor, contentPadding, content, i29)), composer2, (i29 & 14) | 805306368 | (i29 & 896) | (i26 & 7168) | (i29 & 3670016) | ((i29 << 15) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                buttonElevation3 = buttonElevation4;
                                buttonColors3 = buttonColors4;
                                paddingValues2 = paddingValues3;
                                modifier4 = modifier5;
                                z14 = z15;
                                mutableInteractionSource5 = mutableInteractionSource6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                z14 = z11;
                                mutableInteractionSource5 = mutableInteractionSource2;
                                buttonElevation3 = buttonElevationM681elevationR_JCAzs;
                                shape4 = shape2;
                                composer2 = composerStartRestartGroup;
                                borderStroke4 = borderStroke;
                                buttonColors3 = buttonColors;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                        }
                        i12 |= 100663296;
                        paddingValues2 = paddingValues;
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((1533916891 & i22) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i210 = i22 >> 6;
                            int i211 = i210 & 14;
                            int i212 = ((i22 >> 18) & 112) | i211;
                            State<Color> stateContentColor2 = buttonColors2.contentColor(z13, composerStartRestartGroup, i212);
                            int i213 = i22;
                            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl2 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i212).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(stateContentColor2.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors5 = buttonColors2;
                            PaddingValues paddingValues4 = contentPadding;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource4;
                            ButtonElevation buttonElevation5 = buttonElevation2;
                            boolean z16 = z13;
                            Modifier modifier6 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default2, z13, shape3, jM2518unboximpl2, jM2507copywmQWz5c$default2, borderStroke3, fM4389constructorimpl, mutableInteractionSource7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor2, contentPadding, content, i213)), composer2, (i213 & 14) | 805306368 | (i213 & 896) | (i210 & 7168) | (i213 & 3670016) | ((i213 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation5;
                            buttonColors3 = buttonColors5;
                            paddingValues2 = paddingValues4;
                            modifier4 = modifier6;
                            z14 = z16;
                            mutableInteractionSource5 = mutableInteractionSource7;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i214 = i22 >> 6;
                            int i215 = i214 & 14;
                            int i216 = ((i22 >> 18) & 112) | i215;
                            State<Color> stateContentColor3 = buttonColors2.contentColor(z13, composerStartRestartGroup, i216);
                            int i217 = i22;
                            Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl3 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i216).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(stateContentColor3.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors6 = buttonColors2;
                            PaddingValues paddingValues5 = contentPadding;
                            MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource4;
                            ButtonElevation buttonElevation6 = buttonElevation2;
                            boolean z17 = z13;
                            Modifier modifier7 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default3, z13, shape3, jM2518unboximpl3, jM2507copywmQWz5c$default3, borderStroke3, fM4389constructorimpl, mutableInteractionSource8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor3, contentPadding, content, i217)), composer2, (i217 & 14) | 805306368 | (i217 & 896) | (i214 & 7168) | (i217 & 3670016) | ((i217 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation6;
                            buttonColors3 = buttonColors6;
                            paddingValues2 = paddingValues5;
                            modifier4 = modifier7;
                            z14 = z17;
                            mutableInteractionSource5 = mutableInteractionSource8;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                    }
                    i12 |= 1572864;
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            paddingValues2 = paddingValues;
                            if (composerStartRestartGroup.changed(paddingValues2)) {
                                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((1533916891 & i22) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i218 = i22 >> 6;
                            int i219 = i218 & 14;
                            int i2110 = ((i22 >> 18) & 112) | i219;
                            State<Color> stateContentColor4 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2110);
                            int i2111 = i22;
                            Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl4 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2110).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default4 = Color.m2507copywmQWz5c$default(stateContentColor4.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors7 = buttonColors2;
                            PaddingValues paddingValues6 = contentPadding;
                            MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource4;
                            ButtonElevation buttonElevation7 = buttonElevation2;
                            boolean z18 = z13;
                            Modifier modifier8 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default4, z13, shape3, jM2518unboximpl4, jM2507copywmQWz5c$default4, borderStroke3, fM4389constructorimpl, mutableInteractionSource9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor4, contentPadding, content, i2111)), composer2, (i2111 & 14) | 805306368 | (i2111 & 896) | (i218 & 7168) | (i2111 & 3670016) | ((i2111 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation7;
                            buttonColors3 = buttonColors7;
                            paddingValues2 = paddingValues6;
                            modifier4 = modifier8;
                            z14 = z18;
                            mutableInteractionSource5 = mutableInteractionSource9;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i2112 = i22 >> 6;
                            int i2113 = i2112 & 14;
                            int i2114 = ((i22 >> 18) & 112) | i2113;
                            State<Color> stateContentColor5 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2114);
                            int i2115 = i22;
                            Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl5 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2114).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default5 = Color.m2507copywmQWz5c$default(stateContentColor5.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors8 = buttonColors2;
                            PaddingValues paddingValues7 = contentPadding;
                            MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource4;
                            ButtonElevation buttonElevation8 = buttonElevation2;
                            boolean z19 = z13;
                            Modifier modifier9 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default5, z13, shape3, jM2518unboximpl5, jM2507copywmQWz5c$default5, borderStroke3, fM4389constructorimpl, mutableInteractionSource10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor5, contentPadding, content, i2115)), composer2, (i2115 & 14) | 805306368 | (i2115 & 896) | (i2112 & 7168) | (i2115 & 3670016) | ((i2115 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation8;
                            buttonColors3 = buttonColors8;
                            paddingValues2 = paddingValues7;
                            modifier4 = modifier9;
                            z14 = z19;
                            mutableInteractionSource5 = mutableInteractionSource10;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                    }
                    i12 |= 100663296;
                    paddingValues2 = paddingValues;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2116 = i22 >> 6;
                        int i2117 = i2116 & 14;
                        int i2118 = ((i22 >> 18) & 112) | i2117;
                        State<Color> stateContentColor6 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2118);
                        int i2119 = i22;
                        Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl6 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2118).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(stateContentColor6.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors9 = buttonColors2;
                        PaddingValues paddingValues8 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource4;
                        ButtonElevation buttonElevation9 = buttonElevation2;
                        boolean z110 = z13;
                        Modifier modifier10 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default6, z13, shape3, jM2518unboximpl6, jM2507copywmQWz5c$default6, borderStroke3, fM4389constructorimpl, mutableInteractionSource11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor6, contentPadding, content, i2119)), composer2, (i2119 & 14) | 805306368 | (i2119 & 896) | (i2116 & 7168) | (i2119 & 3670016) | ((i2119 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation9;
                        buttonColors3 = buttonColors9;
                        paddingValues2 = paddingValues8;
                        modifier4 = modifier10;
                        z14 = z110;
                        mutableInteractionSource5 = mutableInteractionSource11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i21110 = i22 >> 6;
                        int i21111 = i21110 & 14;
                        int i21112 = ((i22 >> 18) & 112) | i21111;
                        State<Color> stateContentColor7 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21112);
                        int i21113 = i22;
                        Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl7 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21112).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default7 = Color.m2507copywmQWz5c$default(stateContentColor7.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors10 = buttonColors2;
                        PaddingValues paddingValues9 = contentPadding;
                        MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource4;
                        ButtonElevation buttonElevation10 = buttonElevation2;
                        boolean z111 = z13;
                        Modifier modifier11 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default7, z13, shape3, jM2518unboximpl7, jM2507copywmQWz5c$default7, borderStroke3, fM4389constructorimpl, mutableInteractionSource12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor7, contentPadding, content, i21113)), composer2, (i21113 & 14) | 805306368 | (i21113 & 896) | (i21110 & 7168) | (i21113 & 3670016) | ((i21113 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation10;
                        buttonColors3 = buttonColors10;
                        paddingValues2 = paddingValues9;
                        modifier4 = modifier11;
                        z14 = z111;
                        mutableInteractionSource5 = mutableInteractionSource12;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 3072;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                        if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                        }
                        i12 |= i25;
                    } else {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                if ((458752 & i10) == 0) {
                    shape2 = shape;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            paddingValues2 = paddingValues;
                            if (composerStartRestartGroup.changed(paddingValues2)) {
                                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((1533916891 & i22) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i21114 = i22 >> 6;
                            int i21115 = i21114 & 14;
                            int i21116 = ((i22 >> 18) & 112) | i21115;
                            State<Color> stateContentColor8 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21116);
                            int i21117 = i22;
                            Modifier modifierSemantics$default8 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl8 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21116).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default8 = Color.m2507copywmQWz5c$default(stateContentColor8.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors11 = buttonColors2;
                            PaddingValues paddingValues10 = contentPadding;
                            MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource4;
                            ButtonElevation buttonElevation11 = buttonElevation2;
                            boolean z112 = z13;
                            Modifier modifier12 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default8, z13, shape3, jM2518unboximpl8, jM2507copywmQWz5c$default8, borderStroke3, fM4389constructorimpl, mutableInteractionSource13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor8, contentPadding, content, i21117)), composer2, (i21117 & 14) | 805306368 | (i21117 & 896) | (i21114 & 7168) | (i21117 & 3670016) | ((i21117 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation11;
                            buttonColors3 = buttonColors11;
                            paddingValues2 = paddingValues10;
                            modifier4 = modifier12;
                            z14 = z112;
                            mutableInteractionSource5 = mutableInteractionSource13;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i21118 = i22 >> 6;
                            int i21119 = i21118 & 14;
                            int i211110 = ((i22 >> 18) & 112) | i21119;
                            State<Color> stateContentColor9 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211110);
                            int i211111 = i22;
                            Modifier modifierSemantics$default9 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl9 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211110).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default9 = Color.m2507copywmQWz5c$default(stateContentColor9.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors12 = buttonColors2;
                            PaddingValues paddingValues11 = contentPadding;
                            MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource4;
                            ButtonElevation buttonElevation12 = buttonElevation2;
                            boolean z113 = z13;
                            Modifier modifier13 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default9, z13, shape3, jM2518unboximpl9, jM2507copywmQWz5c$default9, borderStroke3, fM4389constructorimpl, mutableInteractionSource14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor9, contentPadding, content, i211111)), composer2, (i211111 & 14) | 805306368 | (i211111 & 896) | (i21118 & 7168) | (i211111 & 3670016) | ((i211111 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation12;
                            buttonColors3 = buttonColors12;
                            paddingValues2 = paddingValues11;
                            modifier4 = modifier13;
                            z14 = z113;
                            mutableInteractionSource5 = mutableInteractionSource14;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                    }
                    i12 |= 100663296;
                    paddingValues2 = paddingValues;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211112 = i22 >> 6;
                        int i211113 = i211112 & 14;
                        int i211114 = ((i22 >> 18) & 112) | i211113;
                        State<Color> stateContentColor10 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211114);
                        int i211115 = i22;
                        Modifier modifierSemantics$default10 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl10 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211114).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default10 = Color.m2507copywmQWz5c$default(stateContentColor10.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors13 = buttonColors2;
                        PaddingValues paddingValues12 = contentPadding;
                        MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource4;
                        ButtonElevation buttonElevation13 = buttonElevation2;
                        boolean z114 = z13;
                        Modifier modifier14 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default10, z13, shape3, jM2518unboximpl10, jM2507copywmQWz5c$default10, borderStroke3, fM4389constructorimpl, mutableInteractionSource15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor10, contentPadding, content, i211115)), composer2, (i211115 & 14) | 805306368 | (i211115 & 896) | (i211112 & 7168) | (i211115 & 3670016) | ((i211115 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation13;
                        buttonColors3 = buttonColors13;
                        paddingValues2 = paddingValues12;
                        modifier4 = modifier14;
                        z14 = z114;
                        mutableInteractionSource5 = mutableInteractionSource15;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211116 = i22 >> 6;
                        int i211117 = i211116 & 14;
                        int i211118 = ((i22 >> 18) & 112) | i211117;
                        State<Color> stateContentColor11 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211118);
                        int i211119 = i22;
                        Modifier modifierSemantics$default11 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl11 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211118).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default11 = Color.m2507copywmQWz5c$default(stateContentColor11.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors14 = buttonColors2;
                        PaddingValues paddingValues13 = contentPadding;
                        MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource4;
                        ButtonElevation buttonElevation14 = buttonElevation2;
                        boolean z115 = z13;
                        Modifier modifier15 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11, z13, shape3, jM2518unboximpl11, jM2507copywmQWz5c$default11, borderStroke3, fM4389constructorimpl, mutableInteractionSource16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11, contentPadding, content, i211119)), composer2, (i211119 & 14) | 805306368 | (i211119 & 896) | (i211116 & 7168) | (i211119 & 3670016) | ((i211119 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation14;
                        buttonColors3 = buttonColors14;
                        paddingValues2 = paddingValues13;
                        modifier4 = modifier15;
                        z14 = z115;
                        mutableInteractionSource5 = mutableInteractionSource16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 1572864;
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111110 = i22 >> 6;
                        int i2111111 = i2111110 & 14;
                        int i2111112 = ((i22 >> 18) & 112) | i2111111;
                        State<Color> stateContentColor12 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111112);
                        int i2111113 = i22;
                        Modifier modifierSemantics$default12 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl12 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111112).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default12 = Color.m2507copywmQWz5c$default(stateContentColor12.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors15 = buttonColors2;
                        PaddingValues paddingValues14 = contentPadding;
                        MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource4;
                        ButtonElevation buttonElevation15 = buttonElevation2;
                        boolean z116 = z13;
                        Modifier modifier16 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default12, z13, shape3, jM2518unboximpl12, jM2507copywmQWz5c$default12, borderStroke3, fM4389constructorimpl, mutableInteractionSource17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor12, contentPadding, content, i2111113)), composer2, (i2111113 & 14) | 805306368 | (i2111113 & 896) | (i2111110 & 7168) | (i2111113 & 3670016) | ((i2111113 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation15;
                        buttonColors3 = buttonColors15;
                        paddingValues2 = paddingValues14;
                        modifier4 = modifier16;
                        z14 = z116;
                        mutableInteractionSource5 = mutableInteractionSource17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111114 = i22 >> 6;
                        int i2111115 = i2111114 & 14;
                        int i2111116 = ((i22 >> 18) & 112) | i2111115;
                        State<Color> stateContentColor13 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111116);
                        int i2111117 = i22;
                        Modifier modifierSemantics$default13 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl13 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111116).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default13 = Color.m2507copywmQWz5c$default(stateContentColor13.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors16 = buttonColors2;
                        PaddingValues paddingValues15 = contentPadding;
                        MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource4;
                        ButtonElevation buttonElevation16 = buttonElevation2;
                        boolean z117 = z13;
                        Modifier modifier17 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default13, z13, shape3, jM2518unboximpl13, jM2507copywmQWz5c$default13, borderStroke3, fM4389constructorimpl, mutableInteractionSource18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor13, contentPadding, content, i2111117)), composer2, (i2111117 & 14) | 805306368 | (i2111117 & 896) | (i2111114 & 7168) | (i2111117 & 3670016) | ((i2111117 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation16;
                        buttonColors3 = buttonColors16;
                        paddingValues2 = paddingValues15;
                        modifier4 = modifier17;
                        z14 = z117;
                        mutableInteractionSource5 = mutableInteractionSource18;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111118 = i22 >> 6;
                    int i2111119 = i2111118 & 14;
                    int i21111110 = ((i22 >> 18) & 112) | i2111119;
                    State<Color> stateContentColor14 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111110);
                    int i21111111 = i22;
                    Modifier modifierSemantics$default14 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl14 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111110).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default14 = Color.m2507copywmQWz5c$default(stateContentColor14.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors17 = buttonColors2;
                    PaddingValues paddingValues16 = contentPadding;
                    MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource4;
                    ButtonElevation buttonElevation17 = buttonElevation2;
                    boolean z118 = z13;
                    Modifier modifier18 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default14, z13, shape3, jM2518unboximpl14, jM2507copywmQWz5c$default14, borderStroke3, fM4389constructorimpl, mutableInteractionSource19, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor14, contentPadding, content, i21111111)), composer2, (i21111111 & 14) | 805306368 | (i21111111 & 896) | (i2111118 & 7168) | (i21111111 & 3670016) | ((i21111111 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation17;
                    buttonColors3 = buttonColors17;
                    paddingValues2 = paddingValues16;
                    modifier4 = modifier18;
                    z14 = z118;
                    mutableInteractionSource5 = mutableInteractionSource19;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111112 = i22 >> 6;
                    int i21111113 = i21111112 & 14;
                    int i21111114 = ((i22 >> 18) & 112) | i21111113;
                    State<Color> stateContentColor15 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111114);
                    int i21111115 = i22;
                    Modifier modifierSemantics$default15 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl15 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111114).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default15 = Color.m2507copywmQWz5c$default(stateContentColor15.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors18 = buttonColors2;
                    PaddingValues paddingValues17 = contentPadding;
                    MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource4;
                    ButtonElevation buttonElevation18 = buttonElevation2;
                    boolean z119 = z13;
                    Modifier modifier19 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default15, z13, shape3, jM2518unboximpl15, jM2507copywmQWz5c$default15, borderStroke3, fM4389constructorimpl, mutableInteractionSource110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor15, contentPadding, content, i21111115)), composer2, (i21111115 & 14) | 805306368 | (i21111115 & 896) | (i21111112 & 7168) | (i21111115 & 3670016) | ((i21111115 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation18;
                    buttonColors3 = buttonColors18;
                    paddingValues2 = paddingValues17;
                    modifier4 = modifier19;
                    z14 = z119;
                    mutableInteractionSource5 = mutableInteractionSource110;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                        if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                        }
                        i12 |= i25;
                    } else {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                if ((458752 & i10) == 0) {
                    shape2 = shape;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            paddingValues2 = paddingValues;
                            if (composerStartRestartGroup.changed(paddingValues2)) {
                                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((1533916891 & i22) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i21111116 = i22 >> 6;
                            int i21111117 = i21111116 & 14;
                            int i21111118 = ((i22 >> 18) & 112) | i21111117;
                            State<Color> stateContentColor16 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111118);
                            int i21111119 = i22;
                            Modifier modifierSemantics$default16 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl16 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111118).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default16 = Color.m2507copywmQWz5c$default(stateContentColor16.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors19 = buttonColors2;
                            PaddingValues paddingValues18 = contentPadding;
                            MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource4;
                            ButtonElevation buttonElevation19 = buttonElevation2;
                            boolean z1110 = z13;
                            Modifier modifier110 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default16, z13, shape3, jM2518unboximpl16, jM2507copywmQWz5c$default16, borderStroke3, fM4389constructorimpl, mutableInteractionSource111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor16, contentPadding, content, i21111119)), composer2, (i21111119 & 14) | 805306368 | (i21111119 & 896) | (i21111116 & 7168) | (i21111119 & 3670016) | ((i21111119 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation19;
                            buttonColors3 = buttonColors19;
                            paddingValues2 = paddingValues18;
                            modifier4 = modifier110;
                            z14 = z1110;
                            mutableInteractionSource5 = mutableInteractionSource111;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i211111110 = i22 >> 6;
                            int i211111111 = i211111110 & 14;
                            int i211111112 = ((i22 >> 18) & 112) | i211111111;
                            State<Color> stateContentColor17 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111112);
                            int i211111113 = i22;
                            Modifier modifierSemantics$default17 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl17 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111112).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default17 = Color.m2507copywmQWz5c$default(stateContentColor17.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors110 = buttonColors2;
                            PaddingValues paddingValues19 = contentPadding;
                            MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource4;
                            ButtonElevation buttonElevation110 = buttonElevation2;
                            boolean z1111 = z13;
                            Modifier modifier111 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default17, z13, shape3, jM2518unboximpl17, jM2507copywmQWz5c$default17, borderStroke3, fM4389constructorimpl, mutableInteractionSource112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor17, contentPadding, content, i211111113)), composer2, (i211111113 & 14) | 805306368 | (i211111113 & 896) | (i211111110 & 7168) | (i211111113 & 3670016) | ((i211111113 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation110;
                            buttonColors3 = buttonColors110;
                            paddingValues2 = paddingValues19;
                            modifier4 = modifier111;
                            z14 = z1111;
                            mutableInteractionSource5 = mutableInteractionSource112;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                    }
                    i12 |= 100663296;
                    paddingValues2 = paddingValues;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111114 = i22 >> 6;
                        int i211111115 = i211111114 & 14;
                        int i211111116 = ((i22 >> 18) & 112) | i211111115;
                        State<Color> stateContentColor18 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111116);
                        int i211111117 = i22;
                        Modifier modifierSemantics$default18 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl18 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111116).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default18 = Color.m2507copywmQWz5c$default(stateContentColor18.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors111 = buttonColors2;
                        PaddingValues paddingValues110 = contentPadding;
                        MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource4;
                        ButtonElevation buttonElevation111 = buttonElevation2;
                        boolean z1112 = z13;
                        Modifier modifier112 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default18, z13, shape3, jM2518unboximpl18, jM2507copywmQWz5c$default18, borderStroke3, fM4389constructorimpl, mutableInteractionSource113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor18, contentPadding, content, i211111117)), composer2, (i211111117 & 14) | 805306368 | (i211111117 & 896) | (i211111114 & 7168) | (i211111117 & 3670016) | ((i211111117 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation111;
                        buttonColors3 = buttonColors111;
                        paddingValues2 = paddingValues110;
                        modifier4 = modifier112;
                        z14 = z1112;
                        mutableInteractionSource5 = mutableInteractionSource113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111118 = i22 >> 6;
                        int i211111119 = i211111118 & 14;
                        int i2111111110 = ((i22 >> 18) & 112) | i211111119;
                        State<Color> stateContentColor19 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111110);
                        int i2111111111 = i22;
                        Modifier modifierSemantics$default19 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl19 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111110).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default19 = Color.m2507copywmQWz5c$default(stateContentColor19.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors112 = buttonColors2;
                        PaddingValues paddingValues111 = contentPadding;
                        MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource4;
                        ButtonElevation buttonElevation112 = buttonElevation2;
                        boolean z1113 = z13;
                        Modifier modifier113 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default19, z13, shape3, jM2518unboximpl19, jM2507copywmQWz5c$default19, borderStroke3, fM4389constructorimpl, mutableInteractionSource114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor19, contentPadding, content, i2111111111)), composer2, (i2111111111 & 14) | 805306368 | (i2111111111 & 896) | (i211111118 & 7168) | (i2111111111 & 3670016) | ((i2111111111 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation112;
                        buttonColors3 = buttonColors112;
                        paddingValues2 = paddingValues111;
                        modifier4 = modifier113;
                        z14 = z1113;
                        mutableInteractionSource5 = mutableInteractionSource114;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 1572864;
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111111112 = i22 >> 6;
                        int i2111111113 = i2111111112 & 14;
                        int i2111111114 = ((i22 >> 18) & 112) | i2111111113;
                        State<Color> stateContentColor110 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111114);
                        int i2111111115 = i22;
                        Modifier modifierSemantics$default110 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl110 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111114).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default110 = Color.m2507copywmQWz5c$default(stateContentColor110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors113 = buttonColors2;
                        PaddingValues paddingValues112 = contentPadding;
                        MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource4;
                        ButtonElevation buttonElevation113 = buttonElevation2;
                        boolean z1114 = z13;
                        Modifier modifier114 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default110, z13, shape3, jM2518unboximpl110, jM2507copywmQWz5c$default110, borderStroke3, fM4389constructorimpl, mutableInteractionSource115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor110, contentPadding, content, i2111111115)), composer2, (i2111111115 & 14) | 805306368 | (i2111111115 & 896) | (i2111111112 & 7168) | (i2111111115 & 3670016) | ((i2111111115 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation113;
                        buttonColors3 = buttonColors113;
                        paddingValues2 = paddingValues112;
                        modifier4 = modifier114;
                        z14 = z1114;
                        mutableInteractionSource5 = mutableInteractionSource115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111111116 = i22 >> 6;
                        int i2111111117 = i2111111116 & 14;
                        int i2111111118 = ((i22 >> 18) & 112) | i2111111117;
                        State<Color> stateContentColor111 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111118);
                        int i2111111119 = i22;
                        Modifier modifierSemantics$default111 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl111 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111118).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default111 = Color.m2507copywmQWz5c$default(stateContentColor111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors114 = buttonColors2;
                        PaddingValues paddingValues113 = contentPadding;
                        MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource4;
                        ButtonElevation buttonElevation114 = buttonElevation2;
                        boolean z1115 = z13;
                        Modifier modifier115 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111, z13, shape3, jM2518unboximpl111, jM2507copywmQWz5c$default111, borderStroke3, fM4389constructorimpl, mutableInteractionSource116, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111, contentPadding, content, i2111111119)), composer2, (i2111111119 & 14) | 805306368 | (i2111111119 & 896) | (i2111111116 & 7168) | (i2111111119 & 3670016) | ((i2111111119 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation114;
                        buttonColors3 = buttonColors114;
                        paddingValues2 = paddingValues113;
                        modifier4 = modifier115;
                        z14 = z1115;
                        mutableInteractionSource5 = mutableInteractionSource116;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111110 = i22 >> 6;
                    int i21111111111 = i21111111110 & 14;
                    int i21111111112 = ((i22 >> 18) & 112) | i21111111111;
                    State<Color> stateContentColor112 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111112);
                    int i21111111113 = i22;
                    Modifier modifierSemantics$default112 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl112 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111112).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default112 = Color.m2507copywmQWz5c$default(stateContentColor112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors115 = buttonColors2;
                    PaddingValues paddingValues114 = contentPadding;
                    MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource4;
                    ButtonElevation buttonElevation115 = buttonElevation2;
                    boolean z1116 = z13;
                    Modifier modifier116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default112, z13, shape3, jM2518unboximpl112, jM2507copywmQWz5c$default112, borderStroke3, fM4389constructorimpl, mutableInteractionSource117, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor112, contentPadding, content, i21111111113)), composer2, (i21111111113 & 14) | 805306368 | (i21111111113 & 896) | (i21111111110 & 7168) | (i21111111113 & 3670016) | ((i21111111113 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation115;
                    buttonColors3 = buttonColors115;
                    paddingValues2 = paddingValues114;
                    modifier4 = modifier116;
                    z14 = z1116;
                    mutableInteractionSource5 = mutableInteractionSource117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111114 = i22 >> 6;
                    int i21111111115 = i21111111114 & 14;
                    int i21111111116 = ((i22 >> 18) & 112) | i21111111115;
                    State<Color> stateContentColor113 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111116);
                    int i21111111117 = i22;
                    Modifier modifierSemantics$default113 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl113 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111116).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default113 = Color.m2507copywmQWz5c$default(stateContentColor113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors116 = buttonColors2;
                    PaddingValues paddingValues115 = contentPadding;
                    MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource4;
                    ButtonElevation buttonElevation116 = buttonElevation2;
                    boolean z1117 = z13;
                    Modifier modifier117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default113, z13, shape3, jM2518unboximpl113, jM2507copywmQWz5c$default113, borderStroke3, fM4389constructorimpl, mutableInteractionSource118, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor113, contentPadding, content, i21111111117)), composer2, (i21111111117 & 14) | 805306368 | (i21111111117 & 896) | (i21111111114 & 7168) | (i21111111117 & 3670016) | ((i21111111117 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation116;
                    buttonColors3 = buttonColors116;
                    paddingValues2 = paddingValues115;
                    modifier4 = modifier117;
                    z14 = z1117;
                    mutableInteractionSource5 = mutableInteractionSource118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                    if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                i12 |= i25;
            } else {
                buttonElevationM681elevationR_JCAzs = buttonElevation;
            }
            if ((458752 & i10) == 0) {
                shape2 = shape;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i21111111118 = i22 >> 6;
                        int i21111111119 = i21111111118 & 14;
                        int i211111111110 = ((i22 >> 18) & 112) | i21111111119;
                        State<Color> stateContentColor114 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111110);
                        int i211111111111 = i22;
                        Modifier modifierSemantics$default114 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl114 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111110).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default114 = Color.m2507copywmQWz5c$default(stateContentColor114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors117 = buttonColors2;
                        PaddingValues paddingValues116 = contentPadding;
                        MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource4;
                        ButtonElevation buttonElevation117 = buttonElevation2;
                        boolean z1118 = z13;
                        Modifier modifier118 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default114, z13, shape3, jM2518unboximpl114, jM2507copywmQWz5c$default114, borderStroke3, fM4389constructorimpl, mutableInteractionSource119, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor114, contentPadding, content, i211111111111)), composer2, (i211111111111 & 14) | 805306368 | (i211111111111 & 896) | (i21111111118 & 7168) | (i211111111111 & 3670016) | ((i211111111111 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation117;
                        buttonColors3 = buttonColors117;
                        paddingValues2 = paddingValues116;
                        modifier4 = modifier118;
                        z14 = z1118;
                        mutableInteractionSource5 = mutableInteractionSource119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111112 = i22 >> 6;
                        int i211111111113 = i211111111112 & 14;
                        int i211111111114 = ((i22 >> 18) & 112) | i211111111113;
                        State<Color> stateContentColor115 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111114);
                        int i211111111115 = i22;
                        Modifier modifierSemantics$default115 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl115 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111114).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default115 = Color.m2507copywmQWz5c$default(stateContentColor115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors118 = buttonColors2;
                        PaddingValues paddingValues117 = contentPadding;
                        MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource4;
                        ButtonElevation buttonElevation118 = buttonElevation2;
                        boolean z1119 = z13;
                        Modifier modifier119 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default115, z13, shape3, jM2518unboximpl115, jM2507copywmQWz5c$default115, borderStroke3, fM4389constructorimpl, mutableInteractionSource1110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor115, contentPadding, content, i211111111115)), composer2, (i211111111115 & 14) | 805306368 | (i211111111115 & 896) | (i211111111112 & 7168) | (i211111111115 & 3670016) | ((i211111111115 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation118;
                        buttonColors3 = buttonColors118;
                        paddingValues2 = paddingValues117;
                        modifier4 = modifier119;
                        z14 = z1119;
                        mutableInteractionSource5 = mutableInteractionSource1110;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i211111111116 = i22 >> 6;
                    int i211111111117 = i211111111116 & 14;
                    int i211111111118 = ((i22 >> 18) & 112) | i211111111117;
                    State<Color> stateContentColor116 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111118);
                    int i211111111119 = i22;
                    Modifier modifierSemantics$default116 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl116 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111118).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default116 = Color.m2507copywmQWz5c$default(stateContentColor116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors119 = buttonColors2;
                    PaddingValues paddingValues118 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource4;
                    ButtonElevation buttonElevation119 = buttonElevation2;
                    boolean z11110 = z13;
                    Modifier modifier1110 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default116, z13, shape3, jM2518unboximpl116, jM2507copywmQWz5c$default116, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor116, contentPadding, content, i211111111119)), composer2, (i211111111119 & 14) | 805306368 | (i211111111119 & 896) | (i211111111116 & 7168) | (i211111111119 & 3670016) | ((i211111111119 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation119;
                    buttonColors3 = buttonColors119;
                    paddingValues2 = paddingValues118;
                    modifier4 = modifier1110;
                    z14 = z11110;
                    mutableInteractionSource5 = mutableInteractionSource1111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111110 = i22 >> 6;
                    int i2111111111111 = i2111111111110 & 14;
                    int i2111111111112 = ((i22 >> 18) & 112) | i2111111111111;
                    State<Color> stateContentColor117 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111112);
                    int i2111111111113 = i22;
                    Modifier modifierSemantics$default117 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl117 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111112).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default117 = Color.m2507copywmQWz5c$default(stateContentColor117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors1110 = buttonColors2;
                    PaddingValues paddingValues119 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource4;
                    ButtonElevation buttonElevation1110 = buttonElevation2;
                    boolean z11111 = z13;
                    Modifier modifier1111 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default117, z13, shape3, jM2518unboximpl117, jM2507copywmQWz5c$default117, borderStroke3, fM4389constructorimpl, mutableInteractionSource1112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor117, contentPadding, content, i2111111111113)), composer2, (i2111111111113 & 14) | 805306368 | (i2111111111113 & 896) | (i2111111111110 & 7168) | (i2111111111113 & 3670016) | ((i2111111111113 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation1110;
                    buttonColors3 = buttonColors1110;
                    paddingValues2 = paddingValues119;
                    modifier4 = modifier1111;
                    z14 = z11111;
                    mutableInteractionSource5 = mutableInteractionSource1112;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 1572864;
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111114 = i22 >> 6;
                    int i2111111111115 = i2111111111114 & 14;
                    int i2111111111116 = ((i22 >> 18) & 112) | i2111111111115;
                    State<Color> stateContentColor118 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111116);
                    int i2111111111117 = i22;
                    Modifier modifierSemantics$default118 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl118 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111116).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default118 = Color.m2507copywmQWz5c$default(stateContentColor118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors1111 = buttonColors2;
                    PaddingValues paddingValues1110 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource4;
                    ButtonElevation buttonElevation1111 = buttonElevation2;
                    boolean z11112 = z13;
                    Modifier modifier1112 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default118, z13, shape3, jM2518unboximpl118, jM2507copywmQWz5c$default118, borderStroke3, fM4389constructorimpl, mutableInteractionSource1113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor118, contentPadding, content, i2111111111117)), composer2, (i2111111111117 & 14) | 805306368 | (i2111111111117 & 896) | (i2111111111114 & 7168) | (i2111111111117 & 3670016) | ((i2111111111117 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation1111;
                    buttonColors3 = buttonColors1111;
                    paddingValues2 = paddingValues1110;
                    modifier4 = modifier1112;
                    z14 = z11112;
                    mutableInteractionSource5 = mutableInteractionSource1113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111118 = i22 >> 6;
                    int i2111111111119 = i2111111111118 & 14;
                    int i21111111111110 = ((i22 >> 18) & 112) | i2111111111119;
                    State<Color> stateContentColor119 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111110);
                    int i21111111111111 = i22;
                    Modifier modifierSemantics$default119 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl119 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111110).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default119 = Color.m2507copywmQWz5c$default(stateContentColor119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors1112 = buttonColors2;
                    PaddingValues paddingValues1111 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1114 = mutableInteractionSource4;
                    ButtonElevation buttonElevation1112 = buttonElevation2;
                    boolean z11113 = z13;
                    Modifier modifier1113 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default119, z13, shape3, jM2518unboximpl119, jM2507copywmQWz5c$default119, borderStroke3, fM4389constructorimpl, mutableInteractionSource1114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor119, contentPadding, content, i21111111111111)), composer2, (i21111111111111 & 14) | 805306368 | (i21111111111111 & 896) | (i2111111111118 & 7168) | (i21111111111111 & 3670016) | ((i21111111111111 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation1112;
                    buttonColors3 = buttonColors1112;
                    paddingValues2 = paddingValues1111;
                    modifier4 = modifier1113;
                    z14 = z11113;
                    mutableInteractionSource5 = mutableInteractionSource1114;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 100663296;
            paddingValues2 = paddingValues;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((1533916891 & i22) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111112 = i22 >> 6;
                int i21111111111113 = i21111111111112 & 14;
                int i21111111111114 = ((i22 >> 18) & 112) | i21111111111113;
                State<Color> stateContentColor1110 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111114);
                int i21111111111115 = i22;
                Modifier modifierSemantics$default1110 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl1110 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111114).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default1110 = Color.m2507copywmQWz5c$default(stateContentColor1110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1113 = buttonColors2;
                PaddingValues paddingValues1112 = contentPadding;
                MutableInteractionSource mutableInteractionSource1115 = mutableInteractionSource4;
                ButtonElevation buttonElevation1113 = buttonElevation2;
                boolean z11114 = z13;
                Modifier modifier1114 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1110, z13, shape3, jM2518unboximpl1110, jM2507copywmQWz5c$default1110, borderStroke3, fM4389constructorimpl, mutableInteractionSource1115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1110, contentPadding, content, i21111111111115)), composer2, (i21111111111115 & 14) | 805306368 | (i21111111111115 & 896) | (i21111111111112 & 7168) | (i21111111111115 & 3670016) | ((i21111111111115 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1113;
                buttonColors3 = buttonColors1113;
                paddingValues2 = paddingValues1112;
                modifier4 = modifier1114;
                z14 = z11114;
                mutableInteractionSource5 = mutableInteractionSource1115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111116 = i22 >> 6;
                int i21111111111117 = i21111111111116 & 14;
                int i21111111111118 = ((i22 >> 18) & 112) | i21111111111117;
                State<Color> stateContentColor1111 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111118);
                int i21111111111119 = i22;
                Modifier modifierSemantics$default1111 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl1111 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111118).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default1111 = Color.m2507copywmQWz5c$default(stateContentColor1111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1114 = buttonColors2;
                PaddingValues paddingValues1113 = contentPadding;
                MutableInteractionSource mutableInteractionSource1116 = mutableInteractionSource4;
                ButtonElevation buttonElevation1114 = buttonElevation2;
                boolean z11115 = z13;
                Modifier modifier1115 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1111, z13, shape3, jM2518unboximpl1111, jM2507copywmQWz5c$default1111, borderStroke3, fM4389constructorimpl, mutableInteractionSource1116, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1111, contentPadding, content, i21111111111119)), composer2, (i21111111111119 & 14) | 805306368 | (i21111111111119 & 896) | (i21111111111116 & 7168) | (i21111111111119 & 3670016) | ((i21111111111119 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1114;
                buttonColors3 = buttonColors1114;
                paddingValues2 = paddingValues1113;
                modifier4 = modifier1115;
                z14 = z11115;
                mutableInteractionSource5 = mutableInteractionSource1116;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                        if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                        }
                        i12 |= i25;
                    } else {
                        buttonElevationM681elevationR_JCAzs = buttonElevation;
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                if ((458752 & i10) == 0) {
                    shape2 = shape;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            paddingValues2 = paddingValues;
                            if (composerStartRestartGroup.changed(paddingValues2)) {
                                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((1533916891 & i22) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i211111111111110 = i22 >> 6;
                            int i211111111111111 = i211111111111110 & 14;
                            int i211111111111112 = ((i22 >> 18) & 112) | i211111111111111;
                            State<Color> stateContentColor1112 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111112);
                            int i211111111111113 = i22;
                            Modifier modifierSemantics$default1112 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl1112 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111112).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default1112 = Color.m2507copywmQWz5c$default(stateContentColor1112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors1115 = buttonColors2;
                            PaddingValues paddingValues1114 = contentPadding;
                            MutableInteractionSource mutableInteractionSource1117 = mutableInteractionSource4;
                            ButtonElevation buttonElevation1115 = buttonElevation2;
                            boolean z11116 = z13;
                            Modifier modifier1116 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1112, z13, shape3, jM2518unboximpl1112, jM2507copywmQWz5c$default1112, borderStroke3, fM4389constructorimpl, mutableInteractionSource1117, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1112, contentPadding, content, i211111111111113)), composer2, (i211111111111113 & 14) | 805306368 | (i211111111111113 & 896) | (i211111111111110 & 7168) | (i211111111111113 & 3670016) | ((i211111111111113 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation1115;
                            buttonColors3 = buttonColors1115;
                            paddingValues2 = paddingValues1114;
                            modifier4 = modifier1116;
                            z14 = z11116;
                            mutableInteractionSource5 = mutableInteractionSource1117;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
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
                                if ((i11 & 16) != 0) {
                                    i22 &= -57345;
                                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if ((i11 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i22 &= -458753;
                                } else {
                                    small = shape;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if ((i11 & 128) != 0) {
                                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    i22 &= -29360129;
                                } else {
                                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                                }
                                if (i19 != 0) {
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                } else {
                                    contentPadding = paddingValues;
                                    shape3 = small;
                                    borderStroke3 = borderStroke2;
                                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                    modifier3 = modifier2;
                                    z13 = z12;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                            }
                            int i211111111111114 = i22 >> 6;
                            int i211111111111115 = i211111111111114 & 14;
                            int i211111111111116 = ((i22 >> 18) & 112) | i211111111111115;
                            State<Color> stateContentColor1113 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111116);
                            int i211111111111117 = i22;
                            Modifier modifierSemantics$default1113 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                            long jM2518unboximpl1113 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111116).getValue().m2518unboximpl();
                            long jM2507copywmQWz5c$default1113 = Color.m2507copywmQWz5c$default(stateContentColor1113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceableGroup(-423487112);
                            if (buttonElevation2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateElevation != null) {
                                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                            } else {
                                fM4389constructorimpl = Dp.m4389constructorimpl(0);
                            }
                            ButtonColors buttonColors1116 = buttonColors2;
                            PaddingValues paddingValues1115 = contentPadding;
                            MutableInteractionSource mutableInteractionSource1118 = mutableInteractionSource4;
                            ButtonElevation buttonElevation1116 = buttonElevation2;
                            boolean z11117 = z13;
                            Modifier modifier1117 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1113, z13, shape3, jM2518unboximpl1113, jM2507copywmQWz5c$default1113, borderStroke3, fM4389constructorimpl, mutableInteractionSource1118, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1113, contentPadding, content, i211111111111117)), composer2, (i211111111111117 & 14) | 805306368 | (i211111111111117 & 896) | (i211111111111114 & 7168) | (i211111111111117 & 3670016) | ((i211111111111117 << 15) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            buttonElevation3 = buttonElevation1116;
                            buttonColors3 = buttonColors1116;
                            paddingValues2 = paddingValues1115;
                            modifier4 = modifier1117;
                            z14 = z11117;
                            mutableInteractionSource5 = mutableInteractionSource1118;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                    }
                    i12 |= 100663296;
                    paddingValues2 = paddingValues;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111111118 = i22 >> 6;
                        int i211111111111119 = i211111111111118 & 14;
                        int i2111111111111110 = ((i22 >> 18) & 112) | i211111111111119;
                        State<Color> stateContentColor1114 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111110);
                        int i2111111111111111 = i22;
                        Modifier modifierSemantics$default1114 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl1114 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111110).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default1114 = Color.m2507copywmQWz5c$default(stateContentColor1114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors1117 = buttonColors2;
                        PaddingValues paddingValues1116 = contentPadding;
                        MutableInteractionSource mutableInteractionSource1119 = mutableInteractionSource4;
                        ButtonElevation buttonElevation1117 = buttonElevation2;
                        boolean z11118 = z13;
                        Modifier modifier1118 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1114, z13, shape3, jM2518unboximpl1114, jM2507copywmQWz5c$default1114, borderStroke3, fM4389constructorimpl, mutableInteractionSource1119, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1114, contentPadding, content, i2111111111111111)), composer2, (i2111111111111111 & 14) | 805306368 | (i2111111111111111 & 896) | (i211111111111118 & 7168) | (i2111111111111111 & 3670016) | ((i2111111111111111 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation1117;
                        buttonColors3 = buttonColors1117;
                        paddingValues2 = paddingValues1116;
                        modifier4 = modifier1118;
                        z14 = z11118;
                        mutableInteractionSource5 = mutableInteractionSource1119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111111111111112 = i22 >> 6;
                        int i2111111111111113 = i2111111111111112 & 14;
                        int i2111111111111114 = ((i22 >> 18) & 112) | i2111111111111113;
                        State<Color> stateContentColor1115 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111114);
                        int i2111111111111115 = i22;
                        Modifier modifierSemantics$default1115 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl1115 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111114).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default1115 = Color.m2507copywmQWz5c$default(stateContentColor1115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors1118 = buttonColors2;
                        PaddingValues paddingValues1117 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11110 = mutableInteractionSource4;
                        ButtonElevation buttonElevation1118 = buttonElevation2;
                        boolean z11119 = z13;
                        Modifier modifier1119 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1115, z13, shape3, jM2518unboximpl1115, jM2507copywmQWz5c$default1115, borderStroke3, fM4389constructorimpl, mutableInteractionSource11110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1115, contentPadding, content, i2111111111111115)), composer2, (i2111111111111115 & 14) | 805306368 | (i2111111111111115 & 896) | (i2111111111111112 & 7168) | (i2111111111111115 & 3670016) | ((i2111111111111115 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation1118;
                        buttonColors3 = buttonColors1118;
                        paddingValues2 = paddingValues1117;
                        modifier4 = modifier1119;
                        z14 = z11119;
                        mutableInteractionSource5 = mutableInteractionSource11110;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 1572864;
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i2111111111111116 = i22 >> 6;
                        int i2111111111111117 = i2111111111111116 & 14;
                        int i2111111111111118 = ((i22 >> 18) & 112) | i2111111111111117;
                        State<Color> stateContentColor1116 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111118);
                        int i2111111111111119 = i22;
                        Modifier modifierSemantics$default1116 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl1116 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111118).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default1116 = Color.m2507copywmQWz5c$default(stateContentColor1116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors1119 = buttonColors2;
                        PaddingValues paddingValues1118 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11111 = mutableInteractionSource4;
                        ButtonElevation buttonElevation1119 = buttonElevation2;
                        boolean z111110 = z13;
                        Modifier modifier11110 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1116, z13, shape3, jM2518unboximpl1116, jM2507copywmQWz5c$default1116, borderStroke3, fM4389constructorimpl, mutableInteractionSource11111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1116, contentPadding, content, i2111111111111119)), composer2, (i2111111111111119 & 14) | 805306368 | (i2111111111111119 & 896) | (i2111111111111116 & 7168) | (i2111111111111119 & 3670016) | ((i2111111111111119 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation1119;
                        buttonColors3 = buttonColors1119;
                        paddingValues2 = paddingValues1118;
                        modifier4 = modifier11110;
                        z14 = z111110;
                        mutableInteractionSource5 = mutableInteractionSource11111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i21111111111111110 = i22 >> 6;
                        int i21111111111111111 = i21111111111111110 & 14;
                        int i21111111111111112 = ((i22 >> 18) & 112) | i21111111111111111;
                        State<Color> stateContentColor1117 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111112);
                        int i21111111111111113 = i22;
                        Modifier modifierSemantics$default1117 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl1117 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111112).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default1117 = Color.m2507copywmQWz5c$default(stateContentColor1117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors11110 = buttonColors2;
                        PaddingValues paddingValues1119 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11112 = mutableInteractionSource4;
                        ButtonElevation buttonElevation11110 = buttonElevation2;
                        boolean z111111 = z13;
                        Modifier modifier11111 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1117, z13, shape3, jM2518unboximpl1117, jM2507copywmQWz5c$default1117, borderStroke3, fM4389constructorimpl, mutableInteractionSource11112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1117, contentPadding, content, i21111111111111113)), composer2, (i21111111111111113 & 14) | 805306368 | (i21111111111111113 & 896) | (i21111111111111110 & 7168) | (i21111111111111113 & 3670016) | ((i21111111111111113 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation11110;
                        buttonColors3 = buttonColors11110;
                        paddingValues2 = paddingValues1119;
                        modifier4 = modifier11111;
                        z14 = z111111;
                        mutableInteractionSource5 = mutableInteractionSource11112;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111111111114 = i22 >> 6;
                    int i21111111111111115 = i21111111111111114 & 14;
                    int i21111111111111116 = ((i22 >> 18) & 112) | i21111111111111115;
                    State<Color> stateContentColor1118 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111116);
                    int i21111111111111117 = i22;
                    Modifier modifierSemantics$default1118 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl1118 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111116).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default1118 = Color.m2507copywmQWz5c$default(stateContentColor1118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11111 = buttonColors2;
                    PaddingValues paddingValues11110 = contentPadding;
                    MutableInteractionSource mutableInteractionSource11113 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11111 = buttonElevation2;
                    boolean z111112 = z13;
                    Modifier modifier11112 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1118, z13, shape3, jM2518unboximpl1118, jM2507copywmQWz5c$default1118, borderStroke3, fM4389constructorimpl, mutableInteractionSource11113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1118, contentPadding, content, i21111111111111117)), composer2, (i21111111111111117 & 14) | 805306368 | (i21111111111111117 & 896) | (i21111111111111114 & 7168) | (i21111111111111117 & 3670016) | ((i21111111111111117 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11111;
                    buttonColors3 = buttonColors11111;
                    paddingValues2 = paddingValues11110;
                    modifier4 = modifier11112;
                    z14 = z111112;
                    mutableInteractionSource5 = mutableInteractionSource11113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111111111118 = i22 >> 6;
                    int i21111111111111119 = i21111111111111118 & 14;
                    int i211111111111111110 = ((i22 >> 18) & 112) | i21111111111111119;
                    State<Color> stateContentColor1119 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111110);
                    int i211111111111111111 = i22;
                    Modifier modifierSemantics$default1119 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl1119 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111110).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default1119 = Color.m2507copywmQWz5c$default(stateContentColor1119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11112 = buttonColors2;
                    PaddingValues paddingValues11111 = contentPadding;
                    MutableInteractionSource mutableInteractionSource11114 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11112 = buttonElevation2;
                    boolean z111113 = z13;
                    Modifier modifier11113 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1119, z13, shape3, jM2518unboximpl1119, jM2507copywmQWz5c$default1119, borderStroke3, fM4389constructorimpl, mutableInteractionSource11114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1119, contentPadding, content, i211111111111111111)), composer2, (i211111111111111111 & 14) | 805306368 | (i211111111111111111 & 896) | (i21111111111111118 & 7168) | (i211111111111111111 & 3670016) | ((i211111111111111111 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11112;
                    buttonColors3 = buttonColors11112;
                    paddingValues2 = paddingValues11111;
                    modifier4 = modifier11113;
                    z14 = z111113;
                    mutableInteractionSource5 = mutableInteractionSource11114;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                    if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                i12 |= i25;
            } else {
                buttonElevationM681elevationR_JCAzs = buttonElevation;
            }
            if ((458752 & i10) == 0) {
                shape2 = shape;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111111111112 = i22 >> 6;
                        int i211111111111111113 = i211111111111111112 & 14;
                        int i211111111111111114 = ((i22 >> 18) & 112) | i211111111111111113;
                        State<Color> stateContentColor11110 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111114);
                        int i211111111111111115 = i22;
                        Modifier modifierSemantics$default11110 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl11110 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111114).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default11110 = Color.m2507copywmQWz5c$default(stateContentColor11110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors11113 = buttonColors2;
                        PaddingValues paddingValues11112 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11115 = mutableInteractionSource4;
                        ButtonElevation buttonElevation11113 = buttonElevation2;
                        boolean z111114 = z13;
                        Modifier modifier11114 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11110, z13, shape3, jM2518unboximpl11110, jM2507copywmQWz5c$default11110, borderStroke3, fM4389constructorimpl, mutableInteractionSource11115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11110, contentPadding, content, i211111111111111115)), composer2, (i211111111111111115 & 14) | 805306368 | (i211111111111111115 & 896) | (i211111111111111112 & 7168) | (i211111111111111115 & 3670016) | ((i211111111111111115 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation11113;
                        buttonColors3 = buttonColors11113;
                        paddingValues2 = paddingValues11112;
                        modifier4 = modifier11114;
                        z14 = z111114;
                        mutableInteractionSource5 = mutableInteractionSource11115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111111111116 = i22 >> 6;
                        int i211111111111111117 = i211111111111111116 & 14;
                        int i211111111111111118 = ((i22 >> 18) & 112) | i211111111111111117;
                        State<Color> stateContentColor11111 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111118);
                        int i211111111111111119 = i22;
                        Modifier modifierSemantics$default11111 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl11111 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111118).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default11111 = Color.m2507copywmQWz5c$default(stateContentColor11111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors11114 = buttonColors2;
                        PaddingValues paddingValues11113 = contentPadding;
                        MutableInteractionSource mutableInteractionSource11116 = mutableInteractionSource4;
                        ButtonElevation buttonElevation11114 = buttonElevation2;
                        boolean z111115 = z13;
                        Modifier modifier11115 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11111, z13, shape3, jM2518unboximpl11111, jM2507copywmQWz5c$default11111, borderStroke3, fM4389constructorimpl, mutableInteractionSource11116, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11111, contentPadding, content, i211111111111111119)), composer2, (i211111111111111119 & 14) | 805306368 | (i211111111111111119 & 896) | (i211111111111111116 & 7168) | (i211111111111111119 & 3670016) | ((i211111111111111119 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation11114;
                        buttonColors3 = buttonColors11114;
                        paddingValues2 = paddingValues11113;
                        modifier4 = modifier11115;
                        z14 = z111115;
                        mutableInteractionSource5 = mutableInteractionSource11116;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111110 = i22 >> 6;
                    int i2111111111111111111 = i2111111111111111110 & 14;
                    int i2111111111111111112 = ((i22 >> 18) & 112) | i2111111111111111111;
                    State<Color> stateContentColor11112 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111112);
                    int i2111111111111111113 = i22;
                    Modifier modifierSemantics$default11112 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl11112 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111112).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default11112 = Color.m2507copywmQWz5c$default(stateContentColor11112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11115 = buttonColors2;
                    PaddingValues paddingValues11114 = contentPadding;
                    MutableInteractionSource mutableInteractionSource11117 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11115 = buttonElevation2;
                    boolean z111116 = z13;
                    Modifier modifier11116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11112, z13, shape3, jM2518unboximpl11112, jM2507copywmQWz5c$default11112, borderStroke3, fM4389constructorimpl, mutableInteractionSource11117, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11112, contentPadding, content, i2111111111111111113)), composer2, (i2111111111111111113 & 14) | 805306368 | (i2111111111111111113 & 896) | (i2111111111111111110 & 7168) | (i2111111111111111113 & 3670016) | ((i2111111111111111113 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11115;
                    buttonColors3 = buttonColors11115;
                    paddingValues2 = paddingValues11114;
                    modifier4 = modifier11116;
                    z14 = z111116;
                    mutableInteractionSource5 = mutableInteractionSource11117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111114 = i22 >> 6;
                    int i2111111111111111115 = i2111111111111111114 & 14;
                    int i2111111111111111116 = ((i22 >> 18) & 112) | i2111111111111111115;
                    State<Color> stateContentColor11113 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111116);
                    int i2111111111111111117 = i22;
                    Modifier modifierSemantics$default11113 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl11113 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111116).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default11113 = Color.m2507copywmQWz5c$default(stateContentColor11113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11116 = buttonColors2;
                    PaddingValues paddingValues11115 = contentPadding;
                    MutableInteractionSource mutableInteractionSource11118 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11116 = buttonElevation2;
                    boolean z111117 = z13;
                    Modifier modifier11117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11113, z13, shape3, jM2518unboximpl11113, jM2507copywmQWz5c$default11113, borderStroke3, fM4389constructorimpl, mutableInteractionSource11118, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11113, contentPadding, content, i2111111111111111117)), composer2, (i2111111111111111117 & 14) | 805306368 | (i2111111111111111117 & 896) | (i2111111111111111114 & 7168) | (i2111111111111111117 & 3670016) | ((i2111111111111111117 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11116;
                    buttonColors3 = buttonColors11116;
                    paddingValues2 = paddingValues11115;
                    modifier4 = modifier11117;
                    z14 = z111117;
                    mutableInteractionSource5 = mutableInteractionSource11118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 1572864;
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111118 = i22 >> 6;
                    int i2111111111111111119 = i2111111111111111118 & 14;
                    int i21111111111111111110 = ((i22 >> 18) & 112) | i2111111111111111119;
                    State<Color> stateContentColor11114 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111110);
                    int i21111111111111111111 = i22;
                    Modifier modifierSemantics$default11114 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl11114 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111110).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default11114 = Color.m2507copywmQWz5c$default(stateContentColor11114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11117 = buttonColors2;
                    PaddingValues paddingValues11116 = contentPadding;
                    MutableInteractionSource mutableInteractionSource11119 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11117 = buttonElevation2;
                    boolean z111118 = z13;
                    Modifier modifier11118 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11114, z13, shape3, jM2518unboximpl11114, jM2507copywmQWz5c$default11114, borderStroke3, fM4389constructorimpl, mutableInteractionSource11119, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11114, contentPadding, content, i21111111111111111111)), composer2, (i21111111111111111111 & 14) | 805306368 | (i21111111111111111111 & 896) | (i2111111111111111118 & 7168) | (i21111111111111111111 & 3670016) | ((i21111111111111111111 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11117;
                    buttonColors3 = buttonColors11117;
                    paddingValues2 = paddingValues11116;
                    modifier4 = modifier11118;
                    z14 = z111118;
                    mutableInteractionSource5 = mutableInteractionSource11119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111111111111112 = i22 >> 6;
                    int i21111111111111111113 = i21111111111111111112 & 14;
                    int i21111111111111111114 = ((i22 >> 18) & 112) | i21111111111111111113;
                    State<Color> stateContentColor11115 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111114);
                    int i21111111111111111115 = i22;
                    Modifier modifierSemantics$default11115 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl11115 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111114).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default11115 = Color.m2507copywmQWz5c$default(stateContentColor11115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors11118 = buttonColors2;
                    PaddingValues paddingValues11117 = contentPadding;
                    MutableInteractionSource mutableInteractionSource111110 = mutableInteractionSource4;
                    ButtonElevation buttonElevation11118 = buttonElevation2;
                    boolean z111119 = z13;
                    Modifier modifier11119 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11115, z13, shape3, jM2518unboximpl11115, jM2507copywmQWz5c$default11115, borderStroke3, fM4389constructorimpl, mutableInteractionSource111110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11115, contentPadding, content, i21111111111111111115)), composer2, (i21111111111111111115 & 14) | 805306368 | (i21111111111111111115 & 896) | (i21111111111111111112 & 7168) | (i21111111111111111115 & 3670016) | ((i21111111111111111115 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation11118;
                    buttonColors3 = buttonColors11118;
                    paddingValues2 = paddingValues11117;
                    modifier4 = modifier11119;
                    z14 = z111119;
                    mutableInteractionSource5 = mutableInteractionSource111110;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 100663296;
            paddingValues2 = paddingValues;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((1533916891 & i22) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111111111116 = i22 >> 6;
                int i21111111111111111117 = i21111111111111111116 & 14;
                int i21111111111111111118 = ((i22 >> 18) & 112) | i21111111111111111117;
                State<Color> stateContentColor11116 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111118);
                int i21111111111111111119 = i22;
                Modifier modifierSemantics$default11116 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl11116 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111118).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default11116 = Color.m2507copywmQWz5c$default(stateContentColor11116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors11119 = buttonColors2;
                PaddingValues paddingValues11118 = contentPadding;
                MutableInteractionSource mutableInteractionSource111111 = mutableInteractionSource4;
                ButtonElevation buttonElevation11119 = buttonElevation2;
                boolean z1111110 = z13;
                Modifier modifier111110 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11116, z13, shape3, jM2518unboximpl11116, jM2507copywmQWz5c$default11116, borderStroke3, fM4389constructorimpl, mutableInteractionSource111111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11116, contentPadding, content, i21111111111111111119)), composer2, (i21111111111111111119 & 14) | 805306368 | (i21111111111111111119 & 896) | (i21111111111111111116 & 7168) | (i21111111111111111119 & 3670016) | ((i21111111111111111119 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation11119;
                buttonColors3 = buttonColors11119;
                paddingValues2 = paddingValues11118;
                modifier4 = modifier111110;
                z14 = z1111110;
                mutableInteractionSource5 = mutableInteractionSource111111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i211111111111111111110 = i22 >> 6;
                int i211111111111111111111 = i211111111111111111110 & 14;
                int i211111111111111111112 = ((i22 >> 18) & 112) | i211111111111111111111;
                State<Color> stateContentColor11117 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111112);
                int i211111111111111111113 = i22;
                Modifier modifierSemantics$default11117 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl11117 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111112).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default11117 = Color.m2507copywmQWz5c$default(stateContentColor11117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors111110 = buttonColors2;
                PaddingValues paddingValues11119 = contentPadding;
                MutableInteractionSource mutableInteractionSource111112 = mutableInteractionSource4;
                ButtonElevation buttonElevation111110 = buttonElevation2;
                boolean z1111111 = z13;
                Modifier modifier111111 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11117, z13, shape3, jM2518unboximpl11117, jM2507copywmQWz5c$default11117, borderStroke3, fM4389constructorimpl, mutableInteractionSource111112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11117, contentPadding, content, i211111111111111111113)), composer2, (i211111111111111111113 & 14) | 805306368 | (i211111111111111111113 & 896) | (i211111111111111111110 & 7168) | (i211111111111111111113 & 3670016) | ((i211111111111111111113 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation111110;
                buttonColors3 = buttonColors111110;
                paddingValues2 = paddingValues11119;
                modifier4 = modifier111111;
                z14 = z1111111;
                mutableInteractionSource5 = mutableInteractionSource111112;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                    if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                    }
                    i12 |= i25;
                } else {
                    buttonElevationM681elevationR_JCAzs = buttonElevation;
                }
                i12 |= i25;
            } else {
                buttonElevationM681elevationR_JCAzs = buttonElevation;
            }
            if ((458752 & i10) == 0) {
                shape2 = shape;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((1533916891 & i22) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111111111111114 = i22 >> 6;
                        int i211111111111111111115 = i211111111111111111114 & 14;
                        int i211111111111111111116 = ((i22 >> 18) & 112) | i211111111111111111115;
                        State<Color> stateContentColor11118 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111116);
                        int i211111111111111111117 = i22;
                        Modifier modifierSemantics$default11118 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl11118 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111116).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default11118 = Color.m2507copywmQWz5c$default(stateContentColor11118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors111111 = buttonColors2;
                        PaddingValues paddingValues111110 = contentPadding;
                        MutableInteractionSource mutableInteractionSource111113 = mutableInteractionSource4;
                        ButtonElevation buttonElevation111111 = buttonElevation2;
                        boolean z1111112 = z13;
                        Modifier modifier111112 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11118, z13, shape3, jM2518unboximpl11118, jM2507copywmQWz5c$default11118, borderStroke3, fM4389constructorimpl, mutableInteractionSource111113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11118, contentPadding, content, i211111111111111111117)), composer2, (i211111111111111111117 & 14) | 805306368 | (i211111111111111111117 & 896) | (i211111111111111111114 & 7168) | (i211111111111111111117 & 3670016) | ((i211111111111111111117 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation111111;
                        buttonColors3 = buttonColors111111;
                        paddingValues2 = paddingValues111110;
                        modifier4 = modifier111112;
                        z14 = z1111112;
                        mutableInteractionSource5 = mutableInteractionSource111113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
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
                            if ((i11 & 16) != 0) {
                                i22 &= -57345;
                                buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if ((i11 & 32) != 0) {
                                small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                i22 &= -458753;
                            } else {
                                small = shape;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i11 & 128) != 0) {
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i22 &= -29360129;
                            } else {
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if (i19 != 0) {
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            } else {
                                contentPadding = paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke2;
                                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                                buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                                modifier3 = modifier2;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                        }
                        int i211111111111111111118 = i22 >> 6;
                        int i211111111111111111119 = i211111111111111111118 & 14;
                        int i2111111111111111111110 = ((i22 >> 18) & 112) | i211111111111111111119;
                        State<Color> stateContentColor11119 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111111110);
                        int i2111111111111111111111 = i22;
                        Modifier modifierSemantics$default11119 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                        long jM2518unboximpl11119 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111111110).getValue().m2518unboximpl();
                        long jM2507copywmQWz5c$default11119 = Color.m2507copywmQWz5c$default(stateContentColor11119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceableGroup(-423487112);
                        if (buttonElevation2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateElevation != null) {
                            fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                        } else {
                            fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        }
                        ButtonColors buttonColors111112 = buttonColors2;
                        PaddingValues paddingValues111111 = contentPadding;
                        MutableInteractionSource mutableInteractionSource111114 = mutableInteractionSource4;
                        ButtonElevation buttonElevation111112 = buttonElevation2;
                        boolean z1111113 = z13;
                        Modifier modifier111113 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default11119, z13, shape3, jM2518unboximpl11119, jM2507copywmQWz5c$default11119, borderStroke3, fM4389constructorimpl, mutableInteractionSource111114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor11119, contentPadding, content, i2111111111111111111111)), composer2, (i2111111111111111111111 & 14) | 805306368 | (i2111111111111111111111 & 896) | (i211111111111111111118 & 7168) | (i2111111111111111111111 & 3670016) | ((i2111111111111111111111 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        buttonElevation3 = buttonElevation111112;
                        buttonColors3 = buttonColors111112;
                        paddingValues2 = paddingValues111111;
                        modifier4 = modifier111113;
                        z14 = z1111113;
                        mutableInteractionSource5 = mutableInteractionSource111114;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
                }
                i12 |= 100663296;
                paddingValues2 = paddingValues;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111111112 = i22 >> 6;
                    int i2111111111111111111113 = i2111111111111111111112 & 14;
                    int i2111111111111111111114 = ((i22 >> 18) & 112) | i2111111111111111111113;
                    State<Color> stateContentColor111110 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111111114);
                    int i2111111111111111111115 = i22;
                    Modifier modifierSemantics$default111110 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111110 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111111114).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111110 = Color.m2507copywmQWz5c$default(stateContentColor111110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors111113 = buttonColors2;
                    PaddingValues paddingValues111112 = contentPadding;
                    MutableInteractionSource mutableInteractionSource111115 = mutableInteractionSource4;
                    ButtonElevation buttonElevation111113 = buttonElevation2;
                    boolean z1111114 = z13;
                    Modifier modifier111114 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111110, z13, shape3, jM2518unboximpl111110, jM2507copywmQWz5c$default111110, borderStroke3, fM4389constructorimpl, mutableInteractionSource111115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111110, contentPadding, content, i2111111111111111111115)), composer2, (i2111111111111111111115 & 14) | 805306368 | (i2111111111111111111115 & 896) | (i2111111111111111111112 & 7168) | (i2111111111111111111115 & 3670016) | ((i2111111111111111111115 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation111113;
                    buttonColors3 = buttonColors111113;
                    paddingValues2 = paddingValues111112;
                    modifier4 = modifier111114;
                    z14 = z1111114;
                    mutableInteractionSource5 = mutableInteractionSource111115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111111116 = i22 >> 6;
                    int i2111111111111111111117 = i2111111111111111111116 & 14;
                    int i2111111111111111111118 = ((i22 >> 18) & 112) | i2111111111111111111117;
                    State<Color> stateContentColor111111 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111111118);
                    int i2111111111111111111119 = i22;
                    Modifier modifierSemantics$default111111 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111111 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111111118).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111111 = Color.m2507copywmQWz5c$default(stateContentColor111111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors111114 = buttonColors2;
                    PaddingValues paddingValues111113 = contentPadding;
                    MutableInteractionSource mutableInteractionSource111116 = mutableInteractionSource4;
                    ButtonElevation buttonElevation111114 = buttonElevation2;
                    boolean z1111115 = z13;
                    Modifier modifier111115 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111111, z13, shape3, jM2518unboximpl111111, jM2507copywmQWz5c$default111111, borderStroke3, fM4389constructorimpl, mutableInteractionSource111116, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111111, contentPadding, content, i2111111111111111111119)), composer2, (i2111111111111111111119 & 14) | 805306368 | (i2111111111111111111119 & 896) | (i2111111111111111111116 & 7168) | (i2111111111111111111119 & 3670016) | ((i2111111111111111111119 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation111114;
                    buttonColors3 = buttonColors111114;
                    paddingValues2 = paddingValues111113;
                    modifier4 = modifier111115;
                    z14 = z1111115;
                    mutableInteractionSource5 = mutableInteractionSource111116;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 1572864;
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111111111111111110 = i22 >> 6;
                    int i21111111111111111111111 = i21111111111111111111110 & 14;
                    int i21111111111111111111112 = ((i22 >> 18) & 112) | i21111111111111111111111;
                    State<Color> stateContentColor111112 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111111112);
                    int i21111111111111111111113 = i22;
                    Modifier modifierSemantics$default111112 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111112 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111111112).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111112 = Color.m2507copywmQWz5c$default(stateContentColor111112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors111115 = buttonColors2;
                    PaddingValues paddingValues111114 = contentPadding;
                    MutableInteractionSource mutableInteractionSource111117 = mutableInteractionSource4;
                    ButtonElevation buttonElevation111115 = buttonElevation2;
                    boolean z1111116 = z13;
                    Modifier modifier111116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111112, z13, shape3, jM2518unboximpl111112, jM2507copywmQWz5c$default111112, borderStroke3, fM4389constructorimpl, mutableInteractionSource111117, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111112, contentPadding, content, i21111111111111111111113)), composer2, (i21111111111111111111113 & 14) | 805306368 | (i21111111111111111111113 & 896) | (i21111111111111111111110 & 7168) | (i21111111111111111111113 & 3670016) | ((i21111111111111111111113 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation111115;
                    buttonColors3 = buttonColors111115;
                    paddingValues2 = paddingValues111114;
                    modifier4 = modifier111116;
                    z14 = z1111116;
                    mutableInteractionSource5 = mutableInteractionSource111117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i21111111111111111111114 = i22 >> 6;
                    int i21111111111111111111115 = i21111111111111111111114 & 14;
                    int i21111111111111111111116 = ((i22 >> 18) & 112) | i21111111111111111111115;
                    State<Color> stateContentColor111113 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111111116);
                    int i21111111111111111111117 = i22;
                    Modifier modifierSemantics$default111113 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111113 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111111116).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111113 = Color.m2507copywmQWz5c$default(stateContentColor111113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors111116 = buttonColors2;
                    PaddingValues paddingValues111115 = contentPadding;
                    MutableInteractionSource mutableInteractionSource111118 = mutableInteractionSource4;
                    ButtonElevation buttonElevation111116 = buttonElevation2;
                    boolean z1111117 = z13;
                    Modifier modifier111117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111113, z13, shape3, jM2518unboximpl111113, jM2507copywmQWz5c$default111113, borderStroke3, fM4389constructorimpl, mutableInteractionSource111118, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111113, contentPadding, content, i21111111111111111111117)), composer2, (i21111111111111111111117 & 14) | 805306368 | (i21111111111111111111117 & 896) | (i21111111111111111111114 & 7168) | (i21111111111111111111117 & 3670016) | ((i21111111111111111111117 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation111116;
                    buttonColors3 = buttonColors111116;
                    paddingValues2 = paddingValues111115;
                    modifier4 = modifier111117;
                    z14 = z1111117;
                    mutableInteractionSource5 = mutableInteractionSource111118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 100663296;
            paddingValues2 = paddingValues;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((1533916891 & i22) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111111111111118 = i22 >> 6;
                int i21111111111111111111119 = i21111111111111111111118 & 14;
                int i211111111111111111111110 = ((i22 >> 18) & 112) | i21111111111111111111119;
                State<Color> stateContentColor111114 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111111110);
                int i211111111111111111111111 = i22;
                Modifier modifierSemantics$default111114 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl111114 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111111110).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default111114 = Color.m2507copywmQWz5c$default(stateContentColor111114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors111117 = buttonColors2;
                PaddingValues paddingValues111116 = contentPadding;
                MutableInteractionSource mutableInteractionSource111119 = mutableInteractionSource4;
                ButtonElevation buttonElevation111117 = buttonElevation2;
                boolean z1111118 = z13;
                Modifier modifier111118 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111114, z13, shape3, jM2518unboximpl111114, jM2507copywmQWz5c$default111114, borderStroke3, fM4389constructorimpl, mutableInteractionSource111119, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111114, contentPadding, content, i211111111111111111111111)), composer2, (i211111111111111111111111 & 14) | 805306368 | (i211111111111111111111111 & 896) | (i21111111111111111111118 & 7168) | (i211111111111111111111111 & 3670016) | ((i211111111111111111111111 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation111117;
                buttonColors3 = buttonColors111117;
                paddingValues2 = paddingValues111116;
                modifier4 = modifier111118;
                z14 = z1111118;
                mutableInteractionSource5 = mutableInteractionSource111119;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i211111111111111111111112 = i22 >> 6;
                int i211111111111111111111113 = i211111111111111111111112 & 14;
                int i211111111111111111111114 = ((i22 >> 18) & 112) | i211111111111111111111113;
                State<Color> stateContentColor111115 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111111114);
                int i211111111111111111111115 = i22;
                Modifier modifierSemantics$default111115 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl111115 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111111114).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default111115 = Color.m2507copywmQWz5c$default(stateContentColor111115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors111118 = buttonColors2;
                PaddingValues paddingValues111117 = contentPadding;
                MutableInteractionSource mutableInteractionSource1111110 = mutableInteractionSource4;
                ButtonElevation buttonElevation111118 = buttonElevation2;
                boolean z1111119 = z13;
                Modifier modifier111119 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111115, z13, shape3, jM2518unboximpl111115, jM2507copywmQWz5c$default111115, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111115, contentPadding, content, i211111111111111111111115)), composer2, (i211111111111111111111115 & 14) | 805306368 | (i211111111111111111111115 & 896) | (i211111111111111111111112 & 7168) | (i211111111111111111111115 & 3670016) | ((i211111111111111111111115 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation111118;
                buttonColors3 = buttonColors111118;
                paddingValues2 = paddingValues111117;
                modifier4 = modifier111119;
                z14 = z1111119;
                mutableInteractionSource5 = mutableInteractionSource1111110;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
        }
        i12 |= 3072;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                buttonElevationM681elevationR_JCAzs = buttonElevation;
                if (composerStartRestartGroup.changed(buttonElevationM681elevationR_JCAzs)) {
                }
                i12 |= i25;
            } else {
                buttonElevationM681elevationR_JCAzs = buttonElevation;
            }
            i12 |= i25;
        } else {
            buttonElevationM681elevationR_JCAzs = buttonElevation;
        }
        if ((458752 & i10) == 0) {
            shape2 = shape;
            if ((i11 & 32) == 0) {
                i23 = 65536;
            } else {
                i23 = 65536;
            }
            i12 |= i23;
        } else {
            shape2 = shape;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((1533916891 & i22) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i211111111111111111111116 = i22 >> 6;
                    int i211111111111111111111117 = i211111111111111111111116 & 14;
                    int i211111111111111111111118 = ((i22 >> 18) & 112) | i211111111111111111111117;
                    State<Color> stateContentColor111116 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111111118);
                    int i211111111111111111111119 = i22;
                    Modifier modifierSemantics$default111116 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111116 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111111118).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111116 = Color.m2507copywmQWz5c$default(stateContentColor111116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors111119 = buttonColors2;
                    PaddingValues paddingValues111118 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1111111 = mutableInteractionSource4;
                    ButtonElevation buttonElevation111119 = buttonElevation2;
                    boolean z11111110 = z13;
                    Modifier modifier1111110 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111116, z13, shape3, jM2518unboximpl111116, jM2507copywmQWz5c$default111116, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111116, contentPadding, content, i211111111111111111111119)), composer2, (i211111111111111111111119 & 14) | 805306368 | (i211111111111111111111119 & 896) | (i211111111111111111111116 & 7168) | (i211111111111111111111119 & 3670016) | ((i211111111111111111111119 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation111119;
                    buttonColors3 = buttonColors111119;
                    paddingValues2 = paddingValues111118;
                    modifier4 = modifier1111110;
                    z14 = z11111110;
                    mutableInteractionSource5 = mutableInteractionSource1111111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
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
                        if ((i11 & 16) != 0) {
                            i22 &= -57345;
                            buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        }
                        if ((i11 & 32) != 0) {
                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                            i22 &= -458753;
                        } else {
                            small = shape;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i11 & 128) != 0) {
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i22 &= -29360129;
                        } else {
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if (i19 != 0) {
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        } else {
                            contentPadding = paddingValues;
                            shape3 = small;
                            borderStroke3 = borderStroke2;
                            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                            buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                    }
                    int i2111111111111111111111110 = i22 >> 6;
                    int i2111111111111111111111111 = i2111111111111111111111110 & 14;
                    int i2111111111111111111111112 = ((i22 >> 18) & 112) | i2111111111111111111111111;
                    State<Color> stateContentColor111117 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111111111112);
                    int i2111111111111111111111113 = i22;
                    Modifier modifierSemantics$default111117 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                    long jM2518unboximpl111117 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111111111112).getValue().m2518unboximpl();
                    long jM2507copywmQWz5c$default111117 = Color.m2507copywmQWz5c$default(stateContentColor111117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceableGroup(-423487112);
                    if (buttonElevation2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (stateElevation != null) {
                        fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                    } else {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    ButtonColors buttonColors1111110 = buttonColors2;
                    PaddingValues paddingValues111119 = contentPadding;
                    MutableInteractionSource mutableInteractionSource1111112 = mutableInteractionSource4;
                    ButtonElevation buttonElevation1111110 = buttonElevation2;
                    boolean z11111111 = z13;
                    Modifier modifier1111111 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111117, z13, shape3, jM2518unboximpl111117, jM2507copywmQWz5c$default111117, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111117, contentPadding, content, i2111111111111111111111113)), composer2, (i2111111111111111111111113 & 14) | 805306368 | (i2111111111111111111111113 & 896) | (i2111111111111111111111110 & 7168) | (i2111111111111111111111113 & 3670016) | ((i2111111111111111111111113 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    buttonElevation3 = buttonElevation1111110;
                    buttonColors3 = buttonColors1111110;
                    paddingValues2 = paddingValues111119;
                    modifier4 = modifier1111111;
                    z14 = z11111111;
                    mutableInteractionSource5 = mutableInteractionSource1111112;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
            }
            i12 |= 100663296;
            paddingValues2 = paddingValues;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((1533916891 & i22) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i2111111111111111111111114 = i22 >> 6;
                int i2111111111111111111111115 = i2111111111111111111111114 & 14;
                int i2111111111111111111111116 = ((i22 >> 18) & 112) | i2111111111111111111111115;
                State<Color> stateContentColor111118 = buttonColors2.contentColor(z13, composerStartRestartGroup, i2111111111111111111111116);
                int i2111111111111111111111117 = i22;
                Modifier modifierSemantics$default111118 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl111118 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i2111111111111111111111116).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default111118 = Color.m2507copywmQWz5c$default(stateContentColor111118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1111111 = buttonColors2;
                PaddingValues paddingValues1111110 = contentPadding;
                MutableInteractionSource mutableInteractionSource1111113 = mutableInteractionSource4;
                ButtonElevation buttonElevation1111111 = buttonElevation2;
                boolean z11111112 = z13;
                Modifier modifier1111112 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111118, z13, shape3, jM2518unboximpl111118, jM2507copywmQWz5c$default111118, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111118, contentPadding, content, i2111111111111111111111117)), composer2, (i2111111111111111111111117 & 14) | 805306368 | (i2111111111111111111111117 & 896) | (i2111111111111111111111114 & 7168) | (i2111111111111111111111117 & 3670016) | ((i2111111111111111111111117 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1111111;
                buttonColors3 = buttonColors1111111;
                paddingValues2 = paddingValues1111110;
                modifier4 = modifier1111112;
                z14 = z11111112;
                mutableInteractionSource5 = mutableInteractionSource1111113;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i2111111111111111111111118 = i22 >> 6;
                int i2111111111111111111111119 = i2111111111111111111111118 & 14;
                int i21111111111111111111111110 = ((i22 >> 18) & 112) | i2111111111111111111111119;
                State<Color> stateContentColor111119 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111111111110);
                int i21111111111111111111111111 = i22;
                Modifier modifierSemantics$default111119 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl111119 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111111111110).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default111119 = Color.m2507copywmQWz5c$default(stateContentColor111119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1111112 = buttonColors2;
                PaddingValues paddingValues1111111 = contentPadding;
                MutableInteractionSource mutableInteractionSource1111114 = mutableInteractionSource4;
                ButtonElevation buttonElevation1111112 = buttonElevation2;
                boolean z11111113 = z13;
                Modifier modifier1111113 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default111119, z13, shape3, jM2518unboximpl111119, jM2507copywmQWz5c$default111119, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor111119, contentPadding, content, i21111111111111111111111111)), composer2, (i21111111111111111111111111 & 14) | 805306368 | (i21111111111111111111111111 & 896) | (i2111111111111111111111118 & 7168) | (i21111111111111111111111111 & 3670016) | ((i21111111111111111111111111 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1111112;
                buttonColors3 = buttonColors1111112;
                paddingValues2 = paddingValues1111111;
                modifier4 = modifier1111113;
                z14 = z11111113;
                mutableInteractionSource5 = mutableInteractionSource1111114;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
        }
        i12 |= 1572864;
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(buttonColors)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 234881024) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((1533916891 & i22) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111111111111111112 = i22 >> 6;
                int i21111111111111111111111113 = i21111111111111111111111112 & 14;
                int i21111111111111111111111114 = ((i22 >> 18) & 112) | i21111111111111111111111113;
                State<Color> stateContentColor1111110 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111111111114);
                int i21111111111111111111111115 = i22;
                Modifier modifierSemantics$default1111110 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl1111110 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111111111114).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default1111110 = Color.m2507copywmQWz5c$default(stateContentColor1111110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1111113 = buttonColors2;
                PaddingValues paddingValues1111112 = contentPadding;
                MutableInteractionSource mutableInteractionSource1111115 = mutableInteractionSource4;
                ButtonElevation buttonElevation1111113 = buttonElevation2;
                boolean z11111114 = z13;
                Modifier modifier1111114 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1111110, z13, shape3, jM2518unboximpl1111110, jM2507copywmQWz5c$default1111110, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1111110, contentPadding, content, i21111111111111111111111115)), composer2, (i21111111111111111111111115 & 14) | 805306368 | (i21111111111111111111111115 & 896) | (i21111111111111111111111112 & 7168) | (i21111111111111111111111115 & 3670016) | ((i21111111111111111111111115 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1111113;
                buttonColors3 = buttonColors1111113;
                paddingValues2 = paddingValues1111112;
                modifier4 = modifier1111114;
                z14 = z11111114;
                mutableInteractionSource5 = mutableInteractionSource1111115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
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
                    if ((i11 & 16) != 0) {
                        i22 &= -57345;
                        buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    }
                    if ((i11 & 32) != 0) {
                        small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                        i22 &= -458753;
                    } else {
                        small = shape;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i11 & 128) != 0) {
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i22 &= -29360129;
                    } else {
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if (i19 != 0) {
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    } else {
                        contentPadding = paddingValues;
                        shape3 = small;
                        borderStroke3 = borderStroke2;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                        modifier3 = modifier2;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
                }
                int i21111111111111111111111116 = i22 >> 6;
                int i21111111111111111111111117 = i21111111111111111111111116 & 14;
                int i21111111111111111111111118 = ((i22 >> 18) & 112) | i21111111111111111111111117;
                State<Color> stateContentColor1111111 = buttonColors2.contentColor(z13, composerStartRestartGroup, i21111111111111111111111118);
                int i21111111111111111111111119 = i22;
                Modifier modifierSemantics$default1111111 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
                long jM2518unboximpl1111111 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i21111111111111111111111118).getValue().m2518unboximpl();
                long jM2507copywmQWz5c$default1111111 = Color.m2507copywmQWz5c$default(stateContentColor1111111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(-423487112);
                if (buttonElevation2 != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (stateElevation != null) {
                    fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
                } else {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                ButtonColors buttonColors1111114 = buttonColors2;
                PaddingValues paddingValues1111113 = contentPadding;
                MutableInteractionSource mutableInteractionSource1111116 = mutableInteractionSource4;
                ButtonElevation buttonElevation1111114 = buttonElevation2;
                boolean z11111115 = z13;
                Modifier modifier1111115 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1111111, z13, shape3, jM2518unboximpl1111111, jM2507copywmQWz5c$default1111111, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111116, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1111111, contentPadding, content, i21111111111111111111111119)), composer2, (i21111111111111111111111119 & 14) | 805306368 | (i21111111111111111111111119 & 896) | (i21111111111111111111111116 & 7168) | (i21111111111111111111111119 & 3670016) | ((i21111111111111111111111119 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                buttonElevation3 = buttonElevation1111114;
                buttonColors3 = buttonColors1111114;
                paddingValues2 = paddingValues1111113;
                modifier4 = modifier1111115;
                z14 = z11111115;
                mutableInteractionSource5 = mutableInteractionSource1111116;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
        }
        i12 |= 100663296;
        paddingValues2 = paddingValues;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((1879048192 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i21 = PKIFailureInfo.duplicateCertReq;
            } else {
                i21 = 268435456;
            }
            i12 |= i21;
        }
        i22 = i12;
        if ((1533916891 & i22) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
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
                if ((i11 & 16) != 0) {
                    i22 &= -57345;
                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                }
                if ((i11 & 32) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i22 &= -458753;
                } else {
                    small = shape;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i11 & 128) != 0) {
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i22 &= -29360129;
                } else {
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if (i19 != 0) {
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                } else {
                    contentPadding = paddingValues;
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
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
                if ((i11 & 16) != 0) {
                    i22 &= -57345;
                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                }
                if ((i11 & 32) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i22 &= -458753;
                } else {
                    small = shape;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i11 & 128) != 0) {
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i22 &= -29360129;
                } else {
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if (i19 != 0) {
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                } else {
                    contentPadding = paddingValues;
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
            }
            int i211111111111111111111111110 = i22 >> 6;
            int i211111111111111111111111111 = i211111111111111111111111110 & 14;
            int i211111111111111111111111112 = ((i22 >> 18) & 112) | i211111111111111111111111111;
            State<Color> stateContentColor1111112 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111111111112);
            int i211111111111111111111111113 = i22;
            Modifier modifierSemantics$default1111112 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
            long jM2518unboximpl1111112 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111111111112).getValue().m2518unboximpl();
            long jM2507copywmQWz5c$default1111112 = Color.m2507copywmQWz5c$default(stateContentColor1111112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-423487112);
            if (buttonElevation2 != null) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (stateElevation != null) {
                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            ButtonColors buttonColors1111115 = buttonColors2;
            PaddingValues paddingValues1111114 = contentPadding;
            MutableInteractionSource mutableInteractionSource1111117 = mutableInteractionSource4;
            ButtonElevation buttonElevation1111115 = buttonElevation2;
            boolean z11111116 = z13;
            Modifier modifier1111116 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1111112, z13, shape3, jM2518unboximpl1111112, jM2507copywmQWz5c$default1111112, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111117, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1111112, contentPadding, content, i211111111111111111111111113)), composer2, (i211111111111111111111111113 & 14) | 805306368 | (i211111111111111111111111113 & 896) | (i211111111111111111111111110 & 7168) | (i211111111111111111111111113 & 3670016) | ((i211111111111111111111111113 << 15) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            buttonElevation3 = buttonElevation1111115;
            buttonColors3 = buttonColors1111115;
            paddingValues2 = paddingValues1111114;
            modifier4 = modifier1111116;
            z14 = z11111116;
            mutableInteractionSource5 = mutableInteractionSource1111117;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
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
                if ((i11 & 16) != 0) {
                    i22 &= -57345;
                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                }
                if ((i11 & 32) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i22 &= -458753;
                } else {
                    small = shape;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i11 & 128) != 0) {
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i22 &= -29360129;
                } else {
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if (i19 != 0) {
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                } else {
                    contentPadding = paddingValues;
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
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
                if ((i11 & 16) != 0) {
                    i22 &= -57345;
                    buttonElevationM681elevationR_JCAzs = ButtonDefaults.INSTANCE.m681elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                }
                if ((i11 & 32) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                    i22 &= -458753;
                } else {
                    small = shape;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i11 & 128) != 0) {
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i22 &= -29360129;
                } else {
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if (i19 != 0) {
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                } else {
                    contentPadding = paddingValues;
                    shape3 = small;
                    borderStroke3 = borderStroke2;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    buttonElevation2 = buttonElevationM681elevationR_JCAzs;
                    modifier3 = modifier2;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116133464, i22, -1, "androidx.compose.material.Button (Button.kt:93)");
            }
            int i211111111111111111111111114 = i22 >> 6;
            int i211111111111111111111111115 = i211111111111111111111111114 & 14;
            int i211111111111111111111111116 = ((i22 >> 18) & 112) | i211111111111111111111111115;
            State<Color> stateContentColor1111113 = buttonColors2.contentColor(z13, composerStartRestartGroup, i211111111111111111111111116);
            int i211111111111111111111111117 = i22;
            Modifier modifierSemantics$default1111113 = SemanticsModifierKt.semantics$default(modifier3, false, a.f6911p0, 1, null);
            long jM2518unboximpl1111113 = buttonColors2.backgroundColor(z13, composerStartRestartGroup, i211111111111111111111111116).getValue().m2518unboximpl();
            long jM2507copywmQWz5c$default1111113 = Color.m2507copywmQWz5c$default(stateContentColor1111113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-423487112);
            if (buttonElevation2 != null) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (stateElevation != null) {
                fM4389constructorimpl = stateElevation.getValue().m4403unboximpl();
            } else {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            ButtonColors buttonColors1111116 = buttonColors2;
            PaddingValues paddingValues1111115 = contentPadding;
            MutableInteractionSource mutableInteractionSource1111118 = mutableInteractionSource4;
            ButtonElevation buttonElevation1111116 = buttonElevation2;
            boolean z11111117 = z13;
            Modifier modifier1111117 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, modifierSemantics$default1111113, z13, shape3, jM2518unboximpl1111113, jM2507copywmQWz5c$default1111113, borderStroke3, fM4389constructorimpl, mutableInteractionSource1111118, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 7524271, true, new b(stateContentColor1111113, contentPadding, content, i211111111111111111111111117)), composer2, (i211111111111111111111111117 & 14) | 805306368 | (i211111111111111111111111117 & 896) | (i211111111111111111111111114 & 7168) | (i211111111111111111111111117 & 3670016) | ((i211111111111111111111111117 << 15) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            buttonElevation3 = buttonElevation1111116;
            buttonColors3 = buttonColors1111116;
            paddingValues2 = paddingValues1111115;
            modifier4 = modifier1111117;
            z14 = z11111117;
            mutableInteractionSource5 = mutableInteractionSource1111118;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z14, mutableInteractionSource5, buttonElevation3, shape4, borderStroke4, buttonColors3, paddingValues2, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable ButtonElevation buttonElevation, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable ButtonColors buttonColors, @Nullable PaddingValues paddingValues, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1776134358);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i11 & 16) != 0 ? null : buttonElevation;
        Shape small = (i11 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i11 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors buttonColorsM688outlinedButtonColorsRGew2ao = (i11 & 128) != 0 ? ButtonDefaults.INSTANCE.m688outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues contentPadding = (i11 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i10, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        Button(onClick, modifier2, z11, mutableInteractionSource2, buttonElevation2, small, outlinedBorder, buttonColorsM688outlinedButtonColorsRGew2ao, contentPadding, content, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable ButtonElevation buttonElevation, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable ButtonColors buttonColors, @Nullable PaddingValues paddingValues, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(288797557);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i11 & 16) != 0 ? null : buttonElevation;
        Shape small = (i11 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        ButtonColors buttonColorsM689textButtonColorsRGew2ao = (i11 & 128) != 0 ? ButtonDefaults.INSTANCE.m689textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i11 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i10, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        Button(onClick, modifier2, z11, mutableInteractionSource2, buttonElevation2, small, borderStroke2, buttonColorsM689textButtonColorsRGew2ao, textButtonContentPadding, content, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final long access$Button$lambda$1(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }
}
