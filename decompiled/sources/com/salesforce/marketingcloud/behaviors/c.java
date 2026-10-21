package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.j;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64062i = "timestamp";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f64063j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f64064k = g.a("BehaviorManager");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f64065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayMap<com.salesforce.marketingcloud.behaviors.a, Set<com.salesforce.marketingcloud.behaviors.b>> f64066e = new ArrayMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<com.salesforce.marketingcloud.behaviors.a, Bundle> f64067f = new ArrayMap(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f64068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f64069h;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(c.f64064k, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(c.f64064k, "Received null action", new Object[0]);
                return;
            }
            com.salesforce.marketingcloud.behaviors.a aVarA = com.salesforce.marketingcloud.behaviors.a.a(action);
            if (aVarA != null) {
                c.this.onBehavior(aVarA, intent.getExtras());
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<com.salesforce.marketingcloud.behaviors.b> f64071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.salesforce.marketingcloud.behaviors.a f64072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Bundle f64073c;

        public b(Set<com.salesforce.marketingcloud.behaviors.b> set, com.salesforce.marketingcloud.behaviors.a aVar, Bundle bundle) {
            this.f64071a = set;
            this.f64072b = aVar;
            this.f64073c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (com.salesforce.marketingcloud.behaviors.b bVar : this.f64071a) {
                if (bVar != null) {
                    try {
                        bVar.onBehavior(this.f64072b, this.f64073c);
                    } catch (Exception e5) {
                        g.b(c.f64064k, e5, "Failure delivering behavior %s to %s", this.f64072b.f64059a, bVar.getClass().getName());
                    }
                }
            }
        }
    }

    public c(@NonNull Context context, @NonNull ExecutorService executorService) {
        this.f64068g = context;
        this.f64065d = executorService;
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        j.a(context, "Context is null");
        j.a(aVar, "Behavior is null");
        Intent intent = new Intent(aVar.f64059a);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "BehaviorManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        return null;
    }

    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("timestamp", System.currentTimeMillis());
        g.a(f64064k, "Behavior found: %s", aVar.name());
        synchronized (this.f64066e) {
            Set<com.salesforce.marketingcloud.behaviors.b> set = this.f64066e.get(aVar);
            if (set != null && !set.isEmpty()) {
                try {
                    this.f64065d.submit(new b(Collections.unmodifiableSet(set), aVar, bundle));
                } catch (RejectedExecutionException e5) {
                    g.b(f64064k, e5, "Unable to deliver behavior %s.", aVar.f64059a);
                }
            }
        }
        synchronized (this.f64067f) {
            try {
                if (aVar.f64060b) {
                    this.f64067f.put(aVar, bundle);
                }
                com.salesforce.marketingcloud.behaviors.a aVar2 = aVar.f64061c;
                if (aVar2 != null) {
                    this.f64067f.put(aVar2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z10) {
        Context context = this.f64068g;
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f64069h);
        }
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.f64069h = new a();
        IntentFilter intentFilter = new IntentFilter();
        for (com.salesforce.marketingcloud.behaviors.a aVar2 : com.salesforce.marketingcloud.behaviors.a.values()) {
            intentFilter.addAction(aVar2.f64059a);
        }
        LocalBroadcastManager.getInstance(this.f64068g).registerReceiver(this.f64069h, intentFilter);
    }

    public void a(@NonNull com.salesforce.marketingcloud.behaviors.b bVar) {
        synchronized (this.f64066e) {
            try {
                Iterator<Map.Entry<com.salesforce.marketingcloud.behaviors.a, Set<com.salesforce.marketingcloud.behaviors.b>>> it = this.f64066e.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().remove(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public void a(@NonNull com.salesforce.marketingcloud.behaviors.b bVar, @NonNull EnumSet<com.salesforce.marketingcloud.behaviors.a> enumSet) {
        j.a(bVar, "BehaviorListener is null");
        j.a(enumSet, "Behavior set is null");
        synchronized (this.f64066e) {
            try {
                g.a(f64064k, "Registering %s for behaviors: %s", bVar.getClass().getName(), enumSet.toString());
                for (com.salesforce.marketingcloud.behaviors.a aVar : enumSet) {
                    Set<com.salesforce.marketingcloud.behaviors.b> hashSet = this.f64066e.get(aVar);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.f64066e.put(aVar, hashSet);
                    }
                    hashSet.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f64067f) {
            try {
                for (com.salesforce.marketingcloud.behaviors.a aVar2 : enumSet) {
                    if (aVar2.f64060b && this.f64067f.containsKey(aVar2)) {
                        this.f64065d.submit(new b(Collections.singleton(bVar), aVar2, this.f64067f.get(aVar2)));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
