package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzcy;

/* JADX INFO: loaded from: classes9.dex */
public class DataEventBuffer extends EntityBuffer<DataEvent> implements Result {
    private final Status zzp;

    public DataEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzp = new Status(dataHolder.getStatusCode());
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    public /* synthetic */ DataEvent getEntry(int i10, int i11) {
        return new zzcy(this.mDataHolder, i10, i11);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    public String getPrimaryDataMarkerColumn() {
        return "path";
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzp;
    }
}
