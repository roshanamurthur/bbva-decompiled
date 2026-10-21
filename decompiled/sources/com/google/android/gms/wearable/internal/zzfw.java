package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "RemoveListenerRequestCreator")
public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();

    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;

    @SafeParcelable.Field(getter = "getListenerAsBinder", id = 2, type = "android.os.IBinder")
    private final zzem zzaz;

    @SafeParcelable.Constructor
    public zzfw(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.versionCode = i10;
        if (iBinder == null) {
            this.zzaz = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = iInterfaceQueryLocalInterface instanceof zzem ? (zzem) iInterfaceQueryLocalInterface : new zzeo(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        zzem zzemVar = this.zzaz;
        SafeParcelWriter.writeIBinder(parcel, 2, zzemVar == null ? null : zzemVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfw(zzem zzemVar) {
        this.versionCode = 1;
        this.zzaz = zzemVar;
    }
}
