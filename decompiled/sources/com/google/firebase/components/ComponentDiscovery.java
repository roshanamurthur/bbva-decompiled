package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ComponentDiscovery<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f47657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f47658b;

    public static class a implements b<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends Service> f47659a;

        public a(Class cls) {
            this.f47659a = cls;
        }

        public final List a(Object obj) {
            Context context = (Context) obj;
            Class<? extends Service> cls = this.f47659a;
            Bundle bundle = null;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                    if (serviceInfo == null) {
                        Log.w("ComponentDiscovery", cls + " has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
            }
            if (bundle == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    public interface b<T> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public ComponentDiscovery(Object obj, a aVar) {
        this.f47657a = obj;
        this.f47658b = aVar;
    }

    @Nullable
    public static ComponentRegistrar a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e5);
        } catch (InstantiationException e7) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e7);
        } catch (NoSuchMethodException e10) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e10);
        } catch (InvocationTargetException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e11);
        }
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new a(cls));
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((a) this.f47658b).a(this.f47657a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarA = a((String) it.next());
                if (componentRegistrarA != null) {
                    arrayList.add(componentRegistrarA);
                }
            } catch (InvalidRegistrarException e5) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : ((a) this.f47658b).a(this.f47657a)) {
            arrayList.add(new Provider() { // from class: tf.c
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.a(str);
                }
            });
        }
        return arrayList;
    }
}
