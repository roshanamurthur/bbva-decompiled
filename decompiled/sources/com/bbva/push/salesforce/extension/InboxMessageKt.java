package com.bbva.push.salesforce.extension;

import bk.q;
import com.bbva.push.model.Message;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import com.bbva.push.salesforce.SalesforcePushHandler;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InboxMessage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage;", "Lcom/bbva/push/model/Message;", "toMessage", "salesforce-push_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInboxMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboxMessage.kt\ncom/bbva/push/salesforce/extension/InboxMessageKt\n+ 2 NotificationModel.kt\ncom/bbva/push/model/NotificationOptions$Companion\n*L\n1#1,51:1\n62#2:52\n*S KotlinDebug\n*F\n+ 1 InboxMessage.kt\ncom/bbva/push/salesforce/extension/InboxMessageKt\n*L\n19#1:52\n*E\n"})
public final class InboxMessageKt {
    @NotNull
    public static final Message toMessage(@NotNull InboxMessage inboxMessage) {
        Intrinsics.checkNotNullParameter(inboxMessage, "<this>");
        NotificationOptions.Companion companion = NotificationOptions.INSTANCE;
        NotificationOptions.Builder builder = new NotificationOptions.Builder();
        builder.setTitle(inboxMessage.title());
        builder.setContent(inboxMessage.subject());
        NotificationOptions notificationOptionsBuild = builder.build();
        String strId = inboxMessage.id();
        boolean z10 = inboxMessage.read();
        Pair[] pairArr = new Pair[11];
        pairArr[0] = TuplesKt.to("id", inboxMessage.id());
        pairArr[1] = TuplesKt.to("startDateUtc", DateKt.timeToString(inboxMessage.startDateUtc()));
        pairArr[2] = TuplesKt.to("endDateUtc", DateKt.timeToString(inboxMessage.endDateUtc()));
        pairArr[3] = TuplesKt.to("sendDateUtc", DateKt.timeToString(inboxMessage.sendDateUtc()));
        String strAlert = inboxMessage.alert();
        if (strAlert == null) {
            strAlert = "";
        }
        pairArr[4] = TuplesKt.to("alert", strAlert);
        String strSubject = inboxMessage.subject();
        if (strSubject == null) {
            strSubject = "";
        }
        pairArr[5] = TuplesKt.to("subject", strSubject);
        String strTitle = inboxMessage.title();
        if (strTitle == null) {
            strTitle = "";
        }
        pairArr[6] = TuplesKt.to("title", strTitle);
        String strSound = inboxMessage.sound();
        pairArr[7] = TuplesKt.to("sound", strSound != null ? strSound : "");
        pairArr[8] = TuplesKt.to("url", inboxMessage.url());
        pairArr[9] = TuplesKt.to("deleted", String.valueOf(BooleanKt.toInt(Boolean.valueOf(inboxMessage.deleted()))));
        pairArr[10] = TuplesKt.to("read", String.valueOf(BooleanKt.toInt(Boolean.valueOf(inboxMessage.read()))));
        Map mapMapOf = q.mapOf(pairArr);
        Map<String, String> mapCustomKeys = inboxMessage.customKeys();
        if (mapCustomKeys == null) {
            mapCustomKeys = q.emptyMap();
        }
        return new Message(strId, z10, false, new Push(SalesforcePushHandler.ID, notificationOptionsBuild, q.plus(mapMapOf, mapCustomKeys)));
    }
}
