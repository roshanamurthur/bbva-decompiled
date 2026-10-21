package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssMeasurementsEvent$Callback;
import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.p;
import androidx.camera.core.n1;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import h2.o;
import h2.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class<?> f19942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f19943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f19944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("sLocationListeners")
    public static final WeakHashMap<l, WeakReference<m>> f19945d = new WeakHashMap<>();

    @RequiresApi(19)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class<?> f19946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f19947b;

        @DoNotInline
        public static boolean a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f19946a == null) {
                    f19946a = Class.forName("android.location.LocationRequest");
                }
                if (f19947b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f19946a, LocationListener.class, Looper.class);
                    f19947b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    f19947b.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static boolean b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, m mVar) {
            try {
                if (f19946a == null) {
                    f19946a = Class.forName("android.location.LocationRequest");
                }
                if (f19947b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f19946a, LocationListener.class, Looper.class);
                    f19947b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (LocationManagerCompat.f19945d) {
                        f19947b.invoke(locationManager, locationRequest, mVar, Looper.getMainLooper());
                        LocationManagerCompat.c(locationManager, mVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @RequiresApi(24)
    public static class b {
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        public static boolean a(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            return locationManager.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        public static boolean b(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback, handler);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static boolean c(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(handler != null);
            SimpleArrayMap<Object, Object> simpleArrayMap = g.f19956a;
            synchronized (simpleArrayMap) {
                try {
                    n nVar = (n) simpleArrayMap.get(callback);
                    if (nVar == null) {
                        nVar = new n(callback);
                    } else {
                        nVar.f19970b = null;
                    }
                    Preconditions.checkArgument(executor != null, "invalid null executor");
                    Preconditions.checkState(nVar.f19970b == null);
                    nVar.f19970b = executor;
                    if (!locationManager.registerGnssStatusCallback(nVar, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, nVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        public static void d(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            locationManager.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback);
        }

        @DoNotInline
        public static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof n) {
                ((n) obj).f19970b = null;
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus$Callback) obj);
        }
    }

    @RequiresApi(28)
    public static class c {
        @DoNotInline
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi(30)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class<?> f19948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f19949b;

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static void a(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull Consumer<Location> consumer) {
            android.os.CancellationSignal cancellationSignal2 = cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null;
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new h2.e(consumer, 0));
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap<Object, Object> simpleArrayMap = g.f19956a;
            synchronized (simpleArrayMap) {
                try {
                    i iVar = (i) simpleArrayMap.get(callback);
                    if (iVar == null) {
                        iVar = new i(callback);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, iVar)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, iVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        public static boolean c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f19948a == null) {
                        f19948a = Class.forName("android.location.LocationRequest");
                    }
                    if (f19949b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f19948a, Executor.class, LocationListener.class);
                        f19949b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        f19949b.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi(31)
    public static class e {
        @DoNotInline
        public static boolean a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        public static boolean b(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, gnssMeasurementsEvent$Callback);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static void c(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("sGnssStatusListeners")
        public static final SimpleArrayMap<Object, Object> f19956a = new SimpleArrayMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @GuardedBy("sGnssMeasurementListeners")
        public static final SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> f19957b = new SimpleArrayMap<>();
    }

    @RequiresApi(24)
    public static class h extends GnssMeasurementsEvent$Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GnssMeasurementsEvent$Callback f19958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile Executor f19959b;

        public h(@NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Executor executor) {
            this.f19958a = gnssMeasurementsEvent$Callback;
            this.f19959b = executor;
        }

        public final void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.f19959b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: h2.g
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.h hVar = this.f69265p0;
                    Executor executor2 = executor;
                    GnssMeasurementsEvent gnssMeasurementsEvent2 = gnssMeasurementsEvent;
                    if (hVar.f19959b != executor2) {
                        return;
                    }
                    hVar.f19958a.onGnssMeasurementsReceived(gnssMeasurementsEvent2);
                }
            });
        }

        public final void onStatusChanged(final int i10) {
            final Executor executor = this.f19959b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: h2.h
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.h hVar = this.f69268p0;
                    Executor executor2 = executor;
                    int i11 = i10;
                    if (hVar.f19959b != executor2) {
                        return;
                    }
                    hVar.f19958a.onStatusChanged(i11);
                }
            });
        }
    }

    @RequiresApi(30)
    public static class i extends GnssStatus$Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f19960a;

        public i(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.f19960a = callback;
        }

        public final void onFirstFix(int i10) {
            this.f19960a.onFirstFix(i10);
        }

        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f19960a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        public final void onStarted() {
            this.f19960a.onStarted();
        }

        public final void onStopped() {
            this.f19960a.onStopped();
        }
    }

    public static class j implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationManager f19961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GnssStatusCompat.Callback f19962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public volatile Executor f19963c;

        public j(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.f19961a = locationManager;
            this.f19962b = callback;
        }

        @Override // android.location.GpsStatus.Listener
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public final void onGpsStatusChanged(int i10) {
            GpsStatus gpsStatus;
            final Executor executor = this.f19963c;
            if (executor == null) {
                return;
            }
            if (i10 == 1) {
                executor.execute(new h2.i(this, executor, 0));
                return;
            }
            if (i10 == 2) {
                executor.execute(new h2.j(this, executor, 0));
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (gpsStatus = this.f19961a.getGpsStatus(null)) != null) {
                    executor.execute(new androidx.camera.camera2.internal.g(this, executor, 2, GnssStatusCompat.wrap(gpsStatus)));
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f19961a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: h2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.j jVar = this.f69277p0;
                        Executor executor2 = executor;
                        int i11 = timeToFirstFix;
                        if (jVar.f19963c != executor2) {
                            return;
                        }
                        jVar.f19962b.onFirstFix(i11);
                    }
                });
            }
        }
    }

    public static final class k implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f19964p0;

        public k(@NonNull Handler handler) {
            this.f19964p0 = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            Looper looperMyLooper = Looper.myLooper();
            Handler handler = this.f19964p0;
            if (looperMyLooper == handler.getLooper()) {
                runnable.run();
            } else {
                if (handler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            }
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocationListenerCompat f19966b;

        public l(LocationListenerCompat locationListenerCompat, String str) {
            this.f19965a = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.f19966b = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f19965a.equals(lVar.f19965a) && this.f19966b.equals(lVar.f19966b);
        }

        public final int hashCode() {
            return ObjectsCompat.hash(this.f19965a, this.f19966b);
        }
    }

    @RequiresApi(24)
    public static class n extends GnssStatus$Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f19969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile Executor f19970b;

        public n(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.f19969a = callback;
        }

        public final void onFirstFix(final int i10) {
            final Executor executor = this.f19970b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: h2.p
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.n nVar = this.f69293p0;
                    Executor executor2 = executor;
                    int i11 = i10;
                    if (nVar.f19970b != executor2) {
                        return;
                    }
                    nVar.f19969a.onFirstFix(i11);
                }
            });
        }

        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f19970b;
            if (executor == null) {
                return;
            }
            executor.execute(new o(this, executor, 0, gnssStatus));
        }

        public final void onStarted() {
            Executor executor = this.f19970b;
            if (executor == null) {
                return;
            }
            executor.execute(new androidx.camera.camera2.interop.a(this, executor, 1));
        }

        public final void onStopped() {
            Executor executor = this.f19970b;
            if (executor == null) {
                return;
            }
            executor.execute(new q(this, executor, 0));
        }
    }

    @RequiresApi(30)
    public static boolean a(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f19942a == null) {
                f19942a = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f19943b == null) {
                Method declaredMethod = f19942a.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
                f19943b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f19944c == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, androidx.appcompat.app.o.a());
                f19944c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = f19944c.invoke(locationManager, f19943b.invoke(f19942a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, gnssMeasurementsEvent$Callback);
            return objInvoke != null && ((Boolean) objInvoke).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:64:0x00b7, B:65:0x00cd, B:66:0x00ce, B:68:0x00d6, B:70:0x00de, B:71:0x00e4, B:72:0x00e5, B:73:0x00ea, B:74:0x00eb, B:75:0x00f1, B:50:0x00a0), top: B:83:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00de A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:64:0x00b7, B:65:0x00cd, B:66:0x00ce, B:68:0x00d6, B:70:0x00de, B:71:0x00e4, B:72:0x00e5, B:73:0x00ea, B:74:0x00eb, B:75:0x00f1, B:50:0x00a0), top: B:83:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:64:0x00b7, B:65:0x00cd, B:66:0x00ce, B:68:0x00d6, B:70:0x00de, B:71:0x00e4, B:72:0x00e5, B:73:0x00ea, B:74:0x00eb, B:75:0x00f1, B:50:0x00a0), top: B:83:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:64:0x00b7, B:65:0x00cd, B:66:0x00ce, B:68:0x00d6, B:70:0x00de, B:71:0x00e4, B:72:0x00e5, B:73:0x00ea, B:74:0x00eb, B:75:0x00f1, B:50:0x00a0), top: B:83:0x005f }] */
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return d.b(locationManager, handler, executor, callback);
        }
        if (i10 >= 24) {
            return b.c(locationManager, handler, executor, callback);
        }
        boolean z10 = true;
        Preconditions.checkArgument(handler != null);
        SimpleArrayMap<Object, Object> simpleArrayMap = g.f19956a;
        synchronized (simpleArrayMap) {
            try {
                j jVar = (j) simpleArrayMap.get(callback);
                if (jVar == null) {
                    jVar = new j(locationManager, callback);
                } else {
                    jVar.f19963c = null;
                }
                Preconditions.checkState(jVar.f19963c == null);
                jVar.f19963c = executor;
                FutureTask futureTask = new FutureTask(new h2.d(locationManager, jVar, 0));
                if (Looper.myLooper() == handler.getLooper()) {
                    futureTask.run();
                } else if (!handler.post(futureTask)) {
                    throw new IllegalStateException(handler + " is shutting down");
                }
                try {
                    try {
                        long nanos = TimeUnit.SECONDS.toNanos(5L);
                        long jNanoTime = System.nanoTime() + nanos;
                        boolean z11 = false;
                        while (((Boolean) futureTask.get(nanos, TimeUnit.NANOSECONDS)).booleanValue()) {
                            try {
                                try {
                                    g.f19956a.put(callback, jVar);
                                    if (z11) {
                                        Thread.currentThread().interrupt();
                                    }
                                    return true;
                                } catch (ExecutionException e5) {
                                    e = e5;
                                    if (!(e.getCause() instanceof RuntimeException)) {
                                        throw ((RuntimeException) e.getCause());
                                    }
                                    if (e.getCause() instanceof Error) {
                                        throw ((Error) e.getCause());
                                    }
                                    throw new IllegalStateException(e);
                                } catch (TimeoutException e7) {
                                    e = e7;
                                    throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z11 = true;
                            } catch (ExecutionException e10) {
                                e = e10;
                                if (!(e.getCause() instanceof RuntimeException)) {
                                    throw ((RuntimeException) e.getCause());
                                }
                                if (e.getCause() instanceof Error) {
                                    throw ((Error) e.getCause());
                                }
                                throw new IllegalStateException(e);
                            } catch (TimeoutException e11) {
                                e = e11;
                                throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = z11;
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (ExecutionException e12) {
                    e = e12;
                } catch (TimeoutException e13) {
                    e = e13;
                } catch (Throwable th4) {
                    th = th4;
                    z10 = false;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @GuardedBy("sLocationListeners")
    public static void c(LocationManager locationManager, m mVar) {
        WeakReference<m> weakReferencePut = f19945d.put((l) ObjectsCompat.requireNonNull(mVar.f19967p0), new WeakReference<>(mVar));
        m mVar2 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (mVar2 != null) {
            mVar2.f19967p0 = null;
            locationManager.removeUpdates(mVar2);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new androidx.camera.view.a(consumer, lastKnownLocation, 1));
            return;
        }
        f fVar = new f(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new androidx.camera.view.b(fVar));
        }
        synchronized (fVar) {
            try {
                if (fVar.f19954t0) {
                    return;
                }
                n1 n1Var = new n1(fVar, 1);
                fVar.f19955u0 = n1Var;
                fVar.f19952r0.postDelayed(n1Var, 30000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isLocationEnabled(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.c(locationManager);
        }
        return locationManager.isProviderEnabled(DeepLinkListenerAdapter.Constants.ERROR_NETWORK) || locationManager.isProviderEnabled("gps");
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return b.b(locationManager, gnssMeasurementsEvent$Callback, handler);
        }
        if (i10 == 30) {
            return a(locationManager, ExecutorCompat.create(handler), gnssMeasurementsEvent$Callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = g.f19957b;
        synchronized (simpleArrayMap) {
            try {
                unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback);
                if (!b.b(locationManager, gnssMeasurementsEvent$Callback, handler)) {
                    return false;
                }
                simpleArrayMap.put(gnssMeasurementsEvent$Callback, gnssMeasurementsEvent$Callback);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback) : registerGnssStatusCallback(locationManager, new k(handler), callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager, @NonNull LocationListenerCompat locationListenerCompat) {
        WeakHashMap<l, WeakReference<m>> weakHashMap = f19945d;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<m>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    m mVar = it.next().get();
                    if (mVar != null) {
                        l lVar = (l) ObjectsCompat.requireNonNull(mVar.f19967p0);
                        if (lVar.f19966b == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(lVar);
                            mVar.f19967p0 = null;
                            locationManager.removeUpdates(mVar);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f19945d.remove((l) it2.next());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull Executor executor, @NonNull LocationListenerCompat locationListenerCompat) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            e.c(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
            return;
        }
        if (i10 < 30 || !d.c(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            m mVar = new m(new l(locationListenerCompat, str), executor);
            if (a.b(locationManager, str, locationRequestCompat, mVar)) {
                return;
            }
            synchronized (f19945d) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), mVar, Looper.getMainLooper());
                c(locationManager, mVar);
            }
        }
    }

    @RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.d(locationManager, gnssMeasurementsEvent$Callback);
            return;
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = g.f19957b;
        synchronized (simpleArrayMap) {
            try {
                GnssMeasurementsEvent$Callback gnssMeasurementsEvent$CallbackA = p.a(simpleArrayMap.remove(gnssMeasurementsEvent$Callback));
                if (gnssMeasurementsEvent$CallbackA != null) {
                    if (gnssMeasurementsEvent$CallbackA instanceof h) {
                        ((h) gnssMeasurementsEvent$CallbackA).f19959b = null;
                    }
                    b.d(locationManager, gnssMeasurementsEvent$CallbackA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap<Object, Object> simpleArrayMap = g.f19956a;
            synchronized (simpleArrayMap) {
                try {
                    Object objRemove = simpleArrayMap.remove(callback);
                    if (objRemove != null) {
                        b.e(locationManager, objRemove);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        SimpleArrayMap<Object, Object> simpleArrayMap2 = g.f19956a;
        synchronized (simpleArrayMap2) {
            try {
                j jVar = (j) simpleArrayMap2.remove(callback);
                if (jVar != null) {
                    jVar.f19963c = null;
                    locationManager.removeGpsStatusListener(jVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static class m implements LocationListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public volatile l f19967p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Executor f19968q0;

        public m(@Nullable l lVar, Executor executor) {
            this.f19967p0 = lVar;
            this.f19968q0 = executor;
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(final int i10) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new Runnable() { // from class: h2.l
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.m mVar = this.f69280p0;
                    int i11 = i10;
                    LocationManagerCompat.l lVar = mVar.f19967p0;
                    if (lVar == null) {
                        return;
                    }
                    lVar.f19966b.onFlushComplete(i11);
                }
            });
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(@NonNull Location location) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new h2.m(this, location, 0));
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(@NonNull String str) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new androidx.camera.camera2.internal.k(this, str, 2));
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(@NonNull String str) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new androidx.camera.core.impl.o(this, str, 1));
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new Runnable() { // from class: h2.n
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.m mVar = this.f69285p0;
                    String str2 = str;
                    int i11 = i10;
                    Bundle bundle2 = bundle;
                    LocationManagerCompat.l lVar = mVar.f19967p0;
                    if (lVar == null) {
                        return;
                    }
                    lVar.f19966b.onStatusChanged(str2, i11, bundle2);
                }
            });
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(@NonNull List<Location> list) {
            if (this.f19967p0 == null) {
                return;
            }
            this.f19968q0.execute(new androidx.camera.core.impl.q(this, list, 1));
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b(locationManager, null, executor, callback);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return b(locationManager, new Handler(looperMyLooper), executor, callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return e.b(locationManager, executor, gnssMeasurementsEvent$Callback);
        }
        if (i10 == 30) {
            return a(locationManager, executor, gnssMeasurementsEvent$Callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = g.f19957b;
        synchronized (simpleArrayMap) {
            try {
                h hVar = new h(gnssMeasurementsEvent$Callback, executor);
                unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback);
                if (!b.a(locationManager, hVar)) {
                    return false;
                }
                simpleArrayMap.put(gnssMeasurementsEvent$Callback, hVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull LocationListenerCompat locationListenerCompat, @NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else {
            if (a.a(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }

    public static final class f implements LocationListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LocationManager f19950p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Executor f19951q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Handler f19952r0 = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Consumer<Location> f19953s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f19954t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @Nullable
        public n1 f19955u0;

        public f(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.f19950p0 = locationManager;
            this.f19951q0 = executor;
            this.f19953s0 = consumer;
        }

        @Override // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public final void onLocationChanged(@Nullable Location location) {
            synchronized (this) {
                try {
                    if (this.f19954t0) {
                        return;
                    }
                    this.f19954t0 = true;
                    this.f19951q0.execute(new androidx.appcompat.app.h(this.f19953s0, location, 4));
                    this.f19953s0 = null;
                    this.f19950p0.removeUpdates(this);
                    n1 n1Var = this.f19955u0;
                    if (n1Var != null) {
                        this.f19952r0.removeCallbacks(n1Var);
                        this.f19955u0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public final void onProviderDisabled(@NonNull String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }
}
