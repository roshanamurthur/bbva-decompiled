package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzv {
    final /* synthetic */ zzz zza;
    private com.google.android.gms.internal.measurement.zzfo zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090 A[Catch: all -> 0x00a4, SQLiteException -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:18:0x008a, B:20:0x0090, B:27:0x00a8, B:28:0x00b4, B:29:0x00c4, B:32:0x00cd, B:39:0x00ea), top: B:79:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: all -> 0x00a4, SQLiteException -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:18:0x008a, B:20:0x0090, B:27:0x00a8, B:28:0x00b4, B:29:0x00c4, B:32:0x00cd, B:39:0x00ea), top: B:79:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v10, types: [long] */
    public final com.google.android.gms.internal.measurement.zzfo zza(String str, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        zzak zzakVarZzi;
        SQLiteException e5;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        ?? LongValue;
        String strZzh = zzfoVar.zzh();
        List listZzi = zzfoVar.zzi();
        this.zza.zzf.zzu();
        Long l6 = (Long) zzkr.zzC(zzfoVar, "_eid");
        if (l6 != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l6);
                this.zza.zzf.zzu();
                strZzh = (String) zzkr.zzC(zzfoVar, "_en");
                ?? r10 = 0;
                if (TextUtils.isEmpty(strZzh)) {
                    this.zza.zzs.zzay().zzh().zzb("Extra parameter without an event name. eventId", l6);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzakVarZzi = this.zza.zzf.zzi();
                    zzakVarZzi.zzg();
                    zzakVarZzi.zzW();
                    try {
                        try {
                            cursorRawQuery = zzakVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l6.toString()});
                            try {
                                if (!cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzfo) ((com.google.android.gms.internal.measurement.zzfn) zzkr.zzl(com.google.android.gms.internal.measurement.zzfo.zze(), cursorRawQuery.getBlob(0))).zzay(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e7) {
                                        zzakVarZzi.zzs.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeh.zzn(str), l6, e7);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l6);
                                        return null;
                                    }
                                    this.zzb = (com.google.android.gms.internal.measurement.zzfo) obj;
                                    this.zzd = ((Long) pairCreate.second).longValue();
                                    this.zza.zzf.zzu();
                                    this.zzc = (Long) zzkr.zzC(this.zzb, "_eid");
                                } else {
                                    zzakVarZzi.zzs.zzay().zzj().zza("Main event not found");
                                }
                            } catch (SQLiteException e10) {
                                e5 = e10;
                                zzakVarZzi.zzs.zzay().zzd().zzb("Error selecting main event", e5);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l6);
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = LongValue;
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e5 = e11;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l6);
                    return null;
                }
                LongValue = l6.longValue();
                if (LongValue != this.zzc.longValue()) {
                    zzakVarZzi = this.zza.zzf.zzi();
                    zzakVarZzi.zzg();
                    zzakVarZzi.zzW();
                    cursorRawQuery = zzakVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l6.toString()});
                    if (!cursorRawQuery.moveToFirst()) {
                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzfo) ((com.google.android.gms.internal.measurement.zzfn) zzkr.zzl(com.google.android.gms.internal.measurement.zzfo.zze(), cursorRawQuery.getBlob(0))).zzay(), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        if (pairCreate != null) {
                        }
                        this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l6);
                        return null;
                    }
                    zzakVarZzi.zzs.zzay().zzj().zza("Main event not found");
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l6);
                    return null;
                }
                long j10 = this.zzd - 1;
                this.zzd = j10;
                if (j10 <= 0) {
                    zzak zzakVarZzi2 = this.zza.zzf.zzi();
                    zzakVarZzi2.zzg();
                    zzakVarZzi2.zzs.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzakVarZzi2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e12) {
                        zzakVarZzi2.zzs.zzay().zzd().zzb("Error clearing complex main event", e12);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l6, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzkr.zzB(zzfoVar, zzfsVar.zzg()) == null) {
                        arrayList.add(zzfsVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzs.zzay().zzh().zzb("No unique parameters in main event. eventName", strZzh);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
            } else {
                this.zzc = l6;
                this.zzb = zzfoVar;
                this.zza.zzf.zzu();
                Object objZzC = zzkr.zzC(zzfoVar, "_epc");
                long jLongValue = ((Long) (objZzC != null ? objZzC : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    this.zza.zzs.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l6), this.zzd, zzfoVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) zzfoVar.zzbt();
        zzfnVar.zzi(strZzh);
        zzfnVar.zzg();
        zzfnVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzfo) zzfnVar.zzay();
    }
}
