package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmvTagsRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u008d\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006Z"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/EmvTagsRequestDto;", "", "cardHolderVerification", "", "cryptoInfo", "cryptogram", "dedicatedFileName", "issuerApplicationData", "secuenceCounter", "transactionCounter", "unpredictableNumber", "verificationResult", "interchangeProfile", "capabilities", "terminalType", "versionNumber", "sequenceNumber", "transactionCurrencyCode", "transactionDate", "transactionType", "transactionAmount", "amountOther", "terminalCountryCode", "interfaceDevice", "transactionCategoryCode", "issuerScriptResult", "formFactorIndicator", "dedicatedFileNameEglobal", "terminalRiskManagementData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountOther", "()Ljava/lang/String;", "getCapabilities", "getCardHolderVerification", "getCryptoInfo", "getCryptogram", "getDedicatedFileName", "getDedicatedFileNameEglobal", "getFormFactorIndicator", "getInterchangeProfile", "getInterfaceDevice", "getIssuerApplicationData", "getIssuerScriptResult", "getSecuenceCounter", "getSequenceNumber", "getTerminalCountryCode", "getTerminalRiskManagementData", "getTerminalType", "getTransactionAmount", "getTransactionCategoryCode", "getTransactionCounter", "getTransactionCurrencyCode", "getTransactionDate", "getTransactionType", "getUnpredictableNumber", "getVerificationResult", "getVersionNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EmvTagsRequestDto {

    @SerializedName("amount_other")
    @NotNull
    private final String amountOther;

    @SerializedName("capabilities")
    @NotNull
    private final String capabilities;

    @SerializedName("cardholder_verification")
    @NotNull
    private final String cardHolderVerification;

    @SerializedName("crypto_info")
    @NotNull
    private final String cryptoInfo;

    @SerializedName("cryptogram")
    @NotNull
    private final String cryptogram;

    @SerializedName("dedicated_filename")
    @NotNull
    private final String dedicatedFileName;

    @SerializedName("dedicated_file_name_eglobal")
    @NotNull
    private final String dedicatedFileNameEglobal;

    @SerializedName("form_factor_indicator")
    @NotNull
    private final String formFactorIndicator;

    @SerializedName("interchange_profile")
    @NotNull
    private final String interchangeProfile;

    @SerializedName("interface_device")
    @NotNull
    private final String interfaceDevice;

    @SerializedName("issuer_application_data")
    @NotNull
    private final String issuerApplicationData;

    @SerializedName("issuer_script_result")
    @NotNull
    private final String issuerScriptResult;

    @SerializedName("secuence_counter")
    @NotNull
    private final String secuenceCounter;

    @SerializedName("sequence_number")
    @NotNull
    private final String sequenceNumber;

    @SerializedName("terminal_country_code")
    @NotNull
    private final String terminalCountryCode;

    @SerializedName("terminal_risk_management_data")
    @NotNull
    private final String terminalRiskManagementData;

    @SerializedName("terminal_type")
    @NotNull
    private final String terminalType;

    @SerializedName("transaction_amount")
    @NotNull
    private final String transactionAmount;

    @SerializedName("transaction_category_code")
    @NotNull
    private final String transactionCategoryCode;

    @SerializedName("transaction_counter")
    @NotNull
    private final String transactionCounter;

    @SerializedName("transaction_currency_code")
    @NotNull
    private final String transactionCurrencyCode;

    @SerializedName("transaction_date")
    @NotNull
    private final String transactionDate;

    @SerializedName(SqlContracts.BulletEntry.TRANSACTION_TYPE)
    @NotNull
    private final String transactionType;

    @SerializedName(SqlContracts.BulletEntry.UNPREDICTABLE_NUMBER)
    @NotNull
    private final String unpredictableNumber;

    @SerializedName("verification_result")
    @NotNull
    private final String verificationResult;

    @SerializedName("version_number")
    @NotNull
    private final String versionNumber;

    public EmvTagsRequestDto(@NotNull String cardHolderVerification, @NotNull String cryptoInfo, @NotNull String cryptogram, @NotNull String dedicatedFileName, @NotNull String issuerApplicationData, @NotNull String secuenceCounter, @NotNull String transactionCounter, @NotNull String unpredictableNumber, @NotNull String verificationResult, @NotNull String interchangeProfile, @NotNull String capabilities, @NotNull String terminalType, @NotNull String versionNumber, @NotNull String sequenceNumber, @NotNull String transactionCurrencyCode, @NotNull String transactionDate, @NotNull String transactionType, @NotNull String transactionAmount, @NotNull String amountOther, @NotNull String terminalCountryCode, @NotNull String interfaceDevice, @NotNull String transactionCategoryCode, @NotNull String issuerScriptResult, @NotNull String formFactorIndicator, @NotNull String dedicatedFileNameEglobal, @NotNull String terminalRiskManagementData) {
        Intrinsics.checkNotNullParameter(cardHolderVerification, "cardHolderVerification");
        Intrinsics.checkNotNullParameter(cryptoInfo, "cryptoInfo");
        Intrinsics.checkNotNullParameter(cryptogram, "cryptogram");
        Intrinsics.checkNotNullParameter(dedicatedFileName, "dedicatedFileName");
        Intrinsics.checkNotNullParameter(issuerApplicationData, "issuerApplicationData");
        Intrinsics.checkNotNullParameter(secuenceCounter, "secuenceCounter");
        Intrinsics.checkNotNullParameter(transactionCounter, "transactionCounter");
        Intrinsics.checkNotNullParameter(unpredictableNumber, "unpredictableNumber");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        Intrinsics.checkNotNullParameter(interchangeProfile, "interchangeProfile");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(terminalType, "terminalType");
        Intrinsics.checkNotNullParameter(versionNumber, "versionNumber");
        Intrinsics.checkNotNullParameter(sequenceNumber, "sequenceNumber");
        Intrinsics.checkNotNullParameter(transactionCurrencyCode, "transactionCurrencyCode");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(amountOther, "amountOther");
        Intrinsics.checkNotNullParameter(terminalCountryCode, "terminalCountryCode");
        Intrinsics.checkNotNullParameter(interfaceDevice, "interfaceDevice");
        Intrinsics.checkNotNullParameter(transactionCategoryCode, "transactionCategoryCode");
        Intrinsics.checkNotNullParameter(issuerScriptResult, "issuerScriptResult");
        Intrinsics.checkNotNullParameter(formFactorIndicator, "formFactorIndicator");
        Intrinsics.checkNotNullParameter(dedicatedFileNameEglobal, "dedicatedFileNameEglobal");
        Intrinsics.checkNotNullParameter(terminalRiskManagementData, "terminalRiskManagementData");
        this.cardHolderVerification = cardHolderVerification;
        this.cryptoInfo = cryptoInfo;
        this.cryptogram = cryptogram;
        this.dedicatedFileName = dedicatedFileName;
        this.issuerApplicationData = issuerApplicationData;
        this.secuenceCounter = secuenceCounter;
        this.transactionCounter = transactionCounter;
        this.unpredictableNumber = unpredictableNumber;
        this.verificationResult = verificationResult;
        this.interchangeProfile = interchangeProfile;
        this.capabilities = capabilities;
        this.terminalType = terminalType;
        this.versionNumber = versionNumber;
        this.sequenceNumber = sequenceNumber;
        this.transactionCurrencyCode = transactionCurrencyCode;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.amountOther = amountOther;
        this.terminalCountryCode = terminalCountryCode;
        this.interfaceDevice = interfaceDevice;
        this.transactionCategoryCode = transactionCategoryCode;
        this.issuerScriptResult = issuerScriptResult;
        this.formFactorIndicator = formFactorIndicator;
        this.dedicatedFileNameEglobal = dedicatedFileNameEglobal;
        this.terminalRiskManagementData = terminalRiskManagementData;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardHolderVerification() {
        return this.cardHolderVerification;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInterchangeProfile() {
        return this.interchangeProfile;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCapabilities() {
        return this.capabilities;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTerminalType() {
        return this.terminalType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getVersionNumber() {
        return this.versionNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTransactionAmount() {
        return this.transactionAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAmountOther() {
        return this.amountOther;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getInterfaceDevice() {
        return this.interfaceDevice;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTransactionCategoryCode() {
        return this.transactionCategoryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getIssuerScriptResult() {
        return this.issuerScriptResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFormFactorIndicator() {
        return this.formFactorIndicator;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDedicatedFileNameEglobal() {
        return this.dedicatedFileNameEglobal;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTerminalRiskManagementData() {
        return this.terminalRiskManagementData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptogram() {
        return this.cryptogram;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDedicatedFileName() {
        return this.dedicatedFileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIssuerApplicationData() {
        return this.issuerApplicationData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSecuenceCounter() {
        return this.secuenceCounter;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransactionCounter() {
        return this.transactionCounter;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVerificationResult() {
        return this.verificationResult;
    }

    @NotNull
    public final EmvTagsRequestDto copy(@NotNull String cardHolderVerification, @NotNull String cryptoInfo, @NotNull String cryptogram, @NotNull String dedicatedFileName, @NotNull String issuerApplicationData, @NotNull String secuenceCounter, @NotNull String transactionCounter, @NotNull String unpredictableNumber, @NotNull String verificationResult, @NotNull String interchangeProfile, @NotNull String capabilities, @NotNull String terminalType, @NotNull String versionNumber, @NotNull String sequenceNumber, @NotNull String transactionCurrencyCode, @NotNull String transactionDate, @NotNull String transactionType, @NotNull String transactionAmount, @NotNull String amountOther, @NotNull String terminalCountryCode, @NotNull String interfaceDevice, @NotNull String transactionCategoryCode, @NotNull String issuerScriptResult, @NotNull String formFactorIndicator, @NotNull String dedicatedFileNameEglobal, @NotNull String terminalRiskManagementData) {
        Intrinsics.checkNotNullParameter(cardHolderVerification, "cardHolderVerification");
        Intrinsics.checkNotNullParameter(cryptoInfo, "cryptoInfo");
        Intrinsics.checkNotNullParameter(cryptogram, "cryptogram");
        Intrinsics.checkNotNullParameter(dedicatedFileName, "dedicatedFileName");
        Intrinsics.checkNotNullParameter(issuerApplicationData, "issuerApplicationData");
        Intrinsics.checkNotNullParameter(secuenceCounter, "secuenceCounter");
        Intrinsics.checkNotNullParameter(transactionCounter, "transactionCounter");
        Intrinsics.checkNotNullParameter(unpredictableNumber, "unpredictableNumber");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        Intrinsics.checkNotNullParameter(interchangeProfile, "interchangeProfile");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(terminalType, "terminalType");
        Intrinsics.checkNotNullParameter(versionNumber, "versionNumber");
        Intrinsics.checkNotNullParameter(sequenceNumber, "sequenceNumber");
        Intrinsics.checkNotNullParameter(transactionCurrencyCode, "transactionCurrencyCode");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(amountOther, "amountOther");
        Intrinsics.checkNotNullParameter(terminalCountryCode, "terminalCountryCode");
        Intrinsics.checkNotNullParameter(interfaceDevice, "interfaceDevice");
        Intrinsics.checkNotNullParameter(transactionCategoryCode, "transactionCategoryCode");
        Intrinsics.checkNotNullParameter(issuerScriptResult, "issuerScriptResult");
        Intrinsics.checkNotNullParameter(formFactorIndicator, "formFactorIndicator");
        Intrinsics.checkNotNullParameter(dedicatedFileNameEglobal, "dedicatedFileNameEglobal");
        Intrinsics.checkNotNullParameter(terminalRiskManagementData, "terminalRiskManagementData");
        return new EmvTagsRequestDto(cardHolderVerification, cryptoInfo, cryptogram, dedicatedFileName, issuerApplicationData, secuenceCounter, transactionCounter, unpredictableNumber, verificationResult, interchangeProfile, capabilities, terminalType, versionNumber, sequenceNumber, transactionCurrencyCode, transactionDate, transactionType, transactionAmount, amountOther, terminalCountryCode, interfaceDevice, transactionCategoryCode, issuerScriptResult, formFactorIndicator, dedicatedFileNameEglobal, terminalRiskManagementData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmvTagsRequestDto)) {
            return false;
        }
        EmvTagsRequestDto emvTagsRequestDto = (EmvTagsRequestDto) other;
        return Intrinsics.areEqual(this.cardHolderVerification, emvTagsRequestDto.cardHolderVerification) && Intrinsics.areEqual(this.cryptoInfo, emvTagsRequestDto.cryptoInfo) && Intrinsics.areEqual(this.cryptogram, emvTagsRequestDto.cryptogram) && Intrinsics.areEqual(this.dedicatedFileName, emvTagsRequestDto.dedicatedFileName) && Intrinsics.areEqual(this.issuerApplicationData, emvTagsRequestDto.issuerApplicationData) && Intrinsics.areEqual(this.secuenceCounter, emvTagsRequestDto.secuenceCounter) && Intrinsics.areEqual(this.transactionCounter, emvTagsRequestDto.transactionCounter) && Intrinsics.areEqual(this.unpredictableNumber, emvTagsRequestDto.unpredictableNumber) && Intrinsics.areEqual(this.verificationResult, emvTagsRequestDto.verificationResult) && Intrinsics.areEqual(this.interchangeProfile, emvTagsRequestDto.interchangeProfile) && Intrinsics.areEqual(this.capabilities, emvTagsRequestDto.capabilities) && Intrinsics.areEqual(this.terminalType, emvTagsRequestDto.terminalType) && Intrinsics.areEqual(this.versionNumber, emvTagsRequestDto.versionNumber) && Intrinsics.areEqual(this.sequenceNumber, emvTagsRequestDto.sequenceNumber) && Intrinsics.areEqual(this.transactionCurrencyCode, emvTagsRequestDto.transactionCurrencyCode) && Intrinsics.areEqual(this.transactionDate, emvTagsRequestDto.transactionDate) && Intrinsics.areEqual(this.transactionType, emvTagsRequestDto.transactionType) && Intrinsics.areEqual(this.transactionAmount, emvTagsRequestDto.transactionAmount) && Intrinsics.areEqual(this.amountOther, emvTagsRequestDto.amountOther) && Intrinsics.areEqual(this.terminalCountryCode, emvTagsRequestDto.terminalCountryCode) && Intrinsics.areEqual(this.interfaceDevice, emvTagsRequestDto.interfaceDevice) && Intrinsics.areEqual(this.transactionCategoryCode, emvTagsRequestDto.transactionCategoryCode) && Intrinsics.areEqual(this.issuerScriptResult, emvTagsRequestDto.issuerScriptResult) && Intrinsics.areEqual(this.formFactorIndicator, emvTagsRequestDto.formFactorIndicator) && Intrinsics.areEqual(this.dedicatedFileNameEglobal, emvTagsRequestDto.dedicatedFileNameEglobal) && Intrinsics.areEqual(this.terminalRiskManagementData, emvTagsRequestDto.terminalRiskManagementData);
    }

    @NotNull
    public final String getAmountOther() {
        return this.amountOther;
    }

    @NotNull
    public final String getCapabilities() {
        return this.capabilities;
    }

    @NotNull
    public final String getCardHolderVerification() {
        return this.cardHolderVerification;
    }

    @NotNull
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    @NotNull
    public final String getCryptogram() {
        return this.cryptogram;
    }

    @NotNull
    public final String getDedicatedFileName() {
        return this.dedicatedFileName;
    }

    @NotNull
    public final String getDedicatedFileNameEglobal() {
        return this.dedicatedFileNameEglobal;
    }

    @NotNull
    public final String getFormFactorIndicator() {
        return this.formFactorIndicator;
    }

    @NotNull
    public final String getInterchangeProfile() {
        return this.interchangeProfile;
    }

    @NotNull
    public final String getInterfaceDevice() {
        return this.interfaceDevice;
    }

    @NotNull
    public final String getIssuerApplicationData() {
        return this.issuerApplicationData;
    }

    @NotNull
    public final String getIssuerScriptResult() {
        return this.issuerScriptResult;
    }

    @NotNull
    public final String getSecuenceCounter() {
        return this.secuenceCounter;
    }

    @NotNull
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    public final String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    @NotNull
    public final String getTerminalRiskManagementData() {
        return this.terminalRiskManagementData;
    }

    @NotNull
    public final String getTerminalType() {
        return this.terminalType;
    }

    @NotNull
    public final String getTransactionAmount() {
        return this.transactionAmount;
    }

    @NotNull
    public final String getTransactionCategoryCode() {
        return this.transactionCategoryCode;
    }

    @NotNull
    public final String getTransactionCounter() {
        return this.transactionCounter;
    }

    @NotNull
    public final String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    @NotNull
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    public final String getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    @NotNull
    public final String getVerificationResult() {
        return this.verificationResult;
    }

    @NotNull
    public final String getVersionNumber() {
        return this.versionNumber;
    }

    public int hashCode() {
        return this.terminalRiskManagementData.hashCode() + n1.c(this.dedicatedFileNameEglobal, n1.c(this.formFactorIndicator, n1.c(this.issuerScriptResult, n1.c(this.transactionCategoryCode, n1.c(this.interfaceDevice, n1.c(this.terminalCountryCode, n1.c(this.amountOther, n1.c(this.transactionAmount, n1.c(this.transactionType, n1.c(this.transactionDate, n1.c(this.transactionCurrencyCode, n1.c(this.sequenceNumber, n1.c(this.versionNumber, n1.c(this.terminalType, n1.c(this.capabilities, n1.c(this.interchangeProfile, n1.c(this.verificationResult, n1.c(this.unpredictableNumber, n1.c(this.transactionCounter, n1.c(this.secuenceCounter, n1.c(this.issuerApplicationData, n1.c(this.dedicatedFileName, n1.c(this.cryptogram, n1.c(this.cryptoInfo, this.cardHolderVerification.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.cardHolderVerification;
        String str2 = this.cryptoInfo;
        String str3 = this.cryptogram;
        String str4 = this.dedicatedFileName;
        String str5 = this.issuerApplicationData;
        String str6 = this.secuenceCounter;
        String str7 = this.transactionCounter;
        String str8 = this.unpredictableNumber;
        String str9 = this.verificationResult;
        String str10 = this.interchangeProfile;
        String str11 = this.capabilities;
        String str12 = this.terminalType;
        String str13 = this.versionNumber;
        String str14 = this.sequenceNumber;
        String str15 = this.transactionCurrencyCode;
        String str16 = this.transactionDate;
        String str17 = this.transactionType;
        String str18 = this.transactionAmount;
        String str19 = this.amountOther;
        String str20 = this.terminalCountryCode;
        String str21 = this.interfaceDevice;
        String str22 = this.transactionCategoryCode;
        String str23 = this.issuerScriptResult;
        String str24 = this.formFactorIndicator;
        String str25 = this.dedicatedFileNameEglobal;
        String str26 = this.terminalRiskManagementData;
        StringBuilder sbC = a.c("EmvTagsRequestDto(cardHolderVerification=", str, ", cryptoInfo=", str2, ", cryptogram=");
        k.e(sbC, str3, ", dedicatedFileName=", str4, ", issuerApplicationData=");
        k.e(sbC, str5, ", secuenceCounter=", str6, ", transactionCounter=");
        k.e(sbC, str7, ", unpredictableNumber=", str8, ", verificationResult=");
        k.e(sbC, str9, ", interchangeProfile=", str10, ", capabilities=");
        k.e(sbC, str11, ", terminalType=", str12, ", versionNumber=");
        k.e(sbC, str13, ", sequenceNumber=", str14, ", transactionCurrencyCode=");
        k.e(sbC, str15, ", transactionDate=", str16, ", transactionType=");
        k.e(sbC, str17, ", transactionAmount=", str18, ", amountOther=");
        k.e(sbC, str19, ", terminalCountryCode=", str20, ", interfaceDevice=");
        k.e(sbC, str21, ", transactionCategoryCode=", str22, ", issuerScriptResult=");
        k.e(sbC, str23, ", formFactorIndicator=", str24, ", dedicatedFileNameEglobal=");
        return c.b(sbC, str25, ", terminalRiskManagementData=", str26, ")");
    }
}
