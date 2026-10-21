package e9;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardEvents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScratchcardActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity$observeEvents$1", f = "ScratchcardActivity.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68286p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ScratchcardActivity f68287q0;

    /* JADX INFO: renamed from: e9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScratchcardActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity$observeEvents$1$1", f = "ScratchcardActivity.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0282a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ScratchcardActivity f68289q0;

        /* JADX INFO: renamed from: e9.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScratchcardActivity.kt */
        public static final class C0283a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ScratchcardActivity f68290p0;

            public C0283a(ScratchcardActivity scratchcardActivity) {
                this.f68290p0 = scratchcardActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ScratchcardEvents scratchcardEvents = (ScratchcardEvents) obj;
                boolean z10 = scratchcardEvents instanceof ScratchcardEvents.OnContinueTapped;
                ScratchcardActivity scratchcardActivity = this.f68290p0;
                if (z10) {
                    ((MessageDispatcher) scratchcardActivity.f32464t0.getValue()).sendMessage(ScratchcardActivity.CHANNEL_RESULT_ID, ScratchcardActivity.SCRATCHCARD_RESULT_CONFIRMED);
                    scratchcardActivity.finish();
                } else if (scratchcardEvents instanceof ScratchcardEvents.OnCloseTapped) {
                    ((MessageDispatcher) scratchcardActivity.f32464t0.getValue()).sendMessage(ScratchcardActivity.CHANNEL_RESULT_ID, ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                    scratchcardActivity.finish();
                } else if (scratchcardEvents instanceof ScratchcardEvents.OnRevealedTapped) {
                    ((MessageDispatcher) scratchcardActivity.f32464t0.getValue()).sendMessage(ScratchcardActivity.CHANNEL_RESULT_ID, ScratchcardActivity.SCRATCHCARD_RESULT_SCRATCHED);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0282a(ScratchcardActivity scratchcardActivity, Continuation<? super C0282a> continuation) {
            super(2, continuation);
            this.f68289q0 = scratchcardActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0282a(this.f68289q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0282a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68288p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ScratchcardActivity scratchcardActivity = this.f68289q0;
                Flow<ScratchcardEvents> onTapEvents = ScratchcardActivity.access$getViewModel(scratchcardActivity).getOnTapEvents();
                C0283a c0283a = new C0283a(scratchcardActivity);
                this.f68288p0 = 1;
                if (onTapEvents.collect(c0283a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScratchcardActivity scratchcardActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68287q0 = scratchcardActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68287q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68286p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ScratchcardActivity scratchcardActivity = this.f68287q0;
            Lifecycle lifecycle = scratchcardActivity.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C0282a c0282a = new C0282a(scratchcardActivity, null);
            this.f68286p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c0282a, this) == coroutine_suspended) {
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
