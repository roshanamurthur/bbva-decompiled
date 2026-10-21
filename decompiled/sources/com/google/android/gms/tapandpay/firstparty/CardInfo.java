package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.contacts.ContactAccessor;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CardInfoCreator")
@SafeParcelable.Reserved({1, 14})
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzd();
    private static final com.google.android.gms.internal.tapandpay.zzau zzL = com.google.android.gms.internal.tapandpay.zzau.zzi(10, 9);

    @SafeParcelable.Field(id = 30)
    long zzA;

    @SafeParcelable.Field(id = 31)
    long zzB;

    @SafeParcelable.Field(id = 32)
    boolean zzC;

    @SafeParcelable.Field(id = 33)
    long zzD;

    @SafeParcelable.Field(id = 34)
    String zzE;

    @SafeParcelable.Field(id = 35)
    String zzF;

    @Nullable
    @SafeParcelable.Field(id = 36)
    zze zzG;

    @SafeParcelable.Field(id = 37)
    int zzH;

    @SafeParcelable.Field(id = 38)
    boolean zzI;

    @Nullable
    @SafeParcelable.Field(id = 39)
    String zzJ;

    @SafeParcelable.Field(id = 40)
    int zzK;

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    byte[] zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    int zze;

    @SafeParcelable.Field(id = 7)
    TokenStatus zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @Nullable
    @SafeParcelable.Field(id = 9)
    Uri zzh;

    @SafeParcelable.Field(id = 10)
    int zzi;

    @SafeParcelable.Field(id = 11)
    int zzj;

    @Nullable
    @SafeParcelable.Field(id = 12)
    zzaj zzk;

    @SafeParcelable.Field(id = 13)
    String zzl;

    @SafeParcelable.Field(id = 15)
    zzaz zzm;

    @SafeParcelable.Field(id = 16)
    String zzn;

    @SafeParcelable.Field(id = 17)
    byte[] zzo;

    @SafeParcelable.Field(id = 18)
    int zzp;

    @SafeParcelable.Field(id = 20)
    int zzq;

    @SafeParcelable.Field(id = 21)
    int zzr;

    @Nullable
    @SafeParcelable.Field(id = 22)
    zzah zzs;

    @Nullable
    @SafeParcelable.Field(id = 23)
    zzaf zzt;

    @SafeParcelable.Field(id = 24)
    String zzu;

    @SafeParcelable.Field(id = 25)
    zzan[] zzv;

    @SafeParcelable.Field(id = 26)
    boolean zzw;

    @SafeParcelable.Field(id = 27)
    List zzx;

    @SafeParcelable.Field(id = 28)
    boolean zzy;

    @SafeParcelable.Field(id = 29)
    boolean zzz;

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) int i10, @SafeParcelable.Param(id = 7) TokenStatus tokenStatus, @SafeParcelable.Param(id = 8) String str4, @Nullable @SafeParcelable.Param(id = 9) Uri uri, @SafeParcelable.Param(id = 10) int i11, @SafeParcelable.Param(id = 11) int i12, @Nullable @SafeParcelable.Param(id = 12) zzaj zzajVar, @SafeParcelable.Param(id = 13) String str5, @SafeParcelable.Param(id = 15) zzaz zzazVar, @SafeParcelable.Param(id = 16) String str6, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) int i13, @SafeParcelable.Param(id = 20) int i14, @SafeParcelable.Param(id = 21) int i15, @Nullable @SafeParcelable.Param(id = 22) zzah zzahVar, @Nullable @SafeParcelable.Param(id = 23) zzaf zzafVar, @SafeParcelable.Param(id = 24) String str7, @SafeParcelable.Param(id = 25) zzan[] zzanVarArr, @SafeParcelable.Param(id = 26) boolean z10, @SafeParcelable.Param(id = 27) List list, @SafeParcelable.Param(id = 28) boolean z11, @SafeParcelable.Param(id = 29) boolean z12, @SafeParcelable.Param(id = 30) long j10, @SafeParcelable.Param(id = 31) long j11, @SafeParcelable.Param(id = 32) boolean z13, @SafeParcelable.Param(id = 33) long j12, @SafeParcelable.Param(id = 34) String str8, @SafeParcelable.Param(id = 35) String str9, @Nullable @SafeParcelable.Param(id = 36) zze zzeVar, @SafeParcelable.Param(id = 37) int i16, @SafeParcelable.Param(id = 38) boolean z14, @Nullable @SafeParcelable.Param(id = 39) String str10, @SafeParcelable.Param(id = 40) int i17) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = i10;
        this.zzf = tokenStatus;
        this.zzg = str4;
        this.zzh = uri;
        this.zzi = i11;
        this.zzj = i12;
        this.zzk = zzajVar;
        this.zzl = str5;
        this.zzm = zzazVar;
        this.zzn = str6;
        this.zzo = bArr2;
        this.zzp = i13;
        this.zzq = i14;
        this.zzr = i15;
        this.zzs = zzahVar;
        this.zzt = zzafVar;
        this.zzu = str7;
        this.zzv = zzanVarArr;
        this.zzw = z10;
        this.zzx = list;
        this.zzy = z11;
        this.zzz = z12;
        this.zzA = j10;
        this.zzB = j11;
        this.zzC = z13;
        this.zzD = j12;
        this.zzE = str8;
        this.zzF = str9;
        this.zzG = zzeVar;
        this.zzH = i16;
        this.zzI = z14;
        this.zzJ = str10;
        this.zzK = i17;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (Objects.equal(this.zza, cardInfo.zza) && Arrays.equals(this.zzb, cardInfo.zzb) && Objects.equal(this.zzc, cardInfo.zzc) && Objects.equal(this.zzd, cardInfo.zzd) && this.zze == cardInfo.zze && Objects.equal(this.zzf, cardInfo.zzf) && Objects.equal(this.zzg, cardInfo.zzg) && Objects.equal(this.zzh, cardInfo.zzh) && this.zzi == cardInfo.zzi && this.zzj == cardInfo.zzj && Objects.equal(this.zzk, cardInfo.zzk) && Objects.equal(this.zzl, cardInfo.zzl) && Objects.equal(this.zzm, cardInfo.zzm) && this.zzp == cardInfo.zzp && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && Objects.equal(this.zzs, cardInfo.zzs) && Objects.equal(this.zzt, cardInfo.zzt) && Objects.equal(this.zzu, cardInfo.zzu) && Arrays.equals(this.zzv, cardInfo.zzv) && this.zzw == cardInfo.zzw && Objects.equal(this.zzx, cardInfo.zzx) && this.zzy == cardInfo.zzy && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzC == cardInfo.zzC && this.zzD == cardInfo.zzD && Objects.equal(this.zzE, cardInfo.zzE) && Objects.equal(this.zzF, cardInfo.zzF) && Objects.equal(this.zzG, cardInfo.zzG) && this.zzH == cardInfo.zzH && this.zzI == cardInfo.zzI && this.zzK == cardInfo.zzK) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Integer.valueOf(this.zzj), this.zzl, this.zzm, Integer.valueOf(this.zzp), Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv, Boolean.valueOf(this.zzw), this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), Long.valueOf(this.zzA), Boolean.valueOf(this.zzC), Long.valueOf(this.zzD), this.zzE, this.zzF, this.zzG, Integer.valueOf(this.zzH), Boolean.valueOf(this.zzI), Integer.valueOf(this.zzK));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.zza);
        byte[] bArr = this.zzb;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add(ConstantsKt.CARD_HOLDER_NAME, this.zzc).add(ContactAccessor.DISPLAY_NAME, this.zzd).add(GoogleTapAndPay.KEY_CARD_NETWORK, Integer.valueOf(this.zze)).add("tokenStatus", this.zzf).add("panLastDigits", this.zzg).add("cardImageUrl", this.zzh).add("cardColor", Integer.valueOf(this.zzi)).add("overlayTextColor", Integer.valueOf(this.zzj));
        zzaj zzajVar = this.zzk;
        Objects.ToStringHelper toStringHelperAdd3 = toStringHelperAdd2.add("issuerInfo", zzajVar == null ? null : zzajVar.toString()).add("tokenLastDigits", this.zzl).add("transactionInfo", this.zzm).add("issuerTokenId", this.zzn);
        byte[] bArr2 = this.zzo;
        Objects.ToStringHelper toStringHelperAdd4 = toStringHelperAdd3.add("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2)).add("cachedEligibility", Integer.valueOf(this.zzp)).add("paymentProtocol", Integer.valueOf(this.zzq)).add("tokenType", Integer.valueOf(this.zzr)).add("inStoreCvmConfig", this.zzs).add("inAppCvmConfig", this.zzt).add("tokenDisplayName", this.zzu);
        zzan[] zzanVarArr = this.zzv;
        return toStringHelperAdd4.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("allowAidSelection", Boolean.valueOf(this.zzw)).add("badges", Constant.BRACKET_OPEN + TextUtils.join(", ", this.zzx) + Constant.BRACKET_CLOSE).add("upgradeAvailable", Boolean.valueOf(this.zzy)).add("requiresSignature", Boolean.valueOf(this.zzz)).add("googleTokenId", Long.valueOf(this.zzA)).add("isTransit", Boolean.valueOf(this.zzC)).add("googleWalletId", Long.valueOf(this.zzD)).add("devicePaymentMethodId", this.zzE).add("cloudPaymentMethodId", this.zzF).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i10, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i10, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i10, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzm, i10, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzo, false);
        SafeParcelWriter.writeInt(parcel, 18, this.zzp);
        SafeParcelWriter.writeInt(parcel, 20, this.zzq);
        SafeParcelWriter.writeInt(parcel, 21, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzs, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzt, i10, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzu, false);
        SafeParcelWriter.writeTypedArray(parcel, 25, this.zzv, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzw);
        SafeParcelWriter.writeTypedList(parcel, 27, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzy);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzz);
        SafeParcelWriter.writeLong(parcel, 30, this.zzA);
        SafeParcelWriter.writeLong(parcel, 31, this.zzB);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzC);
        SafeParcelWriter.writeLong(parcel, 33, this.zzD);
        SafeParcelWriter.writeString(parcel, 34, this.zzE, false);
        SafeParcelWriter.writeString(parcel, 35, this.zzF, false);
        SafeParcelWriter.writeParcelable(parcel, 36, this.zzG, i10, false);
        SafeParcelWriter.writeInt(parcel, 37, this.zzH);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzI);
        SafeParcelWriter.writeString(parcel, 39, this.zzJ, false);
        SafeParcelWriter.writeInt(parcel, 40, this.zzK);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
