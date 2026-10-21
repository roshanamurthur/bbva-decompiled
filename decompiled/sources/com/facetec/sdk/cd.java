package com.facetec.sdk;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: loaded from: classes9.dex */
final class cd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private static final HashMap<Integer, Object> f40838c = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static Timer f40837a = null;

    public static <T> void aY_(@Nullable T t10, @NonNull Parcel parcel) {
        if (t10 != null) {
            parcel.writeInt(c(t10));
        } else {
            parcel.writeInt(0);
        }
    }

    @Nullable
    public static <T> T aZ_(@NonNull Parcel parcel) {
        int i10 = parcel.readInt();
        if (i10 != 0) {
            return (T) c(i10);
        }
        return null;
    }

    private static synchronized int c(@NonNull Object obj) {
        final int iHashCode;
        try {
            iHashCode = obj.hashCode();
            if (f40837a == null) {
                f40837a = new Timer();
            }
            f40837a.schedule(new cw(new Runnable() { // from class: com.facetec.sdk.p6
                @Override // java.lang.Runnable
                public final void run() {
                    cd.c(iHashCode);
                }
            }), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            f40838c.put(Integer.valueOf(iHashCode), obj);
        } catch (Throwable th2) {
            throw th2;
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static synchronized Object c(int i10) {
        Object objRemove;
        HashMap<Integer, Object> map = f40838c;
        objRemove = map.remove(Integer.valueOf(i10));
        if (f40837a != null && map.isEmpty()) {
            f40837a.cancel();
            f40837a = null;
        }
        return objRemove;
    }
}
