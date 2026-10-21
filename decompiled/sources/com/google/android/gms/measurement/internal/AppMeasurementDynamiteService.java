package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {

    @VisibleForTesting
    zzfr zza = null;

    @GuardedBy("listenerMap")
    private final Map zzb = new ArrayMap();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.zza.zzv().zzU(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzV(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        long jZzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzT(zzcfVar, jZzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzh(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzl(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String strZzc;
        zzb();
        zzhw zzhwVarZzq = this.zza.zzq();
        if (zzhwVarZzq.zzs.zzw() != null) {
            strZzc = zzhwVarZzq.zzs.zzw();
        } else {
            try {
                strZzc = zzic.zzc(zzhwVarZzq.zzs.zzau(), "google_app_id", zzhwVarZzq.zzs.zzz());
            } catch (IllegalStateException e5) {
                zzhwVarZzq.zzs.zzay().zzd().zzb("getGoogleAppId failed with exception", e5);
                strZzc = null;
            }
        }
        zzc(zzcfVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzS(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) throws RemoteException {
        zzb();
        if (i10 == 0) {
            this.zza.zzv().zzU(zzcfVar, this.zza.zzq().zzr());
            return;
        }
        if (i10 == 1) {
            this.zza.zzv().zzT(zzcfVar, this.zza.zzq().zzm().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.zza.zzv().zzS(zzcfVar, this.zza.zzq().zzl().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.zza.zzv().zzO(zzcfVar, this.zza.zzq().zzi().booleanValue());
                return;
            }
        }
        zzkw zzkwVarZzv = this.zza.zzv();
        double dDoubleValue = this.zza.zzq().zzj().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            zzkwVarZzv.zzs.zzay().zzk().zzb("Error returning double value to wrapper", e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzj(this, zzcfVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j10) throws RemoteException {
        zzfr zzfrVar = this.zza;
        if (zzfrVar == null) {
            this.zza = zzfr.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j10));
        } else {
            a.f(zzfrVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaz().zzp(new zzi(this, zzcfVar, new zzau(str2, new zzas(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i10, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.zza.zzay().zzt(i10, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j10) throws RemoteException {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        zzb();
        zzhv zzhvVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzhvVar != null) {
            this.zza.zzq().zzA();
            zzhvVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzA();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        zzb();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgs zzoVar;
        zzb();
        synchronized (this.zzb) {
            try {
                zzoVar = (zzgs) this.zzb.get(Integer.valueOf(zzciVar.zzd()));
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zzciVar);
                    this.zzb.put(Integer.valueOf(zzciVar.zzd()), zzoVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.zza.zzq().zzJ(zzoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzK(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) throws RemoteException {
        zzb();
        if (bundle == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzT(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j10) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        zzb();
        zzhw zzhwVarZzq = this.zza.zzq();
        zzhwVarZzq.zza();
        zzhwVarZzq.zzs.zzaz().zzp(new zzgy(zzhwVarZzq, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zzb();
        final zzhw zzhwVarZzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzhwVarZzq.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgw
            @Override // java.lang.Runnable
            public final void run() {
                zzhwVarZzq.zzC(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzb();
        zzn zznVar = new zzn(this, zzciVar);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzU(zznVar);
        } else {
            this.zza.zzaz().zzp(new zzk(this, zznVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzV(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        zzb();
        zzhw zzhwVarZzq = this.zza.zzq();
        zzhwVarZzq.zzs.zzaz().zzp(new zzha(zzhwVarZzq, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull String str, long j10) throws RemoteException {
        zzb();
        if (str == null || str.length() != 0) {
            this.zza.zzq().zzY(null, CustomCursor.ID, str, true, j10);
        } else {
            a.f(this.zza, "User ID must be non-empty");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z10, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzY(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgs zzoVar;
        zzb();
        synchronized (this.zzb) {
            zzoVar = (zzgs) this.zzb.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (zzoVar == null) {
            zzoVar = new zzo(this, zzciVar);
        }
        this.zza.zzq().zzaa(zzoVar);
    }
}
