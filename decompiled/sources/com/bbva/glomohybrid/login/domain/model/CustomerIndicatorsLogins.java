package com.bbva.glomohybrid.login.domain.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.collection.k;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.dm.customer.domain.model.IndicatorsDataLogins;
import com.bbva.component.dm.customer.domain.model.Nationalities;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.data.model.Bank;
import com.bbva.glomohybrid.login.data.model.BirthData;
import com.bbva.glomohybrid.login.data.model.Classification;
import com.bbva.glomohybrid.login.data.model.CustomerLoginsModel;
import com.bbva.glomohybrid.login.data.model.IdentityDocument;
import com.bbva.glomohybrid.login.data.model.Indicators;
import com.bbva.glomohybrid.login.data.model.NameIdEntity;
import com.bbva.glomohybrid.login.data.model.PersonType;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerIndicatorsLogins.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0099\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001cJ\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001HÆ\u0003J¼\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u001aHÖ\u0001J\t\u0010D\u001a\u00020\bHÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$¨\u0006E"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLogins;", "", "customer", "Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;", "customerLogin", "Lcom/bbva/glomohybrid/login/data/model/CustomerLoginsModel;", "(Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;Lcom/bbva/glomohybrid/login/data/model/CustomerLoginsModel;)V", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "", CustomerLoginsParser.FIRST_NAME, CustomerLoginsParser.LAST_NAME, CustomerLoginsParser.SECOND_LAST_NAME, "bank", "Lcom/bbva/glomohybrid/login/data/model/Bank;", "birthData", "Lcom/bbva/glomohybrid/login/data/model/BirthData;", "nationalities", "identityDocument", "", "Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "gender", "classifications", "Lcom/bbva/glomohybrid/login/data/model/Classification;", "indicators", "Lcom/bbva/glomohybrid/login/data/model/Indicators;", "notificationTotal", "", "customerIdGlobal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/login/data/model/Bank;Lcom/bbva/glomohybrid/login/data/model/BirthData;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getBank", "()Lcom/bbva/glomohybrid/login/data/model/Bank;", "getBirthData", "()Lcom/bbva/glomohybrid/login/data/model/BirthData;", "getClassifications", "()Ljava/util/List;", "getCustomerId", "()Ljava/lang/String;", "getCustomerIdGlobal", "getFirstName", "getGender", "()Ljava/lang/Object;", "getIdentityDocument", "getIndicators", "getLastName", "getNationalities", "getNotificationTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSecondLastName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/login/data/model/Bank;Lcom/bbva/glomohybrid/login/data/model/BirthData;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/bbva/glomohybrid/login/domain/model/CustomerIndicatorsLogins;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomerIndicatorsLogins {

    @Nullable
    private final Bank bank;

    @Nullable
    private final BirthData birthData;

    @Nullable
    private final List<Classification> classifications;

    @Nullable
    private final String customerId;

    @Nullable
    private final String customerIdGlobal;

    @Nullable
    private final String firstName;

    @Nullable
    private final Object gender;

    @Nullable
    private final List<IdentityDocument> identityDocument;

    @Nullable
    private final List<Indicators> indicators;

    @Nullable
    private final String lastName;

    @Nullable
    private final Object nationalities;

    @Nullable
    private final Integer notificationTotal;

    @Nullable
    private final String secondLastName;

    public CustomerIndicatorsLogins(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Bank bank, @Nullable BirthData birthData, @Nullable Object obj, @Nullable List<IdentityDocument> list, @Nullable Object obj2, @Nullable List<Classification> list2, @Nullable List<Indicators> list3, @Nullable Integer num, @Nullable String str5) {
        this.customerId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.secondLastName = str4;
        this.bank = bank;
        this.birthData = birthData;
        this.nationalities = obj;
        this.identityDocument = list;
        this.gender = obj2;
        this.classifications = list2;
        this.indicators = list3;
        this.notificationTotal = num;
        this.customerIdGlobal = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final List<Classification> component10() {
        return this.classifications;
    }

    @Nullable
    public final List<Indicators> component11() {
        return this.indicators;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getNotificationTotal() {
        return this.notificationTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCustomerIdGlobal() {
        return this.customerIdGlobal;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondLastName() {
        return this.secondLastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BirthData getBirthData() {
        return this.birthData;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getNationalities() {
        return this.nationalities;
    }

    @Nullable
    public final List<IdentityDocument> component8() {
        return this.identityDocument;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getGender() {
        return this.gender;
    }

    @NotNull
    public final CustomerIndicatorsLogins copy(@Nullable String customerId, @Nullable String firstName, @Nullable String lastName, @Nullable String secondLastName, @Nullable Bank bank, @Nullable BirthData birthData, @Nullable Object nationalities, @Nullable List<IdentityDocument> identityDocument, @Nullable Object gender, @Nullable List<Classification> classifications, @Nullable List<Indicators> indicators, @Nullable Integer notificationTotal, @Nullable String customerIdGlobal) {
        return new CustomerIndicatorsLogins(customerId, firstName, lastName, secondLastName, bank, birthData, nationalities, identityDocument, gender, classifications, indicators, notificationTotal, customerIdGlobal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerIndicatorsLogins)) {
            return false;
        }
        CustomerIndicatorsLogins customerIndicatorsLogins = (CustomerIndicatorsLogins) other;
        return Intrinsics.areEqual(this.customerId, customerIndicatorsLogins.customerId) && Intrinsics.areEqual(this.firstName, customerIndicatorsLogins.firstName) && Intrinsics.areEqual(this.lastName, customerIndicatorsLogins.lastName) && Intrinsics.areEqual(this.secondLastName, customerIndicatorsLogins.secondLastName) && Intrinsics.areEqual(this.bank, customerIndicatorsLogins.bank) && Intrinsics.areEqual(this.birthData, customerIndicatorsLogins.birthData) && Intrinsics.areEqual(this.nationalities, customerIndicatorsLogins.nationalities) && Intrinsics.areEqual(this.identityDocument, customerIndicatorsLogins.identityDocument) && Intrinsics.areEqual(this.gender, customerIndicatorsLogins.gender) && Intrinsics.areEqual(this.classifications, customerIndicatorsLogins.classifications) && Intrinsics.areEqual(this.indicators, customerIndicatorsLogins.indicators) && Intrinsics.areEqual(this.notificationTotal, customerIndicatorsLogins.notificationTotal) && Intrinsics.areEqual(this.customerIdGlobal, customerIndicatorsLogins.customerIdGlobal);
    }

    @Nullable
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    public final BirthData getBirthData() {
        return this.birthData;
    }

    @Nullable
    public final List<Classification> getClassifications() {
        return this.classifications;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getCustomerIdGlobal() {
        return this.customerIdGlobal;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Object getGender() {
        return this.gender;
    }

    @Nullable
    public final List<IdentityDocument> getIdentityDocument() {
        return this.identityDocument;
    }

    @Nullable
    public final List<Indicators> getIndicators() {
        return this.indicators;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Object getNationalities() {
        return this.nationalities;
    }

    @Nullable
    public final Integer getNotificationTotal() {
        return this.notificationTotal;
    }

    @Nullable
    public final String getSecondLastName() {
        return this.secondLastName;
    }

    public int hashCode() {
        String str = this.customerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondLastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Bank bank = this.bank;
        int iHashCode5 = (iHashCode4 + (bank == null ? 0 : bank.hashCode())) * 31;
        BirthData birthData = this.birthData;
        int iHashCode6 = (iHashCode5 + (birthData == null ? 0 : birthData.hashCode())) * 31;
        Object obj = this.nationalities;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<IdentityDocument> list = this.identityDocument;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj2 = this.gender;
        int iHashCode9 = (iHashCode8 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        List<Classification> list2 = this.classifications;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Indicators> list3 = this.indicators;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.notificationTotal;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.customerIdGlobal;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.customerId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.secondLastName;
        Bank bank = this.bank;
        BirthData birthData = this.birthData;
        Object obj = this.nationalities;
        List<IdentityDocument> list = this.identityDocument;
        Object obj2 = this.gender;
        List<Classification> list2 = this.classifications;
        List<Indicators> list3 = this.indicators;
        Integer num = this.notificationTotal;
        String str5 = this.customerIdGlobal;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("CustomerIndicatorsLogins(customerId=", str, ", firstName=", str2, ", lastName=");
        k.e(sbC, str3, ", secondLastName=", str4, ", bank=");
        sbC.append(bank);
        sbC.append(", birthData=");
        sbC.append(birthData);
        sbC.append(", nationalities=");
        sbC.append(obj);
        sbC.append(", identityDocument=");
        sbC.append(list);
        sbC.append(", gender=");
        sbC.append(obj2);
        sbC.append(", classifications=");
        sbC.append(list2);
        sbC.append(", indicators=");
        sbC.append(list3);
        sbC.append(", notificationTotal=");
        sbC.append(num);
        sbC.append(", customerIdGlobal=");
        return d.f(sbC, str5, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomerIndicatorsLogins(@NotNull IndicatorsDataLogins customer, @Nullable CustomerLoginsModel customerLoginsModel) {
        PersonType personType;
        PersonType personType2;
        PersonType personType3;
        PersonType personType4;
        PersonType personType5;
        Intrinsics.checkNotNullParameter(customer, "customer");
        String customerId = customer.getCustomerId();
        String firstName = (customerLoginsModel == null || (personType5 = customerLoginsModel.getPersonType()) == null) ? null : personType5.getFirstName();
        String lastName = (customerLoginsModel == null || (personType4 = customerLoginsModel.getPersonType()) == null) ? null : personType4.getLastName();
        String secondLastName = (customerLoginsModel == null || (personType3 = customerLoginsModel.getPersonType()) == null) ? null : personType3.getSecondLastName();
        Bank bank = customerLoginsModel != null ? customerLoginsModel.getBank() : null;
        BirthData birthData = (customerLoginsModel == null || (personType2 = customerLoginsModel.getPersonType()) == null) ? null : personType2.getBirthData();
        List<Nationalities> nationalities = customer.getNationalities();
        List<IdentityDocument> identityDocument = CustomerIndicatorsLoginsKt.formatIdentityDocument(customerLoginsModel != null ? customerLoginsModel.getIdentityDocument() : null, customerLoginsModel != null ? customerLoginsModel.getTaxpayerIdentification() : null);
        NameIdEntity gender = (customerLoginsModel == null || (personType = customerLoginsModel.getPersonType()) == null) ? null : personType.getGender();
        List<Classification> classifications = customerLoginsModel != null ? customerLoginsModel.getClassifications() : null;
        List<Indicators> listIndicator = CustomerIndicatorsLoginsKt.indicator(MappableEngineKt.toMap(customer));
        Integer notificationTotal = customer.getNotificationTotal();
        Intrinsics.checkNotNull(notificationTotal);
        String customerIdGlobal = customer.getCustomerIdGlobal();
        Intrinsics.checkNotNull(customerIdGlobal);
        this(customerId, firstName, lastName, secondLastName, bank, birthData, nationalities, identityDocument, gender, classifications, listIndicator, notificationTotal, customerIdGlobal);
    }
}
