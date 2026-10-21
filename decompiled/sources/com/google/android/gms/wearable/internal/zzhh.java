package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
final class zzhh implements Callable<Boolean> {
    private final /* synthetic */ byte[] zzee;
    private final /* synthetic */ ParcelFileDescriptor zzfg;

    public zzhh(zzhg zzhgVar, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.zzfg = parcelFileDescriptor;
        this.zzee = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        if (Log.isLoggable("WearableClient", 3)) {
            new StringBuilder(String.valueOf(this.zzfg).length() + 36);
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.zzfg);
        try {
            autoCloseOutputStream.write(this.zzee);
            autoCloseOutputStream.flush();
            if (Log.isLoggable("WearableClient", 3)) {
                new StringBuilder(String.valueOf(this.zzfg).length() + 27);
            }
            return Boolean.TRUE;
        } catch (IOException unused) {
            String strValueOf = String.valueOf(this.zzfg);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
            sb2.append("processAssets: writing data failed: ");
            sb2.append(strValueOf);
            Log.w("WearableClient", sb2.toString());
            return Boolean.FALSE;
        } finally {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    new StringBuilder(String.valueOf(this.zzfg).length() + 24);
                }
                autoCloseOutputStream.close();
            } catch (IOException unused2) {
            }
        }
    }
}
