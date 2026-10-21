package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AppInitializer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile AppInitializer f23525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f23526e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f23529c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final HashSet f23528b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final HashMap f23527a = new HashMap();

    public AppInitializer(@NonNull Context context) {
        this.f23529c = context.getApplicationContext();
    }

    @NonNull
    public static AppInitializer getInstance(@NonNull Context context) {
        if (f23525d == null) {
            synchronized (f23526e) {
                try {
                    if (f23525d == null) {
                        f23525d = new AppInitializer(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f23525d;
    }

    public final void a(@Nullable Bundle bundle) {
        HashSet hashSet;
        String string = this.f23529c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f23528b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b(hashSet2, (Class) it2.next());
                }
            } catch (ClassNotFoundException e5) {
                throw new StartupException(e5);
            }
        }
    }

    @NonNull
    public final Object b(@NonNull HashSet hashSet, @NonNull Class cls) {
        Object objCreate;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f23527a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends Initializer<?>>> listDependencies = initializer.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(hashSet, cls2);
                        }
                    }
                }
                objCreate = initializer.create(this.f23529c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    @NonNull
    public <T> T initializeComponent(@NonNull Class<? extends Initializer<T>> cls) {
        T t10;
        synchronized (f23526e) {
            try {
                t10 = (T) this.f23527a.get(cls);
                if (t10 == null) {
                    t10 = (T) b(new HashSet(), cls);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public boolean isEagerlyInitialized(@NonNull Class<? extends Initializer<?>> cls) {
        return this.f23528b.contains(cls);
    }
}
