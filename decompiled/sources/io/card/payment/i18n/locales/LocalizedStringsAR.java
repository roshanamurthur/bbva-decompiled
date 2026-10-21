package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsAR implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69800a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69801b = new HashMap();

    public LocalizedStringsAR() {
        HashMap map = f69800a;
        map.put(StringKey.CANCEL, "إلغاء");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express\u200f");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover\u200f");
        map.put(StringKey.CARDTYPE_JCB, "JCB\u200f");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard\u200f");
        map.put(StringKey.CARDTYPE_VISA, "Visa\u200f");
        map.put(StringKey.DONE, "تم");
        map.put(StringKey.ENTRY_CVV, "CVV\u200f");
        map.put(StringKey.ENTRY_POSTAL_CODE, "الرمز البريدي");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "اسم صاحب البطاقة");
        map.put(StringKey.ENTRY_EXPIRES, "تاريخ انتهاء الصلاحية");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY\u200f");
        map.put(StringKey.SCAN_GUIDE, "امسك البطاقة هنا.\n ستمسح تلقائيا.");
        map.put(StringKey.KEYBOARD, "لوحة المفاتيح…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "رقم البطاقة");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "تفاصيل البطاقة");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "هذا الجهاز لا يمكنه استعمال الكاميرا لقراءة أرقام البطاقة.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "كاميرا الجهاز غير متاحة.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "الجهاز حدث به خطا غير متوقع عند فتح الكاميرا.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "ar";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69801b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69800a.get(stringKey);
    }
}
