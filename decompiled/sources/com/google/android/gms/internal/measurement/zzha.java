package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzha implements zzhe {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final ContentObserver zze;
    private final Object zzf;
    private volatile Map zzg;

    @GuardedBy("this")
    private final List zzh;

    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map zzb = new ArrayMap();
    public static final String[] zza = {"key", "value"};

    private zzha(ContentResolver contentResolver, Uri uri) {
        zzgz zzgzVar = new zzgz(this, null);
        this.zze = zzgzVar;
        this.zzf = new Object();
        this.zzh = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        contentResolver.registerContentObserver(uri, false, zzgzVar);
    }

    public static zzha zza(ContentResolver contentResolver, Uri uri) {
        zzha zzhaVar;
        synchronized (zzha.class) {
            Map map = zzb;
            zzhaVar = (zzha) map.get(uri);
            if (zzhaVar == null) {
                try {
                    zzha zzhaVar2 = new zzha(contentResolver, uri);
                    try {
                        map.put(uri, zzhaVar2);
                    } catch (SecurityException unused) {
                    }
                    zzhaVar = zzhaVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzhaVar;
    }

    public static synchronized void zze() {
        try {
            for (zzha zzhaVar : zzb.values()) {
                zzhaVar.zzc.unregisterContentObserver(zzhaVar.zze);
            }
            zzb.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    public final Map zzc() {
        Map map;
        Map map2 = this.zzg;
        if (map2 == null) {
            synchronized (this.zzf) {
                try {
                    map2 = this.zzg;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = (Map) zzhc.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzgy
                                @Override // com.google.android.gms.internal.measurement.zzhd
                                public final Object zza() {
                                    return this.zza.zzd();
                                }
                            });
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                        this.zzg = map;
                        map2 = map;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final /* synthetic */ Map zzd() {
        Cursor cursorQuery = this.zzc.query(this.zzd, zza, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return arrayMap;
        } finally {
            cursorQuery.close();
        }
    }

    public final void zzf() {
        synchronized (this.zzf) {
            this.zzg = null;
            zzhu.zzd();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzh.iterator();
                while (it.hasNext()) {
                    ((zzhb) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
