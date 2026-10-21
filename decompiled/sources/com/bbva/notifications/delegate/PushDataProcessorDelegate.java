package com.bbva.notifications.delegate;

import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushDataProcessorDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00052*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0005H&JT\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00052*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H&¨\u0006\t"}, d2 = {"Lcom/bbva/notifications/delegate/PushDataProcessorDelegate;", "", "getPushIntentExtra", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "notificationMap", "transformToPayloadData", "hashMap", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PushDataProcessorDelegate {
    @Nullable
    HashMap<String, String> getPushIntentExtra(@Nullable HashMap<String, Object> notificationMap);

    @NotNull
    HashMap<String, Object> transformToPayloadData(@Nullable HashMap<String, String> hashMap);
}
