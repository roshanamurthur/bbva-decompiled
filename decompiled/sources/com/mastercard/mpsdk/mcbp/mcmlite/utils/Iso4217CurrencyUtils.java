package com.mastercard.mpsdk.mcbp.mcmlite.utils;

import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.notifications.model.CurrencyData;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Iso4217CurrencyUtils {
    private static final /* synthetic */ Iso4217CurrencyUtils[] $VALUES;
    public static final Iso4217CurrencyUtils INSTANCE;
    private static Map<String, String> sCodes;

    static {
        Iso4217CurrencyUtils iso4217CurrencyUtils = new Iso4217CurrencyUtils("INSTANCE", 0);
        INSTANCE = iso4217CurrencyUtils;
        $VALUES = new Iso4217CurrencyUtils[]{iso4217CurrencyUtils};
        HashMap map = new HashMap();
        sCodes = map;
        map.put("971", "AFN");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("008", "ALL");
        sCodes.put("012", "DZD");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("973", "AOA");
        sCodes.put("951", "XCD");
        sCodes.put("951", "XCD");
        sCodes.put("032", CurrencyData.ARS_CURRENCY);
        sCodes.put("051", "AMD");
        sCodes.put("533", "AWG");
        sCodes.put("036", "AUD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("944", "AZN");
        sCodes.put("044", "BSD");
        sCodes.put("048", "BHD");
        sCodes.put("050", "BDT");
        sCodes.put("052", "BBD");
        sCodes.put("974", "BYR");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("084", "BZD");
        sCodes.put("952", "XOF");
        sCodes.put("060", "BMD");
        sCodes.put("064", "BTN");
        sCodes.put("356", "INR");
        sCodes.put("068", "BOB");
        sCodes.put("984", "BOV");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("977", "BAM");
        sCodes.put("072", "BWP");
        sCodes.put("578", "NOK");
        sCodes.put("986", "BRL");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("096", "BND");
        sCodes.put("975", "BGN");
        sCodes.put("952", "XOF");
        sCodes.put("108", "BIF");
        sCodes.put("132", "CVE");
        sCodes.put("116", "KHR");
        sCodes.put("950", "XAF");
        sCodes.put("124", "CAD");
        sCodes.put("136", "KYD");
        sCodes.put("950", "XAF");
        sCodes.put("950", "XAF");
        sCodes.put("990", "CLF");
        sCodes.put("152", "CLP");
        sCodes.put("156", "CNY");
        sCodes.put("036", "AUD");
        sCodes.put("036", "AUD");
        sCodes.put(LoginHelperConstants.MAINTENANCE_ERROR_CODE, CurrencyData.COP_CURRENCY);
        sCodes.put("970", "COU");
        sCodes.put("174", "KMF");
        sCodes.put("976", "CDF");
        sCodes.put("950", "XAF");
        sCodes.put("554", "NZD");
        sCodes.put("188", UUIDPreferences.CRC_KEY);
        sCodes.put("952", "XOF");
        sCodes.put("191", "HRK");
        sCodes.put("931", "CUC");
        sCodes.put("192", "CUP");
        sCodes.put("532", "ANG");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("203", "CZK");
        sCodes.put("208", "DKK");
        sCodes.put("262", "DJF");
        sCodes.put("951", "XCD");
        sCodes.put("214", "DOP");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("818", "EGP");
        sCodes.put("222", "SVC");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("950", "XAF");
        sCodes.put("232", "ERN");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("230", "ETB");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("238", "FKP");
        sCodes.put("208", "DKK");
        sCodes.put("242", "FJD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("953", "XPF");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("950", "XAF");
        sCodes.put("270", "GMD");
        sCodes.put("981", "GEL");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("936", "GHS");
        sCodes.put("292", "GIP");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("208", "DKK");
        sCodes.put("951", "XCD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("320", "GTQ");
        sCodes.put("826", "GBP");
        sCodes.put("324", "GNF");
        sCodes.put("952", "XOF");
        sCodes.put("328", "GYD");
        sCodes.put("332", "HTG");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("036", "AUD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("340", "HNL");
        sCodes.put("344", "HKD");
        sCodes.put("348", "HUF");
        sCodes.put("352", "ISK");
        sCodes.put("356", "INR");
        sCodes.put("360", "IDR");
        sCodes.put("960", "XDR");
        sCodes.put("364", "IRR");
        sCodes.put("368", "IQD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("826", "GBP");
        sCodes.put("376", "ILS");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("388", "JMD");
        sCodes.put("392", "JPY");
        sCodes.put("826", "GBP");
        sCodes.put("400", "JOD");
        sCodes.put(AsoResponse.ERROR_OTP_TOKEN_SOFTWARE_INCORRECT, "KZT");
        sCodes.put(AsoResponse.ERROR_TYPE_TOKEN_INCORRECT, "KES");
        sCodes.put("036", "AUD");
        sCodes.put("408", "KPW");
        sCodes.put("410", "KRW");
        sCodes.put("414", "KWD");
        sCodes.put("417", "KGS");
        sCodes.put("418", "LAK");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("422", "LBP");
        sCodes.put("426", "LSL");
        sCodes.put("710", "ZAR");
        sCodes.put("430", "LRD");
        sCodes.put("434", "LYD");
        sCodes.put("756", "CHF");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("446", "MOP");
        sCodes.put("807", "MKD");
        sCodes.put("969", "MGA");
        sCodes.put("454", "MWK");
        sCodes.put("458", "MYR");
        sCodes.put("462", "MVR");
        sCodes.put("952", "XOF");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("478", "MRO");
        sCodes.put("480", "MUR");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("965", "XUA");
        sCodes.put("484", "MXN");
        sCodes.put("979", "MXV");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("498", "MDL");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("496", "MNT");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("951", "XCD");
        sCodes.put("504", "MAD");
        sCodes.put("943", "MZN");
        sCodes.put("104", "MMK");
        sCodes.put("516", "NAD");
        sCodes.put("710", "ZAR");
        sCodes.put("036", "AUD");
        sCodes.put("524", "NPR");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("953", "XPF");
        sCodes.put("554", "NZD");
        sCodes.put("558", "NIO");
        sCodes.put("952", "XOF");
        sCodes.put("566", "NGN");
        sCodes.put("554", "NZD");
        sCodes.put("036", "AUD");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("578", "NOK");
        sCodes.put("512", "OMR");
        sCodes.put("586", "PKR");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("", "");
        sCodes.put("590", "PAB");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("598", "PGK");
        sCodes.put("600", "PYG");
        sCodes.put("604", CurrencyData.SOL_CURRENCY);
        sCodes.put("608", "PHP");
        sCodes.put("554", "NZD");
        sCodes.put("985", "PLN");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("634", "QAR");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("946", "RON");
        sCodes.put("643", "RUB");
        sCodes.put("646", "RWF");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("654", "SHP");
        sCodes.put("951", "XCD");
        sCodes.put("951", "XCD");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("951", "XCD");
        sCodes.put("882", "WST");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("678", "STD");
        sCodes.put("682", "SAR");
        sCodes.put("952", "XOF");
        sCodes.put("941", "RSD");
        sCodes.put("690", "SCR");
        sCodes.put("694", "SLL");
        sCodes.put("702", "SGD");
        sCodes.put("532", "ANG");
        sCodes.put("994", "XSU");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("090", "SBD");
        sCodes.put("706", "SOS");
        sCodes.put("710", "ZAR");
        sCodes.put("", "");
        sCodes.put("728", "SSP");
        sCodes.put("978", CurrencyData.EURO_CURRENCY);
        sCodes.put("144", "LKR");
        sCodes.put("938", "SDG");
        sCodes.put("968", "SRD");
        sCodes.put("578", "NOK");
        sCodes.put("748", "SZL");
        sCodes.put("752", "SEK");
        sCodes.put("947", "CHE");
        sCodes.put("756", "CHF");
        sCodes.put("948", "CHW");
        sCodes.put("760", "SYP");
        sCodes.put("901", "TWD");
        sCodes.put("972", "TJS");
        sCodes.put("834", "TZS");
        sCodes.put("764", "THB");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("952", "XOF");
        sCodes.put("554", "NZD");
        sCodes.put("776", "TOP");
        sCodes.put("780", "TTD");
        sCodes.put("788", "TND");
        sCodes.put("949", "TRY");
        sCodes.put("934", "TMT");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("036", "AUD");
        sCodes.put("800", "UGX");
        sCodes.put("980", "UAH");
        sCodes.put("784", "AED");
        sCodes.put("826", "GBP");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("997", "USN");
        sCodes.put("940", "UYI");
        sCodes.put("858", "UYU");
        sCodes.put("860", "UZS");
        sCodes.put("548", "VUV");
        sCodes.put("937", "VEF");
        sCodes.put("704", "VND");
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("840", CurrencyData.DOLLAR_CURRENCY);
        sCodes.put("953", "XPF");
        sCodes.put("504", "MAD");
        sCodes.put("886", "YER");
        sCodes.put("967", "ZMW");
        sCodes.put("932", "ZWL");
        sCodes.put("955", "XBA");
        sCodes.put("956", "XBB");
        sCodes.put("957", "XBC");
        sCodes.put("958", "XBD");
        sCodes.put("963", "XTS");
        sCodes.put(AsoResponse.ERROR_CODE_OTP_ERROR, "XXX");
        sCodes.put("959", "XAU");
        sCodes.put("964", "XPD");
        sCodes.put("962", "XPT");
        sCodes.put("961", "XAG");
    }

    public Iso4217CurrencyUtils() {
        throw null;
    }

    public static double convertBcdAmountToDouble(byte[] bArr, Currency currency) {
        int defaultFractionDigits = currency != null ? currency.getDefaultFractionDigits() : 0;
        return Long.valueOf(McmLiteUtils.byteArrayToHexString(bArr), 10).longValue() / (defaultFractionDigits > 0 ? Math.pow(10.0d, defaultFractionDigits) : 1.0d);
    }

    public static double convertBinaryAmountToDouble(byte[] bArr, Currency currency) {
        int defaultFractionDigits = currency != null ? currency.getDefaultFractionDigits() : 0;
        long j10 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            j10 += (long) ((bArr[(bArr.length - 1) - i10] & 255) << (i10 * 8));
        }
        return j10 / (defaultFractionDigits > 0 ? Math.pow(10.0d, defaultFractionDigits) : 1.0d);
    }

    public static String getCodeFromNumericValue(String str) {
        return sCodes.get(str);
    }

    public static Currency getCurrencyByCode(byte[] bArr) {
        try {
            String codeFromNumericValue = getCodeFromNumericValue(McmLiteUtils.byteArrayToHexString(bArr).substring(1, 4));
            if (codeFromNumericValue == null) {
                return null;
            }
            return Currency.getInstance(codeFromNumericValue);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int getNumericCodeFromCode(String str) {
        for (Map.Entry<String, String> entry : sCodes.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(str)) {
                return Integer.valueOf(entry.getKey()).intValue();
            }
        }
        return 0;
    }

    public static Iso4217CurrencyUtils valueOf(String str) {
        return (Iso4217CurrencyUtils) Enum.valueOf(Iso4217CurrencyUtils.class, str);
    }

    public static Iso4217CurrencyUtils[] values() {
        return (Iso4217CurrencyUtils[]) $VALUES.clone();
    }
}
