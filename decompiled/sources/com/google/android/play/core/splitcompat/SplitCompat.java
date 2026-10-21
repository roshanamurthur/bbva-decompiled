package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzr;
import com.google.android.play.core.splitinstall.zzx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import we.d;
import we.i;
import we.j;
import we.k;
import we.l;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class SplitCompat {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f46243e = new AtomicReference(null);
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f46244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbe f46245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("emulatedSplits")
    public final HashSet f46246c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zza f46247d;

    public SplitCompat(Context context) {
        try {
            zze zzeVar = new zze(context);
            this.f46244a = zzeVar;
            this.f46247d = new zza(zzeVar);
            this.f46245b = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e5) {
            throw new zzbh("Failed to initialize FileStorage", e5);
        }
    }

    public static boolean c(final Context context, boolean z10) {
        boolean z11;
        AtomicReference atomicReference = f46243e;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, splitCompat)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) atomicReference.get();
        if (z11) {
            com.google.android.play.core.splitinstall.zzo.zza.zzb(new zzak(context, zzd.zza(), new zzam(context, splitCompat2.f46244a, new zzah()), splitCompat2.f46244a, new zzs()));
            zzr.zzb(new i(splitCompat2));
            zzd.zza().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.zzo
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    AtomicReference atomicReference2 = SplitCompat.f46243e;
                    try {
                        zzx.zzg(context2).zzc(true);
                    } catch (SecurityException unused) {
                    }
                }
            });
        }
        try {
            splitCompat2.b(context, z10);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean install(@NonNull Context context) {
        return c(context, false);
    }

    public static boolean installActivity(@NonNull Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        SplitCompat splitCompat = (SplitCompat) f46243e.get();
        if (splitCompat == null) {
            if (context.getApplicationContext() != null) {
                install(context.getApplicationContext());
            }
            return install(context);
        }
        zza zzaVar = splitCompat.f46247d;
        HashSet hashSetA = splitCompat.a();
        synchronized (zzaVar) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                threadPolicy = null;
            }
            try {
                HashSet hashSet = new HashSet();
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    hashSet.add(zzaVar.f46248a.zzg((String) it.next()));
                }
                zzaVar.zza(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception unused3) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                return false;
            } catch (Throwable th2) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        }
        return true;
    }

    public static boolean zzd(Context context) {
        return c(context, true);
    }

    public static boolean zze() {
        return f46243e.get() != null;
    }

    public final HashSet a() {
        HashSet hashSet;
        synchronized (this.f46246c) {
            hashSet = new HashSet(this.f46246c);
        }
        return hashSet;
    }

    @RequiresApi(21)
    public final synchronized void b(Context context, boolean z10) throws IOException {
        try {
            if (z10) {
                this.f46244a.zzk();
            } else {
                zzd.zza().execute(new j(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet<l> hashSetA = this.f46244a.a();
                Set setZza = this.f46245b.zza();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    String strB = ((l) it.next()).b();
                    if (arrayList.contains(strB) || setZza.contains(com.google.android.play.core.splitinstall.zzs.zzb(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z10) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        zze.zzl(this.f46244a.zzg((String) it2.next()));
                    }
                    this.f46245b.zzb();
                } else if (!hashSet.isEmpty()) {
                    zzd.zza().execute(new k(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = hashSetA.iterator();
                while (it3.hasNext()) {
                    String strB2 = ((l) it3.next()).b();
                    if (!com.google.android.play.core.splitinstall.zzs.zze(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!com.google.android.play.core.splitinstall.zzs.zze(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<l> hashSet3 = new HashSet(hashSetA.size());
                for (l lVar : hashSetA) {
                    String strB3 = lVar.b();
                    zzu zzuVar = com.google.android.play.core.splitinstall.zzs.f46369c;
                    if (strB3.startsWith("config.") || hashSet2.contains(com.google.android.play.core.splitinstall.zzs.zzb(lVar.b()))) {
                        hashSet3.add(lVar);
                    }
                }
                zzn zznVar = new zzn(this.f46244a);
                zzan zzanVarZza = zzao.zza();
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z10) {
                    zzanVarZza.zza(classLoader, zznVar.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        l lVar2 = (l) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        zzn.b(lVar2, new d(zznVar, lVar2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            zzanVarZza.zza(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (l lVar3 : hashSet3) {
                    try {
                        ZipFile zipFile2 = new ZipFile(lVar3.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry == null || zzanVarZza.zzb(classLoader, this.f46244a.zza(lVar3.b()), lVar3.a(), z10)) {
                                hashSet5.add(lVar3.a());
                            } else {
                                Log.w("SplitCompat", "split was not installed ".concat(lVar3.a().toString()));
                            }
                        } catch (IOException e5) {
                            e = e5;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e7) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e7);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    }
                }
                this.f46247d.zza(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (l lVar4 : hashSet3) {
                    if (hashSet5.contains(lVar4.a())) {
                        lVar4.b();
                        hashSet6.add(lVar4.b());
                    } else {
                        lVar4.b();
                    }
                }
                synchronized (this.f46246c) {
                    this.f46246c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e11) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
