package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/mypinpad/tsdk/i/setWebViewClient;", "Lcom/mypinpad/tsdk/i/getInstallationId;", "", "setY", "()Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "setX", "setDividerPadding", "d", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/mypinpad/tsdk/i/Terminal;", "f", "Lcom/mypinpad/tsdk/i/Terminal;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/Terminal;", "p1", "p2", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setWebViewClient extends getInstallationId {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60822g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60823h = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean setDividerPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setOnFocusChangeListener;

    static {
        int i10 = f60822g;
        int i11 = ((i10 ^ 3) | (i10 & 3)) << 1;
        int i12 = -(((~i10) & 3) | (i10 & (-4)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f60823h = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public setWebViewClient(boolean z10, @NotNull String str, @Nullable Long l6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setDividerPadding = z10;
        this.setX = str;
        this.setCompoundDrawableTintBlendMode = l6;
        this.setOnFocusChangeListener = Terminal.KERNEL_4;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x029b  */
    /* JADX WARN: Code duplicated, block: B:43:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x031c  */
    /* JADX WARN: Code duplicated, block: B:58:0x031d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0327  */
    /* JADX WARN: Code duplicated, block: B:62:0x0332  */
    /* JADX WARN: Code duplicated, block: B:64:0x033e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0354  */
    /* JADX WARN: Code duplicated, block: B:69:0x036f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0370  */
    /* JADX WARN: Code duplicated, block: B:73:0x038d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v61, types: [int] */
    /* JADX WARN: Type inference failed for: r8v89 */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setWebViewClient setwebviewclient;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        boolean z11;
        int i18 = ~i11;
        int i19 = i18 | i10;
        int i20 = (((~(i10 | i12)) | (~(i18 | i12)) | (~i19)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i19 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        int iHashCode = 0;
        switch (i20) {
            case 1:
                setWebViewClient setwebviewclient2 = (setWebViewClient) objArr[0];
                int i21 = f60822g;
                int i22 = i21 & 33;
                int i23 = (((i21 | 33) & (~i22)) - (~(i22 << 1))) - 1;
                f60823h = i23 % 128;
                int i24 = i23 % 2;
                Terminal terminal = setwebviewclient2.setOnFocusChangeListener;
                if (i24 != 0) {
                    return terminal;
                }
                throw null;
            case 2:
                setWebViewClient setwebviewclient3 = (setWebViewClient) objArr[0];
                int i25 = f60823h;
                int i26 = i25 & 57;
                int i27 = -(-(i25 | 57));
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f60822g = i28 % 128;
                int i29 = i28 % 2;
                String str = setwebviewclient3.setX;
                int i30 = i25 & 111;
                int i31 = (i25 | 111) & (~i30);
                int i32 = i30 << 1;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                f60822g = i33 % 128;
                int i34 = i33 % 2;
                return str;
            case 3:
                setWebViewClient setwebviewclient4 = (setWebViewClient) objArr[0];
                Object obj = objArr[1];
                int i35 = f60822g;
                int i36 = i35 + 103;
                int i37 = i36 % 128;
                f60823h = i37;
                if (i36 % 2 == 0) {
                    int i38 = 76 / 0;
                    if (setwebviewclient4 != obj) {
                        if (!(obj instanceof setWebViewClient)) {
                            setwebviewclient = (setWebViewClient) obj;
                            if (setwebviewclient4.setDividerPadding != setwebviewclient.setDividerPadding) {
                                int i39 = (i35 ^ 114) + ((i35 & 114) << 1);
                                int i40 = (i39 ^ (-1)) + (i39 << 1);
                                f60823h = i40 % 128;
                                int i41 = i40 % 2;
                                int i42 = i35 & 53;
                                int i43 = (~i42) & (i35 | 53);
                                int i44 = i42 << 1;
                                i15 = (i43 ^ i44) + ((i44 & i43) << 1);
                                f60823h = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                            } else if (Intrinsics.areEqual(setwebviewclient4.setX, setwebviewclient.setX)) {
                                int i45 = f60823h + 113;
                                int i46 = i45 % 128;
                                f60822g = i46;
                                int i47 = i45 % 2;
                                int i48 = ((i46 | 76) << 1) - (i46 ^ 76);
                                i13 = (i48 ^ (-1)) + (i48 << 1);
                                f60823h = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                            } else if (!Intrinsics.areEqual(setwebviewclient4.setCompoundDrawableTintBlendMode, setwebviewclient.setCompoundDrawableTintBlendMode)) {
                                int i49 = f60823h;
                                int i50 = i49 + 23;
                                f60822g = i50 % 128;
                                z10 = i50 % 2 != 0;
                                int i51 = (i49 & (-70)) | ((~i49) & 69);
                                int i52 = (i49 & 69) << 1;
                                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                                f60822g = i53 % 128;
                                int i54 = i53 % 2;
                            } else {
                                int i55 = f60822g;
                                int i56 = i55 & 1;
                                int i57 = ((i55 ^ 1) | i56) << 1;
                                int i58 = -((i55 | 1) & (~i56));
                                i14 = (i57 ^ i58) + ((i58 & i57) << 1);
                                f60823h = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                            return Boolean.FALSE;
                        }
                        int i59 = (i35 & 91) + (i35 | 91);
                        f60823h = i59 % 128;
                        z10 = i59 % 2 == 0;
                        i16 = (-2) - (((i35 & 12) + (i35 | 12)) ^ (-1));
                        f60823h = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        return Boolean.valueOf(z10);
                    }
                    int i60 = i37 & 27;
                    int i61 = (~i60) & (i37 | 27);
                    int i62 = -(-(i60 << 1));
                    int i63 = (i61 & i62) + (i62 | i61);
                    f60822g = i63 % 128;
                    int i64 = i63 % 2;
                    int i65 = ((i37 | 46) << 1) - (i37 ^ 46);
                    int i66 = (i65 ^ (-1)) + (i65 << 1);
                    f60822g = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    if (setwebviewclient4 != obj) {
                        if (!(obj instanceof setWebViewClient)) {
                            setwebviewclient = (setWebViewClient) obj;
                            if (setwebviewclient4.setDividerPadding != setwebviewclient.setDividerPadding) {
                                int i310 = (i35 ^ 114) + ((i35 & 114) << 1);
                                int i410 = (i310 ^ (-1)) + (i310 << 1);
                                f60823h = i410 % 128;
                                int i411 = i410 % 2;
                                int i412 = i35 & 53;
                                int i413 = (~i412) & (i35 | 53);
                                int i414 = i412 << 1;
                                i15 = (i413 ^ i414) + ((i414 & i413) << 1);
                                f60823h = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                            } else if (Intrinsics.areEqual(setwebviewclient4.setX, setwebviewclient.setX)) {
                                int i415 = f60823h + 113;
                                int i416 = i415 % 128;
                                f60822g = i416;
                                int i417 = i415 % 2;
                                int i418 = ((i416 | 76) << 1) - (i416 ^ 76);
                                i13 = (i418 ^ (-1)) + (i418 << 1);
                                f60823h = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                            } else if (!Intrinsics.areEqual(setwebviewclient4.setCompoundDrawableTintBlendMode, setwebviewclient.setCompoundDrawableTintBlendMode)) {
                                int i419 = f60823h;
                                int i510 = i419 + 23;
                                f60822g = i510 % 128;
                                if (i510 % 2 != 0) {
                                }
                                int i511 = (i419 & (-70)) | ((~i419) & 69);
                                int i512 = (i419 & 69) << 1;
                                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                                f60822g = i513 % 128;
                                int i514 = i513 % 2;
                            } else {
                                int i515 = f60822g;
                                int i516 = i515 & 1;
                                int i517 = ((i515 ^ 1) | i516) << 1;
                                int i518 = -((i515 | 1) & (~i516));
                                i14 = (i517 ^ i518) + ((i518 & i517) << 1);
                                f60823h = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                            return Boolean.FALSE;
                        }
                        int i519 = (i35 & 91) + (i35 | 91);
                        f60823h = i519 % 128;
                        if (i519 % 2 == 0) {
                        }
                        i16 = (-2) - (((i35 & 12) + (i35 | 12)) ^ (-1));
                        f60823h = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        return Boolean.valueOf(z10);
                    }
                    int i68 = i37 & 27;
                    int i69 = (~i68) & (i37 | 27);
                    int i610 = -(-(i68 << 1));
                    int i611 = (i69 & i610) + (i610 | i69);
                    f60822g = i611 % 128;
                    int i612 = i611 % 2;
                    int i613 = ((i37 | 46) << 1) - (i37 ^ 46);
                    int i614 = (i613 ^ (-1)) + (i613 << 1);
                    f60822g = i614 % 128;
                    int i615 = i614 % 2;
                }
                return Boolean.TRUE;
            case 4:
                setWebViewClient setwebviewclient5 = (setWebViewClient) objArr[0];
                int i70 = f60823h;
                int i71 = ((i70 | 103) << 1) - (i70 ^ 103);
                f60822g = i71 % 128;
                int i72 = i71 % 2;
                boolean z12 = setwebviewclient5.setDividerPadding;
                int i73 = i70 & 13;
                int i74 = -(-(i70 | 13));
                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                f60822g = i75 % 128;
                if (i75 % 2 == 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 5:
                setWebViewClient setwebviewclient6 = (setWebViewClient) objArr[0];
                int i76 = f60823h + 3;
                int i77 = i76 % 128;
                f60822g = i77;
                int i78 = i76 % 2;
                boolean z13 = setwebviewclient6.setDividerPadding;
                ?? r10 = z13;
                if (z13) {
                    int i79 = i77 ^ 39;
                    int i80 = -(-((i77 & 39) << 1));
                    int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                    int i82 = i81 % 128;
                    f60823h = i82;
                    int i83 = i81 % 2;
                    int i84 = i82 + 37;
                    f60822g = i84 % 128;
                    int i85 = i84 % 2;
                    r10 = 1;
                }
                int i86 = r10 * 31;
                int i87 = -(-setwebviewclient6.setX.hashCode());
                int i88 = i86 & i87;
                int i89 = (((i86 | i87) & (~i88)) - (~(-(-(i88 << 1))))) - 1;
                int i90 = i89 * 31;
                Long l6 = setwebviewclient6.setCompoundDrawableTintBlendMode;
                if (l6 == null) {
                    int i91 = f60822g;
                    int i92 = ((i91 ^ 25) | (i91 & 25)) << 1;
                    int i93 = -((i91 & (-26)) | ((~i91) & 25));
                    int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                    f60823h = i94 % 128;
                    int i95 = i94 % 2;
                    i17 = ((i91 ^ 77) - (~(-(-((i91 & 77) << 1))))) - 1;
                    f60823h = i17 % 128;
                } else {
                    iHashCode = l6.hashCode();
                    int i96 = f60823h;
                    i17 = ((i96 | 63) << 1) - (i96 ^ 63);
                    f60822g = i17 % 128;
                }
                int i97 = i17 % 2;
                int iIdentityHashCode = System.identityHashCode(setwebviewclient6);
                int i98 = iHashCode * 592;
                int i99 = i89 * (-18290);
                int i100 = i98 ^ i99;
                int i101 = -(-((i99 & i98) << 1));
                int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                int i103 = ~iHashCode;
                int i104 = -(-((~((i103 ^ i90) | (i103 & i90))) * (-1182)));
                int i105 = i102 & i104;
                int i106 = (((i102 | i104) & (~i105)) - (~(-(-(i105 << 1))))) - 1;
                int i107 = (~iHashCode) & (i103 | iHashCode);
                int i108 = ~i90;
                int i109 = (~i90) | i90;
                int i110 = i108 & i109;
                int i111 = i107 & i110;
                int i112 = ((i107 | i110) & (~i111)) | i111;
                int i113 = ~iIdentityHashCode;
                int i114 = ((~i113) & i112) | ((~i112) & i113);
                int i115 = i112 & i113;
                int i116 = (i115 & i114) | (i114 ^ i115);
                int i117 = (i116 | (~i116)) & (~i116);
                int i118 = ~((iHashCode & i90) | (iHashCode ^ i90));
                int i119 = -(-(((i118 & i117) | (i117 ^ i118)) * (-591)));
                int i120 = i106 & i119;
                int i121 = -(-(i106 | i119));
                int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                int i123 = iIdentityHashCode ^ i103;
                int i124 = iIdentityHashCode & i103;
                int i125 = (i124 & i123) | (i123 ^ i124);
                int i126 = (~i90) & i109;
                int i127 = i125 & i126;
                int i128 = (i125 | i126) & (~i127);
                int i129 = -(-(((i128 & i127) | (i128 ^ i127)) * 591));
                int i130 = i122 & i129;
                int i131 = (i129 ^ i122) | i130;
                int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                int i133 = f60822g;
                int i134 = i133 | 15;
                int i135 = i134 << 1;
                int i136 = -((~(i133 & 15)) & i134);
                int i137 = (i135 & i136) + (i136 | i135);
                f60823h = i137 % 128;
                int i138 = i137 % 2;
                return Integer.valueOf(i132);
            case 6:
                int i139 = f60822g;
                int i140 = ((i139 ^ 107) | (i139 & 107)) << 1;
                int i141 = -(((~i139) & 107) | (i139 & (-108)));
                int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                int i143 = i142 % 128;
                f60823h = i143;
                int i144 = i142 % 2;
                int i145 = i143 + 53;
                f60822g = i145 % 128;
                int i146 = i145 % 2;
                return "k4c";
            case 7:
                setWebViewClient setwebviewclient7 = (setWebViewClient) objArr[0];
                int i147 = f60823h + 45;
                f60822g = i147 % 128;
                if (i147 % 2 == 0 ? setwebviewclient7.setX.length() != 10 : setwebviewclient7.setX.length() != 107) {
                    int i148 = f60823h + 48;
                    int i149 = (i148 ^ (-1)) + (i148 << 1);
                    f60822g = i149 % 128;
                    int i150 = i149 % 2;
                    z11 = false;
                } else {
                    int i151 = f60823h;
                    int i152 = i151 ^ 91;
                    int i153 = ((i151 & 91) | i152) << 1;
                    int i154 = -i152;
                    int i155 = (i153 & i154) + (i153 | i154);
                    int i156 = i155 % 128;
                    f60822g = i156;
                    int i157 = i155 % 2;
                    int i158 = i156 & 17;
                    int i159 = -(-((i156 ^ 17) | i158));
                    int i160 = (i158 & i159) + (i159 | i158);
                    f60823h = i160 % 128;
                    int i161 = i160 % 2;
                    z11 = true;
                }
                if (!z11) {
                    int i162 = f60822g;
                    int i163 = (i162 & 57) + (i162 | 57);
                    f60823h = i163 % 128;
                    int i164 = i163 % 2;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid TAC - Denial length in Kernel 4 configuration, expected: 10, actual: ", Integer.valueOf(((String) setDividerPadding(new Object[]{setwebviewclient7}, -1332695831, 1332695833, System.identityHashCode(setwebviewclient7))).length()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                    int i165 = f60822g + 23;
                    f60823h = i165 % 128;
                    int i166 = i165 % 2;
                }
                int i167 = f60823h + 53;
                f60822g = i167 % 128;
                if (i167 % 2 == 0) {
                    return Boolean.valueOf(z11);
                }
                throw null;
            default:
                setWebViewClient setwebviewclient8 = (setWebViewClient) objArr[0];
                int i168 = f60822g + 34;
                int i169 = (i168 ^ (-1)) + (i168 << 1);
                int i170 = i169 % 128;
                f60823h = i170;
                int i171 = i169 % 2;
                Long l7 = setwebviewclient8.setCompoundDrawableTintBlendMode;
                int i172 = (i170 & (-28)) | ((~i170) & 27);
                int i173 = (i170 & 27) << 1;
                int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
                f60822g = i174 % 128;
                int i175 = i174 % 2;
                return l7;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4}, -771100485, 771100488, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1126185584, -1126185579, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, -1332695831, 1332695833, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setDividerPadding(new Object[]{this}, 624245342, -624245341, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final boolean setX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 922224049, -922224045, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1615486267, -1615486260, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -2054288614, 2054288620, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Long setDividerPadding() {
        return (Long) setDividerPadding(new Object[]{this}, 778609397, -778609397, System.identityHashCode(this));
    }
}
