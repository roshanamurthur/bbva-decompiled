package com.bbva.plugin.push.command.response;

import com.bbva.plugin.push.utils.MapConverter;
import com.bbva.push.model.Message;
import com.bbva.push.model.MessageBulk;
import com.bbva.push.model.Push;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetMessagesResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000¨\u0006\t"}, d2 = {"toWebMessageResponse", "Lcom/bbva/plugin/push/command/response/WebMessageResponse;", "Lcom/bbva/push/model/Message;", "toWebMessagesResponse", "Lcom/bbva/plugin/push/command/response/WebMessagesResponse;", "Lcom/bbva/push/model/MessageBulk;", "toWebPushResponse", "Lcom/bbva/plugin/push/command/response/WebPushResponse;", "Lcom/bbva/push/model/Push;", "push-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetMessagesResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetMessagesResponse.kt\ncom/bbva/plugin/push/command/response/GetMessagesResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n*S KotlinDebug\n*F\n+ 1 GetMessagesResponse.kt\ncom/bbva/plugin/push/command/response/GetMessagesResponseKt\n*L\n31#1:37\n31#1:38,3\n*E\n"})
public final class GetMessagesResponseKt {
    @NotNull
    public static final WebMessageResponse toWebMessageResponse(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "<this>");
        return new WebMessageResponse(message.getId(), message.getRead(), message.getFavorite(), toWebPushResponse(message.getPush()));
    }

    @NotNull
    public static final WebMessagesResponse toWebMessagesResponse(@NotNull MessageBulk messageBulk) {
        Intrinsics.checkNotNullParameter(messageBulk, "<this>");
        List<Message> messages = messageBulk.getMessages();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(toWebMessageResponse((Message) it.next()));
        }
        return new WebMessagesResponse(arrayList);
    }

    @NotNull
    public static final WebPushResponse toWebPushResponse(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "<this>");
        return new WebPushResponse(push.getOrigin(), push.getNotification(), MapConverter.INSTANCE.convert2(push.getData()));
    }
}
