package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Status f48456p0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status BAD_CONFIG;
        public static final Status TOO_MANY_REQUESTS;
        public static final Status UNAVAILABLE;

        static {
            Status status = new Status("BAD_CONFIG", 0);
            BAD_CONFIG = status;
            Status status2 = new Status("UNAVAILABLE", 1);
            UNAVAILABLE = status2;
            Status status3 = new Status("TOO_MANY_REQUESTS", 2);
            TOO_MANY_REQUESTS = status3;
            $VALUES = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public FirebaseInstallationsException(@NonNull Status status) {
        this.f48456p0 = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f48456p0;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status) {
        super(str);
        this.f48456p0 = status;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status, @NonNull Throwable th2) {
        super(str, th2);
        this.f48456p0 = status;
    }
}
