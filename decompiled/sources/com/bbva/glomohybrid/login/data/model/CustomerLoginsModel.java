package com.bbva.glomohybrid.login.data.model;

import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.extensions.CustomerExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerLoginsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b2\u00103B\u0011\b\u0016\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b2\u00106J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/CustomerLoginsModel;", "", "Lcom/bbva/glomohybrid/login/data/model/PersonType;", "component1", "Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "component2", "Lcom/bbva/glomohybrid/login/data/model/Bank;", "component3", "", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component4", "Lcom/bbva/glomohybrid/login/data/model/Classification;", "component5", "", "component6", CustomerLoginsParser.PERSON_TYPE, "identityDocument", "bank", "segments", "classifications", "taxpayerIdentification", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/login/data/model/PersonType;", "getPersonType", "()Lcom/bbva/glomohybrid/login/data/model/PersonType;", "b", "Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "getIdentityDocument", "()Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "c", "Lcom/bbva/glomohybrid/login/data/model/Bank;", "getBank", "()Lcom/bbva/glomohybrid/login/data/model/Bank;", "d", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "e", "getClassifications", "f", "Ljava/lang/String;", "getTaxpayerIdentification", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomohybrid/login/data/model/PersonType;Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;Lcom/bbva/glomohybrid/login/data/model/Bank;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "customer", "(Lcom/bbva/component/dm/customer/domain/model/Customer;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CustomerLoginsModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PersonType personType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final IdentityDocument identityDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bank bank;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<NameIdEntity> segments;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Classification> classifications;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String taxpayerIdentification;

    public CustomerLoginsModel(@Nullable PersonType personType, @Nullable IdentityDocument identityDocument, @Nullable Bank bank, @Nullable List<NameIdEntity> list, @Nullable List<Classification> list2, @Nullable String str) {
        this.personType = personType;
        this.identityDocument = identityDocument;
        this.bank = bank;
        this.segments = list;
        this.classifications = list2;
        this.taxpayerIdentification = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerLoginsModel copy$default(CustomerLoginsModel customerLoginsModel, PersonType personType, IdentityDocument identityDocument, Bank bank, List list, List list2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            personType = customerLoginsModel.personType;
        }
        if ((i10 & 2) != 0) {
            identityDocument = customerLoginsModel.identityDocument;
        }
        IdentityDocument identityDocument2 = identityDocument;
        if ((i10 & 4) != 0) {
            bank = customerLoginsModel.bank;
        }
        Bank bank2 = bank;
        if ((i10 & 8) != 0) {
            list = customerLoginsModel.segments;
        }
        List list3 = list;
        if ((i10 & 16) != 0) {
            list2 = customerLoginsModel.classifications;
        }
        List list4 = list2;
        if ((i10 & 32) != 0) {
            str = customerLoginsModel.taxpayerIdentification;
        }
        return customerLoginsModel.copy(personType, identityDocument2, bank2, list3, list4, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonType getPersonType() {
        return this.personType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IdentityDocument getIdentityDocument() {
        return this.identityDocument;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    public final List<NameIdEntity> component4() {
        return this.segments;
    }

    @Nullable
    public final List<Classification> component5() {
        return this.classifications;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTaxpayerIdentification() {
        return this.taxpayerIdentification;
    }

    @NotNull
    public final CustomerLoginsModel copy(@Nullable PersonType personType, @Nullable IdentityDocument identityDocument, @Nullable Bank bank, @Nullable List<NameIdEntity> segments, @Nullable List<Classification> classifications, @Nullable String taxpayerIdentification) {
        return new CustomerLoginsModel(personType, identityDocument, bank, segments, classifications, taxpayerIdentification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerLoginsModel)) {
            return false;
        }
        CustomerLoginsModel customerLoginsModel = (CustomerLoginsModel) other;
        return Intrinsics.areEqual(this.personType, customerLoginsModel.personType) && Intrinsics.areEqual(this.identityDocument, customerLoginsModel.identityDocument) && Intrinsics.areEqual(this.bank, customerLoginsModel.bank) && Intrinsics.areEqual(this.segments, customerLoginsModel.segments) && Intrinsics.areEqual(this.classifications, customerLoginsModel.classifications) && Intrinsics.areEqual(this.taxpayerIdentification, customerLoginsModel.taxpayerIdentification);
    }

    @Nullable
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    public final List<Classification> getClassifications() {
        return this.classifications;
    }

    @Nullable
    public final IdentityDocument getIdentityDocument() {
        return this.identityDocument;
    }

    @Nullable
    public final PersonType getPersonType() {
        return this.personType;
    }

    @Nullable
    public final List<NameIdEntity> getSegments() {
        return this.segments;
    }

    @Nullable
    public final String getTaxpayerIdentification() {
        return this.taxpayerIdentification;
    }

    public int hashCode() {
        PersonType personType = this.personType;
        int iHashCode = (personType == null ? 0 : personType.hashCode()) * 31;
        IdentityDocument identityDocument = this.identityDocument;
        int iHashCode2 = (iHashCode + (identityDocument == null ? 0 : identityDocument.hashCode())) * 31;
        Bank bank = this.bank;
        int iHashCode3 = (iHashCode2 + (bank == null ? 0 : bank.hashCode())) * 31;
        List<NameIdEntity> list = this.segments;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Classification> list2 = this.classifications;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.taxpayerIdentification;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CustomerLoginsModel(personType=" + this.personType + ", identityDocument=" + this.identityDocument + ", bank=" + this.bank + ", segments=" + this.segments + ", classifications=" + this.classifications + ", taxpayerIdentification=" + this.taxpayerIdentification + ")";
    }

    public /* synthetic */ CustomerLoginsModel(PersonType personType, IdentityDocument identityDocument, Bank bank, List list, List list2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(personType, identityDocument, bank, list, list2, (i10 & 32) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerLoginsModel(@NotNull Customer customer) {
        this(CustomerExtensionsKt.personTypeProMap(customer), CustomerExtensionsKt.identityDocumentProMap(customer), CustomerExtensionsKt.bankProMap(customer), CustomerExtensionsKt.segmentsListProMap(customer), CustomerExtensionsKt.classificationProMap(customer), CustomerExtensionsKt.taxpayerIdentificationProMap(customer));
        Intrinsics.checkNotNullParameter(customer, "customer");
    }
}
