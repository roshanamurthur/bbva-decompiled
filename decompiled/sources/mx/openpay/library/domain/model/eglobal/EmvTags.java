package mx.openpay.library.domain.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmvTags.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u00106\u001a\u00020\u0002\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u00108\u001a\u00020\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0002HÆ\u0003J\u0097\u0002\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00022\b\b\u0002\u00106\u001a\u00020\u00022\b\b\u0002\u00107\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0002HÆ\u0001J\t\u0010:\u001a\u00020\u0002HÖ\u0001J\t\u0010<\u001a\u00020;HÖ\u0001J\u0013\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010A\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010A\u001a\u0004\bS\u0010C\"\u0004\bT\u0010ER\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010A\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010A\u001a\u0004\bY\u0010C\"\u0004\bZ\u0010ER\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010A\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010ER\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010A\u001a\u0004\b_\u0010C\"\u0004\b`\u0010ER\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010A\u001a\u0004\bb\u0010C\"\u0004\bc\u0010ER\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010A\u001a\u0004\be\u0010C\"\u0004\bf\u0010ER\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010A\u001a\u0004\bh\u0010C\"\u0004\bi\u0010ER\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010A\u001a\u0004\bk\u0010C\"\u0004\bl\u0010ER\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010A\u001a\u0004\bn\u0010C\"\u0004\bo\u0010ER\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010A\u001a\u0004\bq\u0010C\"\u0004\br\u0010ER\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010A\u001a\u0004\bt\u0010C\"\u0004\bu\u0010ER\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010A\u001a\u0004\bw\u0010C\"\u0004\bx\u0010ER\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010A\u001a\u0004\bz\u0010C\"\u0004\b{\u0010ER\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010A\u001a\u0004\b}\u0010C\"\u0004\b~\u0010ER$\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010A\u001a\u0005\b\u0080\u0001\u0010C\"\u0005\b\u0081\u0001\u0010ER%\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010A\u001a\u0005\b\u0083\u0001\u0010C\"\u0005\b\u0084\u0001\u0010ER%\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010A\u001a\u0005\b\u0086\u0001\u0010C\"\u0005\b\u0087\u0001\u0010ER%\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010A\u001a\u0005\b\u0089\u0001\u0010C\"\u0005\b\u008a\u0001\u0010ER%\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010A\u001a\u0005\b\u008c\u0001\u0010C\"\u0005\b\u008d\u0001\u0010ER%\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010A\u001a\u0005\b\u008f\u0001\u0010C\"\u0005\b\u0090\u0001\u0010ER%\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010A\u001a\u0005\b\u0092\u0001\u0010C\"\u0005\b\u0093\u0001\u0010E¨\u0006\u0096\u0001"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/EmvTags;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "cardHolderVerification", "cryptoInfo", "cryptogram", "dedicatedFileName", "issuerApplicationData", "secuenceCounter", "transactionCounter", "unpredictableNumber", "verificationResult", "interchangeProfile", "capabilities", "terminalType", "versionNumber", "sequenceNumber", "transactionCurrencyCode", "transactionDate", "transactionType", "transactionAmount", "amountOther", "terminalCountryCode", "interfaceDevice", "transactionCategoryCode", "issuerScriptResult", "formFactorIndicator", "dedicatedFileNameEglobal", "cardHolderVerificationVisa", "terminalRiskManagementData", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getCardHolderVerification", "()Ljava/lang/String;", "setCardHolderVerification", "(Ljava/lang/String;)V", "b", "getCryptoInfo", "setCryptoInfo", "c", "getCryptogram", "setCryptogram", "d", "getDedicatedFileName", "setDedicatedFileName", "e", "getIssuerApplicationData", "setIssuerApplicationData", "f", "getSecuenceCounter", "setSecuenceCounter", "g", "getTransactionCounter", "setTransactionCounter", "h", "getUnpredictableNumber", "setUnpredictableNumber", "i", "getVerificationResult", "setVerificationResult", "j", "getInterchangeProfile", "setInterchangeProfile", "k", "getCapabilities", "setCapabilities", "l", "getTerminalType", "setTerminalType", "m", "getVersionNumber", "setVersionNumber", "n", "getSequenceNumber", "setSequenceNumber", "o", "getTransactionCurrencyCode", "setTransactionCurrencyCode", "p", "getTransactionDate", "setTransactionDate", "q", "getTransactionType", "setTransactionType", "r", "getTransactionAmount", "setTransactionAmount", "s", "getAmountOther", "setAmountOther", "t", "getTerminalCountryCode", "setTerminalCountryCode", "u", "getInterfaceDevice", "setInterfaceDevice", SharedPrefsStorage.VERSION_KEY, "getTransactionCategoryCode", "setTransactionCategoryCode", "w", "getIssuerScriptResult", "setIssuerScriptResult", "x", "getFormFactorIndicator", "setFormFactorIndicator", "y", "getDedicatedFileNameEglobal", "setDedicatedFileNameEglobal", "z", "getCardHolderVerificationVisa", "setCardHolderVerificationVisa", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getTerminalRiskManagementData", "setTerminalRiskManagementData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EmvTags {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public String terminalRiskManagementData;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String cardHolderVerification;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String cryptoInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String cryptogram;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String dedicatedFileName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String issuerApplicationData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String secuenceCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionCounter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String unpredictableNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String verificationResult;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String interchangeProfile;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String capabilities;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String terminalType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String versionNumber;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String sequenceNumber;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionCurrencyCode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String amountOther;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String terminalCountryCode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String interfaceDevice;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String transactionCategoryCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String issuerScriptResult;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String formFactorIndicator;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String dedicatedFileNameEglobal;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String cardHolderVerificationVisa;

    public EmvTags() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
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
    public final String getCardHolderVerificationVisa() {
        return this.cardHolderVerificationVisa;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
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
    public final EmvTags copy(@NotNull String cardHolderVerification, @NotNull String cryptoInfo, @NotNull String cryptogram, @NotNull String dedicatedFileName, @NotNull String issuerApplicationData, @NotNull String secuenceCounter, @NotNull String transactionCounter, @NotNull String unpredictableNumber, @NotNull String verificationResult, @NotNull String interchangeProfile, @NotNull String capabilities, @NotNull String terminalType, @NotNull String versionNumber, @NotNull String sequenceNumber, @NotNull String transactionCurrencyCode, @NotNull String transactionDate, @NotNull String transactionType, @NotNull String transactionAmount, @NotNull String amountOther, @NotNull String terminalCountryCode, @NotNull String interfaceDevice, @NotNull String transactionCategoryCode, @NotNull String issuerScriptResult, @NotNull String formFactorIndicator, @NotNull String dedicatedFileNameEglobal, @NotNull String cardHolderVerificationVisa, @NotNull String terminalRiskManagementData) {
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
        Intrinsics.checkNotNullParameter(cardHolderVerificationVisa, "cardHolderVerificationVisa");
        Intrinsics.checkNotNullParameter(terminalRiskManagementData, "terminalRiskManagementData");
        return new EmvTags(cardHolderVerification, cryptoInfo, cryptogram, dedicatedFileName, issuerApplicationData, secuenceCounter, transactionCounter, unpredictableNumber, verificationResult, interchangeProfile, capabilities, terminalType, versionNumber, sequenceNumber, transactionCurrencyCode, transactionDate, transactionType, transactionAmount, amountOther, terminalCountryCode, interfaceDevice, transactionCategoryCode, issuerScriptResult, formFactorIndicator, dedicatedFileNameEglobal, cardHolderVerificationVisa, terminalRiskManagementData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmvTags)) {
            return false;
        }
        EmvTags emvTags = (EmvTags) other;
        return Intrinsics.areEqual(this.cardHolderVerification, emvTags.cardHolderVerification) && Intrinsics.areEqual(this.cryptoInfo, emvTags.cryptoInfo) && Intrinsics.areEqual(this.cryptogram, emvTags.cryptogram) && Intrinsics.areEqual(this.dedicatedFileName, emvTags.dedicatedFileName) && Intrinsics.areEqual(this.issuerApplicationData, emvTags.issuerApplicationData) && Intrinsics.areEqual(this.secuenceCounter, emvTags.secuenceCounter) && Intrinsics.areEqual(this.transactionCounter, emvTags.transactionCounter) && Intrinsics.areEqual(this.unpredictableNumber, emvTags.unpredictableNumber) && Intrinsics.areEqual(this.verificationResult, emvTags.verificationResult) && Intrinsics.areEqual(this.interchangeProfile, emvTags.interchangeProfile) && Intrinsics.areEqual(this.capabilities, emvTags.capabilities) && Intrinsics.areEqual(this.terminalType, emvTags.terminalType) && Intrinsics.areEqual(this.versionNumber, emvTags.versionNumber) && Intrinsics.areEqual(this.sequenceNumber, emvTags.sequenceNumber) && Intrinsics.areEqual(this.transactionCurrencyCode, emvTags.transactionCurrencyCode) && Intrinsics.areEqual(this.transactionDate, emvTags.transactionDate) && Intrinsics.areEqual(this.transactionType, emvTags.transactionType) && Intrinsics.areEqual(this.transactionAmount, emvTags.transactionAmount) && Intrinsics.areEqual(this.amountOther, emvTags.amountOther) && Intrinsics.areEqual(this.terminalCountryCode, emvTags.terminalCountryCode) && Intrinsics.areEqual(this.interfaceDevice, emvTags.interfaceDevice) && Intrinsics.areEqual(this.transactionCategoryCode, emvTags.transactionCategoryCode) && Intrinsics.areEqual(this.issuerScriptResult, emvTags.issuerScriptResult) && Intrinsics.areEqual(this.formFactorIndicator, emvTags.formFactorIndicator) && Intrinsics.areEqual(this.dedicatedFileNameEglobal, emvTags.dedicatedFileNameEglobal) && Intrinsics.areEqual(this.cardHolderVerificationVisa, emvTags.cardHolderVerificationVisa) && Intrinsics.areEqual(this.terminalRiskManagementData, emvTags.terminalRiskManagementData);
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
    public final String getCardHolderVerificationVisa() {
        return this.cardHolderVerificationVisa;
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
        return this.terminalRiskManagementData.hashCode() + n1.c(this.cardHolderVerificationVisa, n1.c(this.dedicatedFileNameEglobal, n1.c(this.formFactorIndicator, n1.c(this.issuerScriptResult, n1.c(this.transactionCategoryCode, n1.c(this.interfaceDevice, n1.c(this.terminalCountryCode, n1.c(this.amountOther, n1.c(this.transactionAmount, n1.c(this.transactionType, n1.c(this.transactionDate, n1.c(this.transactionCurrencyCode, n1.c(this.sequenceNumber, n1.c(this.versionNumber, n1.c(this.terminalType, n1.c(this.capabilities, n1.c(this.interchangeProfile, n1.c(this.verificationResult, n1.c(this.unpredictableNumber, n1.c(this.transactionCounter, n1.c(this.secuenceCounter, n1.c(this.issuerApplicationData, n1.c(this.dedicatedFileName, n1.c(this.cryptogram, n1.c(this.cryptoInfo, this.cardHolderVerification.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAmountOther(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amountOther = str;
    }

    public final void setCapabilities(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.capabilities = str;
    }

    public final void setCardHolderVerification(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardHolderVerification = str;
    }

    public final void setCardHolderVerificationVisa(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardHolderVerificationVisa = str;
    }

    public final void setCryptoInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cryptoInfo = str;
    }

    public final void setCryptogram(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cryptogram = str;
    }

    public final void setDedicatedFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dedicatedFileName = str;
    }

    public final void setDedicatedFileNameEglobal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dedicatedFileNameEglobal = str;
    }

    public final void setFormFactorIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formFactorIndicator = str;
    }

    public final void setInterchangeProfile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.interchangeProfile = str;
    }

    public final void setInterfaceDevice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.interfaceDevice = str;
    }

    public final void setIssuerApplicationData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issuerApplicationData = str;
    }

    public final void setIssuerScriptResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issuerScriptResult = str;
    }

    public final void setSecuenceCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secuenceCounter = str;
    }

    public final void setSequenceNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sequenceNumber = str;
    }

    public final void setTerminalCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.terminalCountryCode = str;
    }

    public final void setTerminalRiskManagementData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.terminalRiskManagementData = str;
    }

    public final void setTerminalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.terminalType = str;
    }

    public final void setTransactionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionAmount = str;
    }

    public final void setTransactionCategoryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionCategoryCode = str;
    }

    public final void setTransactionCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionCounter = str;
    }

    public final void setTransactionCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionCurrencyCode = str;
    }

    public final void setTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionDate = str;
    }

    public final void setTransactionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionType = str;
    }

    public final void setUnpredictableNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unpredictableNumber = str;
    }

    public final void setVerificationResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verificationResult = str;
    }

    public final void setVersionNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.versionNumber = str;
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
        String str26 = this.cardHolderVerificationVisa;
        String str27 = this.terminalRiskManagementData;
        StringBuilder sbC = a.c("EmvTags(cardHolderVerification=", str, ", cryptoInfo=", str2, ", cryptogram=");
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
        k.e(sbC, str25, ", cardHolderVerificationVisa=", str26, ", terminalRiskManagementData=");
        return d.f(sbC, str27, ")");
    }

    public EmvTags(@NotNull String cardHolderVerification, @NotNull String cryptoInfo, @NotNull String cryptogram, @NotNull String dedicatedFileName, @NotNull String issuerApplicationData, @NotNull String secuenceCounter, @NotNull String transactionCounter, @NotNull String unpredictableNumber, @NotNull String verificationResult, @NotNull String interchangeProfile, @NotNull String capabilities, @NotNull String terminalType, @NotNull String versionNumber, @NotNull String sequenceNumber, @NotNull String transactionCurrencyCode, @NotNull String transactionDate, @NotNull String transactionType, @NotNull String transactionAmount, @NotNull String amountOther, @NotNull String terminalCountryCode, @NotNull String interfaceDevice, @NotNull String transactionCategoryCode, @NotNull String issuerScriptResult, @NotNull String formFactorIndicator, @NotNull String dedicatedFileNameEglobal, @NotNull String cardHolderVerificationVisa, @NotNull String terminalRiskManagementData) {
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
        Intrinsics.checkNotNullParameter(cardHolderVerificationVisa, "cardHolderVerificationVisa");
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
        this.cardHolderVerificationVisa = cardHolderVerificationVisa;
        this.terminalRiskManagementData = terminalRiskManagementData;
    }

    public /* synthetic */ EmvTags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? "" : str8, (i10 & 256) != 0 ? "" : str9, (i10 & 512) != 0 ? "" : str10, (i10 & 1024) != 0 ? "" : str11, (i10 & 2048) != 0 ? "" : str12, (i10 & 4096) != 0 ? "" : str13, (i10 & 8192) != 0 ? "" : str14, (i10 & 16384) != 0 ? "" : str15, (i10 & 32768) != 0 ? "" : str16, (i10 & 65536) != 0 ? "" : str17, (i10 & 131072) != 0 ? "" : str18, (i10 & 262144) != 0 ? "" : str19, (i10 & 524288) != 0 ? "" : str20, (i10 & 1048576) != 0 ? "" : str21, (i10 & 2097152) != 0 ? "" : str22, (i10 & 4194304) != 0 ? "" : str23, (i10 & 8388608) != 0 ? "" : str24, (i10 & 16777216) != 0 ? "" : str25, (i10 & 33554432) != 0 ? "" : str26, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str27);
    }
}
