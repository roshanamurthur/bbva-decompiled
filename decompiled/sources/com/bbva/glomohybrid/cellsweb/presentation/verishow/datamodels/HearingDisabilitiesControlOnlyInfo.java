package com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels;

import ad.d;
import androidx.collection.k;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;
import com.noknok.android.client.appsdk.AppSDKException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HearingDisabilitiesControlOnlyInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesControlOnlyInfo;", "", "customerNumber", "", "contractNumber", AppSDKException.KEY_OPERATION_TYPE, "extension", "documentTypeAr", "channel", "branchOffice", "user", "arrayType", "documentType", "identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArrayType", "()Ljava/lang/String;", "getBranchOffice", "getChannel", "getContractNumber", "getCustomerNumber", "getDocumentType", "getDocumentTypeAr", "getExtension", "getIdentifier", "getOperationType", "getUser", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HearingDisabilitiesControlOnlyInfo {

    @SerializedName("tm")
    @Nullable
    private final String arrayType;

    @SerializedName("so")
    @Nullable
    private final String branchOffice;

    @SerializedName("ca")
    @Nullable
    private final String channel;

    @SerializedName("c")
    @Nullable
    private final String contractNumber;

    @SerializedName("nc")
    @Nullable
    private final String customerNumber;

    @SerializedName("td")
    @Nullable
    private final String documentType;

    @SerializedName("t")
    @Nullable
    private final String documentTypeAr;

    @SerializedName("e")
    @Nullable
    private final String extension;

    @SerializedName(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE)
    @Nullable
    private final String identifier;

    @SerializedName(TypedValues.TransitionType.S_TO)
    @Nullable
    private final String operationType;

    @SerializedName("u")
    @Nullable
    private final String user;

    public HearingDisabilitiesControlOnlyInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.customerNumber = str;
        this.contractNumber = str2;
        this.operationType = str3;
        this.extension = str4;
        this.documentTypeAr = str5;
        this.channel = str6;
        this.branchOffice = str7;
        this.user = str8;
        this.arrayType = str9;
        this.documentType = str10;
        this.identifier = str11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContractNumber() {
        return this.contractNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocumentTypeAr() {
        return this.documentTypeAr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBranchOffice() {
        return this.branchOffice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getArrayType() {
        return this.arrayType;
    }

    @NotNull
    public final HearingDisabilitiesControlOnlyInfo copy(@Nullable String customerNumber, @Nullable String contractNumber, @Nullable String operationType, @Nullable String extension, @Nullable String documentTypeAr, @Nullable String channel, @Nullable String branchOffice, @Nullable String user, @Nullable String arrayType, @Nullable String documentType, @Nullable String identifier) {
        return new HearingDisabilitiesControlOnlyInfo(customerNumber, contractNumber, operationType, extension, documentTypeAr, channel, branchOffice, user, arrayType, documentType, identifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingDisabilitiesControlOnlyInfo)) {
            return false;
        }
        HearingDisabilitiesControlOnlyInfo hearingDisabilitiesControlOnlyInfo = (HearingDisabilitiesControlOnlyInfo) other;
        return Intrinsics.areEqual(this.customerNumber, hearingDisabilitiesControlOnlyInfo.customerNumber) && Intrinsics.areEqual(this.contractNumber, hearingDisabilitiesControlOnlyInfo.contractNumber) && Intrinsics.areEqual(this.operationType, hearingDisabilitiesControlOnlyInfo.operationType) && Intrinsics.areEqual(this.extension, hearingDisabilitiesControlOnlyInfo.extension) && Intrinsics.areEqual(this.documentTypeAr, hearingDisabilitiesControlOnlyInfo.documentTypeAr) && Intrinsics.areEqual(this.channel, hearingDisabilitiesControlOnlyInfo.channel) && Intrinsics.areEqual(this.branchOffice, hearingDisabilitiesControlOnlyInfo.branchOffice) && Intrinsics.areEqual(this.user, hearingDisabilitiesControlOnlyInfo.user) && Intrinsics.areEqual(this.arrayType, hearingDisabilitiesControlOnlyInfo.arrayType) && Intrinsics.areEqual(this.documentType, hearingDisabilitiesControlOnlyInfo.documentType) && Intrinsics.areEqual(this.identifier, hearingDisabilitiesControlOnlyInfo.identifier);
    }

    @Nullable
    public final String getArrayType() {
        return this.arrayType;
    }

    @Nullable
    public final String getBranchOffice() {
        return this.branchOffice;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getContractNumber() {
        return this.contractNumber;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getDocumentType() {
        return this.documentType;
    }

    @Nullable
    public final String getDocumentTypeAr() {
        return this.documentTypeAr;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getOperationType() {
        return this.operationType;
    }

    @Nullable
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        String str = this.customerNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contractNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operationType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extension;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentTypeAr;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.branchOffice;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.user;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.arrayType;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.documentType;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.identifier;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.customerNumber;
        String str2 = this.contractNumber;
        String str3 = this.operationType;
        String str4 = this.extension;
        String str5 = this.documentTypeAr;
        String str6 = this.channel;
        String str7 = this.branchOffice;
        String str8 = this.user;
        String str9 = this.arrayType;
        String str10 = this.documentType;
        String str11 = this.identifier;
        StringBuilder sbC = a.c("HearingDisabilitiesControlOnlyInfo(customerNumber=", str, ", contractNumber=", str2, ", operationType=");
        k.e(sbC, str3, ", extension=", str4, ", documentTypeAr=");
        k.e(sbC, str5, ", channel=", str6, ", branchOffice=");
        k.e(sbC, str7, ", user=", str8, ", arrayType=");
        k.e(sbC, str9, ", documentType=", str10, ", identifier=");
        return d.f(sbC, str11, ")");
    }
}
