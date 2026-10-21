package com.bbva.glomohybrid.featureflags.domain.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FeatureFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"gl-feature-flags_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlags.kt\ncom/bbva/glomohybrid/featureflags/domain/model/FeatureFlagsKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n12#2:163\n12#2:164\n12#2:169\n12#2:170\n12#2:171\n12#2:172\n12#2:173\n12#2:174\n12#2:175\n12#2:176\n12#2:177\n1549#3:165\n1620#3,3:166\n*S KotlinDebug\n*F\n+ 1 FeatureFlags.kt\ncom/bbva/glomohybrid/featureflags/domain/model/FeatureFlagsKt\n*L\n114#1:163\n115#1:164\n123#1:169\n124#1:170\n125#1:171\n126#1:172\n146#1:173\n147#1:174\n148#1:175\n149#1:176\n150#1:177\n115#1:165\n115#1:166,3\n*E\n"})
public final class FeatureFlagsKt {
    public static final AkamaiDataModel access$asAkamaiDataModel(Map map) {
        Object obj = map.get("url");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        String str2 = str == null ? "" : str;
        Object obj2 = map.get("method");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        String str4 = str3 == null ? "" : str3;
        Object obj3 = map.get("users");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str5 = (String) obj3;
        String str6 = str5 == null ? "" : str5;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj4 = map.get("android");
        if (!(obj4 instanceof List)) {
            obj4 = null;
        }
        List list = (List) obj4;
        List list2 = list == null ? listEmptyList : list;
        Boolean bool = Boolean.FALSE;
        Object obj5 = map.get("isActive");
        Boolean bool2 = (Boolean) (obj5 instanceof Boolean ? obj5 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return new AkamaiDataModel(str2, str4, str6, list2, bool.booleanValue());
    }

    public static final MenuDataModel access$asMenuDataModel(Map map) {
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("android");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Object obj2 = map.get(FirebaseAnalytics.Param.ITEMS);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null) {
            listEmptyList2 = list2;
        }
        List<Map> list3 = listEmptyList2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (Map map2 : list3) {
            Object obj3 = map2.get("id");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str = (String) obj3;
            if (str == null) {
                str = "";
            }
            List listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
            Object obj4 = map2.get("isEnabled");
            if (!(obj4 instanceof List)) {
                obj4 = null;
            }
            List list4 = (List) obj4;
            if (list4 != null) {
                listEmptyList3 = list4;
            }
            List listEmptyList4 = CollectionsKt__CollectionsKt.emptyList();
            Object obj5 = map2.get("isFeatured");
            if (!(obj5 instanceof List)) {
                obj5 = null;
            }
            List list5 = (List) obj5;
            if (list5 != null) {
                listEmptyList4 = list5;
            }
            List listEmptyList5 = CollectionsKt__CollectionsKt.emptyList();
            Object obj6 = map2.get("isHidden");
            if (!(obj6 instanceof List)) {
                obj6 = null;
            }
            List list6 = (List) obj6;
            if (list6 != null) {
                listEmptyList5 = list6;
            }
            arrayList.add(new MenuItemDataModel(str, listEmptyList3, listEmptyList4, listEmptyList5));
        }
        return new MenuDataModel(listEmptyList, arrayList);
    }
}
