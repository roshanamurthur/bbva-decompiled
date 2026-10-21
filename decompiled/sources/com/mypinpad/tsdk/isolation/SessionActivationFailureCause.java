package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/SessionActivationFailureCause;", "", "setY", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setX", "setLayoutAnimation", "setNavigationOnClickListener", "setOnDragListener", "getNavBarTitleString"}, k = 1, mv = {1, 5, 1})
public final class SessionActivationFailureCause {
    public static final SessionActivationFailureCause getNavBarTitleString;
    public static final SessionActivationFailureCause setCompoundDrawableTintBlendMode;
    public static final SessionActivationFailureCause setDividerPadding;
    private static int setIncludeFontPadding = 1;
    public static final SessionActivationFailureCause setLayoutAnimation;
    public static final SessionActivationFailureCause setNavigationOnClickListener;
    public static final SessionActivationFailureCause setOnDragListener;
    public static final SessionActivationFailureCause setOnFocusChangeListener;
    private static final /* synthetic */ SessionActivationFailureCause[] setOnLongClickListener;
    private static int setTextAlignment;
    public static final SessionActivationFailureCause setX;
    public static final SessionActivationFailureCause setY;

    static {
        SessionActivationFailureCause sessionActivationFailureCause = new SessionActivationFailureCause("AMERICAN_EXPRESS", 0);
        setY = sessionActivationFailureCause;
        SessionActivationFailureCause sessionActivationFailureCause2 = new SessionActivationFailureCause("EFTPOS", 1);
        setOnFocusChangeListener = sessionActivationFailureCause2;
        SessionActivationFailureCause sessionActivationFailureCause3 = new SessionActivationFailureCause("DISCOVER", 2);
        setCompoundDrawableTintBlendMode = sessionActivationFailureCause3;
        SessionActivationFailureCause sessionActivationFailureCause4 = new SessionActivationFailureCause("INTERAC", 3);
        setDividerPadding = sessionActivationFailureCause4;
        SessionActivationFailureCause sessionActivationFailureCause5 = new SessionActivationFailureCause("JCB", 4);
        setX = sessionActivationFailureCause5;
        SessionActivationFailureCause sessionActivationFailureCause6 = new SessionActivationFailureCause(ProviderType.PROVIDER_ID_MASTERCARD, 5);
        setLayoutAnimation = sessionActivationFailureCause6;
        SessionActivationFailureCause sessionActivationFailureCause7 = new SessionActivationFailureCause("RUPAY", 6);
        setNavigationOnClickListener = sessionActivationFailureCause7;
        SessionActivationFailureCause sessionActivationFailureCause8 = new SessionActivationFailureCause("UNION_PAY", 7);
        setOnDragListener = sessionActivationFailureCause8;
        SessionActivationFailureCause sessionActivationFailureCause9 = new SessionActivationFailureCause(ProviderType.PROVIDER_ID_VISA, 8);
        getNavBarTitleString = sessionActivationFailureCause9;
        int i10 = 1 & 111;
        int i11 = (((1 ^ 111) | i10) << 1) - ((~i10) & (1 | 111));
        int i12 = i11 % 128;
        setTextAlignment = i12;
        int i13 = i11 % 2;
        SessionActivationFailureCause[] sessionActivationFailureCauseArr = {sessionActivationFailureCause, sessionActivationFailureCause2, sessionActivationFailureCause3, sessionActivationFailureCause4, sessionActivationFailureCause5, sessionActivationFailureCause6, sessionActivationFailureCause7, sessionActivationFailureCause8, sessionActivationFailureCause9};
        int i14 = i12 & 13;
        int i15 = i14 + ((i12 ^ 13) | i14);
        setIncludeFontPadding = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 95 / 0;
        }
        setOnLongClickListener = sessionActivationFailureCauseArr;
        int i17 = (((i12 ^ 119) | (i12 & 119)) << 1) - ((i12 & (-120)) | ((~i12) & 119));
        setIncludeFontPadding = i17 % 128;
        int i18 = i17 % 2;
    }

    public SessionActivationFailureCause() {
        throw null;
    }

    public static SessionActivationFailureCause valueOf(String str) {
        int i10 = setTextAlignment;
        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
        setIncludeFontPadding = i11 % 128;
        int i12 = i11 % 2;
        SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) Enum.valueOf(SessionActivationFailureCause.class, str);
        int i13 = setIncludeFontPadding;
        int i14 = (i13 & 37) + (i13 | 37);
        setTextAlignment = i14 % 128;
        if (i14 % 2 == 0) {
            return sessionActivationFailureCause;
        }
        throw null;
    }

    public static SessionActivationFailureCause[] values() {
        int i10 = setIncludeFontPadding;
        int i11 = ((i10 | 17) << 1) - (i10 ^ 17);
        setTextAlignment = i11 % 128;
        int i12 = i11 % 2;
        SessionActivationFailureCause[] sessionActivationFailureCauseArr = (SessionActivationFailureCause[]) setOnLongClickListener.clone();
        int i13 = setIncludeFontPadding;
        int i14 = i13 & 85;
        int i15 = (i13 ^ 85) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        setTextAlignment = i16 % 128;
        int i17 = i16 % 2;
        return sessionActivationFailureCauseArr;
    }
}
