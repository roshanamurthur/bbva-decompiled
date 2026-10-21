package com.bbva.cells.component.kit.datamanager.domain.adapter;

import android.os.Parcel;
import com.ryanharter.auto.value.parcel.TypeAdapter;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DateTypeAdapter implements TypeAdapter<Date> {
    @Override // com.ryanharter.auto.value.parcel.TypeAdapter
    public Date fromParcel(Parcel parcel) {
        return new Date(parcel.readLong());
    }

    @Override // com.ryanharter.auto.value.parcel.TypeAdapter
    public void toParcel(Date date, Parcel parcel) {
        parcel.writeLong(date.getTime());
    }
}
