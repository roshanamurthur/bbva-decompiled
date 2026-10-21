package vd;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: compiled from: MetadataBackendRegistry.java */
/* JADX INFO: loaded from: classes9.dex */
@Singleton
public final class c implements BackendRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f94034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f94035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f94036c;

    /* JADX INFO: compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f94037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f94038b = null;

        public a(Context context) {
            this.f94037a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        @Nullable
        public final BackendFactory a(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.f94038b == null) {
                Context context = this.f94037a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            mapEmptyMap = Collections.emptyMap();
                        } else {
                            HashMap map = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            mapEmptyMap = map;
                        }
                        this.f94038b = mapEmptyMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map2 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    mapEmptyMap = map2;
                }
                this.f94038b = mapEmptyMap;
            }
            String str4 = this.f94038b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e5) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e5);
                return null;
            } catch (IllegalAccessException e7) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e7);
                return null;
            } catch (InstantiationException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e12);
                return null;
            }
        }
    }

    @Inject
    public c(Context context, b bVar) {
        a aVar = new a(context);
        this.f94036c = new HashMap();
        this.f94034a = aVar;
        this.f94035b = bVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @Nullable
    public final synchronized TransportBackend get(String str) {
        if (this.f94036c.containsKey(str)) {
            return (TransportBackend) this.f94036c.get(str);
        }
        BackendFactory backendFactoryA = this.f94034a.a(str);
        if (backendFactoryA == null) {
            return null;
        }
        b bVar = this.f94035b;
        TransportBackend transportBackendCreate = backendFactoryA.create(CreationContext.create(bVar.f94031a, bVar.f94032b, bVar.f94033c, str));
        this.f94036c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
