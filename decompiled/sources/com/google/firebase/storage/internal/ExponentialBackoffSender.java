package com.google.firebase.storage.internal;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.network.NetworkRequest;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class ExponentialBackoffSender {
    public static final int RND_MAX = 250;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Random f49131f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final SleeperImpl f49132g = new SleeperImpl();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Clock f49133h = DefaultClock.getInstance();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final InternalAuthProvider f49135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InteropAppCheckTokenProvider f49136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f49138e;

    public ExponentialBackoffSender(Context context, @Nullable InternalAuthProvider internalAuthProvider, @Nullable InteropAppCheckTokenProvider interopAppCheckTokenProvider, long j10) {
        this.f49134a = context;
        this.f49135b = internalAuthProvider;
        this.f49136c = interopAppCheckTokenProvider;
        this.f49137d = j10;
    }

    public void cancel() {
        this.f49138e = true;
    }

    public boolean isRetryableError(int i10) {
        return (i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408;
    }

    public void reset() {
        this.f49138e = false;
    }

    public void sendWithExponentialBackoff(@NonNull NetworkRequest networkRequest) {
        sendWithExponentialBackoff(networkRequest, true);
    }

    public void sendWithExponentialBackoff(@NonNull NetworkRequest networkRequest, boolean z10) {
        Preconditions.checkNotNull(networkRequest);
        long jElapsedRealtime = f49133h.elapsedRealtime() + this.f49137d;
        if (z10) {
            networkRequest.performRequest(Util.getCurrentAuthToken(this.f49135b), Util.getCurrentAppCheckToken(this.f49136c), this.f49134a);
        } else {
            networkRequest.performRequestStart(Util.getCurrentAuthToken(this.f49135b), Util.getCurrentAppCheckToken(this.f49136c));
        }
        int i10 = 1000;
        while (f49133h.elapsedRealtime() + ((long) i10) <= jElapsedRealtime && !networkRequest.isResultSuccess() && isRetryableError(networkRequest.getResultCode())) {
            try {
                f49132g.sleep(f49131f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (networkRequest.getResultCode() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (this.f49138e) {
                    return;
                }
                networkRequest.reset();
                if (z10) {
                    networkRequest.performRequest(Util.getCurrentAuthToken(this.f49135b), Util.getCurrentAppCheckToken(this.f49136c), this.f49134a);
                } else {
                    networkRequest.performRequestStart(Util.getCurrentAuthToken(this.f49135b), Util.getCurrentAppCheckToken(this.f49136c));
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
