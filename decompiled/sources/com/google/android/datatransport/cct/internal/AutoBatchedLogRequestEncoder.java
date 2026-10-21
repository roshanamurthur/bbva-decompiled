package com.google.android.datatransport.cct.internal;

import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    public static final class a implements ObjectEncoder<AndroidClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43574a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43575b = FieldDescriptor.of(ContextualDataConstants.CD_SDK_VERSION);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43576c = FieldDescriptor.of("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f43577d = FieldDescriptor.of("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f43578e = FieldDescriptor.of(Constants.device);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f43579f = FieldDescriptor.of("product");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f43580g = FieldDescriptor.of("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f43581h = FieldDescriptor.of(Constants.manufacturer);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f43582i = FieldDescriptor.of("fingerprint");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f43583j = FieldDescriptor.of("locale");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f43584k = FieldDescriptor.of("country");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f43585l = FieldDescriptor.of("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43575b, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(f43576c, androidClientInfo.getModel());
            objectEncoderContext.add(f43577d, androidClientInfo.getHardware());
            objectEncoderContext.add(f43578e, androidClientInfo.getDevice());
            objectEncoderContext.add(f43579f, androidClientInfo.getProduct());
            objectEncoderContext.add(f43580g, androidClientInfo.getOsBuild());
            objectEncoderContext.add(f43581h, androidClientInfo.getManufacturer());
            objectEncoderContext.add(f43582i, androidClientInfo.getFingerprint());
            objectEncoderContext.add(f43583j, androidClientInfo.getLocale());
            objectEncoderContext.add(f43584k, androidClientInfo.getCountry());
            objectEncoderContext.add(f43585l, androidClientInfo.getMccMnc());
            objectEncoderContext.add(m, androidClientInfo.getApplicationBuild());
        }
    }

    public static final class b implements ObjectEncoder<BatchedLogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43586a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43587b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f43587b, ((BatchedLogRequest) obj).getLogRequests());
        }
    }

    public static final class c implements ObjectEncoder<ClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f43588a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43589b = FieldDescriptor.of("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43590c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43589b, clientInfo.getClientType());
            objectEncoderContext.add(f43590c, clientInfo.getAndroidClientInfo());
        }
    }

    public static final class d implements ObjectEncoder<LogEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f43591a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43592b = FieldDescriptor.of("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43593c = FieldDescriptor.of("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f43594d = FieldDescriptor.of("eventUptimeMs");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f43595e = FieldDescriptor.of("sourceExtension");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f43596f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f43597g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f43598h = FieldDescriptor.of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43592b, logEvent.getEventTimeMs());
            objectEncoderContext.add(f43593c, logEvent.getEventCode());
            objectEncoderContext.add(f43594d, logEvent.getEventUptimeMs());
            objectEncoderContext.add(f43595e, logEvent.getSourceExtension());
            objectEncoderContext.add(f43596f, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(f43597g, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(f43598h, logEvent.getNetworkConnectionInfo());
        }
    }

    public static final class e implements ObjectEncoder<LogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f43599a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43600b = FieldDescriptor.of("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43601c = FieldDescriptor.of("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f43602d = FieldDescriptor.of("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f43603e = FieldDescriptor.of("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f43604f = FieldDescriptor.of("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f43605g = FieldDescriptor.of("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f43606h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43600b, logRequest.getRequestTimeMs());
            objectEncoderContext.add(f43601c, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(f43602d, logRequest.getClientInfo());
            objectEncoderContext.add(f43603e, logRequest.getLogSource());
            objectEncoderContext.add(f43604f, logRequest.getLogSourceName());
            objectEncoderContext.add(f43605g, logRequest.getLogEvents());
            objectEncoderContext.add(f43606h, logRequest.getQosTier());
        }
    }

    public static final class f implements ObjectEncoder<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f43607a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f43608b = FieldDescriptor.of("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f43609c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f43608b, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(f43609c, networkConnectionInfo.getMobileSubtype());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        b bVar = b.f43586a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, bVar);
        encoderConfig.registerEncoder(td.a.class, bVar);
        e eVar = e.f43599a;
        encoderConfig.registerEncoder(LogRequest.class, eVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.d.class, eVar);
        c cVar = c.f43588a;
        encoderConfig.registerEncoder(ClientInfo.class, cVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.b.class, cVar);
        a aVar = a.f43574a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, aVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.a.class, aVar);
        d dVar = d.f43591a;
        encoderConfig.registerEncoder(LogEvent.class, dVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.c.class, dVar);
        f fVar = f.f43607a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, fVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.e.class, fVar);
    }
}
