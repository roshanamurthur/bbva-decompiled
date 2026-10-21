package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.bbva.contacts.ContactAccessor;
import com.bbva.google.pay.GoogleTapAndPay;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenInfoCreator")
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final String zzb;

    @SafeParcelable.Field(id = 3)
    final int zzc;

    @SafeParcelable.Field(id = 4)
    final TokenStatus zzd;

    @SafeParcelable.Field(id = 5)
    final String zze;

    @Nullable
    @SafeParcelable.Field(id = 6)
    final Uri zzf;

    @SafeParcelable.Field(id = 7)
    final byte[] zzg;

    @SafeParcelable.Field(id = 8)
    final zzan[] zzh;

    @SafeParcelable.Field(id = 9)
    final int zzi;

    @SafeParcelable.Field(id = 10)
    final boolean zzj;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) TokenStatus tokenStatus, @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) zzan[] zzanVarArr, @SafeParcelable.Param(id = 9) int i11, @SafeParcelable.Param(id = 10) boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = tokenStatus;
        this.zze = str3;
        this.zzf = uri;
        this.zzg = bArr;
        this.zzh = zzanVarArr;
        this.zzi = i11;
        this.zzj = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (Objects.equal(this.zza, zzauVar.zza) && Objects.equal(this.zzb, zzauVar.zzb) && this.zzc == zzauVar.zzc && Objects.equal(this.zzd, zzauVar.zzd) && Objects.equal(this.zze, zzauVar.zze) && Objects.equal(this.zzf, zzauVar.zzf) && Arrays.equals(this.zzg, zzauVar.zzg) && Arrays.equals(this.zzh, zzauVar.zzh) && this.zzi == zzauVar.zzi && this.zzj == zzauVar.zzj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.zza).add(ContactAccessor.DISPLAY_NAME, this.zzb).add(GoogleTapAndPay.KEY_CARD_NETWORK, Integer.valueOf(this.zzc)).add("tokenStatus", this.zzd).add("panLastDigits", this.zze).add("cardImageUrl", this.zzf);
        byte[] bArr = this.zzg;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("inAppCardToken", bArr == null ? null : Arrays.toString(bArr));
        zzan[] zzanVarArr = this.zzh;
        return toStringHelperAdd2.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("tokenType", Integer.valueOf(this.zzi)).add("supportsOdaTransit", Boolean.valueOf(this.zzj)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzh, i10, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
