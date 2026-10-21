package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcp {
    private static volatile zzdh zza;

    private zzcp() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: all -> 0x001c, TryCatch #5 {all -> 0x001c, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0013, B:18:0x0030, B:74:0x015a, B:13:0x001f, B:15:0x0027, B:20:0x0037, B:22:0x003d, B:24:0x0043, B:25:0x0047, B:73:0x0155, B:75:0x015d, B:76:0x0160, B:77:0x0161, B:26:0x004b, B:28:0x004f, B:29:0x005c, B:31:0x0062, B:36:0x0073, B:38:0x0079, B:39:0x007d, B:60:0x0126, B:61:0x0129, B:69:0x014a, B:68:0x0135, B:70:0x014b, B:71:0x0150, B:72:0x0151, B:34:0x006a, B:35:0x006f), top: B:91:0x0003, inners: #3 }] */
    public static zzdh zza(Context context) {
        zzdh zzdhVar;
        zzdh zzdhVarZzc;
        zzdh zzdhVarZzc2;
        synchronized (zzcp.class) {
            try {
                zzdhVar = zza;
                if (zzdhVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        zzdhVarZzc2 = zzdh.zzc();
                    } else if (str2.contains("dev-keys") || str2.contains(RootService.TEST_KEYS)) {
                        if (zzcc.zzb() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzdhVarZzc = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                            } catch (RuntimeException unused) {
                                zzdhVarZzc = zzdh.zzc();
                            }
                            if (zzdhVarZzc.zzb()) {
                                Object objZza = zzdhVarZzc.zza();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objZza)));
                                    try {
                                        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length == 3) {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!simpleArrayMap.containsKey(str3)) {
                                                    simpleArrayMap.put(str3, new SimpleArrayMap());
                                                }
                                                ((SimpleArrayMap) simpleArrayMap.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        Log.w("HermeticFileOverrides", "Parsed " + objZza.toString() + " for Android package " + context.getPackageName());
                                        zzci zzciVar = new zzci(simpleArrayMap);
                                        bufferedReader.close();
                                        zzdhVarZzc2 = zzdh.zzd(zzciVar);
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
                                zzdhVarZzc2 = zzdh.zzc();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        zzdhVarZzc2 = zzdh.zzc();
                    }
                    zzdhVar = zzdhVarZzc2;
                    zza = zzdhVar;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return zzdhVar;
    }
}
