package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsZH_HANT implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69850a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69851b = new HashMap();

    public LocalizedStringsZH_HANT() {
        HashMap map = f69850a;
        map.put(StringKey.CANCEL, "取消");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "美國運通");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "完成");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "郵遞區號");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人名稱");
        map.put(StringKey.ENTRY_EXPIRES, "到期日");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "月 / 年");
        map.put(StringKey.SCAN_GUIDE, "將信用卡置於此處。\n裝置會自動掃描。");
        map.put(StringKey.KEYBOARD, "鍵盤…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "卡號");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "信用卡詳細資料");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此裝置無法使用相機讀取信用卡卡號。");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "無法使用裝置的相機。");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "此裝置啟動相機時發生意外錯誤。");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "zh-Hant";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69851b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69850a.get(stringKey);
    }
}
