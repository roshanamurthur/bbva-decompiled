package com.bbva.notifications.activity;

import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.activity.NotificationNoCommercialActivity$setupObservers$1", f = "NotificationNoCommercialActivity.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35334p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f35335q0;

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NotificationNoCommercialActivity f35336p0;

        public a(NotificationNoCommercialActivity notificationNoCommercialActivity) {
            this.f35336p0 = notificationNoCommercialActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            NotificationNoCommercialContract.State state = (NotificationNoCommercialContract.State) obj;
            boolean z10 = state instanceof NotificationNoCommercialContract.State.Loading;
            NotificationNoCommercialActivity notificationNoCommercialActivity = this.f35336p0;
            if (z10) {
                NotificationNoCommercialActivity.access$setIsLoading(notificationNoCommercialActivity, true);
            } else if (!(state instanceof NotificationNoCommercialContract.State.Ready)) {
                if (state instanceof NotificationNoCommercialContract.State.Error) {
                    NotificationNoCommercialActivity.access$showNotificationErrorFragment(notificationNoCommercialActivity);
                } else if (state instanceof NotificationNoCommercialContract.State.TimerExpired) {
                    NotificationNoCommercialActivity.access$setIsLoading(notificationNoCommercialActivity, false);
                    NotificationNoCommercialActivity.access$showTimerExpiredErrorScreen(notificationNoCommercialActivity, InfoScreenType.TimerExpiredForegroundStateErrorInfoScreen.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationNoCommercialActivity notificationNoCommercialActivity, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f35335q0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e(this.f35335q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35334p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            NotificationNoCommercialActivity notificationNoCommercialActivity = this.f35335q0;
            StateFlow<NotificationNoCommercialContract.State> state = notificationNoCommercialActivity.m().getState();
            a aVar = new a(notificationNoCommercialActivity);
            this.f35334p0 = 1;
            if (state.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
