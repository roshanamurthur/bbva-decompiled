package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u001a\u0010 \u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0012\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%"}, d2 = {"Lcom/mypinpad/tsdk/i/ca;", "", "", "setLayoutAnimation", "()Z", "setOnDragListener", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Z", "setX", "", "p1", "p2", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;JJ)Z", "", "a", "[B", "setOnFocusChangeListener", "()[B", "", "b", "B", "()B", "Lcom/mypinpad/tsdk/i/by;", "c", "Lcom/mypinpad/tsdk/i/by;", "()Lcom/mypinpad/tsdk/i/by;", "setY", "Lcom/mypinpad/tsdk/i/cf;", "d", "Lcom/mypinpad/tsdk/i/cf;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/cf;", "Lcom/mypinpad/tsdk/i/cb;", "e", "Lcom/mypinpad/tsdk/i/cb;", "()Lcom/mypinpad/tsdk/i/cb;", "<init>", "([B)V"}, k = 1, mv = {1, 5, 1})
public final class ca {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54789f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54790g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final byte setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final by setY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cf setDividerPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cb setOnFocusChangeListener;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[by.valuesCustom().length];
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 1;
            iArr[by.ENCIPHERED_PIN_VERIFIED_ONLINE.ordinal()] = 2;
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 3;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 4;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 5;
            iArr[by.SIGNATURE_PAPER.ordinal()] = 6;
            iArr[by.NO_CVM_REQUIRED.ordinal()] = 7;
            iArr[by.RFU.ordinal()] = 8;
            iArr[by.FAIL_CVM_PROCESSING.ordinal()] = 9;
            setOnFocusChangeListener = iArr;
            int[] iArr2 = new int[cb.valuesCustom().length];
            iArr2[cb.ALWAYS.ordinal()] = 1;
            iArr2[cb.IF_UNATTENDED_CASH.ordinal()] = 2;
            iArr2[cb.IF_MANUAL_CASH.ordinal()] = 3;
            iArr2[cb.IF_NOT_UNATTENDED_CASH_AND_NOT_MANUAL_CASH_AND_NOT_PURCHASE_WITH_CASHBACK.ordinal()] = 4;
            iArr2[cb.IF_TERMINAL_SUPPORTS_THE_CVM.ordinal()] = 5;
            iArr2[cb.IF_PURCHASE_WITH_CASHBACK.ordinal()] = 6;
            iArr2[cb.IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_UNDER_X.ordinal()] = 7;
            iArr2[cb.IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_OVER_X.ordinal()] = 8;
            iArr2[cb.IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_UNDER_Y.ordinal()] = 9;
            iArr2[cb.IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_OVER_Y.ordinal()] = 10;
            setCompoundDrawableTintBlendMode = iArr2;
            int i10 = 17 % 128;
            if (17 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f54789f;
        int i11 = ((i10 & 108) + (i10 | 108)) - 1;
        f54790g = i11 % 128;
        int i12 = i11 % 2;
    }

    public ca(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setX = bArr;
        byte b10 = bArr[0];
        this.setCompoundDrawableTintBlendMode = b10;
        by.Companion companion = by.INSTANCE;
        this.setY = (by) by.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(b10), 5, 6}, -1812187572, 1812187578, 5)).byteValue())}, -2066420717, 2066420717, (int) System.currentTimeMillis());
        cf.Companion companion2 = cf.INSTANCE;
        this.setDividerPadding = (cf) cf.Companion.setOnFocusChangeListener(new Object[]{Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(bArr[0]), 6, 1}, -1812187572, 1812187578, 6)).byteValue())}, -1450463035, 1450463035, (int) System.currentTimeMillis());
        cb.Companion companion3 = cb.INSTANCE;
        this.setOnFocusChangeListener = (cb) cb.Companion.setX(new Object[]{Byte.valueOf(bArr[1])}, -2037287875, 2037287876, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0504  */
    /* JADX WARN: Code duplicated, block: B:103:0x0508  */
    /* JADX WARN: Code duplicated, block: B:105:0x0518  */
    /* JADX WARN: Code duplicated, block: B:25:0x026b  */
    /* JADX WARN: Code duplicated, block: B:97:0x043d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0441  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        char c10;
        char c11;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        ca caVar = (ca) objArr[0];
        Boolean bool = Boolean.TRUE;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        de deVar = new de(setscrollbardefaultdelaybeforefade);
        dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
        md mdVar = (md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar));
        cx cxVar = new cx(setscrollbardefaultdelaybeforefade);
        cw cwVar = (cw) ((setImageTintList) w.setX(new Object[]{cxVar}, 1693919772, -1693919769, System.identityHashCode(cxVar)));
        da daVar = (da) cw.setY(new Object[]{cwVar}, -1066192597, 1066192597, System.identityHashCode(cwVar));
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        Intrinsics.checkNotNull(getbeeponfailure);
        long jLongValue3 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue();
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.setPersistentDrawingCache()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure2 == null) {
            int iIdentityHashCode = System.identityHashCode(caVar);
            int i14 = ~iIdentityHashCode;
            int i15 = (-1883751761) ^ i14;
            int i16 = i14 & (-1883751761);
            int i17 = ~((i15 & i16) | (i15 ^ i16));
            int i18 = -(-(((1615299856 ^ i17) | (i17 & 1615299856)) * 446));
            int i19 = (((-1838288311) | i18) << 1) - (i18 ^ (-1838288311));
            int i20 = ~((iIdentityHashCode & (-268451905)) | ((-268451905) ^ iIdentityHashCode));
            int i21 = 211298339 & i20;
            int i22 = (~i21) & (i20 | 211298339);
            int i23 = ((i22 & i21) | (i22 ^ i21)) * 446;
            int i24 = (i19 & i23) + (i19 | i23);
            int i25 = (i24 & (-1130769951)) + ((-1130769951) | i24);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            int iIdentityHashCode2 = System.identityHashCode(caVar);
            int i27 = ~iIdentityHashCode2;
            int i28 = (i27 | iIdentityHashCode2) & i27;
            int i29 = 259222572 & i28;
            int i30 = (~i29) & (259222572 | i28);
            int i31 = (i29 & i30) | (i30 ^ i29);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = (-1627358304) & i27;
            int i35 = i34 | (iIdentityHashCode2 & 1627358303);
            int i36 = (-1627358304) & iIdentityHashCode2;
            int i37 = ~((i35 ^ i36) | (i35 & i36));
            int i38 = i33 & i37;
            int i39 = (((i33 | i37) & (~i38)) | i38) * 333;
            int i40 = ((2085721705 | i39) << 1) - (i39 ^ 2085721705);
            int i41 = 259222572 & iIdentityHashCode2;
            int i42 = ~(i41 | ((259222572 | iIdentityHashCode2) & (~i41)));
            int i43 = ~(((-1627358304) ^ i27) | i34);
            int i44 = ((i42 & i43) | ((~i43) & i42) | ((~i42) & i43)) * 333;
            c10 = 1;
            if (i26 <= ((((~i44) & i40) | ((~i40) & i44)) - (~((i44 & i40) << 1))) - 1) {
                c11 = 0;
                int i45 = 9 / 0;
            } else {
                c11 = 0;
            }
            bArr = null;
        } else {
            c10 = 1;
            c11 = 0;
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
        }
        TransactionFailed compoundDrawablePadding = setAnimation.setCompoundDrawablePadding();
        Object[] objArr2 = new Object[2];
        objArr2[c11] = setscrollbardefaultdelaybeforefade;
        objArr2[c10] = compoundDrawablePadding;
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure3 == null) {
            int i46 = f54789f;
            int i47 = (i46 & 123) + (i46 | 123);
            int i48 = i47 % 128;
            f54790g = i48;
            int i49 = i47 % 2;
            int i50 = i48 & 121;
            int i51 = -(-((i48 ^ 121) | i50));
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            f54789f = i52 % 128;
            int i53 = i52 % 2;
            bArr2 = null;
        } else {
            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
        }
        if (bArr != null) {
            int i54 = f54789f;
            int i55 = (i54 ^ 31) + ((i54 & 31) << 1);
            f54790g = i55 % 128;
            if (i55 % 2 == 0) {
                throw null;
            }
            if (bArr2 != null) {
                int i56 = i54 & 43;
                int i57 = i56 + ((i54 ^ 43) | i56);
                f54790g = i57 % 128;
                int i58 = i57 % 2;
                if (!Arrays.equals(bArr, bArr2)) {
                    int i59 = f54789f;
                    int i60 = ((i59 & 74) + (i59 | 74)) - 1;
                    f54790g = i60 % 128;
                    int i61 = i60 % 2;
                    z10 = false;
                } else {
                    int i62 = f54790g;
                    int i63 = i62 + 121;
                    f54789f = i63 % 128;
                    int i64 = i63 % 2;
                    int i65 = ((i62 | 87) << 1) - (((~i62) & 87) | (i62 & (-88)));
                    f54789f = i65 % 128;
                    int i66 = i65 % 2;
                    z10 = true;
                }
            } else {
                int i510 = f54789f;
                int i67 = ((i510 & 74) + (i510 | 74)) - 1;
                f54790g = i67 % 128;
                int i68 = i67 % 2;
                z10 = false;
            }
        } else {
            int i511 = f54789f;
            int i69 = ((i511 & 74) + (i511 | 74)) - 1;
            f54790g = i69 % 128;
            int i610 = i69 % 2;
            z10 = false;
        }
        switch (setY.setCompoundDrawableTintBlendMode[caVar.setOnFocusChangeListener.ordinal()]) {
            case 1:
                int i70 = f54789f;
                int i71 = (i70 ^ 55) + ((i70 & 55) << 1);
                f54790g = i71 % 128;
                if (i71 % 2 != 0) {
                    return bool;
                }
                throw null;
            case 2:
                if (daVar.setY() == ck.setX) {
                    int i72 = f54790g;
                    int i73 = i72 & 65;
                    int i74 = (i73 - (~(-(-((i72 ^ 65) | i73))))) - 1;
                    f54789f = i74 % 128;
                    if (i74 % 2 != 0) {
                        md.Companion companion = md.INSTANCE;
                        throw null;
                    }
                    if (mdVar == md.setDividerPadding) {
                        int i75 = f54790g;
                        int i76 = i75 & 37;
                        int i77 = (((i75 ^ 37) | i76) << 1) - ((i75 | 37) & (~i76));
                        f54789f = i77 % 128;
                        int i78 = i77 % 2;
                        return bool;
                    }
                }
                int i79 = (-2) - ((f54789f + 44) ^ (-1));
                f54790g = i79 % 128;
                if (i79 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 3:
                if (mdVar == md.setOnLongClickListener) {
                    int i80 = f54789f + 31;
                    f54790g = i80 % 128;
                    int i81 = i80 % 2;
                    return bool;
                }
                int i82 = f54790g + 18;
                int i83 = (i82 ^ (-1)) + (i82 << 1);
                f54789f = i83 % 128;
                if (i83 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 4:
                if (daVar.setY() == ck.setX) {
                    int i84 = f54789f;
                    int i85 = i84 & 3;
                    int i86 = -(-((i84 ^ 3) | i85));
                    int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                    f54790g = i87 % 128;
                    int i88 = i87 % 2;
                    if (mdVar != md.setDividerPadding) {
                        if (mdVar != md.setOnLongClickListener) {
                            int iIdentityHashCode3 = System.identityHashCode(caVar);
                            int i89 = 1085357163 & iIdentityHashCode3;
                            int i90 = (~i89) & (1085357163 | iIdentityHashCode3);
                            int i91 = ~iIdentityHashCode3;
                            int i92 = ~((i89 & i90) | (i90 ^ i89));
                            int i93 = (i91 | iIdentityHashCode3) & i91;
                            int i94 = i93 & 1002939190;
                            int i95 = ((i93 | 1002939190) & (~i94)) | i94;
                            int i96 = (i92 | (~((i95 & (-1085357164)) | (i95 ^ (-1085357164))))) * (-406);
                            int i97 = ((-1822180386) ^ i96) + ((i96 & (-1822180386)) << 1);
                            int i98 = ~i91;
                            int i99 = i91 & (-1085357164);
                            int i100 = (1085357163 & i98) | i99;
                            int i101 = 1085357163 & i91;
                            int i102 = (i100 & i101) | (i100 ^ i101);
                            int i103 = i102 ^ 1002939190;
                            int i104 = i102 & 1002939190;
                            int i105 = (i104 & i103) | (i103 ^ i104);
                            int i106 = ~i105;
                            int i107 = -(-(((i105 | i106) & i106) * (-406)));
                            int i108 = i97 & i107;
                            int i109 = i107 | i97;
                            int i110 = (i108 ^ i109) + ((i109 & i108) << 1);
                            int i111 = (-1002939191) & iIdentityHashCode3;
                            int i112 = (iIdentityHashCode3 | (-1002939191)) & (~i111);
                            int i113 = ~((i112 & i111) | (i112 ^ i111));
                            int i114 = i101 | (i98 & (-1085357164));
                            int i115 = ~((i114 & i99) | (i114 ^ i99));
                            int i116 = ((i113 & i115) | ((~i115) & i113) | ((~i113) & i115)) * 406;
                            int i117 = ((i110 ^ i116) | (i110 & i116)) << 1;
                            int i118 = -((i116 & (~i110)) | ((~i116) & i110));
                            i10 = (i117 & i118) + (i118 | i117);
                            int iIdentityHashCode4 = System.identityHashCode(caVar);
                            int i119 = (-118496812) ^ iIdentityHashCode4;
                            int i120 = ~iIdentityHashCode4;
                            int i121 = (-118496812) & iIdentityHashCode4;
                            int i122 = (i119 & i121) | (i119 ^ i121);
                            int i123 = ~i122;
                            int i124 = (i122 | i123) & i123;
                            int i125 = 537026704 & i124;
                            int i126 = (i124 | 537026704) & (~i125);
                            int i127 = -(~(-(-(((i126 & i125) | (i126 ^ i125)) * (-756)))));
                            i11 = ((2073068948 ^ i127) + ((i127 & 2073068948) << 1)) - 1;
                            int i128 = (iIdentityHashCode4 | i120) & i120;
                            i12 = (-118496812) & i128;
                            i13 = (i128 | (-118496812)) & (~i12);
                            if (i10 <= (((i13 & i12) | (i13 ^ i12)) * 756) + i11) {
                                throw null;
                            }
                            if (mdVar != md.setY) {
                                int i129 = f54790g;
                                int i130 = ((i129 | 45) << 1) - (i129 ^ 45);
                                f54789f = i130 % 128;
                                int i131 = i130 % 2;
                                return bool;
                            }
                        }
                    }
                } else if (mdVar != md.setOnLongClickListener) {
                    int iIdentityHashCode5 = System.identityHashCode(caVar);
                    int i810 = 1085357163 & iIdentityHashCode5;
                    int i910 = (~i810) & (1085357163 | iIdentityHashCode5);
                    int i911 = ~iIdentityHashCode5;
                    int i912 = ~((i810 & i910) | (i910 ^ i810));
                    int i913 = (i911 | iIdentityHashCode5) & i911;
                    int i914 = i913 & 1002939190;
                    int i915 = ((i913 | 1002939190) & (~i914)) | i914;
                    int i916 = (i912 | (~((i915 & (-1085357164)) | (i915 ^ (-1085357164))))) * (-406);
                    int i917 = ((-1822180386) ^ i916) + ((i916 & (-1822180386)) << 1);
                    int i918 = ~i911;
                    int i919 = i911 & (-1085357164);
                    int i1010 = (1085357163 & i918) | i919;
                    int i1011 = 1085357163 & i911;
                    int i1012 = (i1010 & i1011) | (i1010 ^ i1011);
                    int i1013 = i1012 ^ 1002939190;
                    int i1014 = i1012 & 1002939190;
                    int i1015 = (i1014 & i1013) | (i1013 ^ i1014);
                    int i1016 = ~i1015;
                    int i1017 = -(-(((i1015 | i1016) & i1016) * (-406)));
                    int i1018 = i917 & i1017;
                    int i1019 = i1017 | i917;
                    int i1110 = (i1018 ^ i1019) + ((i1019 & i1018) << 1);
                    int i1111 = (-1002939191) & iIdentityHashCode5;
                    int i1112 = (iIdentityHashCode5 | (-1002939191)) & (~i1111);
                    int i1113 = ~((i1112 & i1111) | (i1112 ^ i1111));
                    int i1114 = i1011 | (i918 & (-1085357164));
                    int i1115 = ~((i1114 & i919) | (i1114 ^ i919));
                    int i1116 = ((i1113 & i1115) | ((~i1115) & i1113) | ((~i1113) & i1115)) * 406;
                    int i1117 = ((i1110 ^ i1116) | (i1110 & i1116)) << 1;
                    int i1118 = -((i1116 & (~i1110)) | ((~i1116) & i1110));
                    i10 = (i1117 & i1118) + (i1118 | i1117);
                    int iIdentityHashCode6 = System.identityHashCode(caVar);
                    int i1119 = (-118496812) ^ iIdentityHashCode6;
                    int i1210 = ~iIdentityHashCode6;
                    int i1211 = (-118496812) & iIdentityHashCode6;
                    int i1212 = (i1119 & i1211) | (i1119 ^ i1211);
                    int i1213 = ~i1212;
                    int i1214 = (i1212 | i1213) & i1213;
                    int i1215 = 537026704 & i1214;
                    int i1216 = (i1214 | 537026704) & (~i1215);
                    int i1217 = -(~(-(-(((i1216 & i1215) | (i1216 ^ i1215)) * (-756)))));
                    i11 = ((2073068948 ^ i1217) + ((i1217 & 2073068948) << 1)) - 1;
                    int i1218 = (iIdentityHashCode6 | i1210) & i1210;
                    i12 = (-118496812) & i1218;
                    i13 = (i1218 | (-118496812)) & (~i12);
                    if (i10 <= (((i13 & i12) | (i13 ^ i12)) * 756) + i11) {
                        throw null;
                    }
                    if (mdVar != md.setY) {
                        int i1219 = f54790g;
                        int i132 = ((i1219 | 45) << 1) - (i1219 ^ 45);
                        f54789f = i132 % 128;
                        int i133 = i132 % 2;
                        return bool;
                    }
                }
                return Boolean.FALSE;
            case 5:
                boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade}, 547054515, -547054507, System.identityHashCode(caVar))).booleanValue();
                int i134 = f54789f;
                int i135 = (i134 & (-66)) | ((~i134) & 65);
                int i136 = -(-((i134 & 65) << 1));
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                f54790g = i137 % 128;
                int i138 = i137 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 6:
                if (mdVar != md.setY) {
                    int i139 = f54789f;
                    int i140 = i139 & 1;
                    int i141 = (i139 | 1) & (~i140);
                    int i142 = i140 << 1;
                    int i143 = (i141 & i142) + (i141 | i142);
                    f54790g = i143 % 128;
                    int i144 = i143 % 2;
                    return Boolean.FALSE;
                }
                int i145 = f54789f;
                int i146 = ((i145 | 71) << 1) - (i145 ^ 71);
                int i147 = i146 % 128;
                f54790g = i147;
                int i148 = i146 % 2;
                int i149 = (((i147 ^ 101) | (i147 & 101)) << 1) - (((~i147) & 101) | (i147 & (-102)));
                f54789f = i149 % 128;
                int i150 = i149 % 2;
                return bool;
            case 7:
                if (z10) {
                    int i151 = f54789f;
                    int i152 = (i151 & 83) + (i151 | 83);
                    int i153 = i152 % 128;
                    f54790g = i153;
                    int i154 = i152 % 2;
                    if (jLongValue3 < jLongValue) {
                        int i155 = i153 ^ 105;
                        int i156 = (((i153 & 105) | i155) << 1) - i155;
                        f54789f = i156 % 128;
                        return Boolean.valueOf(i156 % 2 == 0);
                    }
                }
                int i157 = f54790g;
                int i158 = (((i157 | 96) << 1) - (i157 ^ 96)) - 1;
                f54789f = i158 % 128;
                if (i158 % 2 == 0) {
                    return Boolean.FALSE;
                }
                int i159 = 99 / 0;
                return Boolean.FALSE;
            case 8:
                if (!(!z10)) {
                    int i160 = f54789f;
                    int i161 = (i160 & 95) << 1;
                    int i162 = (i160 ^ 95) + i161;
                    f54790g = i162 % 128;
                    int i163 = i162 % 2;
                    if (jLongValue3 > jLongValue) {
                        int i164 = (((i160 & (-96)) | ((~i160) & 95)) - (~i161)) - 1;
                        f54790g = i164 % 128;
                        int i165 = i164 % 2;
                        int i166 = i160 & 1;
                        int i167 = ((i160 ^ 1) | i166) << 1;
                        int i168 = -((i160 | 1) & (~i166));
                        int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                        f54790g = i169 % 128;
                        int i170 = i169 % 2;
                        return bool;
                    }
                }
                int i171 = f54790g;
                int i172 = i171 & 49;
                int i173 = i172 + ((i171 ^ 49) | i172);
                f54789f = i173 % 128;
                if (i173 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 9:
                if (z10) {
                    int i174 = f54789f;
                    int i175 = i174 & 77;
                    int i176 = ((i174 | 77) & (~i175)) + (i175 << 1);
                    int i177 = i176 % 128;
                    f54790g = i177;
                    if (i176 % 2 == 0) {
                        throw null;
                    }
                    if (jLongValue3 < jLongValue2) {
                        int i178 = (i177 ^ 87) + ((i177 & 87) << 1);
                        f54789f = i178 % 128;
                        if (i178 % 2 == 0) {
                            return bool;
                        }
                        throw null;
                    }
                }
                return Boolean.FALSE;
            case 10:
                if (z10) {
                    int i179 = f54790g;
                    int i180 = ((i179 ^ 54) + ((i179 & 54) << 1)) - 1;
                    f54789f = i180 % 128;
                    int i181 = i180 % 2;
                    if (jLongValue3 > jLongValue2) {
                        int i182 = i179 | 73;
                        int i183 = ((i182 << 1) - (~(-((~(i179 & 73)) & i182)))) - 1;
                        f54789f = i183 % 128;
                        int i184 = i183 % 2;
                        return bool;
                    }
                }
                int i185 = f54790g + 47;
                f54789f = i185 % 128;
                if (i185 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            default:
                throw new fh(27, String.valueOf((int) caVar.setOnFocusChangeListener.setCompoundDrawableTintBlendMode()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0681, code lost:
    
        if ((r0 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0686, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0687, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ca.f54789f;
        r1 = r0 & 13;
        r1 = (r1 - (~((r0 ^ 13) | r1))) - 1;
        com.mypinpad.tsdk.isolation.ca.f54790g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0696, code lost:
    
        if ((r1 % 2) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x069a, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x069b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0656, code lost:
    
        if (kotlin.collections.CollectionsKt__CollectionsKt.listOf((java.lang.Object[]) r1).contains(r0.setY) != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x066b, code lost:
    
        if (kotlin.collections.CollectionsKt__CollectionsKt.listOf((java.lang.Object[]) r1).contains(r0.setY) != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x066d, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ca.f54790g + 19;
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.ca.f54789f = r1;
        r0 = r0 % 2;
        r0 = r1 & 83;
        r0 = r0 + ((r1 ^ 83) | r0);
        com.mypinpad.tsdk.isolation.ca.f54790g = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ca.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4, long p10, long p11) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4, Long.valueOf(p10), Long.valueOf(p11)}, -1335075487, 1335075493, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final cf setDividerPadding() {
        return (cf) setOnFocusChangeListener(new Object[]{this}, -943319764, 943319766, System.identityHashCode(this));
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -14328844, 14328848, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1425072868, -1425072867, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setX(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 2074548862, -2074548853, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    @NotNull
    public final cb setY() {
        return (cb) setOnFocusChangeListener(new Object[]{this}, 115119597, -115119594, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 547054515, -547054507, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setX")
    @NotNull
    public final by setX() {
        return (by) setOnFocusChangeListener(new Object[]{this}, 1299031735, -1299031735, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -453853430, 453853437, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -750046195, 750046200, System.identityHashCode(this));
    }
}
