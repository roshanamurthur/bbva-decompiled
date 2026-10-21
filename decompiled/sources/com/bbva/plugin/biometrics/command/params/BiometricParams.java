package com.bbva.plugin.biometrics.command.params;

import androidx.annotation.Keep;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\bHÆ\u0003JT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006)"}, d2 = {"Lcom/bbva/plugin/biometrics/command/params/BiometricParams;", "", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "description", "negativeButtonText", "isDeviceCredentialAllowed", "", "isConfirmationRequired", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "()Z", "setConfirmationRequired", "(Z)V", "()Ljava/lang/Boolean;", "setDeviceCredentialAllowed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNegativeButtonText", "setNegativeButtonText", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/bbva/plugin/biometrics/command/params/BiometricParams;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class BiometricParams {

    @SerializedName("reason")
    @Nullable
    private String description;

    @SerializedName("is_confirmation_required")
    private boolean isConfirmationRequired;

    @SerializedName("second_factor")
    @Nullable
    private Boolean isDeviceCredentialAllowed;

    @SerializedName("cancel_text")
    @Nullable
    private String negativeButtonText;

    @SerializedName("subtitle_text")
    @Nullable
    private String subtitle;

    @SerializedName("title_text")
    @Nullable
    private String title;

    public BiometricParams() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ BiometricParams copy$default(BiometricParams biometricParams, String str, String str2, String str3, String str4, Boolean bool, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = biometricParams.title;
        }
        if ((i10 & 2) != 0) {
            str2 = biometricParams.subtitle;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = biometricParams.description;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = biometricParams.negativeButtonText;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            bool = biometricParams.isDeviceCredentialAllowed;
        }
        Boolean bool2 = bool;
        if ((i10 & 32) != 0) {
            z10 = biometricParams.isConfirmationRequired;
        }
        return biometricParams.copy(str, str5, str6, str7, bool2, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsDeviceCredentialAllowed() {
        return this.isDeviceCredentialAllowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsConfirmationRequired() {
        return this.isConfirmationRequired;
    }

    @NotNull
    public final BiometricParams copy(@Nullable String title, @Nullable String subtitle, @Nullable String description, @Nullable String negativeButtonText, @Nullable Boolean isDeviceCredentialAllowed, boolean isConfirmationRequired) {
        return new BiometricParams(title, subtitle, description, negativeButtonText, isDeviceCredentialAllowed, isConfirmationRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricParams)) {
            return false;
        }
        BiometricParams biometricParams = (BiometricParams) other;
        return Intrinsics.areEqual(this.title, biometricParams.title) && Intrinsics.areEqual(this.subtitle, biometricParams.subtitle) && Intrinsics.areEqual(this.description, biometricParams.description) && Intrinsics.areEqual(this.negativeButtonText, biometricParams.negativeButtonText) && Intrinsics.areEqual(this.isDeviceCredentialAllowed, biometricParams.isDeviceCredentialAllowed) && this.isConfirmationRequired == biometricParams.isConfirmationRequired;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.negativeButtonText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDeviceCredentialAllowed;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z10 = this.isConfirmationRequired;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    public final boolean isConfirmationRequired() {
        return this.isConfirmationRequired;
    }

    @Nullable
    public final Boolean isDeviceCredentialAllowed() {
        return this.isDeviceCredentialAllowed;
    }

    public final void setConfirmationRequired(boolean z10) {
        this.isConfirmationRequired = z10;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDeviceCredentialAllowed(@Nullable Boolean bool) {
        this.isDeviceCredentialAllowed = bool;
    }

    public final void setNegativeButtonText(@Nullable String str) {
        this.negativeButtonText = str;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiometricParams(title=");
        sb2.append((Object) this.title);
        sb2.append(", subtitle=");
        sb2.append((Object) this.subtitle);
        sb2.append(", description=");
        sb2.append((Object) this.description);
        sb2.append(", negativeButtonText=");
        sb2.append((Object) this.negativeButtonText);
        sb2.append(", isDeviceCredentialAllowed=");
        sb2.append(this.isDeviceCredentialAllowed);
        sb2.append(", isConfirmationRequired=");
        return a.d(sb2, this.isConfirmationRequired, RootService.CLOSE_BRACKET);
    }

    public BiometricParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, boolean z10) {
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.negativeButtonText = str4;
        this.isDeviceCredentialAllowed = bool;
        this.isConfirmationRequired = z10;
    }

    public /* synthetic */ BiometricParams(String str, String str2, String str3, String str4, Boolean bool, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null, (i10 & 16) != 0 ? Boolean.FALSE : bool, (i10 & 32) != 0 ? false : z10);
    }
}
