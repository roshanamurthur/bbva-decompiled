package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalSdkcreateTerminal1 extends setFindListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f51852l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f51853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f51854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f51855k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalSdkcreateTerminal1(@NotNull PinViewportDp pinViewportDp) {
        super(pinViewportDp);
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.f51853i = 1;
        this.f51854j = 3;
        this.f51855k = 8;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        boolean z10 = false;
        if (i14 != 1) {
            TerminalSdkcreateTerminal1 terminalSdkcreateTerminal1 = (TerminalSdkcreateTerminal1) objArr[0];
            int i15 = f51852l;
            int i16 = i15 & 71;
            int i17 = -(-((i15 ^ 71) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            int i19 = i18 % 128;
            m = i19;
            int i20 = i18 % 2;
            int i21 = terminalSdkcreateTerminal1.f51853i;
            int i22 = terminalSdkcreateTerminal1.f51855k;
            if (i21 <= i22) {
                int i23 = (i19 | 65) << 1;
                int i24 = -(((~i19) & 65) | (i19 & (-66)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f51852l = i25 % 128;
                if (i25 % 2 == 0) {
                    return Integer.valueOf(i22);
                }
                throw null;
            }
            int i26 = (i19 & 45) + (i19 | 45);
            int i27 = i26 % 128;
            f51852l = i27;
            if (i26 % 2 != 0) {
                throw null;
            }
            int i28 = (-2) - (((i27 & 126) + (i27 | 126)) ^ (-1));
            m = i28 % 128;
            if (i28 % 2 != 0) {
                return Integer.valueOf(i21);
            }
            throw null;
        }
        TerminalSdkcreateTerminal1 terminalSdkcreateTerminal2 = (TerminalSdkcreateTerminal1) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i29 = m;
        int i30 = i29 & 47;
        int i31 = i30 + ((i29 ^ 47) | i30);
        f51852l = i31 % 128;
        int i32 = i31 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != terminalSdkcreateTerminal2.f51853i) {
            int i33 = f51852l;
            int i34 = (i33 ^ 63) + ((i33 & 63) << 1);
            int i35 = i34 % 128;
            m = i35;
            int i36 = i34 % 2;
            int length = bArr.length;
            if (terminalSdkcreateTerminal2.f51855k <= length) {
                int i37 = i33 ^ 99;
                int i38 = (((i33 & 99) | i37) << 1) - i37;
                int i39 = i38 % 128;
                m = i39;
                if (i38 % 2 == 0) {
                    throw null;
                }
                if (length <= terminalSdkcreateTerminal2.f51854j) {
                    int i40 = (-2) - ((i39 + 112) ^ (-1));
                    f51852l = i40 % 128;
                    if (i40 % 2 == 0) {
                        z10 = true;
                    }
                } else {
                    int i41 = i33 + 47;
                    m = i41 % 128;
                    int i42 = i41 % 2;
                }
            } else {
                int i43 = ((i35 | 35) << 1) - (i35 ^ 35);
                f51852l = i43 % 128;
                int i44 = i43 % 2;
            }
            if (!z10) {
                int i45 = m;
                int i46 = i45 | 97;
                int i47 = (i46 << 1) - ((~(i45 & 97)) & i46);
                f51852l = i47 % 128;
                if (i47 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
        }
        int i48 = f51852l;
        int i49 = i48 ^ 35;
        int i50 = -(-((i48 & 35) << 1));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        m = i51 % 128;
        int i52 = i51 % 2;
        return Boolean.TRUE;
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -1842348675, 1842348675, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final boolean setX(@NotNull byte[] bArr) {
        return ((Boolean) setX(new Object[]{this, bArr}, 706499126, -706499125, System.identityHashCode(this))).booleanValue();
    }
}
