package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0010\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001aa\u0010\u0010\u001a\u00020\f*\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0015\u001ac\u0010\u0010\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001ag\u0010\u0010\u001a\u00020\f*\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001ag\u0010\u0010\u001a\u00020\f*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u001a\u001ao\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u001d\u001aL\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00002\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,863:1\n775#1,4:898\n781#1,2:909\n779#1:912\n780#1:941\n785#1:946\n25#2:864\n36#2:872\n36#2:880\n50#2:890\n49#2:891\n36#2:902\n25#2:911\n456#2,8:924\n464#2,3:938\n467#2,3:942\n36#2:947\n25#2:954\n456#2,8:972\n464#2,6:986\n25#2:993\n1097#3,6:865\n1097#3,6:873\n1097#3,6:881\n1097#3,6:892\n1097#3,6:903\n1097#3,6:948\n1097#3,6:955\n1097#3,6:994\n1#4:871\n787#5:879\n788#5,3:887\n78#6,11:913\n91#6:945\n78#6,11:961\n91#6:992\n4144#7,6:932\n4144#7,6:980\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n753#1:898,4\n753#1:909,2\n753#1:912\n753#1:941\n753#1:946\n710#1:864\n735#1:872\n740#1:880\n744#1:890\n744#1:891\n753#1:902\n753#1:911\n753#1:924,8\n753#1:938,3\n753#1:942,3\n778#1:947\n782#1:954\n779#1:972,8\n779#1:986,6\n847#1:993\n710#1:865,6\n735#1:873,6\n740#1:881,6\n744#1:892,6\n753#1:903,6\n778#1:948,6\n782#1:955,6\n847#1:994,6\n740#1:879\n740#1:887,3\n753#1:913,11\n753#1:945\n779#1:961,11\n779#1:992\n753#1:932,6\n779#1:980,6\n*E\n"})
public final class AnimatedVisibilityKt {

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", i = {}, l = {748}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f2609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Transition<EnterExitState> f2610q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f2611r0;

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnimatedVisibility.kt */
        public static final class C0007a extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Transition<EnterExitState> f2612p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0007a(Transition<EnterExitState> transition) {
                super(0);
                this.f2612p0 = transition;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Transition<EnterExitState> transition = this.f2612p0;
                EnterExitState currentState = transition.getCurrentState();
                EnterExitState enterExitState = EnterExitState.Visible;
                return Boolean.valueOf(currentState == enterExitState || transition.getTargetState() == enterExitState);
            }
        }

        /* JADX INFO: compiled from: AnimatedVisibility.kt */
        public static final class b implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f2613p0;

            public b(MutableState<Boolean> mutableState) {
                this.f2613p0 = mutableState;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Boolean bool, Continuation continuation) {
                this.f2613p0.setValue(Boxing.boxBoolean(bool.booleanValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Transition<EnterExitState> transition, MutableState<Boolean> mutableState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2610q0 = transition;
            this.f2611r0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f2610q0, this.f2611r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f2609p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new C0007a(this.f2610q0));
                b bVar = new b(this.f2611r0);
                this.f2609p0 = 1;
                if (flowSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f2614p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f2615q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2616r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2617s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2618t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2619u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f2614p0 = transition;
            this.f2615q0 = function1;
            this.f2616r0 = modifier;
            this.f2617s0 = enterTransition;
            this.f2618t0 = exitTransition;
            this.f2619u0 = function3;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.a(this.f2614p0, this.f2615q0, this.f2616r0, this.f2617s0, this.f2618t0, this.f2619u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RowScope f2620p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f2621q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2622r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2623s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2624t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f2625u0;
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2626w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f2627x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(RowScope rowScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2620p0 = rowScope;
            this.f2621q0 = mutableTransitionState;
            this.f2622r0 = modifier;
            this.f2623s0 = enterTransition;
            this.f2624t0 = exitTransition;
            this.f2625u0 = str;
            this.v0 = function3;
            this.f2626w0 = i10;
            this.f2627x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2620p0, this.f2621q0, this.f2622r0, this.f2623s0, this.f2624t0, this.f2625u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2626w0 | 1), this.f2627x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class d extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f2628p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f2629p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f2630q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2631r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2632s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2633t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f2634u0;
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2635w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f2636x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ColumnScope columnScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2629p0 = columnScope;
            this.f2630q0 = mutableTransitionState;
            this.f2631r0 = modifier;
            this.f2632s0 = enterTransition;
            this.f2633t0 = exitTransition;
            this.f2634u0 = str;
            this.v0 = function3;
            this.f2635w0 = i10;
            this.f2636x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2629p0, this.f2630q0, this.f2631r0, this.f2632s0, this.f2633t0, this.f2634u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2635w0 | 1), this.f2636x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<T> f2637p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f2638q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2639r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2640s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2641t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2642u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2643w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2637p0 = transition;
            this.f2638q0 = function1;
            this.f2639r0 = modifier;
            this.f2640s0 = enterTransition;
            this.f2641t0 = exitTransition;
            this.f2642u0 = function3;
            this.v0 = i10;
            this.f2643w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2637p0, this.f2638q0, this.f2639r0, this.f2640s0, this.f2641t0, this.f2642u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f2643w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class g extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f2644p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f2645q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, Function2 function2) {
            super(3);
            this.f2644p0 = function2;
            this.f2645q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1996320812, iIntValue, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                }
                this.f2644p0.invoke(composer2, Integer.valueOf((this.f2645q0 >> 15) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f2646p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2647q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2648r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2649s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f2650t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f2651u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2652w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(boolean z10, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, boolean z11, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f2646p0 = z10;
            this.f2647q0 = modifier;
            this.f2648r0 = enterTransition;
            this.f2649s0 = exitTransition;
            this.f2650t0 = z11;
            this.f2651u0 = function2;
            this.v0 = i10;
            this.f2652w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2646p0, this.f2647q0, this.f2648r0, this.f2649s0, this.f2650t0, this.f2651u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f2652w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class i extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f2653p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f2654p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2655q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2656r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2657s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f2658t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2659u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2660w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(boolean z10, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2654p0 = z10;
            this.f2655q0 = modifier;
            this.f2656r0 = enterTransition;
            this.f2657s0 = exitTransition;
            this.f2658t0 = str;
            this.f2659u0 = function3;
            this.v0 = i10;
            this.f2660w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2654p0, this.f2655q0, this.f2656r0, this.f2657s0, this.f2658t0, this.f2659u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f2660w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class k extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f2661p0 = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RowScope f2662p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f2663q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2664r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2665s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2666t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f2667u0;
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2668w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f2669x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(RowScope rowScope, boolean z10, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2662p0 = rowScope;
            this.f2663q0 = z10;
            this.f2664r0 = modifier;
            this.f2665s0 = enterTransition;
            this.f2666t0 = exitTransition;
            this.f2667u0 = str;
            this.v0 = function3;
            this.f2668w0 = i10;
            this.f2669x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2662p0, this.f2663q0, this.f2664r0, this.f2665s0, this.f2666t0, this.f2667u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2668w0 | 1), this.f2669x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class m extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f2670p0 = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f2671p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f2672q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2673r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2674s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2675t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f2676u0;
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2677w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f2678x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(ColumnScope columnScope, boolean z10, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2671p0 = columnScope;
            this.f2672q0 = z10;
            this.f2673r0 = modifier;
            this.f2674s0 = enterTransition;
            this.f2675t0 = exitTransition;
            this.f2676u0 = str;
            this.v0 = function3;
            this.f2677w0 = i10;
            this.f2678x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2671p0, this.f2672q0, this.f2673r0, this.f2674s0, this.f2675t0, this.f2676u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2677w0 | 1), this.f2678x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class o extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f2679p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f2680p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f2681q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2682r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2683s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f2684t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2685u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f2686w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f2680p0 = mutableTransitionState;
            this.f2681q0 = modifier;
            this.f2682r0 = enterTransition;
            this.f2683s0 = exitTransition;
            this.f2684t0 = str;
            this.f2685u0 = function3;
            this.v0 = i10;
            this.f2686w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AnimatedVisibilityKt.AnimatedVisibility(this.f2680p0, this.f2681q0, this.f2682r0, this.f2683s0, this.f2684t0, this.f2685u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f2686w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    public static final class q extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f2687p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(boolean z10, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransition2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        Modifier modifier4;
        String str3;
        ExitTransition exitTransition3;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2088733774);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            str2 = str;
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                if (i20 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                                } else {
                                    enterTransitionPlus = enterTransition2;
                                }
                                if (i15 != 0) {
                                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                                } else {
                                    exitTransitionPlus = exitTransition2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                                }
                                int i21 = i12 << 3;
                                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168) | (i12 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                str3 = str2;
                                exitTransition3 = exitTransitionPlus;
                                enterTransition3 = enterTransitionPlus;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                        }
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i12 |= i19;
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i22 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i23 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i24 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i25 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i26 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i27 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 3072;
                exitTransition2 = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i28 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i29 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i210 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i212 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i213 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i214 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i215 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i216 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i217 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i218 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i219 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2110 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2111 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2114 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2114 & 57344) | (i2114 & 896) | 48 | (i2114 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2115 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2115 & 57344) | (i2115 & 896) | 48 | (i2115 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2116 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2116 & 57344) | (i2116 & 896) | 48 | (i2116 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2117 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2117 & 57344) | (i2117 & 896) | 48 | (i2117 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2118 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2118 & 57344) | (i2118 & 896) | 48 | (i2118 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2119 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2119 & 57344) | (i2119 & 896) | 48 | (i2119 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21110 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21110 & 57344) | (i21110 & 896) | 48 | (i21110 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111 & 57344) | (i21111 & 896) | 48 | (i21111 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i21112 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21112 & 57344) | (i21112 & 896) | 48 | (i21112 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i21113 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21113 & 57344) | (i21113 & 896) | 48 | (i21113 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21114 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21114 & 57344) | (i21114 & 896) | 48 | (i21114 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21115 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21115 & 57344) | (i21115 & 896) | 48 | (i21115 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21116 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21116 & 57344) | (i21116 & 896) | 48 | (i21116 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21117 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21117 & 57344) | (i21117 & 896) | 48 | (i21117 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i21118 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21118 & 57344) | (i21118 & 896) | 48 | (i21118 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i21119 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21119 & 57344) | (i21119 & 896) | 48 | (i21119 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211110 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211110 & 57344) | (i211110 & 896) | 48 | (i211110 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211111 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211111 & 57344) | (i211111 & 896) | 48 | (i211111 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211112 & 57344) | (i211112 & 896) | 48 | (i211112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211113 & 57344) | (i211113 & 896) | 48 | (i211113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211114 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211114 & 57344) | (i211114 & 896) | 48 | (i211114 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211115 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211115 & 57344) | (i211115 & 896) | 48 | (i211115 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i211116 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211116 & 57344) | (i211116 & 896) | 48 | (i211116 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i211117 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211117 & 57344) | (i211117 & 896) | 48 | (i211117 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211118 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211118 & 57344) | (i211118 & 896) | 48 | (i211118 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211119 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211119 & 57344) | (i211119 & 896) | 48 | (i211119 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111110 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111110 & 57344) | (i2111110 & 896) | 48 | (i2111110 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111111 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111111 & 57344) | (i2111111 & 896) | 48 | (i2111111 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111112 & 57344) | (i2111112 & 896) | 48 | (i2111112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111113 & 57344) | (i2111113 & 896) | 48 | (i2111113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111114 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111114 & 57344) | (i2111114 & 896) | 48 | (i2111114 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111115 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111115 & 57344) | (i2111115 & 896) | 48 | (i2111115 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 3072;
        exitTransition2 = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111116 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111116 & 57344) | (i2111116 & 896) | 48 | (i2111116 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111117 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111117 & 57344) | (i2111117 & 896) | 48 | (i2111117 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111118 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111118 & 57344) | (i2111118 & 896) | 48 | (i2111118 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111119 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111119 & 57344) | (i2111119 & 896) | 48 | (i2111119 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111110 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111110 & 57344) | (i21111110 & 896) | 48 | (i21111110 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111111 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111111 & 57344) | (i21111111 & 896) | 48 | (i21111111 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i19;
        if ((374491 & i12) == 74898) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
            }
            int i21111112 = i12 << 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111112 & 57344) | (i21111112 & 896) | 48 | (i21111112 & 7168) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
            }
            int i21111113 = i12 << 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112), 0), i.f2653p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111113 & 57344) | (i21111113 & 896) | 48 | (i21111113 & 7168) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(z10, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void a(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(808253933);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= composerStartRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808253933, i12, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i13 = i12 & 14;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(transition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (function1.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                int i14 = i13 | 48;
                composerStartRestartGroup.startReplaceableGroup(1215497572);
                int i15 = i14 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(transition);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = transition.getCurrentState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    objRememberedValue2 = transition.getCurrentState();
                }
                int i16 = (i14 >> 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i17 = i13 | (i12 & 112) | ((i16 << 6) & 896);
                EnterExitState enterExitStateB = b(transition, function1, objRememberedValue2, composerStartRestartGroup, i17);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState enterExitStateB2 = b(transition, function1, targetState, composerStartRestartGroup, i17);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Transition transitionCreateChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitStateB, enterExitStateB2, "EnterExitTransition", composerStartRestartGroup, i15 | ((i14 << 6) & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new a(transitionCreateChildTransitionInternal, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(transitionCreateChildTransitionInternal, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 64);
                int i18 = i12 >> 3;
                int i19 = (i18 & 57344) | (i18 & 112) | (i18 & 896) | (i18 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-1967270694);
                Object currentState = transitionCreateChildTransitionInternal.getCurrentState();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (currentState == enterExitState || transitionCreateChildTransitionInternal.getTargetState() == enterExitState) {
                    int i20 = i19 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged4 = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new AnimatedVisibilityScopeImpl(transitionCreateChildTransitionInternal);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue4;
                    int i21 = i19 >> 3;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(transitionCreateChildTransitionInternal, enterTransition, exitTransition, "Built-in", composerStartRestartGroup, i20 | 3072 | (i21 & 112) | (i21 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new r.b(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                    Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i19 >> 9) & 112) | 8));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(transition, function1, modifier, enterTransition, exitTransition, function3, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public static final <T> EnterExitState b(Transition<T> transition, Function1<? super T, Boolean> function1, T t10, Composer composer, int i10) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer.startMovableGroup(-721837504, transition);
        if (!transition.isSeeking()) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (function1.invoke(t10).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else if (function1.invoke(t10).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else {
            enterExitState = function1.invoke(transition.getCurrentState()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull RowScope rowScope, boolean z10, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransitionPlus;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransition2;
        String str3;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741346906);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        exitTransitionPlus = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) != 599184 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            enterTransition3 = enterTransition2;
                            exitTransition2 = exitTransitionPlus;
                            str3 = str2;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                            }
                            int i21 = i12 >> 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = exitTransitionPlus;
                            str3 = str2;
                            modifier2 = modifier3;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i22 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i22 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i23 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i23 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i12 |= 24576;
                exitTransitionPlus = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i24 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i24 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i25 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i25 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i26 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i26 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i27 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i27 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 3072;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i28 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i28 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i29 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i29 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i210 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i210 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i211 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i211 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i212 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i212 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i213 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i213 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i214 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i214 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i215 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i215 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i216 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i216 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i217 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i217 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i217 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i218 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i218 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i218 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i219 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i219 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i219 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2110 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2110 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2110 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2111 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2111 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2111 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2112 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2112 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2112 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2113 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2113 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2113 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= 3072;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                exitTransitionPlus = exitTransition;
                if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2114 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2114 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2114 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2115 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2115 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2115 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2116 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2116 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2116 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2117 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2117 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2117 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= 24576;
        exitTransitionPlus = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2118 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2118 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2118 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2119 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2119 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2119 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) != 599184) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
            }
            int i21110 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21110 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21110 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            str3 = str2;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
            }
            int i21111 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21111 & 14) | ((i12 >> 12) & 112), 0), k.f2661p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21111 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            str3 = str2;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(rowScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull ColumnScope columnScope, boolean z10, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransitionPlus;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransition2;
        String str3;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1766503102);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        exitTransitionPlus = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) != 599184 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            enterTransition3 = enterTransition2;
                            exitTransition2 = exitTransitionPlus;
                            str3 = str2;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                            }
                            int i21 = i12 >> 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = exitTransitionPlus;
                            str3 = str2;
                            modifier2 = modifier3;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i22 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i22 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i23 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i23 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i12 |= 24576;
                exitTransitionPlus = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i24 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i24 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i25 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i25 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i26 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i26 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i27 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i27 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 3072;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i28 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i28 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i29 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i29 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i210 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i210 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i211 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i211 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i212 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i212 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i213 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i213 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i214 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i214 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i215 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i215 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i216 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i216 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i217 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i217 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i217 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        str3 = str2;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i218 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i218 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i218 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i219 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i219 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i219 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2110 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2110 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2110 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2111 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2111 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2111 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2112 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2112 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2112 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2113 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2113 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2113 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= 3072;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                exitTransitionPlus = exitTransition;
                if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2114 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2114 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2114 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2115 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2115 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2115 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    str3 = str2;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2116 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2116 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2116 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2117 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2117 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2117 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i12 |= 24576;
        exitTransitionPlus = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2118 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2118 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2118 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2119 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i2119 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2119 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                str3 = str2;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) != 599184) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
            }
            int i21110 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21110 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21110 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            str3 = str2;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
            }
            int i21111 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z10), str2, composerStartRestartGroup, (i21111 & 14) | ((i12 >> 12) & 112), 0), m.f2670p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21111 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            str3 = str2;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(columnScope, z10, modifier2, enterTransition3, exitTransition2, str3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransition2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        Modifier modifier4;
        String str3;
        ExitTransition exitTransition3;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-222898426);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(visibleState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            str2 = str;
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) != 74898 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            } else {
                                if (i20 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                                } else {
                                    enterTransitionPlus = enterTransition2;
                                }
                                if (i15 != 0) {
                                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                                } else {
                                    exitTransitionPlus = exitTransition2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                                }
                                int i21 = i12 << 3;
                                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168) | (i12 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                str3 = str2;
                                exitTransition3 = exitTransitionPlus;
                                enterTransition3 = enterTransitionPlus;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                        }
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i12 |= i19;
                        if ((374491 & i12) != 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i22 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i23 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i24 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i25 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i26 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i27 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 3072;
                exitTransition2 = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i28 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i29 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i210 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i212 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i213 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i214 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i215 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i216 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i217 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i218 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i219 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2110 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2111 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2114 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2114 & 57344) | (i2114 & 896) | 48 | (i2114 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2115 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2115 & 57344) | (i2115 & 896) | 48 | (i2115 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2116 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2116 & 57344) | (i2116 & 896) | 48 | (i2116 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2117 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2117 & 57344) | (i2117 & 896) | 48 | (i2117 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2118 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2118 & 57344) | (i2118 & 896) | 48 | (i2118 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2119 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2119 & 57344) | (i2119 & 896) | 48 | (i2119 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) != 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21110 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21110 & 57344) | (i21110 & 896) | 48 | (i21110 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111 & 57344) | (i21111 & 896) | 48 | (i21111 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) != 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i21112 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21112 & 57344) | (i21112 & 896) | 48 | (i21112 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i21113 = i12 << 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21113 & 57344) | (i21113 & 896) | 48 | (i21113 & 7168) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            exitTransition3 = exitTransitionPlus;
                            enterTransition3 = enterTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21114 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21114 & 57344) | (i21114 & 896) | 48 | (i21114 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21115 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21115 & 57344) | (i21115 & 896) | 48 | (i21115 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21116 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21116 & 57344) | (i21116 & 896) | 48 | (i21116 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21117 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21117 & 57344) | (i21117 & 896) | 48 | (i21117 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i21118 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21118 & 57344) | (i21118 & 896) | 48 | (i21118 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i21119 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21119 & 57344) | (i21119 & 896) | 48 | (i21119 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211110 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211110 & 57344) | (i211110 & 896) | 48 | (i211110 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211111 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211111 & 57344) | (i211111 & 896) | 48 | (i211111 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211112 & 57344) | (i211112 & 896) | 48 | (i211112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211113 & 57344) | (i211113 & 896) | 48 | (i211113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211114 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211114 & 57344) | (i211114 & 896) | 48 | (i211114 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211115 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211115 & 57344) | (i211115 & 896) | 48 | (i211115 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) != 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i211116 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211116 & 57344) | (i211116 & 896) | 48 | (i211116 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i211117 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211117 & 57344) | (i211117 & 896) | 48 | (i211117 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) != 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211118 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211118 & 57344) | (i211118 & 896) | 48 | (i211118 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211119 = i12 << 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i211119 & 57344) | (i211119 & 896) | 48 | (i211119 & 7168) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        exitTransition3 = exitTransitionPlus;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111110 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111110 & 57344) | (i2111110 & 896) | 48 | (i2111110 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111111 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111111 & 57344) | (i2111111 & 896) | 48 | (i2111111 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111112 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111112 & 57344) | (i2111112 & 896) | 48 | (i2111112 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111113 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111113 & 57344) | (i2111113 & 896) | 48 | (i2111113 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) != 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111114 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111114 & 57344) | (i2111114 & 896) | 48 | (i2111114 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111115 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111115 & 57344) | (i2111115 & 896) | 48 | (i2111115 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 3072;
        exitTransition2 = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) != 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111116 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111116 & 57344) | (i2111116 & 896) | 48 | (i2111116 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111117 = i12 << 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111117 & 57344) | (i2111117 & 896) | 48 | (i2111117 & 7168) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    exitTransition3 = exitTransitionPlus;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) != 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111118 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111118 & 57344) | (i2111118 & 896) | 48 | (i2111118 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111119 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i2111119 & 57344) | (i2111119 & 896) | 48 | (i2111119 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) != 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111110 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111110 & 57344) | (i21111110 & 896) | 48 | (i21111110 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111111 = i12 << 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111111 & 57344) | (i21111111 & 896) | 48 | (i21111111 & 7168) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                exitTransition3 = exitTransitionPlus;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i19;
        if ((374491 & i12) != 74898) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
            }
            int i21111112 = i12 << 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111112 & 57344) | (i21111112 & 896) | 48 | (i21111112 & 7168) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
            }
            int i21111113 = i12 << 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i12 & 14) | ((i12 >> 9) & 112), 0), o.f2679p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i21111113 & 57344) | (i21111113 & 896) | 48 | (i21111113 & 7168) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            exitTransition3 = exitTransitionPlus;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p(visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull RowScope rowScope, @NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransition2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        Modifier modifier4;
        String str3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(836509870);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (composerStartRestartGroup.changed(visibleState) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) != 599184 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i21 = i12 >> 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            enterTransition3 = enterTransitionPlus;
                            exitTransition3 = exitTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i22 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i22 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i23 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i23 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                exitTransition2 = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i24 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i24 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i25 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i25 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i26 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i26 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i27 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i27 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i28 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i28 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i29 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i29 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i210 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i210 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i211 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i211 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i212 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i212 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i213 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i213 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i214 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i214 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i215 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i215 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i216 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i216 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i217 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i217 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i217 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i218 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i218 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i218 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i219 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i219 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i219 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2110 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2110 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2110 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2111 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2111 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2111 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2112 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2112 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2112 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2113 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2113 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2113 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 3072;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2114 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2114 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2114 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2115 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2115 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2115 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2116 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2116 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2116 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2117 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2117 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2117 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 24576;
        exitTransition2 = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2118 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2118 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2118 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2119 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2119 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2119 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) != 599184) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            int i21110 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21110 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21110 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            enterTransition3 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            int i21111 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21111 & 14) | ((i12 >> 12) & 112), 0), q.f2687p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21111 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            enterTransition3 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(rowScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull ColumnScope columnScope, @NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable String str, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransition2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransitionPlus;
        Modifier modifier4;
        String str3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-850656618);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (composerStartRestartGroup.changed(visibleState) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) != 599184 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            } else {
                                exitTransitionPlus = exitTransition2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                            }
                            int i21 = i12 >> 3;
                            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            str3 = str2;
                            enterTransition3 = enterTransitionPlus;
                            exitTransition3 = exitTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i22 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i22 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i23 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i23 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i12 |= 24576;
                exitTransition2 = exitTransition;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i24 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i24 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i25 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i25 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i26 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i26 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i27 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i27 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 3072;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i28 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i28 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i29 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i29 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i210 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i210 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i211 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i211 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i212 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i212 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i213 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i213 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i214 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i214 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i215 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i215 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) != 599184) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i216 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i216 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        } else {
                            exitTransitionPlus = exitTransition2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i217 = i12 >> 3;
                        a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i217 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i217 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i218 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i218 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i218 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i219 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i219 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i219 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i12 |= 24576;
            exitTransition2 = exitTransition;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2110 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2110 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2110 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2111 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2111 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2111 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2112 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2112 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2112 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2113 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2113 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2113 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 3072;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) != 599184) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2114 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2114 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2114 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    } else {
                        exitTransitionPlus = exitTransition2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2115 = i12 >> 3;
                    a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2115 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2115 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    enterTransition3 = enterTransitionPlus;
                    exitTransition3 = exitTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2116 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2116 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2116 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2117 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2117 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2117 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i12 |= 24576;
        exitTransition2 = exitTransition;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) != 599184) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2118 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2118 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2118 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                } else {
                    exitTransitionPlus = exitTransition2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2119 = i12 >> 3;
                a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i2119 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i2119 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                enterTransition3 = enterTransitionPlus;
                exitTransition3 = exitTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) != 599184) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
            }
            int i21110 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21110 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21110 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            enterTransition3 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            } else {
                exitTransitionPlus = exitTransition2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
            }
            int i21111 = i12 >> 3;
            a(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (i21111 & 14) | ((i12 >> 12) & 112), 0), d.f2628p0, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21111 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            enterTransition3 = enterTransitionPlus;
            exitTransition3 = exitTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(columnScope, visibleState, modifier4, enterTransition3, exitTransition3, str3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void AnimatedVisibility(@NotNull Transition<T> transition, @NotNull Function1<? super T, Boolean> visible, @Nullable Modifier modifier, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        EnterTransition enterTransition2;
        int i14;
        int i15;
        ExitTransition exitTransitionPlus;
        int i16;
        int i17;
        Modifier modifier3;
        EnterTransition enterTransitionPlus;
        ExitTransition exitTransition2;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1031950689);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(visible) ? 32 : 16;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        exitTransitionPlus = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i18 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                            } else {
                                enterTransitionPlus = enterTransition2;
                            }
                            if (i15 != 0) {
                                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                            }
                            a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = exitTransitionPlus;
                            modifier2 = modifier3;
                            enterTransition3 = enterTransitionPlus;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            enterTransition3 = enterTransition2;
                            exitTransition2 = exitTransitionPlus;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
                    }
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i17;
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
                }
                i12 |= 24576;
                exitTransitionPlus = exitTransition;
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i12 |= 3072;
            enterTransition2 = enterTransition;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    exitTransitionPlus = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        } else {
                            enterTransitionPlus = enterTransition2;
                        }
                        if (i15 != 0) {
                            exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exitTransition2 = exitTransitionPlus;
                        modifier2 = modifier3;
                        enterTransition3 = enterTransitionPlus;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i12 |= 24576;
            exitTransitionPlus = exitTransition;
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
        }
        i12 |= 3072;
        enterTransition2 = enterTransition;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                exitTransitionPlus = exitTransition;
                if (composerStartRestartGroup.changed(exitTransitionPlus)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                    } else {
                        enterTransitionPlus = enterTransition2;
                    }
                    if (i15 != 0) {
                        exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    exitTransition2 = exitTransitionPlus;
                    modifier2 = modifier3;
                    enterTransition3 = enterTransitionPlus;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
        }
        i12 |= 24576;
        exitTransitionPlus = exitTransition;
        if ((i11 & 16) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                } else {
                    enterTransitionPlus = enterTransition2;
                }
                if (i15 != 0) {
                    exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                exitTransition2 = exitTransitionPlus;
                modifier2 = modifier3;
                enterTransition3 = enterTransitionPlus;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i17;
        if ((374491 & i12) == 74898) {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
            }
            a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        } else {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            } else {
                enterTransitionPlus = enterTransition2;
            }
            if (i15 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
            }
            a(transition, visible, modifier3, enterTransitionPlus, exitTransitionPlus, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition2 = exitTransitionPlus;
            modifier2 = modifier3;
            enterTransition3 = enterTransitionPlus;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(transition, visible, modifier2, enterTransition3, exitTransition2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @Composable
    @ExperimentalAnimationApi
    public static final void AnimatedVisibility(boolean z10, @Nullable Modifier modifier, @NotNull EnterTransition enter, @NotNull ExitTransition exit, boolean z11, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        Object objRememberedValue;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1121582420);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changed(enter)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(exit)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((374491 & i12) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.valueOf(z11));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1996320812, true, new g(i12, content)), composerStartRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (i12 & 896) | (i12 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(z10, modifier4, enter, exit, z11, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changed(enter)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(exit)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i11 & 32) != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((374491 & i12) != 74898) {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z11));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableTransitionState mutableTransitionState2 = (MutableTransitionState) objRememberedValue;
            mutableTransitionState2.setTargetState(Boolean.valueOf(z10));
            AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1996320812, true, new g(i12, content)), composerStartRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (i12 & 896) | (i12 & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z11));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableTransitionState mutableTransitionState3 = (MutableTransitionState) objRememberedValue;
            mutableTransitionState3.setTargetState(Boolean.valueOf(z10));
            AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState3, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1996320812, true, new g(i12, content)), composerStartRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (i12 & 896) | (i12 & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(z10, modifier4, enter, exit, z11, content, i10, i11));
    }
}
