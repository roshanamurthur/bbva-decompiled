package io.card.payment.i18n.locales;

import androidx.room.a;
import com.bbva.plugin.localstorage.util.ConstantKt;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsEN_AU implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69808a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69809b = new HashMap();

    public LocalizedStringsEN_AU() {
        HashMap map = f69808a;
        map.put(StringKey.CANCEL, ConstantKt.BIOMETRIC_NEGATIVE_BUTTON);
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Done");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Postcode");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Cardholder Name");
        map.put(StringKey.ENTRY_EXPIRES, "Expires");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        map.put(StringKey.SCAN_GUIDE, "Hold card here.\nIt will scan automatically.");
        map.put(StringKey.KEYBOARD, "Keyboard…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Card Number");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Card Details");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "This device cannot use the camera to read card numbers.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Device camera is unavailable.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "The device had an unexpected error opening the camera.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "en_AU";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69809b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69808a.get(stringKey);
    }
}
