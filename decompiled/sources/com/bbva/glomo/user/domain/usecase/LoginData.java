package com.bbva.glomo.user.domain.usecase;

import ad.d;
import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoutils.usecase.UseCaseParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StoreLoginDataUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/LoginData;", "Lcom/bbva/glomoutils/usecase/UseCaseParams;", "", "component1", "component2", "component3", CustomerIdInterceptor.GRANTING_TICKET_USER_ID, "consumerId", Constants.authenticationType, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getGrantingTicketUserId", "()Ljava/lang/String;", "setGrantingTicketUserId", "(Ljava/lang/String;)V", "b", "getConsumerId", "setConsumerId", "c", "getAuthenticationType", "setAuthenticationType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginData implements UseCaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CustomerIdInterceptor.GRANTING_TICKET_USER_ID)
    @Nullable
    private String grantingTicketUserId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerId")
    @Nullable
    private String consumerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.authenticationType)
    @Nullable
    private String authenticationType;

    public LoginData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LoginData copy$default(LoginData loginData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginData.grantingTicketUserId;
        }
        if ((i10 & 2) != 0) {
            str2 = loginData.consumerId;
        }
        if ((i10 & 4) != 0) {
            str3 = loginData.authenticationType;
        }
        return loginData.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGrantingTicketUserId() {
        return this.grantingTicketUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConsumerId() {
        return this.consumerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final LoginData copy(@Nullable String grantingTicketUserId, @Nullable String consumerId, @Nullable String authenticationType) {
        return new LoginData(grantingTicketUserId, consumerId, authenticationType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginData)) {
            return false;
        }
        LoginData loginData = (LoginData) other;
        return Intrinsics.areEqual(this.grantingTicketUserId, loginData.grantingTicketUserId) && Intrinsics.areEqual(this.consumerId, loginData.consumerId) && Intrinsics.areEqual(this.authenticationType, loginData.authenticationType);
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    @Nullable
    public final String getConsumerId() {
        return this.consumerId;
    }

    @Nullable
    public final String getGrantingTicketUserId() {
        return this.grantingTicketUserId;
    }

    public int hashCode() {
        String str = this.grantingTicketUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consumerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authenticationType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAuthenticationType(@Nullable String str) {
        this.authenticationType = str;
    }

    public final void setConsumerId(@Nullable String str) {
        this.consumerId = str;
    }

    public final void setGrantingTicketUserId(@Nullable String str) {
        this.grantingTicketUserId = str;
    }

    @NotNull
    public String toString() {
        String str = this.grantingTicketUserId;
        String str2 = this.consumerId;
        return d.f(a.c("LoginData(grantingTicketUserId=", str, ", consumerId=", str2, ", authenticationType="), this.authenticationType, ")");
    }

    public LoginData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.grantingTicketUserId = str;
        this.consumerId = str2;
        this.authenticationType = str3;
    }

    public /* synthetic */ LoginData(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
