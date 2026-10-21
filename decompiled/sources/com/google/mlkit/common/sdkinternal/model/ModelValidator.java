package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.model.RemoteModel;
import java.io.File;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public interface ModelValidator {

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static class ValidationResult {

        @NonNull
        @KeepForSdk
        public static final ValidationResult VALID = new ValidationResult(ErrorCode.OK, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ErrorCode f49454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49455b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
        @KeepForSdk
        public static final class ErrorCode {

            @NonNull
            @KeepForSdk
            public static final ErrorCode MODEL_FORMAT_INVALID;

            @NonNull
            @KeepForSdk
            public static final ErrorCode OK;

            @NonNull
            @KeepForSdk
            public static final ErrorCode TFLITE_VERSION_INCOMPATIBLE;
            private static final /* synthetic */ ErrorCode[] zza;

            static {
                ErrorCode errorCode = new ErrorCode("OK", 0);
                OK = errorCode;
                ErrorCode errorCode2 = new ErrorCode("TFLITE_VERSION_INCOMPATIBLE", 1);
                TFLITE_VERSION_INCOMPATIBLE = errorCode2;
                ErrorCode errorCode3 = new ErrorCode("MODEL_FORMAT_INVALID", 2);
                MODEL_FORMAT_INVALID = errorCode3;
                zza = new ErrorCode[]{errorCode, errorCode2, errorCode3};
            }

            @NonNull
            public static ErrorCode[] values() {
                return (ErrorCode[]) zza.clone();
            }
        }

        @KeepForSdk
        public ValidationResult(@NonNull ErrorCode errorCode, @Nullable String str) {
            this.f49454a = errorCode;
            this.f49455b = str;
        }

        @NonNull
        @KeepForSdk
        public ErrorCode getErrorCode() {
            return this.f49454a;
        }

        @Nullable
        @KeepForSdk
        public String getErrorMessage() {
            return this.f49455b;
        }

        @KeepForSdk
        public boolean isValid() {
            return this.f49454a == ErrorCode.OK;
        }
    }

    @NonNull
    @KeepForSdk
    ValidationResult validateModel(@NonNull File file, @NonNull RemoteModel remoteModel);
}
