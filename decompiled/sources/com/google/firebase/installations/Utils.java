package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class Utils {
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f48459b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Utils f48460c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f48461a;

    public Utils(Clock clock) {
        this.f48461a = clock;
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }

    public long currentTimeInMillis() {
        return this.f48461a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.getAuthToken())) {
            return true;
        }
        return persistedInstallationEntry.getExpiresInSecs() + persistedInstallationEntry.getTokenCreationEpochInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    public static Utils getInstance(Clock clock) {
        if (f48460c == null) {
            f48460c = new Utils(clock);
        }
        return f48460c;
    }
}
