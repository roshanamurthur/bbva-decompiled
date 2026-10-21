package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ClientMetrics {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ClientMetrics f43769e = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeWindow f43770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<LogSourceMetrics> f43771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlobalMetrics f43772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43773d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TimeWindow f43774a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<LogSourceMetrics> f43775b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GlobalMetrics f43776c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f43777d = "";

        public Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics) {
            this.f43775b.add(logSourceMetrics);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.f43774a, Collections.unmodifiableList(this.f43775b), this.f43776c, this.f43777d);
        }

        public Builder setAppNamespace(String str) {
            this.f43777d = str;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics globalMetrics) {
            this.f43776c = globalMetrics;
            return this;
        }

        public Builder setLogSourceMetricsList(List<LogSourceMetrics> list) {
            this.f43775b = list;
            return this;
        }

        public Builder setWindow(TimeWindow timeWindow) {
            this.f43774a = timeWindow;
            return this;
        }
    }

    public ClientMetrics(TimeWindow timeWindow, List<LogSourceMetrics> list, GlobalMetrics globalMetrics, String str) {
        this.f43770a = timeWindow;
        this.f43771b = list;
        this.f43772c = globalMetrics;
        this.f43773d = str;
    }

    public static ClientMetrics getDefaultInstance() {
        return f43769e;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.f43773d;
    }

    @Encodable.Ignore
    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics globalMetrics = this.f43772c;
        return globalMetrics == null ? GlobalMetrics.getDefaultInstance() : globalMetrics;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.f43772c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<LogSourceMetrics> getLogSourceMetricsList() {
        return this.f43771b;
    }

    @Encodable.Ignore
    public TimeWindow getWindow() {
        TimeWindow timeWindow = this.f43770a;
        return timeWindow == null ? TimeWindow.getDefaultInstance() : timeWindow;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public TimeWindow getWindowInternal() {
        return this.f43770a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
