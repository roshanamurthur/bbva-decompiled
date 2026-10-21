package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfi extends zzkf implements zzae {

    @VisibleForTesting
    final Map zza;

    @VisibleForTesting
    final Map zzb;

    @VisibleForTesting
    final LruCache zzc;
    final com.google.android.gms.internal.measurement.zzr zzd;
    private final Map zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;

    public zzfi(zzkp zzkpVar) {
        super(zzkpVar);
        this.zze = new ArrayMap();
        this.zza = new ArrayMap();
        this.zzb = new ArrayMap();
        this.zzg = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzc = new zzff(this, 20);
        this.zzd = new zzfg(this);
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfi zzfiVar, String str) throws Throwable {
        zzfiVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfiVar.zzl(str)) {
            return null;
        }
        if (!zzfiVar.zzg.containsKey(str) || zzfiVar.zzg.get(str) == null) {
            zzfiVar.zzt(str);
        } else {
            zzfiVar.zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfiVar.zzg.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfiVar.zzc.snapshot().get(str);
    }

    @WorkerThread
    private final com.google.android.gms.internal.measurement.zzfc zzr(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfb) zzkr.zzl(com.google.android.gms.internal.measurement.zzfc.zze(), bArr)).zzay();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfcVar.zzq() ? Long.valueOf(zzfcVar.zzc()) : null, zzfcVar.zzp() ? zzfcVar.zzh() : null);
            return zzfcVar;
        } catch (com.google.android.gms.internal.measurement.zzkh e5) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e5);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        } catch (RuntimeException e7) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e7);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
    }

    private final void zzs(String str, com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzfbVar != null) {
            for (int i10 = 0; i10 < zzfbVar.zza(); i10++) {
                com.google.android.gms.internal.measurement.zzez zzezVar = (com.google.android.gms.internal.measurement.zzez) zzfbVar.zzb(i10).zzbt();
                if (TextUtils.isEmpty(zzezVar.zzc())) {
                    a.f(this.zzs, "EventConfig contained null event name");
                } else {
                    String strZzc = zzezVar.zzc();
                    String strZzb = zzgo.zzb(zzezVar.zzc());
                    if (!TextUtils.isEmpty(strZzb)) {
                        zzezVar.zzb(strZzb);
                        zzfbVar.zzd(i10, zzezVar);
                    }
                    if (zzezVar.zzf() && zzezVar.zzd()) {
                        arrayMap.put(strZzc, Boolean.TRUE);
                    }
                    if (zzezVar.zzg() && zzezVar.zze()) {
                        arrayMap2.put(zzezVar.zzc(), Boolean.TRUE);
                    }
                    if (zzezVar.zzh()) {
                        if (zzezVar.zza() < 2 || zzezVar.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzezVar.zzc(), Integer.valueOf(zzezVar.zza()));
                        } else {
                            arrayMap3.put(zzezVar.zzc(), Integer.valueOf(zzezVar.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, arrayMap);
        this.zzb.put(str, arrayMap2);
        this.zzh.put(str, arrayMap3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    @WorkerThread
    private final void zzt(String str) throws Throwable {
        SQLiteException e5;
        Cursor cursorQuery;
        Pair pair;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzg.get(str) == null) {
            zzak zzakVarZzi = this.zzf.zzi();
            Preconditions.checkNotEmpty(str);
            zzakVarZzi.zzg();
            zzakVarZzi.zzW();
            Cursor cursor = null;
            try {
                cursorQuery = zzakVarZzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            if (cursorQuery.moveToNext()) {
                                zzakVarZzi.zzs.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeh.zzn(str));
                            }
                            if (blob != null) {
                                pair = new Pair(blob, string);
                                cursorQuery.close();
                            }
                            if (pair == null) {
                                this.zze.put(str, null);
                                this.zza.put(str, null);
                                this.zzb.put(str, null);
                                this.zzg.put(str, null);
                                this.zzi.put(str, null);
                                this.zzh.put(str, null);
                                return;
                            }
                            com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzr(str, (byte[]) pair.first).zzbt();
                            zzs(str, zzfbVar);
                            this.zze.put(str, zzv((com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay()));
                            this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
                            zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
                            this.zzi.put(str, (String) pair.second);
                        }
                    } catch (SQLiteException e7) {
                        e5 = e7;
                        zzakVarZzi.zzs.zzay().zzd().zzc("Error querying remote config. appId", zzeh.zzn(str), e5);
                        if (cursorQuery != null) {
                        }
                        pair = null;
                        if (pair == null) {
                            this.zze.put(str, null);
                            this.zza.put(str, null);
                            this.zzb.put(str, null);
                            this.zzg.put(str, null);
                            this.zzi.put(str, null);
                            this.zzh.put(str, null);
                            return;
                        }
                        com.google.android.gms.internal.measurement.zzfb zzfbVar2 = (com.google.android.gms.internal.measurement.zzfb) zzr(str, (byte[]) pair.first).zzbt();
                        zzs(str, zzfbVar2);
                        this.zze.put(str, zzv((com.google.android.gms.internal.measurement.zzfc) zzfbVar2.zzay()));
                        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar2.zzay());
                        zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar2.zzay());
                        this.zzi.put(str, (String) pair.second);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e10) {
                e5 = e10;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursorQuery.close();
            pair = null;
            if (pair == null) {
                this.zze.put(str, null);
                this.zza.put(str, null);
                this.zzb.put(str, null);
                this.zzg.put(str, null);
                this.zzi.put(str, null);
                this.zzh.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.zzfb zzfbVar3 = (com.google.android.gms.internal.measurement.zzfb) zzr(str, (byte[]) pair.first).zzbt();
            zzs(str, zzfbVar3);
            this.zze.put(str, zzv((com.google.android.gms.internal.measurement.zzfc) zzfbVar3.zzay()));
            this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar3.zzay());
            zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar3.zzay());
            this.zzi.put(str, (String) pair.second);
        }
    }

    @WorkerThread
    private final void zzu(final String str, com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        if (zzfcVar.zza() == 0) {
            this.zzc.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfcVar.zza()));
        com.google.android.gms.internal.measurement.zzgo zzgoVar = (com.google.android.gms.internal.measurement.zzgo) zzfcVar.zzj().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfh(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfi zzfiVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfi zzfiVar2 = zzfiVar;
                            String str3 = str2;
                            zzg zzgVarZzj = zzfiVar2.zzf.zzi().zzj(str3);
                            HashMap map = new HashMap();
                            map.put(k.a.f65035b, "android");
                            map.put("package_name", str3);
                            zzfiVar2.zzs.zzf().zzh();
                            map.put("gmp_version", 55005L);
                            if (zzgVarZzj != null) {
                                String strZzw = zzgVarZzj.zzw();
                                if (strZzw != null) {
                                    map.put(k.a.f65049q, strZzw);
                                }
                                map.put("app_version_int", Long.valueOf(zzgVarZzj.zzb()));
                                map.put("dynamite_version", Long.valueOf(zzgVarZzj.zzk()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.zzd);
                }
            });
            zzcVar.zzc(zzgoVar);
            this.zzc.put(str, zzcVar);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zza().zza()));
            Iterator it = zzgoVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzs.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgm) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzv(com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzfcVar != null) {
            for (com.google.android.gms.internal.measurement.zzfe zzfeVar : zzfcVar.zzk()) {
                arrayMap.put(zzfeVar.zzb(), zzfeVar.zzc());
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzae
    @WorkerThread
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        zzt(str);
        Map map = (Map) this.zze.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final int zzc(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        zzt(str);
        Map map = (Map) this.zzh.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzfc zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzt(str);
        return (com.google.android.gms.internal.measurement.zzfc) this.zzg.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzg();
        return (String) this.zzi.get(str);
    }

    @WorkerThread
    public final void zzi(String str) {
        zzg();
        this.zzi.put(str, null);
    }

    @WorkerThread
    public final void zzj(String str) {
        zzg();
        this.zzg.remove(str);
    }

    @WorkerThread
    public final boolean zzk(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfc zzfcVarZze = zze(str);
        if (zzfcVarZze == null) {
            return false;
        }
        return zzfcVarZze.zzo();
    }

    public final boolean zzl(String str) {
        com.google.android.gms.internal.measurement.zzfc zzfcVar;
        return (TextUtils.isEmpty(str) || (zzfcVar = (com.google.android.gms.internal.measurement.zzfc) this.zzg.get(str)) == null || zzfcVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean zzn(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzt(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean zzo(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzt(str);
        if (zzm(str) && zzkw.zzag(str2)) {
            return true;
        }
        if (zzp(str) && zzkw.zzah(str2)) {
            return true;
        }
        Map map = (Map) this.zza.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean zzq(String str, byte[] bArr, String str2) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzr(str, bArr).zzbt();
        if (zzfbVar == null) {
            return false;
        }
        zzs(str, zzfbVar);
        zzu(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        this.zzi.put(str, str2);
        this.zze.put(str, zzv((com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfbVar.zze()));
        try {
            zzfbVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay()).zzbq();
        } catch (RuntimeException e5) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(str), e5);
        }
        zzak zzakVarZzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzakVarZzi.zzg();
        zzakVarZzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (zzakVarZzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzakVarZzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e7) {
            zzakVarZzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(str), e7);
        }
        this.zzg.put(str, (com.google.android.gms.internal.measurement.zzfc) zzfbVar.zzay());
        return true;
    }
}
