package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsTR implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69846a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69847b = new HashMap();

    public LocalizedStringsTR() {
        HashMap map = f69846a;
        map.put(StringKey.CANCEL, "İptal");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Bitti");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Posta Kodu");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kart sahibinin adı");
        map.put(StringKey.ENTRY_EXPIRES, "Son kullanma tarihi");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "AA/YY");
        map.put(StringKey.SCAN_GUIDE, "Kartınızı buraya tutun.\nOtomatik olarak taranacaktır.");
        map.put(StringKey.KEYBOARD, "Klavye…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Kart Numarası");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Kart Ayrıntıları");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Bu cihazın kamerası kart rakamlarını okuyamaz.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Cihaz kamerası kullanılamıyor.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Cihaz kamerayı açarken beklenmedik bir hata verdi.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "tr";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69847b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69846a.get(stringKey);
    }
}
