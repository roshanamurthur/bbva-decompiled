package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsPL implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69834a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69835b = new HashMap();

    public LocalizedStringsPL() {
        HashMap map = f69834a;
        map.put(StringKey.CANCEL, "Anuluj");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Gotowe");
        map.put(StringKey.ENTRY_CVV, "Kod CVV2/CVC2");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Kod pocztowy");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Imię i nazwisko posiadacza karty");
        map.put(StringKey.ENTRY_EXPIRES, "Wygasa");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/RR");
        map.put(StringKey.SCAN_GUIDE, "Przytrzymaj kartę tutaj.\nZostanie ona zeskanowana automatycznie.");
        map.put(StringKey.KEYBOARD, "Klawiatura…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Numer karty");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Dane karty");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Na tym urządzeniu nie można odczytać numeru karty za pomocą aparatu.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Aparat na tym urządzeniu jest niedostepny.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Przy otwieraniu aparatu na tym urządzeniu wystąpił nieoczekiwany błąd.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "pl";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69835b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69834a.get(stringKey);
    }
}
