package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class StorageException extends FirebaseException {
    public static final int ERROR_BUCKET_NOT_FOUND = -13011;
    public static final int ERROR_CANCELED = -13040;
    public static final int ERROR_INVALID_CHECKSUM = -13031;
    public static final int ERROR_NOT_AUTHENTICATED = -13020;
    public static final int ERROR_NOT_AUTHORIZED = -13021;
    public static final int ERROR_OBJECT_NOT_FOUND = -13010;
    public static final int ERROR_PROJECT_NOT_FOUND = -13012;
    public static final int ERROR_QUOTA_EXCEEDED = -13013;
    public static final int ERROR_RETRY_LIMIT_EXCEEDED = -13030;
    public static final int ERROR_UNKNOWN = -13000;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f48997p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f48998q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Throwable f48999r0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StorageException(int i10, Throwable th2, int i11) {
        String str;
        if (i10 == -13040) {
            str = "The operation was cancelled.";
        } else if (i10 == -13031) {
            str = "Object has a checksum which does not match. Please retry the operation.";
        } else if (i10 == -13030) {
            str = "The operation retry limit has been exceeded.";
        } else if (i10 == -13021) {
            str = "User does not have permission to access this object.";
        } else if (i10 != -13020) {
            switch (i10) {
                case ERROR_QUOTA_EXCEEDED /* -13013 */:
                    str = "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
                    break;
                case ERROR_PROJECT_NOT_FOUND /* -13012 */:
                    str = "Project does not exist.";
                    break;
                case ERROR_BUCKET_NOT_FOUND /* -13011 */:
                    str = "Bucket does not exist.";
                    break;
                case ERROR_OBJECT_NOT_FOUND /* -13010 */:
                    str = "Object does not exist at location.";
                    break;
                default:
                    str = "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
                    break;
            }
        } else {
            str = "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        super(str);
        this.f48999r0 = th2;
        this.f48997p0 = i10;
        this.f48998q0 = i11;
        if (th2 != null) {
            th2.getMessage();
        }
    }

    @NonNull
    public static StorageException fromErrorStatus(@NonNull Status status) {
        int i10;
        Preconditions.checkNotNull(status);
        Preconditions.checkArgument(!status.isSuccess());
        if (status.isCanceled()) {
            i10 = ERROR_CANCELED;
        } else {
            i10 = status.equals(Status.RESULT_TIMEOUT) ? ERROR_RETRY_LIMIT_EXCEEDED : ERROR_UNKNOWN;
        }
        return new StorageException(i10, null, 0);
    }

    @NonNull
    public static StorageException fromException(@NonNull Throwable th2) {
        return fromExceptionAndHttpCode(th2, 0);
    }

    @Nullable
    public static StorageException fromExceptionAndHttpCode(@Nullable Throwable th2, int i10) {
        int i11;
        if (th2 instanceof StorageException) {
            return (StorageException) th2;
        }
        if ((i10 == 0 || (i10 >= 200 && i10 < 300)) && th2 == null) {
            return null;
        }
        if (th2 instanceof a) {
            i11 = ERROR_CANCELED;
        } else if (i10 == -2) {
            i11 = ERROR_RETRY_LIMIT_EXCEEDED;
        } else if (i10 == 401) {
            i11 = ERROR_NOT_AUTHENTICATED;
        } else if (i10 == 409) {
            i11 = ERROR_INVALID_CHECKSUM;
        } else if (i10 != 403) {
            i11 = i10 != 404 ? ERROR_UNKNOWN : ERROR_OBJECT_NOT_FOUND;
        } else {
            i11 = ERROR_NOT_AUTHORIZED;
        }
        return new StorageException(i11, th2, i10);
    }

    @Override // java.lang.Throwable
    @Nullable
    public synchronized Throwable getCause() {
        Throwable th2 = this.f48999r0;
        if (th2 == this) {
            return null;
        }
        return th2;
    }

    public int getErrorCode() {
        return this.f48997p0;
    }

    public int getHttpResultCode() {
        return this.f48998q0;
    }

    public boolean getIsRecoverableException() {
        return getErrorCode() == -13030;
    }
}
