package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.c;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityRequestCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 2)
    private final ClientIdentity zzb;

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) boolean z10, @Nullable @SafeParcelable.Param(id = 2) ClientIdentity clientIdentity) {
        this.zza = z10;
        this.zzb = clientIdentity;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.zza == zzadVar.zza && Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    public final String toString() {
        StringBuilder sbD = c.d("LocationAvailabilityRequest[");
        if (this.zza) {
            sbD.append("bypass, ");
        }
        if (this.zzb != null) {
            sbD.append("impersonation=");
            sbD.append(this.zzb);
            sbD.append(", ");
        }
        sbD.setLength(sbD.length() - 2);
        sbD.append(AbstractJsonLexerKt.END_LIST);
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z10);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
