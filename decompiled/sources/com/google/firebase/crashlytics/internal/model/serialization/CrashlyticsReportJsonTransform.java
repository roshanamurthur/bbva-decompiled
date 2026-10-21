package com.google.firebase.crashlytics.internal.model.serialization;

import ad.d;
import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.camera.core.processing.f;
import androidx.collection.h;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsReportJsonTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataEncoder f48234a = new JsonDataEncoderBuilder().configureWith(AutoCrashlyticsReportEncoder.CONFIG).ignoreNullValues(true).build();

    public interface a<T> {
        T b(@NonNull JsonReader jsonReader) throws IOException;
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    builder.setOffset(jsonReader.nextLong());
                    break;
                case "symbol":
                    builder.setSymbol(jsonReader.nextString());
                    break;
                case "pc":
                    builder.setPc(jsonReader.nextLong());
                    break;
                case "file":
                    builder.setFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    public static CrashlyticsReport.CustomAttribute b(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder builder = CrashlyticsReport.CustomAttribute.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                builder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public static CrashlyticsReport.ApplicationExitInfo c(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    builder.setBuildIdMappingForArch(d(jsonReader, new androidx.camera.core.imagecapture.a()));
                    break;
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "pss":
                    builder.setPss(jsonReader.nextLong());
                    break;
                case "rss":
                    builder.setRss(jsonReader.nextLong());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "reasonCode":
                    builder.setReasonCode(jsonReader.nextInt());
                    break;
                case "traceFile":
                    builder.setTraceFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public static <T> List<T> d(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.b(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    public static CrashlyticsReport.Session.Event e(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Builder builder = CrashlyticsReport.Session.Event.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    CrashlyticsReport.Session.Event.Device.Builder builder2 = CrashlyticsReport.Session.Event.Device.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                builder2.setBatteryLevel(Double.valueOf(jsonReader.nextDouble()));
                                break;
                            case "batteryVelocity":
                                builder2.setBatteryVelocity(jsonReader.nextInt());
                                break;
                            case "orientation":
                                builder2.setOrientation(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                builder2.setDiskUsed(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                builder2.setRamUsed(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                builder2.setProximityOn(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builder.setDevice(builder2.build());
                    break;
                case "rollouts":
                    CrashlyticsReport.Session.Event.RolloutsState.Builder builder3 = CrashlyticsReport.Session.Event.RolloutsState.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            builder3.setRolloutAssignments(d(jsonReader, new h()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builder.setRollouts(builder3.build());
                    break;
                case "app":
                    CrashlyticsReport.Session.Event.Application.Builder builder4 = CrashlyticsReport.Session.Event.Application.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                builder4.setAppProcessDetails(Collections.unmodifiableList(arrayList));
                                break;
                            case "background":
                                builder4.setBackground(Boolean.valueOf(jsonReader.nextBoolean()));
                                break;
                            case "execution":
                                CrashlyticsReport.Session.Event.Application.Execution.Builder builder5 = CrashlyticsReport.Session.Event.Application.Execution.builder();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            builder5.setAppExitInfo(c(jsonReader));
                                            break;
                                        case "threads":
                                            builder5.setThreads(d(jsonReader, new f()));
                                            break;
                                        case "signal":
                                            CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder6 = CrashlyticsReport.Session.Event.Application.Execution.Signal.builder();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        builder6.setAddress(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        builder6.setCode(jsonReader.nextString());
                                                        break;
                                                    case "name":
                                                        builder6.setName(jsonReader.nextString());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            builder5.setSignal(builder6.build());
                                            break;
                                        case "binaries":
                                            builder5.setBinaries(d(jsonReader, new d()));
                                            break;
                                        case "exception":
                                            builder5.setException(f(jsonReader));
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builder4.setExecution(builder5.build());
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                builder4.setInternalKeys(Collections.unmodifiableList(arrayList2));
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                builder4.setCustomAttributes(Collections.unmodifiableList(arrayList3));
                                break;
                            case "uiOrientation":
                                builder4.setUiOrientation(jsonReader.nextInt());
                                break;
                            case "currentProcessDetails":
                                builder4.setCurrentProcessDetails(g(jsonReader));
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builder.setApp(builder4.build());
                    break;
                case "log":
                    CrashlyticsReport.Session.Event.Log.Builder builder7 = CrashlyticsReport.Session.Event.Log.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            builder7.setContent(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builder.setLog(builder7.build());
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public static CrashlyticsReport.Session.Event.Application.Execution.Exception f(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    builder.setFrames(Collections.unmodifiableList(arrayList));
                    break;
                case "reason":
                    builder.setReason(jsonReader.nextString());
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "causedBy":
                    builder.setCausedBy(f(jsonReader));
                    break;
                case "overflowCount":
                    builder.setOverflowCount(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public static CrashlyticsReport.Session.Event.Application.ProcessDetails g(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    builder.setDefaultProcess(jsonReader.nextBoolean());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public static CrashlyticsReport h(@NonNull JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Builder builder = CrashlyticsReport.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    CrashlyticsReport.FilesPayload.Builder builder2 = CrashlyticsReport.FilesPayload.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            builder2.setFiles(d(jsonReader, new ai.a()));
                        } else if (strNextName2.equals("orgId")) {
                            builder2.setOrgId(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builder.setNdkPayload(builder2.build());
                    continue;
                    break;
                case "sdkVersion":
                    builder.setSdkVersion(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    builder.setAppExitInfo(c(jsonReader));
                    break;
                case "buildVersion":
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    builder.setGmpAppId(jsonReader.nextString());
                    break;
                case "installationUuid":
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    builder.setFirebaseInstallationId(jsonReader.nextString());
                    break;
                case "platform":
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                case "session":
                    CrashlyticsReport.Session.Builder builder3 = CrashlyticsReport.Session.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                builder3.setStartedAt(jsonReader.nextLong());
                                break;
                            case "appQualitySessionId":
                                builder3.setAppQualitySessionId(jsonReader.nextString());
                                break;
                            case "identifier":
                                builder3.setIdentifierFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                                break;
                            case "endedAt":
                                builder3.setEndedAt(Long.valueOf(jsonReader.nextLong()));
                                break;
                            case "device":
                                CrashlyticsReport.Session.Device.Builder builder4 = CrashlyticsReport.Session.Device.builder();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            builder4.setSimulator(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            builder4.setManufacturer(jsonReader.nextString());
                                            break;
                                        case "ram":
                                            builder4.setRam(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            builder4.setArch(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            builder4.setDiskSpace(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            builder4.setCores(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            builder4.setModel(jsonReader.nextString());
                                            break;
                                        case "state":
                                            builder4.setState(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            builder4.setModelClass(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builder3.setDevice(builder4.build());
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                builder3.setEvents(Collections.unmodifiableList(arrayList));
                                break;
                            case "os":
                                CrashlyticsReport.Session.OperatingSystem.Builder builder5 = CrashlyticsReport.Session.OperatingSystem.builder();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            builder5.setBuildVersion(jsonReader.nextString());
                                            break;
                                        case "jailbroken":
                                            builder5.setJailbroken(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            builder5.setVersion(jsonReader.nextString());
                                            break;
                                        case "platform":
                                            builder5.setPlatform(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builder3.setOs(builder5.build());
                                break;
                            case "app":
                                CrashlyticsReport.Session.Application.Builder builder6 = CrashlyticsReport.Session.Application.builder();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            builder6.setIdentifier(jsonReader.nextString());
                                            break;
                                        case "developmentPlatform":
                                            builder6.setDevelopmentPlatform(jsonReader.nextString());
                                            break;
                                        case "developmentPlatformVersion":
                                            builder6.setDevelopmentPlatformVersion(jsonReader.nextString());
                                            break;
                                        case "version":
                                            builder6.setVersion(jsonReader.nextString());
                                            break;
                                        case "installationUuid":
                                            builder6.setInstallationUuid(jsonReader.nextString());
                                            break;
                                        case "displayVersion":
                                            builder6.setDisplayVersion(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builder3.setApp(builder6.build());
                                break;
                            case "user":
                                CrashlyticsReport.Session.User.Builder builder7 = CrashlyticsReport.Session.User.builder();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        builder7.setIdentifier(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                builder3.setUser(builder7.build());
                                break;
                            case "generator":
                                builder3.setGenerator(jsonReader.nextString());
                                break;
                            case "crashed":
                                builder3.setCrashed(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                builder3.setGeneratorType(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builder.setSession(builder3.build());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public CrashlyticsReport.ApplicationExitInfo applicationExitInfoFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfoC = c(jsonReader);
                jsonReader.close();
                return applicationExitInfoC;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e5) {
            throw new IOException(e5);
        }
    }

    @NonNull
    public String applicationExitInfoToJson(@NonNull CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return f48234a.encode(applicationExitInfo);
    }

    @NonNull
    public CrashlyticsReport.Session.Event eventFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.Session.Event eventE = e(jsonReader);
                jsonReader.close();
                return eventE;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e5) {
            throw new IOException(e5);
        }
    }

    @NonNull
    public String eventToJson(@NonNull CrashlyticsReport.Session.Event event) {
        return f48234a.encode(event);
    }

    @NonNull
    public CrashlyticsReport reportFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportH = h(jsonReader);
                jsonReader.close();
                return crashlyticsReportH;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e5) {
            throw new IOException(e5);
        }
    }

    @NonNull
    public String reportToJson(@NonNull CrashlyticsReport crashlyticsReport) {
        return f48234a.encode(crashlyticsReport);
    }
}
