package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,429:1\n939#2:430\n857#2,5:431\n939#2:436\n857#2,5:437\n939#2:442\n857#2,5:443\n857#2,5:459\n857#2,5:475\n69#3,2:448\n71#3:454\n74#3:458\n69#3,2:464\n71#3:470\n74#3:474\n36#4:450\n36#4:466\n1057#5,3:451\n1060#5,3:455\n1057#5,3:467\n1060#5,3:471\n76#6:480\n76#6:481\n76#6:482\n76#6:483\n76#6:484\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n*L\n313#1:430\n313#1:431,5\n324#1:436\n324#1:437,5\n352#1:442\n352#1:443,5\n363#1:459,5\n373#1:475,5\n363#1:448,2\n363#1:454\n363#1:458\n373#1:464,2\n373#1:470\n373#1:474\n363#1:450\n373#1:466\n363#1:451,3\n363#1:455,3\n373#1:467,3\n373#1:471,3\n313#1:480\n324#1:481\n352#1:482\n363#1:483\n373#1:484\n*E\n"})
public final class TextFieldTransitionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TextFieldTransitionScope f12272a = new TextFieldTransitionScope();

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l0.y1.values().length];
            try {
                iArr[l0.y1.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.y1.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.y1.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ l0.y1 f12274q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f12275r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f12276s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<l0.y1, Composer, Integer, Color> f12277t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f12278u0;
        public final /* synthetic */ Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f12279w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l0.y1 y1Var, long j10, long j11, Function3<? super l0.y1, ? super Composer, ? super Integer, Color> function3, boolean z10, Function7<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function7, int i10) {
            super(2);
            this.f12274q0 = y1Var;
            this.f12275r0 = j10;
            this.f12276s0 = j11;
            this.f12277t0 = function3;
            this.f12278u0 = z10;
            this.v0 = function7;
            this.f12279w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldTransitionScope.this.a(this.f12274q0, this.f12275r0, this.f12276s0, this.f12277t0, this.f12278u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12279w0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class b extends Lambda implements Function3<Transition.Segment<l0.y1>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f12280p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<l0.y1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateColor", composer2, 766065458);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766065458, iD, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:373)");
            }
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class c extends Lambda implements Function3<Transition.Segment<l0.y1>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f12281p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<l0.y1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateFloat", composer2, -4765522);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-4765522, iD, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:314)");
            }
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class d extends Lambda implements Function3<Transition.Segment<l0.y1>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f12282p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<l0.y1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateColor", composer2, 2041936647);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2041936647, iD, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:363)");
            }
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class e extends Lambda implements Function3<Transition.Segment<l0.y1>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f12283p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<l0.y1> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecTween;
            Transition.Segment<l0.y1> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -1635067817);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1635067817, iD, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:325)");
            }
            l0.y1 y1Var = l0.y1.Focused;
            l0.y1 y1Var2 = l0.y1.UnfocusedEmpty;
            if (segment2.isTransitioningTo(y1Var, y1Var2)) {
                finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
            } else {
                finiteAnimationSpecTween = (segment2.isTransitioningTo(y1Var2, y1Var) || segment2.isTransitioningTo(l0.y1.UnfocusedNotEmpty, y1Var2)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return finiteAnimationSpecTween;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class f extends Lambda implements Function3<Transition.Segment<l0.y1>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f12284p0 = new f(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<l0.y1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateFloat", composer2, 1189967029);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1189967029, iD, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:353)");
            }
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:117:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0207  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0272  */
    /* JADX WARN: Code duplicated, block: B:132:0x0275  */
    /* JADX WARN: Code duplicated, block: B:134:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0285  */
    /* JADX WARN: Code duplicated, block: B:141:0x029e  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0307  */
    /* JADX WARN: Code duplicated, block: B:159:0x0313  */
    /* JADX WARN: Code duplicated, block: B:160:0x0316  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0338  */
    /* JADX WARN: Code duplicated, block: B:168:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x036a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0376  */
    /* JADX WARN: Code duplicated, block: B:175:0x0379  */
    /* JADX WARN: Code duplicated, block: B:178:0x0381  */
    /* JADX WARN: Code duplicated, block: B:181:0x039a  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x0412  */
    /* JADX WARN: Code duplicated, block: B:193:0x041a  */
    /* JADX WARN: Code duplicated, block: B:196:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c0  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public final void a(@NotNull l0.y1 inputState, long j10, long j11, @NotNull Function3<? super l0.y1, ? super Composer, ? super Integer, Color> contentColor, boolean z10, @NotNull Function7<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        float f6;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        float f13;
        int i17;
        l0.y1 y1Var;
        long j12;
        ColorSpace colorSpaceM2512getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        l0.y1 y1Var2;
        long j13;
        l0.y1 y1Var3;
        long j14;
        ColorSpace colorSpaceM2512getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-995111872);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(inputState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(contentColor) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995111872, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:293)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", composerStartRestartGroup, (i11 & 14) | 48, 0);
            c cVar = c.f12281p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            l0.y1 y1Var4 = (l0.y1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(240378898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i18 = iArr[y1Var4.ordinal()];
            float f14 = 0.0f;
            if (i18 == 1) {
                f6 = 1.0f;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f6);
            l0.y1 y1Var5 = (l0.y1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(240378898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            int i19 = iArr[y1Var5.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    f10 = 0.0f;
                } else if (i19 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), cVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                e eVar = e.f12283p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                l0.y1 y1Var6 = (l0.y1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                }
                i12 = iArr[y1Var6.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        i13 = 3;
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i13 = 3;
                        if (z10) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf2 = Float.valueOf(f11);
                        l0.y1 y1Var7 = (l0.y1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(2067512179);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                        }
                        i14 = iArr[y1Var7.ordinal()];
                        if (i14 == 1) {
                            f12 = 1.0f;
                        } else {
                            if (i14 != 2) {
                                if (i14 != i13) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z10) {
                                f12 = 1.0f;
                            }
                            f12 = 0.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        i15 = i13;
                        State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), eVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        f fVar = f.f12284p0;
                        composerStartRestartGroup.startReplaceableGroup(-1338768149);
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                        l0.y1 y1Var8 = (l0.y1) transitionUpdateTransition.getCurrentState();
                        composerStartRestartGroup.startReplaceableGroup(5829913);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                        }
                        i16 = iArr[y1Var8.ordinal()];
                        if (i16 == 1) {
                            f13 = 1.0f;
                        } else {
                            if (i16 != 2) {
                                if (i16 != i15) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (z10) {
                                f13 = 0.0f;
                            }
                            f13 = 1.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf3 = Float.valueOf(f13);
                        l0.y1 y1Var9 = (l0.y1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(5829913);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                        }
                        i17 = iArr[y1Var9.ordinal()];
                        if (i17 == 1) {
                            f14 = 1.0f;
                        } else {
                            if (i17 != 2) {
                                if (i17 != i15) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z10) {
                            }
                            f14 = 1.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f14), fVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        d dVar = d.f12282p0;
                        composerStartRestartGroup.startReplaceableGroup(-1939694975);
                        y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(-1468066062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                        }
                        if (iArr[y1Var.ordinal()] == 1) {
                            j12 = j10;
                        } else {
                            j12 = j11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                        y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
                        composerStartRestartGroup.startReplaceableGroup(-1468066062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                        }
                        if (iArr[y1Var2.ordinal()] == 1) {
                            j13 = j10;
                        } else {
                            j13 = j11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Color colorM2498boximpl = Color.m2498boximpl(j13);
                        y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(-1468066062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                        }
                        if (iArr[y1Var3.ordinal()] == 1) {
                            j14 = j10;
                        } else {
                            j14 = j11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl, Color.m2498boximpl(j14), dVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        b bVar = b.f12280p0;
                        int i20 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                        composerStartRestartGroup.startReplaceableGroup(-1939694975);
                        colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i20 >> 6) & 112)).m2518unboximpl());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21 = i20 << 3;
                        int i22 = (i21 & 57344) | (i21 & 896) | (i20 & 14) | 64 | (i21 & 7168);
                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                        int i23 = (i22 >> 9) & 112;
                        State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i23)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i23)), bVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i22 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i22 & 14) | ((i22 << 9) & 57344) | ((i22 << 6) & 458752));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation4.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation5.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation2.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation3.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    f11 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf4 = Float.valueOf(f11);
                    l0.y1 y1Var10 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(2067512179);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                    }
                    i14 = iArr[y1Var10.ordinal()];
                    if (i14 == 1) {
                        f12 = 1.0f;
                    } else {
                        if (i14 != 2) {
                            if (i14 != i13) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            f12 = 1.0f;
                        }
                        f12 = 0.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    i15 = i13;
                    State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf4, Float.valueOf(f12), eVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    f fVar2 = f.f12284p0;
                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    l0.y1 y1Var11 = (l0.y1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(5829913);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                    }
                    i16 = iArr[y1Var11.ordinal()];
                    if (i16 == 1) {
                        f13 = 1.0f;
                    } else {
                        if (i16 != 2) {
                            if (i16 != i15) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            f13 = 0.0f;
                        }
                        f13 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf5 = Float.valueOf(f13);
                    l0.y1 y1Var12 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(5829913);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                    }
                    i17 = iArr[y1Var12.ordinal()];
                    if (i17 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i17 != 2) {
                            if (i17 != i15) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z10) {
                        }
                        f14 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation7 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf5, Float.valueOf(f14), fVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter4, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    d dVar2 = d.f12282p0;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var.ordinal()] == 1) {
                        j12 = j10;
                    } else {
                        j12 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var2.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM2498boximpl2 = Color.m2498boximpl(j13);
                    y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var3.ordinal()] == 1) {
                        j14 = j10;
                    } else {
                        j14 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation8 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl2, Color.m2498boximpl(j14), dVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    b bVar2 = b.f12280p0;
                    int i24 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i24 >> 6) & 112)).m2518unboximpl());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i25 = i24 << 3;
                    int i26 = (i25 & 57344) | (i25 & 896) | (i24 & 14) | 64 | (i25 & 7168);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    int i27 = (i26 >> 9) & 112;
                    State stateCreateTransitionAnimation9 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i27)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i27)), bVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i26 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i26 & 14) | ((i26 << 9) & 57344) | ((i26 << 6) & 458752));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation8.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation9.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation6.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation7.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    i13 = 3;
                }
                f11 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf6 = Float.valueOf(f11);
                l0.y1 y1Var13 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                }
                i14 = iArr[y1Var13.ordinal()];
                if (i14 == 1) {
                    f12 = 1.0f;
                } else {
                    if (i14 != 2) {
                        if (i14 != i13) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z10) {
                        f12 = 1.0f;
                    }
                    f12 = 0.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                i15 = i13;
                State stateCreateTransitionAnimation10 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf6, Float.valueOf(f12), eVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                f fVar3 = f.f12284p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                l0.y1 y1Var14 = (l0.y1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(5829913);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                }
                i16 = iArr[y1Var14.ordinal()];
                if (i16 == 1) {
                    f13 = 1.0f;
                } else {
                    if (i16 != 2) {
                        if (i16 != i15) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z10) {
                        f13 = 0.0f;
                    }
                    f13 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf7 = Float.valueOf(f13);
                l0.y1 y1Var15 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(5829913);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                }
                i17 = iArr[y1Var15.ordinal()];
                if (i17 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i17 != 2) {
                        if (i17 != i15) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z10) {
                    }
                    f14 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation11 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf7, Float.valueOf(f14), fVar3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter5, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                d dVar3 = d.f12282p0;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var.ordinal()] == 1) {
                    j12 = j10;
                } else {
                    j12 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var2.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Color colorM2498boximpl3 = Color.m2498boximpl(j13);
                y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var3.ordinal()] == 1) {
                    j14 = j10;
                } else {
                    j14 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation12 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl3, Color.m2498boximpl(j14), dVar3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter3, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                b bVar3 = b.f12280p0;
                int i28 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i28 >> 6) & 112)).m2518unboximpl());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i29 = i28 << 3;
                int i210 = (i29 & 57344) | (i29 & 896) | (i28 & 14) | 64 | (i29 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                int i211 = (i210 >> 9) & 112;
                State stateCreateTransitionAnimation13 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i211)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i211)), bVar3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i210 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i210 & 14) | ((i210 << 9) & 57344) | ((i210 << 6) & 458752));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation12.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation13.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation10.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation11.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f10 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation14 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), cVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            e eVar2 = e.f12283p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            l0.y1 y1Var16 = (l0.y1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(2067512179);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
            }
            i12 = iArr[y1Var16.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    i13 = 3;
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i13 = 3;
                    if (z10) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf8 = Float.valueOf(f11);
                    l0.y1 y1Var17 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(2067512179);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                    }
                    i14 = iArr[y1Var17.ordinal()];
                    if (i14 == 1) {
                        f12 = 1.0f;
                    } else {
                        if (i14 != 2) {
                            if (i14 != i13) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            f12 = 1.0f;
                        }
                        f12 = 0.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    i15 = i13;
                    State stateCreateTransitionAnimation15 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf8, Float.valueOf(f12), eVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter6, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    f fVar4 = f.f12284p0;
                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter7 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    l0.y1 y1Var18 = (l0.y1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(5829913);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                    }
                    i16 = iArr[y1Var18.ordinal()];
                    if (i16 == 1) {
                        f13 = 1.0f;
                    } else {
                        if (i16 != 2) {
                            if (i16 != i15) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            f13 = 0.0f;
                        }
                        f13 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf9 = Float.valueOf(f13);
                    l0.y1 y1Var19 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(5829913);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                    }
                    i17 = iArr[y1Var19.ordinal()];
                    if (i17 == 1) {
                        f14 = 1.0f;
                    } else {
                        if (i17 != 2) {
                            if (i17 != i15) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z10) {
                        }
                        f14 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation16 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf9, Float.valueOf(f14), fVar4.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter7, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    d dVar4 = d.f12282p0;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var.ordinal()] == 1) {
                        j12 = j10;
                    } else {
                        j12 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter4 = (TwoWayConverter) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var2.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM2498boximpl4 = Color.m2498boximpl(j13);
                    y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                    }
                    if (iArr[y1Var3.ordinal()] == 1) {
                        j14 = j10;
                    } else {
                        j14 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation17 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl4, Color.m2498boximpl(j14), dVar4.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter4, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    b bVar4 = b.f12280p0;
                    int i212 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i212 >> 6) & 112)).m2518unboximpl());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i213 = i212 << 3;
                    int i214 = (i213 & 57344) | (i213 & 896) | (i212 & 14) | 64 | (i213 & 7168);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    int i215 = (i214 >> 9) & 112;
                    State stateCreateTransitionAnimation18 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i215)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i215)), bVar4.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i214 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i214 & 14) | ((i214 << 9) & 57344) | ((i214 << 6) & 458752));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation14.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation17.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation18.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation15.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation16.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                f11 = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf10 = Float.valueOf(f11);
                l0.y1 y1Var110 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                }
                i14 = iArr[y1Var110.ordinal()];
                if (i14 == 1) {
                    f12 = 1.0f;
                } else {
                    if (i14 != 2) {
                        if (i14 != i13) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z10) {
                        f12 = 1.0f;
                    }
                    f12 = 0.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                i15 = i13;
                State stateCreateTransitionAnimation19 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf10, Float.valueOf(f12), eVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter6, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                f fVar5 = f.f12284p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter8 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                l0.y1 y1Var111 = (l0.y1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(5829913);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                }
                i16 = iArr[y1Var111.ordinal()];
                if (i16 == 1) {
                    f13 = 1.0f;
                } else {
                    if (i16 != 2) {
                        if (i16 != i15) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z10) {
                        f13 = 0.0f;
                    }
                    f13 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf11 = Float.valueOf(f13);
                l0.y1 y1Var112 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(5829913);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                }
                i17 = iArr[y1Var112.ordinal()];
                if (i17 == 1) {
                    f14 = 1.0f;
                } else {
                    if (i17 != 2) {
                        if (i17 != i15) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z10) {
                    }
                    f14 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation110 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf11, Float.valueOf(f14), fVar5.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter8, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                d dVar5 = d.f12282p0;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var.ordinal()] == 1) {
                    j12 = j10;
                } else {
                    j12 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TwoWayConverter twoWayConverter5 = (TwoWayConverter) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var2.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Color colorM2498boximpl5 = Color.m2498boximpl(j13);
                y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                }
                if (iArr[y1Var3.ordinal()] == 1) {
                    j14 = j10;
                } else {
                    j14 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation111 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl5, Color.m2498boximpl(j14), dVar5.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter5, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                b bVar5 = b.f12280p0;
                int i216 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i216 >> 6) & 112)).m2518unboximpl());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i217 = i216 << 3;
                int i218 = (i217 & 57344) | (i217 & 896) | (i216 & 14) | 64 | (i217 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                int i219 = (i218 >> 9) & 112;
                State stateCreateTransitionAnimation112 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i219)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i219)), bVar5.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i218 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i218 & 14) | ((i218 << 9) & 57344) | ((i218 << 6) & 458752));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation14.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation111.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation112.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation19.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation110.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                i13 = 3;
            }
            f11 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf12 = Float.valueOf(f11);
            l0.y1 y1Var113 = (l0.y1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(2067512179);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
            }
            i14 = iArr[y1Var113.ordinal()];
            if (i14 == 1) {
                f12 = 1.0f;
            } else {
                if (i14 != 2) {
                    if (i14 != i13) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z10) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            i15 = i13;
            State stateCreateTransitionAnimation113 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf12, Float.valueOf(f12), eVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter6, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            f fVar6 = f.f12284p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter9 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            l0.y1 y1Var114 = (l0.y1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(5829913);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
            }
            i16 = iArr[y1Var114.ordinal()];
            if (i16 == 1) {
                f13 = 1.0f;
            } else {
                if (i16 != 2) {
                    if (i16 != i15) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z10) {
                    f13 = 0.0f;
                }
                f13 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf13 = Float.valueOf(f13);
            l0.y1 y1Var115 = (l0.y1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(5829913);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
            }
            i17 = iArr[y1Var115.ordinal()];
            if (i17 == 1) {
                f14 = 1.0f;
            } else {
                if (i17 != 2) {
                    if (i17 != i15) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z10) {
                }
                f14 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation114 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf13, Float.valueOf(f14), fVar6.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter9, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            d dVar6 = d.f12282p0;
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            y1Var = (l0.y1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1468066062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
            }
            if (iArr[y1Var.ordinal()] == 1) {
                j12 = j10;
            } else {
                j12 = j11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter6 = (TwoWayConverter) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            y1Var2 = (l0.y1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1468066062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
            }
            if (iArr[y1Var2.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = j11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM2498boximpl6 = Color.m2498boximpl(j13);
            y1Var3 = (l0.y1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1468066062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
            }
            if (iArr[y1Var3.ordinal()] == 1) {
                j14 = j10;
            } else {
                j14 = j11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation115 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl6, Color.m2498boximpl(j14), dVar6.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter6, "LabelTextStyleColor", composerStartRestartGroup, 229376);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            b bVar6 = b.f12280p0;
            int i2110 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i2110 >> 6) & 112)).m2518unboximpl());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i2111 = i2110 << 3;
            int i2112 = (i2111 & 57344) | (i2111 & 896) | (i2110 & 14) | 64 | (i2111 & 7168);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            int i2113 = (i2112 >> 9) & 112;
            State stateCreateTransitionAnimation116 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i2113)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i2113)), bVar6.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i2112 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i2112 & 14) | ((i2112 << 9) & 57344) | ((i2112 << 6) & 458752));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation14.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation115.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation116.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation113.getValue()).floatValue()), Float.valueOf(((Number) stateCreateTransitionAnimation114.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf(i11 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(inputState, j10, j11, contentColor, z10, content, i10));
    }
}
