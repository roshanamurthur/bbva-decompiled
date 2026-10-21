package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.Nullable;
import com.bbva.notifications.constants.PushConstants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.huawei.hms.feature.model.b;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ye.c;
import ye.d;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FakeSplitInstallManager implements SplitInstallManager {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f46327o = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f46328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.zzs f46330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzby f46331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzbs f46332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.zzt f46333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.zzt f46334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f46335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.zzo f46336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f46337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f46338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f46339l;
    public final Set m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f46340n;

    @Deprecated
    public FakeSplitInstallManager(Context context, File file) {
        this(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zze
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final Object zza() {
                int i10 = FakeSplitInstallManager.zza;
                return zzv.zza;
            }
        });
    }

    public final Task a(@SplitInstallErrorCode final int i10) {
        c(new d() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // ye.d
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                int i11 = i10;
                int i12 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i11, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return Tasks.forException(new SplitInstallException(i10));
    }

    public final com.google.android.play.core.splitinstall.zzk b() {
        Context context = this.f46329b;
        try {
            com.google.android.play.core.splitinstall.zzk zzkVarZza = this.f46330c.zza(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (zzkVarZza != null) {
                return zzkVarZza;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e5) {
            throw new IllegalStateException("App is not found in PackageManager", e5);
        }
    }

    @Nullable
    public final synchronized SplitInstallSessionState c(d dVar) {
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) this.f46338k.get();
        SplitInstallSessionState splitInstallSessionStateZza = dVar.zza(splitInstallSessionState);
        AtomicReference atomicReference = this.f46338k;
        while (!atomicReference.compareAndSet(splitInstallSessionState, splitInstallSessionStateZza)) {
            if (atomicReference.get() != splitInstallSessionState && atomicReference.get() != splitInstallSessionState) {
                return null;
            }
        }
        return splitInstallSessionStateZza;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(final int i10) {
        try {
            SplitInstallSessionState splitInstallSessionStateC = c(new d() { // from class: com.google.android.play.core.splitinstall.testing.zzh
                @Override // ye.d
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final int i11 = i10;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzo
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            int iStatus;
                            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
                            int i12 = i11;
                            int i13 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 != null && i12 == splitInstallSessionState2.sessionId() && ((iStatus = splitInstallSessionState2.status()) == 1 || iStatus == 2 || iStatus == 8 || iStatus == 9 || iStatus == 7)) {
                                return SplitInstallSessionState.create(i12, 7, splitInstallSessionState2.errorCode(), splitInstallSessionState2.bytesDownloaded(), splitInstallSessionState2.totalBytesToDownload(), splitInstallSessionState2.moduleNames(), splitInstallSessionState2.languages());
                            }
                            throw new SplitInstallException(-3);
                        }
                    });
                }
            });
            if (splitInstallSessionStateC != null) {
                this.f46328a.post(new zzf(this, splitInstallSessionStateC));
            }
            return Tasks.forResult(null);
        } catch (zzbx e5) {
            return Tasks.forException(e5.zzb(SplitInstallException.class));
        }
    }

    public final boolean d(@Nullable final Integer num, final int i10, final int i11, @Nullable final Long l6, @Nullable final Long l7, @Nullable final List list, @Nullable final ArrayList arrayList) {
        SplitInstallSessionState splitInstallSessionStateC = c(new d() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // ye.d
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l10 = l6;
                Long l11 = l7;
                List<String> list2 = list;
                List<String> list3 = arrayList;
                int i14 = FakeSplitInstallManager.zza;
                SplitInstallSessionState splitInstallSessionStateCreate = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
                return SplitInstallSessionState.create(num2 == null ? splitInstallSessionStateCreate.sessionId() : num2.intValue(), i12, i13, l10 == null ? splitInstallSessionStateCreate.bytesDownloaded() : l10.longValue(), l11 == null ? splitInstallSessionStateCreate.totalBytesToDownload() : l11.longValue(), list2 == null ? splitInstallSessionStateCreate.moduleNames() : list2, list3 == null ? splitInstallSessionStateCreate.languages() : list3);
            }
        });
        if (splitInstallSessionStateC == null) {
            return false;
        }
        this.f46328a.post(new zzf(this, splitInstallSessionStateC));
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        com.google.android.play.core.splitinstall.zzs zzsVar = this.f46330c;
        if (zzsVar.zzd() != null) {
            hashSet.addAll(zzsVar.zzd());
        }
        hashSet.addAll(this.m);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f46330c.zzc());
        hashSet.addAll(this.f46339l);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i10) {
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) this.f46338k.get();
        return (splitInstallSessionState == null || splitInstallSessionState.sessionId() != i10) ? Tasks.forException(new SplitInstallException(-4)) : Tasks.forResult(splitInstallSessionState);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) this.f46338k.get();
        return Tasks.forResult(splitInstallSessionState != null ? Collections.singletonList(splitInstallSessionState) : Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46334g.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z10) {
        this.f46340n.set(z10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(final SplitInstallRequest splitInstallRequest) {
        Integer numZza;
        File[] fileArr;
        try {
            SplitInstallSessionState splitInstallSessionStateC = c(new d() { // from class: com.google.android.play.core.splitinstall.testing.zzk
                @Override // ye.d
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final SplitInstallRequest splitInstallRequest2 = splitInstallRequest;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
                            SplitInstallRequest splitInstallRequest3 = splitInstallRequest2;
                            int i10 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 == null || splitInstallSessionState2.hasTerminalStatus()) {
                                return SplitInstallSessionState.create(splitInstallSessionState2 != null ? 1 + splitInstallSessionState2.sessionId() : 1, 1, 0, 0L, 0L, splitInstallRequest3.getModuleNames(), new ArrayList());
                            }
                            throw new SplitInstallException(-1);
                        }
                    });
                }
            });
            if (splitInstallSessionStateC == null) {
                return a(-100);
            }
            int iSessionId = splitInstallSessionStateC.sessionId();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = splitInstallRequest.getLanguages().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f46337j.listFiles(new FileFilter() { // from class: com.google.android.play.core.splitinstall.testing.zzl
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i10 = FakeSplitInstallManager.zza;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return a(-5);
            }
            char c10 = 0;
            int i10 = 0;
            long length = 0;
            while (i10 < fileArrListFiles.length) {
                File file = fileArrListFiles[i10];
                String strZza = zzbw.zza(file);
                String str = strZza.split("\\.config\\.", 2)[c10];
                hashSet.add(strZza);
                if (splitInstallRequest.getModuleNames().contains(str)) {
                    String str2 = strZza.split("\\.config\\.", 2)[0];
                    HashSet hashSet2 = new HashSet(this.f46332e.zza());
                    Map mapZza = b().zza(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapZza.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    for (Iterator it3 = hashSet2.iterator(); it3.hasNext(); it3 = it3) {
                        String str3 = (String) it3.next();
                        File[] fileArr2 = fileArrListFiles;
                        if (str3.contains(PushConstants.GE_PARAMS_SEPARATOR)) {
                            str3 = str3.split(PushConstants.GE_PARAMS_SEPARATOR, -1)[0];
                        }
                        hashSet4.add(str3);
                        fileArrListFiles = fileArr2;
                    }
                    fileArr = fileArrListFiles;
                    hashSet4.addAll(this.m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapZza.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strZza) || hashSet5.contains(strZza)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i10++;
                    fileArrListFiles = fileArr;
                    c10 = 0;
                } else {
                    fileArr = fileArrListFiles;
                }
                List<Locale> languages = splitInstallRequest.getLanguages();
                ArrayList arrayList3 = new ArrayList(this.f46339l);
                arrayList3.addAll(Arrays.asList("", "base"));
                Map mapZza2 = b().zza(arrayList3);
                for (Locale locale : languages) {
                    if (mapZza2.containsKey(locale.getLanguage()) && ((Set) mapZza2.get(locale.getLanguage())).contains(strZza)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i10++;
                fileArrListFiles = fileArr;
                c10 = 0;
            }
            hashSet.toString();
            String.valueOf(splitInstallRequest.getModuleNames());
            int size = splitInstallRequest.getModuleNames().size();
            zzby zzbyVar = this.f46331d;
            if (size != 1 || (numZza = (Integer) ((zzv) zzbyVar.zza()).zzb().get(splitInstallRequest.getModuleNames().get(0))) == null) {
                numZza = ((zzv) zzbyVar.zza()).zza();
            }
            if (numZza != null) {
                return a(numZza.intValue());
            }
            if (!hashSet.containsAll(new HashSet(splitInstallRequest.getModuleNames()))) {
                return a(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List<String> moduleNames = splitInstallRequest.getModuleNames();
            Integer numValueOf = Integer.valueOf(iSessionId);
            d(numValueOf, 1, 0, 0L, lValueOf, moduleNames, arrayList);
            this.f46335h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzm
                @Override // java.lang.Runnable
                public final void run() {
                    final FakeSplitInstallManager fakeSplitInstallManager = this.zza;
                    List<File> list = arrayList2;
                    final List list2 = arrayList;
                    fakeSplitInstallManager.getClass();
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    for (File file2 : list) {
                        String strZza2 = zzbw.zza(file2);
                        Uri uriFromFile = Uri.fromFile(file2);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(uriFromFile, fakeSplitInstallManager.f46329b.getContentResolver().getType(uriFromFile));
                        intent.addFlags(1);
                        intent.putExtra("module_name", strZza2.split("\\.config\\.", 2)[0]);
                        intent.putExtra(b.f50442l, strZza2);
                        arrayList4.add(intent);
                        arrayList5.add(zzbw.zza(file2).split("\\.config\\.", 2)[0]);
                    }
                    SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) fakeSplitInstallManager.f46338k.get();
                    if (splitInstallSessionState == null) {
                        return;
                    }
                    final long j10 = splitInstallSessionState.totalBytesToDownload();
                    fakeSplitInstallManager.f46335h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            final FakeSplitInstallManager fakeSplitInstallManager2 = fakeSplitInstallManager;
                            final long j11 = j10;
                            final List list3 = arrayList4;
                            final List list4 = arrayList5;
                            final List list5 = list2;
                            fakeSplitInstallManager2.getClass();
                            long j12 = 0;
                            int i11 = 0;
                            while (i11 < 3) {
                                long jMin = Math.min(j11, (j11 / 3) + j12);
                                fakeSplitInstallManager2.d(null, 2, 0, Long.valueOf(jMin), Long.valueOf(j11), null, null);
                                SystemClock.sleep(FakeSplitInstallManager.f46327o);
                                SplitInstallSessionState splitInstallSessionState2 = (SplitInstallSessionState) fakeSplitInstallManager2.f46338k.get();
                                if (splitInstallSessionState2.status() == 9 || splitInstallSessionState2.status() == 7 || splitInstallSessionState2.status() == 6) {
                                    return;
                                }
                                i11++;
                                j12 = jMin;
                            }
                            fakeSplitInstallManager2.f46335h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FakeSplitInstallManager fakeSplitInstallManager3 = fakeSplitInstallManager2;
                                    List list6 = list3;
                                    List list7 = list4;
                                    List list8 = list5;
                                    long j13 = j11;
                                    if (fakeSplitInstallManager3.f46340n.get()) {
                                        fakeSplitInstallManager3.d(null, 6, -6, null, null, null, null);
                                        return;
                                    }
                                    com.google.android.play.core.splitinstall.zzo zzoVar = fakeSplitInstallManager3.f46336i;
                                    if (zzoVar.zza() != null) {
                                        zzoVar.zza().zzd(list6, new c(j13, fakeSplitInstallManager3, list7, list8, list6, false));
                                        return;
                                    }
                                    fakeSplitInstallManager3.f46339l.addAll(list7);
                                    fakeSplitInstallManager3.m.addAll(list8);
                                    Long lValueOf2 = Long.valueOf(j13);
                                    fakeSplitInstallManager3.d(null, 5, 0, lValueOf2, lValueOf2, null, null);
                                }
                            });
                        }
                    });
                }
            });
            return Tasks.forResult(numValueOf);
        } catch (zzbx e5) {
            return a(((SplitInstallException) e5.zzb(SplitInstallException.class)).getErrorCode());
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46334g.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46333f.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46333f.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    public FakeSplitInstallManager(Context context, @Nullable File file, com.google.android.play.core.splitinstall.zzs zzsVar, zzby zzbyVar) {
        Executor executorZza = com.google.android.play.core.splitcompat.zzd.zza();
        zzbs zzbsVar = new zzbs(context);
        zzj zzjVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.zzj
        };
        this.f46328a = new Handler(Looper.getMainLooper());
        this.f46338k = new AtomicReference();
        this.f46339l = Collections.synchronizedSet(new HashSet());
        this.m = Collections.synchronizedSet(new HashSet());
        this.f46340n = new AtomicBoolean(false);
        this.f46329b = context;
        this.f46337j = file;
        this.f46330c = zzsVar;
        this.f46331d = zzbyVar;
        this.f46335h = executorZza;
        this.f46332e = zzbsVar;
        this.f46334g = new com.google.android.play.core.splitinstall.internal.zzt();
        this.f46333f = new com.google.android.play.core.splitinstall.internal.zzt();
        this.f46336i = com.google.android.play.core.splitinstall.zzo.zza;
    }
}
