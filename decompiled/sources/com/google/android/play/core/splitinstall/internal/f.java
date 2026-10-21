package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements zzan {
    public static boolean a(ClassLoader classLoader, File file, File file2, boolean z10, zzas zzasVar, String str, zzar zzarVar) {
        ArrayList arrayList = new ArrayList();
        Object objZzc = zzbk.zzb(classLoader, "pathList", Object.class).zzc();
        zzbi zzbiVarZza = zzbk.zza(objZzc, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) zzbiVarZza.zzc());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) zzbk.zzb(it.next(), str, File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !zzarVar.zza(objZzc, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        zzbiVarZza.zza(Arrays.asList(zzasVar.zza(objZzc, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i10));
            } catch (Exception unused) {
            }
        }
        zzbk.zza(objZzc, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
        throw zzbhVar;
    }
}
