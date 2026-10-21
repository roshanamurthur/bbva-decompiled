package com.bbva.glomohybrid.login.domain.extensions;

import bk.q;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.glomohybrid.login.data.model.Bank;
import com.bbva.glomohybrid.login.data.model.BirthData;
import com.bbva.glomohybrid.login.data.model.Classification;
import com.bbva.glomohybrid.login.data.model.IdentityDocument;
import com.bbva.glomohybrid.login.data.model.NameIdEntity;
import com.bbva.glomohybrid.login.data.model.PersonType;
import com.bbva.glomohybrid.login.domain.model.Sector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomerExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "taxpayerIdentificationProMap", "", "Lcom/bbva/glomohybrid/login/data/model/Classification;", "classificationProMap", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "segmentsListProMap", "Lcom/bbva/glomohybrid/login/data/model/Bank;", "bankProMap", "Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "identityDocumentProMap", "Lcom/bbva/glomohybrid/login/data/model/PersonType;", "personTypeProMap", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/glomohybrid/login/domain/extensions/CustomerExtensionsKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n12#2:157\n12#2:158\n12#2:159\n12#2:164\n12#2:165\n12#2:166\n12#2:167\n12#2:168\n12#2:173\n12#2:174\n12#2:175\n12#2:176\n12#2:177\n12#2:178\n12#2:179\n12#2:180\n12#2:181\n12#2:182\n12#2:183\n12#2:184\n12#2:185\n12#2:186\n12#2:187\n12#2:188\n12#2:189\n12#2:190\n12#2:191\n12#2:192\n12#2:193\n12#2:194\n12#2:195\n1549#3:160\n1620#3,3:161\n1549#3:169\n1620#3,3:170\n*S KotlinDebug\n*F\n+ 1 CustomerExtensions.kt\ncom/bbva/glomohybrid/login/domain/extensions/CustomerExtensionsKt\n*L\n15#1:157\n20#1:158\n25#1:159\n33#1:164\n41#1:165\n42#1:166\n48#1:167\n55#1:168\n63#1:173\n65#1:174\n66#1:175\n72#1:176\n78#1:177\n85#1:178\n87#1:179\n93#1:180\n100#1:181\n106#1:182\n108#1:183\n114#1:184\n120#1:185\n121#1:186\n122#1:187\n123#1:188\n124#1:189\n131#1:190\n133#1:191\n139#1:192\n145#1:193\n147#1:194\n153#1:195\n25#1:160\n25#1:161,3\n55#1:169\n55#1:170,3\n*E\n"})
public final class CustomerExtensionsKt {
    public static final NameIdEntity a(Map<String, ? extends Object> map) {
        Object obj = map.get("id");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        return new NameIdEntity(str);
    }

    @NotNull
    public static final Bank bankProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("bank");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Object obj2 = mapEmptyMap.get("id");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            str = "";
        }
        Map<String, Object> map3 = customer.getMap();
        Map mapEmptyMap2 = q.emptyMap();
        Object obj3 = map3.get("bank");
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map4 = (Map) obj3;
        if (map4 != null) {
            mapEmptyMap2 = map4;
        }
        Map mapEmptyMap3 = q.emptyMap();
        Object obj4 = mapEmptyMap2.get("branch");
        Map map5 = (Map) (obj4 instanceof Map ? obj4 : null);
        if (map5 != null) {
            mapEmptyMap3 = map5;
        }
        return new Bank(str, a(mapEmptyMap3));
    }

    @NotNull
    public static final List<Classification> classificationProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("classifications");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Object obj2 = ((Map) it.next()).get("id");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            if (str == null) {
                str = "";
            }
            List<NameIdEntity> listSegmentsListProMap = segmentsListProMap(customer);
            Map<String, Object> map2 = customer.getMap();
            List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            Object obj3 = map2.get("classifications");
            if (!(obj3 instanceof List)) {
                obj3 = null;
            }
            List list3 = (List) obj3;
            if (list3 != null) {
                listEmptyList2 = list3;
            }
            Map map3 = (Map) listEmptyList2.get(0);
            Map mapEmptyMap = q.emptyMap();
            Object obj4 = map3.get("sector");
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            Map map4 = (Map) obj4;
            if (map4 != null) {
                mapEmptyMap = map4;
            }
            Object obj5 = mapEmptyMap.get("id");
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            String str2 = (String) obj5;
            String str3 = str2 != null ? str2 : "";
            Map<String, Object> map5 = customer.getMap();
            List listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
            Object obj6 = map5.get("classifications");
            if (!(obj6 instanceof List)) {
                obj6 = null;
            }
            List list4 = (List) obj6;
            if (list4 != null) {
                listEmptyList3 = list4;
            }
            Map map6 = (Map) listEmptyList3.get(0);
            Map mapEmptyMap2 = q.emptyMap();
            Object obj7 = map6.get("sector");
            if (!(obj7 instanceof Map)) {
                obj7 = null;
            }
            Map map7 = (Map) obj7;
            if (map7 != null) {
                mapEmptyMap2 = map7;
            }
            Map mapEmptyMap3 = q.emptyMap();
            Object obj8 = mapEmptyMap2.get("subSector");
            if (!(obj8 instanceof Map)) {
                obj8 = null;
            }
            Map map8 = (Map) obj8;
            if (map8 != null) {
                mapEmptyMap3 = map8;
            }
            arrayList.add(new Classification(str, listSegmentsListProMap, new Sector(str3, a(mapEmptyMap3))));
        }
        return arrayList;
    }

    @NotNull
    public static final IdentityDocument identityDocumentProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("identityDocument");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map<String, Object> map3 = customer.getMap();
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = map3.get("identityDocument");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map4 = (Map) obj2;
        if (map4 != null) {
            mapEmptyMap2 = map4;
        }
        Map mapEmptyMap3 = q.emptyMap();
        Object obj3 = mapEmptyMap2.get("documentType");
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map5 = (Map) obj3;
        if (map5 != null) {
            mapEmptyMap3 = map5;
        }
        NameIdEntity nameIdEntityA = a(mapEmptyMap3);
        Object obj4 = mapEmptyMap.get("documentNumber");
        String str = (String) (obj4 instanceof String ? obj4 : null);
        if (str == null) {
            str = "";
        }
        return new IdentityDocument(nameIdEntityA, str);
    }

    @NotNull
    public static final PersonType personTypeProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get(CustomerLoginsParser.PERSON_TYPE);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Object obj2 = mapEmptyMap.get("id");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        String str2 = str == null ? "" : str;
        Object obj3 = mapEmptyMap.get(CustomerLoginsParser.FIRST_NAME);
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        String str4 = str3 == null ? "" : str3;
        Object obj4 = mapEmptyMap.get(CustomerLoginsParser.LAST_NAME);
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        String str5 = (String) obj4;
        String str6 = str5 == null ? "" : str5;
        Object obj5 = mapEmptyMap.get(CustomerLoginsParser.SECOND_LAST_NAME);
        if (!(obj5 instanceof String)) {
            obj5 = null;
        }
        String str7 = (String) obj5;
        String str8 = str7 == null ? "" : str7;
        Map<String, Object> map3 = customer.getMap();
        Map mapEmptyMap2 = q.emptyMap();
        Object obj6 = map3.get(CustomerLoginsParser.PERSON_TYPE);
        if (!(obj6 instanceof Map)) {
            obj6 = null;
        }
        Map map4 = (Map) obj6;
        if (map4 != null) {
            mapEmptyMap2 = map4;
        }
        Map mapEmptyMap3 = q.emptyMap();
        Object obj7 = mapEmptyMap2.get("birthData");
        if (!(obj7 instanceof Map)) {
            obj7 = null;
        }
        Map map5 = (Map) obj7;
        if (map5 != null) {
            mapEmptyMap3 = map5;
        }
        Object obj8 = mapEmptyMap3.get("birthDate");
        if (!(obj8 instanceof String)) {
            obj8 = null;
        }
        String str9 = (String) obj8;
        BirthData birthData = new BirthData(str9 != null ? str9 : "");
        Object obj9 = mapEmptyMap.get("birthData");
        if (!(obj9 instanceof BirthData)) {
            obj9 = null;
        }
        BirthData birthData2 = (BirthData) obj9;
        if (birthData2 != null) {
            birthData = birthData2;
        }
        Map<String, Object> map6 = customer.getMap();
        Map mapEmptyMap4 = q.emptyMap();
        Object obj10 = map6.get(CustomerLoginsParser.PERSON_TYPE);
        if (!(obj10 instanceof Map)) {
            obj10 = null;
        }
        Map map7 = (Map) obj10;
        if (map7 != null) {
            mapEmptyMap4 = map7;
        }
        Map mapEmptyMap5 = q.emptyMap();
        Object obj11 = mapEmptyMap4.get("gender");
        Map map8 = (Map) (obj11 instanceof Map ? obj11 : null);
        if (map8 != null) {
            mapEmptyMap5 = map8;
        }
        return new PersonType(str2, str4, str6, str8, birthData, a(mapEmptyMap5));
    }

    @NotNull
    public static final List<NameIdEntity> segmentsListProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("segments");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Map) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final String taxpayerIdentificationProMap(@NotNull Customer customer) {
        Intrinsics.checkNotNullParameter(customer, "<this>");
        Map<String, Object> map = customer.getMap();
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("taxpayerIdentification");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Object obj2 = mapEmptyMap.get("documentNumber");
        String str = (String) (obj2 instanceof String ? obj2 : null);
        return str == null ? "" : str;
    }
}
