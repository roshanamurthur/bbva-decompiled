package com.bbva.notifications.model;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventDialer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/notifications/model/EventDialer;", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/base/router/Route;", "phone", "", "(Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventDialer extends Event<Route> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventDialer(@NotNull String phone) {
        super(new Route(phone, null, null, 6, null));
        Intrinsics.checkNotNullParameter(phone, "phone");
    }
}
