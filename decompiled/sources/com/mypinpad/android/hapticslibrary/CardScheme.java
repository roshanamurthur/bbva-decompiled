package com.mypinpad.android.hapticslibrary;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CardScheme.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mypinpad/android/hapticslibrary/CardScheme;", "", ProviderType.PROVIDER_ID_MASTERCARD, ProviderType.PROVIDER_ID_VISA, "android-scheme-haptics-library.implementation"}, k = 1, mv = {1, 7, 1})
public final class CardScheme {
    private static final /* synthetic */ CardScheme[] $VALUES;
    public static final CardScheme MASTERCARD;
    public static final CardScheme VISA;

    static {
        CardScheme cardScheme = new CardScheme(ProviderType.PROVIDER_ID_MASTERCARD, 0);
        MASTERCARD = cardScheme;
        CardScheme cardScheme2 = new CardScheme(ProviderType.PROVIDER_ID_VISA, 1);
        VISA = cardScheme2;
        $VALUES = new CardScheme[]{cardScheme, cardScheme2};
    }

    public CardScheme() {
        throw null;
    }

    public static CardScheme valueOf(String str) {
        return (CardScheme) Enum.valueOf(CardScheme.class, str);
    }

    public static CardScheme[] values() {
        return (CardScheme[]) $VALUES.clone();
    }
}
