package com.bbva.notifications.extensions;

import bk.q;
import com.bbva.notifications.constants.ActionId;
import com.bbva.notifications.constants.NotificationType;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MapExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u001a$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\b"}, d2 = {"createParams", "", "", "", "prefix", "separator", "findAction", "toMainNodeMap", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapExtension.kt\ncom/bbva/notifications/extensions/MapExtensionKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n215#2:56\n216#2:61\n215#2,2:62\n11065#3:57\n11400#3,3:58\n*S KotlinDebug\n*F\n+ 1 MapExtension.kt\ncom/bbva/notifications/extensions/MapExtensionKt\n*L\n19#1:56\n19#1:61\n42#1:62,2\n20#1:57\n20#1:58,3\n*E\n"})
public final class MapExtensionKt {
    @NotNull
    public static final Map<String, String> createParams(@NotNull Map<String, ? extends Object> map, @NotNull String prefix, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(separator, "separator");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String str = prefix + separator + ((Object) entry.getKey());
            if (entry.getValue() instanceof Map) {
                Object value = entry.getValue();
                Map map2 = value instanceof Map ? (Map) value : null;
                if (map2 != null) {
                    linkedHashMap.putAll(createParams$default(map2, str, null, 2, null));
                }
            } else {
                linkedHashMap.put(str, String.valueOf(entry.getValue()));
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map createParams$default(Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = PushConstants.GE_PARAMS_SEPARATOR;
        }
        return createParams(map, str, str2);
    }

    @Nullable
    public static final String findAction(@NotNull Map<String, ? extends Object> map) {
        String strFindAction;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator<Map.Entry<String, ? extends Object>> it = map.entrySet().iterator();
        do {
            strFindAction = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends Object> next = it.next();
            String[] values = ActionId.INSTANCE.getValues();
            ArrayList arrayList = new ArrayList(values.length);
            for (String str : values) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                arrayList.add(lowerCase);
            }
            String lowerCase2 = next.getKey().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (arrayList.contains(lowerCase2)) {
                Object value = next.getValue();
                if (value instanceof String) {
                    return (String) value;
                }
                return null;
            }
            if (Intrinsics.areEqual(next.getKey(), PushConstants.GE_TYPE_NOTIFICATION)) {
                Object value2 = next.getValue();
                NotificationType notificationType = NotificationType.CONVERSATION;
                if (Intrinsics.areEqual(value2, notificationType.getValue())) {
                    return notificationType.getValue();
                }
            }
            Object value3 = next.getValue();
            Map map2 = value3 instanceof Map ? (Map) value3 : null;
            if (map2 != null) {
                strFindAction = findAction(map2);
            }
        } while (strFindAction == null);
        return strFindAction;
    }

    @NotNull
    public static final Map<String, Object> toMainNodeMap(@NotNull Map<String, String> map) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Gson gson = new Gson();
            String str = map.get("message");
            if (str == null) {
                str = "{}";
            }
            Object objFromJson = gson.fromJson(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.bbva.notifications.extensions.MapExtensionKt$toMainNodeMap$1$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            objM5535constructorimpl = Result.m5535constructorimpl((Map) objFromJson);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Map mapEmptyMap = q.emptyMap();
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = mapEmptyMap;
        }
        return (Map) objM5535constructorimpl;
    }
}
