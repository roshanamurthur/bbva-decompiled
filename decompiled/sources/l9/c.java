package l9;

import com.bbva.component.ui.message.card.MessageCardViewModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder$collectBlockerMessageEvents$1", f = "LandingHeaderViewHolder.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83126p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderViewHolder f83127q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83128r0;

    /* JADX INFO: compiled from: LandingHeaderViewHolder.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingHeaderViewHolder f83129p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83130q0;

        /* JADX WARN: Multi-variable type inference failed */
        public a(LandingHeaderViewHolder landingHeaderViewHolder, Function1<? super LandingContract.Intent, Unit> function1) {
            this.f83129p0 = landingHeaderViewHolder;
            this.f83130q0 = function1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LandingHeaderViewHolder.access$handleBlockerMessageEvents(this.f83129p0, (MessageCardViewModel.Event) obj, this.f83130q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(LandingHeaderViewHolder landingHeaderViewHolder, Function1<? super LandingContract.Intent, Unit> function1, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f83127q0 = landingHeaderViewHolder;
        this.f83128r0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f83127q0, this.f83128r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83126p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingHeaderViewHolder landingHeaderViewHolder = this.f83127q0;
            Flow<MessageCardViewModel.Event> onEvents = landingHeaderViewHolder.f33028p0.blockerMessage.getViewModel().getOnEvents();
            a aVar = new a(landingHeaderViewHolder, this.f83128r0);
            this.f83126p0 = 1;
            if (onEvents.collect(aVar, this) == coroutine_suspended) {
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
