package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zzjr {
    private static final Logger zza = Logger.getLogger(zzje.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzjj zzb(Class cls) {
        String str;
        ClassLoader classLoader = zzjr.class.getClassLoader();
        if (cls.equals(zzjj.class)) {
            str = zzb;
        } else {
            if (!cls.getPackage().equals(zzjr.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        try {
                            return (zzjj) cls.cast(((zzjr) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException(e5);
                        }
                    } catch (InvocationTargetException e7) {
                        throw new IllegalStateException(e7);
                    }
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzjr.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzjr) it.next()).zza()));
                } catch (ServiceConfigurationError e12) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (zzjj) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzjj) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public abstract zzjj zza();
}
