package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsNB implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69830a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69831b = new HashMap();

    public LocalizedStringsNB() {
        HashMap map = f69830a;
        map.put(StringKey.CANCEL, "Avbryt");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Fullført");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortinnehaverens navn");
        map.put(StringKey.ENTRY_EXPIRES, "Utløper");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        map.put(StringKey.SCAN_GUIDE, "Hold kortet her.\nDet skannes automatisk.");
        map.put(StringKey.KEYBOARD, "Tastatur …");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kortdetaljer");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Denne enheten kan ikke bruke kameraet til å lese kortnumre.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Kameraet er utilgjengelig.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Det oppstod en uventet feil ved kameraoppstart.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "nb";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69831b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69830a.get(stringKey);
    }
}
