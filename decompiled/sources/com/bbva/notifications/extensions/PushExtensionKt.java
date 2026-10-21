package com.bbva.notifications.extensions;

import android.util.Base64;
import bk.d;
import bk.p;
import bk.q;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.constants.ActionId;
import com.bbva.notifications.constants.NotificationAction;
import com.bbva.notifications.constants.NotificationType;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.model.MainNodeNotificationKt;
import com.bbva.notifications.model.NotificationDataLocal;
import com.bbva.notifications.model.NotificationNoCommercialDataKt;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000\u001a\u0018\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t*\u00020\u0000\"\"\u0010\r\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/push/model/Push;", "", "isEventManagerPush", "isLogged", "", "convertFromEventManagerPush", "isReactiveWithoutDetail", "", "findAction", "", "toLocalArgs", "a", "Z", "isLoggedValue", "()Z", "setLoggedValue", "(Z)V", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPushExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushExtension.kt\ncom/bbva/notifications/extensions/PushExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1#2:129\n526#3:130\n511#3,6:131\n1864#4,3:137\n*S KotlinDebug\n*F\n+ 1 PushExtension.kt\ncom/bbva/notifications/extensions/PushExtensionKt\n*L\n61#1:130\n61#1:131,6\n117#1:137,3\n*E\n"})
public final class PushExtensionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35361a;

    public static final void convertFromEventManagerPush(@NotNull Push push, boolean z10) {
        LinkedHashMap linkedHashMap;
        List listPlus;
        Map<? extends String, ? extends String> mapPlus;
        Map mutableMap;
        Intrinsics.checkNotNullParameter(push, "<this>");
        f35361a = z10;
        NotificationDataLocal data = MainNodeNotificationKt.toMainNodeNotification(push.getData()).getData();
        Map<String, String> mapCreateParams$default = null;
        NotificationOptions notificationOptionsCopyWith = data != null ? NotificationOptionsExtensionKt.copyWith(push.getNotification(), data, isReactiveWithoutDetail(push)) : null;
        if (notificationOptionsCopyWith != null) {
            push.setNotification(notificationOptionsCopyWith);
        }
        NotificationDataLocal data2 = MainNodeNotificationKt.toMainNodeNotification(push.getData()).getData();
        if (data2 != null) {
            Map<String, String> mutableMap2 = q.toMutableMap(NotificationDataLocalExtensionKt.createData(data2));
            Map<? extends String, ? extends String> mutableMap3 = q.toMutableMap(push.getData());
            mutableMap3.remove("message");
            Object obj = MapExtensionKt.toMainNodeMap(push.getData()).get("data");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null || (mutableMap = q.toMutableMap(map)) == null) {
                linkedHashMap = null;
            } else {
                mutableMap.remove("title");
                mutableMap.remove("message");
                mutableMap.remove(PushConstants.GE_VARIABLES);
                mutableMap.remove(PushConstants.GE_TYPE_NOTIFICATION);
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mutableMap.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (!(linkedHashMap instanceof Map)) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null && (mapPlus = q.plus(linkedHashMap, mutableMap3)) != null) {
                mutableMap3 = mapPlus;
            }
            mutableMap2.putAll(mutableMap3);
            String strFindAction = findAction(push);
            if (strFindAction != null) {
                mutableMap2.put(PushConstants.CLICK_ACTION, strFindAction);
            }
            if (Intrinsics.areEqual(strFindAction == null ? "" : strFindAction, PushConstants.MENU_VISUAL) && !f35361a) {
                mutableMap2.put(DeepLinkConstants.INSTANCE.getDEEPLINK_NOTIFICATION(), strFindAction != null ? strFindAction : "");
            }
            if (strFindAction == null || (listPlus = CollectionsKt___CollectionsKt.plus((Collection) d.listOf(strFindAction), (Iterable) NotificationDataLocalExtensionKt.getActionsList(data2))) == null) {
                listPlus = CollectionsKt___CollectionsKt.plus((Collection) NotificationDataLocalExtensionKt.getActions(data2), (Iterable) NotificationDataLocalExtensionKt.getActionsList(data2));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (listPlus != null) {
                int i10 = 0;
                for (Object obj2 : listPlus) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair = TuplesKt.to("action" + i11, (String) obj2);
                    linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                    i10 = i11;
                }
            }
            mutableMap2.putAll(linkedHashMap2);
            Object obj3 = MapExtensionKt.toMainNodeMap(push.getData()).get("data");
            Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
            Object obj4 = map2 != null ? map2.get(PushConstants.GE_VARIABLES) : null;
            Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
            mapCreateParams$default = map3 != null ? MapExtensionKt.createParams$default(map3, PushConstants.GE_VARIABLES, null, 2, null) : null;
            if (mapCreateParams$default != null) {
                mutableMap2.putAll(mapCreateParams$default);
            }
            mapCreateParams$default = mutableMap2;
        }
        if (mapCreateParams$default != null) {
            push.setData(mapCreateParams$default);
        }
    }

    @Nullable
    public static final String findAction(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "<this>");
        String eventId = push.getData().get(ActionId.DEEPLINK.getValue());
        if (eventId == null && (eventId = push.getData().get(ActionId.EVENT_ID.getValue())) == null) {
            NotificationDataLocal data = MainNodeNotificationKt.toMainNodeNotification(push.getData()).getData();
            if (data != null) {
                String deeplink = data.getDeeplink();
                eventId = deeplink == null ? data.getEventId() : deeplink;
            } else {
                eventId = null;
            }
        }
        return eventId == null ? MapExtensionKt.findAction(MapExtensionKt.toMainNodeMap(push.getData())) : eventId;
    }

    public static final boolean isEventManagerPush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "<this>");
        String str = push.getData().get("message");
        return !(str == null || l.isBlank(str));
    }

    public static final boolean isLoggedValue() {
        return f35361a;
    }

    public static final boolean isReactiveWithoutDetail(@NotNull Push push) {
        NotificationAction notificationActionFromValue;
        Intrinsics.checkNotNullParameter(push, "<this>");
        if (push.getData().get(ActionId.DEEPLINK.getValue()) != null) {
            return true;
        }
        if (Intrinsics.areEqual(findAction(push), PushConstants.MENU_VISUAL) && f35361a) {
            return true;
        }
        NotificationDataLocal data = MainNodeNotificationKt.toMainNodeNotification(push.getData()).getData();
        if (data != null && (NotificationDataLocalExtensionKt.getHaveDeepLink(data) || NotificationDataLocalExtensionKt.isConversationNotificationType(data))) {
            return true;
        }
        String strFindAction = findAction(push);
        return strFindAction != null && (((notificationActionFromValue = NotificationAction.INSTANCE.fromValue(strFindAction)) != null && notificationActionFromValue.getIsDeeplink()) || Intrinsics.areEqual(strFindAction, NotificationType.CONVERSATION.getValue()));
    }

    public static final void setLoggedValue(boolean z10) {
        f35361a = z10;
    }

    @Nullable
    public static final Map<String, String> toLocalArgs(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "<this>");
        byte[] bytes = NotificationNoCommercialDataKt.toJsonString(new HashMap(push.getData())).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        if (strEncodeToString != null) {
            return p.mapOf(TuplesKt.to(SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, strEncodeToString));
        }
        return null;
    }
}
