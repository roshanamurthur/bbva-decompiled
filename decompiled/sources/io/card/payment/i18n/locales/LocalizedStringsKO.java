package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsKO implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69826a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69827b = new HashMap();

    public LocalizedStringsKO() {
        HashMap map = f69826a;
        map.put(StringKey.CANCEL, "취소");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "완료");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "우편번호");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "카드 소유자 이름");
        map.put(StringKey.ENTRY_EXPIRES, "유효기간");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM / YY");
        map.put(StringKey.SCAN_GUIDE, "카드를 여기에 갖다 대세요.\n자동으로 스캔됩니다.");
        map.put(StringKey.KEYBOARD, "키보드…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "카드 번호");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "카드 세부정보");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "기기가 카메라를 이용한 카드 숫자 판독을 지원하지 않습니다.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "기기에서 카메라를 사용할 수 없습니다.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "기기에서 카메라를 여는 동안 예상치 못한 오류가 발생했습니다.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "ko";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69827b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69826a.get(stringKey);
    }
}
