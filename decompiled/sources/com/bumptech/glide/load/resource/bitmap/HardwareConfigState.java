package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED;

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean HARDWARE_BITMAPS_SUPPORTED;

    @Deprecated
    public static final int NO_MAX_FD_COUNT = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final File f38569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile HardwareConfigState f38570f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public int f38572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38573c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38574d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38571a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = i10 < 29;
        HARDWARE_BITMAPS_SUPPORTED = i10 >= 28;
        f38569e = new File("/proc/self/fd");
    }

    @VisibleForTesting
    public HardwareConfigState() {
    }

    public static HardwareConfigState getInstance() {
        if (f38570f == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (f38570f == null) {
                        f38570f = new HardwareConfigState();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38570f;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f38571a;
    }

    public void blockHardwareBitmaps() {
        Util.assertMainThread();
        this.f38574d.set(false);
    }

    public boolean isHardwareConfigAllowed(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        if (!z10 || !HARDWARE_BITMAPS_SUPPORTED) {
            return false;
        }
        if ((BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.f38574d.get()) || z11 || i10 < 0 || i11 < 0) {
            return false;
        }
        synchronized (this) {
            try {
                int i12 = this.f38572b + 1;
                this.f38572b = i12;
                if (i12 >= 50) {
                    this.f38572b = 0;
                    int length = f38569e.list().length;
                    long jA = a();
                    boolean z13 = ((long) length) < jA;
                    this.f38573c = z13;
                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jA);
                    }
                }
                z12 = this.f38573c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    public void unblockHardwareBitmaps() {
        Util.assertMainThread();
        this.f38574d.set(true);
    }
}
