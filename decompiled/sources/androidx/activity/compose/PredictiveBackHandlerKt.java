package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import j.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032A\u0010\u0004\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f²\u0006E\u0010\u0010\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005X\u008a\u0084\u0002"}, d2 = {"PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n25#3:188\n955#4,3:178\n958#4,3:184\n955#4,6:189\n473#5:183\n76#6:195\n89#7:196\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n81#1:188\n79#1:178,3\n79#1:184,3\n81#1:189,6\n79#1:183\n135#1:195\n78#1:196\n*E\n"})
public final class PredictiveBackHandlerKt {

    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    @DebugMetadata(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 f414p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f415q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, boolean z10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f414p0 = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
            this.f415q0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f414p0, this.f415q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            setEnabled(this.f415q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    @SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,172:1\n62#2,5:173\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n*L\n140#1:173,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f416p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f417q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 f418r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) {
            super(1);
            this.f416p0 = onBackPressedDispatcher;
            this.f417q0 = lifecycleOwner;
            this.f418r0 = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f416p0;
            LifecycleOwner lifecycleOwner = this.f417q0;
            final PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = this.f418r0;
            onBackPressedDispatcher.addCallback(lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
            return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    remove();
                }
            };
        }
    }

    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f419p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Flow<BackEventCompat>, Continuation<Unit>, Object> f420q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f421r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f422s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, Function2<Flow<BackEventCompat>, ? super Continuation<Unit>, ? extends Object> function2, int i10, int i11) {
            super(2);
            this.f419p0 = z10;
            this.f420q0 = function2;
            this.f421r0 = i10;
            this.f422s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f421r0 | 1;
            PredictiveBackHandlerKt.PredictiveBackHandler(this.f419p0, this.f420q0, composer, i10, this.f422s0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void PredictiveBackHandler(final boolean z10, @NotNull Function2<Flow<BackEventCompat>, ? super Continuation<Unit>, ? extends Object> function2, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(-723524056);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OnBackPressedCallback(z10) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                @Nullable
                public b onBackInstance;

                @Nullable
                public final b getOnBackInstance() {
                    return this.onBackInstance;
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackCancelled() {
                    super.handleOnBackCancelled();
                    b bVar = this.onBackInstance;
                    if (bVar != null) {
                        bVar.a();
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackPressed() {
                    b bVar = this.onBackInstance;
                    if (bVar != null && !bVar.f78716a) {
                        bVar.a();
                        this.onBackInstance = null;
                    }
                    if (this.onBackInstance == null) {
                        this.onBackInstance = new b(coroutineScope, false, PredictiveBackHandlerKt.access$PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                    }
                    b bVar2 = this.onBackInstance;
                    if (bVar2 != null) {
                        SendChannel.DefaultImpls.close$default(bVar2.f78717b, null, 1, null);
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackProgressed(@NotNull BackEventCompat backEvent) {
                    super.handleOnBackProgressed(backEvent);
                    b bVar = this.onBackInstance;
                    if (bVar != null) {
                        ChannelResult.m5963boximpl(bVar.f78717b.mo5953trySendJP2dKIU(backEvent));
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackStarted(@NotNull BackEventCompat backEvent) {
                    super.handleOnBackStarted(backEvent);
                    b bVar = this.onBackInstance;
                    if (bVar != null) {
                        bVar.a();
                    }
                    this.onBackInstance = new b(coroutineScope, true, PredictiveBackHandlerKt.access$PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                }

                public final void setOnBackInstance(@Nullable b bVar) {
                    this.onBackInstance = bVar;
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) objRememberedValue2;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new a(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z10, null), composerStartRestartGroup, (i10 & 14) | 64);
        OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, new b(onBackPressedDispatcher, lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1), composerStartRestartGroup, 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, function2, i10, i11));
    }

    public static final Function2 access$PredictiveBackHandler$lambda$0(State state) {
        return (Function2) state.getValue();
    }
}
