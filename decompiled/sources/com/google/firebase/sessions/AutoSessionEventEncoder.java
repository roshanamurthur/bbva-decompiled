package com.google.firebase.sessions;

import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.noknok.android.passportsdksvc.PassportSDKIntentActivity;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    public static final class a implements ObjectEncoder<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48770a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48771b = FieldDescriptor.of("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48772c = FieldDescriptor.of("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48773d = FieldDescriptor.of("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48774e = FieldDescriptor.of("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f48775f = FieldDescriptor.of("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f48776g = FieldDescriptor.of("appProcessDetails");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48771b, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(f48772c, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(f48773d, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(f48774e, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(f48775f, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(f48776g, androidApplicationInfo.getAppProcessDetails());
        }
    }

    public static final class b implements ObjectEncoder<ApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48777a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48778b = FieldDescriptor.of("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48779c = FieldDescriptor.of(ContextualDataConstants.CD_DEVICE_MODEL);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48780d = FieldDescriptor.of("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48781e = FieldDescriptor.of(ContextualDataConstants.CD_OS_VERSION);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f48782f = FieldDescriptor.of("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f48783g = FieldDescriptor.of("androidAppInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48778b, applicationInfo.getAppId());
            objectEncoderContext.add(f48779c, applicationInfo.getDeviceModel());
            objectEncoderContext.add(f48780d, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(f48781e, applicationInfo.getOsVersion());
            objectEncoderContext.add(f48782f, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(f48783g, applicationInfo.getAndroidAppInfo());
        }
    }

    public static final class c implements ObjectEncoder<DataCollectionStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f48784a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48785b = FieldDescriptor.of("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48786c = FieldDescriptor.of(CrashlyticsHandler.ID);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48787d = FieldDescriptor.of("sessionSamplingRate");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48785b, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(f48786c, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(f48787d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    public static final class d implements ObjectEncoder<ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f48788a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48789b = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48790c = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48791d = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48792e = FieldDescriptor.of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ProcessDetails processDetails = (ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48789b, processDetails.getProcessName());
            objectEncoderContext.add(f48790c, processDetails.getPid());
            objectEncoderContext.add(f48791d, processDetails.getImportance());
            objectEncoderContext.add(f48792e, processDetails.isDefaultProcess());
        }
    }

    public static final class e implements ObjectEncoder<SessionEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f48793a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48794b = FieldDescriptor.of("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48795c = FieldDescriptor.of(PassportSDKIntentActivity.SESSION_DATA);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48796d = FieldDescriptor.of("applicationInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            SessionEvent sessionEvent = (SessionEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48794b, sessionEvent.getEventType());
            objectEncoderContext.add(f48795c, sessionEvent.getSessionData());
            objectEncoderContext.add(f48796d, sessionEvent.getApplicationInfo());
        }
    }

    public static final class f implements ObjectEncoder<SessionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f48797a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48798b = FieldDescriptor.of(AuthConstants.SESSION_ID);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48799c = FieldDescriptor.of("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48800d = FieldDescriptor.of("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48801e = FieldDescriptor.of("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f48802f = FieldDescriptor.of("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f48803g = FieldDescriptor.of("firebaseInstallationId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            SessionInfo sessionInfo = (SessionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48798b, sessionInfo.getSessionId());
            objectEncoderContext.add(f48799c, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(f48800d, sessionInfo.getSessionIndex());
            objectEncoderContext.add(f48801e, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(f48802f, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(f48803g, sessionInfo.getFirebaseInstallationId());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, e.f48793a);
        encoderConfig.registerEncoder(SessionInfo.class, f.f48797a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, c.f48784a);
        encoderConfig.registerEncoder(ApplicationInfo.class, b.f48777a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, a.f48770a);
        encoderConfig.registerEncoder(ProcessDetails.class, d.f48788a);
    }
}
