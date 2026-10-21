package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* JADX INFO: loaded from: classes9.dex */
public final class zzcy extends DataBufferRef implements DataEvent {
    private final int zzdl;

    public zzcy(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.zzdl = i11;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataEvent freeze() {
        return new zzcx(this);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return new zzdf(this.mDataHolder, this.mDataRow, this.zzdl);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return getInteger("event_type");
    }

    public final String toString() {
        String str;
        if (getType() == 1) {
            str = "changed";
        } else {
            str = getType() == 2 ? "deleted" : "unknown";
        }
        String strValueOf = String.valueOf(getDataItem());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str.length() + 32);
        sb2.append("DataEventRef{ type=");
        sb2.append(str);
        sb2.append(", dataitem=");
        sb2.append(strValueOf);
        sb2.append(" }");
        return sb2.toString();
    }
}
