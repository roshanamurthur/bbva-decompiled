package io.card.payment.i18n.locales;

import androidx.room.a;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsPT implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69836a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69837b = new HashMap();

    public LocalizedStringsPT() {
        HashMap map = f69836a;
        map.put(StringKey.CANCEL, "Cancelar");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "Concluir");
        map.put(StringKey.ENTRY_CVV, "CSC");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Código postal");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nome do titular do cartão");
        map.put(StringKey.ENTRY_EXPIRES, "Validade");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        map.put(StringKey.SCAN_GUIDE, "Segure o cartão aqui.\nSerá lido automaticamente.");
        map.put(StringKey.KEYBOARD, "Teclado…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Número do cartão");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Detalhes do cartão");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo não pode utilizar a câmara para ler números de cartões.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "A câmara do dispositivo não está disponível.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ocorreu um erro inesperado no dispositivo ao abrir a câmara.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT;
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69837b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69836a.get(stringKey);
    }
}
