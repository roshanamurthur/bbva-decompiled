package androidx.compose.material;

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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,376:1\n940#2:377\n858#2,5:378\n940#2:383\n858#2,5:384\n858#2,5:400\n858#2,5:416\n69#3,2:389\n71#3:395\n74#3:399\n69#3,2:405\n71#3:411\n74#3:415\n36#4:391\n36#4:407\n1097#5,3:392\n1100#5,3:396\n1097#5,3:408\n1100#5,3:412\n81#6:421\n81#6:422\n81#6:423\n81#6:424\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n281#1:377\n281#1:378,5\n292#1:383\n292#1:384,5\n320#1:400,5\n330#1:416,5\n320#1:389,2\n320#1:395\n320#1:399\n330#1:405,2\n330#1:411\n330#1:415\n320#1:391\n330#1:407\n320#1:392,3\n320#1:396,3\n330#1:408,3\n330#1:412,3\n281#1:421\n292#1:422\n320#1:423\n330#1:424\n*E\n"})
public final class TextFieldTransitionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TextFieldTransitionScope f8284a = new TextFieldTransitionScope();

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h0.g1.values().length];
            try {
                iArr[h0.g1.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.g1.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.g1.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ h0.g1 f8286q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f8287r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8288s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<h0.g1, Composer, Integer, Color> f8289t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f8290u0;
        public final /* synthetic */ Function6<Float, Color, Color, Float, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8291w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h0.g1 g1Var, long j10, long j11, Function3<? super h0.g1, ? super Composer, ? super Integer, Color> function3, boolean z10, Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> function6, int i10) {
            super(2);
            this.f8286q0 = g1Var;
            this.f8287r0 = j10;
            this.f8288s0 = j11;
            this.f8289t0 = function3;
            this.f8290u0 = z10;
            this.v0 = function6;
            this.f8291w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldTransitionScope.this.a(this.f8286q0, this.f8287r0, this.f8288s0, this.f8289t0, this.f8290u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8291w0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class b extends Lambda implements Function3<Transition.Segment<h0.g1>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f8292p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<h0.g1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateColor", composer2, -32667848);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-32667848, iD, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:330)");
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
    public static final class c extends Lambda implements Function3<Transition.Segment<h0.g1>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f8293p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<h0.g1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateFloat", composer2, -611722692);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-611722692, iD, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:282)");
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
    public static final class d extends Lambda implements Function3<Transition.Segment<h0.g1>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f8294p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<h0.g1> segment, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateColor", composer2, -130058045);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130058045, iD, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
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
    public static final class e extends Lambda implements Function3<Transition.Segment<h0.g1>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f8295p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<h0.g1> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecTween;
            Transition.Segment<h0.g1> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -1079955085);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1079955085, iD, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:293)");
            }
            h0.g1 g1Var = h0.g1.Focused;
            h0.g1 g1Var2 = h0.g1.UnfocusedEmpty;
            if (segment2.isTransitioningTo(g1Var, g1Var2)) {
                finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
            } else {
                finiteAnimationSpecTween = (segment2.isTransitioningTo(g1Var2, g1Var) || segment2.isTransitioningTo(h0.g1.UnfocusedNotEmpty, g1Var2)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return finiteAnimationSpecTween;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0204  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0255  */
    /* JADX WARN: Code duplicated, block: B:128:0x0261  */
    /* JADX WARN: Code duplicated, block: B:129:0x0264  */
    /* JADX WARN: Code duplicated, block: B:132:0x026c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0286  */
    /* JADX WARN: Code duplicated, block: B:137:0x028e  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0361  */
    /* JADX WARN: Code duplicated, block: B:162:0x0369  */
    /* JADX WARN: Code duplicated, block: B:165:0x042e  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public final void a(@NotNull h0.g1 inputState, long j10, long j11, @NotNull Function3<? super h0.g1, ? super Composer, ? super Integer, Color> contentColor, boolean z10, @NotNull Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        float f6;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        h0.g1 g1Var;
        long j12;
        ColorSpace colorSpaceM2512getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        h0.g1 g1Var2;
        long j13;
        h0.g1 g1Var3;
        long j14;
        ColorSpace colorSpaceM2512getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1988729962);
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
                ComposerKt.traceEventStart(1988729962, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:262)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", composerStartRestartGroup, (i11 & 14) | 48, 0);
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            h0.g1 g1Var4 = (h0.g1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1158004136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i15 = iArr[g1Var4.ordinal()];
            float f12 = 0.0f;
            if (i15 == 1) {
                f6 = 1.0f;
            } else if (i15 != 2) {
                if (i15 != 3) {
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
            h0.g1 g1Var5 = (h0.g1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1158004136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
            }
            int i16 = iArr[g1Var5.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    f10 = 0.0f;
                } else if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), c.f8293p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                h0.g1 g1Var6 = (h0.g1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                }
                i12 = iArr[g1Var6.ordinal()];
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
                        h0.g1 g1Var7 = (h0.g1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(-1376159017);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                        }
                        i14 = iArr[g1Var7.ordinal()];
                        if (i14 == 1) {
                            f12 = 1.0f;
                        } else if (i14 != 2) {
                            if (i14 != i13) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z10) {
                            f12 = 1.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1939694975);
                        g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(-1490209928);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                        }
                        if (iArr[g1Var.ordinal()] == 1) {
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
                        g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
                        composerStartRestartGroup.startReplaceableGroup(-1490209928);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                        }
                        if (iArr[g1Var2.ordinal()] == 1) {
                            j13 = j10;
                        } else {
                            j13 = j11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Color colorM2498boximpl = Color.m2498boximpl(j13);
                        g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(-1490209928);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                        }
                        if (iArr[g1Var3.ordinal()] == 1) {
                            j14 = j10;
                        } else {
                            j14 = j11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        int i17 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                        composerStartRestartGroup.startReplaceableGroup(-1939694975);
                        colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i17 >> 6) & 112)).m2518unboximpl());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = (i17 & 14) | 64;
                        int i19 = i17 << 3;
                        int i20 = (i19 & 57344) | i18 | (i19 & 896) | (i19 & 7168);
                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                        int i21 = (i20 >> 9) & 112;
                        State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i21)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i21)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i20 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i20 & 14) | ((i20 << 9) & 57344) | ((i20 << 6) & 458752));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation3.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation4.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation2.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    f11 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf3 = Float.valueOf(f11);
                    h0.g1 g1Var8 = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1376159017);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                    }
                    i14 = iArr[g1Var8.ordinal()];
                    if (i14 == 1) {
                        f12 = 1.0f;
                    } else if (i14 != 2) {
                        if (i14 != i13) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z10) {
                        f12 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var.ordinal()] == 1) {
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
                    g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var2.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM2498boximpl2 = Color.m2498boximpl(j13);
                    g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var3.ordinal()] == 1) {
                        j14 = j10;
                    } else {
                        j14 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl2, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    int i110 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i110 >> 6) & 112)).m2518unboximpl());
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
                    int i111 = (i110 & 14) | 64;
                    int i112 = i110 << 3;
                    int i22 = (i112 & 57344) | i111 | (i112 & 896) | (i112 & 7168);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    int i23 = (i22 >> 9) & 112;
                    State stateCreateTransitionAnimation7 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i23)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i23)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i22 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i22 & 14) | ((i22 << 9) & 57344) | ((i22 << 6) & 458752));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation6.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation7.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation5.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
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
                Float fValueOf4 = Float.valueOf(f11);
                h0.g1 g1Var9 = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                }
                i14 = iArr[g1Var9.ordinal()];
                if (i14 == 1) {
                    f12 = 1.0f;
                } else if (i14 != 2) {
                    if (i14 != i13) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z10) {
                    f12 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation8 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf4, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var.ordinal()] == 1) {
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
                g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var2.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Color colorM2498boximpl3 = Color.m2498boximpl(j13);
                g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var3.ordinal()] == 1) {
                    j14 = j10;
                } else {
                    j14 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation9 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl3, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter3, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                int i113 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i113 >> 6) & 112)).m2518unboximpl());
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
                int i114 = (i113 & 14) | 64;
                int i115 = i113 << 3;
                int i24 = (i115 & 57344) | i114 | (i115 & 896) | (i115 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                int i25 = (i24 >> 9) & 112;
                State stateCreateTransitionAnimation10 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i25)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i25)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i24 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i24 & 14) | ((i24 << 9) & 57344) | ((i24 << 6) & 458752));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation9.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation10.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation8.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f10 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation11 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), c.f8293p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            h0.g1 g1Var10 = (h0.g1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1376159017);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
            }
            i12 = iArr[g1Var10.ordinal()];
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
                    Float fValueOf5 = Float.valueOf(f11);
                    h0.g1 g1Var11 = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1376159017);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                    }
                    i14 = iArr[g1Var11.ordinal()];
                    if (i14 == 1) {
                        f12 = 1.0f;
                    } else if (i14 != 2) {
                        if (i14 != i13) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z10) {
                        f12 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation12 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf5, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var.ordinal()] == 1) {
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
                    g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var2.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM2498boximpl4 = Color.m2498boximpl(j13);
                    g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                    }
                    if (iArr[g1Var3.ordinal()] == 1) {
                        j14 = j10;
                    } else {
                        j14 = j11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation13 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl4, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter4, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    int i116 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i116 >> 6) & 112)).m2518unboximpl());
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
                    int i117 = (i116 & 14) | 64;
                    int i118 = i116 << 3;
                    int i26 = (i118 & 57344) | i117 | (i118 & 896) | (i118 & 7168);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    int i27 = (i26 >> 9) & 112;
                    State stateCreateTransitionAnimation14 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i27)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i27)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i26 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i26 & 14) | ((i26 << 9) & 57344) | ((i26 << 6) & 458752));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation11.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation13.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation14.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation12.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                f11 = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf6 = Float.valueOf(f11);
                h0.g1 g1Var12 = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                }
                i14 = iArr[g1Var12.ordinal()];
                if (i14 == 1) {
                    f12 = 1.0f;
                } else if (i14 != 2) {
                    if (i14 != i13) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z10) {
                    f12 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation15 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf6, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var.ordinal()] == 1) {
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
                g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var2.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Color colorM2498boximpl5 = Color.m2498boximpl(j13);
                g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[g1Var3.ordinal()] == 1) {
                    j14 = j10;
                } else {
                    j14 = j11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation16 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl5, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter5, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                int i119 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i119 >> 6) & 112)).m2518unboximpl());
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
                int i1110 = (i119 & 14) | 64;
                int i1111 = i119 << 3;
                int i28 = (i1111 & 57344) | i1110 | (i1111 & 896) | (i1111 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                int i29 = (i28 >> 9) & 112;
                State stateCreateTransitionAnimation17 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i29)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i29)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i28 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i28 & 14) | ((i28 << 9) & 57344) | ((i28 << 6) & 458752));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation11.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation16.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation17.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation15.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
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
            Float fValueOf7 = Float.valueOf(f11);
            h0.g1 g1Var13 = (h0.g1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1376159017);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
            }
            i14 = iArr[g1Var13.ordinal()];
            if (i14 == 1) {
                f12 = 1.0f;
            } else if (i14 != 2) {
                if (i14 != i13) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z10) {
                f12 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation18 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf7, Float.valueOf(f12), e.f8295p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            g1Var = (h0.g1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[g1Var.ordinal()] == 1) {
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
            g1Var2 = (h0.g1) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[g1Var2.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = j11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM2498boximpl6 = Color.m2498boximpl(j13);
            g1Var3 = (h0.g1) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[g1Var3.ordinal()] == 1) {
                j14 = j10;
            } else {
                j14 = j11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation19 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl6, Color.m2498boximpl(j14), d.f8294p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter6, "LabelTextStyleColor", composerStartRestartGroup, 229376);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            int i1112 = (i11 & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE;
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            colorSpaceM2512getColorSpaceimpl2 = Color.m2512getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i1112 >> 6) & 112)).m2518unboximpl());
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
            int i1113 = (i1112 & 14) | 64;
            int i1114 = i1112 << 3;
            int i210 = (i1114 & 57344) | i1113 | (i1114 & 896) | (i1114 & 7168);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            int i211 = (i210 >> 9) & 112;
            State stateCreateTransitionAnimation110 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i211)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i211)), b.f8292p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i210 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i210 & 14) | ((i210 << 9) & 57344) | ((i210 << 6) & 458752));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(((Number) stateCreateTransitionAnimation11.getValue()).floatValue()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation19.getValue()).m2518unboximpl()), Color.m2498boximpl(((Color) stateCreateTransitionAnimation110.getValue()).m2518unboximpl()), Float.valueOf(((Number) stateCreateTransitionAnimation18.getValue()).floatValue()), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 57344));
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
