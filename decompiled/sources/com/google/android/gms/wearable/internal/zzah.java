package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "CapabilityInfoParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzah extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String name;

    @SafeParcelable.Field(getter = "getNodeParcelables", id = 3)
    private final List<zzfo> zzca;
    private final Object lock = new Object();

    @GuardedBy("lock")
    private Set<Node> zzbt = null;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<zzfo> list) {
        this.name = str;
        this.zzca = list;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzah.class != obj.getClass()) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        String str = this.name;
        if (str == null ? zzahVar.name != null : !str.equals(zzahVar.name)) {
            return false;
        }
        List<zzfo> list = this.zzca;
        List<zzfo> list2 = zzahVar.zzca;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final String getName() {
        return this.name;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final Set<Node> getNodes() {
        Set<Node> set;
        synchronized (this.lock) {
            try {
                if (this.zzbt == null) {
                    this.zzbt = new HashSet(this.zzca);
                }
                set = this.zzbt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List<zzfo> list = this.zzca;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String strValueOf = String.valueOf(this.zzca);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + n1.b(str, 18));
        sb2.append("CapabilityInfo{");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzca, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
