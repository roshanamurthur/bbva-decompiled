package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsMS implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69828a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69829b = new HashMap();

    public LocalizedStringsMS() {
        HashMap map = f69828a;
        map.put(StringKey.CANCEL, "Batal");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Selesai");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Poskod");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nama Pemegang Kad");
        map.put(StringKey.ENTRY_EXPIRES, "Luput");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "BB/TT");
        map.put(StringKey.SCAN_GUIDE, "Pegang kad di sini.\nIa akan mengimbas secara automatik.");
        map.put(StringKey.KEYBOARD, "Papan Kekunci…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Nombor Kad");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Butiran Kad");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Peranti ini tidak dapat menggunakan kamera untuk membaca nombor kad.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Kamera peranti tidak tersedia.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Peranti mengalami ralat tidak dijangka semasa membuka kamera.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "ms";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69829b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69828a.get(stringKey);
    }
}
