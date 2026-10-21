package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzmt;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjm extends zzkf {
    public final zzes zza;
    public final zzes zzb;
    public final zzes zzc;
    public final zzes zzd;
    public final zzes zze;
    private final Map zzg;
    private String zzh;
    private boolean zzi;
    private long zzj;

    public zzjm(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzg = new HashMap();
        zzew zzewVarZzm = this.zzs.zzm();
        zzewVarZzm.getClass();
        this.zza = new zzes(zzewVarZzm, "last_delete_stale", 0L);
        zzew zzewVarZzm2 = this.zzs.zzm();
        zzewVarZzm2.getClass();
        this.zzb = new zzes(zzewVarZzm2, "backoff", 0L);
        zzew zzewVarZzm3 = this.zzs.zzm();
        zzewVarZzm3.getClass();
        this.zzc = new zzes(zzewVarZzm3, "last_upload", 0L);
        zzew zzewVarZzm4 = this.zzs.zzm();
        zzewVarZzm4.getClass();
        this.zzd = new zzes(zzewVarZzm4, "last_upload_attempt", 0L);
        zzew zzewVarZzm5 = this.zzs.zzm();
        zzewVarZzm5.getClass();
        this.zze = new zzes(zzewVarZzm5, "midnight_offset", 0L);
    }

    @WorkerThread
    @Deprecated
    public final Pair zza(String str) {
        zzjl zzjlVar;
        zzg();
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        zzmt.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzar)) {
            zzjl zzjlVar2 = (zzjl) this.zzg.get(str);
            if (zzjlVar2 != null && jElapsedRealtime < zzjlVar2.zzc) {
                return new Pair(zzjlVar2.zza, Boolean.valueOf(zzjlVar2.zzb));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long jZzi = this.zzs.zzf().zzi(str, zzdu.zza) + jElapsedRealtime;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
                if (advertisingIdInfo == null) {
                    return new Pair("", Boolean.FALSE);
                }
                String id = advertisingIdInfo.getId();
                zzjlVar = id != null ? new zzjl(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi) : new zzjl("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi);
                this.zzg.put(str, zzjlVar);
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(zzjlVar.zza, Boolean.valueOf(zzjlVar.zzb));
            } catch (Exception e5) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e5);
                zzjlVar = new zzjl("", false, jZzi);
            }
        } else {
            String str2 = this.zzh;
            if (str2 != null && jElapsedRealtime < this.zzj) {
                return new Pair(str2, Boolean.valueOf(this.zzi));
            }
            this.zzj = this.zzs.zzf().zzi(str, zzdu.zza) + jElapsedRealtime;
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
                if (advertisingIdInfo2 == null) {
                    return new Pair("", Boolean.FALSE);
                }
                this.zzh = "";
                String id2 = advertisingIdInfo2.getId();
                if (id2 != null) {
                    this.zzh = id2;
                }
                this.zzi = advertisingIdInfo2.isLimitAdTrackingEnabled();
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(this.zzh, Boolean.valueOf(this.zzi));
            } catch (Exception e7) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e7);
                this.zzh = "";
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final Pair zzd(String str, zzah zzahVar) {
        return zzahVar.zzi(zzag.AD_STORAGE) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest messageDigestZzE = zzkw.zzE();
        if (messageDigestZzE == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZzE.digest(str2.getBytes())));
    }
}
