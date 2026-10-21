package com.bbva.glomohybrid.infoscreen.optionlist;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionListActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$collectEvents$1", f = "OptionListActivity.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OptionListActivity f32402q0;

    /* JADX INFO: renamed from: com.bbva.glomohybrid.infoscreen.optionlist.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class C0137a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OptionListActivity f32403p0;

        public C0137a(OptionListActivity optionListActivity) {
            this.f32403p0 = optionListActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            OptionListContract.Event event = (OptionListContract.Event) obj;
            boolean z10 = event instanceof OptionListContract.Event.OpenDialer;
            OptionListActivity optionListActivity = this.f32403p0;
            if (z10) {
                OptionListActivity.access$openDialer(optionListActivity, ((OptionListContract.Event.OpenDialer) event).getPhone());
            } else if (event instanceof OptionListContract.Event.NavigateToAffiliatePage) {
                OptionListActivity.access$navigateToAffiliate(optionListActivity, ((OptionListContract.Event.NavigateToAffiliatePage) event).getOptionData());
            } else if (event instanceof OptionListContract.Event.Finish) {
                optionListActivity.finish();
            } else if (event instanceof OptionListContract.Event.NavigateTo) {
                OptionListActivity.access$navigateToRoute(optionListActivity, ((OptionListContract.Event.NavigateTo) event).getOptionData());
            } else {
                boolean z11 = event instanceof OptionListContract.Event.Starting;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OptionListActivity optionListActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f32402q0 = optionListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f32402q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32401p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OptionListActivity optionListActivity = this.f32402q0;
            Flow<OptionListContract.Event> events = optionListActivity.getViewModel$info_modal_mexicoRelease().getEvents();
            C0137a c0137a = new C0137a(optionListActivity);
            this.f32401p0 = 1;
            if (events.collect(c0137a, this) == coroutine_suspended) {
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
