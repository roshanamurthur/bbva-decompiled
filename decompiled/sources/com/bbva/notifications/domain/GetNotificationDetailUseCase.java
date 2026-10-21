package com.bbva.notifications.domain;

import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import com.bbva.notifications.model.NotificationBaseData;
import com.bbva.notifications.model.NotificationNoCommercialData;
import com.bbva.notifications.model.NotificationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetNotificationDetailUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/notifications/domain/GetNotificationDetailUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "params", "execute", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/notifications/domain/NotificationsDataSource;", "notificationsDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/notifications/domain/NotificationsDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class GetNotificationDetailUseCase implements SuspendUseCaseWithParams<String, NotificationNoCommercialData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NotificationsDataSource f35352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f35353b;

    /* JADX INFO: compiled from: GetNotificationDetailUseCase.kt */
    @DebugMetadata(c = "com.bbva.notifications.domain.GetNotificationDetailUseCase$execute$2", f = "GetNotificationDetailUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NotificationNoCommercialData>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f35355q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35355q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetNotificationDetailUseCase.this.new a(this.f35355q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NotificationNoCommercialData> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            NotificationBaseData data;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            NotificationResponse notificationDetail = GetNotificationDetailUseCase.this.f35352a.getNotificationDetail(this.f35355q0);
            if (notificationDetail == null || (data = notificationDetail.getData()) == null) {
                return null;
            }
            return data.getData();
        }
    }

    public GetNotificationDetailUseCase(@NotNull NotificationsDataSource notificationsDataSource, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(notificationsDataSource, "notificationsDataSource");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f35352a = notificationsDataSource;
        this.f35353b = dispatchers;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull String str, @NotNull Continuation<? super NotificationNoCommercialData> continuation) {
        return BuildersKt.withContext(this.f35353b.io(), new a(str, null), continuation);
    }

    public /* synthetic */ GetNotificationDetailUseCase(NotificationsDataSource notificationsDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationsDataSource, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
