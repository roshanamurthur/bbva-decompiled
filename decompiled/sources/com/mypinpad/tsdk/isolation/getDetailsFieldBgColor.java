package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/mypinpad/tsdk/i/getDetailsFieldBgColor;", "Lcom/mypinpad/tsdk/i/getInstallationId;", "", "setY", "()Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/Terminal;", "d", "Lcom/mypinpad/tsdk/i/Terminal;", "()Lcom/mypinpad/tsdk/i/Terminal;", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class getDetailsFieldBgColor extends getInstallationId {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55766e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55767f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setCompoundDrawableTintBlendMode;

    static {
        int i10 = f55766e;
        int i11 = ((i10 ^ 65) | (i10 & 65)) << 1;
        int i12 = -(((~i10) & 65) | (i10 & (-66)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55767f = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public getDetailsFieldBgColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setOnFocusChangeListener = str;
        this.setCompoundDrawableTintBlendMode = Terminal.KERNEL_INTERAC;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0194  */
    /* JADX WARN: Code duplicated, block: B:45:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x01af  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f1  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i16)) | (~(i11 | i15))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i14 | (~(i15 | i16))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        if (i17 == 1) {
            getDetailsFieldBgColor getdetailsfieldbgcolor = (getDetailsFieldBgColor) objArr[0];
            Object obj = objArr[1];
            int i18 = f55766e;
            int i19 = ((i18 | 75) << 1) - (i18 ^ 75);
            int i20 = i19 % 128;
            f55767f = i20;
            if (i19 % 2 == 0) {
                int i21 = 46 / 0;
                if (getdetailsfieldbgcolor != obj) {
                    if (!(!(obj instanceof getDetailsFieldBgColor))) {
                        int i22 = ((i20 & (-44)) | ((~i20) & 43)) + ((i20 & 43) << 1);
                        f55766e = i22 % 128;
                        int i23 = i22 % 2;
                        i13 = ((i20 ^ 78) + ((i20 & 78) << 1)) - 1;
                        f55766e = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i24 = 20 / 0;
                        }
                    } else if (!Intrinsics.areEqual(getdetailsfieldbgcolor.setOnFocusChangeListener, ((getDetailsFieldBgColor) obj).setOnFocusChangeListener)) {
                        int i25 = f55766e + 47;
                        f55767f = i25 % 128;
                        int i26 = i25 % 2;
                    } else {
                        int i27 = f55766e;
                        int i28 = i27 & 47;
                        int i29 = i28 + ((i27 ^ 47) | i28);
                        f55767f = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    return Boolean.FALSE;
                }
                int i31 = i20 & 91;
                int i32 = ((((i20 ^ 91) | i31) << 1) - (~(-((~i31) & (i20 | 91))))) - 1;
                f55766e = i32 % 128;
                int i33 = i32 % 2;
            } else {
                if (getdetailsfieldbgcolor != obj) {
                    if (!(!(obj instanceof getDetailsFieldBgColor))) {
                        int i210 = ((i20 & (-44)) | ((~i20) & 43)) + ((i20 & 43) << 1);
                        f55766e = i210 % 128;
                        int i211 = i210 % 2;
                        i13 = ((i20 ^ 78) + ((i20 & 78) << 1)) - 1;
                        f55766e = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i212 = 20 / 0;
                        }
                    } else if (!Intrinsics.areEqual(getdetailsfieldbgcolor.setOnFocusChangeListener, ((getDetailsFieldBgColor) obj).setOnFocusChangeListener)) {
                        int i213 = f55766e + 47;
                        f55767f = i213 % 128;
                        int i214 = i213 % 2;
                    } else {
                        int i215 = f55766e;
                        int i216 = i215 & 47;
                        int i217 = i216 + ((i215 ^ 47) | i216);
                        f55767f = i217 % 128;
                        int i34 = i217 % 2;
                    }
                    return Boolean.FALSE;
                }
                int i35 = i20 & 91;
                int i36 = ((((i20 ^ 91) | i35) << 1) - (~(-((~i35) & (i20 | 91))))) - 1;
                f55766e = i36 % 128;
                int i37 = i36 % 2;
            }
            return Boolean.TRUE;
        }
        if (i17 == 2) {
            getDetailsFieldBgColor getdetailsfieldbgcolor2 = (getDetailsFieldBgColor) objArr[0];
            int i38 = f55766e;
            int i39 = ((i38 ^ 74) + ((i38 & 74) << 1)) - 1;
            f55767f = i39 % 128;
            int i40 = i39 % 2;
            int iHashCode = getdetailsfieldbgcolor2.setOnFocusChangeListener.hashCode();
            int i41 = f55767f;
            int i42 = (i41 & 107) + (i41 | 107);
            f55766e = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 42 / 0;
            }
            return Integer.valueOf(iHashCode);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                int i44 = f55766e;
                int i45 = i44 & 5;
                int i46 = -(-((i44 ^ 5) | i45));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                f55767f = i47 % 128;
                if (i47 % 2 != 0) {
                    return "kic";
                }
                throw null;
            }
            if (i17 == 5) {
                getDetailsFieldBgColor getdetailsfieldbgcolor3 = (getDetailsFieldBgColor) objArr[0];
                int i48 = f55767f + 65;
                f55766e = i48 % 128;
                int i49 = i48 % 2;
                String str = getdetailsfieldbgcolor3.setOnFocusChangeListener;
                if (i49 == 0) {
                    return str;
                }
                throw null;
            }
            getDetailsFieldBgColor getdetailsfieldbgcolor4 = (getDetailsFieldBgColor) objArr[0];
            int i50 = f55766e;
            int i51 = (((i50 & (-50)) | ((~i50) & 49)) - (~(-(-((i50 & 49) << 1))))) - 1;
            f55767f = i51 % 128;
            int i52 = i51 % 2;
            Terminal terminal = getdetailsfieldbgcolor4.setCompoundDrawableTintBlendMode;
            if (i52 != 0) {
                return terminal;
            }
            int i53 = 25 / 0;
            return terminal;
        }
        getDetailsFieldBgColor getdetailsfieldbgcolor5 = (getDetailsFieldBgColor) objArr[0];
        int i54 = f55766e;
        int i55 = i54 & 109;
        int i56 = (i55 - (~((i54 ^ 109) | i55))) - 1;
        f55767f = i56 % 128;
        if (i56 % 2 != 0 ? getdetailsfieldbgcolor5.setOnFocusChangeListener.length() != 10 : getdetailsfieldbgcolor5.setOnFocusChangeListener.length() != 106) {
            int i57 = f55766e;
            int i58 = ((i57 ^ 77) | (i57 & 77)) << 1;
            int i59 = -(((~i57) & 77) | (i57 & (-78)));
            int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
            f55767f = i60 % 128;
            int i61 = i60 % 2;
            z10 = false;
        } else {
            int i62 = f55766e;
            int i63 = ((i62 ^ 41) - (~(-(-((i62 & 41) << 1))))) - 1;
            f55767f = i63 % 128;
            int i64 = i63 % 2;
            int i65 = i62 + 87;
            f55767f = i65 % 128;
            int i66 = i65 % 2;
            z10 = true;
        }
        if (!z10) {
            System.identityHashCode(getdetailsfieldbgcolor5);
            System.identityHashCode(getdetailsfieldbgcolor5);
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid TAC - Denial length in Kernel Interac configuration, expected: 10, actual: ", Integer.valueOf(((String) setCompoundDrawableTintBlendMode(new Object[]{getdetailsfieldbgcolor5}, 834747277, -834747272, System.identityHashCode(getdetailsfieldbgcolor5))).length()))}, 818541572, -818541572, (int) System.currentTimeMillis());
            int i67 = f55766e + 124;
            int i68 = (i67 ^ (-1)) + (i67 << 1);
            f55767f = i68 % 128;
            int i69 = i68 % 2;
        }
        int i70 = f55767f;
        int i71 = (((i70 | 67) << 1) - (~(-(((~i70) & 67) | (i70 & (-68)))))) - 1;
        f55766e = i71 % 128;
        int i72 = i71 % 2;
        return Boolean.valueOf(z10);
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -69730677, 69730678, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -50973739, 50973741, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setCompoundDrawableTintBlendMode(new Object[]{this}, -1001269850, 1001269850, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1106990928, 1106990931, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -74389688, 74389692, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 834747277, -834747272, System.identityHashCode(this));
    }
}
