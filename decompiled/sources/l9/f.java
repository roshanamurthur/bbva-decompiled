package l9;

import com.bbva.component.ui.message.card.MessageCardView;
import com.bbva.component.ui.message.card.MessageCardViewModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.extensions.MessageCardViewEventsExtensionsKt;
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

/* JADX INFO: compiled from: LandingMessageCardViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingMessageCardViewHolder$collectEvents$1", f = "LandingMessageCardViewHolder.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83139p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MessageCardView f83140q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83141r0;

    /* JADX INFO: compiled from: LandingMessageCardViewHolder.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83142p0;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super LandingContract.Intent, Unit> function1) {
            this.f83142p0 = function1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            MessageCardViewModel.Event event = (MessageCardViewModel.Event) obj;
            if (!MessageCardViewEventsExtensionsKt.isInteractionEvent(event)) {
                return Unit.INSTANCE;
            }
            String viewId = event.getViewId();
            if (viewId == null) {
                return Unit.INSTANCE;
            }
            this.f83142p0.invoke(new LandingContract.Intent.SectionItemTap(viewId, event.getButtonId()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(MessageCardView messageCardView, Function1<? super LandingContract.Intent, Unit> function1, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f83140q0 = messageCardView;
        this.f83141r0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f83140q0, this.f83141r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83139p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<MessageCardViewModel.Event> onEvents = this.f83140q0.getViewModel().getOnEvents();
            a aVar = new a(this.f83141r0);
            this.f83139p0 = 1;
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
