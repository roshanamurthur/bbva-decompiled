package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.f;
import androidx.room.util.CursorUtil;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.noknok.android.client.utils.UIConfigTags;
import com.nulabinc.zxcvbn.Guess;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzak extends zzkf {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {k.a.f65049q, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", UIConfigTags.TAG_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkb zzk;

    public zzak(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzk = new zzkb(this.zzs.zzav());
        this.zzs.zzf();
        this.zzj = new zzaj(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    @WorkerThread
    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @WorkerThread
    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e5) {
                this.zzs.zzay().zzd().zzc("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @WorkerThread
    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e5) {
                this.zzs.zzay().zzd().zzc("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    @WorkerThread
    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e5);
        }
    }

    @WorkerThread
    public final void zzB(String str, List list) {
        Iterator it;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.zzeg zzegVar;
        boolean z10;
        String str4 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i10 = 0;
        while (i10 < list.size()) {
            com.google.android.gms.internal.measurement.zzeg zzegVar2 = (com.google.android.gms.internal.measurement.zzeg) ((com.google.android.gms.internal.measurement.zzeh) list.get(i10)).zzbt();
            if (zzegVar2.zza() != 0) {
                zzegVar = zzegVar2;
                int i11 = 0;
                while (i11 < zzegVar.zza()) {
                    com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) zzegVar.zze(i11).zzbt();
                    com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) zzeiVar.clone();
                    String strZzb = zzgo.zzb(zzeiVar.zze());
                    if (strZzb != null) {
                        zzeiVar2.zzb(strZzb);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < zzeiVar.zza()) {
                        com.google.android.gms.internal.measurement.zzel zzelVarZzd = zzeiVar.zzd(i12);
                        com.google.android.gms.internal.measurement.zzei zzeiVar3 = zzeiVar;
                        String str5 = str4;
                        String strZzb2 = zzic.zzb(zzelVarZzd.zze(), zzgp.zza, zzgp.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) zzelVarZzd.zzbt();
                            zzekVar.zza(strZzb2);
                            zzeiVar2.zzc(i12, (com.google.android.gms.internal.measurement.zzel) zzekVar.zzay());
                            z10 = true;
                        }
                        i12++;
                        zzeiVar = zzeiVar3;
                        str4 = str5;
                    }
                    String str6 = str4;
                    if (z10) {
                        zzegVar.zzc(i11, zzeiVar2);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzay());
                        zzegVar = zzegVar2;
                    }
                    i11++;
                    str4 = str6;
                }
                str3 = str4;
            } else {
                str3 = str4;
                zzegVar = zzegVar2;
            }
            if (zzegVar.zzb() != 0) {
                for (int i13 = 0; i13 < zzegVar.zzb(); i13++) {
                    com.google.android.gms.internal.measurement.zzes zzesVarZzf = zzegVar.zzf(i13);
                    String strZzb3 = zzic.zzb(zzesVarZzf.zze(), zzgq.zza, zzgq.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzer zzerVar = (com.google.android.gms.internal.measurement.zzer) zzesVarZzf.zzbt();
                        zzerVar.zza(strZzb3);
                        zzegVar.zzd(i13, zzerVar);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzay());
                        zzegVar = zzegVar2;
                    }
                }
            }
            i10++;
            str4 = str3;
        }
        String str7 = str4;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZzh2 = zzh();
            sQLiteDatabaseZzh2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZzh2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) it2.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzehVar);
                if (zzehVar.zzk()) {
                    int iZza = zzehVar.zza();
                    Iterator it3 = zzehVar.zzg().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzej) it3.next()).zzp()) {
                                this.zzs.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator it4 = zzehVar.zzh().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = zzehVar.zzg().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            str2 = str;
                                            Iterator it6 = zzehVar.zzh().iterator();
                                            while (it6.hasNext()) {
                                                com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) it6.next();
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(zzesVar);
                                                if (TextUtils.isEmpty(zzesVar.zze())) {
                                                    this.zzs.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzeh.zzn(str), Integer.valueOf(iZza), String.valueOf(zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbq = zzesVar.zzbq();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str2);
                                                    contentValues.put("audience_id", Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null);
                                                    Iterator it7 = it6;
                                                    contentValues.put("property_name", zzesVar.zze());
                                                    contentValues.put("session_scoped", zzesVar.zzk() ? Boolean.valueOf(zzesVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzbq);
                                                    try {
                                                        if (zzh().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", zzeh.zzn(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (SQLiteException e5) {
                                                        this.zzs.zzay().zzd().zzc("Error storing property filter. appId", zzeh.zzn(str), e5);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) it5.next();
                                        zzW();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        Preconditions.checkNotNull(zzejVar);
                                        if (!TextUtils.isEmpty(zzejVar.zzg())) {
                                            byte[] bArrZzbq2 = zzejVar.zzbq();
                                            ContentValues contentValues2 = new ContentValues();
                                            it = it2;
                                            str2 = str;
                                            contentValues2.put("app_id", str2);
                                            contentValues2.put("audience_id", Integer.valueOf(iZza));
                                            contentValues2.put("filter_id", zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null);
                                            contentValues2.put("event_name", zzejVar.zzg());
                                            contentValues2.put("session_scoped", zzejVar.zzq() ? Boolean.valueOf(zzejVar.zzn()) : null);
                                            contentValues2.put("data", bArrZzbq2);
                                            try {
                                                if (zzh().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                    this.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", zzeh.zzn(str));
                                                }
                                                it2 = it;
                                            } catch (SQLiteException e7) {
                                                this.zzs.zzay().zzd().zzc("Error storing event filter. appId", zzeh.zzn(str), e7);
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                SQLiteDatabase sQLiteDatabaseZzh3 = zzh();
                                                String str8 = str7;
                                                sQLiteDatabaseZzh3.delete("property_filters", str8, new String[]{str2, String.valueOf(iZza)});
                                                sQLiteDatabaseZzh3.delete("event_filters", str8, new String[]{str2, String.valueOf(iZza)});
                                                str7 = str8;
                                                it2 = it;
                                                break;
                                            }
                                        } else {
                                            this.zzs.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzeh.zzn(str), Integer.valueOf(iZza), String.valueOf(zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null));
                                            it = it2;
                                            str2 = str;
                                        }
                                        zzW();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseZzh4 = zzh();
                                        String str9 = str7;
                                        sQLiteDatabaseZzh4.delete("property_filters", str9, new String[]{str2, String.valueOf(iZza)});
                                        sQLiteDatabaseZzh4.delete("event_filters", str9, new String[]{str2, String.valueOf(iZza)});
                                        str7 = str9;
                                        break;
                                    }
                                    it2 = it;
                                    break;
                                }
                                if (!((com.google.android.gms.internal.measurement.zzes) it4.next()).zzj()) {
                                    this.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(str), Integer.valueOf(iZza));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzs.zzay().zzk().zzb("Audience with no ID. appId", zzeh.zzn(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar2 = (com.google.android.gms.internal.measurement.zzeh) it8.next();
                arrayList.add(zzehVar2.zzk() ? Integer.valueOf(zzehVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase sQLiteDatabaseZzh5 = zzh();
            try {
                long jZzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(Guess.REFERENCE_YEAR, this.zzs.zzf().zze(str, zzdu.zzE)));
                if (jZzZ > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZzh5.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str), e10);
            }
            sQLiteDatabaseZzh.setTransactionSuccessful();
            sQLiteDatabaseZzh.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabaseZzh.endTransaction();
            throw th2;
        }
    }

    @WorkerThread
    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    @WorkerThread
    public final void zzD(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzg();
        zzW();
        String strZzt = zzgVar.zzt();
        Preconditions.checkNotNull(strZzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzt);
        contentValues.put("app_instance_id", zzgVar.zzu());
        contentValues.put("gmp_app_id", zzgVar.zzy());
        contentValues.put("resettable_device_id_hash", zzgVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzn()));
        contentValues.put(k.a.f65049q, zzgVar.zzw());
        contentValues.put("app_store", zzgVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzah()));
        contentValues.put(UIConfigTags.TAG_DAY, Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzb()));
        contentValues.put("firebase_instance_id", zzgVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("health_monitor_sample", zzgVar.zzz());
        contentValues.put("android_id", Long.valueOf(zzgVar.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzag()));
        contentValues.put("admob_app_id", zzgVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzk()));
        List listZzB = zzgVar.zzB();
        if (listZzB != null) {
            if (listZzB.isEmpty()) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", strZzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzB));
            }
        }
        zzno.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzaw) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh.update("apps", contentValues, "app_id = ?", new String[]{strZzt}) == 0 && sQLiteDatabaseZzh.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeh.zzn(strZzt));
            }
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzeh.zzn(strZzt), e5);
        }
    }

    @WorkerThread
    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put("name", zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeh.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzeh.zzn(zzaqVar.zza), e5);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzI() {
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        return contextZzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l6, long j10, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfoVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l6);
        byte[] bArrZzbq = zzfoVar.zzbq();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(bArrZzbq.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrZzbq);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeh.zzn(str));
            return false;
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzeh.zzn(str), e5);
            return false;
        }
    }

    @WorkerThread
    public final boolean zzK(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zzW();
        String str = zzabVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzabVar.zzc.zzb) == null) {
            long jZzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (jZzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzabVar.zzb);
        contentValues.put("name", zzabVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzabVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzabVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzabVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzabVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzabVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzabVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzabVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzabVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzabVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzabVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeh.zzn(str));
            return true;
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzeh.zzn(str), e5);
            return true;
        }
    }

    @WorkerThread
    public final boolean zzL(zzku zzkuVar) {
        Preconditions.checkNotNull(zzkuVar);
        zzg();
        zzW();
        if (zzp(zzkuVar.zza, zzkuVar.zzc) == null) {
            if (zzkw.zzah(zzkuVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkuVar.zza}) >= this.zzs.zzf().zzf(zzkuVar.zza, zzdu.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzkuVar.zzc)) {
                long jZzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkuVar.zza, zzkuVar.zzb});
                this.zzs.zzf();
                if (jZzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkuVar.zza);
        contentValues.put("origin", zzkuVar.zzb);
        contentValues.put("name", zzkuVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzkuVar.zzd));
        zzV(contentValues, "value", zzkuVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeh.zzn(zzkuVar.zza));
            return true;
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzeh.zzn(zzkuVar.zza), e5);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0082: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:131), block:B:27:0x0082 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void zzU(String str, long j10, long j11, zzko zzkoVar) throws Throwable {
        ?? IsEmpty;
        ?? r4;
        String str2;
        Cursor cursorRawQuery;
        String string;
        String str3;
        String[] strArr;
        Preconditions.checkNotNull(zzkoVar);
        zzg();
        zzW();
        ?? r3 = 0;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        String[] strArr2 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str2 = j11 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str2);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery(sb2.toString(), strArr2);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null};
                        str2 = j11 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str2.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str2);
                        sb3.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery(sb3.toString(), strArr3);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor = cursorRawQuery;
                    String str4 = string;
                    try {
                        String str5 = str4;
                        Cursor cursorQuery = sQLiteDatabaseZzh.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeh.zzn(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzfy zzfyVar = (com.google.android.gms.internal.measurement.zzfy) ((com.google.android.gms.internal.measurement.zzfx) zzkr.zzl(com.google.android.gms.internal.measurement.zzfy.zzu(), cursorQuery.getBlob(0))).zzay();
                                    if (cursorQuery.moveToNext()) {
                                        this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeh.zzn(string2));
                                    }
                                    cursorQuery.close();
                                    Preconditions.checkNotNull(zzfyVar);
                                    zzkoVar.zza = zzfyVar;
                                    if (j11 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str5, String.valueOf(j11)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str5};
                                    }
                                    Cursor cursorQuery2 = sQLiteDatabaseZzh.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeh.zzn(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = cursorQuery2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) zzkr.zzl(com.google.android.gms.internal.measurement.zzfo.zze(), cursorQuery2.getBlob(3));
                                            zzfnVar.zzi(cursorQuery2.getString(1));
                                            zzfnVar.zzm(cursorQuery2.getLong(2));
                                            if (!zzkoVar.zza(j12, (com.google.android.gms.internal.measurement.zzfo) zzfnVar.zzay())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e5) {
                                            this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeh.zzn(string2), e5);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (IOException e7) {
                                    this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeh.zzn(string2), e7);
                                    cursorQuery.close();
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                IsEmpty = str5;
                                this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeh.zzn(string2), e);
                                if (IsEmpty != 0) {
                                    IsEmpty.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = str5;
                                if (r3 != 0) {
                                    r3.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            str5 = cursorQuery;
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = cursorQuery;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        IsEmpty = cursor;
                    } catch (Throwable th4) {
                        th = th4;
                        r3 = cursor;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                }
            } catch (Throwable th5) {
                th = th5;
                r3 = r4;
            }
        } catch (SQLiteException e14) {
            e = e14;
            IsEmpty = 0;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @WorkerThread
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e5);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final long zzc(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                long jZzaa = zzaa(sb2.toString(), new String[]{str}, -1L);
                if (jZzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZzh.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeh.zzn(str), "first_open_count");
                        return -1L;
                    }
                    jZzaa = 0;
                    this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(str), "first_open_count", e);
                    return j10;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jZzaa));
                    if (sQLiteDatabaseZzh.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeh.zzn(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    return jZzaa;
                } catch (SQLiteException e5) {
                    e = e5;
                    j10 = jZzaa;
                }
            } catch (SQLiteException e7) {
                e = e7;
            }
        } finally {
            sQLiteDatabaseZzh.endTransaction();
        }
    }

    @WorkerThread
    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e5) {
            this.zzs.zzay().zzk().zzb("Error opening database", e5);
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:38:0x00bf */
    public final Bundle zzi(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzs.zzay().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzfo zzfoVar = (com.google.android.gms.internal.measurement.zzfo) ((com.google.android.gms.internal.measurement.zzfn) zzkr.zzl(com.google.android.gms.internal.measurement.zzfo.zze(), cursorRawQuery.getBlob(0))).zzay();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfs> listZzi = zzfoVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : listZzi) {
                            String strZzg = zzfsVar.zzg();
                            if (zzfsVar.zzu()) {
                                bundle.putDouble(strZzg, zzfsVar.zza());
                            } else if (zzfsVar.zzv()) {
                                bundle.putFloat(strZzg, zzfsVar.zzb());
                            } else if (zzfsVar.zzy()) {
                                bundle.putString(strZzg, zzfsVar.zzh());
                            } else if (zzfsVar.zzw()) {
                                bundle.putLong(strZzg, zzfsVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e5) {
                        this.zzs.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeh.zzn(str), e5);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    this.zzs.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0271  */
    @WorkerThread
    public final zzg zzj(String str) {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor = null;
        try {
            cursorQuery = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", k.a.f65049q, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", UIConfigTags.TAG_DAY, "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        zzg zzgVar = new zzg(this.zzf.zzq(), str);
                        zzgVar.zzH(cursorQuery.getString(0));
                        zzgVar.zzW(cursorQuery.getString(1));
                        zzgVar.zzae(cursorQuery.getString(2));
                        zzgVar.zzaa(cursorQuery.getLong(3));
                        zzgVar.zzab(cursorQuery.getLong(4));
                        zzgVar.zzZ(cursorQuery.getLong(5));
                        zzgVar.zzJ(cursorQuery.getString(6));
                        zzgVar.zzI(cursorQuery.getString(7));
                        zzgVar.zzX(cursorQuery.getLong(8));
                        zzgVar.zzS(cursorQuery.getLong(9));
                        zzgVar.zzac(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzgVar.zzR(cursorQuery.getLong(11));
                        zzgVar.zzP(cursorQuery.getLong(12));
                        zzgVar.zzO(cursorQuery.getLong(13));
                        zzgVar.zzM(cursorQuery.getLong(14));
                        zzgVar.zzL(cursorQuery.getLong(15));
                        zzgVar.zzU(cursorQuery.getLong(16));
                        zzgVar.zzK(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzgVar.zzV(cursorQuery.getString(18));
                        zzgVar.zzN(cursorQuery.getLong(19));
                        zzgVar.zzQ(cursorQuery.getLong(20));
                        zzgVar.zzY(cursorQuery.getString(21));
                        if (!this.zzs.zzf().zzs(null, zzdu.zzah)) {
                            zzgVar.zzG(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                        }
                        zzgVar.zzF(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        zzgVar.zzE(cursorQuery.getString(24));
                        zzgVar.zzT(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzgVar.zzaf(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        zzgVar.zzC();
                        if (cursorQuery.moveToNext()) {
                            this.zzs.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeh.zzn(str));
                        }
                        cursorQuery.close();
                        return zzgVar;
                    } catch (SQLiteException e5) {
                        e = e5;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
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
            e = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        this.zzs.zzay().zzd().zzc("Error querying app. appId", zzeh.zzn(str), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0159  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x012e: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:303), block:B:25:0x012e */
    @WorkerThread
    public final zzab zzk(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objZzq = zzq(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    zzkr zzkrVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    zzab zzabVar = new zzab(str, str3, new zzks(str2, cursorQuery.getLong(8), objZzq, str3), cursorQuery.getLong(6), z10, string2, (zzau) zzkrVarZzu.zzh(blob, creator), j10, (zzau) this.zzf.zzu().zzh(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzau) this.zzf.zzu().zzh(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeh.zzn(str), this.zzs.zzj().zzf(str2));
                    }
                    cursorQuery.close();
                    return zzabVar;
                } catch (SQLiteException e5) {
                    e = e5;
                    this.zzs.zzay().zzd().zzd("Error querying conditional property", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzai zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    @WorkerThread
    public final zzai zzm(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) throws Throwable {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            Cursor cursorQuery = sQLiteDatabaseZzh.query("apps", new String[]{UIConfigTags.TAG_DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeh.zzn(str));
                    cursorQuery.close();
                    return zzaiVar;
                }
                if (cursorQuery.getLong(0) == j10) {
                    zzaiVar.zzb = cursorQuery.getLong(1);
                    zzaiVar.zza = cursorQuery.getLong(2);
                    zzaiVar.zzc = cursorQuery.getLong(3);
                    zzaiVar.zzd = cursorQuery.getLong(4);
                    zzaiVar.zze = cursorQuery.getLong(5);
                }
                if (z10) {
                    zzaiVar.zzb += j11;
                }
                if (z11) {
                    zzaiVar.zza += j11;
                }
                if (z12) {
                    zzaiVar.zzc += j11;
                }
                if (z13) {
                    zzaiVar.zzd += j11;
                }
                if (z14) {
                    zzaiVar.zze += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(UIConfigTags.TAG_DAY, Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                sQLiteDatabaseZzh.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzaiVar;
            } catch (SQLiteException e5) {
                e = e5;
                cursor = cursorQuery;
                try {
                    this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzeh.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaiVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final zzaq zzn(String str, String str2) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        CursorUtil.AnonymousClass2 anonymousClass2 = 0;
        try {
            try {
                cursorQuery = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    long j11 = cursorQuery.getLong(1);
                    long j12 = cursorQuery.getLong(2);
                    long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    zzaq zzaqVar = new zzaq(str, str2, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeh.zzn(str));
                    }
                    cursorQuery.close();
                    return zzaqVar;
                } catch (SQLiteException e5) {
                    e = e5;
                    this.zzs.zzay().zzd().zzd("Error querying events. appId", zzeh.zzn(str), this.zzs.zzj().zzd(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                anonymousClass2 = "current_bundle_count";
                if (anonymousClass2 != 0) {
                    anonymousClass2.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (anonymousClass2 != 0) {
                anonymousClass2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:123), block:B:22:0x007a */
    @WorkerThread
    public final zzku zzp(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    Object objZzq = zzq(cursorQuery, 1);
                    if (objZzq == null) {
                        cursorQuery.close();
                        return null;
                    }
                    zzku zzkuVar = new zzku(str, cursorQuery.getString(2), str2, j10, objZzq);
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeh.zzn(str));
                    }
                    cursorQuery.close();
                    return zzkuVar;
                } catch (SQLiteException e5) {
                    e = e5;
                    this.zzs.zzay().zzd().zzd("Error querying user property. appId", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    public final String zzr() throws Throwable {
        SQLiteException e5;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e7) {
                    e5 = e7;
                    this.zzs.zzay().zzd().zzb("Database error getting next bundle app id", e5);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                r1 = sQLiteDatabaseZzh;
                th = th2;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e5 = e10;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0192  */
    public final List zzt(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzs.zzf();
            int i10 = 4;
            Cursor cursorQuery = sQLiteDatabaseZzh.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size >= 1000) {
                        zzef zzefVarZzd = this.zzs.zzay().zzd();
                        this.zzs.zzf();
                        zzefVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    boolean z10 = cursorQuery.getInt(i10) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j10 = cursorQuery.getLong(6);
                    zzkr zzkrVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    arrayList.add(new zzab(string, string2, new zzks(string3, cursorQuery.getLong(10), objZzq, string2), cursorQuery.getLong(8), z10, string4, (zzau) zzkrVarZzu.zzh(blob, creator), j10, (zzau) this.zzf.zzu().zzh(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzau) this.zzf.zzu().zzh(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i10 = 4;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e5) {
                e = e5;
                cursor = cursorQuery;
                try {
                    this.zzs.zzay().zzd().zzb("Error querying conditional user property value", e);
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    @WorkerThread
    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.zzs.zzf();
                cursorQuery = zzh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    if (objZzq == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeh.zzn(str));
                    } else {
                        arrayList.add(new zzku(str, str2, string, j10, objZzq));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e5) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzeh.zzn(str), e5);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    @WorkerThread
    public final List zzv(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String string;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb2 = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb2.append(" and origin=?");
                        } catch (SQLiteException e5) {
                            e = e5;
                            cursor = null;
                            try {
                                this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
                                List listEmptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return listEmptyList;
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
                        sb2.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String string2 = sb2.toString();
                    this.zzs.zzf();
                    Cursor cursorQuery = zzh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        do {
                            int size = arrayList.size();
                            this.zzs.zzf();
                            if (size >= 1000) {
                                zzef zzefVarZzd = this.zzs.zzay().zzd();
                                this.zzs.zzf();
                                zzefVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                break;
                            }
                            String string3 = cursorQuery.getString(0);
                            long j10 = cursorQuery.getLong(1);
                            Object objZzq = zzq(cursorQuery, 2);
                            string = cursorQuery.getString(3);
                            if (objZzq == null) {
                                this.zzs.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeh.zzn(str), string, str3);
                            } else {
                                arrayList.add(new zzku(str, string, string3, j10, objZzq));
                            }
                        } while (cursorQuery.moveToNext());
                        cursorQuery.close();
                        return arrayList;
                    } catch (SQLiteException e7) {
                        e = e7;
                        cursor = cursorQuery;
                        this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
                        List listEmptyList2 = Collections.emptyList();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return listEmptyList2;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    string = str2;
                    cursor = null;
                    this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), string, e);
                    List listEmptyList3 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList3;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    @WorkerThread
    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    @WorkerThread
    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String strJoin = TextUtils.join(",", list);
            String strC = f.c(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (zzZ(f.c(new StringBuilder(strC.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strC, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                a.f(this.zzs, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                StringBuilder sb2 = new StringBuilder(strC.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strC);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseZzh.execSQL(sb2.toString());
            } catch (SQLiteException e5) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e5);
            }
        }
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long jZza = this.zzf.zzs().zza.zza();
            long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.zzs.zzf();
            if (jAbs > ((Long) zzdu.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    String strValueOf = String.valueOf(this.zzs.zzav().currentTimeMillis());
                    this.zzs.zzf();
                    int iDelete = sQLiteDatabaseZzh.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzaf.zzA())});
                    if (iDelete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
