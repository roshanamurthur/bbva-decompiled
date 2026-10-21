package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes10.dex */
@AutoValue
public abstract class InstallationResponse {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract InstallationResponse build();

        @NonNull
        public abstract Builder setAuthToken(@NonNull TokenResult tokenResult);

        @NonNull
        public abstract Builder setFid(@NonNull String str);

        @NonNull
        public abstract Builder setRefreshToken(@NonNull String str);

        @NonNull
        public abstract Builder setResponseCode(@NonNull ResponseCode responseCode);

        @NonNull
        public abstract Builder setUri(@NonNull String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        private static final /* synthetic */ ResponseCode[] $VALUES;
        public static final ResponseCode BAD_CONFIG;
        public static final ResponseCode OK;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            OK = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            BAD_CONFIG = responseCode2;
            $VALUES = new ResponseCode[]{responseCode, responseCode2};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) $VALUES.clone();
        }
    }

    @NonNull
    public static Builder builder() {
        return new a.C0214a();
    }

    @Nullable
    public abstract TokenResult getAuthToken();

    @Nullable
    public abstract String getFid();

    @Nullable
    public abstract String getRefreshToken();

    @Nullable
    public abstract ResponseCode getResponseCode();

    @Nullable
    public abstract String getUri();

    @NonNull
    public abstract Builder toBuilder();
}
