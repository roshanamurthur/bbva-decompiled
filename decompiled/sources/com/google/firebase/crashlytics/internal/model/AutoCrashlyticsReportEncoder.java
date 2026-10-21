package com.google.firebase.crashlytics.internal.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    public static final class a implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47868a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47869b = FieldDescriptor.of("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47870c = FieldDescriptor.of("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47871d = FieldDescriptor.of("buildId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47869b, buildIdMappingForArch.getArch());
            objectEncoderContext.add(f47870c, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(f47871d, buildIdMappingForArch.getBuildId());
        }
    }

    public static final class b implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47872a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47873b = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47874c = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47875d = FieldDescriptor.of("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47876e = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47877f = FieldDescriptor.of("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47878g = FieldDescriptor.of("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47879h = FieldDescriptor.of("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f47880i = FieldDescriptor.of("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f47881j = FieldDescriptor.of("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47873b, applicationExitInfo.getPid());
            objectEncoderContext.add(f47874c, applicationExitInfo.getProcessName());
            objectEncoderContext.add(f47875d, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(f47876e, applicationExitInfo.getImportance());
            objectEncoderContext.add(f47877f, applicationExitInfo.getPss());
            objectEncoderContext.add(f47878g, applicationExitInfo.getRss());
            objectEncoderContext.add(f47879h, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(f47880i, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(f47881j, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    public static final class c implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f47882a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47883b = FieldDescriptor.of("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47884c = FieldDescriptor.of("value");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47883b, customAttribute.getKey());
            objectEncoderContext.add(f47884c, customAttribute.getValue());
        }
    }

    public static final class d implements ObjectEncoder<CrashlyticsReport> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47885a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47886b = FieldDescriptor.of(ContextualDataConstants.CD_SDK_VERSION);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47887c = FieldDescriptor.of("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47888d = FieldDescriptor.of(com.salesforce.marketingcloud.storage.db.k.a.f65035b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47889e = FieldDescriptor.of("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47890f = FieldDescriptor.of("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47891g = FieldDescriptor.of("appQualitySessionId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47892h = FieldDescriptor.of(Properties.BUILD_VERSION);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f47893i = FieldDescriptor.of("displayVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f47894j = FieldDescriptor.of("session");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f47895k = FieldDescriptor.of("ndkPayload");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f47896l = FieldDescriptor.of("appExitInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47886b, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(f47887c, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(f47888d, crashlyticsReport.getPlatform());
            objectEncoderContext.add(f47889e, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(f47890f, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(f47891g, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(f47892h, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(f47893i, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(f47894j, crashlyticsReport.getSession());
            objectEncoderContext.add(f47895k, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(f47896l, crashlyticsReport.getAppExitInfo());
        }
    }

    public static final class e implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f47897a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47898b = FieldDescriptor.of("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47899c = FieldDescriptor.of("orgId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47898b, filesPayload.getFiles());
            objectEncoderContext.add(f47899c, filesPayload.getOrgId());
        }
    }

    public static final class f implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f47900a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47901b = FieldDescriptor.of("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47902c = FieldDescriptor.of("contents");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47901b, file.getFilename());
            objectEncoderContext.add(f47902c, file.getContents());
        }
    }

    public static final class g implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f47903a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47904b = FieldDescriptor.of("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47905c = FieldDescriptor.of("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47906d = FieldDescriptor.of("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47907e = FieldDescriptor.of("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47908f = FieldDescriptor.of("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47909g = FieldDescriptor.of("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47910h = FieldDescriptor.of("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47904b, application.getIdentifier());
            objectEncoderContext.add(f47905c, application.getVersion());
            objectEncoderContext.add(f47906d, application.getDisplayVersion());
            objectEncoderContext.add(f47907e, application.getOrganization());
            objectEncoderContext.add(f47908f, application.getInstallationUuid());
            objectEncoderContext.add(f47909g, application.getDevelopmentPlatform());
            objectEncoderContext.add(f47910h, application.getDevelopmentPlatformVersion());
        }
    }

    public static final class h implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f47911a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47912b = FieldDescriptor.of("clsId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f47912b, ((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
    }

    public static final class i implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f47913a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47914b = FieldDescriptor.of("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47915c = FieldDescriptor.of("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47916d = FieldDescriptor.of("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47917e = FieldDescriptor.of("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47918f = FieldDescriptor.of("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47919g = FieldDescriptor.of("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47920h = FieldDescriptor.of("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f47921i = FieldDescriptor.of(Constants.manufacturer);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f47922j = FieldDescriptor.of("modelClass");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47914b, device.getArch());
            objectEncoderContext.add(f47915c, device.getModel());
            objectEncoderContext.add(f47916d, device.getCores());
            objectEncoderContext.add(f47917e, device.getRam());
            objectEncoderContext.add(f47918f, device.getDiskSpace());
            objectEncoderContext.add(f47919g, device.isSimulator());
            objectEncoderContext.add(f47920h, device.getState());
            objectEncoderContext.add(f47921i, device.getManufacturer());
            objectEncoderContext.add(f47922j, device.getModelClass());
        }
    }

    public static final class j implements ObjectEncoder<CrashlyticsReport.Session> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f47923a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47924b = FieldDescriptor.of("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47925c = FieldDescriptor.of("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47926d = FieldDescriptor.of("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47927e = FieldDescriptor.of("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47928f = FieldDescriptor.of("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47929g = FieldDescriptor.of("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47930h = FieldDescriptor.of("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f47931i = FieldDescriptor.of("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f47932j = FieldDescriptor.of("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f47933k = FieldDescriptor.of(Constants.device);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f47934l = FieldDescriptor.of("events");
        public static final FieldDescriptor m = FieldDescriptor.of("generatorType");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47924b, session.getGenerator());
            objectEncoderContext.add(f47925c, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(f47926d, session.getAppQualitySessionId());
            objectEncoderContext.add(f47927e, session.getStartedAt());
            objectEncoderContext.add(f47928f, session.getEndedAt());
            objectEncoderContext.add(f47929g, session.isCrashed());
            objectEncoderContext.add(f47930h, session.getApp());
            objectEncoderContext.add(f47931i, session.getUser());
            objectEncoderContext.add(f47932j, session.getOs());
            objectEncoderContext.add(f47933k, session.getDevice());
            objectEncoderContext.add(f47934l, session.getEvents());
            objectEncoderContext.add(m, session.getGeneratorType());
        }
    }

    public static final class k implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f47935a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47936b = FieldDescriptor.of("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47937c = FieldDescriptor.of("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47938d = FieldDescriptor.of("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47939e = FieldDescriptor.of("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47940f = FieldDescriptor.of("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47941g = FieldDescriptor.of("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f47942h = FieldDescriptor.of("uiOrientation");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47936b, application.getExecution());
            objectEncoderContext.add(f47937c, application.getCustomAttributes());
            objectEncoderContext.add(f47938d, application.getInternalKeys());
            objectEncoderContext.add(f47939e, application.getBackground());
            objectEncoderContext.add(f47940f, application.getCurrentProcessDetails());
            objectEncoderContext.add(f47941g, application.getAppProcessDetails());
            objectEncoderContext.add(f47942h, application.getUiOrientation());
        }
    }

    public static final class l implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f47943a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47944b = FieldDescriptor.of("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47945c = FieldDescriptor.of("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47946d = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47947e = FieldDescriptor.of(EventDataKeys.Audience.UUID);

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47944b, binaryImage.getBaseAddress());
            objectEncoderContext.add(f47945c, binaryImage.getSize());
            objectEncoderContext.add(f47946d, binaryImage.getName());
            objectEncoderContext.add(f47947e, binaryImage.getUuidUtf8Bytes());
        }
    }

    public static final class m implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f47948a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47949b = FieldDescriptor.of("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47950c = FieldDescriptor.of("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47951d = FieldDescriptor.of("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47952e = FieldDescriptor.of("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47953f = FieldDescriptor.of("binaries");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47949b, execution.getThreads());
            objectEncoderContext.add(f47950c, execution.getException());
            objectEncoderContext.add(f47951d, execution.getAppExitInfo());
            objectEncoderContext.add(f47952e, execution.getSignal());
            objectEncoderContext.add(f47953f, execution.getBinaries());
        }
    }

    public static final class n implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f47954a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47955b = FieldDescriptor.of("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47956c = FieldDescriptor.of("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47957d = FieldDescriptor.of("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47958e = FieldDescriptor.of("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47959f = FieldDescriptor.of("overflowCount");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47955b, exception.getType());
            objectEncoderContext.add(f47956c, exception.getReason());
            objectEncoderContext.add(f47957d, exception.getFrames());
            objectEncoderContext.add(f47958e, exception.getCausedBy());
            objectEncoderContext.add(f47959f, exception.getOverflowCount());
        }
    }

    public static final class o implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f47960a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47961b = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47962c = FieldDescriptor.of("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47963d = FieldDescriptor.of("address");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47961b, signal.getName());
            objectEncoderContext.add(f47962c, signal.getCode());
            objectEncoderContext.add(f47963d, signal.getAddress());
        }
    }

    public static final class p implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f47964a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47965b = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47966c = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47967d = FieldDescriptor.of("frames");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47965b, thread.getName());
            objectEncoderContext.add(f47966c, thread.getImportance());
            objectEncoderContext.add(f47967d, thread.getFrames());
        }
    }

    public static final class q implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f47968a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47969b = FieldDescriptor.of("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47970c = FieldDescriptor.of("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47971d = FieldDescriptor.of("file");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47972e = FieldDescriptor.of(TypedValues.CycleType.S_WAVE_OFFSET);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47973f = FieldDescriptor.of("importance");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47969b, frame.getPc());
            objectEncoderContext.add(f47970c, frame.getSymbol());
            objectEncoderContext.add(f47971d, frame.getFile());
            objectEncoderContext.add(f47972e, frame.getOffset());
            objectEncoderContext.add(f47973f, frame.getImportance());
        }
    }

    public static final class r implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f47974a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47975b = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47976c = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47977d = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47978e = FieldDescriptor.of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47975b, processDetails.getProcessName());
            objectEncoderContext.add(f47976c, processDetails.getPid());
            objectEncoderContext.add(f47977d, processDetails.getImportance());
            objectEncoderContext.add(f47978e, processDetails.isDefaultProcess());
        }
    }

    public static final class s implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f47979a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47980b = FieldDescriptor.of("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47981c = FieldDescriptor.of("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47982d = FieldDescriptor.of("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47983e = FieldDescriptor.of("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47984f = FieldDescriptor.of("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47985g = FieldDescriptor.of("diskUsed");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47980b, device.getBatteryLevel());
            objectEncoderContext.add(f47981c, device.getBatteryVelocity());
            objectEncoderContext.add(f47982d, device.isProximityOn());
            objectEncoderContext.add(f47983e, device.getOrientation());
            objectEncoderContext.add(f47984f, device.getRamUsed());
            objectEncoderContext.add(f47985g, device.getDiskUsed());
        }
    }

    public static final class t implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f47986a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47987b = FieldDescriptor.of("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47988c = FieldDescriptor.of("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47989d = FieldDescriptor.of("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47990e = FieldDescriptor.of(Constants.device);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f47991f = FieldDescriptor.of(LogKeysKt.LOG);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f47992g = FieldDescriptor.of("rollouts");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47987b, event.getTimestamp());
            objectEncoderContext.add(f47988c, event.getType());
            objectEncoderContext.add(f47989d, event.getApp());
            objectEncoderContext.add(f47990e, event.getDevice());
            objectEncoderContext.add(f47991f, event.getLog());
            objectEncoderContext.add(f47992g, event.getRollouts());
        }
    }

    public static final class u implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f47993a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47994b = FieldDescriptor.of("content");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f47994b, ((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
    }

    public static final class v implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f47995a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f47996b = FieldDescriptor.of("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f47997c = FieldDescriptor.of("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f47998d = FieldDescriptor.of("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f47999e = FieldDescriptor.of("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f47996b, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(f47997c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f47998d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f47999e, rolloutAssignment.getTemplateVersion());
        }
    }

    public static final class w implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f48000a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48001b = FieldDescriptor.of("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48002c = FieldDescriptor.of("variantId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48001b, rolloutVariant.getRolloutId());
            objectEncoderContext.add(f48002c, rolloutVariant.getVariantId());
        }
    }

    public static final class x implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f48003a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48004b = FieldDescriptor.of("assignments");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f48004b, ((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
    }

    public static final class y implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f48005a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48006b = FieldDescriptor.of(com.salesforce.marketingcloud.storage.db.k.a.f65035b);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48007c = FieldDescriptor.of("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48008d = FieldDescriptor.of(Properties.BUILD_VERSION);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48009e = FieldDescriptor.of("jailbroken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48006b, operatingSystem.getPlatform());
            objectEncoderContext.add(f48007c, operatingSystem.getVersion());
            objectEncoderContext.add(f48008d, operatingSystem.getBuildVersion());
            objectEncoderContext.add(f48009e, operatingSystem.isJailbroken());
        }
    }

    public static final class z implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f48010a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48011b = FieldDescriptor.of("identifier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f48011b, ((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        d dVar = d.f47885a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, dVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.a.class, dVar);
        j jVar = j.f47923a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, jVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.g.class, jVar);
        g gVar = g.f47903a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, gVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.h.class, gVar);
        h hVar = h.f47911a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, hVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.i.class, hVar);
        z zVar = z.f48010a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, zVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.z.class, zVar);
        y yVar = y.f48005a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, yVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.y.class, yVar);
        i iVar = i.f47913a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, iVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.j.class, iVar);
        t tVar = t.f47986a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, tVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.k.class, tVar);
        k kVar = k.f47935a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, kVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.l.class, kVar);
        m mVar = m.f47948a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, mVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.m.class, mVar);
        p pVar = p.f47964a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, pVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.q.class, pVar);
        q qVar = q.f47968a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, qVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.r.class, qVar);
        n nVar = n.f47954a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, nVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.o.class, nVar);
        b bVar = b.f47872a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, bVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.b.class, bVar);
        a aVar = a.f47868a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, aVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.c.class, aVar);
        o oVar = o.f47960a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, oVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.p.class, oVar);
        l lVar = l.f47943a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, lVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.n.class, lVar);
        c cVar = c.f47882a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, cVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.d.class, cVar);
        r rVar = r.f47974a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, rVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.s.class, rVar);
        s sVar = s.f47979a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, sVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.t.class, sVar);
        u uVar = u.f47993a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, uVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.u.class, uVar);
        x xVar = x.f48003a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, xVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.x.class, xVar);
        v vVar = v.f47995a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, vVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.v.class, vVar);
        w wVar = w.f48000a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, wVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.w.class, wVar);
        e eVar = e.f47897a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, eVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.e.class, eVar);
        f fVar = f.f47900a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, fVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.f.class, fVar);
    }
}
