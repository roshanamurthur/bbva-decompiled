package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsSV implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69842a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69843b = new HashMap();

    public LocalizedStringsSV() {
        HashMap map = f69842a;
        map.put(StringKey.CANCEL, "Avbryt");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Klart");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortinnehavarens namn");
        map.put(StringKey.ENTRY_EXPIRES, "Går ut");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        map.put(StringKey.SCAN_GUIDE, "Håll kortet här.\nDet skannas automatiskt.");
        map.put(StringKey.KEYBOARD, "Tangentbord …");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kortinformation");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Den här enheten kan inte använda kameran till att läsa kortnummer.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhetens kamera är inte tillgänglig.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ett oväntat fel uppstod när enheten skulle öppna kameran.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "sv";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69843b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69842a.get(stringKey);
    }
}
