package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.android.gms.wearable.WearableStatusCodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setDefaultFocusHighlightEnabled;", "", "", "setX", "()Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setY", "b", "setOnFocusChangeListener", "setDividerPadding", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setDefaultFocusHighlightEnabled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59617c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59618d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setDividerPadding;

    public setDefaultFocusHighlightEnabled(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setY = str;
        this.setDividerPadding = str2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01c6  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        String strSlice;
        int iHashCode;
        int i13 = (i11 * 263) + (i10 * (-523));
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i10 | i15);
        int i17 = ((i16 | (~(i15 | (~i12))) | i14) * 262) + (i16 * (-786)) + ((i14 | i16 | (~(i15 | i12))) * 262) + i13;
        if (i17 == 1) {
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (setDefaultFocusHighlightEnabled) objArr[0];
            Object obj = objArr[1];
            int i18 = f59617c;
            int i19 = i18 & 71;
            int i20 = i18 | 71;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            f59618d = i22;
            int i23 = i21 % 2;
            if (setdefaultfocushighlightenabled != obj) {
                if (obj instanceof setDefaultFocusHighlightEnabled) {
                    setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled2 = (setDefaultFocusHighlightEnabled) obj;
                    if (!Intrinsics.areEqual(setdefaultfocushighlightenabled.setY, setdefaultfocushighlightenabled2.setY)) {
                        int i24 = f59617c;
                        int i25 = i24 & 37;
                        int i26 = ((i24 ^ 37) | i25) << 1;
                        int i27 = -((i24 | 37) & (~i25));
                        int i28 = (i26 & i27) + (i27 | i26);
                        int i29 = i28 % 128;
                        f59618d = i29;
                        int i30 = i28 % 2;
                        int i31 = (i29 ^ 41) + ((i29 & 41) << 1);
                        f59617c = i31 % 128;
                        if (i31 % 2 != 0) {
                            int i32 = 76 / 0;
                        }
                    } else if (!(!Intrinsics.areEqual(setdefaultfocushighlightenabled.setDividerPadding, setdefaultfocushighlightenabled2.setDividerPadding))) {
                        int i33 = f59617c;
                        int i34 = i33 & 97;
                        int i35 = ((i33 | 97) & (~i34)) + (i34 << 1);
                        f59618d = i35 % 128;
                        if (i35 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i36 = f59618d;
                        int i37 = (((i36 ^ 105) | (i36 & 105)) << 1) - (((~i36) & 105) | (i36 & (-106)));
                        int i38 = i37 % 128;
                        f59617c = i38;
                        int i39 = i37 % 2;
                        int i40 = ((i38 ^ 13) | (i38 & 13)) << 1;
                        int i41 = -(((~i38) & 13) | (i38 & (-14)));
                        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                        f59618d = i42 % 128;
                        if (i42 % 2 == 0) {
                            throw null;
                        }
                    }
                } else {
                    int i43 = i22 + 109;
                    f59617c = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = i22 & 81;
                    int i46 = i22 | 81;
                    int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                    f59617c = i47 % 128;
                    if (i47 % 2 != 0) {
                        throw null;
                    }
                }
                return Boolean.FALSE;
            }
            int i48 = i22 + 5;
            f59617c = i48 % 128;
            int i49 = i48 % 2;
            int i50 = ((i22 & 33) - (~(-(-(i22 | 33))))) - 1;
            f59617c = i50 % 128;
            if (i50 % 2 != 0) {
                throw null;
            }
            return Boolean.TRUE;
        }
        if (i17 == 2) {
            int i51 = f59617c;
            int i52 = (((i51 ^ 77) | (i51 & 77)) << 1) - (((~i51) & 77) | (i51 & (-78)));
            int i53 = i52 % 128;
            f59618d = i53;
            int i54 = i52 % 2;
            int i55 = i53 ^ 43;
            int i56 = (((i53 & 43) | i55) << 1) - i55;
            f59617c = i56 % 128;
            int i57 = i56 % 2;
            return LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        }
        if (i17 == 3) {
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled3 = (setDefaultFocusHighlightEnabled) objArr[0];
            int i58 = f59617c;
            int i59 = (i58 & (-66)) | ((~i58) & 65);
            int i60 = (i58 & 65) << 1;
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            f59618d = i61 % 128;
            int i62 = i61 % 2;
            byte[] bArr = (byte[]) setInputExtras.setDividerPadding(new Object[]{setdefaultfocushighlightenabled3.setY}, 1866385647, -1866385643, (int) System.currentTimeMillis());
            String str = setdefaultfocushighlightenabled3.setY;
            if (str.length() % 2 == 0) {
                int i63 = f59618d;
                int i64 = ((i63 & 24) + (i63 | 24)) - 1;
                f59617c = i64 % 128;
                if (i64 % 2 == 0 ? StringsKt___StringsKt.last(str) != 'F' : StringsKt___StringsKt.last(str) != '$') {
                    int i65 = f59618d + 107;
                    f59617c = i65 % 128;
                    int i66 = i65 % 2;
                    strSlice = str;
                } else {
                    strSlice = StringsKt___StringsKt.slice(str, c.until(0, StringsKt__StringsKt.getLastIndex(str)));
                    int i67 = f59617c;
                    int i68 = (i67 ^ 57) + ((i67 & 57) << 1);
                    f59618d = i68 % 128;
                    int i69 = i68 % 2;
                }
            } else {
                int i610 = f59618d + 107;
                f59617c = i610 % 128;
                int i611 = i610 % 2;
                strSlice = str;
            }
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(strSlice, (String) setInputExtras.setDividerPadding(new Object[]{bArr, bool, 1}, -1521120231, 1521120244, 1))) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid BCD number in exception card: ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                throw new setIndeterminateDrawable(WearableStatusCodes.INVALID_TARGET_NODE, setdefaultfocushighlightenabled3.setY, null, 4, null);
            }
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis());
            setFindListener setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed));
            if (!((Boolean) setFindListener.setY(new Object[]{setfindlistener, bArr}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue()) {
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid account number in exception card: ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                throw new setIndeterminateDrawable(WearableStatusCodes.INVALID_TARGET_NODE, setdefaultfocushighlightenabled3.setY, null, 4, null);
            }
            String str2 = setdefaultfocushighlightenabled3.setDividerPadding;
            if (str2 == null) {
                int i70 = f59618d;
                int i71 = i70 & 61;
                int i72 = (~i71) & (i70 | 61);
                int i73 = i71 << 1;
                int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                f59617c = i74 % 128;
                int i75 = i74 % 2;
                int i76 = i70 & 17;
                int i77 = (i70 | 17) & (~i76);
                int i78 = -(-(i76 << 1));
                int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                f59617c = i79 % 128;
                int i80 = i79 % 2;
            } else {
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis());
                setFindListener setfindlistener2 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed2}, -570885530, 570885532, System.identityHashCode(transactionFailed2));
                boolean zBooleanValue = ((Boolean) setFindListener.setY(new Object[]{setfindlistener2, (byte[]) setInputExtras.setDividerPadding(new Object[]{str2}, -1768743273, 1768743278, (int) System.currentTimeMillis())}, -2109739487, 2109739489, System.identityHashCode(setfindlistener2))).booleanValue();
                int i81 = f59618d + 85;
                f59617c = i81 % 128;
                int i82 = i81 % 2;
                if (!zBooleanValue) {
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid PAN sequence number in exception card: ", str2)}, 818541572, -818541572, (int) System.currentTimeMillis());
                    throw new setIndeterminateDrawable(WearableStatusCodes.INVALID_TARGET_NODE, setdefaultfocushighlightenabled3.setDividerPadding, null, 4, null);
                }
            }
            int i83 = f59618d;
            int i84 = i83 & 109;
            int i85 = (i83 | 109) & (~i84);
            int i86 = -(-(i84 << 1));
            int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
            f59617c = i87 % 128;
            int i88 = i87 % 2;
            return bool;
        }
        if (i17 == 4) {
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled4 = (setDefaultFocusHighlightEnabled) objArr[0];
            int i89 = f59618d;
            int i90 = (i89 ^ 43) + ((i89 & 43) << 1);
            int i91 = i90 % 128;
            f59617c = i91;
            int i92 = i90 % 2;
            String str3 = setdefaultfocushighlightenabled4.setDividerPadding;
            int i93 = ((i91 | 26) << 1) - (i91 ^ 26);
            int i94 = (i93 ^ (-1)) + (i93 << 1);
            f59618d = i94 % 128;
            int i95 = i94 % 2;
            return str3;
        }
        if (i17 != 5) {
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled5 = (setDefaultFocusHighlightEnabled) objArr[0];
            int i96 = f59617c;
            int i97 = (((i96 | 30) << 1) - (i96 ^ 30)) - 1;
            f59618d = i97 % 128;
            int i98 = i97 % 2;
            String str4 = setdefaultfocushighlightenabled5.setY;
            int i99 = ((i96 | 57) << 1) - (i96 ^ 57);
            f59618d = i99 % 128;
            int i100 = i99 % 2;
            return str4;
        }
        setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled6 = (setDefaultFocusHighlightEnabled) objArr[0];
        int i101 = f59617c + 119;
        f59618d = i101 % 128;
        int i102 = i101 % 2;
        int iHashCode2 = setdefaultfocushighlightenabled6.setY.hashCode();
        int i103 = iHashCode2 * 31;
        String str5 = setdefaultfocushighlightenabled6.setDividerPadding;
        if (str5 == null) {
            int i104 = f59618d;
            int i105 = (((i104 | 18) << 1) - (i104 ^ 18)) - 1;
            f59617c = i105 % 128;
            iHashCode = i105 % 2 != 0 ? 1 : 0;
            int i106 = i104 & 113;
            int i107 = -(-((i104 ^ 113) | i106));
            int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
            f59617c = i108 % 128;
            int i109 = i108 % 2;
        } else {
            iHashCode = str5.hashCode();
            int i110 = f59618d;
            int i111 = ((-1) << 1) - (((i110 ^ 10) + ((i110 & 10) << 1)) ^ (-1));
            f59617c = i111 % 128;
            int i112 = i111 % 2;
        }
        int iIdentityHashCode = System.identityHashCode(setdefaultfocushighlightenabled6);
        int i113 = iHashCode * 55;
        int i114 = -(-(iHashCode2 * (-3317)));
        int i115 = i113 & i114;
        int i116 = (i114 ^ i113) | i115;
        int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
        int i118 = ~iHashCode;
        int i119 = ~((i118 & i103) | (i118 ^ i103));
        int i120 = ~iIdentityHashCode;
        int i121 = ~((i120 & i103) | (i120 ^ i103));
        int i122 = i119 ^ i121;
        int i123 = i119 & i121;
        int i124 = -(-(((i123 & i122) | (i122 ^ i123)) * (-108)));
        int i125 = ((i117 & i124) - (~(i124 | i117))) - 1;
        int i126 = ~iHashCode;
        int i127 = (i126 & iIdentityHashCode) | (i126 ^ iIdentityHashCode);
        int i128 = (i127 | (~i127)) & (~i127);
        int i129 = (i103 | (~i103)) & (~i103);
        int i130 = i129 & iHashCode;
        int i131 = (~i130) & (i129 | iHashCode);
        int i132 = ~((i131 & i130) | (i131 ^ i130));
        int i133 = (i128 & i132) | ((~i132) & i128) | ((~i128) & i132);
        int i134 = ~iIdentityHashCode;
        int i135 = i134 ^ iHashCode;
        int i136 = i134 & iHashCode;
        int i137 = (i135 & i136) | (i135 ^ i136);
        int i138 = (i137 | (~i137)) & (~i137);
        int i139 = i133 & i138;
        int i140 = (i125 - (~(-(~((((i133 | i138) & (~i139)) | i139) * 54))))) - 2;
        int i141 = ~((i129 ^ iHashCode) | i130);
        int i142 = ((iIdentityHashCode & i141) | ((~i141) & iIdentityHashCode) | (i141 & i134)) * 54;
        int i143 = i140 & i142;
        int i144 = ((i142 | i140) & (~i143)) + (i143 << 1);
        int i145 = f59618d + 115;
        f59617c = i145 % 128;
        int i146 = i145 % 2;
        return Integer.valueOf(i144);
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -606552851, 606552852, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -798952084, 798952089, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1631406134, -1631406130, System.identityHashCode(this));
    }

    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -200342298, 200342301, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1588822726, -1588822726, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -702412865, 702412867, System.identityHashCode(this));
    }
}
