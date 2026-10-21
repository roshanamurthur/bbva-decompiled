package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes7.dex */
public enum CardType {
    AMEX("AmEx"),
    DINERSCLUB("DinersClub"),
    DISCOVER("Discover"),
    JCB("JCB"),
    MASTERCARD("MasterCard"),
    VISA("Visa"),
    MAESTRO("Maestro"),
    UNKNOWN("Unknown"),
    INSUFFICIENT_DIGITS("More digits required");

    private static HashMap<Pair<String, String>, CardType> intervalLookup;
    private static int minDigits;
    public final String name;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69753a;

        static {
            int[] iArr = new int[CardType.values().length];
            f69753a = iArr;
            try {
                iArr[CardType.AMEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69753a[CardType.DINERSCLUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69753a[CardType.DISCOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69753a[CardType.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69753a[CardType.MASTERCARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69753a[CardType.MAESTRO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69753a[CardType.VISA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f69753a[CardType.INSUFFICIENT_DIGITS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f69753a[CardType.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        CardType cardType = AMEX;
        CardType cardType2 = DINERSCLUB;
        CardType cardType3 = DISCOVER;
        CardType cardType4 = JCB;
        CardType cardType5 = MASTERCARD;
        CardType cardType6 = VISA;
        CardType cardType7 = MAESTRO;
        minDigits = 1;
        HashMap<Pair<String, String>, CardType> map = new HashMap<>();
        intervalLookup = map;
        map.put(a("2221", "2720"), cardType5);
        intervalLookup.put(a("300", "305"), cardType2);
        intervalLookup.put(a("309", null), cardType2);
        intervalLookup.put(a("34", null), cardType);
        intervalLookup.put(a("3528", "3589"), cardType4);
        intervalLookup.put(a("36", null), cardType2);
        intervalLookup.put(a("37", null), cardType);
        intervalLookup.put(a("38", "39"), cardType2);
        intervalLookup.put(a("4", null), cardType6);
        intervalLookup.put(a("50", null), cardType7);
        intervalLookup.put(a("51", "55"), cardType5);
        intervalLookup.put(a("56", "59"), cardType7);
        intervalLookup.put(a("6011", null), cardType3);
        intervalLookup.put(a(EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND, null), cardType7);
        intervalLookup.put(a(EglobalUtils.NOT_INIT_KEYS, null), cardType3);
        intervalLookup.put(a(EglobalUtils.READ_CARD_ERROR, null), cardType7);
        intervalLookup.put(a("644", "649"), cardType3);
        intervalLookup.put(a(EglobalUtils.DOUBLE_AUTH_MC_CODE, null), cardType3);
        intervalLookup.put(a("66", "69"), cardType7);
        intervalLookup.put(a("88", null), cardType3);
        for (Map.Entry<Pair<String, String>, CardType> entry : intervalLookup.entrySet()) {
            minDigits = Math.max(minDigits, ((String) entry.getKey().first).length());
            if (entry.getKey().second != null) {
                minDigits = Math.max(minDigits, ((String) entry.getKey().second).length());
            }
        }
    }

    CardType(String str) {
        this.name = str;
    }

    public static Pair<String, String> a(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        return new Pair<>(str, str2);
    }

    public static CardType fromCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<Pair<String, String>, CardType> entry : intervalLookup.entrySet()) {
            String str2 = (String) entry.getKey().first;
            String str3 = (String) entry.getKey().second;
            int iMin = Math.min(str.length(), str2.length());
            int iMin2 = Math.min(str.length(), str3.length());
            if (Integer.parseInt(str.substring(0, iMin)) >= Integer.parseInt(str2.substring(0, iMin)) && Integer.parseInt(str.substring(0, iMin2)) <= Integer.parseInt(str3.substring(0, iMin2))) {
                hashSet.add(entry.getValue());
            }
        }
        if (hashSet.size() > 1) {
            return INSUFFICIENT_DIGITS;
        }
        return hashSet.size() == 1 ? (CardType) hashSet.iterator().next() : UNKNOWN;
    }

    public static CardType fromString(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (CardType cardType : values()) {
            if (cardType != UNKNOWN && cardType != INSUFFICIENT_DIGITS && str.equalsIgnoreCase(cardType.toString())) {
                return cardType;
            }
        }
        return UNKNOWN;
    }

    public int cvvLength() {
        switch (a.f69753a[ordinal()]) {
            case 1:
                return 4;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 3;
            default:
                return -1;
        }
    }

    public String getDisplayName(String str) {
        switch (a.f69753a[ordinal()]) {
            case 1:
                return LocalizedStrings.getString(StringKey.CARDTYPE_AMERICANEXPRESS, str);
            case 2:
            case 3:
                return LocalizedStrings.getString(StringKey.CARDTYPE_DISCOVER, str);
            case 4:
                return LocalizedStrings.getString(StringKey.CARDTYPE_JCB, str);
            case 5:
                return LocalizedStrings.getString(StringKey.CARDTYPE_MASTERCARD, str);
            case 6:
                return LocalizedStrings.getString(StringKey.CARDTYPE_MAESTRO, str);
            case 7:
                return LocalizedStrings.getString(StringKey.CARDTYPE_VISA, str);
            default:
                return null;
        }
    }

    public Bitmap imageBitmap(Context context) {
        int i10;
        int i11 = a.f69753a[ordinal()];
        if (i11 == 1) {
            i10 = R.drawable.cio_ic_amex;
        } else if (i11 == 2 || i11 == 3) {
            i10 = R.drawable.cio_ic_discover;
        } else if (i11 == 4) {
            i10 = R.drawable.cio_ic_jcb;
        } else if (i11 != 5) {
            i10 = i11 != 7 ? -1 : R.drawable.cio_ic_visa;
        } else {
            i10 = R.drawable.cio_ic_mastercard;
        }
        if (i10 != -1) {
            return BitmapFactory.decodeResource(context.getResources(), i10);
        }
        return null;
    }

    public int numberLength() {
        switch (a.f69753a[ordinal()]) {
            case 1:
                return 15;
            case 2:
                return 14;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 16;
            case 8:
                return minDigits;
            default:
                return -1;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
