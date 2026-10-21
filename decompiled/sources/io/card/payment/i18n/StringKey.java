package io.card.payment.i18n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class StringKey {
    private static final /* synthetic */ StringKey[] $VALUES;
    public static final StringKey CANCEL;
    public static final StringKey CARDTYPE_AMERICANEXPRESS;
    public static final StringKey CARDTYPE_DISCOVER;
    public static final StringKey CARDTYPE_JCB;
    public static final StringKey CARDTYPE_MAESTRO;
    public static final StringKey CARDTYPE_MASTERCARD;
    public static final StringKey CARDTYPE_VISA;
    public static final StringKey DONE;
    public static final StringKey ENTRY_CARDHOLDER_NAME;
    public static final StringKey ENTRY_CARD_NUMBER;
    public static final StringKey ENTRY_CVV;
    public static final StringKey ENTRY_EXPIRES;
    public static final StringKey ENTRY_POSTAL_CODE;
    public static final StringKey ERROR_CAMERA_CONNECT_FAIL;
    public static final StringKey ERROR_CAMERA_UNEXPECTED_FAIL;
    public static final StringKey ERROR_NO_DEVICE_SUPPORT;
    public static final StringKey EXPIRES_PLACEHOLDER;
    public static final StringKey KEYBOARD;
    public static final StringKey MANUAL_ENTRY_TITLE;
    public static final StringKey SCAN_GUIDE;

    static {
        StringKey stringKey = new StringKey("CANCEL", 0);
        CANCEL = stringKey;
        StringKey stringKey2 = new StringKey("CARDTYPE_AMERICANEXPRESS", 1);
        CARDTYPE_AMERICANEXPRESS = stringKey2;
        StringKey stringKey3 = new StringKey("CARDTYPE_DISCOVER", 2);
        CARDTYPE_DISCOVER = stringKey3;
        StringKey stringKey4 = new StringKey("CARDTYPE_JCB", 3);
        CARDTYPE_JCB = stringKey4;
        StringKey stringKey5 = new StringKey("CARDTYPE_MASTERCARD", 4);
        CARDTYPE_MASTERCARD = stringKey5;
        StringKey stringKey6 = new StringKey("CARDTYPE_MAESTRO", 5);
        CARDTYPE_MAESTRO = stringKey6;
        StringKey stringKey7 = new StringKey("CARDTYPE_VISA", 6);
        CARDTYPE_VISA = stringKey7;
        StringKey stringKey8 = new StringKey("DONE", 7);
        DONE = stringKey8;
        StringKey stringKey9 = new StringKey("ENTRY_CVV", 8);
        ENTRY_CVV = stringKey9;
        StringKey stringKey10 = new StringKey("ENTRY_POSTAL_CODE", 9);
        ENTRY_POSTAL_CODE = stringKey10;
        StringKey stringKey11 = new StringKey("ENTRY_CARDHOLDER_NAME", 10);
        ENTRY_CARDHOLDER_NAME = stringKey11;
        StringKey stringKey12 = new StringKey("ENTRY_EXPIRES", 11);
        ENTRY_EXPIRES = stringKey12;
        StringKey stringKey13 = new StringKey("EXPIRES_PLACEHOLDER", 12);
        EXPIRES_PLACEHOLDER = stringKey13;
        StringKey stringKey14 = new StringKey("SCAN_GUIDE", 13);
        SCAN_GUIDE = stringKey14;
        StringKey stringKey15 = new StringKey("KEYBOARD", 14);
        KEYBOARD = stringKey15;
        StringKey stringKey16 = new StringKey("ENTRY_CARD_NUMBER", 15);
        ENTRY_CARD_NUMBER = stringKey16;
        StringKey stringKey17 = new StringKey("MANUAL_ENTRY_TITLE", 16);
        MANUAL_ENTRY_TITLE = stringKey17;
        StringKey stringKey18 = new StringKey("ERROR_NO_DEVICE_SUPPORT", 17);
        ERROR_NO_DEVICE_SUPPORT = stringKey18;
        StringKey stringKey19 = new StringKey("ERROR_CAMERA_CONNECT_FAIL", 18);
        ERROR_CAMERA_CONNECT_FAIL = stringKey19;
        StringKey stringKey20 = new StringKey("ERROR_CAMERA_UNEXPECTED_FAIL", 19);
        ERROR_CAMERA_UNEXPECTED_FAIL = stringKey20;
        $VALUES = new StringKey[]{stringKey, stringKey2, stringKey3, stringKey4, stringKey5, stringKey6, stringKey7, stringKey8, stringKey9, stringKey10, stringKey11, stringKey12, stringKey13, stringKey14, stringKey15, stringKey16, stringKey17, stringKey18, stringKey19, stringKey20};
    }

    public StringKey() {
        throw null;
    }

    public static StringKey valueOf(String str) {
        return (StringKey) Enum.valueOf(StringKey.class, str);
    }

    public static StringKey[] values() {
        return (StringKey[]) $VALUES.clone();
    }
}
