package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u001a\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\rJ\u0016\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b¨\u0006*"}, d2 = {"Lcom/mypinpad/tsdk/internal/security/Security;", "", "()V", "debugLog", "", "logLevel", "Lcom/mypinpad/common/logging/LogLevel;", "message", "", "throwable", "", "debugLog$sdk_android_release", "encryptEmvPayload", "", "emvPayload", "getDrngResult", "entropy", IAppSDKPlus.EXTRA_KEY_NONCE, "getIdentity", "getRandomNumber", "length", "", "initialise", "securityServiceIntegration", "Lcom/mypinpad/security/integration/SecurityNetworkService;", "sdkInstanceId", "provision", "forceRoll", "", "redactedLog", "opcode", ErrorBundle.DETAIL_ENTRY, "redactedLog$sdk_android_release", "sendNetworkRequest", "Lcom/mypinpad/security/integration/Response;", "request", "Lcom/mypinpad/security/integration/Request;", "sign", "data", "validateEmvConfig", "configuration", HashCommand.ID, "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60915a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60916b = 1;

    @NotNull
    public static final ss setCompoundDrawableTintBlendMode = new ss();

    static {
        int i10 = f60916b + 49;
        f60915a = i10 % 128;
        int i11 = i10 % 2;
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull String str, @NotNull String str2) {
        return ((Boolean) setX(new Object[]{str, str2}, -353568390, 353568398, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static String setDividerPadding(@NotNull byte[] bArr) {
        return (String) setX(new Object[]{bArr}, 1540116092, -1540116088, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(@NotNull getAmountFieldBgColor getamountfieldbgcolor, @NotNull String str) {
        setX(new Object[]{getamountfieldbgcolor, str}, 164583551, -164583546, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Throwable th2;
        boolean onFocusChangeListener;
        Object obj;
        int i13 = ~i11;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        switch ((((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405))) {
            case 1:
                int iIntValue = ((Number) objArr[0]).intValue();
                String str = (String) objArr[1];
                Throwable th3 = (Throwable) objArr[2];
                int i16 = f60916b;
                int i17 = i16 & 99;
                int i18 = i17 + ((i16 ^ 99) | i17);
                f60915a = i18 % 128;
                int i19 = i18 % 2;
                mq mqVar = mq.INSTANCE;
                int i20 = -(-(iIntValue * (-949)));
                int i21 = ((-180310000) & i20) + (i20 | (-180310000));
                int i22 = ~iIntValue;
                int i23 = (i22 | iIntValue) & i22;
                int i24 = i22 & i23;
                int i25 = ~(((i23 | i22) & (~i24)) | i24);
                int i26 = (-190001) & iIntValue;
                int i27 = ((-190001) | iIntValue) & (~i26);
                int i28 = (i27 & i26) | (i27 ^ i26);
                int i29 = ~i28;
                int i30 = (i28 | i29) & i29;
                int i31 = ((i25 & i30) | (i25 ^ i30)) * ReturnCode.ERR_REPOSITORY;
                int i32 = (i21 & i31) + (i31 | i21);
                int i33 = ~((i22 ^ 190000) | (i22 & 190000));
                int i34 = iIntValue & i22;
                int i35 = ~(i34 | i34 | (iIntValue & iIntValue));
                int i36 = -(~(-(-(((i33 ^ i35) | (i33 & i35)) * (-950)))));
                int i37 = ((i32 ^ i36) + ((i36 & i32) << 1)) - 1;
                int i38 = ((~i22) & iIntValue) | (i22 & i22);
                int i39 = (i38 & i34) | (i38 ^ i34);
                int i40 = ~i39;
                int i41 = (i39 | i40) & i40;
                int i42 = ~((iIntValue & 190000) | (iIntValue ^ 190000));
                int i43 = i41 ^ i42;
                int i44 = i42 & i41;
                int i45 = -(-(((i44 & i43) | (i43 ^ i44)) * 950));
                int i46 = ((i37 ^ i45) | (i37 & i45)) << 1;
                int i47 = -((i45 & (~i37)) | ((~i45) & i37));
                int i48 = (i46 & i47) + (i47 | i46);
                if (th3 != null) {
                    int i49 = f60916b;
                    int i50 = (-2) - ((((i49 | 18) << 1) - (i49 ^ 18)) ^ (-1));
                    f60915a = i50 % 128;
                    int i51 = i50 % 2;
                    th2 = (Throwable) nk.setY(new Object[]{th3}, -889189031, 889189032, (int) System.currentTimeMillis());
                    int i52 = f60915a;
                    int i53 = (i52 | 9) << 1;
                    int i54 = -(9 ^ i52);
                    int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                    f60916b = i55 % 128;
                    int i56 = i55 % 2;
                } else {
                    int i57 = f60915a;
                    int i58 = i57 & 105;
                    int i59 = (i57 ^ 105) | i58;
                    int i60 = (i58 & i59) + (i59 | i58);
                    f60916b = i60 % 128;
                    int i61 = i60 % 2;
                    th2 = null;
                }
                mqVar.setY(i48, str, th2);
                int i62 = f60916b;
                int i63 = i62 & 99;
                int i64 = (i63 - (~((i62 ^ 99) | i63))) - 1;
                f60915a = i64 % 128;
                if (i64 % 2 == 0) {
                    return null;
                }
                int i65 = 93 / 0;
                return null;
            case 2:
                byte[] bArr = (byte[]) objArr[0];
                int i66 = f60916b;
                int i67 = (i66 ^ 59) + ((i66 & 59) << 1);
                f60915a = i67 % 128;
                if (i67 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    Boolean bool = mg.setCompoundDrawableTintBlendMode;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    bool.booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(bArr, "");
                Boolean bool2 = mg.setCompoundDrawableTintBlendMode;
                Intrinsics.checkNotNullExpressionValue(bool2, "");
                if (!bool2.booleanValue()) {
                    int i68 = f60916b;
                    int i69 = i68 & 89;
                    int i70 = ((((i68 ^ 89) | i69) << 1) - (~(-((i68 | 89) & (~i69))))) - 1;
                    f60915a = i70 % 128;
                    int i71 = i70 % 2;
                    obj = bArr;
                } else {
                    byte[] x4 = nf.setCompoundDrawableTintBlendMode().setX(bArr);
                    int i72 = f60915a;
                    int i73 = (i72 & 101) + (i72 | 101);
                    f60916b = i73 % 128;
                    int i74 = i73 % 2;
                    obj = x4;
                }
                break;
                break;
            case 3:
                int i75 = f60915a;
                int i76 = (i75 ^ 63) + ((i75 & 63) << 1);
                f60916b = i76 % 128;
                int i77 = i76 % 2;
                String onFocusChangeListener2 = nf.setCompoundDrawableTintBlendMode().setOnFocusChangeListener();
                int i78 = f60915a;
                int i79 = (((i78 ^ 3) | (i78 & 3)) << 1) - (((~i78) & 3) | (i78 & (-4)));
                f60916b = i79 % 128;
                obj = onFocusChangeListener2;
                if (i79 % 2 == 0) {
                    throw null;
                }
                break;
            case 4:
                byte[] bArr2 = (byte[]) objArr[0];
                int i80 = f60915a;
                int i81 = i80 & 65;
                int i82 = (((i80 ^ 65) | i81) << 1) - ((i80 | 65) & (~i81));
                f60916b = i82 % 128;
                int i83 = i82 % 2;
                Intrinsics.checkNotNullParameter(bArr2, "");
                String x6 = setScrollIndicators.setX(nf.setCompoundDrawableTintBlendMode().setY(bArr2));
                int i84 = f60916b;
                int i85 = i84 & 69;
                int i86 = -(-((i84 ^ 69) | i85));
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f60915a = i87 % 128;
                int i88 = i87 % 2;
                return x6;
            case 5:
                getAmountFieldBgColor getamountfieldbgcolor = (getAmountFieldBgColor) objArr[0];
                String str2 = (String) objArr[1];
                int i89 = f60916b;
                int i90 = i89 & 109;
                int i91 = -(-((i89 ^ 109) | i90));
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                f60915a = i92 % 128;
                if (i92 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(getamountfieldbgcolor, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode(getamountfieldbgcolor);
                    setX(new Object[]{str2, Boolean.FALSE, 4}, -299762084, 299762084, 4);
                } else {
                    Intrinsics.checkNotNullParameter(getamountfieldbgcolor, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode(getamountfieldbgcolor);
                    setX(new Object[]{str2, Boolean.FALSE, 2}, -299762084, 299762084, 2);
                }
                int i93 = f60915a;
                int i94 = ((((i93 ^ 65) | (i93 & 65)) << 1) - (~(-(((~i93) & 65) | (i93 & (-66)))))) - 1;
                f60916b = i94 % 128;
                if (i94 % 2 != 0) {
                    return null;
                }
                int i95 = 9 / 0;
                return null;
            case 6:
                setInterpolator setinterpolator = (setInterpolator) objArr[0];
                int i96 = f60916b + 9;
                f60915a = i96 % 128;
                try {
                    if (i96 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(setinterpolator, "");
                        nf.setCompoundDrawableTintBlendMode().setY(setinterpolator);
                        CloseableKt.closeFinally(setinterpolator, null);
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(setinterpolator, "");
                    getPinPadPortrait y7 = nf.setCompoundDrawableTintBlendMode().setY(setinterpolator);
                    CloseableKt.closeFinally(setinterpolator, null);
                    int i97 = f60916b;
                    int i98 = (((i97 & (-86)) | ((~i97) & 85)) - (~(-(-((i97 & 85) << 1))))) - 1;
                    f60915a = i98 % 128;
                    int i99 = i98 % 2;
                    obj = y7;
                    break;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(setinterpolator, th4);
                        throw th5;
                    }
                }
                break;
            case 7:
                setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = (setHorizontalScrollbarOverlay) objArr[0];
                String str3 = (String) objArr[1];
                int i100 = f60916b;
                int i101 = ((i100 & 34) + (i100 | 34)) - 1;
                f60915a = i101 % 128;
                if (i101 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    ms msVar = ms.INSTANCE;
                    mr mrVar = mr.setOnFocusChangeListener;
                    msVar.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str3);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
                Intrinsics.checkNotNullParameter(str3, "");
                ms msVar2 = ms.INSTANCE;
                mr mrVar2 = mr.setOnFocusChangeListener;
                msVar2.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str3);
                int i102 = f60915a;
                int i103 = i102 & 33;
                int i104 = (((i102 ^ 33) | i103) << 1) - ((i102 | 33) & (~i103));
                f60916b = i104 % 128;
                if (i104 % 2 != 0) {
                    return null;
                }
                throw null;
            case 8:
                String str4 = (String) objArr[0];
                String str5 = (String) objArr[1];
                int i105 = f60915a;
                int i106 = (i105 & 9) + (i105 | 9);
                f60916b = i106 % 128;
                if (i106 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    onFocusChangeListener = nf.setCompoundDrawableTintBlendMode().setOnFocusChangeListener(str4, str5);
                    int i107 = 71 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    onFocusChangeListener = nf.setCompoundDrawableTintBlendMode().setOnFocusChangeListener(str4, str5);
                }
                return Boolean.valueOf(onFocusChangeListener);
            case 9:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                int i108 = f60916b;
                int i109 = i108 & 57;
                int i110 = -(-((i108 ^ 57) | i109));
                int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                f60915a = i111 % 128;
                int i112 = i111 % 2;
                byte[] y10 = nf.setCompoundDrawableTintBlendMode().setY(iIntValue2);
                obj = y10;
                if (i112 != 0) {
                    int i113 = 43 / 0;
                    obj = y10;
                }
                break;
            case 10:
                String str6 = (String) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                Intrinsics.checkNotNullParameter(str6, "");
                nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode(new ql(str6), zBooleanValue);
                int i114 = f60915a;
                int i115 = (i114 & (-114)) | ((~i114) & 113);
                int i116 = (i114 & 113) << 1;
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                f60916b = i117 % 128;
                int i118 = i117 % 2;
                return null;
            case 11:
                byte[] bArr3 = (byte[]) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i119 = f60915a;
                int i120 = i119 & 99;
                int i121 = -(-((i119 ^ 99) | i120));
                int i122 = (i120 & i121) + (i121 | i120);
                f60916b = i122 % 128;
                if (i122 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode(bArr3, bArr4);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(bArr3, "");
                Intrinsics.checkNotNullParameter(bArr4, "");
                byte[] compoundDrawableTintBlendMode = nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode(bArr3, bArr4);
                int i123 = f60915a;
                int i124 = (i123 & (-94)) | ((~i123) & 93);
                int i125 = (i123 & 93) << 1;
                int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                f60916b = i126 % 128;
                int i127 = i126 % 2;
                return compoundDrawableTintBlendMode;
            default:
                String onFocusChangeListener3 = (String) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i128 = f60916b;
                int i129 = i128 & 105;
                int i130 = ((i128 ^ 105) | i129) << 1;
                int i131 = -((i128 | 105) & (~i129));
                int i132 = (i130 & i131) + (i131 | i130);
                int i133 = i132 % 128;
                f60915a = i133;
                int i134 = i132 % 2;
                if ((iIntValue3 & 1) != 0) {
                    int i135 = ((i133 & 124) + (i133 | 124)) - 1;
                    f60916b = i135 % 128;
                    int i136 = i135 % 2;
                    onFocusChangeListener3 = nf.setCompoundDrawableTintBlendMode().setOnFocusChangeListener();
                    int i137 = f60916b;
                    int i138 = ((i137 | 60) << 1) - (i137 ^ 60);
                    int i139 = (i138 ^ (-1)) + (i138 << 1);
                    f60915a = i139 % 128;
                    int i140 = i139 % 2;
                }
                if ((iIntValue3 & 2) != 0) {
                    int i141 = f60915a;
                    int i142 = (((i141 ^ 107) | (i141 & 107)) << 1) - ((i141 & (-108)) | ((~i141) & 107));
                    f60916b = i142 % 128;
                    int i143 = i142 % 2;
                    int i144 = (i141 ^ 41) + ((i141 & 41) << 1);
                    f60916b = i144 % 128;
                    int i145 = i144 % 2;
                    zBooleanValue2 = false;
                }
                setX(new Object[]{onFocusChangeListener3, Boolean.valueOf(zBooleanValue2)}, 31918691, -31918681, (int) System.currentTimeMillis());
                int i146 = f60916b;
                int i147 = (-2) - (((i146 & 34) + (i146 | 34)) ^ (-1));
                f60915a = i147 % 128;
                if (i147 % 2 == 0) {
                    return null;
                }
                int i148 = 14 / 0;
                return null;
        }
        return obj;
    }

    @NotNull
    public static byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setX(new Object[]{bArr}, -1453369223, 1453369225, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str) {
        setX(new Object[]{sethorizontalscrollbaroverlay, str}, -485599955, 485599962, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int i10, @Nullable String str, @Nullable Throwable th2) {
        setX(new Object[]{Integer.valueOf(i10), str, th2}, -311013729, 311013730, i10);
    }

    @NotNull
    public static String setOnFocusChangeListener() {
        return (String) setX(new Object[0], -299774389, 299774392, (int) System.currentTimeMillis());
    }

    @NotNull
    public static byte[] setY(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setX(new Object[]{bArr, bArr2}, -1591600279, 1591600290, (int) System.currentTimeMillis());
    }

    @NotNull
    public static byte[] setOnFocusChangeListener(int i10) {
        return (byte[]) setX(new Object[]{Integer.valueOf(i10)}, 1397235306, -1397235297, i10);
    }

    @NotNull
    public static getPinPadPortrait setX(@NotNull setInterpolator setinterpolator) {
        return (getPinPadPortrait) setX(new Object[]{setinterpolator}, -1384554940, 1384554946, (int) System.currentTimeMillis());
    }
}
