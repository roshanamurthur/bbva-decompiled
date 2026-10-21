package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f468a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, Integer> f469b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, e> f470c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<String> f471d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Map<String, d<?>> f472e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<String, Object> f473f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Bundle f474g = new Bundle();

    public class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f475p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ActivityResultCallback f476q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f477r0;

        public a(String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
            this.f475p0 = str;
            this.f476q0 = activityResultCallback;
            this.f477r0 = activityResultContract;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            boolean zEquals = Lifecycle.Event.ON_START.equals(event);
            String str = this.f475p0;
            ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
            if (!zEquals) {
                if (Lifecycle.Event.ON_STOP.equals(event)) {
                    activityResultRegistry.f472e.remove(str);
                    return;
                } else {
                    if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        activityResultRegistry.b(str);
                        return;
                    }
                    return;
                }
            }
            Map<String, d<?>> map = activityResultRegistry.f472e;
            ActivityResultContract activityResultContract = this.f477r0;
            ActivityResultCallback activityResultCallback = this.f476q0;
            map.put(str, new d<>(activityResultContract, activityResultCallback));
            if (activityResultRegistry.f473f.containsKey(str)) {
                Object obj = activityResultRegistry.f473f.get(str);
                activityResultRegistry.f473f.remove(str);
                activityResultCallback.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) activityResultRegistry.f474g.getParcelable(str);
            if (activityResult != null) {
                activityResultRegistry.f474g.remove(str);
                activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f480b;

        public b(String str, ActivityResultContract activityResultContract) {
            this.f479a = str;
            this.f480b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        @NonNull
        public final ActivityResultContract<I, ?> getContract() {
            return this.f480b;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public final void launch(I i10, @Nullable ActivityOptionsCompat activityOptionsCompat) throws Exception {
            ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
            Map<String, Integer> map = activityResultRegistry.f469b;
            String str = this.f479a;
            Integer num = map.get(str);
            ActivityResultContract activityResultContract = this.f480b;
            if (num != null) {
                activityResultRegistry.f471d.add(str);
                try {
                    activityResultRegistry.onLaunch(num.intValue(), activityResultContract, i10, activityOptionsCompat);
                    return;
                } catch (Exception e5) {
                    activityResultRegistry.f471d.remove(str);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public final void unregister() {
            ActivityResultRegistry.this.b(this.f479a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class c<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f483b;

        public c(String str, ActivityResultContract activityResultContract) {
            this.f482a = str;
            this.f483b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        @NonNull
        public final ActivityResultContract<I, ?> getContract() {
            return this.f483b;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public final void launch(I i10, @Nullable ActivityOptionsCompat activityOptionsCompat) throws Exception {
            ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
            Map<String, Integer> map = activityResultRegistry.f469b;
            String str = this.f482a;
            Integer num = map.get(str);
            ActivityResultContract activityResultContract = this.f483b;
            if (num != null) {
                activityResultRegistry.f471d.add(str);
                try {
                    activityResultRegistry.onLaunch(num.intValue(), activityResultContract, i10, activityOptionsCompat);
                    return;
                } catch (Exception e5) {
                    activityResultRegistry.f471d.remove(str);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public final void unregister() {
            ActivityResultRegistry.this.b(this.f482a);
        }
    }

    public static class d<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityResultCallback<O> f485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityResultContract<?, O> f486b;

        public d(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            this.f485a = activityResultCallback;
            this.f486b = activityResultContract;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<LifecycleEventObserver> f488b = new ArrayList<>();

        public e(@NonNull Lifecycle lifecycle) {
            this.f487a = lifecycle;
        }
    }

    public final void a(String str) {
        if (this.f469b.get(str) != null) {
            return;
        }
        int iNextInt = Random.INSTANCE.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f468a.containsKey(Integer.valueOf(i10))) {
                this.f468a.put(Integer.valueOf(i10), str);
                this.f469b.put(str, Integer.valueOf(i10));
                return;
            }
            iNextInt = Random.INSTANCE.nextInt(2147418112);
        }
    }

    @MainThread
    public final void b(@NonNull String str) {
        Integer numRemove;
        if (!this.f471d.contains(str) && (numRemove = this.f469b.remove(str)) != null) {
            this.f468a.remove(numRemove);
        }
        this.f472e.remove(str);
        if (this.f473f.containsKey(str)) {
            StringBuilder sbD = ci.a.d("Dropping pending result for request ", str, ": ");
            sbD.append(this.f473f.get(str));
            Log.w("ActivityResultRegistry", sbD.toString());
            this.f473f.remove(str);
        }
        if (this.f474g.containsKey(str)) {
            StringBuilder sbD2 = ci.a.d("Dropping pending result for request ", str, ": ");
            sbD2.append(this.f474g.getParcelable(str));
            Log.w("ActivityResultRegistry", sbD2.toString());
            this.f474g.remove(str);
        }
        e eVar = this.f470c.get(str);
        if (eVar != null) {
            ArrayList<LifecycleEventObserver> arrayList = eVar.f488b;
            Iterator<LifecycleEventObserver> it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f487a.removeObserver(it.next());
            }
            arrayList.clear();
            this.f470c.remove(str);
        }
    }

    @MainThread
    public final boolean dispatchResult(int i10, int i11, @Nullable Intent intent) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f468a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d<?> dVar = this.f472e.get(str);
        if (dVar == null || (activityResultCallback = dVar.f485a) == null || !this.f471d.contains(str)) {
            this.f473f.remove(str);
            this.f474g.putParcelable(str, new ActivityResult(i11, intent));
            return true;
        }
        activityResultCallback.onActivityResult(dVar.f486b.parseResult(i11, intent));
        this.f471d.remove(str);
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i10, @NonNull ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i11, @Nullable ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f471d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f474g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f469b.containsKey(str)) {
                Integer numRemove = this.f469b.remove(str);
                if (!this.f474g.containsKey(str)) {
                    this.f468a.remove(numRemove);
                }
            }
            int iIntValue = integerArrayList.get(i10).intValue();
            String str2 = stringArrayList.get(i10);
            this.f468a.put(Integer.valueOf(iIntValue), str2);
            this.f469b.put(str2, Integer.valueOf(iIntValue));
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f469b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f469b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f471d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f474g.clone());
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        a(str);
        e eVar = this.f470c.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        a aVar = new a(str, activityResultCallback, activityResultContract);
        eVar.f487a.addObserver(aVar);
        eVar.f488b.add(aVar);
        this.f470c.put(str, eVar);
        return new b(str, activityResultContract);
    }

    @MainThread
    public final <O> boolean dispatchResult(int i10, @SuppressLint({"UnknownNullness"}) O o2) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f468a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d<?> dVar = this.f472e.get(str);
        if (dVar != null && (activityResultCallback = dVar.f485a) != null) {
            if (!this.f471d.remove(str)) {
                return true;
            }
            activityResultCallback.onActivityResult(o2);
            return true;
        }
        this.f474g.remove(str);
        this.f473f.put(str, o2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull String str, @NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        a(str);
        this.f472e.put(str, new d<>(activityResultContract, activityResultCallback));
        if (this.f473f.containsKey(str)) {
            Object obj = this.f473f.get(str);
            this.f473f.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f474g.getParcelable(str);
        if (activityResult != null) {
            this.f474g.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new c(str, activityResultContract);
    }
}
