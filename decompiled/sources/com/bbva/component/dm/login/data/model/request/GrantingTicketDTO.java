package com.bbva.component.dm.login.data.model.request;

import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GrantingTicketDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0003!\"#B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO;", "", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$Authentication;", "component1", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$BackendUserRequest;", "component2", "", "", "component3", "authentication", Constants.backendUserRequest, "additionalProperties", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$Authentication;", "getAuthentication", "()Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$Authentication;", "b", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$BackendUserRequest;", "getBackendUserRequest", "()Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$BackendUserRequest;", "c", "Ljava/util/Map;", "getAdditionalProperties", "()Ljava/util/Map;", "<init>", "(Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$Authentication;Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$BackendUserRequest;Ljava/util/Map;)V", "Authentication", "AuthenticationDatum", "BackendUserRequest", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GrantingTicketDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authentication")
    @NotNull
    private final Authentication authentication;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.backendUserRequest)
    @Nullable
    private final BackendUserRequest backendUserRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalProperties")
    @Nullable
    private final Map<String, Object> additionalProperties;

    /* JADX INFO: compiled from: GrantingTicketDTO.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003JU\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$Authentication;", "", "", "component1", "component2", "component3", "", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$AuthenticationDatum;", "component4", "userID", "consumerID", Constants.authenticationType, Constants.authenticationData, "", "additionalProperties", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "b", "getConsumerID", "setConsumerID", "c", "getAuthenticationType", "setAuthenticationType", "d", "Ljava/util/List;", "getAuthenticationData", "()Ljava/util/List;", "setAuthenticationData", "(Ljava/util/List;)V", "e", "Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Authentication {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("userID")
        @Nullable
        private String userID;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("consumerID")
        @Nullable
        private String consumerID;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.authenticationType)
        @Nullable
        private String authenticationType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.authenticationData)
        @Nullable
        private List<AuthenticationDatum> authenticationData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("additionalProperties")
        @NotNull
        private final Map<String, Object> additionalProperties;

        public Authentication() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Authentication copy$default(Authentication authentication, String str, String str2, String str3, List list, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = authentication.userID;
            }
            if ((i10 & 2) != 0) {
                str2 = authentication.consumerID;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = authentication.authenticationType;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                list = authentication.authenticationData;
            }
            List list2 = list;
            if ((i10 & 16) != 0) {
                map = authentication.additionalProperties;
            }
            return authentication.copy(str, str4, str5, list2, map);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserID() {
            return this.userID;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsumerID() {
            return this.consumerID;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAuthenticationType() {
            return this.authenticationType;
        }

        @Nullable
        public final List<AuthenticationDatum> component4() {
            return this.authenticationData;
        }

        @NotNull
        public final Authentication copy(@Nullable String userID, @Nullable String consumerID, @Nullable String authenticationType, @Nullable List<AuthenticationDatum> authenticationData, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            return new Authentication(userID, consumerID, authenticationType, authenticationData, additionalProperties);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authentication)) {
                return false;
            }
            Authentication authentication = (Authentication) other;
            return Intrinsics.areEqual(this.userID, authentication.userID) && Intrinsics.areEqual(this.consumerID, authentication.consumerID) && Intrinsics.areEqual(this.authenticationType, authentication.authenticationType) && Intrinsics.areEqual(this.authenticationData, authentication.authenticationData) && Intrinsics.areEqual(this.additionalProperties, authentication.additionalProperties);
        }

        @Nullable
        public final List<AuthenticationDatum> getAuthenticationData() {
            return this.authenticationData;
        }

        @Nullable
        public final String getAuthenticationType() {
            return this.authenticationType;
        }

        @Nullable
        public final String getConsumerID() {
            return this.consumerID;
        }

        @Nullable
        public final String getUserID() {
            return this.userID;
        }

        public int hashCode() {
            String str = this.userID;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.consumerID;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.authenticationType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<AuthenticationDatum> list = this.authenticationData;
            return this.additionalProperties.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final void setAuthenticationData(@Nullable List<AuthenticationDatum> list) {
            this.authenticationData = list;
        }

        public final void setAuthenticationType(@Nullable String str) {
            this.authenticationType = str;
        }

        public final void setConsumerID(@Nullable String str) {
            this.consumerID = str;
        }

        public final void setUserID(@Nullable String str) {
            this.userID = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Authentication(userID=");
            sb2.append((Object) this.userID);
            sb2.append(", consumerID=");
            sb2.append((Object) this.consumerID);
            sb2.append(", authenticationType=");
            sb2.append((Object) this.authenticationType);
            sb2.append(", authenticationData=");
            sb2.append(this.authenticationData);
            sb2.append(", additionalProperties=");
            return e.g(sb2, this.additionalProperties, RootService.CLOSE_BRACKET);
        }

        public Authentication(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<AuthenticationDatum> list, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            this.userID = str;
            this.consumerID = str2;
            this.authenticationType = str3;
            this.authenticationData = list;
            this.additionalProperties = additionalProperties;
        }

        public /* synthetic */ Authentication(String str, String str2, String str3, List list, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) == 0 ? str3 : "", (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? new HashMap() : map);
        }
    }

    /* JADX INFO: compiled from: GrantingTicketDTO.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003J=\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$AuthenticationDatum;", "", "", "component1", "", "component2", Constants.idAuthenticationData, Constants.authenticationData, "", "additionalProperties", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getIdAuthenticationData", "()Ljava/lang/String;", "setIdAuthenticationData", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "getAuthenticationData", "()Ljava/util/List;", "setAuthenticationData", "(Ljava/util/List;)V", "c", "Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class AuthenticationDatum {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.idAuthenticationData)
        @Nullable
        private String idAuthenticationData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.authenticationData)
        @Nullable
        private List<String> authenticationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("additionalProperties")
        @NotNull
        private final Map<String, Object> additionalProperties;

        public AuthenticationDatum() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AuthenticationDatum copy$default(AuthenticationDatum authenticationDatum, String str, List list, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = authenticationDatum.idAuthenticationData;
            }
            if ((i10 & 2) != 0) {
                list = authenticationDatum.authenticationData;
            }
            if ((i10 & 4) != 0) {
                map = authenticationDatum.additionalProperties;
            }
            return authenticationDatum.copy(str, list, map);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIdAuthenticationData() {
            return this.idAuthenticationData;
        }

        @Nullable
        public final List<String> component2() {
            return this.authenticationData;
        }

        @NotNull
        public final AuthenticationDatum copy(@Nullable String idAuthenticationData, @Nullable List<String> authenticationData, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            return new AuthenticationDatum(idAuthenticationData, authenticationData, additionalProperties);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthenticationDatum)) {
                return false;
            }
            AuthenticationDatum authenticationDatum = (AuthenticationDatum) other;
            return Intrinsics.areEqual(this.idAuthenticationData, authenticationDatum.idAuthenticationData) && Intrinsics.areEqual(this.authenticationData, authenticationDatum.authenticationData) && Intrinsics.areEqual(this.additionalProperties, authenticationDatum.additionalProperties);
        }

        @Nullable
        public final List<String> getAuthenticationData() {
            return this.authenticationData;
        }

        @Nullable
        public final String getIdAuthenticationData() {
            return this.idAuthenticationData;
        }

        public int hashCode() {
            String str = this.idAuthenticationData;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.authenticationData;
            return this.additionalProperties.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final void setAuthenticationData(@Nullable List<String> list) {
            this.authenticationData = list;
        }

        public final void setIdAuthenticationData(@Nullable String str) {
            this.idAuthenticationData = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AuthenticationDatum(idAuthenticationData=");
            sb2.append((Object) this.idAuthenticationData);
            sb2.append(", authenticationData=");
            sb2.append(this.authenticationData);
            sb2.append(", additionalProperties=");
            return e.g(sb2, this.additionalProperties, RootService.CLOSE_BRACKET);
        }

        public AuthenticationDatum(@Nullable String str, @Nullable List<String> list, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            this.idAuthenticationData = str;
            this.authenticationData = list;
            this.additionalProperties = additionalProperties;
        }

        public /* synthetic */ AuthenticationDatum(String str, List list, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? new HashMap() : map);
        }
    }

    /* JADX INFO: compiled from: GrantingTicketDTO.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J?\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO$BackendUserRequest;", "", "", "component1", "component2", "component3", "", "component4", Constants.backendRequestUserId, Constants.accessCode, Constants.dialogId, "additionalProperties", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "b", "getAccessCode", "setAccessCode", "c", "getDialogId", "setDialogId", "d", "Ljava/util/Map;", "getAdditionalProperties", "()Ljava/util/Map;", "setAdditionalProperties", "(Ljava/util/Map;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class BackendUserRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.backendRequestUserId)
        @Nullable
        private String userId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.accessCode)
        @NotNull
        private String accessCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName(Constants.dialogId)
        @NotNull
        private String dialogId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("additionalProperties")
        @NotNull
        private Map<String, Object> additionalProperties;

        public BackendUserRequest() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BackendUserRequest copy$default(BackendUserRequest backendUserRequest, String str, String str2, String str3, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = backendUserRequest.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = backendUserRequest.accessCode;
            }
            if ((i10 & 4) != 0) {
                str3 = backendUserRequest.dialogId;
            }
            if ((i10 & 8) != 0) {
                map = backendUserRequest.additionalProperties;
            }
            return backendUserRequest.copy(str, str2, str3, map);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccessCode() {
            return this.accessCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDialogId() {
            return this.dialogId;
        }

        @NotNull
        public final Map<String, Object> component4() {
            return this.additionalProperties;
        }

        @NotNull
        public final BackendUserRequest copy(@Nullable String userId, @NotNull String accessCode, @NotNull String dialogId, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(accessCode, "accessCode");
            Intrinsics.checkNotNullParameter(dialogId, "dialogId");
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            return new BackendUserRequest(userId, accessCode, dialogId, additionalProperties);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackendUserRequest)) {
                return false;
            }
            BackendUserRequest backendUserRequest = (BackendUserRequest) other;
            return Intrinsics.areEqual(this.userId, backendUserRequest.userId) && Intrinsics.areEqual(this.accessCode, backendUserRequest.accessCode) && Intrinsics.areEqual(this.dialogId, backendUserRequest.dialogId) && Intrinsics.areEqual(this.additionalProperties, backendUserRequest.additionalProperties);
        }

        @NotNull
        public final String getAccessCode() {
            return this.accessCode;
        }

        @NotNull
        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @NotNull
        public final String getDialogId() {
            return this.dialogId;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            return this.additionalProperties.hashCode() + n1.c(this.dialogId, n1.c(this.accessCode, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        }

        public final void setAccessCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.accessCode = str;
        }

        public final void setAdditionalProperties(@NotNull Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.additionalProperties = map;
        }

        public final void setDialogId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.dialogId = str;
        }

        public final void setUserId(@Nullable String str) {
            this.userId = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BackendUserRequest(userId=");
            sb2.append((Object) this.userId);
            sb2.append(", accessCode=");
            sb2.append(this.accessCode);
            sb2.append(", dialogId=");
            sb2.append(this.dialogId);
            sb2.append(", additionalProperties=");
            return e.g(sb2, this.additionalProperties, RootService.CLOSE_BRACKET);
        }

        public BackendUserRequest(@Nullable String str, @NotNull String accessCode, @NotNull String dialogId, @NotNull Map<String, Object> additionalProperties) {
            Intrinsics.checkNotNullParameter(accessCode, "accessCode");
            Intrinsics.checkNotNullParameter(dialogId, "dialogId");
            Intrinsics.checkNotNullParameter(additionalProperties, "additionalProperties");
            this.userId = str;
            this.accessCode = accessCode;
            this.dialogId = dialogId;
            this.additionalProperties = additionalProperties;
        }

        public /* synthetic */ BackendUserRequest(String str, String str2, String str3, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? new HashMap() : map);
        }
    }

    public GrantingTicketDTO(@NotNull Authentication authentication, @Nullable BackendUserRequest backendUserRequest, @Nullable Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(authentication, "authentication");
        this.authentication = authentication;
        this.backendUserRequest = backendUserRequest;
        this.additionalProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrantingTicketDTO copy$default(GrantingTicketDTO grantingTicketDTO, Authentication authentication, BackendUserRequest backendUserRequest, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authentication = grantingTicketDTO.authentication;
        }
        if ((i10 & 2) != 0) {
            backendUserRequest = grantingTicketDTO.backendUserRequest;
        }
        if ((i10 & 4) != 0) {
            map = grantingTicketDTO.additionalProperties;
        }
        return grantingTicketDTO.copy(authentication, backendUserRequest, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Authentication getAuthentication() {
        return this.authentication;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BackendUserRequest getBackendUserRequest() {
        return this.backendUserRequest;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    @NotNull
    public final GrantingTicketDTO copy(@NotNull Authentication authentication, @Nullable BackendUserRequest backendUserRequest, @Nullable Map<String, Object> additionalProperties) {
        Intrinsics.checkNotNullParameter(authentication, "authentication");
        return new GrantingTicketDTO(authentication, backendUserRequest, additionalProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrantingTicketDTO)) {
            return false;
        }
        GrantingTicketDTO grantingTicketDTO = (GrantingTicketDTO) other;
        return Intrinsics.areEqual(this.authentication, grantingTicketDTO.authentication) && Intrinsics.areEqual(this.backendUserRequest, grantingTicketDTO.backendUserRequest) && Intrinsics.areEqual(this.additionalProperties, grantingTicketDTO.additionalProperties);
    }

    @Nullable
    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @NotNull
    public final Authentication getAuthentication() {
        return this.authentication;
    }

    @Nullable
    public final BackendUserRequest getBackendUserRequest() {
        return this.backendUserRequest;
    }

    public int hashCode() {
        int iHashCode = this.authentication.hashCode() * 31;
        BackendUserRequest backendUserRequest = this.backendUserRequest;
        int iHashCode2 = (iHashCode + (backendUserRequest == null ? 0 : backendUserRequest.hashCode())) * 31;
        Map<String, Object> map = this.additionalProperties;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GrantingTicketDTO(authentication=");
        sb2.append(this.authentication);
        sb2.append(", backendUserRequest=");
        sb2.append(this.backendUserRequest);
        sb2.append(", additionalProperties=");
        return e.g(sb2, this.additionalProperties, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ GrantingTicketDTO(Authentication authentication, BackendUserRequest backendUserRequest, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(authentication, (i10 & 2) != 0 ? null : backendUserRequest, (i10 & 4) != 0 ? new HashMap() : map);
    }
}
