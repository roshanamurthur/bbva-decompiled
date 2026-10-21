package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsRU implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69840a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69841b = new HashMap();

    public LocalizedStringsRU() {
        HashMap map = f69840a;
        map.put(StringKey.CANCEL, "Отмена");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Готово");
        map.put(StringKey.ENTRY_CVV, "Код безопасности");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Индекс");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Имя и фамилия владельца");
        map.put(StringKey.ENTRY_EXPIRES, "Действ. до");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "ММ/ГГ");
        map.put(StringKey.SCAN_GUIDE, "Держите карту внутри рамки.\nОна будет считана автоматически.");
        map.put(StringKey.KEYBOARD, "Клавиатура…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Номер карты");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Ввести данные вручную");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "В данном устройстве нет опции считывания номера карты с помощью фотокамеры.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Фотокамера устройства недоступна.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Возникла незапланированная ошибка при открытии фотокамеры устройства.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "ru";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69841b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69840a.get(stringKey);
    }
}
