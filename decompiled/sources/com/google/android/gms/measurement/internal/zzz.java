package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzz extends zzkf {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzz(zzkp zzkpVar) {
        super(zzkpVar);
    }

    private final zzt zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzt) this.zzc.get(num);
        }
        zzt zztVar = new zzt(this, this.zza, null);
        this.zzc.put(num, zztVar);
        return zztVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzt zztVar = (zzt) this.zzc.get(Integer.valueOf(i10));
        if (zztVar == null) {
            return false;
        }
        return zztVar.zze.get(i11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a5 A[Catch: all -> 0x02c0, SQLiteException -> 0x02c3, LOOP:11: B:105:0x02a5->B:507:?, LOOP_START, TryCatch #21 {all -> 0x02c0, blocks: (B:103:0x029f, B:105:0x02a5, B:107:0x02b6, B:113:0x02c5, B:116:0x02da, B:124:0x02e7), top: B:455:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b6 A[Catch: all -> 0x02c0, SQLiteException -> 0x02c3, TryCatch #21 {all -> 0x02c0, blocks: (B:103:0x029f, B:105:0x02a5, B:107:0x02b6, B:113:0x02c5, B:116:0x02da, B:124:0x02e7), top: B:455:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02da A[Catch: all -> 0x02c0, SQLiteException -> 0x02c3, TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x02c0, blocks: (B:103:0x029f, B:105:0x02a5, B:107:0x02b6, B:113:0x02c5, B:116:0x02da, B:124:0x02e7), top: B:455:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x032b  */
    /* JADX WARN: Code duplicated, block: B:157:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03db  */
    /* JADX WARN: Code duplicated, block: B:165:0x0400  */
    /* JADX WARN: Code duplicated, block: B:171:0x0415  */
    /* JADX WARN: Code duplicated, block: B:175:0x042f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0438  */
    /* JADX WARN: Code duplicated, block: B:180:0x0444  */
    /* JADX WARN: Code duplicated, block: B:186:0x045b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0491  */
    /* JADX WARN: Code duplicated, block: B:195:0x049a  */
    /* JADX WARN: Code duplicated, block: B:197:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:199:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:200:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:205:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x058d  */
    /* JADX WARN: Code duplicated, block: B:232:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:234:0x05af  */
    /* JADX WARN: Code duplicated, block: B:236:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:237:0x0604  */
    /* JADX WARN: Code duplicated, block: B:240:0x0650  */
    /* JADX WARN: Code duplicated, block: B:248:0x0698  */
    /* JADX WARN: Code duplicated, block: B:255:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:261:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:272:0x0706 A[LOOP:8: B:249:0x069a->B:272:0x0706, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x070f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0719 A[PHI: r0 r4 r13 r26 r28 r66
      0x0719: PHI (r0v98 java.util.Map) = (r0v100 java.util.Map), (r0v109 java.util.Map) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r4v28 android.database.Cursor) = (r4v29 android.database.Cursor), (r4v30 android.database.Cursor) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r13v12 java.lang.String) = (r13v13 java.lang.String), (r13v16 java.lang.String) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r26v4 java.lang.String) = (r26v5 java.lang.String), (r26v9 java.lang.String) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r28v7 java.lang.String) = (r28v8 java.lang.String), (r28v14 java.lang.String) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r66v5 java.util.Iterator) = (r66v6 java.util.Iterator), (r66v8 java.util.Iterator) binds: [B:294:0x074f, B:276:0x0715] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:300:0x075c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0772  */
    /* JADX WARN: Code duplicated, block: B:310:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:312:0x07d4 A[LOOP:10: B:308:0x07a1->B:312:0x07d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:323:0x0810  */
    /* JADX WARN: Code duplicated, block: B:326:0x081f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0832  */
    /* JADX WARN: Code duplicated, block: B:336:0x0872 A[Catch: all -> 0x08a1, SQLiteException -> 0x08a9, LOOP:3: B:336:0x0872->B:483:?, LOOP_START, TRY_LEAVE, TryCatch #0 {all -> 0x08a1, blocks: (B:334:0x086c, B:336:0x0872, B:337:0x0877, B:339:0x0888, B:341:0x0898, B:346:0x08a5, B:351:0x08c1, B:366:0x08e2, B:350:0x08ad, B:355:0x08cd), top: B:426:0x086c }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0898 A[Catch: all -> 0x08a1, SQLiteException -> 0x08a3, TryCatch #0 {all -> 0x08a1, blocks: (B:334:0x086c, B:336:0x0872, B:337:0x0877, B:339:0x0888, B:341:0x0898, B:346:0x08a5, B:351:0x08c1, B:366:0x08e2, B:350:0x08ad, B:355:0x08cd), top: B:426:0x086c }] */
    /* JADX WARN: Code duplicated, block: B:354:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:356:0x08d1 A[PHI: r0 r9
      0x08d1: PHI (r0v152 java.util.Map) = (r0v154 java.util.Map), (r0v161 java.util.Map) binds: [B:367:0x08f7, B:355:0x08cd] A[DONT_GENERATE, DONT_INLINE]
      0x08d1: PHI (r9v41 android.database.Cursor) = (r9v42 android.database.Cursor), (r9v45 android.database.Cursor) binds: [B:367:0x08f7, B:355:0x08cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:373:0x0904  */
    /* JADX WARN: Code duplicated, block: B:377:0x0913  */
    /* JADX WARN: Code duplicated, block: B:380:0x0938  */
    /* JADX WARN: Code duplicated, block: B:383:0x0949  */
    /* JADX WARN: Code duplicated, block: B:385:0x0960  */
    /* JADX WARN: Code duplicated, block: B:387:0x0974  */
    /* JADX WARN: Code duplicated, block: B:388:0x097d  */
    /* JADX WARN: Code duplicated, block: B:392:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:401:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:402:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:405:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:410:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:415:0x0a9e A[Catch: SQLiteException -> 0x0ab6, TRY_LEAVE, TryCatch #25 {SQLiteException -> 0x0ab6, blocks: (B:413:0x0a94, B:415:0x0a9e), top: B:460:0x0a94 }] */
    /* JADX WARN: Code duplicated, block: B:478:0x0929 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0a1f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x09ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0805 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0700 A[EDGE_INSN: B:497:0x0700->B:271:0x0700 BREAK  A[LOOP:8: B:249:0x069a->B:272:0x0706], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0788 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x07ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0331 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0551 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0455 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0217 A[EDGE_INSN: B:548:0x0217->B:78:0x0217 BREAK  A[LOOP:20: B:69:0x01cf->B:79:0x021d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b7 A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_LEAVE, TryCatch #24 {all -> 0x01c3, blocks: (B:60:0x01b1, B:62:0x01b7, B:68:0x01ca, B:69:0x01cf, B:70:0x01d9, B:71:0x01e9, B:76:0x0211, B:73:0x01f6, B:75:0x020a, B:89:0x0232), top: B:459:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_ENTER, TryCatch #24 {all -> 0x01c3, blocks: (B:60:0x01b1, B:62:0x01b7, B:68:0x01ca, B:69:0x01cf, B:70:0x01d9, B:71:0x01e9, B:76:0x0211, B:73:0x01f6, B:75:0x020a, B:89:0x0232), top: B:459:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x021d A[LOOP:20: B:69:0x01cf->B:79:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x025d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v41, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @WorkerThread
    public final List zza(String str, List list, List list2, Long l6, Long l7) throws Throwable {
        int i10;
        int i11;
        boolean z10;
        ?? r10;
        Map map;
        Cursor cursor;
        Cursor cursorQuery;
        Map map2;
        Map map3;
        Iterator it;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzej> list3;
        int i12;
        String str2;
        String str3;
        Iterator it2;
        com.google.android.gms.internal.measurement.zzgf zzgfVar;
        Long lValueOf;
        String str4;
        ArrayMap arrayMap2;
        Map arrayMap3;
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r11;
        Cursor cursorRawQuery;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzgd zzgdVar2;
        List list4;
        Map map4;
        Integer numValueOf;
        List arrayList;
        String str5;
        String str6;
        zzu zzuVar;
        zzv zzvVar;
        ArrayMap arrayMap4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzfo zzfoVar;
        com.google.android.gms.internal.measurement.zzfo zzfoVarZza;
        zzak zzakVarZzi;
        String str7;
        String strZzh;
        zzaq zzaqVarZzn;
        zzaq zzaqVar;
        long j10;
        String strZzh2;
        Map mapEmptyMap;
        Iterator it5;
        String str8;
        String str9;
        Iterator it6;
        int iIntValue2;
        Set set;
        Integer numValueOf2;
        Iterator it7;
        boolean zZzd;
        Map map5;
        zzw zzwVar;
        String str10;
        ArrayMap arrayMap5;
        Cursor cursor2;
        Cursor cursorQuery2;
        String str11;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str12;
        ArrayList arrayList3;
        Iterator it8;
        zzak zzakVarZzi2;
        String str13;
        ContentValues contentValues;
        ArrayMap arrayMap6;
        Iterator it9;
        String strZzf;
        Map mapEmptyMap2;
        Iterator it10;
        int iIntValue3;
        Set set2;
        Integer numValueOf4;
        Iterator it11;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzes zzesVar;
        Integer numValueOf5;
        zzy zzyVar;
        Integer numValueOf6;
        String str14;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List arrayList4;
        ArrayMap arrayMap8;
        int i13;
        ?? r12;
        Cursor cursorQuery4;
        List arrayList5;
        String str15 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l6;
        this.zze = l7;
        Iterator it12 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it12.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzfo) it12.next()).zzh())) {
                z10 = true;
                break;
            }
        }
        zzoa.zzc();
        boolean zZzs = this.zzs.zzf().zzs(this.zza, zzdu.zzW);
        zzoa.zzc();
        boolean zZzs2 = this.zzs.zzf().zzs(this.zza, zzdu.zzV);
        if (z10) {
            zzak zzakVarZzi3 = this.zzf.zzi();
            String str16 = this.zza;
            zzakVarZzi3.zzW();
            zzakVarZzi3.zzg();
            Preconditions.checkNotEmpty(str16);
            ?? contentValues2 = new ContentValues();
            int i14 = 0;
            contentValues2.put("current_session_count", 0);
            try {
                i14 = new String[]{str16};
                zzakVarZzi3.zzh().update("events", contentValues2, "app_id = ?", i14);
                r10 = i14;
            } catch (SQLiteException e5) {
                zzakVarZzi3.zzs.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeh.zzn(str16), e5);
                r10 = i14;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str17 = "Failed to merge filter. appId";
        String str18 = "Database error querying filters. appId";
        String str19 = "audience_id";
        if (zZzs2 && zZzs) {
            zzak zzakVarZzi4 = this.zzf.zzi();
            String str20 = this.zza;
            Preconditions.checkNotEmpty(str20);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzakVarZzi4.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str20}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzkr.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery4.getBlob(i11))).zzay();
                                    if (zzejVar.zzo()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list6 = (List) arrayMap9.get(numValueOf8);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzejVar);
                                    }
                                } catch (IOException e7) {
                                    zzakVarZzi4.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str20), e7);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        zzakVarZzi4.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str20), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzak zzakVarZzi5 = this.zzf.zzi();
                        String str21 = this.zza;
                        zzakVarZzi5.zzW();
                        zzakVarZzi5.zzg();
                        Preconditions.checkNotEmpty(str21);
                        cursorQuery = zzakVarZzi5.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str21}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzkr.zzl(com.google.android.gms.internal.measurement.zzgd.zzf(), cursorQuery.getBlob(1))).zzay());
                                        } catch (IOException e11) {
                                            zzakVarZzi5.zzs.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(str21), Integer.valueOf(i13), e11);
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str19 = str19;
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            zzakVarZzi5.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str21), e);
                                            Map mapEmptyMap4 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap4;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = arrayMap8;
                                } else {
                                    Map mapEmptyMap5 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap5;
                                    str19 = "audience_id";
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str19 = "audience_id";
                        }
                        if (!map2.isEmpty()) {
                            HashSet hashSet = new HashSet(map2.keySet());
                            if (z10) {
                                str4 = this.zza;
                                Preconditions.checkNotEmpty(str4);
                                Preconditions.checkNotNull(map2);
                                arrayMap2 = new ArrayMap();
                                if (!map2.isEmpty()) {
                                    zzak zzakVarZzi6 = this.zzf.zzi();
                                    zzakVarZzi6.zzW();
                                    zzakVarZzi6.zzg();
                                    Preconditions.checkNotEmpty(str4);
                                    arrayMap3 = new ArrayMap();
                                    sQLiteDatabaseZzh = zzakVarZzi6.zzh();
                                    try {
                                        try {
                                            cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str4, str4});
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    do {
                                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                        arrayList = (List) arrayMap3.get(numValueOf);
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                            arrayMap3.put(numValueOf, arrayList);
                                                        }
                                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                    } while (cursorRawQuery.moveToNext());
                                                } else {
                                                    arrayMap3 = Collections.emptyMap();
                                                }
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                zzakVarZzi6.zzs.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeh.zzn(str4), e);
                                                arrayMap3 = Collections.emptyMap();
                                                if (cursorRawQuery != null) {
                                                }
                                                it3 = map2.keySet().iterator();
                                                while (it3.hasNext()) {
                                                    int iIntValue4 = ((Integer) it3.next()).intValue();
                                                    Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                    zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf9);
                                                    list4 = (List) arrayMap3.get(numValueOf9);
                                                    if (list4 != null) {
                                                    }
                                                    map4 = arrayMap3;
                                                    arrayMap2.put(numValueOf9, zzgdVar2);
                                                    arrayMap3 = map4;
                                                    it3 = it3;
                                                }
                                                map3 = arrayMap2;
                                                it = hashSet.iterator();
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) map3.get(Integer.valueOf(iIntValue));
                                                    bitSet = new BitSet();
                                                    bitSet2 = new BitSet();
                                                    arrayMap = new ArrayMap();
                                                    if (zzgdVar != null) {
                                                        for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                                                            if (zzfmVar.zzh()) {
                                                                Integer numValueOf10 = Integer.valueOf(zzfmVar.zza());
                                                                if (zzfmVar.zzg()) {
                                                                    lValueOf = Long.valueOf(zzfmVar.zzb());
                                                                } else {
                                                                    lValueOf = null;
                                                                }
                                                                arrayMap.put(numValueOf10, lValueOf);
                                                            }
                                                        }
                                                    }
                                                    ArrayMap arrayMap10 = new ArrayMap();
                                                    if (zzgdVar != null) {
                                                        it2 = zzgdVar.zzm().iterator();
                                                        while (it2.hasNext()) {
                                                            zzgfVar = (com.google.android.gms.internal.measurement.zzgf) it2.next();
                                                            if (!zzgfVar.zzi()) {
                                                            }
                                                        }
                                                    }
                                                    Map map6 = map3;
                                                    if (zzgdVar != null) {
                                                        i12 = 0;
                                                        while (i12 < zzgdVar.zzd() * 64) {
                                                            if (zzkr.zzv(zzgdVar.zzn(), i12)) {
                                                                str2 = str18;
                                                                str3 = str17;
                                                                this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                                bitSet2.set(i12);
                                                                if (zzkr.zzv(zzgdVar.zzk(), i12)) {
                                                                    bitSet.set(i12);
                                                                }
                                                                i12++;
                                                                str18 = str2;
                                                                str17 = str3;
                                                            } else {
                                                                str2 = str18;
                                                                str3 = str17;
                                                            }
                                                            arrayMap.remove(Integer.valueOf(i12));
                                                            i12++;
                                                            str18 = str2;
                                                            str17 = str3;
                                                        }
                                                    }
                                                    String str22 = str18;
                                                    String str23 = str17;
                                                    Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                    com.google.android.gms.internal.measurement.zzgd zzgdVar3 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf11);
                                                    if (!zZzs2) {
                                                    }
                                                    this.zzc.put(Integer.valueOf(iIntValue), new zzt(this, this.zza, zzgdVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                    map2 = map2;
                                                    str18 = str22;
                                                    map = map;
                                                    map3 = map6;
                                                    str17 = str23;
                                                }
                                                String str24 = str18;
                                                str5 = str17;
                                                str6 = str19;
                                                zzuVar = null;
                                                if (!list.isEmpty()) {
                                                    zzvVar = new zzv(this, zzuVar);
                                                    arrayMap4 = new ArrayMap();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzfoVar = (com.google.android.gms.internal.measurement.zzfo) it4.next();
                                                        zzfoVarZza = zzvVar.zza(this.zza, zzfoVar);
                                                        if (zzfoVarZza != null) {
                                                            zzakVarZzi = this.zzf.zzi();
                                                            str7 = this.zza;
                                                            strZzh = zzfoVarZza.zzh();
                                                            zzaqVarZzn = zzakVarZzi.zzn(str7, zzfoVar.zzh());
                                                            if (zzaqVarZzn == null) {
                                                                zzakVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str7), zzakVarZzi.zzs.zzj().zzd(strZzh));
                                                                zzaqVar = new zzaq(str7, zzfoVar.zzh(), 1L, 1L, 1L, zzfoVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                                                            }
                                                            this.zzf.zzi().zzE(zzaqVar);
                                                            j10 = zzaqVar.zzc;
                                                            strZzh2 = zzfoVarZza.zzh();
                                                            mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                            if (mapEmptyMap == null) {
                                                                zzak zzakVarZzi7 = this.zzf.zzi();
                                                                str10 = this.zza;
                                                                zzakVarZzi7.zzW();
                                                                zzakVarZzi7.zzg();
                                                                Preconditions.checkNotEmpty(str10);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                arrayMap5 = new ArrayMap();
                                                                SQLiteDatabase sQLiteDatabaseZzh2 = zzakVarZzi7.zzh();
                                                                try {
                                                                    try {
                                                                        String[] strArr = new String[2];
                                                                        str11 = str6;
                                                                        try {
                                                                            strArr[0] = str11;
                                                                            strArr[1] = "data";
                                                                            it5 = it4;
                                                                            try {
                                                                                cursorQuery2 = sQLiteDatabaseZzh2.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                                                                try {
                                                                                    try {
                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                            str8 = str15;
                                                                                            while (true) {
                                                                                                try {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzkr.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzay();
                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) arrayMap5.get(numValueOf3);
                                                                                                        if (list5 == null) {
                                                                                                            str6 = str11;
                                                                                                            try {
                                                                                                                arrayList2 = new ArrayList();
                                                                                                                arrayMap5.put(numValueOf3, arrayList2);
                                                                                                            } catch (SQLiteException e15) {
                                                                                                                e = e15;
                                                                                                                str9 = str5;
                                                                                                                zzakVarZzi7.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str10), e);
                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                                it6 = mapEmptyMap.keySet().iterator();
                                                                                                                while (it6.hasNext()) {
                                                                                                                    iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                                                    set = this.zzb;
                                                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                                    if (set.contains(numValueOf2)) {
                                                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                                    } else {
                                                                                                                        it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                                        zZzd = true;
                                                                                                                        while (true) {
                                                                                                                            if (it7.hasNext()) {
                                                                                                                                map5 = mapEmptyMap;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            com.google.android.gms.internal.measurement.zzej zzejVar3 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                                                            zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar3);
                                                                                                                            map5 = mapEmptyMap;
                                                                                                                            zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                                                            if (zZzd) {
                                                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                                                                                                            mapEmptyMap = map5;
                                                                                                                        }
                                                                                                                        if (!zZzd) {
                                                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                        }
                                                                                                                        mapEmptyMap = map5;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                                str5 = str9;
                                                                                                                zzvVar = zzvVar;
                                                                                                                str15 = str8;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str6 = str11;
                                                                                                            arrayList2 = list5;
                                                                                                        }
                                                                                                        arrayList2.add(zzejVar2);
                                                                                                        str9 = str5;
                                                                                                    } catch (IOException e16) {
                                                                                                        str6 = str11;
                                                                                                        str9 = str5;
                                                                                                        zzakVarZzi7.zzs.zzay().zzd().zzc(str9, zzeh.zzn(str10), e16);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        str5 = str9;
                                                                                                        arrayMap5 = arrayMap5;
                                                                                                        str11 = str6;
                                                                                                    } catch (SQLiteException e17) {
                                                                                                        e = e17;
                                                                                                        zzakVarZzi7.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str10), e);
                                                                                                        mapEmptyMap = Collections.emptyMap();
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                } catch (SQLiteException e18) {
                                                                                                    e = e18;
                                                                                                    str6 = str11;
                                                                                                }
                                                                                            }
                                                                                            cursorQuery2.close();
                                                                                            mapEmptyMap = arrayMap5;
                                                                                        } else {
                                                                                            str6 = str11;
                                                                                            str8 = str15;
                                                                                            str9 = str5;
                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                            cursorQuery2.close();
                                                                                        }
                                                                                    } catch (SQLiteException e19) {
                                                                                        e = e19;
                                                                                        str6 = str11;
                                                                                        str8 = str15;
                                                                                    }
                                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    cursor2 = cursorQuery2;
                                                                                    if (cursor2 != null) {
                                                                                        cursor2.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (SQLiteException e20) {
                                                                                e = e20;
                                                                                str6 = str11;
                                                                                str8 = str15;
                                                                                str9 = str5;
                                                                                cursorQuery2 = null;
                                                                                zzakVarZzi7.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str10), e);
                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                if (cursorQuery2 != null) {
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                it6 = mapEmptyMap.keySet().iterator();
                                                                                while (it6.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                    set = this.zzb;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (set.contains(numValueOf2)) {
                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                        zZzd = true;
                                                                                        while (true) {
                                                                                            if (it7.hasNext()) {
                                                                                                map5 = mapEmptyMap;
                                                                                                break;
                                                                                            }
                                                                                            com.google.android.gms.internal.measurement.zzej zzejVar4 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                            zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar4);
                                                                                            map5 = mapEmptyMap;
                                                                                            zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar4.zzb()));
                                                                                            if (zZzd) {
                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                                                                            mapEmptyMap = map5;
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                        mapEmptyMap = map5;
                                                                                    }
                                                                                }
                                                                                it4 = it5;
                                                                                str5 = str9;
                                                                                zzvVar = zzvVar;
                                                                                str15 = str8;
                                                                            }
                                                                        } catch (SQLiteException e21) {
                                                                            e = e21;
                                                                            str6 = str11;
                                                                            it5 = it4;
                                                                            str8 = str15;
                                                                            str9 = str5;
                                                                            cursorQuery2 = null;
                                                                            zzakVarZzi7.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str10), e);
                                                                            mapEmptyMap = Collections.emptyMap();
                                                                            if (cursorQuery2 != null) {
                                                                                cursorQuery2.close();
                                                                            }
                                                                            arrayMap4.put(strZzh2, mapEmptyMap);
                                                                            it6 = mapEmptyMap.keySet().iterator();
                                                                            while (it6.hasNext()) {
                                                                                iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                set = this.zzb;
                                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                if (set.contains(numValueOf2)) {
                                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                } else {
                                                                                    it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                    zZzd = true;
                                                                                    while (true) {
                                                                                        if (it7.hasNext()) {
                                                                                            map5 = mapEmptyMap;
                                                                                            break;
                                                                                        }
                                                                                        com.google.android.gms.internal.measurement.zzej zzejVar5 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                        zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar5);
                                                                                        map5 = mapEmptyMap;
                                                                                        zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar5.zzb()));
                                                                                        if (zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                            break;
                                                                                        }
                                                                                        zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                                                                        mapEmptyMap = map5;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                    }
                                                                                    mapEmptyMap = map5;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            str5 = str9;
                                                                            zzvVar = zzvVar;
                                                                            str15 = str8;
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        cursor2 = null;
                                                                    }
                                                                } catch (SQLiteException e22) {
                                                                    e = e22;
                                                                }
                                                            } else {
                                                                it5 = it4;
                                                                str8 = str15;
                                                                str9 = str5;
                                                            }
                                                            it6 = mapEmptyMap.keySet().iterator();
                                                            while (it6.hasNext()) {
                                                                iIntValue2 = ((Integer) it6.next()).intValue();
                                                                set = this.zzb;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (set.contains(numValueOf2)) {
                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                    zZzd = true;
                                                                    while (true) {
                                                                        if (it7.hasNext()) {
                                                                            map5 = mapEmptyMap;
                                                                            break;
                                                                        }
                                                                        com.google.android.gms.internal.measurement.zzej zzejVar6 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                        zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar6);
                                                                        map5 = mapEmptyMap;
                                                                        zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar6.zzb()));
                                                                        if (zZzd) {
                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                                                        mapEmptyMap = map5;
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                    mapEmptyMap = map5;
                                                                }
                                                            }
                                                            it4 = it5;
                                                            str5 = str9;
                                                            zzvVar = zzvVar;
                                                            str15 = str8;
                                                        }
                                                    }
                                                }
                                                str12 = str15;
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new ArrayMap();
                                                    it9 = list2.iterator();
                                                    while (it9.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) it9.next();
                                                        strZzf = zzghVar.zzf();
                                                        mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                        if (mapEmptyMap2 == null) {
                                                            zzak zzakVarZzi8 = this.zzf.zzi();
                                                            str14 = this.zza;
                                                            zzakVarZzi8.zzW();
                                                            zzakVarZzi8.zzg();
                                                            Preconditions.checkNotEmpty(str14);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            arrayMap7 = new ArrayMap();
                                                            SQLiteDatabase sQLiteDatabaseZzh3 = zzakVarZzi8.zzh();
                                                            try {
                                                                try {
                                                                    String[] strArr2 = new String[2];
                                                                    try {
                                                                        strArr2[0] = str6;
                                                                        strArr2[1] = "data";
                                                                        cursorQuery3 = sQLiteDatabaseZzh3.query("property_filters", strArr2, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                                                        try {
                                                                            try {
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    do {
                                                                                        try {
                                                                                            com.google.android.gms.internal.measurement.zzes zzesVar2 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzkr.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzay();
                                                                                            try {
                                                                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                arrayList4 = (List) arrayMap7.get(numValueOf7);
                                                                                                if (arrayList4 == null) {
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    arrayMap7.put(numValueOf7, arrayList4);
                                                                                                }
                                                                                                arrayList4.add(zzesVar2);
                                                                                            } catch (SQLiteException e23) {
                                                                                                e = e23;
                                                                                                zzakVarZzi8.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str14), e);
                                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                                if (cursorQuery3 != null) {
                                                                                                    cursorQuery3.close();
                                                                                                }
                                                                                            }
                                                                                        } catch (IOException e24) {
                                                                                            zzakVarZzi8.zzs.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(str14), e24);
                                                                                        }
                                                                                    } while (cursorQuery3.moveToNext());
                                                                                    cursorQuery3.close();
                                                                                    mapEmptyMap2 = arrayMap7;
                                                                                } else {
                                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                                    cursorQuery3.close();
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                cursor3 = cursorQuery3;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e25) {
                                                                            e = e25;
                                                                        }
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery3 = null;
                                                                        zzakVarZzi8.zzs.zzay().zzd().zzc(str24, zzeh.zzn(str14), e);
                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                        if (cursorQuery3 != null) {
                                                                            cursorQuery3.close();
                                                                        }
                                                                        arrayMap6.put(strZzf, mapEmptyMap2);
                                                                        it10 = mapEmptyMap2.keySet().iterator();
                                                                        while (it10.hasNext()) {
                                                                            iIntValue3 = ((Integer) it10.next()).intValue();
                                                                            set2 = this.zzb;
                                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                                            if (set2.contains(numValueOf4)) {
                                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                                break;
                                                                            }
                                                                            it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                            zZzd2 = true;
                                                                            while (true) {
                                                                                if (it11.hasNext()) {
                                                                                    zzesVar = (com.google.android.gms.internal.measurement.zzes) it11.next();
                                                                                    if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                                        zzef zzefVarZzj = this.zzs.zzay().zzj();
                                                                                        Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                                        if (zzesVar.zzj()) {
                                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                                        } else {
                                                                                            numValueOf6 = null;
                                                                                        }
                                                                                        zzefVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                                        this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                                                    }
                                                                                    if (zzesVar.zzj()) {
                                                                                    }
                                                                                    zzef zzefVarZzk = this.zzs.zzay().zzk();
                                                                                    Object objZzn = zzeh.zzn(this.zza);
                                                                                    if (zzesVar.zzj()) {
                                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                                    } else {
                                                                                        numValueOf5 = null;
                                                                                    }
                                                                                    zzefVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf5));
                                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                }
                                                                                if (!zZzd2) {
                                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                }
                                                                                zzd(Integer.valueOf(iIntValue3)).zzc(zzyVar);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (SQLiteException e27) {
                                                                    e = e27;
                                                                }
                                                                arrayMap6.put(strZzf, mapEmptyMap2);
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                cursor3 = null;
                                                            }
                                                        }
                                                        it10 = mapEmptyMap2.keySet().iterator();
                                                        while (it10.hasNext()) {
                                                            iIntValue3 = ((Integer) it10.next()).intValue();
                                                            set2 = this.zzb;
                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf4)) {
                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                break;
                                                                break;
                                                            }
                                                            it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it11.hasNext()) {
                                                                    zzesVar = (com.google.android.gms.internal.measurement.zzes) it11.next();
                                                                    if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                        zzef zzefVarZzj2 = this.zzs.zzay().zzj();
                                                                        Integer numValueOf13 = Integer.valueOf(iIntValue3);
                                                                        if (zzesVar.zzj()) {
                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzefVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf13, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                        this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                                    }
                                                                    if (zzesVar.zzj()) {
                                                                    }
                                                                    zzef zzefVarZzk2 = this.zzs.zzay().zzk();
                                                                    Object objZzn2 = zzeh.zzn(this.zza);
                                                                    if (zzesVar.zzj()) {
                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzefVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf5));
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                zzd(Integer.valueOf(iIntValue3)).zzc(zzyVar);
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set setKeySet = this.zzc.keySet();
                                                setKeySet.removeAll(this.zzb);
                                                it8 = setKeySet.iterator();
                                                while (it8.hasNext()) {
                                                    int iIntValue5 = ((Integer) it8.next()).intValue();
                                                    Map map7 = this.zzc;
                                                    Integer numValueOf14 = Integer.valueOf(iIntValue5);
                                                    zzt zztVar = (zzt) map7.get(numValueOf14);
                                                    Preconditions.checkNotNull(zztVar);
                                                    com.google.android.gms.internal.measurement.zzfk zzfkVarZza = zztVar.zza(iIntValue5);
                                                    arrayList3.add(zzfkVarZza);
                                                    zzakVarZzi2 = this.zzf.zzi();
                                                    str13 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzgd zzgdVarZzd = zzfkVarZza.zzd();
                                                    zzakVarZzi2.zzW();
                                                    zzakVarZzi2.zzg();
                                                    Preconditions.checkNotEmpty(str13);
                                                    Preconditions.checkNotNull(zzgdVarZzd);
                                                    byte[] bArrZzbq = zzgdVarZzd.zzbq();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str13);
                                                    String str25 = str6;
                                                    contentValues.put(str25, numValueOf14);
                                                    String str26 = str12;
                                                    contentValues.put(str26, bArrZzbq);
                                                    try {
                                                        try {
                                                            if (zzakVarZzi2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                zzakVarZzi2.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str13));
                                                            }
                                                        } catch (SQLiteException e28) {
                                                            e = e28;
                                                            zzakVarZzi2.zzs.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(str13), e);
                                                        }
                                                    } catch (SQLiteException e29) {
                                                        e = e29;
                                                    }
                                                    str12 = str26;
                                                    str6 = str25;
                                                }
                                                return arrayList3;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r11 = sQLiteDatabaseZzh;
                                            if (r11 != 0) {
                                                r11.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e30) {
                                        e = e30;
                                        cursorRawQuery = null;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        r11 = 0;
                                        if (r11 != 0) {
                                            r11.close();
                                        }
                                        throw th;
                                    }
                                    cursorRawQuery.close();
                                    it3 = map2.keySet().iterator();
                                    while (it3.hasNext()) {
                                        int iIntValue6 = ((Integer) it3.next()).intValue();
                                        Integer numValueOf15 = Integer.valueOf(iIntValue6);
                                        zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf15);
                                        list4 = (List) arrayMap3.get(numValueOf15);
                                        if (list4 != null) {
                                        }
                                        map4 = arrayMap3;
                                        arrayMap2.put(numValueOf15, zzgdVar2);
                                        arrayMap3 = map4;
                                        it3 = it3;
                                    }
                                }
                                map3 = arrayMap2;
                            } else {
                                map3 = map2;
                            }
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                                iIntValue = ((Integer) it.next()).intValue();
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) map3.get(Integer.valueOf(iIntValue));
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zzgdVar != null) {
                                    while (r2.hasNext()) {
                                        if (zzfmVar.zzh()) {
                                            Integer numValueOf16 = Integer.valueOf(zzfmVar.zza());
                                            if (zzfmVar.zzg()) {
                                                lValueOf = Long.valueOf(zzfmVar.zzb());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(numValueOf16, lValueOf);
                                        }
                                    }
                                }
                                ArrayMap arrayMap11 = new ArrayMap();
                                if (zzgdVar != null) {
                                    it2 = zzgdVar.zzm().iterator();
                                    while (it2.hasNext()) {
                                        zzgfVar = (com.google.android.gms.internal.measurement.zzgf) it2.next();
                                        if (!zzgfVar.zzi()) {
                                        }
                                    }
                                }
                                Map map8 = map3;
                                if (zzgdVar != null) {
                                    i12 = 0;
                                    while (i12 < zzgdVar.zzd() * 64) {
                                        if (zzkr.zzv(zzgdVar.zzn(), i12)) {
                                            str2 = str18;
                                            str3 = str17;
                                            this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                            bitSet2.set(i12);
                                            if (zzkr.zzv(zzgdVar.zzk(), i12)) {
                                                bitSet.set(i12);
                                            }
                                            i12++;
                                            str18 = str2;
                                            str17 = str3;
                                        } else {
                                            str2 = str18;
                                            str3 = str17;
                                        }
                                        arrayMap.remove(Integer.valueOf(i12));
                                        i12++;
                                        str18 = str2;
                                        str17 = str3;
                                    }
                                }
                                String str27 = str18;
                                String str28 = str17;
                                Integer numValueOf17 = Integer.valueOf(iIntValue);
                                com.google.android.gms.internal.measurement.zzgd zzgdVar4 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf17);
                                if (!zZzs2) {
                                }
                                this.zzc.put(Integer.valueOf(iIntValue), new zzt(this, this.zza, zzgdVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                map2 = map2;
                                str18 = str27;
                                map = map;
                                map3 = map8;
                                str17 = str28;
                            }
                        }
                        String str29 = str18;
                        str5 = str17;
                        str6 = str19;
                        zzuVar = null;
                        if (!list.isEmpty()) {
                            zzvVar = new zzv(this, zzuVar);
                            arrayMap4 = new ArrayMap();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                zzfoVar = (com.google.android.gms.internal.measurement.zzfo) it4.next();
                                zzfoVarZza = zzvVar.zza(this.zza, zzfoVar);
                                if (zzfoVarZza != null) {
                                    zzakVarZzi = this.zzf.zzi();
                                    str7 = this.zza;
                                    strZzh = zzfoVarZza.zzh();
                                    zzaqVarZzn = zzakVarZzi.zzn(str7, zzfoVar.zzh());
                                    if (zzaqVarZzn == null) {
                                        zzakVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str7), zzakVarZzi.zzs.zzj().zzd(strZzh));
                                        zzaqVar = new zzaq(str7, zzfoVar.zzh(), 1L, 1L, 1L, zzfoVar.zzd(), 0L, null, null, null, null);
                                    } else {
                                        zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                                    }
                                    this.zzf.zzi().zzE(zzaqVar);
                                    j10 = zzaqVar.zzc;
                                    strZzh2 = zzfoVarZza.zzh();
                                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                    if (mapEmptyMap == null) {
                                        zzak zzakVarZzi9 = this.zzf.zzi();
                                        str10 = this.zza;
                                        zzakVarZzi9.zzW();
                                        zzakVarZzi9.zzg();
                                        Preconditions.checkNotEmpty(str10);
                                        Preconditions.checkNotEmpty(strZzh2);
                                        arrayMap5 = new ArrayMap();
                                        SQLiteDatabase sQLiteDatabaseZzh4 = zzakVarZzi9.zzh();
                                        String[] strArr3 = new String[2];
                                        str11 = str6;
                                        strArr3[0] = str11;
                                        strArr3[1] = "data";
                                        it5 = it4;
                                        cursorQuery2 = sQLiteDatabaseZzh4.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            str8 = str15;
                                            while (true) {
                                                com.google.android.gms.internal.measurement.zzej zzejVar7 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzkr.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzay();
                                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                list5 = (List) arrayMap5.get(numValueOf3);
                                                if (list5 == null) {
                                                    str6 = str11;
                                                    arrayList2 = new ArrayList();
                                                    arrayMap5.put(numValueOf3, arrayList2);
                                                } else {
                                                    str6 = str11;
                                                    arrayList2 = list5;
                                                }
                                                arrayList2.add(zzejVar7);
                                                str9 = str5;
                                                if (!cursorQuery2.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                str5 = str9;
                                                arrayMap5 = arrayMap5;
                                                str11 = str6;
                                            }
                                            cursorQuery2.close();
                                            mapEmptyMap = arrayMap5;
                                        } else {
                                            str6 = str11;
                                            str8 = str15;
                                            str9 = str5;
                                            mapEmptyMap = Collections.emptyMap();
                                            cursorQuery2.close();
                                        }
                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                    } else {
                                        it5 = it4;
                                        str8 = str15;
                                        str9 = str5;
                                    }
                                    it6 = mapEmptyMap.keySet().iterator();
                                    while (it6.hasNext()) {
                                        iIntValue2 = ((Integer) it6.next()).intValue();
                                        set = this.zzb;
                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                        if (set.contains(numValueOf2)) {
                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                        } else {
                                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                            zZzd = true;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    map5 = mapEmptyMap;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzej zzejVar8 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar8);
                                                map5 = mapEmptyMap;
                                                zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar8.zzb()));
                                                if (zZzd) {
                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                    break;
                                                }
                                                zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                                mapEmptyMap = map5;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                            }
                                            mapEmptyMap = map5;
                                        }
                                    }
                                    it4 = it5;
                                    str5 = str9;
                                    zzvVar = zzvVar;
                                    str15 = str8;
                                }
                            }
                        }
                        str12 = str15;
                        if (!list2.isEmpty()) {
                            arrayMap6 = new ArrayMap();
                            it9 = list2.iterator();
                            while (it9.hasNext()) {
                                com.google.android.gms.internal.measurement.zzgh zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) it9.next();
                                strZzf = zzghVar2.zzf();
                                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                if (mapEmptyMap2 == null) {
                                    zzak zzakVarZzi10 = this.zzf.zzi();
                                    str14 = this.zza;
                                    zzakVarZzi10.zzW();
                                    zzakVarZzi10.zzg();
                                    Preconditions.checkNotEmpty(str14);
                                    Preconditions.checkNotEmpty(strZzf);
                                    arrayMap7 = new ArrayMap();
                                    SQLiteDatabase sQLiteDatabaseZzh5 = zzakVarZzi10.zzh();
                                    String[] strArr4 = new String[2];
                                    strArr4[0] = str6;
                                    strArr4[1] = "data";
                                    cursorQuery3 = sQLiteDatabaseZzh5.query("property_filters", strArr4, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        do {
                                            com.google.android.gms.internal.measurement.zzes zzesVar3 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzkr.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzay();
                                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                                arrayMap7.put(numValueOf7, arrayList4);
                                            }
                                            arrayList4.add(zzesVar3);
                                        } while (cursorQuery3.moveToNext());
                                        cursorQuery3.close();
                                        mapEmptyMap2 = arrayMap7;
                                    } else {
                                        mapEmptyMap2 = Collections.emptyMap();
                                        cursorQuery3.close();
                                    }
                                    arrayMap6.put(strZzf, mapEmptyMap2);
                                }
                                it10 = mapEmptyMap2.keySet().iterator();
                                while (it10.hasNext()) {
                                    iIntValue3 = ((Integer) it10.next()).intValue();
                                    set2 = this.zzb;
                                    numValueOf4 = Integer.valueOf(iIntValue3);
                                    if (set2.contains(numValueOf4)) {
                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                        break;
                                        break;
                                    }
                                    it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it11.hasNext()) {
                                            zzesVar = (com.google.android.gms.internal.measurement.zzes) it11.next();
                                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                zzef zzefVarZzj3 = this.zzs.zzay().zzj();
                                                Integer numValueOf18 = Integer.valueOf(iIntValue3);
                                                if (zzesVar.zzj()) {
                                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                } else {
                                                    numValueOf6 = null;
                                                }
                                                zzefVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf18, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                            }
                                            if (zzesVar.zzj()) {
                                            }
                                            zzef zzefVarZzk3 = this.zzs.zzay().zzk();
                                            Object objZzn3 = zzeh.zzn(this.zza);
                                            if (zzesVar.zzj()) {
                                                numValueOf5 = Integer.valueOf(zzesVar.zza());
                                            } else {
                                                numValueOf5 = null;
                                            }
                                            zzefVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf5));
                                            this.zzb.add(Integer.valueOf(iIntValue3));
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(Integer.valueOf(iIntValue3));
                                        }
                                        zzd(Integer.valueOf(iIntValue3)).zzc(zzyVar);
                                    }
                                }
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set setKeySet2 = this.zzc.keySet();
                        setKeySet2.removeAll(this.zzb);
                        it8 = setKeySet2.iterator();
                        while (it8.hasNext()) {
                            int iIntValue7 = ((Integer) it8.next()).intValue();
                            Map map9 = this.zzc;
                            Integer numValueOf19 = Integer.valueOf(iIntValue7);
                            zzt zztVar2 = (zzt) map9.get(numValueOf19);
                            Preconditions.checkNotNull(zztVar2);
                            com.google.android.gms.internal.measurement.zzfk zzfkVarZza2 = zztVar2.zza(iIntValue7);
                            arrayList3.add(zzfkVarZza2);
                            zzakVarZzi2 = this.zzf.zzi();
                            str13 = this.zza;
                            com.google.android.gms.internal.measurement.zzgd zzgdVarZzd2 = zzfkVarZza2.zzd();
                            zzakVarZzi2.zzW();
                            zzakVarZzi2.zzg();
                            Preconditions.checkNotEmpty(str13);
                            Preconditions.checkNotNull(zzgdVarZzd2);
                            byte[] bArrZzbq2 = zzgdVarZzd2.zzbq();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str13);
                            String str210 = str6;
                            contentValues.put(str210, numValueOf19);
                            String str211 = str12;
                            contentValues.put(str211, bArrZzbq2);
                            if (zzakVarZzi2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzakVarZzi2.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str13));
                            }
                            str12 = str211;
                            str6 = str210;
                        }
                        return arrayList3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r12 = r10;
                    if (r12 != 0) {
                        r12.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e31) {
                e = e31;
                cursorQuery4 = null;
            } catch (Throwable th10) {
                th = th10;
                r12 = 0;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzak zzakVarZzi11 = this.zzf.zzi();
        String str212 = this.zza;
        zzakVarZzi11.zzW();
        zzakVarZzi11.zzg();
        Preconditions.checkNotEmpty(str212);
        try {
            cursorQuery = zzakVarZzi11.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str212}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap6 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap6;
                str19 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzkr.zzl(com.google.android.gms.internal.measurement.zzgd.zzf(), cursorQuery.getBlob(1))).zzay());
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str19 = str19;
                }
                cursorQuery.close();
                map2 = arrayMap8;
            }
        } catch (SQLiteException e32) {
            e = e32;
            str19 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            HashSet hashSet2 = new HashSet(map2.keySet());
            if (z10) {
                str4 = this.zza;
                Preconditions.checkNotEmpty(str4);
                Preconditions.checkNotNull(map2);
                arrayMap2 = new ArrayMap();
                if (!map2.isEmpty()) {
                    zzak zzakVarZzi12 = this.zzf.zzi();
                    zzakVarZzi12.zzW();
                    zzakVarZzi12.zzg();
                    Preconditions.checkNotEmpty(str4);
                    arrayMap3 = new ArrayMap();
                    sQLiteDatabaseZzh = zzakVarZzi12.zzh();
                    cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str4, str4});
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                            arrayList = (List) arrayMap3.get(numValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap3.put(numValueOf, arrayList);
                            }
                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                        } while (cursorRawQuery.moveToNext());
                    } else {
                        arrayMap3 = Collections.emptyMap();
                    }
                    cursorRawQuery.close();
                    it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        int iIntValue8 = ((Integer) it3.next()).intValue();
                        Integer numValueOf110 = Integer.valueOf(iIntValue8);
                        zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf110);
                        list4 = (List) arrayMap3.get(numValueOf110);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap3;
                            arrayMap2.put(numValueOf110, zzgdVar2);
                            arrayMap3 = map4;
                            it3 = it3;
                        } else {
                            map4 = arrayMap3;
                            List listZzq = this.zzf.zzu().zzq(zzgdVar2.zzk(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap3 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgdVar2.zzbt();
                                zzgcVar.zze();
                                zzgcVar.zzb(listZzq);
                                List listZzq2 = this.zzf.zzu().zzq(zzgdVar2.zzn(), list4);
                                zzgcVar.zzf();
                                zzgcVar.zzd(listZzq2);
                                for (int i15 = 0; i15 < zzgdVar2.zza(); i15++) {
                                    if (list4.contains(Integer.valueOf(zzgdVar2.zze(i15).zza()))) {
                                        zzgcVar.zzg(i15);
                                    }
                                }
                                for (int i16 = 0; i16 < zzgdVar2.zzc(); i16++) {
                                    if (list4.contains(Integer.valueOf(zzgdVar2.zzi(i16).zzb()))) {
                                        zzgcVar.zzh(i16);
                                    }
                                }
                                arrayMap2.put(Integer.valueOf(iIntValue8), (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzay());
                                arrayMap3 = map4;
                                it3 = it3;
                            }
                        }
                    }
                }
                map3 = arrayMap2;
            } else {
                map3 = map2;
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zzgdVar != null && zzgdVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfmVar.zzh()) {
                            Integer numValueOf111 = Integer.valueOf(zzfmVar.zza());
                            if (zzfmVar.zzg()) {
                                lValueOf = Long.valueOf(zzfmVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf111, lValueOf);
                        }
                    }
                }
                ArrayMap arrayMap12 = new ArrayMap();
                if (zzgdVar != null && zzgdVar.zzc() != 0) {
                    it2 = zzgdVar.zzm().iterator();
                    while (it2.hasNext()) {
                        zzgfVar = (com.google.android.gms.internal.measurement.zzgf) it2.next();
                        if (!zzgfVar.zzi() && zzgfVar.zza() > 0) {
                            arrayMap12.put(Integer.valueOf(zzgfVar.zzb()), Long.valueOf(zzgfVar.zzc(zzgfVar.zza() - 1)));
                            map3 = map3;
                            it2 = it2;
                        }
                    }
                }
                Map map10 = map3;
                if (zzgdVar != null) {
                    i12 = 0;
                    while (i12 < zzgdVar.zzd() * 64) {
                        if (zzkr.zzv(zzgdVar.zzn(), i12)) {
                            str2 = str18;
                            str3 = str17;
                            this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (zzkr.zzv(zzgdVar.zzk(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            str18 = str2;
                            str17 = str3;
                        } else {
                            str2 = str18;
                            str3 = str17;
                        }
                        arrayMap.remove(Integer.valueOf(i12));
                        i12++;
                        str18 = str2;
                        str17 = str3;
                    }
                }
                String str213 = str18;
                String str214 = str17;
                Integer numValueOf112 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzgd zzgdVar5 = (com.google.android.gms.internal.measurement.zzgd) map2.get(numValueOf112);
                if (!zZzs2 && zZzs && (list3 = (List) map.get(numValueOf112)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzej zzejVar9 : list3) {
                        int iZzb = zzejVar9.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzejVar9.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf20)) {
                            arrayMap.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (arrayMap12.containsKey(numValueOf20)) {
                            arrayMap12.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue), new zzt(this, this.zza, zzgdVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                map2 = map2;
                str18 = str213;
                map = map;
                map3 = map10;
                str17 = str214;
            }
        }
        String str215 = str18;
        str5 = str17;
        str6 = str19;
        zzuVar = null;
        if (!list.isEmpty()) {
            zzvVar = new zzv(this, zzuVar);
            arrayMap4 = new ArrayMap();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzfoVar = (com.google.android.gms.internal.measurement.zzfo) it4.next();
                zzfoVarZza = zzvVar.zza(this.zza, zzfoVar);
                if (zzfoVarZza != null) {
                    zzakVarZzi = this.zzf.zzi();
                    str7 = this.zza;
                    strZzh = zzfoVarZza.zzh();
                    zzaqVarZzn = zzakVarZzi.zzn(str7, zzfoVar.zzh());
                    if (zzaqVarZzn == null) {
                        zzakVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str7), zzakVarZzi.zzs.zzj().zzd(strZzh));
                        zzaqVar = new zzaq(str7, zzfoVar.zzh(), 1L, 1L, 1L, zzfoVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzaqVar);
                    j10 = zzaqVar.zzc;
                    strZzh2 = zzfoVarZza.zzh();
                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                    if (mapEmptyMap == null) {
                        zzak zzakVarZzi13 = this.zzf.zzi();
                        str10 = this.zza;
                        zzakVarZzi13.zzW();
                        zzakVarZzi13.zzg();
                        Preconditions.checkNotEmpty(str10);
                        Preconditions.checkNotEmpty(strZzh2);
                        arrayMap5 = new ArrayMap();
                        SQLiteDatabase sQLiteDatabaseZzh6 = zzakVarZzi13.zzh();
                        String[] strArr5 = new String[2];
                        str11 = str6;
                        strArr5[0] = str11;
                        strArr5[1] = "data";
                        it5 = it4;
                        cursorQuery2 = sQLiteDatabaseZzh6.query("event_filters", strArr5, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            str8 = str15;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzej zzejVar10 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzkr.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzay();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) arrayMap5.get(numValueOf3);
                                if (list5 == null) {
                                    str6 = str11;
                                    arrayList2 = new ArrayList();
                                    arrayMap5.put(numValueOf3, arrayList2);
                                } else {
                                    str6 = str11;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzejVar10);
                                str9 = str5;
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                str5 = str9;
                                arrayMap5 = arrayMap5;
                                str11 = str6;
                            }
                            cursorQuery2.close();
                            mapEmptyMap = arrayMap5;
                        } else {
                            str6 = str11;
                            str8 = str15;
                            str9 = str5;
                            mapEmptyMap = Collections.emptyMap();
                            cursorQuery2.close();
                        }
                        arrayMap4.put(strZzh2, mapEmptyMap);
                    } else {
                        it5 = it4;
                        str8 = str15;
                        str9 = str5;
                    }
                    it6 = mapEmptyMap.keySet().iterator();
                    while (it6.hasNext()) {
                        iIntValue2 = ((Integer) it6.next()).intValue();
                        set = this.zzb;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (set.contains(numValueOf2)) {
                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                        } else {
                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                            zZzd = true;
                            while (true) {
                                if (it7.hasNext()) {
                                    map5 = mapEmptyMap;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzej zzejVar11 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                zzwVar = new zzw(this, this.zza, iIntValue2, zzejVar11);
                                map5 = mapEmptyMap;
                                zZzd = zzwVar.zzd(this.zzd, this.zze, zzfoVarZza, j10, zzaqVar, zzf(iIntValue2, zzejVar11.zzb()));
                                if (zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                zzd(Integer.valueOf(iIntValue2)).zzc(zzwVar);
                                mapEmptyMap = map5;
                            }
                            if (!zZzd) {
                                this.zzb.add(Integer.valueOf(iIntValue2));
                            }
                            mapEmptyMap = map5;
                        }
                    }
                    it4 = it5;
                    str5 = str9;
                    zzvVar = zzvVar;
                    str15 = str8;
                }
            }
        }
        str12 = str15;
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it9 = list2.iterator();
            while (it9.hasNext()) {
                com.google.android.gms.internal.measurement.zzgh zzghVar3 = (com.google.android.gms.internal.measurement.zzgh) it9.next();
                strZzf = zzghVar3.zzf();
                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                if (mapEmptyMap2 == null) {
                    zzak zzakVarZzi14 = this.zzf.zzi();
                    str14 = this.zza;
                    zzakVarZzi14.zzW();
                    zzakVarZzi14.zzg();
                    Preconditions.checkNotEmpty(str14);
                    Preconditions.checkNotEmpty(strZzf);
                    arrayMap7 = new ArrayMap();
                    SQLiteDatabase sQLiteDatabaseZzh7 = zzakVarZzi14.zzh();
                    String[] strArr6 = new String[2];
                    strArr6[0] = str6;
                    strArr6[1] = "data";
                    cursorQuery3 = sQLiteDatabaseZzh7.query("property_filters", strArr6, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            com.google.android.gms.internal.measurement.zzes zzesVar4 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzkr.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzay();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                arrayMap7.put(numValueOf7, arrayList4);
                            }
                            arrayList4.add(zzesVar4);
                        } while (cursorQuery3.moveToNext());
                        cursorQuery3.close();
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    arrayMap6.put(strZzf, mapEmptyMap2);
                }
                it10 = mapEmptyMap2.keySet().iterator();
                while (it10.hasNext()) {
                    iIntValue3 = ((Integer) it10.next()).intValue();
                    set2 = this.zzb;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it11.hasNext()) {
                            zzesVar = (com.google.android.gms.internal.measurement.zzes) it11.next();
                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                zzef zzefVarZzj4 = this.zzs.zzay().zzj();
                                Integer numValueOf113 = Integer.valueOf(iIntValue3);
                                if (zzesVar.zzj()) {
                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzefVarZzj4.zzd("Evaluating filter. audience, filter, property", numValueOf113, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                            }
                            if (zzesVar.zzj() || zzesVar.zza() > 256) {
                                zzef zzefVarZzk4 = this.zzs.zzay().zzk();
                                Object objZzn4 = zzeh.zzn(this.zza);
                                if (zzesVar.zzj()) {
                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzefVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf5));
                                this.zzb.add(Integer.valueOf(iIntValue3));
                            } else {
                                zzyVar = new zzy(this, this.zza, iIntValue3, zzesVar);
                                zZzd2 = zzyVar.zzd(this.zzd, this.zze, zzghVar3, zzf(iIntValue3, zzesVar.zza()));
                                if (zZzd2) {
                                    zzd(Integer.valueOf(iIntValue3)).zzc(zzyVar);
                                } else {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue3));
                        }
                    }
                }
            }
        }
        arrayList3 = new ArrayList();
        Set setKeySet3 = this.zzc.keySet();
        setKeySet3.removeAll(this.zzb);
        it8 = setKeySet3.iterator();
        while (it8.hasNext()) {
            int iIntValue9 = ((Integer) it8.next()).intValue();
            Map map11 = this.zzc;
            Integer numValueOf114 = Integer.valueOf(iIntValue9);
            zzt zztVar3 = (zzt) map11.get(numValueOf114);
            Preconditions.checkNotNull(zztVar3);
            com.google.android.gms.internal.measurement.zzfk zzfkVarZza3 = zztVar3.zza(iIntValue9);
            arrayList3.add(zzfkVarZza3);
            zzakVarZzi2 = this.zzf.zzi();
            str13 = this.zza;
            com.google.android.gms.internal.measurement.zzgd zzgdVarZzd3 = zzfkVarZza3.zzd();
            zzakVarZzi2.zzW();
            zzakVarZzi2.zzg();
            Preconditions.checkNotEmpty(str13);
            Preconditions.checkNotNull(zzgdVarZzd3);
            byte[] bArrZzbq3 = zzgdVarZzd3.zzbq();
            contentValues = new ContentValues();
            contentValues.put("app_id", str13);
            String str216 = str6;
            contentValues.put(str216, numValueOf114);
            String str217 = str12;
            contentValues.put(str217, bArrZzbq3);
            if (zzakVarZzi2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzakVarZzi2.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str13));
            }
            str12 = str217;
            str6 = str216;
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }
}
