package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/setInitialScale;", "Lcom/mypinpad/tsdk/i/getInstallationId;", "", "setY", "()Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/Terminal;", "d", "Lcom/mypinpad/tsdk/i/Terminal;", "()Lcom/mypinpad/tsdk/i/Terminal;", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setInitialScale extends getInstallationId {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59908e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59909f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public String setOnFocusChangeListener;

    static {
        int i10 = f59908e + 47;
        f59909f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public setInitialScale(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.setY = str;
        this.setOnFocusChangeListener = str2;
        this.setCompoundDrawableTintBlendMode = Terminal.KERNEL_13;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        Boolean boolValueOf;
        int i13;
        int i14 = ~i10;
        int i15 = (((~(i14 | i11)) | (~(i14 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i16 = ~i11;
        int i17 = ((~(i16 | i14 | i12)) * 566) + ((~(i10 | i16)) * 566) + i15;
        if (i17 == 1) {
            int i18 = f59909f;
            int i19 = (i18 & 53) + (i18 | 53);
            f59908e = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i18 ^ 91) | (i18 & 91)) << 1;
            int i22 = -(((~i18) & 91) | (i18 & (-92)));
            int i23 = (i21 & i22) + (i22 | i21);
            f59908e = i23 % 128;
            int i24 = i23 % 2;
            return "k13c";
        }
        if (i17 == 2) {
            setInitialScale setinitialscale = (setInitialScale) objArr[0];
            int i25 = f59909f;
            int i26 = ((i25 & (-74)) | ((~i25) & 73)) + ((i25 & 73) << 1);
            f59908e = i26 % 128;
            if (i26 % 2 == 0) {
                return setinitialscale.setY;
            }
            String str = setinitialscale.setY;
            throw null;
        }
        if (i17 == 3) {
            setInitialScale setinitialscale2 = (setInitialScale) objArr[0];
            int i27 = f59908e;
            int i28 = i27 & 87;
            int i29 = -(-((i27 ^ 87) | i28));
            int i30 = (i28 & i29) + (i29 | i28);
            f59909f = i30 % 128;
            int i31 = i30 % 2;
            int iHashCode = setinitialscale2.setY.hashCode();
            int i32 = iHashCode * 31;
            int iHashCode2 = setinitialscale2.setOnFocusChangeListener.hashCode();
            int iIdentityHashCode = System.identityHashCode(setinitialscale2);
            int i33 = (iHashCode2 * (-159)) - (~(-(-(iHashCode * (-4929)))));
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            int i35 = ~iHashCode2;
            int i36 = (~i35) & i32;
            int i37 = ~i32;
            int i38 = i36 | (i35 & i37);
            int i39 = i35 & i32;
            int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * 160));
            int i41 = i34 & i40;
            int i42 = ((i34 | i40) & (~i41)) + (i41 << 1);
            int i43 = ~iIdentityHashCode;
            int i44 = ~((i43 ^ iHashCode2) | (i43 & iHashCode2));
            int i45 = iHashCode2 ^ i32;
            int i46 = i32 & iHashCode2;
            int i47 = ~((i46 & i45) | (i45 ^ i46));
            int i48 = ((~i47) & i44) | ((~i44) & i47);
            int i49 = i47 & i44;
            int i50 = -(~(-(-(((i49 & i48) | (i48 ^ i49)) * (-160)))));
            int i51 = ((-1) << 1) - ((-1) ^ ((i42 ^ i50) + ((i42 & i50) << 1)));
            int i52 = (iIdentityHashCode | i43) & (~iIdentityHashCode);
            int i53 = i37 & i52;
            int i54 = (i52 | i37) & (~i53);
            int i55 = (i54 & i53) | (i54 ^ i53);
            int i56 = (i55 | (~i55)) & (~i55);
            int i57 = iHashCode2 ^ i56;
            int i58 = i56 & iHashCode2;
            int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * 160));
            int i60 = (i51 & i59) + (i59 | i51);
            int i61 = f59908e;
            int i62 = (i61 & 51) + (i61 | 51);
            f59909f = i62 % 128;
            int i63 = i62 % 2;
            return Integer.valueOf(i60);
        }
        if (i17 == 4) {
            setInitialScale setinitialscale3 = (setInitialScale) objArr[0];
            int i64 = f59908e + 55;
            f59909f = i64 % 128;
            if (i64 % 2 != 0 ? setinitialscale3.setY.length() != 10 : setinitialscale3.setY.length() != 1) {
                int i65 = f59908e;
                int i66 = i65 & 123;
                int i67 = (i65 | 123) & (~i66);
                int i68 = i66 << 1;
                int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                f59909f = i69 % 128;
                int i70 = i69 % 2;
                z10 = false;
            } else {
                int i71 = f59908e;
                int i72 = i71 + 79;
                f59909f = i72 % 128;
                int i73 = i72 % 2;
                int i74 = (i71 ^ 25) + ((i71 & 25) << 1);
                f59909f = i74 % 128;
                int i75 = i74 % 2;
                z10 = true;
            }
            if (!z10) {
                int i76 = f59908e;
                int i77 = i76 & 17;
                int i78 = -(-((i76 ^ 17) | i77));
                int i79 = (i77 & i78) + (i78 | i77);
                f59909f = i79 % 128;
                int i80 = i79 % 2;
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid TAC - Denial length in Kernel 13 configuration, expected: 10, actual: ", Integer.valueOf(((String) setCompoundDrawableTintBlendMode(new Object[]{setinitialscale3}, -650568247, 650568249, System.identityHashCode(setinitialscale3))).length()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                int i81 = f59908e;
                int i82 = ((i81 & (-102)) | ((~i81) & 101)) + ((i81 & 101) << 1);
                f59909f = i82 % 128;
                int i83 = i82 % 2;
            }
            int i84 = f59908e;
            int i85 = i84 & 121;
            int i86 = ((i84 | 121) & (~i85)) + (i85 << 1);
            f59909f = i86 % 128;
            if (i86 % 2 == 0) {
                int i87 = 28 / 0;
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = Boolean.valueOf(z10);
            }
            return boolValueOf;
        }
        if (i17 == 5) {
            setInitialScale setinitialscale4 = (setInitialScale) objArr[0];
            int i88 = f59908e;
            int i89 = (i88 & 25) + (i88 | 25);
            f59909f = i89 % 128;
            if (i89 % 2 == 0) {
                Terminal terminal = setinitialscale4.setCompoundDrawableTintBlendMode;
                throw null;
            }
            Terminal terminal2 = setinitialscale4.setCompoundDrawableTintBlendMode;
            int i90 = i88 & 59;
            int i91 = (((i88 ^ 59) | i90) << 1) - ((i88 | 59) & (~i90));
            f59909f = i91 % 128;
            if (i91 % 2 != 0) {
                return terminal2;
            }
            throw null;
        }
        Boolean bool = Boolean.FALSE;
        setInitialScale setinitialscale5 = (setInitialScale) objArr[0];
        Object obj = objArr[1];
        int i92 = f59908e;
        int i93 = i92 & 55;
        int i94 = (((i92 ^ 55) | i93) << 1) - ((~i93) & (i92 | 55));
        f59909f = i94 % 128;
        if (i94 % 2 == 0) {
            throw null;
        }
        if (setinitialscale5 != obj) {
            if (!(obj instanceof setInitialScale)) {
                int i95 = i92 ^ 27;
                int i96 = ((i92 & 27) | i95) << 1;
                int i97 = -i95;
                int i98 = (i96 & i97) + (i97 | i96);
                int i99 = i98 % 128;
                f59909f = i99;
                int i100 = i98 % 2;
                int i101 = i99 + 99;
                f59908e = i101 % 128;
                int i102 = i101 % 2;
                return bool;
            }
            setInitialScale setinitialscale6 = (setInitialScale) obj;
            if (!Intrinsics.areEqual(setinitialscale5.setY, setinitialscale6.setY)) {
                int i103 = f59909f + 44;
                i13 = (i103 ^ (-1)) + (i103 << 1);
            } else if (Intrinsics.areEqual(setinitialscale5.setOnFocusChangeListener, setinitialscale6.setOnFocusChangeListener)) {
                int i104 = f59908e;
                int i105 = ((i104 | 20) << 1) - (i104 ^ 20);
                int i106 = (i105 ^ (-1)) + (i105 << 1);
                f59909f = i106 % 128;
                if (i106 % 2 == 0) {
                    throw null;
                }
            } else {
                int i107 = f59909f;
                int i108 = i107 & 95;
                int i109 = -(-((i107 ^ 95) | i108));
                int i110 = (i108 & i109) + (i108 | i109);
                f59908e = i110 % 128;
                int i111 = i110 % 2;
                i13 = ((i107 ^ 55) - (~(-(-((i107 & 55) << 1))))) - 1;
            }
            f59908e = i13 % 128;
            int i112 = i13 % 2;
            return bool;
        }
        int i113 = i92 & 37;
        int i114 = ((i92 ^ 37) | i113) << 1;
        int i115 = -((~i113) & (i92 | 37));
        int i116 = (i114 ^ i115) + ((i114 & i115) << 1);
        f59909f = i116 % 128;
        int i117 = i116 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -254582907, 254582907, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 438390243, -438390240, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setCompoundDrawableTintBlendMode(new Object[]{this}, -759038455, 759038460, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 581848618, -581848614, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1895849920, -1895849919, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -650568247, 650568249, System.identityHashCode(this));
    }
}
