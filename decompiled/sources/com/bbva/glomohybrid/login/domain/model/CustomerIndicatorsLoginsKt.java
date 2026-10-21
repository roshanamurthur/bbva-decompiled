package com.bbva.glomohybrid.login.domain.model;

import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomohybrid.login.data.model.Classification;
import com.bbva.glomohybrid.login.data.model.IdentityDocument;
import com.bbva.glomohybrid.login.data.model.Indicators;
import com.bbva.glomohybrid.login.data.model.NameIdEntity;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerIndicatorsLogins.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "identityDocument", "", "document", "", "formatIdentityDocument", "", "", "customer", "Lcom/bbva/glomohybrid/login/data/model/Indicators;", "indicator", "Lcom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLogins;", "", "hasBusinessClassificationCustomer", "serviceVersion", "getCustomerIdBy", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerIndicatorsLogins.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIndicatorsLogins.kt\ncom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLoginsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1#2:94\n12#3:95\n12#3:100\n12#3:101\n12#3:102\n1549#4:96\n1620#4,3:97\n*S KotlinDebug\n*F\n+ 1 CustomerIndicatorsLogins.kt\ncom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLoginsKt\n*L\n54#1:95\n63#1:100\n64#1:101\n65#1:102\n55#1:96\n55#1:97,3\n*E\n"})
public final class CustomerIndicatorsLoginsKt {
    @Nullable
    public static final List<IdentityDocument> formatIdentityDocument(@Nullable IdentityDocument identityDocument, @Nullable String str) {
        IdentityDocument identityDocument2 = new IdentityDocument(new NameIdEntity("rfc"), str);
        ArrayList arrayList = new ArrayList();
        if (identityDocument != null) {
            arrayList.add(identityDocument);
        }
        arrayList.add(identityDocument2);
        return arrayList;
    }

    @Nullable
    public static final String getCustomerIdBy(@NotNull String serviceVersion) {
        Intrinsics.checkNotNullParameter(serviceVersion, "serviceVersion");
        if (Intrinsics.areEqual(serviceVersion, "v0")) {
            return CustomerIdInterceptor.FAKE_CUSTOMER_ID;
        }
        if (Intrinsics.areEqual(serviceVersion, ConfigConstantsKt.CUSTOMERS_API_VERSION)) {
            return "id";
        }
        return null;
    }

    public static final boolean hasBusinessClassificationCustomer(@NotNull CustomerIndicatorsLogins customerIndicatorsLogins) {
        NameIdEntity subSector;
        Intrinsics.checkNotNullParameter(customerIndicatorsLogins, "<this>");
        List<Classification> classifications = customerIndicatorsLogins.getClassifications();
        String id = null;
        Classification classification = classifications != null ? classifications.get(0) : null;
        if (classification == null) {
            return false;
        }
        Sector sector = classification.getSector();
        if (sector != null && (subSector = sector.getSubSector()) != null) {
            id = subSector.getId();
        }
        return Intrinsics.areEqual(id, LoginHelperConstants.CLASSIFICATION_ID);
    }

    @NotNull
    public static final List<Indicators> indicator(@NotNull Map<String, ? extends Object> customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = customer.get("indicators");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List<Map> list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Map map : list2) {
            Object obj2 = map.get("id");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            if (str == null) {
                str = "";
            }
            Object obj3 = map.get("description");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            String str3 = str2 != null ? str2 : "";
            Boolean bool = Boolean.FALSE;
            Object obj4 = map.get("isActive");
            if (!(obj4 instanceof Boolean)) {
                obj4 = null;
            }
            Boolean bool2 = (Boolean) obj4;
            if (bool2 != null) {
                bool = bool2;
            }
            arrayList.add(new Indicators(str, str3, bool));
        }
        return arrayList;
    }
}
