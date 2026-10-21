package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsIS implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69820a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69821b = new HashMap();

    public LocalizedStringsIS() {
        HashMap map = f69820a;
        map.put(StringKey.CANCEL, "Hætta við");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Lokið");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Póstnúmer");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nafn Korthafa");
        map.put(StringKey.ENTRY_EXPIRES, "Rennur út");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÁÁ");
        map.put(StringKey.SCAN_GUIDE, "Haltu kortinu kyrru hér.\nÞað verður sjálvirkt skannað.");
        map.put(StringKey.KEYBOARD, "Lyklaborð…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kortanúmar");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kortaupplýsingar");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Þetta tæki getur ekki notað myndavélina til að lesa af númer af kortinu.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Ekki næst samband við myndavélina.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Upp kom villa við að opna myndavélina..");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "is";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69821b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69820a.get(stringKey);
    }
}
