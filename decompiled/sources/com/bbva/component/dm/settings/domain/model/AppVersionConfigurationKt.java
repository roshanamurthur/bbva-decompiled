package com.bbva.component.dm.settings.domain.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¨\u0006\b"}, d2 = {"", "", "", "Lcom/bbva/component/dm/settings/domain/model/Data;", "Lcom/bbva/component/dm/settings/domain/model/AppVersionsDataModel;", "asAppVersionsDataModel", "Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "asVersionDataModel", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAppVersionConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppVersionConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/AppVersionConfigurationKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n12#2:82\n12#2:84\n12#2:85\n12#2:86\n12#2:100\n12#2:101\n12#2:102\n12#2:103\n12#2:104\n12#2:105\n19#2:106\n19#2:107\n19#2:108\n19#2:109\n1#3:83\n1#3:97\n1603#4,9:87\n1855#4:96\n1856#4:98\n1612#4:99\n*S KotlinDebug\n*F\n+ 1 AppVersionConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/AppVersionConfigurationKt\n*L\n11#1:82\n28#1:84\n29#1:85\n30#1:86\n33#1:100\n34#1:101\n35#1:102\n48#1:103\n51#1:104\n65#1:105\n66#1:106\n67#1:107\n77#1:108\n78#1:109\n32#1:97\n32#1:87,9\n32#1:96\n32#1:98\n32#1:99\n*E\n"})
public final class AppVersionConfigurationKt {
    public static final InAppUpdateConfiguration a(Map<String, ? extends Object> map) {
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
        Object obj2 = map.get(TypedValues.CycleType.S_WAVE_PERIOD);
        if (!(obj2 instanceof Number)) {
            obj2 = null;
        }
        Number number = (Number) obj2;
        int iIntValue = number != null ? number.intValue() : 0;
        Object obj3 = map.get("limit");
        Number number2 = (Number) (obj3 instanceof Number ? obj3 : null);
        return new InAppUpdateConfiguration(zBooleanValue, iIntValue, number2 != null ? number2.intValue() : Integer.MAX_VALUE);
    }

    @NotNull
    public static final AppVersionsDataModel asAppVersionsDataModel(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("Android");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        return new AppVersionsDataModel(mapEmptyMap != null ? asVersionDataModel(mapEmptyMap) : null);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    @NotNull
    public static final VersionDataModel asVersionDataModel(@NotNull Map<String, ? extends Object> map) {
        ArrayList arrayList;
        InAppUpdates inAppUpdates;
        SdkVersion sdkVersion;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Double dValueOf = Double.valueOf(0.0d);
        Object obj = map.get("minVersion");
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 == null) {
            d2 = dValueOf;
        }
        Integer numValueOf = Integer.valueOf((int) d2.doubleValue());
        Object obj2 = map.get("adviceVersion");
        if (!(obj2 instanceof Double)) {
            obj2 = null;
        }
        Double d3 = (Double) obj2;
        if (d3 != null) {
            dValueOf = d3;
        }
        Integer numValueOf2 = Integer.valueOf((int) dValueOf.doubleValue());
        List<Map> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj3 = map.get("bySDK");
        if (!(obj3 instanceof List)) {
            obj3 = null;
        }
        List list = (List) obj3;
        if (list != null) {
            listEmptyList = list;
        }
        if (!(!listEmptyList.isEmpty())) {
            listEmptyList = null;
        }
        if (listEmptyList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : listEmptyList) {
                Object obj4 = map2.get(EmulatorApi.SDK);
                if (!(obj4 instanceof Number)) {
                    obj4 = null;
                }
                Number number = (Number) obj4;
                if (number != null) {
                    int iIntValue = number.intValue();
                    Object obj5 = map2.get("minVersion");
                    if (!(obj5 instanceof Number)) {
                        obj5 = null;
                    }
                    Number number2 = (Number) obj5;
                    if (number2 != null) {
                        sdkVersion = new SdkVersion(iIntValue, number2.intValue());
                    } else {
                        sdkVersion = null;
                    }
                } else {
                    sdkVersion = null;
                }
                if (sdkVersion != null) {
                    arrayList2.add(sdkVersion);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Object obj6 = map.get("packageId");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str = (String) obj6;
        String str2 = str == null ? null : str;
        Object obj7 = map.get("appStoreUrl");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str3 = (String) obj7;
        String str4 = str3 == null ? null : str3;
        Map mapEmptyMap = q.emptyMap();
        Object obj8 = map.get("inAppUpdates");
        if (!(obj8 instanceof Map)) {
            obj8 = null;
        }
        Map map3 = (Map) obj8;
        if (map3 != null) {
            mapEmptyMap = map3;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            Map mapEmptyMap2 = q.emptyMap();
            Object obj9 = mapEmptyMap.get("immediate");
            if (!(obj9 instanceof Map)) {
                obj9 = null;
            }
            Map map4 = (Map) obj9;
            if (map4 != null) {
                mapEmptyMap2 = map4;
            }
            if (!(!mapEmptyMap2.isEmpty())) {
                mapEmptyMap2 = null;
            }
            InAppUpdateConfiguration inAppUpdateConfigurationA = mapEmptyMap2 != null ? a(mapEmptyMap2) : null;
            Map mapEmptyMap3 = q.emptyMap();
            Object obj10 = mapEmptyMap.get("flexible");
            if (!(obj10 instanceof Map)) {
                obj10 = null;
            }
            Map map5 = (Map) obj10;
            if (map5 != null) {
                mapEmptyMap3 = map5;
            }
            if (!(!mapEmptyMap3.isEmpty())) {
                mapEmptyMap3 = null;
            }
            inAppUpdates = new InAppUpdates(inAppUpdateConfigurationA, mapEmptyMap3 != null ? a(mapEmptyMap3) : null);
        } else {
            inAppUpdates = null;
        }
        return new VersionDataModel(numValueOf, numValueOf2, arrayList, str2, str4, inAppUpdates);
    }
}
