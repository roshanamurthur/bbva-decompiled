package com.bbva.push.salesforce.extension;

import com.bbva.push.PushManager;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.salesforce.SalesforcePushHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"salesforceInbox", "Lcom/bbva/push/inbox/Inbox;", "Lcom/bbva/push/PushManager;", "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PushManagerKt {
    @NotNull
    public static final Inbox salesforceInbox(@NotNull PushManager pushManager) {
        Intrinsics.checkNotNullParameter(pushManager, "<this>");
        return pushManager.inbox(SalesforcePushHandler.ID);
    }
}
