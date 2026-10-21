package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001al\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0019\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumbContent", "enabled", "Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThumbDiameter", "()F", "ThumbDiameter", "b", "getUncheckedThumbDiameter", "UncheckedThumbDiameter", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n25#2:479\n50#2:491\n49#2:492\n25#2:499\n25#2:510\n460#2,13:540\n473#2,3:554\n460#2,13:586\n36#2:600\n460#2,13:626\n473#2,3:640\n473#2,3:645\n1114#3,6:480\n1114#3,6:493\n1114#3,6:500\n1114#3,3:511\n1117#3,3:517\n1114#3,6:601\n58#4:486\n75#4:487\n58#4:560\n58#4:561\n81#4:562\n88#4:563\n51#4:564\n58#4:566\n75#4:607\n58#4:653\n75#4:654\n58#4:655\n76#5:488\n76#5:490\n76#5:528\n76#5:559\n76#5:565\n76#5:574\n76#5:614\n1#6:489\n474#7,4:506\n478#7,2:514\n482#7:520\n474#8:516\n67#9,6:521\n73#9:553\n77#9:558\n67#9,6:567\n73#9:599\n68#9,5:608\n73#9:639\n77#9:644\n77#9:649\n75#10:527\n76#10,11:529\n89#10:557\n75#10:573\n76#10,11:575\n75#10:613\n76#10,11:615\n89#10:643\n89#10:648\n76#11:650\n76#11:651\n76#11:652\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:479\n109#1:491\n109#1:492\n114#1:499\n115#1:510\n146#1:540,13\n146#1:554,3\n223#1:586,13\n229#1:600\n226#1:626,13\n226#1:640,3\n223#1:645,3\n98#1:480,6\n109#1:493,6\n114#1:500,6\n115#1:511,3\n115#1:517,3\n229#1:601,6\n106#1:486\n106#1:487\n195#1:560\n196#1:561\n196#1:562\n195#1:563\n195#1:564\n202#1:566\n232#1:607\n253#1:653\n253#1:654\n254#1:655\n107#1:488\n108#1:490\n146#1:528\n191#1:559\n200#1:565\n223#1:574\n226#1:614\n115#1:506,4\n115#1:514,2\n115#1:520\n115#1:516\n146#1:521,6\n146#1:553\n146#1:558\n223#1:567,6\n223#1:599\n226#1:608,5\n226#1:639\n226#1:644\n223#1:649\n146#1:527\n146#1:529,11\n146#1:557\n223#1:573\n223#1:575,11\n226#1:613\n226#1:615,11\n226#1:643\n223#1:648\n188#1:650\n189#1:651\n224#1:652\n*E\n"})
public final class SwitchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f11897f;

    /* JADX INFO: compiled from: Switch.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f11898p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f11899q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Animatable<Float, AnimationVector1D> animatable, float f6) {
            super(0);
            this.f11898p0 = animatable;
            this.f11899q0 = f6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Animatable.updateBounds$default(this.f11898p0, Float.valueOf(this.f11899q0), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    @SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,478:1\n62#2,5:479\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3\n*L\n128#1:479,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f11900p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f11901q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f11902r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, float f6, CoroutineScope coroutineScope) {
            super(1);
            this.f11900p0 = animatable;
            this.f11901q0 = f6;
            this.f11902r0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Animatable<Float, AnimationVector1D> animatable = this.f11900p0;
            float fFloatValue = animatable.getTargetValue().floatValue();
            float f6 = this.f11901q0;
            if (fFloatValue != f6) {
                BuildersKt__Builders_commonKt.launch$default(this.f11902r0, null, null, new v3(animatable, f6, null), 3, null);
            }
            return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f11903p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11904q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11905r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11906s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f11907t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ SwitchColors f11908u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11909w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f11910x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z11, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f11903p0 = z10;
            this.f11904q0 = function1;
            this.f11905r0 = modifier;
            this.f11906s0 = function2;
            this.f11907t0 = z11;
            this.f11908u0 = switchColors;
            this.v0 = mutableInteractionSource;
            this.f11909w0 = i10;
            this.f11910x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwitchKt.Switch(this.f11903p0, this.f11904q0, this.f11905r0, this.f11906s0, this.f11907t0, this.f11908u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11909w0 | 1), this.f11910x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class d extends Lambda implements Function1<Boolean, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11911p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f11912q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, float f10) {
            super(1);
            this.f11911p0 = f6;
            this.f11912q0 = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Boolean bool) {
            return Float.valueOf(bool.booleanValue() ? this.f11911p0 : this.f11912q0);
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class e extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11913p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6) {
            super(1);
            this.f11913p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(this.f11913p0), 0));
        }
    }

    /* JADX INFO: compiled from: Switch.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ float E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f11914p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f11915q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f11916r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SwitchColors f11917s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11918t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11919u0;
        public final /* synthetic */ InteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Shape f11920w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ float f11921x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ float f11922y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(BoxScope boxScope, boolean z10, boolean z11, SwitchColors switchColors, State<Float> state, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, float f6, float f10, float f11, int i10, int i11) {
            super(2);
            this.f11914p0 = boxScope;
            this.f11915q0 = z10;
            this.f11916r0 = z11;
            this.f11917s0 = switchColors;
            this.f11918t0 = state;
            this.f11919u0 = function2;
            this.v0 = interactionSource;
            this.f11920w0 = shape;
            this.f11921x0 = f6;
            this.f11922y0 = f10;
            this.E0 = f11;
            this.F0 = i10;
            this.G0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SwitchKt.a(this.f11914p0, this.f11915q0, this.f11916r0, this.f11917s0, this.f11918t0, this.f11919u0, this.v0, this.f11920w0, this.f11921x0, this.f11922y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0));
            return Unit.INSTANCE;
        }
    }

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float fM1963getSelectedHandleWidthD9Ej5fM = switchTokens.m1963getSelectedHandleWidthD9Ej5fM();
        f11892a = fM1963getSelectedHandleWidthD9Ej5fM;
        f11893b = switchTokens.m1970getUnselectedHandleWidthD9Ej5fM();
        float fM1968getTrackWidthD9Ej5fM = switchTokens.m1968getTrackWidthD9Ej5fM();
        f11894c = fM1968getTrackWidthD9Ej5fM;
        float fM1966getTrackHeightD9Ej5fM = switchTokens.m1966getTrackHeightD9Ej5fM();
        f11895d = fM1966getTrackHeightD9Ej5fM;
        f11896e = Dp.m4389constructorimpl(Dp.m4389constructorimpl(fM1968getTrackWidthD9Ej5fM - fM1963getSelectedHandleWidthD9Ej5fM) - Dp.m4389constructorimpl(Dp.m4389constructorimpl(fM1966getTrackHeightD9Ej5fM - fM1963getSelectedHandleWidthD9Ej5fM) / 2));
        f11897f = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v12 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v18 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v9 ??, new type: androidx.compose.material3.SwitchDefaults
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v9 ??, new type: androidx.compose.material3.SwitchDefaults
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Switch(boolean r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, @org.jetbrains.annotations.Nullable androidx.compose.material3.SwitchColors r57, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r58, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(BoxScope boxScope, boolean z10, boolean z11, SwitchColors switchColors, State<Float> state, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, float f6, float f10, float f11, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        float fFloatValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i10 & 3670016) == 0) {
            i12 |= composerStartRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i10 & 29360128) == 0) {
            i12 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i10 & 234881024) == 0) {
            i12 |= composerStartRestartGroup.changed(f6) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i10 & 1879048192) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 14) == 0) {
            i13 = i11 | (composerStartRestartGroup.changed(f11) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 1533916891) == 306783378 && (i13 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i12, i13, "androidx.compose.material3.SwitchImpl (Switch.kt:175)");
            }
            int i14 = ((i12 >> 6) & 14) | (i12 & 112) | ((i12 >> 3) & 896);
            State<Color> stateTrackColor$material3_release = switchColors.trackColor$material3_release(z11, z10, composerStartRestartGroup, i14);
            State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composerStartRestartGroup, (i12 >> 18) & 14);
            int i15 = i12;
            float fM1961getPressedHandleWidthD9Ej5fM = stateCollectIsPressedAsState.getValue().booleanValue() ? SwitchTokens.INSTANCE.m1961getPressedHandleWidthD9Ej5fM() : Dp.m4389constructorimpl(Dp.m4389constructorimpl((Dp.m4389constructorimpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo405toDpu2uoSUM(state.getValue().floatValue()) - f10) / Dp.m4389constructorimpl(f11 - f10)) * Dp.m4389constructorimpl(f11892a - f6)) + f6);
            composerStartRestartGroup.startReplaceableGroup(-993794105);
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                fFloatValue = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(z10 ? Dp.m4389constructorimpl(f11896e - SwitchTokens.INSTANCE.m1967getTrackOutlineWidthD9Ej5fM()) : SwitchTokens.INSTANCE.m1967getTrackOutlineWidthD9Ej5fM());
            } else {
                fFloatValue = state.getValue().floatValue();
            }
            composerStartRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape shape2 = ShapesKt.toShape(switchTokens.getTrackShape(), composerStartRestartGroup, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM121backgroundbw27NRU = BackgroundKt.m121backgroundbw27NRU(BorderKt.m129borderxT4_qwU(SizeKt.m321height3ABfNKs(SizeKt.m340width3ABfNKs(boxScope.align(companion, companion2.getCenter()), f11894c), f11895d), switchTokens.m1967getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z11, z10, composerStartRestartGroup, i14).getValue().m2518unboximpl(), shape2), stateTrackColor$material3_release.getValue().m2518unboximpl(), shape2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM121backgroundbw27NRU);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long jM2518unboximpl = switchColors.thumbColor$material3_release(z11, z10, composerStartRestartGroup, i14).getValue().m2518unboximpl();
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterStart());
            Float fValueOf = Float.valueOf(fFloatValue);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(fValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new e(fFloatValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM121backgroundbw27NRU2 = BackgroundKt.m121backgroundbw27NRU(SizeKt.m327requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(switchTokens.m1965getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), fM1961getPressedHandleWidthD9Ej5fM), jM2518unboximpl, shape);
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM121backgroundbw27NRU2);
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
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(1420970387);
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z11, z10, composerStartRestartGroup, i14).getValue())}, function2, composerStartRestartGroup, ((i15 >> 12) & 112) | 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(boxScope, z10, z11, switchColors, state, function2, interactionSource, shape, f6, f10, f11, i10, i11));
    }

    public static final float getThumbDiameter() {
        return f11892a;
    }

    public static final float getUncheckedThumbDiameter() {
        return f11893b;
    }
}
