package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001a\u00106\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR\u001a\u0010K\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001a\u0010N\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\f\"\u0004\bP\u0010\u000eR\u001a\u0010Q\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\u001a\u0010T\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\u001a\u0010W\u001a\u00020XX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionBackendParametersMeta;", "", "()V", "ApiVersion", "Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;", "getApiVersion", "()Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;", "setApiVersion", "(Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;)V", "applicationVersionNumber", "", "getApplicationVersionNumber", "()Ljava/lang/String;", "setApplicationVersionNumber", "(Ljava/lang/String;)V", "authorizationIdResponse", "getAuthorizationIdResponse", "setAuthorizationIdResponse", "binsTableVersion", "getBinsTableVersion", "setBinsTableVersion", "cipherConfiguration", "getCipherConfiguration", "setCipherConfiguration", "criptoInfoData", "getCriptoInfoData", "setCriptoInfoData", "hasChip", "", "getHasChip", "()Z", "setHasChip", "(Z)V", "hostType", "Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "getHostType$PinPadSdk1032_1_0_32E_release", "()Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "setHostType$PinPadSdk1032_1_0_32E_release", "(Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;)V", "keyId1", "getKeyId1", "setKeyId1", "keyId2", "getKeyId2", "setKeyId2", "lastPan4Digits", "getLastPan4Digits", "setLastPan4Digits", "localBinsTableIdPrimary", "getLocalBinsTableIdPrimary", "setLocalBinsTableIdPrimary", "localBinsTableIdSecondary", "getLocalBinsTableIdSecondary", "setLocalBinsTableIdSecondary", "merchantId", "getMerchantId", "setMerchantId", "merchantType", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "getMerchantType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "setMerchantType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;)V", "orderId", "getOrderId", "setOrderId", "pointOfServiceEntryMode", "Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "getPointOfServiceEntryMode", "()Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "setPointOfServiceEntryMode", "(Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;)V", "rrn", "getRrn", "setRrn", "terminalSerialNumber", "getTerminalSerialNumber", "setTerminalSerialNumber", "terminalSoftwareVersion", "getTerminalSoftwareVersion", "setTerminalSoftwareVersion", "transactionAmount", "getTransactionAmount", "setTransactionAmount", "transactionOtherAmount", "getTransactionOtherAmount", "setTransactionOtherAmount", "transactionType", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "getTransactionType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "setTransactionType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;)V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionBackendParametersMeta {
    private boolean hasChip;

    @NotNull
    private HostType hostType = HostType.TestingDUKPTHost;

    @NotNull
    private MerchantType merchantType = MerchantType.Undefined;

    @NotNull
    private ApiVersion ApiVersion = ApiVersion.Version2;

    @NotNull
    private String authorizationIdResponse = "";

    @NotNull
    private PointOfServiceEntryMode pointOfServiceEntryMode = PointOfServiceEntryMode.Undefined;

    @NotNull
    private TransactionType transactionType = TransactionType.Undefined;

    @NotNull
    private String transactionAmount = "";

    @NotNull
    private String transactionOtherAmount = "";

    @NotNull
    private String terminalSoftwareVersion = "010020211223        ";

    @NotNull
    private String terminalSerialNumber = "";

    @NotNull
    private String cipherConfiguration = "5";

    @NotNull
    private String localBinsTableIdPrimary = "00000000";

    @NotNull
    private String localBinsTableIdSecondary = "00000000";

    @NotNull
    private String binsTableVersion = "00";

    @NotNull
    private String criptoInfoData = "00";

    @NotNull
    private String lastPan4Digits = "";

    @NotNull
    private String applicationVersionNumber = "1.0.01";

    @NotNull
    private String rrn = "";

    @NotNull
    private String keyId1 = "";

    @NotNull
    private String keyId2 = "";

    @NotNull
    private String orderId = "";

    @NotNull
    private String merchantId = "";

    @NotNull
    public final ApiVersion getApiVersion() {
        return this.ApiVersion;
    }

    @NotNull
    public final String getApplicationVersionNumber() {
        return this.applicationVersionNumber;
    }

    @NotNull
    public final String getAuthorizationIdResponse() {
        return this.authorizationIdResponse;
    }

    @NotNull
    public final String getBinsTableVersion() {
        return this.binsTableVersion;
    }

    @NotNull
    public final String getCipherConfiguration() {
        return this.cipherConfiguration;
    }

    @NotNull
    public final String getCriptoInfoData() {
        return this.criptoInfoData;
    }

    public final boolean getHasChip() {
        return this.hasChip;
    }

    @NotNull
    /* JADX INFO: renamed from: getHostType$PinPadSdk1032_1_0_32E_release, reason: from getter */
    public final HostType getHostType() {
        return this.hostType;
    }

    @NotNull
    public final String getKeyId1() {
        return this.keyId1;
    }

    @NotNull
    public final String getKeyId2() {
        return this.keyId2;
    }

    @NotNull
    public final String getLastPan4Digits() {
        return this.lastPan4Digits;
    }

    @NotNull
    public final String getLocalBinsTableIdPrimary() {
        return this.localBinsTableIdPrimary;
    }

    @NotNull
    public final String getLocalBinsTableIdSecondary() {
        return this.localBinsTableIdSecondary;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final MerchantType getMerchantType() {
        return this.merchantType;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final PointOfServiceEntryMode getPointOfServiceEntryMode() {
        return this.pointOfServiceEntryMode;
    }

    @NotNull
    public final String getRrn() {
        return this.rrn;
    }

    @NotNull
    public final String getTerminalSerialNumber() {
        return this.terminalSerialNumber;
    }

    @NotNull
    public final String getTerminalSoftwareVersion() {
        return this.terminalSoftwareVersion;
    }

    @NotNull
    public final String getTransactionAmount() {
        return this.transactionAmount;
    }

    @NotNull
    public final String getTransactionOtherAmount() {
        return this.transactionOtherAmount;
    }

    @NotNull
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    public final void setApiVersion(@NotNull ApiVersion apiVersion) {
        Intrinsics.checkNotNullParameter(apiVersion, "");
        this.ApiVersion = apiVersion;
    }

    public final void setApplicationVersionNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.applicationVersionNumber = str;
    }

    public final void setAuthorizationIdResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorizationIdResponse = str;
    }

    public final void setBinsTableVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.binsTableVersion = str;
    }

    public final void setCipherConfiguration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cipherConfiguration = str;
    }

    public final void setCriptoInfoData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.criptoInfoData = str;
    }

    public final void setHasChip(boolean z10) {
        this.hasChip = z10;
    }

    public final void setHostType$PinPadSdk1032_1_0_32E_release(@NotNull HostType hostType) {
        Intrinsics.checkNotNullParameter(hostType, "");
        this.hostType = hostType;
    }

    public final void setKeyId1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyId1 = str;
    }

    public final void setKeyId2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyId2 = str;
    }

    public final void setLastPan4Digits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastPan4Digits = str;
    }

    public final void setLocalBinsTableIdPrimary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localBinsTableIdPrimary = str;
    }

    public final void setLocalBinsTableIdSecondary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localBinsTableIdSecondary = str;
    }

    public final void setMerchantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.merchantId = str;
    }

    public final void setMerchantType(@NotNull MerchantType merchantType) {
        Intrinsics.checkNotNullParameter(merchantType, "");
        this.merchantType = merchantType;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    public final void setPointOfServiceEntryMode(@NotNull PointOfServiceEntryMode pointOfServiceEntryMode) {
        Intrinsics.checkNotNullParameter(pointOfServiceEntryMode, "");
        this.pointOfServiceEntryMode = pointOfServiceEntryMode;
    }

    public final void setRrn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rrn = str;
    }

    public final void setTerminalSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalSerialNumber = str;
    }

    public final void setTerminalSoftwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalSoftwareVersion = str;
    }

    public final void setTransactionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionAmount = str;
    }

    public final void setTransactionOtherAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionOtherAmount = str;
    }

    public final void setTransactionType(@NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.transactionType = transactionType;
    }
}
