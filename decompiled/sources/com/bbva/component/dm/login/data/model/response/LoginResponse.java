package com.bbva.component.dm.login.data.model.response;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006#"}, d2 = {"Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "", "", "component1", "component2", "component3", "component4", "authenticationState", "multistepProcessId", "personId", "clientStatus", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAuthenticationState", "()Ljava/lang/String;", "setAuthenticationState", "(Ljava/lang/String;)V", "b", "getMultistepProcessId", "setMultistepProcessId", "c", "getPersonId", "setPersonId", "d", "getClientStatus", "setClientStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoginResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String authenticationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String multistepProcessId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String personId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String clientStatus;

    public LoginResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.authenticationState = str;
        this.multistepProcessId = str2;
        this.personId = str3;
        this.clientStatus = str4;
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginResponse.authenticationState;
        }
        if ((i10 & 2) != 0) {
            str2 = loginResponse.multistepProcessId;
        }
        if ((i10 & 4) != 0) {
            str3 = loginResponse.personId;
        }
        if ((i10 & 8) != 0) {
            str4 = loginResponse.clientStatus;
        }
        return loginResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthenticationState() {
        return this.authenticationState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMultistepProcessId() {
        return this.multistepProcessId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientStatus() {
        return this.clientStatus;
    }

    @NotNull
    public final LoginResponse copy(@Nullable String authenticationState, @Nullable String multistepProcessId, @Nullable String personId, @Nullable String clientStatus) {
        return new LoginResponse(authenticationState, multistepProcessId, personId, clientStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) other;
        return Intrinsics.areEqual(this.authenticationState, loginResponse.authenticationState) && Intrinsics.areEqual(this.multistepProcessId, loginResponse.multistepProcessId) && Intrinsics.areEqual(this.personId, loginResponse.personId) && Intrinsics.areEqual(this.clientStatus, loginResponse.clientStatus);
    }

    @Nullable
    public final String getAuthenticationState() {
        return this.authenticationState;
    }

    @Nullable
    public final String getClientStatus() {
        return this.clientStatus;
    }

    @Nullable
    public final String getMultistepProcessId() {
        return this.multistepProcessId;
    }

    @Nullable
    public final String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        String str = this.authenticationState;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.multistepProcessId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.personId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientStatus;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAuthenticationState(@Nullable String str) {
        this.authenticationState = str;
    }

    public final void setClientStatus(@Nullable String str) {
        this.clientStatus = str;
    }

    public final void setMultistepProcessId(@Nullable String str) {
        this.multistepProcessId = str;
    }

    public final void setPersonId(@Nullable String str) {
        this.personId = str;
    }

    @NotNull
    public String toString() {
        return "LoginResponse(authenticationState=" + ((Object) this.authenticationState) + ", multistepProcessId=" + ((Object) this.multistepProcessId) + ", personId=" + ((Object) this.personId) + ", clientStatus=" + ((Object) this.clientStatus) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ LoginResponse(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
