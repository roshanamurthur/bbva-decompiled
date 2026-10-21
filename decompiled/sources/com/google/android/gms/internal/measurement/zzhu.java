package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzhu {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    final zzhr zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzhw zzh = new zzhw(zzhl.zza, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzhu(zzhr zzhrVar, String str, Object obj, boolean z10, zzht zzhtVar) {
        if (zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhrVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            try {
                                zzhs zzhsVar = zze;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (zzhsVar == null || zzhsVar.zza() != context) {
                                    zzha.zze();
                                    zzhv.zzc();
                                    zzhh.zze();
                                    zze = new zzgx(context, zzif.zza(new zzib() { // from class: com.google.android.gms.internal.measurement.zzhm
                                        @Override // com.google.android.gms.internal.measurement.zzib
                                        public final Object zza() {
                                            zzhz zzhzVarZzc;
                                            zzhz zzhzVarZzc2;
                                            Context contextCreateDeviceProtectedStorageContext = context;
                                            int i10 = zzhu.zzc;
                                            String str = Build.TYPE;
                                            String str2 = Build.TAGS;
                                            if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains(RootService.TEST_KEYS))) {
                                                return zzhz.zzc();
                                            }
                                            if (zzgw.zza() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                                            }
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                StrictMode.allowThreadDiskWrites();
                                                try {
                                                    File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                    zzhzVarZzc = file.exists() ? zzhz.zzd(file) : zzhz.zzc();
                                                } catch (RuntimeException unused) {
                                                    zzhzVarZzc = zzhz.zzc();
                                                }
                                                if (zzhzVarZzc.zzb()) {
                                                    File file2 = (File) zzhzVarZzc.zza();
                                                    try {
                                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                        try {
                                                            HashMap map = new HashMap();
                                                            HashMap map2 = new HashMap();
                                                            while (true) {
                                                                String line = bufferedReader.readLine();
                                                                if (line == null) {
                                                                    break;
                                                                }
                                                                String[] strArrSplit = line.split(" ", 3);
                                                                if (strArrSplit.length == 3) {
                                                                    String str3 = new String(strArrSplit[0]);
                                                                    String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                                    String strDecode2 = (String) map2.get(strArrSplit[2]);
                                                                    if (strDecode2 == null) {
                                                                        String str4 = new String(strArrSplit[2]);
                                                                        strDecode2 = Uri.decode(str4);
                                                                        if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                                            map2.put(str4, strDecode2);
                                                                        }
                                                                    }
                                                                    if (!map.containsKey(str3)) {
                                                                        map.put(str3, new HashMap());
                                                                    }
                                                                    ((Map) map.get(str3)).put(strDecode, strDecode2);
                                                                } else if (line.length() != 0) {
                                                                    "Invalid: ".concat(line);
                                                                }
                                                            }
                                                            new StringBuilder(file2.toString().length() + 7);
                                                            zzhi zzhiVar = new zzhi(map);
                                                            bufferedReader.close();
                                                            zzhzVarZzc2 = zzhz.zzd(zzhiVar);
                                                        } catch (Throwable th2) {
                                                            try {
                                                                bufferedReader.close();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (IOException e5) {
                                                        throw new RuntimeException(e5);
                                                    }
                                                } else {
                                                    zzhzVarZzc2 = zzhz.zzc();
                                                }
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                return zzhzVarZzc2;
                                            } catch (Throwable th4) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                throw th4;
                                            }
                                        }
                                    }));
                                    zzi.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0060, B:53:0x00db, B:55:0x00eb, B:57:0x00ff, B:58:0x0102, B:59:0x0106, B:41:0x00b3, B:43:0x00b9, B:47:0x00cb, B:49:0x00d1, B:52:0x00d9, B:46:0x00c9, B:28:0x0069, B:30:0x006f, B:32:0x007d, B:36:0x00a2, B:38:0x00ac, B:34:0x0094, B:60:0x010b, B:61:0x0110, B:62:0x0111), top: B:68:0x001c }] */
    public final Object zzb() {
        zzhe zzheVarZza;
        Object objZzb;
        Object objZza;
        String str;
        String strZzc;
        zzhz zzhzVar;
        String strZza;
        if (!this.zzm && this.zzb == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i10 = zzi.get();
        if (this.zzk < i10) {
            synchronized (this) {
                try {
                    if (this.zzk < i10) {
                        zzhs zzhsVar = zze;
                        if (zzhsVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        boolean z10 = this.zza.zzf;
                        String strZzc2 = zzhh.zza(zzhsVar.zza()).zzb("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                        if (strZzc2 == null || !zzgv.zzc.matcher(strZzc2).matches()) {
                            if (this.zza.zzb == null) {
                                Context contextZza = zzhsVar.zza();
                                String str2 = this.zza.zza;
                                zzheVarZza = zzhv.zza(contextZza, null);
                            } else if (zzhj.zza(zzhsVar.zza(), this.zza.zzb)) {
                                boolean z11 = this.zza.zzh;
                                zzheVarZza = zzha.zza(zzhsVar.zza().getContentResolver(), this.zza.zzb);
                            } else {
                                zzheVarZza = null;
                            }
                            if (zzheVarZza != null && (objZzb = zzheVarZza.zzb(zzc())) != null) {
                                objZza = zza(objZzb);
                            }
                            if (objZza == null) {
                                if (this.zza.zze) {
                                    objZza = null;
                                } else {
                                    zzhh zzhhVarZza = zzhh.zza(zzhsVar.zza());
                                    if (this.zza.zze) {
                                        str = null;
                                    } else {
                                        str = this.zzb;
                                    }
                                    strZzc = zzhhVarZza.zzb(str);
                                    if (strZzc != null) {
                                        objZza = zza(strZzc);
                                    } else {
                                        objZza = null;
                                    }
                                }
                                if (objZza == null) {
                                    objZza = this.zzj;
                                }
                            }
                            zzhzVar = (zzhz) zzhsVar.zzb().zza();
                            if (zzhzVar.zzb()) {
                                zzhi zzhiVar = (zzhi) zzhzVar.zza();
                                zzhr zzhrVar = this.zza;
                                strZza = zzhiVar.zza(zzhrVar.zzb, null, zzhrVar.zzd, this.zzb);
                                if (strZza == null) {
                                    objZza = this.zzj;
                                } else {
                                    objZza = zza(strZza);
                                }
                            }
                            this.zzl = objZza;
                            this.zzk = i10;
                        } else if (Log.isLoggable("PhenotypeFlag", 3)) {
                            String strValueOf = String.valueOf(zzc());
                            if (strValueOf.length() != 0) {
                                "Bypass reading Phenotype values for flag: ".concat(strValueOf);
                            }
                        }
                        objZza = null;
                        if (objZza == null) {
                            if (this.zza.zze) {
                                zzhh zzhhVarZza2 = zzhh.zza(zzhsVar.zza());
                                if (this.zza.zze) {
                                    str = null;
                                } else {
                                    str = this.zzb;
                                }
                                strZzc = zzhhVarZza2.zzb(str);
                                if (strZzc != null) {
                                    objZza = zza(strZzc);
                                } else {
                                    objZza = null;
                                }
                            } else {
                                objZza = null;
                            }
                            if (objZza == null) {
                                objZza = this.zzj;
                            }
                        }
                        zzhzVar = (zzhz) zzhsVar.zzb().zza();
                        if (zzhzVar.zzb()) {
                            zzhi zzhiVar2 = (zzhi) zzhzVar.zza();
                            zzhr zzhrVar2 = this.zza;
                            strZza = zzhiVar2.zza(zzhrVar2.zzb, null, zzhrVar2.zzd, this.zzb);
                            if (strZza == null) {
                                objZza = this.zzj;
                            } else {
                                objZza = zza(strZza);
                            }
                        }
                        this.zzl = objZza;
                        this.zzk = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
