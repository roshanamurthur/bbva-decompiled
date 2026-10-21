package com.bbva.plugin.contacts.command.params;

import com.bbva.contacts.ContactAccessor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsBirthdayConditionFilter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAllContactsParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\u0095\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0011\u0010(R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\u0012\u0010(R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\u0013\u0010(R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b\u0014\u0010(R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b\u0015\u0010(R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b\u0016\u0010(R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b\u0017\u0010(R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b\u0018\u0010(R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b\u0019\u0010(R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b\u001a\u0010(R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b\u001b\u0010(R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b\u001c\u0010(R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b\u001d\u0010(R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b\u001e\u0010(¨\u00068"}, d2 = {"Lcom/bbva/plugin/contacts/command/params/GetAllContactsParams;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "isIncludePhoto", "isDisplayName", "isNickName", "isIms", LandingIsBirthdayConditionFilter.ID, "isUrls", "isCategories", "isName", "isWebSites", "isOrganizations", "isPostalAddresses", "isPhoneNumbers", "isEmails", "isNote", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "<init>", "(ZZZZZZZZZZZZZZ)V", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GetAllContactsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includePhoto")
    private final boolean isIncludePhoto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.DISPLAY_NAME)
    private final boolean isDisplayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nickName")
    private final boolean isNickName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.IMS)
    private final boolean isIms;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.BIRTHDAY)
    private final boolean isBirthday;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.URLS)
    private final boolean isUrls;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.CATEGORIES)
    private final boolean isCategories;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final boolean isName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.WEB_SITES)
    private final boolean isWebSites;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.ORGANIZATIONS)
    private final boolean isOrganizations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postalAddresses")
    private final boolean isPostalAddresses;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.PHONE_NUMBERS)
    private final boolean isPhoneNumbers;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName(ContactAccessor.EMAILS)
    private final boolean isEmails;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ContactAccessor.NOTE)
    private final boolean isNote;

    public GetAllContactsParams() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsIncludePhoto() {
        return this.isIncludePhoto;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsOrganizations() {
        return this.isOrganizations;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsPostalAddresses() {
        return this.isPostalAddresses;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsPhoneNumbers() {
        return this.isPhoneNumbers;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsEmails() {
        return this.isEmails;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsNote() {
        return this.isNote;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDisplayName() {
        return this.isDisplayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNickName() {
        return this.isNickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsIms() {
        return this.isIms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsBirthday() {
        return this.isBirthday;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsUrls() {
        return this.isUrls;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsCategories() {
        return this.isCategories;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsName() {
        return this.isName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsWebSites() {
        return this.isWebSites;
    }

    @NotNull
    public final GetAllContactsParams copy(boolean isIncludePhoto, boolean isDisplayName, boolean isNickName, boolean isIms, boolean isBirthday, boolean isUrls, boolean isCategories, boolean isName, boolean isWebSites, boolean isOrganizations, boolean isPostalAddresses, boolean isPhoneNumbers, boolean isEmails, boolean isNote) {
        return new GetAllContactsParams(isIncludePhoto, isDisplayName, isNickName, isIms, isBirthday, isUrls, isCategories, isName, isWebSites, isOrganizations, isPostalAddresses, isPhoneNumbers, isEmails, isNote);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllContactsParams)) {
            return false;
        }
        GetAllContactsParams getAllContactsParams = (GetAllContactsParams) other;
        return this.isIncludePhoto == getAllContactsParams.isIncludePhoto && this.isDisplayName == getAllContactsParams.isDisplayName && this.isNickName == getAllContactsParams.isNickName && this.isIms == getAllContactsParams.isIms && this.isBirthday == getAllContactsParams.isBirthday && this.isUrls == getAllContactsParams.isUrls && this.isCategories == getAllContactsParams.isCategories && this.isName == getAllContactsParams.isName && this.isWebSites == getAllContactsParams.isWebSites && this.isOrganizations == getAllContactsParams.isOrganizations && this.isPostalAddresses == getAllContactsParams.isPostalAddresses && this.isPhoneNumbers == getAllContactsParams.isPhoneNumbers && this.isEmails == getAllContactsParams.isEmails && this.isNote == getAllContactsParams.isNote;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((this.isIncludePhoto ? 1231 : 1237) * 31) + (this.isDisplayName ? 1231 : 1237)) * 31) + (this.isNickName ? 1231 : 1237)) * 31) + (this.isIms ? 1231 : 1237)) * 31) + (this.isBirthday ? 1231 : 1237)) * 31) + (this.isUrls ? 1231 : 1237)) * 31) + (this.isCategories ? 1231 : 1237)) * 31) + (this.isName ? 1231 : 1237)) * 31) + (this.isWebSites ? 1231 : 1237)) * 31) + (this.isOrganizations ? 1231 : 1237)) * 31) + (this.isPostalAddresses ? 1231 : 1237)) * 31) + (this.isPhoneNumbers ? 1231 : 1237)) * 31) + (this.isEmails ? 1231 : 1237)) * 31) + (this.isNote ? 1231 : 1237);
    }

    public final boolean isBirthday() {
        return this.isBirthday;
    }

    public final boolean isCategories() {
        return this.isCategories;
    }

    public final boolean isDisplayName() {
        return this.isDisplayName;
    }

    public final boolean isEmails() {
        return this.isEmails;
    }

    public final boolean isIms() {
        return this.isIms;
    }

    public final boolean isIncludePhoto() {
        return this.isIncludePhoto;
    }

    public final boolean isName() {
        return this.isName;
    }

    public final boolean isNickName() {
        return this.isNickName;
    }

    public final boolean isNote() {
        return this.isNote;
    }

    public final boolean isOrganizations() {
        return this.isOrganizations;
    }

    public final boolean isPhoneNumbers() {
        return this.isPhoneNumbers;
    }

    public final boolean isPostalAddresses() {
        return this.isPostalAddresses;
    }

    public final boolean isUrls() {
        return this.isUrls;
    }

    public final boolean isWebSites() {
        return this.isWebSites;
    }

    @NotNull
    public String toString() {
        return "GetAllContactsParams(isIncludePhoto=" + this.isIncludePhoto + ", isDisplayName=" + this.isDisplayName + ", isNickName=" + this.isNickName + ", isIms=" + this.isIms + ", isBirthday=" + this.isBirthday + ", isUrls=" + this.isUrls + ", isCategories=" + this.isCategories + ", isName=" + this.isName + ", isWebSites=" + this.isWebSites + ", isOrganizations=" + this.isOrganizations + ", isPostalAddresses=" + this.isPostalAddresses + ", isPhoneNumbers=" + this.isPhoneNumbers + ", isEmails=" + this.isEmails + ", isNote=" + this.isNote + ")";
    }

    public GetAllContactsParams(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
        this.isIncludePhoto = z10;
        this.isDisplayName = z11;
        this.isNickName = z12;
        this.isIms = z13;
        this.isBirthday = z14;
        this.isUrls = z15;
        this.isCategories = z16;
        this.isName = z17;
        this.isWebSites = z18;
        this.isOrganizations = z19;
        this.isPostalAddresses = z20;
        this.isPhoneNumbers = z21;
        this.isEmails = z22;
        this.isNote = z23;
    }

    public /* synthetic */ GetAllContactsParams(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & 128) != 0 ? false : z17, (i10 & 256) != 0 ? false : z18, (i10 & 512) != 0 ? false : z19, (i10 & 1024) != 0 ? false : z20, (i10 & 2048) != 0 ? false : z21, (i10 & 4096) != 0 ? false : z22, (i10 & 8192) == 0 ? z23 : false);
    }
}
