package mx.openpay.library.data.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.VisibleForTesting;
import com.bbva.notifications.constants.PushConstants;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.EmvTags;
import mx.openpay.library.domain.model.eglobal.EncryptedCard;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChargeUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lmx/openpay/library/data/util/ChargeUtils;", "", "Landroid/content/Context;", "context", "", "serial", "slotKey", "Ljava/math/BigDecimal;", PushConstants.AMOUNT, "orderId", "", "plan", "description", "Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", "cardInfoC51", "Lmx/openpay/library/domain/model/CreateCharge;", "createChargeRequest", "Landroid/location/Location;", "getLocationOfDevice$data_release", "(Landroid/content/Context;)Landroid/location/Location;", "getLocationOfDevice", "<init>", "()V", "data_release"}, k = 1, mv = {1, 8, 0})
public final class ChargeUtils {

    @NotNull
    public static final ChargeUtils INSTANCE = new ChargeUtils();

    /* JADX WARN: Code duplicated, block: B:135:0x0335  */
    /* JADX WARN: Code duplicated, block: B:136:0x033c  */
    /* JADX WARN: Code duplicated, block: B:143:0x035e  */
    /* JADX WARN: Code duplicated, block: B:146:0x036a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0375  */
    /* JADX WARN: Code duplicated, block: B:150:0x037d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0388  */
    /* JADX WARN: Code duplicated, block: B:154:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c6  */
    @NotNull
    public final CreateCharge createChargeRequest(@NotNull Context context, @NotNull String serial, @NotNull String slotKey, @NotNull BigDecimal amount, @NotNull String orderId, int plan, @NotNull String description, @NotNull C51Response cardInfoC51) {
        String str;
        String str2;
        String str3;
        String str4;
        EglobalUtils eglobalUtils;
        String tokenEY;
        Location locationOfDevice$data_release;
        Double dValueOf;
        Location locationOfDevice$data_release2;
        Double dValueOf2;
        PaymentPlan paymentPlan;
        Throwable th2;
        String str5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cardInfoC51, "cardInfoC51");
        EglobalUtils eglobalUtils2 = EglobalUtils.INSTANCE;
        Map<String, String> tokenEzInformation = eglobalUtils2.getTokenEzInformation(cardInfoC51.getTokenEZ());
        String str6 = null;
        String str7 = null;
        EmvTags emvTags = new EmvTags(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
        int length = cardInfoC51.getE1().length();
        String str8 = EglobalUtils.READ_MODE_CONTACTLESS_EMV;
        String tokenCZ = "";
        if (length <= 0 || cardInfoC51.getE2().length() <= 0) {
            str8 = EglobalUtils.READ_MODE_CONTACTLESS_EMV;
            str = "";
            str2 = str;
        } else {
            Map<String, String> splitEmvValue = eglobalUtils2.getSplitEmvValue(cardInfoC51.getE2());
            Map<String, String> splitEmvValue2 = eglobalUtils2.getSplitEmvValue(cardInfoC51.getE1());
            String str9 = splitEmvValue.get(EglobalUtils.INTERCHANGE_PROFILE);
            if (str9 == null) {
                str9 = "";
            }
            emvTags.setInterchangeProfile(str9);
            String str10 = splitEmvValue.get(EglobalUtils.TRANSACTION_COUNTER);
            if (str10 == null) {
                str10 = "";
            }
            emvTags.setTransactionCounter(str10);
            String str11 = splitEmvValue.get("9F37");
            if (str11 == null) {
                str11 = "";
            }
            emvTags.setUnpredictableNumber(str11);
            String str12 = splitEmvValue.get(EglobalUtils.ISSUER_APPLICATION_DATA);
            if (str12 == null) {
                str12 = "";
            }
            emvTags.setIssuerApplicationData(str12);
            String str13 = splitEmvValue.get(EglobalUtils.CAPABILITIES);
            if (str13 == null) {
                str13 = "";
            }
            emvTags.setCapabilities(str13);
            if (Intrinsics.areEqual(cardInfoC51.getReadMode(), EglobalUtils.READ_MODE_CONTACTLESS_EMV)) {
                str5 = "22";
            } else {
                str5 = splitEmvValue.get("9F35");
                if (str5 == null) {
                    str5 = "";
                }
            }
            emvTags.setTerminalType(str5);
            String str14 = splitEmvValue.get(EglobalUtils.VERSION_NUMBER);
            if (str14 == null) {
                str14 = "";
            }
            emvTags.setVersionNumber(str14);
            String str15 = splitEmvValue.get(EglobalUtils.SEQUENCE_NUMBER);
            if (str15 == null) {
                str15 = "";
            }
            emvTags.setSequenceNumber(str15);
            String str16 = splitEmvValue.get("5F2A");
            if (str16 == null) {
                str16 = "";
            }
            emvTags.setTransactionCurrencyCode(str16);
            String str17 = splitEmvValue.get(EglobalUtils.DEDICATED_FILE_NAME_E_GLOBAL);
            if (str17 == null) {
                str17 = "";
            }
            emvTags.setDedicatedFileNameEglobal(str17);
            String str18 = splitEmvValue.get("9A");
            if (str18 == null) {
                str18 = "";
            }
            emvTags.setTransactionDate(str18);
            String str19 = splitEmvValue.get("9C");
            if (str19 == null) {
                str19 = "";
            }
            emvTags.setTransactionType(str19);
            String str20 = splitEmvValue.get("9F02");
            if (str20 == null) {
                str20 = "";
            }
            emvTags.setTransactionAmount(str20);
            String str21 = splitEmvValue.get("9F03");
            if (str21 == null) {
                str21 = "";
            }
            emvTags.setAmountOther(str21);
            String str22 = splitEmvValue.get("9F1A");
            if (str22 == null) {
                str22 = "";
            }
            emvTags.setTerminalCountryCode(str22);
            String str23 = splitEmvValue.get(EglobalUtils.INTERFACE_DEVICE);
            if (str23 == null) {
                str23 = "";
            }
            emvTags.setInterfaceDevice(str23);
            String str24 = splitEmvValue.get(EglobalUtils.TRANSACTION_CATEGORY_CODE);
            if (str24 == null) {
                str24 = "";
            }
            emvTags.setTransactionCategoryCode(str24);
            String str25 = splitEmvValue.get(EglobalUtils.FORM_FACTOR_INDICATOR);
            if (str25 == null) {
                str25 = "";
            }
            emvTags.setFormFactorIndicator(str25);
            String str26 = splitEmvValue2.get(EglobalUtils.CRYPTO_INFO);
            if (str26 == null) {
                str26 = "";
            }
            emvTags.setCryptoInfo(str26);
            String str27 = splitEmvValue2.get("95");
            if (str27 == null) {
                str27 = "";
            }
            emvTags.setVerificationResult(str27);
            String str28 = splitEmvValue2.get(EglobalUtils.CRYPTOGRAM);
            if (str28 == null) {
                str28 = "";
            }
            emvTags.setCryptogram(str28);
            String token9F34 = splitEmvValue2.get(EglobalUtils.CARD_HOLDER_VERIFICATION);
            if (token9F34 == null) {
                token9F34 = "";
            }
            if (token9F34.length() == 0) {
                token9F34 = eglobalUtils2.getToken9F34(cardInfoC51.getCardBin(), cardInfoC51.getReadMode(), Integer.parseInt(slotKey), amount.doubleValue());
            }
            emvTags.setCardHolderVerification(token9F34);
            String str29 = splitEmvValue2.get(EglobalUtils.DEDICATED_FILE_NAME);
            if (str29 == null) {
                str29 = "";
            }
            emvTags.setDedicatedFileName(str29);
            String str30 = splitEmvValue2.get(EglobalUtils.SEQUENCE_COUNTER);
            if (str30 == null) {
                str30 = "";
            }
            emvTags.setSecuenceCounter(str30);
            String str31 = splitEmvValue2.get(EglobalUtils.ISSUER_SCRIPT_RESULT);
            if (str31 == null) {
                str31 = "";
            }
            emvTags.setIssuerScriptResult(str31);
            String str32 = splitEmvValue.get("9F66");
            if (str32 == null) {
                str32 = "";
            }
            emvTags.setCardHolderVerificationVisa(str32);
            CommonUtils commonUtils = CommonUtils.INSTANCE;
            String str33 = splitEmvValue2.get(EglobalUtils.APPLICATION_PREFERRED_NAME);
            if (str33 == null) {
                str33 = "";
            }
            String strHexToAscii = commonUtils.hexToAscii(str33);
            String str34 = splitEmvValue2.get("50");
            if (str34 == null) {
                str34 = "";
            }
            String strHexToAscii2 = commonUtils.hexToAscii(str34);
            String str35 = splitEmvValue.get("9F1D");
            if (str35 == null) {
                str35 = "";
            }
            emvTags.setTerminalRiskManagementData(str35);
            str2 = strHexToAscii2;
            str = strHexToAscii;
        }
        String strSubstring = cardInfoC51.getCardBin().substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String cardHolder = cardInfoC51.getCardHolder();
        String model = cardInfoC51.getModel();
        String pinStatus = cardInfoC51.getPinStatus();
        String readMode = cardInfoC51.getReadMode();
        String str36 = tokenEzInformation.get(EglobalUtils.SERIAL_KEY);
        String str37 = str36 == null ? "" : str36;
        String tokenES = cardInfoC51.getTokenES();
        String tokenEZ = cardInfoC51.getTokenEZ();
        String str38 = tokenEZ == null ? "" : tokenEZ;
        String track2 = cardInfoC51.getTrack2();
        String version = cardInfoC51.getVersion();
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open("config.properties");
                try {
                    Properties properties = new Properties();
                    properties.load(inputStreamOpen);
                    str7 = strSubstring;
                    try {
                        String property = properties.getProperty("version");
                        Intrinsics.checkNotNullExpressionValue(property, "pt.getProperty(\"version\")");
                        try {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(inputStreamOpen, null);
                            str4 = property;
                            eglobalUtils = EglobalUtils.INSTANCE;
                            if (eglobalUtils.validateTokenAdditionalInformation(cardInfoC51.getTokenEY())) {
                                tokenEY = cardInfoC51.getTokenEY();
                            } else {
                                tokenEY = "";
                            }
                            if (Intrinsics.areEqual(str8, cardInfoC51.getReadMode()) || (Intrinsics.areEqual("91", cardInfoC51.getReadMode()) && eglobalUtils.validateTokenAdditionalInformation(cardInfoC51.getTokenCZ()))) {
                                tokenCZ = cardInfoC51.getTokenCZ();
                            }
                            locationOfDevice$data_release = getLocationOfDevice$data_release(context);
                            if (locationOfDevice$data_release != null) {
                                dValueOf = Double.valueOf(locationOfDevice$data_release.getLatitude());
                            } else {
                                dValueOf = null;
                            }
                            locationOfDevice$data_release2 = getLocationOfDevice$data_release(context);
                            if (locationOfDevice$data_release2 != null) {
                                dValueOf2 = Double.valueOf(locationOfDevice$data_release2.getLongitude());
                            } else {
                                dValueOf2 = null;
                            }
                            EncryptedCard encryptedCard = new EncryptedCard(emvTags, cardHolder, model, pinStatus, readMode, str37, tokenES, str38, track2, version, str4, tokenEY, tokenCZ, dValueOf2, dValueOf, null, null, null, null, null, null, str7, serial, str, str2, 2064384, null);
                            if (plan != 0) {
                                paymentPlan = new PaymentPlan(plan, PaymentType.WITHOUT_INTEREST);
                            } else {
                                paymentPlan = null;
                            }
                            return new CreateCharge(amount, "MXN", description, encryptedCard, Constant.CARD_METHOD, orderId, false, paymentPlan);
                        } catch (Throwable th3) {
                            str6 = property;
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(inputStreamOpen, th2);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        str6 = "";
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str7 = strSubstring;
                }
            } catch (IOException unused) {
                str7 = strSubstring;
                str3 = "";
                str4 = str3;
            }
        } catch (IOException unused2) {
            str3 = str6;
            str4 = str3;
            eglobalUtils = EglobalUtils.INSTANCE;
            if (eglobalUtils.validateTokenAdditionalInformation(cardInfoC51.getTokenEY())) {
                tokenEY = cardInfoC51.getTokenEY();
            } else {
                tokenEY = "";
            }
            if (Intrinsics.areEqual(str8, cardInfoC51.getReadMode())) {
                tokenCZ = cardInfoC51.getTokenCZ();
            } else {
                tokenCZ = cardInfoC51.getTokenCZ();
            }
            locationOfDevice$data_release = getLocationOfDevice$data_release(context);
            if (locationOfDevice$data_release != null) {
                dValueOf = Double.valueOf(locationOfDevice$data_release.getLatitude());
            } else {
                dValueOf = null;
            }
            locationOfDevice$data_release2 = getLocationOfDevice$data_release(context);
            if (locationOfDevice$data_release2 != null) {
                dValueOf2 = Double.valueOf(locationOfDevice$data_release2.getLongitude());
            } else {
                dValueOf2 = null;
            }
            EncryptedCard encryptedCard2 = new EncryptedCard(emvTags, cardHolder, model, pinStatus, readMode, str37, tokenES, str38, track2, version, str4, tokenEY, tokenCZ, dValueOf2, dValueOf, null, null, null, null, null, null, str7, serial, str, str2, 2064384, null);
            if (plan != 0) {
                paymentPlan = new PaymentPlan(plan, PaymentType.WITHOUT_INTEREST);
            } else {
                paymentPlan = null;
            }
            return new CreateCharge(amount, "MXN", description, encryptedCard2, Constant.CARD_METHOD, orderId, false, paymentPlan);
        }
    }

    @SuppressLint({"MissingPermission"})
    @VisibleForTesting
    @Nullable
    public final Location getLocationOfDevice$data_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (locationManager.isProviderEnabled("gps")) {
            return locationManager.getLastKnownLocation("gps");
        }
        return null;
    }
}
