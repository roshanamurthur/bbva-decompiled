package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class LogSourceMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LogSourceMetrics f43786c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<LogEventDropped> f43788b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43789a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<LogEventDropped> f43790b = new ArrayList();

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.f43790b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.f43789a, Collections.unmodifiableList(this.f43790b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.f43790b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.f43789a = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.f43787a = str;
        this.f43788b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return f43786c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.f43788b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.f43787a;
    }
}
