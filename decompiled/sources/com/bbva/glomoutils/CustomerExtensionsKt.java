package com.bbva.glomoutils;

import com.bbva.component.dm.customer.domain.model.Classification;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.Indicator;
import com.bbva.component.dm.customer.domain.model.Segment;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\n\u001a\u0004\u0018\u00010\t*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Customer;", "", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, "", "", "", "Lcom/bbva/component/dm/customer/domain/model/Indicator;", "toIndicator", "hasBusinessClassification", "Lcom/bbva/component/dm/customer/domain/model/Classification;", "toClassification", "Lcom/bbva/component/dm/customer/domain/model/Segment;", "toSegment", "gl-utils_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/glomoutils/CustomerExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1603#2,9:72\n1855#2:81\n1856#2:83\n1612#2:84\n1603#2,9:86\n1855#2:95\n1856#2:97\n1612#2:98\n1747#2,3:99\n1603#2,9:102\n1855#2:111\n1856#2:113\n1612#2:114\n1#3:82\n1#3:85\n1#3:96\n1#3:112\n*S KotlinDebug\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/glomoutils/CustomerExtensionsKt\n*L\n25#1:72,9\n25#1:81\n25#1:83\n25#1:84\n46#1:86,9\n46#1:95\n46#1:97\n46#1:98\n47#1:99,3\n56#1:102,9\n56#1:111\n56#1:113\n56#1:114\n25#1:82\n46#1:96\n56#1:112\n*E\n"})
public final class CustomerExtensionsKt {
    public static final boolean hasBusinessClassification(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Object obj = customer.getMap().get("classifications");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Classification classification = toClassification((Map) it.next());
            if (classification != null) {
                arrayList.add(classification);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((Classification) it2.next()).getClassificationId(), "F33")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isBusinessUser(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Object obj = customer.getMap().get("indicators");
        Object obj2 = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Indicator indicator = toIndicator((Map) it.next());
                if (indicator != null) {
                    arrayList.add(indicator);
                }
            }
            for (Object obj3 : arrayList) {
                Indicator indicator2 = (Indicator) obj3;
                if (Intrinsics.areEqual(indicator2.getId(), "PNN") || Intrinsics.areEqual(indicator2.getId(), "HAS_GLOBAL_BUSINESSES_PLATFORM_USER")) {
                    obj2 = obj3;
                    break;
                }
            }
            Indicator indicator3 = (Indicator) obj2;
            if (indicator3 != null) {
                return indicator3.isActive();
            }
        }
        return false;
    }

    @Nullable
    public static final Classification toClassification(@Nullable Map<String, ? extends Object> map) {
        List listEmptyList;
        if (map == null) {
            return null;
        }
        Object obj = map.get("classificationId");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("name");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        Object obj3 = map.get("segments");
        List list = obj3 instanceof List ? (List) obj3 : null;
        if (list != null) {
            listEmptyList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Segment segment = toSegment((Map) it.next());
                if (segment != null) {
                    listEmptyList.add(segment);
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str != null) {
            return new Classification(str, str2, listEmptyList);
        }
        return null;
    }

    @Nullable
    public static final Indicator toIndicator(@Nullable Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get("indicatorId");
        if (!map.containsKey("indicatorId")) {
            obj = null;
        }
        if (obj == null) {
            obj = map.get("id");
        }
        Object obj2 = map.get("name");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            Object obj3 = map.get("description");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            str = str2 == null ? "" : str2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = map.get("isActive");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        return new Indicator((String) obj, str, ((Boolean) obj4).booleanValue());
    }

    @Nullable
    public static final Segment toSegment(@Nullable Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get("id");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return new Segment(str);
        }
        return null;
    }
}
