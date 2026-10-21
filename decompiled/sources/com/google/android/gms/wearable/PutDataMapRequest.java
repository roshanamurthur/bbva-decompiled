package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public class PutDataMapRequest {
    private final DataMap zzr;
    private final PutDataRequest zzs;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.zzs = putDataRequest;
        DataMap dataMap2 = new DataMap();
        this.zzr = dataMap2;
        if (dataMap != null) {
            dataMap2.putAll(dataMap);
        }
    }

    public static PutDataMapRequest create(@NonNull String str) {
        Asserts.checkNotNull(str, "path must not be null");
        return new PutDataMapRequest(PutDataRequest.create(str), null);
    }

    public static PutDataMapRequest createFromDataMapItem(@NonNull DataMapItem dataMapItem) {
        Asserts.checkNotNull(dataMapItem, "source must not be null");
        return new PutDataMapRequest(PutDataRequest.zza(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(@NonNull String str) {
        Asserts.checkNotNull(str, "pathPrefix must not be null");
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(str), null);
    }

    public PutDataRequest asPutDataRequest() {
        com.google.android.gms.internal.wearable.zzf zzfVarZza = com.google.android.gms.internal.wearable.zze.zza(this.zzr);
        this.zzs.setData(com.google.android.gms.internal.wearable.zzt.zzb(zzfVarZza.zzfw));
        int size = zzfVarZza.zzfx.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = Integer.toString(i10);
            Asset asset = zzfVarZza.zzfx.get(i10);
            if (string == null) {
                String strValueOf = String.valueOf(asset);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 26);
                sb2.append("asset key cannot be null: ");
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString());
            }
            if (asset == null) {
                throw new IllegalStateException(string.length() != 0 ? "asset cannot be null: key=".concat(string) : new String("asset cannot be null: key="));
            }
            if (Log.isLoggable(DataMap.TAG, 3)) {
                new StringBuilder(String.valueOf(asset).length() + string.length() + 33);
            }
            this.zzs.putAsset(string, asset);
        }
        return this.zzs;
    }

    public DataMap getDataMap() {
        return this.zzr;
    }

    public Uri getUri() {
        return this.zzs.getUri();
    }

    public boolean isUrgent() {
        return this.zzs.isUrgent();
    }

    public PutDataMapRequest setUrgent() {
        this.zzs.setUrgent();
        return this;
    }
}
