package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Method f19937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Field f19938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Integer f19939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static Integer f19940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static Integer f19941e;

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @RequiresApi(18)
    public static class b {
        @DoNotInline
        public static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @RequiresApi(26)
    public static class c {
        @DoNotInline
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @DoNotInline
        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @DoNotInline
        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @DoNotInline
        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @DoNotInline
        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @DoNotInline
        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @DoNotInline
        public static void g(Location location) {
            try {
                LocationCompat.b().setByte(location, (byte) (LocationCompat.b().getByte(location) & (~LocationCompat.c())));
            } catch (IllegalAccessException e5) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e5);
                throw illegalAccessError;
            } catch (NoSuchFieldException e7) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e7);
                throw noSuchFieldError;
            }
        }

        @DoNotInline
        public static void h(Location location) {
            try {
                LocationCompat.b().setByte(location, (byte) (LocationCompat.b().getByte(location) & (~LocationCompat.d())));
            } catch (IllegalAccessException e5) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e5);
                throw illegalAccessError;
            } catch (NoSuchFieldException e7) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e7);
                throw noSuchFieldError;
            }
        }

        @DoNotInline
        public static void i(Location location) {
            try {
                LocationCompat.b().setByte(location, (byte) (LocationCompat.b().getByte(location) & (~LocationCompat.e())));
            } catch (IllegalAccessException | NoSuchFieldException e5) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e5);
                throw illegalAccessError;
            }
        }

        @DoNotInline
        public static void j(Location location, float f6) {
            location.setBearingAccuracyDegrees(f6);
        }

        @DoNotInline
        public static void k(Location location, float f6) {
            location.setSpeedAccuracyMetersPerSecond(f6);
        }

        @DoNotInline
        public static void l(Location location, float f6) {
            location.setVerticalAccuracyMeters(f6);
        }
    }

    @RequiresApi(28)
    public static class d {
        @DoNotInline
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @DoNotInline
        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @DoNotInline
        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    @RequiresApi(29)
    public static class e {
        @DoNotInline
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                d.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @DoNotInline
        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                d.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @DoNotInline
        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                d.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    @RequiresApi(33)
    public static class f {
        @DoNotInline
        public static void a(Location location) {
            location.removeBearingAccuracy();
        }

        @DoNotInline
        public static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        @DoNotInline
        public static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    @RequiresApi(34)
    public static class g {
        @DoNotInline
        public static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        @DoNotInline
        public static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        @DoNotInline
        public static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        @DoNotInline
        public static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        @DoNotInline
        public static void e(Location location) {
            location.removeMslAltitude();
        }

        @DoNotInline
        public static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        @DoNotInline
        public static void g(Location location, float f6) {
            location.setMslAltitudeAccuracyMeters(f6);
        }

        @DoNotInline
        public static void h(Location location, double d2) {
            location.setMslAltitudeMeters(d2);
        }
    }

    public static boolean a(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    @SuppressLint({"BlockedPrivateApi"})
    public static Field b() throws NoSuchFieldException {
        if (f19938b == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f19938b = declaredField;
            declaredField.setAccessible(true);
        }
        return f19938b;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int c() throws IllegalAccessException, NoSuchFieldException {
        if (f19940d == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f19940d = Integer.valueOf(declaredField.getInt(null));
        }
        return f19940d.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int d() throws IllegalAccessException, NoSuchFieldException {
        if (f19939c == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f19939c = Integer.valueOf(declaredField.getInt(null));
        }
        return f19939c.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int e() throws IllegalAccessException, NoSuchFieldException {
        if (f19941e == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f19941e = Integer.valueOf(declaredField.getInt(null));
        }
        return f19941e.intValue();
    }

    public static Bundle f(@NonNull Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    public static Method g() throws NoSuchMethodException {
        if (f19937a == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f19937a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f19937a;
    }

    public static float getBearingAccuracyDegrees(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static long getElapsedRealtimeMillis(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long getElapsedRealtimeNanos(@NonNull Location location) {
        return a.a(location);
    }

    @FloatRange(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return g.a(location);
        }
        Preconditions.checkState(hasMslAltitudeAccuracy(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return f(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static double getMslAltitudeMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return g.b(location);
        }
        Preconditions.checkState(hasMslAltitude(location), "The Mean Sea Level altitude of the location is not set.");
        return f(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static float getSpeedAccuracyMetersPerSecond(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static float getVerticalAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static void h(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static boolean hasBearingAccuracy(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.d(location) : a(location, EXTRA_BEARING_ACCURACY);
    }

    public static boolean hasMslAltitude(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? g.c(location) : a(location, EXTRA_MSL_ALTITUDE);
    }

    public static boolean hasMslAltitudeAccuracy(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? g.d(location) : a(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static boolean hasSpeedAccuracy(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.e(location) : a(location, EXTRA_SPEED_ACCURACY);
    }

    public static boolean hasVerticalAccuracy(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.f(location) : a(location, "verticalAccuracy");
    }

    public static boolean isMock(@NonNull Location location) {
        return b.a(location);
    }

    public static void removeBearingAccuracy(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            f.a(location);
            return;
        }
        if (i10 >= 29) {
            e.a(location);
            return;
        }
        if (i10 >= 28) {
            d.a(location);
        } else if (i10 >= 26) {
            c.g(location);
        } else {
            h(location, EXTRA_BEARING_ACCURACY);
        }
    }

    public static void removeMslAltitude(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.e(location);
        } else {
            h(location, EXTRA_MSL_ALTITUDE);
        }
    }

    public static void removeMslAltitudeAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.f(location);
        } else {
            h(location, EXTRA_MSL_ALTITUDE_ACCURACY);
        }
    }

    public static void removeSpeedAccuracy(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            f.b(location);
            return;
        }
        if (i10 >= 29) {
            e.b(location);
            return;
        }
        if (i10 >= 28) {
            d.b(location);
        } else if (i10 >= 26) {
            c.h(location);
        } else {
            h(location, EXTRA_SPEED_ACCURACY);
        }
    }

    public static void removeVerticalAccuracy(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            f.c(location);
            return;
        }
        if (i10 >= 29) {
            e.c(location);
            return;
        }
        if (i10 >= 28) {
            d.c(location);
        } else if (i10 >= 26) {
            c.i(location);
        } else {
            h(location, "verticalAccuracy");
        }
    }

    public static void setBearingAccuracyDegrees(@NonNull Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.j(location, f6);
        } else {
            f(location).putFloat(EXTRA_BEARING_ACCURACY, f6);
        }
    }

    public static void setMock(@NonNull Location location, boolean z10) {
        try {
            g().invoke(location, Boolean.valueOf(z10));
        } catch (IllegalAccessException e5) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e5);
            throw illegalAccessError;
        } catch (NoSuchMethodException e7) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e7);
            throw noSuchMethodError;
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void setMslAltitudeAccuracyMeters(@NonNull Location location, @FloatRange(from = 0.0d) float f6) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.g(location, f6);
        } else {
            f(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f6);
        }
    }

    public static void setMslAltitudeMeters(@NonNull Location location, double d2) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.h(location, d2);
        } else {
            f(location).putDouble(EXTRA_MSL_ALTITUDE, d2);
        }
    }

    public static void setSpeedAccuracyMetersPerSecond(@NonNull Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.k(location, f6);
        } else {
            f(location).putFloat(EXTRA_SPEED_ACCURACY, f6);
        }
    }

    public static void setVerticalAccuracyMeters(@NonNull Location location, float f6) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.l(location, f6);
        } else {
            f(location).putFloat("verticalAccuracy", f6);
        }
    }
}
