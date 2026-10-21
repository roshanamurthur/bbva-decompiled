package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsDE implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69804a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69805b = new HashMap();

    public LocalizedStringsDE() {
        HashMap map = f69804a;
        map.put(StringKey.CANCEL, "Abbrechen");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Fertig");
        map.put(StringKey.ENTRY_CVV, "Prüfnr.");
        map.put(StringKey.ENTRY_POSTAL_CODE, "PLZ");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Karteninhaber");
        map.put(StringKey.ENTRY_EXPIRES, "Gültig bis");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/JJ");
        map.put(StringKey.SCAN_GUIDE, "Kreditkarte hierhin halten.\nSie wird automatisch gelesen.");
        map.put(StringKey.KEYBOARD, "Tastatur…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kartennummer");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kreditkartendetails");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Dieses Gerät kann mit der Kamera keine Kreditkartennummern lesen.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Die Kamera ist nicht verfügbar.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Beim Öffnen der Kamera ist ein unerwarteter Fehler aufgetreten.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "de";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69805b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69804a.get(stringKey);
    }
}
