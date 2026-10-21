package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* JADX INFO: loaded from: classes9.dex */
public final class zzcx implements DataEvent {
    private int type;
    private DataItem zzdg;

    public zzcx(DataEvent dataEvent) {
        this.type = dataEvent.getType();
        this.zzdg = dataEvent.getDataItem().freeze();
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return this.zzdg;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        String str;
        if (getType() == 1) {
            str = "changed";
        } else {
            str = getType() == 2 ? "deleted" : "unknown";
        }
        String strValueOf = String.valueOf(getDataItem());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str.length() + 35);
        sb2.append("DataEventEntity{ type=");
        sb2.append(str);
        sb2.append(", dataitem=");
        sb2.append(strValueOf);
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataEvent freeze() {
        return this;
    }
}
