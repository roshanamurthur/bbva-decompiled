package com.bbva.push.salesforce.tracker;

import a8.a;
import com.bbva.push.tracker.Tracker;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SalesforceInboxTracker.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/push/salesforce/tracker/SalesforceInboxTracker;", "Lcom/bbva/push/tracker/Tracker;", "", "notificationId", "action", "", "", "data", "", "track", "<init>", "()V", "salesforce-push_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSalesforceInboxTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforceInboxTracker.kt\ncom/bbva/push/salesforce/tracker/SalesforceInboxTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n288#2,2:50\n*S KotlinDebug\n*F\n+ 1 SalesforceInboxTracker.kt\ncom/bbva/push/salesforce/tracker/SalesforceInboxTracker\n*L\n40#1:50,2\n*E\n"})
public class SalesforceInboxTracker implements Tracker {
    @Override // com.bbva.push.tracker.Tracker
    public void track(@NotNull String notificationId, @NotNull String action, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(data, "data");
        if (TrackerAction.INSTANCE.from(action) != TrackerAction.ACTION_OPEN) {
            throw new NotImplementedError("No action implemented");
        }
        SFMCSdk.INSTANCE.requestSdk(new a(notificationId));
    }
}
