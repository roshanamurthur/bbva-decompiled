package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzR(status);
                return true;
            case 3:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                zzu(status2, bundle);
                return true;
            case 4:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzp zzpVar = (com.google.android.gms.tapandpay.firstparty.zzp) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzp.CREATOR);
                zzc.zzb(parcel);
                zzi(status3, zzpVar);
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzQ(status4);
                return true;
            case 6:
                Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zze(status5);
                return true;
            case 7:
            case 16:
            case 26:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            default:
                return false;
            case 8:
                Status status6 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzj zzjVar = (com.google.android.gms.tapandpay.firstparty.zzj) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzj.CREATOR);
                zzc.zzb(parcel);
                zzd(status6, zzjVar);
                return true;
            case 9:
                Status status7 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzc(status7);
                return true;
            case 10:
                zzb();
                return true;
            case 11:
                Status status8 = (Status) zzc.zza(parcel, Status.CREATOR);
                boolean zZze = zzc.zze(parcel);
                zzc.zzb(parcel);
                zzn(status8, zZze);
                return true;
            case 12:
                Status status9 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzP(status9);
                return true;
            case 13:
                Status status10 = (Status) zzc.zza(parcel, Status.CREATOR);
                boolean zZze2 = zzc.zze(parcel);
                zzc.zzb(parcel);
                zzI(status10, zZze2);
                return true;
            case 14:
                Status status11 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzJ(status11);
                return true;
            case 15:
                Status status12 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzl zzlVar = (com.google.android.gms.tapandpay.firstparty.zzl) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzl.CREATOR);
                zzc.zzb(parcel);
                zzf(status12, zzlVar);
                return true;
            case 17:
                Status status13 = (Status) zzc.zza(parcel, Status.CREATOR);
                RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = (RetrieveInAppPaymentCredentialResponse) zzc.zza(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR);
                zzc.zzb(parcel);
                zzv(status13, retrieveInAppPaymentCredentialResponse);
                return true;
            case 18:
                Status status14 = (Status) zzc.zza(parcel, Status.CREATOR);
                String string = parcel.readString();
                zzc.zzb(parcel);
                zzj(status14, string);
                return true;
            case 19:
                Status status15 = (Status) zzc.zza(parcel, Status.CREATOR);
                String string2 = parcel.readString();
                zzc.zzb(parcel);
                zzh(status15, string2);
                return true;
            case 20:
                Status status16 = (Status) zzc.zza(parcel, Status.CREATOR);
                TokenStatus tokenStatus = (TokenStatus) zzc.zza(parcel, TokenStatus.CREATOR);
                zzc.zzb(parcel);
                zzS(status16, tokenStatus);
                return true;
            case 21:
                Status status17 = (Status) zzc.zza(parcel, Status.CREATOR);
                boolean zZze3 = zzc.zze(parcel);
                zzc.zzb(parcel);
                zzo(status17, zZze3);
                return true;
            case 22:
                Status status18 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzw(status18);
                return true;
            case 23:
                Status status19 = (Status) zzc.zza(parcel, Status.CREATOR);
                String string3 = parcel.readString();
                zzc.zzb(parcel);
                zzO(status19, string3);
                return true;
            case 24:
                Status status20 = (Status) zzc.zza(parcel, Status.CREATOR);
                String string4 = parcel.readString();
                zzc.zzb(parcel);
                zzq(status20, string4);
                return true;
            case 25:
                Status status21 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzp(status21);
                return true;
            case 27:
                Status status22 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzad zzadVar = (com.google.android.gms.tapandpay.firstparty.zzad) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzad.CREATOR);
                zzc.zzb(parcel);
                zzM(status22, zzadVar);
                return true;
            case 28:
                Status status23 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzz zzzVar = (com.google.android.gms.tapandpay.firstparty.zzz) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzz.CREATOR);
                zzc.zzb(parcel);
                zzB(status23, zzzVar);
                return true;
            case 29:
                Status status24 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzC(status24);
                return true;
            case 30:
                Status status25 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzr zzrVar = (com.google.android.gms.tapandpay.firstparty.zzr) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzr.CREATOR);
                zzc.zzb(parcel);
                zzk(status25, zzrVar);
                return true;
            case 31:
                Status status26 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzn zznVar = (com.google.android.gms.tapandpay.firstparty.zzn) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzn.CREATOR);
                zzc.zzb(parcel);
                zzg(status26, zznVar);
                return true;
            case 35:
                Status status27 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzab zzabVar = (com.google.android.gms.tapandpay.firstparty.zzab) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzab.CREATOR);
                zzc.zzb(parcel);
                zzL(status27, zzabVar);
                return true;
            case 38:
                Status status28 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzN(status28);
                return true;
            case 39:
                Status status29 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzv zzvVar = (com.google.android.gms.tapandpay.firstparty.zzv) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzv.CREATOR);
                zzc.zzb(parcel);
                zzr(status29, zzvVar);
                return true;
            case 40:
                Status status30 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzs(status30);
                return true;
            case 41:
                Status status31 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzap zzapVar = (com.google.android.gms.tapandpay.firstparty.zzap) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzap.CREATOR);
                zzc.zzb(parcel);
                zzK(status31, zzapVar);
                return true;
            case 42:
                Status status32 = (Status) zzc.zza(parcel, Status.CREATOR);
                GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) zzc.zza(parcel, GetGlobalActionCardsResponse.CREATOR);
                zzc.zzb(parcel);
                zzt(status32, getGlobalActionCardsResponse);
                return true;
            case 43:
                Status status33 = (Status) zzc.zza(parcel, Status.CREATOR);
                String string5 = parcel.readString();
                zzc.zzb(parcel);
                zzz(status33, string5);
                return true;
            case 44:
                Status status34 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzD(status34);
                return true;
            case 45:
                Status status35 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzE(status35);
                return true;
            case 46:
                Status status36 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzx zzxVar = (com.google.android.gms.tapandpay.firstparty.zzx) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzx.CREATOR);
                zzc.zzb(parcel);
                zzy(status36, zzxVar);
                return true;
            case 47:
                Status status37 = (Status) zzc.zza(parcel, Status.CREATOR);
                QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) zzc.zza(parcel, QuickAccessWalletConfig.CREATOR);
                zzc.zzb(parcel);
                zzH(status37, quickAccessWalletConfig);
                return true;
            case 48:
                Status status38 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzt zztVar = (com.google.android.gms.tapandpay.firstparty.zzt) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzt.CREATOR);
                zzc.zzb(parcel);
                zzm(status38, zztVar);
                return true;
            case 49:
                Status status39 = (Status) zzc.zza(parcel, Status.CREATOR);
                boolean zZze4 = zzc.zze(parcel);
                zzc.zzb(parcel);
                zzx(status39, zZze4);
                return true;
            case 50:
                Status status40 = (Status) zzc.zza(parcel, Status.CREATOR);
                TokenInfo[] tokenInfoArr = (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR);
                zzc.zzb(parcel);
                zzA(status40, tokenInfoArr);
                return true;
            case 51:
                Status status41 = (Status) zzc.zza(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzg zzgVar = (com.google.android.gms.tapandpay.firstparty.zzg) zzc.zza(parcel, com.google.android.gms.tapandpay.firstparty.zzg.CREATOR);
                zzc.zzb(parcel);
                zzl(status41, zzgVar);
                return true;
            case 52:
                Status status42 = (Status) zzc.zza(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzF(status42, bArrCreateByteArray);
                return true;
            case 53:
                Status status43 = (Status) zzc.zza(parcel, Status.CREATOR);
                PushProvisionSessionContext pushProvisionSessionContext = (PushProvisionSessionContext) zzc.zza(parcel, PushProvisionSessionContext.CREATOR);
                zzc.zzb(parcel);
                zzG(status43, pushProvisionSessionContext);
                return true;
        }
    }
}
