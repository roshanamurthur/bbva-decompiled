package com.viergegroup.sdk.taptophone.vierge.models;

import com.viergegroup.sdk.taptophone.vierge.commons.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001BW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u000fB?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0011B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0014J\u0006\u0010b\u001a\u00020cJ\u0006\u0010d\u001a\u00020eJ\u0006\u0010f\u001a\u00020\u0003R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001dR\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001a\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR\u001a\u0010D\u001a\u00020EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001b\"\u0004\bK\u0010\u001dR\u001a\u0010L\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001b\"\u0004\bN\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u0010\u001dR\u001a\u0010Q\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001b\"\u0004\bS\u0010\u001dR\u001a\u0010T\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u001b\"\u0004\bV\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u0010\u001dR\u001a\u0010Y\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u001b\"\u0004\b[\u0010\u001dR\u001a\u0010\\\u001a\u00020]X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006g"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionBackendParameters;", "", "hostName", "", "merchantTypeName", "transactionTypeName", "transactionAmount", "authorizationIdResponse", "apiVersion", "Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;", "keyId1", "keyId2", "orderId", "merchantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;)V", "rrn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;)V", "otherTransactionAmount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;)V", "getApiVersion", "()Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;", "setApiVersion", "(Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;)V", "applicationVersionNumber", "getApplicationVersionNumber", "()Ljava/lang/String;", "setApplicationVersionNumber", "(Ljava/lang/String;)V", "getAuthorizationIdResponse", "setAuthorizationIdResponse", "binsTableVersion", "getBinsTableVersion", "setBinsTableVersion", "cipherConfiguration", "getCipherConfiguration", "setCipherConfiguration", "criptoInfoData", "getCriptoInfoData", "setCriptoInfoData", "hasChip", "", "getHasChip", "()Z", "setHasChip", "(Z)V", "hostType", "Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "getHostType$PinPadSdk1032_1_0_32E_release", "()Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "setHostType$PinPadSdk1032_1_0_32E_release", "(Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;)V", "getKeyId1", "setKeyId1", "getKeyId2", "setKeyId2", "lastPan4Digits", "getLastPan4Digits", "setLastPan4Digits", "localBinsTableIdPrimary", "getLocalBinsTableIdPrimary", "setLocalBinsTableIdPrimary", "localBinsTableIdSecondary", "getLocalBinsTableIdSecondary", "setLocalBinsTableIdSecondary", "getMerchantId", "setMerchantId", "merchantType", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "getMerchantType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "setMerchantType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;)V", "getOrderId", "setOrderId", "pointOfServiceEntryMode", "getPointOfServiceEntryMode", "setPointOfServiceEntryMode", "getRrn", "setRrn", "terminalSerialNumber", "getTerminalSerialNumber", "setTerminalSerialNumber", "terminalSoftwareVersion", "getTerminalSoftwareVersion", "setTerminalSoftwareVersion", "getTransactionAmount", "setTransactionAmount", "transactionOtherAmount", "getTransactionOtherAmount", "setTransactionOtherAmount", "transactionType", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "getTransactionType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "setTransactionType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;)V", "convertMPPTransactionParameters", "Lcom/viergegroup/sdk/taptophone/vierge/models/MPPTransactionParameters;", "getMetaBytes", "", "getMetaBytesString", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionBackendParameters {

    @NotNull
    private ApiVersion apiVersion;

    @NotNull
    private String applicationVersionNumber;

    @NotNull
    private String authorizationIdResponse;

    @NotNull
    private String binsTableVersion;

    @NotNull
    private String cipherConfiguration;

    @NotNull
    private String criptoInfoData;
    private boolean hasChip;

    @NotNull
    private HostType hostType;

    @NotNull
    private String keyId1;

    @NotNull
    private String keyId2;

    @NotNull
    private String lastPan4Digits;

    @NotNull
    private String localBinsTableIdPrimary;

    @NotNull
    private String localBinsTableIdSecondary;

    @NotNull
    private String merchantId;

    @NotNull
    private MerchantType merchantType;

    @NotNull
    private String orderId;

    @NotNull
    private String pointOfServiceEntryMode;

    @NotNull
    private String rrn;

    @NotNull
    private String terminalSerialNumber;

    @NotNull
    private String terminalSoftwareVersion;

    @NotNull
    private String transactionAmount;

    @NotNull
    private String transactionOtherAmount;

    @NotNull
    private TransactionType transactionType;

    public TransactionBackendParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ApiVersion apiVersion, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(apiVersion, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.hostType = HostType.TestingDUKPTHost;
        this.merchantType = MerchantType.Undefined;
        this.transactionType = TransactionType.Undefined;
        this.transactionAmount = "";
        this.transactionOtherAmount = "";
        this.authorizationIdResponse = "";
        this.terminalSerialNumber = "";
        this.pointOfServiceEntryMode = "071";
        this.terminalSoftwareVersion = "";
        this.cipherConfiguration = "";
        this.localBinsTableIdPrimary = "00000000";
        this.localBinsTableIdSecondary = "00000000";
        this.binsTableVersion = "00";
        this.criptoInfoData = "00";
        this.lastPan4Digits = "";
        this.applicationVersionNumber = "1.0.01";
        this.rrn = "";
        this.apiVersion = ApiVersion.Version2;
        this.keyId1 = "";
        this.keyId2 = "";
        this.orderId = "";
        this.merchantId = "";
        this.merchantType = MerchantType.INSTANCE.fromMerchantName(str2);
        this.transactionType = TransactionType.INSTANCE.fromTransactionTypeName(str3);
        this.hostType = HostType.INSTANCE.fromName(str);
        this.apiVersion = apiVersion;
        this.transactionAmount = StringsKt__StringsKt.padStart(l.replace$default(str4, Constant.DOT_STRING, "", false, 4, (Object) null), 12, '0');
        this.authorizationIdResponse = StringsKt__StringsKt.padStart(str5, 6, '0');
        this.keyId1 = str6;
        this.keyId2 = str7;
        this.orderId = str8;
        this.merchantId = str9;
    }

    @NotNull
    public final MPPTransactionParameters convertMPPTransactionParameters() {
        long j10;
        MPPTransactionParameters mPPTransactionParameters = new MPPTransactionParameters();
        try {
            j10 = Long.parseLong(this.transactionAmount);
        } catch (Exception unused) {
            j10 = 0;
        }
        mPPTransactionParameters.setTransactionAmount(j10);
        TransactionType transactionType = this.transactionType;
        if (transactionType == TransactionType.Sale) {
            mPPTransactionParameters.setTransactionType(com.mypinpad.tsdk.api.models.TransactionType.PURCHASE);
        } else if (transactionType == TransactionType.Refund) {
            mPPTransactionParameters.setTransactionType(com.mypinpad.tsdk.api.models.TransactionType.REFUND);
        }
        return mPPTransactionParameters;
    }

    @NotNull
    public final ApiVersion getApiVersion() {
        return this.apiVersion;
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
    public final byte[] getMetaBytes() {
        TransactionBackendParametersMeta transactionBackendParametersMeta = new TransactionBackendParametersMeta();
        transactionBackendParametersMeta.setHostType$PinPadSdk1032_1_0_32E_release(this.hostType);
        transactionBackendParametersMeta.setMerchantType(this.merchantType);
        transactionBackendParametersMeta.setAuthorizationIdResponse(this.authorizationIdResponse);
        transactionBackendParametersMeta.setTransactionType(this.transactionType);
        transactionBackendParametersMeta.setTransactionAmount(this.transactionAmount);
        transactionBackendParametersMeta.setTransactionOtherAmount(this.transactionOtherAmount);
        transactionBackendParametersMeta.setTerminalSerialNumber(this.terminalSerialNumber);
        transactionBackendParametersMeta.setPointOfServiceEntryMode(PointOfServiceEntryMode.INSTANCE.fromPointServiceEntryModeId(this.pointOfServiceEntryMode));
        transactionBackendParametersMeta.setLastPan4Digits(this.lastPan4Digits);
        transactionBackendParametersMeta.setRrn(this.rrn);
        transactionBackendParametersMeta.setApiVersion(this.apiVersion);
        transactionBackendParametersMeta.setKeyId1(this.keyId1);
        transactionBackendParametersMeta.setKeyId2(this.keyId2);
        transactionBackendParametersMeta.setOrderId(this.orderId);
        transactionBackendParametersMeta.setMerchantId(this.merchantId);
        return StringUtils.INSTANCE.encodeBase64Bytes(transactionBackendParametersMeta);
    }

    @NotNull
    public final String getMetaBytesString() {
        TransactionBackendParametersMeta transactionBackendParametersMeta = new TransactionBackendParametersMeta();
        transactionBackendParametersMeta.setHostType$PinPadSdk1032_1_0_32E_release(this.hostType);
        transactionBackendParametersMeta.setMerchantType(this.merchantType);
        transactionBackendParametersMeta.setAuthorizationIdResponse(this.authorizationIdResponse);
        transactionBackendParametersMeta.setTransactionType(this.transactionType);
        transactionBackendParametersMeta.setTransactionAmount(this.transactionAmount);
        transactionBackendParametersMeta.setTerminalSerialNumber(this.terminalSerialNumber);
        transactionBackendParametersMeta.setPointOfServiceEntryMode(PointOfServiceEntryMode.INSTANCE.fromPointServiceEntryModeId(this.pointOfServiceEntryMode));
        transactionBackendParametersMeta.setLastPan4Digits(this.lastPan4Digits);
        transactionBackendParametersMeta.setRrn(this.rrn);
        return StringUtils.INSTANCE.encodeBase64String(transactionBackendParametersMeta);
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getPointOfServiceEntryMode() {
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
        this.apiVersion = apiVersion;
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

    public final void setPointOfServiceEntryMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pointOfServiceEntryMode = str;
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

    public TransactionBackendParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ApiVersion apiVersion) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(apiVersion, "");
        this.hostType = HostType.TestingDUKPTHost;
        this.merchantType = MerchantType.Undefined;
        this.transactionType = TransactionType.Undefined;
        this.transactionAmount = "";
        this.transactionOtherAmount = "";
        this.authorizationIdResponse = "";
        this.terminalSerialNumber = "";
        this.pointOfServiceEntryMode = "071";
        this.terminalSoftwareVersion = "";
        this.cipherConfiguration = "";
        this.localBinsTableIdPrimary = "00000000";
        this.localBinsTableIdSecondary = "00000000";
        this.binsTableVersion = "00";
        this.criptoInfoData = "00";
        this.lastPan4Digits = "";
        this.applicationVersionNumber = "1.0.01";
        this.rrn = "";
        this.apiVersion = ApiVersion.Version2;
        this.keyId1 = "";
        this.keyId2 = "";
        this.orderId = "";
        this.merchantId = "";
        this.merchantType = MerchantType.INSTANCE.fromMerchantName(str2);
        this.transactionType = TransactionType.INSTANCE.fromTransactionTypeName(str3);
        this.hostType = HostType.INSTANCE.fromName(str);
        this.apiVersion = apiVersion;
        this.transactionAmount = StringsKt__StringsKt.padStart(l.replace$default(str4, Constant.DOT_STRING, "", false, 4, (Object) null), 12, '0');
        this.authorizationIdResponse = StringsKt__StringsKt.padStart(str5, 6, '0');
    }

    public TransactionBackendParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ApiVersion apiVersion) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(apiVersion, "");
        this.hostType = HostType.TestingDUKPTHost;
        this.merchantType = MerchantType.Undefined;
        this.transactionType = TransactionType.Undefined;
        this.transactionAmount = "";
        this.transactionOtherAmount = "";
        this.authorizationIdResponse = "";
        this.terminalSerialNumber = "";
        this.pointOfServiceEntryMode = "071";
        this.terminalSoftwareVersion = "";
        this.cipherConfiguration = "";
        this.localBinsTableIdPrimary = "00000000";
        this.localBinsTableIdSecondary = "00000000";
        this.binsTableVersion = "00";
        this.criptoInfoData = "00";
        this.lastPan4Digits = "";
        this.applicationVersionNumber = "1.0.01";
        this.rrn = "";
        this.apiVersion = ApiVersion.Version2;
        this.keyId1 = "";
        this.keyId2 = "";
        this.orderId = "";
        this.merchantId = "";
        this.merchantType = MerchantType.INSTANCE.fromMerchantName(str2);
        this.transactionType = TransactionType.INSTANCE.fromTransactionTypeName(str3);
        this.hostType = HostType.INSTANCE.fromName(str);
        this.apiVersion = apiVersion;
        this.transactionAmount = StringsKt__StringsKt.padStart(l.replace$default(str4, Constant.DOT_STRING, "", false, 4, (Object) null), 12, '0');
        this.authorizationIdResponse = StringsKt__StringsKt.padStart(str5, 6, '0');
        this.rrn = StringsKt__StringsKt.padStart(str6, 12, '0');
    }

    public TransactionBackendParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, double d2, @NotNull ApiVersion apiVersion) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(apiVersion, "");
        this.hostType = HostType.TestingDUKPTHost;
        this.merchantType = MerchantType.Undefined;
        this.transactionType = TransactionType.Undefined;
        this.transactionAmount = "";
        this.transactionOtherAmount = "";
        this.authorizationIdResponse = "";
        this.terminalSerialNumber = "";
        this.pointOfServiceEntryMode = "071";
        this.terminalSoftwareVersion = "";
        this.cipherConfiguration = "";
        this.localBinsTableIdPrimary = "00000000";
        this.localBinsTableIdSecondary = "00000000";
        this.binsTableVersion = "00";
        this.criptoInfoData = "00";
        this.lastPan4Digits = "";
        this.applicationVersionNumber = "1.0.01";
        this.rrn = "";
        this.apiVersion = ApiVersion.Version2;
        this.keyId1 = "";
        this.keyId2 = "";
        this.orderId = "";
        this.merchantId = "";
        this.merchantType = MerchantType.INSTANCE.fromMerchantName(str2);
        this.transactionType = TransactionType.INSTANCE.fromTransactionTypeName(str3);
        this.hostType = HostType.INSTANCE.fromName(str);
        this.apiVersion = apiVersion;
        this.transactionAmount = StringsKt__StringsKt.padStart(l.replace$default(str4, Constant.DOT_STRING, "", false, 4, (Object) null), 12, '0');
        this.transactionOtherAmount = StringsKt__StringsKt.padStart(l.replace$default(String.valueOf(d2), Constant.DOT_STRING, "", false, 4, (Object) null), 12, '0');
        this.authorizationIdResponse = StringsKt__StringsKt.padStart(str5, 6, '0');
        this.apiVersion = apiVersion;
    }
}
