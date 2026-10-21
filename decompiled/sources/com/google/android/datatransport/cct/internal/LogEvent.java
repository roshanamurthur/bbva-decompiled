package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes9.dex */
@AutoValue
public abstract class LogEvent {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setEventTimeMs(long j10);

        @NonNull
        public abstract Builder setEventUptimeMs(long j10);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long j10);
    }

    @NonNull
    public static Builder jsonBuilder(@NonNull String str) {
        c.a aVar = new c.a();
        aVar.f43649e = str;
        return aVar;
    }

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] bArr) {
        c.a aVar = new c.a();
        aVar.f43648d = bArr;
        return aVar;
    }

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
