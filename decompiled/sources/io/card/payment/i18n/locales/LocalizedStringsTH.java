package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsTH implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69844a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69845b = new HashMap();

    public LocalizedStringsTH() {
        HashMap map = f69844a;
        map.put(StringKey.CANCEL, "ยกเลิก");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "เสร็จแล้ว");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "รหัสไปรษณีย์");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "ชื่อผู้ถือบัตร");
        map.put(StringKey.ENTRY_EXPIRES, "หมดอายุ");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "ดด/ปป");
        map.put(StringKey.SCAN_GUIDE, "ถือบัตรไว้ตรงนี้\nเครื่องจะสแกนโดยอัตโนมัติ");
        map.put(StringKey.KEYBOARD, "คีย์บอร์ด…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "หมายเลขบัตร");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "รายละเอียดบัตร");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "อุปกรณ์ไม่สามารถใช้กล้องเพื่ออ่านหมายเลขบัตรได้");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "กล้องของอุปกรณ์ไม่พร้อมใช้งาน");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "อุปกรณ์พบข้อผิดพลาดขณะเปิดกล้อง");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "th";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69845b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69844a.get(stringKey);
    }
}
