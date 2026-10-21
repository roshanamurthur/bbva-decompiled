package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\u0007j\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/getX;", "", "", "setCompoundDrawableTintBlendMode", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setOnFocusChangeListener", "()I", "setY", "setX", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class getX {
    private static int getNavBarTitleString = 0;
    public static final getX setDividerPadding;
    private static final /* synthetic */ getX[] setLayoutAnimation;
    private static int setOnLongClickListener = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    private final int setY;
    private static getX setOnFocusChangeListener = new getX("SUPPORT_CONTACT_CHIP", 0, 5);
    private static getX setY = new getX("NO_SUPPORT_CONTACT_CHIP", 1, 8);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getX$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/getX$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/getX;", "setY", "(I)Lcom/mypinpad/tsdk/i/getX;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56005a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56006b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0060 A[PHI: r3
          0x0060: PHI (r3v9 com.mypinpad.tsdk.i.getX) = (r3v8 com.mypinpad.tsdk.i.getX), (r3v15 com.mypinpad.tsdk.i.getX) binds: [B:15:0x005e, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0074 A[PHI: r3
          0x0074: PHI (r3v14 com.mypinpad.tsdk.i.getX) = (r3v8 com.mypinpad.tsdk.i.getX), (r3v15 com.mypinpad.tsdk.i.getX) binds: [B:15:0x005e, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int length;
            int i13;
            getX getx;
            boolean z10;
            int iIntValue = ((Number) objArr[0]).intValue();
            int i14 = f56006b;
            int i15 = (((i14 | 92) << 1) - (i14 ^ 92)) - 1;
            f56005a = i15 % 128;
            int i16 = i15 % 2;
            getX[] getxArrValues = getX.values();
            if (i16 != 0) {
                length = getxArrValues.length;
                i13 = 1;
            } else {
                length = getxArrValues.length;
                i13 = 0;
            }
            int i17 = f56006b;
            int i18 = i17 & 57;
            int i19 = -(-((i17 ^ 57) | i18));
            int i20 = i18 ^ i19;
            int i21 = (i19 & i18) << 1;
            while (true) {
                int i22 = i20 + i21;
                f56005a = i22 % 128;
                int i23 = i22 % 2;
                if (i13 >= length) {
                    int i24 = f56006b + 52;
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    f56005a = i25 % 128;
                    int i26 = i25 % 2;
                    getx = null;
                    break;
                }
                int i27 = f56005a;
                int i28 = ((i27 | 93) << 1) - (i27 ^ 93);
                f56006b = i28 % 128;
                if (i28 % 2 == 0) {
                    getx = getxArrValues[i13];
                    int i29 = 81 / 0;
                    if (getx.setOnFocusChangeListener() == iIntValue) {
                        int i30 = f56006b;
                        int i31 = i30 & 61;
                        int i32 = (i31 - (~(-(-((i30 ^ 61) | i31))))) - 1;
                        f56005a = i32 % 128;
                        int i33 = i32 % 2;
                        z10 = true;
                    } else {
                        int i34 = f56005a;
                        int i35 = i34 ^ 11;
                        int i36 = ((((i34 & 11) | i35) << 1) - (~(-i35))) - 1;
                        f56006b = i36 % 128;
                        int i37 = i36 % 2;
                        z10 = false;
                    }
                } else {
                    getx = getxArrValues[i13];
                    if (getx.setOnFocusChangeListener() == iIntValue) {
                        int i38 = f56006b;
                        int i39 = i38 & 61;
                        int i310 = (i39 - (~(-(-((i38 ^ 61) | i39))))) - 1;
                        f56005a = i310 % 128;
                        int i311 = i310 % 2;
                        z10 = true;
                    } else {
                        int i312 = f56005a;
                        int i313 = i312 ^ 11;
                        int i314 = ((((i312 & 11) | i313) << 1) - (~(-i313))) - 1;
                        f56006b = i314 % 128;
                        int i315 = i314 % 2;
                        z10 = false;
                    }
                }
                if (z10) {
                    int i40 = f56006b;
                    int i41 = (i40 & 13) + (i40 | 13);
                    int i42 = i41 % 128;
                    f56005a = i42;
                    int i43 = i41 % 2;
                    int i44 = (i42 ^ 125) + ((i42 & 125) << 1);
                    f56006b = i44 % 128;
                    int i45 = i44 % 2;
                    break;
                }
                int i46 = i13 ^ 1;
                int i47 = ((i13 & 1) | i46) << 1;
                int i48 = -i46;
                i13 = ((i47 & i48) << 1) + (i47 ^ i48);
                int i49 = f56006b;
                int i50 = (i49 & (-34)) | ((~i49) & 33);
                int i51 = -(-((i49 & 33) << 1));
                i20 = i50 & i51;
                i21 = i51 | i50;
            }
            if (getx == null) {
                int i52 = f56005a;
                int i53 = ((((i52 ^ 83) | (i52 & 83)) << 1) - (~(-(((~i52) & 83) | (i52 & (-84)))))) - 1;
                f56006b = i53 % 128;
                int i54 = i53 % 2;
                getx = getX.setDividerPadding;
                int i55 = f56006b + 39;
                f56005a = i55 % 128;
                if (i55 % 2 != 0) {
                    throw null;
                }
            } else {
                int i56 = f56006b;
                int i57 = ((i56 & 38) + (i56 | 38)) - 1;
                f56005a = i57 % 128;
                if (i57 % 2 != 0) {
                    throw null;
                }
            }
            return getx;
        }

        @NotNull
        public static getX setY(int p4) {
            return (getX) setX(new Object[]{Integer.valueOf(p4)}, -1040261987, 1040261987, p4);
        }
    }

    static {
        getX[] getxArr;
        getX getx = new getX(ExpectedUserActionOnPoiTypes.NONE, 2, 0);
        setDividerPadding = getx;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = (i10 & (-161682735)) | ((-161682735) ^ i10);
        int i12 = ~i11;
        int i13 = 1456219470 & i12;
        int i14 = (i12 | 1456219470) & (~i13);
        int i15 = -(-(((i14 & i13) | (i14 ^ i13)) * 519));
        int i16 = (-554718952) & i15;
        int i17 = (i15 ^ (-554718952)) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        int i19 = (i11 & 1456219470) | (i11 ^ 1456219470);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = 1609512302 & iCurrentTimeMillis;
        int i23 = (1609512302 | iCurrentTimeMillis) & (~i22);
        int i24 = ~((i23 & i22) | (i23 ^ i22));
        int i25 = i21 & i24;
        int i26 = (i21 | i24) & (~i25);
        int i27 = ((i26 & i25) | (i26 ^ i25)) * (-519);
        int i28 = i18 & i27;
        int i29 = (i27 | i18) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = (i29 & i30) + (i29 | i30);
        int i32 = 1456219470 & iCurrentTimeMillis;
        int i33 = (iCurrentTimeMillis | 1456219470) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = ((~i34) & 161682734) | ((-161682735) & i34);
        int i36 = i34 & 161682734;
        int i37 = (-2) - (((i31 - (~(-(~(-(-(((i36 & i35) | (i35 ^ i36)) * 519))))))) - 1) ^ (-1));
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i38 = -(-((~(((-38805541) & iCurrentTimeMillis2) | ((-38805541) ^ iCurrentTimeMillis2))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i39 = (-1296247596) ^ i38;
        int i40 = (i38 & (-1296247596)) << 1;
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        int i42 = (i41 & 464906224) + (464906224 | i41);
        int i43 = ~iCurrentTimeMillis2;
        int i44 = (-66855479) & i43;
        int i45 = (i43 | (-66855479)) & (~i44);
        int i46 = (i45 & i44) | (i45 ^ i44);
        int i47 = (240316453 & i46) | ((~i46) & (-240316454));
        int i48 = i46 & (-240316454);
        int i49 = ~((i48 & i47) | (i47 ^ i48));
        int i50 = ((i49 & (-268366392)) | ((-268366392) ^ i49)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i51 = i42 | i50;
        if (i37 <= (i51 << 1) - ((~(i50 & i42)) & i51)) {
            getxArr = new getX[5];
            getxArr[1] = setOnFocusChangeListener;
            getxArr[1] = setY;
            getxArr[2] = getx;
        } else {
            getxArr = new getX[]{setOnFocusChangeListener, setY, getx};
        }
        int i52 = setOnLongClickListener;
        int i53 = (i52 ^ 13) + ((i52 & 13) << 1);
        getNavBarTitleString = i53 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i53 % 2 != 0) {
            throw null;
        }
        setLayoutAnimation = getxArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i54 = setOnLongClickListener;
        int i55 = i54 & 103;
        int i56 = (i55 - (~(-(-((i54 ^ 103) | i55))))) - 1;
        getNavBarTitleString = i56 % 128;
        if (i56 % 2 != 0) {
            throw null;
        }
    }

    public getX(String str, int i10, int i11) {
        super(str, i10);
        this.setY = i11;
    }

    public static getX valueOf(String str) {
        int i10 = setOnLongClickListener;
        int i11 = (i10 ^ 83) + ((i10 & 83) << 1);
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        getX getx = (getX) Enum.valueOf(getX.class, str);
        int i13 = getNavBarTitleString;
        int i14 = i13 & 53;
        int i15 = (i14 - (~((i13 ^ 53) | i14))) - 1;
        setOnLongClickListener = i15 % 128;
        if (i15 % 2 != 0) {
            return getx;
        }
        throw null;
    }

    public static getX[] values() {
        int i10 = getNavBarTitleString + 107;
        setOnLongClickListener = i10 % 128;
        if (i10 % 2 != 0) {
            return (getX[]) setLayoutAnimation.clone();
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        int i10 = setOnLongClickListener + 41;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setY;
        }
        int i11 = 79 / 0;
        return this.setY;
    }
}
