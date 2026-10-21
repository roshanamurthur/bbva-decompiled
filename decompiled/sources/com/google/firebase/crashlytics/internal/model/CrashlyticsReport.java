package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@AutoValue
@Encodable
public abstract class CrashlyticsReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f48012a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class ApplicationExitInfo {

        @AutoValue
        public static abstract class BuildIdMappingForArch {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract BuildIdMappingForArch build();

                @NonNull
                public abstract Builder setArch(@NonNull String str);

                @NonNull
                public abstract Builder setBuildId(@NonNull String str);

                @NonNull
                public abstract Builder setLibraryName(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new c.a();
            }

            @NonNull
            public abstract String getArch();

            @NonNull
            public abstract String getBuildId();

            @NonNull
            public abstract String getLibraryName();
        }

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract ApplicationExitInfo build();

            @NonNull
            public abstract Builder setBuildIdMappingForArch(@Nullable List<BuildIdMappingForArch> list);

            @NonNull
            public abstract Builder setImportance(@NonNull int i10);

            @NonNull
            public abstract Builder setPid(@NonNull int i10);

            @NonNull
            public abstract Builder setProcessName(@NonNull String str);

            @NonNull
            public abstract Builder setPss(@NonNull long j10);

            @NonNull
            public abstract Builder setReasonCode(@NonNull int i10);

            @NonNull
            public abstract Builder setRss(@NonNull long j10);

            @NonNull
            public abstract Builder setTimestamp(@NonNull long j10);

            @NonNull
            public abstract Builder setTraceFile(@Nullable String str);
        }

        @NonNull
        public static Builder builder() {
            return new b.a();
        }

        @Nullable
        public abstract List<BuildIdMappingForArch> getBuildIdMappingForArch();

        @NonNull
        public abstract int getImportance();

        @NonNull
        public abstract int getPid();

        @NonNull
        public abstract String getProcessName();

        @NonNull
        public abstract long getPss();

        @NonNull
        public abstract int getReasonCode();

        @NonNull
        public abstract long getRss();

        @NonNull
        public abstract long getTimestamp();

        @Nullable
        public abstract String getTraceFile();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract CrashlyticsReport build();

        @NonNull
        public abstract Builder setAppExitInfo(ApplicationExitInfo applicationExitInfo);

        @NonNull
        public abstract Builder setAppQualitySessionId(@Nullable String str);

        @NonNull
        public abstract Builder setBuildVersion(@NonNull String str);

        @NonNull
        public abstract Builder setDisplayVersion(@NonNull String str);

        @NonNull
        public abstract Builder setFirebaseInstallationId(@Nullable String str);

        @NonNull
        public abstract Builder setGmpAppId(@NonNull String str);

        @NonNull
        public abstract Builder setInstallationUuid(@NonNull String str);

        @NonNull
        public abstract Builder setNdkPayload(FilesPayload filesPayload);

        @NonNull
        public abstract Builder setPlatform(int i10);

        @NonNull
        public abstract Builder setSdkVersion(@NonNull String str);

        @NonNull
        public abstract Builder setSession(@NonNull Session session);
    }

    @AutoValue
    public static abstract class CustomAttribute {

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract CustomAttribute build();

            @NonNull
            public abstract Builder setKey(@NonNull String str);

            @NonNull
            public abstract Builder setValue(@NonNull String str);
        }

        @NonNull
        public static Builder builder() {
            return new d.a();
        }

        @NonNull
        public abstract String getKey();

        @NonNull
        public abstract String getValue();
    }

    @AutoValue
    public static abstract class FilesPayload {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract FilesPayload build();

            public abstract Builder setFiles(List<File> list);

            public abstract Builder setOrgId(String str);
        }

        @AutoValue
        public static abstract class File {

            @AutoValue.Builder
            public static abstract class Builder {
                public abstract File build();

                public abstract Builder setContents(byte[] bArr);

                public abstract Builder setFilename(String str);
            }

            @NonNull
            public static Builder builder() {
                return new f.a();
            }

            @NonNull
            public abstract byte[] getContents();

            @NonNull
            public abstract String getFilename();
        }

        @NonNull
        public static Builder builder() {
            return new e.a();
        }

        public abstract e.a a();

        @NonNull
        public abstract List<File> getFiles();

        @Nullable
        public abstract String getOrgId();
    }

    @AutoValue
    public static abstract class Session {

        @AutoValue
        public static abstract class Application {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Application build();

                @NonNull
                public abstract Builder setDevelopmentPlatform(@Nullable String str);

                @NonNull
                public abstract Builder setDevelopmentPlatformVersion(@Nullable String str);

                @NonNull
                public abstract Builder setDisplayVersion(@NonNull String str);

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);

                @NonNull
                public abstract Builder setInstallationUuid(@NonNull String str);

                @NonNull
                public abstract Builder setOrganization(@NonNull Organization organization);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @AutoValue
            public static abstract class Organization {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Organization build();

                    @NonNull
                    public abstract Builder setClsId(@NonNull String str);
                }

                @NonNull
                public static Builder builder() {
                    return new i.a();
                }

                @NonNull
                public abstract String getClsId();

                @NonNull
                public abstract Builder toBuilder();
            }

            @NonNull
            public static Builder builder() {
                return new h.a();
            }

            @Nullable
            public abstract String getDevelopmentPlatform();

            @Nullable
            public abstract String getDevelopmentPlatformVersion();

            @Nullable
            public abstract String getDisplayVersion();

            @NonNull
            public abstract String getIdentifier();

            @Nullable
            public abstract String getInstallationUuid();

            @Nullable
            public abstract Organization getOrganization();

            @NonNull
            public abstract String getVersion();

            @NonNull
            public abstract Builder toBuilder();
        }

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract Session build();

            @NonNull
            public abstract Builder setApp(@NonNull Application application);

            @NonNull
            public abstract Builder setAppQualitySessionId(@Nullable String str);

            @NonNull
            public abstract Builder setCrashed(boolean z10);

            @NonNull
            public abstract Builder setDevice(@NonNull Device device);

            @NonNull
            public abstract Builder setEndedAt(@NonNull Long l6);

            @NonNull
            public abstract Builder setEvents(@NonNull List<Event> list);

            @NonNull
            public abstract Builder setGenerator(@NonNull String str);

            @NonNull
            public abstract Builder setGeneratorType(int i10);

            @NonNull
            public abstract Builder setIdentifier(@NonNull String str);

            @NonNull
            public Builder setIdentifierFromUtf8Bytes(@NonNull byte[] bArr) {
                return setIdentifier(new String(bArr, CrashlyticsReport.f48012a));
            }

            @NonNull
            public abstract Builder setOs(@NonNull OperatingSystem operatingSystem);

            @NonNull
            public abstract Builder setStartedAt(long j10);

            @NonNull
            public abstract Builder setUser(@NonNull User user);
        }

        @AutoValue
        public static abstract class Device {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Device build();

                @NonNull
                public abstract Builder setArch(int i10);

                @NonNull
                public abstract Builder setCores(int i10);

                @NonNull
                public abstract Builder setDiskSpace(long j10);

                @NonNull
                public abstract Builder setManufacturer(@NonNull String str);

                @NonNull
                public abstract Builder setModel(@NonNull String str);

                @NonNull
                public abstract Builder setModelClass(@NonNull String str);

                @NonNull
                public abstract Builder setRam(long j10);

                @NonNull
                public abstract Builder setSimulator(boolean z10);

                @NonNull
                public abstract Builder setState(int i10);
            }

            @NonNull
            public static Builder builder() {
                return new j.a();
            }

            @NonNull
            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            @NonNull
            public abstract String getManufacturer();

            @NonNull
            public abstract String getModel();

            @NonNull
            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        @AutoValue
        public static abstract class Event {

            @AutoValue
            public static abstract class Application {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Application build();

                    @NonNull
                    public abstract Builder setAppProcessDetails(@Nullable List<ProcessDetails> list);

                    @NonNull
                    public abstract Builder setBackground(@Nullable Boolean bool);

                    @NonNull
                    public abstract Builder setCurrentProcessDetails(@Nullable ProcessDetails processDetails);

                    @NonNull
                    public abstract Builder setCustomAttributes(@NonNull List<CustomAttribute> list);

                    @NonNull
                    public abstract Builder setExecution(@NonNull Execution execution);

                    @NonNull
                    public abstract Builder setInternalKeys(@NonNull List<CustomAttribute> list);

                    @NonNull
                    public abstract Builder setUiOrientation(int i10);
                }

                @AutoValue
                public static abstract class Execution {

                    @AutoValue
                    public static abstract class BinaryImage {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract BinaryImage build();

                            @NonNull
                            public abstract Builder setBaseAddress(long j10);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);

                            @NonNull
                            public abstract Builder setSize(long j10);

                            @NonNull
                            public abstract Builder setUuid(@Nullable String str);

                            @NonNull
                            public Builder setUuidFromUtf8Bytes(@NonNull byte[] bArr) {
                                return setUuid(new String(bArr, CrashlyticsReport.f48012a));
                            }
                        }

                        @NonNull
                        public static Builder builder() {
                            return new n.a();
                        }

                        @NonNull
                        public abstract long getBaseAddress();

                        @NonNull
                        public abstract String getName();

                        public abstract long getSize();

                        @Nullable
                        @Encodable.Ignore
                        public abstract String getUuid();

                        @Nullable
                        @Encodable.Field(name = EventDataKeys.Audience.UUID)
                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(CrashlyticsReport.f48012a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    public static abstract class Builder {
                        @NonNull
                        public abstract Execution build();

                        @NonNull
                        public abstract Builder setAppExitInfo(@NonNull ApplicationExitInfo applicationExitInfo);

                        @NonNull
                        public abstract Builder setBinaries(@NonNull List<BinaryImage> list);

                        @NonNull
                        public abstract Builder setException(@NonNull Exception exception);

                        @NonNull
                        public abstract Builder setSignal(@NonNull Signal signal);

                        @NonNull
                        public abstract Builder setThreads(@NonNull List<Thread> list);
                    }

                    @AutoValue
                    public static abstract class Exception {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Exception build();

                            @NonNull
                            public abstract Builder setCausedBy(@NonNull Exception exception);

                            @NonNull
                            public abstract Builder setFrames(@NonNull List<Thread.Frame> list);

                            @NonNull
                            public abstract Builder setOverflowCount(int i10);

                            @NonNull
                            public abstract Builder setReason(@NonNull String str);

                            @NonNull
                            public abstract Builder setType(@NonNull String str);
                        }

                        @NonNull
                        public static Builder builder() {
                            return new o.a();
                        }

                        @Nullable
                        public abstract Exception getCausedBy();

                        @NonNull
                        public abstract List<Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        @Nullable
                        public abstract String getReason();

                        @NonNull
                        public abstract String getType();
                    }

                    @AutoValue
                    public static abstract class Signal {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Signal build();

                            @NonNull
                            public abstract Builder setAddress(long j10);

                            @NonNull
                            public abstract Builder setCode(@NonNull String str);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @NonNull
                        public static Builder builder() {
                            return new p.a();
                        }

                        @NonNull
                        public abstract long getAddress();

                        @NonNull
                        public abstract String getCode();

                        @NonNull
                        public abstract String getName();
                    }

                    @AutoValue
                    public static abstract class Thread {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Thread build();

                            @NonNull
                            public abstract Builder setFrames(@NonNull List<Frame> list);

                            @NonNull
                            public abstract Builder setImportance(int i10);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @AutoValue
                        public static abstract class Frame {

                            @AutoValue.Builder
                            public static abstract class Builder {
                                @NonNull
                                public abstract Frame build();

                                @NonNull
                                public abstract Builder setFile(@NonNull String str);

                                @NonNull
                                public abstract Builder setImportance(int i10);

                                @NonNull
                                public abstract Builder setOffset(long j10);

                                @NonNull
                                public abstract Builder setPc(long j10);

                                @NonNull
                                public abstract Builder setSymbol(@NonNull String str);
                            }

                            @NonNull
                            public static Builder builder() {
                                return new r.a();
                            }

                            @Nullable
                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            @NonNull
                            public abstract String getSymbol();
                        }

                        @NonNull
                        public static Builder builder() {
                            return new q.a();
                        }

                        @NonNull
                        public abstract List<Frame> getFrames();

                        public abstract int getImportance();

                        @NonNull
                        public abstract String getName();
                    }

                    @NonNull
                    public static Builder builder() {
                        return new m.a();
                    }

                    @Nullable
                    public abstract ApplicationExitInfo getAppExitInfo();

                    @NonNull
                    public abstract List<BinaryImage> getBinaries();

                    @Nullable
                    public abstract Exception getException();

                    @NonNull
                    public abstract Signal getSignal();

                    @Nullable
                    public abstract List<Thread> getThreads();
                }

                @AutoValue
                public static abstract class ProcessDetails {

                    @AutoValue.Builder
                    public static abstract class Builder {
                        @NonNull
                        public abstract ProcessDetails build();

                        @NonNull
                        public abstract Builder setDefaultProcess(boolean z10);

                        @NonNull
                        public abstract Builder setImportance(int i10);

                        @NonNull
                        public abstract Builder setPid(int i10);

                        @NonNull
                        public abstract Builder setProcessName(@NonNull String str);
                    }

                    @NonNull
                    public static Builder builder() {
                        return new s.a();
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    @NonNull
                    public abstract String getProcessName();

                    public abstract boolean isDefaultProcess();
                }

                @NonNull
                public static Builder builder() {
                    return new l.a();
                }

                @Nullable
                public abstract List<ProcessDetails> getAppProcessDetails();

                @Nullable
                public abstract Boolean getBackground();

                @Nullable
                public abstract ProcessDetails getCurrentProcessDetails();

                @Nullable
                public abstract List<CustomAttribute> getCustomAttributes();

                @NonNull
                public abstract Execution getExecution();

                @Nullable
                public abstract List<CustomAttribute> getInternalKeys();

                public abstract int getUiOrientation();

                @NonNull
                public abstract Builder toBuilder();
            }

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Event build();

                @NonNull
                public abstract Builder setApp(@NonNull Application application);

                @NonNull
                public abstract Builder setDevice(@NonNull Device device);

                @NonNull
                public abstract Builder setLog(@NonNull Log log);

                @Nullable
                public abstract Builder setRollouts(@NonNull RolloutsState rolloutsState);

                @NonNull
                public abstract Builder setTimestamp(long j10);

                @NonNull
                public abstract Builder setType(@NonNull String str);
            }

            @AutoValue
            public static abstract class Device {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Device build();

                    @NonNull
                    public abstract Builder setBatteryLevel(Double d2);

                    @NonNull
                    public abstract Builder setBatteryVelocity(int i10);

                    @NonNull
                    public abstract Builder setDiskUsed(long j10);

                    @NonNull
                    public abstract Builder setOrientation(int i10);

                    @NonNull
                    public abstract Builder setProximityOn(boolean z10);

                    @NonNull
                    public abstract Builder setRamUsed(long j10);
                }

                @NonNull
                public static Builder builder() {
                    return new t.a();
                }

                @Nullable
                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            @AutoValue
            public static abstract class Log {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Log build();

                    @NonNull
                    public abstract Builder setContent(@NonNull String str);
                }

                @NonNull
                public static Builder builder() {
                    return new u.a();
                }

                @NonNull
                public abstract String getContent();
            }

            @AutoValue
            public static abstract class RolloutAssignment {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract RolloutAssignment build();

                    @NonNull
                    public abstract Builder setParameterKey(@NonNull String str);

                    @NonNull
                    public abstract Builder setParameterValue(@NonNull String str);

                    @NonNull
                    public abstract Builder setRolloutVariant(@NonNull RolloutVariant rolloutVariant);

                    @NonNull
                    public abstract Builder setTemplateVersion(@NonNull long j10);
                }

                @AutoValue
                public static abstract class RolloutVariant {

                    @AutoValue.Builder
                    public static abstract class Builder {
                        @NonNull
                        public abstract RolloutVariant build();

                        @NonNull
                        public abstract Builder setRolloutId(@NonNull String str);

                        @NonNull
                        public abstract Builder setVariantId(@NonNull String str);
                    }

                    public static Builder builder() {
                        return new w.a();
                    }

                    @NonNull
                    public abstract String getRolloutId();

                    @NonNull
                    public abstract String getVariantId();
                }

                @NonNull
                public static Builder builder() {
                    return new v.a();
                }

                @NonNull
                public abstract String getParameterKey();

                @NonNull
                public abstract String getParameterValue();

                @NonNull
                public abstract RolloutVariant getRolloutVariant();

                @NonNull
                public abstract long getTemplateVersion();
            }

            @AutoValue
            public static abstract class RolloutsState {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract RolloutsState build();

                    @NonNull
                    public abstract Builder setRolloutAssignments(@Nullable List<RolloutAssignment> list);
                }

                @NonNull
                public static Builder builder() {
                    return new x.a();
                }

                @NonNull
                @Encodable.Field(name = "assignments")
                public abstract List<RolloutAssignment> getRolloutAssignments();
            }

            @NonNull
            public static Builder builder() {
                return new k.a();
            }

            @NonNull
            public abstract Application getApp();

            @NonNull
            public abstract Device getDevice();

            @Nullable
            public abstract Log getLog();

            @Nullable
            public abstract RolloutsState getRollouts();

            public abstract long getTimestamp();

            @NonNull
            public abstract String getType();

            @NonNull
            public abstract Builder toBuilder();
        }

        @AutoValue
        public static abstract class OperatingSystem {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract OperatingSystem build();

                @NonNull
                public abstract Builder setBuildVersion(@NonNull String str);

                @NonNull
                public abstract Builder setJailbroken(boolean z10);

                @NonNull
                public abstract Builder setPlatform(int i10);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new y.a();
            }

            @NonNull
            public abstract String getBuildVersion();

            public abstract int getPlatform();

            @NonNull
            public abstract String getVersion();

            public abstract boolean isJailbroken();
        }

        @AutoValue
        public static abstract class User {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract User build();

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new z.a();
            }

            @NonNull
            public abstract String getIdentifier();
        }

        @NonNull
        public static Builder builder() {
            g.a aVar = new g.a();
            aVar.f48109f = Boolean.FALSE;
            return aVar;
        }

        @NonNull
        public abstract Application getApp();

        @Nullable
        public abstract String getAppQualitySessionId();

        @Nullable
        public abstract Device getDevice();

        @Nullable
        public abstract Long getEndedAt();

        @Nullable
        public abstract List<Event> getEvents();

        @NonNull
        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @NonNull
        @Encodable.Ignore
        public abstract String getIdentifier();

        @NonNull
        @Encodable.Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(CrashlyticsReport.f48012a);
        }

        @Nullable
        public abstract OperatingSystem getOs();

        public abstract long getStartedAt();

        @Nullable
        public abstract User getUser();

        public abstract boolean isCrashed();

        @NonNull
        public abstract Builder toBuilder();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INCOMPLETE;
        public static final Type JAVA;
        public static final Type NATIVE;

        static {
            Type type = new Type("INCOMPLETE", 0);
            INCOMPLETE = type;
            Type type2 = new Type("JAVA", 1);
            JAVA = type2;
            Type type3 = new Type("NATIVE", 2);
            NATIVE = type3;
            $VALUES = new Type[]{type, type2, type3};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @NonNull
    public static Builder builder() {
        return new a.C0209a();
    }

    @Nullable
    public abstract ApplicationExitInfo getAppExitInfo();

    @Nullable
    public abstract String getAppQualitySessionId();

    @NonNull
    public abstract String getBuildVersion();

    @NonNull
    public abstract String getDisplayVersion();

    @Nullable
    public abstract String getFirebaseInstallationId();

    @NonNull
    public abstract String getGmpAppId();

    @NonNull
    public abstract String getInstallationUuid();

    @Nullable
    public abstract FilesPayload getNdkPayload();

    public abstract int getPlatform();

    @NonNull
    public abstract String getSdkVersion();

    @Nullable
    public abstract Session getSession();

    @Encodable.Ignore
    public Type getType() {
        if (getSession() != null) {
            return Type.JAVA;
        }
        return getNdkPayload() != null ? Type.NATIVE : Type.INCOMPLETE;
    }

    @NonNull
    public abstract Builder toBuilder();

    @NonNull
    public CrashlyticsReport withAppQualitySessionId(@Nullable String str) {
        Builder appQualitySessionId = toBuilder().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().toBuilder().setAppQualitySessionId(str).build());
        }
        return appQualitySessionId.build();
    }

    @NonNull
    public CrashlyticsReport withApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo == null ? this : toBuilder().setAppExitInfo(applicationExitInfo).build();
    }

    @NonNull
    public CrashlyticsReport withEvents(@NonNull List<Session.Event> list) {
        if (getSession() != null) {
            return toBuilder().setSession(getSession().toBuilder().setEvents(list).build()).build();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    public CrashlyticsReport withFirebaseInstallationId(@Nullable String str) {
        return toBuilder().setFirebaseInstallationId(str).build();
    }

    @NonNull
    public CrashlyticsReport withNdkPayload(@NonNull FilesPayload filesPayload) {
        return toBuilder().setSession(null).setNdkPayload(filesPayload).build();
    }

    @NonNull
    public CrashlyticsReport withOrganizationId(@NonNull String str) {
        Builder builder = toBuilder();
        FilesPayload ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            e.a aVarA = ndkPayload.a();
            aVarA.f48087b = str;
            builder.setNdkPayload(aVarA.build());
        }
        Session session = getSession();
        if (session != null) {
            Session.Application app = session.getApp();
            Session.Application.Organization organization = app.getOrganization();
            builder.setSession(session.toBuilder().setApp(app.toBuilder().setOrganization((organization != null ? organization.toBuilder() : Session.Application.Organization.builder()).setClsId(str).build()).build()).build());
        }
        return builder.build();
    }

    @NonNull
    public CrashlyticsReport withSessionEndFields(long j10, boolean z10, @Nullable String str) {
        Builder builder = toBuilder();
        if (getSession() != null) {
            Session.Builder builder2 = getSession().toBuilder();
            builder2.setEndedAt(Long.valueOf(j10));
            builder2.setCrashed(z10);
            if (str != null) {
                builder2.setUser(Session.User.builder().setIdentifier(str).build());
            }
            builder.setSession(builder2.build());
        }
        return builder.build();
    }
}
