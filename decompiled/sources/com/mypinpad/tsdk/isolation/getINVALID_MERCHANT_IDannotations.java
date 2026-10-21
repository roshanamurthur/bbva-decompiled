package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/getINVALID_MERCHANT_IDannotations;", "", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setX", "setOnFocusChangeListener", "setY", "setLayoutAnimation", "setNavigationOnClickListener", "setOnLongClickListener", "getNavBarTitleString"}, k = 1, mv = {1, 5, 1})
public final class getINVALID_MERCHANT_IDannotations {
    public static final getINVALID_MERCHANT_IDannotations getNavBarTitleString;
    public static final getINVALID_MERCHANT_IDannotations setCompoundDrawableTintBlendMode;
    public static final getINVALID_MERCHANT_IDannotations setDividerPadding;
    private static int setIncludeFontPadding = 1;
    public static final getINVALID_MERCHANT_IDannotations setLayoutAnimation;
    public static final getINVALID_MERCHANT_IDannotations setNavigationOnClickListener;
    private static final /* synthetic */ getINVALID_MERCHANT_IDannotations[] setOnDragListener;
    public static final getINVALID_MERCHANT_IDannotations setOnFocusChangeListener;
    public static final getINVALID_MERCHANT_IDannotations setOnLongClickListener;
    public static final getINVALID_MERCHANT_IDannotations setX;
    public static final getINVALID_MERCHANT_IDannotations setY;
    private static int setZ;

    static {
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = new getINVALID_MERCHANT_IDannotations("AMERICAN_EXPRESS", 0);
        setCompoundDrawableTintBlendMode = getinvalid_merchant_idannotations;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations2 = new getINVALID_MERCHANT_IDannotations("DISCOVER", 1);
        setDividerPadding = getinvalid_merchant_idannotations2;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations3 = new getINVALID_MERCHANT_IDannotations("EFTPOS", 2);
        setX = getinvalid_merchant_idannotations3;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations4 = new getINVALID_MERCHANT_IDannotations("INTERAC", 3);
        setOnFocusChangeListener = getinvalid_merchant_idannotations4;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations5 = new getINVALID_MERCHANT_IDannotations("JCB", 4);
        setY = getinvalid_merchant_idannotations5;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations6 = new getINVALID_MERCHANT_IDannotations(ProviderType.PROVIDER_ID_MASTERCARD, 5);
        setLayoutAnimation = getinvalid_merchant_idannotations6;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations7 = new getINVALID_MERCHANT_IDannotations("RUPAY", 6);
        setNavigationOnClickListener = getinvalid_merchant_idannotations7;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations8 = new getINVALID_MERCHANT_IDannotations("UNION_PAY", 7);
        setOnLongClickListener = getinvalid_merchant_idannotations8;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations9 = new getINVALID_MERCHANT_IDannotations(ProviderType.PROVIDER_ID_VISA, 8);
        getNavBarTitleString = getinvalid_merchant_idannotations9;
        int i10 = (-2) - (((1 & 56) + (1 | 56)) ^ (-1));
        setZ = i10 % 128;
        int i11 = i10 % 2;
        getINVALID_MERCHANT_IDannotations[] getinvalid_merchant_idannotationsArr = {getinvalid_merchant_idannotations, getinvalid_merchant_idannotations2, getinvalid_merchant_idannotations3, getinvalid_merchant_idannotations4, getinvalid_merchant_idannotations5, getinvalid_merchant_idannotations6, getinvalid_merchant_idannotations7, getinvalid_merchant_idannotations8, getinvalid_merchant_idannotations9};
        int i12 = (1 & 55) + (1 | 55);
        setZ = i12 % 128;
        int i13 = i12 % 2;
        setOnDragListener = getinvalid_merchant_idannotationsArr;
        int i14 = (1 & 99) + (1 | 99);
        setZ = i14 % 128;
        int i15 = i14 % 2;
    }

    public getINVALID_MERCHANT_IDannotations() {
        throw null;
    }

    public static getINVALID_MERCHANT_IDannotations valueOf(String str) {
        int i10 = setZ;
        int i11 = i10 & 11;
        int i12 = ((i10 ^ 11) | i11) << 1;
        int i13 = -((i10 | 11) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setIncludeFontPadding = i14 % 128;
        int i15 = i14 % 2;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = (getINVALID_MERCHANT_IDannotations) Enum.valueOf(getINVALID_MERCHANT_IDannotations.class, str);
        int i16 = setIncludeFontPadding;
        int i17 = (((i16 ^ 9) | (i16 & 9)) << 1) - (((~i16) & 9) | (i16 & (-10)));
        setZ = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 68 / 0;
        }
        return getinvalid_merchant_idannotations;
    }

    public static getINVALID_MERCHANT_IDannotations[] values() {
        int i10 = setIncludeFontPadding;
        int i11 = i10 & 1;
        int i12 = (i10 | 1) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        setZ = i14 % 128;
        int i15 = i14 % 2;
        getINVALID_MERCHANT_IDannotations[] getinvalid_merchant_idannotationsArr = (getINVALID_MERCHANT_IDannotations[]) setOnDragListener.clone();
        int i16 = setIncludeFontPadding + 25;
        setZ = i16 % 128;
        int i17 = i16 % 2;
        return getinvalid_merchant_idannotationsArr;
    }
}
