package com.bbva.notifications.delegate;

import bk.q;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.extensions.StringExtensionsKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuVisualPushDataProcessorDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00062*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\u0006H\u0016JT\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b`\u00062*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/delegate/MenuVisualPushDataProcessorDelegate;", "Lcom/bbva/notifications/delegate/PushDataProcessorDelegate;", "()V", "getPushIntentExtra", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "notificationMap", "", "transformToPayloadData", "hashMap", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MenuVisualPushDataProcessorDelegate implements PushDataProcessorDelegate {
    @Override // com.bbva.notifications.delegate.PushDataProcessorDelegate
    @Nullable
    public HashMap<String, String> getPushIntentExtra(@Nullable HashMap<String, Object> notificationMap) {
        Object obj;
        String string;
        if (notificationMap == null || (obj = notificationMap.get("message")) == null || (string = obj.toString()) == null) {
            return null;
        }
        if (!StringExtensionsKt.isTargetEvent(string, PushConstants.MENU_VISUAL)) {
            string = null;
        }
        if (string != null) {
            return com.bbva.glomohybrid.base.extensions.StringExtensionsKt.jsonStringToHashMap(string);
        }
        return null;
    }

    @Override // com.bbva.notifications.delegate.PushDataProcessorDelegate
    @NotNull
    public HashMap<String, Object> transformToPayloadData(@Nullable HashMap<String, String> hashMap) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        String str;
        if (hashMap == null || (str = hashMap.get("data")) == null || (map = MappableEngineKt.toMap(str)) == null) {
            map = new HashMap();
        }
        Object obj = map.get(PushConstants.GE_VARIABLES);
        if (obj == null || (map2 = MappableEngineKt.toMap(obj)) == null) {
            map2 = new HashMap();
        }
        Object obj2 = map2.get(PushConstants.GE_TYPE_NOTIFICATION);
        if (obj2 == null || (map3 = MappableEngineKt.toMap(obj2)) == null) {
            map3 = new HashMap();
        }
        Object obj3 = map3.get("subType");
        if (obj3 == null || (map4 = MappableEngineKt.toMap(obj3)) == null) {
            map4 = new HashMap();
        }
        Object obj4 = map2.get("message");
        if (obj4 == null || (map5 = MappableEngineKt.toMap(obj4)) == null) {
            map5 = new HashMap();
        }
        Pair[] pairArr = new Pair[17];
        Object obj5 = map2.get("sendDate");
        pairArr[0] = TuplesKt.to("date", obj5 instanceof String ? (String) obj5 : null);
        Object obj6 = map2.get("badge");
        pairArr[1] = TuplesKt.to("variables_badge", obj6 != null ? obj6.toString() : null);
        Object obj7 = map5.get(PushConstants.GE_MESSAGE_BODY);
        pairArr[2] = TuplesKt.to(PushConstants.GE_MESSAGE_BODY, obj7 instanceof String ? (String) obj7 : null);
        Object obj8 = map2.get("sound");
        pairArr[3] = TuplesKt.to("variables_sound", obj8 instanceof String ? (String) obj8 : null);
        Object obj9 = map.get("title");
        pairArr[4] = TuplesKt.to(PushConstants.NOTIFICATION_TYPE, obj9 instanceof String ? (String) obj9 : null);
        Object obj10 = map5.get(PushConstants.GE_MESSAGE_BODY);
        pairArr[5] = TuplesKt.to("body", obj10 instanceof String ? (String) obj10 : null);
        Object obj11 = map2.get("eventId");
        pairArr[6] = TuplesKt.to(PushConstants.CLICK_ACTION, obj11 instanceof String ? (String) obj11 : null);
        Object obj12 = map.get("title");
        pairArr[7] = TuplesKt.to("variables_message_title", obj12 instanceof String ? (String) obj12 : null);
        Object obj13 = map2.get("eventId");
        pairArr[8] = TuplesKt.to("shortcut", obj13 instanceof String ? (String) obj13 : null);
        Object obj14 = map2.get("eventId");
        pairArr[9] = TuplesKt.to("variables_eventId", obj14 instanceof String ? (String) obj14 : null);
        Object obj15 = map4.get("id");
        pairArr[10] = TuplesKt.to("variables_typeNotification_subType_id", obj15 instanceof String ? (String) obj15 : null);
        Object obj16 = map3.get("id");
        pairArr[11] = TuplesKt.to("variables_typeNotification_id", obj16 instanceof String ? (String) obj16 : null);
        pairArr[12] = TuplesKt.to("variables_id", "");
        Object obj17 = map2.get("eventId");
        pairArr[13] = TuplesKt.to("action1", obj17 instanceof String ? (String) obj17 : null);
        Object obj18 = map4.get("id");
        pairArr[14] = TuplesKt.to(PushConstants.DETAIL_NOTIFICATION_TYPE, obj18 instanceof String ? (String) obj18 : null);
        Object obj19 = map2.get("sendDate");
        pairArr[15] = TuplesKt.to("variables_sendDate", obj19 instanceof String ? (String) obj19 : null);
        Object obj20 = map5.get(PushConstants.GE_MESSAGE_BODY);
        pairArr[16] = TuplesKt.to("variables_message_messageBody", obj20 instanceof String ? (String) obj20 : null);
        return q.hashMapOf(pairArr);
    }
}
