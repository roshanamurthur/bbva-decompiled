package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.f;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public final class zzjk extends zzf {
    private final zzjj zza;
    private zzdx zzb;
    private volatile Boolean zzc;
    private final zzan zzd;
    private final zzkb zze;
    private final List zzf;
    private final zzan zzg;

    public zzjk(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzf = new ArrayList();
        this.zze = new zzkb(zzfrVar.zzav());
        this.zza = new zzjj(this);
        this.zzd = new zziu(this, zzfrVar);
        this.zzg = new zziw(this, zzfrVar);
    }

    @WorkerThread
    private final zzp zzO(boolean z10) {
        Pair pairZza;
        this.zzs.zzaw();
        zzdy zzdyVarZzh = this.zzs.zzh();
        String strC = null;
        if (z10) {
            zzeh zzehVarZzay = this.zzs.zzay();
            if (zzehVarZzay.zzs.zzm().zzb != null && (pairZza = zzehVarZzay.zzs.zzm().zzb.zza()) != null && pairZza != zzew.zza) {
                String strValueOf = String.valueOf(pairZza.second);
                String str = (String) pairZza.first;
                strC = f.c(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, str);
            }
        }
        return zzdyVarZzh.zzj(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e5) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e5);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzan zzanVar = this.zzd;
        this.zzs.zzf();
        zzanVar.zzd(((Long) zzdu.zzI.zza(null)).longValue());
    }

    @WorkerThread
    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjk zzjkVar, ComponentName componentName) {
        zzjkVar.zzg();
        if (zzjkVar.zzb != null) {
            zzjkVar.zzb = null;
            zzjkVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjkVar.zzg();
            zzjkVar.zzr();
        }
    }

    @WorkerThread
    public final void zzA(zzau zzauVar, String str) {
        Preconditions.checkNotNull(zzauVar);
        zzg();
        zza();
        zzS();
        zzR(new zziz(this, true, zzO(true), this.zzs.zzi().zzo(zzauVar), zzauVar, str));
    }

    @WorkerThread
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(12451000) == 0) {
            zzR(new zziv(this, zzauVar, str, zzcfVar));
        } else {
            a.f(this.zzs, "Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzR(zzcfVar, new byte[0]);
        }
    }

    @WorkerThread
    public final void zzC() {
        zzg();
        zza();
        zzp zzpVarZzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zzio(this, zzpVarZzO));
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzD(zzdx zzdxVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int size;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i10 = 100;
        int i11 = 0;
        while (i11 < 1001 && i10 == 100) {
            ArrayList arrayList = new ArrayList();
            List listZzi = this.zzs.zzi().zzi(100);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i12);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        zzdxVar.zzk((zzau) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e5) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e5);
                    }
                } else if (abstractSafeParcelable2 instanceof zzks) {
                    try {
                        zzdxVar.zzt((zzks) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e7) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e7);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        zzdxVar.zzn((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e10) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e10);
                    }
                } else {
                    bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i10 = size;
        }
    }

    @WorkerThread
    public final void zzE(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzja(this, true, zzO(true), this.zzs.zzi().zzn(zzabVar), new zzab(zzabVar), zzabVar));
    }

    @WorkerThread
    public final void zzF(boolean z10) {
        zzg();
        zza();
        if (z10) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zziy(this, zzO(false)));
        }
    }

    @WorkerThread
    public final void zzG(zzid zzidVar) {
        zzg();
        zza();
        zzR(new zzis(this, zzidVar));
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzit(this, zzO(false), bundle));
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zza();
        zzR(new zzix(this, zzO(true)));
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzJ(zzdx zzdxVar) {
        zzg();
        Preconditions.checkNotNull(zzdxVar);
        this.zzb = zzdxVar;
        zzQ();
        zzP();
    }

    @WorkerThread
    public final void zzK(zzks zzksVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzim(this, zzO(true), this.zzs.zzi().zzp(zzksVar), zzksVar));
    }

    @WorkerThread
    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    @WorkerThread
    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzdu.zzai.zza(null)).intValue();
    }

    @WorkerThread
    public final boolean zzN() {
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            zzew zzewVarZzm = this.zzs.zzm();
            zzewVarZzm.zzg();
            boolean z10 = false;
            Boolean boolValueOf = !zzewVarZzm.zza().contains("use_service") ? null : Boolean.valueOf(zzewVarZzm.zza().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.zzs.zzaw();
                if (this.zzs.zzh().zzh() == 1) {
                    z10 = true;
                } else {
                    androidx.activity.a.g(this.zzs, "Checking service availability");
                    int iZzo = this.zzs.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        androidx.activity.a.g(this.zzs, "Service available");
                    } else if (iZzo == 1) {
                        androidx.activity.a.g(this.zzs, "Service missing");
                    } else if (iZzo != 2) {
                        if (iZzo == 3) {
                            a.f(this.zzs, "Service disabled");
                        } else if (iZzo == 9) {
                            a.f(this.zzs, "Service invalid");
                        } else if (iZzo != 18) {
                            this.zzs.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                        } else {
                            a.f(this.zzs, "Service updating");
                        }
                        z11 = false;
                    } else {
                        this.zzs.zzay().zzc().zza("Service container out of date");
                        if (this.zzs.zzv().zzm() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && this.zzs.zzf().zzx()) {
                    bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    zzew zzewVarZzm2 = this.zzs.zzm();
                    zzewVarZzm2.zzg();
                    SharedPreferences.Editor editorEdit = zzewVarZzm2.zza().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.zzc = Boolean.valueOf(z11);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    @WorkerThread
    public final void zzq() {
        zzg();
        zza();
        zzp zzpVarZzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zzir(this, zzpVarZzO));
    }

    @WorkerThread
    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzs.zzf().zzx()) {
            return;
        }
        this.zzs.zzaw();
        List<ResolveInfo> listQueryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzaw();
        intent.setComponent(new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    @WorkerThread
    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    @WorkerThread
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zziq(this, zzO(false), zzcfVar));
    }

    @WorkerThread
    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzip(this, atomicReference, zzO(false)));
    }

    @WorkerThread
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjc(this, str, str2, zzO(false), zzcfVar));
    }

    @WorkerThread
    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjb(this, atomicReference, null, str2, str3, zzO(false)));
    }

    @WorkerThread
    public final void zzx(AtomicReference atomicReference, boolean z10) {
        zzg();
        zza();
        zzR(new zzin(this, atomicReference, zzO(false), z10));
    }

    @WorkerThread
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        zzg();
        zza();
        zzR(new zzil(this, str, str2, zzO(false), z10, zzcfVar));
    }

    @WorkerThread
    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, null, str2, str3, zzO(false), z10));
    }
}
