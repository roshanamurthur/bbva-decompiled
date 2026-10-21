package com.bbva.notifications.domain;

import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.model.NotificationResponse;
import com.google.gson.Gson;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationsDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/notifications/domain/NotificationsDataSource;", "", "", "notificationId", "Lcom/bbva/notifications/model/NotificationResponse;", "getNotificationDetail", "Lcom/bbva/network/NetworkWorker;", "networkWorker", com.salesforce.marketingcloud.config.a.f64109t, "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/bbva/network/NetworkWorker;Ljava/lang/String;Lcom/google/gson/Gson;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsDataSource.kt\ncom/bbva/notifications/domain/NotificationsDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public final class NotificationsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f35356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f35357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gson f35358c;

    /* JADX INFO: compiled from: NotificationsDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f35360q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f35360q0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setMethod(Method.GET);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(NotificationsDataSource.this.f35357b, Arrays.copyOf(new Object[]{this.f35360q0}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            request.setUrl(str);
            return Unit.INSTANCE;
        }
    }

    public NotificationsDataSource(@NotNull NetworkWorker networkWorker, @NotNull String endpoint, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f35356a = networkWorker;
        this.f35357b = endpoint;
        this.f35358c = gson;
    }

    @Nullable
    public final NotificationResponse getNotificationDetail(@NotNull String notificationId) {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        NetworkResponse networkResponse;
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        NetworkRequest networkRequestRequest = MutableNetworkRequestKt.request(new a(notificationId));
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f35356a.execute(networkRequestRequest));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                Gson gson = this.f35358c;
                String strString = ((NetworkResponse) objM5535constructorimpl).getBody().string();
                if (strString == null) {
                    strString = "";
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl((NotificationResponse) gson.fromJson(strString, NotificationResponse.class));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null && (thM5538exceptionOrNullimpl instanceof ConnectionException) && ((networkResponse = ((ConnectionException) thM5538exceptionOrNullimpl).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String()) == null || networkResponse.getCode() != 304)) {
            LoggerKt.logCritical$default(NotificationNoCommercialActivity.ID, thM5538exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = null;
        }
        return (NotificationResponse) objM5535constructorimpl2;
    }

    public /* synthetic */ NotificationsDataSource(NetworkWorker networkWorker, String str, Gson gson, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkWorker, str, (i10 & 4) != 0 ? new Gson() : gson);
    }
}
