package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsNL implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69832a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69833b = new HashMap();

    public LocalizedStringsNL() {
        HashMap map = f69832a;
        map.put(StringKey.CANCEL, "Annuleren");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Gereed");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Postcode");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Naam kaarthouder");
        map.put(StringKey.ENTRY_EXPIRES, "Vervaldatum");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/JJ");
        map.put(StringKey.SCAN_GUIDE, "Houd uw kaart hier.\nScannen gaat automatisch.");
        map.put(StringKey.KEYBOARD, "Toetsenbord…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Creditcardnummer");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kaartgegevens");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Met de camera van dit apparaat kunnen geen kaartnummers worden gelezen.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Camera apparaat niet beschikbaar.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Er is een onverwachte fout opgetreden bij het starten van de camera.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "nl";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69833b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69832a.get(stringKey);
    }
}
