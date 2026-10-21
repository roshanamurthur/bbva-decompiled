package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AddListenerRequestCreator")
@SafeParcelable.Reserved({1})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getListenerAsBinder", id = 2, type = "android.os.IBinder")
    private final zzem zzaz;

    @SafeParcelable.Field(id = 3)
    private final IntentFilter[] zzba;

    @Nullable
    @SafeParcelable.Field(id = 4)
    private final String zzbb;

    @Nullable
    @SafeParcelable.Field(id = 5)
    private final String zzbc;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IntentFilter[] intentFilterArr, @SafeParcelable.Param(id = 4) @Nullable String str, @SafeParcelable.Param(id = 5) @Nullable String str2) {
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = iInterfaceQueryLocalInterface instanceof zzem ? (zzem) iInterfaceQueryLocalInterface : new zzeo(iBinder);
        } else {
            this.zzaz = null;
        }
        this.zzba = intentFilterArr;
        this.zzbb = str;
        this.zzbc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzem zzemVar = this.zzaz;
        SafeParcelWriter.writeIBinder(parcel, 2, zzemVar == null ? null : zzemVar.asBinder(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzba, i10, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbb, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzd(zzhk zzhkVar) {
        this.zzaz = zzhkVar;
        this.zzba = zzhkVar.zze();
        this.zzbb = zzhkVar.zzf();
        this.zzbc = null;
    }
}
