package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class i implements j, k, AnalyticsManager, g, f, m, n, l {
    public void a(long j10) {
    }

    public abstract void a(boolean z10);

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean areAnalyticsEnabled() {
        return true;
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean arePiAnalyticsEnabled() {
        return true;
    }

    public void b(long j10) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    @Nullable
    public String getPiIdentifier() {
        return null;
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public final void trackPageView(@NonNull String str) {
        trackPageView(str, null, null, null);
    }

    @Override // com.salesforce.marketingcloud.analytics.n
    public void a(@NonNull e eVar, @NonNull Event... eventArr) {
    }

    public void b(@NonNull Region region) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public final void trackPageView(@NonNull String str, @Nullable String str2) {
        trackPageView(str, str2, null, null);
    }

    @Override // com.salesforce.marketingcloud.analytics.l
    public void a(@NonNull l.a aVar, @NonNull JSONObject jSONObject) {
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void b(@NonNull InAppMessage inAppMessage) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public final void trackPageView(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        trackPageView(str, str2, str3, null);
    }

    public void a(@NonNull Region region) {
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage) {
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void b(@NonNull JSONObject jSONObject) {
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.messages.iam.j jVar) {
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject) {
    }

    public void a(@NonNull InboxMessage inboxMessage) {
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage, boolean z10) {
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull JSONObject jSONObject) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disableAnalytics() {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disablePiAnalytics() {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enableAnalytics() {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enablePiAnalytics() {
    }

    public void c(long j10) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void setPiIdentifier(@Nullable String str) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartContents(@NonNull PiCart piCart) {
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartConversion(@NonNull PiOrder piOrder) {
    }

    public void trackInboxOpenEvent(@NonNull InboxMessage inboxMessage) {
    }
}
