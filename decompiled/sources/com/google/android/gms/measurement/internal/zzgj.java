package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgj extends zzdw {
    private final zzkp zza;
    private Boolean zzb;
    private String zzc;

    public zzgj(zzkp zzkpVar, String str) {
        Preconditions.checkNotNull(zzkpVar);
        this.zza = zzkpVar;
        this.zzc = null;
    }

    private final void zzA(zzau zzauVar, zzp zzpVar) {
        this.zza.zzA();
        this.zza.zzD(zzauVar, zzpVar);
    }

    @BinderThread
    private final void zzy(zzp zzpVar, boolean z10) {
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzz(zzpVar.zza, false);
        this.zza.zzv().zzW(zzpVar.zzb, zzpVar.zzq);
    }

    @BinderThread
    private final void zzz(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzay().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.zzb == null) {
                    this.zzb = Boolean.valueOf("com.google.android.gms".equals(this.zzc) || UidVerifier.isGooglePlayServicesUid(this.zza.zzau(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.zza.zzau()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e5) {
                this.zza.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeh.zzn(str));
                throw e5;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzau(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @VisibleForTesting
    public final zzau zzb(zzau zzauVar, zzp zzpVar) {
        zzas zzasVar;
        if ("_cmp".equals(zzauVar.zza) && (zzasVar = zzauVar.zzb) != null && zzasVar.zza() != 0) {
            String strZzg = zzauVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(strZzg) || "referrer API".equals(strZzg)) {
                this.zza.zzay().zzi().zzb("Event has been filtered ", zzauVar.toString());
                return new zzau("_cmpx", zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
            }
        }
        return zzauVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final String zzd(zzp zzpVar) {
        zzy(zzpVar, false);
        return this.zza.zzx(zzpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zze(zzp zzpVar, boolean z10) {
        zzy(zzpVar, false);
        String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzgg(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (z10 || !zzkw.zzag(zzkuVar.zzc)) {
                    arrayList.add(new zzks(zzkuVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e5) {
            e = e5;
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzeh.zzn(zzpVar.zza), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzeh.zzn(zzpVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzf(String str, String str2, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaz().zzh(new zzfx(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e5) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties", e5);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaz().zzh(new zzfy(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e5) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties as", e5);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzfv(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (z10 || !zzkw.zzag(zzkuVar.zzc)) {
                    arrayList.add(new zzks(zzkuVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e5) {
            e = e5;
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzeh.zzn(zzpVar.zza), e);
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzeh.zzn(zzpVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzi(String str, String str2, String str3, boolean z10) {
        zzz(str, true);
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzfw(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (z10 || !zzkw.zzag(zzkuVar.zzc)) {
                    arrayList.add(new zzks(zzkuVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e5) {
            e = e5;
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzeh.zzn(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzeh.zzn(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzj(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzgh(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzk(zzau zzauVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzauVar);
        zzy(zzpVar, false);
        zzx(new zzgc(this, zzauVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzl(zzau zzauVar, String str, String str2) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgd(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzm(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzz(zzpVar.zza, false);
        zzx(new zzfz(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        zzy(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.zza = zzpVar.zza;
        zzx(new zzft(this, zzabVar2, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzo(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        Preconditions.checkNotEmpty(zzabVar.zza);
        zzz(zzabVar.zza, true);
        zzx(new zzfu(this, new zzab(zzabVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzp(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        Preconditions.checkNotNull(zzpVar.zzv);
        zzgb zzgbVar = new zzgb(this, zzpVar);
        Preconditions.checkNotNull(zzgbVar);
        if (this.zza.zzaz().zzs()) {
            zzgbVar.run();
        } else {
            this.zza.zzaz().zzq(zzgbVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzq(long j10, String str, String str2, String str3) {
        zzx(new zzgi(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzr(final Bundle bundle, zzp zzpVar) {
        zzy(zzpVar, false);
        final String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzs(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzga(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzt(zzks zzksVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzksVar);
        zzy(zzpVar, false);
        zzx(new zzgf(this, zzksVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final byte[] zzu(zzau zzauVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzauVar);
        zzz(str, true);
        this.zza.zzay().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzauVar.zza));
        long jNanoTime = this.zza.zzav().nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) this.zza.zzaz().zzi(new zzge(this, zzauVar, str)).get();
            if (bArr == null) {
                this.zza.zzay().zzd().zzb("Log and bundle returned null. appId", zzeh.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzauVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzav().nanoTime() / AnimationKt.MillisToNanos) - jNanoTime));
            return bArr;
        } catch (InterruptedException e5) {
            e = e5;
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeh.zzn(str), this.zza.zzj().zzd(zzauVar.zza), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeh.zzn(str), this.zza.zzj().zzd(zzauVar.zza), e);
            return null;
        }
    }

    public final void zzv(zzau zzauVar, zzp zzpVar) {
        if (!this.zza.zzo().zzl(zzpVar.zza)) {
            zzA(zzauVar, zzpVar);
            return;
        }
        this.zza.zzay().zzj().zzb("EES config found for", zzpVar.zza);
        zzfi zzfiVarZzo = this.zza.zzo();
        String str = zzpVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzfiVarZzo.zzc.get(str);
        if (zzcVar == null) {
            this.zza.zzay().zzj().zzb("EES not loaded for", zzpVar.zza);
            zzA(zzauVar, zzpVar);
            return;
        }
        try {
            Map mapZzs = this.zza.zzu().zzs(zzauVar.zzb.zzc(), true);
            String strZza = zzgo.zza(zzauVar.zza);
            if (strZza == null) {
                strZza = zzauVar.zza;
            }
            if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(strZza, zzauVar.zzd, mapZzs))) {
                if (zzcVar.zzg()) {
                    this.zza.zzay().zzj().zzb("EES edited event", zzauVar.zza);
                    zzA(this.zza.zzu().zzi(zzcVar.zza().zzb()), zzpVar);
                } else {
                    zzA(zzauVar, zzpVar);
                }
                if (zzcVar.zzf()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                        this.zza.zzay().zzj().zzb("EES logging created event", zzaaVar.zzd());
                        zzA(this.zza.zzu().zzi(zzaaVar), zzpVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzay().zzd().zzc("EES error. appId, eventName", zzpVar.zzb, zzauVar.zza);
        }
        this.zza.zzay().zzj().zzb("EES was not applied to event", zzauVar.zza);
        zzA(zzauVar, zzpVar);
    }

    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzak zzakVarZzi = this.zza.zzi();
        zzakVarZzi.zzg();
        zzakVarZzi.zzW();
        byte[] bArrZzbq = zzakVarZzi.zzf.zzu().zzj(new zzap(zzakVarZzi.zzs, "", str, "dep", 0L, 0L, bundle)).zzbq();
        zzakVarZzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzakVarZzi.zzs.zzj().zzd(str), Integer.valueOf(bArrZzbq.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzbq);
        try {
            if (zzakVarZzi.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzakVarZzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e5) {
            zzakVarZzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzeh.zzn(str), e5);
        }
    }

    @VisibleForTesting
    public final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaz().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaz().zzp(runnable);
        }
    }
}
