package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class zzhi implements Runnable {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ boolean zzcp;
    private final /* synthetic */ String zzcs;
    private final /* synthetic */ BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ zzhg zzfi;

    public zzhi(zzhg zzhgVar, Uri uri, BaseImplementation.ResultHolder resultHolder, boolean z10, String str) {
        this.zzfi = zzhgVar;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcp = z10;
        this.zzcs = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!"file".equals(this.zzco.getScheme())) {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            this.zzfh.setFailedResult(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        File file = new File(this.zzco.getPath());
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, (this.zzcp ? 33554432 : 0) | 671088640);
            try {
                ((zzep) this.zzfi.getService()).zza(new zzhf(this.zzfh), this.zzcs, parcelFileDescriptorOpen);
            } catch (RemoteException e5) {
                Log.w("WearableClient", "Channel.receiveFile failed.", e5);
                this.zzfh.setFailedResult(new Status(8));
            } finally {
                try {
                    parcelFileDescriptorOpen.close();
                } catch (IOException e7) {
                    Log.w("WearableClient", "Failed to close targetFd", e7);
                }
            }
        } catch (FileNotFoundException unused) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("File couldn't be opened for Channel.receiveFile: ");
            sb2.append(strValueOf);
            Log.w("WearableClient", sb2.toString());
            this.zzfh.setFailedResult(new Status(13));
        }
    }
}
