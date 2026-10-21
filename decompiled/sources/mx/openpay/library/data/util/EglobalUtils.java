package mx.openpay.library.data.util;

import ai.a;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J&\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u000fR\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010$R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010$R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010$R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010$R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010$R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010$R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00104\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010$R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010$R\u0014\u00106\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010$R\u0014\u00107\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010$R\u0014\u00108\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010$R\u0014\u00109\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010$R\u0014\u0010:\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010$R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010$R\u0014\u0010<\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010$R\u0014\u0010=\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010$R\u0014\u0010>\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010$R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010$R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010$R\u0014\u0010A\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010$R\u0014\u0010B\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010$R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010$R\u0014\u0010D\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010$R\u0014\u0010E\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010$R\u0014\u0010F\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010$R\u0014\u0010G\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010$R\u0014\u0010H\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010$R\u0014\u0010I\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010$R\u0014\u0010J\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010$R\u0014\u0010K\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010$R\u0014\u0010L\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010$R\u0014\u0010M\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010$R\u0014\u0010N\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010$R\u0014\u0010O\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010$R\u0014\u0010P\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010$R\u0014\u0010Q\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010$R\u0014\u0010R\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010$R\u0014\u0010S\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010$R\u0014\u0010T\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010$R\u0014\u0010U\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010$R\u0014\u0010V\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010$R\u0014\u0010W\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010$R\u0014\u0010X\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010$R\u0014\u0010Y\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010$R\u0014\u0010Z\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010$R\u0014\u0010[\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010$R\u0014\u0010\\\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010$R\u0014\u0010]\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010$R\u0014\u0010^\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010$R\u0014\u0010_\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010$R\u0014\u0010`\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010$R\u0014\u0010a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010$R\u0014\u0010b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010$R\u0014\u0010c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010$R\u0014\u0010d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010$R\u0014\u0010e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010$R\u0014\u0010f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010$R\u0014\u0010g\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010$R\u0014\u0010h\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010$R\u0014\u0010i\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bi\u0010$R\u0014\u0010j\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bj\u0010$R\u0014\u0010k\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bk\u0010$R\u0014\u0010l\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bl\u0010$R\u0014\u0010m\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bm\u0010$R\u0014\u0010n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bn\u0010$R\u0014\u0010o\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bo\u0010$R\u0014\u0010p\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bp\u0010$R\u0014\u0010q\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bq\u0010$R\u0014\u0010r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010$R\u0014\u0010s\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bs\u0010$R\u0014\u0010t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010$R\u0014\u0010u\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010$R\u0014\u0010v\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010$R\u0014\u0010w\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010$R\u0014\u0010x\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010{\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b{\u0010$R\u0014\u0010|\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010$R\u0014\u0010}\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010$R\u0014\u0010~\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010$R\u0014\u0010\u007f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010$R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010yR#\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0081\u00018\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0089\u0001"}, d2 = {"Lmx/openpay/library/data/util/EglobalUtils;", "", "", "token", "", "getTokenEzInformation", "emvData", "getSplitEmvValue", "cardBin", "readMode", "", "slotKey", "", PushConstants.AMOUNT, "getToken9F34", "", "validateTokenAdditionalInformation", "issuerScript71", "issuerScript72", "", "validateIssuerScripts", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "issuerAuthData", "getLongitudeIssuerAutData", "Ljava/math/BigDecimal;", "parseAmount", "isCharge", "getTxnType", "tag9F34", "requiresSignatureAMEXMC", "tag9F66", "requiresSignatureVisa", "status", "isForToP", "isSuccessStatusCommand", "RESPONSE_CODE_00", "Ljava/lang/String;", "RESPONSE_CODE_01", "RESPONSE_CODE_05", "HOST_STATUS_00", "HOST_STATUS_01", "HOST_STATUS_02", "ISSUER_AUTH_DATA_91", "ISSUER_AUTH_DATA_9100", "CONNECTION_TYPE_BLUETOOTH", "ERROR_CODE_ENTRY", "HTTP_CODE_ENTRY", "STATUS_ENTRY", "DESCRIPTION_ENTRY", "MESSAGE_ENTRY", "TRANSACTION_ENTRY", "TRANSACTION_RESPONSE_CODE_00", "PIN_STATUS_NO_NIP_REQUIRED", "PIN_STATUS_LOCK", "ACC_00", "GATEWAY_CARD_PRESENT_BANCOMER", "DEVICE_PAX", "DEVICE_BBVA", "DEVICE_OPENPAY", "DEVICE_VIERGE", "DEVICE_INBURSA", "SERIAL_KEY", "REAL_COUNTER", "TRACK2_LENGTH", "TRACK2", "TRACK2_CRC", "INTERCHANGE_PROFILE", "TRANSACTION_COUNTER", "UNPREDICTABLE_NUMBER", "ISSUER_APPLICATION_DATA", "CAPABILITIES", "TERMINAL_TYPE", "VERSION_NUMBER", "SEQUENCE_NUMBER", "TRANSACTION_CURRENCY_CODE", "DEDICATED_FILE_NAME_E_GLOBAL", "TRANSACTION_DATE", "TRANSACTION_TYPE", "TRANSACTION_AMOUNT", "AMOUNT_OTHER", "TERMINAL_COUNTRY_CODE", "INTERFACE_DEVICE", "SEQUENCE_COUNTER", "TRANSACTION_CATEGORY_CODE", "ISSUER_SCRIPT_RESULT", "FORM_FACTOR_INDICATOR", "CRYPTO_INFO", "VERIFICATION_RESULT", "CRYPTOGRAM", "CARD_HOLDER_VERIFICATION", "DEDICATED_FILE_NAME", "APPLICATION_PREFERRED_NAME", "APPLICATION_LABEL", "CARD_HOLDER_VERIFICATION_VISA", "TERMINAL_RISK_MANAGEMENT_DATA", "READ_MODE_CONTACTLESS_EMV", "READ_MODE_CONTACTLESS_MSD", "READ_MODE_MAGNETIC_STRIPE", "READ_MODE_FALLBACK", "READ_MODE_CHIP", "CARD_REMOVED", "UNSUPPORTED_CARD", "CARD_EXPIRED", "CANCELLED", "KEY_DERIVATION_FAILED_TIMEOUT", "CONNECTION_READ_TIMEOUT_FAILED", "ERROR_MESSAGE", "INVALID_DATA", "INVALID_COMMAND", "INVALID_ISSUER_AUTHENTICATION", "KEY_DERIVATION_FAILED", "INITIALIZED_KEYS_WRONG_COMMAND", "NOT_INIT_KEYS", "READ_CARD_ERROR", "CARD_NOT_SUPPORTED", "INTERNAL_ERROR", "CONNECTION_ADDRESS_INVALID", "NO_NFC", "NFC_DISABLE", "DECIMAL_FORMAT_PATTERN", "FLAG_RENEW_KEYS_NEEDED_RECONNECT", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "FLAG_RENEW_KEYS_NEEDED", "CODE_VALIDATE_SIGNATURE_AMEXMC_01", "CODE_VALIDATE_SIGNATURE_AMEXMC_02", "CODE_VALIDATE_SIGNATURE_AMEXMC_03", "DOUBLE_AUTH_VISA_CODE", "DOUBLE_AUTH_MC_CODE", "DOUBLE_AUTH_ERROR_CODE", "", "b", "Ljava/util/List;", "getFLAGS_RENEW_KEYS_NEEDED", "()Ljava/util/List;", "FLAGS_RENEW_KEYS_NEEDED", "<init>", "()V", "data_release"}, k = 1, mv = {1, 8, 0})
public final class EglobalUtils {

    @NotNull
    public static final String ACC_00 = "00";

    @NotNull
    public static final String AMOUNT_OTHER = "9F03";

    @NotNull
    public static final String APPLICATION_LABEL = "50";

    @NotNull
    public static final String CANCELLED = "99";

    @NotNull
    public static final String CARD_EXPIRED = "29";

    @NotNull
    public static final String CARD_HOLDER_VERIFICATION_VISA = "9F66";

    @NotNull
    public static final String CARD_NOT_SUPPORTED = "25";

    @NotNull
    public static final String CARD_REMOVED = "23";

    @NotNull
    public static final String CODE_VALIDATE_SIGNATURE_AMEXMC_01 = "000011";

    @NotNull
    public static final String CODE_VALIDATE_SIGNATURE_AMEXMC_02 = "000101";

    @NotNull
    public static final String CODE_VALIDATE_SIGNATURE_AMEXMC_03 = "011110";

    @NotNull
    public static final String CONNECTION_ADDRESS_INVALID = "02";

    @NotNull
    public static final String CONNECTION_READ_TIMEOUT_FAILED = "01";

    @NotNull
    public static final String CONNECTION_TYPE_BLUETOOTH = "BT";

    @NotNull
    public static final String DECIMAL_FORMAT_PATTERN = "0.00";

    @NotNull
    public static final String DESCRIPTION_ENTRY = "description";

    @NotNull
    public static final String DEVICE_BBVA = "bbva";

    @NotNull
    public static final String DEVICE_INBURSA = "inbursa";

    @NotNull
    public static final String DEVICE_OPENPAY = "openpay";

    @NotNull
    public static final String DEVICE_PAX = "pax";

    @NotNull
    public static final String DEVICE_VIERGE = "vierge";
    public static final int DOUBLE_AUTH_ERROR_CODE = 899;

    @NotNull
    public static final String DOUBLE_AUTH_MC_CODE = "65";

    @NotNull
    public static final String DOUBLE_AUTH_VISA_CODE = "1A";

    @NotNull
    public static final String ERROR_CODE_ENTRY = "error_code";

    @NotNull
    public static final String ERROR_MESSAGE = "01";
    public static final int FLAG_RENEW_KEYS_NEEDED = 2;
    public static final int FLAG_RENEW_KEYS_NEEDED_RECONNECT = 1;

    @NotNull
    public static final String GATEWAY_CARD_PRESENT_BANCOMER = "bancomer";

    @NotNull
    public static final String HOST_STATUS_00 = "00";

    @NotNull
    public static final String HOST_STATUS_01 = "01";

    @NotNull
    public static final String HOST_STATUS_02 = "02";

    @NotNull
    public static final String HTTP_CODE_ENTRY = "http_code";

    @NotNull
    public static final String INITIALIZED_KEYS_WRONG_COMMAND = "61";

    @NotNull
    public static final String INTERNAL_ERROR = "73";

    @NotNull
    public static final String INVALID_COMMAND = "99";

    @NotNull
    public static final String INVALID_DATA = "02";

    @NotNull
    public static final String INVALID_ISSUER_AUTHENTICATION = "-6";

    @NotNull
    public static final String ISSUER_AUTH_DATA_91 = "91";

    @NotNull
    public static final String ISSUER_AUTH_DATA_9100 = "9100";

    @NotNull
    public static final String KEY_DERIVATION_FAILED = "50";

    @NotNull
    public static final String KEY_DERIVATION_FAILED_TIMEOUT = "06";

    @NotNull
    public static final String MESSAGE_ENTRY = "message";

    @NotNull
    public static final String NFC_DISABLE = "97";

    @NotNull
    public static final String NOT_INIT_KEYS = "62";

    @NotNull
    public static final String NO_NFC = "96";

    @NotNull
    public static final String PIN_STATUS_LOCK = "02";

    @NotNull
    public static final String PIN_STATUS_NO_NIP_REQUIRED = "00";

    @NotNull
    public static final String READ_CARD_ERROR = "63";

    @NotNull
    public static final String READ_MODE_CHIP = "05";

    @NotNull
    public static final String READ_MODE_CONTACTLESS_EMV = "07";

    @NotNull
    public static final String READ_MODE_CONTACTLESS_MSD = "91";

    @NotNull
    public static final String READ_MODE_FALLBACK = "80";

    @NotNull
    public static final String READ_MODE_MAGNETIC_STRIPE = "90";

    @NotNull
    public static final String REAL_COUNTER = "real_counter";

    @NotNull
    public static final String RESPONSE_CODE_00 = "00";

    @NotNull
    public static final String RESPONSE_CODE_01 = "01";

    @NotNull
    public static final String RESPONSE_CODE_05 = "05";

    @NotNull
    public static final String SERIAL_KEY = "serial_key";

    @NotNull
    public static final String STATUS_ENTRY = "status";

    @NotNull
    public static final String TERMINAL_COUNTRY_CODE = "9F1A";

    @NotNull
    public static final String TERMINAL_RISK_MANAGEMENT_DATA = "9F1D";

    @NotNull
    public static final String TERMINAL_TYPE = "9F35";

    @NotNull
    public static final String TRACK2 = "track2";

    @NotNull
    public static final String TRACK2_CRC = "track2_crc";

    @NotNull
    public static final String TRACK2_LENGTH = "track2_length";

    @NotNull
    public static final String TRANSACTION_AMOUNT = "9F02";

    @NotNull
    public static final String TRANSACTION_CURRENCY_CODE = "5F2A";

    @NotNull
    public static final String TRANSACTION_DATE = "9A";

    @NotNull
    public static final String TRANSACTION_ENTRY = "transaction";

    @NotNull
    public static final String TRANSACTION_RESPONSE_CODE_00 = "00";

    @NotNull
    public static final String TRANSACTION_TYPE = "9C";

    @NotNull
    public static final String UNPREDICTABLE_NUMBER = "9F37";

    @NotNull
    public static final String UNSUPPORTED_CARD = "25";

    @NotNull
    public static final String VERIFICATION_RESULT = "95";

    @NotNull
    public static final EglobalUtils INSTANCE = new EglobalUtils();

    @NotNull
    public static final String CARD_HOLDER_VERIFICATION = "9F34";

    @NotNull
    public static final String APPLICATION_PREFERRED_NAME = "9F12";

    @NotNull
    public static final String ISSUER_APPLICATION_DATA = "9F10";

    @NotNull
    public static final String INTERCHANGE_PROFILE = "82";

    @NotNull
    public static final String CRYPTOGRAM = "9F26";

    @NotNull
    public static final String CRYPTO_INFO = "9F27";

    @NotNull
    public static final String TRANSACTION_COUNTER = "9F36";

    @NotNull
    public static final String CAPABILITIES = "9F33";

    @NotNull
    public static final String DEDICATED_FILE_NAME_E_GLOBAL = "84";

    @NotNull
    public static final String SEQUENCE_COUNTER = "5F34";

    @NotNull
    public static final String VERSION_NUMBER = "9F09";

    @NotNull
    public static final String INTERFACE_DEVICE = "9F1E";

    @NotNull
    public static final String SEQUENCE_NUMBER = "9F41";

    @NotNull
    public static final String TRANSACTION_CATEGORY_CODE = "9F53";

    @NotNull
    public static final String DEDICATED_FILE_NAME = "4F";

    @NotNull
    public static final String FORM_FACTOR_INDICATOR = "9F6E";

    @NotNull
    public static final String ISSUER_SCRIPT_RESULT = "9F5B";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f83819a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"9F02", "9F16", "5F24", CARD_HOLDER_VERIFICATION, "9A", "9F03", "9F06", "9F21", APPLICATION_PREFERRED_NAME, "5A", "57", ISSUER_APPLICATION_DATA, "9F4E", INTERCHANGE_PROFILE, "8E", "5F25", "9F07", "9F0D", "9F0E", "9F0F", CRYPTOGRAM, CRYPTO_INFO, TRANSACTION_COUNTER, "9C", CAPABILITIES, "9F37", "9F39", "9F40", "95", "9B", DEDICATED_FILE_NAME_E_GLOBAL, "5F2A", SEQUENCE_COUNTER, VERSION_NUMBER, "9F1A", INTERFACE_DEVICE, "9F35", SEQUENCE_NUMBER, TRANSACTION_CATEGORY_CODE, "5F20", "5F30", "5F28", "50", "9F08", "9F01", ComputeCcCommandApdu.MERCHANT_CATEGORY_CODE_TAG, "9F1C", DEDICATED_FILE_NAME, "8A", "99", FORM_FACTOR_INDICATOR, "C2", ISSUER_SCRIPT_RESULT, "9F66", "9F1D", "9F70"});

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> FLAGS_RENEW_KEYS_NEEDED = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"01", "1", "02", "2"});

    public static String a(String str, String str2, LinkedHashMap linkedHashMap) {
        int length = str2.length();
        int i10 = length + 2;
        String strSubstring = str.substring(length, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        int i11 = (Integer.parseInt(strSubstring, CharsKt.checkRadix(16)) * 2) + i10;
        if (str.length() < i11) {
            return str;
        }
        String strSubstring2 = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        linkedHashMap.put(str2, strSubstring2);
        String strSubstring3 = str.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        return new Regex(strSubstring3).replaceFirst(str, "");
    }

    public static /* synthetic */ boolean isSuccessStatusCommand$default(EglobalUtils eglobalUtils, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return eglobalUtils.isSuccessStatusCommand(str, z10);
    }

    @NotNull
    public final List<String> getFLAGS_RENEW_KEYS_NEEDED() {
        return FLAGS_RENEW_KEYS_NEEDED;
    }

    @NotNull
    public final String getLongitudeIssuerAutData(@NotNull String issuerAuthData) {
        Intrinsics.checkNotNullParameter(issuerAuthData, "issuerAuthData");
        String hexString = Integer.toHexString(issuerAuthData.length() / 2);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(size)");
        String upperCase = hexString.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.length() < 2 ? "0".concat(upperCase) : upperCase;
    }

    @NotNull
    public final Map<String, String> getSplitEmvValue(@Nullable String emvData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (emvData != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String upperCase = emvData.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                String strSubstring = upperCase.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = upperCase.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                List<String> list = f83819a;
                boolean zContains = list.contains(strSubstring);
                boolean zContains2 = list.contains(strSubstring2);
                i10++;
                if (zContains) {
                    upperCase = a(upperCase, strSubstring, linkedHashMap);
                } else if (zContains2) {
                    upperCase = a(upperCase, strSubstring2, linkedHashMap);
                }
                if (upperCase.length() == 0 || upperCase.length() < 2 || i10 > list.size()) {
                    z10 = false;
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final String getToken9F34(@NotNull String cardBin, @NotNull String readMode, int slotKey, double amount) {
        Intrinsics.checkNotNullParameter(cardBin, "cardBin");
        Intrinsics.checkNotNullParameter(readMode, "readMode");
        String strSubstring = cardBin.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (slotKey == 3 && Intrinsics.areEqual("4", strSubstring) && Intrinsics.areEqual(READ_MODE_CONTACTLESS_EMV, readMode)) {
            return amount > 1000.0d ? "1E0300" : "1F0000";
        }
        return "000000";
    }

    @NotNull
    public final Map<String, String> getTokenEzInformation(@Nullable String token) {
        HashMap map = new HashMap();
        if (token != null && token.length() > 0 && token.length() >= 108) {
            String strSubstring = token.substring(10, 30);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            map.put(SERIAL_KEY, strSubstring);
            String strSubstring2 = token.substring(30, 37);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            map.put(REAL_COUNTER, strSubstring2);
            String strSubstring3 = token.substring(42, 44);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            map.put(TRACK2_LENGTH, strSubstring3);
            String strSubstring4 = token.substring(48, 96);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            map.put(TRACK2, strSubstring4);
            String strSubstring5 = token.substring(100, 108);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            map.put(TRACK2_CRC, strSubstring5);
        }
        return map;
    }

    @NotNull
    public final String getTxnType(boolean isCharge, @NotNull String slotKey) {
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        if (isCharge) {
            return Intrinsics.areEqual(slotKey, "1") ? "67" : READ_MODE_CONTACTLESS_EMV;
        }
        return Intrinsics.areEqual(slotKey, "1") ? "67" : "47";
    }

    public final boolean isSuccessStatusCommand(@NotNull String status, boolean isForToP) {
        Intrinsics.checkNotNullParameter(status, "status");
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("02", "99", INVALID_ISSUER_AUTHENTICATION, "50", KEY_DERIVATION_FAILED_TIMEOUT, INITIALIZED_KEYS_WRONG_COMMAND, NOT_INIT_KEYS, READ_CARD_ERROR, CARD_REMOVED, "25", INTERNAL_ERROR, "01");
        ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(NO_NFC, NFC_DISABLE, "25");
        if (isForToP) {
            if (arrayListArrayListOf.contains(status) || arrayListArrayListOf2.contains(status)) {
                return false;
            }
        } else if (arrayListArrayListOf.contains(status)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String parseAmount(@NotNull BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        String str = new DecimalFormat(DECIMAL_FORMAT_PATTERN, new DecimalFormatSymbols(Locale.ENGLISH)).format(amount);
        Intrinsics.checkNotNullExpressionValue(str, "DecimalFormat(DECIMAL_FO….ENGLISH)).format(amount)");
        return l.replace$default(str, Constant.DOT_STRING, "", false, 4, (Object) null);
    }

    public final boolean requiresSignatureAMEXMC(@Nullable String tag9F34) {
        if (tag9F34 == null || tag9F34.length() == 0) {
            return false;
        }
        String strSubstring = tag9F34.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String binaryString = Integer.toBinaryString(Integer.parseInt(strSubstring, CharsKt.checkRadix(16)));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strSubstring2 = l.replace$default(a.i(new Object[]{binaryString}, 1, "%8s", "format(format, *args)"), ' ', '0', false, 4, (Object) null).substring(2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return Intrinsics.areEqual(strSubstring2, CODE_VALIDATE_SIGNATURE_AMEXMC_01) || Intrinsics.areEqual(strSubstring2, CODE_VALIDATE_SIGNATURE_AMEXMC_02) || Intrinsics.areEqual(strSubstring2, CODE_VALIDATE_SIGNATURE_AMEXMC_03);
    }

    public final boolean requiresSignatureVisa(@Nullable String tag9F66) {
        if (tag9F66 == null || tag9F66.length() == 0) {
            return false;
        }
        String strSubstring = tag9F66.substring(2, tag9F66.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String binaryString = Integer.toBinaryString(Integer.parseInt(strSubstring, CharsKt.checkRadix(16)));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        List<String> listChunked = StringsKt___StringsKt.chunked(l.replace$default(a.i(new Object[]{binaryString}, 1, "%32s", "format(format, *args)"), ' ', '0', false, 4, (Object) null), 8);
        return (listChunked.isEmpty() ^ true) && listChunked.get(1).charAt(1) == '1';
    }

    @Nullable
    public final String[] validateIssuerScripts(@NotNull String issuerScript71, @NotNull String issuerScript72) {
        String strReplace$default;
        String strReplace$default2;
        Intrinsics.checkNotNullParameter(issuerScript71, "issuerScript71");
        Intrinsics.checkNotNullParameter(issuerScript72, "issuerScript72");
        boolean z10 = true;
        if (issuerScript71.length() > 0 && issuerScript72.length() > 0) {
            strReplace$default = l.replace$default(issuerScript71, " ", "", false, 4, (Object) null);
            strReplace$default2 = l.replace$default(issuerScript72, " ", "", false, 4, (Object) null);
        } else if (issuerScript71.length() > 0) {
            strReplace$default = l.replace$default(issuerScript71, " ", "", false, 4, (Object) null);
            strReplace$default2 = "";
        } else if (issuerScript72.length() > 0) {
            strReplace$default2 = l.replace$default(issuerScript72, " ", "", false, 4, (Object) null);
            strReplace$default = "";
        } else {
            z10 = false;
            strReplace$default = "";
            strReplace$default2 = strReplace$default;
        }
        if (z10) {
            return new String[]{strReplace$default, strReplace$default2};
        }
        return null;
    }

    public final boolean validateTokenAdditionalInformation(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (token.length() <= 0 || token.length() < 9) {
            return false;
        }
        String strSubstring = token.substring(4, 9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Integer.parseInt(strSubstring) > 0;
    }

    @NotNull
    public final String parseAmount(double amount) {
        String str = new DecimalFormat(DECIMAL_FORMAT_PATTERN, new DecimalFormatSymbols(Locale.ENGLISH)).format(amount);
        Intrinsics.checkNotNullExpressionValue(str, "DecimalFormat(DECIMAL_FO….ENGLISH)).format(amount)");
        return l.replace$default(str, Constant.DOT_STRING, "", false, 4, (Object) null);
    }
}
