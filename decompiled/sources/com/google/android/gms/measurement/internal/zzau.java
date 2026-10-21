package com.google.android.gms.measurement.internal;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c;
import androidx.collection.k;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzas zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzau(zzau zzauVar, long j10) {
        Preconditions.checkNotNull(zzauVar);
        this.zza = zzauVar.zza;
        this.zzb = zzauVar.zzb;
        this.zzc = zzauVar.zzc;
        this.zzd = j10;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(c.a(String.valueOf(str).length(), 21, String.valueOf(str2).length(), strValueOf.length()));
        k.e(sb2, "origin=", str, ",name=", str2);
        return d.f(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzav.zza(this, parcel, i10);
    }

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzas zzasVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j10) {
        this.zza = str;
        this.zzb = zzasVar;
        this.zzc = str2;
        this.zzd = j10;
    }
}
