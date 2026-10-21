package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsZH_HANS implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69848a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69849b = new HashMap();

    public LocalizedStringsZH_HANS() {
        HashMap map = f69848a;
        map.put(StringKey.CANCEL, "取消");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "完成");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "邮政编码");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人姓名");
        map.put(StringKey.ENTRY_EXPIRES, "有效期限：");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        map.put(StringKey.SCAN_GUIDE, "持卡置于此处。\n设备会自动扫描卡。");
        map.put(StringKey.KEYBOARD, "键盘…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "卡号");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "卡详细信息");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此设备无法使用摄像头读取卡号。");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "设备摄像头不可用。");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "设备打开摄像头时出现意外错误。");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "zh-Hans";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69849b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69848a.get(stringKey);
    }
}
