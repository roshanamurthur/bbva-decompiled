package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.utils.LottieTrace;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class L {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f25560a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f25561b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25562c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static LottieNetworkFetcher f25564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static LottieNetworkCacheProvider f25565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile NetworkFetcher f25566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile NetworkCache f25567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static ThreadLocal<LottieTrace> f25568i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AsyncUpdates f25563d = AsyncUpdates.AUTOMATIC;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ReducedMotionOption f25569j = new SystemReducedMotionOption();

    public static void beginSection(String str) {
        if (f25560a) {
            LottieTrace lottieTrace = f25568i.get();
            if (lottieTrace == null) {
                lottieTrace = new LottieTrace();
                f25568i.set(lottieTrace);
            }
            lottieTrace.beginSection(str);
        }
    }

    public static float endSection(String str) {
        if (!f25560a) {
            return 0.0f;
        }
        LottieTrace lottieTrace = f25568i.get();
        if (lottieTrace == null) {
            lottieTrace = new LottieTrace();
            f25568i.set(lottieTrace);
        }
        return lottieTrace.endSection(str);
    }

    public static AsyncUpdates getDefaultAsyncUpdates() {
        return f25563d;
    }

    public static boolean getDisablePathInterpolatorCache() {
        return f25562c;
    }

    public static ReducedMotionOption getReducedMotionOption() {
        return f25569j;
    }

    public static boolean isTraceEnabled() {
        return f25560a;
    }

    @Nullable
    public static NetworkCache networkCache(@NonNull Context context) {
        if (!f25561b) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache = f25567h;
        if (networkCache == null) {
            synchronized (NetworkCache.class) {
                try {
                    networkCache = f25567h;
                    if (networkCache == null) {
                        LottieNetworkCacheProvider hVar = f25565f;
                        if (hVar == null) {
                            hVar = new y0.h(applicationContext);
                        }
                        networkCache = new NetworkCache(hVar);
                        f25567h = networkCache;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return networkCache;
    }

    @NonNull
    public static NetworkFetcher networkFetcher(@NonNull Context context) {
        NetworkFetcher networkFetcher = f25566g;
        if (networkFetcher == null) {
            synchronized (NetworkFetcher.class) {
                try {
                    networkFetcher = f25566g;
                    if (networkFetcher == null) {
                        NetworkCache networkCache = networkCache(context);
                        LottieNetworkFetcher defaultLottieNetworkFetcher = f25564e;
                        if (defaultLottieNetworkFetcher == null) {
                            defaultLottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                        }
                        networkFetcher = new NetworkFetcher(networkCache, defaultLottieNetworkFetcher);
                        f25566g = networkFetcher;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return networkFetcher;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        LottieNetworkCacheProvider lottieNetworkCacheProvider2 = f25565f;
        if (lottieNetworkCacheProvider2 == null && lottieNetworkCacheProvider == null) {
            return;
        }
        if (lottieNetworkCacheProvider2 == null || !lottieNetworkCacheProvider2.equals(lottieNetworkCacheProvider)) {
            f25565f = lottieNetworkCacheProvider;
            f25567h = null;
        }
    }

    public static void setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
        f25563d = asyncUpdates;
    }

    public static void setDisablePathInterpolatorCache(boolean z10) {
        f25562c = z10;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        LottieNetworkFetcher lottieNetworkFetcher2 = f25564e;
        if (lottieNetworkFetcher2 == null && lottieNetworkFetcher == null) {
            return;
        }
        if (lottieNetworkFetcher2 == null || !lottieNetworkFetcher2.equals(lottieNetworkFetcher)) {
            f25564e = lottieNetworkFetcher;
            f25566g = null;
        }
    }

    public static void setNetworkCacheEnabled(boolean z10) {
        f25561b = z10;
    }

    public static void setReducedMotionOption(ReducedMotionOption reducedMotionOption) {
        f25569j = reducedMotionOption;
    }

    public static void setTraceEnabled(boolean z10) {
        if (f25560a == z10) {
            return;
        }
        f25560a = z10;
        if (z10 && f25568i == null) {
            f25568i = new ThreadLocal<>();
        }
    }
}
