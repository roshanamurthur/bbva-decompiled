package xe;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzn;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzs;
import com.google.android.play.core.splitinstall.zzx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements SplitInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f94545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzx f94546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzs f94547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbe f94548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f94549e = new Handler(Looper.getMainLooper());

    public b(t tVar, zzx zzxVar, zzs zzsVar, zzbe zzbeVar) {
        this.f94545a = tVar;
        this.f94546b = zzxVar;
        this.f94547c = zzsVar;
        this.f94548d = zzbeVar;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(int i10) {
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("cancelInstall(%d)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new j(tVar, taskCompletionSource, i10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("deferredInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new e(tVar, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        ArrayList arrayListA = a(list);
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("deferredLanguageInstall(%s)", arrayListA);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new f(tVar, taskCompletionSource, arrayListA, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        ArrayList arrayListA = a(list);
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("deferredLanguageUninstall(%s)", arrayListA);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new g(tVar, taskCompletionSource, arrayListA, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        zzbe zzbeVar = this.f94548d;
        zzbeVar.getClass();
        synchronized (zzbe.class) {
            HashSet hashSet = new HashSet(zzbeVar.zza());
            Iterator<String> it = list.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add(it.next());
            }
            if (zAdd) {
                try {
                    zzbeVar.f46360a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("deferredUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new d(tVar, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        Set<String> setZzd = this.f94547c.zzd();
        return setZzd == null ? Collections.emptySet() : setZzd;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return this.f94547c.zzc();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i10) {
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("getSessionState(%d)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new h(tVar, taskCompletionSource, i10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        t tVar = this.f94545a;
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("getSessionStates", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new i(tVar, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f94546b.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        activityResultLauncher.launch(new IntentSenderRequest.Builder(splitInstallSessionState.resolutionIntent().getIntentSender()).build());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(SplitInstallRequest splitInstallRequest) {
        Set setZzd;
        zzn zznVar = new zzn();
        zznVar.zzb(1);
        splitInstallRequest.getLanguages().isEmpty();
        List<Locale> languages = splitInstallRequest.getLanguages();
        if (!languages.isEmpty() && (setZzd = this.f94547c.zzd()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setZzd.containsAll(hashSet)) {
                if (this.f94547c.zzc().containsAll(splitInstallRequest.getModuleNames()) && Collections.disjoint(splitInstallRequest.getModuleNames(), this.f94548d.zza())) {
                    this.f94549e.post(new z(this, splitInstallRequest));
                    return Tasks.forResult(0);
                }
            }
        } else if (this.f94547c.zzc().containsAll(splitInstallRequest.getModuleNames())) {
            this.f94549e.post(new z(this, splitInstallRequest));
            return Tasks.forResult(0);
        }
        zzbe zzbeVar = this.f94548d;
        List<String> moduleNames = splitInstallRequest.getModuleNames();
        zzbeVar.getClass();
        synchronized (zzbe.class) {
            Set<String> setZza = zzbeVar.zza();
            HashSet hashSet2 = new HashSet();
            boolean z10 = false;
            for (String str : setZza) {
                if (moduleNames.contains(str)) {
                    z10 = true;
                } else {
                    hashSet2.add(str);
                }
            }
            if (z10) {
                try {
                    zzbeVar.f46360a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet2).apply();
                } catch (Exception unused) {
                }
            }
        }
        t tVar = this.f94545a;
        List<String> moduleNames2 = splitInstallRequest.getModuleNames();
        ArrayList arrayListA = a(splitInstallRequest.getLanguages());
        zzaf zzafVar = tVar.f94580b;
        if (zzafVar == null) {
            return t.d();
        }
        t.f94577c.zzd("startInstall(%s,%s)", moduleNames2, arrayListA);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzafVar.zzs(new c(tVar, taskCompletionSource, moduleNames2, arrayListA, zznVar, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f94546b.zzd(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f94546b.c(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f94546b.d(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i10) throws IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        activity.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i10, null, 0, 0, 0);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
