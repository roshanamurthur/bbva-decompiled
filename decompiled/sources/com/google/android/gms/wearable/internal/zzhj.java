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
final class zzhj implements Runnable {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;
    private final /* synthetic */ String zzcs;
    private final /* synthetic */ BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ zzhg zzfi;

    public zzhj(zzhg zzhgVar, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j10, long j11) {
        this.zzfi = zzhgVar;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcs = str;
        this.zzcq = j10;
        this.zzcr = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (!"file".equals(this.zzco.getScheme())) {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            this.zzfh.setFailedResult(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        ParcelFileDescriptor file = new File(this.zzco.getPath());
        try {
            try {
                file = ParcelFileDescriptor.open(file, 268435456);
                ((zzep) this.zzfi.getService()).zza(new zzhc(this.zzfh), this.zzcs, file, this.zzcq, this.zzcr);
            } catch (FileNotFoundException unused) {
                String strValueOf = String.valueOf((Object) file);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 46);
                sb2.append("File couldn't be opened for Channel.sendFile: ");
                sb2.append(strValueOf);
                Log.w("WearableClient", sb2.toString());
                this.zzfh.setFailedResult(new Status(13));
            }
        } catch (RemoteException e5) {
            Log.w("WearableClient", "Channel.sendFile failed.", e5);
            this.zzfh.setFailedResult(new Status(8));
        } finally {
            try {
                file.close();
            } catch (IOException e7) {
                Log.w("WearableClient", "Failed to close sourceFd", e7);
            }
        }
    }
}
