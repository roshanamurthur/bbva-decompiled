package com.bbva.glomohybrid.mobilepayment.lib.model;

import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.notifications.model.LocalNotificationData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentNotificationContent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/PaymentNotificationContent;", "", "Lcom/bbva/notifications/model/LocalNotificationData;", "a", "Lcom/bbva/notifications/model/LocalNotificationData;", "getData", "()Lcom/bbva/notifications/model/LocalNotificationData;", "data", "Lkotlin/Pair;", "", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "b", "Lkotlin/Pair;", "getDeeplinkInfo", "()Lkotlin/Pair;", "deeplinkInfo", "c", "Ljava/lang/String;", "getInfoPayment", "()Ljava/lang/String;", "infoPayment", "<init>", "(Lcom/bbva/notifications/model/LocalNotificationData;Lkotlin/Pair;Ljava/lang/String;)V", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PaymentNotificationContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LocalNotificationData data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<String, DeepLinkModel> deeplinkInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String infoPayment;

    public PaymentNotificationContent(@NotNull LocalNotificationData data, @Nullable Pair<String, DeepLinkModel> pair, @Nullable String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.deeplinkInfo = pair;
        this.infoPayment = str;
    }

    @NotNull
    public final LocalNotificationData getData() {
        return this.data;
    }

    @Nullable
    public final Pair<String, DeepLinkModel> getDeeplinkInfo() {
        return this.deeplinkInfo;
    }

    @Nullable
    public final String getInfoPayment() {
        return this.infoPayment;
    }

    public /* synthetic */ PaymentNotificationContent(LocalNotificationData localNotificationData, Pair pair, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(localNotificationData, (i10 & 2) != 0 ? null : pair, str);
    }
}
