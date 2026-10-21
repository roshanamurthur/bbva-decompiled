package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsHE implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69818a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69819b = new HashMap();

    public LocalizedStringsHE() {
        HashMap map = f69818a;
        map.put(StringKey.CANCEL, "ביטול");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "אמריקן אקספרס");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover\u200f");
        map.put(StringKey.CARDTYPE_JCB, "JCB\u200f");
        map.put(StringKey.CARDTYPE_MASTERCARD, "מאסטרקארד");
        map.put(StringKey.CARDTYPE_VISA, "ויזה");
        map.put(StringKey.DONE, "בוצע");
        map.put(StringKey.ENTRY_CVV, "קוד אימות כרטיס");
        map.put(StringKey.ENTRY_POSTAL_CODE, "מיקוד");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "שם בעל הכרטיס");
        map.put(StringKey.ENTRY_EXPIRES, "תאריך תפוגה");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY\u200f");
        map.put(StringKey.SCAN_GUIDE, "החזק את הכרטיס כאן.\nהסריקה תתבצע באופן אוטומטי.");
        map.put(StringKey.KEYBOARD, "מקלדת…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "מספר כרטיס");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "פרטי כרטיס");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "המכשיר אינו מסוגל להשתמש במצלמה לקריאת מספרי כרטיס.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "מצלמת המכשיר אינה זמינה.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "המכשיר נתקל בשגיאה בלתי צפויה בזמן הפעלת המצלמה.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "he";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69819b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69818a.get(stringKey);
    }
}
