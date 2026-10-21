package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.callbacks.LanguagePreference;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import com.mypinpad.tsdk.api.callbacks.UiMessageId;
import com.mypinpad.tsdk.api.callbacks.ValueQualifier;
import com.mypinpad.tsdk.api.models.Iso4217Currency;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58166a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58167b = 1;

    public final class setCompoundDrawableTintBlendMode implements LanguagePreference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ rf f58168a;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return ((setCompoundDrawableTintBlendMode) objArr[0]).f58168a.setY();
        }

        @Override // com.mypinpad.tsdk.api.callbacks.LanguagePreference
        @NotNull
        public final String getCode() {
            return (String) setY(new Object[]{this}, 629798556, -629798556, System.identityHashCode(this));
        }
    }

    public static final class setOnFocusChangeListener implements UiMessage {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f58169b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f58170c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ sa f58171a;

        /* JADX WARN: Code duplicated, block: B:38:0x0128  */
        /* JADX WARN: Code duplicated, block: B:40:0x015f  */
        /* JADX WARN: Code duplicated, block: B:41:0x0163  */
        /* JADX WARN: Code duplicated, block: B:44:0x016f  */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14;
            UiMessageId uiMessageId;
            int i15 = ~i10;
            int i16 = (((~(i15 | i11)) | (~(i15 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
            int i17 = ~i11;
            int i18 = ((~(i17 | i15 | i12)) * 566) + ((~(i10 | i17)) * 566) + i16;
            Object obj = null;
            if (i18 == 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i19 = f58169b;
                int i20 = (i19 ^ 95) + ((i19 & 95) << 1);
                f58170c = i20 % 128;
                int i21 = i20 % 2;
                Long compoundDrawableTintBlendMode = setonfocuschangelistener.f58171a.setCompoundDrawableTintBlendMode();
                int i22 = f58169b;
                int i23 = ((i22 ^ 92) + ((i22 & 92) << 1)) - 1;
                f58170c = i23 % 128;
                if (i23 % 2 != 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            }
            if (i18 == 2) {
                setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                int i24 = f58170c;
                int i25 = i24 & 125;
                int i26 = (((i24 ^ 125) | i25) << 1) - ((i24 | 125) & (~i25));
                f58169b = i26 % 128;
                int i27 = i26 % 2;
                rz onFocusChangeListener = setonfocuschangelistener2.f58171a.setOnFocusChangeListener();
                if (i27 == 0) {
                    return (ValueQualifier) ry.setDividerPadding(new Object[]{onFocusChangeListener}, 112451902, -112451896, (int) System.currentTimeMillis());
                }
                int i28 = 34 / 0;
                return (ValueQualifier) ry.setDividerPadding(new Object[]{onFocusChangeListener}, 112451902, -112451896, (int) System.currentTimeMillis());
            }
            if (i18 == 3) {
                setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                int i29 = f58170c + 97;
                f58169b = i29 % 128;
                int i30 = i29 % 2;
                sa saVar = setonfocuschangelistener3.f58171a;
                if (i30 == 0) {
                    return Long.valueOf(saVar.setY());
                }
                saVar.setY();
                throw null;
            }
            if (i18 == 4) {
                setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                int i31 = f58169b;
                int i32 = (i31 | 27) << 1;
                int i33 = -(((~i31) & 27) | (i31 & (-28)));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f58170c = i34 % 128;
                int i35 = i34 % 2;
                rf navigationOnClickListener = setonfocuschangelistener4.f58171a.setNavigationOnClickListener();
                if (i35 == 0) {
                    int i36 = 92 / 0;
                    if (navigationOnClickListener != null) {
                        int i37 = f58170c;
                        int i38 = (-2) - ((((i37 | 110) << 1) - (i37 ^ 110)) ^ (-1));
                        f58169b = i38 % 128;
                        int i39 = i38 % 2;
                        obj = (LanguagePreference) ry.setDividerPadding(new Object[]{navigationOnClickListener}, 2011814230, -2011814230, (int) System.currentTimeMillis());
                        int i40 = f58169b;
                        i13 = ((i40 ^ 66) + ((i40 & 66) << 1)) - 1;
                        f58170c = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i41 = 56 / 0;
                        }
                    } else {
                        i14 = f58169b + 31;
                        f58170c = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    }
                } else if (navigationOnClickListener != null) {
                    int i310 = f58170c;
                    int i311 = (-2) - ((((i310 | 110) << 1) - (i310 ^ 110)) ^ (-1));
                    f58169b = i311 % 128;
                    int i312 = i311 % 2;
                    obj = (LanguagePreference) ry.setDividerPadding(new Object[]{navigationOnClickListener}, 2011814230, -2011814230, (int) System.currentTimeMillis());
                    int i42 = f58169b;
                    i13 = ((i42 ^ 66) + ((i42 & 66) << 1)) - 1;
                    f58170c = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i43 = 56 / 0;
                    }
                } else {
                    i14 = f58169b + 31;
                    f58170c = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                if (i18 != 5) {
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    int i44 = f58170c;
                    int i45 = ((i44 & (-60)) | ((~i44) & 59)) + ((i44 & 59) << 1);
                    f58169b = i45 % 128;
                    int i46 = i45 % 2;
                    sb dividerPadding = setonfocuschangelistener5.f58171a.setDividerPadding();
                    if (i46 != 0) {
                        uiMessageId = (UiMessageId) ry.setDividerPadding(new Object[]{dividerPadding}, 1710249679, -1710249675, (int) System.currentTimeMillis());
                        int i47 = 59 / 0;
                    } else {
                        uiMessageId = (UiMessageId) ry.setDividerPadding(new Object[]{dividerPadding}, 1710249679, -1710249675, (int) System.currentTimeMillis());
                    }
                    int i48 = f58169b;
                    int i49 = i48 & 43;
                    int i50 = (i48 | 43) & (~i49);
                    int i51 = -(-(i49 << 1));
                    int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                    f58170c = i52 % 128;
                    if (i52 % 2 != 0) {
                        return uiMessageId;
                    }
                    int i53 = 76 / 0;
                    return uiMessageId;
                }
                setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                int i54 = f58169b + 97;
                f58170c = i54 % 128;
                int i55 = i54 % 2;
                sa saVar2 = setonfocuschangelistener6.f58171a;
                if (i55 == 0) {
                    saVar2.getNavBarTitleString();
                    throw null;
                }
                sl navBarTitleString = saVar2.getNavBarTitleString();
                if (navBarTitleString != null) {
                    int i56 = f58170c;
                    int i57 = (i56 & 83) + (i56 | 83);
                    f58169b = i57 % 128;
                    int i58 = i57 % 2;
                    Iso4217Currency iso4217Currency = (Iso4217Currency) sj.setOnFocusChangeListener(new Object[]{navBarTitleString}, -2099390860, 2099390861, (int) System.currentTimeMillis());
                    int i59 = f58170c;
                    int i60 = i59 & 71;
                    int i61 = (i59 ^ 71) | i60;
                    int i62 = (i60 & i61) + (i61 | i60);
                    f58169b = i62 % 128;
                    if (i62 % 2 != 0) {
                        throw null;
                    }
                    obj = iso4217Currency;
                } else {
                    int i63 = f58169b;
                    int i64 = i63 & 89;
                    int i65 = ((i63 ^ 89) | i64) << 1;
                    int i66 = -((i63 | 89) & (~i64));
                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                    f58170c = i67 % 128;
                    if (i67 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return obj;
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        @Nullable
        public final Iso4217Currency getCurrency() {
            return (Iso4217Currency) setDividerPadding(new Object[]{this}, -2085651936, 2085651941, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        public final long getHoldTime() {
            return ((Long) setDividerPadding(new Object[]{this}, -1038714618, 1038714621, System.identityHashCode(this))).longValue();
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        @NotNull
        public final UiMessageId getId() {
            return (UiMessageId) setDividerPadding(new Object[]{this}, 1309253681, -1309253681, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        @Nullable
        public final LanguagePreference getPreferredLanguage() {
            return (LanguagePreference) setDividerPadding(new Object[]{this}, 1385742002, -1385741998, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        @Nullable
        public final Long getValue() {
            return (Long) setDividerPadding(new Object[]{this}, -949868975, 949868976, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.UiMessage
        @NotNull
        public final ValueQualifier getValueQualifier() {
            return (ValueQualifier) setDividerPadding(new Object[]{this}, -2127980762, 2127980764, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58173b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[sb.values().length];
            try {
                iArr[sb.setDividerPadding.ordinal()] = 1;
                int i10 = ((((1 ^ 111) | (1 & 111)) << 1) - (~(-((111 & (~1)) | (1 & (-112)))))) - 1;
                f58172a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sb.setX.ordinal()] = 2;
                int i12 = f58172a;
                int i13 = (i12 & 99) + (i12 | 99);
                f58173b = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sb.setY.ordinal()] = 3;
                int i15 = f58173b;
                int i16 = i15 & 105;
                int i17 = i16 + ((i15 ^ 105) | i16);
                f58172a = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sb.setOnFocusChangeListener.ordinal()] = 4;
                int i19 = ((-1) << 1) - ((f58173b + 88) ^ (-1));
                f58172a = i19 % 128;
                int i20 = i19 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sb.setCompoundDrawableTintBlendMode.ordinal()] = 5;
                int i21 = f58172a;
                int i22 = i21 & 59;
                int i23 = (i21 | 59) & (~i22);
                int i24 = i22 << 1;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                f58173b = i25 % 128;
                int i26 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sb.getNavBarTitleString.ordinal()] = 6;
                int i27 = f58172a;
                int i28 = ((-1) << 1) - ((((i27 | 8) << 1) - (i27 ^ 8)) ^ (-1));
                f58173b = i28 % 128;
                int i29 = i28 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[sb.setOnDragListener.ordinal()] = 7;
                int i30 = f58173b;
                int i31 = i30 & 115;
                int i32 = (i30 | 115) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 & i33) + (i32 | i33);
                f58172a = i34 % 128;
                int i35 = i34 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[sb.setNavigationOnClickListener.ordinal()] = 8;
                int i36 = f58172a;
                int i37 = i36 & 7;
                int i38 = i37 + ((i36 ^ 7) | i37);
                f58173b = i38 % 128;
                int i39 = i38 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[sb.setOnLongClickListener.ordinal()] = 9;
                int i40 = f58173b;
                int i41 = (i40 ^ 105) + ((i40 & 105) << 1);
                f58172a = i41 % 128;
                int i42 = i41 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[sb.setLayoutAnimation.ordinal()] = 10;
                int i43 = f58173b;
                int i44 = (i43 ^ 67) + ((i43 & 67) << 1);
                f58172a = i44 % 128;
                int i45 = i44 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[sb.setAlwaysDrawnWithCacheEnabled.ordinal()] = 11;
                int i46 = f58173b;
                int i47 = i46 & 71;
                int i48 = i47 + ((i46 ^ 71) | i47);
                f58172a = i48 % 128;
                int i49 = i48 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[sb.UiMessageCallbackKtWhenMappings.ordinal()] = 12;
                int i50 = f58173b;
                int i51 = ((-1) << 1) - (((i50 & 56) + (i50 | 56)) ^ (-1));
                f58172a = i51 % 128;
                int i52 = i51 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[sb.setTextAlignment.ordinal()] = 13;
                System.currentTimeMillis();
                System.currentTimeMillis();
            } catch (NoSuchFieldError unused13) {
            }
            setY = iArr;
            int[] iArr2 = new int[rz.values().length];
            try {
                iArr2[rz.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i53 = f58173b;
                int i54 = (i53 & 19) + (i53 | 19);
                f58172a = i54 % 128;
                int i55 = i54 % 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[rz.setDividerPadding.ordinal()] = 2;
                int i56 = f58173b;
                int i57 = ((i56 & 47) - (~(i56 | 47))) - 1;
                f58172a = i57 % 128;
                int i58 = i57 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[rz.setY.ordinal()] = 3;
                int i59 = f58172a;
                int i60 = (i59 & 15) + (i59 | 15);
                f58173b = i60 % 128;
                int i61 = i60 % 2;
            } catch (NoSuchFieldError unused16) {
            }
            setCompoundDrawableTintBlendMode = iArr2;
            int i62 = f58173b;
            int i63 = i62 & 53;
            int i64 = (i62 ^ 53) | i63;
            int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
            f58172a = i65 % 128;
            int i66 = i65 % 2;
        }
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        ValueQualifier valueQualifier;
        int i13;
        Object obj;
        UiMessageId uiMessageId;
        int i14;
        UiMessageId uiMessageId2;
        int i15;
        int i16;
        UiMessageId uiMessageId3;
        int i17;
        int i18;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = i19 | i20;
        int i22 = ~i21;
        int i23 = ~i12;
        int i24 = ((i22 | (~(i19 | i23)) | (~(i20 | i23))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i25 = i10 | i23;
        switch ((((~i25) | (~(i11 | i23)) | (~(i21 | i12))) * 568) + (((~(i19 | i12)) | (~(i20 | i12)) | (~(i25 | i11))) * (-568)) + i24) {
            case 1:
                rf rfVar = (rf) objArr[0];
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
                setcompounddrawabletintblendmode.f58168a = rfVar;
                int i26 = f58167b;
                int i27 = (i26 & 13) + (i26 | 13);
                f58166a = i27 % 128;
                obj = setcompounddrawabletintblendmode;
                if (i27 % 2 != 0) {
                    int i28 = 65 / 0;
                    obj = setcompounddrawabletintblendmode;
                }
                break;
            case 2:
                rz rzVar = (rz) objArr[0];
                int i29 = f58167b;
                int i30 = ((i29 ^ 18) + ((i29 & 18) << 1)) - 1;
                f58166a = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = setX.setCompoundDrawableTintBlendMode[rzVar.ordinal()];
                    throw null;
                }
                int i32 = setX.setCompoundDrawableTintBlendMode[rzVar.ordinal()];
                if (i32 == 1) {
                    valueQualifier = ValueQualifier.NONE;
                    int i33 = f58166a;
                    i13 = (i33 ^ 109) + ((i33 & 109) << 1);
                } else {
                    if (i32 == 2) {
                        ValueQualifier valueQualifier2 = ValueQualifier.AMOUNT;
                        int i34 = f58167b;
                        int i35 = ((((i34 ^ 21) | (i34 & 21)) << 1) - (~(-(((~i34) & 21) | (i34 & (-22)))))) - 1;
                        f58166a = i35 % 128;
                        if (i35 % 2 == 0) {
                            return valueQualifier2;
                        }
                        throw null;
                    }
                    if (i32 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueQualifier = ValueQualifier.BALANCE;
                    int i36 = f58166a;
                    i13 = ((i36 | 73) << 1) - (i36 ^ 73);
                }
                f58167b = i13 % 128;
                int i37 = i13 % 2;
                return valueQualifier;
            case 3:
                sa saVar = (sa) objArr[0];
                Intrinsics.checkNotNullParameter(saVar, "");
                setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener();
                setonfocuschangelistener.f58171a = saVar;
                int i38 = f58167b;
                int i39 = i38 & 45;
                int i40 = i39 + ((i38 ^ 45) | i39);
                f58166a = i40 % 128;
                obj = setonfocuschangelistener;
                if (i40 % 2 != 0) {
                    throw null;
                }
                break;
            case 4:
                sb sbVar = (sb) objArr[0];
                int i41 = f58166a;
                int i42 = (i41 & (-2)) | ((~i41) & 1);
                int i43 = -(-((i41 & 1) << 1));
                int i44 = (i42 & i43) + (i43 | i42);
                f58167b = i44 % 128;
                Object[] objArr2 = new Object[1];
                if (i44 % 2 != 0) {
                    objArr2[0] = sbVar;
                    return (UiMessageId) setDividerPadding(objArr2, -2035415382, 2035415387, (int) System.currentTimeMillis());
                }
                objArr2[0] = sbVar;
                int i45 = 46 / 0;
                return (UiMessageId) setDividerPadding(objArr2, -2035415382, 2035415387, (int) System.currentTimeMillis());
            case 5:
                sb sbVar2 = (sb) objArr[0];
                int i46 = f58167b;
                int i47 = (((i46 | 70) << 1) - (i46 ^ 70)) - 1;
                f58166a = i47 % 128;
                int i48 = i47 % 2;
                switch (setX.setY[sbVar2.ordinal()]) {
                    case 1:
                        uiMessageId = UiMessageId.APPROVED;
                        int i49 = f58166a + 55;
                        f58167b = i49 % 128;
                        if (i49 % 2 != 0) {
                            return uiMessageId;
                        }
                        i14 = 20;
                        int i50 = i14 / 0;
                        return uiMessageId;
                    case 2:
                        uiMessageId2 = UiMessageId.NOT_AUTHORISED;
                        int i51 = f58166a;
                        i15 = i51 & 45;
                        i16 = (i51 ^ 45) | i15;
                        i18 = i15 + i16;
                        f58167b = i18 % 128;
                        int i52 = i18 % 2;
                        return uiMessageId2;
                    case 3:
                        UiMessageId uiMessageId4 = UiMessageId.PLEASE_ENTER_PIN;
                        int i53 = f58167b;
                        int i54 = (i53 & (-22)) | ((~i53) & 21);
                        int i55 = -(-((i53 & 21) << 1));
                        int i56 = (i54 & i55) + (i55 | i54);
                        f58166a = i56 % 128;
                        if (i56 % 2 == 0) {
                            return uiMessageId4;
                        }
                        throw null;
                    case 4:
                        uiMessageId3 = UiMessageId.PROCESSING_ERROR;
                        i17 = f58166a + 29;
                        f58167b = i17 % 128;
                        int i57 = i17 % 2;
                        return uiMessageId3;
                    case 5:
                        uiMessageId3 = UiMessageId.PRESENT_CARD;
                        i17 = f58167b + 61;
                        f58166a = i17 % 128;
                        int i58 = i17 % 2;
                        return uiMessageId3;
                    case 6:
                        uiMessageId2 = UiMessageId.CARD_READ_OK_PLEASE_REMOVE;
                        int i59 = f58166a;
                        i15 = i59 & 67;
                        i16 = i59 | 67;
                        i18 = i15 + i16;
                        f58167b = i18 % 128;
                        int i510 = i18 % 2;
                        return uiMessageId2;
                    case 7:
                        uiMessageId3 = UiMessageId.APPROVED_PLEASE_SIGN;
                        i17 = (-2) - ((f58167b + 118) ^ (-1));
                        f58166a = i17 % 128;
                        int i511 = i17 % 2;
                        return uiMessageId3;
                    case 8:
                        uiMessageId = UiMessageId.AUTHORISING_PLEASE_WAIT;
                        int i60 = f58167b;
                        int i61 = i60 ^ 93;
                        int i62 = (((i60 & 93) | i61) << 1) - i61;
                        f58166a = i62 % 128;
                        if (i62 % 2 == 0) {
                            return uiMessageId;
                        }
                        i14 = 58;
                        int i512 = i14 / 0;
                        return uiMessageId;
                    case 9:
                        uiMessageId2 = UiMessageId.TRY_ANOTHER_CARD;
                        int i63 = f58166a;
                        int i64 = i63 & 7;
                        i18 = (i64 - (~(-(-((i63 ^ 7) | i64))))) - 1;
                        f58167b = i18 % 128;
                        int i513 = i18 % 2;
                        return uiMessageId2;
                    case 10:
                        UiMessageId uiMessageId5 = UiMessageId.CLEAR_DISPLAY;
                        int i65 = f58166a;
                        int i66 = ((i65 | 123) << 1) - (i65 ^ 123);
                        f58167b = i66 % 128;
                        if (i66 % 2 != 0) {
                            return uiMessageId5;
                        }
                        throw null;
                    case 11:
                        UiMessageId uiMessageId6 = UiMessageId.SEE_PHONE;
                        int i67 = f58166a + 91;
                        f58167b = i67 % 128;
                        if (i67 % 2 != 0) {
                            return uiMessageId6;
                        }
                        throw null;
                    case 12:
                        UiMessageId uiMessageId7 = UiMessageId.PRESENT_CARD_AGAIN;
                        int i68 = f58167b;
                        int i69 = (i68 & (-14)) | ((~i68) & 13);
                        int i70 = (i68 & 13) << 1;
                        int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                        f58166a = i71 % 128;
                        int i72 = i71 % 2;
                        return uiMessageId7;
                    case 13:
                        UiMessageId uiMessageId8 = UiMessageId.HOLD_STILL;
                        int i73 = f58167b;
                        int i74 = i73 ^ 93;
                        int i75 = ((i73 & 93) | i74) << 1;
                        int i76 = -i74;
                        int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
                        f58166a = i77 % 128;
                        int i78 = i77 % 2;
                        return uiMessageId8;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 6:
                rz rzVar2 = (rz) objArr[0];
                int i79 = f58166a;
                int i80 = (i79 & (-126)) | ((~i79) & 125);
                int i81 = (i79 & 125) << 1;
                int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                f58167b = i82 % 128;
                int i83 = i82 % 2;
                ValueQualifier valueQualifier3 = (ValueQualifier) setDividerPadding(new Object[]{rzVar2}, -1762545561, 1762545563, (int) System.currentTimeMillis());
                int i84 = f58167b;
                int i85 = i84 & 47;
                int i86 = i84 | 47;
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f58166a = i87 % 128;
                int i88 = i87 % 2;
                return valueQualifier3;
            default:
                rf rfVar2 = (rf) objArr[0];
                int i89 = f58166a;
                int i90 = (((i89 & (-80)) | ((~i89) & 79)) - (~((i89 & 79) << 1))) - 1;
                f58167b = i90 % 128;
                if (i90 % 2 != 0) {
                    return (LanguagePreference) setDividerPadding(new Object[]{rfVar2}, -102610792, 102610793, (int) System.currentTimeMillis());
                }
                throw null;
        }
        return obj;
    }

    public static final /* synthetic */ ValueQualifier setOnFocusChangeListener(rz rzVar) {
        return (ValueQualifier) setDividerPadding(new Object[]{rzVar}, 112451902, -112451896, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ LanguagePreference setX(rf rfVar) {
        return (LanguagePreference) setDividerPadding(new Object[]{rfVar}, 2011814230, -2011814230, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ UiMessageId setY(sb sbVar) {
        return (UiMessageId) setDividerPadding(new Object[]{sbVar}, 1710249679, -1710249675, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final UiMessage setDividerPadding(@NotNull sa saVar) {
        return (UiMessage) setDividerPadding(new Object[]{saVar}, -2090061952, 2090061955, (int) System.currentTimeMillis());
    }
}
