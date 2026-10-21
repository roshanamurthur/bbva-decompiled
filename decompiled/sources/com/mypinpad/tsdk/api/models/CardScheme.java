package com.mypinpad.tsdk.api.models;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/models/CardScheme;", "", ProviderType.PROVIDER_ID_MASTERCARD, ProviderType.PROVIDER_ID_VISA, "AMERICAN_EXPRESS", "DISCOVER", "EFTPOS"}, k = 1, mv = {1, 8, 0})
public final class CardScheme {
    public static final CardScheme AMERICAN_EXPRESS;
    public static final CardScheme DISCOVER;
    public static final CardScheme EFTPOS;
    public static final CardScheme MASTERCARD;
    public static final CardScheme VISA;
    private static final /* synthetic */ CardScheme[] setCompoundDrawableTintBlendMode;
    private static int setOnFocusChangeListener = 1;
    private static int setX;

    static {
        CardScheme[] cardSchemeArr;
        CardScheme cardScheme = new CardScheme(ProviderType.PROVIDER_ID_MASTERCARD, 0);
        MASTERCARD = cardScheme;
        CardScheme cardScheme2 = new CardScheme(ProviderType.PROVIDER_ID_VISA, 1);
        VISA = cardScheme2;
        CardScheme cardScheme3 = new CardScheme("AMERICAN_EXPRESS", 2);
        AMERICAN_EXPRESS = cardScheme3;
        CardScheme cardScheme4 = new CardScheme("DISCOVER", 3);
        DISCOVER = cardScheme4;
        CardScheme cardScheme5 = new CardScheme("EFTPOS", 4);
        EFTPOS = cardScheme5;
        int i10 = 1 & 35;
        int i11 = (1 ^ 35) | i10;
        int i12 = (i10 & i11) + (i10 | i11);
        int i13 = i12 % 128;
        setX = i13;
        if (i12 % 2 != 0) {
            cardSchemeArr = new CardScheme[4];
            cardSchemeArr[0] = cardScheme;
            cardSchemeArr[0] = cardScheme2;
            cardSchemeArr[2] = cardScheme3;
            cardSchemeArr[2] = cardScheme4;
            cardSchemeArr[5] = cardScheme5;
        } else {
            cardSchemeArr = new CardScheme[]{cardScheme, cardScheme2, cardScheme3, cardScheme4, cardScheme5};
        }
        int i14 = i13 ^ 123;
        int i15 = -(-((i13 & 123) << 1));
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        setOnFocusChangeListener = i17;
        int i18 = i16 % 2;
        setCompoundDrawableTintBlendMode = cardSchemeArr;
        int i19 = i17 & 99;
        int i20 = ((((i17 ^ 99) | i19) << 1) - (~(-((i17 | 99) & (~i19))))) - 1;
        setX = i20 % 128;
        int i21 = i20 % 2;
    }

    public CardScheme() {
        throw null;
    }

    public static CardScheme valueOf(String str) {
        int i10 = setOnFocusChangeListener;
        int i11 = i10 & 103;
        int i12 = (i10 ^ 103) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        setX = i13 % 128;
        int i14 = i13 % 2;
        CardScheme cardScheme = (CardScheme) Enum.valueOf(CardScheme.class, str);
        if (i14 != 0) {
            int i15 = 30 / 0;
        }
        return cardScheme;
    }

    public static CardScheme[] values() {
        int i10 = setOnFocusChangeListener;
        int i11 = i10 & 113;
        int i12 = ((i10 ^ 113) | i11) << 1;
        int i13 = -((i10 | 113) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        setX = i14 % 128;
        int i15 = i14 % 2;
        CardScheme[] cardSchemeArr = setCompoundDrawableTintBlendMode;
        if (i15 == 0) {
            return (CardScheme[]) cardSchemeArr.clone();
        }
        throw null;
    }
}
