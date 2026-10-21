package io.card.payment.i18n.locales;

import androidx.room.a;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class LocalizedStringsFR implements SupportedLocale<StringKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f69816a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f69817b = new HashMap();

    public LocalizedStringsFR() {
        HashMap map = f69816a;
        map.put(StringKey.CANCEL, "Annuler");
        map.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        map.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        map.put(StringKey.CARDTYPE_JCB, "JCB");
        map.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        map.put(StringKey.CARDTYPE_VISA, "Visa");
        map.put(StringKey.DONE, "OK");
        map.put(StringKey.ENTRY_CVV, "Crypto.");
        map.put(StringKey.ENTRY_POSTAL_CODE, "Code postal");
        map.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nom du titulaire de la carte");
        map.put(StringKey.ENTRY_EXPIRES, "Date d’expiration");
        map.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        map.put(StringKey.SCAN_GUIDE, "Maintenez la carte à cet endroit.\nElle va être automatiquement scannée.");
        map.put(StringKey.KEYBOARD, "Clavier…");
        map.put(StringKey.ENTRY_CARD_NUMBER, "Nº de carte");
        map.put(StringKey.MANUAL_ENTRY_TITLE, "Carte");
        map.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Cet appareil ne peut pas utiliser l’appareil photo pour lire les numéros de carte.");
        map.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "L’appareil photo n’est pas disponible.");
        map.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Une erreur s’est produite en ouvrant l’appareil photo.");
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getName() {
        return "fr";
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public String getAdaptedDisplay(StringKey stringKey, String str) {
        String strC = a.c(stringKey, new StringBuilder(), "|", str);
        HashMap map = f69817b;
        return map.containsKey(strC) ? (String) map.get(strC) : (String) f69816a.get(stringKey);
    }
}
