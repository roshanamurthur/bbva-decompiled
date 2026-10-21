package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", ExifInterface.GPS_DIRECTION_TRUE, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n25#2:148\n25#2:156\n36#2:163\n456#2,8:200\n464#2,3:214\n467#2,3:224\n1097#3,3:149\n1100#3,3:153\n1097#3,6:157\n1097#3,6:164\n1#4:152\n350#5,7:170\n33#6,6:177\n33#6,6:218\n66#7,6:183\n72#7:217\n76#7:228\n78#8,11:189\n91#8:227\n4144#9,6:208\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n112#1:163\n139#1:200,8\n139#1:214,3\n139#1:224,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:164,6\n118#1:170,7\n127#1:177,6\n140#1:218,6\n139#1:183,6\n139#1:217\n139#1:228\n139#1:189,11\n139#1:227\n139#1:208,6\n*E\n"})
public final class CrossfadeKt {

    /* JADX INFO: compiled from: Crossfade.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f2712p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2713q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec<Float> f2714r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f2715s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<T, Composer, Integer, Unit> f2716t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f2717u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T t10, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2712p0 = t10;
            this.f2713q0 = modifier;
            this.f2714r0 = finiteAnimationSpec;
            this.f2715s0 = str;
            this.f2716t0 = function3;
            this.f2717u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CrossfadeKt.Crossfade(this.f2712p0, this.f2713q0, this.f2714r0, this.f2715s0, this.f2716t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2717u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Crossfade.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f2718p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2719q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec<Float> f2720r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3 f2721s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f2722t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f2723u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, int i10, int i11) {
            super(2);
            this.f2718p0 = obj;
            this.f2719q0 = modifier;
            this.f2720r0 = finiteAnimationSpec;
            this.f2721s0 = function3;
            this.f2722t0 = i10;
            this.f2723u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CrossfadeKt.Crossfade(this.f2718p0, this.f2719q0, this.f2720r0, this.f2721s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2722t0 | 1), this.f2723u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Crossfade.kt */
    public static final class d<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f2725p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Transition<T> transition) {
            super(1);
            this.f2725p0 = transition;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!Intrinsics.areEqual(obj, this.f2725p0.getTargetState()));
        }
    }

    /* JADX INFO: compiled from: Crossfade.kt */
    @SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n937#2,4:148\n858#2,5:152\n36#3:157\n456#3,8:181\n464#3,3:195\n467#3,3:199\n1097#4,6:158\n66#5,6:164\n72#5:198\n76#5:203\n78#6,11:170\n91#6:202\n4144#7,6:189\n81#8:204\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157\n132#1:181,8\n132#1:195,3\n132#1:199,3\n132#1:158,6\n132#1:164,6\n132#1:198\n132#1:203\n132#1:170,11\n132#1:202\n132#1:189,6\n129#1:204\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f2726p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f2727q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec<Float> f2728r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ T f2729s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<T, Composer, Integer, Unit> f2730t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Transition<T> transition, int i10, FiniteAnimationSpec<Float> finiteAnimationSpec, T t10, Function3<? super T, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f2726p0 = transition;
            this.f2727q0 = i10;
            this.f2728r0 = finiteAnimationSpec;
            this.f2729s0 = t10;
            this.f2730t0 = function3;
        }

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
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1426421288, iIntValue, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
                }
                k kVar = new k(this.f2728r0);
                int i10 = this.f2727q0;
                int i11 = i10 & 14;
                composer2.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                int i12 = i11 << 3;
                int i13 = i11 | (i12 & 896) | (i12 & 7168) | (i12 & 57344);
                composer2.startReplaceableGroup(-142660079);
                Transition<T> transition = this.f2726p0;
                Object currentState = transition.getCurrentState();
                int i14 = (i13 >> 9) & 112;
                composer2.startReplaceableGroup(-438678252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-438678252, i14, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
                }
                T t10 = this.f2729s0;
                float f6 = Intrinsics.areEqual(currentState, t10) ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f6);
                Object targetState = transition.getTargetState();
                composer2.startReplaceableGroup(-438678252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-438678252, i14, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
                }
                float f10 = Intrinsics.areEqual(targetState, t10) ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f10), kVar.invoke(transition.getSegment(), composer2, Integer.valueOf((i13 >> 3) & 112)), vectorConverter, "FloatAnimation", composer2, (i13 & 14) | (57344 & (i13 << 9)) | ((i13 << 6) & 458752));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(stateCreateTransitionAnimation);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new j(stateCreateTransitionAnimation);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                this.f2730t0.invoke(t10, composer2, Integer.valueOf((i10 >> 9) & 112));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Crossfade.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f2731p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2732q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FiniteAnimationSpec<Float> f2733r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f2734s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<T, Composer, Integer, Unit> f2735t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f2736u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2731p0 = transition;
            this.f2732q0 = modifier;
            this.f2733r0 = finiteAnimationSpec;
            this.f2734s0 = function1;
            this.f2735t0 = function3;
            this.f2736u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CrossfadeKt.Crossfade(this.f2731p0, this.f2732q0, this.f2733r0, this.f2734s0, this.f2735t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2736u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final <T> void Crossfade(T t10, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable String str, @NotNull Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        Modifier modifier3;
        FiniteAnimationSpec<Float> finiteAnimationSpecTween$default;
        String str3;
        String str4;
        Modifier modifier4;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310686752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(t10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if (i13 != 4 && (46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier4 = modifier2;
                    str4 = str2;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                    } else {
                        finiteAnimationSpecTween$default = finiteAnimationSpec;
                    }
                    if (i14 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                    }
                    String str5 = str3;
                    Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    modifier4 = modifier3;
                    finiteAnimationSpec2 = finiteAnimationSpecTween$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(t10, modifier4, finiteAnimationSpec2, str4, content, i10, i11));
            }
            i12 |= 3072;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if (i13 != 4) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str6 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str6;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str7 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str7;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(t10, modifier4, finiteAnimationSpec2, str4, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if (i13 != 4) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str8 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str8;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str9 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str9;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(t10, modifier4, finiteAnimationSpec2, str4, content, i10, i11));
        }
        i12 |= 3072;
        str2 = str;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if (i13 != 4) {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i14 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str10 = str3;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str10;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i14 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str11 = str3;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | (i12 & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str11;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(t10, modifier4, finiteAnimationSpec2, str4, content, i10, i11));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    @Composable
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 content, Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(523603005);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if (i14 == 4 && (i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, composerStartRestartGroup, (i12 & 8) | (i12 & 14), 2), modifier, (FiniteAnimationSpec<Float>) finiteAnimationSpec, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | ((i12 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(obj, modifier2, finiteAnimationSpec2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[LOOP:1: B:100:0x01a9->B:101:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0225  */
    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:108:0x0235  */
    /* JADX WARN: Code duplicated, block: B:111:0x0246  */
    /* JADX WARN: Code duplicated, block: B:113:0x0254  */
    /* JADX WARN: Code duplicated, block: B:116:0x0278  */
    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0190 A[EDGE_INSN: B:131:0x0190->B:96:0x0190 BREAK  A[LOOP:0: B:89:0x016e->B:94:0x018b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:91:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b A[LOOP:0: B:89:0x016e->B:94:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void Crossfade(@NotNull Transition<T> transition, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Function1<? super T, ? extends Object> function2;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        FiniteAnimationSpec<Float> finiteAnimationSpecTween$default;
        Object objRememberedValue;
        Composer.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objRememberedValue2;
        Map map;
        Map map2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        int size;
        int i18;
        Function1<? super T, ? extends Object> function3;
        Modifier modifier4;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        Function2 function4;
        Iterator<T> it;
        int i19;
        int size2;
        int i20;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(679005231);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 1;
        if (i21 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 4;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if (i13 != 2 && (46811 & i17) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier4 = modifier2;
                    function3 = function2;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                    } else {
                        finiteAnimationSpecTween$default = finiteAnimationSpec;
                    }
                    if (i14 != 0) {
                        function2 = c.f2724p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    obj = objRememberedValue;
                    if (objRememberedValue == companion.getEmpty()) {
                        SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
                        snapshotStateListMutableStateListOf.add(transition.getCurrentState());
                        composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
                        obj = snapshotStateListMutableStateListOf;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) obj;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new LinkedHashMap();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    map = (Map) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-1621449213);
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState()))) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(transition);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new d(transition);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                        map.clear();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (!map.containsKey(transition.getTargetState())) {
                        it = snapshotStateList.iterator();
                        i19 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i19 = -1;
                                break;
                            } else if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i19 == -1) {
                            snapshotStateList.add(transition.getTargetState());
                        } else {
                            snapshotStateList.set(i19, transition.getTargetState());
                        }
                        map.clear();
                        i20 = 0;
                        for (size2 = snapshotStateList.size(); i20 < size2; size2 = size2) {
                            T t10 = snapshotStateList.get(i20);
                            Map map3 = map;
                            map3.put(t10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t10, content)));
                            i20++;
                            map = map3;
                        }
                    }
                    map2 = map;
                    int i22 = (i17 >> 3) & 14;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i23 = i22 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i23 & 112) | (i23 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                    int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (!composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j((i24 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1621447954);
                    size = snapshotStateList.size();
                    for (i18 = 0; i18 < size; i18++) {
                        Object obj2 = snapshotStateList.get(i18);
                        composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj2));
                        function4 = (Function2) map2.get(obj2);
                        if (function4 != null) {
                            function4.invoke(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endMovableGroup();
                    }
                    if (androidx.databinding.e.e(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function2;
                    modifier4 = modifier3;
                    finiteAnimationSpec2 = finiteAnimationSpecTween$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, modifier4, finiteAnimationSpec2, function3, content, i10, i11));
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12;
            if (i13 != 2) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    function2 = c.f2724p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf2 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf2.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf2);
                    obj = snapshotStateListMutableStateListOf2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i19, transition.getTargetState());
                    }
                    map.clear();
                    i20 = 0;
                    while (i20 < size2) {
                        T t11 = snapshotStateList.get(i20);
                        Map map4 = map;
                        map4.put(t11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t11, content)));
                        i20++;
                        map = map4;
                    }
                }
                map2 = map;
                int i25 = (i17 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i26 = i25 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i26 & 112) | (i26 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                int i27 = ((((i25 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                if (!composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i27 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i18 < size) {
                    Object obj3 = snapshotStateList.get(i18);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj3));
                    function4 = (Function2) map2.get(obj3);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    function2 = c.f2724p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf3 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf3.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf3);
                    obj = snapshotStateListMutableStateListOf3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i19, transition.getTargetState());
                    }
                    map.clear();
                    i20 = 0;
                    while (i20 < size2) {
                        T t12 = snapshotStateList.get(i20);
                        Map map5 = map;
                        map5.put(t12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t12, content)));
                        i20++;
                        map = map5;
                    }
                }
                map2 = map;
                int i28 = (i17 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i29 = i28 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i29 & 112) | (i29 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                int i210 = ((((i28 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                if (!composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i210 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i18 < size) {
                    Object obj4 = snapshotStateList.get(i18);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj4));
                    function4 = (Function2) map2.get(obj4);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, modifier4, finiteAnimationSpec2, function3, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 4;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12;
            if (i13 != 2) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    function2 = c.f2724p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf4 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf4.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf4);
                    obj = snapshotStateListMutableStateListOf4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i19, transition.getTargetState());
                    }
                    map.clear();
                    i20 = 0;
                    while (i20 < size2) {
                        T t13 = snapshotStateList.get(i20);
                        Map map6 = map;
                        map6.put(t13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t13, content)));
                        i20++;
                        map = map6;
                    }
                }
                map2 = map;
                int i211 = (i17 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i212 = i211 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i212 & 112) | (i212 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifier3);
                int i213 = ((((i211 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                if (!composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i213 >> 3) & 112, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i18 < size) {
                    Object obj5 = snapshotStateList.get(i18);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj5));
                    function4 = (Function2) map2.get(obj5);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i14 != 0) {
                    function2 = c.f2724p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf5 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf5.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf5);
                    obj = snapshotStateListMutableStateListOf5;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(transition);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i19, transition.getTargetState());
                    }
                    map.clear();
                    i20 = 0;
                    while (i20 < size2) {
                        T t14 = snapshotStateList.get(i20);
                        Map map7 = map;
                        map7.put(t14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t14, content)));
                        i20++;
                        map = map7;
                    }
                }
                map2 = map;
                int i214 = (i17 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i215 = i214 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i215 & 112) | (i215 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifier3);
                int i216 = ((((i214 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                if (!composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i216 >> 3) & 112, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i18 < size) {
                    Object obj6 = snapshotStateList.get(i18);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj6));
                    function4 = (Function2) map2.get(obj6);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, modifier4, finiteAnimationSpec2, function3, content, i10, i11));
        }
        i12 |= 3072;
        function2 = function1;
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        i17 = i12;
        if (i13 != 2) {
            if (i21 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i14 != 0) {
                function2 = c.f2724p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotStateList snapshotStateListMutableStateListOf6 = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf6.add(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf6);
                obj = snapshotStateListMutableStateListOf6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) obj;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-1621449213);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(transition);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new d(transition);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(transition);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                map.clear();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
                it = snapshotStateList.iterator();
                i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 == -1) {
                    snapshotStateList.add(transition.getTargetState());
                } else {
                    snapshotStateList.set(i19, transition.getTargetState());
                }
                map.clear();
                i20 = 0;
                while (i20 < size2) {
                    T t15 = snapshotStateList.get(i20);
                    Map map8 = map;
                    map8.put(t15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t15, content)));
                    i20++;
                    map = map8;
                }
            }
            map2 = map;
            int i217 = (i17 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i218 = i217 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i218 & 112) | (i218 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifier3);
            int i219 = ((((i217 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
            if (!composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i219 >> 3) & 112, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1621447954);
            size = snapshotStateList.size();
            while (i18 < size) {
                Object obj7 = snapshotStateList.get(i18);
                composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj7));
                function4 = (Function2) map2.get(obj7);
                if (function4 != null) {
                    function4.invoke(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endMovableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        } else {
            if (i21 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i14 != 0) {
                function2 = c.f2724p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotStateList snapshotStateListMutableStateListOf7 = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf7.add(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf7);
                obj = snapshotStateListMutableStateListOf7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) obj;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-1621449213);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(transition);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new d(transition);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(transition);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                bk.g.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                map.clear();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
                it = snapshotStateList.iterator();
                i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 == -1) {
                    snapshotStateList.add(transition.getTargetState());
                } else {
                    snapshotStateList.set(i19, transition.getTargetState());
                }
                map.clear();
                i20 = 0;
                while (i20 < size2) {
                    T t16 = snapshotStateList.get(i20);
                    Map map9 = map;
                    map9.put(t16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new e(transition, i17, finiteAnimationSpecTween$default, t16, content)));
                    i20++;
                    map = map9;
                }
            }
            map2 = map;
            int i2110 = (i17 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i2111 = i2110 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i2111 & 112) | (i2111 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifier3);
            int i2112 = ((((i2110 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
            if (!composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i2112 >> 3) & 112, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1621447954);
            size = snapshotStateList.size();
            while (i18 < size) {
                Object obj8 = snapshotStateList.get(i18);
                composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj8));
                function4 = (Function2) map2.get(obj8);
                if (function4 != null) {
                    function4.invoke(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endMovableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, modifier4, finiteAnimationSpec2, function3, content, i10, i11));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Crossfade.kt */
    public static final class c<T> extends Lambda implements Function1<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f2724p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }
}
