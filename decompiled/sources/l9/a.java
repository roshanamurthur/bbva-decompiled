package l9;

import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingECommerceCardsViewHolder;
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

/* JADX INFO: compiled from: LandingECommerceCardsViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingECommerceCardsViewHolder$collectEvents$1", f = "LandingECommerceCardsViewHolder.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83116p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingECommerceCardsViewHolder f83117q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83118r0;

    /* JADX INFO: renamed from: l9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LandingECommerceCardsViewHolder.kt */
    public static final class C0459a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingECommerceCardsViewHolder f83119p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<LandingContract.Intent, Unit> f83120q0;

        /* JADX WARN: Multi-variable type inference failed */
        public C0459a(LandingECommerceCardsViewHolder landingECommerceCardsViewHolder, Function1<? super LandingContract.Intent, Unit> function1) {
            this.f83119p0 = landingECommerceCardsViewHolder;
            this.f83120q0 = function1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LandingECommerceCardsViewHolder.access$handleECommerceEvent(this.f83119p0, (CarouselCardsContract.Event) obj, this.f83120q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(LandingECommerceCardsViewHolder landingECommerceCardsViewHolder, Function1<? super LandingContract.Intent, Unit> function1, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83117q0 = landingECommerceCardsViewHolder;
        this.f83118r0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f83117q0, this.f83118r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83116p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingECommerceCardsViewHolder landingECommerceCardsViewHolder = this.f83117q0;
            Flow<CarouselCardsContract.Event> events = landingECommerceCardsViewHolder.f33025p0.ecommerceCards.getViewModel().getEvents();
            C0459a c0459a = new C0459a(landingECommerceCardsViewHolder, this.f83118r0);
            this.f83116p0 = 1;
            if (events.collect(c0459a, this) == coroutine_suspended) {
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
