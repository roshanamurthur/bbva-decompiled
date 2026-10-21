package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fi extends TerminalSdkConfigurationCompanion<setInitialScale> {
    public static int C = 0;
    public static int D = 1;

    @NotNull
    public final byte[] A;
    public setFitsSystemWindows B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator) {
        super(setbackgroundtintlist, diVar, setchildindicator, Terminal.KERNEL_13);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        setInitialScale x4 = setX();
        this.A = (byte[]) setInputExtras.setDividerPadding(new Object[]{(String) setInitialScale.setCompoundDrawableTintBlendMode(new Object[]{x4}, -650568247, 650568249, System.identityHashCode(x4)), 5}, -689525923, 689525942, 5);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~((~i12) | i13);
        int i15 = (((~(i10 | i11 | i12)) | i14) * 338) + ((~(i13 | i11)) * 338) + (((~((~i11) | i10)) | i14 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337));
        if (i15 == 1) {
            fi fiVar = (fi) objArr[0];
            int i16 = C;
            int i17 = i16 & 47;
            int i18 = (i16 ^ 47) | i17;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            D = i19 % 128;
            int i20 = i19 % 2;
            setFitsSystemWindows setfitssystemwindows = fiVar.B;
            if (i20 == 0) {
                throw null;
            }
            if (setfitssystemwindows != null) {
                int i21 = i16 + 3;
                D = i21 % 128;
                int i22 = i21 % 2;
                return setfitssystemwindows;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i23 = D + 89;
            C = i23 % 128;
            if (i23 % 2 == 0) {
                return null;
            }
            int i24 = 50 / 0;
            return null;
        }
        if (i15 == 2) {
            fi fiVar2 = (fi) objArr[0];
            setFitsSystemWindows setfitssystemwindows2 = (setFitsSystemWindows) objArr[1];
            int i25 = C;
            int i26 = (((i25 ^ 3) | (i25 & 3)) << 1) - ((3 & (~i25)) | (i25 & (-4)));
            D = i26 % 128;
            int i27 = i26 % 2;
            Intrinsics.checkNotNullParameter(setfitssystemwindows2, "");
            fiVar2.B = setfitssystemwindows2;
            int i28 = D;
            int i29 = ((-1) << 1) - ((-1) ^ ((i28 & 70) + (i28 | 70)));
            C = i29 % 128;
            int i30 = i29 % 2;
            return null;
        }
        fi fiVar3 = (fi) objArr[0];
        int i31 = D;
        int i32 = i31 & 103;
        int i33 = (~i32) & (i31 | 103);
        int i34 = i32 << 1;
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        C = i35 % 128;
        if (i35 % 2 != 0) {
            byte[] bArr = fiVar3.A;
            throw null;
        }
        byte[] bArr2 = fiVar3.A;
        int i36 = i31 & 107;
        int i37 = ((i31 | 107) & (~i36)) + (i36 << 1);
        C = i37 % 128;
        if (i37 % 2 == 0) {
            return bArr2;
        }
        int i38 = 68 / 0;
        return bArr2;
    }

    @NotNull
    public final setFitsSystemWindows getSuppressed() {
        return (setFitsSystemWindows) setY(new Object[]{this}, 1745369071, -1745369070, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setMaxEms() {
        return (byte[]) setY(new Object[]{this}, -571622170, 571622170, System.identityHashCode(this));
    }

    public final void setX(@NotNull setFitsSystemWindows setfitssystemwindows) {
        setY(new Object[]{this, setfitssystemwindows}, 2080063025, -2080063023, System.identityHashCode(this));
    }
}
