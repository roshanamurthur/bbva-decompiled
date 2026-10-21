package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.AnimationKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzmt;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import kotlin.time.DurationKt;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkp implements zzgm {
    private static volatile zzkp zzb;
    private long zzA;
    private final Map zzB;
    private zzid zzC;
    private String zzD;

    @VisibleForTesting
    long zza;
    private final zzfi zzc;
    private final zzen zzd;
    private zzak zze;
    private zzep zzf;
    private zzkd zzg;
    private zzz zzh;
    private final zzkr zzi;
    private zzib zzj;
    private zzjm zzk;
    private final zzkg zzl;
    private zzez zzm;
    private final zzfr zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzkv zzE = new zzkm(this);

    public zzkp(zzkq zzkqVar, zzfr zzfrVar) {
        Preconditions.checkNotNull(zzkqVar);
        this.zzn = zzfr.zzp(zzkqVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkg(this);
        zzkr zzkrVar = new zzkr(this);
        zzkrVar.zzX();
        this.zzi = zzkrVar;
        zzen zzenVar = new zzen(this);
        zzenVar.zzX();
        this.zzd = zzenVar;
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzX();
        this.zzc = zzfiVar;
        this.zzB = new HashMap();
        zzaz().zzp(new zzkh(this, zzkqVar));
    }

    @VisibleForTesting
    public static final void zzZ(com.google.android.gms.internal.measurement.zzfn zzfnVar, int i10, String str) {
        List listZzp = zzfnVar.zzp();
        for (int i11 = 0; i11 < listZzp.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfs) listZzp.get(i11)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
        zzfrVarZze.zzj("_err");
        zzfrVarZze.zzi(Long.valueOf(i10).longValue());
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzfrVarZze.zzay();
        com.google.android.gms.internal.measurement.zzfr zzfrVarZze2 = com.google.android.gms.internal.measurement.zzfs.zze();
        zzfrVarZze2.zzj("_ev");
        zzfrVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfs zzfsVar2 = (com.google.android.gms.internal.measurement.zzfs) zzfrVarZze2.zzay();
        zzfnVar.zzf(zzfsVar);
        zzfnVar.zzf(zzfsVar2);
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfn zzfnVar, @NonNull String str) {
        List listZzp = zzfnVar.zzp();
        for (int i10 = 0; i10 < listZzp.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfs) listZzp.get(i10)).zzg())) {
                zzfnVar.zzh(i10);
                return;
            }
        }
    }

    @WorkerThread
    private final zzp zzab(String str) {
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzg zzgVarZzj = zzakVar.zzj(str);
        if (zzgVarZzj == null || TextUtils.isEmpty(zzgVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzac = zzac(zzgVarZzj);
        if (boolZzac == null || boolZzac.booleanValue()) {
            return new zzp(str, zzgVarZzj.zzy(), zzgVarZzj.zzw(), zzgVarZzj.zzb(), zzgVarZzj.zzv(), zzgVarZzj.zzm(), zzgVarZzj.zzj(), (String) null, zzgVarZzj.zzah(), false, zzgVarZzj.zzx(), zzgVarZzj.zza(), 0L, 0, zzgVarZzj.zzag(), false, zzgVarZzj.zzr(), zzgVarZzj.zzq(), zzgVarZzj.zzk(), zzgVarZzj.zzB(), (String) null, zzh(str).zzh());
        }
        zzay().zzd().zzb("App version does not match; dropping. appId", zzeh.zzn(str));
        return null;
    }

    @WorkerThread
    private final Boolean zzac(zzg zzgVar) {
        try {
            if (zzgVar.zzb() != -2147483648L) {
                if (zzgVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzgVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzgVar.zzt(), 0).versionName;
                String strZzw = zzgVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final void zzad() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzae(com.google.android.gms.internal.measurement.zzfx zzfxVar, long j10, boolean z10) {
        zzku zzkuVar;
        String str = true != z10 ? "_lte" : "_se";
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzku zzkuVarZzp = zzakVar.zzp(zzfxVar.zzak(), str);
        if (zzkuVarZzp == null || zzkuVarZzp.zze == null) {
            zzkuVar = new zzku(zzfxVar.zzak(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(j10));
        } else {
            zzkuVar = new zzku(zzfxVar.zzak(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzkuVarZzp.zze).longValue() + j10));
        }
        com.google.android.gms.internal.measurement.zzgg zzggVarZzd = com.google.android.gms.internal.measurement.zzgh.zzd();
        zzggVarZzd.zzf(str);
        zzggVarZzd.zzg(zzav().currentTimeMillis());
        zzggVarZzd.zze(((Long) zzkuVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzggVarZzd.zzay();
        int iZza = zzkr.zza(zzfxVar, str);
        if (iZza >= 0) {
            zzfxVar.zzah(iZza, zzghVar);
        } else {
            zzfxVar.zzl(zzghVar);
        }
        if (j10 > 0) {
            zzak zzakVar2 = this.zze;
            zzak(zzakVar2);
            zzakVar2.zzL(zzkuVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", zzkuVar.zze);
        }
    }

    @WorkerThread
    private final void zzaf() {
        long jMax;
        long jMax2;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkd zzkdVar = this.zzg;
                zzak(zzkdVar);
                zzkdVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzah()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkd zzkdVar2 = this.zzg;
            zzak(zzkdVar2);
            zzkdVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax3 = Math.max(0L, ((Long) zzdu.zzz.zza(null)).longValue());
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        boolean z10 = true;
        if (!zzakVar.zzH()) {
            zzak zzakVar2 = this.zze;
            zzak(zzakVar2);
            if (!zzakVar2.zzG()) {
                z10 = false;
            }
        }
        if (z10) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzt.zza(null)).longValue());
            } else {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            jMax = Math.max(0L, ((Long) zzdu.zzs.zza(null)).longValue());
        }
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzak zzakVar3 = this.zze;
        zzak(zzakVar3);
        boolean z11 = z10;
        long jZzd = zzakVar3.zzd();
        zzak zzakVar4 = this.zze;
        zzak(zzakVar4);
        long jMax4 = Math.max(jZzd, zzakVar4.zze());
        if (jMax4 != 0) {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z11 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            zzkr zzkrVar = this.zzi;
            zzak(zzkrVar);
            if (!zzkrVar.zzw(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    zzg();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) zzdu.zzB.zza(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzg();
                    jMax2 += Math.max(0L, ((Long) zzdu.zzA.zza(null)).longValue()) * (1 << i10);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            jMax2 = 0;
            break;
        }
        if (jMax2 == 0) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkd zzkdVar3 = this.zzg;
            zzak(zzkdVar3);
            zzkdVar3.zza();
            return;
        }
        zzen zzenVar = this.zzd;
        zzak(zzenVar);
        if (!zzenVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkd zzkdVar4 = this.zzg;
            zzak(zzkdVar4);
            zzkdVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzdu.zzq.zza(null)).longValue());
        zzkr zzkrVar2 = this.zzi;
        zzak(zzkrVar2);
        if (!zzkrVar2.zzw(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax2 - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzdu.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkd zzkdVar5 = this.zzg;
        zzak(zzkdVar5);
        zzkdVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0378 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0390 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x03a9 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03bf A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d1 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ea A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x041a  */
    /* JADX WARN: Code duplicated, block: B:134:0x041f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0420 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0431  */
    /* JADX WARN: Code duplicated, block: B:140:0x0438 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0442 A[Catch: all -> 0x00e9, LOOP:3: B:138:0x0432->B:142:0x0442, LOOP_END, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x046c A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x047d  */
    /* JADX WARN: Code duplicated, block: B:158:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:160:0x04c2 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x04d0 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0513  */
    /* JADX WARN: Code duplicated, block: B:184:0x0569 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0574 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x057a A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0583  */
    /* JADX WARN: Code duplicated, block: B:291:0x08e4 A[PHI: r8
      0x08e4: PHI (r8v19 com.google.android.gms.measurement.internal.zzaq) = (r8v18 com.google.android.gms.measurement.internal.zzaq), (r8v31 com.google.android.gms.measurement.internal.zzaq) binds: [B:287:0x088e, B:289:0x08a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:378:0x0b7c A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:330:0x0a09, B:263:0x07c0, B:265:0x07d7, B:271:0x07f3, B:273:0x0817, B:274:0x081f, B:276:0x0825, B:278:0x0837, B:285:0x0861, B:286:0x0884, B:288:0x0890, B:290:0x08a5, B:292:0x08e6, B:296:0x08fe, B:298:0x0905, B:300:0x0914, B:302:0x0918, B:304:0x091c, B:306:0x0920, B:307:0x092c, B:308:0x0931, B:310:0x0937, B:312:0x0953, B:313:0x0958, B:329:0x0a06, B:314:0x0972, B:316:0x097a, B:320:0x09a1, B:322:0x09cd, B:324:0x09db, B:326:0x09ef, B:328:0x09f9, B:317:0x0987, B:283:0x084b, B:269:0x07de, B:331:0x0a14, B:333:0x0a21, B:334:0x0a27, B:335:0x0a2f, B:337:0x0a35, B:340:0x0a4f, B:342:0x0a60, B:362:0x0ad4, B:364:0x0ada, B:366:0x0af2, B:369:0x0af9, B:374:0x0b28, B:376:0x0b6a, B:379:0x0b9f, B:380:0x0ba3, B:381:0x0bae, B:383:0x0bf1, B:384:0x0bfe, B:386:0x0c0d, B:390:0x0c27, B:392:0x0c40, B:378:0x0b7c, B:370:0x0b01, B:372:0x0b0d, B:373:0x0b11, B:393:0x0c58, B:394:0x0c70, B:397:0x0c78, B:398:0x0c7d, B:399:0x0c8d, B:401:0x0ca7, B:402:0x0cc2, B:403:0x0ccb, B:408:0x0cea, B:407:0x0cd7, B:343:0x0a78, B:345:0x0a7e, B:347:0x0a88, B:349:0x0a8f, B:355:0x0a9f, B:357:0x0aa6, B:359:0x0ac5, B:361:0x0acc, B:360:0x0ac9, B:356:0x0aa3, B:348:0x0a8c, B:205:0x05d5, B:207:0x05db, B:411:0x0cfc), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ce  */
    @WorkerThread
    private final boolean zzag(String str, long j10) {
        int i10;
        int i11;
        com.google.android.gms.internal.measurement.zzfx zzfxVar;
        zzko zzkoVar;
        long j11;
        int iZzc;
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB;
        Long lValueOf;
        String str2;
        String str3;
        int i12;
        int i13;
        com.google.android.gms.internal.measurement.zzfx zzfxVar2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        com.google.android.gms.internal.measurement.zzfn zzfnVar2;
        com.google.android.gms.internal.measurement.zzfx zzfxVar3;
        int i14;
        int i15;
        com.google.android.gms.internal.measurement.zzfn zzfnVar3;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        String strZzh;
        int iCharCount;
        int iCodePointAt;
        byte b10;
        String str4 = "_npa";
        String str5 = "_ai";
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzakVar.zzw();
        try {
            zzko zzkoVar2 = new zzko(this, null);
            zzak zzakVar2 = this.zze;
            zzak(zzakVar2);
            zzakVar2.zzU(null, j10, this.zzA, zzkoVar2);
            List list = zzkoVar2.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzfx zzfxVar4 = (com.google.android.gms.internal.measurement.zzfx) zzkoVar2.zza.zzbt();
                zzfxVar4.zzp();
                com.google.android.gms.internal.measurement.zzfn zzfnVar4 = null;
                com.google.android.gms.internal.measurement.zzfn zzfnVar5 = null;
                int i19 = 0;
                int i20 = 0;
                int i21 = -1;
                int i22 = -1;
                int i23 = 0;
                while (true) {
                    i10 = i23;
                    i11 = i20;
                    com.google.android.gms.internal.measurement.zzfn zzfnVar6 = zzfnVar4;
                    if (i19 >= zzkoVar2.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfn zzfnVar7 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfo) zzkoVar2.zzc.get(i19)).zzbt();
                    zzfi zzfiVar = this.zzc;
                    zzak(zzfiVar);
                    String str6 = str4;
                    if (zzfiVar.zzo(zzkoVar2.zza.zzy(), zzfnVar7.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(zzkoVar2.zza.zzy()), this.zzn.zzj().zzd(zzfnVar7.zzo()));
                        zzfi zzfiVar2 = this.zzc;
                        zzak(zzfiVar2);
                        if (!zzfiVar2.zzm(zzkoVar2.zza.zzy())) {
                            zzfi zzfiVar3 = this.zzc;
                            zzak(zzfiVar3);
                            if (!zzfiVar3.zzp(zzkoVar2.zza.zzy()) && !"_err".equals(zzfnVar7.zzo())) {
                                zzv().zzM(this.zzE, zzkoVar2.zza.zzy(), 11, "_ev", zzfnVar7.zzo(), 0);
                            }
                        }
                        str2 = str5;
                        zzfxVar3 = zzfxVar4;
                        i15 = i19;
                        i23 = i10;
                        i20 = i11;
                        zzfnVar4 = zzfnVar6;
                    } else {
                        if (zzfnVar7.zzo().equals(zzgo.zza(str5))) {
                            zzfnVar7.zzi(str5);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i24 = 0;
                                while (i24 < zzfnVar7.zza()) {
                                    String str7 = str5;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfnVar7.zzn(i24).zzg()) && !TextUtils.isEmpty(zzfnVar7.zzn(i24).zzh()) && "admob".equalsIgnoreCase(zzfnVar7.zzn(i24).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i24++;
                                    str5 = str7;
                                }
                            }
                        }
                        str2 = str5;
                        zzfi zzfiVar4 = this.zzc;
                        zzak(zzfiVar4);
                        boolean zZzn = zzfiVar4.zzn(zzkoVar2.zza.zzy(), zzfnVar7.zzo());
                        if (zZzn) {
                            str3 = "_et";
                            i12 = i19;
                            i13 = i21;
                        } else {
                            zzak(this.zzi);
                            String strZzo = zzfnVar7.zzo();
                            Preconditions.checkNotEmpty(strZzo);
                            i12 = i19;
                            int iHashCode = strZzo.hashCode();
                            i13 = i21;
                            str3 = "_et";
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strZzo.equals("_ui")) {
                                        b10 = 1;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (strZzo.equals("_ug")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strZzo.equals("_in")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            if (b10 != 0 && b10 != 1 && b10 != 2) {
                                zzfxVar2 = zzfxVar4;
                                zzfnVar = zzfnVar5;
                                i22 = i22;
                                zZzn = false;
                            }
                            if (zZzn) {
                                arrayList = new ArrayList(zzfnVar7.zzp());
                                i17 = -1;
                                i18 = -1;
                                for (i16 = 0; i16 < arrayList.size(); i16++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i16)).zzg())) {
                                        i17 = i16;
                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i16)).zzg())) {
                                        i18 = i16;
                                    }
                                }
                                if (i17 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i17)).zzw() || ((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i17)).zzu()) {
                                        if (i18 == -1) {
                                            strZzh = ((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i18)).zzh();
                                            if (strZzh.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strZzh.length()) {
                                                    iCodePointAt = strZzh.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        zzfnVar7.zzh(i17);
                                        zzaa(zzfnVar7, "_c");
                                        zzZ(zzfnVar7, 19, "currency");
                                        break;
                                    }
                                    zzay().zzl().zza("Value must be specified with a numeric type.");
                                    zzfnVar7.zzh(i17);
                                    zzaa(zzfnVar7, "_c");
                                    zzZ(zzfnVar7, 18, "value");
                                }
                            }
                            if ("_e".equals(zzfnVar7.zzo())) {
                                zzak(this.zzi);
                                if (zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay(), "_fr") != null) {
                                    zzfxVar3 = zzfxVar2;
                                    i21 = i13;
                                    zzfnVar5 = zzfnVar;
                                } else if (zzfnVar != null || Math.abs(zzfnVar.zzc() - zzfnVar7.zzc()) > 1000) {
                                    zzfxVar3 = zzfxVar2;
                                    zzfnVar6 = zzfnVar7;
                                    i21 = i11;
                                    zzfnVar5 = zzfnVar;
                                } else {
                                    com.google.android.gms.internal.measurement.zzfn zzfnVar8 = (com.google.android.gms.internal.measurement.zzfn) zzfnVar.clone();
                                    if (zzai(zzfnVar7, zzfnVar8)) {
                                        zzfxVar3 = zzfxVar2;
                                        zzfxVar3.zzO(i22, zzfnVar8);
                                        i21 = i13;
                                        zzfnVar3 = null;
                                        zzfnVar5 = null;
                                    } else {
                                        zzfxVar3 = zzfxVar2;
                                        zzfnVar3 = zzfnVar7;
                                        i21 = i11;
                                        zzfnVar5 = zzfnVar;
                                    }
                                    zzfnVar6 = zzfnVar3;
                                    i22 = i22;
                                }
                            } else {
                                zzfxVar3 = zzfxVar2;
                                if ("_vs".equals(zzfnVar7.zzo())) {
                                    zzak(this.zzi);
                                    if (zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay(), str3) == null) {
                                        if (zzfnVar6 != null || Math.abs(zzfnVar6.zzc() - zzfnVar7.zzc()) > 1000) {
                                            i21 = i13;
                                            zzfnVar5 = zzfnVar7;
                                            i22 = i11;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar9 = (com.google.android.gms.internal.measurement.zzfn) zzfnVar6.clone();
                                            if (zzai(zzfnVar9, zzfnVar7)) {
                                                i14 = i13;
                                                zzfxVar3.zzO(i14, zzfnVar9);
                                                i22 = i22;
                                                zzfnVar5 = null;
                                                zzfnVar6 = null;
                                            } else {
                                                i14 = i13;
                                                zzfnVar5 = zzfnVar7;
                                                i22 = i11;
                                            }
                                            i21 = i14;
                                        }
                                    }
                                }
                                i21 = i13;
                                zzfnVar5 = zzfnVar;
                            }
                            i15 = i12;
                            zzkoVar2.zzc.set(i15, (com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay());
                            i20 = i11 + 1;
                            zzfxVar3.zzj(zzfnVar7);
                            i23 = i10;
                            zzfnVar4 = zzfnVar6;
                        }
                        int i25 = 0;
                        boolean z10 = false;
                        boolean z11 = false;
                        while (true) {
                            zzfxVar2 = zzfxVar4;
                            if (i25 >= zzfnVar7.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfnVar7.zzn(i25).zzg())) {
                                com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzfnVar7.zzn(i25).zzbt();
                                zzfnVar2 = zzfnVar5;
                                zzfrVar.zzi(1L);
                                zzfnVar7.zzk(i25, (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzay());
                                z10 = true;
                            } else {
                                zzfnVar2 = zzfnVar5;
                                if (NotificationMessage.NOTIF_KEY_REQUEST_ID.equals(zzfnVar7.zzn(i25).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) zzfnVar7.zzn(i25).zzbt();
                                    zzfrVar2.zzi(1L);
                                    zzfnVar7.zzk(i25, (com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzay());
                                    z11 = true;
                                }
                            }
                            i25++;
                            zzfxVar4 = zzfxVar2;
                            zzfnVar5 = zzfnVar2;
                        }
                        zzfnVar = zzfnVar5;
                        if (!z10 && zZzn) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfnVar7.zzo()));
                            com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze.zzj("_c");
                            zzfrVarZze.zzi(1L);
                            zzfnVar7.zze(zzfrVarZze);
                        }
                        if (!z11) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfnVar7.zzo()));
                            com.google.android.gms.internal.measurement.zzfr zzfrVarZze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze2.zzj(NotificationMessage.NOTIF_KEY_REQUEST_ID);
                            zzfrVarZze2.zzi(1L);
                            zzfnVar7.zze(zzfrVarZze2);
                        }
                        zzak zzakVar3 = this.zze;
                        zzak(zzakVar3);
                        i22 = i22;
                        if (zzakVar3.zzl(zza(), zzkoVar2.zza.zzy(), false, false, false, false, true).zze > zzg().zze(zzkoVar2.zza.zzy(), zzdu.zzn)) {
                            zzaa(zzfnVar7, NotificationMessage.NOTIF_KEY_REQUEST_ID);
                        } else {
                            i10 = 1;
                        }
                        if (zzkw.zzah(zzfnVar7.zzo()) && zZzn) {
                            zzak zzakVar4 = this.zze;
                            zzak(zzakVar4);
                            if (zzakVar4.zzl(zza(), zzkoVar2.zza.zzy(), false, false, true, false, false).zzc > zzg().zze(zzkoVar2.zza.zzy(), zzdu.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(zzkoVar2.zza.zzy()));
                                com.google.android.gms.internal.measurement.zzfr zzfrVar3 = null;
                                boolean z12 = false;
                                int i26 = -1;
                                for (int i27 = 0; i27 < zzfnVar7.zza(); i27++) {
                                    com.google.android.gms.internal.measurement.zzfs zzfsVarZzn = zzfnVar7.zzn(i27);
                                    if ("_c".equals(zzfsVarZzn.zzg())) {
                                        zzfrVar3 = (com.google.android.gms.internal.measurement.zzfr) zzfsVarZzn.zzbt();
                                        i26 = i27;
                                    } else if ("_err".equals(zzfsVarZzn.zzg())) {
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    if (zzfrVar3 != null) {
                                        zzfnVar7.zzh(i26);
                                    } else {
                                        zzfrVar3 = null;
                                        if (zzfrVar3 != null) {
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar4 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar3.clone();
                                            zzfrVar4.zzj("_err");
                                            zzfrVar4.zzi(10L);
                                            zzfnVar7.zzk(i26, (com.google.android.gms.internal.measurement.zzfs) zzfrVar4.zzay());
                                        } else {
                                            zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkoVar2.zza.zzy()));
                                        }
                                    }
                                } else if (zzfrVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfr zzfrVar5 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar3.clone();
                                    zzfrVar5.zzj("_err");
                                    zzfrVar5.zzi(10L);
                                    zzfnVar7.zzk(i26, (com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzay());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkoVar2.zza.zzy()));
                                }
                            }
                        }
                        if (zZzn) {
                            arrayList = new ArrayList(zzfnVar7.zzp());
                            i17 = -1;
                            i18 = -1;
                            while (i16 < arrayList.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i16)).zzg())) {
                                    i17 = i16;
                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i16)).zzg())) {
                                    i18 = i16;
                                }
                            }
                            if (i17 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i17)).zzw()) {
                                }
                                if (i18 == -1) {
                                    strZzh = ((com.google.android.gms.internal.measurement.zzfs) arrayList.get(i18)).zzh();
                                    if (strZzh.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strZzh.length()) {
                                            iCodePointAt = strZzh.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                zzfnVar7.zzh(i17);
                                zzaa(zzfnVar7, "_c");
                                zzZ(zzfnVar7, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(zzfnVar7.zzo())) {
                            zzak(this.zzi);
                            if (zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay(), "_fr") != null) {
                                if (zzfnVar != null) {
                                }
                                zzfxVar3 = zzfxVar2;
                                zzfnVar6 = zzfnVar7;
                                i21 = i11;
                                zzfnVar5 = zzfnVar;
                            } else {
                                zzfxVar3 = zzfxVar2;
                                i21 = i13;
                                zzfnVar5 = zzfnVar;
                            }
                        } else {
                            zzfxVar3 = zzfxVar2;
                            if ("_vs".equals(zzfnVar7.zzo())) {
                                zzak(this.zzi);
                                if (zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay(), str3) == null) {
                                    if (zzfnVar6 != null) {
                                        i21 = i13;
                                        zzfnVar5 = zzfnVar7;
                                        i22 = i11;
                                    } else {
                                        i21 = i13;
                                        zzfnVar5 = zzfnVar7;
                                        i22 = i11;
                                    }
                                }
                            }
                            i21 = i13;
                            zzfnVar5 = zzfnVar;
                        }
                        i15 = i12;
                        zzkoVar2.zzc.set(i15, (com.google.android.gms.internal.measurement.zzfo) zzfnVar7.zzay());
                        i20 = i11 + 1;
                        zzfxVar3.zzj(zzfnVar7);
                        i23 = i10;
                        zzfnVar4 = zzfnVar6;
                    }
                    i19 = i15 + 1;
                    zzfxVar4 = zzfxVar3;
                    str4 = str6;
                    str5 = str2;
                }
                String str8 = str4;
                com.google.android.gms.internal.measurement.zzfx zzfxVar5 = zzfxVar4;
                long jLongValue = 0;
                int i28 = i11;
                int i29 = 0;
                while (i29 < i28) {
                    com.google.android.gms.internal.measurement.zzfo zzfoVarZze = zzfxVar5.zze(i29);
                    if ("_e".equals(zzfoVarZze.zzh())) {
                        zzak(this.zzi);
                        if (zzkr.zzB(zzfoVarZze, "_fr") != null) {
                            zzfxVar5.zzw(i29);
                            i28--;
                            i29--;
                        } else {
                            zzak(this.zzi);
                            zzfsVarZzB = zzkr.zzB(zzfoVarZze, "_et");
                            if (zzfsVarZzB != null) {
                                if (zzfsVarZzB.zzw()) {
                                    lValueOf = Long.valueOf(zzfsVarZzB.zzd());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf != null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        zzak(this.zzi);
                        zzfsVarZzB = zzkr.zzB(zzfoVarZze, "_et");
                        if (zzfsVarZzB != null) {
                            if (zzfsVarZzB.zzw()) {
                                lValueOf = Long.valueOf(zzfsVarZzB.zzd());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                jLongValue += lValueOf.longValue();
                            }
                        }
                    }
                    i29++;
                }
                zzae(zzfxVar5, jLongValue, false);
                Iterator it = zzfxVar5.zzam().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzfo) it.next()).zzh())) {
                        zzak zzakVar5 = this.zze;
                        zzak(zzakVar5);
                        zzakVar5.zzA(zzfxVar5.zzak(), "_se");
                        break;
                    }
                }
                if (zzkr.zza(zzfxVar5, NotificationMessage.NOTIF_KEY_SID) >= 0) {
                    zzae(zzfxVar5, jLongValue, true);
                } else {
                    int iZza = zzkr.zza(zzfxVar5, "_se");
                    if (iZza >= 0) {
                        zzfxVar5.zzx(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(zzkoVar2.zza.zzy()));
                    }
                }
                zzkr zzkrVar = this.zzi;
                zzak(zzkrVar);
                zzkrVar.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfi zzfiVar5 = zzkrVar.zzf.zzc;
                zzak(zzfiVar5);
                if (zzfiVar5.zzk(zzfxVar5.zzak())) {
                    zzak zzakVar6 = zzkrVar.zzf.zze;
                    zzak(zzakVar6);
                    zzg zzgVarZzj = zzakVar6.zzj(zzfxVar5.zzak());
                    if (zzgVarZzj != null && zzgVarZzj.zzag() && zzkrVar.zzs.zzg().zze()) {
                        zzkrVar.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgg zzggVarZzd = com.google.android.gms.internal.measurement.zzgh.zzd();
                        zzggVarZzd.zzf(str8);
                        zzggVarZzd.zzg(zzkrVar.zzs.zzg().zza());
                        zzggVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzggVarZzd.zzay();
                        int i30 = 0;
                        while (true) {
                            if (i30 >= zzfxVar5.zzb()) {
                                zzfxVar5.zzl(zzghVar);
                                break;
                            }
                            if (str8.equals(zzfxVar5.zzaj(i30).zzf())) {
                                zzfxVar5.zzah(i30, zzghVar);
                                break;
                            }
                            i30++;
                        }
                    }
                }
                zzfxVar5.zzad(Long.MAX_VALUE);
                zzfxVar5.zzN(Long.MIN_VALUE);
                for (int i31 = 0; i31 < zzfxVar5.zza(); i31++) {
                    com.google.android.gms.internal.measurement.zzfo zzfoVarZze2 = zzfxVar5.zze(i31);
                    if (zzfoVarZze2.zzd() < zzfxVar5.zzd()) {
                        zzfxVar5.zzad(zzfoVarZze2.zzd());
                    }
                    if (zzfoVarZze2.zzd() > zzfxVar5.zzc()) {
                        zzfxVar5.zzN(zzfoVarZze2.zzd());
                    }
                }
                zzfxVar5.zzv();
                zzfxVar5.zzn();
                zzz zzzVar = this.zzh;
                zzak(zzzVar);
                zzfxVar5.zzf(zzzVar.zza(zzfxVar5.zzak(), zzfxVar5.zzam(), zzfxVar5.zzan(), Long.valueOf(zzfxVar5.zzd()), Long.valueOf(zzfxVar5.zzc())));
                if (zzg().zzw(zzkoVar2.zza.zzy())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzF = zzv().zzF();
                    int i32 = 0;
                    while (i32 < zzfxVar5.zza()) {
                        com.google.android.gms.internal.measurement.zzfn zzfnVar10 = (com.google.android.gms.internal.measurement.zzfn) zzfxVar5.zze(i32).zzbt();
                        if (zzfnVar10.zzo().equals("_ep")) {
                            zzak(this.zzi);
                            String str9 = (String) zzkr.zzC((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay(), "_en");
                            zzaq zzaqVarZzn = (zzaq) map.get(str9);
                            if (zzaqVarZzn == null) {
                                zzak zzakVar7 = this.zze;
                                zzak(zzakVar7);
                                zzaqVarZzn = zzakVar7.zzn(zzkoVar2.zza.zzy(), (String) Preconditions.checkNotNull(str9));
                                if (zzaqVarZzn != null) {
                                    map.put(str9, zzaqVarZzn);
                                }
                            }
                            if (zzaqVarZzn != null && zzaqVarZzn.zzi == null) {
                                Long l6 = zzaqVarZzn.zzj;
                                if (l6 != null && l6.longValue() > 1) {
                                    zzak(this.zzi);
                                    zzkr.zzz(zzfnVar10, "_sr", zzaqVarZzn.zzj);
                                }
                                Boolean bool = zzaqVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzak(this.zzi);
                                    zzkr.zzz(zzfnVar10, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay());
                            }
                            zzfxVar5.zzO(i32, zzfnVar10);
                        } else {
                            zzfi zzfiVar6 = this.zzc;
                            zzak(zzfiVar6);
                            String strZzy = zzkoVar2.zza.zzy();
                            String strZza = zzfiVar6.zza(strZzy, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j11 = 0;
                            } else {
                                try {
                                    j11 = Long.parseLong(strZza);
                                } catch (NumberFormatException e5) {
                                    zzfiVar6.zzs.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(strZzy), e5);
                                    j11 = 0;
                                }
                            }
                            long jZzr = zzv().zzr(zzfnVar10.zzc(), j11);
                            com.google.android.gms.internal.measurement.zzfo zzfoVar = (com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay();
                            Long l7 = 1L;
                            long j12 = j11;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it2 = zzfoVar.zzi().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it2.next();
                                        Iterator it3 = it2;
                                        if ("_dbg".equals(zzfsVar.zzg())) {
                                            if (l7.equals(Long.valueOf(zzfsVar.zzd()))) {
                                                iZzc = 1;
                                                break;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                    zzfi zzfiVar7 = this.zzc;
                                    zzak(zzfiVar7);
                                    iZzc = zzfiVar7.zzc(zzkoVar2.zza.zzy(), zzfnVar10.zzo());
                                    break;
                                }
                            }
                            zzfi zzfiVar8 = this.zzc;
                            zzak(zzfiVar8);
                            iZzc = zzfiVar8.zzc(zzkoVar2.zza.zzy(), zzfnVar10.zzo());
                            break;
                            if (iZzc <= 0) {
                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfnVar10.zzo(), Integer.valueOf(iZzc));
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay());
                                zzfxVar5.zzO(i32, zzfnVar10);
                            } else {
                                zzaq zzaqVarZza = (zzaq) map.get(zzfnVar10.zzo());
                                if (zzaqVarZza == null) {
                                    zzak zzakVar8 = this.zze;
                                    zzak(zzakVar8);
                                    zzaqVarZza = zzakVar8.zzn(zzkoVar2.zza.zzy(), zzfnVar10.zzo());
                                    if (zzaqVarZza == null) {
                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkoVar2.zza.zzy(), zzfnVar10.zzo());
                                        zzaqVarZza = new zzaq(zzkoVar2.zza.zzy(), zzfnVar10.zzo(), 1L, 1L, 1L, zzfnVar10.zzc(), 0L, null, null, null, null);
                                    }
                                }
                                zzak(this.zzi);
                                Long l10 = (Long) zzkr.zzC((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay(), "_eid");
                                Boolean boolValueOf = Boolean.valueOf(l10 != null);
                                if (iZzc == 1) {
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay());
                                    if (boolValueOf.booleanValue() && (zzaqVarZza.zzi != null || zzaqVarZza.zzj != null || zzaqVarZza.zzk != null)) {
                                        map.put(zzfnVar10.zzo(), zzaqVarZza.zza(null, null, null));
                                    }
                                    zzfxVar5.zzO(i32, zzfnVar10);
                                } else {
                                    if (secureRandomZzF.nextInt(iZzc) == 0) {
                                        zzak(this.zzi);
                                        Long lValueOf2 = Long.valueOf(iZzc);
                                        zzkr.zzz(zzfnVar10, "_sr", lValueOf2);
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay());
                                        if (boolValueOf.booleanValue()) {
                                            zzaqVarZza = zzaqVarZza.zza(null, lValueOf2, null);
                                        }
                                        map.put(zzfnVar10.zzo(), zzaqVarZza.zzb(zzfnVar10.zzc(), jZzr));
                                        zzkoVar2 = zzkoVar2;
                                    } else {
                                        Long l11 = zzaqVarZza.zzh;
                                        if ((l11 != null ? l11.longValue() : zzv().zzr(zzfnVar10.zzb(), j12)) != jZzr) {
                                            zzak(this.zzi);
                                            zzkr.zzz(zzfnVar10, "_efs", 1L);
                                            zzak(this.zzi);
                                            Long lValueOf3 = Long.valueOf(iZzc);
                                            zzkr.zzz(zzfnVar10, "_sr", lValueOf3);
                                            arrayList2.add((com.google.android.gms.internal.measurement.zzfo) zzfnVar10.zzay());
                                            map.put(zzfnVar10.zzo(), (boolValueOf.booleanValue() ? zzaqVarZza.zza(null, lValueOf3, Boolean.TRUE) : zzaqVarZza).zzb(zzfnVar10.zzc(), jZzr));
                                        } else {
                                            zzaq zzaqVar = zzaqVarZza;
                                            if (boolValueOf.booleanValue()) {
                                                map.put(zzfnVar10.zzo(), zzaqVar.zza(l10, null, null));
                                            }
                                        }
                                        i32 = i32;
                                    }
                                    zzfxVar5.zzO(i32, zzfnVar10);
                                }
                                i32++;
                                zzfxVar5 = zzfxVar5;
                                secureRandomZzF = secureRandomZzF;
                                zzkoVar2 = zzkoVar2;
                            }
                        }
                        zzkoVar2 = zzkoVar2;
                        secureRandomZzF = secureRandomZzF;
                        zzfxVar5 = zzfxVar5;
                        i32++;
                        zzfxVar5 = zzfxVar5;
                        secureRandomZzF = secureRandomZzF;
                        zzkoVar2 = zzkoVar2;
                    }
                    zzfxVar = zzfxVar5;
                    zzko zzkoVar3 = zzkoVar2;
                    if (arrayList2.size() < zzfxVar.zza()) {
                        zzfxVar.zzp();
                        zzfxVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        zzak zzakVar9 = this.zze;
                        zzak(zzakVar9);
                        zzakVar9.zzE((zzaq) entry.getValue());
                    }
                    zzkoVar = zzkoVar3;
                } else {
                    zzfxVar = zzfxVar5;
                    zzkoVar = zzkoVar2;
                }
                String strZzy2 = zzkoVar.zza.zzy();
                zzak zzakVar10 = this.zze;
                zzak(zzakVar10);
                zzg zzgVarZzj2 = zzakVar10.zzj(strZzy2);
                if (zzgVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(zzkoVar.zza.zzy()));
                } else if (zzfxVar.zza() > 0) {
                    long jZzn = zzgVarZzj2.zzn();
                    if (jZzn != 0) {
                        zzfxVar.zzX(jZzn);
                    } else {
                        zzfxVar.zzs();
                    }
                    long jZzp = zzgVarZzj2.zzp();
                    if (jZzp != 0) {
                        jZzn = jZzp;
                    }
                    if (jZzn != 0) {
                        zzfxVar.zzY(jZzn);
                    } else {
                        zzfxVar.zzt();
                    }
                    zzgVarZzj2.zzD();
                    zzfxVar.zzF((int) zzgVarZzj2.zzo());
                    zzgVarZzj2.zzab(zzfxVar.zzd());
                    zzgVarZzj2.zzZ(zzfxVar.zzc());
                    String strZzs = zzgVarZzj2.zzs();
                    if (strZzs != null) {
                        zzfxVar.zzS(strZzs);
                    } else {
                        zzfxVar.zzq();
                    }
                    zzak zzakVar11 = this.zze;
                    zzak(zzakVar11);
                    zzakVar11.zzD(zzgVarZzj2);
                }
                if (zzfxVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfi zzfiVar9 = this.zzc;
                    zzak(zzfiVar9);
                    com.google.android.gms.internal.measurement.zzfc zzfcVarZze = zzfiVar9.zze(zzkoVar.zza.zzy());
                    if (zzfcVarZze != null && zzfcVarZze.zzq()) {
                        zzfxVar.zzH(zzfcVarZze.zzc());
                    } else if (TextUtils.isEmpty(zzkoVar.zza.zzG())) {
                        zzfxVar.zzH(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeh.zzn(zzkoVar.zza.zzy()));
                    }
                    zzak zzakVar12 = this.zze;
                    zzak(zzakVar12);
                    com.google.android.gms.internal.measurement.zzfy zzfyVar = (com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay();
                    zzakVar12.zzg();
                    zzakVar12.zzW();
                    Preconditions.checkNotNull(zzfyVar);
                    Preconditions.checkNotEmpty(zzfyVar.zzy());
                    Preconditions.checkState(zzfyVar.zzba());
                    zzakVar12.zzz();
                    long jCurrentTimeMillis = zzakVar12.zzs.zzav().currentTimeMillis();
                    long jZzm = zzfyVar.zzm();
                    zzakVar12.zzs.zzf();
                    if (jZzm >= jCurrentTimeMillis - zzaf.zzA()) {
                        long jZzm2 = zzfyVar.zzm();
                        zzakVar12.zzs.zzf();
                        if (jZzm2 > zzaf.zzA() + jCurrentTimeMillis) {
                            zzakVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzfyVar.zzy()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzfyVar.zzm()));
                        }
                    } else {
                        zzakVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzfyVar.zzy()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzfyVar.zzm()));
                    }
                    byte[] bArrZzbq = zzfyVar.zzbq();
                    try {
                        zzkr zzkrVar2 = zzakVar12.zzf.zzi;
                        zzak(zzkrVar2);
                        byte[] bArrZzy = zzkrVar2.zzy(bArrZzbq);
                        zzakVar12.zzs.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", zzfyVar.zzy());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzfyVar.zzm()));
                        contentValues.put("data", bArrZzy);
                        contentValues.put("has_realtime", Integer.valueOf(i10));
                        if (zzfyVar.zzbg()) {
                            contentValues.put("retry_count", Integer.valueOf(zzfyVar.zze()));
                        }
                        try {
                            if (zzakVar12.zzh().insert("queue", null, contentValues) == -1) {
                                zzakVar12.zzs.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(zzfyVar.zzy()));
                            }
                        } catch (SQLiteException e7) {
                            zzakVar12.zzs.zzay().zzd().zzc("Error storing bundle. appId", zzeh.zzn(zzfyVar.zzy()), e7);
                        }
                    } catch (IOException e10) {
                        zzakVar12.zzs.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeh.zzn(zzfyVar.zzy()), e10);
                    }
                }
                zzak zzakVar13 = this.zze;
                zzak(zzakVar13);
                List list2 = zzkoVar.zzb;
                Preconditions.checkNotNull(list2);
                zzakVar13.zzg();
                zzakVar13.zzW();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                for (int i33 = 0; i33 < list2.size(); i33++) {
                    if (i33 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) list2.get(i33)).longValue());
                }
                sb2.append(")");
                int iDelete = zzakVar13.zzh().delete("raw_events", sb2.toString(), null);
                if (iDelete != list2.size()) {
                    zzakVar13.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzak zzakVar14 = this.zze;
                zzak(zzakVar14);
                try {
                    zzakVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzy2, strZzy2});
                } catch (SQLiteException e11) {
                    zzakVar14.zzs.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(strZzy2), e11);
                }
                zzak zzakVar15 = this.zze;
                zzak(zzakVar15);
                zzakVar15.zzC();
                zzak zzakVar16 = this.zze;
                zzak(zzakVar16);
                zzakVar16.zzx();
                return true;
            }
            zzak zzakVar17 = this.zze;
            zzak(zzakVar17);
            zzakVar17.zzC();
            zzak zzakVar18 = this.zze;
            zzak(zzakVar18);
            zzakVar18.zzx();
            return false;
        } catch (Throwable th2) {
            zzak zzakVar19 = this.zze;
            zzak(zzakVar19);
            zzakVar19.zzx();
            throw th2;
        }
    }

    private final boolean zzah() {
        zzaz().zzg();
        zzB();
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        if (zzakVar.zzF()) {
            return true;
        }
        zzak zzakVar2 = this.zze;
        zzak(zzakVar2);
        return !TextUtils.isEmpty(zzakVar2.zzr());
    }

    private final boolean zzai(com.google.android.gms.internal.measurement.zzfn zzfnVar, com.google.android.gms.internal.measurement.zzfn zzfnVar2) {
        Preconditions.checkArgument("_e".equals(zzfnVar.zzo()));
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB = zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar.zzay(), "_sc");
        String strZzh = zzfsVarZzB == null ? null : zzfsVarZzB.zzh();
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB2 = zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar2.zzay(), "_pc");
        String strZzh2 = zzfsVarZzB2 != null ? zzfsVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfnVar.zzo()));
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB3 = zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar.zzay(), "_et");
        if (zzfsVarZzB3 == null || !zzfsVarZzB3.zzw() || zzfsVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfsVarZzB3.zzd();
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB4 = zzkr.zzB((com.google.android.gms.internal.measurement.zzfo) zzfnVar2.zzay(), "_et");
        if (zzfsVarZzB4 != null && zzfsVarZzB4.zzd() > 0) {
            jZzd += zzfsVarZzB4.zzd();
        }
        zzak(this.zzi);
        zzkr.zzz(zzfnVar2, "_et", Long.valueOf(jZzd));
        zzak(this.zzi);
        zzkr.zzz(zzfnVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzaj(zzp zzpVar) {
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    private static final zzkf zzak(zzkf zzkfVar) {
        if (zzkfVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkfVar.zzY()) {
            return zzkfVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkfVar.getClass())));
    }

    public static zzkp zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkp.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzkp((zzkq) Preconditions.checkNotNull(new zzkq(context)), null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzkp zzkpVar, zzkq zzkqVar) {
        zzkpVar.zzaz().zzg();
        zzkpVar.zzm = new zzez(zzkpVar);
        zzak zzakVar = new zzak(zzkpVar);
        zzakVar.zzX();
        zzkpVar.zze = zzakVar;
        zzkpVar.zzg().zzq((zzae) Preconditions.checkNotNull(zzkpVar.zzc));
        zzjm zzjmVar = new zzjm(zzkpVar);
        zzjmVar.zzX();
        zzkpVar.zzk = zzjmVar;
        zzz zzzVar = new zzz(zzkpVar);
        zzzVar.zzX();
        zzkpVar.zzh = zzzVar;
        zzib zzibVar = new zzib(zzkpVar);
        zzibVar.zzX();
        zzkpVar.zzj = zzibVar;
        zzkd zzkdVar = new zzkd(zzkpVar);
        zzkdVar.zzX();
        zzkpVar.zzg = zzkdVar;
        zzkpVar.zzf = new zzep(zzkpVar);
        if (zzkpVar.zzr != zzkpVar.zzs) {
            zzkpVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzkpVar.zzr), Integer.valueOf(zzkpVar.zzs));
        }
        zzkpVar.zzo = true;
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzY()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i11 = fileChannel.read(byteBufferAllocate);
                    if (i11 == 4) {
                        byteBufferAllocate.flip();
                        i10 = byteBufferAllocate.getInt();
                    } else if (i11 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i11));
                    }
                } catch (IOException e5) {
                    zzay().zzd().zzb("Failed to read from channel", e5);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i10 > iZzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iZzi));
                return;
            }
            if (i10 < iZzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        zzg().zzs(null, zzdu.zzaf);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iZzi));
                        return;
                    } catch (IOException e7) {
                        zzay().zzd().zzb("Failed to write to channel", e7);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iZzi));
            }
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @WorkerThread
    public final void zzC(zzg zzgVar) {
        zzaz().zzg();
        if (TextUtils.isEmpty(zzgVar.zzy()) && TextUtils.isEmpty(zzgVar.zzr())) {
            zzH((String) Preconditions.checkNotNull(zzgVar.zzt()), 204, null, null, null);
            return;
        }
        zzkg zzkgVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzgVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzgVar.zzr();
        }
        ArrayMap arrayMap = null;
        Uri.Builder builderEncodedAuthority = builder.scheme((String) zzdu.zzd.zza(null)).encodedAuthority((String) zzdu.zze.zza(null));
        String strValueOf = String.valueOf(strZzy);
        Uri.Builder builderAppendQueryParameter = builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", zzgVar.zzu()).appendQueryParameter(k.a.f65035b, "android");
        zzkgVar.zzs.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(55005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzgVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfi zzfiVar = this.zzc;
            zzak(zzfiVar);
            com.google.android.gms.internal.measurement.zzfc zzfcVarZze = zzfiVar.zze(str);
            zzfi zzfiVar2 = this.zzc;
            zzak(zzfiVar2);
            String strZzf = zzfiVar2.zzf(str);
            if (zzfcVarZze != null && !TextUtils.isEmpty(strZzf)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", strZzf);
            }
            this.zzt = true;
            zzen zzenVar = this.zzd;
            zzak(zzenVar);
            zzkj zzkjVar = new zzkj(this);
            zzenVar.zzg();
            zzenVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkjVar);
            zzenVar.zzs.zzaz().zzo(new zzem(zzenVar, str, url, null, arrayMap, zzkjVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(zzgVar.zzt()), string);
        }
    }

    @WorkerThread
    public final void zzD(zzau zzauVar, zzp zzpVar) {
        zzau zzauVar2;
        List<zzab> listZzt;
        List<zzab> listZzt2;
        List<zzab> listZzt3;
        String str;
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzpVar.zza;
        zzau zzauVarZza = zzauVar;
        long j10 = zzauVarZza.zzd;
        zzpb.zzc();
        zzid zzidVar = null;
        if (zzg().zzs(null, zzdu.zzat)) {
            zzei zzeiVarZzb = zzei.zzb(zzauVar);
            zzaz().zzg();
            if (this.zzC != null && (str = this.zzD) != null && str.equals(str2)) {
                zzidVar = this.zzC;
            }
            zzkw.zzJ(zzidVar, zzeiVarZzb.zzd, false);
            zzauVarZza = zzeiVarZzb.zza();
        }
        zzak(this.zzi);
        if (zzkr.zzA(zzauVarZza, zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            List list = zzpVar.zzt;
            if (list == null) {
                zzauVar2 = zzauVarZza;
            } else if (!list.contains(zzauVarZza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzauVarZza.zza, zzauVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzauVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzauVar2 = new zzau(zzauVarZza.zza, new zzas(bundleZzc), zzauVarZza.zzc, zzauVarZza.zzd);
            }
            zzak zzakVar = this.zze;
            zzak(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzak(zzakVar2);
                Preconditions.checkNotEmpty(str2);
                zzakVar2.zzg();
                zzakVar2.zzW();
                if (j10 < 0) {
                    zzakVar2.zzs.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(str2), Long.valueOf(j10));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzakVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (zzab zzabVar : listZzt) {
                    if (zzabVar != null) {
                        zzay().zzj().zzd("User property timed out", zzabVar.zza, this.zzn.zzj().zzf(zzabVar.zzc.zzb), zzabVar.zzc.zza());
                        zzau zzauVar3 = zzabVar.zzg;
                        if (zzauVar3 != null) {
                            zzX(new zzau(zzauVar3, j10), zzpVar);
                        }
                        zzak zzakVar3 = this.zze;
                        zzak(zzakVar3);
                        zzakVar3.zza(str2, zzabVar.zzc.zzb);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzak(zzakVar4);
                Preconditions.checkNotEmpty(str2);
                zzakVar4.zzg();
                zzakVar4.zzW();
                if (j10 < 0) {
                    zzakVar4.zzs.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(str2), Long.valueOf(j10));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzakVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzab zzabVar2 : listZzt2) {
                    if (zzabVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzabVar2.zza, this.zzn.zzj().zzf(zzabVar2.zzc.zzb), zzabVar2.zzc.zza());
                        zzak zzakVar5 = this.zze;
                        zzak(zzakVar5);
                        zzakVar5.zzA(str2, zzabVar2.zzc.zzb);
                        zzau zzauVar4 = zzabVar2.zzk;
                        if (zzauVar4 != null) {
                            arrayList.add(zzauVar4);
                        }
                        zzak zzakVar6 = this.zze;
                        zzak(zzakVar6);
                        zzakVar6.zza(str2, zzabVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzX(new zzau((zzau) it.next(), j10), zzpVar);
                }
                zzak zzakVar7 = this.zze;
                zzak(zzakVar7);
                String str3 = zzauVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzakVar7.zzg();
                zzakVar7.zzW();
                if (j10 < 0) {
                    zzakVar7.zzs.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(str2), zzakVar7.zzs.zzj().zzd(str3), Long.valueOf(j10));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzakVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzab zzabVar3 : listZzt3) {
                    if (zzabVar3 != null) {
                        zzks zzksVar = zzabVar3.zzc;
                        zzku zzkuVar = new zzku((String) Preconditions.checkNotNull(zzabVar3.zza), zzabVar3.zzb, zzksVar.zzb, j10, Preconditions.checkNotNull(zzksVar.zza()));
                        zzak zzakVar8 = this.zze;
                        zzak(zzakVar8);
                        if (zzakVar8.zzL(zzkuVar)) {
                            zzay().zzj().zzd("User property triggered", zzabVar3.zza, this.zzn.zzj().zzf(zzkuVar.zzc), zzkuVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzeh.zzn(zzabVar3.zza), this.zzn.zzj().zzf(zzkuVar.zzc), zzkuVar.zze);
                        }
                        zzau zzauVar5 = zzabVar3.zzi;
                        if (zzauVar5 != null) {
                            arrayList2.add(zzauVar5);
                        }
                        zzabVar3.zzc = new zzks(zzkuVar);
                        zzabVar3.zze = true;
                        zzak zzakVar9 = this.zze;
                        zzak(zzakVar9);
                        zzakVar9.zzK(zzabVar3);
                    }
                }
                zzX(zzauVar2, zzpVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzX(new zzau((zzau) it2.next(), j10), zzpVar);
                }
                zzak zzakVar10 = this.zze;
                zzak(zzakVar10);
                zzakVar10.zzC();
            } finally {
                zzak zzakVar11 = this.zze;
                zzak(zzakVar11);
                zzakVar11.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzE(zzau zzauVar, String str) {
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzg zzgVarZzj = zzakVar.zzj(str);
        if (zzgVarZzj == null || TextUtils.isEmpty(zzgVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzac = zzac(zzgVarZzj);
        if (boolZzac == null) {
            if (!"_ui".equals(zzauVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(str));
            }
        } else if (!boolZzac.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(str));
            return;
        }
        zzF(zzauVar, new zzp(str, zzgVarZzj.zzy(), zzgVarZzj.zzw(), zzgVarZzj.zzb(), zzgVarZzj.zzv(), zzgVarZzj.zzm(), zzgVarZzj.zzj(), (String) null, zzgVarZzj.zzah(), false, zzgVarZzj.zzx(), zzgVarZzj.zza(), 0L, 0, zzgVarZzj.zzag(), false, zzgVarZzj.zzr(), zzgVarZzj.zzq(), zzgVarZzj.zzk(), zzgVarZzj.zzB(), (String) null, zzh(str).zzh()));
    }

    @WorkerThread
    public final void zzF(zzau zzauVar, zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzei zzeiVarZzb = zzei.zzb(zzauVar);
        zzkw zzkwVarZzv = zzv();
        Bundle bundle = zzeiVarZzb.zzd;
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzkwVarZzv.zzK(bundle, zzakVar.zzi(zzpVar.zza));
        zzv().zzL(zzeiVarZzb, zzg().zzd(zzpVar.zza));
        zzau zzauVarZza = zzeiVarZzb.zza();
        if ("_cmp".equals(zzauVarZza.zza) && "referrer API v2".equals(zzauVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzauVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzV(new zzks("_lgclid", zzauVarZza.zzd, strZzg, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
            }
        }
        zzD(zzauVarZza, zzpVar);
    }

    public final void zzG() {
        this.zzs++;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r8
      0x0047: PHI (r8v11 int) = (r8v2 int), (r8v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:8:0x0030, B:18:0x004e, B:65:0x0165, B:25:0x006b, B:30:0x00bd, B:29:0x00ae, B:33:0x00c5, B:36:0x00d1, B:38:0x00d7, B:43:0x00e4, B:55:0x0119, B:57:0x012e, B:59:0x014d, B:61:0x0158, B:63:0x015e, B:64:0x0162, B:58:0x013c, B:49:0x00fd, B:51:0x0108), top: B:71:0x0030, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:8:0x0030, B:18:0x004e, B:65:0x0165, B:25:0x006b, B:30:0x00bd, B:29:0x00ae, B:33:0x00c5, B:36:0x00d1, B:38:0x00d7, B:43:0x00e4, B:55:0x0119, B:57:0x012e, B:59:0x014d, B:61:0x0158, B:63:0x015e, B:64:0x0162, B:58:0x013c, B:49:0x00fd, B:51:0x0108), top: B:71:0x0030, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0162 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:8:0x0030, B:18:0x004e, B:65:0x0165, B:25:0x006b, B:30:0x00bd, B:29:0x00ae, B:33:0x00c5, B:36:0x00d1, B:38:0x00d7, B:43:0x00e4, B:55:0x0119, B:57:0x012e, B:59:0x014d, B:61:0x0158, B:63:0x015e, B:64:0x0162, B:58:0x013c, B:49:0x00fd, B:51:0x0108), top: B:71:0x0030, outer: #1 }] */
    @VisibleForTesting
    @WorkerThread
    public final void zzH(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        boolean z10;
        zzak zzakVar;
        zzen zzenVar;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzt = false;
                zzad();
                throw th3;
            }
        }
        zzef zzefVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzefVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzak zzakVar2 = this.zze;
        zzak(zzakVar2);
        zzakVar2.zzw();
        try {
            zzak zzakVar3 = this.zze;
            zzak(zzakVar3);
            zzg zzgVarZzj = zzakVar3.zzj(str);
            if (i10 == 200 || i10 == 204) {
                if (th2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 == 304) {
                i10 = 304;
                if (th2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (zzgVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(str));
            } else {
                if (z10 || i10 == 404) {
                    List list = map != null ? (List) map.get("Last-Modified") : null;
                    String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
                    if (i10 == 404 || i10 == 304) {
                        zzfi zzfiVar = this.zzc;
                        zzak(zzfiVar);
                        if (zzfiVar.zze(str) == null) {
                            zzfi zzfiVar2 = this.zzc;
                            zzak(zzfiVar2);
                            if (!zzfiVar2.zzq(str, null, null)) {
                                zzakVar = this.zze;
                                zzak(zzakVar);
                            }
                        }
                        zzgVarZzj.zzL(zzav().currentTimeMillis());
                        zzak zzakVar4 = this.zze;
                        zzak(zzakVar4);
                        zzakVar4.zzD(zzgVarZzj);
                        if (i10 == 404) {
                            zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), numValueOf);
                        }
                        zzenVar = this.zzd;
                        zzak(zzenVar);
                        if (zzenVar.zza() || !zzah()) {
                            zzaf();
                        } else {
                            zzW();
                        }
                    } else {
                        zzfi zzfiVar3 = this.zzc;
                        zzak(zzfiVar3);
                        if (zzfiVar3.zzq(str, bArr, str2)) {
                            zzgVarZzj.zzL(zzav().currentTimeMillis());
                            zzak zzakVar5 = this.zze;
                            zzak(zzakVar5);
                            zzakVar5.zzD(zzgVarZzj);
                            if (i10 == 404) {
                                zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                            } else {
                                zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), numValueOf);
                            }
                            zzenVar = this.zzd;
                            zzak(zzenVar);
                            if (zzenVar.zza()) {
                                zzaf();
                            } else {
                                zzaf();
                            }
                        } else {
                            zzakVar = this.zze;
                            zzak(zzakVar);
                        }
                    }
                    zzakVar.zzx();
                    this.zzt = false;
                    zzad();
                }
                zzgVarZzj.zzU(zzav().currentTimeMillis());
                zzak zzakVar6 = this.zze;
                zzak(zzakVar6);
                zzakVar6.zzD(zzgVarZzj);
                zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i10), th2);
                zzfi zzfiVar4 = this.zzc;
                zzak(zzfiVar4);
                zzfiVar4.zzi(str);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 == 503 || i10 == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzaf();
            }
            zzak zzakVar7 = this.zze;
            zzak(zzakVar7);
            zzakVar7.zzC();
            zzakVar = this.zze;
            zzak(zzakVar);
            zzakVar.zzx();
            this.zzt = false;
            zzad();
        } catch (Throwable th4) {
            zzak zzakVar8 = this.zze;
            zzak(zzakVar8);
            zzakVar8.zzx();
            throw th4;
        }
    }

    public final void zzI(boolean z10) {
        zzaf();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #2 {all -> 0x00a1, blocks: (B:15:0x0062, B:16:0x0066, B:18:0x006c, B:19:0x0072, B:20:0x008e, B:23:0x0099, B:24:0x00a0, B:28:0x00a4, B:29:0x00b3, B:31:0x00b5, B:33:0x00b9, B:36:0x00c0, B:37:0x00c1), top: B:62:0x0062, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[Catch: all -> 0x0010, SQLiteException -> 0x00e8, TryCatch #0 {SQLiteException -> 0x00e8, blocks: (B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc), top: B:60:0x0029, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x0010, PHI: r9
      0x0128: PHI (r9v18 int) = (r9v2 int), (r9v0 int) binds: [B:13:0x0027, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0128, B:55:0x015f, B:54:0x0150, B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc, B:49:0x00fd), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[Catch: all -> 0x0010, TryCatch #1 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0128, B:55:0x015f, B:54:0x0150, B:14:0x0029, B:38:0x00c9, B:40:0x00de, B:42:0x00e4, B:46:0x00f1, B:45:0x00ea, B:47:0x00f4, B:48:0x00fc, B:49:0x00fd), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0098 A[SYNTHETIC] */
    @VisibleForTesting
    @WorkerThread
    public final void zzJ(int i10, Throwable th2, byte[] bArr, String str) {
        zzen zzenVar;
        zzak zzakVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzu = false;
                zzad();
                throw th3;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i10 == 200) {
            if (th2 == null) {
                try {
                    this.zzk.zzc.zzb(zzav().currentTimeMillis());
                    this.zzk.zzd.zzb(0L);
                    zzaf();
                    zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                    zzak zzakVar2 = this.zze;
                    zzak(zzakVar2);
                    zzakVar2.zzw();
                    try {
                        for (Long l6 : list) {
                            try {
                                zzakVar = this.zze;
                                zzak(zzakVar);
                                jLongValue = l6.longValue();
                                zzakVar.zzg();
                                zzakVar.zzW();
                                try {
                                    if (zzakVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e5) {
                                    zzakVar.zzs.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e5);
                                    throw e5;
                                }
                            } catch (SQLiteException e7) {
                                List list2 = this.zzz;
                                if (list2 == null || !list2.contains(l6)) {
                                    throw e7;
                                }
                            }
                        }
                        zzak zzakVar3 = this.zze;
                        zzak(zzakVar3);
                        zzakVar3.zzC();
                        zzak zzakVar4 = this.zze;
                        zzak(zzakVar4);
                        zzakVar4.zzx();
                        this.zzz = null;
                        zzenVar = this.zzd;
                        zzak(zzenVar);
                        if (zzenVar.zza() || !zzah()) {
                            this.zzA = -1L;
                            zzaf();
                        } else {
                            zzW();
                        }
                        this.zza = 0L;
                    } catch (Throwable th4) {
                        zzak zzakVar5 = this.zze;
                        zzak(zzakVar5);
                        zzakVar5.zzx();
                        throw th4;
                    }
                } catch (SQLiteException e10) {
                    zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e10);
                    this.zza = zzav().elapsedRealtime();
                    zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th2);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 != 503 || i10 == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzak zzakVar6 = this.zze;
                zzak(zzakVar6);
                zzakVar6.zzy(list);
                zzaf();
            }
        } else if (i10 == 204) {
            i10 = 204;
            if (th2 == null) {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzaf();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                zzak zzakVar7 = this.zze;
                zzak(zzakVar7);
                zzakVar7.zzw();
                while (r9.hasNext()) {
                    zzakVar = this.zze;
                    zzak(zzakVar);
                    jLongValue = l6.longValue();
                    zzakVar.zzg();
                    zzakVar.zzW();
                    if (zzakVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                zzak zzakVar8 = this.zze;
                zzak(zzakVar8);
                zzakVar8.zzC();
                zzak zzakVar9 = this.zze;
                zzak(zzakVar9);
                zzakVar9.zzx();
                this.zzz = null;
                zzenVar = this.zzd;
                zzak(zzenVar);
                if (zzenVar.zza()) {
                    this.zzA = -1L;
                    zzaf();
                } else {
                    this.zzA = -1L;
                    zzaf();
                }
                this.zza = 0L;
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th2);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 != 503) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                } else {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzak zzakVar10 = this.zze;
                zzak(zzakVar10);
                zzakVar10.zzy(list);
                zzaf();
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th2);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i10 != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            } else {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzak zzakVar11 = this.zze;
            zzak(zzakVar11);
            zzakVar11.zzy(list);
            zzaf();
        }
        this.zzu = false;
        zzad();
    }

    /* JADX WARN: Code duplicated, block: B:158:0x048c  */
    @WorkerThread
    public final void zzK(zzp zzpVar) {
        String str;
        String str2;
        zzaq zzaqVarZzn;
        boolean z10;
        PackageInfo packageInfo;
        int i10;
        ApplicationInfo applicationInfo;
        long j10;
        boolean z11;
        String str3 = "_pfo";
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        if (zzaj(zzpVar)) {
            zzak zzakVar = this.zze;
            zzak(zzakVar);
            zzg zzgVarZzj = zzakVar.zzj(zzpVar.zza);
            if (zzgVarZzj != null && TextUtils.isEmpty(zzgVarZzj.zzy()) && !TextUtils.isEmpty(zzpVar.zzb)) {
                zzgVarZzj.zzL(0L);
                zzak zzakVar2 = this.zze;
                zzak(zzakVar2);
                zzakVar2.zzD(zzgVarZzj);
                zzfi zzfiVar = this.zzc;
                zzak(zzfiVar);
                zzfiVar.zzj(zzpVar.zza);
            }
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            long jCurrentTimeMillis = zzpVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i11 = zzpVar.zzn;
            if (i11 != 0 && i11 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzpVar.zza), Integer.valueOf(i11));
                i11 = 0;
            }
            zzak zzakVar3 = this.zze;
            zzak(zzakVar3);
            zzakVar3.zzw();
            try {
                zzak zzakVar4 = this.zze;
                zzak(zzakVar4);
                zzku zzkuVarZzp = zzakVar4.zzp(zzpVar.zza, "_npa");
                if (zzkuVarZzp != null && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(zzkuVarZzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                } else if (zzpVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    zzks zzksVar = new zzks("_npa", jCurrentTimeMillis, Long.valueOf(true != zzpVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    if (zzkuVarZzp == null || !zzkuVarZzp.zze.equals(zzksVar.zzd)) {
                        zzV(zzksVar, zzpVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    if (zzkuVarZzp != null) {
                        zzO(new zzks("_npa", jCurrentTimeMillis, null, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
                    }
                }
                zzak zzakVar5 = this.zze;
                zzak(zzakVar5);
                zzg zzgVarZzj2 = zzakVar5.zzj((String) Preconditions.checkNotNull(zzpVar.zza));
                if (zzgVarZzj2 != null && zzv().zzam(zzpVar.zzb, zzgVarZzj2.zzy(), zzpVar.zzq, zzgVarZzj2.zzr())) {
                    zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(zzgVarZzj2.zzt()));
                    zzak zzakVar6 = this.zze;
                    zzak(zzakVar6);
                    String strZzt = zzgVarZzj2.zzt();
                    zzakVar6.zzW();
                    zzakVar6.zzg();
                    Preconditions.checkNotEmpty(strZzt);
                    try {
                        SQLiteDatabase sQLiteDatabaseZzh = zzakVar6.zzh();
                        String[] strArr = {strZzt};
                        int iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                        if (iDelete > 0) {
                            zzakVar6.zzs.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e5) {
                        zzakVar6.zzs.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(strZzt), e5);
                    }
                    zzgVarZzj2 = null;
                }
                if (zzgVarZzj2 != null) {
                    boolean z12 = (zzgVarZzj2.zzb() == -2147483648L || zzgVarZzj2.zzb() == zzpVar.zzj) ? false : true;
                    String strZzw = zzgVarZzj2.zzw();
                    if (z12 | ((zzgVarZzj2.zzb() != -2147483648L || strZzw == null || strZzw.equals(zzpVar.zzc)) ? false : true)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", strZzw);
                        zzD(new zzau("_au", new zzas(bundle), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzpVar);
                    }
                }
                zzd(zzpVar);
                if (i11 == 0) {
                    zzak zzakVar7 = this.zze;
                    zzak(zzakVar7);
                    zzaqVarZzn = zzakVar7.zzn(zzpVar.zza, "_f");
                    z10 = false;
                } else {
                    zzak zzakVar8 = this.zze;
                    zzak(zzakVar8);
                    zzaqVarZzn = zzakVar8.zzn(zzpVar.zza, "_v");
                    z10 = true;
                }
                if (zzaqVarZzn == null) {
                    long j11 = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    if (z10) {
                        zzV(new zzks("_fvt", jCurrentTimeMillis, Long.valueOf(j11), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
                        zzaz().zzg();
                        zzB();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        bundle2.putLong("_et", 1L);
                        if (zzpVar.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        zzF(new zzau("_v", new zzas(bundle2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzpVar);
                    } else {
                        zzV(new zzks("_fot", jCurrentTimeMillis, Long.valueOf(j11), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
                        zzaz().zzg();
                        zzez zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                        String str4 = zzpVar.zza;
                        if (str4 == null || str4.isEmpty()) {
                            zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzezVar.zza.zzaz().zzg();
                            if (zzezVar.zza()) {
                                zzey zzeyVar = new zzey(zzezVar, str4);
                                zzezVar.zza.zzaz().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzezVar.zza.zzau().getPackageManager();
                                if (packageManager == null) {
                                    zzezVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzezVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str5 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str5) && zzezVar.zza()) {
                                                try {
                                                    try {
                                                        zzezVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzezVar.zza.zzau(), new Intent(intent), zzeyVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e7) {
                                                        e = e7;
                                                        zzezVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } catch (RuntimeException e10) {
                                                    e = e10;
                                                }
                                            } else {
                                                zzezVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzezVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                            }
                        }
                        zzaz().zzg();
                        zzB();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", 1L);
                        bundle3.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        bundle3.putLong("_uwa", 0L);
                        bundle3.putLong("_pfo", 0L);
                        String str6 = str2;
                        bundle3.putLong(str6, 0L);
                        String str7 = str;
                        bundle3.putLong(str7, 0L);
                        bundle3.putLong("_et", 1L);
                        if (zzpVar.zzp) {
                            bundle3.putLong("_dac", 1L);
                        }
                        String str8 = (String) Preconditions.checkNotNull(zzpVar.zza);
                        zzak zzakVar9 = this.zze;
                        zzak(zzakVar9);
                        Preconditions.checkNotEmpty(str8);
                        zzakVar9.zzg();
                        zzakVar9.zzW();
                        long jZzc = zzakVar9.zzc(str8, "first_open_count");
                        if (this.zzn.zzau().getPackageManager() == null) {
                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str8));
                            str3 = "_pfo";
                        } else {
                            try {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, 0);
                                } catch (PackageManager.NameNotFoundException e11) {
                                    e = e11;
                                    zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(str8), e);
                                    packageInfo = null;
                                }
                            } catch (PackageManager.NameNotFoundException e12) {
                                e = e12;
                            }
                            if (packageInfo != null) {
                                long j12 = packageInfo.firstInstallTime;
                                if (j12 != 0) {
                                    if (j12 != packageInfo.lastUpdateTime) {
                                        if (!zzg().zzs(null, zzdu.zzab)) {
                                            bundle3.putLong("_uwa", 1L);
                                        } else if (jZzc == 0) {
                                            bundle3.putLong("_uwa", 1L);
                                            z11 = false;
                                            jZzc = 0;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    i10 = 0;
                                    zzV(new zzks("_fi", jCurrentTimeMillis, Long.valueOf(true != z11 ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
                                } else {
                                    i10 = 0;
                                }
                            } else {
                                i10 = 0;
                            }
                            try {
                                applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str8, i10);
                            } catch (PackageManager.NameNotFoundException e13) {
                                zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(str8), e13);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    j10 = 1;
                                    bundle3.putLong(str6, 1L);
                                } else {
                                    j10 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle3.putLong(str7, j10);
                                }
                            }
                        }
                        if (jZzc >= 0) {
                            bundle3.putLong(str3, jZzc);
                        }
                        zzF(new zzau("_f", new zzas(bundle3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzpVar);
                    }
                } else if (zzpVar.zzi) {
                    zzF(new zzau("_cd", new zzas(new Bundle()), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzpVar);
                }
                zzak zzakVar10 = this.zze;
                zzak(zzakVar10);
                zzakVar10.zzC();
                zzak zzakVar11 = this.zze;
                zzak(zzakVar11);
                zzakVar11.zzx();
            } catch (Throwable th2) {
                zzak zzakVar12 = this.zze;
                zzak(zzakVar12);
                zzakVar12.zzx();
                throw th2;
            }
        }
    }

    public final void zzL() {
        this.zzr++;
    }

    @WorkerThread
    public final void zzM(zzab zzabVar) {
        zzp zzpVarZzab = zzab((String) Preconditions.checkNotNull(zzabVar.zza));
        if (zzpVarZzab != null) {
            zzN(zzabVar, zzpVarZzab);
        }
    }

    @WorkerThread
    public final void zzN(zzab zzabVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotEmpty(zzabVar.zza);
        Preconditions.checkNotNull(zzabVar.zzc);
        Preconditions.checkNotEmpty(zzabVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            zzak zzakVar = this.zze;
            zzak(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzpVar);
                String str = (String) Preconditions.checkNotNull(zzabVar.zza);
                zzak zzakVar2 = this.zze;
                zzak(zzakVar2);
                zzab zzabVarZzk = zzakVar2.zzk(str, zzabVar.zzc.zzb);
                if (zzabVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzabVar.zza, this.zzn.zzj().zzf(zzabVar.zzc.zzb));
                    zzak zzakVar3 = this.zze;
                    zzak(zzakVar3);
                    zzakVar3.zza(str, zzabVar.zzc.zzb);
                    if (zzabVarZzk.zze) {
                        zzak zzakVar4 = this.zze;
                        zzak(zzakVar4);
                        zzakVar4.zzA(str, zzabVar.zzc.zzb);
                    }
                    zzau zzauVar = zzabVar.zzk;
                    if (zzauVar != null) {
                        zzas zzasVar = zzauVar.zzb;
                        zzX((zzau) Preconditions.checkNotNull(zzv().zzz(str, ((zzau) Preconditions.checkNotNull(zzabVar.zzk)).zza, zzasVar != null ? zzasVar.zzc() : null, zzabVarZzk.zzb, zzabVar.zzk.zzd, true, true)), zzpVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeh.zzn(zzabVar.zza), this.zzn.zzj().zzf(zzabVar.zzc.zzb));
                }
                zzak zzakVar5 = this.zze;
                zzak(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzak(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzO(zzks zzksVar, zzp zzpVar) {
        zzaz().zzg();
        zzB();
        if (zzaj(zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            if ("_npa".equals(zzksVar.zzb) && zzpVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzV(new zzks("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzpVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzpVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzksVar.zzb));
            zzak zzakVar = this.zze;
            zzak(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzpVar);
                zzmt.zzc();
                if (this.zzn.zzf().zzs(null, zzdu.zzan) && this.zzn.zzf().zzs(null, zzdu.zzap) && CustomCursor.ID.equals(zzksVar.zzb)) {
                    zzak zzakVar2 = this.zze;
                    zzak(zzakVar2);
                    zzakVar2.zzA((String) Preconditions.checkNotNull(zzpVar.zza), "_lair");
                }
                zzak zzakVar3 = this.zze;
                zzak(zzakVar3);
                zzakVar3.zzA((String) Preconditions.checkNotNull(zzpVar.zza), zzksVar.zzb);
                zzak zzakVar4 = this.zze;
                zzak(zzakVar4);
                zzakVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzksVar.zzb));
            } finally {
                zzak zzakVar5 = this.zze;
                zzak(zzakVar5);
                zzakVar5.zzx();
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzP(zzp zzpVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        String str = (String) Preconditions.checkNotNull(zzpVar.zza);
        Preconditions.checkNotEmpty(str);
        zzakVar.zzg();
        zzakVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzakVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzakVar.zzs.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e5) {
            zzakVar.zzs.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(str), e5);
        }
        if (zzpVar.zzh) {
            zzK(zzpVar);
        }
    }

    @WorkerThread
    public final void zzQ(String str, zzid zzidVar) {
        zzaz().zzg();
        String str2 = this.zzD;
        if (str2 == null || str2.equals(str) || zzidVar != null) {
            this.zzD = str;
            this.zzC = zzidVar;
        }
    }

    @WorkerThread
    public final void zzR() {
        zzaz().zzg();
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzakVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzaf();
    }

    @WorkerThread
    public final void zzS(zzab zzabVar) {
        zzp zzpVarZzab = zzab((String) Preconditions.checkNotNull(zzabVar.zza));
        if (zzpVarZzab != null) {
            zzT(zzabVar, zzpVarZzab);
        }
    }

    @WorkerThread
    public final void zzT(zzab zzabVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotEmpty(zzabVar.zza);
        Preconditions.checkNotNull(zzabVar.zzb);
        Preconditions.checkNotNull(zzabVar.zzc);
        Preconditions.checkNotEmpty(zzabVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            zzab zzabVar2 = new zzab(zzabVar);
            boolean z10 = false;
            zzabVar2.zze = false;
            zzak zzakVar = this.zze;
            zzak(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzak(zzakVar2);
                zzab zzabVarZzk = zzakVar2.zzk((String) Preconditions.checkNotNull(zzabVar2.zza), zzabVar2.zzc.zzb);
                if (zzabVarZzk != null && !zzabVarZzk.zzb.equals(zzabVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzabVar2.zzc.zzb), zzabVar2.zzb, zzabVarZzk.zzb);
                }
                if (zzabVarZzk != null && zzabVarZzk.zze) {
                    zzabVar2.zzb = zzabVarZzk.zzb;
                    zzabVar2.zzd = zzabVarZzk.zzd;
                    zzabVar2.zzh = zzabVarZzk.zzh;
                    zzabVar2.zzf = zzabVarZzk.zzf;
                    zzabVar2.zzi = zzabVarZzk.zzi;
                    zzabVar2.zze = true;
                    zzks zzksVar = zzabVar2.zzc;
                    zzabVar2.zzc = new zzks(zzksVar.zzb, zzabVarZzk.zzc.zzc, zzksVar.zza(), zzabVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzabVar2.zzf)) {
                    zzks zzksVar2 = zzabVar2.zzc;
                    zzabVar2.zzc = new zzks(zzksVar2.zzb, zzabVar2.zzd, zzksVar2.zza(), zzabVar2.zzc.zzf);
                    zzabVar2.zze = true;
                    z10 = true;
                }
                if (zzabVar2.zze) {
                    zzks zzksVar3 = zzabVar2.zzc;
                    zzku zzkuVar = new zzku((String) Preconditions.checkNotNull(zzabVar2.zza), zzabVar2.zzb, zzksVar3.zzb, zzksVar3.zzc, Preconditions.checkNotNull(zzksVar3.zza()));
                    zzak zzakVar3 = this.zze;
                    zzak(zzakVar3);
                    if (zzakVar3.zzL(zzkuVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzabVar2.zza, this.zzn.zzj().zzf(zzkuVar.zzc), zzkuVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeh.zzn(zzabVar2.zza), this.zzn.zzj().zzf(zzkuVar.zzc), zzkuVar.zze);
                    }
                    if (z10 && zzabVar2.zzi != null) {
                        zzX(new zzau(zzabVar2.zzi, zzabVar2.zzd), zzpVar);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzak(zzakVar4);
                if (zzakVar4.zzK(zzabVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzabVar2.zza, this.zzn.zzj().zzf(zzabVar2.zzc.zzb), zzabVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzeh.zzn(zzabVar2.zza), this.zzn.zzj().zzf(zzabVar2.zzc.zzb), zzabVar2.zzc.zza());
                }
                zzak zzakVar5 = this.zze;
                zzak(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzak(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzU(String str, zzah zzahVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzahVar);
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzahVar);
        zzakVar.zzg();
        zzakVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzahVar.zzh());
        try {
            if (zzakVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzakVar.zzs.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e5) {
            zzakVar.zzs.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(str), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0110  */
    @WorkerThread
    public final void zzV(zzks zzksVar, zzp zzpVar) {
        zzaq zzaqVarZzn;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzaj(zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            int iZzl = zzv().zzl(zzksVar.zzb);
            int length = 0;
            if (iZzl != 0) {
                zzkw zzkwVarZzv = zzv();
                String str = zzksVar.zzb;
                zzg();
                String strZzC = zzkwVarZzv.zzC(str, 24, true);
                String str2 = zzksVar.zzb;
                zzv().zzM(this.zzE, zzpVar.zza, iZzl, "_ev", strZzC, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzksVar.zzb, zzksVar.zza());
            if (iZzd != 0) {
                zzkw zzkwVarZzv2 = zzv();
                String str3 = zzksVar.zzb;
                zzg();
                String strZzC2 = zzkwVarZzv2.zzC(str3, 24, true);
                Object objZza = zzksVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzv().zzM(this.zzE, zzpVar.zza, iZzd, "_ev", strZzC2, length);
                return;
            }
            Object objZzB = zzv().zzB(zzksVar.zzb, zzksVar.zza());
            if (objZzB == null) {
                return;
            }
            if (NotificationMessage.NOTIF_KEY_SID.equals(zzksVar.zzb)) {
                long j10 = zzksVar.zzc;
                String str4 = zzksVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzpVar.zza);
                zzak zzakVar = this.zze;
                zzak(zzakVar);
                zzku zzkuVarZzp = zzakVar.zzp(str5, "_sno");
                if (zzkuVarZzp != null) {
                    Object obj = zzkuVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzkuVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkuVarZzp.zze);
                        }
                        zzak zzakVar2 = this.zze;
                        zzak(zzakVar2);
                        zzaqVarZzn = zzakVar2.zzn(str5, "_s");
                        if (zzaqVarZzn != null) {
                            jLongValue = zzaqVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (zzkuVarZzp != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkuVarZzp.zze);
                    }
                    zzak zzakVar3 = this.zze;
                    zzak(zzakVar3);
                    zzaqVarZzn = zzakVar3.zzn(str5, "_s");
                    if (zzaqVarZzn != null) {
                        jLongValue = zzaqVarZzn.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                zzV(new zzks("_sno", j10, Long.valueOf(jLongValue + 1), str4), zzpVar);
            }
            zzku zzkuVar = new zzku((String) Preconditions.checkNotNull(zzpVar.zza), (String) Preconditions.checkNotNull(zzksVar.zzf), zzksVar.zzb, zzksVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzkuVar.zzc), objZzB);
            zzak zzakVar4 = this.zze;
            zzak(zzakVar4);
            zzakVar4.zzw();
            try {
                zzmt.zzc();
                if (this.zzn.zzf().zzs(null, zzdu.zzan) && CustomCursor.ID.equals(zzkuVar.zzc)) {
                    if (this.zzn.zzf().zzs(null, zzdu.zzaq)) {
                        zzak zzakVar5 = this.zze;
                        zzak(zzakVar5);
                        zzku zzkuVarZzp2 = zzakVar5.zzp(zzpVar.zza, CustomCursor.ID);
                        if (zzkuVarZzp2 != null && !zzkuVar.zze.equals(zzkuVarZzp2.zze)) {
                            zzak zzakVar6 = this.zze;
                            zzak(zzakVar6);
                            zzakVar6.zzA(zzpVar.zza, "_lair");
                        }
                    } else {
                        zzak zzakVar7 = this.zze;
                        zzak(zzakVar7);
                        zzakVar7.zzA(zzpVar.zza, "_lair");
                    }
                }
                zzd(zzpVar);
                zzak zzakVar8 = this.zze;
                zzak(zzakVar8);
                boolean zZzL = zzakVar8.zzL(zzkuVar);
                zzak zzakVar9 = this.zze;
                zzak(zzakVar9);
                zzakVar9.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzkuVar.zzc), zzkuVar.zze);
                    zzv().zzM(this.zzE, zzpVar.zza, 9, null, null, 0);
                }
            } finally {
                zzak zzakVar10 = this.zze;
                zzak(zzakVar10);
                zzakVar10.zzx();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020d A[Catch: all -> 0x01ab, SQLiteException -> 0x01f9, TryCatch #3 {SQLiteException -> 0x01f9, blocks: (B:88:0x01dd, B:90:0x01e3, B:91:0x01ed, B:93:0x01f3, B:99:0x01fc, B:101:0x0207, B:103:0x020d, B:104:0x0214, B:122:0x026f, B:106:0x0229, B:111:0x0240, B:115:0x0247, B:116:0x0256, B:121:0x025c), top: B:250:0x01dd }] */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x02b8 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c4 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f1 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0306 A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x031d A[Catch: all -> 0x0285, EDGE_INSN: B:162:0x0311->B:167:0x031d BREAK  A[LOOP:2: B:154:0x02eb->B:166:0x031a], PHI: r0
      0x031d: PHI (r0v45 java.util.List) = (r0v44 java.util.List), (r0v44 java.util.List), (r0v44 java.util.List), (r0v58 java.util.List) binds: [B:144:0x02c2, B:152:0x02e8, B:283:0x031d, B:162:0x0311] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0338 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0346  */
    /* JADX WARN: Code duplicated, block: B:175:0x035e A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0398 A[Catch: all -> 0x0285, TRY_ENTER, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x039d A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x03a5 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x03b4 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x03e7 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:197:0x0425 A[Catch: all -> 0x0285, MalformedURLException -> 0x0492, TryCatch #18 {MalformedURLException -> 0x0492, blocks: (B:195:0x0413, B:197:0x0425, B:199:0x043a, B:202:0x0446, B:203:0x044a, B:204:0x044e, B:198:0x0433), top: B:269:0x0413, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0433 A[Catch: all -> 0x0285, MalformedURLException -> 0x0492, TryCatch #18 {MalformedURLException -> 0x0492, blocks: (B:195:0x0413, B:197:0x0425, B:199:0x043a, B:202:0x0446, B:203:0x044a, B:204:0x044e, B:198:0x0433), top: B:269:0x0413, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0445  */
    /* JADX WARN: Code duplicated, block: B:234:0x0516 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0521 A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:141:0x02b2, B:143:0x02b8, B:145:0x02c4, B:146:0x02c8, B:148:0x02ce, B:150:0x02e2, B:154:0x02eb, B:156:0x02f1, B:159:0x0306, B:167:0x031d, B:169:0x0338, B:173:0x0347, B:175:0x035e, B:179:0x0398, B:181:0x039d, B:183:0x03a5, B:184:0x03a8, B:186:0x03b4, B:187:0x03ca, B:190:0x03d6, B:192:0x03e7, B:194:0x03f8, B:195:0x0413, B:197:0x0425, B:199:0x043a, B:203:0x044a, B:204:0x044e, B:198:0x0433, B:206:0x0492, B:127:0x0280, B:140:0x02af, B:208:0x04a6, B:209:0x04a9, B:210:0x04aa, B:215:0x04ea, B:232:0x0510, B:234:0x0516, B:236:0x0521, B:240:0x052c, B:241:0x052f, B:202:0x0446), top: B:252:0x00ef, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[LOOP:1: B:146:0x02c8->B:281:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0280 A[ADDED_TO_REGION, EDGE_INSN: B:291:0x0280->B:127:0x0280 BREAK  A[LOOP:4: B:84:0x01b9->B:126:0x0278], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x01e3 A[EDGE_INSN: B:293:0x01e3->B:90:0x01e3 BREAK  A[LOOP:5: B:250:0x01dd->B:111:0x0240], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0136 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:77:0x01a4, B:202:0x0446), top: B:260:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0 A[Catch: all -> 0x01ab, SQLiteException -> 0x01ae, TRY_LEAVE, TryCatch #5 {all -> 0x01ab, blocks: (B:74:0x019a, B:76:0x01a0, B:83:0x01b3, B:84:0x01b9, B:85:0x01bd, B:86:0x01c8, B:88:0x01dd, B:90:0x01e3, B:91:0x01ed, B:93:0x01f3, B:99:0x01fc, B:101:0x0207, B:103:0x020d, B:104:0x0214, B:122:0x026f, B:106:0x0229, B:111:0x0240, B:138:0x0296, B:115:0x0247, B:116:0x0256, B:121:0x025c), top: B:253:0x019a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3 A[Catch: all -> 0x01ab, SQLiteException -> 0x01ae, TRY_ENTER, TryCatch #5 {all -> 0x01ab, blocks: (B:74:0x019a, B:76:0x01a0, B:83:0x01b3, B:84:0x01b9, B:85:0x01bd, B:86:0x01c8, B:88:0x01dd, B:90:0x01e3, B:91:0x01ed, B:93:0x01f3, B:99:0x01fc, B:101:0x0207, B:103:0x020d, B:104:0x0214, B:122:0x026f, B:106:0x0229, B:111:0x0240, B:138:0x0296, B:115:0x0247, B:116:0x0256, B:121:0x025c), top: B:253:0x019a }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @WorkerThread
    public final void zzW() {
        boolean z10;
        zzg zzgVarZzj;
        int iZze;
        int iMax;
        zzak zzakVar;
        boolean z11;
        boolean z12;
        Cursor cursor;
        long j10;
        Cursor cursorQuery;
        List listEmptyList;
        com.google.android.gms.internal.measurement.zzfv zzfvVarZza;
        int size;
        ArrayList arrayList;
        boolean z13;
        boolean zZzi;
        boolean zZzi2;
        int i10;
        String strZzm;
        String str;
        com.google.android.gms.internal.measurement.zzfx zzfxVar;
        Iterator it;
        String strZzK;
        int i11;
        com.google.android.gms.internal.measurement.zzfy zzfyVar;
        com.google.android.gms.internal.measurement.zzfy zzfyVar2;
        ArrayList arrayList2;
        int length;
        long j11;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i12;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.zzfx zzfxVar2;
        Cursor cursorRawQuery;
        zzaz().zzg();
        zzB();
        int i13 = 1;
        this.zzv = true;
        Cursor cursorRawQuery2 = null;
        int i14 = 0;
        try {
            this.zzn.zzaw();
            Boolean boolZzj = this.zzn.zzt().zzj();
            if (boolZzj == null) {
                zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (boolZzj.booleanValue()) {
                zzay().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzaf();
                this.zzv = false;
            } else {
                zzaz().zzg();
                if (this.zzy != null) {
                    zzay().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzen zzenVar = this.zzd;
                    zzak(zzenVar);
                    if (zzenVar.zza()) {
                        long jCurrentTimeMillis = zzav().currentTimeMillis();
                        Cursor cursor2 = null;
                        Cursor cursor3 = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iZze2 = zzg().zze(null, zzdu.zzP);
                        zzg();
                        long jZzz = jCurrentTimeMillis - zzaf.zzz();
                        for (int i15 = 0; i15 < iZze2 && zzag(null, jZzz); i15++) {
                        }
                        long jZza = this.zzk.zzc.zza();
                        if (jZza != 0) {
                            zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                        }
                        zzak zzakVar2 = this.zze;
                        zzak(zzakVar2);
                        String strZzr = zzakVar2.zzr();
                        long j12 = -1;
                        try {
                            if (TextUtils.isEmpty(strZzr)) {
                                try {
                                    this.zzA = -1L;
                                    zzak zzakVar3 = this.zze;
                                    zzak(zzakVar3);
                                    zzg();
                                    long jZzz2 = jCurrentTimeMillis - zzaf.zzz();
                                    zzakVar3.zzg();
                                    zzakVar3.zzW();
                                    try {
                                        cursorRawQuery2 = zzakVar3.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz2)});
                                        try {
                                            if (cursorRawQuery2.moveToFirst()) {
                                                string = cursorRawQuery2.getString(0);
                                            } else {
                                                zzakVar3.zzs.zzay().zzj().zza("No expired configs for apps with pending events");
                                            }
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            zzakVar3.zzs.zzay().zzd().zzb("Error selecting expired configs", e);
                                            if (cursorRawQuery2 != null) {
                                            }
                                            if (!TextUtils.isEmpty(string)) {
                                                zzak zzakVar4 = this.zze;
                                                zzak(zzakVar4);
                                                zzgVarZzj = zzakVar4.zzj(string);
                                                if (zzgVarZzj != null) {
                                                    zzC(zzgVarZzj);
                                                }
                                            }
                                            this.zzv = false;
                                            zzad();
                                        }
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        cursorRawQuery2 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                    cursorRawQuery2.close();
                                    if (!TextUtils.isEmpty(string)) {
                                        zzak zzakVar5 = this.zze;
                                        zzak(zzakVar5);
                                        zzgVarZzj = zzakVar5.zzj(string);
                                        if (zzgVarZzj != null) {
                                            zzC(zzgVarZzj);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursorRawQuery2;
                                }
                            } else {
                                if (this.zzA == -1) {
                                    zzak zzakVar6 = this.zze;
                                    zzak(zzakVar6);
                                    try {
                                        cursorRawQuery = zzakVar6.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    j12 = cursorRawQuery.getLong(0);
                                                }
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                zzakVar6.zzs.zzay().zzd().zzb("Error querying raw events", e);
                                                if (cursorRawQuery != null) {
                                                }
                                                this.zzA = j12;
                                                iZze = zzg().zze(strZzr, zzdu.zzf);
                                                iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                                zzakVar = this.zze;
                                                zzak(zzakVar);
                                                zzakVar.zzg();
                                                zzakVar.zzW();
                                                if (iZze > 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                Preconditions.checkArgument(z11);
                                                if (iMax > 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                Preconditions.checkArgument(z12);
                                                Preconditions.checkNotEmpty(strZzr);
                                                cursorQuery = zzakVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                                try {
                                                    try {
                                                        if (cursorQuery.moveToFirst()) {
                                                            arrayList2 = new ArrayList();
                                                            length = 0;
                                                            while (true) {
                                                                j11 = cursorQuery.getLong(i14);
                                                                try {
                                                                    byte[] blob = cursorQuery.getBlob(i13);
                                                                    zzkr zzkrVar = zzakVar.zzf.zzi;
                                                                    zzak(zzkrVar);
                                                                    try {
                                                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                                                        bArr = new byte[1024];
                                                                        j10 = jCurrentTimeMillis;
                                                                        while (true) {
                                                                            try {
                                                                                try {
                                                                                    i12 = gZIPInputStream.read(bArr);
                                                                                    if (i12 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        byteArrayOutputStream.write(bArr, 0, i12);
                                                                                    }
                                                                                } catch (SQLiteException e11) {
                                                                                    e = e11;
                                                                                    zzakVar.zzs.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(strZzr), e);
                                                                                    listEmptyList = Collections.emptyList();
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                }
                                                                            } catch (IOException e12) {
                                                                                e = e12;
                                                                                try {
                                                                                    zzkrVar.zzs.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                                    throw e;
                                                                                } catch (IOException e13) {
                                                                                    e = e13;
                                                                                    zzakVar.zzs.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(strZzr), e);
                                                                                    if (cursorQuery.moveToNext()) {
                                                                                        break;
                                                                                    } else {
                                                                                        break;
                                                                                    }
                                                                                    cursorQuery.close();
                                                                                    listEmptyList = arrayList2;
                                                                                    if (!listEmptyList.isEmpty()) {
                                                                                        if (zzh(strZzr).zzi(zzag.AD_STORAGE)) {
                                                                                            it = listEmptyList.iterator();
                                                                                            while (true) {
                                                                                                if (!it.hasNext()) {
                                                                                                    strZzK = null;
                                                                                                    break;
                                                                                                }
                                                                                                zzfyVar2 = (com.google.android.gms.internal.measurement.zzfy) ((Pair) it.next()).first;
                                                                                                if (!TextUtils.isEmpty(zzfyVar2.zzK())) {
                                                                                                    strZzK = zzfyVar2.zzK();
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (strZzK != null) {
                                                                                                for (i11 = 0; i11 < listEmptyList.size(); i11++) {
                                                                                                    zzfyVar = (com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i11)).first;
                                                                                                    if (TextUtils.isEmpty(zzfyVar.zzK())) {
                                                                                                        try {
                                                                                                            listEmptyList = listEmptyList.subList(0, i11);
                                                                                                            break;
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            z10 = false;
                                                                                                            this.zzv = z10;
                                                                                                            zzad();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                                                                size = listEmptyList.size();
                                                                                                arrayList = new ArrayList(listEmptyList.size());
                                                                                                if (zzg().zzt(strZzr)) {
                                                                                                    z13 = false;
                                                                                                } else {
                                                                                                    z13 = false;
                                                                                                }
                                                                                                zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                                                                zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                                                                i10 = 0;
                                                                                                while (i10 < size) {
                                                                                                    zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                                                                    arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                    zzg().zzh();
                                                                                                    zzfxVar.zzag(55005L);
                                                                                                    long j13 = j10;
                                                                                                    zzfxVar.zzaf(j13);
                                                                                                    this.zzn.zzaw();
                                                                                                    try {
                                                                                                        zzfxVar.zzac(false);
                                                                                                        if (!z13) {
                                                                                                            zzfxVar.zzo();
                                                                                                        }
                                                                                                        if (!zZzi) {
                                                                                                            zzfxVar.zzu();
                                                                                                            zzfxVar.zzr();
                                                                                                        }
                                                                                                        if (!zZzi2) {
                                                                                                            zzfxVar.zzm();
                                                                                                        }
                                                                                                        if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                                            byte[] bArrZzbq = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                                                            zzkr zzkrVar2 = this.zzi;
                                                                                                            zzak(zzkrVar2);
                                                                                                            zzfxVar.zzG(zzkrVar2.zzd(bArrZzbq));
                                                                                                        }
                                                                                                        zzfvVarZza.zza(zzfxVar);
                                                                                                        i10++;
                                                                                                        j10 = j13;
                                                                                                    } catch (Throwable th5) {
                                                                                                        th = th5;
                                                                                                        z10 = false;
                                                                                                        this.zzv = z10;
                                                                                                        zzad();
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                                long j14 = j10;
                                                                                                if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                    zzkr zzkrVar3 = this.zzi;
                                                                                                    zzak(zzkrVar3);
                                                                                                    strZzm = zzkrVar3.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                                                                } else {
                                                                                                    strZzm = null;
                                                                                                }
                                                                                                zzak(this.zzi);
                                                                                                byte[] bArrZzbq2 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                                                                zzg();
                                                                                                str = (String) zzdu.zzp.zza(null);
                                                                                                try {
                                                                                                    URL url = new URL(str);
                                                                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                    if (this.zzy != null) {
                                                                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                    } else {
                                                                                                        this.zzy = new ArrayList(arrayList);
                                                                                                    }
                                                                                                    this.zzk.zzd.zzb(j14);
                                                                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq2.length), strZzm);
                                                                                                    this.zzu = true;
                                                                                                    zzen zzenVar2 = this.zzd;
                                                                                                    zzak(zzenVar2);
                                                                                                    zzki zzkiVar = new zzki(this, strZzr);
                                                                                                    zzenVar2.zzg();
                                                                                                    zzenVar2.zzW();
                                                                                                    Preconditions.checkNotNull(url);
                                                                                                    Preconditions.checkNotNull(bArrZzbq2);
                                                                                                    Preconditions.checkNotNull(zzkiVar);
                                                                                                    zzenVar2.zzs.zzaz().zzo(new zzem(zzenVar2, strZzr, url, bArrZzbq2, null, zzkiVar));
                                                                                                } catch (MalformedURLException unused) {
                                                                                                    zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(strZzr), str);
                                                                                                }
                                                                                            } else {
                                                                                                zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                                                                size = listEmptyList.size();
                                                                                                arrayList = new ArrayList(listEmptyList.size());
                                                                                                if (zzg().zzt(strZzr)) {
                                                                                                    z13 = false;
                                                                                                } else {
                                                                                                    z13 = false;
                                                                                                }
                                                                                                zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                                                                zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                                                                i10 = 0;
                                                                                                while (i10 < size) {
                                                                                                    zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                                                                    arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                    zzg().zzh();
                                                                                                    zzfxVar.zzag(55005L);
                                                                                                    long j15 = j10;
                                                                                                    zzfxVar.zzaf(j15);
                                                                                                    this.zzn.zzaw();
                                                                                                    zzfxVar.zzac(false);
                                                                                                    if (!z13) {
                                                                                                        zzfxVar.zzo();
                                                                                                    }
                                                                                                    if (!zZzi) {
                                                                                                        zzfxVar.zzu();
                                                                                                        zzfxVar.zzr();
                                                                                                    }
                                                                                                    if (!zZzi2) {
                                                                                                        zzfxVar.zzm();
                                                                                                    }
                                                                                                    if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                                        byte[] bArrZzbq3 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                                                        zzkr zzkrVar4 = this.zzi;
                                                                                                        zzak(zzkrVar4);
                                                                                                        zzfxVar.zzG(zzkrVar4.zzd(bArrZzbq3));
                                                                                                    }
                                                                                                    zzfvVarZza.zza(zzfxVar);
                                                                                                    i10++;
                                                                                                    j10 = j15;
                                                                                                }
                                                                                                long j16 = j10;
                                                                                                if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                    zzkr zzkrVar5 = this.zzi;
                                                                                                    zzak(zzkrVar5);
                                                                                                    strZzm = zzkrVar5.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                                                                } else {
                                                                                                    strZzm = null;
                                                                                                }
                                                                                                zzak(this.zzi);
                                                                                                byte[] bArrZzbq4 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                                                                zzg();
                                                                                                str = (String) zzdu.zzp.zza(null);
                                                                                                URL url2 = new URL(str);
                                                                                                Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                if (this.zzy != null) {
                                                                                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                } else {
                                                                                                    this.zzy = new ArrayList(arrayList);
                                                                                                }
                                                                                                this.zzk.zzd.zzb(j16);
                                                                                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq4.length), strZzm);
                                                                                                this.zzu = true;
                                                                                                zzen zzenVar3 = this.zzd;
                                                                                                zzak(zzenVar3);
                                                                                                zzki zzkiVar2 = new zzki(this, strZzr);
                                                                                                zzenVar3.zzg();
                                                                                                zzenVar3.zzW();
                                                                                                Preconditions.checkNotNull(url2);
                                                                                                Preconditions.checkNotNull(bArrZzbq4);
                                                                                                Preconditions.checkNotNull(zzkiVar2);
                                                                                                zzenVar3.zzs.zzaz().zzo(new zzem(zzenVar3, strZzr, url2, bArrZzbq4, null, zzkiVar2));
                                                                                            }
                                                                                        } else {
                                                                                            zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                                                            size = listEmptyList.size();
                                                                                            arrayList = new ArrayList(listEmptyList.size());
                                                                                            if (zzg().zzt(strZzr)) {
                                                                                                z13 = false;
                                                                                            } else {
                                                                                                z13 = false;
                                                                                            }
                                                                                            zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                                                            zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                                                            i10 = 0;
                                                                                            while (i10 < size) {
                                                                                                zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                zzg().zzh();
                                                                                                zzfxVar.zzag(55005L);
                                                                                                long j17 = j10;
                                                                                                zzfxVar.zzaf(j17);
                                                                                                this.zzn.zzaw();
                                                                                                zzfxVar.zzac(false);
                                                                                                if (!z13) {
                                                                                                    zzfxVar.zzo();
                                                                                                }
                                                                                                if (!zZzi) {
                                                                                                    zzfxVar.zzu();
                                                                                                    zzfxVar.zzr();
                                                                                                }
                                                                                                if (!zZzi2) {
                                                                                                    zzfxVar.zzm();
                                                                                                }
                                                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                                    byte[] bArrZzbq5 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                                                    zzkr zzkrVar6 = this.zzi;
                                                                                                    zzak(zzkrVar6);
                                                                                                    zzfxVar.zzG(zzkrVar6.zzd(bArrZzbq5));
                                                                                                }
                                                                                                zzfvVarZza.zza(zzfxVar);
                                                                                                i10++;
                                                                                                j10 = j17;
                                                                                            }
                                                                                            long j18 = j10;
                                                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                zzkr zzkrVar7 = this.zzi;
                                                                                                zzak(zzkrVar7);
                                                                                                strZzm = zzkrVar7.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                                                            } else {
                                                                                                strZzm = null;
                                                                                            }
                                                                                            zzak(this.zzi);
                                                                                            byte[] bArrZzbq6 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                                                            zzg();
                                                                                            str = (String) zzdu.zzp.zza(null);
                                                                                            URL url3 = new URL(str);
                                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                            if (this.zzy != null) {
                                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                            } else {
                                                                                                this.zzy = new ArrayList(arrayList);
                                                                                            }
                                                                                            this.zzk.zzd.zzb(j18);
                                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq6.length), strZzm);
                                                                                            this.zzu = true;
                                                                                            zzen zzenVar4 = this.zzd;
                                                                                            zzak(zzenVar4);
                                                                                            zzki zzkiVar3 = new zzki(this, strZzr);
                                                                                            zzenVar4.zzg();
                                                                                            zzenVar4.zzW();
                                                                                            Preconditions.checkNotNull(url3);
                                                                                            Preconditions.checkNotNull(bArrZzbq6);
                                                                                            Preconditions.checkNotNull(zzkiVar3);
                                                                                            zzenVar4.zzs.zzaz().zzo(new zzem(zzenVar4, strZzr, url3, bArrZzbq6, null, zzkiVar3));
                                                                                        }
                                                                                        zzad();
                                                                                    }
                                                                                    this.zzv = false;
                                                                                    zzad();
                                                                                }
                                                                            }
                                                                        }
                                                                        gZIPInputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        byteArray = byteArrayOutputStream.toByteArray();
                                                                        if (arrayList2.isEmpty()) {
                                                                        }
                                                                        try {
                                                                            zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzkr.zzl(com.google.android.gms.internal.measurement.zzfy.zzu(), byteArray);
                                                                            if (!cursorQuery.isNull(2)) {
                                                                                zzfxVar2.zzab(cursorQuery.getInt(2));
                                                                            }
                                                                            length += byteArray.length;
                                                                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzfy) zzfxVar2.zzay(), Long.valueOf(j11)));
                                                                        } catch (IOException e14) {
                                                                            zzakVar.zzs.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeh.zzn(strZzr), e14);
                                                                        }
                                                                        if (cursorQuery.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        jCurrentTimeMillis = j10;
                                                                        i13 = 1;
                                                                        i14 = 0;
                                                                    } catch (IOException e15) {
                                                                        e = e15;
                                                                        j10 = jCurrentTimeMillis;
                                                                    }
                                                                } catch (IOException e16) {
                                                                    e = e16;
                                                                    j10 = jCurrentTimeMillis;
                                                                }
                                                            }
                                                            cursorQuery.close();
                                                            listEmptyList = arrayList2;
                                                        } else {
                                                            listEmptyList = Collections.emptyList();
                                                            cursorQuery.close();
                                                            j10 = jCurrentTimeMillis;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        cursor = cursorQuery;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (SQLiteException e17) {
                                                    e = e17;
                                                    j10 = jCurrentTimeMillis;
                                                }
                                                if (!listEmptyList.isEmpty()) {
                                                    if (zzh(strZzr).zzi(zzag.AD_STORAGE)) {
                                                        it = listEmptyList.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                strZzK = null;
                                                                break;
                                                            }
                                                            zzfyVar2 = (com.google.android.gms.internal.measurement.zzfy) ((Pair) it.next()).first;
                                                            if (!TextUtils.isEmpty(zzfyVar2.zzK())) {
                                                                strZzK = zzfyVar2.zzK();
                                                                break;
                                                            }
                                                        }
                                                        if (strZzK != null) {
                                                            while (i11 < listEmptyList.size()) {
                                                                zzfyVar = (com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i11)).first;
                                                                if (TextUtils.isEmpty(zzfyVar.zzK())) {
                                                                    listEmptyList = listEmptyList.subList(0, i11);
                                                                    break;
                                                                }
                                                            }
                                                            zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                            size = listEmptyList.size();
                                                            arrayList = new ArrayList(listEmptyList.size());
                                                            if (zzg().zzt(strZzr)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                            zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                            i10 = 0;
                                                            while (i10 < size) {
                                                                zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                zzg().zzh();
                                                                zzfxVar.zzag(55005L);
                                                                long j19 = j10;
                                                                zzfxVar.zzaf(j19);
                                                                this.zzn.zzaw();
                                                                zzfxVar.zzac(false);
                                                                if (!z13) {
                                                                    zzfxVar.zzo();
                                                                }
                                                                if (!zZzi) {
                                                                    zzfxVar.zzu();
                                                                    zzfxVar.zzr();
                                                                }
                                                                if (!zZzi2) {
                                                                    zzfxVar.zzm();
                                                                }
                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                    byte[] bArrZzbq7 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                    zzkr zzkrVar8 = this.zzi;
                                                                    zzak(zzkrVar8);
                                                                    zzfxVar.zzG(zzkrVar8.zzd(bArrZzbq7));
                                                                }
                                                                zzfvVarZza.zza(zzfxVar);
                                                                i10++;
                                                                j10 = j19;
                                                            }
                                                            long j110 = j10;
                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                zzkr zzkrVar9 = this.zzi;
                                                                zzak(zzkrVar9);
                                                                strZzm = zzkrVar9.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                            } else {
                                                                strZzm = null;
                                                            }
                                                            zzak(this.zzi);
                                                            byte[] bArrZzbq8 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                            zzg();
                                                            str = (String) zzdu.zzp.zza(null);
                                                            URL url4 = new URL(str);
                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                            if (this.zzy != null) {
                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                            } else {
                                                                this.zzy = new ArrayList(arrayList);
                                                            }
                                                            this.zzk.zzd.zzb(j110);
                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq8.length), strZzm);
                                                            this.zzu = true;
                                                            zzen zzenVar5 = this.zzd;
                                                            zzak(zzenVar5);
                                                            zzki zzkiVar4 = new zzki(this, strZzr);
                                                            zzenVar5.zzg();
                                                            zzenVar5.zzW();
                                                            Preconditions.checkNotNull(url4);
                                                            Preconditions.checkNotNull(bArrZzbq8);
                                                            Preconditions.checkNotNull(zzkiVar4);
                                                            zzenVar5.zzs.zzaz().zzo(new zzem(zzenVar5, strZzr, url4, bArrZzbq8, null, zzkiVar4));
                                                        } else {
                                                            zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                            size = listEmptyList.size();
                                                            arrayList = new ArrayList(listEmptyList.size());
                                                            if (zzg().zzt(strZzr)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                            zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                            i10 = 0;
                                                            while (i10 < size) {
                                                                zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                zzg().zzh();
                                                                zzfxVar.zzag(55005L);
                                                                long j111 = j10;
                                                                zzfxVar.zzaf(j111);
                                                                this.zzn.zzaw();
                                                                zzfxVar.zzac(false);
                                                                if (!z13) {
                                                                    zzfxVar.zzo();
                                                                }
                                                                if (!zZzi) {
                                                                    zzfxVar.zzu();
                                                                    zzfxVar.zzr();
                                                                }
                                                                if (!zZzi2) {
                                                                    zzfxVar.zzm();
                                                                }
                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                    byte[] bArrZzbq9 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                    zzkr zzkrVar10 = this.zzi;
                                                                    zzak(zzkrVar10);
                                                                    zzfxVar.zzG(zzkrVar10.zzd(bArrZzbq9));
                                                                }
                                                                zzfvVarZza.zza(zzfxVar);
                                                                i10++;
                                                                j10 = j111;
                                                            }
                                                            long j112 = j10;
                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                zzkr zzkrVar11 = this.zzi;
                                                                zzak(zzkrVar11);
                                                                strZzm = zzkrVar11.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                            } else {
                                                                strZzm = null;
                                                            }
                                                            zzak(this.zzi);
                                                            byte[] bArrZzbq10 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                            zzg();
                                                            str = (String) zzdu.zzp.zza(null);
                                                            URL url5 = new URL(str);
                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                            if (this.zzy != null) {
                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                            } else {
                                                                this.zzy = new ArrayList(arrayList);
                                                            }
                                                            this.zzk.zzd.zzb(j112);
                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq10.length), strZzm);
                                                            this.zzu = true;
                                                            zzen zzenVar6 = this.zzd;
                                                            zzak(zzenVar6);
                                                            zzki zzkiVar5 = new zzki(this, strZzr);
                                                            zzenVar6.zzg();
                                                            zzenVar6.zzW();
                                                            Preconditions.checkNotNull(url5);
                                                            Preconditions.checkNotNull(bArrZzbq10);
                                                            Preconditions.checkNotNull(zzkiVar5);
                                                            zzenVar6.zzs.zzaz().zzo(new zzem(zzenVar6, strZzr, url5, bArrZzbq10, null, zzkiVar5));
                                                        }
                                                    } else {
                                                        zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                                        size = listEmptyList.size();
                                                        arrayList = new ArrayList(listEmptyList.size());
                                                        if (zzg().zzt(strZzr)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                                        zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                                        i10 = 0;
                                                        while (i10 < size) {
                                                            zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                            arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                            zzg().zzh();
                                                            zzfxVar.zzag(55005L);
                                                            long j113 = j10;
                                                            zzfxVar.zzaf(j113);
                                                            this.zzn.zzaw();
                                                            zzfxVar.zzac(false);
                                                            if (!z13) {
                                                                zzfxVar.zzo();
                                                            }
                                                            if (!zZzi) {
                                                                zzfxVar.zzu();
                                                                zzfxVar.zzr();
                                                            }
                                                            if (!zZzi2) {
                                                                zzfxVar.zzm();
                                                            }
                                                            if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                byte[] bArrZzbq11 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                                zzkr zzkrVar12 = this.zzi;
                                                                zzak(zzkrVar12);
                                                                zzfxVar.zzG(zzkrVar12.zzd(bArrZzbq11));
                                                            }
                                                            zzfvVarZza.zza(zzfxVar);
                                                            i10++;
                                                            j10 = j113;
                                                        }
                                                        long j114 = j10;
                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                            zzkr zzkrVar13 = this.zzi;
                                                            zzak(zzkrVar13);
                                                            strZzm = zzkrVar13.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                                        } else {
                                                            strZzm = null;
                                                        }
                                                        zzak(this.zzi);
                                                        byte[] bArrZzbq12 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                                        zzg();
                                                        str = (String) zzdu.zzp.zza(null);
                                                        URL url6 = new URL(str);
                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                        if (this.zzy != null) {
                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                        } else {
                                                            this.zzy = new ArrayList(arrayList);
                                                        }
                                                        this.zzk.zzd.zzb(j114);
                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq12.length), strZzm);
                                                        this.zzu = true;
                                                        zzen zzenVar7 = this.zzd;
                                                        zzak(zzenVar7);
                                                        zzki zzkiVar6 = new zzki(this, strZzr);
                                                        zzenVar7.zzg();
                                                        zzenVar7.zzW();
                                                        Preconditions.checkNotNull(url6);
                                                        Preconditions.checkNotNull(bArrZzbq12);
                                                        Preconditions.checkNotNull(zzkiVar6);
                                                        zzenVar7.zzs.zzaz().zzo(new zzem(zzenVar7, strZzr, url6, bArrZzbq12, null, zzkiVar6));
                                                    }
                                                    zzad();
                                                }
                                                this.zzv = false;
                                                zzad();
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor3 = cursorRawQuery;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        cursorRawQuery = null;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                    cursorRawQuery.close();
                                    this.zzA = j12;
                                }
                                iZze = zzg().zze(strZzr, zzdu.zzf);
                                iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                zzakVar = this.zze;
                                zzak(zzakVar);
                                zzakVar.zzg();
                                zzakVar.zzW();
                                if (iZze > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Preconditions.checkArgument(z11);
                                if (iMax > 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                Preconditions.checkArgument(z12);
                                Preconditions.checkNotEmpty(strZzr);
                                try {
                                    cursorQuery = zzakVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                    if (cursorQuery.moveToFirst()) {
                                        listEmptyList = Collections.emptyList();
                                        cursorQuery.close();
                                        j10 = jCurrentTimeMillis;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        length = 0;
                                        while (true) {
                                            j11 = cursorQuery.getLong(i14);
                                            byte[] blob2 = cursorQuery.getBlob(i13);
                                            zzkr zzkrVar14 = zzakVar.zzf.zzi;
                                            zzak(zzkrVar14);
                                            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            bArr = new byte[1024];
                                            j10 = jCurrentTimeMillis;
                                            while (true) {
                                                i12 = gZIPInputStream.read(bArr);
                                                if (i12 <= 0) {
                                                    break;
                                                    break;
                                                }
                                                byteArrayOutputStream.write(bArr, 0, i12);
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream2.close();
                                            byteArray = byteArrayOutputStream.toByteArray();
                                            if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzkr.zzl(com.google.android.gms.internal.measurement.zzfy.zzu(), byteArray);
                                            if (!cursorQuery.isNull(2)) {
                                                zzfxVar2.zzab(cursorQuery.getInt(2));
                                            }
                                            length += byteArray.length;
                                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzfy) zzfxVar2.zzay(), Long.valueOf(j11)));
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            } else {
                                                jCurrentTimeMillis = j10;
                                                i13 = 1;
                                                i14 = 0;
                                            }
                                        }
                                        cursorQuery.close();
                                        listEmptyList = arrayList2;
                                    }
                                } catch (SQLiteException e19) {
                                    e = e19;
                                    j10 = jCurrentTimeMillis;
                                    cursorQuery = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor = null;
                                }
                                if (!listEmptyList.isEmpty()) {
                                    if (zzh(strZzr).zzi(zzag.AD_STORAGE)) {
                                        it = listEmptyList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                strZzK = null;
                                                break;
                                            }
                                            zzfyVar2 = (com.google.android.gms.internal.measurement.zzfy) ((Pair) it.next()).first;
                                            if (!TextUtils.isEmpty(zzfyVar2.zzK())) {
                                                strZzK = zzfyVar2.zzK();
                                                break;
                                            }
                                        }
                                        if (strZzK != null) {
                                            while (i11 < listEmptyList.size()) {
                                                zzfyVar = (com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i11)).first;
                                                if (TextUtils.isEmpty(zzfyVar.zzK()) && !zzfyVar.zzK().equals(strZzK)) {
                                                    listEmptyList = listEmptyList.subList(0, i11);
                                                    break;
                                                }
                                            }
                                            zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                            size = listEmptyList.size();
                                            arrayList = new ArrayList(listEmptyList.size());
                                            if (zzg().zzt(strZzr) || !zzh(strZzr).zzi(zzag.AD_STORAGE)) {
                                                z13 = false;
                                            } else {
                                                z13 = true;
                                            }
                                            zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                            zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                            i10 = 0;
                                            while (i10 < size) {
                                                zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                zzg().zzh();
                                                zzfxVar.zzag(55005L);
                                                long j115 = j10;
                                                zzfxVar.zzaf(j115);
                                                this.zzn.zzaw();
                                                zzfxVar.zzac(false);
                                                if (!z13) {
                                                    zzfxVar.zzo();
                                                }
                                                if (!zZzi) {
                                                    zzfxVar.zzu();
                                                    zzfxVar.zzr();
                                                }
                                                if (!zZzi2) {
                                                    zzfxVar.zzm();
                                                }
                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                    byte[] bArrZzbq13 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                    zzkr zzkrVar15 = this.zzi;
                                                    zzak(zzkrVar15);
                                                    zzfxVar.zzG(zzkrVar15.zzd(bArrZzbq13));
                                                }
                                                zzfvVarZza.zza(zzfxVar);
                                                i10++;
                                                j10 = j115;
                                            }
                                            long j116 = j10;
                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                zzkr zzkrVar16 = this.zzi;
                                                zzak(zzkrVar16);
                                                strZzm = zzkrVar16.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                            } else {
                                                strZzm = null;
                                            }
                                            zzak(this.zzi);
                                            byte[] bArrZzbq14 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                            zzg();
                                            str = (String) zzdu.zzp.zza(null);
                                            URL url7 = new URL(str);
                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                            if (this.zzy != null) {
                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.zzy = new ArrayList(arrayList);
                                            }
                                            this.zzk.zzd.zzb(j116);
                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq14.length), strZzm);
                                            this.zzu = true;
                                            zzen zzenVar8 = this.zzd;
                                            zzak(zzenVar8);
                                            zzki zzkiVar7 = new zzki(this, strZzr);
                                            zzenVar8.zzg();
                                            zzenVar8.zzW();
                                            Preconditions.checkNotNull(url7);
                                            Preconditions.checkNotNull(bArrZzbq14);
                                            Preconditions.checkNotNull(zzkiVar7);
                                            zzenVar8.zzs.zzaz().zzo(new zzem(zzenVar8, strZzr, url7, bArrZzbq14, null, zzkiVar7));
                                        } else {
                                            zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                            size = listEmptyList.size();
                                            arrayList = new ArrayList(listEmptyList.size());
                                            if (zzg().zzt(strZzr)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                            zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                            i10 = 0;
                                            while (i10 < size) {
                                                zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                zzg().zzh();
                                                zzfxVar.zzag(55005L);
                                                long j117 = j10;
                                                zzfxVar.zzaf(j117);
                                                this.zzn.zzaw();
                                                zzfxVar.zzac(false);
                                                if (!z13) {
                                                    zzfxVar.zzo();
                                                }
                                                if (!zZzi) {
                                                    zzfxVar.zzu();
                                                    zzfxVar.zzr();
                                                }
                                                if (!zZzi2) {
                                                    zzfxVar.zzm();
                                                }
                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                    byte[] bArrZzbq15 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                    zzkr zzkrVar17 = this.zzi;
                                                    zzak(zzkrVar17);
                                                    zzfxVar.zzG(zzkrVar17.zzd(bArrZzbq15));
                                                }
                                                zzfvVarZza.zza(zzfxVar);
                                                i10++;
                                                j10 = j117;
                                            }
                                            long j118 = j10;
                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                zzkr zzkrVar18 = this.zzi;
                                                zzak(zzkrVar18);
                                                strZzm = zzkrVar18.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                            } else {
                                                strZzm = null;
                                            }
                                            zzak(this.zzi);
                                            byte[] bArrZzbq16 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                            zzg();
                                            str = (String) zzdu.zzp.zza(null);
                                            URL url8 = new URL(str);
                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                            if (this.zzy != null) {
                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.zzy = new ArrayList(arrayList);
                                            }
                                            this.zzk.zzd.zzb(j118);
                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq16.length), strZzm);
                                            this.zzu = true;
                                            zzen zzenVar9 = this.zzd;
                                            zzak(zzenVar9);
                                            zzki zzkiVar8 = new zzki(this, strZzr);
                                            zzenVar9.zzg();
                                            zzenVar9.zzW();
                                            Preconditions.checkNotNull(url8);
                                            Preconditions.checkNotNull(bArrZzbq16);
                                            Preconditions.checkNotNull(zzkiVar8);
                                            zzenVar9.zzs.zzaz().zzo(new zzem(zzenVar9, strZzr, url8, bArrZzbq16, null, zzkiVar8));
                                        }
                                    } else {
                                        zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
                                        size = listEmptyList.size();
                                        arrayList = new ArrayList(listEmptyList.size());
                                        if (zzg().zzt(strZzr)) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        zZzi = zzh(strZzr).zzi(zzag.AD_STORAGE);
                                        zZzi2 = zzh(strZzr).zzi(zzag.ANALYTICS_STORAGE);
                                        i10 = 0;
                                        while (i10 < size) {
                                            zzfxVar = (com.google.android.gms.internal.measurement.zzfx) ((com.google.android.gms.internal.measurement.zzfy) ((Pair) listEmptyList.get(i10)).first).zzbt();
                                            arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                            zzg().zzh();
                                            zzfxVar.zzag(55005L);
                                            long j119 = j10;
                                            zzfxVar.zzaf(j119);
                                            this.zzn.zzaw();
                                            zzfxVar.zzac(false);
                                            if (!z13) {
                                                zzfxVar.zzo();
                                            }
                                            if (!zZzi) {
                                                zzfxVar.zzu();
                                                zzfxVar.zzr();
                                            }
                                            if (!zZzi2) {
                                                zzfxVar.zzm();
                                            }
                                            if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                byte[] bArrZzbq17 = ((com.google.android.gms.internal.measurement.zzfy) zzfxVar.zzay()).zzbq();
                                                zzkr zzkrVar19 = this.zzi;
                                                zzak(zzkrVar19);
                                                zzfxVar.zzG(zzkrVar19.zzd(bArrZzbq17));
                                            }
                                            zzfvVarZza.zza(zzfxVar);
                                            i10++;
                                            j10 = j119;
                                        }
                                        long j1110 = j10;
                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                            zzkr zzkrVar110 = this.zzi;
                                            zzak(zzkrVar110);
                                            strZzm = zzkrVar110.zzm((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay());
                                        } else {
                                            strZzm = null;
                                        }
                                        zzak(this.zzi);
                                        byte[] bArrZzbq18 = ((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq();
                                        zzg();
                                        str = (String) zzdu.zzp.zza(null);
                                        URL url9 = new URL(str);
                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                        if (this.zzy != null) {
                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzy = new ArrayList(arrayList);
                                        }
                                        this.zzk.zzd.zzb(j1110);
                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfvVarZza.zzb(0).zzy() : "?", Integer.valueOf(bArrZzbq18.length), strZzm);
                                        this.zzu = true;
                                        zzen zzenVar10 = this.zzd;
                                        zzak(zzenVar10);
                                        zzki zzkiVar9 = new zzki(this, strZzr);
                                        zzenVar10.zzg();
                                        zzenVar10.zzW();
                                        Preconditions.checkNotNull(url9);
                                        Preconditions.checkNotNull(bArrZzbq18);
                                        Preconditions.checkNotNull(zzkiVar9);
                                        zzenVar10.zzs.zzaz().zzo(new zzem(zzenVar10, strZzr, url9, bArrZzbq18, null, zzkiVar9));
                                    }
                                }
                            }
                            this.zzv = false;
                        } catch (Throwable th10) {
                            th = th10;
                            z10 = false;
                        }
                    } else {
                        zzay().zzj().zza("Network not connected, ignoring upload request");
                        zzaf();
                        this.zzv = false;
                    }
                }
            }
            zzad();
        } catch (Throwable th11) {
            th = th11;
            z10 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0193 A[Catch: all -> 0x014f, TRY_ENTER, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01aa A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x020e A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x021c A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0224 A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0229 A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0239 A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x023f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0243 A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e7 A[Catch: all -> 0x014f, TryCatch #9 {all -> 0x014f, blocks: (B:28:0x0124, B:30:0x0136, B:32:0x0142, B:35:0x0153, B:38:0x0161, B:40:0x016b, B:44:0x0176, B:98:0x031a, B:107:0x0350, B:109:0x0392, B:111:0x0398, B:112:0x03af, B:116:0x03c2, B:118:0x03d9, B:120:0x03df, B:121:0x03f6, B:126:0x0420, B:130:0x0441, B:131:0x0458, B:134:0x0469, B:137:0x0486, B:138:0x049a, B:140:0x04a4, B:142:0x04b3, B:144:0x04b9, B:145:0x04c2, B:146:0x04d0, B:148:0x04e5, B:150:0x04f5, B:162:0x0523, B:163:0x0538, B:165:0x0562, B:168:0x057a, B:171:0x05bd, B:173:0x05e9, B:175:0x0628, B:176:0x062d, B:178:0x0635, B:179:0x063a, B:181:0x0642, B:182:0x0647, B:184:0x0650, B:185:0x0654, B:187:0x0661, B:188:0x0666, B:190:0x068d, B:192:0x0695, B:193:0x069a, B:195:0x06a2, B:196:0x06a5, B:198:0x06bd, B:201:0x06c6, B:202:0x06df, B:204:0x06e5, B:206:0x06f9, B:208:0x0705, B:210:0x0712, B:214:0x072c, B:215:0x073c, B:219:0x0745, B:220:0x0748, B:222:0x0766, B:224:0x0778, B:226:0x077c, B:228:0x0787, B:229:0x0790, B:231:0x07d3, B:232:0x07d8, B:234:0x07e0, B:236:0x07e9, B:237:0x07ec, B:239:0x07f9, B:241:0x0819, B:242:0x0824, B:244:0x0857, B:245:0x085c, B:246:0x0869, B:248:0x0871, B:250:0x087b, B:251:0x0888, B:253:0x0892, B:254:0x089f, B:255:0x08ac, B:257:0x08b2, B:259:0x08e2, B:260:0x0928, B:261:0x0932, B:262:0x093e, B:264:0x0944, B:273:0x0992, B:274:0x09e0, B:276:0x09f0, B:291:0x0a56, B:281:0x0a0b, B:282:0x0a0e, B:267:0x0950, B:269:0x097c, B:288:0x0a29, B:289:0x0a40, B:290:0x0a41, B:172:0x05db, B:159:0x0509, B:101:0x0330, B:102:0x0337, B:104:0x033d, B:106:0x0349, B:49:0x0187, B:52:0x0193, B:54:0x01aa, B:60:0x01c8, B:68:0x0208, B:70:0x020e, B:72:0x021c, B:74:0x0224, B:76:0x022e, B:78:0x0239, B:81:0x0243, B:94:0x02dc, B:96:0x02e7, B:83:0x026e, B:84:0x0288, B:86:0x028f, B:93:0x02c1, B:92:0x02ae, B:75:0x0229, B:63:0x01d6, B:67:0x01fe), top: B:316:0x0124, inners: #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0318  */
    @WorkerThread
    public final void zzX(zzau zzauVar, zzp zzpVar) {
        String strZzg;
        long jLongValue;
        String str;
        String upperCase;
        String str2;
        zzku zzkuVarZzp;
        String str3;
        zzak zzakVar;
        String str4;
        zzku zzkuVar;
        zzku zzkuVar2;
        zzak zzakVar2;
        Object obj;
        double dDoubleValue;
        long length;
        String str5;
        int i10;
        long jDelete;
        zzap zzapVar;
        int i11;
        String str6;
        zzaq zzaqVarZzc;
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzu;
        ArrayList arrayList;
        zzak zzakVar3;
        com.google.android.gms.internal.measurement.zzfy zzfyVar;
        long jZzd;
        ContentValues contentValues;
        zzar zzarVar;
        int i12;
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str7 = zzpVar.zza;
        zzak(this.zzi);
        if (zzkr.zzA(zzauVar, zzpVar)) {
            if (!zzpVar.zzh) {
                zzd(zzpVar);
                return;
            }
            zzfi zzfiVar = this.zzc;
            zzak(zzfiVar);
            String str8 = "_err";
            if (zzfiVar.zzo(str7, zzauVar.zza)) {
                zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(str7), this.zzn.zzj().zzd(zzauVar.zza));
                zzfi zzfiVar2 = this.zzc;
                zzak(zzfiVar2);
                if (!zzfiVar2.zzm(str7)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzak(zzfiVar3);
                    if (!zzfiVar3.zzp(str7)) {
                        if ("_err".equals(zzauVar.zza)) {
                            return;
                        }
                        zzv().zzM(this.zzE, str7, 11, "_ev", zzauVar.zza, 0);
                        return;
                    }
                }
                zzak zzakVar4 = this.zze;
                zzak(zzakVar4);
                zzg zzgVarZzj = zzakVar4.zzj(str7);
                if (zzgVarZzj != null) {
                    long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzgVarZzj.zzl(), zzgVarZzj.zzc()));
                    zzg();
                    if (jAbs > ((Long) zzdu.zzy.zza(null)).longValue()) {
                        zzay().zzc().zza("Fetching config for blocked app");
                        zzC(zzgVarZzj);
                        return;
                    }
                    return;
                }
                return;
            }
            zzei zzeiVarZzb = zzei.zzb(zzauVar);
            zzv().zzL(zzeiVarZzb, zzg().zzd(str7));
            zzau zzauVarZza = zzeiVarZzb.zza();
            if (Log.isLoggable(zzay().zzq(), 2)) {
                zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzauVarZza));
            }
            zzak zzakVar5 = this.zze;
            zzak(zzakVar5);
            zzakVar5.zzw();
            try {
                zzd(zzpVar);
                zzmt.zzc();
                if (!zzg().zzs(null, zzdu.zzan) && zzg().zzs(null, zzdu.zzao)) {
                    zzak zzakVar6 = this.zze;
                    zzak(zzakVar6);
                    zzakVar6.zzA(zzpVar.zza, "_lair");
                }
                boolean z10 = FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(zzauVarZza.zza) || FirebaseAnalytics.Event.PURCHASE.equals(zzauVarZza.zza) || FirebaseAnalytics.Event.REFUND.equals(zzauVarZza.zza);
                if ("_iap".equals(zzauVarZza.zza)) {
                    strZzg = zzauVarZza.zzb.zzg("currency");
                    if (z10) {
                        dDoubleValue = zzauVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzauVarZza.zzb.zze("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str7), Double.valueOf(dDoubleValue));
                            zzak zzakVar7 = this.zze;
                            zzak(zzakVar7);
                            zzakVar7.zzC();
                            zzak zzakVar8 = this.zze;
                            zzak(zzakVar8);
                            zzakVar8.zzx();
                            return;
                        }
                        jLongValue = Math.round(dDoubleValue);
                        if (FirebaseAnalytics.Event.REFUND.equals(zzauVarZza.zza)) {
                            jLongValue = -jLongValue;
                        }
                    } else {
                        str8 = "_err";
                        jLongValue = zzauVarZza.zzb.zze("value").longValue();
                    }
                    if (TextUtils.isEmpty(strZzg)) {
                        str = str8;
                    } else {
                        upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            if (upperCase.length() != 0) {
                                str2 = "_ltv_".concat(upperCase);
                            } else {
                                str2 = new String("_ltv_");
                            }
                            zzak zzakVar9 = this.zze;
                            zzak(zzakVar9);
                            zzkuVarZzp = zzakVar9.zzp(str7, str2);
                            if (zzkuVarZzp != null) {
                                obj = zzkuVarZzp.zze;
                                if (obj instanceof Long) {
                                    zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                    str = str8;
                                } else {
                                    str3 = str8;
                                    zzakVar = this.zze;
                                    zzak(zzakVar);
                                    int iZze = zzg().zze(str7, zzdu.zzD) - 1;
                                    Preconditions.checkNotEmpty(str7);
                                    zzakVar.zzg();
                                    zzakVar.zzW();
                                    try {
                                        str4 = str3;
                                        try {
                                            zzakVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str7, str7, String.valueOf(iZze)});
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            zzakVar.zzs.zzay().zzd().zzc("Error pruning currencies. appId", zzeh.zzn(str7), e);
                                        }
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        str4 = str3;
                                    }
                                    str = str4;
                                    zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                }
                            } else {
                                str3 = str8;
                                zzakVar = this.zze;
                                zzak(zzakVar);
                                int iZze2 = zzg().zze(str7, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str7);
                                zzakVar.zzg();
                                zzakVar.zzW();
                                str4 = str3;
                                zzakVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str7, str7, String.valueOf(iZze2)});
                                str = str4;
                                zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                            zzkuVar2 = zzkuVar;
                            zzakVar2 = this.zze;
                            zzak(zzakVar2);
                            if (!zzakVar2.zzL(zzkuVar2)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str7), this.zzn.zzj().zzf(zzkuVar2.zzc), zzkuVar2.zze);
                                zzv().zzM(this.zzE, str7, 9, null, null, 0);
                            }
                        } else {
                            str = str8;
                        }
                    }
                } else if (z10) {
                    z10 = true;
                    strZzg = zzauVarZza.zzb.zzg("currency");
                    if (z10) {
                        dDoubleValue = zzauVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzauVarZza.zzb.zze("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d) {
                        }
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str7), Double.valueOf(dDoubleValue));
                        zzak zzakVar10 = this.zze;
                        zzak(zzakVar10);
                        zzakVar10.zzC();
                        zzak zzakVar11 = this.zze;
                        zzak(zzakVar11);
                        zzakVar11.zzx();
                        return;
                    }
                    str8 = "_err";
                    jLongValue = zzauVarZza.zzb.zze("value").longValue();
                    if (TextUtils.isEmpty(strZzg)) {
                        upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            if (upperCase.length() != 0) {
                                str2 = "_ltv_".concat(upperCase);
                            } else {
                                str2 = new String("_ltv_");
                            }
                            zzak zzakVar12 = this.zze;
                            zzak(zzakVar12);
                            zzkuVarZzp = zzakVar12.zzp(str7, str2);
                            if (zzkuVarZzp != null) {
                                obj = zzkuVarZzp.zze;
                                if (obj instanceof Long) {
                                    str3 = str8;
                                    zzakVar = this.zze;
                                    zzak(zzakVar);
                                    int iZze3 = zzg().zze(str7, zzdu.zzD) - 1;
                                    Preconditions.checkNotEmpty(str7);
                                    zzakVar.zzg();
                                    zzakVar.zzW();
                                    str4 = str3;
                                    zzakVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str7, str7, String.valueOf(iZze3)});
                                    str = str4;
                                    zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                } else {
                                    zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                    str = str8;
                                }
                            } else {
                                str3 = str8;
                                zzakVar = this.zze;
                                zzak(zzakVar);
                                int iZze4 = zzg().zze(str7, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str7);
                                zzakVar.zzg();
                                zzakVar.zzW();
                                str4 = str3;
                                zzakVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str7, str7, String.valueOf(iZze4)});
                                str = str4;
                                zzkuVar = new zzku(str7, zzauVarZza.zzc, str2, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                            zzkuVar2 = zzkuVar;
                            zzakVar2 = this.zze;
                            zzak(zzakVar2);
                            if (!zzakVar2.zzL(zzkuVar2)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str7), this.zzn.zzj().zzf(zzkuVar2.zzc), zzkuVar2.zze);
                                zzv().zzM(this.zzE, str7, 9, null, null, 0);
                            }
                        } else {
                            str = str8;
                        }
                    } else {
                        str = str8;
                    }
                } else {
                    str = "_err";
                }
                boolean zZzah = zzkw.zzah(zzauVarZza.zza);
                boolean zEquals = str.equals(zzauVarZza.zza);
                zzv();
                zzas zzasVar = zzauVarZza.zzb;
                if (zzasVar == null) {
                    length = 0;
                } else {
                    zzar zzarVar2 = new zzar(zzasVar);
                    length = 0;
                    while (zzarVar2.hasNext()) {
                        Object objZzf = zzasVar.zzf(zzarVar2.next());
                        if (objZzf instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objZzf).length;
                        }
                    }
                }
                zzak zzakVar13 = this.zze;
                zzak(zzakVar13);
                zzai zzaiVarZzm = zzakVar13.zzm(zza(), str7, length + 1, true, zZzah, false, zEquals, false);
                long j10 = zzaiVarZzm.zzb;
                zzg();
                long jIntValue = j10 - ((long) ((Integer) zzdu.zzj.zza(null)).intValue());
                if (jIntValue > 0) {
                    if (jIntValue % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(str7), Long.valueOf(zzaiVarZzm.zzb));
                    }
                    zzak zzakVar14 = this.zze;
                    zzak(zzakVar14);
                    zzakVar14.zzC();
                    zzak zzakVar15 = this.zze;
                    zzak(zzakVar15);
                    zzakVar15.zzx();
                    return;
                }
                if (zZzah) {
                    long j11 = zzaiVarZzm.zza;
                    zzg();
                    long jIntValue2 = j11 - ((long) ((Integer) zzdu.zzl.zza(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(str7), Long.valueOf(zzaiVarZzm.zza));
                        }
                        zzv().zzM(this.zzE, str7, 16, "_ev", zzauVarZza.zza, 0);
                        zzak zzakVar16 = this.zze;
                        zzak(zzakVar16);
                        zzakVar16.zzC();
                        zzak zzakVar17 = this.zze;
                        zzak(zzakVar17);
                        zzakVar17.zzx();
                        return;
                    }
                }
                if (zEquals) {
                    long jMax = zzaiVarZzm.zzd - ((long) Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzg().zze(zzpVar.zza, zzdu.zzk))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(str7), Long.valueOf(zzaiVarZzm.zzd));
                        }
                        zzak zzakVar18 = this.zze;
                        zzak(zzakVar18);
                        zzakVar18.zzC();
                        zzak zzakVar19 = this.zze;
                        zzak(zzakVar19);
                        zzakVar19.zzx();
                        return;
                    }
                }
                Bundle bundleZzc = zzauVarZza.zzb.zzc();
                zzv().zzN(bundleZzc, "_o", zzauVarZza.zzc);
                if (zzv().zzad(str7)) {
                    zzv().zzN(bundleZzc, "_dbg", 1L);
                    zzv().zzN(bundleZzc, NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                }
                if ("_s".equals(zzauVarZza.zza)) {
                    zzak zzakVar20 = this.zze;
                    zzak(zzakVar20);
                    zzku zzkuVarZzp2 = zzakVar20.zzp(zzpVar.zza, "_sno");
                    if (zzkuVarZzp2 != null && (zzkuVarZzp2.zze instanceof Long)) {
                        zzv().zzN(bundleZzc, "_sno", zzkuVarZzp2.zze);
                    }
                }
                zzak zzakVar21 = this.zze;
                zzak(zzakVar21);
                Preconditions.checkNotEmpty(str7);
                zzakVar21.zzg();
                zzakVar21.zzW();
                try {
                    i10 = 0;
                    try {
                        try {
                            try {
                                str5 = "raw_events";
                                try {
                                    jDelete = zzakVar21.zzh().delete(str5, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str7, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzakVar21.zzs.zzf().zze(str7, zzdu.zzo))))});
                                    while (true) {
                                        if (!zzarVar.hasNext()) {
                                            zzfi zzfiVar4 = this.zzc;
                                            zzak(zzfiVar4);
                                            boolean zZzn = zzfiVar4.zzn(zzapVar.zza, zzapVar.zzb);
                                            zzak zzakVar22 = this.zze;
                                            zzak(zzakVar22);
                                            zzai zzaiVarZzl = zzakVar22.zzl(zza(), zzapVar.zza, false, false, false, false, false);
                                            if (!zZzn || zzaiVarZzl.zze >= zzg().zze(zzapVar.zza, zzdu.zzn)) {
                                                i12 = i11;
                                                break;
                                            }
                                        } else if (NotificationMessage.NOTIF_KEY_REQUEST_ID.equals(zzarVar.next())) {
                                        }
                                        i12 = 1;
                                        break;
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    zzakVar21.zzs.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(str7), e);
                                    jDelete = 0;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                str5 = "raw_events";
                            }
                            zzakVar3.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                            zzak zzakVar23 = this.zze;
                            zzak(zzakVar23);
                            zzarVar = new zzar(zzapVar.zzf);
                            zzakVar23.zzg();
                            zzakVar23.zzW();
                            Preconditions.checkNotNull(zzapVar);
                            Preconditions.checkNotEmpty(zzapVar.zza);
                            zzkr zzkrVar = zzakVar23.zzf.zzi;
                            zzak(zzkrVar);
                            byte[] bArrZzbq = zzkrVar.zzj(zzapVar).zzbq();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", zzapVar.zza);
                            contentValues2.put("name", zzapVar.zzb);
                            contentValues2.put("timestamp", Long.valueOf(zzapVar.zzd));
                            contentValues2.put("metadata_fingerprint", Long.valueOf(jZzd));
                            contentValues2.put("data", bArrZzbq);
                            contentValues2.put("realtime", Integer.valueOf(i12));
                            try {
                                if (zzakVar23.zzh().insert(str6, null, contentValues2) == -1) {
                                    zzakVar23.zzs.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzapVar.zza));
                                } else {
                                    this.zza = 0L;
                                }
                            } catch (SQLiteException e12) {
                                zzakVar23.zzs.zzay().zzd().zzc("Error storing raw event. appId", zzeh.zzn(zzapVar.zza), e12);
                            }
                        } catch (SQLiteException e13) {
                            zzakVar3.zzs.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(zzfyVar.zzy()), e13);
                            throw e13;
                        }
                        zzakVar3 = this.zze;
                        zzak(zzakVar3);
                        zzfyVar = (com.google.android.gms.internal.measurement.zzfy) zzfxVarZzu.zzay();
                        zzakVar3.zzg();
                        zzakVar3.zzW();
                        Preconditions.checkNotNull(zzfyVar);
                        Preconditions.checkNotEmpty(zzfyVar.zzy());
                        byte[] bArrZzbq2 = zzfyVar.zzbq();
                        zzkr zzkrVar2 = zzakVar3.zzf.zzi;
                        zzak(zzkrVar2);
                        jZzd = zzkrVar2.zzd(bArrZzbq2);
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzfyVar.zzy());
                        contentValues.put("metadata_fingerprint", Long.valueOf(jZzd));
                        contentValues.put("metadata", bArrZzbq2);
                    } catch (IOException e14) {
                        zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeh.zzn(zzfxVarZzu.zzak()), e14);
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    str5 = "raw_events";
                    i10 = 0;
                }
                if (jDelete > 0) {
                    zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(str7), Long.valueOf(jDelete));
                }
                i11 = i10;
                str6 = str5;
                zzapVar = new zzap(this.zzn, zzauVarZza.zzc, str7, zzauVarZza.zza, zzauVarZza.zzd, 0L, bundleZzc);
                zzak zzakVar24 = this.zze;
                zzak(zzakVar24);
                zzaq zzaqVarZzn = zzakVar24.zzn(str7, zzapVar.zzb);
                if (zzaqVarZzn == null) {
                    zzak zzakVar25 = this.zze;
                    zzak(zzakVar25);
                    if (zzakVar25.zzf(str7) >= zzg().zzb(str7) && zZzah) {
                        zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeh.zzn(str7), this.zzn.zzj().zzd(zzapVar.zzb), Integer.valueOf(zzg().zzb(str7)));
                        zzv().zzM(this.zzE, str7, 8, null, null, 0);
                        zzak zzakVar26 = this.zze;
                        zzak(zzakVar26);
                        zzakVar26.zzx();
                        return;
                    }
                    zzaqVarZzc = new zzaq(str7, zzapVar.zzb, 0L, 0L, 0L, zzapVar.zzd, 0L, null, null, null, null);
                } else {
                    zzapVar = zzapVar.zza(this.zzn, zzaqVarZzn.zzf);
                    zzaqVarZzc = zzaqVarZzn.zzc(zzapVar.zzd);
                }
                zzak zzakVar27 = this.zze;
                zzak(zzakVar27);
                zzakVar27.zzE(zzaqVarZzc);
                zzaz().zzg();
                zzB();
                Preconditions.checkNotNull(zzapVar);
                Preconditions.checkNotNull(zzpVar);
                Preconditions.checkNotEmpty(zzapVar.zza);
                Preconditions.checkArgument(zzapVar.zza.equals(zzpVar.zza));
                zzfxVarZzu = com.google.android.gms.internal.measurement.zzfy.zzu();
                zzfxVarZzu.zzZ(1);
                zzfxVarZzu.zzV("android");
                if (!TextUtils.isEmpty(zzpVar.zza)) {
                    zzfxVarZzu.zzA(zzpVar.zza);
                }
                if (!TextUtils.isEmpty(zzpVar.zzd)) {
                    zzfxVarZzu.zzC(zzpVar.zzd);
                }
                if (!TextUtils.isEmpty(zzpVar.zzc)) {
                    zzfxVarZzu.zzD(zzpVar.zzc);
                }
                long j12 = zzpVar.zzj;
                if (j12 != -2147483648L) {
                    zzfxVarZzu.zzE((int) j12);
                }
                zzfxVarZzu.zzR(zzpVar.zze);
                if (!TextUtils.isEmpty(zzpVar.zzb)) {
                    zzfxVarZzu.zzQ(zzpVar.zzb);
                }
                zzfxVarZzu.zzI(zzh((String) Preconditions.checkNotNull(zzpVar.zza)).zzc(zzah.zzb(zzpVar.zzv)).zzh());
                if (TextUtils.isEmpty(zzfxVarZzu.zzal()) && !TextUtils.isEmpty(zzpVar.zzq)) {
                    zzfxVarZzu.zzy(zzpVar.zzq);
                }
                long j13 = zzpVar.zzf;
                if (j13 != 0) {
                    zzfxVarZzu.zzJ(j13);
                }
                zzfxVarZzu.zzM(zzpVar.zzs);
                zzkr zzkrVar3 = this.zzi;
                zzak(zzkrVar3);
                Map mapZzc = zzdu.zzc(zzkrVar3.zzf.zzn.zzau());
                if (mapZzc != null && mapZzc.size() != 0) {
                    arrayList = new ArrayList();
                    int iIntValue = ((Integer) zzdu.zzO.zza(null)).intValue();
                    for (Map.Entry entry : mapZzc.entrySet()) {
                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                            try {
                                int i13 = Integer.parseInt((String) entry.getValue());
                                if (i13 != 0) {
                                    arrayList.add(Integer.valueOf(i13));
                                    if (arrayList.size() >= iIntValue) {
                                        zzkrVar3.zzs.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                        break;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } catch (NumberFormatException e16) {
                                zzkrVar3.zzs.zzay().zzk().zzb("Experiment ID NumberFormatException", e16);
                            }
                        }
                    }
                    if (arrayList.size() == 0) {
                        arrayList = null;
                    }
                    zzak zzakVar28 = this.zze;
                    zzak(zzakVar28);
                    zzakVar28.zzx();
                    throw th;
                }
                arrayList = null;
                if (arrayList != null) {
                    zzfxVarZzu.zzh(arrayList);
                }
                zzah zzahVarZzc = zzh((String) Preconditions.checkNotNull(zzpVar.zza)).zzc(zzah.zzb(zzpVar.zzv));
                zzag zzagVar = zzag.AD_STORAGE;
                if (zzahVarZzc.zzi(zzagVar)) {
                    Pair pairZzd = this.zzk.zzd(zzpVar.zza, zzahVarZzc);
                    if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzpVar.zzo) {
                        zzfxVarZzu.zzaa((String) pairZzd.first);
                        Object obj2 = pairZzd.second;
                        if (obj2 != null) {
                            zzfxVarZzu.zzT(((Boolean) obj2).booleanValue());
                        }
                    }
                }
                this.zzn.zzg().zzu();
                zzfxVarZzu.zzK(Build.MODEL);
                this.zzn.zzg().zzu();
                zzfxVarZzu.zzU(Build.VERSION.RELEASE);
                zzfxVarZzu.zzae((int) this.zzn.zzg().zzb());
                zzfxVarZzu.zzai(this.zzn.zzg().zzc());
                zzaf zzafVarZzg = zzg();
                zzdt zzdtVar = zzdu.zzah;
                if (!zzafVarZzg.zzs(null, zzdtVar)) {
                    zzfxVarZzu.zzz(zzpVar.zzl);
                }
                if (this.zzn.zzJ()) {
                    zzfxVarZzu.zzak();
                    if (!TextUtils.isEmpty(null)) {
                        zzfxVarZzu.zzL(null);
                    }
                }
                zzak zzakVar29 = this.zze;
                zzak(zzakVar29);
                zzg zzgVarZzj2 = zzakVar29.zzj(zzpVar.zza);
                if (zzgVarZzj2 == null) {
                    zzgVarZzj2 = new zzg(this.zzn, zzpVar.zza);
                    zzgVarZzj2.zzH(zzw(zzahVarZzc));
                    zzgVarZzj2.zzV(zzpVar.zzk);
                    zzgVarZzj2.zzW(zzpVar.zzb);
                    if (zzahVarZzc.zzi(zzagVar)) {
                        zzgVarZzj2.zzae(this.zzk.zzf(zzpVar.zza));
                    }
                    zzgVarZzj2.zzaa(0L);
                    zzgVarZzj2.zzab(0L);
                    zzgVarZzj2.zzZ(0L);
                    zzgVarZzj2.zzJ(zzpVar.zzc);
                    zzgVarZzj2.zzK(zzpVar.zzj);
                    zzgVarZzj2.zzI(zzpVar.zzd);
                    zzgVarZzj2.zzX(zzpVar.zze);
                    zzgVarZzj2.zzS(zzpVar.zzf);
                    zzgVarZzj2.zzac(zzpVar.zzh);
                    if (!zzg().zzs(null, zzdtVar)) {
                        zzgVarZzj2.zzG(zzpVar.zzl);
                    }
                    zzgVarZzj2.zzT(zzpVar.zzs);
                    zzak zzakVar30 = this.zze;
                    zzak(zzakVar30);
                    zzakVar30.zzD(zzgVarZzj2);
                }
                if (zzahVarZzc.zzi(zzag.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzgVarZzj2.zzu())) {
                    zzfxVarZzu.zzB((String) Preconditions.checkNotNull(zzgVarZzj2.zzu()));
                }
                if (!TextUtils.isEmpty(zzgVarZzj2.zzx())) {
                    zzfxVarZzu.zzP((String) Preconditions.checkNotNull(zzgVarZzj2.zzx()));
                }
                zzak zzakVar31 = this.zze;
                zzak(zzakVar31);
                List listZzu = zzakVar31.zzu(zzpVar.zza);
                for (int i14 = i11; i14 < listZzu.size(); i14++) {
                    com.google.android.gms.internal.measurement.zzgg zzggVarZzd = com.google.android.gms.internal.measurement.zzgh.zzd();
                    zzggVarZzd.zzf(((zzku) listZzu.get(i14)).zzc);
                    zzggVarZzd.zzg(((zzku) listZzu.get(i14)).zzd);
                    zzkr zzkrVar4 = this.zzi;
                    zzak(zzkrVar4);
                    zzkrVar4.zzu(zzggVarZzd, ((zzku) listZzu.get(i14)).zze);
                    zzfxVarZzu.zzk(zzggVarZzd);
                }
                zzak zzakVar32 = this.zze;
                zzak(zzakVar32);
                zzakVar32.zzC();
                zzak zzakVar33 = this.zze;
                zzak(zzakVar33);
                zzakVar33.zzx();
                zzaf();
                zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / AnimationKt.MillisToNanos));
            } catch (Throwable th2) {
                zzak zzakVar210 = this.zze;
                zzak(zzakVar210);
                zzakVar210.zzx();
                throw th2;
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzY() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzs.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), RootService.RW).getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e5) {
            zzay().zzd().zzb("Failed to acquire storage lock", e5);
            return false;
        } catch (IOException e7) {
            zzay().zzd().zzb("Failed to access storage lock file", e7);
            return false;
        } catch (OverlappingFileLockException e10) {
            zzay().zzk().zzb("Storage lock already acquired", e10);
            return false;
        }
    }

    public final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzjm zzjmVar = this.zzk;
        zzjmVar.zzW();
        zzjmVar.zzg();
        long jZza = zzjmVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzjmVar.zzs.zzv().zzF().nextInt(86400000)) + 1;
            zzjmVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzaa zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    @WorkerThread
    public final zzg zzd(zzp zzpVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        zzg zzgVarZzj = zzakVar.zzj(zzpVar.zza);
        zzah zzahVarZzc = zzh(zzpVar.zza).zzc(zzah.zzb(zzpVar.zzv));
        zzag zzagVar = zzag.AD_STORAGE;
        String strZzf = zzahVarZzc.zzi(zzagVar) ? this.zzk.zzf(zzpVar.zza) : "";
        if (zzgVarZzj == null) {
            zzgVarZzj = new zzg(this.zzn, zzpVar.zza);
            if (zzahVarZzc.zzi(zzag.ANALYTICS_STORAGE)) {
                zzgVarZzj.zzH(zzw(zzahVarZzc));
            }
            if (zzahVarZzc.zzi(zzagVar)) {
                zzgVarZzj.zzae(strZzf);
            }
        } else if (zzahVarZzc.zzi(zzagVar) && strZzf != null && !strZzf.equals(zzgVarZzj.zzA())) {
            zzgVarZzj.zzae(strZzf);
            zzmt.zzc();
            zzaf zzafVarZzg = zzg();
            zzdt zzdtVar = zzdu.zzan;
            if (!zzafVarZzg.zzs(null, zzdtVar) || !zzg().zzs(null, zzdu.zzas) || !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzpVar.zza, zzahVarZzc).first)) {
                zzgVarZzj.zzH(zzw(zzahVarZzc));
            }
            zzmt.zzc();
            if (zzg().zzs(null, zzdtVar) && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzpVar.zza, zzahVarZzc).first)) {
                zzak zzakVar2 = this.zze;
                zzak(zzakVar2);
                if (zzakVar2.zzp(zzpVar.zza, CustomCursor.ID) != null) {
                    zzak zzakVar3 = this.zze;
                    zzak(zzakVar3);
                    if (zzakVar3.zzp(zzpVar.zza, "_lair") == null) {
                        zzku zzkuVar = new zzku(zzpVar.zza, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lair", zzav().currentTimeMillis(), 1L);
                        zzak zzakVar4 = this.zze;
                        zzak(zzakVar4);
                        zzakVar4.zzL(zzkuVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzgVarZzj.zzu()) && zzahVarZzc.zzi(zzag.ANALYTICS_STORAGE)) {
            zzgVarZzj.zzH(zzw(zzahVarZzc));
        }
        zzgVarZzj.zzW(zzpVar.zzb);
        zzgVarZzj.zzE(zzpVar.zzq);
        if (!TextUtils.isEmpty(zzpVar.zzk)) {
            zzgVarZzj.zzV(zzpVar.zzk);
        }
        long j10 = zzpVar.zze;
        if (j10 != 0) {
            zzgVarZzj.zzX(j10);
        }
        if (!TextUtils.isEmpty(zzpVar.zzc)) {
            zzgVarZzj.zzJ(zzpVar.zzc);
        }
        zzgVarZzj.zzK(zzpVar.zzj);
        String str = zzpVar.zzd;
        if (str != null) {
            zzgVarZzj.zzI(str);
        }
        zzgVarZzj.zzS(zzpVar.zzf);
        zzgVarZzj.zzac(zzpVar.zzh);
        if (!TextUtils.isEmpty(zzpVar.zzg)) {
            zzgVarZzj.zzY(zzpVar.zzg);
        }
        if (!zzg().zzs(null, zzdu.zzah)) {
            zzgVarZzj.zzG(zzpVar.zzl);
        }
        zzgVarZzj.zzF(zzpVar.zzo);
        zzgVarZzj.zzad(zzpVar.zzr);
        zzgVarZzj.zzT(zzpVar.zzs);
        zzno.zzc();
        if (zzg().zzs(null, zzdu.zzax)) {
            zzgVarZzj.zzaf(zzpVar.zzt);
        } else {
            zzno.zzc();
            if (zzg().zzs(null, zzdu.zzaw)) {
                zzgVarZzj.zzaf(null);
            }
        }
        if (zzgVarZzj.zzai()) {
            zzak zzakVar5 = this.zze;
            zzak(zzakVar5);
            zzakVar5.zzD(zzgVarZzj);
        }
        return zzgVarZzj;
    }

    public final zzz zzf() {
        zzz zzzVar = this.zzh;
        zzak(zzzVar);
        return zzzVar;
    }

    public final zzaf zzg() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    @WorkerThread
    public final zzah zzh(String str) {
        String string;
        zzah zzahVar = zzah.zza;
        zzaz().zzg();
        zzB();
        zzah zzahVar2 = (zzah) this.zzB.get(str);
        if (zzahVar2 != null) {
            return zzahVar2;
        }
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        Preconditions.checkNotNull(str);
        zzakVar.zzg();
        zzakVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzakVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                zzah zzahVarZzb = zzah.zzb(string);
                zzU(str, zzahVarZzb);
                return zzahVarZzb;
            } catch (SQLiteException e5) {
                zzakVar.zzs.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e5);
                throw e5;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final zzak zzi() {
        zzak zzakVar = this.zze;
        zzak(zzakVar);
        return zzakVar;
    }

    public final zzec zzj() {
        return this.zzn.zzj();
    }

    public final zzen zzl() {
        zzen zzenVar = this.zzd;
        zzak(zzenVar);
        return zzenVar;
    }

    public final zzep zzm() {
        zzep zzepVar = this.zzf;
        if (zzepVar != null) {
            return zzepVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfi zzo() {
        zzfi zzfiVar = this.zzc;
        zzak(zzfiVar);
        return zzfiVar;
    }

    public final zzfr zzq() {
        return this.zzn;
    }

    public final zzib zzr() {
        zzib zzibVar = this.zzj;
        zzak(zzibVar);
        return zzibVar;
    }

    public final zzjm zzs() {
        return this.zzk;
    }

    public final zzkr zzu() {
        zzkr zzkrVar = this.zzi;
        zzak(zzkrVar);
        return zzkrVar;
    }

    public final zzkw zzv() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    @WorkerThread
    public final String zzw(zzah zzahVar) {
        if (!zzahVar.zzi(zzag.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzF().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzx(zzp zzpVar) {
        try {
            return (String) zzaz().zzh(new zzkk(this, zzpVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzpVar.zza), e5);
            return null;
        }
    }

    @WorkerThread
    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
