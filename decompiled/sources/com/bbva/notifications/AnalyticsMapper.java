package com.bbva.notifications;

import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnalyticsMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/bbva/notifications/AnalyticsMapper;", "", "map", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "type", "Lcom/bbva/notifications/NotificationType;", "data", "", "category", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsMapper {
    @NotNull
    AnalyticsEvent map(@NotNull NotificationType type, @Nullable String data);

    @Nullable
    AnalyticsEvent map(@NotNull String category);
}
