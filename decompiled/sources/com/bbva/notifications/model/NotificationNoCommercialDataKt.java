package com.bbva.notifications.model;

import bk.q;
import com.bbva.push.model.Push;
import com.google.gson.Gson;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: NotificationNoCommercialData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003*\u00020\u0004\u001a*\u0010\u0005\u001a\u00020\u0002*\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003\u001a,\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003¨\u0006\b"}, d2 = {"toHashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lcom/bbva/push/model/Push;", "toJsonString", "toNotificationNoCommercialData", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationNoCommercialData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationNoCommercialData.kt\ncom/bbva/notifications/model/NotificationNoCommercialDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class NotificationNoCommercialDataKt {
    @NotNull
    public static final HashMap<String, String> toHashMap(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "<this>");
        return new HashMap<>(q.toMap(q.toMutableMap(push.getData())));
    }

    @NotNull
    public static final String toJsonString(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String string = new JSONObject(q.toMap(map)).toString();
        if (!(!Intrinsics.areEqual(string, "{}"))) {
            string = null;
        }
        return string == null ? "" : string;
    }

    @Nullable
    public static final NotificationNoCommercialData toNotificationNoCommercialData(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (NotificationNoCommercialData) new Gson().fromJson(toJsonString(map), NotificationNoCommercialData.class);
    }
}
