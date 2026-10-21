package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsJA implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69824a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69825b = new HashMap();

    public LocalizedStringsJA() {
        HashMap map = f69824a;
        map.put(StringKey.CANCEL, "キャンセル");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "完了");
        map.put(StringKey.ENTRY_CVV, "カード確認コード");
        map.put(StringKey.ENTRY_POSTAL_CODE, "郵便番号");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "カード保有者の名前");
        map.put(StringKey.ENTRY_EXPIRES, "有効期限");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        map.put(StringKey.SCAN_GUIDE, "ここでカードをお持ちください。\n自動的にスキャンされます。");
        map.put(StringKey.KEYBOARD, "キーボード…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "カード番号");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "カードの詳細");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "この端末ではカード番号の読込にカメラを使えません。");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "端末のカメラを使用できません。");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "カメラを起動中に予期しないエラーが発生しました。");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "ja";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69825b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69824a.get(stringKey);
    }
}
