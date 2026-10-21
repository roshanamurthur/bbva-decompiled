package com.bbva.component.dm.settings.domain.model;

import bk.q;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppStatusConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\b*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¨\u0006\n"}, d2 = {"", "", "", "Lcom/bbva/component/dm/settings/domain/model/Data;", "Lcom/bbva/component/dm/settings/domain/model/AppStatus;", "asAppStatusDataModel", "Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;", "asAndroidAppStatusDataModel", "Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "asScheduledShutdown", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAppStatusConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStatusConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/AppStatusConfigurationKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n12#2:63\n12#2:65\n12#2:66\n12#2:80\n19#2:81\n19#2:82\n19#2:83\n12#2:84\n12#2:85\n12#2:86\n1#3:64\n1#3:77\n1603#4,9:67\n1855#4:76\n1856#4:78\n1612#4:79\n*S KotlinDebug\n*F\n+ 1 AppStatusConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/AppStatusConfigurationKt\n*L\n11#1:63\n25#1:65\n26#1:66\n29#1:80\n42#1:81\n43#1:82\n44#1:83\n56#1:84\n57#1:85\n58#1:86\n28#1:77\n28#1:67,9\n28#1:76\n28#1:78\n28#1:79\n*E\n"})
public final class AppStatusConfigurationKt {
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    @NotNull
    public static final AndroidAppStatus asAndroidAppStatusDataModel(@NotNull Map<String, ? extends Object> map) {
        ArrayList arrayList;
        SdkStatus sdkStatus;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Boolean bool = Boolean.TRUE;
        Object obj = map.get("available");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            bool = bool2;
        }
        boolean zBooleanValue = bool.booleanValue();
        List<Map> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj2 = map.get("bySDK");
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null) {
            listEmptyList = list;
        }
        if (!(!listEmptyList.isEmpty())) {
            listEmptyList = null;
        }
        if (listEmptyList != null) {
            arrayList = new ArrayList();
            for (Map map2 : listEmptyList) {
                Object obj3 = map2.get(EmulatorApi.SDK);
                if (!(obj3 instanceof Number)) {
                    obj3 = null;
                }
                Number number = (Number) obj3;
                if (number != null) {
                    int iIntValue = number.intValue();
                    Object obj4 = map2.get("available");
                    if (!(obj4 instanceof Boolean)) {
                        obj4 = null;
                    }
                    Boolean bool3 = (Boolean) obj4;
                    if (bool3 != null) {
                        boolean zBooleanValue2 = bool3.booleanValue();
                        Object obj5 = map2.get("message");
                        if (!(obj5 instanceof Map)) {
                            obj5 = null;
                        }
                        Map map3 = (Map) obj5;
                        sdkStatus = new SdkStatus(iIntValue, zBooleanValue2, map3 != null ? VisualMessageConfigurationKt.asVisualMessageConfiguration(map3) : null);
                    } else {
                        sdkStatus = null;
                    }
                } else {
                    sdkStatus = null;
                }
                if (sdkStatus != null) {
                    arrayList.add(sdkStatus);
                }
            }
        } else {
            arrayList = null;
        }
        Map mapEmptyMap = q.emptyMap();
        Object obj6 = map.get("scheduledShutdown");
        if (!(obj6 instanceof Map)) {
            obj6 = null;
        }
        Map map4 = (Map) obj6;
        if (map4 != null) {
            mapEmptyMap = map4;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        return new AndroidAppStatus(zBooleanValue, arrayList, mapEmptyMap != null ? asScheduledShutdown(mapEmptyMap) : null);
    }

    @NotNull
    public static final AppStatus asAppStatusDataModel(@Nullable Map<String, ? extends Object> map) {
        AndroidAppStatus androidAppStatusAsAndroidAppStatusDataModel = null;
        if (map != null) {
            Map mapEmptyMap = q.emptyMap();
            Object obj = map.get("android");
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map2 = (Map) obj;
            if (map2 != null) {
                mapEmptyMap = map2;
            }
            if (mapEmptyMap != null) {
                if (!(!mapEmptyMap.isEmpty())) {
                    mapEmptyMap = null;
                }
                if (mapEmptyMap != null) {
                    androidAppStatusAsAndroidAppStatusDataModel = asAndroidAppStatusDataModel(mapEmptyMap);
                }
            }
        }
        return new AppStatus(androidAppStatusAsAndroidAppStatusDataModel);
    }

    @Nullable
    public static final ScheduledShutdown asScheduledShutdown(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(EventDataKeys.Lifecycle.LIFECYCLE_START);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = null;
        }
        Object obj2 = map.get("end");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            str2 = null;
        }
        Object obj3 = map.get("message");
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map2 = (Map) obj3;
        if (map2 == null) {
            map2 = null;
        }
        return new ScheduledShutdown(str, str2, map2 != null ? VisualMessageConfigurationKt.asVisualMessageConfiguration(map2) : null);
    }
}
