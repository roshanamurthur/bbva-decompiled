package com.google.android.gms.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelIOException extends IOException {
    private final int zzg;
    private final int zzh;

    public ChannelIOException(String str, int i10, int i11) {
        super(str);
        this.zzg = i10;
        this.zzh = i11;
    }

    public int getAppSpecificErrorCode() {
        return this.zzh;
    }

    public int getCloseReason() {
        return this.zzg;
    }
}
