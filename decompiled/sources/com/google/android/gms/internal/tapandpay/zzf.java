package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import android.os.IInterface;
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
public interface zzf extends IInterface {
    void zzA(Status status, TokenInfo[] tokenInfoArr) throws RemoteException;

    void zzB(Status status, com.google.android.gms.tapandpay.firstparty.zzz zzzVar) throws RemoteException;

    void zzC(Status status) throws RemoteException;

    void zzD(Status status) throws RemoteException;

    void zzE(Status status) throws RemoteException;

    void zzF(Status status, byte[] bArr) throws RemoteException;

    void zzG(Status status, PushProvisionSessionContext pushProvisionSessionContext) throws RemoteException;

    void zzH(Status status, QuickAccessWalletConfig quickAccessWalletConfig) throws RemoteException;

    void zzI(Status status, boolean z10) throws RemoteException;

    void zzJ(Status status) throws RemoteException;

    void zzK(Status status, com.google.android.gms.tapandpay.firstparty.zzap zzapVar) throws RemoteException;

    void zzL(Status status, com.google.android.gms.tapandpay.firstparty.zzab zzabVar) throws RemoteException;

    void zzM(Status status, com.google.android.gms.tapandpay.firstparty.zzad zzadVar) throws RemoteException;

    void zzN(Status status) throws RemoteException;

    void zzO(Status status, String str) throws RemoteException;

    void zzP(Status status) throws RemoteException;

    void zzQ(Status status) throws RemoteException;

    void zzR(Status status) throws RemoteException;

    void zzS(Status status, TokenStatus tokenStatus) throws RemoteException;

    void zzb() throws RemoteException;

    void zzc(Status status) throws RemoteException;

    void zzd(Status status, com.google.android.gms.tapandpay.firstparty.zzj zzjVar) throws RemoteException;

    void zze(Status status) throws RemoteException;

    void zzf(Status status, com.google.android.gms.tapandpay.firstparty.zzl zzlVar) throws RemoteException;

    void zzg(Status status, com.google.android.gms.tapandpay.firstparty.zzn zznVar) throws RemoteException;

    void zzh(Status status, String str) throws RemoteException;

    void zzi(Status status, com.google.android.gms.tapandpay.firstparty.zzp zzpVar) throws RemoteException;

    void zzj(Status status, String str) throws RemoteException;

    void zzk(Status status, com.google.android.gms.tapandpay.firstparty.zzr zzrVar) throws RemoteException;

    void zzl(Status status, com.google.android.gms.tapandpay.firstparty.zzg zzgVar) throws RemoteException;

    void zzm(Status status, com.google.android.gms.tapandpay.firstparty.zzt zztVar) throws RemoteException;

    void zzn(Status status, boolean z10) throws RemoteException;

    void zzo(Status status, boolean z10) throws RemoteException;

    void zzp(Status status) throws RemoteException;

    void zzq(Status status, String str) throws RemoteException;

    void zzr(Status status, com.google.android.gms.tapandpay.firstparty.zzv zzvVar) throws RemoteException;

    void zzs(Status status) throws RemoteException;

    void zzt(Status status, GetGlobalActionCardsResponse getGlobalActionCardsResponse) throws RemoteException;

    void zzu(Status status, Bundle bundle) throws RemoteException;

    void zzv(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse) throws RemoteException;

    void zzw(Status status) throws RemoteException;

    void zzx(Status status, boolean z10) throws RemoteException;

    void zzy(Status status, com.google.android.gms.tapandpay.firstparty.zzx zzxVar) throws RemoteException;

    void zzz(Status status, String str) throws RemoteException;
}
