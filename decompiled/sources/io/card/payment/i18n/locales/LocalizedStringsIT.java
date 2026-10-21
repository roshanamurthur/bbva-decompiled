package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsIT implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69822a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69823b = new HashMap();

    public LocalizedStringsIT() {
        HashMap map = f69822a;
        map.put(StringKey.CANCEL, "Annulla");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "OK");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "CAP");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Titolare della carta");
        map.put(StringKey.ENTRY_EXPIRES, "Scadenza");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        map.put(StringKey.SCAN_GUIDE, "Inquadra la carta.\nLa scansione è automatica.");
        map.put(StringKey.KEYBOARD, "Tastiera…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Numero di carta");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Dati carta");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "La fotocamera non legge il numero di carta.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Fotocamera non disponibile.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Errore inatteso nell’apertura della fotocamera.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "it";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69823b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69822a.get(stringKey);
    }
}
