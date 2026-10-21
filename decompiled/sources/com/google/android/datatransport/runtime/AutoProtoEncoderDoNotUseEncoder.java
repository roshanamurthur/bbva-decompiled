package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class a implements ObjectEncoder<ClientMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43670a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43671b = androidx.collection.f.b(1, FieldDescriptor.builder("window"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43672c = androidx.collection.f.b(2, FieldDescriptor.builder("logSourceMetrics"));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f43673d = androidx.collection.f.b(3, FieldDescriptor.builder("globalMetrics"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f43674e = androidx.collection.f.b(4, FieldDescriptor.builder("appNamespace"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ClientMetrics clientMetrics = (ClientMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43671b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(f43672c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(f43673d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(f43674e, clientMetrics.getAppNamespace());
        }
    }

    public static final class b implements ObjectEncoder<GlobalMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43675a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43676b = androidx.collection.f.b(1, FieldDescriptor.builder("storageMetrics"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f43676b, ((GlobalMetrics) obj).getStorageMetricsInternal());
        }
    }

    public static final class c implements ObjectEncoder<LogEventDropped> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f43677a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43678b = androidx.collection.f.b(1, FieldDescriptor.builder("eventsDroppedCount"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43679c = androidx.collection.f.b(3, FieldDescriptor.builder("reason"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43678b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(f43679c, logEventDropped.getReason());
        }
    }

    public static final class d implements ObjectEncoder<LogSourceMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f43680a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43681b = androidx.collection.f.b(1, FieldDescriptor.builder("logSource"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43682c = androidx.collection.f.b(2, FieldDescriptor.builder("logEventDropped"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43681b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(f43682c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    public static final class e implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f43683a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43684b = FieldDescriptor.of("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f43684b, ((ProtoEncoderDoNotUse) obj).getClientMetrics());
        }
    }

    public static final class f implements ObjectEncoder<StorageMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f43685a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43686b = androidx.collection.f.b(1, FieldDescriptor.builder("currentCacheSizeBytes"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43687c = androidx.collection.f.b(2, FieldDescriptor.builder("maxCacheSizeBytes"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            StorageMetrics storageMetrics = (StorageMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43686b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(f43687c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    public static final class g implements ObjectEncoder<TimeWindow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f43688a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43689b = androidx.collection.f.b(1, FieldDescriptor.builder("startMs"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43690c = androidx.collection.f.b(2, FieldDescriptor.builder("endMs"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            TimeWindow timeWindow = (TimeWindow) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43689b, timeWindow.getStartMs());
            objectEncoderContext.add(f43690c, timeWindow.getEndMs());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, e.f43683a);
        encoderConfig.registerEncoder(ClientMetrics.class, a.f43670a);
        encoderConfig.registerEncoder(TimeWindow.class, g.f43688a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, d.f43680a);
        encoderConfig.registerEncoder(LogEventDropped.class, c.f43677a);
        encoderConfig.registerEncoder(GlobalMetrics.class, b.f43675a);
        encoderConfig.registerEncoder(StorageMetrics.class, f.f43685a);
    }
}
