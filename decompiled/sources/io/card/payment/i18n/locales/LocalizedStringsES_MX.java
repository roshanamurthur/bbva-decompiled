package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsES_MX implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69814a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69815b = new HashMap();

    public LocalizedStringsES_MX() {
        HashMap map = f69814a;
        map.put(StringKey.CANCEL, "Cancelar");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Listo");
        map.put(StringKey.ENTRY_CVV, "CVV");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Código postal");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nombre del titular");
        map.put(StringKey.ENTRY_EXPIRES, "Vence");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        map.put(StringKey.SCAN_GUIDE, "Coloque la tarjeta aquí.\nSe escaneará automáticamente.");
        map.put(StringKey.KEYBOARD, "Teclado…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "N.° de tarjeta");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Detalles de la tarjeta");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo no puede usar la cámara para leer números de tarjeta.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "La cámara del dispositivo no está disponible.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "El dispositivo tuvo un error inesperado al abrir la cámara.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "es_MX";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69815b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69814a.get(stringKey);
    }
}
