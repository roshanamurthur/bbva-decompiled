package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsDA implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69802a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69803b = new HashMap();

    public LocalizedStringsDA() {
        HashMap map = f69802a;
        map.put(StringKey.CANCEL, "Annuller");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Udført");
        map.put(StringKey.ENTRY_CVV, "Kontrolcifre");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortindehaverens navn");
        map.put(StringKey.ENTRY_EXPIRES, "Udløbsdato");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        map.put(StringKey.SCAN_GUIDE, "Hold kortet her.\nDet scannes automatisk.");
        map.put(StringKey.KEYBOARD, "Tastatur…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kortoplysninger");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Denne enhed kan ikke anvende kameraet til at læse kortnumre.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhed kamera ikke er tilgængelig.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Enheden havde en uventet fejl under åbning af kamera.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "da";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69803b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69802a.get(stringKey);
    }
}
