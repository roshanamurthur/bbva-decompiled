package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setDownloadListener extends getInstallationId {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59632e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59633f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Terminal f59635d = Terminal.KERNEL_2;

    public setDownloadListener(boolean z10) {
        this.f59634c = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563));
        if (i16 == 1) {
            setDownloadListener setdownloadlistener = (setDownloadListener) objArr[0];
            int i17 = f59633f + 125;
            int i18 = i17 % 128;
            f59632e = i18;
            int i19 = i17 % 2;
            Terminal terminal = setdownloadlistener.f59635d;
            int i20 = (i18 & 53) + (i18 | 53);
            f59633f = i20 % 128;
            int i21 = i20 % 2;
            return terminal;
        }
        if (i16 != 2) {
            setDownloadListener setdownloadlistener2 = (setDownloadListener) objArr[0];
            int i22 = f59633f;
            int i23 = ((i22 | 113) << 1) - (i22 ^ 113);
            f59632e = i23 % 128;
            int i24 = i23 % 2;
            boolean z10 = setdownloadlistener2.f59634c;
            if (i24 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        int i25 = f59632e;
        int i26 = i25 ^ 87;
        int i27 = (i25 & 87) << 1;
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        f59633f = i28 % 128;
        int i29 = i28 % 2;
        int i30 = (i25 ^ 60) + ((i25 & 60) << 1);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        f59633f = i31 % 128;
        int i32 = i31 % 2;
        return Boolean.TRUE;
    }

    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1747509270, 1747509270, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -707968860, 707968862, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setOnFocusChangeListener(new Object[]{this}, 286615399, -286615398, System.identityHashCode(this));
    }
}
