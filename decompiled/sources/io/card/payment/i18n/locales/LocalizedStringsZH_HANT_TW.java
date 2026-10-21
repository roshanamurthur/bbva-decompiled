package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsZH_HANT_TW implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69852a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69853b = new HashMap();

    public LocalizedStringsZH_HANT_TW() {
        HashMap map = f69852a;
        map.put(StringKey.CANCEL, "取消");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "美國運通");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "完成");
        map.put(StringKey.ENTRY_CVV, "信用卡驗證碼");
        map.put(StringKey.ENTRY_POSTAL_CODE, "郵遞區號");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人姓名");
        map.put(StringKey.ENTRY_EXPIRES, "到期日");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "月 / 年");
        map.put(StringKey.SCAN_GUIDE, "將信用卡放在此處。\n系統將自動掃描。");
        map.put(StringKey.KEYBOARD, "鍵盤…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "卡號");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "信用卡詳細資料");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此裝置無法使用相機讀取卡號。");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "無法使用相機。");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "啟動相機時發生意外的錯誤。");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "zh-Hant_TW";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69853b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69852a.get(stringKey);
    }
}
